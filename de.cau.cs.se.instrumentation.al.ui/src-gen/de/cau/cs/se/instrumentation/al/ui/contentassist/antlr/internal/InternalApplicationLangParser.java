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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_FLOAT", "RULE_INT", "RULE_COMMENT_ANNOTATION", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_NUMBER", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'name'", "'signature'", "'class'", "'return-type'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'before'", "'after'", "'package'", "'import'", "'use'", "'.'", "'aspect'", "'{'", "'}'", "'('", "')'", "','", "'['", "']'", "'#'", "'$'", "'**'", "'@'"
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
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__44=44;
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


    // $ANTLR start "entryRulePackage"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:117:1: entryRulePackage : rulePackage EOF ;
    public final void entryRulePackage() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:118:1: ( rulePackage EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:119:1: rulePackage EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:126:1: rulePackage : ( ( rule__Package__Group__0 ) ) ;
    public final void rulePackage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:130:2: ( ( ( rule__Package__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:131:1: ( ( rule__Package__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:131:1: ( ( rule__Package__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:132:1: ( rule__Package__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:133:1: ( rule__Package__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:133:2: rule__Package__Group__0
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


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:173:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:174:1: ( ruleQualifiedNameWithWildcard EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:175:1: ruleQualifiedNameWithWildcard EOF
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:182:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:186:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:188:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:189:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:189:2: rule__QualifiedNameWithWildcard__Group__0
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


    // $ANTLR start "entryRuleAspect"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:201:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:202:1: ( ruleAspect EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:203:1: ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_entryRuleAspect367);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAspect374); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:210:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:214:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:215:1: ( ( rule__Aspect__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:215:1: ( ( rule__Aspect__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:216:1: ( rule__Aspect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:217:1: ( rule__Aspect__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:217:2: rule__Aspect__Group__0
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0_in_ruleAspect400);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:229:1: entryRuleQuery : ruleQuery EOF ;
    public final void entryRuleQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:230:1: ( ruleQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:231:1: ruleQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryRule()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_entryRuleQuery427);
            ruleQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuery434); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:238:1: ruleQuery : ( ( rule__Query__Group__0 ) ) ;
    public final void ruleQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:242:2: ( ( ( rule__Query__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:243:1: ( ( rule__Query__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:243:1: ( ( rule__Query__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:244:1: ( rule__Query__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:245:1: ( rule__Query__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:245:2: rule__Query__Group__0
            {
            pushFollow(FOLLOW_rule__Query__Group__0_in_ruleQuery460);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:257:1: entryRuleParameterPattern : ruleParameterPattern EOF ;
    public final void entryRuleParameterPattern() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:258:1: ( ruleParameterPattern EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:259:1: ruleParameterPattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternRule()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern487);
            ruleParameterPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterPatternRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterPattern494); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:266:1: ruleParameterPattern : ( ( rule__ParameterPattern__Group__0 ) ) ;
    public final void ruleParameterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:270:2: ( ( ( rule__ParameterPattern__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:271:1: ( ( rule__ParameterPattern__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:271:1: ( ( rule__ParameterPattern__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:272:1: ( rule__ParameterPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:273:1: ( rule__ParameterPattern__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:273:2: rule__ParameterPattern__Group__0
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__0_in_ruleParameterPattern520);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:285:1: entryRuleLocationQuery : ruleLocationQuery EOF ;
    public final void entryRuleLocationQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:286:1: ( ruleLocationQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:287:1: ruleLocationQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryRule()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery547);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocationQuery554); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:294:1: ruleLocationQuery : ( ( rule__LocationQuery__Group__0 ) ) ;
    public final void ruleLocationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:298:2: ( ( ( rule__LocationQuery__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:299:1: ( ( rule__LocationQuery__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:299:1: ( ( rule__LocationQuery__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:300:1: ( rule__LocationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:301:1: ( rule__LocationQuery__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:301:2: rule__LocationQuery__Group__0
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__0_in_ruleLocationQuery580);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:313:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:314:1: ( ruleNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:315:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode607);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode614); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:322:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:326:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:327:1: ( ( rule__Node__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:327:1: ( ( rule__Node__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:328:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:329:1: ( rule__Node__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:329:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode640);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:341:1: entryRuleParamQuery : ruleParamQuery EOF ;
    public final void entryRuleParamQuery() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:342:1: ( ruleParamQuery EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:343:1: ruleParamQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryRule()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_entryRuleParamQuery667);
            ruleParamQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamQuery674); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:350:1: ruleParamQuery : ( ( rule__ParamQuery__Group__0 ) ) ;
    public final void ruleParamQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:354:2: ( ( ( rule__ParamQuery__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:355:1: ( ( rule__ParamQuery__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:355:1: ( ( rule__ParamQuery__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:356:1: ( rule__ParamQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:357:1: ( rule__ParamQuery__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:357:2: rule__ParamQuery__Group__0
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__0_in_ruleParamQuery700);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:369:1: entryRuleParamCompare : ruleParamCompare EOF ;
    public final void entryRuleParamCompare() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:370:1: ( ruleParamCompare EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:371:1: ruleParamCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareRule()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_entryRuleParamCompare727);
            ruleParamCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParamCompare734); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:378:1: ruleParamCompare : ( ( rule__ParamCompare__Group__0 ) ) ;
    public final void ruleParamCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:382:2: ( ( ( rule__ParamCompare__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:383:1: ( ( rule__ParamCompare__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:383:1: ( ( rule__ParamCompare__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:384:1: ( rule__ParamCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:385:1: ( rule__ParamCompare__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:385:2: rule__ParamCompare__Group__0
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__0_in_ruleParamCompare760);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:397:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:398:1: ( ruleValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:399:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue787);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue794); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:406:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:410:2: ( ( ( rule__Value__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:411:1: ( ( rule__Value__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:411:1: ( ( rule__Value__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:412:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:413:1: ( rule__Value__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:413:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_rule__Value__Alternatives_in_ruleValue820);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:425:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:426:1: ( ruleFloatValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:427:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_ruleFloatValue_in_entryRuleFloatValue847);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatValue854); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:434:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:438:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:439:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:439:1: ( ( rule__FloatValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:440:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:441:1: ( rule__FloatValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:441:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue880);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:453:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:454:1: ( ruleIntValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:455:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_ruleIntValue_in_entryRuleIntValue907);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntValue914); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:462:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:466:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:467:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:467:1: ( ( rule__IntValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:468:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:469:1: ( rule__IntValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:469:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue940);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:481:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:482:1: ( ruleStringValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:483:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue967);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue974); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:490:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:494:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:495:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:495:1: ( ( rule__StringValue__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:496:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:497:1: ( rule__StringValue__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:497:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1000);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:509:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:510:1: ( ruleReferenceValue EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:511:1: ruleReferenceValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueRule()); 
            }
            pushFollow(FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue1027);
            ruleReferenceValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReferenceValue1034); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:518:1: ruleReferenceValue : ( ( rule__ReferenceValue__Group__0 ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:522:2: ( ( ( rule__ReferenceValue__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:523:1: ( ( rule__ReferenceValue__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:523:1: ( ( rule__ReferenceValue__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:524:1: ( rule__ReferenceValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:525:1: ( rule__ReferenceValue__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:525:2: rule__ReferenceValue__Group__0
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__0_in_ruleReferenceValue1060);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:537:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:538:1: ( ruleParameter EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:539:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter1087);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter1094); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:546:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:550:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:551:1: ( ( rule__Parameter__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:551:1: ( ( rule__Parameter__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:552:1: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:553:1: ( rule__Parameter__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:553:2: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_rule__Parameter__Alternatives_in_ruleParameter1120);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:565:1: entryRuleRuntimeProperty : ruleRuntimeProperty EOF ;
    public final void entryRuleRuntimeProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:566:1: ( ruleRuntimeProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:567:1: ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty1147);
            ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRuntimeProperty1154); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:574:1: ruleRuntimeProperty : ( ( rule__RuntimeProperty__Group__0 ) ) ;
    public final void ruleRuntimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:578:2: ( ( ( rule__RuntimeProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:579:1: ( ( rule__RuntimeProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:579:1: ( ( rule__RuntimeProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:580:1: ( rule__RuntimeProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:581:1: ( rule__RuntimeProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:581:2: rule__RuntimeProperty__Group__0
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0_in_ruleRuntimeProperty1180);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:593:1: entryRuleReflectionProperty : ruleReflectionProperty EOF ;
    public final void entryRuleReflectionProperty() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:594:1: ( ruleReflectionProperty EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:595:1: ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty1207);
            ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleReflectionProperty1214); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:602:1: ruleReflectionProperty : ( ( rule__ReflectionProperty__Group__0 ) ) ;
    public final void ruleReflectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:606:2: ( ( ( rule__ReflectionProperty__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:607:1: ( ( rule__ReflectionProperty__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:607:1: ( ( rule__ReflectionProperty__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:608:1: ( rule__ReflectionProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:609:1: ( rule__ReflectionProperty__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:609:2: rule__ReflectionProperty__Group__0
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0_in_ruleReflectionProperty1240);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:621:1: entryRuleContainerNode : ruleContainerNode EOF ;
    public final void entryRuleContainerNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:622:1: ( ruleContainerNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:623:1: ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_ruleContainerNode_in_entryRuleContainerNode1267);
            ruleContainerNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainerNode1274); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:630:1: ruleContainerNode : ( ( rule__ContainerNode__ContainerAssignment ) ) ;
    public final void ruleContainerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:634:2: ( ( ( rule__ContainerNode__ContainerAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:635:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:635:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:636:1: ( rule__ContainerNode__ContainerAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:637:1: ( rule__ContainerNode__ContainerAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:637:2: rule__ContainerNode__ContainerAssignment
            {
            pushFollow(FOLLOW_rule__ContainerNode__ContainerAssignment_in_ruleContainerNode1300);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:649:1: entryRuleWildcardNode : ruleWildcardNode EOF ;
    public final void entryRuleWildcardNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:650:1: ( ruleWildcardNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:651:1: ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode1327);
            ruleWildcardNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWildcardNode1334); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:658:1: ruleWildcardNode : ( ( rule__WildcardNode__Group__0 ) ) ;
    public final void ruleWildcardNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:662:2: ( ( ( rule__WildcardNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:663:1: ( ( rule__WildcardNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:663:1: ( ( rule__WildcardNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:664:1: ( rule__WildcardNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:665:1: ( rule__WildcardNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:665:2: rule__WildcardNode__Group__0
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0_in_ruleWildcardNode1360);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:677:1: entryRuleSubPathNode : ruleSubPathNode EOF ;
    public final void entryRuleSubPathNode() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:678:1: ( ruleSubPathNode EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:679:1: ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode1387);
            ruleSubPathNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathNodeRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubPathNode1394); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:686:1: ruleSubPathNode : ( ( rule__SubPathNode__Group__0 ) ) ;
    public final void ruleSubPathNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:690:2: ( ( ( rule__SubPathNode__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:691:1: ( ( rule__SubPathNode__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:691:1: ( ( rule__SubPathNode__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:692:1: ( rule__SubPathNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:693:1: ( rule__SubPathNode__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:693:2: rule__SubPathNode__Group__0
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0_in_ruleSubPathNode1420);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:705:1: entryRuleCollector : ruleCollector EOF ;
    public final void entryRuleCollector() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:706:1: ( ruleCollector EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:707:1: ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_entryRuleCollector1447);
            ruleCollector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollector1454); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:714:1: ruleCollector : ( ( rule__Collector__Group__0 ) ) ;
    public final void ruleCollector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:718:2: ( ( ( rule__Collector__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:719:1: ( ( rule__Collector__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:719:1: ( ( rule__Collector__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:720:1: ( rule__Collector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:721:1: ( rule__Collector__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:721:2: rule__Collector__Group__0
            {
            pushFollow(FOLLOW_rule__Collector__Group__0_in_ruleCollector1480);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:733:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:734:1: ( ruleAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:735:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation1507);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation1514); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:742:1: ruleAnnotation : ( ( rule__Annotation__Alternatives ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:746:2: ( ( ( rule__Annotation__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:747:1: ( ( rule__Annotation__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:747:1: ( ( rule__Annotation__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:748:1: ( rule__Annotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:749:1: ( rule__Annotation__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:749:2: rule__Annotation__Alternatives
            {
            pushFollow(FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1540);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:763:1: entryRuleCommentAnnotation : ruleCommentAnnotation EOF ;
    public final void entryRuleCommentAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:764:1: ( ruleCommentAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:765:1: ruleCommentAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1569);
            ruleCommentAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCommentAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommentAnnotation1576); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:772:1: ruleCommentAnnotation : ( ( rule__CommentAnnotation__ValueAssignment ) ) ;
    public final void ruleCommentAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:776:2: ( ( ( rule__CommentAnnotation__ValueAssignment ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:777:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:777:1: ( ( rule__CommentAnnotation__ValueAssignment ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:778:1: ( rule__CommentAnnotation__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueAssignment()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:779:1: ( rule__CommentAnnotation__ValueAssignment )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:779:2: rule__CommentAnnotation__ValueAssignment
            {
            pushFollow(FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1602);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:791:1: entryRuleTagAnnotation : ruleTagAnnotation EOF ;
    public final void entryRuleTagAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:792:1: ( ruleTagAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:793:1: ruleTagAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1629);
            ruleTagAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTagAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTagAnnotation1636); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:800:1: ruleTagAnnotation : ( ( rule__TagAnnotation__Group__0 ) ) ;
    public final void ruleTagAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:804:2: ( ( ( rule__TagAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:805:1: ( ( rule__TagAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:805:1: ( ( rule__TagAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:806:1: ( rule__TagAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:807:1: ( rule__TagAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:807:2: rule__TagAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1662);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:819:1: entryRuleKeyStringValueAnnotation : ruleKeyStringValueAnnotation EOF ;
    public final void entryRuleKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:820:1: ( ruleKeyStringValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:821:1: ruleKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1689);
            ruleKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1696); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:828:1: ruleKeyStringValueAnnotation : ( ( rule__KeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:832:2: ( ( ( rule__KeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:833:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:833:1: ( ( rule__KeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:834:1: ( rule__KeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:835:1: ( rule__KeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:835:2: rule__KeyStringValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1722);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:847:1: entryRuleTypedKeyStringValueAnnotation : ruleTypedKeyStringValueAnnotation EOF ;
    public final void entryRuleTypedKeyStringValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:848:1: ( ruleTypedKeyStringValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:849:1: ruleTypedKeyStringValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1749);
            ruleTypedKeyStringValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypedKeyStringValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1756); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:856:1: ruleTypedKeyStringValueAnnotation : ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) ;
    public final void ruleTypedKeyStringValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:860:2: ( ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:861:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:861:1: ( ( rule__TypedKeyStringValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:862:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:863:1: ( rule__TypedKeyStringValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:863:2: rule__TypedKeyStringValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1782);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:875:1: entryRuleKeyBooleanValueAnnotation : ruleKeyBooleanValueAnnotation EOF ;
    public final void entryRuleKeyBooleanValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:876:1: ( ruleKeyBooleanValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:877:1: ruleKeyBooleanValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1809);
            ruleKeyBooleanValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyBooleanValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1816); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:884:1: ruleKeyBooleanValueAnnotation : ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyBooleanValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:888:2: ( ( ( rule__KeyBooleanValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:889:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:889:1: ( ( rule__KeyBooleanValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:890:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:891:1: ( rule__KeyBooleanValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:891:2: rule__KeyBooleanValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation1842);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:903:1: entryRuleKeyIntValueAnnotation : ruleKeyIntValueAnnotation EOF ;
    public final void entryRuleKeyIntValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:904:1: ( ruleKeyIntValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:905:1: ruleKeyIntValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1869);
            ruleKeyIntValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyIntValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1876); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:912:1: ruleKeyIntValueAnnotation : ( ( rule__KeyIntValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyIntValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:916:2: ( ( ( rule__KeyIntValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:917:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:917:1: ( ( rule__KeyIntValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:918:1: ( rule__KeyIntValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:919:1: ( rule__KeyIntValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:919:2: rule__KeyIntValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation1902);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:931:1: entryRuleKeyFloatValueAnnotation : ruleKeyFloatValueAnnotation EOF ;
    public final void entryRuleKeyFloatValueAnnotation() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:932:1: ( ruleKeyFloatValueAnnotation EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:933:1: ruleKeyFloatValueAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1929);
            ruleKeyFloatValueAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getKeyFloatValueAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1936); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:940:1: ruleKeyFloatValueAnnotation : ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) ;
    public final void ruleKeyFloatValueAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:944:2: ( ( ( rule__KeyFloatValueAnnotation__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:945:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:945:1: ( ( rule__KeyFloatValueAnnotation__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:946:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:947:1: ( rule__KeyFloatValueAnnotation__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:947:2: rule__KeyFloatValueAnnotation__Group__0
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation1962);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:961:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:962:1: ( ruleEString EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:963:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_ruleEString_in_entryRuleEString1991);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEString1998); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:970:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:974:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:975:1: ( ( rule__EString__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:975:1: ( ( rule__EString__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:976:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:977:1: ( rule__EString__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:977:2: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_rule__EString__Alternatives_in_ruleEString2024);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:989:1: entryRuleExtendedID : ruleExtendedID EOF ;
    public final void entryRuleExtendedID() throws RecognitionException {
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:990:1: ( ruleExtendedID EOF )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:991:1: ruleExtendedID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDRule()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_entryRuleExtendedID2051);
            ruleExtendedID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExtendedIDRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtendedID2058); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:998:1: ruleExtendedID : ( ( rule__ExtendedID__Group__0 ) ) ;
    public final void ruleExtendedID() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1002:2: ( ( ( rule__ExtendedID__Group__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1003:1: ( ( rule__ExtendedID__Group__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1003:1: ( ( rule__ExtendedID__Group__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1004:1: ( rule__ExtendedID__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1005:1: ( rule__ExtendedID__Group__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1005:2: rule__ExtendedID__Group__0
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2084);
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


    // $ANTLR start "ruleReflectionFunction"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1018:1: ruleReflectionFunction : ( ( rule__ReflectionFunction__Alternatives ) ) ;
    public final void ruleReflectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1022:1: ( ( ( rule__ReflectionFunction__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1023:1: ( ( rule__ReflectionFunction__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1023:1: ( ( rule__ReflectionFunction__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1024:1: ( rule__ReflectionFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1025:1: ( rule__ReflectionFunction__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1025:2: rule__ReflectionFunction__Alternatives
            {
            pushFollow(FOLLOW_rule__ReflectionFunction__Alternatives_in_ruleReflectionFunction2121);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1037:1: ruleOperator : ( ( rule__Operator__Alternatives ) ) ;
    public final void ruleOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1041:1: ( ( ( rule__Operator__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1042:1: ( ( rule__Operator__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1042:1: ( ( rule__Operator__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1043:1: ( rule__Operator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperatorAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1044:1: ( rule__Operator__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1044:2: rule__Operator__Alternatives
            {
            pushFollow(FOLLOW_rule__Operator__Alternatives_in_ruleOperator2157);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1056:1: ruleInsertionPoint : ( ( rule__InsertionPoint__Alternatives ) ) ;
    public final void ruleInsertionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1060:1: ( ( ( rule__InsertionPoint__Alternatives ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1061:1: ( ( rule__InsertionPoint__Alternatives ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1061:1: ( ( rule__InsertionPoint__Alternatives ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1062:1: ( rule__InsertionPoint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1063:1: ( rule__InsertionPoint__Alternatives )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1063:2: rule__InsertionPoint__Alternatives
            {
            pushFollow(FOLLOW_rule__InsertionPoint__Alternatives_in_ruleInsertionPoint2193);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1074:1: rule__Query__Alternatives_1_0 : ( ( ( rule__Query__ModifierAssignment_1_0_0 ) ) | ( '*' ) );
    public final void rule__Query__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1078:1: ( ( ( rule__Query__ModifierAssignment_1_0_0 ) ) | ( '*' ) )
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1079:1: ( ( rule__Query__ModifierAssignment_1_0_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1079:1: ( ( rule__Query__ModifierAssignment_1_0_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1080:1: ( rule__Query__ModifierAssignment_1_0_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getModifierAssignment_1_0_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1081:1: ( rule__Query__ModifierAssignment_1_0_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1081:2: rule__Query__ModifierAssignment_1_0_0
                    {
                    pushFollow(FOLLOW_rule__Query__ModifierAssignment_1_0_0_in_rule__Query__Alternatives_1_02228);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1085:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1085:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1086:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAsteriskKeyword_1_0_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Query__Alternatives_1_02247); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1098:1: rule__Query__Alternatives_1_1 : ( ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) ) | ( '*' ) );
    public final void rule__Query__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1102:1: ( ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) ) | ( '*' ) )
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1103:1: ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1103:1: ( ( rule__Query__ReturnTypeAssignment_1_1_0 ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1104:1: ( rule__Query__ReturnTypeAssignment_1_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getReturnTypeAssignment_1_1_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1105:1: ( rule__Query__ReturnTypeAssignment_1_1_0 )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1105:2: rule__Query__ReturnTypeAssignment_1_1_0
                    {
                    pushFollow(FOLLOW_rule__Query__ReturnTypeAssignment_1_1_0_in_rule__Query__Alternatives_1_12281);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1109:6: ( '*' )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1109:6: ( '*' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1110:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryAccess().getAsteriskKeyword_1_1_1()); 
                    }
                    match(input,15,FOLLOW_15_in_rule__Query__Alternatives_1_12300); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1122:1: rule__Node__Alternatives_0 : ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleContainerNode ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1126:1: ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleContainerNode ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt3=1;
                }
                break;
            case 15:
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1127:1: ( ruleSubPathNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1127:1: ( ruleSubPathNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1128:1: ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSubPathNode_in_rule__Node__Alternatives_02334);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1133:6: ( ruleWildcardNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1133:6: ( ruleWildcardNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1134:1: ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleWildcardNode_in_rule__Node__Alternatives_02351);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1139:6: ( ruleContainerNode )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1139:6: ( ruleContainerNode )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1140:1: ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_ruleContainerNode_in_rule__Node__Alternatives_02368);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1150:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1154:1: ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_INT:
                {
                alt4=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
            case 15:
            case 43:
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1155:1: ( ruleStringValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1155:1: ( ruleStringValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1156:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__Value__Alternatives2400);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1161:6: ( ruleIntValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1161:6: ( ruleIntValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1162:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleIntValue_in_rule__Value__Alternatives2417);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1167:6: ( ruleFloatValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1167:6: ( ruleFloatValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1168:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleFloatValue_in_rule__Value__Alternatives2434);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1173:6: ( ruleReferenceValue )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1173:6: ( ruleReferenceValue )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1174:1: ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleReferenceValue_in_rule__Value__Alternatives2451);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1184:1: rule__Parameter__Alternatives : ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1188:1: ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==41) ) {
                alt5=1;
            }
            else if ( (LA5_0==42) ) {
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1189:1: ( ruleRuntimeProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1189:1: ( ruleRuntimeProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1190:1: ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleRuntimeProperty_in_rule__Parameter__Alternatives2483);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1195:6: ( ruleReflectionProperty )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1195:6: ( ruleReflectionProperty )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1196:1: ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReflectionProperty_in_rule__Parameter__Alternatives2500);
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


    // $ANTLR start "rule__Annotation__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1206:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );
    public final void rule__Annotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1210:1: ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) )
            int alt6=7;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1211:1: ( ruleCommentAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1211:1: ( ruleCommentAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1212:1: ruleCommentAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getCommentAnnotationParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives2532);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1217:6: ( ruleTagAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1217:6: ( ruleTagAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1218:1: ruleTagAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTagAnnotationParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives2549);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1223:6: ( ruleKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1223:6: ( ruleKeyStringValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1224:1: ruleKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyStringValueAnnotationParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives2566);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1229:6: ( ruleTypedKeyStringValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1229:6: ( ruleTypedKeyStringValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1230:1: ruleTypedKeyStringValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getTypedKeyStringValueAnnotationParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives2583);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1235:6: ( ruleKeyBooleanValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1235:6: ( ruleKeyBooleanValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1236:1: ruleKeyBooleanValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyBooleanValueAnnotationParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives2600);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1241:6: ( ruleKeyIntValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1241:6: ( ruleKeyIntValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1242:1: ruleKeyIntValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyIntValueAnnotationParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives2617);
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1247:6: ( ruleKeyFloatValueAnnotation )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1247:6: ( ruleKeyFloatValueAnnotation )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1248:1: ruleKeyFloatValueAnnotation
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAnnotationAccess().getKeyFloatValueAnnotationParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives2634);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1259:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1263:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1264:1: ( RULE_STRING )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1264:1: ( RULE_STRING )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1265:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__EString__Alternatives2667); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1270:6: ( RULE_ID )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1270:6: ( RULE_ID )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1271:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__EString__Alternatives2684); if (state.failed) return ;
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


    // $ANTLR start "rule__ReflectionFunction__Alternatives"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1281:1: rule__ReflectionFunction__Alternatives : ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'class' ) ) | ( ( 'return-type' ) ) );
    public final void rule__ReflectionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1285:1: ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'class' ) ) | ( ( 'return-type' ) ) )
            int alt8=4;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1286:1: ( ( 'name' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1286:1: ( ( 'name' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1287:1: ( 'name' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1288:1: ( 'name' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1288:3: 'name'
                    {
                    match(input,16,FOLLOW_16_in_rule__ReflectionFunction__Alternatives2717); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1293:6: ( ( 'signature' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1293:6: ( ( 'signature' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1294:1: ( 'signature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1295:1: ( 'signature' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1295:3: 'signature'
                    {
                    match(input,17,FOLLOW_17_in_rule__ReflectionFunction__Alternatives2738); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1300:6: ( ( 'class' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1300:6: ( ( 'class' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1301:1: ( 'class' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1302:1: ( 'class' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1302:3: 'class'
                    {
                    match(input,18,FOLLOW_18_in_rule__ReflectionFunction__Alternatives2759); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1307:6: ( ( 'return-type' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1307:6: ( ( 'return-type' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1308:1: ( 'return-type' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1309:1: ( 'return-type' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1309:3: 'return-type'
                    {
                    match(input,19,FOLLOW_19_in_rule__ReflectionFunction__Alternatives2780); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1319:1: rule__Operator__Alternatives : ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__Operator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1323:1: ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            case 25:
                {
                alt9=6;
                }
                break;
            case 26:
                {
                alt9=7;
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
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1324:1: ( ( '=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1324:1: ( ( '=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1325:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1326:1: ( '=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1326:3: '='
                    {
                    match(input,20,FOLLOW_20_in_rule__Operator__Alternatives2816); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1331:6: ( ( '~' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1331:6: ( ( '~' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1332:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1333:1: ( '~' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1333:3: '~'
                    {
                    match(input,21,FOLLOW_21_in_rule__Operator__Alternatives2837); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1338:6: ( ( '!=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1338:6: ( ( '!=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1339:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1340:1: ( '!=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1340:3: '!='
                    {
                    match(input,22,FOLLOW_22_in_rule__Operator__Alternatives2858); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1345:6: ( ( '>' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1345:6: ( ( '>' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1346:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1347:1: ( '>' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1347:3: '>'
                    {
                    match(input,23,FOLLOW_23_in_rule__Operator__Alternatives2879); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1352:6: ( ( '<' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1352:6: ( ( '<' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1353:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1354:1: ( '<' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1354:3: '<'
                    {
                    match(input,24,FOLLOW_24_in_rule__Operator__Alternatives2900); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1359:6: ( ( '>=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1359:6: ( ( '>=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1360:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1361:1: ( '>=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1361:3: '>='
                    {
                    match(input,25,FOLLOW_25_in_rule__Operator__Alternatives2921); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1366:6: ( ( '<=' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1366:6: ( ( '<=' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1367:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1368:1: ( '<=' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1368:3: '<='
                    {
                    match(input,26,FOLLOW_26_in_rule__Operator__Alternatives2942); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1378:1: rule__InsertionPoint__Alternatives : ( ( ( 'before' ) ) | ( ( 'after' ) ) );
    public final void rule__InsertionPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1382:1: ( ( ( 'before' ) ) | ( ( 'after' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1383:1: ( ( 'before' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1383:1: ( ( 'before' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1384:1: ( 'before' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1385:1: ( 'before' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1385:3: 'before'
                    {
                    match(input,27,FOLLOW_27_in_rule__InsertionPoint__Alternatives2978); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1390:6: ( ( 'after' ) )
                    {
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1390:6: ( ( 'after' ) )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1391:1: ( 'after' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1392:1: ( 'after' )
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1392:3: 'after'
                    {
                    match(input,28,FOLLOW_28_in_rule__InsertionPoint__Alternatives2999); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1404:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1408:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1409:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03032);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03035);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1416:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1420:1: ( ( 'package' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1421:1: ( 'package' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1421:1: ( 'package' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1422:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,29,FOLLOW_29_in_rule__Model__Group__0__Impl3063); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1435:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1439:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1440:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13094);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13097);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1447:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1451:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1452:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1452:1: ( ( rule__Model__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1453:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1454:1: ( rule__Model__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1454:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl3124);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1464:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1468:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1469:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23154);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23157);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1476:1: rule__Model__Group__2__Impl : ( ( rule__Model__PackagesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1480:1: ( ( ( rule__Model__PackagesAssignment_2 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1481:1: ( ( rule__Model__PackagesAssignment_2 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1481:1: ( ( rule__Model__PackagesAssignment_2 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1482:1: ( rule__Model__PackagesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1483:1: ( rule__Model__PackagesAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==31) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1483:2: rule__Model__PackagesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl3184);
            	    rule__Model__PackagesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1493:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1497:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1498:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33215);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33218);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1505:1: rule__Model__Group__3__Impl : ( ( rule__Model__ImportsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1509:1: ( ( ( rule__Model__ImportsAssignment_3 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1510:1: ( ( rule__Model__ImportsAssignment_3 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1510:1: ( ( rule__Model__ImportsAssignment_3 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1511:1: ( rule__Model__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1512:1: ( rule__Model__ImportsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1512:2: rule__Model__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl3245);
            	    rule__Model__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1522:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1526:1: ( rule__Model__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1527:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43276);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1533:1: rule__Model__Group__4__Impl : ( ( rule__Model__AspectsAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1537:1: ( ( ( rule__Model__AspectsAssignment_4 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1538:1: ( ( rule__Model__AspectsAssignment_4 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1538:1: ( ( rule__Model__AspectsAssignment_4 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1539:1: ( rule__Model__AspectsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1540:1: ( rule__Model__AspectsAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_COMMENT_ANNOTATION||LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1540:2: rule__Model__AspectsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Model__AspectsAssignment_4_in_rule__Model__Group__4__Impl3303);
            	    rule__Model__AspectsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "rule__Import__Group__0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1560:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1564:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1565:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03344);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03347);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1572:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1576:1: ( ( 'import' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1577:1: ( 'import' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1577:1: ( 'import' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1578:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,30,FOLLOW_30_in_rule__Import__Group__0__Impl3375); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1591:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1595:1: ( rule__Import__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1596:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13406);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1602:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1606:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1607:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1607:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1608:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1609:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1609:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3433);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1623:1: rule__Package__Group__0 : rule__Package__Group__0__Impl rule__Package__Group__1 ;
    public final void rule__Package__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1627:1: ( rule__Package__Group__0__Impl rule__Package__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1628:2: rule__Package__Group__0__Impl rule__Package__Group__1
            {
            pushFollow(FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__03467);
            rule__Package__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__1_in_rule__Package__Group__03470);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1635:1: rule__Package__Group__0__Impl : ( 'use' ) ;
    public final void rule__Package__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1639:1: ( ( 'use' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1640:1: ( 'use' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1640:1: ( 'use' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1641:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getUseKeyword_0()); 
            }
            match(input,31,FOLLOW_31_in_rule__Package__Group__0__Impl3498); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1654:1: rule__Package__Group__1 : rule__Package__Group__1__Impl rule__Package__Group__2 ;
    public final void rule__Package__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1658:1: ( rule__Package__Group__1__Impl rule__Package__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1659:2: rule__Package__Group__1__Impl rule__Package__Group__2
            {
            pushFollow(FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__13529);
            rule__Package__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Package__Group__2_in_rule__Package__Group__13532);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1666:1: rule__Package__Group__1__Impl : ( ( rule__Package__NameAssignment_1 ) ) ;
    public final void rule__Package__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1670:1: ( ( ( rule__Package__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1671:1: ( ( rule__Package__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1671:1: ( ( rule__Package__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1672:1: ( rule__Package__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1673:1: ( rule__Package__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1673:2: rule__Package__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl3559);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1683:1: rule__Package__Group__2 : rule__Package__Group__2__Impl ;
    public final void rule__Package__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1687:1: ( rule__Package__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1688:2: rule__Package__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__23589);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1694:1: rule__Package__Group__2__Impl : ( ( rule__Package__PackageAssignment_2 ) ) ;
    public final void rule__Package__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1698:1: ( ( ( rule__Package__PackageAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1699:1: ( ( rule__Package__PackageAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1699:1: ( ( rule__Package__PackageAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1700:1: ( rule__Package__PackageAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1701:1: ( rule__Package__PackageAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1701:2: rule__Package__PackageAssignment_2
            {
            pushFollow(FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl3616);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1717:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1721:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1722:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03652);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03655);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1729:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1733:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1734:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1734:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1735:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3682); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1746:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1750:1: ( rule__QualifiedName__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1751:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13711);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1757:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1761:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1762:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1762:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1763:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1764:1: ( rule__QualifiedName__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    int LA14_2 = input.LA(2);

                    if ( (LA14_2==RULE_ID) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1764:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3738);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1778:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1782:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1783:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03773);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03776);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1790:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1794:1: ( ( ( '.' ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1795:1: ( ( '.' ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1795:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1796:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1797:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1798:2: '.'
            {
            match(input,32,FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl3805); if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1809:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1813:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1814:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13837);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1820:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1824:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1825:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1825:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1826:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3864); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1841:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1845:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1846:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03897);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03900);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1853:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1857:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1858:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1858:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1859:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl3927);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1870:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1874:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1875:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13956);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1881:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1885:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1886:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1886:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1887:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1888:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1888:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl3983);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1902:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1906:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1907:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__04018);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__04021);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1914:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1918:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1919:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1919:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1920:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl4049); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1933:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1937:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1938:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__14080);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1944:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1948:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1949:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1949:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1950:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl4108); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1967:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1971:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1972:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__04143);
            rule__Aspect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__04146);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1979:1: rule__Aspect__Group__0__Impl : ( ( rule__Aspect__AnnotationAssignment_0 ) ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1983:1: ( ( ( rule__Aspect__AnnotationAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1984:1: ( ( rule__Aspect__AnnotationAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1984:1: ( ( rule__Aspect__AnnotationAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1985:1: ( rule__Aspect__AnnotationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAnnotationAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1986:1: ( rule__Aspect__AnnotationAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1986:2: rule__Aspect__AnnotationAssignment_0
            {
            pushFollow(FOLLOW_rule__Aspect__AnnotationAssignment_0_in_rule__Aspect__Group__0__Impl4173);
            rule__Aspect__AnnotationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:1996:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2000:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2001:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__14203);
            rule__Aspect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__14206);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2008:1: rule__Aspect__Group__1__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2012:1: ( ( 'aspect' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2013:1: ( 'aspect' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2013:1: ( 'aspect' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2014:1: 'aspect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAspectKeyword_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__Aspect__Group__1__Impl4234); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2027:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2031:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2032:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__24265);
            rule__Aspect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__24268);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2039:1: rule__Aspect__Group__2__Impl : ( ( rule__Aspect__QueryAssignment_2 ) ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2043:1: ( ( ( rule__Aspect__QueryAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2044:1: ( ( rule__Aspect__QueryAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2044:1: ( ( rule__Aspect__QueryAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2045:1: ( rule__Aspect__QueryAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2046:1: ( rule__Aspect__QueryAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2046:2: rule__Aspect__QueryAssignment_2
            {
            pushFollow(FOLLOW_rule__Aspect__QueryAssignment_2_in_rule__Aspect__Group__2__Impl4295);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2056:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2060:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2061:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__34325);
            rule__Aspect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__34328);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2068:1: rule__Aspect__Group__3__Impl : ( '{' ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2072:1: ( ( '{' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2073:1: ( '{' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2073:1: ( '{' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2074:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,34,FOLLOW_34_in_rule__Aspect__Group__3__Impl4356); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2087:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl rule__Aspect__Group__5 ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2091:1: ( rule__Aspect__Group__4__Impl rule__Aspect__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2092:2: rule__Aspect__Group__4__Impl rule__Aspect__Group__5
            {
            pushFollow(FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__44387);
            rule__Aspect__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Aspect__Group__5_in_rule__Aspect__Group__44390);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2099:1: rule__Aspect__Group__4__Impl : ( ( rule__Aspect__CollectorsAssignment_4 ) ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2103:1: ( ( ( rule__Aspect__CollectorsAssignment_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2104:1: ( ( rule__Aspect__CollectorsAssignment_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2104:1: ( ( rule__Aspect__CollectorsAssignment_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2105:1: ( rule__Aspect__CollectorsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsAssignment_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2106:1: ( rule__Aspect__CollectorsAssignment_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2106:2: rule__Aspect__CollectorsAssignment_4
            {
            pushFollow(FOLLOW_rule__Aspect__CollectorsAssignment_4_in_rule__Aspect__Group__4__Impl4417);
            rule__Aspect__CollectorsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2116:1: rule__Aspect__Group__5 : rule__Aspect__Group__5__Impl ;
    public final void rule__Aspect__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2120:1: ( rule__Aspect__Group__5__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2121:2: rule__Aspect__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Aspect__Group__5__Impl_in_rule__Aspect__Group__54447);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2127:1: rule__Aspect__Group__5__Impl : ( '}' ) ;
    public final void rule__Aspect__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2131:1: ( ( '}' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2132:1: ( '}' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2132:1: ( '}' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2133:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,35,FOLLOW_35_in_rule__Aspect__Group__5__Impl4475); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2158:1: rule__Query__Group__0 : rule__Query__Group__0__Impl rule__Query__Group__1 ;
    public final void rule__Query__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2162:1: ( rule__Query__Group__0__Impl rule__Query__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2163:2: rule__Query__Group__0__Impl rule__Query__Group__1
            {
            pushFollow(FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__04518);
            rule__Query__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group__1_in_rule__Query__Group__04521);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2170:1: rule__Query__Group__0__Impl : ( ( rule__Query__LocationAssignment_0 ) ) ;
    public final void rule__Query__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2174:1: ( ( ( rule__Query__LocationAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2175:1: ( ( rule__Query__LocationAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2175:1: ( ( rule__Query__LocationAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2176:1: ( rule__Query__LocationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2177:1: ( rule__Query__LocationAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2177:2: rule__Query__LocationAssignment_0
            {
            pushFollow(FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl4548);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2187:1: rule__Query__Group__1 : rule__Query__Group__1__Impl ;
    public final void rule__Query__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2191:1: ( rule__Query__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2192:2: rule__Query__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__14578);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2198:1: rule__Query__Group__1__Impl : ( ( rule__Query__Group_1__0 )? ) ;
    public final void rule__Query__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2202:1: ( ( ( rule__Query__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2203:1: ( ( rule__Query__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2203:1: ( ( rule__Query__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2204:1: ( rule__Query__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2205:1: ( rule__Query__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID||LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2205:2: rule__Query__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl4605);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2219:1: rule__Query__Group_1__0 : rule__Query__Group_1__0__Impl rule__Query__Group_1__1 ;
    public final void rule__Query__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2223:1: ( rule__Query__Group_1__0__Impl rule__Query__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2224:2: rule__Query__Group_1__0__Impl rule__Query__Group_1__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__04640);
            rule__Query__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__04643);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2231:1: rule__Query__Group_1__0__Impl : ( ( rule__Query__Alternatives_1_0 ) ) ;
    public final void rule__Query__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2235:1: ( ( ( rule__Query__Alternatives_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2236:1: ( ( rule__Query__Alternatives_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2236:1: ( ( rule__Query__Alternatives_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2237:1: ( rule__Query__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2238:1: ( rule__Query__Alternatives_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2238:2: rule__Query__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl4670);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2248:1: rule__Query__Group_1__1 : rule__Query__Group_1__1__Impl rule__Query__Group_1__2 ;
    public final void rule__Query__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2252:1: ( rule__Query__Group_1__1__Impl rule__Query__Group_1__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2253:2: rule__Query__Group_1__1__Impl rule__Query__Group_1__2
            {
            pushFollow(FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__14700);
            rule__Query__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__14703);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2260:1: rule__Query__Group_1__1__Impl : ( ( rule__Query__Alternatives_1_1 ) ) ;
    public final void rule__Query__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2264:1: ( ( ( rule__Query__Alternatives_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2265:1: ( ( rule__Query__Alternatives_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2265:1: ( ( rule__Query__Alternatives_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2266:1: ( rule__Query__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getAlternatives_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2267:1: ( rule__Query__Alternatives_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2267:2: rule__Query__Alternatives_1_1
            {
            pushFollow(FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl4730);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2277:1: rule__Query__Group_1__2 : rule__Query__Group_1__2__Impl rule__Query__Group_1__3 ;
    public final void rule__Query__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2281:1: ( rule__Query__Group_1__2__Impl rule__Query__Group_1__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2282:2: rule__Query__Group_1__2__Impl rule__Query__Group_1__3
            {
            pushFollow(FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__24760);
            rule__Query__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__24763);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2289:1: rule__Query__Group_1__2__Impl : ( ( rule__Query__MethodAssignment_1_2 ) ) ;
    public final void rule__Query__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2293:1: ( ( ( rule__Query__MethodAssignment_1_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2294:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2294:1: ( ( rule__Query__MethodAssignment_1_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2295:1: ( rule__Query__MethodAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodAssignment_1_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2296:1: ( rule__Query__MethodAssignment_1_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2296:2: rule__Query__MethodAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl4790);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2306:1: rule__Query__Group_1__3 : rule__Query__Group_1__3__Impl rule__Query__Group_1__4 ;
    public final void rule__Query__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2310:1: ( rule__Query__Group_1__3__Impl rule__Query__Group_1__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2311:2: rule__Query__Group_1__3__Impl rule__Query__Group_1__4
            {
            pushFollow(FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__34820);
            rule__Query__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__34823);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2318:1: rule__Query__Group_1__3__Impl : ( '(' ) ;
    public final void rule__Query__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2322:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2323:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2323:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2324:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLeftParenthesisKeyword_1_3()); 
            }
            match(input,36,FOLLOW_36_in_rule__Query__Group_1__3__Impl4851); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2337:1: rule__Query__Group_1__4 : rule__Query__Group_1__4__Impl rule__Query__Group_1__5 ;
    public final void rule__Query__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2341:1: ( rule__Query__Group_1__4__Impl rule__Query__Group_1__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2342:2: rule__Query__Group_1__4__Impl rule__Query__Group_1__5
            {
            pushFollow(FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__44882);
            rule__Query__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__44885);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2349:1: rule__Query__Group_1__4__Impl : ( ( rule__Query__ParameterAssignment_1_4 ) ) ;
    public final void rule__Query__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2353:1: ( ( ( rule__Query__ParameterAssignment_1_4 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2354:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2354:1: ( ( rule__Query__ParameterAssignment_1_4 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2355:1: ( rule__Query__ParameterAssignment_1_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_4()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2356:1: ( rule__Query__ParameterAssignment_1_4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2356:2: rule__Query__ParameterAssignment_1_4
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl4912);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2366:1: rule__Query__Group_1__5 : rule__Query__Group_1__5__Impl rule__Query__Group_1__6 ;
    public final void rule__Query__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2370:1: ( rule__Query__Group_1__5__Impl rule__Query__Group_1__6 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2371:2: rule__Query__Group_1__5__Impl rule__Query__Group_1__6
            {
            pushFollow(FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__54942);
            rule__Query__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__54945);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2378:1: rule__Query__Group_1__5__Impl : ( ( rule__Query__Group_1_5__0 )* ) ;
    public final void rule__Query__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2382:1: ( ( ( rule__Query__Group_1_5__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2383:1: ( ( rule__Query__Group_1_5__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2383:1: ( ( rule__Query__Group_1_5__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2384:1: ( rule__Query__Group_1_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getGroup_1_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2385:1: ( rule__Query__Group_1_5__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==38) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2385:2: rule__Query__Group_1_5__0
            	    {
            	    pushFollow(FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl4972);
            	    rule__Query__Group_1_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2395:1: rule__Query__Group_1__6 : rule__Query__Group_1__6__Impl ;
    public final void rule__Query__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2399:1: ( rule__Query__Group_1__6__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2400:2: rule__Query__Group_1__6__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__65003);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2406:1: rule__Query__Group_1__6__Impl : ( ')' ) ;
    public final void rule__Query__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2410:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2411:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2411:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2412:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getRightParenthesisKeyword_1_6()); 
            }
            match(input,37,FOLLOW_37_in_rule__Query__Group_1__6__Impl5031); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2439:1: rule__Query__Group_1_5__0 : rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 ;
    public final void rule__Query__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2443:1: ( rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2444:2: rule__Query__Group_1_5__0__Impl rule__Query__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__05076);
            rule__Query__Group_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__05079);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2451:1: rule__Query__Group_1_5__0__Impl : ( ',' ) ;
    public final void rule__Query__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2455:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2456:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2456:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2457:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getCommaKeyword_1_5_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Query__Group_1_5__0__Impl5107); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2470:1: rule__Query__Group_1_5__1 : rule__Query__Group_1_5__1__Impl ;
    public final void rule__Query__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2474:1: ( rule__Query__Group_1_5__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2475:2: rule__Query__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__15138);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2481:1: rule__Query__Group_1_5__1__Impl : ( ( rule__Query__ParameterAssignment_1_5_1 ) ) ;
    public final void rule__Query__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2485:1: ( ( ( rule__Query__ParameterAssignment_1_5_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2486:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2486:1: ( ( rule__Query__ParameterAssignment_1_5_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2487:1: ( rule__Query__ParameterAssignment_1_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterAssignment_1_5_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2488:1: ( rule__Query__ParameterAssignment_1_5_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2488:2: rule__Query__ParameterAssignment_1_5_1
            {
            pushFollow(FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl5165);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2502:1: rule__ParameterPattern__Group__0 : rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 ;
    public final void rule__ParameterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2506:1: ( rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2507:2: rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__05199);
            rule__ParameterPattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__05202);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2514:1: rule__ParameterPattern__Group__0__Impl : ( ( rule__ParameterPattern__ModifierAssignment_0 ) ) ;
    public final void rule__ParameterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2518:1: ( ( ( rule__ParameterPattern__ModifierAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2519:1: ( ( rule__ParameterPattern__ModifierAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2519:1: ( ( rule__ParameterPattern__ModifierAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2520:1: ( rule__ParameterPattern__ModifierAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2521:1: ( rule__ParameterPattern__ModifierAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2521:2: rule__ParameterPattern__ModifierAssignment_0
            {
            pushFollow(FOLLOW_rule__ParameterPattern__ModifierAssignment_0_in_rule__ParameterPattern__Group__0__Impl5229);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2531:1: rule__ParameterPattern__Group__1 : rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 ;
    public final void rule__ParameterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2535:1: ( rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2536:2: rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__15259);
            rule__ParameterPattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__15262);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2543:1: rule__ParameterPattern__Group__1__Impl : ( ( rule__ParameterPattern__TypeAssignment_1 ) ) ;
    public final void rule__ParameterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2547:1: ( ( ( rule__ParameterPattern__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2548:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2548:1: ( ( rule__ParameterPattern__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2549:1: ( rule__ParameterPattern__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2550:1: ( rule__ParameterPattern__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2550:2: rule__ParameterPattern__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl5289);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2560:1: rule__ParameterPattern__Group__2 : rule__ParameterPattern__Group__2__Impl ;
    public final void rule__ParameterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2564:1: ( rule__ParameterPattern__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2565:2: rule__ParameterPattern__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__25319);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2571:1: rule__ParameterPattern__Group__2__Impl : ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) ;
    public final void rule__ParameterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2575:1: ( ( ( rule__ParameterPattern__ParameterAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2576:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2576:1: ( ( rule__ParameterPattern__ParameterAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2577:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2578:1: ( rule__ParameterPattern__ParameterAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2578:2: rule__ParameterPattern__ParameterAssignment_2
            {
            pushFollow(FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl5346);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2594:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2598:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2599:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__05382);
            rule__LocationQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__05385);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2606:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__NodeAssignment_0 ) ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2610:1: ( ( ( rule__LocationQuery__NodeAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2611:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2611:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2612:1: ( rule__LocationQuery__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2613:1: ( rule__LocationQuery__NodeAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2613:2: rule__LocationQuery__NodeAssignment_0
            {
            pushFollow(FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl5412);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2623:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2627:1: ( rule__LocationQuery__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2628:2: rule__LocationQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__15442);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2634:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__Group_1__0 )? ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2638:1: ( ( ( rule__LocationQuery__Group_1__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2639:1: ( ( rule__LocationQuery__Group_1__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2639:1: ( ( rule__LocationQuery__Group_1__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2640:1: ( rule__LocationQuery__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2641:1: ( rule__LocationQuery__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2641:2: rule__LocationQuery__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl5469);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2655:1: rule__LocationQuery__Group_1__0 : rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 ;
    public final void rule__LocationQuery__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2659:1: ( rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2660:2: rule__LocationQuery__Group_1__0__Impl rule__LocationQuery__Group_1__1
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__05504);
            rule__LocationQuery__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__05507);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2667:1: rule__LocationQuery__Group_1__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2671:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2672:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2672:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2673:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__LocationQuery__Group_1__0__Impl5535); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2686:1: rule__LocationQuery__Group_1__1 : rule__LocationQuery__Group_1__1__Impl ;
    public final void rule__LocationQuery__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2690:1: ( rule__LocationQuery__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2691:2: rule__LocationQuery__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__15566);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2697:1: rule__LocationQuery__Group_1__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) ;
    public final void rule__LocationQuery__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2701:1: ( ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2702:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2702:1: ( ( rule__LocationQuery__SpecializationAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2703:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2704:1: ( rule__LocationQuery__SpecializationAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2704:2: rule__LocationQuery__SpecializationAssignment_1_1
            {
            pushFollow(FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl5593);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2718:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2722:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2723:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05627);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05630);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2730:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2734:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2735:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2735:1: ( ( rule__Node__Alternatives_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2736:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2737:1: ( rule__Node__Alternatives_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2737:2: rule__Node__Alternatives_0
            {
            pushFollow(FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl5657);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2747:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2751:1: ( rule__Node__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2752:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15687);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2758:1: rule__Node__Group__1__Impl : ( ( rule__Node__ParameterAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2762:1: ( ( ( rule__Node__ParameterAssignment_1 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2763:1: ( ( rule__Node__ParameterAssignment_1 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2763:1: ( ( rule__Node__ParameterAssignment_1 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2764:1: ( rule__Node__ParameterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2765:1: ( rule__Node__ParameterAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2765:2: rule__Node__ParameterAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl5714);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2779:1: rule__ParamQuery__Group__0 : rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 ;
    public final void rule__ParamQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2783:1: ( rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2784:2: rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__05749);
            rule__ParamQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__05752);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2791:1: rule__ParamQuery__Group__0__Impl : ( '[' ) ;
    public final void rule__ParamQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2795:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2796:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2796:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2797:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,39,FOLLOW_39_in_rule__ParamQuery__Group__0__Impl5780); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2810:1: rule__ParamQuery__Group__1 : rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 ;
    public final void rule__ParamQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2814:1: ( rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2815:2: rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__15811);
            rule__ParamQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__15814);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2822:1: rule__ParamQuery__Group__1__Impl : ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) ;
    public final void rule__ParamQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2826:1: ( ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2827:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2827:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2828:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2828:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2829:1: ( rule__ParamQuery__QueriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2830:1: ( rule__ParamQuery__QueriesAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2830:2: rule__ParamQuery__QueriesAssignment_1
            {
            pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5843);
            rule__ParamQuery__QueriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }

            }

            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2833:1: ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2834:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2835:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_INT)||LA20_0==15||LA20_0==43) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2835:2: rule__ParamQuery__QueriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5855);
            	    rule__ParamQuery__QueriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2846:1: rule__ParamQuery__Group__2 : rule__ParamQuery__Group__2__Impl ;
    public final void rule__ParamQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2850:1: ( rule__ParamQuery__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2851:2: rule__ParamQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__25888);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2857:1: rule__ParamQuery__Group__2__Impl : ( ']' ) ;
    public final void rule__ParamQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2861:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2862:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2862:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2863:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,40,FOLLOW_40_in_rule__ParamQuery__Group__2__Impl5916); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2882:1: rule__ParamCompare__Group__0 : rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 ;
    public final void rule__ParamCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2886:1: ( rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2887:2: rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__05953);
            rule__ParamCompare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__05956);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2894:1: rule__ParamCompare__Group__0__Impl : ( ( rule__ParamCompare__LeftAssignment_0 ) ) ;
    public final void rule__ParamCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2898:1: ( ( ( rule__ParamCompare__LeftAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2899:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2899:1: ( ( rule__ParamCompare__LeftAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2900:1: ( rule__ParamCompare__LeftAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2901:1: ( rule__ParamCompare__LeftAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2901:2: rule__ParamCompare__LeftAssignment_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl5983);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2911:1: rule__ParamCompare__Group__1 : rule__ParamCompare__Group__1__Impl ;
    public final void rule__ParamCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2915:1: ( rule__ParamCompare__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2916:2: rule__ParamCompare__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__16013);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2922:1: rule__ParamCompare__Group__1__Impl : ( ( rule__ParamCompare__Group_1__0 ) ) ;
    public final void rule__ParamCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2926:1: ( ( ( rule__ParamCompare__Group_1__0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2927:1: ( ( rule__ParamCompare__Group_1__0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2927:1: ( ( rule__ParamCompare__Group_1__0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2928:1: ( rule__ParamCompare__Group_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2929:1: ( rule__ParamCompare__Group_1__0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2929:2: rule__ParamCompare__Group_1__0
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl6040);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2943:1: rule__ParamCompare__Group_1__0 : rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 ;
    public final void rule__ParamCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2947:1: ( rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2948:2: rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__06074);
            rule__ParamCompare__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__06077);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2955:1: rule__ParamCompare__Group_1__0__Impl : ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) ;
    public final void rule__ParamCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2959:1: ( ( ( rule__ParamCompare__OperatorAssignment_1_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2960:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2960:1: ( ( rule__ParamCompare__OperatorAssignment_1_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2961:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2962:1: ( rule__ParamCompare__OperatorAssignment_1_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2962:2: rule__ParamCompare__OperatorAssignment_1_0
            {
            pushFollow(FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl6104);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2972:1: rule__ParamCompare__Group_1__1 : rule__ParamCompare__Group_1__1__Impl ;
    public final void rule__ParamCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2976:1: ( rule__ParamCompare__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2977:2: rule__ParamCompare__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__16134);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2983:1: rule__ParamCompare__Group_1__1__Impl : ( ( rule__ParamCompare__RightAssignment_1_1 ) ) ;
    public final void rule__ParamCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2987:1: ( ( ( rule__ParamCompare__RightAssignment_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2988:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2988:1: ( ( rule__ParamCompare__RightAssignment_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2989:1: ( rule__ParamCompare__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightAssignment_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2990:1: ( rule__ParamCompare__RightAssignment_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:2990:2: rule__ParamCompare__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl6161);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3004:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3008:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3009:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__06195);
            rule__ReferenceValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__06198);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3016:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 ) ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3020:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3021:1: ( ( rule__ReferenceValue__QueryAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3021:1: ( ( rule__ReferenceValue__QueryAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3022:1: ( rule__ReferenceValue__QueryAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3023:1: ( rule__ReferenceValue__QueryAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3023:2: rule__ReferenceValue__QueryAssignment_0
            {
            pushFollow(FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl6225);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3033:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3037:1: ( rule__ReferenceValue__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3038:2: rule__ReferenceValue__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__16255);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3044:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3048:1: ( ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3049:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3049:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3050:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3051:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3051:2: rule__ReferenceValue__ParameterAssignment_1
            {
            pushFollow(FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl6282);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3065:1: rule__RuntimeProperty__Group__0 : rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 ;
    public final void rule__RuntimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3069:1: ( rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3070:2: rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__06316);
            rule__RuntimeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__06319);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3077:1: rule__RuntimeProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__RuntimeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3081:1: ( ( '#' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3082:1: ( '#' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3082:1: ( '#' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3083:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,41,FOLLOW_41_in_rule__RuntimeProperty__Group__0__Impl6347); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3096:1: rule__RuntimeProperty__Group__1 : rule__RuntimeProperty__Group__1__Impl ;
    public final void rule__RuntimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3100:1: ( rule__RuntimeProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3101:2: rule__RuntimeProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__16378);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3107:1: rule__RuntimeProperty__Group__1__Impl : ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__RuntimeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3111:1: ( ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3112:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3112:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3113:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3114:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3114:2: rule__RuntimeProperty__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl6405);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3128:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3132:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3133:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__06439);
            rule__ReflectionProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__06442);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3140:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3144:1: ( ( '$' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3145:1: ( '$' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3145:1: ( '$' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3146:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,42,FOLLOW_42_in_rule__ReflectionProperty__Group__0__Impl6470); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3159:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3163:1: ( rule__ReflectionProperty__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3164:2: rule__ReflectionProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__16501);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3170:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3174:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3175:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3175:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3176:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3177:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3177:2: rule__ReflectionProperty__FunctionAssignment_1
            {
            pushFollow(FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl6528);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3191:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3195:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3196:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__06562);
            rule__WildcardNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__06565);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3203:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3207:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3208:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3208:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3209:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWoldcardNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3210:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3212:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeAccess().getWoldcardNodeAction_0()); 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3222:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3226:1: ( rule__WildcardNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3227:2: rule__WildcardNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__16623);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3233:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3237:1: ( ( '*' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3238:1: ( '*' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3238:1: ( '*' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3239:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getAsteriskKeyword_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__WildcardNode__Group__1__Impl6651); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3256:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3260:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3261:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__06686);
            rule__SubPathNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__06689);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3268:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3272:1: ( ( () ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3273:1: ( () )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3273:1: ( () )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3274:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3275:1: ()
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3277:1: 
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3287:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3291:1: ( rule__SubPathNode__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3292:2: rule__SubPathNode__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__16747);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3298:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3302:1: ( ( '**' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3303:1: ( '**' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3303:1: ( '**' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3304:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,43,FOLLOW_43_in_rule__SubPathNode__Group__1__Impl6775); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3321:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3325:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3326:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
            {
            pushFollow(FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__06810);
            rule__Collector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__06813);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3333:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3337:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3338:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3338:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3339:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3340:1: ( rule__Collector__InsertionPointAssignment_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3340:2: rule__Collector__InsertionPointAssignment_0
            {
            pushFollow(FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl6840);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3350:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl rule__Collector__Group__2 ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3354:1: ( rule__Collector__Group__1__Impl rule__Collector__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3355:2: rule__Collector__Group__1__Impl rule__Collector__Group__2
            {
            pushFollow(FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__16870);
            rule__Collector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__16873);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3362:1: rule__Collector__Group__1__Impl : ( ( rule__Collector__TypeAssignment_1 ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3366:1: ( ( ( rule__Collector__TypeAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3367:1: ( ( rule__Collector__TypeAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3367:1: ( ( rule__Collector__TypeAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3368:1: ( rule__Collector__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3369:1: ( rule__Collector__TypeAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3369:2: rule__Collector__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl6900);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3379:1: rule__Collector__Group__2 : rule__Collector__Group__2__Impl rule__Collector__Group__3 ;
    public final void rule__Collector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3383:1: ( rule__Collector__Group__2__Impl rule__Collector__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3384:2: rule__Collector__Group__2__Impl rule__Collector__Group__3
            {
            pushFollow(FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__26930);
            rule__Collector__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__26933);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3391:1: rule__Collector__Group__2__Impl : ( '(' ) ;
    public final void rule__Collector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3395:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3396:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3396:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3397:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,36,FOLLOW_36_in_rule__Collector__Group__2__Impl6961); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3410:1: rule__Collector__Group__3 : rule__Collector__Group__3__Impl rule__Collector__Group__4 ;
    public final void rule__Collector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3414:1: ( rule__Collector__Group__3__Impl rule__Collector__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3415:2: rule__Collector__Group__3__Impl rule__Collector__Group__4
            {
            pushFollow(FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__36992);
            rule__Collector__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__36995);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3422:1: rule__Collector__Group__3__Impl : ( ( rule__Collector__Group_3__0 )? ) ;
    public final void rule__Collector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3426:1: ( ( ( rule__Collector__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3427:1: ( ( rule__Collector__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3427:1: ( ( rule__Collector__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3428:1: ( rule__Collector__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3429:1: ( rule__Collector__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=RULE_STRING && LA21_0<=RULE_INT)||LA21_0==15||LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3429:2: rule__Collector__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl7022);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3439:1: rule__Collector__Group__4 : rule__Collector__Group__4__Impl ;
    public final void rule__Collector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3443:1: ( rule__Collector__Group__4__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3444:2: rule__Collector__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__47053);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3450:1: rule__Collector__Group__4__Impl : ( ')' ) ;
    public final void rule__Collector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3454:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3455:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3455:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3456:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,37,FOLLOW_37_in_rule__Collector__Group__4__Impl7081); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3479:1: rule__Collector__Group_3__0 : rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 ;
    public final void rule__Collector__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3483:1: ( rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3484:2: rule__Collector__Group_3__0__Impl rule__Collector__Group_3__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__07122);
            rule__Collector__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__07125);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3491:1: rule__Collector__Group_3__0__Impl : ( ( rule__Collector__InitializationsAssignment_3_0 ) ) ;
    public final void rule__Collector__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3495:1: ( ( ( rule__Collector__InitializationsAssignment_3_0 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3496:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3496:1: ( ( rule__Collector__InitializationsAssignment_3_0 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3497:1: ( rule__Collector__InitializationsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3498:1: ( rule__Collector__InitializationsAssignment_3_0 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3498:2: rule__Collector__InitializationsAssignment_3_0
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl7152);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3508:1: rule__Collector__Group_3__1 : rule__Collector__Group_3__1__Impl ;
    public final void rule__Collector__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3512:1: ( rule__Collector__Group_3__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3513:2: rule__Collector__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__17182);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3519:1: rule__Collector__Group_3__1__Impl : ( ( rule__Collector__Group_3_1__0 )* ) ;
    public final void rule__Collector__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3523:1: ( ( ( rule__Collector__Group_3_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3524:1: ( ( rule__Collector__Group_3_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3524:1: ( ( rule__Collector__Group_3_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3525:1: ( rule__Collector__Group_3_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3526:1: ( rule__Collector__Group_3_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==38) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3526:2: rule__Collector__Group_3_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl7209);
            	    rule__Collector__Group_3_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3540:1: rule__Collector__Group_3_1__0 : rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 ;
    public final void rule__Collector__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3544:1: ( rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3545:2: rule__Collector__Group_3_1__0__Impl rule__Collector__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__07244);
            rule__Collector__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__07247);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3552:1: rule__Collector__Group_3_1__0__Impl : ( ',' ) ;
    public final void rule__Collector__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3556:1: ( ( ',' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3557:1: ( ',' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3557:1: ( ',' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3558:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getCommaKeyword_3_1_0()); 
            }
            match(input,38,FOLLOW_38_in_rule__Collector__Group_3_1__0__Impl7275); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3571:1: rule__Collector__Group_3_1__1 : rule__Collector__Group_3_1__1__Impl ;
    public final void rule__Collector__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3575:1: ( rule__Collector__Group_3_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3576:2: rule__Collector__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__17306);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3582:1: rule__Collector__Group_3_1__1__Impl : ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) ;
    public final void rule__Collector__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3586:1: ( ( ( rule__Collector__InitializationsAssignment_3_1_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3587:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3587:1: ( ( rule__Collector__InitializationsAssignment_3_1_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3588:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsAssignment_3_1_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3589:1: ( rule__Collector__InitializationsAssignment_3_1_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3589:2: rule__Collector__InitializationsAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl7333);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3603:1: rule__TagAnnotation__Group__0 : rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 ;
    public final void rule__TagAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3607:1: ( rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3608:2: rule__TagAnnotation__Group__0__Impl rule__TagAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__07367);
            rule__TagAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__07370);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3615:1: rule__TagAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TagAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3619:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3620:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3620:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3621:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__TagAnnotation__Group__0__Impl7398); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3634:1: rule__TagAnnotation__Group__1 : rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 ;
    public final void rule__TagAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3638:1: ( rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3639:2: rule__TagAnnotation__Group__1__Impl rule__TagAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__17429);
            rule__TagAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__17432);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3646:1: rule__TagAnnotation__Group__1__Impl : ( ( rule__TagAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TagAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3650:1: ( ( ( rule__TagAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3651:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3651:1: ( ( rule__TagAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3652:1: ( rule__TagAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3653:1: ( rule__TagAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3653:2: rule__TagAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl7459);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3663:1: rule__TagAnnotation__Group__2 : rule__TagAnnotation__Group__2__Impl ;
    public final void rule__TagAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3667:1: ( rule__TagAnnotation__Group__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3668:2: rule__TagAnnotation__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__27489);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3674:1: rule__TagAnnotation__Group__2__Impl : ( ( rule__TagAnnotation__Group_2__0 )? ) ;
    public final void rule__TagAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3678:1: ( ( ( rule__TagAnnotation__Group_2__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3679:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3679:1: ( ( rule__TagAnnotation__Group_2__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3680:1: ( rule__TagAnnotation__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getGroup_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3681:1: ( rule__TagAnnotation__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3681:2: rule__TagAnnotation__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl7516);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3697:1: rule__TagAnnotation__Group_2__0 : rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 ;
    public final void rule__TagAnnotation__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3701:1: ( rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3702:2: rule__TagAnnotation__Group_2__0__Impl rule__TagAnnotation__Group_2__1
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__07553);
            rule__TagAnnotation__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__07556);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3709:1: rule__TagAnnotation__Group_2__0__Impl : ( '(' ) ;
    public final void rule__TagAnnotation__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3713:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3714:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3714:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3715:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__TagAnnotation__Group_2__0__Impl7584); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3728:1: rule__TagAnnotation__Group_2__1 : rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 ;
    public final void rule__TagAnnotation__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3732:1: ( rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3733:2: rule__TagAnnotation__Group_2__1__Impl rule__TagAnnotation__Group_2__2
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__17615);
            rule__TagAnnotation__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__17618);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3740:1: rule__TagAnnotation__Group_2__1__Impl : ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) ;
    public final void rule__TagAnnotation__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3744:1: ( ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3745:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3745:1: ( ( rule__TagAnnotation__AnnotationsAssignment_2_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3746:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAssignment_2_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3747:1: ( rule__TagAnnotation__AnnotationsAssignment_2_1 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_COMMENT_ANNOTATION||LA24_0==44) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3747:2: rule__TagAnnotation__AnnotationsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl7645);
            	    rule__TagAnnotation__AnnotationsAssignment_2_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3757:1: rule__TagAnnotation__Group_2__2 : rule__TagAnnotation__Group_2__2__Impl ;
    public final void rule__TagAnnotation__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3761:1: ( rule__TagAnnotation__Group_2__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3762:2: rule__TagAnnotation__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__27676);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3768:1: rule__TagAnnotation__Group_2__2__Impl : ( ')' ) ;
    public final void rule__TagAnnotation__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3772:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3773:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3773:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3774:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__TagAnnotation__Group_2__2__Impl7704); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3793:1: rule__KeyStringValueAnnotation__Group__0 : rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 ;
    public final void rule__KeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3797:1: ( rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3798:2: rule__KeyStringValueAnnotation__Group__0__Impl rule__KeyStringValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__07741);
            rule__KeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__07744);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3805:1: rule__KeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3809:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3810:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3810:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3811:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__KeyStringValueAnnotation__Group__0__Impl7772); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3824:1: rule__KeyStringValueAnnotation__Group__1 : rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 ;
    public final void rule__KeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3828:1: ( rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3829:2: rule__KeyStringValueAnnotation__Group__1__Impl rule__KeyStringValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__17803);
            rule__KeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__17806);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3836:1: rule__KeyStringValueAnnotation__Group__1__Impl : ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3840:1: ( ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3841:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3841:1: ( ( rule__KeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3842:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3843:1: ( rule__KeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3843:2: rule__KeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl7833);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3853:1: rule__KeyStringValueAnnotation__Group__2 : rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 ;
    public final void rule__KeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3857:1: ( rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3858:2: rule__KeyStringValueAnnotation__Group__2__Impl rule__KeyStringValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__27863);
            rule__KeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__27866);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3865:1: rule__KeyStringValueAnnotation__Group__2__Impl : ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3869:1: ( ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3870:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3870:1: ( ( rule__KeyStringValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3871:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3872:1: ( rule__KeyStringValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3872:2: rule__KeyStringValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl7893);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3882:1: rule__KeyStringValueAnnotation__Group__3 : rule__KeyStringValueAnnotation__Group__3__Impl ;
    public final void rule__KeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3886:1: ( rule__KeyStringValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3887:2: rule__KeyStringValueAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__37923);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3893:1: rule__KeyStringValueAnnotation__Group__3__Impl : ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3897:1: ( ( ( rule__KeyStringValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3898:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3898:1: ( ( rule__KeyStringValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3899:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3900:1: ( rule__KeyStringValueAnnotation__Group_3__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==36) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3900:2: rule__KeyStringValueAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl7950);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3918:1: rule__KeyStringValueAnnotation__Group_3__0 : rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 ;
    public final void rule__KeyStringValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3922:1: ( rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3923:2: rule__KeyStringValueAnnotation__Group_3__0__Impl rule__KeyStringValueAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__07989);
            rule__KeyStringValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__07992);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3930:1: rule__KeyStringValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3934:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3935:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3935:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3936:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__KeyStringValueAnnotation__Group_3__0__Impl8020); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3949:1: rule__KeyStringValueAnnotation__Group_3__1 : rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 ;
    public final void rule__KeyStringValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3953:1: ( rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3954:2: rule__KeyStringValueAnnotation__Group_3__1__Impl rule__KeyStringValueAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__18051);
            rule__KeyStringValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__18054);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3961:1: rule__KeyStringValueAnnotation__Group_3__1__Impl : ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3965:1: ( ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3966:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3966:1: ( ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3967:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3968:1: ( rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RULE_COMMENT_ANNOTATION||LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3968:2: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl8081);
            	    rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3978:1: rule__KeyStringValueAnnotation__Group_3__2 : rule__KeyStringValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyStringValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3982:1: ( rule__KeyStringValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3983:2: rule__KeyStringValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__28112);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3989:1: rule__KeyStringValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyStringValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3993:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3994:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3994:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:3995:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__KeyStringValueAnnotation__Group_3__2__Impl8140); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4014:1: rule__TypedKeyStringValueAnnotation__Group__0 : rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4018:1: ( rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4019:2: rule__TypedKeyStringValueAnnotation__Group__0__Impl rule__TypedKeyStringValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__08177);
            rule__TypedKeyStringValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__08180);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4026:1: rule__TypedKeyStringValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4030:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4031:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4031:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4032:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl8208); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4045:1: rule__TypedKeyStringValueAnnotation__Group__1 : rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4049:1: ( rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4050:2: rule__TypedKeyStringValueAnnotation__Group__1__Impl rule__TypedKeyStringValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__18239);
            rule__TypedKeyStringValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__18242);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4057:1: rule__TypedKeyStringValueAnnotation__Group__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4061:1: ( ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4062:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4062:1: ( ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4063:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4064:1: ( rule__TypedKeyStringValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4064:2: rule__TypedKeyStringValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl8269);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4074:1: rule__TypedKeyStringValueAnnotation__Group__2 : rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4078:1: ( rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4079:2: rule__TypedKeyStringValueAnnotation__Group__2__Impl rule__TypedKeyStringValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__28299);
            rule__TypedKeyStringValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__28302);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4086:1: rule__TypedKeyStringValueAnnotation__Group__2__Impl : ( '[' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4090:1: ( ( '[' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4091:1: ( '[' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4091:1: ( '[' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4092:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftSquareBracketKeyword_2()); 
            }
            match(input,39,FOLLOW_39_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl8330); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4105:1: rule__TypedKeyStringValueAnnotation__Group__3 : rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4109:1: ( rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4110:2: rule__TypedKeyStringValueAnnotation__Group__3__Impl rule__TypedKeyStringValueAnnotation__Group__4
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__38361);
            rule__TypedKeyStringValueAnnotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__38364);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4117:1: rule__TypedKeyStringValueAnnotation__Group__3__Impl : ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4121:1: ( ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4122:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4122:1: ( ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4123:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeAssignment_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4124:1: ( rule__TypedKeyStringValueAnnotation__TypeAssignment_3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4124:2: rule__TypedKeyStringValueAnnotation__TypeAssignment_3
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl8391);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4134:1: rule__TypedKeyStringValueAnnotation__Group__4 : rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4138:1: ( rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4139:2: rule__TypedKeyStringValueAnnotation__Group__4__Impl rule__TypedKeyStringValueAnnotation__Group__5
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__48421);
            rule__TypedKeyStringValueAnnotation__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__48424);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4146:1: rule__TypedKeyStringValueAnnotation__Group__4__Impl : ( ']' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4150:1: ( ( ']' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4151:1: ( ']' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4151:1: ( ']' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4152:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightSquareBracketKeyword_4()); 
            }
            match(input,40,FOLLOW_40_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl8452); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4165:1: rule__TypedKeyStringValueAnnotation__Group__5 : rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4169:1: ( rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4170:2: rule__TypedKeyStringValueAnnotation__Group__5__Impl rule__TypedKeyStringValueAnnotation__Group__6
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__58483);
            rule__TypedKeyStringValueAnnotation__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__58486);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4177:1: rule__TypedKeyStringValueAnnotation__Group__5__Impl : ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4181:1: ( ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4182:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4182:1: ( ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4183:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueAssignment_5()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4184:1: ( rule__TypedKeyStringValueAnnotation__ValueAssignment_5 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4184:2: rule__TypedKeyStringValueAnnotation__ValueAssignment_5
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl8513);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4194:1: rule__TypedKeyStringValueAnnotation__Group__6 : rule__TypedKeyStringValueAnnotation__Group__6__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4198:1: ( rule__TypedKeyStringValueAnnotation__Group__6__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4199:2: rule__TypedKeyStringValueAnnotation__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__68543);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4205:1: rule__TypedKeyStringValueAnnotation__Group__6__Impl : ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4209:1: ( ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4210:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4210:1: ( ( rule__TypedKeyStringValueAnnotation__Group_6__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4211:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getGroup_6()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4212:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==36) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4212:2: rule__TypedKeyStringValueAnnotation__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl8570);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4236:1: rule__TypedKeyStringValueAnnotation__Group_6__0 : rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4240:1: ( rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4241:2: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl rule__TypedKeyStringValueAnnotation__Group_6__1
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__08615);
            rule__TypedKeyStringValueAnnotation__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__08618);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4248:1: rule__TypedKeyStringValueAnnotation__Group_6__0__Impl : ( '(' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4252:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4253:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4253:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4254:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getLeftParenthesisKeyword_6_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl8646); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4267:1: rule__TypedKeyStringValueAnnotation__Group_6__1 : rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4271:1: ( rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4272:2: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl rule__TypedKeyStringValueAnnotation__Group_6__2
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__18677);
            rule__TypedKeyStringValueAnnotation__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__18680);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4279:1: rule__TypedKeyStringValueAnnotation__Group_6__1__Impl : ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4283:1: ( ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4284:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4284:1: ( ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4285:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAssignment_6_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4286:1: ( rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_COMMENT_ANNOTATION||LA28_0==44) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4286:2: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1
            	    {
            	    pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl8707);
            	    rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4296:1: rule__TypedKeyStringValueAnnotation__Group_6__2 : rule__TypedKeyStringValueAnnotation__Group_6__2__Impl ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4300:1: ( rule__TypedKeyStringValueAnnotation__Group_6__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4301:2: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl
            {
            pushFollow(FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__28738);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4307:1: rule__TypedKeyStringValueAnnotation__Group_6__2__Impl : ( ')' ) ;
    public final void rule__TypedKeyStringValueAnnotation__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4311:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4312:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4312:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4313:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl8766); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4332:1: rule__KeyBooleanValueAnnotation__Group__0 : rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4336:1: ( rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4337:2: rule__KeyBooleanValueAnnotation__Group__0__Impl rule__KeyBooleanValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__08803);
            rule__KeyBooleanValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__08806);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4344:1: rule__KeyBooleanValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4348:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4349:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4349:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4350:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__KeyBooleanValueAnnotation__Group__0__Impl8834); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4363:1: rule__KeyBooleanValueAnnotation__Group__1 : rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4367:1: ( rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4368:2: rule__KeyBooleanValueAnnotation__Group__1__Impl rule__KeyBooleanValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__18865);
            rule__KeyBooleanValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__18868);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4375:1: rule__KeyBooleanValueAnnotation__Group__1__Impl : ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4379:1: ( ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4380:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4380:1: ( ( rule__KeyBooleanValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4381:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4382:1: ( rule__KeyBooleanValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4382:2: rule__KeyBooleanValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl8895);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4392:1: rule__KeyBooleanValueAnnotation__Group__2 : rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 ;
    public final void rule__KeyBooleanValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4396:1: ( rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4397:2: rule__KeyBooleanValueAnnotation__Group__2__Impl rule__KeyBooleanValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__28925);
            rule__KeyBooleanValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__28928);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4404:1: rule__KeyBooleanValueAnnotation__Group__2__Impl : ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4408:1: ( ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4409:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4409:1: ( ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4410:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4411:1: ( rule__KeyBooleanValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4411:2: rule__KeyBooleanValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl8955);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4421:1: rule__KeyBooleanValueAnnotation__Group__3 : rule__KeyBooleanValueAnnotation__Group__3__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4425:1: ( rule__KeyBooleanValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4426:2: rule__KeyBooleanValueAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__38985);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4432:1: rule__KeyBooleanValueAnnotation__Group__3__Impl : ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyBooleanValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4436:1: ( ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4437:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4437:1: ( ( rule__KeyBooleanValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4438:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4439:1: ( rule__KeyBooleanValueAnnotation__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4439:2: rule__KeyBooleanValueAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl9012);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4457:1: rule__KeyBooleanValueAnnotation__Group_3__0 : rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4461:1: ( rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4462:2: rule__KeyBooleanValueAnnotation__Group_3__0__Impl rule__KeyBooleanValueAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__09051);
            rule__KeyBooleanValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__09054);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4469:1: rule__KeyBooleanValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4473:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4474:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4474:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4475:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl9082); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4488:1: rule__KeyBooleanValueAnnotation__Group_3__1 : rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4492:1: ( rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4493:2: rule__KeyBooleanValueAnnotation__Group_3__1__Impl rule__KeyBooleanValueAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__19113);
            rule__KeyBooleanValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__19116);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4500:1: rule__KeyBooleanValueAnnotation__Group_3__1__Impl : ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4504:1: ( ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4505:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4505:1: ( ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4506:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4507:1: ( rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_COMMENT_ANNOTATION||LA30_0==44) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4507:2: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl9143);
            	    rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4517:1: rule__KeyBooleanValueAnnotation__Group_3__2 : rule__KeyBooleanValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4521:1: ( rule__KeyBooleanValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4522:2: rule__KeyBooleanValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__29174);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4528:1: rule__KeyBooleanValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyBooleanValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4532:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4533:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4533:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4534:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl9202); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4553:1: rule__KeyIntValueAnnotation__Group__0 : rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 ;
    public final void rule__KeyIntValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4557:1: ( rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4558:2: rule__KeyIntValueAnnotation__Group__0__Impl rule__KeyIntValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__09239);
            rule__KeyIntValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__09242);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4565:1: rule__KeyIntValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyIntValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4569:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4570:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4570:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4571:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__KeyIntValueAnnotation__Group__0__Impl9270); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4584:1: rule__KeyIntValueAnnotation__Group__1 : rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 ;
    public final void rule__KeyIntValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4588:1: ( rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4589:2: rule__KeyIntValueAnnotation__Group__1__Impl rule__KeyIntValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__19301);
            rule__KeyIntValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__19304);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4596:1: rule__KeyIntValueAnnotation__Group__1__Impl : ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4600:1: ( ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4601:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4601:1: ( ( rule__KeyIntValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4602:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4603:1: ( rule__KeyIntValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4603:2: rule__KeyIntValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl9331);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4613:1: rule__KeyIntValueAnnotation__Group__2 : rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 ;
    public final void rule__KeyIntValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4617:1: ( rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4618:2: rule__KeyIntValueAnnotation__Group__2__Impl rule__KeyIntValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__29361);
            rule__KeyIntValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__29364);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4625:1: rule__KeyIntValueAnnotation__Group__2__Impl : ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyIntValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4629:1: ( ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4630:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4630:1: ( ( rule__KeyIntValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4631:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4632:1: ( rule__KeyIntValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4632:2: rule__KeyIntValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl9391);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4642:1: rule__KeyIntValueAnnotation__Group__3 : rule__KeyIntValueAnnotation__Group__3__Impl ;
    public final void rule__KeyIntValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4646:1: ( rule__KeyIntValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4647:2: rule__KeyIntValueAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__39421);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4653:1: rule__KeyIntValueAnnotation__Group__3__Impl : ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyIntValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4657:1: ( ( ( rule__KeyIntValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4658:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4658:1: ( ( rule__KeyIntValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4659:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4660:1: ( rule__KeyIntValueAnnotation__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==36) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4660:2: rule__KeyIntValueAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl9448);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4678:1: rule__KeyIntValueAnnotation__Group_3__0 : rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 ;
    public final void rule__KeyIntValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4682:1: ( rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4683:2: rule__KeyIntValueAnnotation__Group_3__0__Impl rule__KeyIntValueAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__09487);
            rule__KeyIntValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__09490);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4690:1: rule__KeyIntValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4694:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4695:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4695:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4696:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__KeyIntValueAnnotation__Group_3__0__Impl9518); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4709:1: rule__KeyIntValueAnnotation__Group_3__1 : rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 ;
    public final void rule__KeyIntValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4713:1: ( rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4714:2: rule__KeyIntValueAnnotation__Group_3__1__Impl rule__KeyIntValueAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__19549);
            rule__KeyIntValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__19552);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4721:1: rule__KeyIntValueAnnotation__Group_3__1__Impl : ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4725:1: ( ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4726:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4726:1: ( ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4727:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4728:1: ( rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_COMMENT_ANNOTATION||LA32_0==44) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4728:2: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl9579);
            	    rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4738:1: rule__KeyIntValueAnnotation__Group_3__2 : rule__KeyIntValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyIntValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4742:1: ( rule__KeyIntValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4743:2: rule__KeyIntValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__29610);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4749:1: rule__KeyIntValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyIntValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4753:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4754:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4754:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4755:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__KeyIntValueAnnotation__Group_3__2__Impl9638); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4774:1: rule__KeyFloatValueAnnotation__Group__0 : rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 ;
    public final void rule__KeyFloatValueAnnotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4778:1: ( rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4779:2: rule__KeyFloatValueAnnotation__Group__0__Impl rule__KeyFloatValueAnnotation__Group__1
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__09675);
            rule__KeyFloatValueAnnotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__09678);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4786:1: rule__KeyFloatValueAnnotation__Group__0__Impl : ( '@' ) ;
    public final void rule__KeyFloatValueAnnotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4790:1: ( ( '@' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4791:1: ( '@' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4791:1: ( '@' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4792:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,44,FOLLOW_44_in_rule__KeyFloatValueAnnotation__Group__0__Impl9706); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4805:1: rule__KeyFloatValueAnnotation__Group__1 : rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 ;
    public final void rule__KeyFloatValueAnnotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4809:1: ( rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4810:2: rule__KeyFloatValueAnnotation__Group__1__Impl rule__KeyFloatValueAnnotation__Group__2
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__19737);
            rule__KeyFloatValueAnnotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__19740);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4817:1: rule__KeyFloatValueAnnotation__Group__1__Impl : ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4821:1: ( ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4822:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4822:1: ( ( rule__KeyFloatValueAnnotation__NameAssignment_1 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4823:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameAssignment_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4824:1: ( rule__KeyFloatValueAnnotation__NameAssignment_1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4824:2: rule__KeyFloatValueAnnotation__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl9767);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4834:1: rule__KeyFloatValueAnnotation__Group__2 : rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 ;
    public final void rule__KeyFloatValueAnnotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4838:1: ( rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4839:2: rule__KeyFloatValueAnnotation__Group__2__Impl rule__KeyFloatValueAnnotation__Group__3
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__29797);
            rule__KeyFloatValueAnnotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__29800);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4846:1: rule__KeyFloatValueAnnotation__Group__2__Impl : ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) ;
    public final void rule__KeyFloatValueAnnotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4850:1: ( ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4851:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4851:1: ( ( rule__KeyFloatValueAnnotation__ValueAssignment_2 ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4852:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueAssignment_2()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4853:1: ( rule__KeyFloatValueAnnotation__ValueAssignment_2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4853:2: rule__KeyFloatValueAnnotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl9827);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4863:1: rule__KeyFloatValueAnnotation__Group__3 : rule__KeyFloatValueAnnotation__Group__3__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4867:1: ( rule__KeyFloatValueAnnotation__Group__3__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4868:2: rule__KeyFloatValueAnnotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__39857);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4874:1: rule__KeyFloatValueAnnotation__Group__3__Impl : ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) ;
    public final void rule__KeyFloatValueAnnotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4878:1: ( ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4879:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4879:1: ( ( rule__KeyFloatValueAnnotation__Group_3__0 )? )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4880:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getGroup_3()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4881:1: ( rule__KeyFloatValueAnnotation__Group_3__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4881:2: rule__KeyFloatValueAnnotation__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl9884);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4899:1: rule__KeyFloatValueAnnotation__Group_3__0 : rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4903:1: ( rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4904:2: rule__KeyFloatValueAnnotation__Group_3__0__Impl rule__KeyFloatValueAnnotation__Group_3__1
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__09923);
            rule__KeyFloatValueAnnotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__09926);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4911:1: rule__KeyFloatValueAnnotation__Group_3__0__Impl : ( '(' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4915:1: ( ( '(' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4916:1: ( '(' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4916:1: ( '(' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4917:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,36,FOLLOW_36_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl9954); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4930:1: rule__KeyFloatValueAnnotation__Group_3__1 : rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4934:1: ( rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4935:2: rule__KeyFloatValueAnnotation__Group_3__1__Impl rule__KeyFloatValueAnnotation__Group_3__2
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__19985);
            rule__KeyFloatValueAnnotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__19988);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4942:1: rule__KeyFloatValueAnnotation__Group_3__1__Impl : ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4946:1: ( ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4947:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4947:1: ( ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4948:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAssignment_3_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4949:1: ( rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_COMMENT_ANNOTATION||LA34_0==44) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4949:2: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl10015);
            	    rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4959:1: rule__KeyFloatValueAnnotation__Group_3__2 : rule__KeyFloatValueAnnotation__Group_3__2__Impl ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4963:1: ( rule__KeyFloatValueAnnotation__Group_3__2__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4964:2: rule__KeyFloatValueAnnotation__Group_3__2__Impl
            {
            pushFollow(FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__210046);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4970:1: rule__KeyFloatValueAnnotation__Group_3__2__Impl : ( ')' ) ;
    public final void rule__KeyFloatValueAnnotation__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4974:1: ( ( ')' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4975:1: ( ')' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4975:1: ( ')' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4976:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,37,FOLLOW_37_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl10074); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:4996:1: rule__ExtendedID__Group__0 : rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 ;
    public final void rule__ExtendedID__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5000:1: ( rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5001:2: rule__ExtendedID__Group__0__Impl rule__ExtendedID__Group__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010112);
            rule__ExtendedID__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010115);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5008:1: rule__ExtendedID__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5012:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5013:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5013:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5014:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10142); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5025:1: rule__ExtendedID__Group__1 : rule__ExtendedID__Group__1__Impl ;
    public final void rule__ExtendedID__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5029:1: ( rule__ExtendedID__Group__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5030:2: rule__ExtendedID__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110171);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5036:1: rule__ExtendedID__Group__1__Impl : ( ( rule__ExtendedID__Group_1__0 )* ) ;
    public final void rule__ExtendedID__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5040:1: ( ( ( rule__ExtendedID__Group_1__0 )* ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5041:1: ( ( rule__ExtendedID__Group_1__0 )* )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5041:1: ( ( rule__ExtendedID__Group_1__0 )* )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5042:1: ( rule__ExtendedID__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getGroup_1()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5043:1: ( rule__ExtendedID__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==32) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5043:2: rule__ExtendedID__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10198);
            	    rule__ExtendedID__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5057:1: rule__ExtendedID__Group_1__0 : rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 ;
    public final void rule__ExtendedID__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5061:1: ( rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1 )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5062:2: rule__ExtendedID__Group_1__0__Impl rule__ExtendedID__Group_1__1
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010233);
            rule__ExtendedID__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010236);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5069:1: rule__ExtendedID__Group_1__0__Impl : ( '.' ) ;
    public final void rule__ExtendedID__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5073:1: ( ( '.' ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5074:1: ( '.' )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5074:1: ( '.' )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5075:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getFullStopKeyword_1_0()); 
            }
            match(input,32,FOLLOW_32_in_rule__ExtendedID__Group_1__0__Impl10264); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5088:1: rule__ExtendedID__Group_1__1 : rule__ExtendedID__Group_1__1__Impl ;
    public final void rule__ExtendedID__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5092:1: ( rule__ExtendedID__Group_1__1__Impl )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5093:2: rule__ExtendedID__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110295);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5099:1: rule__ExtendedID__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__ExtendedID__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5103:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5104:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5104:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5105:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExtendedIDAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl10322); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5121:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5125:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5126:1: ( ruleQualifiedName )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5126:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5127:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_110360);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5136:1: rule__Model__PackagesAssignment_2 : ( rulePackage ) ;
    public final void rule__Model__PackagesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5140:1: ( ( rulePackage ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5141:1: ( rulePackage )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5141:1: ( rulePackage )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5142:1: rulePackage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackagesPackageParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_210391);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5151:1: rule__Model__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5155:1: ( ( ruleImport ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5156:1: ( ruleImport )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5156:1: ( ruleImport )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5157:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_310422);
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


    // $ANTLR start "rule__Model__AspectsAssignment_4"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5166:1: rule__Model__AspectsAssignment_4 : ( ruleAspect ) ;
    public final void rule__Model__AspectsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5170:1: ( ( ruleAspect ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5171:1: ( ruleAspect )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5171:1: ( ruleAspect )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5172:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getAspectsAspectParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_410453);
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


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5181:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5185:1: ( ( ruleQualifiedNameWithWildcard ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5186:1: ( ruleQualifiedNameWithWildcard )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5186:1: ( ruleQualifiedNameWithWildcard )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5187:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_110484);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5196:1: rule__Package__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Package__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5200:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5201:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5201:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5202:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Package__NameAssignment_110515); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5211:1: rule__Package__PackageAssignment_2 : ( ( RULE_STRING ) ) ;
    public final void rule__Package__PackageAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5215:1: ( ( ( RULE_STRING ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5216:1: ( ( RULE_STRING ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5216:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5217:1: ( RULE_STRING )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5218:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5219:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_210550); if (state.failed) return ;
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


    // $ANTLR start "rule__Aspect__AnnotationAssignment_0"
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5230:1: rule__Aspect__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Aspect__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5234:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5235:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5235:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5236:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__Aspect__AnnotationAssignment_010585);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5245:1: rule__Aspect__QueryAssignment_2 : ( ruleQuery ) ;
    public final void rule__Aspect__QueryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5249:1: ( ( ruleQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5250:1: ( ruleQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5250:1: ( ruleQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5251:1: ruleQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getQueryQueryParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_210616);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5260:1: rule__Aspect__CollectorsAssignment_4 : ( ruleCollector ) ;
    public final void rule__Aspect__CollectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5264:1: ( ( ruleCollector ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5265:1: ( ruleCollector )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5265:1: ( ruleCollector )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5266:1: ruleCollector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCollectorsCollectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_410647);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5275:1: rule__Query__LocationAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__Query__LocationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5279:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5280:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5280:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5281:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getLocationLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_010678);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5290:1: rule__Query__ModifierAssignment_1_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ModifierAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5294:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5295:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5295:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5296:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierCrossReference_1_0_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5297:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5298:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getModifierMethodModifierIDTerminalRuleCall_1_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_010713); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5309:1: rule__Query__ReturnTypeAssignment_1_1_0 : ( ( RULE_ID ) ) ;
    public final void rule__Query__ReturnTypeAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5313:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5314:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5314:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5315:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeCrossReference_1_1_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5316:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5317:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getReturnTypeTypeIDTerminalRuleCall_1_1_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_010752); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5328:1: rule__Query__MethodAssignment_1_2 : ( ( RULE_ID ) ) ;
    public final void rule__Query__MethodAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5332:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5333:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5333:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5334:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodCrossReference_1_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5335:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5336:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getMethodMethodIDTerminalRuleCall_1_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_210791); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5347:1: rule__Query__ParameterAssignment_1_4 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5351:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5352:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5352:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5353:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_4_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_410826);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5362:1: rule__Query__ParameterAssignment_1_5_1 : ( ruleParameterPattern ) ;
    public final void rule__Query__ParameterAssignment_1_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5366:1: ( ( ruleParameterPattern ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5367:1: ( ruleParameterPattern )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5367:1: ( ruleParameterPattern )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5368:1: ruleParameterPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryAccess().getParameterParameterPatternParserRuleCall_1_5_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_110857);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5377:1: rule__ParameterPattern__ModifierAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5381:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5382:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5382:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5383:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierCrossReference_0_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5384:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5385:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_010892); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5396:1: rule__ParameterPattern__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5400:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5401:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5401:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5402:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5403:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5404:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_110931); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5415:1: rule__ParameterPattern__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterPattern__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5419:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5420:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5420:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5421:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterCrossReference_2_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5422:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5423:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterPatternAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_210970); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5434:1: rule__LocationQuery__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5438:1: ( ( ruleNode ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5439:1: ( ruleNode )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5439:1: ( ruleNode )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5440:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_011005);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5449:1: rule__LocationQuery__SpecializationAssignment_1_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5453:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5454:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5454:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5455:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_111036);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5464:1: rule__Node__ParameterAssignment_1 : ( ruleParamQuery ) ;
    public final void rule__Node__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5468:1: ( ( ruleParamQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5469:1: ( ruleParamQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5469:1: ( ruleParamQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5470:1: ruleParamQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_111067);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5479:1: rule__ParamQuery__QueriesAssignment_1 : ( ruleParamCompare ) ;
    public final void rule__ParamQuery__QueriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5483:1: ( ( ruleParamCompare ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5484:1: ( ruleParamCompare )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5484:1: ( ruleParamCompare )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5485:1: ruleParamCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesParamCompareParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_111098);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5494:1: rule__ParamCompare__LeftAssignment_0 : ( ruleValue ) ;
    public final void rule__ParamCompare__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5498:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5499:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5499:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5500:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_011129);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5509:1: rule__ParamCompare__OperatorAssignment_1_0 : ( ruleOperator ) ;
    public final void rule__ParamCompare__OperatorAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5513:1: ( ( ruleOperator ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5514:1: ( ruleOperator )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5514:1: ( ruleOperator )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5515:1: ruleOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_011160);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5524:1: rule__ParamCompare__RightAssignment_1_1 : ( ruleValue ) ;
    public final void rule__ParamCompare__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5528:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5529:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5529:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5530:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_111191);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5539:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5543:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5544:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5544:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5545:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment11222); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5554:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5558:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5559:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5559:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5560:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11253); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5569:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5573:1: ( ( RULE_STRING ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5574:1: ( RULE_STRING )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5574:1: ( RULE_STRING )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5575:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment11284); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5584:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5588:1: ( ( ruleLocationQuery ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5589:1: ( ruleLocationQuery )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5589:1: ( ruleLocationQuery )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5590:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_011315);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5599:1: rule__ReferenceValue__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__ReferenceValue__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5603:1: ( ( ruleParameter ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5604:1: ( ruleParameter )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5604:1: ( ruleParameter )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5605:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_111346);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5614:1: rule__RuntimeProperty__ReferenceAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuntimeProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5618:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5619:1: ( RULE_ID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5619:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5620:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_111377); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5629:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5633:1: ( ( ruleReflectionFunction ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5634:1: ( ruleReflectionFunction )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5634:1: ( ruleReflectionFunction )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5635:1: ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_111408);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5644:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5648:1: ( ( ( RULE_ID ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5649:1: ( ( RULE_ID ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5649:1: ( ( RULE_ID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5650:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5651:1: ( RULE_ID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5652:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment11443); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5663:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5667:1: ( ( ruleInsertionPoint ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5668:1: ( ruleInsertionPoint )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5668:1: ( ruleInsertionPoint )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5669:1: ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_011478);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5678:1: rule__Collector__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Collector__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5682:1: ( ( ( ruleQualifiedName ) ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5683:1: ( ( ruleQualifiedName ) )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5683:1: ( ( ruleQualifiedName ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5684:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeCrossReference_1_0()); 
            }
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5685:1: ( ruleQualifiedName )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5686:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getTypeRecordTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_111513);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5697:1: rule__Collector__InitializationsAssignment_3_0 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5701:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5702:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5702:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5703:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_011548);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5712:1: rule__Collector__InitializationsAssignment_3_1_1 : ( ruleValue ) ;
    public final void rule__Collector__InitializationsAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5716:1: ( ( ruleValue ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5717:1: ( ruleValue )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5717:1: ( ruleValue )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5718:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInitializationsValueParserRuleCall_3_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_111579);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5727:1: rule__CommentAnnotation__ValueAssignment : ( RULE_COMMENT_ANNOTATION ) ;
    public final void rule__CommentAnnotation__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5731:1: ( ( RULE_COMMENT_ANNOTATION ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5732:1: ( RULE_COMMENT_ANNOTATION )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5732:1: ( RULE_COMMENT_ANNOTATION )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5733:1: RULE_COMMENT_ANNOTATION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCommentAnnotationAccess().getValueCOMMENT_ANNOTATIONTerminalRuleCall_0()); 
            }
            match(input,RULE_COMMENT_ANNOTATION,FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment11610); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5742:1: rule__TagAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TagAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5746:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5747:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5747:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5748:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_111641);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5757:1: rule__TagAnnotation__AnnotationsAssignment_2_1 : ( ruleAnnotation ) ;
    public final void rule__TagAnnotation__AnnotationsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5761:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5762:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5762:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5763:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTagAnnotationAccess().getAnnotationsAnnotationParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_111672);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5772:1: rule__KeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5776:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5777:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5777:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5778:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_111703);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5787:1: rule__KeyStringValueAnnotation__ValueAssignment_2 : ( ruleEString ) ;
    public final void rule__KeyStringValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5791:1: ( ( ruleEString ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5792:1: ( ruleEString )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5792:1: ( ruleEString )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5793:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_211734);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5802:1: rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5806:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5807:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5807:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5808:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_111765);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5817:1: rule__TypedKeyStringValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5821:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5822:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5822:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5823:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_111796);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5832:1: rule__TypedKeyStringValueAnnotation__TypeAssignment_3 : ( ruleExtendedID ) ;
    public final void rule__TypedKeyStringValueAnnotation__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5836:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5837:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5837:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5838:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getTypeExtendedIDParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_311827);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5847:1: rule__TypedKeyStringValueAnnotation__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__TypedKeyStringValueAnnotation__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5851:1: ( ( ruleEString ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5852:1: ( ruleEString )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5852:1: ( ruleEString )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5853:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_511858);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5862:1: rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1 : ( ruleAnnotation ) ;
    public final void rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5866:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5867:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5867:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5868:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypedKeyStringValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_111889);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5877:1: rule__KeyBooleanValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyBooleanValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5881:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5882:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5882:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5883:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_111920);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5892:1: rule__KeyBooleanValueAnnotation__ValueAssignment_2 : ( RULE_BOOLEAN ) ;
    public final void rule__KeyBooleanValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5896:1: ( ( RULE_BOOLEAN ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5897:1: ( RULE_BOOLEAN )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5897:1: ( RULE_BOOLEAN )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5898:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getValueBOOLEANTerminalRuleCall_2_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_211951); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5907:1: rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5911:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5912:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5912:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5913:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyBooleanValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_111982);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5922:1: rule__KeyIntValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyIntValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5926:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5927:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5927:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5928:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_112013);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5937:1: rule__KeyIntValueAnnotation__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__KeyIntValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5941:1: ( ( RULE_INT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5942:1: ( RULE_INT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5942:1: ( RULE_INT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5943:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getValueINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_212044); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5952:1: rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5956:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5957:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5957:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5958:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyIntValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_112075);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5967:1: rule__KeyFloatValueAnnotation__NameAssignment_1 : ( ruleExtendedID ) ;
    public final void rule__KeyFloatValueAnnotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5971:1: ( ( ruleExtendedID ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5972:1: ( ruleExtendedID )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5972:1: ( ruleExtendedID )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5973:1: ruleExtendedID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getNameExtendedIDParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_112106);
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5982:1: rule__KeyFloatValueAnnotation__ValueAssignment_2 : ( RULE_FLOAT ) ;
    public final void rule__KeyFloatValueAnnotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5986:1: ( ( RULE_FLOAT ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5987:1: ( RULE_FLOAT )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5987:1: ( RULE_FLOAT )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5988:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getValueFLOATTerminalRuleCall_2_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_212137); if (state.failed) return ;
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
    // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:5997:1: rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1 : ( ruleAnnotation ) ;
    public final void rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:6001:1: ( ( ruleAnnotation ) )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:6002:1: ( ruleAnnotation )
            {
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:6002:1: ( ruleAnnotation )
            // ../de.cau.cs.se.instrumentation.al.ui/src-gen/de/cau/cs/se/instrumentation/al/ui/contentassist/antlr/internal/InternalApplicationLang.g:6003:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getKeyFloatValueAnnotationAccess().getAnnotationsAnnotationParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_112168);
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\14\uffff";
    static final String DFA6_eofS =
        "\3\uffff\1\12\7\uffff\1\12";
    static final String DFA6_minS =
        "\1\10\1\uffff\1\5\1\4\1\5\6\uffff\1\4";
    static final String DFA6_maxS =
        "\1\54\1\uffff\1\5\1\54\1\5\6\uffff\1\54";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\3\uffff\1\4\1\5\1\7\1\3\1\6\1\2\1\uffff";
    static final String DFA6_specialS =
        "\14\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\1\43\uffff\1\2",
            "",
            "\1\3",
            "\2\10\1\7\1\11\1\12\1\6\26\uffff\1\4\1\12\2\uffff\2\12\1\uffff"+
            "\1\5\4\uffff\1\12",
            "\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "\2\10\1\7\1\11\1\12\1\6\26\uffff\1\4\1\12\2\uffff\2\12\1\uffff"+
            "\1\5\4\uffff\1\12"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1206:1: rule__Annotation__Alternatives : ( ( ruleCommentAnnotation ) | ( ruleTagAnnotation ) | ( ruleKeyStringValueAnnotation ) | ( ruleTypedKeyStringValueAnnotation ) | ( ruleKeyBooleanValueAnnotation ) | ( ruleKeyIntValueAnnotation ) | ( ruleKeyFloatValueAnnotation ) );";
        }
    }
 

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
    public static final BitSet FOLLOW_ruleAspect_in_entryRuleAspect367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAspect374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0_in_ruleAspect400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_entryRuleQuery427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuery434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0_in_ruleQuery460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_entryRuleParameterPattern487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterPattern494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__0_in_ruleParameterPattern520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_entryRuleLocationQuery547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocationQuery554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__0_in_ruleLocationQuery580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_entryRuleParamQuery667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamQuery674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__0_in_ruleParamQuery700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_entryRuleParamCompare727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParamCompare734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__0_in_ruleParamCompare760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Value__Alternatives_in_ruleValue820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_entryRuleFloatValue847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatValue854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FloatValue__ValueAssignment_in_ruleFloatValue880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_entryRuleIntValue907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntValue914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntValue__ValueAssignment_in_ruleIntValue940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__ValueAssignment_in_ruleStringValue1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_entryRuleReferenceValue1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReferenceValue1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__0_in_ruleReferenceValue1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameter__Alternatives_in_ruleParameter1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_entryRuleRuntimeProperty1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRuntimeProperty1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0_in_ruleRuntimeProperty1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_entryRuleReflectionProperty1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReflectionProperty1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0_in_ruleReflectionProperty1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_entryRuleContainerNode1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainerNode1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContainerNode__ContainerAssignment_in_ruleContainerNode1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_entryRuleWildcardNode1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWildcardNode1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0_in_ruleWildcardNode1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_entryRuleSubPathNode1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubPathNode1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0_in_ruleSubPathNode1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_entryRuleCollector1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollector1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0_in_ruleCollector1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Alternatives_in_ruleAnnotation1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_entryRuleCommentAnnotation1569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommentAnnotation1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CommentAnnotation__ValueAssignment_in_ruleCommentAnnotation1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_entryRuleTagAnnotation1629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTagAnnotation1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__0_in_ruleTagAnnotation1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_entryRuleKeyStringValueAnnotation1689 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyStringValueAnnotation1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0_in_ruleKeyStringValueAnnotation1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_entryRuleTypedKeyStringValueAnnotation1749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypedKeyStringValueAnnotation1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0_in_ruleTypedKeyStringValueAnnotation1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_entryRuleKeyBooleanValueAnnotation1809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyBooleanValueAnnotation1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0_in_ruleKeyBooleanValueAnnotation1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_entryRuleKeyIntValueAnnotation1869 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyIntValueAnnotation1876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0_in_ruleKeyIntValueAnnotation1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_entryRuleKeyFloatValueAnnotation1929 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKeyFloatValueAnnotation1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0_in_ruleKeyFloatValueAnnotation1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEString1998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_entryRuleExtendedID2051 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtendedID2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0_in_ruleExtendedID2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionFunction__Alternatives_in_ruleReflectionFunction2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Operator__Alternatives_in_ruleOperator2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__InsertionPoint__Alternatives_in_ruleInsertionPoint2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ModifierAssignment_1_0_0_in_rule__Query__Alternatives_1_02228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Query__Alternatives_1_02247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ReturnTypeAssignment_1_1_0_in_rule__Query__Alternatives_1_12281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Query__Alternatives_1_12300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubPathNode_in_rule__Node__Alternatives_02334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWildcardNode_in_rule__Node__Alternatives_02351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContainerNode_in_rule__Node__Alternatives_02368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__Value__Alternatives2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntValue_in_rule__Value__Alternatives2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatValue_in_rule__Value__Alternatives2434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReferenceValue_in_rule__Value__Alternatives2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRuntimeProperty_in_rule__Parameter__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionProperty_in_rule__Parameter__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommentAnnotation_in_rule__Annotation__Alternatives2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTagAnnotation_in_rule__Annotation__Alternatives2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyStringValueAnnotation_in_rule__Annotation__Alternatives2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypedKeyStringValueAnnotation_in_rule__Annotation__Alternatives2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyBooleanValueAnnotation_in_rule__Annotation__Alternatives2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyIntValueAnnotation_in_rule__Annotation__Alternatives2617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKeyFloatValueAnnotation_in_rule__Annotation__Alternatives2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives2667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives2684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ReflectionFunction__Alternatives2717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ReflectionFunction__Alternatives2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ReflectionFunction__Alternatives2759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ReflectionFunction__Alternatives2780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Operator__Alternatives2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Operator__Alternatives2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Operator__Alternatives2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Operator__Alternatives2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Operator__Alternatives2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Operator__Alternatives2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Operator__Alternatives2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__InsertionPoint__Alternatives2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__InsertionPoint__Alternatives2999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03032 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Model__Group__0__Impl3063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13094 = new BitSet(new long[]{0x00001000C0000100L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_1_in_rule__Model__Group__1__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__23154 = new BitSet(new long[]{0x00001000C0000100L});
    public static final BitSet FOLLOW_rule__Model__Group__3_in_rule__Model__Group__23157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__PackagesAssignment_2_in_rule__Model__Group__2__Impl3184 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Model__Group__3__Impl_in_rule__Model__Group__33215 = new BitSet(new long[]{0x00001000C0000100L});
    public static final BitSet FOLLOW_rule__Model__Group__4_in_rule__Model__Group__33218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_3_in_rule__Model__Group__3__Impl3245 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Model__Group__4__Impl_in_rule__Model__Group__43276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__AspectsAssignment_4_in_rule__Model__Group__4__Impl3303 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03344 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Import__Group__0__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportedNamespaceAssignment_1_in_rule__Import__Group__1__Impl3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__0__Impl_in_rule__Package__Group__03467 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Package__Group__1_in_rule__Package__Group__03470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Package__Group__0__Impl3498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__1__Impl_in_rule__Package__Group__13529 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Package__Group__2_in_rule__Package__Group__13532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__NameAssignment_1_in_rule__Package__Group__1__Impl3559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__Group__2__Impl_in_rule__Package__Group__23589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Package__PackageAssignment_2_in_rule__Package__Group__2__Impl3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03652 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3738 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__03773 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__03776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QualifiedName__Group_1__0__Impl3805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__13837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__0__Impl_in_rule__QualifiedNameWithWildcard__Group__03897 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1_in_rule__QualifiedNameWithWildcard__Group__03900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameWithWildcard__Group__0__Impl3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group__1__Impl_in_rule__QualifiedNameWithWildcard__Group__13956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0_in_rule__QualifiedNameWithWildcard__Group__1__Impl3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__0__Impl_in_rule__QualifiedNameWithWildcard__Group_1__04018 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1_in_rule__QualifiedNameWithWildcard__Group_1__04021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__QualifiedNameWithWildcard__Group_1__0__Impl4049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameWithWildcard__Group_1__1__Impl_in_rule__QualifiedNameWithWildcard__Group_1__14080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__QualifiedNameWithWildcard__Group_1__1__Impl4108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__0__Impl_in_rule__Aspect__Group__04143 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1_in_rule__Aspect__Group__04146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__AnnotationAssignment_0_in_rule__Aspect__Group__0__Impl4173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__1__Impl_in_rule__Aspect__Group__14203 = new BitSet(new long[]{0x0000080000008020L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2_in_rule__Aspect__Group__14206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Aspect__Group__1__Impl4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__2__Impl_in_rule__Aspect__Group__24265 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3_in_rule__Aspect__Group__24268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__QueryAssignment_2_in_rule__Aspect__Group__2__Impl4295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__3__Impl_in_rule__Aspect__Group__34325 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4_in_rule__Aspect__Group__34328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Aspect__Group__3__Impl4356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__4__Impl_in_rule__Aspect__Group__44387 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Aspect__Group__5_in_rule__Aspect__Group__44390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__CollectorsAssignment_4_in_rule__Aspect__Group__4__Impl4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Aspect__Group__5__Impl_in_rule__Aspect__Group__54447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Aspect__Group__5__Impl4475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__0__Impl_in_rule__Query__Group__04518 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__Query__Group__1_in_rule__Query__Group__04521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__LocationAssignment_0_in_rule__Query__Group__0__Impl4548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group__1__Impl_in_rule__Query__Group__14578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0_in_rule__Query__Group__1__Impl4605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__0__Impl_in_rule__Query__Group_1__04640 = new BitSet(new long[]{0x0000000000008020L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1_in_rule__Query__Group_1__04643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_0_in_rule__Query__Group_1__0__Impl4670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__1__Impl_in_rule__Query__Group_1__14700 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2_in_rule__Query__Group_1__14703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Alternatives_1_1_in_rule__Query__Group_1__1__Impl4730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__2__Impl_in_rule__Query__Group_1__24760 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3_in_rule__Query__Group_1__24763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__MethodAssignment_1_2_in_rule__Query__Group_1__2__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__3__Impl_in_rule__Query__Group_1__34820 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4_in_rule__Query__Group_1__34823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Query__Group_1__3__Impl4851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__4__Impl_in_rule__Query__Group_1__44882 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5_in_rule__Query__Group_1__44885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_4_in_rule__Query__Group_1__4__Impl4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__5__Impl_in_rule__Query__Group_1__54942 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6_in_rule__Query__Group_1__54945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0_in_rule__Query__Group_1__5__Impl4972 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1__6__Impl_in_rule__Query__Group_1__65003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Query__Group_1__6__Impl5031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__0__Impl_in_rule__Query__Group_1_5__05076 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1_in_rule__Query__Group_1_5__05079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Query__Group_1_5__0__Impl5107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__Group_1_5__1__Impl_in_rule__Query__Group_1_5__15138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Query__ParameterAssignment_1_5_1_in_rule__Query__Group_1_5__1__Impl5165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__0__Impl_in_rule__ParameterPattern__Group__05199 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1_in_rule__ParameterPattern__Group__05202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ModifierAssignment_0_in_rule__ParameterPattern__Group__0__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__1__Impl_in_rule__ParameterPattern__Group__15259 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2_in_rule__ParameterPattern__Group__15262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__TypeAssignment_1_in_rule__ParameterPattern__Group__1__Impl5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__Group__2__Impl_in_rule__ParameterPattern__Group__25319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParameterPattern__ParameterAssignment_2_in_rule__ParameterPattern__Group__2__Impl5346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__0__Impl_in_rule__LocationQuery__Group__05382 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1_in_rule__LocationQuery__Group__05385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__NodeAssignment_0_in_rule__LocationQuery__Group__0__Impl5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group__1__Impl_in_rule__LocationQuery__Group__15442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0_in_rule__LocationQuery__Group__1__Impl5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__0__Impl_in_rule__LocationQuery__Group_1__05504 = new BitSet(new long[]{0x0000080000008020L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1_in_rule__LocationQuery__Group_1__05507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__LocationQuery__Group_1__0__Impl5535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__Group_1__1__Impl_in_rule__LocationQuery__Group_1__15566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LocationQuery__SpecializationAssignment_1_1_in_rule__LocationQuery__Group_1__1__Impl5593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__05627 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__05630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Alternatives_0_in_rule__Node__Group__0__Impl5657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__15687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ParameterAssignment_1_in_rule__Node__Group__1__Impl5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__0__Impl_in_rule__ParamQuery__Group__05749 = new BitSet(new long[]{0x00000800000080F0L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1_in_rule__ParamQuery__Group__05752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ParamQuery__Group__0__Impl5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__1__Impl_in_rule__ParamQuery__Group__15811 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2_in_rule__ParamQuery__Group__15814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5843 = new BitSet(new long[]{0x00000800000080F2L});
    public static final BitSet FOLLOW_rule__ParamQuery__QueriesAssignment_1_in_rule__ParamQuery__Group__1__Impl5855 = new BitSet(new long[]{0x00000800000080F2L});
    public static final BitSet FOLLOW_rule__ParamQuery__Group__2__Impl_in_rule__ParamQuery__Group__25888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__ParamQuery__Group__2__Impl5916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__0__Impl_in_rule__ParamCompare__Group__05953 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1_in_rule__ParamCompare__Group__05956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__LeftAssignment_0_in_rule__ParamCompare__Group__0__Impl5983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group__1__Impl_in_rule__ParamCompare__Group__16013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0_in_rule__ParamCompare__Group__1__Impl6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__0__Impl_in_rule__ParamCompare__Group_1__06074 = new BitSet(new long[]{0x00000800000080F0L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1_in_rule__ParamCompare__Group_1__06077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__OperatorAssignment_1_0_in_rule__ParamCompare__Group_1__0__Impl6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__Group_1__1__Impl_in_rule__ParamCompare__Group_1__16134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ParamCompare__RightAssignment_1_1_in_rule__ParamCompare__Group_1__1__Impl6161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__0__Impl_in_rule__ReferenceValue__Group__06195 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1_in_rule__ReferenceValue__Group__06198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__QueryAssignment_0_in_rule__ReferenceValue__Group__0__Impl6225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__Group__1__Impl_in_rule__ReferenceValue__Group__16255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReferenceValue__ParameterAssignment_1_in_rule__ReferenceValue__Group__1__Impl6282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__0__Impl_in_rule__RuntimeProperty__Group__06316 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1_in_rule__RuntimeProperty__Group__06319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__RuntimeProperty__Group__0__Impl6347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__Group__1__Impl_in_rule__RuntimeProperty__Group__16378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RuntimeProperty__ReferenceAssignment_1_in_rule__RuntimeProperty__Group__1__Impl6405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__0__Impl_in_rule__ReflectionProperty__Group__06439 = new BitSet(new long[]{0x00000000000F0000L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1_in_rule__ReflectionProperty__Group__06442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__ReflectionProperty__Group__0__Impl6470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__Group__1__Impl_in_rule__ReflectionProperty__Group__16501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ReflectionProperty__FunctionAssignment_1_in_rule__ReflectionProperty__Group__1__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__0__Impl_in_rule__WildcardNode__Group__06562 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1_in_rule__WildcardNode__Group__06565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__WildcardNode__Group__1__Impl_in_rule__WildcardNode__Group__16623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__WildcardNode__Group__1__Impl6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__0__Impl_in_rule__SubPathNode__Group__06686 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1_in_rule__SubPathNode__Group__06689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SubPathNode__Group__1__Impl_in_rule__SubPathNode__Group__16747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SubPathNode__Group__1__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__0__Impl_in_rule__Collector__Group__06810 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Collector__Group__1_in_rule__Collector__Group__06813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InsertionPointAssignment_0_in_rule__Collector__Group__0__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__1__Impl_in_rule__Collector__Group__16870 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Collector__Group__2_in_rule__Collector__Group__16873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__TypeAssignment_1_in_rule__Collector__Group__1__Impl6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__2__Impl_in_rule__Collector__Group__26930 = new BitSet(new long[]{0x00000820000080F0L});
    public static final BitSet FOLLOW_rule__Collector__Group__3_in_rule__Collector__Group__26933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Collector__Group__2__Impl6961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__3__Impl_in_rule__Collector__Group__36992 = new BitSet(new long[]{0x00000820000080F0L});
    public static final BitSet FOLLOW_rule__Collector__Group__4_in_rule__Collector__Group__36995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0_in_rule__Collector__Group__3__Impl7022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group__4__Impl_in_rule__Collector__Group__47053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Collector__Group__4__Impl7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__0__Impl_in_rule__Collector__Group_3__07122 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1_in_rule__Collector__Group_3__07125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_0_in_rule__Collector__Group_3__0__Impl7152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3__1__Impl_in_rule__Collector__Group_3__17182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0_in_rule__Collector__Group_3__1__Impl7209 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__0__Impl_in_rule__Collector__Group_3_1__07244 = new BitSet(new long[]{0x00000800000080F0L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1_in_rule__Collector__Group_3_1__07247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Collector__Group_3_1__0__Impl7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__Group_3_1__1__Impl_in_rule__Collector__Group_3_1__17306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Collector__InitializationsAssignment_3_1_1_in_rule__Collector__Group_3_1__1__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__0__Impl_in_rule__TagAnnotation__Group__07367 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__1_in_rule__TagAnnotation__Group__07370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TagAnnotation__Group__0__Impl7398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__1__Impl_in_rule__TagAnnotation__Group__17429 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__2_in_rule__TagAnnotation__Group__17432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__NameAssignment_1_in_rule__TagAnnotation__Group__1__Impl7459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group__2__Impl_in_rule__TagAnnotation__Group__27489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0_in_rule__TagAnnotation__Group__2__Impl7516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__0__Impl_in_rule__TagAnnotation__Group_2__07553 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1_in_rule__TagAnnotation__Group_2__07556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TagAnnotation__Group_2__0__Impl7584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__1__Impl_in_rule__TagAnnotation__Group_2__17615 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2_in_rule__TagAnnotation__Group_2__17618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TagAnnotation__AnnotationsAssignment_2_1_in_rule__TagAnnotation__Group_2__1__Impl7645 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_rule__TagAnnotation__Group_2__2__Impl_in_rule__TagAnnotation__Group_2__27676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TagAnnotation__Group_2__2__Impl7704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__0__Impl_in_rule__KeyStringValueAnnotation__Group__07741 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1_in_rule__KeyStringValueAnnotation__Group__07744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__KeyStringValueAnnotation__Group__0__Impl7772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__1__Impl_in_rule__KeyStringValueAnnotation__Group__17803 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2_in_rule__KeyStringValueAnnotation__Group__17806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__NameAssignment_1_in_rule__KeyStringValueAnnotation__Group__1__Impl7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__2__Impl_in_rule__KeyStringValueAnnotation__Group__27863 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3_in_rule__KeyStringValueAnnotation__Group__27866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__ValueAssignment_2_in_rule__KeyStringValueAnnotation__Group__2__Impl7893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group__3__Impl_in_rule__KeyStringValueAnnotation__Group__37923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0_in_rule__KeyStringValueAnnotation__Group__3__Impl7950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__0__Impl_in_rule__KeyStringValueAnnotation__Group_3__07989 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1_in_rule__KeyStringValueAnnotation__Group_3__07992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__KeyStringValueAnnotation__Group_3__0__Impl8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__1__Impl_in_rule__KeyStringValueAnnotation__Group_3__18051 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2_in_rule__KeyStringValueAnnotation__Group_3__18054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyStringValueAnnotation__Group_3__1__Impl8081 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_rule__KeyStringValueAnnotation__Group_3__2__Impl_in_rule__KeyStringValueAnnotation__Group_3__28112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__KeyStringValueAnnotation__Group_3__2__Impl8140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group__08177 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1_in_rule__TypedKeyStringValueAnnotation__Group__08180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__TypedKeyStringValueAnnotation__Group__0__Impl8208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group__18239 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2_in_rule__TypedKeyStringValueAnnotation__Group__18242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__NameAssignment_1_in_rule__TypedKeyStringValueAnnotation__Group__1__Impl8269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group__28299 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3_in_rule__TypedKeyStringValueAnnotation__Group__28302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__TypedKeyStringValueAnnotation__Group__2__Impl8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__3__Impl_in_rule__TypedKeyStringValueAnnotation__Group__38361 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4_in_rule__TypedKeyStringValueAnnotation__Group__38364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__TypeAssignment_3_in_rule__TypedKeyStringValueAnnotation__Group__3__Impl8391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__4__Impl_in_rule__TypedKeyStringValueAnnotation__Group__48421 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5_in_rule__TypedKeyStringValueAnnotation__Group__48424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__TypedKeyStringValueAnnotation__Group__4__Impl8452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__5__Impl_in_rule__TypedKeyStringValueAnnotation__Group__58483 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6_in_rule__TypedKeyStringValueAnnotation__Group__58486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__ValueAssignment_5_in_rule__TypedKeyStringValueAnnotation__Group__5__Impl8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group__6__Impl_in_rule__TypedKeyStringValueAnnotation__Group__68543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0_in_rule__TypedKeyStringValueAnnotation__Group__6__Impl8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__08615 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1_in_rule__TypedKeyStringValueAnnotation__Group_6__08618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__TypedKeyStringValueAnnotation__Group_6__0__Impl8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__18677 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2_in_rule__TypedKeyStringValueAnnotation__Group_6__18680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_1_in_rule__TypedKeyStringValueAnnotation__Group_6__1__Impl8707 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl_in_rule__TypedKeyStringValueAnnotation__Group_6__28738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__TypedKeyStringValueAnnotation__Group_6__2__Impl8766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__0__Impl_in_rule__KeyBooleanValueAnnotation__Group__08803 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1_in_rule__KeyBooleanValueAnnotation__Group__08806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__KeyBooleanValueAnnotation__Group__0__Impl8834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__1__Impl_in_rule__KeyBooleanValueAnnotation__Group__18865 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2_in_rule__KeyBooleanValueAnnotation__Group__18868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__NameAssignment_1_in_rule__KeyBooleanValueAnnotation__Group__1__Impl8895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__2__Impl_in_rule__KeyBooleanValueAnnotation__Group__28925 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3_in_rule__KeyBooleanValueAnnotation__Group__28928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__ValueAssignment_2_in_rule__KeyBooleanValueAnnotation__Group__2__Impl8955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group__3__Impl_in_rule__KeyBooleanValueAnnotation__Group__38985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0_in_rule__KeyBooleanValueAnnotation__Group__3__Impl9012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__0__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__09051 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1_in_rule__KeyBooleanValueAnnotation__Group_3__09054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__KeyBooleanValueAnnotation__Group_3__0__Impl9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__1__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__19113 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2_in_rule__KeyBooleanValueAnnotation__Group_3__19116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyBooleanValueAnnotation__Group_3__1__Impl9143 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_rule__KeyBooleanValueAnnotation__Group_3__2__Impl_in_rule__KeyBooleanValueAnnotation__Group_3__29174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__KeyBooleanValueAnnotation__Group_3__2__Impl9202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__0__Impl_in_rule__KeyIntValueAnnotation__Group__09239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1_in_rule__KeyIntValueAnnotation__Group__09242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__KeyIntValueAnnotation__Group__0__Impl9270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__1__Impl_in_rule__KeyIntValueAnnotation__Group__19301 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2_in_rule__KeyIntValueAnnotation__Group__19304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__NameAssignment_1_in_rule__KeyIntValueAnnotation__Group__1__Impl9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__2__Impl_in_rule__KeyIntValueAnnotation__Group__29361 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3_in_rule__KeyIntValueAnnotation__Group__29364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__ValueAssignment_2_in_rule__KeyIntValueAnnotation__Group__2__Impl9391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group__3__Impl_in_rule__KeyIntValueAnnotation__Group__39421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0_in_rule__KeyIntValueAnnotation__Group__3__Impl9448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__0__Impl_in_rule__KeyIntValueAnnotation__Group_3__09487 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1_in_rule__KeyIntValueAnnotation__Group_3__09490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__KeyIntValueAnnotation__Group_3__0__Impl9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__1__Impl_in_rule__KeyIntValueAnnotation__Group_3__19549 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2_in_rule__KeyIntValueAnnotation__Group_3__19552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyIntValueAnnotation__Group_3__1__Impl9579 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_rule__KeyIntValueAnnotation__Group_3__2__Impl_in_rule__KeyIntValueAnnotation__Group_3__29610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__KeyIntValueAnnotation__Group_3__2__Impl9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__0__Impl_in_rule__KeyFloatValueAnnotation__Group__09675 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1_in_rule__KeyFloatValueAnnotation__Group__09678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__KeyFloatValueAnnotation__Group__0__Impl9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__1__Impl_in_rule__KeyFloatValueAnnotation__Group__19737 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2_in_rule__KeyFloatValueAnnotation__Group__19740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__NameAssignment_1_in_rule__KeyFloatValueAnnotation__Group__1__Impl9767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__2__Impl_in_rule__KeyFloatValueAnnotation__Group__29797 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3_in_rule__KeyFloatValueAnnotation__Group__29800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__ValueAssignment_2_in_rule__KeyFloatValueAnnotation__Group__2__Impl9827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group__3__Impl_in_rule__KeyFloatValueAnnotation__Group__39857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0_in_rule__KeyFloatValueAnnotation__Group__3__Impl9884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__0__Impl_in_rule__KeyFloatValueAnnotation__Group_3__09923 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1_in_rule__KeyFloatValueAnnotation__Group_3__09926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__KeyFloatValueAnnotation__Group_3__0__Impl9954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__1__Impl_in_rule__KeyFloatValueAnnotation__Group_3__19985 = new BitSet(new long[]{0x0000102000000100L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2_in_rule__KeyFloatValueAnnotation__Group_3__19988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_1_in_rule__KeyFloatValueAnnotation__Group_3__1__Impl10015 = new BitSet(new long[]{0x0000100000000102L});
    public static final BitSet FOLLOW_rule__KeyFloatValueAnnotation__Group_3__2__Impl_in_rule__KeyFloatValueAnnotation__Group_3__210046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__KeyFloatValueAnnotation__Group_3__2__Impl10074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__0__Impl_in_rule__ExtendedID__Group__010112 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1_in_rule__ExtendedID__Group__010115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group__0__Impl10142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group__1__Impl_in_rule__ExtendedID__Group__110171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0_in_rule__ExtendedID__Group__1__Impl10198 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__0__Impl_in_rule__ExtendedID__Group_1__010233 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1_in_rule__ExtendedID__Group_1__010236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ExtendedID__Group_1__0__Impl10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ExtendedID__Group_1__1__Impl_in_rule__ExtendedID__Group_1__110295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ExtendedID__Group_1__1__Impl10322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Model__NameAssignment_110360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePackage_in_rule__Model__PackagesAssignment_210391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_310422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAspect_in_rule__Model__AspectsAssignment_410453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_rule__Import__ImportedNamespaceAssignment_110484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Package__NameAssignment_110515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Package__PackageAssignment_210550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__Aspect__AnnotationAssignment_010585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuery_in_rule__Aspect__QueryAssignment_210616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollector_in_rule__Aspect__CollectorsAssignment_410647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__Query__LocationAssignment_010678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ModifierAssignment_1_0_010713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__ReturnTypeAssignment_1_1_010752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Query__MethodAssignment_1_210791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_410826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterPattern_in_rule__Query__ParameterAssignment_1_5_110857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ModifierAssignment_010892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__TypeAssignment_110931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ParameterPattern__ParameterAssignment_210970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__LocationQuery__NodeAssignment_011005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__LocationQuery__SpecializationAssignment_1_111036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamQuery_in_rule__Node__ParameterAssignment_111067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParamCompare_in_rule__ParamQuery__QueriesAssignment_111098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__LeftAssignment_011129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOperator_in_rule__ParamCompare__OperatorAssignment_1_011160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__ParamCompare__RightAssignment_1_111191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__FloatValue__ValueAssignment11222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntValue__ValueAssignment11253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__ValueAssignment11284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocationQuery_in_rule__ReferenceValue__QueryAssignment_011315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_rule__ReferenceValue__ParameterAssignment_111346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__RuntimeProperty__ReferenceAssignment_111377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReflectionFunction_in_rule__ReflectionProperty__FunctionAssignment_111408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ContainerNode__ContainerAssignment11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertionPoint_in_rule__Collector__InsertionPointAssignment_011478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Collector__TypeAssignment_111513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_011548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rule__Collector__InitializationsAssignment_3_1_111579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_COMMENT_ANNOTATION_in_rule__CommentAnnotation__ValueAssignment11610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__TagAnnotation__NameAssignment_111641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TagAnnotation__AnnotationsAssignment_2_111672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyStringValueAnnotation__NameAssignment_111703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__KeyStringValueAnnotation__ValueAssignment_211734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyStringValueAnnotation__AnnotationsAssignment_3_111765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__NameAssignment_111796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__TypedKeyStringValueAnnotation__TypeAssignment_311827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEString_in_rule__TypedKeyStringValueAnnotation__ValueAssignment_511858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__TypedKeyStringValueAnnotation__AnnotationsAssignment_6_111889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyBooleanValueAnnotation__NameAssignment_111920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__KeyBooleanValueAnnotation__ValueAssignment_211951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyBooleanValueAnnotation__AnnotationsAssignment_3_111982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyIntValueAnnotation__NameAssignment_112013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__KeyIntValueAnnotation__ValueAssignment_212044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyIntValueAnnotation__AnnotationsAssignment_3_112075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtendedID_in_rule__KeyFloatValueAnnotation__NameAssignment_112106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_FLOAT_in_rule__KeyFloatValueAnnotation__ValueAssignment_212137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__KeyFloatValueAnnotation__AnnotationsAssignment_3_112168 = new BitSet(new long[]{0x0000000000000002L});

}
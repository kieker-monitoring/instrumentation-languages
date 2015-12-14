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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'include'", "'exclude'", "'&&'", "'||'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'classname'", "'return-type'", "'before'", "'after'", "'package'", "'import'", "'use'", "'on'", "'.'", "'aspect'", "':'", "','", "'('", "')'", "'advice'", "'{'", "'}'", "'pointcut'", "'class'", "'operation'", "'@'", "'['", "']'", "'#'", "'$'", "'**'", "'<<'", "'type'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_NUMBER=8;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=6;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalAspectLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAspectLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAspectLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAspectLang.g"; }


     
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




    // $ANTLR start "entryRuleAspectModel"
    // InternalAspectLang.g:61:1: entryRuleAspectModel : ruleAspectModel EOF ;
    public final void entryRuleAspectModel() throws RecognitionException {
        try {
            // InternalAspectLang.g:62:1: ( ruleAspectModel EOF )
            // InternalAspectLang.g:63:1: ruleAspectModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAspectModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAspectModel"


    // $ANTLR start "ruleAspectModel"
    // InternalAspectLang.g:70:1: ruleAspectModel : ( ( rule__AspectModel__Group__0 ) ) ;
    public final void ruleAspectModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:74:2: ( ( ( rule__AspectModel__Group__0 ) ) )
            // InternalAspectLang.g:75:1: ( ( rule__AspectModel__Group__0 ) )
            {
            // InternalAspectLang.g:75:1: ( ( rule__AspectModel__Group__0 ) )
            // InternalAspectLang.g:76:1: ( rule__AspectModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getGroup()); 
            }
            // InternalAspectLang.g:77:1: ( rule__AspectModel__Group__0 )
            // InternalAspectLang.g:77:2: rule__AspectModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AspectModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAspectModel"


    // $ANTLR start "entryRuleImport"
    // InternalAspectLang.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalAspectLang.g:90:1: ( ruleImport EOF )
            // InternalAspectLang.g:91:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalAspectLang.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalAspectLang.g:103:1: ( ( rule__Import__Group__0 ) )
            // InternalAspectLang.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalAspectLang.g:105:1: ( rule__Import__Group__0 )
            // InternalAspectLang.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleApplicationModel"
    // InternalAspectLang.g:117:1: entryRuleApplicationModel : ruleApplicationModel EOF ;
    public final void entryRuleApplicationModel() throws RecognitionException {
        try {
            // InternalAspectLang.g:118:1: ( ruleApplicationModel EOF )
            // InternalAspectLang.g:119:1: ruleApplicationModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleApplicationModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:126:1: ruleApplicationModel : ( ( rule__ApplicationModel__Group__0 ) ) ;
    public final void ruleApplicationModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:130:2: ( ( ( rule__ApplicationModel__Group__0 ) ) )
            // InternalAspectLang.g:131:1: ( ( rule__ApplicationModel__Group__0 ) )
            {
            // InternalAspectLang.g:131:1: ( ( rule__ApplicationModel__Group__0 ) )
            // InternalAspectLang.g:132:1: ( rule__ApplicationModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getGroup()); 
            }
            // InternalAspectLang.g:133:1: ( rule__ApplicationModel__Group__0 )
            // InternalAspectLang.g:133:2: rule__ApplicationModel__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:145:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAspectLang.g:146:1: ( ruleQualifiedName EOF )
            // InternalAspectLang.g:147:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:154:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:158:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAspectLang.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAspectLang.g:159:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAspectLang.g:160:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalAspectLang.g:161:1: ( rule__QualifiedName__Group__0 )
            // InternalAspectLang.g:161:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:173:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalAspectLang.g:174:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalAspectLang.g:175:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:182:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:186:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalAspectLang.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalAspectLang.g:187:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalAspectLang.g:188:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalAspectLang.g:189:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalAspectLang.g:189:2: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:201:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // InternalAspectLang.g:202:1: ( ruleAspect EOF )
            // InternalAspectLang.g:203:1: ruleAspect EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:210:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:214:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // InternalAspectLang.g:215:1: ( ( rule__Aspect__Group__0 ) )
            {
            // InternalAspectLang.g:215:1: ( ( rule__Aspect__Group__0 ) )
            // InternalAspectLang.g:216:1: ( rule__Aspect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup()); 
            }
            // InternalAspectLang.g:217:1: ( rule__Aspect__Group__0 )
            // InternalAspectLang.g:217:2: rule__Aspect__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleUtilizeAdvice"
    // InternalAspectLang.g:229:1: entryRuleUtilizeAdvice : ruleUtilizeAdvice EOF ;
    public final void entryRuleUtilizeAdvice() throws RecognitionException {
        try {
            // InternalAspectLang.g:230:1: ( ruleUtilizeAdvice EOF )
            // InternalAspectLang.g:231:1: ruleUtilizeAdvice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUtilizeAdvice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleUtilizeAdvice"


    // $ANTLR start "ruleUtilizeAdvice"
    // InternalAspectLang.g:238:1: ruleUtilizeAdvice : ( ( rule__UtilizeAdvice__Group__0 ) ) ;
    public final void ruleUtilizeAdvice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:242:2: ( ( ( rule__UtilizeAdvice__Group__0 ) ) )
            // InternalAspectLang.g:243:1: ( ( rule__UtilizeAdvice__Group__0 ) )
            {
            // InternalAspectLang.g:243:1: ( ( rule__UtilizeAdvice__Group__0 ) )
            // InternalAspectLang.g:244:1: ( rule__UtilizeAdvice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup()); 
            }
            // InternalAspectLang.g:245:1: ( rule__UtilizeAdvice__Group__0 )
            // InternalAspectLang.g:245:2: rule__UtilizeAdvice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUtilizeAdvice"


    // $ANTLR start "entryRuleAdvice"
    // InternalAspectLang.g:257:1: entryRuleAdvice : ruleAdvice EOF ;
    public final void entryRuleAdvice() throws RecognitionException {
        try {
            // InternalAspectLang.g:258:1: ( ruleAdvice EOF )
            // InternalAspectLang.g:259:1: ruleAdvice EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdvice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAdvice"


    // $ANTLR start "ruleAdvice"
    // InternalAspectLang.g:266:1: ruleAdvice : ( ( rule__Advice__Group__0 ) ) ;
    public final void ruleAdvice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:270:2: ( ( ( rule__Advice__Group__0 ) ) )
            // InternalAspectLang.g:271:1: ( ( rule__Advice__Group__0 ) )
            {
            // InternalAspectLang.g:271:1: ( ( rule__Advice__Group__0 ) )
            // InternalAspectLang.g:272:1: ( rule__Advice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup()); 
            }
            // InternalAspectLang.g:273:1: ( rule__Advice__Group__0 )
            // InternalAspectLang.g:273:2: rule__Advice__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Advice__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdvice"


    // $ANTLR start "entryRuleParameterDeclaration"
    // InternalAspectLang.g:285:1: entryRuleParameterDeclaration : ruleParameterDeclaration EOF ;
    public final void entryRuleParameterDeclaration() throws RecognitionException {
        try {
            // InternalAspectLang.g:286:1: ( ruleParameterDeclaration EOF )
            // InternalAspectLang.g:287:1: ruleParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameterDeclaration"


    // $ANTLR start "ruleParameterDeclaration"
    // InternalAspectLang.g:294:1: ruleParameterDeclaration : ( ( rule__ParameterDeclaration__Group__0 ) ) ;
    public final void ruleParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:298:2: ( ( ( rule__ParameterDeclaration__Group__0 ) ) )
            // InternalAspectLang.g:299:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            {
            // InternalAspectLang.g:299:1: ( ( rule__ParameterDeclaration__Group__0 ) )
            // InternalAspectLang.g:300:1: ( rule__ParameterDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            }
            // InternalAspectLang.g:301:1: ( rule__ParameterDeclaration__Group__0 )
            // InternalAspectLang.g:301:2: rule__ParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDeclaration"


    // $ANTLR start "entryRulePointcut"
    // InternalAspectLang.g:313:1: entryRulePointcut : rulePointcut EOF ;
    public final void entryRulePointcut() throws RecognitionException {
        try {
            // InternalAspectLang.g:314:1: ( rulePointcut EOF )
            // InternalAspectLang.g:315:1: rulePointcut EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePointcut();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulePointcut"


    // $ANTLR start "rulePointcut"
    // InternalAspectLang.g:322:1: rulePointcut : ( ( rule__Pointcut__Group__0 ) ) ;
    public final void rulePointcut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:326:2: ( ( ( rule__Pointcut__Group__0 ) ) )
            // InternalAspectLang.g:327:1: ( ( rule__Pointcut__Group__0 ) )
            {
            // InternalAspectLang.g:327:1: ( ( rule__Pointcut__Group__0 ) )
            // InternalAspectLang.g:328:1: ( rule__Pointcut__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup()); 
            }
            // InternalAspectLang.g:329:1: ( rule__Pointcut__Group__0 )
            // InternalAspectLang.g:329:2: rule__Pointcut__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePointcut"


    // $ANTLR start "entryRuleAnnotation"
    // InternalAspectLang.g:341:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalAspectLang.g:342:1: ( ruleAnnotation EOF )
            // InternalAspectLang.g:343:1: ruleAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:350:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:354:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalAspectLang.g:355:1: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalAspectLang.g:355:1: ( ( rule__Annotation__Group__0 ) )
            // InternalAspectLang.g:356:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // InternalAspectLang.g:357:1: ( rule__Annotation__Group__0 )
            // InternalAspectLang.g:357:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleMethodQuery"
    // InternalAspectLang.g:369:1: entryRuleMethodQuery : ruleMethodQuery EOF ;
    public final void entryRuleMethodQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:370:1: ( ruleMethodQuery EOF )
            // InternalAspectLang.g:371:1: ruleMethodQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMethodQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleMethodQuery"


    // $ANTLR start "ruleMethodQuery"
    // InternalAspectLang.g:378:1: ruleMethodQuery : ( ( rule__MethodQuery__Group__0 ) ) ;
    public final void ruleMethodQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:382:2: ( ( ( rule__MethodQuery__Group__0 ) ) )
            // InternalAspectLang.g:383:1: ( ( rule__MethodQuery__Group__0 ) )
            {
            // InternalAspectLang.g:383:1: ( ( rule__MethodQuery__Group__0 ) )
            // InternalAspectLang.g:384:1: ( rule__MethodQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:385:1: ( rule__MethodQuery__Group__0 )
            // InternalAspectLang.g:385:2: rule__MethodQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMethodQuery"


    // $ANTLR start "entryRuleParameterQuery"
    // InternalAspectLang.g:397:1: entryRuleParameterQuery : ruleParameterQuery EOF ;
    public final void entryRuleParameterQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:398:1: ( ruleParameterQuery EOF )
            // InternalAspectLang.g:399:1: ruleParameterQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParameterQuery"


    // $ANTLR start "ruleParameterQuery"
    // InternalAspectLang.g:406:1: ruleParameterQuery : ( ( rule__ParameterQuery__Group__0 ) ) ;
    public final void ruleParameterQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:410:2: ( ( ( rule__ParameterQuery__Group__0 ) ) )
            // InternalAspectLang.g:411:1: ( ( rule__ParameterQuery__Group__0 ) )
            {
            // InternalAspectLang.g:411:1: ( ( rule__ParameterQuery__Group__0 ) )
            // InternalAspectLang.g:412:1: ( rule__ParameterQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:413:1: ( rule__ParameterQuery__Group__0 )
            // InternalAspectLang.g:413:2: rule__ParameterQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterQuery"


    // $ANTLR start "entryRuleLocationQuery"
    // InternalAspectLang.g:425:1: entryRuleLocationQuery : ruleLocationQuery EOF ;
    public final void entryRuleLocationQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:426:1: ( ruleLocationQuery EOF )
            // InternalAspectLang.g:427:1: ruleLocationQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:434:1: ruleLocationQuery : ( ( rule__LocationQuery__Group__0 ) ) ;
    public final void ruleLocationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:438:2: ( ( ( rule__LocationQuery__Group__0 ) ) )
            // InternalAspectLang.g:439:1: ( ( rule__LocationQuery__Group__0 ) )
            {
            // InternalAspectLang.g:439:1: ( ( rule__LocationQuery__Group__0 ) )
            // InternalAspectLang.g:440:1: ( rule__LocationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:441:1: ( rule__LocationQuery__Group__0 )
            // InternalAspectLang.g:441:2: rule__LocationQuery__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleCompositionQuery"
    // InternalAspectLang.g:453:1: entryRuleCompositionQuery : ruleCompositionQuery EOF ;
    public final void entryRuleCompositionQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:454:1: ( ruleCompositionQuery EOF )
            // InternalAspectLang.g:455:1: ruleCompositionQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCompositionQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleCompositionQuery"


    // $ANTLR start "ruleCompositionQuery"
    // InternalAspectLang.g:462:1: ruleCompositionQuery : ( ( rule__CompositionQuery__Group__0 ) ) ;
    public final void ruleCompositionQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:466:2: ( ( ( rule__CompositionQuery__Group__0 ) ) )
            // InternalAspectLang.g:467:1: ( ( rule__CompositionQuery__Group__0 ) )
            {
            // InternalAspectLang.g:467:1: ( ( rule__CompositionQuery__Group__0 ) )
            // InternalAspectLang.g:468:1: ( rule__CompositionQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:469:1: ( rule__CompositionQuery__Group__0 )
            // InternalAspectLang.g:469:2: rule__CompositionQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompositionQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositionQuery"


    // $ANTLR start "entryRuleNode"
    // InternalAspectLang.g:481:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:482:1: ( ruleNode EOF )
            // InternalAspectLang.g:483:1: ruleNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:490:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:494:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalAspectLang.g:495:1: ( ( rule__Node__Group__0 ) )
            {
            // InternalAspectLang.g:495:1: ( ( rule__Node__Group__0 ) )
            // InternalAspectLang.g:496:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:497:1: ( rule__Node__Group__0 )
            // InternalAspectLang.g:497:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:509:1: entryRuleParamQuery : ruleParamQuery EOF ;
    public final void entryRuleParamQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:510:1: ( ruleParamQuery EOF )
            // InternalAspectLang.g:511:1: ruleParamQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParamQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:518:1: ruleParamQuery : ( ( rule__ParamQuery__Group__0 ) ) ;
    public final void ruleParamQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:522:2: ( ( ( rule__ParamQuery__Group__0 ) ) )
            // InternalAspectLang.g:523:1: ( ( rule__ParamQuery__Group__0 ) )
            {
            // InternalAspectLang.g:523:1: ( ( rule__ParamQuery__Group__0 ) )
            // InternalAspectLang.g:524:1: ( rule__ParamQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:525:1: ( rule__ParamQuery__Group__0 )
            // InternalAspectLang.g:525:2: rule__ParamQuery__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleParamOperator"
    // InternalAspectLang.g:537:1: entryRuleParamOperator : ruleParamOperator EOF ;
    public final void entryRuleParamOperator() throws RecognitionException {
        try {
            // InternalAspectLang.g:538:1: ( ruleParamOperator EOF )
            // InternalAspectLang.g:539:1: ruleParamOperator EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParamOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleParamOperator"


    // $ANTLR start "ruleParamOperator"
    // InternalAspectLang.g:546:1: ruleParamOperator : ( ( rule__ParamOperator__Group__0 ) ) ;
    public final void ruleParamOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:550:2: ( ( ( rule__ParamOperator__Group__0 ) ) )
            // InternalAspectLang.g:551:1: ( ( rule__ParamOperator__Group__0 ) )
            {
            // InternalAspectLang.g:551:1: ( ( rule__ParamOperator__Group__0 ) )
            // InternalAspectLang.g:552:1: ( rule__ParamOperator__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorAccess().getGroup()); 
            }
            // InternalAspectLang.g:553:1: ( rule__ParamOperator__Group__0 )
            // InternalAspectLang.g:553:2: rule__ParamOperator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamOperator__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamOperator"


    // $ANTLR start "entryRuleParamCompare"
    // InternalAspectLang.g:565:1: entryRuleParamCompare : ruleParamCompare EOF ;
    public final void entryRuleParamCompare() throws RecognitionException {
        try {
            // InternalAspectLang.g:566:1: ( ruleParamCompare EOF )
            // InternalAspectLang.g:567:1: ruleParamCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParamCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:574:1: ruleParamCompare : ( ( rule__ParamCompare__Group__0 ) ) ;
    public final void ruleParamCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:578:2: ( ( ( rule__ParamCompare__Group__0 ) ) )
            // InternalAspectLang.g:579:1: ( ( rule__ParamCompare__Group__0 ) )
            {
            // InternalAspectLang.g:579:1: ( ( rule__ParamCompare__Group__0 ) )
            // InternalAspectLang.g:580:1: ( rule__ParamCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup()); 
            }
            // InternalAspectLang.g:581:1: ( rule__ParamCompare__Group__0 )
            // InternalAspectLang.g:581:2: rule__ParamCompare__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:593:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAspectLang.g:594:1: ( ruleValue EOF )
            // InternalAspectLang.g:595:1: ruleValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:602:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:606:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAspectLang.g:607:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalAspectLang.g:607:1: ( ( rule__Value__Alternatives ) )
            // InternalAspectLang.g:608:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:609:1: ( rule__Value__Alternatives )
            // InternalAspectLang.g:609:2: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:621:1: entryRuleFloatValue : ruleFloatValue EOF ;
    public final void entryRuleFloatValue() throws RecognitionException {
        try {
            // InternalAspectLang.g:622:1: ( ruleFloatValue EOF )
            // InternalAspectLang.g:623:1: ruleFloatValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFloatValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:630:1: ruleFloatValue : ( ( rule__FloatValue__ValueAssignment ) ) ;
    public final void ruleFloatValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:634:2: ( ( ( rule__FloatValue__ValueAssignment ) ) )
            // InternalAspectLang.g:635:1: ( ( rule__FloatValue__ValueAssignment ) )
            {
            // InternalAspectLang.g:635:1: ( ( rule__FloatValue__ValueAssignment ) )
            // InternalAspectLang.g:636:1: ( rule__FloatValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:637:1: ( rule__FloatValue__ValueAssignment )
            // InternalAspectLang.g:637:2: rule__FloatValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:649:1: entryRuleIntValue : ruleIntValue EOF ;
    public final void entryRuleIntValue() throws RecognitionException {
        try {
            // InternalAspectLang.g:650:1: ( ruleIntValue EOF )
            // InternalAspectLang.g:651:1: ruleIntValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:658:1: ruleIntValue : ( ( rule__IntValue__ValueAssignment ) ) ;
    public final void ruleIntValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:662:2: ( ( ( rule__IntValue__ValueAssignment ) ) )
            // InternalAspectLang.g:663:1: ( ( rule__IntValue__ValueAssignment ) )
            {
            // InternalAspectLang.g:663:1: ( ( rule__IntValue__ValueAssignment ) )
            // InternalAspectLang.g:664:1: ( rule__IntValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:665:1: ( rule__IntValue__ValueAssignment )
            // InternalAspectLang.g:665:2: rule__IntValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:677:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // InternalAspectLang.g:678:1: ( ruleStringValue EOF )
            // InternalAspectLang.g:679:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:686:1: ruleStringValue : ( ( rule__StringValue__ValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:690:2: ( ( ( rule__StringValue__ValueAssignment ) ) )
            // InternalAspectLang.g:691:1: ( ( rule__StringValue__ValueAssignment ) )
            {
            // InternalAspectLang.g:691:1: ( ( rule__StringValue__ValueAssignment ) )
            // InternalAspectLang.g:692:1: ( rule__StringValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:693:1: ( rule__StringValue__ValueAssignment )
            // InternalAspectLang.g:693:2: rule__StringValue__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:705:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // InternalAspectLang.g:706:1: ( ruleReferenceValue EOF )
            // InternalAspectLang.g:707:1: ruleReferenceValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReferenceValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:714:1: ruleReferenceValue : ( ( rule__ReferenceValue__Group__0 ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:718:2: ( ( ( rule__ReferenceValue__Group__0 ) ) )
            // InternalAspectLang.g:719:1: ( ( rule__ReferenceValue__Group__0 ) )
            {
            // InternalAspectLang.g:719:1: ( ( rule__ReferenceValue__Group__0 ) )
            // InternalAspectLang.g:720:1: ( rule__ReferenceValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getGroup()); 
            }
            // InternalAspectLang.g:721:1: ( rule__ReferenceValue__Group__0 )
            // InternalAspectLang.g:721:2: rule__ReferenceValue__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:733:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalAspectLang.g:734:1: ( ruleParameter EOF )
            // InternalAspectLang.g:735:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:742:1: ruleParameter : ( ( rule__Parameter__Alternatives ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:746:2: ( ( ( rule__Parameter__Alternatives ) ) )
            // InternalAspectLang.g:747:1: ( ( rule__Parameter__Alternatives ) )
            {
            // InternalAspectLang.g:747:1: ( ( rule__Parameter__Alternatives ) )
            // InternalAspectLang.g:748:1: ( rule__Parameter__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:749:1: ( rule__Parameter__Alternatives )
            // InternalAspectLang.g:749:2: rule__Parameter__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:761:1: entryRuleInternalFunctionProperty : ruleInternalFunctionProperty EOF ;
    public final void entryRuleInternalFunctionProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:762:1: ( ruleInternalFunctionProperty EOF )
            // InternalAspectLang.g:763:1: ruleInternalFunctionProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleInternalFunctionProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getInternalFunctionPropertyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:770:1: ruleInternalFunctionProperty : ( ( rule__InternalFunctionProperty__FunctionAssignment ) ) ;
    public final void ruleInternalFunctionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:774:2: ( ( ( rule__InternalFunctionProperty__FunctionAssignment ) ) )
            // InternalAspectLang.g:775:1: ( ( rule__InternalFunctionProperty__FunctionAssignment ) )
            {
            // InternalAspectLang.g:775:1: ( ( rule__InternalFunctionProperty__FunctionAssignment ) )
            // InternalAspectLang.g:776:1: ( rule__InternalFunctionProperty__FunctionAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionPropertyAccess().getFunctionAssignment()); 
            }
            // InternalAspectLang.g:777:1: ( rule__InternalFunctionProperty__FunctionAssignment )
            // InternalAspectLang.g:777:2: rule__InternalFunctionProperty__FunctionAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:789:1: entryRuleRuntimeProperty : ruleRuntimeProperty EOF ;
    public final void entryRuleRuntimeProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:790:1: ( ruleRuntimeProperty EOF )
            // InternalAspectLang.g:791:1: ruleRuntimeProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRuntimeProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:798:1: ruleRuntimeProperty : ( ( rule__RuntimeProperty__Group__0 ) ) ;
    public final void ruleRuntimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:802:2: ( ( ( rule__RuntimeProperty__Group__0 ) ) )
            // InternalAspectLang.g:803:1: ( ( rule__RuntimeProperty__Group__0 ) )
            {
            // InternalAspectLang.g:803:1: ( ( rule__RuntimeProperty__Group__0 ) )
            // InternalAspectLang.g:804:1: ( rule__RuntimeProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getGroup()); 
            }
            // InternalAspectLang.g:805:1: ( rule__RuntimeProperty__Group__0 )
            // InternalAspectLang.g:805:2: rule__RuntimeProperty__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:817:1: entryRuleReflectionProperty : ruleReflectionProperty EOF ;
    public final void entryRuleReflectionProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:818:1: ( ruleReflectionProperty EOF )
            // InternalAspectLang.g:819:1: ruleReflectionProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleReflectionProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReflectionPropertyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:826:1: ruleReflectionProperty : ( ( rule__ReflectionProperty__Group__0 ) ) ;
    public final void ruleReflectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:830:2: ( ( ( rule__ReflectionProperty__Group__0 ) ) )
            // InternalAspectLang.g:831:1: ( ( rule__ReflectionProperty__Group__0 ) )
            {
            // InternalAspectLang.g:831:1: ( ( rule__ReflectionProperty__Group__0 ) )
            // InternalAspectLang.g:832:1: ( rule__ReflectionProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getGroup()); 
            }
            // InternalAspectLang.g:833:1: ( rule__ReflectionProperty__Group__0 )
            // InternalAspectLang.g:833:2: rule__ReflectionProperty__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:845:1: entryRuleContainerNode : ruleContainerNode EOF ;
    public final void entryRuleContainerNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:846:1: ( ruleContainerNode EOF )
            // InternalAspectLang.g:847:1: ruleContainerNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleContainerNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:854:1: ruleContainerNode : ( ( rule__ContainerNode__ContainerAssignment ) ) ;
    public final void ruleContainerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:858:2: ( ( ( rule__ContainerNode__ContainerAssignment ) ) )
            // InternalAspectLang.g:859:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            {
            // InternalAspectLang.g:859:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            // InternalAspectLang.g:860:1: ( rule__ContainerNode__ContainerAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }
            // InternalAspectLang.g:861:1: ( rule__ContainerNode__ContainerAssignment )
            // InternalAspectLang.g:861:2: rule__ContainerNode__ContainerAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:873:1: entryRuleWildcardNode : ruleWildcardNode EOF ;
    public final void entryRuleWildcardNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:874:1: ( ruleWildcardNode EOF )
            // InternalAspectLang.g:875:1: ruleWildcardNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleWildcardNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getWildcardNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:882:1: ruleWildcardNode : ( ( rule__WildcardNode__Group__0 ) ) ;
    public final void ruleWildcardNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:886:2: ( ( ( rule__WildcardNode__Group__0 ) ) )
            // InternalAspectLang.g:887:1: ( ( rule__WildcardNode__Group__0 ) )
            {
            // InternalAspectLang.g:887:1: ( ( rule__WildcardNode__Group__0 ) )
            // InternalAspectLang.g:888:1: ( rule__WildcardNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:889:1: ( rule__WildcardNode__Group__0 )
            // InternalAspectLang.g:889:2: rule__WildcardNode__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:901:1: entryRuleSubPathNode : ruleSubPathNode EOF ;
    public final void entryRuleSubPathNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:902:1: ( ruleSubPathNode EOF )
            // InternalAspectLang.g:903:1: ruleSubPathNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSubPathNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubPathNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:910:1: ruleSubPathNode : ( ( rule__SubPathNode__Group__0 ) ) ;
    public final void ruleSubPathNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:914:2: ( ( ( rule__SubPathNode__Group__0 ) ) )
            // InternalAspectLang.g:915:1: ( ( rule__SubPathNode__Group__0 ) )
            {
            // InternalAspectLang.g:915:1: ( ( rule__SubPathNode__Group__0 ) )
            // InternalAspectLang.g:916:1: ( rule__SubPathNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:917:1: ( rule__SubPathNode__Group__0 )
            // InternalAspectLang.g:917:2: rule__SubPathNode__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:929:1: entryRuleParentNode : ruleParentNode EOF ;
    public final void entryRuleParentNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:930:1: ( ruleParentNode EOF )
            // InternalAspectLang.g:931:1: ruleParentNode EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParentNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentNodeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:938:1: ruleParentNode : ( ( rule__ParentNode__Group__0 ) ) ;
    public final void ruleParentNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:942:2: ( ( ( rule__ParentNode__Group__0 ) ) )
            // InternalAspectLang.g:943:1: ( ( rule__ParentNode__Group__0 ) )
            {
            // InternalAspectLang.g:943:1: ( ( rule__ParentNode__Group__0 ) )
            // InternalAspectLang.g:944:1: ( rule__ParentNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:945:1: ( rule__ParentNode__Group__0 )
            // InternalAspectLang.g:945:2: rule__ParentNode__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:957:1: entryRuleCollector : ruleCollector EOF ;
    public final void entryRuleCollector() throws RecognitionException {
        try {
            // InternalAspectLang.g:958:1: ( ruleCollector EOF )
            // InternalAspectLang.g:959:1: ruleCollector EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCollector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:966:1: ruleCollector : ( ( rule__Collector__Group__0 ) ) ;
    public final void ruleCollector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:970:2: ( ( ( rule__Collector__Group__0 ) ) )
            // InternalAspectLang.g:971:1: ( ( rule__Collector__Group__0 ) )
            {
            // InternalAspectLang.g:971:1: ( ( rule__Collector__Group__0 ) )
            // InternalAspectLang.g:972:1: ( rule__Collector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup()); 
            }
            // InternalAspectLang.g:973:1: ( rule__Collector__Group__0 )
            // InternalAspectLang.g:973:2: rule__Collector__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleEvent"
    // InternalAspectLang.g:985:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalAspectLang.g:986:1: ( ruleEvent EOF )
            // InternalAspectLang.g:987:1: ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalAspectLang.g:994:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:998:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalAspectLang.g:999:1: ( ( rule__Event__Group__0 ) )
            {
            // InternalAspectLang.g:999:1: ( ( rule__Event__Group__0 ) )
            // InternalAspectLang.g:1000:1: ( rule__Event__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup()); 
            }
            // InternalAspectLang.g:1001:1: ( rule__Event__Group__0 )
            // InternalAspectLang.g:1001:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "ruleQueryModifier"
    // InternalAspectLang.g:1014:1: ruleQueryModifier : ( ( rule__QueryModifier__Alternatives ) ) ;
    public final void ruleQueryModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1018:1: ( ( ( rule__QueryModifier__Alternatives ) ) )
            // InternalAspectLang.g:1019:1: ( ( rule__QueryModifier__Alternatives ) )
            {
            // InternalAspectLang.g:1019:1: ( ( rule__QueryModifier__Alternatives ) )
            // InternalAspectLang.g:1020:1: ( rule__QueryModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryModifierAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1021:1: ( rule__QueryModifier__Alternatives )
            // InternalAspectLang.g:1021:2: rule__QueryModifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__QueryModifier__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQueryModifierAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryModifier"


    // $ANTLR start "ruleLogicOperator"
    // InternalAspectLang.g:1033:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1037:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // InternalAspectLang.g:1038:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // InternalAspectLang.g:1038:1: ( ( rule__LogicOperator__Alternatives ) )
            // InternalAspectLang.g:1039:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1040:1: ( rule__LogicOperator__Alternatives )
            // InternalAspectLang.g:1040:2: rule__LogicOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicOperator"


    // $ANTLR start "ruleInternalFunction"
    // InternalAspectLang.g:1052:1: ruleInternalFunction : ( ( rule__InternalFunction__Alternatives ) ) ;
    public final void ruleInternalFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1056:1: ( ( ( rule__InternalFunction__Alternatives ) ) )
            // InternalAspectLang.g:1057:1: ( ( rule__InternalFunction__Alternatives ) )
            {
            // InternalAspectLang.g:1057:1: ( ( rule__InternalFunction__Alternatives ) )
            // InternalAspectLang.g:1058:1: ( rule__InternalFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1059:1: ( rule__InternalFunction__Alternatives )
            // InternalAspectLang.g:1059:2: rule__InternalFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1071:1: ruleReflectionFunction : ( ( rule__ReflectionFunction__Alternatives ) ) ;
    public final void ruleReflectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1075:1: ( ( ( rule__ReflectionFunction__Alternatives ) ) )
            // InternalAspectLang.g:1076:1: ( ( rule__ReflectionFunction__Alternatives ) )
            {
            // InternalAspectLang.g:1076:1: ( ( rule__ReflectionFunction__Alternatives ) )
            // InternalAspectLang.g:1077:1: ( rule__ReflectionFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1078:1: ( rule__ReflectionFunction__Alternatives )
            // InternalAspectLang.g:1078:2: rule__ReflectionFunction__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "ruleInsertionPoint"
    // InternalAspectLang.g:1092:1: ruleInsertionPoint : ( ( rule__InsertionPoint__Alternatives ) ) ;
    public final void ruleInsertionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1096:1: ( ( ( rule__InsertionPoint__Alternatives ) ) )
            // InternalAspectLang.g:1097:1: ( ( rule__InsertionPoint__Alternatives ) )
            {
            // InternalAspectLang.g:1097:1: ( ( rule__InsertionPoint__Alternatives ) )
            // InternalAspectLang.g:1098:1: ( rule__InsertionPoint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1099:1: ( rule__InsertionPoint__Alternatives )
            // InternalAspectLang.g:1099:2: rule__InsertionPoint__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__AspectModel__Alternatives_4"
    // InternalAspectLang.g:1110:1: rule__AspectModel__Alternatives_4 : ( ( ( rule__AspectModel__AdvicesAssignment_4_0 ) ) | ( ( rule__AspectModel__PointcutsAssignment_4_1 ) ) | ( ( rule__AspectModel__AspectsAssignment_4_2 ) ) );
    public final void rule__AspectModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1114:1: ( ( ( rule__AspectModel__AdvicesAssignment_4_0 ) ) | ( ( rule__AspectModel__PointcutsAssignment_4_1 ) ) | ( ( rule__AspectModel__AspectsAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt1=1;
                }
                break;
            case 40:
            case 43:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
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
                    // InternalAspectLang.g:1115:1: ( ( rule__AspectModel__AdvicesAssignment_4_0 ) )
                    {
                    // InternalAspectLang.g:1115:1: ( ( rule__AspectModel__AdvicesAssignment_4_0 ) )
                    // InternalAspectLang.g:1116:1: ( rule__AspectModel__AdvicesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getAdvicesAssignment_4_0()); 
                    }
                    // InternalAspectLang.g:1117:1: ( rule__AspectModel__AdvicesAssignment_4_0 )
                    // InternalAspectLang.g:1117:2: rule__AspectModel__AdvicesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AspectModel__AdvicesAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectModelAccess().getAdvicesAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1121:6: ( ( rule__AspectModel__PointcutsAssignment_4_1 ) )
                    {
                    // InternalAspectLang.g:1121:6: ( ( rule__AspectModel__PointcutsAssignment_4_1 ) )
                    // InternalAspectLang.g:1122:1: ( rule__AspectModel__PointcutsAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getPointcutsAssignment_4_1()); 
                    }
                    // InternalAspectLang.g:1123:1: ( rule__AspectModel__PointcutsAssignment_4_1 )
                    // InternalAspectLang.g:1123:2: rule__AspectModel__PointcutsAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AspectModel__PointcutsAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectModelAccess().getPointcutsAssignment_4_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1127:6: ( ( rule__AspectModel__AspectsAssignment_4_2 ) )
                    {
                    // InternalAspectLang.g:1127:6: ( ( rule__AspectModel__AspectsAssignment_4_2 ) )
                    // InternalAspectLang.g:1128:1: ( rule__AspectModel__AspectsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getAspectsAssignment_4_2()); 
                    }
                    // InternalAspectLang.g:1129:1: ( rule__AspectModel__AspectsAssignment_4_2 )
                    // InternalAspectLang.g:1129:2: rule__AspectModel__AspectsAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AspectModel__AspectsAssignment_4_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAspectModelAccess().getAspectsAssignment_4_2()); 
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
    // $ANTLR end "rule__AspectModel__Alternatives_4"


    // $ANTLR start "rule__MethodQuery__Alternatives_3"
    // InternalAspectLang.g:1138:1: rule__MethodQuery__Alternatives_3 : ( ( ( rule__MethodQuery__Group_3_0__0 ) ) | ( '*' ) );
    public final void rule__MethodQuery__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1142:1: ( ( ( rule__MethodQuery__Group_3_0__0 ) ) | ( '*' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==13) ) {
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
                    // InternalAspectLang.g:1143:1: ( ( rule__MethodQuery__Group_3_0__0 ) )
                    {
                    // InternalAspectLang.g:1143:1: ( ( rule__MethodQuery__Group_3_0__0 ) )
                    // InternalAspectLang.g:1144:1: ( rule__MethodQuery__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodQueryAccess().getGroup_3_0()); 
                    }
                    // InternalAspectLang.g:1145:1: ( rule__MethodQuery__Group_3_0__0 )
                    // InternalAspectLang.g:1145:2: rule__MethodQuery__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodQuery__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodQueryAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1149:6: ( '*' )
                    {
                    // InternalAspectLang.g:1149:6: ( '*' )
                    // InternalAspectLang.g:1150:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMethodQueryAccess().getAsteriskKeyword_3_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMethodQueryAccess().getAsteriskKeyword_3_1()); 
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
    // $ANTLR end "rule__MethodQuery__Alternatives_3"


    // $ANTLR start "rule__LocationQuery__Alternatives_1"
    // InternalAspectLang.g:1162:1: rule__LocationQuery__Alternatives_1 : ( ( ( rule__LocationQuery__Group_1_0__0 ) ) | ( ( rule__LocationQuery__CompositionAssignment_1_1 ) ) );
    public final void rule__LocationQuery__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1166:1: ( ( ( rule__LocationQuery__Group_1_0__0 ) ) | ( ( rule__LocationQuery__CompositionAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=14 && LA3_0<=15)||LA3_0==38) ) {
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
                    // InternalAspectLang.g:1167:1: ( ( rule__LocationQuery__Group_1_0__0 ) )
                    {
                    // InternalAspectLang.g:1167:1: ( ( rule__LocationQuery__Group_1_0__0 ) )
                    // InternalAspectLang.g:1168:1: ( rule__LocationQuery__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationQueryAccess().getGroup_1_0()); 
                    }
                    // InternalAspectLang.g:1169:1: ( rule__LocationQuery__Group_1_0__0 )
                    // InternalAspectLang.g:1169:2: rule__LocationQuery__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocationQuery__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLocationQueryAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1173:6: ( ( rule__LocationQuery__CompositionAssignment_1_1 ) )
                    {
                    // InternalAspectLang.g:1173:6: ( ( rule__LocationQuery__CompositionAssignment_1_1 ) )
                    // InternalAspectLang.g:1174:1: ( rule__LocationQuery__CompositionAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationQueryAccess().getCompositionAssignment_1_1()); 
                    }
                    // InternalAspectLang.g:1175:1: ( rule__LocationQuery__CompositionAssignment_1_1 )
                    // InternalAspectLang.g:1175:2: rule__LocationQuery__CompositionAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocationQuery__CompositionAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLocationQueryAccess().getCompositionAssignment_1_1()); 
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
    // $ANTLR end "rule__LocationQuery__Alternatives_1"


    // $ANTLR start "rule__Node__Alternatives_0"
    // InternalAspectLang.g:1184:1: rule__Node__Alternatives_0 : ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1188:1: ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt4=1;
                }
                break;
            case 13:
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
                    // InternalAspectLang.g:1189:1: ( ruleSubPathNode )
                    {
                    // InternalAspectLang.g:1189:1: ( ruleSubPathNode )
                    // InternalAspectLang.g:1190:1: ruleSubPathNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getSubPathNodeParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1195:6: ( ruleWildcardNode )
                    {
                    // InternalAspectLang.g:1195:6: ( ruleWildcardNode )
                    // InternalAspectLang.g:1196:1: ruleWildcardNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getWildcardNodeParserRuleCall_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1201:6: ( ruleParentNode )
                    {
                    // InternalAspectLang.g:1201:6: ( ruleParentNode )
                    // InternalAspectLang.g:1202:1: ruleParentNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getParentNodeParserRuleCall_0_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1207:6: ( ruleContainerNode )
                    {
                    // InternalAspectLang.g:1207:6: ( ruleContainerNode )
                    // InternalAspectLang.g:1208:1: ruleContainerNode
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNodeAccess().getContainerNodeParserRuleCall_0_3()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1218:1: rule__Value__Alternatives : ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1222:1: ( ( ruleStringValue ) | ( ruleIntValue ) | ( ruleFloatValue ) | ( ruleReferenceValue ) )
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
            case 13:
            case 18:
            case 19:
            case 20:
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
                    // InternalAspectLang.g:1223:1: ( ruleStringValue )
                    {
                    // InternalAspectLang.g:1223:1: ( ruleStringValue )
                    // InternalAspectLang.g:1224:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1229:6: ( ruleIntValue )
                    {
                    // InternalAspectLang.g:1229:6: ( ruleIntValue )
                    // InternalAspectLang.g:1230:1: ruleIntValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getIntValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1235:6: ( ruleFloatValue )
                    {
                    // InternalAspectLang.g:1235:6: ( ruleFloatValue )
                    // InternalAspectLang.g:1236:1: ruleFloatValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getFloatValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1241:6: ( ruleReferenceValue )
                    {
                    // InternalAspectLang.g:1241:6: ( ruleReferenceValue )
                    // InternalAspectLang.g:1242:1: ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1252:1: rule__Parameter__Alternatives : ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) | ( ruleInternalFunctionProperty ) );
    public final void rule__Parameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1256:1: ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) | ( ruleInternalFunctionProperty ) )
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
            case 18:
            case 19:
            case 20:
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
                    // InternalAspectLang.g:1257:1: ( ruleRuntimeProperty )
                    {
                    // InternalAspectLang.g:1257:1: ( ruleRuntimeProperty )
                    // InternalAspectLang.g:1258:1: ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getRuntimePropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1263:6: ( ruleReflectionProperty )
                    {
                    // InternalAspectLang.g:1263:6: ( ruleReflectionProperty )
                    // InternalAspectLang.g:1264:1: ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getReflectionPropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1269:6: ( ruleInternalFunctionProperty )
                    {
                    // InternalAspectLang.g:1269:6: ( ruleInternalFunctionProperty )
                    // InternalAspectLang.g:1270:1: ruleInternalFunctionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterAccess().getInternalFunctionPropertyParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__QueryModifier__Alternatives"
    // InternalAspectLang.g:1280:1: rule__QueryModifier__Alternatives : ( ( ( 'include' ) ) | ( ( 'exclude' ) ) );
    public final void rule__QueryModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1284:1: ( ( ( 'include' ) ) | ( ( 'exclude' ) ) )
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
                    // InternalAspectLang.g:1285:1: ( ( 'include' ) )
                    {
                    // InternalAspectLang.g:1285:1: ( ( 'include' ) )
                    // InternalAspectLang.g:1286:1: ( 'include' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1287:1: ( 'include' )
                    // InternalAspectLang.g:1287:3: 'include'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1292:6: ( ( 'exclude' ) )
                    {
                    // InternalAspectLang.g:1292:6: ( ( 'exclude' ) )
                    // InternalAspectLang.g:1293:1: ( 'exclude' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryModifierAccess().getEXCLUDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1294:1: ( 'exclude' )
                    // InternalAspectLang.g:1294:3: 'exclude'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryModifierAccess().getEXCLUDEEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__QueryModifier__Alternatives"


    // $ANTLR start "rule__LogicOperator__Alternatives"
    // InternalAspectLang.g:1304:1: rule__LogicOperator__Alternatives : ( ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1308:1: ( ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
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
                    // InternalAspectLang.g:1309:1: ( ( '&&' ) )
                    {
                    // InternalAspectLang.g:1309:1: ( ( '&&' ) )
                    // InternalAspectLang.g:1310:1: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1311:1: ( '&&' )
                    // InternalAspectLang.g:1311:3: '&&'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1316:6: ( ( '||' ) )
                    {
                    // InternalAspectLang.g:1316:6: ( ( '||' ) )
                    // InternalAspectLang.g:1317:1: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1318:1: ( '||' )
                    // InternalAspectLang.g:1318:3: '||'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__LogicOperator__Alternatives"


    // $ANTLR start "rule__InternalFunction__Alternatives"
    // InternalAspectLang.g:1328:1: rule__InternalFunction__Alternatives : ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) );
    public final void rule__InternalFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1332:1: ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
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
                    // InternalAspectLang.g:1333:1: ( ( 'time' ) )
                    {
                    // InternalAspectLang.g:1333:1: ( ( 'time' ) )
                    // InternalAspectLang.g:1334:1: ( 'time' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1335:1: ( 'time' )
                    // InternalAspectLang.g:1335:3: 'time'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1340:6: ( ( 'traceId' ) )
                    {
                    // InternalAspectLang.g:1340:6: ( ( 'traceId' ) )
                    // InternalAspectLang.g:1341:1: ( 'traceId' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1342:1: ( 'traceId' )
                    // InternalAspectLang.g:1342:3: 'traceId'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1347:6: ( ( 'orderIndex' ) )
                    {
                    // InternalAspectLang.g:1347:6: ( ( 'orderIndex' ) )
                    // InternalAspectLang.g:1348:1: ( 'orderIndex' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getORDER_INDEXEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1349:1: ( 'orderIndex' )
                    // InternalAspectLang.g:1349:3: 'orderIndex'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:1359:1: rule__ReflectionFunction__Alternatives : ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'classname' ) ) | ( ( 'return-type' ) ) );
    public final void rule__ReflectionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1363:1: ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'classname' ) ) | ( ( 'return-type' ) ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt10=1;
                }
                break;
            case 22:
                {
                alt10=2;
                }
                break;
            case 23:
                {
                alt10=3;
                }
                break;
            case 24:
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
                    // InternalAspectLang.g:1364:1: ( ( 'name' ) )
                    {
                    // InternalAspectLang.g:1364:1: ( ( 'name' ) )
                    // InternalAspectLang.g:1365:1: ( 'name' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1366:1: ( 'name' )
                    // InternalAspectLang.g:1366:3: 'name'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1371:6: ( ( 'signature' ) )
                    {
                    // InternalAspectLang.g:1371:6: ( ( 'signature' ) )
                    // InternalAspectLang.g:1372:1: ( 'signature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1373:1: ( 'signature' )
                    // InternalAspectLang.g:1373:3: 'signature'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1378:6: ( ( 'classname' ) )
                    {
                    // InternalAspectLang.g:1378:6: ( ( 'classname' ) )
                    // InternalAspectLang.g:1379:1: ( 'classname' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1380:1: ( 'classname' )
                    // InternalAspectLang.g:1380:3: 'classname'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:1385:6: ( ( 'return-type' ) )
                    {
                    // InternalAspectLang.g:1385:6: ( ( 'return-type' ) )
                    // InternalAspectLang.g:1386:1: ( 'return-type' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }
                    // InternalAspectLang.g:1387:1: ( 'return-type' )
                    // InternalAspectLang.g:1387:3: 'return-type'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__InsertionPoint__Alternatives"
    // InternalAspectLang.g:1398:1: rule__InsertionPoint__Alternatives : ( ( ( 'before' ) ) | ( ( 'after' ) ) );
    public final void rule__InsertionPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1402:1: ( ( ( 'before' ) ) | ( ( 'after' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            else if ( (LA11_0==26) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalAspectLang.g:1403:1: ( ( 'before' ) )
                    {
                    // InternalAspectLang.g:1403:1: ( ( 'before' ) )
                    // InternalAspectLang.g:1404:1: ( 'before' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1405:1: ( 'before' )
                    // InternalAspectLang.g:1405:3: 'before'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1410:6: ( ( 'after' ) )
                    {
                    // InternalAspectLang.g:1410:6: ( ( 'after' ) )
                    // InternalAspectLang.g:1411:1: ( 'after' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1412:1: ( 'after' )
                    // InternalAspectLang.g:1412:3: 'after'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__AspectModel__Group__0"
    // InternalAspectLang.g:1424:1: rule__AspectModel__Group__0 : rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1 ;
    public final void rule__AspectModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1428:1: ( rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1 )
            // InternalAspectLang.g:1429:2: rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AspectModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AspectModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__0"


    // $ANTLR start "rule__AspectModel__Group__0__Impl"
    // InternalAspectLang.g:1436:1: rule__AspectModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__AspectModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1440:1: ( ( 'package' ) )
            // InternalAspectLang.g:1441:1: ( 'package' )
            {
            // InternalAspectLang.g:1441:1: ( 'package' )
            // InternalAspectLang.g:1442:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getPackageKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__0__Impl"


    // $ANTLR start "rule__AspectModel__Group__1"
    // InternalAspectLang.g:1455:1: rule__AspectModel__Group__1 : rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2 ;
    public final void rule__AspectModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1459:1: ( rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2 )
            // InternalAspectLang.g:1460:2: rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__AspectModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AspectModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__1"


    // $ANTLR start "rule__AspectModel__Group__1__Impl"
    // InternalAspectLang.g:1467:1: rule__AspectModel__Group__1__Impl : ( ( rule__AspectModel__NameAssignment_1 ) ) ;
    public final void rule__AspectModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1471:1: ( ( ( rule__AspectModel__NameAssignment_1 ) ) )
            // InternalAspectLang.g:1472:1: ( ( rule__AspectModel__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:1472:1: ( ( rule__AspectModel__NameAssignment_1 ) )
            // InternalAspectLang.g:1473:1: ( rule__AspectModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:1474:1: ( rule__AspectModel__NameAssignment_1 )
            // InternalAspectLang.g:1474:2: rule__AspectModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AspectModel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__1__Impl"


    // $ANTLR start "rule__AspectModel__Group__2"
    // InternalAspectLang.g:1484:1: rule__AspectModel__Group__2 : rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3 ;
    public final void rule__AspectModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1488:1: ( rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3 )
            // InternalAspectLang.g:1489:2: rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__AspectModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AspectModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__2"


    // $ANTLR start "rule__AspectModel__Group__2__Impl"
    // InternalAspectLang.g:1496:1: rule__AspectModel__Group__2__Impl : ( ( rule__AspectModel__ImportsAssignment_2 )* ) ;
    public final void rule__AspectModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1500:1: ( ( ( rule__AspectModel__ImportsAssignment_2 )* ) )
            // InternalAspectLang.g:1501:1: ( ( rule__AspectModel__ImportsAssignment_2 )* )
            {
            // InternalAspectLang.g:1501:1: ( ( rule__AspectModel__ImportsAssignment_2 )* )
            // InternalAspectLang.g:1502:1: ( rule__AspectModel__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getImportsAssignment_2()); 
            }
            // InternalAspectLang.g:1503:1: ( rule__AspectModel__ImportsAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalAspectLang.g:1503:2: rule__AspectModel__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AspectModel__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getImportsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__2__Impl"


    // $ANTLR start "rule__AspectModel__Group__3"
    // InternalAspectLang.g:1513:1: rule__AspectModel__Group__3 : rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4 ;
    public final void rule__AspectModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1517:1: ( rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4 )
            // InternalAspectLang.g:1518:2: rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__AspectModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AspectModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__3"


    // $ANTLR start "rule__AspectModel__Group__3__Impl"
    // InternalAspectLang.g:1525:1: rule__AspectModel__Group__3__Impl : ( ( rule__AspectModel__SourcesAssignment_3 )* ) ;
    public final void rule__AspectModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1529:1: ( ( ( rule__AspectModel__SourcesAssignment_3 )* ) )
            // InternalAspectLang.g:1530:1: ( ( rule__AspectModel__SourcesAssignment_3 )* )
            {
            // InternalAspectLang.g:1530:1: ( ( rule__AspectModel__SourcesAssignment_3 )* )
            // InternalAspectLang.g:1531:1: ( rule__AspectModel__SourcesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getSourcesAssignment_3()); 
            }
            // InternalAspectLang.g:1532:1: ( rule__AspectModel__SourcesAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==29) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalAspectLang.g:1532:2: rule__AspectModel__SourcesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AspectModel__SourcesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getSourcesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__3__Impl"


    // $ANTLR start "rule__AspectModel__Group__4"
    // InternalAspectLang.g:1542:1: rule__AspectModel__Group__4 : rule__AspectModel__Group__4__Impl ;
    public final void rule__AspectModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1546:1: ( rule__AspectModel__Group__4__Impl )
            // InternalAspectLang.g:1547:2: rule__AspectModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AspectModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__4"


    // $ANTLR start "rule__AspectModel__Group__4__Impl"
    // InternalAspectLang.g:1553:1: rule__AspectModel__Group__4__Impl : ( ( rule__AspectModel__Alternatives_4 )* ) ;
    public final void rule__AspectModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1557:1: ( ( ( rule__AspectModel__Alternatives_4 )* ) )
            // InternalAspectLang.g:1558:1: ( ( rule__AspectModel__Alternatives_4 )* )
            {
            // InternalAspectLang.g:1558:1: ( ( rule__AspectModel__Alternatives_4 )* )
            // InternalAspectLang.g:1559:1: ( rule__AspectModel__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getAlternatives_4()); 
            }
            // InternalAspectLang.g:1560:1: ( rule__AspectModel__Alternatives_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32||LA14_0==37||LA14_0==40||LA14_0==43) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalAspectLang.g:1560:2: rule__AspectModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AspectModel__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalAspectLang.g:1580:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1584:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAspectLang.g:1585:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1592:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1596:1: ( ( 'import' ) )
            // InternalAspectLang.g:1597:1: ( 'import' )
            {
            // InternalAspectLang.g:1597:1: ( 'import' )
            // InternalAspectLang.g:1598:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1611:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1615:1: ( rule__Import__Group__1__Impl )
            // InternalAspectLang.g:1616:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1622:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1626:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalAspectLang.g:1627:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAspectLang.g:1627:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalAspectLang.g:1628:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalAspectLang.g:1629:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalAspectLang.g:1629:2: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__ApplicationModel__Group__0"
    // InternalAspectLang.g:1643:1: rule__ApplicationModel__Group__0 : rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1647:1: ( rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 )
            // InternalAspectLang.g:1648:2: rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ApplicationModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1655:1: rule__ApplicationModel__Group__0__Impl : ( 'use' ) ;
    public final void rule__ApplicationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1659:1: ( ( 'use' ) )
            // InternalAspectLang.g:1660:1: ( 'use' )
            {
            // InternalAspectLang.g:1660:1: ( 'use' )
            // InternalAspectLang.g:1661:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUseKeyword_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1674:1: rule__ApplicationModel__Group__1 : rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1678:1: ( rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 )
            // InternalAspectLang.g:1679:2: rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ApplicationModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1686:1: rule__ApplicationModel__Group__1__Impl : ( ( rule__ApplicationModel__HandlerAssignment_1 ) ) ;
    public final void rule__ApplicationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1690:1: ( ( ( rule__ApplicationModel__HandlerAssignment_1 ) ) )
            // InternalAspectLang.g:1691:1: ( ( rule__ApplicationModel__HandlerAssignment_1 ) )
            {
            // InternalAspectLang.g:1691:1: ( ( rule__ApplicationModel__HandlerAssignment_1 ) )
            // InternalAspectLang.g:1692:1: ( rule__ApplicationModel__HandlerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getHandlerAssignment_1()); 
            }
            // InternalAspectLang.g:1693:1: ( rule__ApplicationModel__HandlerAssignment_1 )
            // InternalAspectLang.g:1693:2: rule__ApplicationModel__HandlerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ApplicationModel__HandlerAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getHandlerAssignment_1()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:1703:1: rule__ApplicationModel__Group__2 : rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1707:1: ( rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 )
            // InternalAspectLang.g:1708:2: rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ApplicationModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1715:1: rule__ApplicationModel__Group__2__Impl : ( 'on' ) ;
    public final void rule__ApplicationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1719:1: ( ( 'on' ) )
            // InternalAspectLang.g:1720:1: ( 'on' )
            {
            // InternalAspectLang.g:1720:1: ( 'on' )
            // InternalAspectLang.g:1721:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getOnKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1734:1: rule__ApplicationModel__Group__3 : rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1738:1: ( rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 )
            // InternalAspectLang.g:1739:2: rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ApplicationModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1746:1: rule__ApplicationModel__Group__3__Impl : ( ( rule__ApplicationModel__NameAssignment_3 ) ) ;
    public final void rule__ApplicationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1750:1: ( ( ( rule__ApplicationModel__NameAssignment_3 ) ) )
            // InternalAspectLang.g:1751:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            {
            // InternalAspectLang.g:1751:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            // InternalAspectLang.g:1752:1: ( rule__ApplicationModel__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameAssignment_3()); 
            }
            // InternalAspectLang.g:1753:1: ( rule__ApplicationModel__NameAssignment_3 )
            // InternalAspectLang.g:1753:2: rule__ApplicationModel__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1763:1: rule__ApplicationModel__Group__4 : rule__ApplicationModel__Group__4__Impl ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1767:1: ( rule__ApplicationModel__Group__4__Impl )
            // InternalAspectLang.g:1768:2: rule__ApplicationModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1774:1: rule__ApplicationModel__Group__4__Impl : ( ( rule__ApplicationModel__ModelAssignment_4 ) ) ;
    public final void rule__ApplicationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1778:1: ( ( ( rule__ApplicationModel__ModelAssignment_4 ) ) )
            // InternalAspectLang.g:1779:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            {
            // InternalAspectLang.g:1779:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            // InternalAspectLang.g:1780:1: ( rule__ApplicationModel__ModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelAssignment_4()); 
            }
            // InternalAspectLang.g:1781:1: ( rule__ApplicationModel__ModelAssignment_4 )
            // InternalAspectLang.g:1781:2: rule__ApplicationModel__ModelAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1801:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1805:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAspectLang.g:1806:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1813:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1817:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:1818:1: ( RULE_ID )
            {
            // InternalAspectLang.g:1818:1: ( RULE_ID )
            // InternalAspectLang.g:1819:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1830:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1834:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAspectLang.g:1835:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1841:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1845:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAspectLang.g:1846:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAspectLang.g:1846:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAspectLang.g:1847:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:1848:1: ( rule__QualifiedName__Group_1__0 )*
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
            	    // InternalAspectLang.g:1848:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
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
    // InternalAspectLang.g:1862:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1866:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAspectLang.g:1867:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1874:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1878:1: ( ( ( '.' ) ) )
            // InternalAspectLang.g:1879:1: ( ( '.' ) )
            {
            // InternalAspectLang.g:1879:1: ( ( '.' ) )
            // InternalAspectLang.g:1880:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalAspectLang.g:1881:1: ( '.' )
            // InternalAspectLang.g:1882:2: '.'
            {
            match(input,31,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:1893:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1897:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAspectLang.g:1898:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1904:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1908:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:1909:1: ( RULE_ID )
            {
            // InternalAspectLang.g:1909:1: ( RULE_ID )
            // InternalAspectLang.g:1910:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1925:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1929:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAspectLang.g:1930:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1937:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1941:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:1942:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:1942:1: ( ruleQualifiedName )
            // InternalAspectLang.g:1943:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1954:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1958:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAspectLang.g:1959:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1965:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1969:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // InternalAspectLang.g:1970:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // InternalAspectLang.g:1970:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // InternalAspectLang.g:1971:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:1972:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalAspectLang.g:1972:2: rule__QualifiedNameWithWildcard__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1986:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1990:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // InternalAspectLang.g:1991:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedNameWithWildcard__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:1998:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2002:1: ( ( '.' ) )
            // InternalAspectLang.g:2003:1: ( '.' )
            {
            // InternalAspectLang.g:2003:1: ( '.' )
            // InternalAspectLang.g:2004:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2017:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2021:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // InternalAspectLang.g:2022:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:2028:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2032:1: ( ( '*' ) )
            // InternalAspectLang.g:2033:1: ( '*' )
            {
            // InternalAspectLang.g:2033:1: ( '*' )
            // InternalAspectLang.g:2034:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2051:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2055:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // InternalAspectLang.g:2056:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Aspect__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:2063:1: rule__Aspect__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2067:1: ( ( 'aspect' ) )
            // InternalAspectLang.g:2068:1: ( 'aspect' )
            {
            // InternalAspectLang.g:2068:1: ( 'aspect' )
            // InternalAspectLang.g:2069:1: 'aspect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2082:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2086:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // InternalAspectLang.g:2087:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Aspect__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:2094:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__PointcutAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2098:1: ( ( ( rule__Aspect__PointcutAssignment_1 ) ) )
            // InternalAspectLang.g:2099:1: ( ( rule__Aspect__PointcutAssignment_1 ) )
            {
            // InternalAspectLang.g:2099:1: ( ( rule__Aspect__PointcutAssignment_1 ) )
            // InternalAspectLang.g:2100:1: ( rule__Aspect__PointcutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutAssignment_1()); 
            }
            // InternalAspectLang.g:2101:1: ( rule__Aspect__PointcutAssignment_1 )
            // InternalAspectLang.g:2101:2: rule__Aspect__PointcutAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Aspect__PointcutAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getPointcutAssignment_1()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:2111:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2115:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // InternalAspectLang.g:2116:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Aspect__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:2123:1: rule__Aspect__Group__2__Impl : ( ':' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2127:1: ( ( ':' ) )
            // InternalAspectLang.g:2128:1: ( ':' )
            {
            // InternalAspectLang.g:2128:1: ( ':' )
            // InternalAspectLang.g:2129:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getColonKeyword_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getColonKeyword_2()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:2142:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2146:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // InternalAspectLang.g:2147:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Aspect__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:2154:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__AdvicesAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2158:1: ( ( ( rule__Aspect__AdvicesAssignment_3 ) ) )
            // InternalAspectLang.g:2159:1: ( ( rule__Aspect__AdvicesAssignment_3 ) )
            {
            // InternalAspectLang.g:2159:1: ( ( rule__Aspect__AdvicesAssignment_3 ) )
            // InternalAspectLang.g:2160:1: ( rule__Aspect__AdvicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesAssignment_3()); 
            }
            // InternalAspectLang.g:2161:1: ( rule__Aspect__AdvicesAssignment_3 )
            // InternalAspectLang.g:2161:2: rule__Aspect__AdvicesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Aspect__AdvicesAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAdvicesAssignment_3()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:2171:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2175:1: ( rule__Aspect__Group__4__Impl )
            // InternalAspectLang.g:2176:2: rule__Aspect__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:2182:1: rule__Aspect__Group__4__Impl : ( ( rule__Aspect__Group_4__0 )* ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2186:1: ( ( ( rule__Aspect__Group_4__0 )* ) )
            // InternalAspectLang.g:2187:1: ( ( rule__Aspect__Group_4__0 )* )
            {
            // InternalAspectLang.g:2187:1: ( ( rule__Aspect__Group_4__0 )* )
            // InternalAspectLang.g:2188:1: ( rule__Aspect__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup_4()); 
            }
            // InternalAspectLang.g:2189:1: ( rule__Aspect__Group_4__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==34) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAspectLang.g:2189:2: rule__Aspect__Group_4__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Aspect__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getGroup_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Aspect__Group_4__0"
    // InternalAspectLang.g:2209:1: rule__Aspect__Group_4__0 : rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1 ;
    public final void rule__Aspect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2213:1: ( rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1 )
            // InternalAspectLang.g:2214:2: rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Aspect__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Aspect__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group_4__0"


    // $ANTLR start "rule__Aspect__Group_4__0__Impl"
    // InternalAspectLang.g:2221:1: rule__Aspect__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Aspect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2225:1: ( ( ',' ) )
            // InternalAspectLang.g:2226:1: ( ',' )
            {
            // InternalAspectLang.g:2226:1: ( ',' )
            // InternalAspectLang.g:2227:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCommaKeyword_4_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group_4__0__Impl"


    // $ANTLR start "rule__Aspect__Group_4__1"
    // InternalAspectLang.g:2240:1: rule__Aspect__Group_4__1 : rule__Aspect__Group_4__1__Impl ;
    public final void rule__Aspect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2244:1: ( rule__Aspect__Group_4__1__Impl )
            // InternalAspectLang.g:2245:2: rule__Aspect__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Aspect__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group_4__1"


    // $ANTLR start "rule__Aspect__Group_4__1__Impl"
    // InternalAspectLang.g:2251:1: rule__Aspect__Group_4__1__Impl : ( ( rule__Aspect__AdvicesAssignment_4_1 ) ) ;
    public final void rule__Aspect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2255:1: ( ( ( rule__Aspect__AdvicesAssignment_4_1 ) ) )
            // InternalAspectLang.g:2256:1: ( ( rule__Aspect__AdvicesAssignment_4_1 ) )
            {
            // InternalAspectLang.g:2256:1: ( ( rule__Aspect__AdvicesAssignment_4_1 ) )
            // InternalAspectLang.g:2257:1: ( rule__Aspect__AdvicesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesAssignment_4_1()); 
            }
            // InternalAspectLang.g:2258:1: ( rule__Aspect__AdvicesAssignment_4_1 )
            // InternalAspectLang.g:2258:2: rule__Aspect__AdvicesAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Aspect__AdvicesAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAdvicesAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__Group_4__1__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group__0"
    // InternalAspectLang.g:2272:1: rule__UtilizeAdvice__Group__0 : rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1 ;
    public final void rule__UtilizeAdvice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2276:1: ( rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1 )
            // InternalAspectLang.g:2277:2: rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__UtilizeAdvice__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group__0"


    // $ANTLR start "rule__UtilizeAdvice__Group__0__Impl"
    // InternalAspectLang.g:2284:1: rule__UtilizeAdvice__Group__0__Impl : ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) ) ;
    public final void rule__UtilizeAdvice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2288:1: ( ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) ) )
            // InternalAspectLang.g:2289:1: ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) )
            {
            // InternalAspectLang.g:2289:1: ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) )
            // InternalAspectLang.g:2290:1: ( rule__UtilizeAdvice__AdviceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAssignment_0()); 
            }
            // InternalAspectLang.g:2291:1: ( rule__UtilizeAdvice__AdviceAssignment_0 )
            // InternalAspectLang.g:2291:2: rule__UtilizeAdvice__AdviceAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__AdviceAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getAdviceAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group__0__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group__1"
    // InternalAspectLang.g:2301:1: rule__UtilizeAdvice__Group__1 : rule__UtilizeAdvice__Group__1__Impl ;
    public final void rule__UtilizeAdvice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2305:1: ( rule__UtilizeAdvice__Group__1__Impl )
            // InternalAspectLang.g:2306:2: rule__UtilizeAdvice__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group__1"


    // $ANTLR start "rule__UtilizeAdvice__Group__1__Impl"
    // InternalAspectLang.g:2312:1: rule__UtilizeAdvice__Group__1__Impl : ( ( rule__UtilizeAdvice__Group_1__0 )? ) ;
    public final void rule__UtilizeAdvice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2316:1: ( ( ( rule__UtilizeAdvice__Group_1__0 )? ) )
            // InternalAspectLang.g:2317:1: ( ( rule__UtilizeAdvice__Group_1__0 )? )
            {
            // InternalAspectLang.g:2317:1: ( ( rule__UtilizeAdvice__Group_1__0 )? )
            // InternalAspectLang.g:2318:1: ( rule__UtilizeAdvice__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:2319:1: ( rule__UtilizeAdvice__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalAspectLang.g:2319:2: rule__UtilizeAdvice__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UtilizeAdvice__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group__1__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group_1__0"
    // InternalAspectLang.g:2333:1: rule__UtilizeAdvice__Group_1__0 : rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1 ;
    public final void rule__UtilizeAdvice__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2337:1: ( rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1 )
            // InternalAspectLang.g:2338:2: rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__UtilizeAdvice__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1__0"


    // $ANTLR start "rule__UtilizeAdvice__Group_1__0__Impl"
    // InternalAspectLang.g:2345:1: rule__UtilizeAdvice__Group_1__0__Impl : ( '(' ) ;
    public final void rule__UtilizeAdvice__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2349:1: ( ( '(' ) )
            // InternalAspectLang.g:2350:1: ( '(' )
            {
            // InternalAspectLang.g:2350:1: ( '(' )
            // InternalAspectLang.g:2351:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1__0__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group_1__1"
    // InternalAspectLang.g:2364:1: rule__UtilizeAdvice__Group_1__1 : rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2 ;
    public final void rule__UtilizeAdvice__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2368:1: ( rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2 )
            // InternalAspectLang.g:2369:2: rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2
            {
            pushFollow(FOLLOW_17);
            rule__UtilizeAdvice__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1__1"


    // $ANTLR start "rule__UtilizeAdvice__Group_1__1__Impl"
    // InternalAspectLang.g:2376:1: rule__UtilizeAdvice__Group_1__1__Impl : ( ( rule__UtilizeAdvice__Group_1_1__0 )? ) ;
    public final void rule__UtilizeAdvice__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2380:1: ( ( ( rule__UtilizeAdvice__Group_1_1__0 )? ) )
            // InternalAspectLang.g:2381:1: ( ( rule__UtilizeAdvice__Group_1_1__0 )? )
            {
            // InternalAspectLang.g:2381:1: ( ( rule__UtilizeAdvice__Group_1_1__0 )? )
            // InternalAspectLang.g:2382:1: ( rule__UtilizeAdvice__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1()); 
            }
            // InternalAspectLang.g:2383:1: ( rule__UtilizeAdvice__Group_1_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_INT)||LA19_0==13||(LA19_0>=18 && LA19_0<=20)||(LA19_0>=46 && LA19_0<=49)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalAspectLang.g:2383:2: rule__UtilizeAdvice__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UtilizeAdvice__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1__1__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group_1__2"
    // InternalAspectLang.g:2393:1: rule__UtilizeAdvice__Group_1__2 : rule__UtilizeAdvice__Group_1__2__Impl ;
    public final void rule__UtilizeAdvice__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2397:1: ( rule__UtilizeAdvice__Group_1__2__Impl )
            // InternalAspectLang.g:2398:2: rule__UtilizeAdvice__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1__2"


    // $ANTLR start "rule__UtilizeAdvice__Group_1__2__Impl"
    // InternalAspectLang.g:2404:1: rule__UtilizeAdvice__Group_1__2__Impl : ( ')' ) ;
    public final void rule__UtilizeAdvice__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2408:1: ( ( ')' ) )
            // InternalAspectLang.g:2409:1: ( ')' )
            {
            // InternalAspectLang.g:2409:1: ( ')' )
            // InternalAspectLang.g:2410:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getRightParenthesisKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1__2__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group_1_1__0"
    // InternalAspectLang.g:2429:1: rule__UtilizeAdvice__Group_1_1__0 : rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1 ;
    public final void rule__UtilizeAdvice__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2433:1: ( rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1 )
            // InternalAspectLang.g:2434:2: rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1
            {
            pushFollow(FOLLOW_14);
            rule__UtilizeAdvice__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1_1__0"


    // $ANTLR start "rule__UtilizeAdvice__Group_1_1__0__Impl"
    // InternalAspectLang.g:2441:1: rule__UtilizeAdvice__Group_1_1__0__Impl : ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) ) ;
    public final void rule__UtilizeAdvice__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2445:1: ( ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) ) )
            // InternalAspectLang.g:2446:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) )
            {
            // InternalAspectLang.g:2446:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) )
            // InternalAspectLang.g:2447:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_0()); 
            }
            // InternalAspectLang.g:2448:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 )
            // InternalAspectLang.g:2448:2: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0
            {
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1_1__0__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group_1_1__1"
    // InternalAspectLang.g:2458:1: rule__UtilizeAdvice__Group_1_1__1 : rule__UtilizeAdvice__Group_1_1__1__Impl ;
    public final void rule__UtilizeAdvice__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2462:1: ( rule__UtilizeAdvice__Group_1_1__1__Impl )
            // InternalAspectLang.g:2463:2: rule__UtilizeAdvice__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1_1__1"


    // $ANTLR start "rule__UtilizeAdvice__Group_1_1__1__Impl"
    // InternalAspectLang.g:2469:1: rule__UtilizeAdvice__Group_1_1__1__Impl : ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* ) ;
    public final void rule__UtilizeAdvice__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2473:1: ( ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* ) )
            // InternalAspectLang.g:2474:1: ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* )
            {
            // InternalAspectLang.g:2474:1: ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* )
            // InternalAspectLang.g:2475:1: ( rule__UtilizeAdvice__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1_1()); 
            }
            // InternalAspectLang.g:2476:1: ( rule__UtilizeAdvice__Group_1_1_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==34) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAspectLang.g:2476:2: rule__UtilizeAdvice__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__UtilizeAdvice__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1_1__1__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group_1_1_1__0"
    // InternalAspectLang.g:2490:1: rule__UtilizeAdvice__Group_1_1_1__0 : rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1 ;
    public final void rule__UtilizeAdvice__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2494:1: ( rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1 )
            // InternalAspectLang.g:2495:2: rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__UtilizeAdvice__Group_1_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group_1_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1_1_1__0"


    // $ANTLR start "rule__UtilizeAdvice__Group_1_1_1__0__Impl"
    // InternalAspectLang.g:2502:1: rule__UtilizeAdvice__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__UtilizeAdvice__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2506:1: ( ( ',' ) )
            // InternalAspectLang.g:2507:1: ( ',' )
            {
            // InternalAspectLang.g:2507:1: ( ',' )
            // InternalAspectLang.g:2508:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getCommaKeyword_1_1_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getCommaKeyword_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1_1_1__0__Impl"


    // $ANTLR start "rule__UtilizeAdvice__Group_1_1_1__1"
    // InternalAspectLang.g:2521:1: rule__UtilizeAdvice__Group_1_1_1__1 : rule__UtilizeAdvice__Group_1_1_1__1__Impl ;
    public final void rule__UtilizeAdvice__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2525:1: ( rule__UtilizeAdvice__Group_1_1_1__1__Impl )
            // InternalAspectLang.g:2526:2: rule__UtilizeAdvice__Group_1_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__Group_1_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1_1_1__1"


    // $ANTLR start "rule__UtilizeAdvice__Group_1_1_1__1__Impl"
    // InternalAspectLang.g:2532:1: rule__UtilizeAdvice__Group_1_1_1__1__Impl : ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) ) ;
    public final void rule__UtilizeAdvice__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2536:1: ( ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) ) )
            // InternalAspectLang.g:2537:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) )
            {
            // InternalAspectLang.g:2537:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) )
            // InternalAspectLang.g:2538:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_1_1()); 
            }
            // InternalAspectLang.g:2539:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 )
            // InternalAspectLang.g:2539:2: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__Group_1_1_1__1__Impl"


    // $ANTLR start "rule__Advice__Group__0"
    // InternalAspectLang.g:2553:1: rule__Advice__Group__0 : rule__Advice__Group__0__Impl rule__Advice__Group__1 ;
    public final void rule__Advice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2557:1: ( rule__Advice__Group__0__Impl rule__Advice__Group__1 )
            // InternalAspectLang.g:2558:2: rule__Advice__Group__0__Impl rule__Advice__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Advice__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__0"


    // $ANTLR start "rule__Advice__Group__0__Impl"
    // InternalAspectLang.g:2565:1: rule__Advice__Group__0__Impl : ( 'advice' ) ;
    public final void rule__Advice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2569:1: ( ( 'advice' ) )
            // InternalAspectLang.g:2570:1: ( 'advice' )
            {
            // InternalAspectLang.g:2570:1: ( 'advice' )
            // InternalAspectLang.g:2571:1: 'advice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getAdviceKeyword_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getAdviceKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__0__Impl"


    // $ANTLR start "rule__Advice__Group__1"
    // InternalAspectLang.g:2584:1: rule__Advice__Group__1 : rule__Advice__Group__1__Impl rule__Advice__Group__2 ;
    public final void rule__Advice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2588:1: ( rule__Advice__Group__1__Impl rule__Advice__Group__2 )
            // InternalAspectLang.g:2589:2: rule__Advice__Group__1__Impl rule__Advice__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__Advice__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__1"


    // $ANTLR start "rule__Advice__Group__1__Impl"
    // InternalAspectLang.g:2596:1: rule__Advice__Group__1__Impl : ( ( rule__Advice__NameAssignment_1 ) ) ;
    public final void rule__Advice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2600:1: ( ( ( rule__Advice__NameAssignment_1 ) ) )
            // InternalAspectLang.g:2601:1: ( ( rule__Advice__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:2601:1: ( ( rule__Advice__NameAssignment_1 ) )
            // InternalAspectLang.g:2602:1: ( rule__Advice__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:2603:1: ( rule__Advice__NameAssignment_1 )
            // InternalAspectLang.g:2603:2: rule__Advice__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Advice__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__1__Impl"


    // $ANTLR start "rule__Advice__Group__2"
    // InternalAspectLang.g:2613:1: rule__Advice__Group__2 : rule__Advice__Group__2__Impl rule__Advice__Group__3 ;
    public final void rule__Advice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2617:1: ( rule__Advice__Group__2__Impl rule__Advice__Group__3 )
            // InternalAspectLang.g:2618:2: rule__Advice__Group__2__Impl rule__Advice__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Advice__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__2"


    // $ANTLR start "rule__Advice__Group__2__Impl"
    // InternalAspectLang.g:2625:1: rule__Advice__Group__2__Impl : ( ( rule__Advice__Group_2__0 )? ) ;
    public final void rule__Advice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2629:1: ( ( ( rule__Advice__Group_2__0 )? ) )
            // InternalAspectLang.g:2630:1: ( ( rule__Advice__Group_2__0 )? )
            {
            // InternalAspectLang.g:2630:1: ( ( rule__Advice__Group_2__0 )? )
            // InternalAspectLang.g:2631:1: ( rule__Advice__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2()); 
            }
            // InternalAspectLang.g:2632:1: ( rule__Advice__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAspectLang.g:2632:2: rule__Advice__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Advice__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__2__Impl"


    // $ANTLR start "rule__Advice__Group__3"
    // InternalAspectLang.g:2642:1: rule__Advice__Group__3 : rule__Advice__Group__3__Impl rule__Advice__Group__4 ;
    public final void rule__Advice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2646:1: ( rule__Advice__Group__3__Impl rule__Advice__Group__4 )
            // InternalAspectLang.g:2647:2: rule__Advice__Group__3__Impl rule__Advice__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Advice__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__3"


    // $ANTLR start "rule__Advice__Group__3__Impl"
    // InternalAspectLang.g:2654:1: rule__Advice__Group__3__Impl : ( '{' ) ;
    public final void rule__Advice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2658:1: ( ( '{' ) )
            // InternalAspectLang.g:2659:1: ( '{' )
            {
            // InternalAspectLang.g:2659:1: ( '{' )
            // InternalAspectLang.g:2660:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__3__Impl"


    // $ANTLR start "rule__Advice__Group__4"
    // InternalAspectLang.g:2673:1: rule__Advice__Group__4 : rule__Advice__Group__4__Impl rule__Advice__Group__5 ;
    public final void rule__Advice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2677:1: ( rule__Advice__Group__4__Impl rule__Advice__Group__5 )
            // InternalAspectLang.g:2678:2: rule__Advice__Group__4__Impl rule__Advice__Group__5
            {
            pushFollow(FOLLOW_20);
            rule__Advice__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__4"


    // $ANTLR start "rule__Advice__Group__4__Impl"
    // InternalAspectLang.g:2685:1: rule__Advice__Group__4__Impl : ( ( rule__Advice__CollectorsAssignment_4 )* ) ;
    public final void rule__Advice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2689:1: ( ( ( rule__Advice__CollectorsAssignment_4 )* ) )
            // InternalAspectLang.g:2690:1: ( ( rule__Advice__CollectorsAssignment_4 )* )
            {
            // InternalAspectLang.g:2690:1: ( ( rule__Advice__CollectorsAssignment_4 )* )
            // InternalAspectLang.g:2691:1: ( rule__Advice__CollectorsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getCollectorsAssignment_4()); 
            }
            // InternalAspectLang.g:2692:1: ( rule__Advice__CollectorsAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=25 && LA22_0<=26)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalAspectLang.g:2692:2: rule__Advice__CollectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Advice__CollectorsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getCollectorsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__4__Impl"


    // $ANTLR start "rule__Advice__Group__5"
    // InternalAspectLang.g:2702:1: rule__Advice__Group__5 : rule__Advice__Group__5__Impl ;
    public final void rule__Advice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2706:1: ( rule__Advice__Group__5__Impl )
            // InternalAspectLang.g:2707:2: rule__Advice__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Advice__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__5"


    // $ANTLR start "rule__Advice__Group__5__Impl"
    // InternalAspectLang.g:2713:1: rule__Advice__Group__5__Impl : ( '}' ) ;
    public final void rule__Advice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2717:1: ( ( '}' ) )
            // InternalAspectLang.g:2718:1: ( '}' )
            {
            // InternalAspectLang.g:2718:1: ( '}' )
            // InternalAspectLang.g:2719:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group__5__Impl"


    // $ANTLR start "rule__Advice__Group_2__0"
    // InternalAspectLang.g:2744:1: rule__Advice__Group_2__0 : rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1 ;
    public final void rule__Advice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2748:1: ( rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1 )
            // InternalAspectLang.g:2749:2: rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1
            {
            pushFollow(FOLLOW_22);
            rule__Advice__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2__0"


    // $ANTLR start "rule__Advice__Group_2__0__Impl"
    // InternalAspectLang.g:2756:1: rule__Advice__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Advice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2760:1: ( ( '(' ) )
            // InternalAspectLang.g:2761:1: ( '(' )
            {
            // InternalAspectLang.g:2761:1: ( '(' )
            // InternalAspectLang.g:2762:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2__0__Impl"


    // $ANTLR start "rule__Advice__Group_2__1"
    // InternalAspectLang.g:2775:1: rule__Advice__Group_2__1 : rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2 ;
    public final void rule__Advice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2779:1: ( rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2 )
            // InternalAspectLang.g:2780:2: rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2
            {
            pushFollow(FOLLOW_22);
            rule__Advice__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2__1"


    // $ANTLR start "rule__Advice__Group_2__1__Impl"
    // InternalAspectLang.g:2787:1: rule__Advice__Group_2__1__Impl : ( ( rule__Advice__Group_2_1__0 )? ) ;
    public final void rule__Advice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2791:1: ( ( ( rule__Advice__Group_2_1__0 )? ) )
            // InternalAspectLang.g:2792:1: ( ( rule__Advice__Group_2_1__0 )? )
            {
            // InternalAspectLang.g:2792:1: ( ( rule__Advice__Group_2_1__0 )? )
            // InternalAspectLang.g:2793:1: ( rule__Advice__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2_1()); 
            }
            // InternalAspectLang.g:2794:1: ( rule__Advice__Group_2_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==50) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAspectLang.g:2794:2: rule__Advice__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Advice__Group_2_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2__1__Impl"


    // $ANTLR start "rule__Advice__Group_2__2"
    // InternalAspectLang.g:2804:1: rule__Advice__Group_2__2 : rule__Advice__Group_2__2__Impl ;
    public final void rule__Advice__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2808:1: ( rule__Advice__Group_2__2__Impl )
            // InternalAspectLang.g:2809:2: rule__Advice__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Advice__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2__2"


    // $ANTLR start "rule__Advice__Group_2__2__Impl"
    // InternalAspectLang.g:2815:1: rule__Advice__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Advice__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2819:1: ( ( ')' ) )
            // InternalAspectLang.g:2820:1: ( ')' )
            {
            // InternalAspectLang.g:2820:1: ( ')' )
            // InternalAspectLang.g:2821:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2__2__Impl"


    // $ANTLR start "rule__Advice__Group_2_1__0"
    // InternalAspectLang.g:2840:1: rule__Advice__Group_2_1__0 : rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1 ;
    public final void rule__Advice__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2844:1: ( rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1 )
            // InternalAspectLang.g:2845:2: rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1
            {
            pushFollow(FOLLOW_14);
            rule__Advice__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2_1__0"


    // $ANTLR start "rule__Advice__Group_2_1__0__Impl"
    // InternalAspectLang.g:2852:1: rule__Advice__Group_2_1__0__Impl : ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) ) ;
    public final void rule__Advice__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2856:1: ( ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) ) )
            // InternalAspectLang.g:2857:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) )
            {
            // InternalAspectLang.g:2857:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) )
            // InternalAspectLang.g:2858:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_0()); 
            }
            // InternalAspectLang.g:2859:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 )
            // InternalAspectLang.g:2859:2: rule__Advice__ParameterDeclarationsAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Advice__ParameterDeclarationsAssignment_2_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2_1__0__Impl"


    // $ANTLR start "rule__Advice__Group_2_1__1"
    // InternalAspectLang.g:2869:1: rule__Advice__Group_2_1__1 : rule__Advice__Group_2_1__1__Impl ;
    public final void rule__Advice__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2873:1: ( rule__Advice__Group_2_1__1__Impl )
            // InternalAspectLang.g:2874:2: rule__Advice__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Advice__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2_1__1"


    // $ANTLR start "rule__Advice__Group_2_1__1__Impl"
    // InternalAspectLang.g:2880:1: rule__Advice__Group_2_1__1__Impl : ( ( rule__Advice__Group_2_1_1__0 )* ) ;
    public final void rule__Advice__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2884:1: ( ( ( rule__Advice__Group_2_1_1__0 )* ) )
            // InternalAspectLang.g:2885:1: ( ( rule__Advice__Group_2_1_1__0 )* )
            {
            // InternalAspectLang.g:2885:1: ( ( rule__Advice__Group_2_1_1__0 )* )
            // InternalAspectLang.g:2886:1: ( rule__Advice__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2_1_1()); 
            }
            // InternalAspectLang.g:2887:1: ( rule__Advice__Group_2_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==34) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAspectLang.g:2887:2: rule__Advice__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Advice__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getGroup_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2_1__1__Impl"


    // $ANTLR start "rule__Advice__Group_2_1_1__0"
    // InternalAspectLang.g:2901:1: rule__Advice__Group_2_1_1__0 : rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1 ;
    public final void rule__Advice__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2905:1: ( rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1 )
            // InternalAspectLang.g:2906:2: rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1
            {
            pushFollow(FOLLOW_23);
            rule__Advice__Group_2_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Advice__Group_2_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2_1_1__0"


    // $ANTLR start "rule__Advice__Group_2_1_1__0__Impl"
    // InternalAspectLang.g:2913:1: rule__Advice__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Advice__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2917:1: ( ( ',' ) )
            // InternalAspectLang.g:2918:1: ( ',' )
            {
            // InternalAspectLang.g:2918:1: ( ',' )
            // InternalAspectLang.g:2919:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getCommaKeyword_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__Advice__Group_2_1_1__1"
    // InternalAspectLang.g:2932:1: rule__Advice__Group_2_1_1__1 : rule__Advice__Group_2_1_1__1__Impl ;
    public final void rule__Advice__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2936:1: ( rule__Advice__Group_2_1_1__1__Impl )
            // InternalAspectLang.g:2937:2: rule__Advice__Group_2_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Advice__Group_2_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2_1_1__1"


    // $ANTLR start "rule__Advice__Group_2_1_1__1__Impl"
    // InternalAspectLang.g:2943:1: rule__Advice__Group_2_1_1__1__Impl : ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) ) ;
    public final void rule__Advice__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2947:1: ( ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) ) )
            // InternalAspectLang.g:2948:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) )
            {
            // InternalAspectLang.g:2948:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) )
            // InternalAspectLang.g:2949:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_1_1()); 
            }
            // InternalAspectLang.g:2950:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 )
            // InternalAspectLang.g:2950:2: rule__Advice__ParameterDeclarationsAssignment_2_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Advice__ParameterDeclarationsAssignment_2_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__0"
    // InternalAspectLang.g:2964:1: rule__ParameterDeclaration__Group__0 : rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 ;
    public final void rule__ParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2968:1: ( rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1 )
            // InternalAspectLang.g:2969:2: rule__ParameterDeclaration__Group__0__Impl rule__ParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__0"


    // $ANTLR start "rule__ParameterDeclaration__Group__0__Impl"
    // InternalAspectLang.g:2976:1: rule__ParameterDeclaration__Group__0__Impl : ( ( rule__ParameterDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__ParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2980:1: ( ( ( rule__ParameterDeclaration__TypeAssignment_0 ) ) )
            // InternalAspectLang.g:2981:1: ( ( rule__ParameterDeclaration__TypeAssignment_0 ) )
            {
            // InternalAspectLang.g:2981:1: ( ( rule__ParameterDeclaration__TypeAssignment_0 ) )
            // InternalAspectLang.g:2982:1: ( rule__ParameterDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_0()); 
            }
            // InternalAspectLang.g:2983:1: ( rule__ParameterDeclaration__TypeAssignment_0 )
            // InternalAspectLang.g:2983:2: rule__ParameterDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclaration__Group__1"
    // InternalAspectLang.g:2993:1: rule__ParameterDeclaration__Group__1 : rule__ParameterDeclaration__Group__1__Impl ;
    public final void rule__ParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2997:1: ( rule__ParameterDeclaration__Group__1__Impl )
            // InternalAspectLang.g:2998:2: rule__ParameterDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__1"


    // $ANTLR start "rule__ParameterDeclaration__Group__1__Impl"
    // InternalAspectLang.g:3004:1: rule__ParameterDeclaration__Group__1__Impl : ( ( rule__ParameterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__ParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3008:1: ( ( ( rule__ParameterDeclaration__NameAssignment_1 ) ) )
            // InternalAspectLang.g:3009:1: ( ( rule__ParameterDeclaration__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:3009:1: ( ( rule__ParameterDeclaration__NameAssignment_1 ) )
            // InternalAspectLang.g:3010:1: ( rule__ParameterDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:3011:1: ( rule__ParameterDeclaration__NameAssignment_1 )
            // InternalAspectLang.g:3011:2: rule__ParameterDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Pointcut__Group__0"
    // InternalAspectLang.g:3025:1: rule__Pointcut__Group__0 : rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 ;
    public final void rule__Pointcut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3029:1: ( rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 )
            // InternalAspectLang.g:3030:2: rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__Pointcut__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__0"


    // $ANTLR start "rule__Pointcut__Group__0__Impl"
    // InternalAspectLang.g:3037:1: rule__Pointcut__Group__0__Impl : ( ( rule__Pointcut__AnnotationAssignment_0 )? ) ;
    public final void rule__Pointcut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3041:1: ( ( ( rule__Pointcut__AnnotationAssignment_0 )? ) )
            // InternalAspectLang.g:3042:1: ( ( rule__Pointcut__AnnotationAssignment_0 )? )
            {
            // InternalAspectLang.g:3042:1: ( ( rule__Pointcut__AnnotationAssignment_0 )? )
            // InternalAspectLang.g:3043:1: ( rule__Pointcut__AnnotationAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getAnnotationAssignment_0()); 
            }
            // InternalAspectLang.g:3044:1: ( rule__Pointcut__AnnotationAssignment_0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAspectLang.g:3044:2: rule__Pointcut__AnnotationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pointcut__AnnotationAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getAnnotationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__0__Impl"


    // $ANTLR start "rule__Pointcut__Group__1"
    // InternalAspectLang.g:3054:1: rule__Pointcut__Group__1 : rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 ;
    public final void rule__Pointcut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3058:1: ( rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 )
            // InternalAspectLang.g:3059:2: rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Pointcut__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__1"


    // $ANTLR start "rule__Pointcut__Group__1__Impl"
    // InternalAspectLang.g:3066:1: rule__Pointcut__Group__1__Impl : ( 'pointcut' ) ;
    public final void rule__Pointcut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3070:1: ( ( 'pointcut' ) )
            // InternalAspectLang.g:3071:1: ( 'pointcut' )
            {
            // InternalAspectLang.g:3071:1: ( 'pointcut' )
            // InternalAspectLang.g:3072:1: 'pointcut'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getPointcutKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getPointcutKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__1__Impl"


    // $ANTLR start "rule__Pointcut__Group__2"
    // InternalAspectLang.g:3085:1: rule__Pointcut__Group__2 : rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 ;
    public final void rule__Pointcut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3089:1: ( rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 )
            // InternalAspectLang.g:3090:2: rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__Pointcut__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__2"


    // $ANTLR start "rule__Pointcut__Group__2__Impl"
    // InternalAspectLang.g:3097:1: rule__Pointcut__Group__2__Impl : ( ( rule__Pointcut__NameAssignment_2 ) ) ;
    public final void rule__Pointcut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3101:1: ( ( ( rule__Pointcut__NameAssignment_2 ) ) )
            // InternalAspectLang.g:3102:1: ( ( rule__Pointcut__NameAssignment_2 ) )
            {
            // InternalAspectLang.g:3102:1: ( ( rule__Pointcut__NameAssignment_2 ) )
            // InternalAspectLang.g:3103:1: ( rule__Pointcut__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getNameAssignment_2()); 
            }
            // InternalAspectLang.g:3104:1: ( rule__Pointcut__NameAssignment_2 )
            // InternalAspectLang.g:3104:2: rule__Pointcut__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__2__Impl"


    // $ANTLR start "rule__Pointcut__Group__3"
    // InternalAspectLang.g:3114:1: rule__Pointcut__Group__3 : rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4 ;
    public final void rule__Pointcut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3118:1: ( rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4 )
            // InternalAspectLang.g:3119:2: rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__Pointcut__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__3"


    // $ANTLR start "rule__Pointcut__Group__3__Impl"
    // InternalAspectLang.g:3126:1: rule__Pointcut__Group__3__Impl : ( 'class' ) ;
    public final void rule__Pointcut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3130:1: ( ( 'class' ) )
            // InternalAspectLang.g:3131:1: ( 'class' )
            {
            // InternalAspectLang.g:3131:1: ( 'class' )
            // InternalAspectLang.g:3132:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getClassKeyword_3()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getClassKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__3__Impl"


    // $ANTLR start "rule__Pointcut__Group__4"
    // InternalAspectLang.g:3145:1: rule__Pointcut__Group__4 : rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5 ;
    public final void rule__Pointcut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3149:1: ( rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5 )
            // InternalAspectLang.g:3150:2: rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__Pointcut__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__4"


    // $ANTLR start "rule__Pointcut__Group__4__Impl"
    // InternalAspectLang.g:3157:1: rule__Pointcut__Group__4__Impl : ( ( rule__Pointcut__LocationAssignment_4 ) ) ;
    public final void rule__Pointcut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3161:1: ( ( ( rule__Pointcut__LocationAssignment_4 ) ) )
            // InternalAspectLang.g:3162:1: ( ( rule__Pointcut__LocationAssignment_4 ) )
            {
            // InternalAspectLang.g:3162:1: ( ( rule__Pointcut__LocationAssignment_4 ) )
            // InternalAspectLang.g:3163:1: ( rule__Pointcut__LocationAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getLocationAssignment_4()); 
            }
            // InternalAspectLang.g:3164:1: ( rule__Pointcut__LocationAssignment_4 )
            // InternalAspectLang.g:3164:2: rule__Pointcut__LocationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__LocationAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getLocationAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__4__Impl"


    // $ANTLR start "rule__Pointcut__Group__5"
    // InternalAspectLang.g:3174:1: rule__Pointcut__Group__5 : rule__Pointcut__Group__5__Impl ;
    public final void rule__Pointcut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3178:1: ( rule__Pointcut__Group__5__Impl )
            // InternalAspectLang.g:3179:2: rule__Pointcut__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__5"


    // $ANTLR start "rule__Pointcut__Group__5__Impl"
    // InternalAspectLang.g:3185:1: rule__Pointcut__Group__5__Impl : ( ( rule__Pointcut__Group_5__0 )? ) ;
    public final void rule__Pointcut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3189:1: ( ( ( rule__Pointcut__Group_5__0 )? ) )
            // InternalAspectLang.g:3190:1: ( ( rule__Pointcut__Group_5__0 )? )
            {
            // InternalAspectLang.g:3190:1: ( ( rule__Pointcut__Group_5__0 )? )
            // InternalAspectLang.g:3191:1: ( rule__Pointcut__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup_5()); 
            }
            // InternalAspectLang.g:3192:1: ( rule__Pointcut__Group_5__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAspectLang.g:3192:2: rule__Pointcut__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pointcut__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__5__Impl"


    // $ANTLR start "rule__Pointcut__Group_5__0"
    // InternalAspectLang.g:3214:1: rule__Pointcut__Group_5__0 : rule__Pointcut__Group_5__0__Impl rule__Pointcut__Group_5__1 ;
    public final void rule__Pointcut__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3218:1: ( rule__Pointcut__Group_5__0__Impl rule__Pointcut__Group_5__1 )
            // InternalAspectLang.g:3219:2: rule__Pointcut__Group_5__0__Impl rule__Pointcut__Group_5__1
            {
            pushFollow(FOLLOW_28);
            rule__Pointcut__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_5__0"


    // $ANTLR start "rule__Pointcut__Group_5__0__Impl"
    // InternalAspectLang.g:3226:1: rule__Pointcut__Group_5__0__Impl : ( 'operation' ) ;
    public final void rule__Pointcut__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3230:1: ( ( 'operation' ) )
            // InternalAspectLang.g:3231:1: ( 'operation' )
            {
            // InternalAspectLang.g:3231:1: ( 'operation' )
            // InternalAspectLang.g:3232:1: 'operation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationKeyword_5_0()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getOperationKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_5__0__Impl"


    // $ANTLR start "rule__Pointcut__Group_5__1"
    // InternalAspectLang.g:3245:1: rule__Pointcut__Group_5__1 : rule__Pointcut__Group_5__1__Impl ;
    public final void rule__Pointcut__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3249:1: ( rule__Pointcut__Group_5__1__Impl )
            // InternalAspectLang.g:3250:2: rule__Pointcut__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_5__1"


    // $ANTLR start "rule__Pointcut__Group_5__1__Impl"
    // InternalAspectLang.g:3256:1: rule__Pointcut__Group_5__1__Impl : ( ( rule__Pointcut__MethodAssignment_5_1 ) ) ;
    public final void rule__Pointcut__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3260:1: ( ( ( rule__Pointcut__MethodAssignment_5_1 ) ) )
            // InternalAspectLang.g:3261:1: ( ( rule__Pointcut__MethodAssignment_5_1 ) )
            {
            // InternalAspectLang.g:3261:1: ( ( rule__Pointcut__MethodAssignment_5_1 ) )
            // InternalAspectLang.g:3262:1: ( rule__Pointcut__MethodAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getMethodAssignment_5_1()); 
            }
            // InternalAspectLang.g:3263:1: ( rule__Pointcut__MethodAssignment_5_1 )
            // InternalAspectLang.g:3263:2: rule__Pointcut__MethodAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__MethodAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getMethodAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_5__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalAspectLang.g:3277:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3281:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalAspectLang.g:3282:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Annotation__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalAspectLang.g:3289:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3293:1: ( ( '@' ) )
            // InternalAspectLang.g:3294:1: ( '@' )
            {
            // InternalAspectLang.g:3294:1: ( '@' )
            // InternalAspectLang.g:3295:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalAspectLang.g:3308:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3312:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalAspectLang.g:3313:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Annotation__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalAspectLang.g:3320:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3324:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // InternalAspectLang.g:3325:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:3325:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // InternalAspectLang.g:3326:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:3327:1: ( rule__Annotation__NameAssignment_1 )
            // InternalAspectLang.g:3327:2: rule__Annotation__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // InternalAspectLang.g:3337:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3341:1: ( rule__Annotation__Group__2__Impl )
            // InternalAspectLang.g:3342:2: rule__Annotation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // InternalAspectLang.g:3348:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__ValueAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3352:1: ( ( ( rule__Annotation__ValueAssignment_2 ) ) )
            // InternalAspectLang.g:3353:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            {
            // InternalAspectLang.g:3353:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            // InternalAspectLang.g:3354:1: ( rule__Annotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalAspectLang.g:3355:1: ( rule__Annotation__ValueAssignment_2 )
            // InternalAspectLang.g:3355:2: rule__Annotation__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__MethodQuery__Group__0"
    // InternalAspectLang.g:3371:1: rule__MethodQuery__Group__0 : rule__MethodQuery__Group__0__Impl rule__MethodQuery__Group__1 ;
    public final void rule__MethodQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3375:1: ( rule__MethodQuery__Group__0__Impl rule__MethodQuery__Group__1 )
            // InternalAspectLang.g:3376:2: rule__MethodQuery__Group__0__Impl rule__MethodQuery__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__MethodQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group__0"


    // $ANTLR start "rule__MethodQuery__Group__0__Impl"
    // InternalAspectLang.g:3383:1: rule__MethodQuery__Group__0__Impl : ( () ) ;
    public final void rule__MethodQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3387:1: ( ( () ) )
            // InternalAspectLang.g:3388:1: ( () )
            {
            // InternalAspectLang.g:3388:1: ( () )
            // InternalAspectLang.g:3389:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getMethodQueryAction_0()); 
            }
            // InternalAspectLang.g:3390:1: ()
            // InternalAspectLang.g:3392:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getMethodQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group__0__Impl"


    // $ANTLR start "rule__MethodQuery__Group__1"
    // InternalAspectLang.g:3402:1: rule__MethodQuery__Group__1 : rule__MethodQuery__Group__1__Impl rule__MethodQuery__Group__2 ;
    public final void rule__MethodQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3406:1: ( rule__MethodQuery__Group__1__Impl rule__MethodQuery__Group__2 )
            // InternalAspectLang.g:3407:2: rule__MethodQuery__Group__1__Impl rule__MethodQuery__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__MethodQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group__1"


    // $ANTLR start "rule__MethodQuery__Group__1__Impl"
    // InternalAspectLang.g:3414:1: rule__MethodQuery__Group__1__Impl : ( ( rule__MethodQuery__ModifierAssignment_1 )? ) ;
    public final void rule__MethodQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3418:1: ( ( ( rule__MethodQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:3419:1: ( ( rule__MethodQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:3419:1: ( ( rule__MethodQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:3420:1: ( rule__MethodQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:3421:1: ( rule__MethodQuery__ModifierAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (synpred36_InternalAspectLang()) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // InternalAspectLang.g:3421:2: rule__MethodQuery__ModifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodQuery__ModifierAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getModifierAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group__1__Impl"


    // $ANTLR start "rule__MethodQuery__Group__2"
    // InternalAspectLang.g:3431:1: rule__MethodQuery__Group__2 : rule__MethodQuery__Group__2__Impl rule__MethodQuery__Group__3 ;
    public final void rule__MethodQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3435:1: ( rule__MethodQuery__Group__2__Impl rule__MethodQuery__Group__3 )
            // InternalAspectLang.g:3436:2: rule__MethodQuery__Group__2__Impl rule__MethodQuery__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__MethodQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group__2"


    // $ANTLR start "rule__MethodQuery__Group__2__Impl"
    // InternalAspectLang.g:3443:1: rule__MethodQuery__Group__2__Impl : ( ( rule__MethodQuery__ReturnTypeAssignment_2 )? ) ;
    public final void rule__MethodQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3447:1: ( ( ( rule__MethodQuery__ReturnTypeAssignment_2 )? ) )
            // InternalAspectLang.g:3448:1: ( ( rule__MethodQuery__ReturnTypeAssignment_2 )? )
            {
            // InternalAspectLang.g:3448:1: ( ( rule__MethodQuery__ReturnTypeAssignment_2 )? )
            // InternalAspectLang.g:3449:1: ( rule__MethodQuery__ReturnTypeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getReturnTypeAssignment_2()); 
            }
            // InternalAspectLang.g:3450:1: ( rule__MethodQuery__ReturnTypeAssignment_2 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==RULE_ID||LA28_1==13) ) {
                    alt28=1;
                }
            }
            switch (alt28) {
                case 1 :
                    // InternalAspectLang.g:3450:2: rule__MethodQuery__ReturnTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodQuery__ReturnTypeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getReturnTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group__2__Impl"


    // $ANTLR start "rule__MethodQuery__Group__3"
    // InternalAspectLang.g:3460:1: rule__MethodQuery__Group__3 : rule__MethodQuery__Group__3__Impl ;
    public final void rule__MethodQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3464:1: ( rule__MethodQuery__Group__3__Impl )
            // InternalAspectLang.g:3465:2: rule__MethodQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group__3"


    // $ANTLR start "rule__MethodQuery__Group__3__Impl"
    // InternalAspectLang.g:3471:1: rule__MethodQuery__Group__3__Impl : ( ( rule__MethodQuery__Alternatives_3 ) ) ;
    public final void rule__MethodQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3475:1: ( ( ( rule__MethodQuery__Alternatives_3 ) ) )
            // InternalAspectLang.g:3476:1: ( ( rule__MethodQuery__Alternatives_3 ) )
            {
            // InternalAspectLang.g:3476:1: ( ( rule__MethodQuery__Alternatives_3 ) )
            // InternalAspectLang.g:3477:1: ( rule__MethodQuery__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getAlternatives_3()); 
            }
            // InternalAspectLang.g:3478:1: ( rule__MethodQuery__Alternatives_3 )
            // InternalAspectLang.g:3478:2: rule__MethodQuery__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group__3__Impl"


    // $ANTLR start "rule__MethodQuery__Group_3_0__0"
    // InternalAspectLang.g:3496:1: rule__MethodQuery__Group_3_0__0 : rule__MethodQuery__Group_3_0__0__Impl rule__MethodQuery__Group_3_0__1 ;
    public final void rule__MethodQuery__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3500:1: ( rule__MethodQuery__Group_3_0__0__Impl rule__MethodQuery__Group_3_0__1 )
            // InternalAspectLang.g:3501:2: rule__MethodQuery__Group_3_0__0__Impl rule__MethodQuery__Group_3_0__1
            {
            pushFollow(FOLLOW_16);
            rule__MethodQuery__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0__0"


    // $ANTLR start "rule__MethodQuery__Group_3_0__0__Impl"
    // InternalAspectLang.g:3508:1: rule__MethodQuery__Group_3_0__0__Impl : ( ( rule__MethodQuery__MethodReferenceAssignment_3_0_0 ) ) ;
    public final void rule__MethodQuery__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3512:1: ( ( ( rule__MethodQuery__MethodReferenceAssignment_3_0_0 ) ) )
            // InternalAspectLang.g:3513:1: ( ( rule__MethodQuery__MethodReferenceAssignment_3_0_0 ) )
            {
            // InternalAspectLang.g:3513:1: ( ( rule__MethodQuery__MethodReferenceAssignment_3_0_0 ) )
            // InternalAspectLang.g:3514:1: ( rule__MethodQuery__MethodReferenceAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getMethodReferenceAssignment_3_0_0()); 
            }
            // InternalAspectLang.g:3515:1: ( rule__MethodQuery__MethodReferenceAssignment_3_0_0 )
            // InternalAspectLang.g:3515:2: rule__MethodQuery__MethodReferenceAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__MethodReferenceAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getMethodReferenceAssignment_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0__0__Impl"


    // $ANTLR start "rule__MethodQuery__Group_3_0__1"
    // InternalAspectLang.g:3525:1: rule__MethodQuery__Group_3_0__1 : rule__MethodQuery__Group_3_0__1__Impl ;
    public final void rule__MethodQuery__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3529:1: ( rule__MethodQuery__Group_3_0__1__Impl )
            // InternalAspectLang.g:3530:2: rule__MethodQuery__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0__1"


    // $ANTLR start "rule__MethodQuery__Group_3_0__1__Impl"
    // InternalAspectLang.g:3536:1: rule__MethodQuery__Group_3_0__1__Impl : ( ( rule__MethodQuery__Group_3_0_1__0 )? ) ;
    public final void rule__MethodQuery__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3540:1: ( ( ( rule__MethodQuery__Group_3_0_1__0 )? ) )
            // InternalAspectLang.g:3541:1: ( ( rule__MethodQuery__Group_3_0_1__0 )? )
            {
            // InternalAspectLang.g:3541:1: ( ( rule__MethodQuery__Group_3_0_1__0 )? )
            // InternalAspectLang.g:3542:1: ( rule__MethodQuery__Group_3_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getGroup_3_0_1()); 
            }
            // InternalAspectLang.g:3543:1: ( rule__MethodQuery__Group_3_0_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==35) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAspectLang.g:3543:2: rule__MethodQuery__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MethodQuery__Group_3_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getGroup_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0__1__Impl"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1__0"
    // InternalAspectLang.g:3557:1: rule__MethodQuery__Group_3_0_1__0 : rule__MethodQuery__Group_3_0_1__0__Impl rule__MethodQuery__Group_3_0_1__1 ;
    public final void rule__MethodQuery__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3561:1: ( rule__MethodQuery__Group_3_0_1__0__Impl rule__MethodQuery__Group_3_0_1__1 )
            // InternalAspectLang.g:3562:2: rule__MethodQuery__Group_3_0_1__0__Impl rule__MethodQuery__Group_3_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__MethodQuery__Group_3_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group_3_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1__0"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1__0__Impl"
    // InternalAspectLang.g:3569:1: rule__MethodQuery__Group_3_0_1__0__Impl : ( '(' ) ;
    public final void rule__MethodQuery__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3573:1: ( ( '(' ) )
            // InternalAspectLang.g:3574:1: ( '(' )
            {
            // InternalAspectLang.g:3574:1: ( '(' )
            // InternalAspectLang.g:3575:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getLeftParenthesisKeyword_3_0_1_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getLeftParenthesisKeyword_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1__1"
    // InternalAspectLang.g:3588:1: rule__MethodQuery__Group_3_0_1__1 : rule__MethodQuery__Group_3_0_1__1__Impl rule__MethodQuery__Group_3_0_1__2 ;
    public final void rule__MethodQuery__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3592:1: ( rule__MethodQuery__Group_3_0_1__1__Impl rule__MethodQuery__Group_3_0_1__2 )
            // InternalAspectLang.g:3593:2: rule__MethodQuery__Group_3_0_1__1__Impl rule__MethodQuery__Group_3_0_1__2
            {
            pushFollow(FOLLOW_29);
            rule__MethodQuery__Group_3_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group_3_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1__1"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1__1__Impl"
    // InternalAspectLang.g:3600:1: rule__MethodQuery__Group_3_0_1__1__Impl : ( ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1 ) ) ;
    public final void rule__MethodQuery__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3604:1: ( ( ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1 ) ) )
            // InternalAspectLang.g:3605:1: ( ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1 ) )
            {
            // InternalAspectLang.g:3605:1: ( ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1 ) )
            // InternalAspectLang.g:3606:1: ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getParameterQueriesAssignment_3_0_1_1()); 
            }
            // InternalAspectLang.g:3607:1: ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1 )
            // InternalAspectLang.g:3607:2: rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getParameterQueriesAssignment_3_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1__2"
    // InternalAspectLang.g:3617:1: rule__MethodQuery__Group_3_0_1__2 : rule__MethodQuery__Group_3_0_1__2__Impl rule__MethodQuery__Group_3_0_1__3 ;
    public final void rule__MethodQuery__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3621:1: ( rule__MethodQuery__Group_3_0_1__2__Impl rule__MethodQuery__Group_3_0_1__3 )
            // InternalAspectLang.g:3622:2: rule__MethodQuery__Group_3_0_1__2__Impl rule__MethodQuery__Group_3_0_1__3
            {
            pushFollow(FOLLOW_29);
            rule__MethodQuery__Group_3_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group_3_0_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1__2"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1__2__Impl"
    // InternalAspectLang.g:3629:1: rule__MethodQuery__Group_3_0_1__2__Impl : ( ( rule__MethodQuery__Group_3_0_1_2__0 )* ) ;
    public final void rule__MethodQuery__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3633:1: ( ( ( rule__MethodQuery__Group_3_0_1_2__0 )* ) )
            // InternalAspectLang.g:3634:1: ( ( rule__MethodQuery__Group_3_0_1_2__0 )* )
            {
            // InternalAspectLang.g:3634:1: ( ( rule__MethodQuery__Group_3_0_1_2__0 )* )
            // InternalAspectLang.g:3635:1: ( rule__MethodQuery__Group_3_0_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getGroup_3_0_1_2()); 
            }
            // InternalAspectLang.g:3636:1: ( rule__MethodQuery__Group_3_0_1_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==34) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAspectLang.g:3636:2: rule__MethodQuery__Group_3_0_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MethodQuery__Group_3_0_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getGroup_3_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1__2__Impl"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1__3"
    // InternalAspectLang.g:3646:1: rule__MethodQuery__Group_3_0_1__3 : rule__MethodQuery__Group_3_0_1__3__Impl ;
    public final void rule__MethodQuery__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3650:1: ( rule__MethodQuery__Group_3_0_1__3__Impl )
            // InternalAspectLang.g:3651:2: rule__MethodQuery__Group_3_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group_3_0_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1__3"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1__3__Impl"
    // InternalAspectLang.g:3657:1: rule__MethodQuery__Group_3_0_1__3__Impl : ( ')' ) ;
    public final void rule__MethodQuery__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3661:1: ( ( ')' ) )
            // InternalAspectLang.g:3662:1: ( ')' )
            {
            // InternalAspectLang.g:3662:1: ( ')' )
            // InternalAspectLang.g:3663:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getRightParenthesisKeyword_3_0_1_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getRightParenthesisKeyword_3_0_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1__3__Impl"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1_2__0"
    // InternalAspectLang.g:3684:1: rule__MethodQuery__Group_3_0_1_2__0 : rule__MethodQuery__Group_3_0_1_2__0__Impl rule__MethodQuery__Group_3_0_1_2__1 ;
    public final void rule__MethodQuery__Group_3_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3688:1: ( rule__MethodQuery__Group_3_0_1_2__0__Impl rule__MethodQuery__Group_3_0_1_2__1 )
            // InternalAspectLang.g:3689:2: rule__MethodQuery__Group_3_0_1_2__0__Impl rule__MethodQuery__Group_3_0_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MethodQuery__Group_3_0_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group_3_0_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1_2__0"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1_2__0__Impl"
    // InternalAspectLang.g:3696:1: rule__MethodQuery__Group_3_0_1_2__0__Impl : ( ',' ) ;
    public final void rule__MethodQuery__Group_3_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3700:1: ( ( ',' ) )
            // InternalAspectLang.g:3701:1: ( ',' )
            {
            // InternalAspectLang.g:3701:1: ( ',' )
            // InternalAspectLang.g:3702:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getCommaKeyword_3_0_1_2_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getCommaKeyword_3_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1_2__0__Impl"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1_2__1"
    // InternalAspectLang.g:3715:1: rule__MethodQuery__Group_3_0_1_2__1 : rule__MethodQuery__Group_3_0_1_2__1__Impl ;
    public final void rule__MethodQuery__Group_3_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3719:1: ( rule__MethodQuery__Group_3_0_1_2__1__Impl )
            // InternalAspectLang.g:3720:2: rule__MethodQuery__Group_3_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__Group_3_0_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1_2__1"


    // $ANTLR start "rule__MethodQuery__Group_3_0_1_2__1__Impl"
    // InternalAspectLang.g:3726:1: rule__MethodQuery__Group_3_0_1_2__1__Impl : ( ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1 ) ) ;
    public final void rule__MethodQuery__Group_3_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3730:1: ( ( ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1 ) ) )
            // InternalAspectLang.g:3731:1: ( ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1 ) )
            {
            // InternalAspectLang.g:3731:1: ( ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1 ) )
            // InternalAspectLang.g:3732:1: ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getParameterQueriesAssignment_3_0_1_2_1()); 
            }
            // InternalAspectLang.g:3733:1: ( rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1 )
            // InternalAspectLang.g:3733:2: rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getParameterQueriesAssignment_3_0_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__Group_3_0_1_2__1__Impl"


    // $ANTLR start "rule__ParameterQuery__Group__0"
    // InternalAspectLang.g:3747:1: rule__ParameterQuery__Group__0 : rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1 ;
    public final void rule__ParameterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3751:1: ( rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1 )
            // InternalAspectLang.g:3752:2: rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__0"


    // $ANTLR start "rule__ParameterQuery__Group__0__Impl"
    // InternalAspectLang.g:3759:1: rule__ParameterQuery__Group__0__Impl : ( ( rule__ParameterQuery__ModifierAssignment_0 )? ) ;
    public final void rule__ParameterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3763:1: ( ( ( rule__ParameterQuery__ModifierAssignment_0 )? ) )
            // InternalAspectLang.g:3764:1: ( ( rule__ParameterQuery__ModifierAssignment_0 )? )
            {
            // InternalAspectLang.g:3764:1: ( ( rule__ParameterQuery__ModifierAssignment_0 )? )
            // InternalAspectLang.g:3765:1: ( rule__ParameterQuery__ModifierAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierAssignment_0()); 
            }
            // InternalAspectLang.g:3766:1: ( rule__ParameterQuery__ModifierAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==RULE_ID) ) {
                    int LA31_2 = input.LA(3);

                    if ( (synpred40_InternalAspectLang()) ) {
                        alt31=1;
                    }
                }
            }
            switch (alt31) {
                case 1 :
                    // InternalAspectLang.g:3766:2: rule__ParameterQuery__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterQuery__ModifierAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getModifierAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__0__Impl"


    // $ANTLR start "rule__ParameterQuery__Group__1"
    // InternalAspectLang.g:3776:1: rule__ParameterQuery__Group__1 : rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2 ;
    public final void rule__ParameterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3780:1: ( rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2 )
            // InternalAspectLang.g:3781:2: rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ParameterQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__1"


    // $ANTLR start "rule__ParameterQuery__Group__1__Impl"
    // InternalAspectLang.g:3788:1: rule__ParameterQuery__Group__1__Impl : ( ( rule__ParameterQuery__TypeAssignment_1 ) ) ;
    public final void rule__ParameterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3792:1: ( ( ( rule__ParameterQuery__TypeAssignment_1 ) ) )
            // InternalAspectLang.g:3793:1: ( ( rule__ParameterQuery__TypeAssignment_1 ) )
            {
            // InternalAspectLang.g:3793:1: ( ( rule__ParameterQuery__TypeAssignment_1 ) )
            // InternalAspectLang.g:3794:1: ( rule__ParameterQuery__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getTypeAssignment_1()); 
            }
            // InternalAspectLang.g:3795:1: ( rule__ParameterQuery__TypeAssignment_1 )
            // InternalAspectLang.g:3795:2: rule__ParameterQuery__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterQuery__TypeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getTypeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__1__Impl"


    // $ANTLR start "rule__ParameterQuery__Group__2"
    // InternalAspectLang.g:3805:1: rule__ParameterQuery__Group__2 : rule__ParameterQuery__Group__2__Impl ;
    public final void rule__ParameterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3809:1: ( rule__ParameterQuery__Group__2__Impl )
            // InternalAspectLang.g:3810:2: rule__ParameterQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__2"


    // $ANTLR start "rule__ParameterQuery__Group__2__Impl"
    // InternalAspectLang.g:3816:1: rule__ParameterQuery__Group__2__Impl : ( ( rule__ParameterQuery__ParameterAssignment_2 )? ) ;
    public final void rule__ParameterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3820:1: ( ( ( rule__ParameterQuery__ParameterAssignment_2 )? ) )
            // InternalAspectLang.g:3821:1: ( ( rule__ParameterQuery__ParameterAssignment_2 )? )
            {
            // InternalAspectLang.g:3821:1: ( ( rule__ParameterQuery__ParameterAssignment_2 )? )
            // InternalAspectLang.g:3822:1: ( rule__ParameterQuery__ParameterAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterAssignment_2()); 
            }
            // InternalAspectLang.g:3823:1: ( rule__ParameterQuery__ParameterAssignment_2 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAspectLang.g:3823:2: rule__ParameterQuery__ParameterAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterQuery__ParameterAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getParameterAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__2__Impl"


    // $ANTLR start "rule__LocationQuery__Group__0"
    // InternalAspectLang.g:3839:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3843:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // InternalAspectLang.g:3844:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__LocationQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:3851:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__NodeAssignment_0 ) ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3855:1: ( ( ( rule__LocationQuery__NodeAssignment_0 ) ) )
            // InternalAspectLang.g:3856:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            {
            // InternalAspectLang.g:3856:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            // InternalAspectLang.g:3857:1: ( rule__LocationQuery__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }
            // InternalAspectLang.g:3858:1: ( rule__LocationQuery__NodeAssignment_0 )
            // InternalAspectLang.g:3858:2: rule__LocationQuery__NodeAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:3868:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3872:1: ( rule__LocationQuery__Group__1__Impl )
            // InternalAspectLang.g:3873:2: rule__LocationQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:3879:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__Alternatives_1 )? ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3883:1: ( ( ( rule__LocationQuery__Alternatives_1 )? ) )
            // InternalAspectLang.g:3884:1: ( ( rule__LocationQuery__Alternatives_1 )? )
            {
            // InternalAspectLang.g:3884:1: ( ( rule__LocationQuery__Alternatives_1 )? )
            // InternalAspectLang.g:3885:1: ( rule__LocationQuery__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getAlternatives_1()); 
            }
            // InternalAspectLang.g:3886:1: ( rule__LocationQuery__Alternatives_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=14 && LA33_0<=15)||LA33_0==31||LA33_0==38) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAspectLang.g:3886:2: rule__LocationQuery__Alternatives_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocationQuery__Alternatives_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getAlternatives_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LocationQuery__Group_1_0__0"
    // InternalAspectLang.g:3900:1: rule__LocationQuery__Group_1_0__0 : rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1 ;
    public final void rule__LocationQuery__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3904:1: ( rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1 )
            // InternalAspectLang.g:3905:2: rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1
            {
            pushFollow(FOLLOW_26);
            rule__LocationQuery__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocationQuery__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_1_0__0"


    // $ANTLR start "rule__LocationQuery__Group_1_0__0__Impl"
    // InternalAspectLang.g:3912:1: rule__LocationQuery__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3916:1: ( ( '.' ) )
            // InternalAspectLang.g:3917:1: ( '.' )
            {
            // InternalAspectLang.g:3917:1: ( '.' )
            // InternalAspectLang.g:3918:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_1_0__0__Impl"


    // $ANTLR start "rule__LocationQuery__Group_1_0__1"
    // InternalAspectLang.g:3931:1: rule__LocationQuery__Group_1_0__1 : rule__LocationQuery__Group_1_0__1__Impl ;
    public final void rule__LocationQuery__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3935:1: ( rule__LocationQuery__Group_1_0__1__Impl )
            // InternalAspectLang.g:3936:2: rule__LocationQuery__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocationQuery__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_1_0__1"


    // $ANTLR start "rule__LocationQuery__Group_1_0__1__Impl"
    // InternalAspectLang.g:3942:1: rule__LocationQuery__Group_1_0__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) ) ;
    public final void rule__LocationQuery__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3946:1: ( ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) ) )
            // InternalAspectLang.g:3947:1: ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) )
            {
            // InternalAspectLang.g:3947:1: ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) )
            // InternalAspectLang.g:3948:1: ( rule__LocationQuery__SpecializationAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_0_1()); 
            }
            // InternalAspectLang.g:3949:1: ( rule__LocationQuery__SpecializationAssignment_1_0_1 )
            // InternalAspectLang.g:3949:2: rule__LocationQuery__SpecializationAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LocationQuery__SpecializationAssignment_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_1_0__1__Impl"


    // $ANTLR start "rule__CompositionQuery__Group__0"
    // InternalAspectLang.g:3963:1: rule__CompositionQuery__Group__0 : rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1 ;
    public final void rule__CompositionQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3967:1: ( rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1 )
            // InternalAspectLang.g:3968:2: rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__CompositionQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositionQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__0"


    // $ANTLR start "rule__CompositionQuery__Group__0__Impl"
    // InternalAspectLang.g:3975:1: rule__CompositionQuery__Group__0__Impl : ( () ) ;
    public final void rule__CompositionQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3979:1: ( ( () ) )
            // InternalAspectLang.g:3980:1: ( () )
            {
            // InternalAspectLang.g:3980:1: ( () )
            // InternalAspectLang.g:3981:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getCompositionQueryAction_0()); 
            }
            // InternalAspectLang.g:3982:1: ()
            // InternalAspectLang.g:3984:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getCompositionQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__0__Impl"


    // $ANTLR start "rule__CompositionQuery__Group__1"
    // InternalAspectLang.g:3994:1: rule__CompositionQuery__Group__1 : rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2 ;
    public final void rule__CompositionQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3998:1: ( rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2 )
            // InternalAspectLang.g:3999:2: rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__CompositionQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositionQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__1"


    // $ANTLR start "rule__CompositionQuery__Group__1__Impl"
    // InternalAspectLang.g:4006:1: rule__CompositionQuery__Group__1__Impl : ( ( rule__CompositionQuery__ModifierAssignment_1 )? ) ;
    public final void rule__CompositionQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4010:1: ( ( ( rule__CompositionQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:4011:1: ( ( rule__CompositionQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:4011:1: ( ( rule__CompositionQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:4012:1: ( rule__CompositionQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:4013:1: ( rule__CompositionQuery__ModifierAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=14 && LA34_0<=15)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAspectLang.g:4013:2: rule__CompositionQuery__ModifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CompositionQuery__ModifierAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getModifierAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__1__Impl"


    // $ANTLR start "rule__CompositionQuery__Group__2"
    // InternalAspectLang.g:4023:1: rule__CompositionQuery__Group__2 : rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3 ;
    public final void rule__CompositionQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4027:1: ( rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3 )
            // InternalAspectLang.g:4028:2: rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__CompositionQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositionQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__2"


    // $ANTLR start "rule__CompositionQuery__Group__2__Impl"
    // InternalAspectLang.g:4035:1: rule__CompositionQuery__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositionQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4039:1: ( ( '{' ) )
            // InternalAspectLang.g:4040:1: ( '{' )
            {
            // InternalAspectLang.g:4040:1: ( '{' )
            // InternalAspectLang.g:4041:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__2__Impl"


    // $ANTLR start "rule__CompositionQuery__Group__3"
    // InternalAspectLang.g:4054:1: rule__CompositionQuery__Group__3 : rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4 ;
    public final void rule__CompositionQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4058:1: ( rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4 )
            // InternalAspectLang.g:4059:2: rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__CompositionQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__CompositionQuery__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__3"


    // $ANTLR start "rule__CompositionQuery__Group__3__Impl"
    // InternalAspectLang.g:4066:1: rule__CompositionQuery__Group__3__Impl : ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* ) ;
    public final void rule__CompositionQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4070:1: ( ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* ) )
            // InternalAspectLang.g:4071:1: ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* )
            {
            // InternalAspectLang.g:4071:1: ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* )
            // InternalAspectLang.g:4072:1: ( rule__CompositionQuery__SubQueriesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getSubQueriesAssignment_3()); 
            }
            // InternalAspectLang.g:4073:1: ( rule__CompositionQuery__SubQueriesAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID||LA35_0==13||(LA35_0>=48 && LA35_0<=49)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalAspectLang.g:4073:2: rule__CompositionQuery__SubQueriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_32);
            	    rule__CompositionQuery__SubQueriesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getSubQueriesAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__3__Impl"


    // $ANTLR start "rule__CompositionQuery__Group__4"
    // InternalAspectLang.g:4083:1: rule__CompositionQuery__Group__4 : rule__CompositionQuery__Group__4__Impl ;
    public final void rule__CompositionQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4087:1: ( rule__CompositionQuery__Group__4__Impl )
            // InternalAspectLang.g:4088:2: rule__CompositionQuery__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionQuery__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__4"


    // $ANTLR start "rule__CompositionQuery__Group__4__Impl"
    // InternalAspectLang.g:4094:1: rule__CompositionQuery__Group__4__Impl : ( '}' ) ;
    public final void rule__CompositionQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4098:1: ( ( '}' ) )
            // InternalAspectLang.g:4099:1: ( '}' )
            {
            // InternalAspectLang.g:4099:1: ( '}' )
            // InternalAspectLang.g:4100:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getRightCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__Group__4__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalAspectLang.g:4123:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4127:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalAspectLang.g:4128:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__Node__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4135:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4139:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // InternalAspectLang.g:4140:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // InternalAspectLang.g:4140:1: ( ( rule__Node__Alternatives_0 ) )
            // InternalAspectLang.g:4141:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // InternalAspectLang.g:4142:1: ( rule__Node__Alternatives_0 )
            // InternalAspectLang.g:4142:2: rule__Node__Alternatives_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4152:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4156:1: ( rule__Node__Group__1__Impl )
            // InternalAspectLang.g:4157:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4163:1: rule__Node__Group__1__Impl : ( ( rule__Node__ParameterAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4167:1: ( ( ( rule__Node__ParameterAssignment_1 )? ) )
            // InternalAspectLang.g:4168:1: ( ( rule__Node__ParameterAssignment_1 )? )
            {
            // InternalAspectLang.g:4168:1: ( ( rule__Node__ParameterAssignment_1 )? )
            // InternalAspectLang.g:4169:1: ( rule__Node__ParameterAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterAssignment_1()); 
            }
            // InternalAspectLang.g:4170:1: ( rule__Node__ParameterAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAspectLang.g:4170:2: rule__Node__ParameterAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4184:1: rule__ParamQuery__Group__0 : rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 ;
    public final void rule__ParamQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4188:1: ( rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1 )
            // InternalAspectLang.g:4189:2: rule__ParamQuery__Group__0__Impl rule__ParamQuery__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ParamQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4196:1: rule__ParamQuery__Group__0__Impl : ( '[' ) ;
    public final void rule__ParamQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4200:1: ( ( '[' ) )
            // InternalAspectLang.g:4201:1: ( '[' )
            {
            // InternalAspectLang.g:4201:1: ( '[' )
            // InternalAspectLang.g:4202:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getLeftSquareBracketKeyword_0()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4215:1: rule__ParamQuery__Group__1 : rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 ;
    public final void rule__ParamQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4219:1: ( rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2 )
            // InternalAspectLang.g:4220:2: rule__ParamQuery__Group__1__Impl rule__ParamQuery__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__ParamQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4227:1: rule__ParamQuery__Group__1__Impl : ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) ;
    public final void rule__ParamQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4231:1: ( ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) ) )
            // InternalAspectLang.g:4232:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            {
            // InternalAspectLang.g:4232:1: ( ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* ) )
            // InternalAspectLang.g:4233:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) ) ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            {
            // InternalAspectLang.g:4233:1: ( ( rule__ParamQuery__QueriesAssignment_1 ) )
            // InternalAspectLang.g:4234:1: ( rule__ParamQuery__QueriesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // InternalAspectLang.g:4235:1: ( rule__ParamQuery__QueriesAssignment_1 )
            // InternalAspectLang.g:4235:2: rule__ParamQuery__QueriesAssignment_1
            {
            pushFollow(FOLLOW_35);
            rule__ParamQuery__QueriesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }

            }

            // InternalAspectLang.g:4238:1: ( ( rule__ParamQuery__QueriesAssignment_1 )* )
            // InternalAspectLang.g:4239:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesAssignment_1()); 
            }
            // InternalAspectLang.g:4240:1: ( rule__ParamQuery__QueriesAssignment_1 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=RULE_ID && LA37_0<=RULE_INT)||LA37_0==13||(LA37_0>=18 && LA37_0<=20)||(LA37_0>=46 && LA37_0<=49)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAspectLang.g:4240:2: rule__ParamQuery__QueriesAssignment_1
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__ParamQuery__QueriesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalAspectLang.g:4251:1: rule__ParamQuery__Group__2 : rule__ParamQuery__Group__2__Impl ;
    public final void rule__ParamQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4255:1: ( rule__ParamQuery__Group__2__Impl )
            // InternalAspectLang.g:4256:2: rule__ParamQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4262:1: rule__ParamQuery__Group__2__Impl : ( ']' ) ;
    public final void rule__ParamQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4266:1: ( ( ']' ) )
            // InternalAspectLang.g:4267:1: ( ']' )
            {
            // InternalAspectLang.g:4267:1: ( ']' )
            // InternalAspectLang.g:4268:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getRightSquareBracketKeyword_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ParamOperator__Group__0"
    // InternalAspectLang.g:4287:1: rule__ParamOperator__Group__0 : rule__ParamOperator__Group__0__Impl rule__ParamOperator__Group__1 ;
    public final void rule__ParamOperator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4291:1: ( rule__ParamOperator__Group__0__Impl rule__ParamOperator__Group__1 )
            // InternalAspectLang.g:4292:2: rule__ParamOperator__Group__0__Impl rule__ParamOperator__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ParamOperator__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamOperator__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group__0"


    // $ANTLR start "rule__ParamOperator__Group__0__Impl"
    // InternalAspectLang.g:4299:1: rule__ParamOperator__Group__0__Impl : ( ruleParamCompare ) ;
    public final void rule__ParamOperator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4303:1: ( ( ruleParamCompare ) )
            // InternalAspectLang.g:4304:1: ( ruleParamCompare )
            {
            // InternalAspectLang.g:4304:1: ( ruleParamCompare )
            // InternalAspectLang.g:4305:1: ruleParamCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorAccess().getParamCompareParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorAccess().getParamCompareParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group__0__Impl"


    // $ANTLR start "rule__ParamOperator__Group__1"
    // InternalAspectLang.g:4316:1: rule__ParamOperator__Group__1 : rule__ParamOperator__Group__1__Impl ;
    public final void rule__ParamOperator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4320:1: ( rule__ParamOperator__Group__1__Impl )
            // InternalAspectLang.g:4321:2: rule__ParamOperator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamOperator__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group__1"


    // $ANTLR start "rule__ParamOperator__Group__1__Impl"
    // InternalAspectLang.g:4327:1: rule__ParamOperator__Group__1__Impl : ( ( rule__ParamOperator__Group_1__0 )? ) ;
    public final void rule__ParamOperator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4331:1: ( ( ( rule__ParamOperator__Group_1__0 )? ) )
            // InternalAspectLang.g:4332:1: ( ( rule__ParamOperator__Group_1__0 )? )
            {
            // InternalAspectLang.g:4332:1: ( ( rule__ParamOperator__Group_1__0 )? )
            // InternalAspectLang.g:4333:1: ( rule__ParamOperator__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:4334:1: ( rule__ParamOperator__Group_1__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=16 && LA38_0<=17)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalAspectLang.g:4334:2: rule__ParamOperator__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamOperator__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group__1__Impl"


    // $ANTLR start "rule__ParamOperator__Group_1__0"
    // InternalAspectLang.g:4348:1: rule__ParamOperator__Group_1__0 : rule__ParamOperator__Group_1__0__Impl rule__ParamOperator__Group_1__1 ;
    public final void rule__ParamOperator__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4352:1: ( rule__ParamOperator__Group_1__0__Impl rule__ParamOperator__Group_1__1 )
            // InternalAspectLang.g:4353:2: rule__ParamOperator__Group_1__0__Impl rule__ParamOperator__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__ParamOperator__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamOperator__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group_1__0"


    // $ANTLR start "rule__ParamOperator__Group_1__0__Impl"
    // InternalAspectLang.g:4360:1: rule__ParamOperator__Group_1__0__Impl : ( () ) ;
    public final void rule__ParamOperator__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4364:1: ( ( () ) )
            // InternalAspectLang.g:4365:1: ( () )
            {
            // InternalAspectLang.g:4365:1: ( () )
            // InternalAspectLang.g:4366:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorAccess().getParamExpressionLeftAction_1_0()); 
            }
            // InternalAspectLang.g:4367:1: ()
            // InternalAspectLang.g:4369:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorAccess().getParamExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group_1__0__Impl"


    // $ANTLR start "rule__ParamOperator__Group_1__1"
    // InternalAspectLang.g:4379:1: rule__ParamOperator__Group_1__1 : rule__ParamOperator__Group_1__1__Impl rule__ParamOperator__Group_1__2 ;
    public final void rule__ParamOperator__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4383:1: ( rule__ParamOperator__Group_1__1__Impl rule__ParamOperator__Group_1__2 )
            // InternalAspectLang.g:4384:2: rule__ParamOperator__Group_1__1__Impl rule__ParamOperator__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ParamOperator__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamOperator__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group_1__1"


    // $ANTLR start "rule__ParamOperator__Group_1__1__Impl"
    // InternalAspectLang.g:4391:1: rule__ParamOperator__Group_1__1__Impl : ( ( rule__ParamOperator__LogicAssignment_1_1 ) ) ;
    public final void rule__ParamOperator__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4395:1: ( ( ( rule__ParamOperator__LogicAssignment_1_1 ) ) )
            // InternalAspectLang.g:4396:1: ( ( rule__ParamOperator__LogicAssignment_1_1 ) )
            {
            // InternalAspectLang.g:4396:1: ( ( rule__ParamOperator__LogicAssignment_1_1 ) )
            // InternalAspectLang.g:4397:1: ( rule__ParamOperator__LogicAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorAccess().getLogicAssignment_1_1()); 
            }
            // InternalAspectLang.g:4398:1: ( rule__ParamOperator__LogicAssignment_1_1 )
            // InternalAspectLang.g:4398:2: rule__ParamOperator__LogicAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamOperator__LogicAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorAccess().getLogicAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group_1__1__Impl"


    // $ANTLR start "rule__ParamOperator__Group_1__2"
    // InternalAspectLang.g:4408:1: rule__ParamOperator__Group_1__2 : rule__ParamOperator__Group_1__2__Impl ;
    public final void rule__ParamOperator__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4412:1: ( rule__ParamOperator__Group_1__2__Impl )
            // InternalAspectLang.g:4413:2: rule__ParamOperator__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamOperator__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group_1__2"


    // $ANTLR start "rule__ParamOperator__Group_1__2__Impl"
    // InternalAspectLang.g:4419:1: rule__ParamOperator__Group_1__2__Impl : ( ( rule__ParamOperator__RightAssignment_1_2 ) ) ;
    public final void rule__ParamOperator__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4423:1: ( ( ( rule__ParamOperator__RightAssignment_1_2 ) ) )
            // InternalAspectLang.g:4424:1: ( ( rule__ParamOperator__RightAssignment_1_2 ) )
            {
            // InternalAspectLang.g:4424:1: ( ( rule__ParamOperator__RightAssignment_1_2 ) )
            // InternalAspectLang.g:4425:1: ( rule__ParamOperator__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorAccess().getRightAssignment_1_2()); 
            }
            // InternalAspectLang.g:4426:1: ( rule__ParamOperator__RightAssignment_1_2 )
            // InternalAspectLang.g:4426:2: rule__ParamOperator__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ParamOperator__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__Group_1__2__Impl"


    // $ANTLR start "rule__ParamCompare__Group__0"
    // InternalAspectLang.g:4442:1: rule__ParamCompare__Group__0 : rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 ;
    public final void rule__ParamCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4446:1: ( rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1 )
            // InternalAspectLang.g:4447:2: rule__ParamCompare__Group__0__Impl rule__ParamCompare__Group__1
            {
            pushFollow(FOLLOW_36);
            rule__ParamCompare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4454:1: rule__ParamCompare__Group__0__Impl : ( ruleValue ) ;
    public final void rule__ParamCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4458:1: ( ( ruleValue ) )
            // InternalAspectLang.g:4459:1: ( ruleValue )
            {
            // InternalAspectLang.g:4459:1: ( ruleValue )
            // InternalAspectLang.g:4460:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getValueParserRuleCall_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:4471:1: rule__ParamCompare__Group__1 : rule__ParamCompare__Group__1__Impl ;
    public final void rule__ParamCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4475:1: ( rule__ParamCompare__Group__1__Impl )
            // InternalAspectLang.g:4476:2: rule__ParamCompare__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4482:1: rule__ParamCompare__Group__1__Impl : ( ( rule__ParamCompare__Group_1__0 )? ) ;
    public final void rule__ParamCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4486:1: ( ( ( rule__ParamCompare__Group_1__0 )? ) )
            // InternalAspectLang.g:4487:1: ( ( rule__ParamCompare__Group_1__0 )? )
            {
            // InternalAspectLang.g:4487:1: ( ( rule__ParamCompare__Group_1__0 )? )
            // InternalAspectLang.g:4488:1: ( rule__ParamCompare__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:4489:1: ( rule__ParamCompare__Group_1__0 )?
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalAspectLang.g:4489:2: rule__ParamCompare__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamCompare__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

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
    // InternalAspectLang.g:4503:1: rule__ParamCompare__Group_1__0 : rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 ;
    public final void rule__ParamCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4507:1: ( rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1 )
            // InternalAspectLang.g:4508:2: rule__ParamCompare__Group_1__0__Impl rule__ParamCompare__Group_1__1
            {
            pushFollow(FOLLOW_36);
            rule__ParamCompare__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4515:1: rule__ParamCompare__Group_1__0__Impl : ( () ) ;
    public final void rule__ParamCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4519:1: ( ( () ) )
            // InternalAspectLang.g:4520:1: ( () )
            {
            // InternalAspectLang.g:4520:1: ( () )
            // InternalAspectLang.g:4521:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getParamExpressionLeftAction_1_0()); 
            }
            // InternalAspectLang.g:4522:1: ()
            // InternalAspectLang.g:4524:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getParamExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group_1__0__Impl"


    // $ANTLR start "rule__ParamCompare__Group_1__1"
    // InternalAspectLang.g:4534:1: rule__ParamCompare__Group_1__1 : rule__ParamCompare__Group_1__1__Impl rule__ParamCompare__Group_1__2 ;
    public final void rule__ParamCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4538:1: ( rule__ParamCompare__Group_1__1__Impl rule__ParamCompare__Group_1__2 )
            // InternalAspectLang.g:4539:2: rule__ParamCompare__Group_1__1__Impl rule__ParamCompare__Group_1__2
            {
            pushFollow(FOLLOW_18);
            rule__ParamCompare__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParamCompare__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAspectLang.g:4546:1: rule__ParamCompare__Group_1__1__Impl : ( ( rule__ParamCompare__OperatorAssignment_1_1 ) ) ;
    public final void rule__ParamCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4550:1: ( ( ( rule__ParamCompare__OperatorAssignment_1_1 ) ) )
            // InternalAspectLang.g:4551:1: ( ( rule__ParamCompare__OperatorAssignment_1_1 ) )
            {
            // InternalAspectLang.g:4551:1: ( ( rule__ParamCompare__OperatorAssignment_1_1 ) )
            // InternalAspectLang.g:4552:1: ( rule__ParamCompare__OperatorAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_1()); 
            }
            // InternalAspectLang.g:4553:1: ( rule__ParamCompare__OperatorAssignment_1_1 )
            // InternalAspectLang.g:4553:2: rule__ParamCompare__OperatorAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamCompare__OperatorAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getOperatorAssignment_1_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ParamCompare__Group_1__2"
    // InternalAspectLang.g:4563:1: rule__ParamCompare__Group_1__2 : rule__ParamCompare__Group_1__2__Impl ;
    public final void rule__ParamCompare__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4567:1: ( rule__ParamCompare__Group_1__2__Impl )
            // InternalAspectLang.g:4568:2: rule__ParamCompare__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamCompare__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group_1__2"


    // $ANTLR start "rule__ParamCompare__Group_1__2__Impl"
    // InternalAspectLang.g:4574:1: rule__ParamCompare__Group_1__2__Impl : ( ( rule__ParamCompare__RightAssignment_1_2 ) ) ;
    public final void rule__ParamCompare__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4578:1: ( ( ( rule__ParamCompare__RightAssignment_1_2 ) ) )
            // InternalAspectLang.g:4579:1: ( ( rule__ParamCompare__RightAssignment_1_2 ) )
            {
            // InternalAspectLang.g:4579:1: ( ( rule__ParamCompare__RightAssignment_1_2 ) )
            // InternalAspectLang.g:4580:1: ( rule__ParamCompare__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightAssignment_1_2()); 
            }
            // InternalAspectLang.g:4581:1: ( rule__ParamCompare__RightAssignment_1_2 )
            // InternalAspectLang.g:4581:2: rule__ParamCompare__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ParamCompare__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__Group_1__2__Impl"


    // $ANTLR start "rule__ReferenceValue__Group__0"
    // InternalAspectLang.g:4597:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4601:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // InternalAspectLang.g:4602:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ReferenceValue__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4609:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 )? ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4613:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 )? ) )
            // InternalAspectLang.g:4614:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            {
            // InternalAspectLang.g:4614:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            // InternalAspectLang.g:4615:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // InternalAspectLang.g:4616:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID||LA40_0==13||(LA40_0>=48 && LA40_0<=49)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAspectLang.g:4616:2: rule__ReferenceValue__QueryAssignment_0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4626:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4630:1: ( rule__ReferenceValue__Group__1__Impl )
            // InternalAspectLang.g:4631:2: rule__ReferenceValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4637:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4641:1: ( ( ( rule__ReferenceValue__ParameterAssignment_1 ) ) )
            // InternalAspectLang.g:4642:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            {
            // InternalAspectLang.g:4642:1: ( ( rule__ReferenceValue__ParameterAssignment_1 ) )
            // InternalAspectLang.g:4643:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterAssignment_1()); 
            }
            // InternalAspectLang.g:4644:1: ( rule__ReferenceValue__ParameterAssignment_1 )
            // InternalAspectLang.g:4644:2: rule__ReferenceValue__ParameterAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4658:1: rule__RuntimeProperty__Group__0 : rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 ;
    public final void rule__RuntimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4662:1: ( rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 )
            // InternalAspectLang.g:4663:2: rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RuntimeProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4670:1: rule__RuntimeProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__RuntimeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4674:1: ( ( '#' ) )
            // InternalAspectLang.g:4675:1: ( '#' )
            {
            // InternalAspectLang.g:4675:1: ( '#' )
            // InternalAspectLang.g:4676:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4689:1: rule__RuntimeProperty__Group__1 : rule__RuntimeProperty__Group__1__Impl ;
    public final void rule__RuntimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4693:1: ( rule__RuntimeProperty__Group__1__Impl )
            // InternalAspectLang.g:4694:2: rule__RuntimeProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4700:1: rule__RuntimeProperty__Group__1__Impl : ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__RuntimeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4704:1: ( ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) ) )
            // InternalAspectLang.g:4705:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            {
            // InternalAspectLang.g:4705:1: ( ( rule__RuntimeProperty__ReferenceAssignment_1 ) )
            // InternalAspectLang.g:4706:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceAssignment_1()); 
            }
            // InternalAspectLang.g:4707:1: ( rule__RuntimeProperty__ReferenceAssignment_1 )
            // InternalAspectLang.g:4707:2: rule__RuntimeProperty__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4721:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4725:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // InternalAspectLang.g:4726:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__ReflectionProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4733:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4737:1: ( ( '$' ) )
            // InternalAspectLang.g:4738:1: ( '$' )
            {
            // InternalAspectLang.g:4738:1: ( '$' )
            // InternalAspectLang.g:4739:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4752:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4756:1: ( rule__ReflectionProperty__Group__1__Impl )
            // InternalAspectLang.g:4757:2: rule__ReflectionProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4763:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4767:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // InternalAspectLang.g:4768:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // InternalAspectLang.g:4768:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // InternalAspectLang.g:4769:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // InternalAspectLang.g:4770:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // InternalAspectLang.g:4770:2: rule__ReflectionProperty__FunctionAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4784:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4788:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // InternalAspectLang.g:4789:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__WildcardNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4796:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4800:1: ( ( () ) )
            // InternalAspectLang.g:4801:1: ( () )
            {
            // InternalAspectLang.g:4801:1: ( () )
            // InternalAspectLang.g:4802:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }
            // InternalAspectLang.g:4803:1: ()
            // InternalAspectLang.g:4805:1: 
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
    // InternalAspectLang.g:4815:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4819:1: ( rule__WildcardNode__Group__1__Impl )
            // InternalAspectLang.g:4820:2: rule__WildcardNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4826:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4830:1: ( ( '*' ) )
            // InternalAspectLang.g:4831:1: ( '*' )
            {
            // InternalAspectLang.g:4831:1: ( '*' )
            // InternalAspectLang.g:4832:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getAsteriskKeyword_1()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4849:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4853:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // InternalAspectLang.g:4854:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__SubPathNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4861:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4865:1: ( ( () ) )
            // InternalAspectLang.g:4866:1: ( () )
            {
            // InternalAspectLang.g:4866:1: ( () )
            // InternalAspectLang.g:4867:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // InternalAspectLang.g:4868:1: ()
            // InternalAspectLang.g:4870:1: 
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
    // InternalAspectLang.g:4880:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4884:1: ( rule__SubPathNode__Group__1__Impl )
            // InternalAspectLang.g:4885:2: rule__SubPathNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4891:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4895:1: ( ( '**' ) )
            // InternalAspectLang.g:4896:1: ( '**' )
            {
            // InternalAspectLang.g:4896:1: ( '**' )
            // InternalAspectLang.g:4897:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4914:1: rule__ParentNode__Group__0 : rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 ;
    public final void rule__ParentNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4918:1: ( rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 )
            // InternalAspectLang.g:4919:2: rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__ParentNode__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4926:1: rule__ParentNode__Group__0__Impl : ( () ) ;
    public final void rule__ParentNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4930:1: ( ( () ) )
            // InternalAspectLang.g:4931:1: ( () )
            {
            // InternalAspectLang.g:4931:1: ( () )
            // InternalAspectLang.g:4932:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getParentNodeAction_0()); 
            }
            // InternalAspectLang.g:4933:1: ()
            // InternalAspectLang.g:4935:1: 
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
    // InternalAspectLang.g:4945:1: rule__ParentNode__Group__1 : rule__ParentNode__Group__1__Impl ;
    public final void rule__ParentNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4949:1: ( rule__ParentNode__Group__1__Impl )
            // InternalAspectLang.g:4950:2: rule__ParentNode__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4956:1: rule__ParentNode__Group__1__Impl : ( '<<' ) ;
    public final void rule__ParentNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4960:1: ( ( '<<' ) )
            // InternalAspectLang.g:4961:1: ( '<<' )
            {
            // InternalAspectLang.g:4961:1: ( '<<' )
            // InternalAspectLang.g:4962:1: '<<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getLessThanSignLessThanSignKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4979:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4983:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // InternalAspectLang.g:4984:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Collector__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:4991:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4995:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // InternalAspectLang.g:4996:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // InternalAspectLang.g:4996:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // InternalAspectLang.g:4997:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // InternalAspectLang.g:4998:1: ( rule__Collector__InsertionPointAssignment_0 )
            // InternalAspectLang.g:4998:2: rule__Collector__InsertionPointAssignment_0
            {
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:5008:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5012:1: ( rule__Collector__Group__1__Impl )
            // InternalAspectLang.g:5013:2: rule__Collector__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Collector__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAspectLang.g:5019:1: rule__Collector__Group__1__Impl : ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5023:1: ( ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) ) )
            // InternalAspectLang.g:5024:1: ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) )
            {
            // InternalAspectLang.g:5024:1: ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) )
            // InternalAspectLang.g:5025:1: ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* )
            {
            // InternalAspectLang.g:5025:1: ( ( rule__Collector__EventsAssignment_1 ) )
            // InternalAspectLang.g:5026:1: ( rule__Collector__EventsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }
            // InternalAspectLang.g:5027:1: ( rule__Collector__EventsAssignment_1 )
            // InternalAspectLang.g:5027:2: rule__Collector__EventsAssignment_1
            {
            pushFollow(FOLLOW_40);
            rule__Collector__EventsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }

            }

            // InternalAspectLang.g:5030:1: ( ( rule__Collector__EventsAssignment_1 )* )
            // InternalAspectLang.g:5031:1: ( rule__Collector__EventsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }
            // InternalAspectLang.g:5032:1: ( rule__Collector__EventsAssignment_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAspectLang.g:5032:2: rule__Collector__EventsAssignment_1
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__Collector__EventsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
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
    // $ANTLR end "rule__Collector__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__0"
    // InternalAspectLang.g:5047:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5051:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalAspectLang.g:5052:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Event__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0"


    // $ANTLR start "rule__Event__Group__0__Impl"
    // InternalAspectLang.g:5059:1: rule__Event__Group__0__Impl : ( ( rule__Event__TypeAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5063:1: ( ( ( rule__Event__TypeAssignment_0 ) ) )
            // InternalAspectLang.g:5064:1: ( ( rule__Event__TypeAssignment_0 ) )
            {
            // InternalAspectLang.g:5064:1: ( ( rule__Event__TypeAssignment_0 ) )
            // InternalAspectLang.g:5065:1: ( rule__Event__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeAssignment_0()); 
            }
            // InternalAspectLang.g:5066:1: ( rule__Event__TypeAssignment_0 )
            // InternalAspectLang.g:5066:2: rule__Event__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__0__Impl"


    // $ANTLR start "rule__Event__Group__1"
    // InternalAspectLang.g:5076:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5080:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalAspectLang.g:5081:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Event__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1"


    // $ANTLR start "rule__Event__Group__1__Impl"
    // InternalAspectLang.g:5088:1: rule__Event__Group__1__Impl : ( '(' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5092:1: ( ( '(' ) )
            // InternalAspectLang.g:5093:1: ( '(' )
            {
            // InternalAspectLang.g:5093:1: ( '(' )
            // InternalAspectLang.g:5094:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__1__Impl"


    // $ANTLR start "rule__Event__Group__2"
    // InternalAspectLang.g:5107:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5111:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalAspectLang.g:5112:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Event__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2"


    // $ANTLR start "rule__Event__Group__2__Impl"
    // InternalAspectLang.g:5119:1: rule__Event__Group__2__Impl : ( ( rule__Event__Group_2__0 )? ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5123:1: ( ( ( rule__Event__Group_2__0 )? ) )
            // InternalAspectLang.g:5124:1: ( ( rule__Event__Group_2__0 )? )
            {
            // InternalAspectLang.g:5124:1: ( ( rule__Event__Group_2__0 )? )
            // InternalAspectLang.g:5125:1: ( rule__Event__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2()); 
            }
            // InternalAspectLang.g:5126:1: ( rule__Event__Group_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_ID && LA42_0<=RULE_INT)||LA42_0==13||(LA42_0>=18 && LA42_0<=20)||(LA42_0>=46 && LA42_0<=49)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAspectLang.g:5126:2: rule__Event__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__2__Impl"


    // $ANTLR start "rule__Event__Group__3"
    // InternalAspectLang.g:5136:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5140:1: ( rule__Event__Group__3__Impl )
            // InternalAspectLang.g:5141:2: rule__Event__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3"


    // $ANTLR start "rule__Event__Group__3__Impl"
    // InternalAspectLang.g:5147:1: rule__Event__Group__3__Impl : ( ')' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5151:1: ( ( ')' ) )
            // InternalAspectLang.g:5152:1: ( ')' )
            {
            // InternalAspectLang.g:5152:1: ( ')' )
            // InternalAspectLang.g:5153:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group__3__Impl"


    // $ANTLR start "rule__Event__Group_2__0"
    // InternalAspectLang.g:5174:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5178:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalAspectLang.g:5179:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__Event__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__0"


    // $ANTLR start "rule__Event__Group_2__0__Impl"
    // InternalAspectLang.g:5186:1: rule__Event__Group_2__0__Impl : ( ( rule__Event__InitializationsAssignment_2_0 ) ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5190:1: ( ( ( rule__Event__InitializationsAssignment_2_0 ) ) )
            // InternalAspectLang.g:5191:1: ( ( rule__Event__InitializationsAssignment_2_0 ) )
            {
            // InternalAspectLang.g:5191:1: ( ( rule__Event__InitializationsAssignment_2_0 ) )
            // InternalAspectLang.g:5192:1: ( rule__Event__InitializationsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsAssignment_2_0()); 
            }
            // InternalAspectLang.g:5193:1: ( rule__Event__InitializationsAssignment_2_0 )
            // InternalAspectLang.g:5193:2: rule__Event__InitializationsAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__Event__InitializationsAssignment_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getInitializationsAssignment_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__0__Impl"


    // $ANTLR start "rule__Event__Group_2__1"
    // InternalAspectLang.g:5203:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5207:1: ( rule__Event__Group_2__1__Impl )
            // InternalAspectLang.g:5208:2: rule__Event__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__1"


    // $ANTLR start "rule__Event__Group_2__1__Impl"
    // InternalAspectLang.g:5214:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__Group_2_1__0 )* ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5218:1: ( ( ( rule__Event__Group_2_1__0 )* ) )
            // InternalAspectLang.g:5219:1: ( ( rule__Event__Group_2_1__0 )* )
            {
            // InternalAspectLang.g:5219:1: ( ( rule__Event__Group_2_1__0 )* )
            // InternalAspectLang.g:5220:1: ( rule__Event__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2_1()); 
            }
            // InternalAspectLang.g:5221:1: ( rule__Event__Group_2_1__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==34) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalAspectLang.g:5221:2: rule__Event__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Event__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__1__Impl"


    // $ANTLR start "rule__Event__Group_2_1__0"
    // InternalAspectLang.g:5235:1: rule__Event__Group_2_1__0 : rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 ;
    public final void rule__Event__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5239:1: ( rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 )
            // InternalAspectLang.g:5240:2: rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Event__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__0"


    // $ANTLR start "rule__Event__Group_2_1__0__Impl"
    // InternalAspectLang.g:5247:1: rule__Event__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5251:1: ( ( ',' ) )
            // InternalAspectLang.g:5252:1: ( ',' )
            {
            // InternalAspectLang.g:5252:1: ( ',' )
            // InternalAspectLang.g:5253:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getCommaKeyword_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__0__Impl"


    // $ANTLR start "rule__Event__Group_2_1__1"
    // InternalAspectLang.g:5266:1: rule__Event__Group_2_1__1 : rule__Event__Group_2_1__1__Impl ;
    public final void rule__Event__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5270:1: ( rule__Event__Group_2_1__1__Impl )
            // InternalAspectLang.g:5271:2: rule__Event__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__1"


    // $ANTLR start "rule__Event__Group_2_1__1__Impl"
    // InternalAspectLang.g:5277:1: rule__Event__Group_2_1__1__Impl : ( ( rule__Event__InitializationsAssignment_2_1_1 ) ) ;
    public final void rule__Event__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5281:1: ( ( ( rule__Event__InitializationsAssignment_2_1_1 ) ) )
            // InternalAspectLang.g:5282:1: ( ( rule__Event__InitializationsAssignment_2_1_1 ) )
            {
            // InternalAspectLang.g:5282:1: ( ( rule__Event__InitializationsAssignment_2_1_1 ) )
            // InternalAspectLang.g:5283:1: ( rule__Event__InitializationsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsAssignment_2_1_1()); 
            }
            // InternalAspectLang.g:5284:1: ( rule__Event__InitializationsAssignment_2_1_1 )
            // InternalAspectLang.g:5284:2: rule__Event__InitializationsAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__InitializationsAssignment_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getInitializationsAssignment_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_1__1__Impl"


    // $ANTLR start "rule__AspectModel__NameAssignment_1"
    // InternalAspectLang.g:5299:1: rule__AspectModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AspectModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5303:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:5304:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:5304:1: ( ruleQualifiedName )
            // InternalAspectLang.g:5305:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__NameAssignment_1"


    // $ANTLR start "rule__AspectModel__ImportsAssignment_2"
    // InternalAspectLang.g:5314:1: rule__AspectModel__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__AspectModel__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5318:1: ( ( ruleImport ) )
            // InternalAspectLang.g:5319:1: ( ruleImport )
            {
            // InternalAspectLang.g:5319:1: ( ruleImport )
            // InternalAspectLang.g:5320:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getImportsImportParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__ImportsAssignment_2"


    // $ANTLR start "rule__AspectModel__SourcesAssignment_3"
    // InternalAspectLang.g:5329:1: rule__AspectModel__SourcesAssignment_3 : ( ruleApplicationModel ) ;
    public final void rule__AspectModel__SourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5333:1: ( ( ruleApplicationModel ) )
            // InternalAspectLang.g:5334:1: ( ruleApplicationModel )
            {
            // InternalAspectLang.g:5334:1: ( ruleApplicationModel )
            // InternalAspectLang.g:5335:1: ruleApplicationModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getSourcesApplicationModelParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleApplicationModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getSourcesApplicationModelParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__SourcesAssignment_3"


    // $ANTLR start "rule__AspectModel__AdvicesAssignment_4_0"
    // InternalAspectLang.g:5344:1: rule__AspectModel__AdvicesAssignment_4_0 : ( ruleAdvice ) ;
    public final void rule__AspectModel__AdvicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5348:1: ( ( ruleAdvice ) )
            // InternalAspectLang.g:5349:1: ( ruleAdvice )
            {
            // InternalAspectLang.g:5349:1: ( ruleAdvice )
            // InternalAspectLang.g:5350:1: ruleAdvice
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getAdvicesAdviceParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdvice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getAdvicesAdviceParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__AdvicesAssignment_4_0"


    // $ANTLR start "rule__AspectModel__PointcutsAssignment_4_1"
    // InternalAspectLang.g:5359:1: rule__AspectModel__PointcutsAssignment_4_1 : ( rulePointcut ) ;
    public final void rule__AspectModel__PointcutsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5363:1: ( ( rulePointcut ) )
            // InternalAspectLang.g:5364:1: ( rulePointcut )
            {
            // InternalAspectLang.g:5364:1: ( rulePointcut )
            // InternalAspectLang.g:5365:1: rulePointcut
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getPointcutsPointcutParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePointcut();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getPointcutsPointcutParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__PointcutsAssignment_4_1"


    // $ANTLR start "rule__AspectModel__AspectsAssignment_4_2"
    // InternalAspectLang.g:5374:1: rule__AspectModel__AspectsAssignment_4_2 : ( ruleAspect ) ;
    public final void rule__AspectModel__AspectsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5378:1: ( ( ruleAspect ) )
            // InternalAspectLang.g:5379:1: ( ruleAspect )
            {
            // InternalAspectLang.g:5379:1: ( ruleAspect )
            // InternalAspectLang.g:5380:1: ruleAspect
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getAspectsAspectParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAspect();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectModelAccess().getAspectsAspectParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AspectModel__AspectsAssignment_4_2"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalAspectLang.g:5389:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5393:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAspectLang.g:5394:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAspectLang.g:5394:1: ( ruleQualifiedNameWithWildcard )
            // InternalAspectLang.g:5395:1: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__ApplicationModel__HandlerAssignment_1"
    // InternalAspectLang.g:5404:1: rule__ApplicationModel__HandlerAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__HandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5408:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5409:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5409:1: ( RULE_ID )
            // InternalAspectLang.g:5410:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getHandlerIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getApplicationModelAccess().getHandlerIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ApplicationModel__HandlerAssignment_1"


    // $ANTLR start "rule__ApplicationModel__NameAssignment_3"
    // InternalAspectLang.g:5419:1: rule__ApplicationModel__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5423:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5424:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5424:1: ( RULE_ID )
            // InternalAspectLang.g:5425:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5434:1: rule__ApplicationModel__ModelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5438:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:5439:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:5439:1: ( RULE_STRING )
            // InternalAspectLang.g:5440:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelSTRINGTerminalRuleCall_4_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Aspect__PointcutAssignment_1"
    // InternalAspectLang.g:5449:1: rule__Aspect__PointcutAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Aspect__PointcutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5453:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:5454:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:5454:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:5455:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutPointcutCrossReference_1_0()); 
            }
            // InternalAspectLang.g:5456:1: ( ruleQualifiedName )
            // InternalAspectLang.g:5457:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutPointcutQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getPointcutPointcutQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getPointcutPointcutCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__PointcutAssignment_1"


    // $ANTLR start "rule__Aspect__AdvicesAssignment_3"
    // InternalAspectLang.g:5468:1: rule__Aspect__AdvicesAssignment_3 : ( ruleUtilizeAdvice ) ;
    public final void rule__Aspect__AdvicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5472:1: ( ( ruleUtilizeAdvice ) )
            // InternalAspectLang.g:5473:1: ( ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:5473:1: ( ruleUtilizeAdvice )
            // InternalAspectLang.g:5474:1: ruleUtilizeAdvice
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesUtilizeAdviceParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUtilizeAdvice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAdvicesUtilizeAdviceParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__AdvicesAssignment_3"


    // $ANTLR start "rule__Aspect__AdvicesAssignment_4_1"
    // InternalAspectLang.g:5483:1: rule__Aspect__AdvicesAssignment_4_1 : ( ruleUtilizeAdvice ) ;
    public final void rule__Aspect__AdvicesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5487:1: ( ( ruleUtilizeAdvice ) )
            // InternalAspectLang.g:5488:1: ( ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:5488:1: ( ruleUtilizeAdvice )
            // InternalAspectLang.g:5489:1: ruleUtilizeAdvice
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesUtilizeAdviceParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleUtilizeAdvice();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAspectAccess().getAdvicesUtilizeAdviceParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Aspect__AdvicesAssignment_4_1"


    // $ANTLR start "rule__UtilizeAdvice__AdviceAssignment_0"
    // InternalAspectLang.g:5498:1: rule__UtilizeAdvice__AdviceAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UtilizeAdvice__AdviceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5502:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:5503:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:5503:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:5504:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAdviceCrossReference_0_0()); 
            }
            // InternalAspectLang.g:5505:1: ( ruleQualifiedName )
            // InternalAspectLang.g:5506:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAdviceQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getAdviceAdviceQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getAdviceAdviceCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__AdviceAssignment_0"


    // $ANTLR start "rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0"
    // InternalAspectLang.g:5517:1: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 : ( ruleValue ) ;
    public final void rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5521:1: ( ( ruleValue ) )
            // InternalAspectLang.g:5522:1: ( ruleValue )
            {
            // InternalAspectLang.g:5522:1: ( ruleValue )
            // InternalAspectLang.g:5523:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsValueParserRuleCall_1_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsValueParserRuleCall_1_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0"


    // $ANTLR start "rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1"
    // InternalAspectLang.g:5532:1: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 : ( ruleValue ) ;
    public final void rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5536:1: ( ( ruleValue ) )
            // InternalAspectLang.g:5537:1: ( ruleValue )
            {
            // InternalAspectLang.g:5537:1: ( ruleValue )
            // InternalAspectLang.g:5538:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsValueParserRuleCall_1_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsValueParserRuleCall_1_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1"


    // $ANTLR start "rule__Advice__NameAssignment_1"
    // InternalAspectLang.g:5547:1: rule__Advice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Advice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5551:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5552:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5552:1: ( RULE_ID )
            // InternalAspectLang.g:5553:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__NameAssignment_1"


    // $ANTLR start "rule__Advice__ParameterDeclarationsAssignment_2_1_0"
    // InternalAspectLang.g:5562:1: rule__Advice__ParameterDeclarationsAssignment_2_1_0 : ( ruleParameterDeclaration ) ;
    public final void rule__Advice__ParameterDeclarationsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5566:1: ( ( ruleParameterDeclaration ) )
            // InternalAspectLang.g:5567:1: ( ruleParameterDeclaration )
            {
            // InternalAspectLang.g:5567:1: ( ruleParameterDeclaration )
            // InternalAspectLang.g:5568:1: ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__ParameterDeclarationsAssignment_2_1_0"


    // $ANTLR start "rule__Advice__ParameterDeclarationsAssignment_2_1_1_1"
    // InternalAspectLang.g:5577:1: rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 : ( ruleParameterDeclaration ) ;
    public final void rule__Advice__ParameterDeclarationsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5581:1: ( ( ruleParameterDeclaration ) )
            // InternalAspectLang.g:5582:1: ( ruleParameterDeclaration )
            {
            // InternalAspectLang.g:5582:1: ( ruleParameterDeclaration )
            // InternalAspectLang.g:5583:1: ruleParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getParameterDeclarationsParameterDeclarationParserRuleCall_2_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__ParameterDeclarationsAssignment_2_1_1_1"


    // $ANTLR start "rule__Advice__CollectorsAssignment_4"
    // InternalAspectLang.g:5592:1: rule__Advice__CollectorsAssignment_4 : ( ruleCollector ) ;
    public final void rule__Advice__CollectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5596:1: ( ( ruleCollector ) )
            // InternalAspectLang.g:5597:1: ( ruleCollector )
            {
            // InternalAspectLang.g:5597:1: ( ruleCollector )
            // InternalAspectLang.g:5598:1: ruleCollector
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getCollectorsCollectorParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCollector();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getCollectorsCollectorParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Advice__CollectorsAssignment_4"


    // $ANTLR start "rule__ParameterDeclaration__TypeAssignment_0"
    // InternalAspectLang.g:5607:1: rule__ParameterDeclaration__TypeAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__ParameterDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5611:1: ( ( ( 'type' ) ) )
            // InternalAspectLang.g:5612:1: ( ( 'type' ) )
            {
            // InternalAspectLang.g:5612:1: ( ( 'type' ) )
            // InternalAspectLang.g:5613:1: ( 'type' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeTypeKeyword_0_0()); 
            }
            // InternalAspectLang.g:5614:1: ( 'type' )
            // InternalAspectLang.g:5615:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getTypeTypeKeyword_0_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getTypeTypeKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getTypeTypeKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__ParameterDeclaration__NameAssignment_1"
    // InternalAspectLang.g:5630:1: rule__ParameterDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5634:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5635:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5635:1: ( RULE_ID )
            // InternalAspectLang.g:5636:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Pointcut__AnnotationAssignment_0"
    // InternalAspectLang.g:5645:1: rule__Pointcut__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Pointcut__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5649:1: ( ( ruleAnnotation ) )
            // InternalAspectLang.g:5650:1: ( ruleAnnotation )
            {
            // InternalAspectLang.g:5650:1: ( ruleAnnotation )
            // InternalAspectLang.g:5651:1: ruleAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getAnnotationAnnotationParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__AnnotationAssignment_0"


    // $ANTLR start "rule__Pointcut__NameAssignment_2"
    // InternalAspectLang.g:5660:1: rule__Pointcut__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pointcut__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5664:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5665:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5665:1: ( RULE_ID )
            // InternalAspectLang.g:5666:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__NameAssignment_2"


    // $ANTLR start "rule__Pointcut__LocationAssignment_4"
    // InternalAspectLang.g:5675:1: rule__Pointcut__LocationAssignment_4 : ( ruleLocationQuery ) ;
    public final void rule__Pointcut__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5679:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:5680:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:5680:1: ( ruleLocationQuery )
            // InternalAspectLang.g:5681:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getLocationLocationQueryParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getLocationLocationQueryParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__LocationAssignment_4"


    // $ANTLR start "rule__Pointcut__MethodAssignment_5_1"
    // InternalAspectLang.g:5690:1: rule__Pointcut__MethodAssignment_5_1 : ( ruleMethodQuery ) ;
    public final void rule__Pointcut__MethodAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5694:1: ( ( ruleMethodQuery ) )
            // InternalAspectLang.g:5695:1: ( ruleMethodQuery )
            {
            // InternalAspectLang.g:5695:1: ( ruleMethodQuery )
            // InternalAspectLang.g:5696:1: ruleMethodQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getMethodMethodQueryParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMethodQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getMethodMethodQueryParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__MethodAssignment_5_1"


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // InternalAspectLang.g:5705:1: rule__Annotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5709:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5710:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5710:1: ( RULE_ID )
            // InternalAspectLang.g:5711:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__NameAssignment_1"


    // $ANTLR start "rule__Annotation__ValueAssignment_2"
    // InternalAspectLang.g:5720:1: rule__Annotation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5724:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:5725:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:5725:1: ( RULE_STRING )
            // InternalAspectLang.g:5726:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__ValueAssignment_2"


    // $ANTLR start "rule__MethodQuery__ModifierAssignment_1"
    // InternalAspectLang.g:5735:1: rule__MethodQuery__ModifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MethodQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5739:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:5740:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:5740:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5741:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getModifierMethodModifierCrossReference_1_0()); 
            }
            // InternalAspectLang.g:5742:1: ( RULE_ID )
            // InternalAspectLang.g:5743:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getModifierMethodModifierIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getModifierMethodModifierIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getModifierMethodModifierCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__ModifierAssignment_1"


    // $ANTLR start "rule__MethodQuery__ReturnTypeAssignment_2"
    // InternalAspectLang.g:5754:1: rule__MethodQuery__ReturnTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MethodQuery__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5758:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:5759:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:5759:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5760:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getReturnTypeTypeCrossReference_2_0()); 
            }
            // InternalAspectLang.g:5761:1: ( RULE_ID )
            // InternalAspectLang.g:5762:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getReturnTypeTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getReturnTypeTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getReturnTypeTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__ReturnTypeAssignment_2"


    // $ANTLR start "rule__MethodQuery__MethodReferenceAssignment_3_0_0"
    // InternalAspectLang.g:5773:1: rule__MethodQuery__MethodReferenceAssignment_3_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__MethodQuery__MethodReferenceAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5777:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:5778:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:5778:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5779:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getMethodReferenceMethodCrossReference_3_0_0_0()); 
            }
            // InternalAspectLang.g:5780:1: ( RULE_ID )
            // InternalAspectLang.g:5781:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getMethodReferenceMethodIDTerminalRuleCall_3_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getMethodReferenceMethodIDTerminalRuleCall_3_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getMethodReferenceMethodCrossReference_3_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__MethodReferenceAssignment_3_0_0"


    // $ANTLR start "rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1"
    // InternalAspectLang.g:5792:1: rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1 : ( ruleParameterQuery ) ;
    public final void rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5796:1: ( ( ruleParameterQuery ) )
            // InternalAspectLang.g:5797:1: ( ruleParameterQuery )
            {
            // InternalAspectLang.g:5797:1: ( ruleParameterQuery )
            // InternalAspectLang.g:5798:1: ruleParameterQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__ParameterQueriesAssignment_3_0_1_1"


    // $ANTLR start "rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1"
    // InternalAspectLang.g:5807:1: rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1 : ( ruleParameterQuery ) ;
    public final void rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5811:1: ( ( ruleParameterQuery ) )
            // InternalAspectLang.g:5812:1: ( ruleParameterQuery )
            {
            // InternalAspectLang.g:5812:1: ( ruleParameterQuery )
            // InternalAspectLang.g:5813:1: ruleParameterQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMethodQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMethodQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MethodQuery__ParameterQueriesAssignment_3_0_1_2_1"


    // $ANTLR start "rule__ParameterQuery__ModifierAssignment_0"
    // InternalAspectLang.g:5822:1: rule__ParameterQuery__ModifierAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5826:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:5827:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:5827:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5828:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_0_0()); 
            }
            // InternalAspectLang.g:5829:1: ( RULE_ID )
            // InternalAspectLang.g:5830:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__ModifierAssignment_0"


    // $ANTLR start "rule__ParameterQuery__TypeAssignment_1"
    // InternalAspectLang.g:5841:1: rule__ParameterQuery__TypeAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5845:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:5846:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:5846:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5847:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getTypeTypeCrossReference_1_0()); 
            }
            // InternalAspectLang.g:5848:1: ( RULE_ID )
            // InternalAspectLang.g:5849:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getTypeTypeIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getTypeTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__TypeAssignment_1"


    // $ANTLR start "rule__ParameterQuery__ParameterAssignment_2"
    // InternalAspectLang.g:5860:1: rule__ParameterQuery__ParameterAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__ParameterAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5864:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:5865:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:5865:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5866:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_2_0()); 
            }
            // InternalAspectLang.g:5867:1: ( RULE_ID )
            // InternalAspectLang.g:5868:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__ParameterAssignment_2"


    // $ANTLR start "rule__LocationQuery__NodeAssignment_0"
    // InternalAspectLang.g:5879:1: rule__LocationQuery__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5883:1: ( ( ruleNode ) )
            // InternalAspectLang.g:5884:1: ( ruleNode )
            {
            // InternalAspectLang.g:5884:1: ( ruleNode )
            // InternalAspectLang.g:5885:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__LocationQuery__SpecializationAssignment_1_0_1"
    // InternalAspectLang.g:5894:1: rule__LocationQuery__SpecializationAssignment_1_0_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5898:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:5899:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:5899:1: ( ruleLocationQuery )
            // InternalAspectLang.g:5900:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_1_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__SpecializationAssignment_1_0_1"


    // $ANTLR start "rule__LocationQuery__CompositionAssignment_1_1"
    // InternalAspectLang.g:5909:1: rule__LocationQuery__CompositionAssignment_1_1 : ( ruleCompositionQuery ) ;
    public final void rule__LocationQuery__CompositionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5913:1: ( ( ruleCompositionQuery ) )
            // InternalAspectLang.g:5914:1: ( ruleCompositionQuery )
            {
            // InternalAspectLang.g:5914:1: ( ruleCompositionQuery )
            // InternalAspectLang.g:5915:1: ruleCompositionQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getCompositionCompositionQueryParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompositionQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getCompositionCompositionQueryParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__CompositionAssignment_1_1"


    // $ANTLR start "rule__CompositionQuery__ModifierAssignment_1"
    // InternalAspectLang.g:5924:1: rule__CompositionQuery__ModifierAssignment_1 : ( ruleQueryModifier ) ;
    public final void rule__CompositionQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5928:1: ( ( ruleQueryModifier ) )
            // InternalAspectLang.g:5929:1: ( ruleQueryModifier )
            {
            // InternalAspectLang.g:5929:1: ( ruleQueryModifier )
            // InternalAspectLang.g:5930:1: ruleQueryModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getModifierQueryModifierEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQueryModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getModifierQueryModifierEnumRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__ModifierAssignment_1"


    // $ANTLR start "rule__CompositionQuery__SubQueriesAssignment_3"
    // InternalAspectLang.g:5939:1: rule__CompositionQuery__SubQueriesAssignment_3 : ( ruleLocationQuery ) ;
    public final void rule__CompositionQuery__SubQueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5943:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:5944:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:5944:1: ( ruleLocationQuery )
            // InternalAspectLang.g:5945:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getSubQueriesLocationQueryParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getSubQueriesLocationQueryParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__SubQueriesAssignment_3"


    // $ANTLR start "rule__Node__ParameterAssignment_1"
    // InternalAspectLang.g:5954:1: rule__Node__ParameterAssignment_1 : ( ruleParamQuery ) ;
    public final void rule__Node__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5958:1: ( ( ruleParamQuery ) )
            // InternalAspectLang.g:5959:1: ( ruleParamQuery )
            {
            // InternalAspectLang.g:5959:1: ( ruleParamQuery )
            // InternalAspectLang.g:5960:1: ruleParamQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getParameterParamQueryParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:5969:1: rule__ParamQuery__QueriesAssignment_1 : ( ruleParamOperator ) ;
    public final void rule__ParamQuery__QueriesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5973:1: ( ( ruleParamOperator ) )
            // InternalAspectLang.g:5974:1: ( ruleParamOperator )
            {
            // InternalAspectLang.g:5974:1: ( ruleParamOperator )
            // InternalAspectLang.g:5975:1: ruleParamOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamQueryAccess().getQueriesParamOperatorParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamQueryAccess().getQueriesParamOperatorParserRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ParamOperator__LogicAssignment_1_1"
    // InternalAspectLang.g:5984:1: rule__ParamOperator__LogicAssignment_1_1 : ( ruleLogicOperator ) ;
    public final void rule__ParamOperator__LogicAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5988:1: ( ( ruleLogicOperator ) )
            // InternalAspectLang.g:5989:1: ( ruleLogicOperator )
            {
            // InternalAspectLang.g:5989:1: ( ruleLogicOperator )
            // InternalAspectLang.g:5990:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorAccess().getLogicLogicOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorAccess().getLogicLogicOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__LogicAssignment_1_1"


    // $ANTLR start "rule__ParamOperator__RightAssignment_1_2"
    // InternalAspectLang.g:5999:1: rule__ParamOperator__RightAssignment_1_2 : ( ruleParamCompare ) ;
    public final void rule__ParamOperator__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6003:1: ( ( ruleParamCompare ) )
            // InternalAspectLang.g:6004:1: ( ruleParamCompare )
            {
            // InternalAspectLang.g:6004:1: ( ruleParamCompare )
            // InternalAspectLang.g:6005:1: ruleParamCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamOperatorAccess().getRightParamCompareParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParamCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamOperatorAccess().getRightParamCompareParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamOperator__RightAssignment_1_2"


    // $ANTLR start "rule__ParamCompare__OperatorAssignment_1_1"
    // InternalAspectLang.g:6014:1: rule__ParamCompare__OperatorAssignment_1_1 : ( ruleLogicOperator ) ;
    public final void rule__ParamCompare__OperatorAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6018:1: ( ( ruleLogicOperator ) )
            // InternalAspectLang.g:6019:1: ( ruleLogicOperator )
            {
            // InternalAspectLang.g:6019:1: ( ruleLogicOperator )
            // InternalAspectLang.g:6020:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getOperatorLogicOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getOperatorLogicOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__OperatorAssignment_1_1"


    // $ANTLR start "rule__ParamCompare__RightAssignment_1_2"
    // InternalAspectLang.g:6029:1: rule__ParamCompare__RightAssignment_1_2 : ( ruleValue ) ;
    public final void rule__ParamCompare__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6033:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6034:1: ( ruleValue )
            {
            // InternalAspectLang.g:6034:1: ( ruleValue )
            // InternalAspectLang.g:6035:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamCompare__RightAssignment_1_2"


    // $ANTLR start "rule__FloatValue__ValueAssignment"
    // InternalAspectLang.g:6044:1: rule__FloatValue__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6048:1: ( ( RULE_FLOAT ) )
            // InternalAspectLang.g:6049:1: ( RULE_FLOAT )
            {
            // InternalAspectLang.g:6049:1: ( RULE_FLOAT )
            // InternalAspectLang.g:6050:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6059:1: rule__IntValue__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6063:1: ( ( RULE_INT ) )
            // InternalAspectLang.g:6064:1: ( RULE_INT )
            {
            // InternalAspectLang.g:6064:1: ( RULE_INT )
            // InternalAspectLang.g:6065:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6074:1: rule__StringValue__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6078:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:6079:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:6079:1: ( RULE_STRING )
            // InternalAspectLang.g:6080:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6089:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6093:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6094:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6094:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6095:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:6104:1: rule__ReferenceValue__ParameterAssignment_1 : ( ruleParameter ) ;
    public final void rule__ReferenceValue__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6108:1: ( ( ruleParameter ) )
            // InternalAspectLang.g:6109:1: ( ruleParameter )
            {
            // InternalAspectLang.g:6109:1: ( ruleParameter )
            // InternalAspectLang.g:6110:1: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:6119:1: rule__InternalFunctionProperty__FunctionAssignment : ( ruleInternalFunction ) ;
    public final void rule__InternalFunctionProperty__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6123:1: ( ( ruleInternalFunction ) )
            // InternalAspectLang.g:6124:1: ( ruleInternalFunction )
            {
            // InternalAspectLang.g:6124:1: ( ruleInternalFunction )
            // InternalAspectLang.g:6125:1: ruleInternalFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionPropertyAccess().getFunctionInternalFunctionEnumRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:6134:1: rule__RuntimeProperty__ReferenceAssignment_1 : ( RULE_ID ) ;
    public final void rule__RuntimeProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6138:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6139:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6139:1: ( RULE_ID )
            // InternalAspectLang.g:6140:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6149:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6153:1: ( ( ruleReflectionFunction ) )
            // InternalAspectLang.g:6154:1: ( ruleReflectionFunction )
            {
            // InternalAspectLang.g:6154:1: ( ruleReflectionFunction )
            // InternalAspectLang.g:6155:1: ruleReflectionFunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalAspectLang.g:6164:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6168:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6169:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6169:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6170:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
            }
            // InternalAspectLang.g:6171:1: ( RULE_ID )
            // InternalAspectLang.g:6172:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6183:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6187:1: ( ( ruleInsertionPoint ) )
            // InternalAspectLang.g:6188:1: ( ruleInsertionPoint )
            {
            // InternalAspectLang.g:6188:1: ( ruleInsertionPoint )
            // InternalAspectLang.g:6189:1: ruleInsertionPoint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointInsertionPointEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Collector__EventsAssignment_1"
    // InternalAspectLang.g:6198:1: rule__Collector__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__Collector__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6202:1: ( ( ruleEvent ) )
            // InternalAspectLang.g:6203:1: ( ruleEvent )
            {
            // InternalAspectLang.g:6203:1: ( ruleEvent )
            // InternalAspectLang.g:6204:1: ruleEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsEventParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getEventsEventParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Collector__EventsAssignment_1"


    // $ANTLR start "rule__Event__TypeAssignment_0"
    // InternalAspectLang.g:6213:1: rule__Event__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Event__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6217:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:6218:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:6218:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6219:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeRecordTypeCrossReference_0_0()); 
            }
            // InternalAspectLang.g:6220:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6221:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeRecordTypeQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getTypeRecordTypeQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getTypeRecordTypeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__TypeAssignment_0"


    // $ANTLR start "rule__Event__InitializationsAssignment_2_0"
    // InternalAspectLang.g:6232:1: rule__Event__InitializationsAssignment_2_0 : ( ruleValue ) ;
    public final void rule__Event__InitializationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6236:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6237:1: ( ruleValue )
            {
            // InternalAspectLang.g:6237:1: ( ruleValue )
            // InternalAspectLang.g:6238:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsValueParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getInitializationsValueParserRuleCall_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__InitializationsAssignment_2_0"


    // $ANTLR start "rule__Event__InitializationsAssignment_2_1_1"
    // InternalAspectLang.g:6247:1: rule__Event__InitializationsAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__Event__InitializationsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6251:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6252:1: ( ruleValue )
            {
            // InternalAspectLang.g:6252:1: ( ruleValue )
            // InternalAspectLang.g:6253:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsValueParserRuleCall_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getInitializationsValueParserRuleCall_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__InitializationsAssignment_2_1_1"

    // $ANTLR start synpred36_InternalAspectLang
    public final void synpred36_InternalAspectLang_fragment() throws RecognitionException {   
        // InternalAspectLang.g:3421:2: ( rule__MethodQuery__ModifierAssignment_1 )
        // InternalAspectLang.g:3421:2: rule__MethodQuery__ModifierAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__MethodQuery__ModifierAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred36_InternalAspectLang

    // $ANTLR start synpred40_InternalAspectLang
    public final void synpred40_InternalAspectLang_fragment() throws RecognitionException {   
        // InternalAspectLang.g:3766:2: ( rule__ParameterQuery__ModifierAssignment_0 )
        // InternalAspectLang.g:3766:2: rule__ParameterQuery__ModifierAssignment_0
        {
        pushFollow(FOLLOW_2);
        rule__ParameterQuery__ModifierAssignment_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred40_InternalAspectLang

    // $ANTLR start synpred48_InternalAspectLang
    public final void synpred48_InternalAspectLang_fragment() throws RecognitionException {   
        // InternalAspectLang.g:4489:2: ( rule__ParamCompare__Group_1__0 )
        // InternalAspectLang.g:4489:2: rule__ParamCompare__Group_1__0
        {
        pushFollow(FOLLOW_2);
        rule__ParamCompare__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred48_InternalAspectLang

    // Delegated rules

    public final boolean synpred40_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred40_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred48_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred48_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA39 dfa39 = new DFA39(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\3\21\uffff";
    static final String dfa_3s = "\1\4\2\0\17\uffff";
    static final String dfa_4s = "\1\61\2\0\17\uffff";
    static final String dfa_5s = "\3\uffff\1\2\15\uffff\1\1";
    static final String dfa_6s = "\1\uffff\1\0\1\1\17\uffff}>";
    static final String[] dfa_7s = {
            "\4\3\5\uffff\1\3\2\uffff\1\1\1\2\3\3\30\uffff\5\3",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "4489:1: ( rule__ParamCompare__Group_1__0 )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_1 = input.LA(1);

                         
                        int index39_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalAspectLang()) ) {s = 17;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index39_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_2 = input.LA(1);

                         
                        int index39_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred48_InternalAspectLang()) ) {s = 17;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index39_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000092130000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000092100000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0003C010001C20F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0003C000001C20F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008006000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000006000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0004001000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000090000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003000000002010L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000408000C000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0003008000002010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0003000000002012L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0003C000001C20F2L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000012L});

}
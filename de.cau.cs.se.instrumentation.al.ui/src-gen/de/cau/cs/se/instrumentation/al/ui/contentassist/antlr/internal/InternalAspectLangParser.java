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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'before'", "'after'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'classname'", "'return-type'", "'include'", "'exclude'", "'&&'", "'||'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'package'", "'import'", "'use'", "'on'", "'aspect'", "':'", "','", "'('", "')'", "'advice'", "'{'", "'}'", "'$'", "'pointcut'", "'class'", "'operation'", "'@'", "'.'", "'['", "']'", "'**'", "'up'", "'#'", "'istypeof'", "'type'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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


    // $ANTLR start "entryRuleAspect"
    // InternalAspectLang.g:145:1: entryRuleAspect : ruleAspect EOF ;
    public final void entryRuleAspect() throws RecognitionException {
        try {
            // InternalAspectLang.g:146:1: ( ruleAspect EOF )
            // InternalAspectLang.g:147:1: ruleAspect EOF
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
    // InternalAspectLang.g:154:1: ruleAspect : ( ( rule__Aspect__Group__0 ) ) ;
    public final void ruleAspect() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:158:2: ( ( ( rule__Aspect__Group__0 ) ) )
            // InternalAspectLang.g:159:1: ( ( rule__Aspect__Group__0 ) )
            {
            // InternalAspectLang.g:159:1: ( ( rule__Aspect__Group__0 ) )
            // InternalAspectLang.g:160:1: ( rule__Aspect__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup()); 
            }
            // InternalAspectLang.g:161:1: ( rule__Aspect__Group__0 )
            // InternalAspectLang.g:161:2: rule__Aspect__Group__0
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
    // InternalAspectLang.g:173:1: entryRuleUtilizeAdvice : ruleUtilizeAdvice EOF ;
    public final void entryRuleUtilizeAdvice() throws RecognitionException {
        try {
            // InternalAspectLang.g:174:1: ( ruleUtilizeAdvice EOF )
            // InternalAspectLang.g:175:1: ruleUtilizeAdvice EOF
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
    // InternalAspectLang.g:182:1: ruleUtilizeAdvice : ( ( rule__UtilizeAdvice__Group__0 ) ) ;
    public final void ruleUtilizeAdvice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:186:2: ( ( ( rule__UtilizeAdvice__Group__0 ) ) )
            // InternalAspectLang.g:187:1: ( ( rule__UtilizeAdvice__Group__0 ) )
            {
            // InternalAspectLang.g:187:1: ( ( rule__UtilizeAdvice__Group__0 ) )
            // InternalAspectLang.g:188:1: ( rule__UtilizeAdvice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup()); 
            }
            // InternalAspectLang.g:189:1: ( rule__UtilizeAdvice__Group__0 )
            // InternalAspectLang.g:189:2: rule__UtilizeAdvice__Group__0
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
    // InternalAspectLang.g:201:1: entryRuleAdvice : ruleAdvice EOF ;
    public final void entryRuleAdvice() throws RecognitionException {
        try {
            // InternalAspectLang.g:202:1: ( ruleAdvice EOF )
            // InternalAspectLang.g:203:1: ruleAdvice EOF
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
    // InternalAspectLang.g:210:1: ruleAdvice : ( ( rule__Advice__Group__0 ) ) ;
    public final void ruleAdvice() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:214:2: ( ( ( rule__Advice__Group__0 ) ) )
            // InternalAspectLang.g:215:1: ( ( rule__Advice__Group__0 ) )
            {
            // InternalAspectLang.g:215:1: ( ( rule__Advice__Group__0 ) )
            // InternalAspectLang.g:216:1: ( rule__Advice__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup()); 
            }
            // InternalAspectLang.g:217:1: ( rule__Advice__Group__0 )
            // InternalAspectLang.g:217:2: rule__Advice__Group__0
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


    // $ANTLR start "entryRuleAdviceParameterDeclaration"
    // InternalAspectLang.g:229:1: entryRuleAdviceParameterDeclaration : ruleAdviceParameterDeclaration EOF ;
    public final void entryRuleAdviceParameterDeclaration() throws RecognitionException {
        try {
            // InternalAspectLang.g:230:1: ( ruleAdviceParameterDeclaration EOF )
            // InternalAspectLang.g:231:1: ruleAdviceParameterDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdviceParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterDeclarationRule()); 
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
    // $ANTLR end "entryRuleAdviceParameterDeclaration"


    // $ANTLR start "ruleAdviceParameterDeclaration"
    // InternalAspectLang.g:238:1: ruleAdviceParameterDeclaration : ( ( rule__AdviceParameterDeclaration__Group__0 ) ) ;
    public final void ruleAdviceParameterDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:242:2: ( ( ( rule__AdviceParameterDeclaration__Group__0 ) ) )
            // InternalAspectLang.g:243:1: ( ( rule__AdviceParameterDeclaration__Group__0 ) )
            {
            // InternalAspectLang.g:243:1: ( ( rule__AdviceParameterDeclaration__Group__0 ) )
            // InternalAspectLang.g:244:1: ( rule__AdviceParameterDeclaration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getGroup()); 
            }
            // InternalAspectLang.g:245:1: ( rule__AdviceParameterDeclaration__Group__0 )
            // InternalAspectLang.g:245:2: rule__AdviceParameterDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameterDeclaration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterDeclarationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdviceParameterDeclaration"


    // $ANTLR start "entryRuleCollector"
    // InternalAspectLang.g:257:1: entryRuleCollector : ruleCollector EOF ;
    public final void entryRuleCollector() throws RecognitionException {
        try {
            // InternalAspectLang.g:258:1: ( ruleCollector EOF )
            // InternalAspectLang.g:259:1: ruleCollector EOF
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
    // InternalAspectLang.g:266:1: ruleCollector : ( ( rule__Collector__Group__0 ) ) ;
    public final void ruleCollector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:270:2: ( ( ( rule__Collector__Group__0 ) ) )
            // InternalAspectLang.g:271:1: ( ( rule__Collector__Group__0 ) )
            {
            // InternalAspectLang.g:271:1: ( ( rule__Collector__Group__0 ) )
            // InternalAspectLang.g:272:1: ( rule__Collector__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getGroup()); 
            }
            // InternalAspectLang.g:273:1: ( rule__Collector__Group__0 )
            // InternalAspectLang.g:273:2: rule__Collector__Group__0
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
    // InternalAspectLang.g:285:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalAspectLang.g:286:1: ( ruleEvent EOF )
            // InternalAspectLang.g:287:1: ruleEvent EOF
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
    // InternalAspectLang.g:294:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:298:2: ( ( ( rule__Event__Group__0 ) ) )
            // InternalAspectLang.g:299:1: ( ( rule__Event__Group__0 ) )
            {
            // InternalAspectLang.g:299:1: ( ( rule__Event__Group__0 ) )
            // InternalAspectLang.g:300:1: ( rule__Event__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup()); 
            }
            // InternalAspectLang.g:301:1: ( rule__Event__Group__0 )
            // InternalAspectLang.g:301:2: rule__Event__Group__0
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


    // $ANTLR start "entryRuleValue"
    // InternalAspectLang.g:313:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalAspectLang.g:314:1: ( ruleValue EOF )
            // InternalAspectLang.g:315:1: ruleValue EOF
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
    // InternalAspectLang.g:322:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:326:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalAspectLang.g:327:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalAspectLang.g:327:1: ( ( rule__Value__Alternatives ) )
            // InternalAspectLang.g:328:1: ( rule__Value__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValueAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:329:1: ( rule__Value__Alternatives )
            // InternalAspectLang.g:329:2: rule__Value__Alternatives
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


    // $ANTLR start "entryRuleReferenceValue"
    // InternalAspectLang.g:341:1: entryRuleReferenceValue : ruleReferenceValue EOF ;
    public final void entryRuleReferenceValue() throws RecognitionException {
        try {
            // InternalAspectLang.g:342:1: ( ruleReferenceValue EOF )
            // InternalAspectLang.g:343:1: ruleReferenceValue EOF
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
    // InternalAspectLang.g:350:1: ruleReferenceValue : ( ( rule__ReferenceValue__Group__0 ) ) ;
    public final void ruleReferenceValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:354:2: ( ( ( rule__ReferenceValue__Group__0 ) ) )
            // InternalAspectLang.g:355:1: ( ( rule__ReferenceValue__Group__0 ) )
            {
            // InternalAspectLang.g:355:1: ( ( rule__ReferenceValue__Group__0 ) )
            // InternalAspectLang.g:356:1: ( rule__ReferenceValue__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getGroup()); 
            }
            // InternalAspectLang.g:357:1: ( rule__ReferenceValue__Group__0 )
            // InternalAspectLang.g:357:2: rule__ReferenceValue__Group__0
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


    // $ANTLR start "entryRuleProperty"
    // InternalAspectLang.g:369:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:370:1: ( ruleProperty EOF )
            // InternalAspectLang.g:371:1: ruleProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyRule()); 
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
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // InternalAspectLang.g:378:1: ruleProperty : ( ( rule__Property__Alternatives ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:382:2: ( ( ( rule__Property__Alternatives ) ) )
            // InternalAspectLang.g:383:1: ( ( rule__Property__Alternatives ) )
            {
            // InternalAspectLang.g:383:1: ( ( rule__Property__Alternatives ) )
            // InternalAspectLang.g:384:1: ( rule__Property__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:385:1: ( rule__Property__Alternatives )
            // InternalAspectLang.g:385:2: rule__Property__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Property__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getAlternatives()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleInternalFunctionProperty"
    // InternalAspectLang.g:397:1: entryRuleInternalFunctionProperty : ruleInternalFunctionProperty EOF ;
    public final void entryRuleInternalFunctionProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:398:1: ( ruleInternalFunctionProperty EOF )
            // InternalAspectLang.g:399:1: ruleInternalFunctionProperty EOF
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
    // InternalAspectLang.g:406:1: ruleInternalFunctionProperty : ( ( rule__InternalFunctionProperty__FunctionAssignment ) ) ;
    public final void ruleInternalFunctionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:410:2: ( ( ( rule__InternalFunctionProperty__FunctionAssignment ) ) )
            // InternalAspectLang.g:411:1: ( ( rule__InternalFunctionProperty__FunctionAssignment ) )
            {
            // InternalAspectLang.g:411:1: ( ( rule__InternalFunctionProperty__FunctionAssignment ) )
            // InternalAspectLang.g:412:1: ( rule__InternalFunctionProperty__FunctionAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionPropertyAccess().getFunctionAssignment()); 
            }
            // InternalAspectLang.g:413:1: ( rule__InternalFunctionProperty__FunctionAssignment )
            // InternalAspectLang.g:413:2: rule__InternalFunctionProperty__FunctionAssignment
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


    // $ANTLR start "entryRuleReflectionProperty"
    // InternalAspectLang.g:425:1: entryRuleReflectionProperty : ruleReflectionProperty EOF ;
    public final void entryRuleReflectionProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:426:1: ( ruleReflectionProperty EOF )
            // InternalAspectLang.g:427:1: ruleReflectionProperty EOF
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
    // InternalAspectLang.g:434:1: ruleReflectionProperty : ( ( rule__ReflectionProperty__Group__0 ) ) ;
    public final void ruleReflectionProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:438:2: ( ( ( rule__ReflectionProperty__Group__0 ) ) )
            // InternalAspectLang.g:439:1: ( ( rule__ReflectionProperty__Group__0 ) )
            {
            // InternalAspectLang.g:439:1: ( ( rule__ReflectionProperty__Group__0 ) )
            // InternalAspectLang.g:440:1: ( rule__ReflectionProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getGroup()); 
            }
            // InternalAspectLang.g:441:1: ( rule__ReflectionProperty__Group__0 )
            // InternalAspectLang.g:441:2: rule__ReflectionProperty__Group__0
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


    // $ANTLR start "entryRulePointcut"
    // InternalAspectLang.g:453:1: entryRulePointcut : rulePointcut EOF ;
    public final void entryRulePointcut() throws RecognitionException {
        try {
            // InternalAspectLang.g:454:1: ( rulePointcut EOF )
            // InternalAspectLang.g:455:1: rulePointcut EOF
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
    // InternalAspectLang.g:462:1: rulePointcut : ( ( rule__Pointcut__Group__0 ) ) ;
    public final void rulePointcut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:466:2: ( ( ( rule__Pointcut__Group__0 ) ) )
            // InternalAspectLang.g:467:1: ( ( rule__Pointcut__Group__0 ) )
            {
            // InternalAspectLang.g:467:1: ( ( rule__Pointcut__Group__0 ) )
            // InternalAspectLang.g:468:1: ( rule__Pointcut__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup()); 
            }
            // InternalAspectLang.g:469:1: ( rule__Pointcut__Group__0 )
            // InternalAspectLang.g:469:2: rule__Pointcut__Group__0
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
    // InternalAspectLang.g:481:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalAspectLang.g:482:1: ( ruleAnnotation EOF )
            // InternalAspectLang.g:483:1: ruleAnnotation EOF
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
    // InternalAspectLang.g:490:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:494:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalAspectLang.g:495:1: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalAspectLang.g:495:1: ( ( rule__Annotation__Group__0 ) )
            // InternalAspectLang.g:496:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // InternalAspectLang.g:497:1: ( rule__Annotation__Group__0 )
            // InternalAspectLang.g:497:2: rule__Annotation__Group__0
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


    // $ANTLR start "entryRuleLocationQuery"
    // InternalAspectLang.g:509:1: entryRuleLocationQuery : ruleLocationQuery EOF ;
    public final void entryRuleLocationQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:510:1: ( ruleLocationQuery EOF )
            // InternalAspectLang.g:511:1: ruleLocationQuery EOF
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
    // InternalAspectLang.g:518:1: ruleLocationQuery : ( ( rule__LocationQuery__Group__0 ) ) ;
    public final void ruleLocationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:522:2: ( ( ( rule__LocationQuery__Group__0 ) ) )
            // InternalAspectLang.g:523:1: ( ( rule__LocationQuery__Group__0 ) )
            {
            // InternalAspectLang.g:523:1: ( ( rule__LocationQuery__Group__0 ) )
            // InternalAspectLang.g:524:1: ( rule__LocationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:525:1: ( rule__LocationQuery__Group__0 )
            // InternalAspectLang.g:525:2: rule__LocationQuery__Group__0
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
    // InternalAspectLang.g:537:1: entryRuleCompositionQuery : ruleCompositionQuery EOF ;
    public final void entryRuleCompositionQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:538:1: ( ruleCompositionQuery EOF )
            // InternalAspectLang.g:539:1: ruleCompositionQuery EOF
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
    // InternalAspectLang.g:546:1: ruleCompositionQuery : ( ( rule__CompositionQuery__Group__0 ) ) ;
    public final void ruleCompositionQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:550:2: ( ( ( rule__CompositionQuery__Group__0 ) ) )
            // InternalAspectLang.g:551:1: ( ( rule__CompositionQuery__Group__0 ) )
            {
            // InternalAspectLang.g:551:1: ( ( rule__CompositionQuery__Group__0 ) )
            // InternalAspectLang.g:552:1: ( rule__CompositionQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:553:1: ( rule__CompositionQuery__Group__0 )
            // InternalAspectLang.g:553:2: rule__CompositionQuery__Group__0
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


    // $ANTLR start "entryRuleOperationQuery"
    // InternalAspectLang.g:565:1: entryRuleOperationQuery : ruleOperationQuery EOF ;
    public final void entryRuleOperationQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:566:1: ( ruleOperationQuery EOF )
            // InternalAspectLang.g:567:1: ruleOperationQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOperationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryRule()); 
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
    // $ANTLR end "entryRuleOperationQuery"


    // $ANTLR start "ruleOperationQuery"
    // InternalAspectLang.g:574:1: ruleOperationQuery : ( ( rule__OperationQuery__Group__0 ) ) ;
    public final void ruleOperationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:578:2: ( ( ( rule__OperationQuery__Group__0 ) ) )
            // InternalAspectLang.g:579:1: ( ( rule__OperationQuery__Group__0 ) )
            {
            // InternalAspectLang.g:579:1: ( ( rule__OperationQuery__Group__0 ) )
            // InternalAspectLang.g:580:1: ( rule__OperationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:581:1: ( rule__OperationQuery__Group__0 )
            // InternalAspectLang.g:581:2: rule__OperationQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationQuery"


    // $ANTLR start "entryRuleParameterQuery"
    // InternalAspectLang.g:593:1: entryRuleParameterQuery : ruleParameterQuery EOF ;
    public final void entryRuleParameterQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:594:1: ( ruleParameterQuery EOF )
            // InternalAspectLang.g:595:1: ruleParameterQuery EOF
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
    // InternalAspectLang.g:602:1: ruleParameterQuery : ( ( rule__ParameterQuery__Group__0 ) ) ;
    public final void ruleParameterQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:606:2: ( ( ( rule__ParameterQuery__Group__0 ) ) )
            // InternalAspectLang.g:607:1: ( ( rule__ParameterQuery__Group__0 ) )
            {
            // InternalAspectLang.g:607:1: ( ( rule__ParameterQuery__Group__0 ) )
            // InternalAspectLang.g:608:1: ( rule__ParameterQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:609:1: ( rule__ParameterQuery__Group__0 )
            // InternalAspectLang.g:609:2: rule__ParameterQuery__Group__0
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


    // $ANTLR start "entryRuleNode"
    // InternalAspectLang.g:621:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:622:1: ( ruleNode EOF )
            // InternalAspectLang.g:623:1: ruleNode EOF
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
    // InternalAspectLang.g:630:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:634:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalAspectLang.g:635:1: ( ( rule__Node__Group__0 ) )
            {
            // InternalAspectLang.g:635:1: ( ( rule__Node__Group__0 ) )
            // InternalAspectLang.g:636:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:637:1: ( rule__Node__Group__0 )
            // InternalAspectLang.g:637:2: rule__Node__Group__0
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


    // $ANTLR start "entryRuleContainerNode"
    // InternalAspectLang.g:649:1: entryRuleContainerNode : ruleContainerNode EOF ;
    public final void entryRuleContainerNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:650:1: ( ruleContainerNode EOF )
            // InternalAspectLang.g:651:1: ruleContainerNode EOF
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
    // InternalAspectLang.g:658:1: ruleContainerNode : ( ( rule__ContainerNode__ContainerAssignment ) ) ;
    public final void ruleContainerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:662:2: ( ( ( rule__ContainerNode__ContainerAssignment ) ) )
            // InternalAspectLang.g:663:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            {
            // InternalAspectLang.g:663:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            // InternalAspectLang.g:664:1: ( rule__ContainerNode__ContainerAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }
            // InternalAspectLang.g:665:1: ( rule__ContainerNode__ContainerAssignment )
            // InternalAspectLang.g:665:2: rule__ContainerNode__ContainerAssignment
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
    // InternalAspectLang.g:677:1: entryRuleWildcardNode : ruleWildcardNode EOF ;
    public final void entryRuleWildcardNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:678:1: ( ruleWildcardNode EOF )
            // InternalAspectLang.g:679:1: ruleWildcardNode EOF
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
    // InternalAspectLang.g:686:1: ruleWildcardNode : ( ( rule__WildcardNode__Group__0 ) ) ;
    public final void ruleWildcardNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:690:2: ( ( ( rule__WildcardNode__Group__0 ) ) )
            // InternalAspectLang.g:691:1: ( ( rule__WildcardNode__Group__0 ) )
            {
            // InternalAspectLang.g:691:1: ( ( rule__WildcardNode__Group__0 ) )
            // InternalAspectLang.g:692:1: ( rule__WildcardNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:693:1: ( rule__WildcardNode__Group__0 )
            // InternalAspectLang.g:693:2: rule__WildcardNode__Group__0
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
    // InternalAspectLang.g:705:1: entryRuleSubPathNode : ruleSubPathNode EOF ;
    public final void entryRuleSubPathNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:706:1: ( ruleSubPathNode EOF )
            // InternalAspectLang.g:707:1: ruleSubPathNode EOF
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
    // InternalAspectLang.g:714:1: ruleSubPathNode : ( ( rule__SubPathNode__Group__0 ) ) ;
    public final void ruleSubPathNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:718:2: ( ( ( rule__SubPathNode__Group__0 ) ) )
            // InternalAspectLang.g:719:1: ( ( rule__SubPathNode__Group__0 ) )
            {
            // InternalAspectLang.g:719:1: ( ( rule__SubPathNode__Group__0 ) )
            // InternalAspectLang.g:720:1: ( rule__SubPathNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:721:1: ( rule__SubPathNode__Group__0 )
            // InternalAspectLang.g:721:2: rule__SubPathNode__Group__0
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
    // InternalAspectLang.g:733:1: entryRuleParentNode : ruleParentNode EOF ;
    public final void entryRuleParentNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:734:1: ( ruleParentNode EOF )
            // InternalAspectLang.g:735:1: ruleParentNode EOF
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
    // InternalAspectLang.g:742:1: ruleParentNode : ( ( rule__ParentNode__Group__0 ) ) ;
    public final void ruleParentNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:746:2: ( ( ( rule__ParentNode__Group__0 ) ) )
            // InternalAspectLang.g:747:1: ( ( rule__ParentNode__Group__0 ) )
            {
            // InternalAspectLang.g:747:1: ( ( rule__ParentNode__Group__0 ) )
            // InternalAspectLang.g:748:1: ( rule__ParentNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:749:1: ( rule__ParentNode__Group__0 )
            // InternalAspectLang.g:749:2: rule__ParentNode__Group__0
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


    // $ANTLR start "entryRulePropertyConstraint"
    // InternalAspectLang.g:761:1: entryRulePropertyConstraint : rulePropertyConstraint EOF ;
    public final void entryRulePropertyConstraint() throws RecognitionException {
        try {
            // InternalAspectLang.g:762:1: ( rulePropertyConstraint EOF )
            // InternalAspectLang.g:763:1: rulePropertyConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintRule()); 
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
    // $ANTLR end "entryRulePropertyConstraint"


    // $ANTLR start "rulePropertyConstraint"
    // InternalAspectLang.g:770:1: rulePropertyConstraint : ( ( rule__PropertyConstraint__Group__0 ) ) ;
    public final void rulePropertyConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:774:2: ( ( ( rule__PropertyConstraint__Group__0 ) ) )
            // InternalAspectLang.g:775:1: ( ( rule__PropertyConstraint__Group__0 ) )
            {
            // InternalAspectLang.g:775:1: ( ( rule__PropertyConstraint__Group__0 ) )
            // InternalAspectLang.g:776:1: ( rule__PropertyConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup()); 
            }
            // InternalAspectLang.g:777:1: ( rule__PropertyConstraint__Group__0 )
            // InternalAspectLang.g:777:2: rule__PropertyConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyConstraint"


    // $ANTLR start "entryRulePropertyConstraintCompare"
    // InternalAspectLang.g:789:1: entryRulePropertyConstraintCompare : rulePropertyConstraintCompare EOF ;
    public final void entryRulePropertyConstraintCompare() throws RecognitionException {
        try {
            // InternalAspectLang.g:790:1: ( rulePropertyConstraintCompare EOF )
            // InternalAspectLang.g:791:1: rulePropertyConstraintCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePropertyConstraintCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareRule()); 
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
    // $ANTLR end "entryRulePropertyConstraintCompare"


    // $ANTLR start "rulePropertyConstraintCompare"
    // InternalAspectLang.g:798:1: rulePropertyConstraintCompare : ( ( rule__PropertyConstraintCompare__Group__0 ) ) ;
    public final void rulePropertyConstraintCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:802:2: ( ( ( rule__PropertyConstraintCompare__Group__0 ) ) )
            // InternalAspectLang.g:803:1: ( ( rule__PropertyConstraintCompare__Group__0 ) )
            {
            // InternalAspectLang.g:803:1: ( ( rule__PropertyConstraintCompare__Group__0 ) )
            // InternalAspectLang.g:804:1: ( rule__PropertyConstraintCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getGroup()); 
            }
            // InternalAspectLang.g:805:1: ( rule__PropertyConstraintCompare__Group__0 )
            // InternalAspectLang.g:805:2: rule__PropertyConstraintCompare__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraintCompare__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyConstraintCompare"


    // $ANTLR start "entryRuleConstraintElement"
    // InternalAspectLang.g:817:1: entryRuleConstraintElement : ruleConstraintElement EOF ;
    public final void entryRuleConstraintElement() throws RecognitionException {
        try {
            // InternalAspectLang.g:818:1: ( ruleConstraintElement EOF )
            // InternalAspectLang.g:819:1: ruleConstraintElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintElementRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstraintElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintElementRule()); 
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
    // $ANTLR end "entryRuleConstraintElement"


    // $ANTLR start "ruleConstraintElement"
    // InternalAspectLang.g:826:1: ruleConstraintElement : ( ( rule__ConstraintElement__Alternatives ) ) ;
    public final void ruleConstraintElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:830:2: ( ( ( rule__ConstraintElement__Alternatives ) ) )
            // InternalAspectLang.g:831:1: ( ( rule__ConstraintElement__Alternatives ) )
            {
            // InternalAspectLang.g:831:1: ( ( rule__ConstraintElement__Alternatives ) )
            // InternalAspectLang.g:832:1: ( rule__ConstraintElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintElementAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:833:1: ( rule__ConstraintElement__Alternatives )
            // InternalAspectLang.g:833:2: rule__ConstraintElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ConstraintElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstraintElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstraintElement"


    // $ANTLR start "entryRuleLocalQuery"
    // InternalAspectLang.g:845:1: entryRuleLocalQuery : ruleLocalQuery EOF ;
    public final void entryRuleLocalQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:846:1: ( ruleLocalQuery EOF )
            // InternalAspectLang.g:847:1: ruleLocalQuery EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocalQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalQueryRule()); 
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
    // $ANTLR end "entryRuleLocalQuery"


    // $ANTLR start "ruleLocalQuery"
    // InternalAspectLang.g:854:1: ruleLocalQuery : ( ( rule__LocalQuery__Group__0 ) ) ;
    public final void ruleLocalQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:858:2: ( ( ( rule__LocalQuery__Group__0 ) ) )
            // InternalAspectLang.g:859:1: ( ( rule__LocalQuery__Group__0 ) )
            {
            // InternalAspectLang.g:859:1: ( ( rule__LocalQuery__Group__0 ) )
            // InternalAspectLang.g:860:1: ( rule__LocalQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:861:1: ( rule__LocalQuery__Group__0 )
            // InternalAspectLang.g:861:2: rule__LocalQuery__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalQuery__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalQueryAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalQuery"


    // $ANTLR start "entryRuleModelProperty"
    // InternalAspectLang.g:873:1: entryRuleModelProperty : ruleModelProperty EOF ;
    public final void entryRuleModelProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:874:1: ( ruleModelProperty EOF )
            // InternalAspectLang.g:875:1: ruleModelProperty EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyRule()); 
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
    // $ANTLR end "entryRuleModelProperty"


    // $ANTLR start "ruleModelProperty"
    // InternalAspectLang.g:882:1: ruleModelProperty : ( ( rule__ModelProperty__Group__0 ) ) ;
    public final void ruleModelProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:886:2: ( ( ( rule__ModelProperty__Group__0 ) ) )
            // InternalAspectLang.g:887:1: ( ( rule__ModelProperty__Group__0 ) )
            {
            // InternalAspectLang.g:887:1: ( ( rule__ModelProperty__Group__0 ) )
            // InternalAspectLang.g:888:1: ( rule__ModelProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getGroup()); 
            }
            // InternalAspectLang.g:889:1: ( rule__ModelProperty__Group__0 )
            // InternalAspectLang.g:889:2: rule__ModelProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelProperty"


    // $ANTLR start "entryRuleTypeof"
    // InternalAspectLang.g:901:1: entryRuleTypeof : ruleTypeof EOF ;
    public final void entryRuleTypeof() throws RecognitionException {
        try {
            // InternalAspectLang.g:902:1: ( ruleTypeof EOF )
            // InternalAspectLang.g:903:1: ruleTypeof EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeof();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofRule()); 
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
    // $ANTLR end "entryRuleTypeof"


    // $ANTLR start "ruleTypeof"
    // InternalAspectLang.g:910:1: ruleTypeof : ( ( rule__Typeof__Group__0 ) ) ;
    public final void ruleTypeof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:914:2: ( ( ( rule__Typeof__Group__0 ) ) )
            // InternalAspectLang.g:915:1: ( ( rule__Typeof__Group__0 ) )
            {
            // InternalAspectLang.g:915:1: ( ( rule__Typeof__Group__0 ) )
            // InternalAspectLang.g:916:1: ( rule__Typeof__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getGroup()); 
            }
            // InternalAspectLang.g:917:1: ( rule__Typeof__Group__0 )
            // InternalAspectLang.g:917:2: rule__Typeof__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Typeof__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeof"


    // $ANTLR start "entryRuleLiteral"
    // InternalAspectLang.g:929:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:930:1: ( ruleLiteral EOF )
            // InternalAspectLang.g:931:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalAspectLang.g:938:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:942:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalAspectLang.g:943:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalAspectLang.g:943:1: ( ( rule__Literal__Alternatives ) )
            // InternalAspectLang.g:944:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:945:1: ( rule__Literal__Alternatives )
            // InternalAspectLang.g:945:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalAspectLang.g:957:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:958:1: ( ruleFloatLiteral EOF )
            // InternalAspectLang.g:959:1: ruleFloatLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFloatLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFloatLiteralRule()); 
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
    // $ANTLR end "entryRuleFloatLiteral"


    // $ANTLR start "ruleFloatLiteral"
    // InternalAspectLang.g:966:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:970:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:971:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:971:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // InternalAspectLang.g:972:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:973:1: ( rule__FloatLiteral__ValueAssignment )
            // InternalAspectLang.g:973:2: rule__FloatLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleIntLiteral"
    // InternalAspectLang.g:985:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:986:1: ( ruleIntLiteral EOF )
            // InternalAspectLang.g:987:1: ruleIntLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntLiteralRule()); 
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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalAspectLang.g:994:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:998:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:999:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:999:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalAspectLang.g:1000:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:1001:1: ( rule__IntLiteral__ValueAssignment )
            // InternalAspectLang.g:1001:2: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleStringLiteral"
    // InternalAspectLang.g:1013:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:1014:1: ( ruleStringLiteral EOF )
            // InternalAspectLang.g:1015:1: ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalAspectLang.g:1022:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1026:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:1027:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:1027:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalAspectLang.g:1028:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:1029:1: ( rule__StringLiteral__ValueAssignment )
            // InternalAspectLang.g:1029:2: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAspectLang.g:1041:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAspectLang.g:1042:1: ( ruleQualifiedName EOF )
            // InternalAspectLang.g:1043:1: ruleQualifiedName EOF
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
    // InternalAspectLang.g:1050:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1054:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAspectLang.g:1055:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAspectLang.g:1055:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAspectLang.g:1056:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalAspectLang.g:1057:1: ( rule__QualifiedName__Group__0 )
            // InternalAspectLang.g:1057:2: rule__QualifiedName__Group__0
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
    // InternalAspectLang.g:1069:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalAspectLang.g:1070:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalAspectLang.g:1071:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalAspectLang.g:1078:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1082:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalAspectLang.g:1083:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalAspectLang.g:1083:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalAspectLang.g:1084:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalAspectLang.g:1085:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalAspectLang.g:1085:2: rule__QualifiedNameWithWildcard__Group__0
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


    // $ANTLR start "ruleInsertionPoint"
    // InternalAspectLang.g:1098:1: ruleInsertionPoint : ( ( rule__InsertionPoint__Alternatives ) ) ;
    public final void ruleInsertionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1102:1: ( ( ( rule__InsertionPoint__Alternatives ) ) )
            // InternalAspectLang.g:1103:1: ( ( rule__InsertionPoint__Alternatives ) )
            {
            // InternalAspectLang.g:1103:1: ( ( rule__InsertionPoint__Alternatives ) )
            // InternalAspectLang.g:1104:1: ( rule__InsertionPoint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1105:1: ( rule__InsertionPoint__Alternatives )
            // InternalAspectLang.g:1105:2: rule__InsertionPoint__Alternatives
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


    // $ANTLR start "ruleInternalFunction"
    // InternalAspectLang.g:1117:1: ruleInternalFunction : ( ( rule__InternalFunction__Alternatives ) ) ;
    public final void ruleInternalFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1121:1: ( ( ( rule__InternalFunction__Alternatives ) ) )
            // InternalAspectLang.g:1122:1: ( ( rule__InternalFunction__Alternatives ) )
            {
            // InternalAspectLang.g:1122:1: ( ( rule__InternalFunction__Alternatives ) )
            // InternalAspectLang.g:1123:1: ( rule__InternalFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1124:1: ( rule__InternalFunction__Alternatives )
            // InternalAspectLang.g:1124:2: rule__InternalFunction__Alternatives
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
    // InternalAspectLang.g:1136:1: ruleReflectionFunction : ( ( rule__ReflectionFunction__Alternatives ) ) ;
    public final void ruleReflectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1140:1: ( ( ( rule__ReflectionFunction__Alternatives ) ) )
            // InternalAspectLang.g:1141:1: ( ( rule__ReflectionFunction__Alternatives ) )
            {
            // InternalAspectLang.g:1141:1: ( ( rule__ReflectionFunction__Alternatives ) )
            // InternalAspectLang.g:1142:1: ( rule__ReflectionFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1143:1: ( rule__ReflectionFunction__Alternatives )
            // InternalAspectLang.g:1143:2: rule__ReflectionFunction__Alternatives
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


    // $ANTLR start "ruleQueryModifier"
    // InternalAspectLang.g:1155:1: ruleQueryModifier : ( ( rule__QueryModifier__Alternatives ) ) ;
    public final void ruleQueryModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1159:1: ( ( ( rule__QueryModifier__Alternatives ) ) )
            // InternalAspectLang.g:1160:1: ( ( rule__QueryModifier__Alternatives ) )
            {
            // InternalAspectLang.g:1160:1: ( ( rule__QueryModifier__Alternatives ) )
            // InternalAspectLang.g:1161:1: ( rule__QueryModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryModifierAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1162:1: ( rule__QueryModifier__Alternatives )
            // InternalAspectLang.g:1162:2: rule__QueryModifier__Alternatives
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
    // InternalAspectLang.g:1174:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1178:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // InternalAspectLang.g:1179:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // InternalAspectLang.g:1179:1: ( ( rule__LogicOperator__Alternatives ) )
            // InternalAspectLang.g:1180:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1181:1: ( rule__LogicOperator__Alternatives )
            // InternalAspectLang.g:1181:2: rule__LogicOperator__Alternatives
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


    // $ANTLR start "ruleCompareOperator"
    // InternalAspectLang.g:1193:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1197:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalAspectLang.g:1198:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalAspectLang.g:1198:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalAspectLang.g:1199:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1200:1: ( rule__CompareOperator__Alternatives )
            // InternalAspectLang.g:1200:2: rule__CompareOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CompareOperator__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompareOperator"


    // $ANTLR start "rule__AspectModel__Alternatives_4"
    // InternalAspectLang.g:1211:1: rule__AspectModel__Alternatives_4 : ( ( ( rule__AspectModel__AdvicesAssignment_4_0 ) ) | ( ( rule__AspectModel__PointcutsAssignment_4_1 ) ) | ( ( rule__AspectModel__AspectsAssignment_4_2 ) ) );
    public final void rule__AspectModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1215:1: ( ( ( rule__AspectModel__AdvicesAssignment_4_0 ) ) | ( ( rule__AspectModel__PointcutsAssignment_4_1 ) ) | ( ( rule__AspectModel__AspectsAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 47:
            case 50:
                {
                alt1=2;
                }
                break;
            case 38:
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
                    // InternalAspectLang.g:1216:1: ( ( rule__AspectModel__AdvicesAssignment_4_0 ) )
                    {
                    // InternalAspectLang.g:1216:1: ( ( rule__AspectModel__AdvicesAssignment_4_0 ) )
                    // InternalAspectLang.g:1217:1: ( rule__AspectModel__AdvicesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getAdvicesAssignment_4_0()); 
                    }
                    // InternalAspectLang.g:1218:1: ( rule__AspectModel__AdvicesAssignment_4_0 )
                    // InternalAspectLang.g:1218:2: rule__AspectModel__AdvicesAssignment_4_0
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
                    // InternalAspectLang.g:1222:6: ( ( rule__AspectModel__PointcutsAssignment_4_1 ) )
                    {
                    // InternalAspectLang.g:1222:6: ( ( rule__AspectModel__PointcutsAssignment_4_1 ) )
                    // InternalAspectLang.g:1223:1: ( rule__AspectModel__PointcutsAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getPointcutsAssignment_4_1()); 
                    }
                    // InternalAspectLang.g:1224:1: ( rule__AspectModel__PointcutsAssignment_4_1 )
                    // InternalAspectLang.g:1224:2: rule__AspectModel__PointcutsAssignment_4_1
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
                    // InternalAspectLang.g:1228:6: ( ( rule__AspectModel__AspectsAssignment_4_2 ) )
                    {
                    // InternalAspectLang.g:1228:6: ( ( rule__AspectModel__AspectsAssignment_4_2 ) )
                    // InternalAspectLang.g:1229:1: ( rule__AspectModel__AspectsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getAspectsAssignment_4_2()); 
                    }
                    // InternalAspectLang.g:1230:1: ( rule__AspectModel__AspectsAssignment_4_2 )
                    // InternalAspectLang.g:1230:2: rule__AspectModel__AspectsAssignment_4_2
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


    // $ANTLR start "rule__Value__Alternatives"
    // InternalAspectLang.g:1239:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleReferenceValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1243:1: ( ( ruleLiteral ) | ( ruleReferenceValue ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_STRING && LA2_0<=RULE_INT)) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID||LA2_0==13||(LA2_0>=16 && LA2_0<=18)||LA2_0==46||(LA2_0>=54 && LA2_0<=55)) ) {
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
                    // InternalAspectLang.g:1244:1: ( ruleLiteral )
                    {
                    // InternalAspectLang.g:1244:1: ( ruleLiteral )
                    // InternalAspectLang.g:1245:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1250:6: ( ruleReferenceValue )
                    {
                    // InternalAspectLang.g:1250:6: ( ruleReferenceValue )
                    // InternalAspectLang.g:1251:1: ruleReferenceValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleReferenceValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_1()); 
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


    // $ANTLR start "rule__Property__Alternatives"
    // InternalAspectLang.g:1261:1: rule__Property__Alternatives : ( ( ruleInternalFunctionProperty ) | ( ruleReflectionProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1265:1: ( ( ruleInternalFunctionProperty ) | ( ruleReflectionProperty ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=18)) ) {
                alt3=1;
            }
            else if ( (LA3_0==46) ) {
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
                    // InternalAspectLang.g:1266:1: ( ruleInternalFunctionProperty )
                    {
                    // InternalAspectLang.g:1266:1: ( ruleInternalFunctionProperty )
                    // InternalAspectLang.g:1267:1: ruleInternalFunctionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getInternalFunctionPropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInternalFunctionProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getInternalFunctionPropertyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1272:6: ( ruleReflectionProperty )
                    {
                    // InternalAspectLang.g:1272:6: ( ruleReflectionProperty )
                    // InternalAspectLang.g:1273:1: ruleReflectionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getReflectionPropertyParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleReflectionProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getReflectionPropertyParserRuleCall_1()); 
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
    // $ANTLR end "rule__Property__Alternatives"


    // $ANTLR start "rule__LocationQuery__Alternatives_1"
    // InternalAspectLang.g:1283:1: rule__LocationQuery__Alternatives_1 : ( ( ( rule__LocationQuery__Group_1_0__0 ) ) | ( ( rule__LocationQuery__CompositionAssignment_1_1 ) ) );
    public final void rule__LocationQuery__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1287:1: ( ( ( rule__LocationQuery__Group_1_0__0 ) ) | ( ( rule__LocationQuery__CompositionAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=23 && LA4_0<=24)||LA4_0==44) ) {
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
                    // InternalAspectLang.g:1288:1: ( ( rule__LocationQuery__Group_1_0__0 ) )
                    {
                    // InternalAspectLang.g:1288:1: ( ( rule__LocationQuery__Group_1_0__0 ) )
                    // InternalAspectLang.g:1289:1: ( rule__LocationQuery__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationQueryAccess().getGroup_1_0()); 
                    }
                    // InternalAspectLang.g:1290:1: ( rule__LocationQuery__Group_1_0__0 )
                    // InternalAspectLang.g:1290:2: rule__LocationQuery__Group_1_0__0
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
                    // InternalAspectLang.g:1294:6: ( ( rule__LocationQuery__CompositionAssignment_1_1 ) )
                    {
                    // InternalAspectLang.g:1294:6: ( ( rule__LocationQuery__CompositionAssignment_1_1 ) )
                    // InternalAspectLang.g:1295:1: ( rule__LocationQuery__CompositionAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationQueryAccess().getCompositionAssignment_1_1()); 
                    }
                    // InternalAspectLang.g:1296:1: ( rule__LocationQuery__CompositionAssignment_1_1 )
                    // InternalAspectLang.g:1296:2: rule__LocationQuery__CompositionAssignment_1_1
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


    // $ANTLR start "rule__OperationQuery__Alternatives_3"
    // InternalAspectLang.g:1305:1: rule__OperationQuery__Alternatives_3 : ( ( ( rule__OperationQuery__Group_3_0__0 ) ) | ( '*' ) );
    public final void rule__OperationQuery__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1309:1: ( ( ( rule__OperationQuery__Group_3_0__0 ) ) | ( '*' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==13) ) {
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
                    // InternalAspectLang.g:1310:1: ( ( rule__OperationQuery__Group_3_0__0 ) )
                    {
                    // InternalAspectLang.g:1310:1: ( ( rule__OperationQuery__Group_3_0__0 ) )
                    // InternalAspectLang.g:1311:1: ( rule__OperationQuery__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationQueryAccess().getGroup_3_0()); 
                    }
                    // InternalAspectLang.g:1312:1: ( rule__OperationQuery__Group_3_0__0 )
                    // InternalAspectLang.g:1312:2: rule__OperationQuery__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationQuery__Group_3_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationQueryAccess().getGroup_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1316:6: ( '*' )
                    {
                    // InternalAspectLang.g:1316:6: ( '*' )
                    // InternalAspectLang.g:1317:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationQueryAccess().getAsteriskKeyword_3_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getOperationQueryAccess().getAsteriskKeyword_3_1()); 
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
    // $ANTLR end "rule__OperationQuery__Alternatives_3"


    // $ANTLR start "rule__ParameterQuery__Alternatives_2"
    // InternalAspectLang.g:1329:1: rule__ParameterQuery__Alternatives_2 : ( ( ( rule__ParameterQuery__TypeAssignment_2_0 ) ) | ( '*' ) );
    public final void rule__ParameterQuery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1333:1: ( ( ( rule__ParameterQuery__TypeAssignment_2_0 ) ) | ( '*' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==13) ) {
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
                    // InternalAspectLang.g:1334:1: ( ( rule__ParameterQuery__TypeAssignment_2_0 ) )
                    {
                    // InternalAspectLang.g:1334:1: ( ( rule__ParameterQuery__TypeAssignment_2_0 ) )
                    // InternalAspectLang.g:1335:1: ( rule__ParameterQuery__TypeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterQueryAccess().getTypeAssignment_2_0()); 
                    }
                    // InternalAspectLang.g:1336:1: ( rule__ParameterQuery__TypeAssignment_2_0 )
                    // InternalAspectLang.g:1336:2: rule__ParameterQuery__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterQuery__TypeAssignment_2_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterQueryAccess().getTypeAssignment_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1340:6: ( '*' )
                    {
                    // InternalAspectLang.g:1340:6: ( '*' )
                    // InternalAspectLang.g:1341:1: '*'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterQueryAccess().getAsteriskKeyword_2_1()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getParameterQueryAccess().getAsteriskKeyword_2_1()); 
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
    // $ANTLR end "rule__ParameterQuery__Alternatives_2"


    // $ANTLR start "rule__Node__Alternatives_0"
    // InternalAspectLang.g:1353:1: rule__Node__Alternatives_0 : ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1357:1: ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 55:
                {
                alt7=3;
                }
                break;
            case RULE_ID:
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
                    // InternalAspectLang.g:1358:1: ( ruleSubPathNode )
                    {
                    // InternalAspectLang.g:1358:1: ( ruleSubPathNode )
                    // InternalAspectLang.g:1359:1: ruleSubPathNode
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
                    // InternalAspectLang.g:1364:6: ( ruleWildcardNode )
                    {
                    // InternalAspectLang.g:1364:6: ( ruleWildcardNode )
                    // InternalAspectLang.g:1365:1: ruleWildcardNode
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
                    // InternalAspectLang.g:1370:6: ( ruleParentNode )
                    {
                    // InternalAspectLang.g:1370:6: ( ruleParentNode )
                    // InternalAspectLang.g:1371:1: ruleParentNode
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
                    // InternalAspectLang.g:1376:6: ( ruleContainerNode )
                    {
                    // InternalAspectLang.g:1376:6: ( ruleContainerNode )
                    // InternalAspectLang.g:1377:1: ruleContainerNode
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


    // $ANTLR start "rule__ConstraintElement__Alternatives"
    // InternalAspectLang.g:1387:1: rule__ConstraintElement__Alternatives : ( ( ruleLiteral ) | ( ruleLocalQuery ) );
    public final void rule__ConstraintElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1391:1: ( ( ruleLiteral ) | ( ruleLocalQuery ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||LA8_0==13||(LA8_0>=54 && LA8_0<=57)) ) {
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
                    // InternalAspectLang.g:1392:1: ( ruleLiteral )
                    {
                    // InternalAspectLang.g:1392:1: ( ruleLiteral )
                    // InternalAspectLang.g:1393:1: ruleLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstraintElementAccess().getLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstraintElementAccess().getLiteralParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1398:6: ( ruleLocalQuery )
                    {
                    // InternalAspectLang.g:1398:6: ( ruleLocalQuery )
                    // InternalAspectLang.g:1399:1: ruleLocalQuery
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConstraintElementAccess().getLocalQueryParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLocalQuery();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConstraintElementAccess().getLocalQueryParserRuleCall_1()); 
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
    // $ANTLR end "rule__ConstraintElement__Alternatives"


    // $ANTLR start "rule__LocalQuery__Alternatives_1"
    // InternalAspectLang.g:1409:1: rule__LocalQuery__Alternatives_1 : ( ( ( rule__LocalQuery__PropertyAssignment_1_0 ) ) | ( ( rule__LocalQuery__TypeofAssignment_1_1 ) ) );
    public final void rule__LocalQuery__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1413:1: ( ( ( rule__LocalQuery__PropertyAssignment_1_0 ) ) | ( ( rule__LocalQuery__TypeofAssignment_1_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==56) ) {
                alt9=1;
            }
            else if ( (LA9_0==57) ) {
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
                    // InternalAspectLang.g:1414:1: ( ( rule__LocalQuery__PropertyAssignment_1_0 ) )
                    {
                    // InternalAspectLang.g:1414:1: ( ( rule__LocalQuery__PropertyAssignment_1_0 ) )
                    // InternalAspectLang.g:1415:1: ( rule__LocalQuery__PropertyAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocalQueryAccess().getPropertyAssignment_1_0()); 
                    }
                    // InternalAspectLang.g:1416:1: ( rule__LocalQuery__PropertyAssignment_1_0 )
                    // InternalAspectLang.g:1416:2: rule__LocalQuery__PropertyAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalQuery__PropertyAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLocalQueryAccess().getPropertyAssignment_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1420:6: ( ( rule__LocalQuery__TypeofAssignment_1_1 ) )
                    {
                    // InternalAspectLang.g:1420:6: ( ( rule__LocalQuery__TypeofAssignment_1_1 ) )
                    // InternalAspectLang.g:1421:1: ( rule__LocalQuery__TypeofAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocalQueryAccess().getTypeofAssignment_1_1()); 
                    }
                    // InternalAspectLang.g:1422:1: ( rule__LocalQuery__TypeofAssignment_1_1 )
                    // InternalAspectLang.g:1422:2: rule__LocalQuery__TypeofAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalQuery__TypeofAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLocalQueryAccess().getTypeofAssignment_1_1()); 
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
    // $ANTLR end "rule__LocalQuery__Alternatives_1"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalAspectLang.g:1431:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1435:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_INT:
                {
                alt10=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt10=3;
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
                    // InternalAspectLang.g:1436:1: ( ruleStringLiteral )
                    {
                    // InternalAspectLang.g:1436:1: ( ruleStringLiteral )
                    // InternalAspectLang.g:1437:1: ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1442:6: ( ruleIntLiteral )
                    {
                    // InternalAspectLang.g:1442:6: ( ruleIntLiteral )
                    // InternalAspectLang.g:1443:1: ruleIntLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalAspectLang.g:1448:6: ( ruleFloatLiteral )
                    {
                    // InternalAspectLang.g:1448:6: ( ruleFloatLiteral )
                    // InternalAspectLang.g:1449:1: ruleFloatLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFloatLiteral();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLiteralAccess().getFloatLiteralParserRuleCall_2()); 
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


    // $ANTLR start "rule__InsertionPoint__Alternatives"
    // InternalAspectLang.g:1459:1: rule__InsertionPoint__Alternatives : ( ( ( 'before' ) ) | ( ( 'after' ) ) );
    public final void rule__InsertionPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1463:1: ( ( ( 'before' ) ) | ( ( 'after' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==15) ) {
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
                    // InternalAspectLang.g:1464:1: ( ( 'before' ) )
                    {
                    // InternalAspectLang.g:1464:1: ( ( 'before' ) )
                    // InternalAspectLang.g:1465:1: ( 'before' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1466:1: ( 'before' )
                    // InternalAspectLang.g:1466:3: 'before'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1471:6: ( ( 'after' ) )
                    {
                    // InternalAspectLang.g:1471:6: ( ( 'after' ) )
                    // InternalAspectLang.g:1472:1: ( 'after' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1473:1: ( 'after' )
                    // InternalAspectLang.g:1473:3: 'after'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__InternalFunction__Alternatives"
    // InternalAspectLang.g:1483:1: rule__InternalFunction__Alternatives : ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) );
    public final void rule__InternalFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1487:1: ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt12=1;
                }
                break;
            case 17:
                {
                alt12=2;
                }
                break;
            case 18:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalAspectLang.g:1488:1: ( ( 'time' ) )
                    {
                    // InternalAspectLang.g:1488:1: ( ( 'time' ) )
                    // InternalAspectLang.g:1489:1: ( 'time' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1490:1: ( 'time' )
                    // InternalAspectLang.g:1490:3: 'time'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1495:6: ( ( 'traceId' ) )
                    {
                    // InternalAspectLang.g:1495:6: ( ( 'traceId' ) )
                    // InternalAspectLang.g:1496:1: ( 'traceId' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1497:1: ( 'traceId' )
                    // InternalAspectLang.g:1497:3: 'traceId'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1502:6: ( ( 'orderIndex' ) )
                    {
                    // InternalAspectLang.g:1502:6: ( ( 'orderIndex' ) )
                    // InternalAspectLang.g:1503:1: ( 'orderIndex' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getORDER_INDEXEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1504:1: ( 'orderIndex' )
                    // InternalAspectLang.g:1504:3: 'orderIndex'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:1514:1: rule__ReflectionFunction__Alternatives : ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'classname' ) ) | ( ( 'return-type' ) ) );
    public final void rule__ReflectionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1518:1: ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'classname' ) ) | ( ( 'return-type' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt13=1;
                }
                break;
            case 20:
                {
                alt13=2;
                }
                break;
            case 21:
                {
                alt13=3;
                }
                break;
            case 22:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalAspectLang.g:1519:1: ( ( 'name' ) )
                    {
                    // InternalAspectLang.g:1519:1: ( ( 'name' ) )
                    // InternalAspectLang.g:1520:1: ( 'name' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1521:1: ( 'name' )
                    // InternalAspectLang.g:1521:3: 'name'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1526:6: ( ( 'signature' ) )
                    {
                    // InternalAspectLang.g:1526:6: ( ( 'signature' ) )
                    // InternalAspectLang.g:1527:1: ( 'signature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1528:1: ( 'signature' )
                    // InternalAspectLang.g:1528:3: 'signature'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1533:6: ( ( 'classname' ) )
                    {
                    // InternalAspectLang.g:1533:6: ( ( 'classname' ) )
                    // InternalAspectLang.g:1534:1: ( 'classname' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1535:1: ( 'classname' )
                    // InternalAspectLang.g:1535:3: 'classname'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:1540:6: ( ( 'return-type' ) )
                    {
                    // InternalAspectLang.g:1540:6: ( ( 'return-type' ) )
                    // InternalAspectLang.g:1541:1: ( 'return-type' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }
                    // InternalAspectLang.g:1542:1: ( 'return-type' )
                    // InternalAspectLang.g:1542:3: 'return-type'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__QueryModifier__Alternatives"
    // InternalAspectLang.g:1552:1: rule__QueryModifier__Alternatives : ( ( ( 'include' ) ) | ( ( 'exclude' ) ) );
    public final void rule__QueryModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1556:1: ( ( ( 'include' ) ) | ( ( 'exclude' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            else if ( (LA14_0==24) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalAspectLang.g:1557:1: ( ( 'include' ) )
                    {
                    // InternalAspectLang.g:1557:1: ( ( 'include' ) )
                    // InternalAspectLang.g:1558:1: ( 'include' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1559:1: ( 'include' )
                    // InternalAspectLang.g:1559:3: 'include'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1564:6: ( ( 'exclude' ) )
                    {
                    // InternalAspectLang.g:1564:6: ( ( 'exclude' ) )
                    // InternalAspectLang.g:1565:1: ( 'exclude' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryModifierAccess().getEXCLUDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1566:1: ( 'exclude' )
                    // InternalAspectLang.g:1566:3: 'exclude'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:1576:1: rule__LogicOperator__Alternatives : ( ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1580:1: ( ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            else if ( (LA15_0==26) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalAspectLang.g:1581:1: ( ( '&&' ) )
                    {
                    // InternalAspectLang.g:1581:1: ( ( '&&' ) )
                    // InternalAspectLang.g:1582:1: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1583:1: ( '&&' )
                    // InternalAspectLang.g:1583:3: '&&'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1588:6: ( ( '||' ) )
                    {
                    // InternalAspectLang.g:1588:6: ( ( '||' ) )
                    // InternalAspectLang.g:1589:1: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1590:1: ( '||' )
                    // InternalAspectLang.g:1590:3: '||'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__CompareOperator__Alternatives"
    // InternalAspectLang.g:1600:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1604:1: ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt16=7;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case 29:
                {
                alt16=3;
                }
                break;
            case 30:
                {
                alt16=4;
                }
                break;
            case 31:
                {
                alt16=5;
                }
                break;
            case 32:
                {
                alt16=6;
                }
                break;
            case 33:
                {
                alt16=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalAspectLang.g:1605:1: ( ( '=' ) )
                    {
                    // InternalAspectLang.g:1605:1: ( ( '=' ) )
                    // InternalAspectLang.g:1606:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1607:1: ( '=' )
                    // InternalAspectLang.g:1607:3: '='
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1612:6: ( ( '~' ) )
                    {
                    // InternalAspectLang.g:1612:6: ( ( '~' ) )
                    // InternalAspectLang.g:1613:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1614:1: ( '~' )
                    // InternalAspectLang.g:1614:3: '~'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1619:6: ( ( '!=' ) )
                    {
                    // InternalAspectLang.g:1619:6: ( ( '!=' ) )
                    // InternalAspectLang.g:1620:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1621:1: ( '!=' )
                    // InternalAspectLang.g:1621:3: '!='
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:1626:6: ( ( '>' ) )
                    {
                    // InternalAspectLang.g:1626:6: ( ( '>' ) )
                    // InternalAspectLang.g:1627:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }
                    // InternalAspectLang.g:1628:1: ( '>' )
                    // InternalAspectLang.g:1628:3: '>'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAspectLang.g:1633:6: ( ( '<' ) )
                    {
                    // InternalAspectLang.g:1633:6: ( ( '<' ) )
                    // InternalAspectLang.g:1634:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }
                    // InternalAspectLang.g:1635:1: ( '<' )
                    // InternalAspectLang.g:1635:3: '<'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAspectLang.g:1640:6: ( ( '>=' ) )
                    {
                    // InternalAspectLang.g:1640:6: ( ( '>=' ) )
                    // InternalAspectLang.g:1641:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }
                    // InternalAspectLang.g:1642:1: ( '>=' )
                    // InternalAspectLang.g:1642:3: '>='
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAspectLang.g:1647:6: ( ( '<=' ) )
                    {
                    // InternalAspectLang.g:1647:6: ( ( '<=' ) )
                    // InternalAspectLang.g:1648:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                    }
                    // InternalAspectLang.g:1649:1: ( '<=' )
                    // InternalAspectLang.g:1649:3: '<='
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLEEnumLiteralDeclaration_6()); 
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
    // $ANTLR end "rule__CompareOperator__Alternatives"


    // $ANTLR start "rule__AspectModel__Group__0"
    // InternalAspectLang.g:1661:1: rule__AspectModel__Group__0 : rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1 ;
    public final void rule__AspectModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1665:1: ( rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1 )
            // InternalAspectLang.g:1666:2: rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1
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
    // InternalAspectLang.g:1673:1: rule__AspectModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__AspectModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1677:1: ( ( 'package' ) )
            // InternalAspectLang.g:1678:1: ( 'package' )
            {
            // InternalAspectLang.g:1678:1: ( 'package' )
            // InternalAspectLang.g:1679:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getPackageKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1692:1: rule__AspectModel__Group__1 : rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2 ;
    public final void rule__AspectModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1696:1: ( rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2 )
            // InternalAspectLang.g:1697:2: rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2
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
    // InternalAspectLang.g:1704:1: rule__AspectModel__Group__1__Impl : ( ( rule__AspectModel__NameAssignment_1 ) ) ;
    public final void rule__AspectModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1708:1: ( ( ( rule__AspectModel__NameAssignment_1 ) ) )
            // InternalAspectLang.g:1709:1: ( ( rule__AspectModel__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:1709:1: ( ( rule__AspectModel__NameAssignment_1 ) )
            // InternalAspectLang.g:1710:1: ( rule__AspectModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:1711:1: ( rule__AspectModel__NameAssignment_1 )
            // InternalAspectLang.g:1711:2: rule__AspectModel__NameAssignment_1
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
    // InternalAspectLang.g:1721:1: rule__AspectModel__Group__2 : rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3 ;
    public final void rule__AspectModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1725:1: ( rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3 )
            // InternalAspectLang.g:1726:2: rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3
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
    // InternalAspectLang.g:1733:1: rule__AspectModel__Group__2__Impl : ( ( rule__AspectModel__ImportsAssignment_2 )* ) ;
    public final void rule__AspectModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1737:1: ( ( ( rule__AspectModel__ImportsAssignment_2 )* ) )
            // InternalAspectLang.g:1738:1: ( ( rule__AspectModel__ImportsAssignment_2 )* )
            {
            // InternalAspectLang.g:1738:1: ( ( rule__AspectModel__ImportsAssignment_2 )* )
            // InternalAspectLang.g:1739:1: ( rule__AspectModel__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getImportsAssignment_2()); 
            }
            // InternalAspectLang.g:1740:1: ( rule__AspectModel__ImportsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAspectLang.g:1740:2: rule__AspectModel__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AspectModel__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalAspectLang.g:1750:1: rule__AspectModel__Group__3 : rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4 ;
    public final void rule__AspectModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1754:1: ( rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4 )
            // InternalAspectLang.g:1755:2: rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4
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
    // InternalAspectLang.g:1762:1: rule__AspectModel__Group__3__Impl : ( ( rule__AspectModel__SourcesAssignment_3 )* ) ;
    public final void rule__AspectModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1766:1: ( ( ( rule__AspectModel__SourcesAssignment_3 )* ) )
            // InternalAspectLang.g:1767:1: ( ( rule__AspectModel__SourcesAssignment_3 )* )
            {
            // InternalAspectLang.g:1767:1: ( ( rule__AspectModel__SourcesAssignment_3 )* )
            // InternalAspectLang.g:1768:1: ( rule__AspectModel__SourcesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getSourcesAssignment_3()); 
            }
            // InternalAspectLang.g:1769:1: ( rule__AspectModel__SourcesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAspectLang.g:1769:2: rule__AspectModel__SourcesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AspectModel__SourcesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAspectLang.g:1779:1: rule__AspectModel__Group__4 : rule__AspectModel__Group__4__Impl ;
    public final void rule__AspectModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1783:1: ( rule__AspectModel__Group__4__Impl )
            // InternalAspectLang.g:1784:2: rule__AspectModel__Group__4__Impl
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
    // InternalAspectLang.g:1790:1: rule__AspectModel__Group__4__Impl : ( ( rule__AspectModel__Alternatives_4 )* ) ;
    public final void rule__AspectModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1794:1: ( ( ( rule__AspectModel__Alternatives_4 )* ) )
            // InternalAspectLang.g:1795:1: ( ( rule__AspectModel__Alternatives_4 )* )
            {
            // InternalAspectLang.g:1795:1: ( ( rule__AspectModel__Alternatives_4 )* )
            // InternalAspectLang.g:1796:1: ( rule__AspectModel__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getAlternatives_4()); 
            }
            // InternalAspectLang.g:1797:1: ( rule__AspectModel__Alternatives_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38||LA19_0==43||LA19_0==47||LA19_0==50) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAspectLang.g:1797:2: rule__AspectModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AspectModel__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAspectLang.g:1817:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1821:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAspectLang.g:1822:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalAspectLang.g:1829:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1833:1: ( ( 'import' ) )
            // InternalAspectLang.g:1834:1: ( 'import' )
            {
            // InternalAspectLang.g:1834:1: ( 'import' )
            // InternalAspectLang.g:1835:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1848:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1852:1: ( rule__Import__Group__1__Impl )
            // InternalAspectLang.g:1853:2: rule__Import__Group__1__Impl
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
    // InternalAspectLang.g:1859:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1863:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalAspectLang.g:1864:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAspectLang.g:1864:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalAspectLang.g:1865:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalAspectLang.g:1866:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalAspectLang.g:1866:2: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalAspectLang.g:1880:1: rule__ApplicationModel__Group__0 : rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1884:1: ( rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 )
            // InternalAspectLang.g:1885:2: rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1
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
    // InternalAspectLang.g:1892:1: rule__ApplicationModel__Group__0__Impl : ( 'use' ) ;
    public final void rule__ApplicationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1896:1: ( ( 'use' ) )
            // InternalAspectLang.g:1897:1: ( 'use' )
            {
            // InternalAspectLang.g:1897:1: ( 'use' )
            // InternalAspectLang.g:1898:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUseKeyword_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1911:1: rule__ApplicationModel__Group__1 : rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1915:1: ( rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 )
            // InternalAspectLang.g:1916:2: rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2
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
    // InternalAspectLang.g:1923:1: rule__ApplicationModel__Group__1__Impl : ( ( rule__ApplicationModel__HandlerAssignment_1 ) ) ;
    public final void rule__ApplicationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1927:1: ( ( ( rule__ApplicationModel__HandlerAssignment_1 ) ) )
            // InternalAspectLang.g:1928:1: ( ( rule__ApplicationModel__HandlerAssignment_1 ) )
            {
            // InternalAspectLang.g:1928:1: ( ( rule__ApplicationModel__HandlerAssignment_1 ) )
            // InternalAspectLang.g:1929:1: ( rule__ApplicationModel__HandlerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getHandlerAssignment_1()); 
            }
            // InternalAspectLang.g:1930:1: ( rule__ApplicationModel__HandlerAssignment_1 )
            // InternalAspectLang.g:1930:2: rule__ApplicationModel__HandlerAssignment_1
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
    // InternalAspectLang.g:1940:1: rule__ApplicationModel__Group__2 : rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1944:1: ( rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 )
            // InternalAspectLang.g:1945:2: rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3
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
    // InternalAspectLang.g:1952:1: rule__ApplicationModel__Group__2__Impl : ( 'on' ) ;
    public final void rule__ApplicationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1956:1: ( ( 'on' ) )
            // InternalAspectLang.g:1957:1: ( 'on' )
            {
            // InternalAspectLang.g:1957:1: ( 'on' )
            // InternalAspectLang.g:1958:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getOnKeyword_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1971:1: rule__ApplicationModel__Group__3 : rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1975:1: ( rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 )
            // InternalAspectLang.g:1976:2: rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4
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
    // InternalAspectLang.g:1983:1: rule__ApplicationModel__Group__3__Impl : ( ( rule__ApplicationModel__NameAssignment_3 ) ) ;
    public final void rule__ApplicationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1987:1: ( ( ( rule__ApplicationModel__NameAssignment_3 ) ) )
            // InternalAspectLang.g:1988:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            {
            // InternalAspectLang.g:1988:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            // InternalAspectLang.g:1989:1: ( rule__ApplicationModel__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameAssignment_3()); 
            }
            // InternalAspectLang.g:1990:1: ( rule__ApplicationModel__NameAssignment_3 )
            // InternalAspectLang.g:1990:2: rule__ApplicationModel__NameAssignment_3
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
    // InternalAspectLang.g:2000:1: rule__ApplicationModel__Group__4 : rule__ApplicationModel__Group__4__Impl ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2004:1: ( rule__ApplicationModel__Group__4__Impl )
            // InternalAspectLang.g:2005:2: rule__ApplicationModel__Group__4__Impl
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
    // InternalAspectLang.g:2011:1: rule__ApplicationModel__Group__4__Impl : ( ( rule__ApplicationModel__ModelAssignment_4 ) ) ;
    public final void rule__ApplicationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2015:1: ( ( ( rule__ApplicationModel__ModelAssignment_4 ) ) )
            // InternalAspectLang.g:2016:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            {
            // InternalAspectLang.g:2016:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            // InternalAspectLang.g:2017:1: ( rule__ApplicationModel__ModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelAssignment_4()); 
            }
            // InternalAspectLang.g:2018:1: ( rule__ApplicationModel__ModelAssignment_4 )
            // InternalAspectLang.g:2018:2: rule__ApplicationModel__ModelAssignment_4
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


    // $ANTLR start "rule__Aspect__Group__0"
    // InternalAspectLang.g:2038:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2042:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // InternalAspectLang.g:2043:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
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
    // InternalAspectLang.g:2050:1: rule__Aspect__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2054:1: ( ( 'aspect' ) )
            // InternalAspectLang.g:2055:1: ( 'aspect' )
            {
            // InternalAspectLang.g:2055:1: ( 'aspect' )
            // InternalAspectLang.g:2056:1: 'aspect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2069:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2073:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // InternalAspectLang.g:2074:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalAspectLang.g:2081:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__PointcutAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2085:1: ( ( ( rule__Aspect__PointcutAssignment_1 ) ) )
            // InternalAspectLang.g:2086:1: ( ( rule__Aspect__PointcutAssignment_1 ) )
            {
            // InternalAspectLang.g:2086:1: ( ( rule__Aspect__PointcutAssignment_1 ) )
            // InternalAspectLang.g:2087:1: ( rule__Aspect__PointcutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutAssignment_1()); 
            }
            // InternalAspectLang.g:2088:1: ( rule__Aspect__PointcutAssignment_1 )
            // InternalAspectLang.g:2088:2: rule__Aspect__PointcutAssignment_1
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
    // InternalAspectLang.g:2098:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2102:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // InternalAspectLang.g:2103:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
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
    // InternalAspectLang.g:2110:1: rule__Aspect__Group__2__Impl : ( ':' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2114:1: ( ( ':' ) )
            // InternalAspectLang.g:2115:1: ( ':' )
            {
            // InternalAspectLang.g:2115:1: ( ':' )
            // InternalAspectLang.g:2116:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getColonKeyword_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2129:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2133:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // InternalAspectLang.g:2134:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalAspectLang.g:2141:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__AdvicesAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2145:1: ( ( ( rule__Aspect__AdvicesAssignment_3 ) ) )
            // InternalAspectLang.g:2146:1: ( ( rule__Aspect__AdvicesAssignment_3 ) )
            {
            // InternalAspectLang.g:2146:1: ( ( rule__Aspect__AdvicesAssignment_3 ) )
            // InternalAspectLang.g:2147:1: ( rule__Aspect__AdvicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesAssignment_3()); 
            }
            // InternalAspectLang.g:2148:1: ( rule__Aspect__AdvicesAssignment_3 )
            // InternalAspectLang.g:2148:2: rule__Aspect__AdvicesAssignment_3
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
    // InternalAspectLang.g:2158:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2162:1: ( rule__Aspect__Group__4__Impl )
            // InternalAspectLang.g:2163:2: rule__Aspect__Group__4__Impl
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
    // InternalAspectLang.g:2169:1: rule__Aspect__Group__4__Impl : ( ( rule__Aspect__Group_4__0 )* ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2173:1: ( ( ( rule__Aspect__Group_4__0 )* ) )
            // InternalAspectLang.g:2174:1: ( ( rule__Aspect__Group_4__0 )* )
            {
            // InternalAspectLang.g:2174:1: ( ( rule__Aspect__Group_4__0 )* )
            // InternalAspectLang.g:2175:1: ( rule__Aspect__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup_4()); 
            }
            // InternalAspectLang.g:2176:1: ( rule__Aspect__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAspectLang.g:2176:2: rule__Aspect__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Aspect__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalAspectLang.g:2196:1: rule__Aspect__Group_4__0 : rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1 ;
    public final void rule__Aspect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2200:1: ( rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1 )
            // InternalAspectLang.g:2201:2: rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1
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
    // InternalAspectLang.g:2208:1: rule__Aspect__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Aspect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2212:1: ( ( ',' ) )
            // InternalAspectLang.g:2213:1: ( ',' )
            {
            // InternalAspectLang.g:2213:1: ( ',' )
            // InternalAspectLang.g:2214:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCommaKeyword_4_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2227:1: rule__Aspect__Group_4__1 : rule__Aspect__Group_4__1__Impl ;
    public final void rule__Aspect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2231:1: ( rule__Aspect__Group_4__1__Impl )
            // InternalAspectLang.g:2232:2: rule__Aspect__Group_4__1__Impl
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
    // InternalAspectLang.g:2238:1: rule__Aspect__Group_4__1__Impl : ( ( rule__Aspect__AdvicesAssignment_4_1 ) ) ;
    public final void rule__Aspect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2242:1: ( ( ( rule__Aspect__AdvicesAssignment_4_1 ) ) )
            // InternalAspectLang.g:2243:1: ( ( rule__Aspect__AdvicesAssignment_4_1 ) )
            {
            // InternalAspectLang.g:2243:1: ( ( rule__Aspect__AdvicesAssignment_4_1 ) )
            // InternalAspectLang.g:2244:1: ( rule__Aspect__AdvicesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesAssignment_4_1()); 
            }
            // InternalAspectLang.g:2245:1: ( rule__Aspect__AdvicesAssignment_4_1 )
            // InternalAspectLang.g:2245:2: rule__Aspect__AdvicesAssignment_4_1
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
    // InternalAspectLang.g:2259:1: rule__UtilizeAdvice__Group__0 : rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1 ;
    public final void rule__UtilizeAdvice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2263:1: ( rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1 )
            // InternalAspectLang.g:2264:2: rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalAspectLang.g:2271:1: rule__UtilizeAdvice__Group__0__Impl : ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) ) ;
    public final void rule__UtilizeAdvice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2275:1: ( ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) ) )
            // InternalAspectLang.g:2276:1: ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) )
            {
            // InternalAspectLang.g:2276:1: ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) )
            // InternalAspectLang.g:2277:1: ( rule__UtilizeAdvice__AdviceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAssignment_0()); 
            }
            // InternalAspectLang.g:2278:1: ( rule__UtilizeAdvice__AdviceAssignment_0 )
            // InternalAspectLang.g:2278:2: rule__UtilizeAdvice__AdviceAssignment_0
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
    // InternalAspectLang.g:2288:1: rule__UtilizeAdvice__Group__1 : rule__UtilizeAdvice__Group__1__Impl ;
    public final void rule__UtilizeAdvice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2292:1: ( rule__UtilizeAdvice__Group__1__Impl )
            // InternalAspectLang.g:2293:2: rule__UtilizeAdvice__Group__1__Impl
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
    // InternalAspectLang.g:2299:1: rule__UtilizeAdvice__Group__1__Impl : ( ( rule__UtilizeAdvice__Group_1__0 )? ) ;
    public final void rule__UtilizeAdvice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2303:1: ( ( ( rule__UtilizeAdvice__Group_1__0 )? ) )
            // InternalAspectLang.g:2304:1: ( ( rule__UtilizeAdvice__Group_1__0 )? )
            {
            // InternalAspectLang.g:2304:1: ( ( rule__UtilizeAdvice__Group_1__0 )? )
            // InternalAspectLang.g:2305:1: ( rule__UtilizeAdvice__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:2306:1: ( rule__UtilizeAdvice__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAspectLang.g:2306:2: rule__UtilizeAdvice__Group_1__0
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
    // InternalAspectLang.g:2320:1: rule__UtilizeAdvice__Group_1__0 : rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1 ;
    public final void rule__UtilizeAdvice__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2324:1: ( rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1 )
            // InternalAspectLang.g:2325:2: rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalAspectLang.g:2332:1: rule__UtilizeAdvice__Group_1__0__Impl : ( '(' ) ;
    public final void rule__UtilizeAdvice__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2336:1: ( ( '(' ) )
            // InternalAspectLang.g:2337:1: ( '(' )
            {
            // InternalAspectLang.g:2337:1: ( '(' )
            // InternalAspectLang.g:2338:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2351:1: rule__UtilizeAdvice__Group_1__1 : rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2 ;
    public final void rule__UtilizeAdvice__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2355:1: ( rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2 )
            // InternalAspectLang.g:2356:2: rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAspectLang.g:2363:1: rule__UtilizeAdvice__Group_1__1__Impl : ( ( rule__UtilizeAdvice__Group_1_1__0 )? ) ;
    public final void rule__UtilizeAdvice__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2367:1: ( ( ( rule__UtilizeAdvice__Group_1_1__0 )? ) )
            // InternalAspectLang.g:2368:1: ( ( rule__UtilizeAdvice__Group_1_1__0 )? )
            {
            // InternalAspectLang.g:2368:1: ( ( rule__UtilizeAdvice__Group_1_1__0 )? )
            // InternalAspectLang.g:2369:1: ( rule__UtilizeAdvice__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1()); 
            }
            // InternalAspectLang.g:2370:1: ( rule__UtilizeAdvice__Group_1_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==13||(LA22_0>=16 && LA22_0<=18)||LA22_0==46||(LA22_0>=54 && LA22_0<=55)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAspectLang.g:2370:2: rule__UtilizeAdvice__Group_1_1__0
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
    // InternalAspectLang.g:2380:1: rule__UtilizeAdvice__Group_1__2 : rule__UtilizeAdvice__Group_1__2__Impl ;
    public final void rule__UtilizeAdvice__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2384:1: ( rule__UtilizeAdvice__Group_1__2__Impl )
            // InternalAspectLang.g:2385:2: rule__UtilizeAdvice__Group_1__2__Impl
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
    // InternalAspectLang.g:2391:1: rule__UtilizeAdvice__Group_1__2__Impl : ( ')' ) ;
    public final void rule__UtilizeAdvice__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2395:1: ( ( ')' ) )
            // InternalAspectLang.g:2396:1: ( ')' )
            {
            // InternalAspectLang.g:2396:1: ( ')' )
            // InternalAspectLang.g:2397:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2416:1: rule__UtilizeAdvice__Group_1_1__0 : rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1 ;
    public final void rule__UtilizeAdvice__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2420:1: ( rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1 )
            // InternalAspectLang.g:2421:2: rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAspectLang.g:2428:1: rule__UtilizeAdvice__Group_1_1__0__Impl : ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) ) ;
    public final void rule__UtilizeAdvice__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2432:1: ( ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) ) )
            // InternalAspectLang.g:2433:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) )
            {
            // InternalAspectLang.g:2433:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) )
            // InternalAspectLang.g:2434:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_0()); 
            }
            // InternalAspectLang.g:2435:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 )
            // InternalAspectLang.g:2435:2: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0
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
    // InternalAspectLang.g:2445:1: rule__UtilizeAdvice__Group_1_1__1 : rule__UtilizeAdvice__Group_1_1__1__Impl ;
    public final void rule__UtilizeAdvice__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2449:1: ( rule__UtilizeAdvice__Group_1_1__1__Impl )
            // InternalAspectLang.g:2450:2: rule__UtilizeAdvice__Group_1_1__1__Impl
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
    // InternalAspectLang.g:2456:1: rule__UtilizeAdvice__Group_1_1__1__Impl : ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* ) ;
    public final void rule__UtilizeAdvice__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2460:1: ( ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* ) )
            // InternalAspectLang.g:2461:1: ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* )
            {
            // InternalAspectLang.g:2461:1: ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* )
            // InternalAspectLang.g:2462:1: ( rule__UtilizeAdvice__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1_1()); 
            }
            // InternalAspectLang.g:2463:1: ( rule__UtilizeAdvice__Group_1_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAspectLang.g:2463:2: rule__UtilizeAdvice__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__UtilizeAdvice__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalAspectLang.g:2477:1: rule__UtilizeAdvice__Group_1_1_1__0 : rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1 ;
    public final void rule__UtilizeAdvice__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2481:1: ( rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1 )
            // InternalAspectLang.g:2482:2: rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAspectLang.g:2489:1: rule__UtilizeAdvice__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__UtilizeAdvice__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2493:1: ( ( ',' ) )
            // InternalAspectLang.g:2494:1: ( ',' )
            {
            // InternalAspectLang.g:2494:1: ( ',' )
            // InternalAspectLang.g:2495:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getCommaKeyword_1_1_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2508:1: rule__UtilizeAdvice__Group_1_1_1__1 : rule__UtilizeAdvice__Group_1_1_1__1__Impl ;
    public final void rule__UtilizeAdvice__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2512:1: ( rule__UtilizeAdvice__Group_1_1_1__1__Impl )
            // InternalAspectLang.g:2513:2: rule__UtilizeAdvice__Group_1_1_1__1__Impl
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
    // InternalAspectLang.g:2519:1: rule__UtilizeAdvice__Group_1_1_1__1__Impl : ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) ) ;
    public final void rule__UtilizeAdvice__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2523:1: ( ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) ) )
            // InternalAspectLang.g:2524:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) )
            {
            // InternalAspectLang.g:2524:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) )
            // InternalAspectLang.g:2525:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_1_1()); 
            }
            // InternalAspectLang.g:2526:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 )
            // InternalAspectLang.g:2526:2: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1
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
    // InternalAspectLang.g:2540:1: rule__Advice__Group__0 : rule__Advice__Group__0__Impl rule__Advice__Group__1 ;
    public final void rule__Advice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2544:1: ( rule__Advice__Group__0__Impl rule__Advice__Group__1 )
            // InternalAspectLang.g:2545:2: rule__Advice__Group__0__Impl rule__Advice__Group__1
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
    // InternalAspectLang.g:2552:1: rule__Advice__Group__0__Impl : ( 'advice' ) ;
    public final void rule__Advice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2556:1: ( ( 'advice' ) )
            // InternalAspectLang.g:2557:1: ( 'advice' )
            {
            // InternalAspectLang.g:2557:1: ( 'advice' )
            // InternalAspectLang.g:2558:1: 'advice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getAdviceKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2571:1: rule__Advice__Group__1 : rule__Advice__Group__1__Impl rule__Advice__Group__2 ;
    public final void rule__Advice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2575:1: ( rule__Advice__Group__1__Impl rule__Advice__Group__2 )
            // InternalAspectLang.g:2576:2: rule__Advice__Group__1__Impl rule__Advice__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalAspectLang.g:2583:1: rule__Advice__Group__1__Impl : ( ( rule__Advice__NameAssignment_1 ) ) ;
    public final void rule__Advice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2587:1: ( ( ( rule__Advice__NameAssignment_1 ) ) )
            // InternalAspectLang.g:2588:1: ( ( rule__Advice__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:2588:1: ( ( rule__Advice__NameAssignment_1 ) )
            // InternalAspectLang.g:2589:1: ( rule__Advice__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:2590:1: ( rule__Advice__NameAssignment_1 )
            // InternalAspectLang.g:2590:2: rule__Advice__NameAssignment_1
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
    // InternalAspectLang.g:2600:1: rule__Advice__Group__2 : rule__Advice__Group__2__Impl rule__Advice__Group__3 ;
    public final void rule__Advice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2604:1: ( rule__Advice__Group__2__Impl rule__Advice__Group__3 )
            // InternalAspectLang.g:2605:2: rule__Advice__Group__2__Impl rule__Advice__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalAspectLang.g:2612:1: rule__Advice__Group__2__Impl : ( ( rule__Advice__Group_2__0 )? ) ;
    public final void rule__Advice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2616:1: ( ( ( rule__Advice__Group_2__0 )? ) )
            // InternalAspectLang.g:2617:1: ( ( rule__Advice__Group_2__0 )? )
            {
            // InternalAspectLang.g:2617:1: ( ( rule__Advice__Group_2__0 )? )
            // InternalAspectLang.g:2618:1: ( rule__Advice__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2()); 
            }
            // InternalAspectLang.g:2619:1: ( rule__Advice__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAspectLang.g:2619:2: rule__Advice__Group_2__0
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
    // InternalAspectLang.g:2629:1: rule__Advice__Group__3 : rule__Advice__Group__3__Impl rule__Advice__Group__4 ;
    public final void rule__Advice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2633:1: ( rule__Advice__Group__3__Impl rule__Advice__Group__4 )
            // InternalAspectLang.g:2634:2: rule__Advice__Group__3__Impl rule__Advice__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalAspectLang.g:2641:1: rule__Advice__Group__3__Impl : ( '{' ) ;
    public final void rule__Advice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2645:1: ( ( '{' ) )
            // InternalAspectLang.g:2646:1: ( '{' )
            {
            // InternalAspectLang.g:2646:1: ( '{' )
            // InternalAspectLang.g:2647:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2660:1: rule__Advice__Group__4 : rule__Advice__Group__4__Impl rule__Advice__Group__5 ;
    public final void rule__Advice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2664:1: ( rule__Advice__Group__4__Impl rule__Advice__Group__5 )
            // InternalAspectLang.g:2665:2: rule__Advice__Group__4__Impl rule__Advice__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalAspectLang.g:2672:1: rule__Advice__Group__4__Impl : ( ( rule__Advice__CollectorsAssignment_4 )* ) ;
    public final void rule__Advice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2676:1: ( ( ( rule__Advice__CollectorsAssignment_4 )* ) )
            // InternalAspectLang.g:2677:1: ( ( rule__Advice__CollectorsAssignment_4 )* )
            {
            // InternalAspectLang.g:2677:1: ( ( rule__Advice__CollectorsAssignment_4 )* )
            // InternalAspectLang.g:2678:1: ( rule__Advice__CollectorsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getCollectorsAssignment_4()); 
            }
            // InternalAspectLang.g:2679:1: ( rule__Advice__CollectorsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=14 && LA25_0<=15)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAspectLang.g:2679:2: rule__Advice__CollectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Advice__CollectorsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalAspectLang.g:2689:1: rule__Advice__Group__5 : rule__Advice__Group__5__Impl ;
    public final void rule__Advice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2693:1: ( rule__Advice__Group__5__Impl )
            // InternalAspectLang.g:2694:2: rule__Advice__Group__5__Impl
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
    // InternalAspectLang.g:2700:1: rule__Advice__Group__5__Impl : ( '}' ) ;
    public final void rule__Advice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2704:1: ( ( '}' ) )
            // InternalAspectLang.g:2705:1: ( '}' )
            {
            // InternalAspectLang.g:2705:1: ( '}' )
            // InternalAspectLang.g:2706:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2731:1: rule__Advice__Group_2__0 : rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1 ;
    public final void rule__Advice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2735:1: ( rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1 )
            // InternalAspectLang.g:2736:2: rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalAspectLang.g:2743:1: rule__Advice__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Advice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2747:1: ( ( '(' ) )
            // InternalAspectLang.g:2748:1: ( '(' )
            {
            // InternalAspectLang.g:2748:1: ( '(' )
            // InternalAspectLang.g:2749:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2762:1: rule__Advice__Group_2__1 : rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2 ;
    public final void rule__Advice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2766:1: ( rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2 )
            // InternalAspectLang.g:2767:2: rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalAspectLang.g:2774:1: rule__Advice__Group_2__1__Impl : ( ( rule__Advice__Group_2_1__0 )? ) ;
    public final void rule__Advice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2778:1: ( ( ( rule__Advice__Group_2_1__0 )? ) )
            // InternalAspectLang.g:2779:1: ( ( rule__Advice__Group_2_1__0 )? )
            {
            // InternalAspectLang.g:2779:1: ( ( rule__Advice__Group_2_1__0 )? )
            // InternalAspectLang.g:2780:1: ( rule__Advice__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2_1()); 
            }
            // InternalAspectLang.g:2781:1: ( rule__Advice__Group_2_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==58) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAspectLang.g:2781:2: rule__Advice__Group_2_1__0
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
    // InternalAspectLang.g:2791:1: rule__Advice__Group_2__2 : rule__Advice__Group_2__2__Impl ;
    public final void rule__Advice__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2795:1: ( rule__Advice__Group_2__2__Impl )
            // InternalAspectLang.g:2796:2: rule__Advice__Group_2__2__Impl
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
    // InternalAspectLang.g:2802:1: rule__Advice__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Advice__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2806:1: ( ( ')' ) )
            // InternalAspectLang.g:2807:1: ( ')' )
            {
            // InternalAspectLang.g:2807:1: ( ')' )
            // InternalAspectLang.g:2808:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2827:1: rule__Advice__Group_2_1__0 : rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1 ;
    public final void rule__Advice__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2831:1: ( rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1 )
            // InternalAspectLang.g:2832:2: rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAspectLang.g:2839:1: rule__Advice__Group_2_1__0__Impl : ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) ) ;
    public final void rule__Advice__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2843:1: ( ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) ) )
            // InternalAspectLang.g:2844:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) )
            {
            // InternalAspectLang.g:2844:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) )
            // InternalAspectLang.g:2845:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_0()); 
            }
            // InternalAspectLang.g:2846:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 )
            // InternalAspectLang.g:2846:2: rule__Advice__ParameterDeclarationsAssignment_2_1_0
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
    // InternalAspectLang.g:2856:1: rule__Advice__Group_2_1__1 : rule__Advice__Group_2_1__1__Impl ;
    public final void rule__Advice__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2860:1: ( rule__Advice__Group_2_1__1__Impl )
            // InternalAspectLang.g:2861:2: rule__Advice__Group_2_1__1__Impl
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
    // InternalAspectLang.g:2867:1: rule__Advice__Group_2_1__1__Impl : ( ( rule__Advice__Group_2_1_1__0 )* ) ;
    public final void rule__Advice__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2871:1: ( ( ( rule__Advice__Group_2_1_1__0 )* ) )
            // InternalAspectLang.g:2872:1: ( ( rule__Advice__Group_2_1_1__0 )* )
            {
            // InternalAspectLang.g:2872:1: ( ( rule__Advice__Group_2_1_1__0 )* )
            // InternalAspectLang.g:2873:1: ( rule__Advice__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2_1_1()); 
            }
            // InternalAspectLang.g:2874:1: ( rule__Advice__Group_2_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAspectLang.g:2874:2: rule__Advice__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Advice__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalAspectLang.g:2888:1: rule__Advice__Group_2_1_1__0 : rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1 ;
    public final void rule__Advice__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2892:1: ( rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1 )
            // InternalAspectLang.g:2893:2: rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalAspectLang.g:2900:1: rule__Advice__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Advice__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2904:1: ( ( ',' ) )
            // InternalAspectLang.g:2905:1: ( ',' )
            {
            // InternalAspectLang.g:2905:1: ( ',' )
            // InternalAspectLang.g:2906:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2919:1: rule__Advice__Group_2_1_1__1 : rule__Advice__Group_2_1_1__1__Impl ;
    public final void rule__Advice__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2923:1: ( rule__Advice__Group_2_1_1__1__Impl )
            // InternalAspectLang.g:2924:2: rule__Advice__Group_2_1_1__1__Impl
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
    // InternalAspectLang.g:2930:1: rule__Advice__Group_2_1_1__1__Impl : ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) ) ;
    public final void rule__Advice__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2934:1: ( ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) ) )
            // InternalAspectLang.g:2935:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) )
            {
            // InternalAspectLang.g:2935:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) )
            // InternalAspectLang.g:2936:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_1_1()); 
            }
            // InternalAspectLang.g:2937:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 )
            // InternalAspectLang.g:2937:2: rule__Advice__ParameterDeclarationsAssignment_2_1_1_1
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


    // $ANTLR start "rule__AdviceParameterDeclaration__Group__0"
    // InternalAspectLang.g:2951:1: rule__AdviceParameterDeclaration__Group__0 : rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1 ;
    public final void rule__AdviceParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2955:1: ( rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1 )
            // InternalAspectLang.g:2956:2: rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__AdviceParameterDeclaration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdviceParameterDeclaration__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameterDeclaration__Group__0"


    // $ANTLR start "rule__AdviceParameterDeclaration__Group__0__Impl"
    // InternalAspectLang.g:2963:1: rule__AdviceParameterDeclaration__Group__0__Impl : ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__AdviceParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2967:1: ( ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) ) )
            // InternalAspectLang.g:2968:1: ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) )
            {
            // InternalAspectLang.g:2968:1: ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) )
            // InternalAspectLang.g:2969:1: ( rule__AdviceParameterDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getTypeAssignment_0()); 
            }
            // InternalAspectLang.g:2970:1: ( rule__AdviceParameterDeclaration__TypeAssignment_0 )
            // InternalAspectLang.g:2970:2: rule__AdviceParameterDeclaration__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameterDeclaration__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterDeclarationAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameterDeclaration__Group__0__Impl"


    // $ANTLR start "rule__AdviceParameterDeclaration__Group__1"
    // InternalAspectLang.g:2980:1: rule__AdviceParameterDeclaration__Group__1 : rule__AdviceParameterDeclaration__Group__1__Impl ;
    public final void rule__AdviceParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2984:1: ( rule__AdviceParameterDeclaration__Group__1__Impl )
            // InternalAspectLang.g:2985:2: rule__AdviceParameterDeclaration__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameterDeclaration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameterDeclaration__Group__1"


    // $ANTLR start "rule__AdviceParameterDeclaration__Group__1__Impl"
    // InternalAspectLang.g:2991:1: rule__AdviceParameterDeclaration__Group__1__Impl : ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__AdviceParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2995:1: ( ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) ) )
            // InternalAspectLang.g:2996:1: ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:2996:1: ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) )
            // InternalAspectLang.g:2997:1: ( rule__AdviceParameterDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:2998:1: ( rule__AdviceParameterDeclaration__NameAssignment_1 )
            // InternalAspectLang.g:2998:2: rule__AdviceParameterDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameterDeclaration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterDeclarationAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameterDeclaration__Group__1__Impl"


    // $ANTLR start "rule__Collector__Group__0"
    // InternalAspectLang.g:3012:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3016:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // InternalAspectLang.g:3017:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
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
    // InternalAspectLang.g:3024:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3028:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // InternalAspectLang.g:3029:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // InternalAspectLang.g:3029:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // InternalAspectLang.g:3030:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // InternalAspectLang.g:3031:1: ( rule__Collector__InsertionPointAssignment_0 )
            // InternalAspectLang.g:3031:2: rule__Collector__InsertionPointAssignment_0
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
    // InternalAspectLang.g:3041:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3045:1: ( rule__Collector__Group__1__Impl )
            // InternalAspectLang.g:3046:2: rule__Collector__Group__1__Impl
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
    // InternalAspectLang.g:3052:1: rule__Collector__Group__1__Impl : ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3056:1: ( ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) ) )
            // InternalAspectLang.g:3057:1: ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) )
            {
            // InternalAspectLang.g:3057:1: ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) )
            // InternalAspectLang.g:3058:1: ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* )
            {
            // InternalAspectLang.g:3058:1: ( ( rule__Collector__EventsAssignment_1 ) )
            // InternalAspectLang.g:3059:1: ( rule__Collector__EventsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }
            // InternalAspectLang.g:3060:1: ( rule__Collector__EventsAssignment_1 )
            // InternalAspectLang.g:3060:2: rule__Collector__EventsAssignment_1
            {
            pushFollow(FOLLOW_21);
            rule__Collector__EventsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }

            }

            // InternalAspectLang.g:3063:1: ( ( rule__Collector__EventsAssignment_1 )* )
            // InternalAspectLang.g:3064:1: ( rule__Collector__EventsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }
            // InternalAspectLang.g:3065:1: ( rule__Collector__EventsAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAspectLang.g:3065:2: rule__Collector__EventsAssignment_1
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Collector__EventsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAspectLang.g:3080:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3084:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalAspectLang.g:3085:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalAspectLang.g:3092:1: rule__Event__Group__0__Impl : ( ( rule__Event__TypeAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3096:1: ( ( ( rule__Event__TypeAssignment_0 ) ) )
            // InternalAspectLang.g:3097:1: ( ( rule__Event__TypeAssignment_0 ) )
            {
            // InternalAspectLang.g:3097:1: ( ( rule__Event__TypeAssignment_0 ) )
            // InternalAspectLang.g:3098:1: ( rule__Event__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeAssignment_0()); 
            }
            // InternalAspectLang.g:3099:1: ( rule__Event__TypeAssignment_0 )
            // InternalAspectLang.g:3099:2: rule__Event__TypeAssignment_0
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
    // InternalAspectLang.g:3109:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3113:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalAspectLang.g:3114:2: rule__Event__Group__1__Impl rule__Event__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalAspectLang.g:3121:1: rule__Event__Group__1__Impl : ( '(' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3125:1: ( ( '(' ) )
            // InternalAspectLang.g:3126:1: ( '(' )
            {
            // InternalAspectLang.g:3126:1: ( '(' )
            // InternalAspectLang.g:3127:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3140:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3144:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalAspectLang.g:3145:2: rule__Event__Group__2__Impl rule__Event__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalAspectLang.g:3152:1: rule__Event__Group__2__Impl : ( ( rule__Event__Group_2__0 )? ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3156:1: ( ( ( rule__Event__Group_2__0 )? ) )
            // InternalAspectLang.g:3157:1: ( ( rule__Event__Group_2__0 )? )
            {
            // InternalAspectLang.g:3157:1: ( ( rule__Event__Group_2__0 )? )
            // InternalAspectLang.g:3158:1: ( rule__Event__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2()); 
            }
            // InternalAspectLang.g:3159:1: ( rule__Event__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==13||(LA29_0>=16 && LA29_0<=18)||LA29_0==46||(LA29_0>=54 && LA29_0<=55)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAspectLang.g:3159:2: rule__Event__Group_2__0
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
    // InternalAspectLang.g:3169:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3173:1: ( rule__Event__Group__3__Impl )
            // InternalAspectLang.g:3174:2: rule__Event__Group__3__Impl
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
    // InternalAspectLang.g:3180:1: rule__Event__Group__3__Impl : ( ')' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3184:1: ( ( ')' ) )
            // InternalAspectLang.g:3185:1: ( ')' )
            {
            // InternalAspectLang.g:3185:1: ( ')' )
            // InternalAspectLang.g:3186:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3207:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3211:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalAspectLang.g:3212:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalAspectLang.g:3219:1: rule__Event__Group_2__0__Impl : ( ( rule__Event__InitializationsAssignment_2_0 ) ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3223:1: ( ( ( rule__Event__InitializationsAssignment_2_0 ) ) )
            // InternalAspectLang.g:3224:1: ( ( rule__Event__InitializationsAssignment_2_0 ) )
            {
            // InternalAspectLang.g:3224:1: ( ( rule__Event__InitializationsAssignment_2_0 ) )
            // InternalAspectLang.g:3225:1: ( rule__Event__InitializationsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsAssignment_2_0()); 
            }
            // InternalAspectLang.g:3226:1: ( rule__Event__InitializationsAssignment_2_0 )
            // InternalAspectLang.g:3226:2: rule__Event__InitializationsAssignment_2_0
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
    // InternalAspectLang.g:3236:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3240:1: ( rule__Event__Group_2__1__Impl )
            // InternalAspectLang.g:3241:2: rule__Event__Group_2__1__Impl
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
    // InternalAspectLang.g:3247:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__Group_2_1__0 )* ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3251:1: ( ( ( rule__Event__Group_2_1__0 )* ) )
            // InternalAspectLang.g:3252:1: ( ( rule__Event__Group_2_1__0 )* )
            {
            // InternalAspectLang.g:3252:1: ( ( rule__Event__Group_2_1__0 )* )
            // InternalAspectLang.g:3253:1: ( rule__Event__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2_1()); 
            }
            // InternalAspectLang.g:3254:1: ( rule__Event__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==40) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAspectLang.g:3254:2: rule__Event__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Event__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalAspectLang.g:3268:1: rule__Event__Group_2_1__0 : rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 ;
    public final void rule__Event__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3272:1: ( rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 )
            // InternalAspectLang.g:3273:2: rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAspectLang.g:3280:1: rule__Event__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3284:1: ( ( ',' ) )
            // InternalAspectLang.g:3285:1: ( ',' )
            {
            // InternalAspectLang.g:3285:1: ( ',' )
            // InternalAspectLang.g:3286:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3299:1: rule__Event__Group_2_1__1 : rule__Event__Group_2_1__1__Impl ;
    public final void rule__Event__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3303:1: ( rule__Event__Group_2_1__1__Impl )
            // InternalAspectLang.g:3304:2: rule__Event__Group_2_1__1__Impl
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
    // InternalAspectLang.g:3310:1: rule__Event__Group_2_1__1__Impl : ( ( rule__Event__InitializationsAssignment_2_1_1 ) ) ;
    public final void rule__Event__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3314:1: ( ( ( rule__Event__InitializationsAssignment_2_1_1 ) ) )
            // InternalAspectLang.g:3315:1: ( ( rule__Event__InitializationsAssignment_2_1_1 ) )
            {
            // InternalAspectLang.g:3315:1: ( ( rule__Event__InitializationsAssignment_2_1_1 ) )
            // InternalAspectLang.g:3316:1: ( rule__Event__InitializationsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsAssignment_2_1_1()); 
            }
            // InternalAspectLang.g:3317:1: ( rule__Event__InitializationsAssignment_2_1_1 )
            // InternalAspectLang.g:3317:2: rule__Event__InitializationsAssignment_2_1_1
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


    // $ANTLR start "rule__ReferenceValue__Group__0"
    // InternalAspectLang.g:3331:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3335:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // InternalAspectLang.g:3336:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalAspectLang.g:3343:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 )? ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3347:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 )? ) )
            // InternalAspectLang.g:3348:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            {
            // InternalAspectLang.g:3348:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            // InternalAspectLang.g:3349:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // InternalAspectLang.g:3350:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==13||(LA31_0>=54 && LA31_0<=55)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAspectLang.g:3350:2: rule__ReferenceValue__QueryAssignment_0
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
    // InternalAspectLang.g:3360:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3364:1: ( rule__ReferenceValue__Group__1__Impl )
            // InternalAspectLang.g:3365:2: rule__ReferenceValue__Group__1__Impl
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
    // InternalAspectLang.g:3371:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__PropertyAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3375:1: ( ( ( rule__ReferenceValue__PropertyAssignment_1 ) ) )
            // InternalAspectLang.g:3376:1: ( ( rule__ReferenceValue__PropertyAssignment_1 ) )
            {
            // InternalAspectLang.g:3376:1: ( ( rule__ReferenceValue__PropertyAssignment_1 ) )
            // InternalAspectLang.g:3377:1: ( rule__ReferenceValue__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getPropertyAssignment_1()); 
            }
            // InternalAspectLang.g:3378:1: ( rule__ReferenceValue__PropertyAssignment_1 )
            // InternalAspectLang.g:3378:2: rule__ReferenceValue__PropertyAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ReferenceValue__PropertyAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueAccess().getPropertyAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ReflectionProperty__Group__0"
    // InternalAspectLang.g:3392:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3396:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // InternalAspectLang.g:3397:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalAspectLang.g:3404:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3408:1: ( ( '$' ) )
            // InternalAspectLang.g:3409:1: ( '$' )
            {
            // InternalAspectLang.g:3409:1: ( '$' )
            // InternalAspectLang.g:3410:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3423:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3427:1: ( rule__ReflectionProperty__Group__1__Impl )
            // InternalAspectLang.g:3428:2: rule__ReflectionProperty__Group__1__Impl
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
    // InternalAspectLang.g:3434:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3438:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // InternalAspectLang.g:3439:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // InternalAspectLang.g:3439:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // InternalAspectLang.g:3440:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // InternalAspectLang.g:3441:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // InternalAspectLang.g:3441:2: rule__ReflectionProperty__FunctionAssignment_1
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


    // $ANTLR start "rule__Pointcut__Group__0"
    // InternalAspectLang.g:3455:1: rule__Pointcut__Group__0 : rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 ;
    public final void rule__Pointcut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3459:1: ( rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 )
            // InternalAspectLang.g:3460:2: rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAspectLang.g:3467:1: rule__Pointcut__Group__0__Impl : ( ( rule__Pointcut__AnnotationAssignment_0 )? ) ;
    public final void rule__Pointcut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3471:1: ( ( ( rule__Pointcut__AnnotationAssignment_0 )? ) )
            // InternalAspectLang.g:3472:1: ( ( rule__Pointcut__AnnotationAssignment_0 )? )
            {
            // InternalAspectLang.g:3472:1: ( ( rule__Pointcut__AnnotationAssignment_0 )? )
            // InternalAspectLang.g:3473:1: ( rule__Pointcut__AnnotationAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getAnnotationAssignment_0()); 
            }
            // InternalAspectLang.g:3474:1: ( rule__Pointcut__AnnotationAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==50) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAspectLang.g:3474:2: rule__Pointcut__AnnotationAssignment_0
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
    // InternalAspectLang.g:3484:1: rule__Pointcut__Group__1 : rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 ;
    public final void rule__Pointcut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3488:1: ( rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 )
            // InternalAspectLang.g:3489:2: rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2
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
    // InternalAspectLang.g:3496:1: rule__Pointcut__Group__1__Impl : ( 'pointcut' ) ;
    public final void rule__Pointcut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3500:1: ( ( 'pointcut' ) )
            // InternalAspectLang.g:3501:1: ( 'pointcut' )
            {
            // InternalAspectLang.g:3501:1: ( 'pointcut' )
            // InternalAspectLang.g:3502:1: 'pointcut'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getPointcutKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3515:1: rule__Pointcut__Group__2 : rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 ;
    public final void rule__Pointcut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3519:1: ( rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 )
            // InternalAspectLang.g:3520:2: rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalAspectLang.g:3527:1: rule__Pointcut__Group__2__Impl : ( ( rule__Pointcut__NameAssignment_2 ) ) ;
    public final void rule__Pointcut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3531:1: ( ( ( rule__Pointcut__NameAssignment_2 ) ) )
            // InternalAspectLang.g:3532:1: ( ( rule__Pointcut__NameAssignment_2 ) )
            {
            // InternalAspectLang.g:3532:1: ( ( rule__Pointcut__NameAssignment_2 ) )
            // InternalAspectLang.g:3533:1: ( rule__Pointcut__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getNameAssignment_2()); 
            }
            // InternalAspectLang.g:3534:1: ( rule__Pointcut__NameAssignment_2 )
            // InternalAspectLang.g:3534:2: rule__Pointcut__NameAssignment_2
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
    // InternalAspectLang.g:3544:1: rule__Pointcut__Group__3 : rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4 ;
    public final void rule__Pointcut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3548:1: ( rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4 )
            // InternalAspectLang.g:3549:2: rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalAspectLang.g:3556:1: rule__Pointcut__Group__3__Impl : ( 'class' ) ;
    public final void rule__Pointcut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3560:1: ( ( 'class' ) )
            // InternalAspectLang.g:3561:1: ( 'class' )
            {
            // InternalAspectLang.g:3561:1: ( 'class' )
            // InternalAspectLang.g:3562:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getClassKeyword_3()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3575:1: rule__Pointcut__Group__4 : rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5 ;
    public final void rule__Pointcut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3579:1: ( rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5 )
            // InternalAspectLang.g:3580:2: rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalAspectLang.g:3587:1: rule__Pointcut__Group__4__Impl : ( ( rule__Pointcut__LocationAssignment_4 ) ) ;
    public final void rule__Pointcut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3591:1: ( ( ( rule__Pointcut__LocationAssignment_4 ) ) )
            // InternalAspectLang.g:3592:1: ( ( rule__Pointcut__LocationAssignment_4 ) )
            {
            // InternalAspectLang.g:3592:1: ( ( rule__Pointcut__LocationAssignment_4 ) )
            // InternalAspectLang.g:3593:1: ( rule__Pointcut__LocationAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getLocationAssignment_4()); 
            }
            // InternalAspectLang.g:3594:1: ( rule__Pointcut__LocationAssignment_4 )
            // InternalAspectLang.g:3594:2: rule__Pointcut__LocationAssignment_4
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
    // InternalAspectLang.g:3604:1: rule__Pointcut__Group__5 : rule__Pointcut__Group__5__Impl ;
    public final void rule__Pointcut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3608:1: ( rule__Pointcut__Group__5__Impl )
            // InternalAspectLang.g:3609:2: rule__Pointcut__Group__5__Impl
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
    // InternalAspectLang.g:3615:1: rule__Pointcut__Group__5__Impl : ( ( rule__Pointcut__Group_5__0 )? ) ;
    public final void rule__Pointcut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3619:1: ( ( ( rule__Pointcut__Group_5__0 )? ) )
            // InternalAspectLang.g:3620:1: ( ( rule__Pointcut__Group_5__0 )? )
            {
            // InternalAspectLang.g:3620:1: ( ( rule__Pointcut__Group_5__0 )? )
            // InternalAspectLang.g:3621:1: ( rule__Pointcut__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup_5()); 
            }
            // InternalAspectLang.g:3622:1: ( rule__Pointcut__Group_5__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==49) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAspectLang.g:3622:2: rule__Pointcut__Group_5__0
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
    // InternalAspectLang.g:3644:1: rule__Pointcut__Group_5__0 : rule__Pointcut__Group_5__0__Impl rule__Pointcut__Group_5__1 ;
    public final void rule__Pointcut__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3648:1: ( rule__Pointcut__Group_5__0__Impl rule__Pointcut__Group_5__1 )
            // InternalAspectLang.g:3649:2: rule__Pointcut__Group_5__0__Impl rule__Pointcut__Group_5__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAspectLang.g:3656:1: rule__Pointcut__Group_5__0__Impl : ( 'operation' ) ;
    public final void rule__Pointcut__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3660:1: ( ( 'operation' ) )
            // InternalAspectLang.g:3661:1: ( 'operation' )
            {
            // InternalAspectLang.g:3661:1: ( 'operation' )
            // InternalAspectLang.g:3662:1: 'operation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationKeyword_5_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3675:1: rule__Pointcut__Group_5__1 : rule__Pointcut__Group_5__1__Impl ;
    public final void rule__Pointcut__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3679:1: ( rule__Pointcut__Group_5__1__Impl )
            // InternalAspectLang.g:3680:2: rule__Pointcut__Group_5__1__Impl
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
    // InternalAspectLang.g:3686:1: rule__Pointcut__Group_5__1__Impl : ( ( rule__Pointcut__OperationAssignment_5_1 ) ) ;
    public final void rule__Pointcut__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3690:1: ( ( ( rule__Pointcut__OperationAssignment_5_1 ) ) )
            // InternalAspectLang.g:3691:1: ( ( rule__Pointcut__OperationAssignment_5_1 ) )
            {
            // InternalAspectLang.g:3691:1: ( ( rule__Pointcut__OperationAssignment_5_1 ) )
            // InternalAspectLang.g:3692:1: ( rule__Pointcut__OperationAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationAssignment_5_1()); 
            }
            // InternalAspectLang.g:3693:1: ( rule__Pointcut__OperationAssignment_5_1 )
            // InternalAspectLang.g:3693:2: rule__Pointcut__OperationAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__OperationAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getOperationAssignment_5_1()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:3707:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3711:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalAspectLang.g:3712:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
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
    // InternalAspectLang.g:3719:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3723:1: ( ( '@' ) )
            // InternalAspectLang.g:3724:1: ( '@' )
            {
            // InternalAspectLang.g:3724:1: ( '@' )
            // InternalAspectLang.g:3725:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3738:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3742:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalAspectLang.g:3743:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
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
    // InternalAspectLang.g:3750:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3754:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // InternalAspectLang.g:3755:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:3755:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // InternalAspectLang.g:3756:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:3757:1: ( rule__Annotation__NameAssignment_1 )
            // InternalAspectLang.g:3757:2: rule__Annotation__NameAssignment_1
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
    // InternalAspectLang.g:3767:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3771:1: ( rule__Annotation__Group__2__Impl )
            // InternalAspectLang.g:3772:2: rule__Annotation__Group__2__Impl
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
    // InternalAspectLang.g:3778:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__ValueAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3782:1: ( ( ( rule__Annotation__ValueAssignment_2 ) ) )
            // InternalAspectLang.g:3783:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            {
            // InternalAspectLang.g:3783:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            // InternalAspectLang.g:3784:1: ( rule__Annotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalAspectLang.g:3785:1: ( rule__Annotation__ValueAssignment_2 )
            // InternalAspectLang.g:3785:2: rule__Annotation__ValueAssignment_2
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


    // $ANTLR start "rule__LocationQuery__Group__0"
    // InternalAspectLang.g:3801:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3805:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // InternalAspectLang.g:3806:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAspectLang.g:3813:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__NodeAssignment_0 ) ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3817:1: ( ( ( rule__LocationQuery__NodeAssignment_0 ) ) )
            // InternalAspectLang.g:3818:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            {
            // InternalAspectLang.g:3818:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            // InternalAspectLang.g:3819:1: ( rule__LocationQuery__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }
            // InternalAspectLang.g:3820:1: ( rule__LocationQuery__NodeAssignment_0 )
            // InternalAspectLang.g:3820:2: rule__LocationQuery__NodeAssignment_0
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
    // InternalAspectLang.g:3830:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3834:1: ( rule__LocationQuery__Group__1__Impl )
            // InternalAspectLang.g:3835:2: rule__LocationQuery__Group__1__Impl
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
    // InternalAspectLang.g:3841:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__Alternatives_1 )? ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3845:1: ( ( ( rule__LocationQuery__Alternatives_1 )? ) )
            // InternalAspectLang.g:3846:1: ( ( rule__LocationQuery__Alternatives_1 )? )
            {
            // InternalAspectLang.g:3846:1: ( ( rule__LocationQuery__Alternatives_1 )? )
            // InternalAspectLang.g:3847:1: ( rule__LocationQuery__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getAlternatives_1()); 
            }
            // InternalAspectLang.g:3848:1: ( rule__LocationQuery__Alternatives_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=23 && LA34_0<=24)||LA34_0==44||LA34_0==51) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAspectLang.g:3848:2: rule__LocationQuery__Alternatives_1
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
    // InternalAspectLang.g:3862:1: rule__LocationQuery__Group_1_0__0 : rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1 ;
    public final void rule__LocationQuery__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3866:1: ( rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1 )
            // InternalAspectLang.g:3867:2: rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalAspectLang.g:3874:1: rule__LocationQuery__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3878:1: ( ( '.' ) )
            // InternalAspectLang.g:3879:1: ( '.' )
            {
            // InternalAspectLang.g:3879:1: ( '.' )
            // InternalAspectLang.g:3880:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3893:1: rule__LocationQuery__Group_1_0__1 : rule__LocationQuery__Group_1_0__1__Impl ;
    public final void rule__LocationQuery__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3897:1: ( rule__LocationQuery__Group_1_0__1__Impl )
            // InternalAspectLang.g:3898:2: rule__LocationQuery__Group_1_0__1__Impl
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
    // InternalAspectLang.g:3904:1: rule__LocationQuery__Group_1_0__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) ) ;
    public final void rule__LocationQuery__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3908:1: ( ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) ) )
            // InternalAspectLang.g:3909:1: ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) )
            {
            // InternalAspectLang.g:3909:1: ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) )
            // InternalAspectLang.g:3910:1: ( rule__LocationQuery__SpecializationAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_0_1()); 
            }
            // InternalAspectLang.g:3911:1: ( rule__LocationQuery__SpecializationAssignment_1_0_1 )
            // InternalAspectLang.g:3911:2: rule__LocationQuery__SpecializationAssignment_1_0_1
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
    // InternalAspectLang.g:3925:1: rule__CompositionQuery__Group__0 : rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1 ;
    public final void rule__CompositionQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3929:1: ( rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1 )
            // InternalAspectLang.g:3930:2: rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAspectLang.g:3937:1: rule__CompositionQuery__Group__0__Impl : ( () ) ;
    public final void rule__CompositionQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3941:1: ( ( () ) )
            // InternalAspectLang.g:3942:1: ( () )
            {
            // InternalAspectLang.g:3942:1: ( () )
            // InternalAspectLang.g:3943:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getCompositionQueryAction_0()); 
            }
            // InternalAspectLang.g:3944:1: ()
            // InternalAspectLang.g:3946:1: 
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
    // InternalAspectLang.g:3956:1: rule__CompositionQuery__Group__1 : rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2 ;
    public final void rule__CompositionQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3960:1: ( rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2 )
            // InternalAspectLang.g:3961:2: rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalAspectLang.g:3968:1: rule__CompositionQuery__Group__1__Impl : ( ( rule__CompositionQuery__ModifierAssignment_1 )? ) ;
    public final void rule__CompositionQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3972:1: ( ( ( rule__CompositionQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:3973:1: ( ( rule__CompositionQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:3973:1: ( ( rule__CompositionQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:3974:1: ( rule__CompositionQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:3975:1: ( rule__CompositionQuery__ModifierAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=23 && LA35_0<=24)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAspectLang.g:3975:2: rule__CompositionQuery__ModifierAssignment_1
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
    // InternalAspectLang.g:3985:1: rule__CompositionQuery__Group__2 : rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3 ;
    public final void rule__CompositionQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3989:1: ( rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3 )
            // InternalAspectLang.g:3990:2: rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalAspectLang.g:3997:1: rule__CompositionQuery__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositionQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4001:1: ( ( '{' ) )
            // InternalAspectLang.g:4002:1: ( '{' )
            {
            // InternalAspectLang.g:4002:1: ( '{' )
            // InternalAspectLang.g:4003:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4016:1: rule__CompositionQuery__Group__3 : rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4 ;
    public final void rule__CompositionQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4020:1: ( rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4 )
            // InternalAspectLang.g:4021:2: rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalAspectLang.g:4028:1: rule__CompositionQuery__Group__3__Impl : ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* ) ;
    public final void rule__CompositionQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4032:1: ( ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* ) )
            // InternalAspectLang.g:4033:1: ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* )
            {
            // InternalAspectLang.g:4033:1: ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* )
            // InternalAspectLang.g:4034:1: ( rule__CompositionQuery__SubQueriesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getSubQueriesAssignment_3()); 
            }
            // InternalAspectLang.g:4035:1: ( rule__CompositionQuery__SubQueriesAssignment_3 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==RULE_ID||LA36_0==13||(LA36_0>=54 && LA36_0<=55)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalAspectLang.g:4035:2: rule__CompositionQuery__SubQueriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__CompositionQuery__SubQueriesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // InternalAspectLang.g:4045:1: rule__CompositionQuery__Group__4 : rule__CompositionQuery__Group__4__Impl ;
    public final void rule__CompositionQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4049:1: ( rule__CompositionQuery__Group__4__Impl )
            // InternalAspectLang.g:4050:2: rule__CompositionQuery__Group__4__Impl
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
    // InternalAspectLang.g:4056:1: rule__CompositionQuery__Group__4__Impl : ( '}' ) ;
    public final void rule__CompositionQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4060:1: ( ( '}' ) )
            // InternalAspectLang.g:4061:1: ( '}' )
            {
            // InternalAspectLang.g:4061:1: ( '}' )
            // InternalAspectLang.g:4062:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getRightCurlyBracketKeyword_4()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__OperationQuery__Group__0"
    // InternalAspectLang.g:4085:1: rule__OperationQuery__Group__0 : rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 ;
    public final void rule__OperationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4089:1: ( rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 )
            // InternalAspectLang.g:4090:2: rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__OperationQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group__0"


    // $ANTLR start "rule__OperationQuery__Group__0__Impl"
    // InternalAspectLang.g:4097:1: rule__OperationQuery__Group__0__Impl : ( () ) ;
    public final void rule__OperationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4101:1: ( ( () ) )
            // InternalAspectLang.g:4102:1: ( () )
            {
            // InternalAspectLang.g:4102:1: ( () )
            // InternalAspectLang.g:4103:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationQueryAction_0()); 
            }
            // InternalAspectLang.g:4104:1: ()
            // InternalAspectLang.g:4106:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getOperationQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group__0__Impl"


    // $ANTLR start "rule__OperationQuery__Group__1"
    // InternalAspectLang.g:4116:1: rule__OperationQuery__Group__1 : rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 ;
    public final void rule__OperationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4120:1: ( rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 )
            // InternalAspectLang.g:4121:2: rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__OperationQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group__1"


    // $ANTLR start "rule__OperationQuery__Group__1__Impl"
    // InternalAspectLang.g:4128:1: rule__OperationQuery__Group__1__Impl : ( ( rule__OperationQuery__ModifierAssignment_1 )? ) ;
    public final void rule__OperationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4132:1: ( ( ( rule__OperationQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:4133:1: ( ( rule__OperationQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:4133:1: ( ( rule__OperationQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:4134:1: ( rule__OperationQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:4135:1: ( rule__OperationQuery__ModifierAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                int LA37_1 = input.LA(2);

                if ( (synpred49_InternalAspectLang()) ) {
                    alt37=1;
                }
            }
            switch (alt37) {
                case 1 :
                    // InternalAspectLang.g:4135:2: rule__OperationQuery__ModifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationQuery__ModifierAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getModifierAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group__1__Impl"


    // $ANTLR start "rule__OperationQuery__Group__2"
    // InternalAspectLang.g:4145:1: rule__OperationQuery__Group__2 : rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 ;
    public final void rule__OperationQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4149:1: ( rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 )
            // InternalAspectLang.g:4150:2: rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__OperationQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group__2"


    // $ANTLR start "rule__OperationQuery__Group__2__Impl"
    // InternalAspectLang.g:4157:1: rule__OperationQuery__Group__2__Impl : ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? ) ;
    public final void rule__OperationQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4161:1: ( ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? ) )
            // InternalAspectLang.g:4162:1: ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? )
            {
            // InternalAspectLang.g:4162:1: ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? )
            // InternalAspectLang.g:4163:1: ( rule__OperationQuery__ReturnTypeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getReturnTypeAssignment_2()); 
            }
            // InternalAspectLang.g:4164:1: ( rule__OperationQuery__ReturnTypeAssignment_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==RULE_ID||LA38_1==13) ) {
                    alt38=1;
                }
            }
            switch (alt38) {
                case 1 :
                    // InternalAspectLang.g:4164:2: rule__OperationQuery__ReturnTypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationQuery__ReturnTypeAssignment_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getReturnTypeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group__2__Impl"


    // $ANTLR start "rule__OperationQuery__Group__3"
    // InternalAspectLang.g:4174:1: rule__OperationQuery__Group__3 : rule__OperationQuery__Group__3__Impl ;
    public final void rule__OperationQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4178:1: ( rule__OperationQuery__Group__3__Impl )
            // InternalAspectLang.g:4179:2: rule__OperationQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group__3"


    // $ANTLR start "rule__OperationQuery__Group__3__Impl"
    // InternalAspectLang.g:4185:1: rule__OperationQuery__Group__3__Impl : ( ( rule__OperationQuery__Alternatives_3 ) ) ;
    public final void rule__OperationQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4189:1: ( ( ( rule__OperationQuery__Alternatives_3 ) ) )
            // InternalAspectLang.g:4190:1: ( ( rule__OperationQuery__Alternatives_3 ) )
            {
            // InternalAspectLang.g:4190:1: ( ( rule__OperationQuery__Alternatives_3 ) )
            // InternalAspectLang.g:4191:1: ( rule__OperationQuery__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getAlternatives_3()); 
            }
            // InternalAspectLang.g:4192:1: ( rule__OperationQuery__Alternatives_3 )
            // InternalAspectLang.g:4192:2: rule__OperationQuery__Alternatives_3
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group__3__Impl"


    // $ANTLR start "rule__OperationQuery__Group_3_0__0"
    // InternalAspectLang.g:4210:1: rule__OperationQuery__Group_3_0__0 : rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1 ;
    public final void rule__OperationQuery__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4214:1: ( rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1 )
            // InternalAspectLang.g:4215:2: rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1
            {
            pushFollow(FOLLOW_13);
            rule__OperationQuery__Group_3_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group_3_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0__0"


    // $ANTLR start "rule__OperationQuery__Group_3_0__0__Impl"
    // InternalAspectLang.g:4222:1: rule__OperationQuery__Group_3_0__0__Impl : ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) ) ;
    public final void rule__OperationQuery__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4226:1: ( ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) ) )
            // InternalAspectLang.g:4227:1: ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) )
            {
            // InternalAspectLang.g:4227:1: ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) )
            // InternalAspectLang.g:4228:1: ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationReferenceAssignment_3_0_0()); 
            }
            // InternalAspectLang.g:4229:1: ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 )
            // InternalAspectLang.g:4229:2: rule__OperationQuery__OperationReferenceAssignment_3_0_0
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__OperationReferenceAssignment_3_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getOperationReferenceAssignment_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0__0__Impl"


    // $ANTLR start "rule__OperationQuery__Group_3_0__1"
    // InternalAspectLang.g:4239:1: rule__OperationQuery__Group_3_0__1 : rule__OperationQuery__Group_3_0__1__Impl ;
    public final void rule__OperationQuery__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4243:1: ( rule__OperationQuery__Group_3_0__1__Impl )
            // InternalAspectLang.g:4244:2: rule__OperationQuery__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group_3_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0__1"


    // $ANTLR start "rule__OperationQuery__Group_3_0__1__Impl"
    // InternalAspectLang.g:4250:1: rule__OperationQuery__Group_3_0__1__Impl : ( ( rule__OperationQuery__Group_3_0_1__0 )? ) ;
    public final void rule__OperationQuery__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4254:1: ( ( ( rule__OperationQuery__Group_3_0_1__0 )? ) )
            // InternalAspectLang.g:4255:1: ( ( rule__OperationQuery__Group_3_0_1__0 )? )
            {
            // InternalAspectLang.g:4255:1: ( ( rule__OperationQuery__Group_3_0_1__0 )? )
            // InternalAspectLang.g:4256:1: ( rule__OperationQuery__Group_3_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup_3_0_1()); 
            }
            // InternalAspectLang.g:4257:1: ( rule__OperationQuery__Group_3_0_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==41) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalAspectLang.g:4257:2: rule__OperationQuery__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OperationQuery__Group_3_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getGroup_3_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0__1__Impl"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1__0"
    // InternalAspectLang.g:4271:1: rule__OperationQuery__Group_3_0_1__0 : rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1 ;
    public final void rule__OperationQuery__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4275:1: ( rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1 )
            // InternalAspectLang.g:4276:2: rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1
            {
            pushFollow(FOLLOW_27);
            rule__OperationQuery__Group_3_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group_3_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1__0"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1__0__Impl"
    // InternalAspectLang.g:4283:1: rule__OperationQuery__Group_3_0_1__0__Impl : ( '(' ) ;
    public final void rule__OperationQuery__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4287:1: ( ( '(' ) )
            // InternalAspectLang.g:4288:1: ( '(' )
            {
            // InternalAspectLang.g:4288:1: ( '(' )
            // InternalAspectLang.g:4289:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getLeftParenthesisKeyword_3_0_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getLeftParenthesisKeyword_3_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1__1"
    // InternalAspectLang.g:4302:1: rule__OperationQuery__Group_3_0_1__1 : rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2 ;
    public final void rule__OperationQuery__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4306:1: ( rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2 )
            // InternalAspectLang.g:4307:2: rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2
            {
            pushFollow(FOLLOW_31);
            rule__OperationQuery__Group_3_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group_3_0_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1__1"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1__1__Impl"
    // InternalAspectLang.g:4314:1: rule__OperationQuery__Group_3_0_1__1__Impl : ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) ) ;
    public final void rule__OperationQuery__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4318:1: ( ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) ) )
            // InternalAspectLang.g:4319:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) )
            {
            // InternalAspectLang.g:4319:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) )
            // InternalAspectLang.g:4320:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_1()); 
            }
            // InternalAspectLang.g:4321:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 )
            // InternalAspectLang.g:4321:2: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1__2"
    // InternalAspectLang.g:4331:1: rule__OperationQuery__Group_3_0_1__2 : rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3 ;
    public final void rule__OperationQuery__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4335:1: ( rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3 )
            // InternalAspectLang.g:4336:2: rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3
            {
            pushFollow(FOLLOW_31);
            rule__OperationQuery__Group_3_0_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group_3_0_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1__2"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1__2__Impl"
    // InternalAspectLang.g:4343:1: rule__OperationQuery__Group_3_0_1__2__Impl : ( ( rule__OperationQuery__Group_3_0_1_2__0 )* ) ;
    public final void rule__OperationQuery__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4347:1: ( ( ( rule__OperationQuery__Group_3_0_1_2__0 )* ) )
            // InternalAspectLang.g:4348:1: ( ( rule__OperationQuery__Group_3_0_1_2__0 )* )
            {
            // InternalAspectLang.g:4348:1: ( ( rule__OperationQuery__Group_3_0_1_2__0 )* )
            // InternalAspectLang.g:4349:1: ( rule__OperationQuery__Group_3_0_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup_3_0_1_2()); 
            }
            // InternalAspectLang.g:4350:1: ( rule__OperationQuery__Group_3_0_1_2__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==40) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalAspectLang.g:4350:2: rule__OperationQuery__Group_3_0_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OperationQuery__Group_3_0_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getGroup_3_0_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1__2__Impl"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1__3"
    // InternalAspectLang.g:4360:1: rule__OperationQuery__Group_3_0_1__3 : rule__OperationQuery__Group_3_0_1__3__Impl ;
    public final void rule__OperationQuery__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4364:1: ( rule__OperationQuery__Group_3_0_1__3__Impl )
            // InternalAspectLang.g:4365:2: rule__OperationQuery__Group_3_0_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group_3_0_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1__3"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1__3__Impl"
    // InternalAspectLang.g:4371:1: rule__OperationQuery__Group_3_0_1__3__Impl : ( ')' ) ;
    public final void rule__OperationQuery__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4375:1: ( ( ')' ) )
            // InternalAspectLang.g:4376:1: ( ')' )
            {
            // InternalAspectLang.g:4376:1: ( ')' )
            // InternalAspectLang.g:4377:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getRightParenthesisKeyword_3_0_1_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getRightParenthesisKeyword_3_0_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1__3__Impl"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1_2__0"
    // InternalAspectLang.g:4398:1: rule__OperationQuery__Group_3_0_1_2__0 : rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1 ;
    public final void rule__OperationQuery__Group_3_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4402:1: ( rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1 )
            // InternalAspectLang.g:4403:2: rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1
            {
            pushFollow(FOLLOW_27);
            rule__OperationQuery__Group_3_0_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group_3_0_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1_2__0"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1_2__0__Impl"
    // InternalAspectLang.g:4410:1: rule__OperationQuery__Group_3_0_1_2__0__Impl : ( ',' ) ;
    public final void rule__OperationQuery__Group_3_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4414:1: ( ( ',' ) )
            // InternalAspectLang.g:4415:1: ( ',' )
            {
            // InternalAspectLang.g:4415:1: ( ',' )
            // InternalAspectLang.g:4416:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getCommaKeyword_3_0_1_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getCommaKeyword_3_0_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1_2__0__Impl"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1_2__1"
    // InternalAspectLang.g:4429:1: rule__OperationQuery__Group_3_0_1_2__1 : rule__OperationQuery__Group_3_0_1_2__1__Impl ;
    public final void rule__OperationQuery__Group_3_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4433:1: ( rule__OperationQuery__Group_3_0_1_2__1__Impl )
            // InternalAspectLang.g:4434:2: rule__OperationQuery__Group_3_0_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__Group_3_0_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1_2__1"


    // $ANTLR start "rule__OperationQuery__Group_3_0_1_2__1__Impl"
    // InternalAspectLang.g:4440:1: rule__OperationQuery__Group_3_0_1_2__1__Impl : ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) ) ;
    public final void rule__OperationQuery__Group_3_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4444:1: ( ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) ) )
            // InternalAspectLang.g:4445:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) )
            {
            // InternalAspectLang.g:4445:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) )
            // InternalAspectLang.g:4446:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_2_1()); 
            }
            // InternalAspectLang.g:4447:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 )
            // InternalAspectLang.g:4447:2: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__Group_3_0_1_2__1__Impl"


    // $ANTLR start "rule__ParameterQuery__Group__0"
    // InternalAspectLang.g:4461:1: rule__ParameterQuery__Group__0 : rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1 ;
    public final void rule__ParameterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4465:1: ( rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1 )
            // InternalAspectLang.g:4466:2: rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalAspectLang.g:4473:1: rule__ParameterQuery__Group__0__Impl : ( () ) ;
    public final void rule__ParameterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4477:1: ( ( () ) )
            // InternalAspectLang.g:4478:1: ( () )
            {
            // InternalAspectLang.g:4478:1: ( () )
            // InternalAspectLang.g:4479:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterQueryAction_0()); 
            }
            // InternalAspectLang.g:4480:1: ()
            // InternalAspectLang.g:4482:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getParameterQueryAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__0__Impl"


    // $ANTLR start "rule__ParameterQuery__Group__1"
    // InternalAspectLang.g:4492:1: rule__ParameterQuery__Group__1 : rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2 ;
    public final void rule__ParameterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4496:1: ( rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2 )
            // InternalAspectLang.g:4497:2: rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalAspectLang.g:4504:1: rule__ParameterQuery__Group__1__Impl : ( ( rule__ParameterQuery__ModifierAssignment_1 )? ) ;
    public final void rule__ParameterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4508:1: ( ( ( rule__ParameterQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:4509:1: ( ( rule__ParameterQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:4509:1: ( ( rule__ParameterQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:4510:1: ( rule__ParameterQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:4511:1: ( rule__ParameterQuery__ModifierAssignment_1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_ID) ) {
                    int LA41_3 = input.LA(3);

                    if ( (synpred53_InternalAspectLang()) ) {
                        alt41=1;
                    }
                }
                else if ( (LA41_1==13) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // InternalAspectLang.g:4511:2: rule__ParameterQuery__ModifierAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterQuery__ModifierAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getModifierAssignment_1()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:4521:1: rule__ParameterQuery__Group__2 : rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3 ;
    public final void rule__ParameterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4525:1: ( rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3 )
            // InternalAspectLang.g:4526:2: rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__ParameterQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterQuery__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAspectLang.g:4533:1: rule__ParameterQuery__Group__2__Impl : ( ( rule__ParameterQuery__Alternatives_2 ) ) ;
    public final void rule__ParameterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4537:1: ( ( ( rule__ParameterQuery__Alternatives_2 ) ) )
            // InternalAspectLang.g:4538:1: ( ( rule__ParameterQuery__Alternatives_2 ) )
            {
            // InternalAspectLang.g:4538:1: ( ( rule__ParameterQuery__Alternatives_2 ) )
            // InternalAspectLang.g:4539:1: ( rule__ParameterQuery__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getAlternatives_2()); 
            }
            // InternalAspectLang.g:4540:1: ( rule__ParameterQuery__Alternatives_2 )
            // InternalAspectLang.g:4540:2: rule__ParameterQuery__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterQuery__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getAlternatives_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ParameterQuery__Group__3"
    // InternalAspectLang.g:4550:1: rule__ParameterQuery__Group__3 : rule__ParameterQuery__Group__3__Impl ;
    public final void rule__ParameterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4554:1: ( rule__ParameterQuery__Group__3__Impl )
            // InternalAspectLang.g:4555:2: rule__ParameterQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__3"


    // $ANTLR start "rule__ParameterQuery__Group__3__Impl"
    // InternalAspectLang.g:4561:1: rule__ParameterQuery__Group__3__Impl : ( ( rule__ParameterQuery__ParameterAssignment_3 )? ) ;
    public final void rule__ParameterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4565:1: ( ( ( rule__ParameterQuery__ParameterAssignment_3 )? ) )
            // InternalAspectLang.g:4566:1: ( ( rule__ParameterQuery__ParameterAssignment_3 )? )
            {
            // InternalAspectLang.g:4566:1: ( ( rule__ParameterQuery__ParameterAssignment_3 )? )
            // InternalAspectLang.g:4567:1: ( rule__ParameterQuery__ParameterAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterAssignment_3()); 
            }
            // InternalAspectLang.g:4568:1: ( rule__ParameterQuery__ParameterAssignment_3 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalAspectLang.g:4568:2: rule__ParameterQuery__ParameterAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterQuery__ParameterAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getParameterAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__Group__3__Impl"


    // $ANTLR start "rule__Node__Group__0"
    // InternalAspectLang.g:4586:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4590:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalAspectLang.g:4591:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAspectLang.g:4598:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4602:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // InternalAspectLang.g:4603:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // InternalAspectLang.g:4603:1: ( ( rule__Node__Alternatives_0 ) )
            // InternalAspectLang.g:4604:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // InternalAspectLang.g:4605:1: ( rule__Node__Alternatives_0 )
            // InternalAspectLang.g:4605:2: rule__Node__Alternatives_0
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
    // InternalAspectLang.g:4615:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4619:1: ( rule__Node__Group__1__Impl )
            // InternalAspectLang.g:4620:2: rule__Node__Group__1__Impl
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
    // InternalAspectLang.g:4626:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4630:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalAspectLang.g:4631:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalAspectLang.g:4631:1: ( ( rule__Node__Group_1__0 )? )
            // InternalAspectLang.g:4632:1: ( rule__Node__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:4633:1: ( rule__Node__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==52) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAspectLang.g:4633:2: rule__Node__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Node__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getGroup_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Node__Group_1__0"
    // InternalAspectLang.g:4647:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4651:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalAspectLang.g:4652:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Node__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Node__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__0"


    // $ANTLR start "rule__Node__Group_1__0__Impl"
    // InternalAspectLang.g:4659:1: rule__Node__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4663:1: ( ( '[' ) )
            // InternalAspectLang.g:4664:1: ( '[' )
            {
            // InternalAspectLang.g:4664:1: ( '[' )
            // InternalAspectLang.g:4665:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__0__Impl"


    // $ANTLR start "rule__Node__Group_1__1"
    // InternalAspectLang.g:4678:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl rule__Node__Group_1__2 ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4682:1: ( rule__Node__Group_1__1__Impl rule__Node__Group_1__2 )
            // InternalAspectLang.g:4683:2: rule__Node__Group_1__1__Impl rule__Node__Group_1__2
            {
            pushFollow(FOLLOW_34);
            rule__Node__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Node__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__1"


    // $ANTLR start "rule__Node__Group_1__1__Impl"
    // InternalAspectLang.g:4690:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__ConstraintAssignment_1_1 ) ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4694:1: ( ( ( rule__Node__ConstraintAssignment_1_1 ) ) )
            // InternalAspectLang.g:4695:1: ( ( rule__Node__ConstraintAssignment_1_1 ) )
            {
            // InternalAspectLang.g:4695:1: ( ( rule__Node__ConstraintAssignment_1_1 ) )
            // InternalAspectLang.g:4696:1: ( rule__Node__ConstraintAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getConstraintAssignment_1_1()); 
            }
            // InternalAspectLang.g:4697:1: ( rule__Node__ConstraintAssignment_1_1 )
            // InternalAspectLang.g:4697:2: rule__Node__ConstraintAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Node__ConstraintAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getConstraintAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__1__Impl"


    // $ANTLR start "rule__Node__Group_1__2"
    // InternalAspectLang.g:4707:1: rule__Node__Group_1__2 : rule__Node__Group_1__2__Impl ;
    public final void rule__Node__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4711:1: ( rule__Node__Group_1__2__Impl )
            // InternalAspectLang.g:4712:2: rule__Node__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Node__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__2"


    // $ANTLR start "rule__Node__Group_1__2__Impl"
    // InternalAspectLang.g:4718:1: rule__Node__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Node__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4722:1: ( ( ']' ) )
            // InternalAspectLang.g:4723:1: ( ']' )
            {
            // InternalAspectLang.g:4723:1: ( ']' )
            // InternalAspectLang.g:4724:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__Group_1__2__Impl"


    // $ANTLR start "rule__WildcardNode__Group__0"
    // InternalAspectLang.g:4743:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4747:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // InternalAspectLang.g:4748:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAspectLang.g:4755:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4759:1: ( ( () ) )
            // InternalAspectLang.g:4760:1: ( () )
            {
            // InternalAspectLang.g:4760:1: ( () )
            // InternalAspectLang.g:4761:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }
            // InternalAspectLang.g:4762:1: ()
            // InternalAspectLang.g:4764:1: 
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
    // InternalAspectLang.g:4774:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4778:1: ( rule__WildcardNode__Group__1__Impl )
            // InternalAspectLang.g:4779:2: rule__WildcardNode__Group__1__Impl
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
    // InternalAspectLang.g:4785:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4789:1: ( ( '*' ) )
            // InternalAspectLang.g:4790:1: ( '*' )
            {
            // InternalAspectLang.g:4790:1: ( '*' )
            // InternalAspectLang.g:4791:1: '*'
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
    // InternalAspectLang.g:4808:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4812:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // InternalAspectLang.g:4813:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAspectLang.g:4820:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4824:1: ( ( () ) )
            // InternalAspectLang.g:4825:1: ( () )
            {
            // InternalAspectLang.g:4825:1: ( () )
            // InternalAspectLang.g:4826:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // InternalAspectLang.g:4827:1: ()
            // InternalAspectLang.g:4829:1: 
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
    // InternalAspectLang.g:4839:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4843:1: ( rule__SubPathNode__Group__1__Impl )
            // InternalAspectLang.g:4844:2: rule__SubPathNode__Group__1__Impl
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
    // InternalAspectLang.g:4850:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4854:1: ( ( '**' ) )
            // InternalAspectLang.g:4855:1: ( '**' )
            {
            // InternalAspectLang.g:4855:1: ( '**' )
            // InternalAspectLang.g:4856:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4873:1: rule__ParentNode__Group__0 : rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 ;
    public final void rule__ParentNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4877:1: ( rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 )
            // InternalAspectLang.g:4878:2: rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAspectLang.g:4885:1: rule__ParentNode__Group__0__Impl : ( () ) ;
    public final void rule__ParentNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4889:1: ( ( () ) )
            // InternalAspectLang.g:4890:1: ( () )
            {
            // InternalAspectLang.g:4890:1: ( () )
            // InternalAspectLang.g:4891:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getParentNodeAction_0()); 
            }
            // InternalAspectLang.g:4892:1: ()
            // InternalAspectLang.g:4894:1: 
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
    // InternalAspectLang.g:4904:1: rule__ParentNode__Group__1 : rule__ParentNode__Group__1__Impl ;
    public final void rule__ParentNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4908:1: ( rule__ParentNode__Group__1__Impl )
            // InternalAspectLang.g:4909:2: rule__ParentNode__Group__1__Impl
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
    // InternalAspectLang.g:4915:1: rule__ParentNode__Group__1__Impl : ( 'up' ) ;
    public final void rule__ParentNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4919:1: ( ( 'up' ) )
            // InternalAspectLang.g:4920:1: ( 'up' )
            {
            // InternalAspectLang.g:4920:1: ( 'up' )
            // InternalAspectLang.g:4921:1: 'up'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getUpKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentNodeAccess().getUpKeyword_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__PropertyConstraint__Group__0"
    // InternalAspectLang.g:4938:1: rule__PropertyConstraint__Group__0 : rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 ;
    public final void rule__PropertyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4942:1: ( rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 )
            // InternalAspectLang.g:4943:2: rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__PropertyConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group__0"


    // $ANTLR start "rule__PropertyConstraint__Group__0__Impl"
    // InternalAspectLang.g:4950:1: rule__PropertyConstraint__Group__0__Impl : ( rulePropertyConstraintCompare ) ;
    public final void rule__PropertyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4954:1: ( ( rulePropertyConstraintCompare ) )
            // InternalAspectLang.g:4955:1: ( rulePropertyConstraintCompare )
            {
            // InternalAspectLang.g:4955:1: ( rulePropertyConstraintCompare )
            // InternalAspectLang.g:4956:1: rulePropertyConstraintCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintCompareParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertyConstraintCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintCompareParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group__0__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group__1"
    // InternalAspectLang.g:4967:1: rule__PropertyConstraint__Group__1 : rule__PropertyConstraint__Group__1__Impl ;
    public final void rule__PropertyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4971:1: ( rule__PropertyConstraint__Group__1__Impl )
            // InternalAspectLang.g:4972:2: rule__PropertyConstraint__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group__1"


    // $ANTLR start "rule__PropertyConstraint__Group__1__Impl"
    // InternalAspectLang.g:4978:1: rule__PropertyConstraint__Group__1__Impl : ( ( rule__PropertyConstraint__Group_1__0 )? ) ;
    public final void rule__PropertyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4982:1: ( ( ( rule__PropertyConstraint__Group_1__0 )? ) )
            // InternalAspectLang.g:4983:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            {
            // InternalAspectLang.g:4983:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            // InternalAspectLang.g:4984:1: ( rule__PropertyConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:4985:1: ( rule__PropertyConstraint__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( ((LA44_0>=25 && LA44_0<=26)) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAspectLang.g:4985:2: rule__PropertyConstraint__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyConstraint__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group__1__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group_1__0"
    // InternalAspectLang.g:4999:1: rule__PropertyConstraint__Group_1__0 : rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 ;
    public final void rule__PropertyConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5003:1: ( rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 )
            // InternalAspectLang.g:5004:2: rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__PropertyConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1__0"


    // $ANTLR start "rule__PropertyConstraint__Group_1__0__Impl"
    // InternalAspectLang.g:5011:1: rule__PropertyConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__PropertyConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5015:1: ( ( () ) )
            // InternalAspectLang.g:5016:1: ( () )
            {
            // InternalAspectLang.g:5016:1: ( () )
            // InternalAspectLang.g:5017:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintExpressionLeftAction_1_0()); 
            }
            // InternalAspectLang.g:5018:1: ()
            // InternalAspectLang.g:5020:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group_1__1"
    // InternalAspectLang.g:5030:1: rule__PropertyConstraint__Group_1__1 : rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2 ;
    public final void rule__PropertyConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5034:1: ( rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2 )
            // InternalAspectLang.g:5035:2: rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__PropertyConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyConstraint__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1__1"


    // $ANTLR start "rule__PropertyConstraint__Group_1__1__Impl"
    // InternalAspectLang.g:5042:1: rule__PropertyConstraint__Group_1__1__Impl : ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) ) ;
    public final void rule__PropertyConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5046:1: ( ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) ) )
            // InternalAspectLang.g:5047:1: ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) )
            {
            // InternalAspectLang.g:5047:1: ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) )
            // InternalAspectLang.g:5048:1: ( rule__PropertyConstraint__LogicAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getLogicAssignment_1_1()); 
            }
            // InternalAspectLang.g:5049:1: ( rule__PropertyConstraint__LogicAssignment_1_1 )
            // InternalAspectLang.g:5049:2: rule__PropertyConstraint__LogicAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraint__LogicAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getLogicAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyConstraint__Group_1__2"
    // InternalAspectLang.g:5059:1: rule__PropertyConstraint__Group_1__2 : rule__PropertyConstraint__Group_1__2__Impl ;
    public final void rule__PropertyConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5063:1: ( rule__PropertyConstraint__Group_1__2__Impl )
            // InternalAspectLang.g:5064:2: rule__PropertyConstraint__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraint__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1__2"


    // $ANTLR start "rule__PropertyConstraint__Group_1__2__Impl"
    // InternalAspectLang.g:5070:1: rule__PropertyConstraint__Group_1__2__Impl : ( ( rule__PropertyConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__PropertyConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5074:1: ( ( ( rule__PropertyConstraint__RightAssignment_1_2 ) ) )
            // InternalAspectLang.g:5075:1: ( ( rule__PropertyConstraint__RightAssignment_1_2 ) )
            {
            // InternalAspectLang.g:5075:1: ( ( rule__PropertyConstraint__RightAssignment_1_2 ) )
            // InternalAspectLang.g:5076:1: ( rule__PropertyConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalAspectLang.g:5077:1: ( rule__PropertyConstraint__RightAssignment_1_2 )
            // InternalAspectLang.g:5077:2: rule__PropertyConstraint__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraint__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__PropertyConstraintCompare__Group__0"
    // InternalAspectLang.g:5093:1: rule__PropertyConstraintCompare__Group__0 : rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1 ;
    public final void rule__PropertyConstraintCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5097:1: ( rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1 )
            // InternalAspectLang.g:5098:2: rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__PropertyConstraintCompare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyConstraintCompare__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group__0"


    // $ANTLR start "rule__PropertyConstraintCompare__Group__0__Impl"
    // InternalAspectLang.g:5105:1: rule__PropertyConstraintCompare__Group__0__Impl : ( ruleConstraintElement ) ;
    public final void rule__PropertyConstraintCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5109:1: ( ( ruleConstraintElement ) )
            // InternalAspectLang.g:5110:1: ( ruleConstraintElement )
            {
            // InternalAspectLang.g:5110:1: ( ruleConstraintElement )
            // InternalAspectLang.g:5111:1: ruleConstraintElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getConstraintElementParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstraintElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getConstraintElementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group__0__Impl"


    // $ANTLR start "rule__PropertyConstraintCompare__Group__1"
    // InternalAspectLang.g:5122:1: rule__PropertyConstraintCompare__Group__1 : rule__PropertyConstraintCompare__Group__1__Impl ;
    public final void rule__PropertyConstraintCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5126:1: ( rule__PropertyConstraintCompare__Group__1__Impl )
            // InternalAspectLang.g:5127:2: rule__PropertyConstraintCompare__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraintCompare__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group__1"


    // $ANTLR start "rule__PropertyConstraintCompare__Group__1__Impl"
    // InternalAspectLang.g:5133:1: rule__PropertyConstraintCompare__Group__1__Impl : ( ( rule__PropertyConstraintCompare__Group_1__0 )? ) ;
    public final void rule__PropertyConstraintCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5137:1: ( ( ( rule__PropertyConstraintCompare__Group_1__0 )? ) )
            // InternalAspectLang.g:5138:1: ( ( rule__PropertyConstraintCompare__Group_1__0 )? )
            {
            // InternalAspectLang.g:5138:1: ( ( rule__PropertyConstraintCompare__Group_1__0 )? )
            // InternalAspectLang.g:5139:1: ( rule__PropertyConstraintCompare__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5140:1: ( rule__PropertyConstraintCompare__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=27 && LA45_0<=33)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAspectLang.g:5140:2: rule__PropertyConstraintCompare__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyConstraintCompare__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group__1__Impl"


    // $ANTLR start "rule__PropertyConstraintCompare__Group_1__0"
    // InternalAspectLang.g:5154:1: rule__PropertyConstraintCompare__Group_1__0 : rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1 ;
    public final void rule__PropertyConstraintCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5158:1: ( rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1 )
            // InternalAspectLang.g:5159:2: rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1
            {
            pushFollow(FOLLOW_39);
            rule__PropertyConstraintCompare__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyConstraintCompare__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group_1__0"


    // $ANTLR start "rule__PropertyConstraintCompare__Group_1__0__Impl"
    // InternalAspectLang.g:5166:1: rule__PropertyConstraintCompare__Group_1__0__Impl : ( () ) ;
    public final void rule__PropertyConstraintCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5170:1: ( ( () ) )
            // InternalAspectLang.g:5171:1: ( () )
            {
            // InternalAspectLang.g:5171:1: ( () )
            // InternalAspectLang.g:5172:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getPropertyConstraintExpressionLeftAction_1_0()); 
            }
            // InternalAspectLang.g:5173:1: ()
            // InternalAspectLang.g:5175:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getPropertyConstraintExpressionLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group_1__0__Impl"


    // $ANTLR start "rule__PropertyConstraintCompare__Group_1__1"
    // InternalAspectLang.g:5185:1: rule__PropertyConstraintCompare__Group_1__1 : rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2 ;
    public final void rule__PropertyConstraintCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5189:1: ( rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2 )
            // InternalAspectLang.g:5190:2: rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2
            {
            pushFollow(FOLLOW_33);
            rule__PropertyConstraintCompare__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyConstraintCompare__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group_1__1"


    // $ANTLR start "rule__PropertyConstraintCompare__Group_1__1__Impl"
    // InternalAspectLang.g:5197:1: rule__PropertyConstraintCompare__Group_1__1__Impl : ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) ) ;
    public final void rule__PropertyConstraintCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5201:1: ( ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) ) )
            // InternalAspectLang.g:5202:1: ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) )
            {
            // InternalAspectLang.g:5202:1: ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) )
            // InternalAspectLang.g:5203:1: ( rule__PropertyConstraintCompare__CompareAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getCompareAssignment_1_1()); 
            }
            // InternalAspectLang.g:5204:1: ( rule__PropertyConstraintCompare__CompareAssignment_1_1 )
            // InternalAspectLang.g:5204:2: rule__PropertyConstraintCompare__CompareAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraintCompare__CompareAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getCompareAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group_1__1__Impl"


    // $ANTLR start "rule__PropertyConstraintCompare__Group_1__2"
    // InternalAspectLang.g:5214:1: rule__PropertyConstraintCompare__Group_1__2 : rule__PropertyConstraintCompare__Group_1__2__Impl ;
    public final void rule__PropertyConstraintCompare__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5218:1: ( rule__PropertyConstraintCompare__Group_1__2__Impl )
            // InternalAspectLang.g:5219:2: rule__PropertyConstraintCompare__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraintCompare__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group_1__2"


    // $ANTLR start "rule__PropertyConstraintCompare__Group_1__2__Impl"
    // InternalAspectLang.g:5225:1: rule__PropertyConstraintCompare__Group_1__2__Impl : ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) ) ;
    public final void rule__PropertyConstraintCompare__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5229:1: ( ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) ) )
            // InternalAspectLang.g:5230:1: ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) )
            {
            // InternalAspectLang.g:5230:1: ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) )
            // InternalAspectLang.g:5231:1: ( rule__PropertyConstraintCompare__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getRightAssignment_1_2()); 
            }
            // InternalAspectLang.g:5232:1: ( rule__PropertyConstraintCompare__RightAssignment_1_2 )
            // InternalAspectLang.g:5232:2: rule__PropertyConstraintCompare__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__PropertyConstraintCompare__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__Group_1__2__Impl"


    // $ANTLR start "rule__LocalQuery__Group__0"
    // InternalAspectLang.g:5248:1: rule__LocalQuery__Group__0 : rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1 ;
    public final void rule__LocalQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5252:1: ( rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1 )
            // InternalAspectLang.g:5253:2: rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__LocalQuery__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalQuery__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalQuery__Group__0"


    // $ANTLR start "rule__LocalQuery__Group__0__Impl"
    // InternalAspectLang.g:5260:1: rule__LocalQuery__Group__0__Impl : ( ( rule__LocalQuery__LocationQueryAssignment_0 )? ) ;
    public final void rule__LocalQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5264:1: ( ( ( rule__LocalQuery__LocationQueryAssignment_0 )? ) )
            // InternalAspectLang.g:5265:1: ( ( rule__LocalQuery__LocationQueryAssignment_0 )? )
            {
            // InternalAspectLang.g:5265:1: ( ( rule__LocalQuery__LocationQueryAssignment_0 )? )
            // InternalAspectLang.g:5266:1: ( rule__LocalQuery__LocationQueryAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getLocationQueryAssignment_0()); 
            }
            // InternalAspectLang.g:5267:1: ( rule__LocalQuery__LocationQueryAssignment_0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ID||LA46_0==13||(LA46_0>=54 && LA46_0<=55)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAspectLang.g:5267:2: rule__LocalQuery__LocationQueryAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalQuery__LocationQueryAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalQueryAccess().getLocationQueryAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalQuery__Group__0__Impl"


    // $ANTLR start "rule__LocalQuery__Group__1"
    // InternalAspectLang.g:5277:1: rule__LocalQuery__Group__1 : rule__LocalQuery__Group__1__Impl ;
    public final void rule__LocalQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5281:1: ( rule__LocalQuery__Group__1__Impl )
            // InternalAspectLang.g:5282:2: rule__LocalQuery__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalQuery__Group__1"


    // $ANTLR start "rule__LocalQuery__Group__1__Impl"
    // InternalAspectLang.g:5288:1: rule__LocalQuery__Group__1__Impl : ( ( rule__LocalQuery__Alternatives_1 ) ) ;
    public final void rule__LocalQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5292:1: ( ( ( rule__LocalQuery__Alternatives_1 ) ) )
            // InternalAspectLang.g:5293:1: ( ( rule__LocalQuery__Alternatives_1 ) )
            {
            // InternalAspectLang.g:5293:1: ( ( rule__LocalQuery__Alternatives_1 ) )
            // InternalAspectLang.g:5294:1: ( rule__LocalQuery__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getAlternatives_1()); 
            }
            // InternalAspectLang.g:5295:1: ( rule__LocalQuery__Alternatives_1 )
            // InternalAspectLang.g:5295:2: rule__LocalQuery__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalQuery__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalQueryAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalQuery__Group__1__Impl"


    // $ANTLR start "rule__ModelProperty__Group__0"
    // InternalAspectLang.g:5309:1: rule__ModelProperty__Group__0 : rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 ;
    public final void rule__ModelProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5313:1: ( rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 )
            // InternalAspectLang.g:5314:2: rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ModelProperty__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__0"


    // $ANTLR start "rule__ModelProperty__Group__0__Impl"
    // InternalAspectLang.g:5321:1: rule__ModelProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__ModelProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5325:1: ( ( '#' ) )
            // InternalAspectLang.g:5326:1: ( '#' )
            {
            // InternalAspectLang.g:5326:1: ( '#' )
            // InternalAspectLang.g:5327:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getNumberSignKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__0__Impl"


    // $ANTLR start "rule__ModelProperty__Group__1"
    // InternalAspectLang.g:5340:1: rule__ModelProperty__Group__1 : rule__ModelProperty__Group__1__Impl ;
    public final void rule__ModelProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5344:1: ( rule__ModelProperty__Group__1__Impl )
            // InternalAspectLang.g:5345:2: rule__ModelProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__1"


    // $ANTLR start "rule__ModelProperty__Group__1__Impl"
    // InternalAspectLang.g:5351:1: rule__ModelProperty__Group__1__Impl : ( ( rule__ModelProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__ModelProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5355:1: ( ( ( rule__ModelProperty__ReferenceAssignment_1 ) ) )
            // InternalAspectLang.g:5356:1: ( ( rule__ModelProperty__ReferenceAssignment_1 ) )
            {
            // InternalAspectLang.g:5356:1: ( ( rule__ModelProperty__ReferenceAssignment_1 ) )
            // InternalAspectLang.g:5357:1: ( rule__ModelProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getReferenceAssignment_1()); 
            }
            // InternalAspectLang.g:5358:1: ( rule__ModelProperty__ReferenceAssignment_1 )
            // InternalAspectLang.g:5358:2: rule__ModelProperty__ReferenceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ModelProperty__ReferenceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getReferenceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__Group__1__Impl"


    // $ANTLR start "rule__Typeof__Group__0"
    // InternalAspectLang.g:5372:1: rule__Typeof__Group__0 : rule__Typeof__Group__0__Impl rule__Typeof__Group__1 ;
    public final void rule__Typeof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5376:1: ( rule__Typeof__Group__0__Impl rule__Typeof__Group__1 )
            // InternalAspectLang.g:5377:2: rule__Typeof__Group__0__Impl rule__Typeof__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Typeof__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Typeof__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__0"


    // $ANTLR start "rule__Typeof__Group__0__Impl"
    // InternalAspectLang.g:5384:1: rule__Typeof__Group__0__Impl : ( 'istypeof' ) ;
    public final void rule__Typeof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5388:1: ( ( 'istypeof' ) )
            // InternalAspectLang.g:5389:1: ( 'istypeof' )
            {
            // InternalAspectLang.g:5389:1: ( 'istypeof' )
            // InternalAspectLang.g:5390:1: 'istypeof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getIstypeofKeyword_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getIstypeofKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__0__Impl"


    // $ANTLR start "rule__Typeof__Group__1"
    // InternalAspectLang.g:5403:1: rule__Typeof__Group__1 : rule__Typeof__Group__1__Impl rule__Typeof__Group__2 ;
    public final void rule__Typeof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5407:1: ( rule__Typeof__Group__1__Impl rule__Typeof__Group__2 )
            // InternalAspectLang.g:5408:2: rule__Typeof__Group__1__Impl rule__Typeof__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Typeof__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Typeof__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__1"


    // $ANTLR start "rule__Typeof__Group__1__Impl"
    // InternalAspectLang.g:5415:1: rule__Typeof__Group__1__Impl : ( '(' ) ;
    public final void rule__Typeof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5419:1: ( ( '(' ) )
            // InternalAspectLang.g:5420:1: ( '(' )
            {
            // InternalAspectLang.g:5420:1: ( '(' )
            // InternalAspectLang.g:5421:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__1__Impl"


    // $ANTLR start "rule__Typeof__Group__2"
    // InternalAspectLang.g:5434:1: rule__Typeof__Group__2 : rule__Typeof__Group__2__Impl rule__Typeof__Group__3 ;
    public final void rule__Typeof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5438:1: ( rule__Typeof__Group__2__Impl rule__Typeof__Group__3 )
            // InternalAspectLang.g:5439:2: rule__Typeof__Group__2__Impl rule__Typeof__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__Typeof__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Typeof__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__2"


    // $ANTLR start "rule__Typeof__Group__2__Impl"
    // InternalAspectLang.g:5446:1: rule__Typeof__Group__2__Impl : ( ( rule__Typeof__ReferenceAssignment_2 ) ) ;
    public final void rule__Typeof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5450:1: ( ( ( rule__Typeof__ReferenceAssignment_2 ) ) )
            // InternalAspectLang.g:5451:1: ( ( rule__Typeof__ReferenceAssignment_2 ) )
            {
            // InternalAspectLang.g:5451:1: ( ( rule__Typeof__ReferenceAssignment_2 ) )
            // InternalAspectLang.g:5452:1: ( rule__Typeof__ReferenceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getReferenceAssignment_2()); 
            }
            // InternalAspectLang.g:5453:1: ( rule__Typeof__ReferenceAssignment_2 )
            // InternalAspectLang.g:5453:2: rule__Typeof__ReferenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Typeof__ReferenceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getReferenceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__2__Impl"


    // $ANTLR start "rule__Typeof__Group__3"
    // InternalAspectLang.g:5463:1: rule__Typeof__Group__3 : rule__Typeof__Group__3__Impl ;
    public final void rule__Typeof__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5467:1: ( rule__Typeof__Group__3__Impl )
            // InternalAspectLang.g:5468:2: rule__Typeof__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Typeof__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__3"


    // $ANTLR start "rule__Typeof__Group__3__Impl"
    // InternalAspectLang.g:5474:1: rule__Typeof__Group__3__Impl : ( ')' ) ;
    public final void rule__Typeof__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5478:1: ( ( ')' ) )
            // InternalAspectLang.g:5479:1: ( ')' )
            {
            // InternalAspectLang.g:5479:1: ( ')' )
            // InternalAspectLang.g:5480:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAspectLang.g:5501:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5505:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAspectLang.g:5506:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAspectLang.g:5513:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5517:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5518:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5518:1: ( RULE_ID )
            // InternalAspectLang.g:5519:1: RULE_ID
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
    // InternalAspectLang.g:5530:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5534:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAspectLang.g:5535:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAspectLang.g:5541:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5545:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAspectLang.g:5546:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAspectLang.g:5546:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAspectLang.g:5547:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5548:1: ( rule__QualifiedName__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==51) ) {
                    int LA47_2 = input.LA(2);

                    if ( (LA47_2==RULE_ID) ) {
                        alt47=1;
                    }


                }


                switch (alt47) {
            	case 1 :
            	    // InternalAspectLang.g:5548:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_42);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalAspectLang.g:5562:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5566:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAspectLang.g:5567:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAspectLang.g:5574:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5578:1: ( ( ( '.' ) ) )
            // InternalAspectLang.g:5579:1: ( ( '.' ) )
            {
            // InternalAspectLang.g:5579:1: ( ( '.' ) )
            // InternalAspectLang.g:5580:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalAspectLang.g:5581:1: ( '.' )
            // InternalAspectLang.g:5582:2: '.'
            {
            match(input,51,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:5593:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5597:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAspectLang.g:5598:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAspectLang.g:5604:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5608:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5609:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5609:1: ( RULE_ID )
            // InternalAspectLang.g:5610:1: RULE_ID
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
    // InternalAspectLang.g:5625:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5629:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAspectLang.g:5630:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAspectLang.g:5637:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5641:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:5642:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:5642:1: ( ruleQualifiedName )
            // InternalAspectLang.g:5643:1: ruleQualifiedName
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
    // InternalAspectLang.g:5654:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5658:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAspectLang.g:5659:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAspectLang.g:5665:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5669:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // InternalAspectLang.g:5670:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // InternalAspectLang.g:5670:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // InternalAspectLang.g:5671:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5672:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==51) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAspectLang.g:5672:2: rule__QualifiedNameWithWildcard__Group_1__0
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
    // InternalAspectLang.g:5686:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5690:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // InternalAspectLang.g:5691:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalAspectLang.g:5698:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5702:1: ( ( '.' ) )
            // InternalAspectLang.g:5703:1: ( '.' )
            {
            // InternalAspectLang.g:5703:1: ( '.' )
            // InternalAspectLang.g:5704:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5717:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5721:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // InternalAspectLang.g:5722:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
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
    // InternalAspectLang.g:5728:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5732:1: ( ( '*' ) )
            // InternalAspectLang.g:5733:1: ( '*' )
            {
            // InternalAspectLang.g:5733:1: ( '*' )
            // InternalAspectLang.g:5734:1: '*'
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


    // $ANTLR start "rule__AspectModel__NameAssignment_1"
    // InternalAspectLang.g:5752:1: rule__AspectModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AspectModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5756:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:5757:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:5757:1: ( ruleQualifiedName )
            // InternalAspectLang.g:5758:1: ruleQualifiedName
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
    // InternalAspectLang.g:5767:1: rule__AspectModel__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__AspectModel__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5771:1: ( ( ruleImport ) )
            // InternalAspectLang.g:5772:1: ( ruleImport )
            {
            // InternalAspectLang.g:5772:1: ( ruleImport )
            // InternalAspectLang.g:5773:1: ruleImport
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
    // InternalAspectLang.g:5782:1: rule__AspectModel__SourcesAssignment_3 : ( ruleApplicationModel ) ;
    public final void rule__AspectModel__SourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5786:1: ( ( ruleApplicationModel ) )
            // InternalAspectLang.g:5787:1: ( ruleApplicationModel )
            {
            // InternalAspectLang.g:5787:1: ( ruleApplicationModel )
            // InternalAspectLang.g:5788:1: ruleApplicationModel
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
    // InternalAspectLang.g:5797:1: rule__AspectModel__AdvicesAssignment_4_0 : ( ruleAdvice ) ;
    public final void rule__AspectModel__AdvicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5801:1: ( ( ruleAdvice ) )
            // InternalAspectLang.g:5802:1: ( ruleAdvice )
            {
            // InternalAspectLang.g:5802:1: ( ruleAdvice )
            // InternalAspectLang.g:5803:1: ruleAdvice
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
    // InternalAspectLang.g:5812:1: rule__AspectModel__PointcutsAssignment_4_1 : ( rulePointcut ) ;
    public final void rule__AspectModel__PointcutsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5816:1: ( ( rulePointcut ) )
            // InternalAspectLang.g:5817:1: ( rulePointcut )
            {
            // InternalAspectLang.g:5817:1: ( rulePointcut )
            // InternalAspectLang.g:5818:1: rulePointcut
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
    // InternalAspectLang.g:5827:1: rule__AspectModel__AspectsAssignment_4_2 : ( ruleAspect ) ;
    public final void rule__AspectModel__AspectsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5831:1: ( ( ruleAspect ) )
            // InternalAspectLang.g:5832:1: ( ruleAspect )
            {
            // InternalAspectLang.g:5832:1: ( ruleAspect )
            // InternalAspectLang.g:5833:1: ruleAspect
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
    // InternalAspectLang.g:5842:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5846:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAspectLang.g:5847:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAspectLang.g:5847:1: ( ruleQualifiedNameWithWildcard )
            // InternalAspectLang.g:5848:1: ruleQualifiedNameWithWildcard
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
    // InternalAspectLang.g:5857:1: rule__ApplicationModel__HandlerAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__HandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5861:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5862:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5862:1: ( RULE_ID )
            // InternalAspectLang.g:5863:1: RULE_ID
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
    // InternalAspectLang.g:5872:1: rule__ApplicationModel__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5876:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:5877:1: ( RULE_ID )
            {
            // InternalAspectLang.g:5877:1: ( RULE_ID )
            // InternalAspectLang.g:5878:1: RULE_ID
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
    // InternalAspectLang.g:5887:1: rule__ApplicationModel__ModelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5891:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:5892:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:5892:1: ( RULE_STRING )
            // InternalAspectLang.g:5893:1: RULE_STRING
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
    // InternalAspectLang.g:5902:1: rule__Aspect__PointcutAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Aspect__PointcutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5906:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:5907:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:5907:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:5908:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutPointcutCrossReference_1_0()); 
            }
            // InternalAspectLang.g:5909:1: ( ruleQualifiedName )
            // InternalAspectLang.g:5910:1: ruleQualifiedName
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
    // InternalAspectLang.g:5921:1: rule__Aspect__AdvicesAssignment_3 : ( ruleUtilizeAdvice ) ;
    public final void rule__Aspect__AdvicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5925:1: ( ( ruleUtilizeAdvice ) )
            // InternalAspectLang.g:5926:1: ( ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:5926:1: ( ruleUtilizeAdvice )
            // InternalAspectLang.g:5927:1: ruleUtilizeAdvice
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
    // InternalAspectLang.g:5936:1: rule__Aspect__AdvicesAssignment_4_1 : ( ruleUtilizeAdvice ) ;
    public final void rule__Aspect__AdvicesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5940:1: ( ( ruleUtilizeAdvice ) )
            // InternalAspectLang.g:5941:1: ( ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:5941:1: ( ruleUtilizeAdvice )
            // InternalAspectLang.g:5942:1: ruleUtilizeAdvice
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
    // InternalAspectLang.g:5951:1: rule__UtilizeAdvice__AdviceAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UtilizeAdvice__AdviceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5955:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:5956:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:5956:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:5957:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAdviceCrossReference_0_0()); 
            }
            // InternalAspectLang.g:5958:1: ( ruleQualifiedName )
            // InternalAspectLang.g:5959:1: ruleQualifiedName
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
    // InternalAspectLang.g:5970:1: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 : ( ruleValue ) ;
    public final void rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5974:1: ( ( ruleValue ) )
            // InternalAspectLang.g:5975:1: ( ruleValue )
            {
            // InternalAspectLang.g:5975:1: ( ruleValue )
            // InternalAspectLang.g:5976:1: ruleValue
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
    // InternalAspectLang.g:5985:1: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 : ( ruleValue ) ;
    public final void rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5989:1: ( ( ruleValue ) )
            // InternalAspectLang.g:5990:1: ( ruleValue )
            {
            // InternalAspectLang.g:5990:1: ( ruleValue )
            // InternalAspectLang.g:5991:1: ruleValue
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
    // InternalAspectLang.g:6000:1: rule__Advice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Advice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6004:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6005:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6005:1: ( RULE_ID )
            // InternalAspectLang.g:6006:1: RULE_ID
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
    // InternalAspectLang.g:6015:1: rule__Advice__ParameterDeclarationsAssignment_2_1_0 : ( ruleAdviceParameterDeclaration ) ;
    public final void rule__Advice__ParameterDeclarationsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6019:1: ( ( ruleAdviceParameterDeclaration ) )
            // InternalAspectLang.g:6020:1: ( ruleAdviceParameterDeclaration )
            {
            // InternalAspectLang.g:6020:1: ( ruleAdviceParameterDeclaration )
            // InternalAspectLang.g:6021:1: ruleAdviceParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAdviceParameterDeclarationParserRuleCall_2_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdviceParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getParameterDeclarationsAdviceParameterDeclarationParserRuleCall_2_1_0_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:6030:1: rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 : ( ruleAdviceParameterDeclaration ) ;
    public final void rule__Advice__ParameterDeclarationsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6034:1: ( ( ruleAdviceParameterDeclaration ) )
            // InternalAspectLang.g:6035:1: ( ruleAdviceParameterDeclaration )
            {
            // InternalAspectLang.g:6035:1: ( ruleAdviceParameterDeclaration )
            // InternalAspectLang.g:6036:1: ruleAdviceParameterDeclaration
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAdviceParameterDeclarationParserRuleCall_2_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdviceParameterDeclaration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceAccess().getParameterDeclarationsAdviceParameterDeclarationParserRuleCall_2_1_1_1_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:6045:1: rule__Advice__CollectorsAssignment_4 : ( ruleCollector ) ;
    public final void rule__Advice__CollectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6049:1: ( ( ruleCollector ) )
            // InternalAspectLang.g:6050:1: ( ruleCollector )
            {
            // InternalAspectLang.g:6050:1: ( ruleCollector )
            // InternalAspectLang.g:6051:1: ruleCollector
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


    // $ANTLR start "rule__AdviceParameterDeclaration__TypeAssignment_0"
    // InternalAspectLang.g:6060:1: rule__AdviceParameterDeclaration__TypeAssignment_0 : ( ( 'type' ) ) ;
    public final void rule__AdviceParameterDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6064:1: ( ( ( 'type' ) ) )
            // InternalAspectLang.g:6065:1: ( ( 'type' ) )
            {
            // InternalAspectLang.g:6065:1: ( ( 'type' ) )
            // InternalAspectLang.g:6066:1: ( 'type' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getTypeTypeKeyword_0_0()); 
            }
            // InternalAspectLang.g:6067:1: ( 'type' )
            // InternalAspectLang.g:6068:1: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getTypeTypeKeyword_0_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterDeclarationAccess().getTypeTypeKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterDeclarationAccess().getTypeTypeKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameterDeclaration__TypeAssignment_0"


    // $ANTLR start "rule__AdviceParameterDeclaration__NameAssignment_1"
    // InternalAspectLang.g:6083:1: rule__AdviceParameterDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AdviceParameterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6087:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6088:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6088:1: ( RULE_ID )
            // InternalAspectLang.g:6089:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameterDeclaration__NameAssignment_1"


    // $ANTLR start "rule__Collector__InsertionPointAssignment_0"
    // InternalAspectLang.g:6098:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6102:1: ( ( ruleInsertionPoint ) )
            // InternalAspectLang.g:6103:1: ( ruleInsertionPoint )
            {
            // InternalAspectLang.g:6103:1: ( ruleInsertionPoint )
            // InternalAspectLang.g:6104:1: ruleInsertionPoint
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
    // InternalAspectLang.g:6113:1: rule__Collector__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__Collector__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6117:1: ( ( ruleEvent ) )
            // InternalAspectLang.g:6118:1: ( ruleEvent )
            {
            // InternalAspectLang.g:6118:1: ( ruleEvent )
            // InternalAspectLang.g:6119:1: ruleEvent
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
    // InternalAspectLang.g:6128:1: rule__Event__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Event__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6132:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:6133:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:6133:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6134:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeRecordTypeCrossReference_0_0()); 
            }
            // InternalAspectLang.g:6135:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6136:1: ruleQualifiedName
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
    // InternalAspectLang.g:6147:1: rule__Event__InitializationsAssignment_2_0 : ( ruleValue ) ;
    public final void rule__Event__InitializationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6151:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6152:1: ( ruleValue )
            {
            // InternalAspectLang.g:6152:1: ( ruleValue )
            // InternalAspectLang.g:6153:1: ruleValue
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
    // InternalAspectLang.g:6162:1: rule__Event__InitializationsAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__Event__InitializationsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6166:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6167:1: ( ruleValue )
            {
            // InternalAspectLang.g:6167:1: ( ruleValue )
            // InternalAspectLang.g:6168:1: ruleValue
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


    // $ANTLR start "rule__ReferenceValue__QueryAssignment_0"
    // InternalAspectLang.g:6177:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6181:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6182:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6182:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6183:1: ruleLocationQuery
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


    // $ANTLR start "rule__ReferenceValue__PropertyAssignment_1"
    // InternalAspectLang.g:6192:1: rule__ReferenceValue__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__ReferenceValue__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6196:1: ( ( ruleProperty ) )
            // InternalAspectLang.g:6197:1: ( ruleProperty )
            {
            // InternalAspectLang.g:6197:1: ( ruleProperty )
            // InternalAspectLang.g:6198:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getPropertyPropertyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getReferenceValueAccess().getPropertyPropertyParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ReferenceValue__PropertyAssignment_1"


    // $ANTLR start "rule__InternalFunctionProperty__FunctionAssignment"
    // InternalAspectLang.g:6207:1: rule__InternalFunctionProperty__FunctionAssignment : ( ruleInternalFunction ) ;
    public final void rule__InternalFunctionProperty__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6211:1: ( ( ruleInternalFunction ) )
            // InternalAspectLang.g:6212:1: ( ruleInternalFunction )
            {
            // InternalAspectLang.g:6212:1: ( ruleInternalFunction )
            // InternalAspectLang.g:6213:1: ruleInternalFunction
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


    // $ANTLR start "rule__ReflectionProperty__FunctionAssignment_1"
    // InternalAspectLang.g:6222:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6226:1: ( ( ruleReflectionFunction ) )
            // InternalAspectLang.g:6227:1: ( ruleReflectionFunction )
            {
            // InternalAspectLang.g:6227:1: ( ruleReflectionFunction )
            // InternalAspectLang.g:6228:1: ruleReflectionFunction
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


    // $ANTLR start "rule__Pointcut__AnnotationAssignment_0"
    // InternalAspectLang.g:6237:1: rule__Pointcut__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Pointcut__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6241:1: ( ( ruleAnnotation ) )
            // InternalAspectLang.g:6242:1: ( ruleAnnotation )
            {
            // InternalAspectLang.g:6242:1: ( ruleAnnotation )
            // InternalAspectLang.g:6243:1: ruleAnnotation
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
    // InternalAspectLang.g:6252:1: rule__Pointcut__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pointcut__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6256:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6257:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6257:1: ( RULE_ID )
            // InternalAspectLang.g:6258:1: RULE_ID
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
    // InternalAspectLang.g:6267:1: rule__Pointcut__LocationAssignment_4 : ( ruleLocationQuery ) ;
    public final void rule__Pointcut__LocationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6271:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6272:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6272:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6273:1: ruleLocationQuery
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


    // $ANTLR start "rule__Pointcut__OperationAssignment_5_1"
    // InternalAspectLang.g:6282:1: rule__Pointcut__OperationAssignment_5_1 : ( ruleOperationQuery ) ;
    public final void rule__Pointcut__OperationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6286:1: ( ( ruleOperationQuery ) )
            // InternalAspectLang.g:6287:1: ( ruleOperationQuery )
            {
            // InternalAspectLang.g:6287:1: ( ruleOperationQuery )
            // InternalAspectLang.g:6288:1: ruleOperationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationOperationQueryParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getOperationOperationQueryParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__OperationAssignment_5_1"


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // InternalAspectLang.g:6297:1: rule__Annotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6301:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6302:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6302:1: ( RULE_ID )
            // InternalAspectLang.g:6303:1: RULE_ID
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
    // InternalAspectLang.g:6312:1: rule__Annotation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6316:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:6317:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:6317:1: ( RULE_STRING )
            // InternalAspectLang.g:6318:1: RULE_STRING
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


    // $ANTLR start "rule__LocationQuery__NodeAssignment_0"
    // InternalAspectLang.g:6327:1: rule__LocationQuery__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6331:1: ( ( ruleNode ) )
            // InternalAspectLang.g:6332:1: ( ruleNode )
            {
            // InternalAspectLang.g:6332:1: ( ruleNode )
            // InternalAspectLang.g:6333:1: ruleNode
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
    // InternalAspectLang.g:6342:1: rule__LocationQuery__SpecializationAssignment_1_0_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6346:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6347:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6347:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6348:1: ruleLocationQuery
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
    // InternalAspectLang.g:6357:1: rule__LocationQuery__CompositionAssignment_1_1 : ( ruleCompositionQuery ) ;
    public final void rule__LocationQuery__CompositionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6361:1: ( ( ruleCompositionQuery ) )
            // InternalAspectLang.g:6362:1: ( ruleCompositionQuery )
            {
            // InternalAspectLang.g:6362:1: ( ruleCompositionQuery )
            // InternalAspectLang.g:6363:1: ruleCompositionQuery
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
    // InternalAspectLang.g:6372:1: rule__CompositionQuery__ModifierAssignment_1 : ( ruleQueryModifier ) ;
    public final void rule__CompositionQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6376:1: ( ( ruleQueryModifier ) )
            // InternalAspectLang.g:6377:1: ( ruleQueryModifier )
            {
            // InternalAspectLang.g:6377:1: ( ruleQueryModifier )
            // InternalAspectLang.g:6378:1: ruleQueryModifier
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
    // InternalAspectLang.g:6387:1: rule__CompositionQuery__SubQueriesAssignment_3 : ( ruleLocationQuery ) ;
    public final void rule__CompositionQuery__SubQueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6391:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6392:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6392:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6393:1: ruleLocationQuery
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


    // $ANTLR start "rule__OperationQuery__ModifierAssignment_1"
    // InternalAspectLang.g:6402:1: rule__OperationQuery__ModifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6406:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6407:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6407:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6408:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getModifierOperationModifierCrossReference_1_0()); 
            }
            // InternalAspectLang.g:6409:1: ( RULE_ID )
            // InternalAspectLang.g:6410:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getModifierOperationModifierIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getModifierOperationModifierIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getModifierOperationModifierCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__ModifierAssignment_1"


    // $ANTLR start "rule__OperationQuery__ReturnTypeAssignment_2"
    // InternalAspectLang.g:6421:1: rule__OperationQuery__ReturnTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OperationQuery__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6425:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6426:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6426:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6427:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getReturnTypeTypeCrossReference_2_0()); 
            }
            // InternalAspectLang.g:6428:1: ( RULE_ID )
            // InternalAspectLang.g:6429:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getReturnTypeTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getReturnTypeTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getReturnTypeTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__ReturnTypeAssignment_2"


    // $ANTLR start "rule__OperationQuery__OperationReferenceAssignment_3_0_0"
    // InternalAspectLang.g:6440:1: rule__OperationQuery__OperationReferenceAssignment_3_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__OperationQuery__OperationReferenceAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6444:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6445:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6445:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6446:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationReferenceOperationCrossReference_3_0_0_0()); 
            }
            // InternalAspectLang.g:6447:1: ( RULE_ID )
            // InternalAspectLang.g:6448:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationReferenceOperationIDTerminalRuleCall_3_0_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getOperationReferenceOperationIDTerminalRuleCall_3_0_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getOperationReferenceOperationCrossReference_3_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__OperationReferenceAssignment_3_0_0"


    // $ANTLR start "rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1"
    // InternalAspectLang.g:6459:1: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 : ( ruleParameterQuery ) ;
    public final void rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6463:1: ( ( ruleParameterQuery ) )
            // InternalAspectLang.g:6464:1: ( ruleParameterQuery )
            {
            // InternalAspectLang.g:6464:1: ( ruleParameterQuery )
            // InternalAspectLang.g:6465:1: ruleParameterQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1"


    // $ANTLR start "rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1"
    // InternalAspectLang.g:6474:1: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 : ( ruleParameterQuery ) ;
    public final void rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6478:1: ( ( ruleParameterQuery ) )
            // InternalAspectLang.g:6479:1: ( ruleParameterQuery )
            {
            // InternalAspectLang.g:6479:1: ( ruleParameterQuery )
            // InternalAspectLang.g:6480:1: ruleParameterQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getParameterQueriesParameterQueryParserRuleCall_3_0_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1"


    // $ANTLR start "rule__ParameterQuery__ModifierAssignment_1"
    // InternalAspectLang.g:6489:1: rule__ParameterQuery__ModifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6493:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6494:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6494:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6495:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_1_0()); 
            }
            // InternalAspectLang.g:6496:1: ( RULE_ID )
            // InternalAspectLang.g:6497:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierParameterModifierIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getModifierParameterModifierIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__ModifierAssignment_1"


    // $ANTLR start "rule__ParameterQuery__TypeAssignment_2_0"
    // InternalAspectLang.g:6508:1: rule__ParameterQuery__TypeAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6512:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6513:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6513:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6514:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getTypeTypeCrossReference_2_0_0()); 
            }
            // InternalAspectLang.g:6515:1: ( RULE_ID )
            // InternalAspectLang.g:6516:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getTypeTypeIDTerminalRuleCall_2_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getTypeTypeIDTerminalRuleCall_2_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getTypeTypeCrossReference_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__TypeAssignment_2_0"


    // $ANTLR start "rule__ParameterQuery__ParameterAssignment_3"
    // InternalAspectLang.g:6527:1: rule__ParameterQuery__ParameterAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6531:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6532:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6532:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6533:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_3_0()); 
            }
            // InternalAspectLang.g:6534:1: ( RULE_ID )
            // InternalAspectLang.g:6535:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterParameterIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getParameterParameterIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterQuery__ParameterAssignment_3"


    // $ANTLR start "rule__Node__ConstraintAssignment_1_1"
    // InternalAspectLang.g:6546:1: rule__Node__ConstraintAssignment_1_1 : ( rulePropertyConstraint ) ;
    public final void rule__Node__ConstraintAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6550:1: ( ( rulePropertyConstraint ) )
            // InternalAspectLang.g:6551:1: ( rulePropertyConstraint )
            {
            // InternalAspectLang.g:6551:1: ( rulePropertyConstraint )
            // InternalAspectLang.g:6552:1: rulePropertyConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getConstraintPropertyConstraintParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertyConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNodeAccess().getConstraintPropertyConstraintParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Node__ConstraintAssignment_1_1"


    // $ANTLR start "rule__ContainerNode__ContainerAssignment"
    // InternalAspectLang.g:6561:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6565:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6566:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6566:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6567:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerContainerCrossReference_0()); 
            }
            // InternalAspectLang.g:6568:1: ( RULE_ID )
            // InternalAspectLang.g:6569:1: RULE_ID
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


    // $ANTLR start "rule__PropertyConstraint__LogicAssignment_1_1"
    // InternalAspectLang.g:6580:1: rule__PropertyConstraint__LogicAssignment_1_1 : ( ruleLogicOperator ) ;
    public final void rule__PropertyConstraint__LogicAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6584:1: ( ( ruleLogicOperator ) )
            // InternalAspectLang.g:6585:1: ( ruleLogicOperator )
            {
            // InternalAspectLang.g:6585:1: ( ruleLogicOperator )
            // InternalAspectLang.g:6586:1: ruleLogicOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getLogicLogicOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogicOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getLogicLogicOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__LogicAssignment_1_1"


    // $ANTLR start "rule__PropertyConstraint__RightAssignment_1_2"
    // InternalAspectLang.g:6595:1: rule__PropertyConstraint__RightAssignment_1_2 : ( rulePropertyConstraintCompare ) ;
    public final void rule__PropertyConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6599:1: ( ( rulePropertyConstraintCompare ) )
            // InternalAspectLang.g:6600:1: ( rulePropertyConstraintCompare )
            {
            // InternalAspectLang.g:6600:1: ( rulePropertyConstraintCompare )
            // InternalAspectLang.g:6601:1: rulePropertyConstraintCompare
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getRightPropertyConstraintCompareParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePropertyConstraintCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getRightPropertyConstraintCompareParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraint__RightAssignment_1_2"


    // $ANTLR start "rule__PropertyConstraintCompare__CompareAssignment_1_1"
    // InternalAspectLang.g:6610:1: rule__PropertyConstraintCompare__CompareAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__PropertyConstraintCompare__CompareAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6614:1: ( ( ruleCompareOperator ) )
            // InternalAspectLang.g:6615:1: ( ruleCompareOperator )
            {
            // InternalAspectLang.g:6615:1: ( ruleCompareOperator )
            // InternalAspectLang.g:6616:1: ruleCompareOperator
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getCompareCompareOperatorEnumRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompareOperator();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getCompareCompareOperatorEnumRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__CompareAssignment_1_1"


    // $ANTLR start "rule__PropertyConstraintCompare__RightAssignment_1_2"
    // InternalAspectLang.g:6625:1: rule__PropertyConstraintCompare__RightAssignment_1_2 : ( ruleConstraintElement ) ;
    public final void rule__PropertyConstraintCompare__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6629:1: ( ( ruleConstraintElement ) )
            // InternalAspectLang.g:6630:1: ( ruleConstraintElement )
            {
            // InternalAspectLang.g:6630:1: ( ruleConstraintElement )
            // InternalAspectLang.g:6631:1: ruleConstraintElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getRightConstraintElementParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstraintElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getRightConstraintElementParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyConstraintCompare__RightAssignment_1_2"


    // $ANTLR start "rule__LocalQuery__LocationQueryAssignment_0"
    // InternalAspectLang.g:6640:1: rule__LocalQuery__LocationQueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__LocalQuery__LocationQueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6644:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6645:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6645:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6646:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getLocationQueryLocationQueryParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalQueryAccess().getLocationQueryLocationQueryParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalQuery__LocationQueryAssignment_0"


    // $ANTLR start "rule__LocalQuery__PropertyAssignment_1_0"
    // InternalAspectLang.g:6655:1: rule__LocalQuery__PropertyAssignment_1_0 : ( ruleModelProperty ) ;
    public final void rule__LocalQuery__PropertyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6659:1: ( ( ruleModelProperty ) )
            // InternalAspectLang.g:6660:1: ( ruleModelProperty )
            {
            // InternalAspectLang.g:6660:1: ( ruleModelProperty )
            // InternalAspectLang.g:6661:1: ruleModelProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getPropertyModelPropertyParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleModelProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalQueryAccess().getPropertyModelPropertyParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalQuery__PropertyAssignment_1_0"


    // $ANTLR start "rule__LocalQuery__TypeofAssignment_1_1"
    // InternalAspectLang.g:6670:1: rule__LocalQuery__TypeofAssignment_1_1 : ( ruleTypeof ) ;
    public final void rule__LocalQuery__TypeofAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6674:1: ( ( ruleTypeof ) )
            // InternalAspectLang.g:6675:1: ( ruleTypeof )
            {
            // InternalAspectLang.g:6675:1: ( ruleTypeof )
            // InternalAspectLang.g:6676:1: ruleTypeof
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getTypeofTypeofParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeof();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalQueryAccess().getTypeofTypeofParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalQuery__TypeofAssignment_1_1"


    // $ANTLR start "rule__ModelProperty__ReferenceAssignment_1"
    // InternalAspectLang.g:6685:1: rule__ModelProperty__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModelProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6689:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6690:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6690:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6691:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getReferenceFeatureCrossReference_1_0()); 
            }
            // InternalAspectLang.g:6692:1: ( RULE_ID )
            // InternalAspectLang.g:6693:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getReferenceFeatureIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getReferenceFeatureIDTerminalRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelPropertyAccess().getReferenceFeatureCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelProperty__ReferenceAssignment_1"


    // $ANTLR start "rule__Typeof__ReferenceAssignment_2"
    // InternalAspectLang.g:6704:1: rule__Typeof__ReferenceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Typeof__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6708:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6709:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6709:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6710:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getReferenceNamedTypeCrossReference_2_0()); 
            }
            // InternalAspectLang.g:6711:1: ( RULE_ID )
            // InternalAspectLang.g:6712:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getReferenceNamedTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getReferenceNamedTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getReferenceNamedTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Typeof__ReferenceAssignment_2"


    // $ANTLR start "rule__FloatLiteral__ValueAssignment"
    // InternalAspectLang.g:6723:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6727:1: ( ( RULE_FLOAT ) )
            // InternalAspectLang.g:6728:1: ( RULE_FLOAT )
            {
            // InternalAspectLang.g:6728:1: ( RULE_FLOAT )
            // InternalAspectLang.g:6729:1: RULE_FLOAT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0()); 
            }
            match(input,RULE_FLOAT,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // InternalAspectLang.g:6738:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6742:1: ( ( RULE_INT ) )
            // InternalAspectLang.g:6743:1: ( RULE_INT )
            {
            // InternalAspectLang.g:6743:1: ( RULE_INT )
            // InternalAspectLang.g:6744:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalAspectLang.g:6753:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6757:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:6758:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:6758:1: ( RULE_STRING )
            // InternalAspectLang.g:6759:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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

    // $ANTLR start synpred49_InternalAspectLang
    public final void synpred49_InternalAspectLang_fragment() throws RecognitionException {   
        // InternalAspectLang.g:4135:2: ( rule__OperationQuery__ModifierAssignment_1 )
        // InternalAspectLang.g:4135:2: rule__OperationQuery__ModifierAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__OperationQuery__ModifierAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred49_InternalAspectLang

    // $ANTLR start synpred53_InternalAspectLang
    public final void synpred53_InternalAspectLang_fragment() throws RecognitionException {   
        // InternalAspectLang.g:4511:2: ( rule__ParameterQuery__ModifierAssignment_1 )
        // InternalAspectLang.g:4511:2: rule__ParameterQuery__ModifierAssignment_1
        {
        pushFollow(FOLLOW_2);
        rule__ParameterQuery__ModifierAssignment_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalAspectLang

    // Delegated rules

    public final boolean synpred53_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0004885800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0004884000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00C04400000720F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00C04000000720F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000020000000C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0400040000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0004800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00C0000000002010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0008100001800000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00C0200000002010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00C0000000002012L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x03C00000000020F0L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0008000000000002L});

}
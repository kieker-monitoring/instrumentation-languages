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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'before'", "'after'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'classname'", "'return-type'", "'include'", "'exclude'", "'&&'", "'||'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'package'", "'import'", "'use'", "'on'", "'aspect'", "':'", "','", "'('", "')'", "'advice'", "'{'", "'}'", "'$'", "'#'", "'['", "']'", "'pointcut'", "'class'", "'.'", "'operation'", "'@'", "'**'", "'up'", "'istypeof'", "'[]'"
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


    // $ANTLR start "entryRuleRuntimeProperty"
    // InternalAspectLang.g:453:1: entryRuleRuntimeProperty : ruleRuntimeProperty EOF ;
    public final void entryRuleRuntimeProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:454:1: ( ruleRuntimeProperty EOF )
            // InternalAspectLang.g:455:1: ruleRuntimeProperty EOF
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
    // InternalAspectLang.g:462:1: ruleRuntimeProperty : ( ( rule__RuntimeProperty__Group__0 ) ) ;
    public final void ruleRuntimeProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:466:2: ( ( ( rule__RuntimeProperty__Group__0 ) ) )
            // InternalAspectLang.g:467:1: ( ( rule__RuntimeProperty__Group__0 ) )
            {
            // InternalAspectLang.g:467:1: ( ( rule__RuntimeProperty__Group__0 ) )
            // InternalAspectLang.g:468:1: ( rule__RuntimeProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getGroup()); 
            }
            // InternalAspectLang.g:469:1: ( rule__RuntimeProperty__Group__0 )
            // InternalAspectLang.g:469:2: rule__RuntimeProperty__Group__0
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


    // $ANTLR start "entryRuleAdviceParameter"
    // InternalAspectLang.g:481:1: entryRuleAdviceParameter : ruleAdviceParameter EOF ;
    public final void entryRuleAdviceParameter() throws RecognitionException {
        try {
            // InternalAspectLang.g:482:1: ( ruleAdviceParameter EOF )
            // InternalAspectLang.g:483:1: ruleAdviceParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdviceParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterRule()); 
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
    // $ANTLR end "entryRuleAdviceParameter"


    // $ANTLR start "ruleAdviceParameter"
    // InternalAspectLang.g:490:1: ruleAdviceParameter : ( ( rule__AdviceParameter__Group__0 ) ) ;
    public final void ruleAdviceParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:494:2: ( ( ( rule__AdviceParameter__Group__0 ) ) )
            // InternalAspectLang.g:495:1: ( ( rule__AdviceParameter__Group__0 ) )
            {
            // InternalAspectLang.g:495:1: ( ( rule__AdviceParameter__Group__0 ) )
            // InternalAspectLang.g:496:1: ( rule__AdviceParameter__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getGroup()); 
            }
            // InternalAspectLang.g:497:1: ( rule__AdviceParameter__Group__0 )
            // InternalAspectLang.g:497:2: rule__AdviceParameter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameter__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAdviceParameter"


    // $ANTLR start "entryRulePointcut"
    // InternalAspectLang.g:509:1: entryRulePointcut : rulePointcut EOF ;
    public final void entryRulePointcut() throws RecognitionException {
        try {
            // InternalAspectLang.g:510:1: ( rulePointcut EOF )
            // InternalAspectLang.g:511:1: rulePointcut EOF
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
    // InternalAspectLang.g:518:1: rulePointcut : ( ( rule__Pointcut__Group__0 ) ) ;
    public final void rulePointcut() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:522:2: ( ( ( rule__Pointcut__Group__0 ) ) )
            // InternalAspectLang.g:523:1: ( ( rule__Pointcut__Group__0 ) )
            {
            // InternalAspectLang.g:523:1: ( ( rule__Pointcut__Group__0 ) )
            // InternalAspectLang.g:524:1: ( rule__Pointcut__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup()); 
            }
            // InternalAspectLang.g:525:1: ( rule__Pointcut__Group__0 )
            // InternalAspectLang.g:525:2: rule__Pointcut__Group__0
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
    // InternalAspectLang.g:537:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalAspectLang.g:538:1: ( ruleAnnotation EOF )
            // InternalAspectLang.g:539:1: ruleAnnotation EOF
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
    // InternalAspectLang.g:546:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:550:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalAspectLang.g:551:1: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalAspectLang.g:551:1: ( ( rule__Annotation__Group__0 ) )
            // InternalAspectLang.g:552:1: ( rule__Annotation__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup()); 
            }
            // InternalAspectLang.g:553:1: ( rule__Annotation__Group__0 )
            // InternalAspectLang.g:553:2: rule__Annotation__Group__0
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
    // InternalAspectLang.g:565:1: entryRuleLocationQuery : ruleLocationQuery EOF ;
    public final void entryRuleLocationQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:566:1: ( ruleLocationQuery EOF )
            // InternalAspectLang.g:567:1: ruleLocationQuery EOF
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
    // InternalAspectLang.g:574:1: ruleLocationQuery : ( ( rule__LocationQuery__Group__0 ) ) ;
    public final void ruleLocationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:578:2: ( ( ( rule__LocationQuery__Group__0 ) ) )
            // InternalAspectLang.g:579:1: ( ( rule__LocationQuery__Group__0 ) )
            {
            // InternalAspectLang.g:579:1: ( ( rule__LocationQuery__Group__0 ) )
            // InternalAspectLang.g:580:1: ( rule__LocationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:581:1: ( rule__LocationQuery__Group__0 )
            // InternalAspectLang.g:581:2: rule__LocationQuery__Group__0
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
    // InternalAspectLang.g:593:1: entryRuleCompositionQuery : ruleCompositionQuery EOF ;
    public final void entryRuleCompositionQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:594:1: ( ruleCompositionQuery EOF )
            // InternalAspectLang.g:595:1: ruleCompositionQuery EOF
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
    // InternalAspectLang.g:602:1: ruleCompositionQuery : ( ( rule__CompositionQuery__Group__0 ) ) ;
    public final void ruleCompositionQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:606:2: ( ( ( rule__CompositionQuery__Group__0 ) ) )
            // InternalAspectLang.g:607:1: ( ( rule__CompositionQuery__Group__0 ) )
            {
            // InternalAspectLang.g:607:1: ( ( rule__CompositionQuery__Group__0 ) )
            // InternalAspectLang.g:608:1: ( rule__CompositionQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:609:1: ( rule__CompositionQuery__Group__0 )
            // InternalAspectLang.g:609:2: rule__CompositionQuery__Group__0
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
    // InternalAspectLang.g:621:1: entryRuleOperationQuery : ruleOperationQuery EOF ;
    public final void entryRuleOperationQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:622:1: ( ruleOperationQuery EOF )
            // InternalAspectLang.g:623:1: ruleOperationQuery EOF
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
    // InternalAspectLang.g:630:1: ruleOperationQuery : ( ( rule__OperationQuery__Group__0 ) ) ;
    public final void ruleOperationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:634:2: ( ( ( rule__OperationQuery__Group__0 ) ) )
            // InternalAspectLang.g:635:1: ( ( rule__OperationQuery__Group__0 ) )
            {
            // InternalAspectLang.g:635:1: ( ( rule__OperationQuery__Group__0 ) )
            // InternalAspectLang.g:636:1: ( rule__OperationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:637:1: ( rule__OperationQuery__Group__0 )
            // InternalAspectLang.g:637:2: rule__OperationQuery__Group__0
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
    // InternalAspectLang.g:649:1: entryRuleParameterQuery : ruleParameterQuery EOF ;
    public final void entryRuleParameterQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:650:1: ( ruleParameterQuery EOF )
            // InternalAspectLang.g:651:1: ruleParameterQuery EOF
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
    // InternalAspectLang.g:658:1: ruleParameterQuery : ( ( rule__ParameterQuery__Group__0 ) ) ;
    public final void ruleParameterQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:662:2: ( ( ( rule__ParameterQuery__Group__0 ) ) )
            // InternalAspectLang.g:663:1: ( ( rule__ParameterQuery__Group__0 ) )
            {
            // InternalAspectLang.g:663:1: ( ( rule__ParameterQuery__Group__0 ) )
            // InternalAspectLang.g:664:1: ( rule__ParameterQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:665:1: ( rule__ParameterQuery__Group__0 )
            // InternalAspectLang.g:665:2: rule__ParameterQuery__Group__0
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
    // InternalAspectLang.g:677:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:678:1: ( ruleNode EOF )
            // InternalAspectLang.g:679:1: ruleNode EOF
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
    // InternalAspectLang.g:686:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:690:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalAspectLang.g:691:1: ( ( rule__Node__Group__0 ) )
            {
            // InternalAspectLang.g:691:1: ( ( rule__Node__Group__0 ) )
            // InternalAspectLang.g:692:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:693:1: ( rule__Node__Group__0 )
            // InternalAspectLang.g:693:2: rule__Node__Group__0
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
    // InternalAspectLang.g:705:1: entryRuleContainerNode : ruleContainerNode EOF ;
    public final void entryRuleContainerNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:706:1: ( ruleContainerNode EOF )
            // InternalAspectLang.g:707:1: ruleContainerNode EOF
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
    // InternalAspectLang.g:714:1: ruleContainerNode : ( ( rule__ContainerNode__ContainerAssignment ) ) ;
    public final void ruleContainerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:718:2: ( ( ( rule__ContainerNode__ContainerAssignment ) ) )
            // InternalAspectLang.g:719:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            {
            // InternalAspectLang.g:719:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            // InternalAspectLang.g:720:1: ( rule__ContainerNode__ContainerAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }
            // InternalAspectLang.g:721:1: ( rule__ContainerNode__ContainerAssignment )
            // InternalAspectLang.g:721:2: rule__ContainerNode__ContainerAssignment
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
    // InternalAspectLang.g:733:1: entryRuleWildcardNode : ruleWildcardNode EOF ;
    public final void entryRuleWildcardNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:734:1: ( ruleWildcardNode EOF )
            // InternalAspectLang.g:735:1: ruleWildcardNode EOF
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
    // InternalAspectLang.g:742:1: ruleWildcardNode : ( ( rule__WildcardNode__Group__0 ) ) ;
    public final void ruleWildcardNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:746:2: ( ( ( rule__WildcardNode__Group__0 ) ) )
            // InternalAspectLang.g:747:1: ( ( rule__WildcardNode__Group__0 ) )
            {
            // InternalAspectLang.g:747:1: ( ( rule__WildcardNode__Group__0 ) )
            // InternalAspectLang.g:748:1: ( rule__WildcardNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:749:1: ( rule__WildcardNode__Group__0 )
            // InternalAspectLang.g:749:2: rule__WildcardNode__Group__0
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
    // InternalAspectLang.g:761:1: entryRuleSubPathNode : ruleSubPathNode EOF ;
    public final void entryRuleSubPathNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:762:1: ( ruleSubPathNode EOF )
            // InternalAspectLang.g:763:1: ruleSubPathNode EOF
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
    // InternalAspectLang.g:770:1: ruleSubPathNode : ( ( rule__SubPathNode__Group__0 ) ) ;
    public final void ruleSubPathNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:774:2: ( ( ( rule__SubPathNode__Group__0 ) ) )
            // InternalAspectLang.g:775:1: ( ( rule__SubPathNode__Group__0 ) )
            {
            // InternalAspectLang.g:775:1: ( ( rule__SubPathNode__Group__0 ) )
            // InternalAspectLang.g:776:1: ( rule__SubPathNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:777:1: ( rule__SubPathNode__Group__0 )
            // InternalAspectLang.g:777:2: rule__SubPathNode__Group__0
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
    // InternalAspectLang.g:789:1: entryRuleParentNode : ruleParentNode EOF ;
    public final void entryRuleParentNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:790:1: ( ruleParentNode EOF )
            // InternalAspectLang.g:791:1: ruleParentNode EOF
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
    // InternalAspectLang.g:798:1: ruleParentNode : ( ( rule__ParentNode__Group__0 ) ) ;
    public final void ruleParentNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:802:2: ( ( ( rule__ParentNode__Group__0 ) ) )
            // InternalAspectLang.g:803:1: ( ( rule__ParentNode__Group__0 ) )
            {
            // InternalAspectLang.g:803:1: ( ( rule__ParentNode__Group__0 ) )
            // InternalAspectLang.g:804:1: ( rule__ParentNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:805:1: ( rule__ParentNode__Group__0 )
            // InternalAspectLang.g:805:2: rule__ParentNode__Group__0
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
    // InternalAspectLang.g:817:1: entryRulePropertyConstraint : rulePropertyConstraint EOF ;
    public final void entryRulePropertyConstraint() throws RecognitionException {
        try {
            // InternalAspectLang.g:818:1: ( rulePropertyConstraint EOF )
            // InternalAspectLang.g:819:1: rulePropertyConstraint EOF
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
    // InternalAspectLang.g:826:1: rulePropertyConstraint : ( ( rule__PropertyConstraint__Group__0 ) ) ;
    public final void rulePropertyConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:830:2: ( ( ( rule__PropertyConstraint__Group__0 ) ) )
            // InternalAspectLang.g:831:1: ( ( rule__PropertyConstraint__Group__0 ) )
            {
            // InternalAspectLang.g:831:1: ( ( rule__PropertyConstraint__Group__0 ) )
            // InternalAspectLang.g:832:1: ( rule__PropertyConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup()); 
            }
            // InternalAspectLang.g:833:1: ( rule__PropertyConstraint__Group__0 )
            // InternalAspectLang.g:833:2: rule__PropertyConstraint__Group__0
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
    // InternalAspectLang.g:845:1: entryRulePropertyConstraintCompare : rulePropertyConstraintCompare EOF ;
    public final void entryRulePropertyConstraintCompare() throws RecognitionException {
        try {
            // InternalAspectLang.g:846:1: ( rulePropertyConstraintCompare EOF )
            // InternalAspectLang.g:847:1: rulePropertyConstraintCompare EOF
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
    // InternalAspectLang.g:854:1: rulePropertyConstraintCompare : ( ( rule__PropertyConstraintCompare__Group__0 ) ) ;
    public final void rulePropertyConstraintCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:858:2: ( ( ( rule__PropertyConstraintCompare__Group__0 ) ) )
            // InternalAspectLang.g:859:1: ( ( rule__PropertyConstraintCompare__Group__0 ) )
            {
            // InternalAspectLang.g:859:1: ( ( rule__PropertyConstraintCompare__Group__0 ) )
            // InternalAspectLang.g:860:1: ( rule__PropertyConstraintCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getGroup()); 
            }
            // InternalAspectLang.g:861:1: ( rule__PropertyConstraintCompare__Group__0 )
            // InternalAspectLang.g:861:2: rule__PropertyConstraintCompare__Group__0
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
    // InternalAspectLang.g:873:1: entryRuleConstraintElement : ruleConstraintElement EOF ;
    public final void entryRuleConstraintElement() throws RecognitionException {
        try {
            // InternalAspectLang.g:874:1: ( ruleConstraintElement EOF )
            // InternalAspectLang.g:875:1: ruleConstraintElement EOF
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
    // InternalAspectLang.g:882:1: ruleConstraintElement : ( ( rule__ConstraintElement__Alternatives ) ) ;
    public final void ruleConstraintElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:886:2: ( ( ( rule__ConstraintElement__Alternatives ) ) )
            // InternalAspectLang.g:887:1: ( ( rule__ConstraintElement__Alternatives ) )
            {
            // InternalAspectLang.g:887:1: ( ( rule__ConstraintElement__Alternatives ) )
            // InternalAspectLang.g:888:1: ( rule__ConstraintElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintElementAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:889:1: ( rule__ConstraintElement__Alternatives )
            // InternalAspectLang.g:889:2: rule__ConstraintElement__Alternatives
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
    // InternalAspectLang.g:901:1: entryRuleLocalQuery : ruleLocalQuery EOF ;
    public final void entryRuleLocalQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:902:1: ( ruleLocalQuery EOF )
            // InternalAspectLang.g:903:1: ruleLocalQuery EOF
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
    // InternalAspectLang.g:910:1: ruleLocalQuery : ( ( rule__LocalQuery__Group__0 ) ) ;
    public final void ruleLocalQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:914:2: ( ( ( rule__LocalQuery__Group__0 ) ) )
            // InternalAspectLang.g:915:1: ( ( rule__LocalQuery__Group__0 ) )
            {
            // InternalAspectLang.g:915:1: ( ( rule__LocalQuery__Group__0 ) )
            // InternalAspectLang.g:916:1: ( rule__LocalQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:917:1: ( rule__LocalQuery__Group__0 )
            // InternalAspectLang.g:917:2: rule__LocalQuery__Group__0
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
    // InternalAspectLang.g:929:1: entryRuleModelProperty : ruleModelProperty EOF ;
    public final void entryRuleModelProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:930:1: ( ruleModelProperty EOF )
            // InternalAspectLang.g:931:1: ruleModelProperty EOF
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
    // InternalAspectLang.g:938:1: ruleModelProperty : ( ( rule__ModelProperty__Group__0 ) ) ;
    public final void ruleModelProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:942:2: ( ( ( rule__ModelProperty__Group__0 ) ) )
            // InternalAspectLang.g:943:1: ( ( rule__ModelProperty__Group__0 ) )
            {
            // InternalAspectLang.g:943:1: ( ( rule__ModelProperty__Group__0 ) )
            // InternalAspectLang.g:944:1: ( rule__ModelProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getGroup()); 
            }
            // InternalAspectLang.g:945:1: ( rule__ModelProperty__Group__0 )
            // InternalAspectLang.g:945:2: rule__ModelProperty__Group__0
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
    // InternalAspectLang.g:957:1: entryRuleTypeof : ruleTypeof EOF ;
    public final void entryRuleTypeof() throws RecognitionException {
        try {
            // InternalAspectLang.g:958:1: ( ruleTypeof EOF )
            // InternalAspectLang.g:959:1: ruleTypeof EOF
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
    // InternalAspectLang.g:966:1: ruleTypeof : ( ( rule__Typeof__Group__0 ) ) ;
    public final void ruleTypeof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:970:2: ( ( ( rule__Typeof__Group__0 ) ) )
            // InternalAspectLang.g:971:1: ( ( rule__Typeof__Group__0 ) )
            {
            // InternalAspectLang.g:971:1: ( ( rule__Typeof__Group__0 ) )
            // InternalAspectLang.g:972:1: ( rule__Typeof__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getGroup()); 
            }
            // InternalAspectLang.g:973:1: ( rule__Typeof__Group__0 )
            // InternalAspectLang.g:973:2: rule__Typeof__Group__0
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
    // InternalAspectLang.g:985:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:986:1: ( ruleLiteral EOF )
            // InternalAspectLang.g:987:1: ruleLiteral EOF
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
    // InternalAspectLang.g:994:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:998:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalAspectLang.g:999:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalAspectLang.g:999:1: ( ( rule__Literal__Alternatives ) )
            // InternalAspectLang.g:1000:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1001:1: ( rule__Literal__Alternatives )
            // InternalAspectLang.g:1001:2: rule__Literal__Alternatives
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
    // InternalAspectLang.g:1013:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:1014:1: ( ruleFloatLiteral EOF )
            // InternalAspectLang.g:1015:1: ruleFloatLiteral EOF
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
    // InternalAspectLang.g:1022:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1026:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:1027:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:1027:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // InternalAspectLang.g:1028:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:1029:1: ( rule__FloatLiteral__ValueAssignment )
            // InternalAspectLang.g:1029:2: rule__FloatLiteral__ValueAssignment
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
    // InternalAspectLang.g:1041:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:1042:1: ( ruleIntLiteral EOF )
            // InternalAspectLang.g:1043:1: ruleIntLiteral EOF
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
    // InternalAspectLang.g:1050:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1054:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:1055:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:1055:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalAspectLang.g:1056:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:1057:1: ( rule__IntLiteral__ValueAssignment )
            // InternalAspectLang.g:1057:2: rule__IntLiteral__ValueAssignment
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
    // InternalAspectLang.g:1069:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:1070:1: ( ruleStringLiteral EOF )
            // InternalAspectLang.g:1071:1: ruleStringLiteral EOF
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
    // InternalAspectLang.g:1078:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1082:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:1083:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:1083:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalAspectLang.g:1084:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:1085:1: ( rule__StringLiteral__ValueAssignment )
            // InternalAspectLang.g:1085:2: rule__StringLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleTypeReference"
    // InternalAspectLang.g:1097:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalAspectLang.g:1098:1: ( ruleTypeReference EOF )
            // InternalAspectLang.g:1099:1: ruleTypeReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceRule()); 
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
    // $ANTLR end "entryRuleTypeReference"


    // $ANTLR start "ruleTypeReference"
    // InternalAspectLang.g:1106:1: ruleTypeReference : ( ( rule__TypeReference__Group__0 ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1110:2: ( ( ( rule__TypeReference__Group__0 ) ) )
            // InternalAspectLang.g:1111:1: ( ( rule__TypeReference__Group__0 ) )
            {
            // InternalAspectLang.g:1111:1: ( ( rule__TypeReference__Group__0 ) )
            // InternalAspectLang.g:1112:1: ( rule__TypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getGroup()); 
            }
            // InternalAspectLang.g:1113:1: ( rule__TypeReference__Group__0 )
            // InternalAspectLang.g:1113:2: rule__TypeReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeReference"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalAspectLang.g:1125:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAspectLang.g:1126:1: ( ruleQualifiedName EOF )
            // InternalAspectLang.g:1127:1: ruleQualifiedName EOF
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
    // InternalAspectLang.g:1134:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1138:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAspectLang.g:1139:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAspectLang.g:1139:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAspectLang.g:1140:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalAspectLang.g:1141:1: ( rule__QualifiedName__Group__0 )
            // InternalAspectLang.g:1141:2: rule__QualifiedName__Group__0
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
    // InternalAspectLang.g:1153:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalAspectLang.g:1154:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalAspectLang.g:1155:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalAspectLang.g:1162:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1166:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalAspectLang.g:1167:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalAspectLang.g:1167:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalAspectLang.g:1168:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalAspectLang.g:1169:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalAspectLang.g:1169:2: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalAspectLang.g:1182:1: ruleInsertionPoint : ( ( rule__InsertionPoint__Alternatives ) ) ;
    public final void ruleInsertionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1186:1: ( ( ( rule__InsertionPoint__Alternatives ) ) )
            // InternalAspectLang.g:1187:1: ( ( rule__InsertionPoint__Alternatives ) )
            {
            // InternalAspectLang.g:1187:1: ( ( rule__InsertionPoint__Alternatives ) )
            // InternalAspectLang.g:1188:1: ( rule__InsertionPoint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1189:1: ( rule__InsertionPoint__Alternatives )
            // InternalAspectLang.g:1189:2: rule__InsertionPoint__Alternatives
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
    // InternalAspectLang.g:1201:1: ruleInternalFunction : ( ( rule__InternalFunction__Alternatives ) ) ;
    public final void ruleInternalFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1205:1: ( ( ( rule__InternalFunction__Alternatives ) ) )
            // InternalAspectLang.g:1206:1: ( ( rule__InternalFunction__Alternatives ) )
            {
            // InternalAspectLang.g:1206:1: ( ( rule__InternalFunction__Alternatives ) )
            // InternalAspectLang.g:1207:1: ( rule__InternalFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1208:1: ( rule__InternalFunction__Alternatives )
            // InternalAspectLang.g:1208:2: rule__InternalFunction__Alternatives
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
    // InternalAspectLang.g:1220:1: ruleReflectionFunction : ( ( rule__ReflectionFunction__Alternatives ) ) ;
    public final void ruleReflectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1224:1: ( ( ( rule__ReflectionFunction__Alternatives ) ) )
            // InternalAspectLang.g:1225:1: ( ( rule__ReflectionFunction__Alternatives ) )
            {
            // InternalAspectLang.g:1225:1: ( ( rule__ReflectionFunction__Alternatives ) )
            // InternalAspectLang.g:1226:1: ( rule__ReflectionFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1227:1: ( rule__ReflectionFunction__Alternatives )
            // InternalAspectLang.g:1227:2: rule__ReflectionFunction__Alternatives
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
    // InternalAspectLang.g:1239:1: ruleQueryModifier : ( ( rule__QueryModifier__Alternatives ) ) ;
    public final void ruleQueryModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1243:1: ( ( ( rule__QueryModifier__Alternatives ) ) )
            // InternalAspectLang.g:1244:1: ( ( rule__QueryModifier__Alternatives ) )
            {
            // InternalAspectLang.g:1244:1: ( ( rule__QueryModifier__Alternatives ) )
            // InternalAspectLang.g:1245:1: ( rule__QueryModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryModifierAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1246:1: ( rule__QueryModifier__Alternatives )
            // InternalAspectLang.g:1246:2: rule__QueryModifier__Alternatives
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
    // InternalAspectLang.g:1258:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1262:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // InternalAspectLang.g:1263:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // InternalAspectLang.g:1263:1: ( ( rule__LogicOperator__Alternatives ) )
            // InternalAspectLang.g:1264:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1265:1: ( rule__LogicOperator__Alternatives )
            // InternalAspectLang.g:1265:2: rule__LogicOperator__Alternatives
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
    // InternalAspectLang.g:1277:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1281:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalAspectLang.g:1282:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalAspectLang.g:1282:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalAspectLang.g:1283:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1284:1: ( rule__CompareOperator__Alternatives )
            // InternalAspectLang.g:1284:2: rule__CompareOperator__Alternatives
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
    // InternalAspectLang.g:1295:1: rule__AspectModel__Alternatives_4 : ( ( ( rule__AspectModel__AdvicesAssignment_4_0 ) ) | ( ( rule__AspectModel__PointcutsAssignment_4_1 ) ) | ( ( rule__AspectModel__AspectsAssignment_4_2 ) ) );
    public final void rule__AspectModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1299:1: ( ( ( rule__AspectModel__AdvicesAssignment_4_0 ) ) | ( ( rule__AspectModel__PointcutsAssignment_4_1 ) ) | ( ( rule__AspectModel__AspectsAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt1=1;
                }
                break;
            case 50:
            case 54:
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
                    // InternalAspectLang.g:1300:1: ( ( rule__AspectModel__AdvicesAssignment_4_0 ) )
                    {
                    // InternalAspectLang.g:1300:1: ( ( rule__AspectModel__AdvicesAssignment_4_0 ) )
                    // InternalAspectLang.g:1301:1: ( rule__AspectModel__AdvicesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getAdvicesAssignment_4_0()); 
                    }
                    // InternalAspectLang.g:1302:1: ( rule__AspectModel__AdvicesAssignment_4_0 )
                    // InternalAspectLang.g:1302:2: rule__AspectModel__AdvicesAssignment_4_0
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
                    // InternalAspectLang.g:1306:6: ( ( rule__AspectModel__PointcutsAssignment_4_1 ) )
                    {
                    // InternalAspectLang.g:1306:6: ( ( rule__AspectModel__PointcutsAssignment_4_1 ) )
                    // InternalAspectLang.g:1307:1: ( rule__AspectModel__PointcutsAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getPointcutsAssignment_4_1()); 
                    }
                    // InternalAspectLang.g:1308:1: ( rule__AspectModel__PointcutsAssignment_4_1 )
                    // InternalAspectLang.g:1308:2: rule__AspectModel__PointcutsAssignment_4_1
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
                    // InternalAspectLang.g:1312:6: ( ( rule__AspectModel__AspectsAssignment_4_2 ) )
                    {
                    // InternalAspectLang.g:1312:6: ( ( rule__AspectModel__AspectsAssignment_4_2 ) )
                    // InternalAspectLang.g:1313:1: ( rule__AspectModel__AspectsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getAspectsAssignment_4_2()); 
                    }
                    // InternalAspectLang.g:1314:1: ( rule__AspectModel__AspectsAssignment_4_2 )
                    // InternalAspectLang.g:1314:2: rule__AspectModel__AspectsAssignment_4_2
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
    // InternalAspectLang.g:1323:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleReferenceValue ) | ( ruleInternalFunctionProperty ) | ( ruleAdviceParameter ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1327:1: ( ( ruleLiteral ) | ( ruleReferenceValue ) | ( ruleInternalFunctionProperty ) | ( ruleAdviceParameter ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAspectLang.g:1328:1: ( ruleLiteral )
                    {
                    // InternalAspectLang.g:1328:1: ( ruleLiteral )
                    // InternalAspectLang.g:1329:1: ruleLiteral
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
                    // InternalAspectLang.g:1334:6: ( ruleReferenceValue )
                    {
                    // InternalAspectLang.g:1334:6: ( ruleReferenceValue )
                    // InternalAspectLang.g:1335:1: ruleReferenceValue
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
                case 3 :
                    // InternalAspectLang.g:1340:6: ( ruleInternalFunctionProperty )
                    {
                    // InternalAspectLang.g:1340:6: ( ruleInternalFunctionProperty )
                    // InternalAspectLang.g:1341:1: ruleInternalFunctionProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getInternalFunctionPropertyParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleInternalFunctionProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getInternalFunctionPropertyParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:1346:6: ( ruleAdviceParameter )
                    {
                    // InternalAspectLang.g:1346:6: ( ruleAdviceParameter )
                    // InternalAspectLang.g:1347:1: ruleAdviceParameter
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getValueAccess().getAdviceParameterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAdviceParameter();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getValueAccess().getAdviceParameterParserRuleCall_3()); 
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
    // InternalAspectLang.g:1357:1: rule__Property__Alternatives : ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1361:1: ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==47) ) {
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
                    // InternalAspectLang.g:1362:1: ( ruleRuntimeProperty )
                    {
                    // InternalAspectLang.g:1362:1: ( ruleRuntimeProperty )
                    // InternalAspectLang.g:1363:1: ruleRuntimeProperty
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getRuntimePropertyParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRuntimeProperty();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyAccess().getRuntimePropertyParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1368:6: ( ruleReflectionProperty )
                    {
                    // InternalAspectLang.g:1368:6: ( ruleReflectionProperty )
                    // InternalAspectLang.g:1369:1: ruleReflectionProperty
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
    // InternalAspectLang.g:1379:1: rule__LocationQuery__Alternatives_1 : ( ( ( rule__LocationQuery__Group_1_0__0 ) ) | ( ( rule__LocationQuery__CompositionAssignment_1_1 ) ) );
    public final void rule__LocationQuery__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1383:1: ( ( ( rule__LocationQuery__Group_1_0__0 ) ) | ( ( rule__LocationQuery__CompositionAssignment_1_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
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
                    // InternalAspectLang.g:1384:1: ( ( rule__LocationQuery__Group_1_0__0 ) )
                    {
                    // InternalAspectLang.g:1384:1: ( ( rule__LocationQuery__Group_1_0__0 ) )
                    // InternalAspectLang.g:1385:1: ( rule__LocationQuery__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationQueryAccess().getGroup_1_0()); 
                    }
                    // InternalAspectLang.g:1386:1: ( rule__LocationQuery__Group_1_0__0 )
                    // InternalAspectLang.g:1386:2: rule__LocationQuery__Group_1_0__0
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
                    // InternalAspectLang.g:1390:6: ( ( rule__LocationQuery__CompositionAssignment_1_1 ) )
                    {
                    // InternalAspectLang.g:1390:6: ( ( rule__LocationQuery__CompositionAssignment_1_1 ) )
                    // InternalAspectLang.g:1391:1: ( rule__LocationQuery__CompositionAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationQueryAccess().getCompositionAssignment_1_1()); 
                    }
                    // InternalAspectLang.g:1392:1: ( rule__LocationQuery__CompositionAssignment_1_1 )
                    // InternalAspectLang.g:1392:2: rule__LocationQuery__CompositionAssignment_1_1
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
    // InternalAspectLang.g:1401:1: rule__OperationQuery__Alternatives_3 : ( ( ( rule__OperationQuery__Group_3_0__0 ) ) | ( '*' ) );
    public final void rule__OperationQuery__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1405:1: ( ( ( rule__OperationQuery__Group_3_0__0 ) ) | ( '*' ) )
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
                    // InternalAspectLang.g:1406:1: ( ( rule__OperationQuery__Group_3_0__0 ) )
                    {
                    // InternalAspectLang.g:1406:1: ( ( rule__OperationQuery__Group_3_0__0 ) )
                    // InternalAspectLang.g:1407:1: ( rule__OperationQuery__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationQueryAccess().getGroup_3_0()); 
                    }
                    // InternalAspectLang.g:1408:1: ( rule__OperationQuery__Group_3_0__0 )
                    // InternalAspectLang.g:1408:2: rule__OperationQuery__Group_3_0__0
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
                    // InternalAspectLang.g:1412:6: ( '*' )
                    {
                    // InternalAspectLang.g:1412:6: ( '*' )
                    // InternalAspectLang.g:1413:1: '*'
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
    // InternalAspectLang.g:1425:1: rule__ParameterQuery__Alternatives_2 : ( ( ( rule__ParameterQuery__TypeAssignment_2_0 ) ) | ( '*' ) );
    public final void rule__ParameterQuery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1429:1: ( ( ( rule__ParameterQuery__TypeAssignment_2_0 ) ) | ( '*' ) )
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
                    // InternalAspectLang.g:1430:1: ( ( rule__ParameterQuery__TypeAssignment_2_0 ) )
                    {
                    // InternalAspectLang.g:1430:1: ( ( rule__ParameterQuery__TypeAssignment_2_0 ) )
                    // InternalAspectLang.g:1431:1: ( rule__ParameterQuery__TypeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterQueryAccess().getTypeAssignment_2_0()); 
                    }
                    // InternalAspectLang.g:1432:1: ( rule__ParameterQuery__TypeAssignment_2_0 )
                    // InternalAspectLang.g:1432:2: rule__ParameterQuery__TypeAssignment_2_0
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
                    // InternalAspectLang.g:1436:6: ( '*' )
                    {
                    // InternalAspectLang.g:1436:6: ( '*' )
                    // InternalAspectLang.g:1437:1: '*'
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
    // InternalAspectLang.g:1449:1: rule__Node__Alternatives_0 : ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1453:1: ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 56:
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
                    // InternalAspectLang.g:1454:1: ( ruleSubPathNode )
                    {
                    // InternalAspectLang.g:1454:1: ( ruleSubPathNode )
                    // InternalAspectLang.g:1455:1: ruleSubPathNode
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
                    // InternalAspectLang.g:1460:6: ( ruleWildcardNode )
                    {
                    // InternalAspectLang.g:1460:6: ( ruleWildcardNode )
                    // InternalAspectLang.g:1461:1: ruleWildcardNode
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
                    // InternalAspectLang.g:1466:6: ( ruleParentNode )
                    {
                    // InternalAspectLang.g:1466:6: ( ruleParentNode )
                    // InternalAspectLang.g:1467:1: ruleParentNode
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
                    // InternalAspectLang.g:1472:6: ( ruleContainerNode )
                    {
                    // InternalAspectLang.g:1472:6: ( ruleContainerNode )
                    // InternalAspectLang.g:1473:1: ruleContainerNode
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
    // InternalAspectLang.g:1483:1: rule__ConstraintElement__Alternatives : ( ( ruleLiteral ) | ( ruleLocalQuery ) );
    public final void rule__ConstraintElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1487:1: ( ( ruleLiteral ) | ( ruleLocalQuery ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||LA8_0==13||LA8_0==47||(LA8_0>=55 && LA8_0<=57)) ) {
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
                    // InternalAspectLang.g:1488:1: ( ruleLiteral )
                    {
                    // InternalAspectLang.g:1488:1: ( ruleLiteral )
                    // InternalAspectLang.g:1489:1: ruleLiteral
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
                    // InternalAspectLang.g:1494:6: ( ruleLocalQuery )
                    {
                    // InternalAspectLang.g:1494:6: ( ruleLocalQuery )
                    // InternalAspectLang.g:1495:1: ruleLocalQuery
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
    // InternalAspectLang.g:1505:1: rule__LocalQuery__Alternatives_1 : ( ( ( rule__LocalQuery__PropertyAssignment_1_0 ) ) | ( ( rule__LocalQuery__TypeofAssignment_1_1 ) ) );
    public final void rule__LocalQuery__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1509:1: ( ( ( rule__LocalQuery__PropertyAssignment_1_0 ) ) | ( ( rule__LocalQuery__TypeofAssignment_1_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==47) ) {
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
                    // InternalAspectLang.g:1510:1: ( ( rule__LocalQuery__PropertyAssignment_1_0 ) )
                    {
                    // InternalAspectLang.g:1510:1: ( ( rule__LocalQuery__PropertyAssignment_1_0 ) )
                    // InternalAspectLang.g:1511:1: ( rule__LocalQuery__PropertyAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocalQueryAccess().getPropertyAssignment_1_0()); 
                    }
                    // InternalAspectLang.g:1512:1: ( rule__LocalQuery__PropertyAssignment_1_0 )
                    // InternalAspectLang.g:1512:2: rule__LocalQuery__PropertyAssignment_1_0
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
                    // InternalAspectLang.g:1516:6: ( ( rule__LocalQuery__TypeofAssignment_1_1 ) )
                    {
                    // InternalAspectLang.g:1516:6: ( ( rule__LocalQuery__TypeofAssignment_1_1 ) )
                    // InternalAspectLang.g:1517:1: ( rule__LocalQuery__TypeofAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocalQueryAccess().getTypeofAssignment_1_1()); 
                    }
                    // InternalAspectLang.g:1518:1: ( rule__LocalQuery__TypeofAssignment_1_1 )
                    // InternalAspectLang.g:1518:2: rule__LocalQuery__TypeofAssignment_1_1
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
    // InternalAspectLang.g:1527:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1531:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) )
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
                    // InternalAspectLang.g:1532:1: ( ruleStringLiteral )
                    {
                    // InternalAspectLang.g:1532:1: ( ruleStringLiteral )
                    // InternalAspectLang.g:1533:1: ruleStringLiteral
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
                    // InternalAspectLang.g:1538:6: ( ruleIntLiteral )
                    {
                    // InternalAspectLang.g:1538:6: ( ruleIntLiteral )
                    // InternalAspectLang.g:1539:1: ruleIntLiteral
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
                    // InternalAspectLang.g:1544:6: ( ruleFloatLiteral )
                    {
                    // InternalAspectLang.g:1544:6: ( ruleFloatLiteral )
                    // InternalAspectLang.g:1545:1: ruleFloatLiteral
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
    // InternalAspectLang.g:1555:1: rule__InsertionPoint__Alternatives : ( ( ( 'before' ) ) | ( ( 'after' ) ) );
    public final void rule__InsertionPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1559:1: ( ( ( 'before' ) ) | ( ( 'after' ) ) )
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
                    // InternalAspectLang.g:1560:1: ( ( 'before' ) )
                    {
                    // InternalAspectLang.g:1560:1: ( ( 'before' ) )
                    // InternalAspectLang.g:1561:1: ( 'before' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1562:1: ( 'before' )
                    // InternalAspectLang.g:1562:3: 'before'
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
                    // InternalAspectLang.g:1567:6: ( ( 'after' ) )
                    {
                    // InternalAspectLang.g:1567:6: ( ( 'after' ) )
                    // InternalAspectLang.g:1568:1: ( 'after' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1569:1: ( 'after' )
                    // InternalAspectLang.g:1569:3: 'after'
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
    // InternalAspectLang.g:1579:1: rule__InternalFunction__Alternatives : ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) );
    public final void rule__InternalFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1583:1: ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) )
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
                    // InternalAspectLang.g:1584:1: ( ( 'time' ) )
                    {
                    // InternalAspectLang.g:1584:1: ( ( 'time' ) )
                    // InternalAspectLang.g:1585:1: ( 'time' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1586:1: ( 'time' )
                    // InternalAspectLang.g:1586:3: 'time'
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
                    // InternalAspectLang.g:1591:6: ( ( 'traceId' ) )
                    {
                    // InternalAspectLang.g:1591:6: ( ( 'traceId' ) )
                    // InternalAspectLang.g:1592:1: ( 'traceId' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1593:1: ( 'traceId' )
                    // InternalAspectLang.g:1593:3: 'traceId'
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
                    // InternalAspectLang.g:1598:6: ( ( 'orderIndex' ) )
                    {
                    // InternalAspectLang.g:1598:6: ( ( 'orderIndex' ) )
                    // InternalAspectLang.g:1599:1: ( 'orderIndex' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getORDER_INDEXEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1600:1: ( 'orderIndex' )
                    // InternalAspectLang.g:1600:3: 'orderIndex'
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
    // InternalAspectLang.g:1610:1: rule__ReflectionFunction__Alternatives : ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'classname' ) ) | ( ( 'return-type' ) ) );
    public final void rule__ReflectionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1614:1: ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'classname' ) ) | ( ( 'return-type' ) ) )
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
                    // InternalAspectLang.g:1615:1: ( ( 'name' ) )
                    {
                    // InternalAspectLang.g:1615:1: ( ( 'name' ) )
                    // InternalAspectLang.g:1616:1: ( 'name' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1617:1: ( 'name' )
                    // InternalAspectLang.g:1617:3: 'name'
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
                    // InternalAspectLang.g:1622:6: ( ( 'signature' ) )
                    {
                    // InternalAspectLang.g:1622:6: ( ( 'signature' ) )
                    // InternalAspectLang.g:1623:1: ( 'signature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1624:1: ( 'signature' )
                    // InternalAspectLang.g:1624:3: 'signature'
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
                    // InternalAspectLang.g:1629:6: ( ( 'classname' ) )
                    {
                    // InternalAspectLang.g:1629:6: ( ( 'classname' ) )
                    // InternalAspectLang.g:1630:1: ( 'classname' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1631:1: ( 'classname' )
                    // InternalAspectLang.g:1631:3: 'classname'
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
                    // InternalAspectLang.g:1636:6: ( ( 'return-type' ) )
                    {
                    // InternalAspectLang.g:1636:6: ( ( 'return-type' ) )
                    // InternalAspectLang.g:1637:1: ( 'return-type' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }
                    // InternalAspectLang.g:1638:1: ( 'return-type' )
                    // InternalAspectLang.g:1638:3: 'return-type'
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
    // InternalAspectLang.g:1648:1: rule__QueryModifier__Alternatives : ( ( ( 'include' ) ) | ( ( 'exclude' ) ) );
    public final void rule__QueryModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1652:1: ( ( ( 'include' ) ) | ( ( 'exclude' ) ) )
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
                    // InternalAspectLang.g:1653:1: ( ( 'include' ) )
                    {
                    // InternalAspectLang.g:1653:1: ( ( 'include' ) )
                    // InternalAspectLang.g:1654:1: ( 'include' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1655:1: ( 'include' )
                    // InternalAspectLang.g:1655:3: 'include'
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
                    // InternalAspectLang.g:1660:6: ( ( 'exclude' ) )
                    {
                    // InternalAspectLang.g:1660:6: ( ( 'exclude' ) )
                    // InternalAspectLang.g:1661:1: ( 'exclude' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryModifierAccess().getEXCLUDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1662:1: ( 'exclude' )
                    // InternalAspectLang.g:1662:3: 'exclude'
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
    // InternalAspectLang.g:1672:1: rule__LogicOperator__Alternatives : ( ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1676:1: ( ( ( '&&' ) ) | ( ( '||' ) ) )
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
                    // InternalAspectLang.g:1677:1: ( ( '&&' ) )
                    {
                    // InternalAspectLang.g:1677:1: ( ( '&&' ) )
                    // InternalAspectLang.g:1678:1: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1679:1: ( '&&' )
                    // InternalAspectLang.g:1679:3: '&&'
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
                    // InternalAspectLang.g:1684:6: ( ( '||' ) )
                    {
                    // InternalAspectLang.g:1684:6: ( ( '||' ) )
                    // InternalAspectLang.g:1685:1: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1686:1: ( '||' )
                    // InternalAspectLang.g:1686:3: '||'
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
    // InternalAspectLang.g:1696:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1700:1: ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
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
                    // InternalAspectLang.g:1701:1: ( ( '=' ) )
                    {
                    // InternalAspectLang.g:1701:1: ( ( '=' ) )
                    // InternalAspectLang.g:1702:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1703:1: ( '=' )
                    // InternalAspectLang.g:1703:3: '='
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
                    // InternalAspectLang.g:1708:6: ( ( '~' ) )
                    {
                    // InternalAspectLang.g:1708:6: ( ( '~' ) )
                    // InternalAspectLang.g:1709:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1710:1: ( '~' )
                    // InternalAspectLang.g:1710:3: '~'
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
                    // InternalAspectLang.g:1715:6: ( ( '!=' ) )
                    {
                    // InternalAspectLang.g:1715:6: ( ( '!=' ) )
                    // InternalAspectLang.g:1716:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1717:1: ( '!=' )
                    // InternalAspectLang.g:1717:3: '!='
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
                    // InternalAspectLang.g:1722:6: ( ( '>' ) )
                    {
                    // InternalAspectLang.g:1722:6: ( ( '>' ) )
                    // InternalAspectLang.g:1723:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }
                    // InternalAspectLang.g:1724:1: ( '>' )
                    // InternalAspectLang.g:1724:3: '>'
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
                    // InternalAspectLang.g:1729:6: ( ( '<' ) )
                    {
                    // InternalAspectLang.g:1729:6: ( ( '<' ) )
                    // InternalAspectLang.g:1730:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }
                    // InternalAspectLang.g:1731:1: ( '<' )
                    // InternalAspectLang.g:1731:3: '<'
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
                    // InternalAspectLang.g:1736:6: ( ( '>=' ) )
                    {
                    // InternalAspectLang.g:1736:6: ( ( '>=' ) )
                    // InternalAspectLang.g:1737:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }
                    // InternalAspectLang.g:1738:1: ( '>=' )
                    // InternalAspectLang.g:1738:3: '>='
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
                    // InternalAspectLang.g:1743:6: ( ( '<=' ) )
                    {
                    // InternalAspectLang.g:1743:6: ( ( '<=' ) )
                    // InternalAspectLang.g:1744:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                    }
                    // InternalAspectLang.g:1745:1: ( '<=' )
                    // InternalAspectLang.g:1745:3: '<='
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
    // InternalAspectLang.g:1757:1: rule__AspectModel__Group__0 : rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1 ;
    public final void rule__AspectModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1761:1: ( rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1 )
            // InternalAspectLang.g:1762:2: rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1
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
    // InternalAspectLang.g:1769:1: rule__AspectModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__AspectModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1773:1: ( ( 'package' ) )
            // InternalAspectLang.g:1774:1: ( 'package' )
            {
            // InternalAspectLang.g:1774:1: ( 'package' )
            // InternalAspectLang.g:1775:1: 'package'
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
    // InternalAspectLang.g:1788:1: rule__AspectModel__Group__1 : rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2 ;
    public final void rule__AspectModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1792:1: ( rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2 )
            // InternalAspectLang.g:1793:2: rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2
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
    // InternalAspectLang.g:1800:1: rule__AspectModel__Group__1__Impl : ( ( rule__AspectModel__NameAssignment_1 ) ) ;
    public final void rule__AspectModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1804:1: ( ( ( rule__AspectModel__NameAssignment_1 ) ) )
            // InternalAspectLang.g:1805:1: ( ( rule__AspectModel__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:1805:1: ( ( rule__AspectModel__NameAssignment_1 ) )
            // InternalAspectLang.g:1806:1: ( rule__AspectModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:1807:1: ( rule__AspectModel__NameAssignment_1 )
            // InternalAspectLang.g:1807:2: rule__AspectModel__NameAssignment_1
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
    // InternalAspectLang.g:1817:1: rule__AspectModel__Group__2 : rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3 ;
    public final void rule__AspectModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1821:1: ( rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3 )
            // InternalAspectLang.g:1822:2: rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3
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
    // InternalAspectLang.g:1829:1: rule__AspectModel__Group__2__Impl : ( ( rule__AspectModel__ImportsAssignment_2 )* ) ;
    public final void rule__AspectModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1833:1: ( ( ( rule__AspectModel__ImportsAssignment_2 )* ) )
            // InternalAspectLang.g:1834:1: ( ( rule__AspectModel__ImportsAssignment_2 )* )
            {
            // InternalAspectLang.g:1834:1: ( ( rule__AspectModel__ImportsAssignment_2 )* )
            // InternalAspectLang.g:1835:1: ( rule__AspectModel__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getImportsAssignment_2()); 
            }
            // InternalAspectLang.g:1836:1: ( rule__AspectModel__ImportsAssignment_2 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalAspectLang.g:1836:2: rule__AspectModel__ImportsAssignment_2
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
    // InternalAspectLang.g:1846:1: rule__AspectModel__Group__3 : rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4 ;
    public final void rule__AspectModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1850:1: ( rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4 )
            // InternalAspectLang.g:1851:2: rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4
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
    // InternalAspectLang.g:1858:1: rule__AspectModel__Group__3__Impl : ( ( rule__AspectModel__SourcesAssignment_3 )* ) ;
    public final void rule__AspectModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1862:1: ( ( ( rule__AspectModel__SourcesAssignment_3 )* ) )
            // InternalAspectLang.g:1863:1: ( ( rule__AspectModel__SourcesAssignment_3 )* )
            {
            // InternalAspectLang.g:1863:1: ( ( rule__AspectModel__SourcesAssignment_3 )* )
            // InternalAspectLang.g:1864:1: ( rule__AspectModel__SourcesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getSourcesAssignment_3()); 
            }
            // InternalAspectLang.g:1865:1: ( rule__AspectModel__SourcesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==36) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAspectLang.g:1865:2: rule__AspectModel__SourcesAssignment_3
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
    // InternalAspectLang.g:1875:1: rule__AspectModel__Group__4 : rule__AspectModel__Group__4__Impl ;
    public final void rule__AspectModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1879:1: ( rule__AspectModel__Group__4__Impl )
            // InternalAspectLang.g:1880:2: rule__AspectModel__Group__4__Impl
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
    // InternalAspectLang.g:1886:1: rule__AspectModel__Group__4__Impl : ( ( rule__AspectModel__Alternatives_4 )* ) ;
    public final void rule__AspectModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1890:1: ( ( ( rule__AspectModel__Alternatives_4 )* ) )
            // InternalAspectLang.g:1891:1: ( ( rule__AspectModel__Alternatives_4 )* )
            {
            // InternalAspectLang.g:1891:1: ( ( rule__AspectModel__Alternatives_4 )* )
            // InternalAspectLang.g:1892:1: ( rule__AspectModel__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getAlternatives_4()); 
            }
            // InternalAspectLang.g:1893:1: ( rule__AspectModel__Alternatives_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38||LA19_0==43||LA19_0==50||LA19_0==54) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAspectLang.g:1893:2: rule__AspectModel__Alternatives_4
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
    // InternalAspectLang.g:1913:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1917:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAspectLang.g:1918:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalAspectLang.g:1925:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1929:1: ( ( 'import' ) )
            // InternalAspectLang.g:1930:1: ( 'import' )
            {
            // InternalAspectLang.g:1930:1: ( 'import' )
            // InternalAspectLang.g:1931:1: 'import'
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
    // InternalAspectLang.g:1944:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1948:1: ( rule__Import__Group__1__Impl )
            // InternalAspectLang.g:1949:2: rule__Import__Group__1__Impl
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
    // InternalAspectLang.g:1955:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1959:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalAspectLang.g:1960:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAspectLang.g:1960:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalAspectLang.g:1961:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalAspectLang.g:1962:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalAspectLang.g:1962:2: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalAspectLang.g:1976:1: rule__ApplicationModel__Group__0 : rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1980:1: ( rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 )
            // InternalAspectLang.g:1981:2: rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1
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
    // InternalAspectLang.g:1988:1: rule__ApplicationModel__Group__0__Impl : ( 'use' ) ;
    public final void rule__ApplicationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1992:1: ( ( 'use' ) )
            // InternalAspectLang.g:1993:1: ( 'use' )
            {
            // InternalAspectLang.g:1993:1: ( 'use' )
            // InternalAspectLang.g:1994:1: 'use'
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
    // InternalAspectLang.g:2007:1: rule__ApplicationModel__Group__1 : rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2011:1: ( rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 )
            // InternalAspectLang.g:2012:2: rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2
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
    // InternalAspectLang.g:2019:1: rule__ApplicationModel__Group__1__Impl : ( ( rule__ApplicationModel__HandlerAssignment_1 ) ) ;
    public final void rule__ApplicationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2023:1: ( ( ( rule__ApplicationModel__HandlerAssignment_1 ) ) )
            // InternalAspectLang.g:2024:1: ( ( rule__ApplicationModel__HandlerAssignment_1 ) )
            {
            // InternalAspectLang.g:2024:1: ( ( rule__ApplicationModel__HandlerAssignment_1 ) )
            // InternalAspectLang.g:2025:1: ( rule__ApplicationModel__HandlerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getHandlerAssignment_1()); 
            }
            // InternalAspectLang.g:2026:1: ( rule__ApplicationModel__HandlerAssignment_1 )
            // InternalAspectLang.g:2026:2: rule__ApplicationModel__HandlerAssignment_1
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
    // InternalAspectLang.g:2036:1: rule__ApplicationModel__Group__2 : rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2040:1: ( rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 )
            // InternalAspectLang.g:2041:2: rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3
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
    // InternalAspectLang.g:2048:1: rule__ApplicationModel__Group__2__Impl : ( 'on' ) ;
    public final void rule__ApplicationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2052:1: ( ( 'on' ) )
            // InternalAspectLang.g:2053:1: ( 'on' )
            {
            // InternalAspectLang.g:2053:1: ( 'on' )
            // InternalAspectLang.g:2054:1: 'on'
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
    // InternalAspectLang.g:2067:1: rule__ApplicationModel__Group__3 : rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2071:1: ( rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 )
            // InternalAspectLang.g:2072:2: rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4
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
    // InternalAspectLang.g:2079:1: rule__ApplicationModel__Group__3__Impl : ( ( rule__ApplicationModel__NameAssignment_3 ) ) ;
    public final void rule__ApplicationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2083:1: ( ( ( rule__ApplicationModel__NameAssignment_3 ) ) )
            // InternalAspectLang.g:2084:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            {
            // InternalAspectLang.g:2084:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            // InternalAspectLang.g:2085:1: ( rule__ApplicationModel__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameAssignment_3()); 
            }
            // InternalAspectLang.g:2086:1: ( rule__ApplicationModel__NameAssignment_3 )
            // InternalAspectLang.g:2086:2: rule__ApplicationModel__NameAssignment_3
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
    // InternalAspectLang.g:2096:1: rule__ApplicationModel__Group__4 : rule__ApplicationModel__Group__4__Impl ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2100:1: ( rule__ApplicationModel__Group__4__Impl )
            // InternalAspectLang.g:2101:2: rule__ApplicationModel__Group__4__Impl
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
    // InternalAspectLang.g:2107:1: rule__ApplicationModel__Group__4__Impl : ( ( rule__ApplicationModel__ModelAssignment_4 ) ) ;
    public final void rule__ApplicationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2111:1: ( ( ( rule__ApplicationModel__ModelAssignment_4 ) ) )
            // InternalAspectLang.g:2112:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            {
            // InternalAspectLang.g:2112:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            // InternalAspectLang.g:2113:1: ( rule__ApplicationModel__ModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelAssignment_4()); 
            }
            // InternalAspectLang.g:2114:1: ( rule__ApplicationModel__ModelAssignment_4 )
            // InternalAspectLang.g:2114:2: rule__ApplicationModel__ModelAssignment_4
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
    // InternalAspectLang.g:2134:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2138:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // InternalAspectLang.g:2139:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
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
    // InternalAspectLang.g:2146:1: rule__Aspect__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2150:1: ( ( 'aspect' ) )
            // InternalAspectLang.g:2151:1: ( 'aspect' )
            {
            // InternalAspectLang.g:2151:1: ( 'aspect' )
            // InternalAspectLang.g:2152:1: 'aspect'
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
    // InternalAspectLang.g:2165:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2169:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // InternalAspectLang.g:2170:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
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
    // InternalAspectLang.g:2177:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__PointcutAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2181:1: ( ( ( rule__Aspect__PointcutAssignment_1 ) ) )
            // InternalAspectLang.g:2182:1: ( ( rule__Aspect__PointcutAssignment_1 ) )
            {
            // InternalAspectLang.g:2182:1: ( ( rule__Aspect__PointcutAssignment_1 ) )
            // InternalAspectLang.g:2183:1: ( rule__Aspect__PointcutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutAssignment_1()); 
            }
            // InternalAspectLang.g:2184:1: ( rule__Aspect__PointcutAssignment_1 )
            // InternalAspectLang.g:2184:2: rule__Aspect__PointcutAssignment_1
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
    // InternalAspectLang.g:2194:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2198:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // InternalAspectLang.g:2199:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
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
    // InternalAspectLang.g:2206:1: rule__Aspect__Group__2__Impl : ( ':' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2210:1: ( ( ':' ) )
            // InternalAspectLang.g:2211:1: ( ':' )
            {
            // InternalAspectLang.g:2211:1: ( ':' )
            // InternalAspectLang.g:2212:1: ':'
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
    // InternalAspectLang.g:2225:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2229:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // InternalAspectLang.g:2230:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
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
    // InternalAspectLang.g:2237:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__AdvicesAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2241:1: ( ( ( rule__Aspect__AdvicesAssignment_3 ) ) )
            // InternalAspectLang.g:2242:1: ( ( rule__Aspect__AdvicesAssignment_3 ) )
            {
            // InternalAspectLang.g:2242:1: ( ( rule__Aspect__AdvicesAssignment_3 ) )
            // InternalAspectLang.g:2243:1: ( rule__Aspect__AdvicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesAssignment_3()); 
            }
            // InternalAspectLang.g:2244:1: ( rule__Aspect__AdvicesAssignment_3 )
            // InternalAspectLang.g:2244:2: rule__Aspect__AdvicesAssignment_3
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
    // InternalAspectLang.g:2254:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2258:1: ( rule__Aspect__Group__4__Impl )
            // InternalAspectLang.g:2259:2: rule__Aspect__Group__4__Impl
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
    // InternalAspectLang.g:2265:1: rule__Aspect__Group__4__Impl : ( ( rule__Aspect__Group_4__0 )* ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2269:1: ( ( ( rule__Aspect__Group_4__0 )* ) )
            // InternalAspectLang.g:2270:1: ( ( rule__Aspect__Group_4__0 )* )
            {
            // InternalAspectLang.g:2270:1: ( ( rule__Aspect__Group_4__0 )* )
            // InternalAspectLang.g:2271:1: ( rule__Aspect__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup_4()); 
            }
            // InternalAspectLang.g:2272:1: ( rule__Aspect__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==40) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAspectLang.g:2272:2: rule__Aspect__Group_4__0
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
    // InternalAspectLang.g:2292:1: rule__Aspect__Group_4__0 : rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1 ;
    public final void rule__Aspect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2296:1: ( rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1 )
            // InternalAspectLang.g:2297:2: rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1
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
    // InternalAspectLang.g:2304:1: rule__Aspect__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Aspect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2308:1: ( ( ',' ) )
            // InternalAspectLang.g:2309:1: ( ',' )
            {
            // InternalAspectLang.g:2309:1: ( ',' )
            // InternalAspectLang.g:2310:1: ','
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
    // InternalAspectLang.g:2323:1: rule__Aspect__Group_4__1 : rule__Aspect__Group_4__1__Impl ;
    public final void rule__Aspect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2327:1: ( rule__Aspect__Group_4__1__Impl )
            // InternalAspectLang.g:2328:2: rule__Aspect__Group_4__1__Impl
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
    // InternalAspectLang.g:2334:1: rule__Aspect__Group_4__1__Impl : ( ( rule__Aspect__AdvicesAssignment_4_1 ) ) ;
    public final void rule__Aspect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2338:1: ( ( ( rule__Aspect__AdvicesAssignment_4_1 ) ) )
            // InternalAspectLang.g:2339:1: ( ( rule__Aspect__AdvicesAssignment_4_1 ) )
            {
            // InternalAspectLang.g:2339:1: ( ( rule__Aspect__AdvicesAssignment_4_1 ) )
            // InternalAspectLang.g:2340:1: ( rule__Aspect__AdvicesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesAssignment_4_1()); 
            }
            // InternalAspectLang.g:2341:1: ( rule__Aspect__AdvicesAssignment_4_1 )
            // InternalAspectLang.g:2341:2: rule__Aspect__AdvicesAssignment_4_1
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
    // InternalAspectLang.g:2355:1: rule__UtilizeAdvice__Group__0 : rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1 ;
    public final void rule__UtilizeAdvice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2359:1: ( rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1 )
            // InternalAspectLang.g:2360:2: rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1
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
    // InternalAspectLang.g:2367:1: rule__UtilizeAdvice__Group__0__Impl : ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) ) ;
    public final void rule__UtilizeAdvice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2371:1: ( ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) ) )
            // InternalAspectLang.g:2372:1: ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) )
            {
            // InternalAspectLang.g:2372:1: ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) )
            // InternalAspectLang.g:2373:1: ( rule__UtilizeAdvice__AdviceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAssignment_0()); 
            }
            // InternalAspectLang.g:2374:1: ( rule__UtilizeAdvice__AdviceAssignment_0 )
            // InternalAspectLang.g:2374:2: rule__UtilizeAdvice__AdviceAssignment_0
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
    // InternalAspectLang.g:2384:1: rule__UtilizeAdvice__Group__1 : rule__UtilizeAdvice__Group__1__Impl ;
    public final void rule__UtilizeAdvice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2388:1: ( rule__UtilizeAdvice__Group__1__Impl )
            // InternalAspectLang.g:2389:2: rule__UtilizeAdvice__Group__1__Impl
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
    // InternalAspectLang.g:2395:1: rule__UtilizeAdvice__Group__1__Impl : ( ( rule__UtilizeAdvice__Group_1__0 )? ) ;
    public final void rule__UtilizeAdvice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2399:1: ( ( ( rule__UtilizeAdvice__Group_1__0 )? ) )
            // InternalAspectLang.g:2400:1: ( ( rule__UtilizeAdvice__Group_1__0 )? )
            {
            // InternalAspectLang.g:2400:1: ( ( rule__UtilizeAdvice__Group_1__0 )? )
            // InternalAspectLang.g:2401:1: ( rule__UtilizeAdvice__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:2402:1: ( rule__UtilizeAdvice__Group_1__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalAspectLang.g:2402:2: rule__UtilizeAdvice__Group_1__0
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
    // InternalAspectLang.g:2416:1: rule__UtilizeAdvice__Group_1__0 : rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1 ;
    public final void rule__UtilizeAdvice__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2420:1: ( rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1 )
            // InternalAspectLang.g:2421:2: rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1
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
    // InternalAspectLang.g:2428:1: rule__UtilizeAdvice__Group_1__0__Impl : ( '(' ) ;
    public final void rule__UtilizeAdvice__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2432:1: ( ( '(' ) )
            // InternalAspectLang.g:2433:1: ( '(' )
            {
            // InternalAspectLang.g:2433:1: ( '(' )
            // InternalAspectLang.g:2434:1: '('
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
    // InternalAspectLang.g:2447:1: rule__UtilizeAdvice__Group_1__1 : rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2 ;
    public final void rule__UtilizeAdvice__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2451:1: ( rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2 )
            // InternalAspectLang.g:2452:2: rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2
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
    // InternalAspectLang.g:2459:1: rule__UtilizeAdvice__Group_1__1__Impl : ( ( rule__UtilizeAdvice__Group_1_1__0 )? ) ;
    public final void rule__UtilizeAdvice__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2463:1: ( ( ( rule__UtilizeAdvice__Group_1_1__0 )? ) )
            // InternalAspectLang.g:2464:1: ( ( rule__UtilizeAdvice__Group_1_1__0 )? )
            {
            // InternalAspectLang.g:2464:1: ( ( rule__UtilizeAdvice__Group_1_1__0 )? )
            // InternalAspectLang.g:2465:1: ( rule__UtilizeAdvice__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1()); 
            }
            // InternalAspectLang.g:2466:1: ( rule__UtilizeAdvice__Group_1_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==13||(LA22_0>=16 && LA22_0<=18)||(LA22_0>=46 && LA22_0<=47)||(LA22_0>=55 && LA22_0<=56)) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAspectLang.g:2466:2: rule__UtilizeAdvice__Group_1_1__0
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
    // InternalAspectLang.g:2476:1: rule__UtilizeAdvice__Group_1__2 : rule__UtilizeAdvice__Group_1__2__Impl ;
    public final void rule__UtilizeAdvice__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2480:1: ( rule__UtilizeAdvice__Group_1__2__Impl )
            // InternalAspectLang.g:2481:2: rule__UtilizeAdvice__Group_1__2__Impl
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
    // InternalAspectLang.g:2487:1: rule__UtilizeAdvice__Group_1__2__Impl : ( ')' ) ;
    public final void rule__UtilizeAdvice__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2491:1: ( ( ')' ) )
            // InternalAspectLang.g:2492:1: ( ')' )
            {
            // InternalAspectLang.g:2492:1: ( ')' )
            // InternalAspectLang.g:2493:1: ')'
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
    // InternalAspectLang.g:2512:1: rule__UtilizeAdvice__Group_1_1__0 : rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1 ;
    public final void rule__UtilizeAdvice__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2516:1: ( rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1 )
            // InternalAspectLang.g:2517:2: rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1
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
    // InternalAspectLang.g:2524:1: rule__UtilizeAdvice__Group_1_1__0__Impl : ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) ) ;
    public final void rule__UtilizeAdvice__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2528:1: ( ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) ) )
            // InternalAspectLang.g:2529:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) )
            {
            // InternalAspectLang.g:2529:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) )
            // InternalAspectLang.g:2530:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_0()); 
            }
            // InternalAspectLang.g:2531:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 )
            // InternalAspectLang.g:2531:2: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0
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
    // InternalAspectLang.g:2541:1: rule__UtilizeAdvice__Group_1_1__1 : rule__UtilizeAdvice__Group_1_1__1__Impl ;
    public final void rule__UtilizeAdvice__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2545:1: ( rule__UtilizeAdvice__Group_1_1__1__Impl )
            // InternalAspectLang.g:2546:2: rule__UtilizeAdvice__Group_1_1__1__Impl
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
    // InternalAspectLang.g:2552:1: rule__UtilizeAdvice__Group_1_1__1__Impl : ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* ) ;
    public final void rule__UtilizeAdvice__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2556:1: ( ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* ) )
            // InternalAspectLang.g:2557:1: ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* )
            {
            // InternalAspectLang.g:2557:1: ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* )
            // InternalAspectLang.g:2558:1: ( rule__UtilizeAdvice__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1_1()); 
            }
            // InternalAspectLang.g:2559:1: ( rule__UtilizeAdvice__Group_1_1_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==40) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalAspectLang.g:2559:2: rule__UtilizeAdvice__Group_1_1_1__0
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
    // InternalAspectLang.g:2573:1: rule__UtilizeAdvice__Group_1_1_1__0 : rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1 ;
    public final void rule__UtilizeAdvice__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2577:1: ( rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1 )
            // InternalAspectLang.g:2578:2: rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1
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
    // InternalAspectLang.g:2585:1: rule__UtilizeAdvice__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__UtilizeAdvice__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2589:1: ( ( ',' ) )
            // InternalAspectLang.g:2590:1: ( ',' )
            {
            // InternalAspectLang.g:2590:1: ( ',' )
            // InternalAspectLang.g:2591:1: ','
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
    // InternalAspectLang.g:2604:1: rule__UtilizeAdvice__Group_1_1_1__1 : rule__UtilizeAdvice__Group_1_1_1__1__Impl ;
    public final void rule__UtilizeAdvice__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2608:1: ( rule__UtilizeAdvice__Group_1_1_1__1__Impl )
            // InternalAspectLang.g:2609:2: rule__UtilizeAdvice__Group_1_1_1__1__Impl
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
    // InternalAspectLang.g:2615:1: rule__UtilizeAdvice__Group_1_1_1__1__Impl : ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) ) ;
    public final void rule__UtilizeAdvice__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2619:1: ( ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) ) )
            // InternalAspectLang.g:2620:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) )
            {
            // InternalAspectLang.g:2620:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) )
            // InternalAspectLang.g:2621:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_1_1()); 
            }
            // InternalAspectLang.g:2622:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 )
            // InternalAspectLang.g:2622:2: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1
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
    // InternalAspectLang.g:2636:1: rule__Advice__Group__0 : rule__Advice__Group__0__Impl rule__Advice__Group__1 ;
    public final void rule__Advice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2640:1: ( rule__Advice__Group__0__Impl rule__Advice__Group__1 )
            // InternalAspectLang.g:2641:2: rule__Advice__Group__0__Impl rule__Advice__Group__1
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
    // InternalAspectLang.g:2648:1: rule__Advice__Group__0__Impl : ( 'advice' ) ;
    public final void rule__Advice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2652:1: ( ( 'advice' ) )
            // InternalAspectLang.g:2653:1: ( 'advice' )
            {
            // InternalAspectLang.g:2653:1: ( 'advice' )
            // InternalAspectLang.g:2654:1: 'advice'
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
    // InternalAspectLang.g:2667:1: rule__Advice__Group__1 : rule__Advice__Group__1__Impl rule__Advice__Group__2 ;
    public final void rule__Advice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2671:1: ( rule__Advice__Group__1__Impl rule__Advice__Group__2 )
            // InternalAspectLang.g:2672:2: rule__Advice__Group__1__Impl rule__Advice__Group__2
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
    // InternalAspectLang.g:2679:1: rule__Advice__Group__1__Impl : ( ( rule__Advice__NameAssignment_1 ) ) ;
    public final void rule__Advice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2683:1: ( ( ( rule__Advice__NameAssignment_1 ) ) )
            // InternalAspectLang.g:2684:1: ( ( rule__Advice__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:2684:1: ( ( rule__Advice__NameAssignment_1 ) )
            // InternalAspectLang.g:2685:1: ( rule__Advice__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:2686:1: ( rule__Advice__NameAssignment_1 )
            // InternalAspectLang.g:2686:2: rule__Advice__NameAssignment_1
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
    // InternalAspectLang.g:2696:1: rule__Advice__Group__2 : rule__Advice__Group__2__Impl rule__Advice__Group__3 ;
    public final void rule__Advice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2700:1: ( rule__Advice__Group__2__Impl rule__Advice__Group__3 )
            // InternalAspectLang.g:2701:2: rule__Advice__Group__2__Impl rule__Advice__Group__3
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
    // InternalAspectLang.g:2708:1: rule__Advice__Group__2__Impl : ( ( rule__Advice__Group_2__0 )? ) ;
    public final void rule__Advice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2712:1: ( ( ( rule__Advice__Group_2__0 )? ) )
            // InternalAspectLang.g:2713:1: ( ( rule__Advice__Group_2__0 )? )
            {
            // InternalAspectLang.g:2713:1: ( ( rule__Advice__Group_2__0 )? )
            // InternalAspectLang.g:2714:1: ( rule__Advice__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2()); 
            }
            // InternalAspectLang.g:2715:1: ( rule__Advice__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==41) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalAspectLang.g:2715:2: rule__Advice__Group_2__0
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
    // InternalAspectLang.g:2725:1: rule__Advice__Group__3 : rule__Advice__Group__3__Impl rule__Advice__Group__4 ;
    public final void rule__Advice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2729:1: ( rule__Advice__Group__3__Impl rule__Advice__Group__4 )
            // InternalAspectLang.g:2730:2: rule__Advice__Group__3__Impl rule__Advice__Group__4
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
    // InternalAspectLang.g:2737:1: rule__Advice__Group__3__Impl : ( '{' ) ;
    public final void rule__Advice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2741:1: ( ( '{' ) )
            // InternalAspectLang.g:2742:1: ( '{' )
            {
            // InternalAspectLang.g:2742:1: ( '{' )
            // InternalAspectLang.g:2743:1: '{'
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
    // InternalAspectLang.g:2756:1: rule__Advice__Group__4 : rule__Advice__Group__4__Impl rule__Advice__Group__5 ;
    public final void rule__Advice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2760:1: ( rule__Advice__Group__4__Impl rule__Advice__Group__5 )
            // InternalAspectLang.g:2761:2: rule__Advice__Group__4__Impl rule__Advice__Group__5
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
    // InternalAspectLang.g:2768:1: rule__Advice__Group__4__Impl : ( ( rule__Advice__CollectorsAssignment_4 )* ) ;
    public final void rule__Advice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2772:1: ( ( ( rule__Advice__CollectorsAssignment_4 )* ) )
            // InternalAspectLang.g:2773:1: ( ( rule__Advice__CollectorsAssignment_4 )* )
            {
            // InternalAspectLang.g:2773:1: ( ( rule__Advice__CollectorsAssignment_4 )* )
            // InternalAspectLang.g:2774:1: ( rule__Advice__CollectorsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getCollectorsAssignment_4()); 
            }
            // InternalAspectLang.g:2775:1: ( rule__Advice__CollectorsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=14 && LA25_0<=15)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalAspectLang.g:2775:2: rule__Advice__CollectorsAssignment_4
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
    // InternalAspectLang.g:2785:1: rule__Advice__Group__5 : rule__Advice__Group__5__Impl ;
    public final void rule__Advice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2789:1: ( rule__Advice__Group__5__Impl )
            // InternalAspectLang.g:2790:2: rule__Advice__Group__5__Impl
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
    // InternalAspectLang.g:2796:1: rule__Advice__Group__5__Impl : ( '}' ) ;
    public final void rule__Advice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2800:1: ( ( '}' ) )
            // InternalAspectLang.g:2801:1: ( '}' )
            {
            // InternalAspectLang.g:2801:1: ( '}' )
            // InternalAspectLang.g:2802:1: '}'
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
    // InternalAspectLang.g:2827:1: rule__Advice__Group_2__0 : rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1 ;
    public final void rule__Advice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2831:1: ( rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1 )
            // InternalAspectLang.g:2832:2: rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1
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
    // InternalAspectLang.g:2839:1: rule__Advice__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Advice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2843:1: ( ( '(' ) )
            // InternalAspectLang.g:2844:1: ( '(' )
            {
            // InternalAspectLang.g:2844:1: ( '(' )
            // InternalAspectLang.g:2845:1: '('
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
    // InternalAspectLang.g:2858:1: rule__Advice__Group_2__1 : rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2 ;
    public final void rule__Advice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2862:1: ( rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2 )
            // InternalAspectLang.g:2863:2: rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2
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
    // InternalAspectLang.g:2870:1: rule__Advice__Group_2__1__Impl : ( ( rule__Advice__Group_2_1__0 )? ) ;
    public final void rule__Advice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2874:1: ( ( ( rule__Advice__Group_2_1__0 )? ) )
            // InternalAspectLang.g:2875:1: ( ( rule__Advice__Group_2_1__0 )? )
            {
            // InternalAspectLang.g:2875:1: ( ( rule__Advice__Group_2_1__0 )? )
            // InternalAspectLang.g:2876:1: ( rule__Advice__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2_1()); 
            }
            // InternalAspectLang.g:2877:1: ( rule__Advice__Group_2_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalAspectLang.g:2877:2: rule__Advice__Group_2_1__0
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
    // InternalAspectLang.g:2887:1: rule__Advice__Group_2__2 : rule__Advice__Group_2__2__Impl ;
    public final void rule__Advice__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2891:1: ( rule__Advice__Group_2__2__Impl )
            // InternalAspectLang.g:2892:2: rule__Advice__Group_2__2__Impl
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
    // InternalAspectLang.g:2898:1: rule__Advice__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Advice__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2902:1: ( ( ')' ) )
            // InternalAspectLang.g:2903:1: ( ')' )
            {
            // InternalAspectLang.g:2903:1: ( ')' )
            // InternalAspectLang.g:2904:1: ')'
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
    // InternalAspectLang.g:2923:1: rule__Advice__Group_2_1__0 : rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1 ;
    public final void rule__Advice__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2927:1: ( rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1 )
            // InternalAspectLang.g:2928:2: rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1
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
    // InternalAspectLang.g:2935:1: rule__Advice__Group_2_1__0__Impl : ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) ) ;
    public final void rule__Advice__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2939:1: ( ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) ) )
            // InternalAspectLang.g:2940:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) )
            {
            // InternalAspectLang.g:2940:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) )
            // InternalAspectLang.g:2941:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_0()); 
            }
            // InternalAspectLang.g:2942:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 )
            // InternalAspectLang.g:2942:2: rule__Advice__ParameterDeclarationsAssignment_2_1_0
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
    // InternalAspectLang.g:2952:1: rule__Advice__Group_2_1__1 : rule__Advice__Group_2_1__1__Impl ;
    public final void rule__Advice__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2956:1: ( rule__Advice__Group_2_1__1__Impl )
            // InternalAspectLang.g:2957:2: rule__Advice__Group_2_1__1__Impl
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
    // InternalAspectLang.g:2963:1: rule__Advice__Group_2_1__1__Impl : ( ( rule__Advice__Group_2_1_1__0 )* ) ;
    public final void rule__Advice__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2967:1: ( ( ( rule__Advice__Group_2_1_1__0 )* ) )
            // InternalAspectLang.g:2968:1: ( ( rule__Advice__Group_2_1_1__0 )* )
            {
            // InternalAspectLang.g:2968:1: ( ( rule__Advice__Group_2_1_1__0 )* )
            // InternalAspectLang.g:2969:1: ( rule__Advice__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2_1_1()); 
            }
            // InternalAspectLang.g:2970:1: ( rule__Advice__Group_2_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalAspectLang.g:2970:2: rule__Advice__Group_2_1_1__0
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
    // InternalAspectLang.g:2984:1: rule__Advice__Group_2_1_1__0 : rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1 ;
    public final void rule__Advice__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2988:1: ( rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1 )
            // InternalAspectLang.g:2989:2: rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalAspectLang.g:2996:1: rule__Advice__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Advice__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3000:1: ( ( ',' ) )
            // InternalAspectLang.g:3001:1: ( ',' )
            {
            // InternalAspectLang.g:3001:1: ( ',' )
            // InternalAspectLang.g:3002:1: ','
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
    // InternalAspectLang.g:3015:1: rule__Advice__Group_2_1_1__1 : rule__Advice__Group_2_1_1__1__Impl ;
    public final void rule__Advice__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3019:1: ( rule__Advice__Group_2_1_1__1__Impl )
            // InternalAspectLang.g:3020:2: rule__Advice__Group_2_1_1__1__Impl
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
    // InternalAspectLang.g:3026:1: rule__Advice__Group_2_1_1__1__Impl : ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) ) ;
    public final void rule__Advice__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3030:1: ( ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) ) )
            // InternalAspectLang.g:3031:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) )
            {
            // InternalAspectLang.g:3031:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) )
            // InternalAspectLang.g:3032:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_1_1()); 
            }
            // InternalAspectLang.g:3033:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 )
            // InternalAspectLang.g:3033:2: rule__Advice__ParameterDeclarationsAssignment_2_1_1_1
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
    // InternalAspectLang.g:3047:1: rule__AdviceParameterDeclaration__Group__0 : rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1 ;
    public final void rule__AdviceParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3051:1: ( rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1 )
            // InternalAspectLang.g:3052:2: rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1
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
    // InternalAspectLang.g:3059:1: rule__AdviceParameterDeclaration__Group__0__Impl : ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__AdviceParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3063:1: ( ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) ) )
            // InternalAspectLang.g:3064:1: ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) )
            {
            // InternalAspectLang.g:3064:1: ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) )
            // InternalAspectLang.g:3065:1: ( rule__AdviceParameterDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getTypeAssignment_0()); 
            }
            // InternalAspectLang.g:3066:1: ( rule__AdviceParameterDeclaration__TypeAssignment_0 )
            // InternalAspectLang.g:3066:2: rule__AdviceParameterDeclaration__TypeAssignment_0
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
    // InternalAspectLang.g:3076:1: rule__AdviceParameterDeclaration__Group__1 : rule__AdviceParameterDeclaration__Group__1__Impl ;
    public final void rule__AdviceParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3080:1: ( rule__AdviceParameterDeclaration__Group__1__Impl )
            // InternalAspectLang.g:3081:2: rule__AdviceParameterDeclaration__Group__1__Impl
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
    // InternalAspectLang.g:3087:1: rule__AdviceParameterDeclaration__Group__1__Impl : ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__AdviceParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3091:1: ( ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) ) )
            // InternalAspectLang.g:3092:1: ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:3092:1: ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) )
            // InternalAspectLang.g:3093:1: ( rule__AdviceParameterDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:3094:1: ( rule__AdviceParameterDeclaration__NameAssignment_1 )
            // InternalAspectLang.g:3094:2: rule__AdviceParameterDeclaration__NameAssignment_1
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
    // InternalAspectLang.g:3108:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3112:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // InternalAspectLang.g:3113:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
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
    // InternalAspectLang.g:3120:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3124:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // InternalAspectLang.g:3125:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // InternalAspectLang.g:3125:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // InternalAspectLang.g:3126:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // InternalAspectLang.g:3127:1: ( rule__Collector__InsertionPointAssignment_0 )
            // InternalAspectLang.g:3127:2: rule__Collector__InsertionPointAssignment_0
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
    // InternalAspectLang.g:3137:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3141:1: ( rule__Collector__Group__1__Impl )
            // InternalAspectLang.g:3142:2: rule__Collector__Group__1__Impl
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
    // InternalAspectLang.g:3148:1: rule__Collector__Group__1__Impl : ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3152:1: ( ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) ) )
            // InternalAspectLang.g:3153:1: ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) )
            {
            // InternalAspectLang.g:3153:1: ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) )
            // InternalAspectLang.g:3154:1: ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* )
            {
            // InternalAspectLang.g:3154:1: ( ( rule__Collector__EventsAssignment_1 ) )
            // InternalAspectLang.g:3155:1: ( rule__Collector__EventsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }
            // InternalAspectLang.g:3156:1: ( rule__Collector__EventsAssignment_1 )
            // InternalAspectLang.g:3156:2: rule__Collector__EventsAssignment_1
            {
            pushFollow(FOLLOW_20);
            rule__Collector__EventsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }

            }

            // InternalAspectLang.g:3159:1: ( ( rule__Collector__EventsAssignment_1 )* )
            // InternalAspectLang.g:3160:1: ( rule__Collector__EventsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }
            // InternalAspectLang.g:3161:1: ( rule__Collector__EventsAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAspectLang.g:3161:2: rule__Collector__EventsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
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
    // InternalAspectLang.g:3176:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3180:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalAspectLang.g:3181:2: rule__Event__Group__0__Impl rule__Event__Group__1
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
    // InternalAspectLang.g:3188:1: rule__Event__Group__0__Impl : ( ( rule__Event__TypeAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3192:1: ( ( ( rule__Event__TypeAssignment_0 ) ) )
            // InternalAspectLang.g:3193:1: ( ( rule__Event__TypeAssignment_0 ) )
            {
            // InternalAspectLang.g:3193:1: ( ( rule__Event__TypeAssignment_0 ) )
            // InternalAspectLang.g:3194:1: ( rule__Event__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeAssignment_0()); 
            }
            // InternalAspectLang.g:3195:1: ( rule__Event__TypeAssignment_0 )
            // InternalAspectLang.g:3195:2: rule__Event__TypeAssignment_0
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
    // InternalAspectLang.g:3205:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3209:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalAspectLang.g:3210:2: rule__Event__Group__1__Impl rule__Event__Group__2
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
    // InternalAspectLang.g:3217:1: rule__Event__Group__1__Impl : ( '(' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3221:1: ( ( '(' ) )
            // InternalAspectLang.g:3222:1: ( '(' )
            {
            // InternalAspectLang.g:3222:1: ( '(' )
            // InternalAspectLang.g:3223:1: '('
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
    // InternalAspectLang.g:3236:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3240:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalAspectLang.g:3241:2: rule__Event__Group__2__Impl rule__Event__Group__3
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
    // InternalAspectLang.g:3248:1: rule__Event__Group__2__Impl : ( ( rule__Event__Group_2__0 )? ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3252:1: ( ( ( rule__Event__Group_2__0 )? ) )
            // InternalAspectLang.g:3253:1: ( ( rule__Event__Group_2__0 )? )
            {
            // InternalAspectLang.g:3253:1: ( ( rule__Event__Group_2__0 )? )
            // InternalAspectLang.g:3254:1: ( rule__Event__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2()); 
            }
            // InternalAspectLang.g:3255:1: ( rule__Event__Group_2__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||LA29_0==13||(LA29_0>=16 && LA29_0<=18)||(LA29_0>=46 && LA29_0<=47)||(LA29_0>=55 && LA29_0<=56)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalAspectLang.g:3255:2: rule__Event__Group_2__0
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
    // InternalAspectLang.g:3265:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3269:1: ( rule__Event__Group__3__Impl )
            // InternalAspectLang.g:3270:2: rule__Event__Group__3__Impl
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
    // InternalAspectLang.g:3276:1: rule__Event__Group__3__Impl : ( ')' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3280:1: ( ( ')' ) )
            // InternalAspectLang.g:3281:1: ( ')' )
            {
            // InternalAspectLang.g:3281:1: ( ')' )
            // InternalAspectLang.g:3282:1: ')'
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
    // InternalAspectLang.g:3303:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3307:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalAspectLang.g:3308:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
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
    // InternalAspectLang.g:3315:1: rule__Event__Group_2__0__Impl : ( ( rule__Event__InitializationsAssignment_2_0 ) ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3319:1: ( ( ( rule__Event__InitializationsAssignment_2_0 ) ) )
            // InternalAspectLang.g:3320:1: ( ( rule__Event__InitializationsAssignment_2_0 ) )
            {
            // InternalAspectLang.g:3320:1: ( ( rule__Event__InitializationsAssignment_2_0 ) )
            // InternalAspectLang.g:3321:1: ( rule__Event__InitializationsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsAssignment_2_0()); 
            }
            // InternalAspectLang.g:3322:1: ( rule__Event__InitializationsAssignment_2_0 )
            // InternalAspectLang.g:3322:2: rule__Event__InitializationsAssignment_2_0
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
    // InternalAspectLang.g:3332:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3336:1: ( rule__Event__Group_2__1__Impl )
            // InternalAspectLang.g:3337:2: rule__Event__Group_2__1__Impl
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
    // InternalAspectLang.g:3343:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__Group_2_1__0 )* ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3347:1: ( ( ( rule__Event__Group_2_1__0 )* ) )
            // InternalAspectLang.g:3348:1: ( ( rule__Event__Group_2_1__0 )* )
            {
            // InternalAspectLang.g:3348:1: ( ( rule__Event__Group_2_1__0 )* )
            // InternalAspectLang.g:3349:1: ( rule__Event__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2_1()); 
            }
            // InternalAspectLang.g:3350:1: ( rule__Event__Group_2_1__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==40) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalAspectLang.g:3350:2: rule__Event__Group_2_1__0
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
    // InternalAspectLang.g:3364:1: rule__Event__Group_2_1__0 : rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 ;
    public final void rule__Event__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3368:1: ( rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 )
            // InternalAspectLang.g:3369:2: rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1
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
    // InternalAspectLang.g:3376:1: rule__Event__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3380:1: ( ( ',' ) )
            // InternalAspectLang.g:3381:1: ( ',' )
            {
            // InternalAspectLang.g:3381:1: ( ',' )
            // InternalAspectLang.g:3382:1: ','
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
    // InternalAspectLang.g:3395:1: rule__Event__Group_2_1__1 : rule__Event__Group_2_1__1__Impl ;
    public final void rule__Event__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3399:1: ( rule__Event__Group_2_1__1__Impl )
            // InternalAspectLang.g:3400:2: rule__Event__Group_2_1__1__Impl
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
    // InternalAspectLang.g:3406:1: rule__Event__Group_2_1__1__Impl : ( ( rule__Event__InitializationsAssignment_2_1_1 ) ) ;
    public final void rule__Event__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3410:1: ( ( ( rule__Event__InitializationsAssignment_2_1_1 ) ) )
            // InternalAspectLang.g:3411:1: ( ( rule__Event__InitializationsAssignment_2_1_1 ) )
            {
            // InternalAspectLang.g:3411:1: ( ( rule__Event__InitializationsAssignment_2_1_1 ) )
            // InternalAspectLang.g:3412:1: ( rule__Event__InitializationsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsAssignment_2_1_1()); 
            }
            // InternalAspectLang.g:3413:1: ( rule__Event__InitializationsAssignment_2_1_1 )
            // InternalAspectLang.g:3413:2: rule__Event__InitializationsAssignment_2_1_1
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
    // InternalAspectLang.g:3427:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3431:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // InternalAspectLang.g:3432:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalAspectLang.g:3439:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 )? ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3443:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 )? ) )
            // InternalAspectLang.g:3444:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            {
            // InternalAspectLang.g:3444:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            // InternalAspectLang.g:3445:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // InternalAspectLang.g:3446:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID||LA31_0==13||(LA31_0>=55 && LA31_0<=56)) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalAspectLang.g:3446:2: rule__ReferenceValue__QueryAssignment_0
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
    // InternalAspectLang.g:3456:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3460:1: ( rule__ReferenceValue__Group__1__Impl )
            // InternalAspectLang.g:3461:2: rule__ReferenceValue__Group__1__Impl
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
    // InternalAspectLang.g:3467:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__PropertyAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3471:1: ( ( ( rule__ReferenceValue__PropertyAssignment_1 ) ) )
            // InternalAspectLang.g:3472:1: ( ( rule__ReferenceValue__PropertyAssignment_1 ) )
            {
            // InternalAspectLang.g:3472:1: ( ( rule__ReferenceValue__PropertyAssignment_1 ) )
            // InternalAspectLang.g:3473:1: ( rule__ReferenceValue__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getPropertyAssignment_1()); 
            }
            // InternalAspectLang.g:3474:1: ( rule__ReferenceValue__PropertyAssignment_1 )
            // InternalAspectLang.g:3474:2: rule__ReferenceValue__PropertyAssignment_1
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
    // InternalAspectLang.g:3488:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3492:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // InternalAspectLang.g:3493:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
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
    // InternalAspectLang.g:3500:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3504:1: ( ( '$' ) )
            // InternalAspectLang.g:3505:1: ( '$' )
            {
            // InternalAspectLang.g:3505:1: ( '$' )
            // InternalAspectLang.g:3506:1: '$'
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
    // InternalAspectLang.g:3519:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3523:1: ( rule__ReflectionProperty__Group__1__Impl )
            // InternalAspectLang.g:3524:2: rule__ReflectionProperty__Group__1__Impl
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
    // InternalAspectLang.g:3530:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3534:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // InternalAspectLang.g:3535:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // InternalAspectLang.g:3535:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // InternalAspectLang.g:3536:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // InternalAspectLang.g:3537:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // InternalAspectLang.g:3537:2: rule__ReflectionProperty__FunctionAssignment_1
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


    // $ANTLR start "rule__RuntimeProperty__Group__0"
    // InternalAspectLang.g:3551:1: rule__RuntimeProperty__Group__0 : rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 ;
    public final void rule__RuntimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3555:1: ( rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 )
            // InternalAspectLang.g:3556:2: rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalAspectLang.g:3563:1: rule__RuntimeProperty__Group__0__Impl : ( () ) ;
    public final void rule__RuntimeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3567:1: ( ( () ) )
            // InternalAspectLang.g:3568:1: ( () )
            {
            // InternalAspectLang.g:3568:1: ( () )
            // InternalAspectLang.g:3569:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getRuntimePropertyAction_0()); 
            }
            // InternalAspectLang.g:3570:1: ()
            // InternalAspectLang.g:3572:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyAccess().getRuntimePropertyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RuntimeProperty__Group__0__Impl"


    // $ANTLR start "rule__RuntimeProperty__Group__1"
    // InternalAspectLang.g:3582:1: rule__RuntimeProperty__Group__1 : rule__RuntimeProperty__Group__1__Impl ;
    public final void rule__RuntimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3586:1: ( rule__RuntimeProperty__Group__1__Impl )
            // InternalAspectLang.g:3587:2: rule__RuntimeProperty__Group__1__Impl
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
    // InternalAspectLang.g:3593:1: rule__RuntimeProperty__Group__1__Impl : ( '#' ) ;
    public final void rule__RuntimeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3597:1: ( ( '#' ) )
            // InternalAspectLang.g:3598:1: ( '#' )
            {
            // InternalAspectLang.g:3598:1: ( '#' )
            // InternalAspectLang.g:3599:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__AdviceParameter__Group__0"
    // InternalAspectLang.g:3616:1: rule__AdviceParameter__Group__0 : rule__AdviceParameter__Group__0__Impl rule__AdviceParameter__Group__1 ;
    public final void rule__AdviceParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3620:1: ( rule__AdviceParameter__Group__0__Impl rule__AdviceParameter__Group__1 )
            // InternalAspectLang.g:3621:2: rule__AdviceParameter__Group__0__Impl rule__AdviceParameter__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__AdviceParameter__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdviceParameter__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group__0"


    // $ANTLR start "rule__AdviceParameter__Group__0__Impl"
    // InternalAspectLang.g:3628:1: rule__AdviceParameter__Group__0__Impl : ( ( rule__AdviceParameter__DeclarationAssignment_0 ) ) ;
    public final void rule__AdviceParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3632:1: ( ( ( rule__AdviceParameter__DeclarationAssignment_0 ) ) )
            // InternalAspectLang.g:3633:1: ( ( rule__AdviceParameter__DeclarationAssignment_0 ) )
            {
            // InternalAspectLang.g:3633:1: ( ( rule__AdviceParameter__DeclarationAssignment_0 ) )
            // InternalAspectLang.g:3634:1: ( rule__AdviceParameter__DeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getDeclarationAssignment_0()); 
            }
            // InternalAspectLang.g:3635:1: ( rule__AdviceParameter__DeclarationAssignment_0 )
            // InternalAspectLang.g:3635:2: rule__AdviceParameter__DeclarationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameter__DeclarationAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getDeclarationAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group__0__Impl"


    // $ANTLR start "rule__AdviceParameter__Group__1"
    // InternalAspectLang.g:3645:1: rule__AdviceParameter__Group__1 : rule__AdviceParameter__Group__1__Impl ;
    public final void rule__AdviceParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3649:1: ( rule__AdviceParameter__Group__1__Impl )
            // InternalAspectLang.g:3650:2: rule__AdviceParameter__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameter__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group__1"


    // $ANTLR start "rule__AdviceParameter__Group__1__Impl"
    // InternalAspectLang.g:3656:1: rule__AdviceParameter__Group__1__Impl : ( ( rule__AdviceParameter__Group_1__0 )? ) ;
    public final void rule__AdviceParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3660:1: ( ( ( rule__AdviceParameter__Group_1__0 )? ) )
            // InternalAspectLang.g:3661:1: ( ( rule__AdviceParameter__Group_1__0 )? )
            {
            // InternalAspectLang.g:3661:1: ( ( rule__AdviceParameter__Group_1__0 )? )
            // InternalAspectLang.g:3662:1: ( rule__AdviceParameter__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:3663:1: ( rule__AdviceParameter__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAspectLang.g:3663:2: rule__AdviceParameter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AdviceParameter__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group__1__Impl"


    // $ANTLR start "rule__AdviceParameter__Group_1__0"
    // InternalAspectLang.g:3677:1: rule__AdviceParameter__Group_1__0 : rule__AdviceParameter__Group_1__0__Impl rule__AdviceParameter__Group_1__1 ;
    public final void rule__AdviceParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3681:1: ( rule__AdviceParameter__Group_1__0__Impl rule__AdviceParameter__Group_1__1 )
            // InternalAspectLang.g:3682:2: rule__AdviceParameter__Group_1__0__Impl rule__AdviceParameter__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__AdviceParameter__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdviceParameter__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group_1__0"


    // $ANTLR start "rule__AdviceParameter__Group_1__0__Impl"
    // InternalAspectLang.g:3689:1: rule__AdviceParameter__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AdviceParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3693:1: ( ( '[' ) )
            // InternalAspectLang.g:3694:1: ( '[' )
            {
            // InternalAspectLang.g:3694:1: ( '[' )
            // InternalAspectLang.g:3695:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group_1__0__Impl"


    // $ANTLR start "rule__AdviceParameter__Group_1__1"
    // InternalAspectLang.g:3708:1: rule__AdviceParameter__Group_1__1 : rule__AdviceParameter__Group_1__1__Impl rule__AdviceParameter__Group_1__2 ;
    public final void rule__AdviceParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3712:1: ( rule__AdviceParameter__Group_1__1__Impl rule__AdviceParameter__Group_1__2 )
            // InternalAspectLang.g:3713:2: rule__AdviceParameter__Group_1__1__Impl rule__AdviceParameter__Group_1__2
            {
            pushFollow(FOLLOW_25);
            rule__AdviceParameter__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AdviceParameter__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group_1__1"


    // $ANTLR start "rule__AdviceParameter__Group_1__1__Impl"
    // InternalAspectLang.g:3720:1: rule__AdviceParameter__Group_1__1__Impl : ( ( rule__AdviceParameter__CollectionAssignment_1_1 ) ) ;
    public final void rule__AdviceParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3724:1: ( ( ( rule__AdviceParameter__CollectionAssignment_1_1 ) ) )
            // InternalAspectLang.g:3725:1: ( ( rule__AdviceParameter__CollectionAssignment_1_1 ) )
            {
            // InternalAspectLang.g:3725:1: ( ( rule__AdviceParameter__CollectionAssignment_1_1 ) )
            // InternalAspectLang.g:3726:1: ( rule__AdviceParameter__CollectionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getCollectionAssignment_1_1()); 
            }
            // InternalAspectLang.g:3727:1: ( rule__AdviceParameter__CollectionAssignment_1_1 )
            // InternalAspectLang.g:3727:2: rule__AdviceParameter__CollectionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameter__CollectionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getCollectionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group_1__1__Impl"


    // $ANTLR start "rule__AdviceParameter__Group_1__2"
    // InternalAspectLang.g:3737:1: rule__AdviceParameter__Group_1__2 : rule__AdviceParameter__Group_1__2__Impl ;
    public final void rule__AdviceParameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3741:1: ( rule__AdviceParameter__Group_1__2__Impl )
            // InternalAspectLang.g:3742:2: rule__AdviceParameter__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AdviceParameter__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group_1__2"


    // $ANTLR start "rule__AdviceParameter__Group_1__2__Impl"
    // InternalAspectLang.g:3748:1: rule__AdviceParameter__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AdviceParameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3752:1: ( ( ']' ) )
            // InternalAspectLang.g:3753:1: ( ']' )
            {
            // InternalAspectLang.g:3753:1: ( ']' )
            // InternalAspectLang.g:3754:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getRightSquareBracketKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__Group_1__2__Impl"


    // $ANTLR start "rule__Pointcut__Group__0"
    // InternalAspectLang.g:3773:1: rule__Pointcut__Group__0 : rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 ;
    public final void rule__Pointcut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3777:1: ( rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 )
            // InternalAspectLang.g:3778:2: rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalAspectLang.g:3785:1: rule__Pointcut__Group__0__Impl : ( ( rule__Pointcut__AnnotationAssignment_0 )? ) ;
    public final void rule__Pointcut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3789:1: ( ( ( rule__Pointcut__AnnotationAssignment_0 )? ) )
            // InternalAspectLang.g:3790:1: ( ( rule__Pointcut__AnnotationAssignment_0 )? )
            {
            // InternalAspectLang.g:3790:1: ( ( rule__Pointcut__AnnotationAssignment_0 )? )
            // InternalAspectLang.g:3791:1: ( rule__Pointcut__AnnotationAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getAnnotationAssignment_0()); 
            }
            // InternalAspectLang.g:3792:1: ( rule__Pointcut__AnnotationAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==54) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAspectLang.g:3792:2: rule__Pointcut__AnnotationAssignment_0
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
    // InternalAspectLang.g:3802:1: rule__Pointcut__Group__1 : rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 ;
    public final void rule__Pointcut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3806:1: ( rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 )
            // InternalAspectLang.g:3807:2: rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2
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
    // InternalAspectLang.g:3814:1: rule__Pointcut__Group__1__Impl : ( 'pointcut' ) ;
    public final void rule__Pointcut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3818:1: ( ( 'pointcut' ) )
            // InternalAspectLang.g:3819:1: ( 'pointcut' )
            {
            // InternalAspectLang.g:3819:1: ( 'pointcut' )
            // InternalAspectLang.g:3820:1: 'pointcut'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getPointcutKeyword_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3833:1: rule__Pointcut__Group__2 : rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 ;
    public final void rule__Pointcut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3837:1: ( rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 )
            // InternalAspectLang.g:3838:2: rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalAspectLang.g:3845:1: rule__Pointcut__Group__2__Impl : ( ( rule__Pointcut__NameAssignment_2 ) ) ;
    public final void rule__Pointcut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3849:1: ( ( ( rule__Pointcut__NameAssignment_2 ) ) )
            // InternalAspectLang.g:3850:1: ( ( rule__Pointcut__NameAssignment_2 ) )
            {
            // InternalAspectLang.g:3850:1: ( ( rule__Pointcut__NameAssignment_2 ) )
            // InternalAspectLang.g:3851:1: ( rule__Pointcut__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getNameAssignment_2()); 
            }
            // InternalAspectLang.g:3852:1: ( rule__Pointcut__NameAssignment_2 )
            // InternalAspectLang.g:3852:2: rule__Pointcut__NameAssignment_2
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
    // InternalAspectLang.g:3862:1: rule__Pointcut__Group__3 : rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4 ;
    public final void rule__Pointcut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3866:1: ( rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4 )
            // InternalAspectLang.g:3867:2: rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalAspectLang.g:3874:1: rule__Pointcut__Group__3__Impl : ( 'class' ) ;
    public final void rule__Pointcut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3878:1: ( ( 'class' ) )
            // InternalAspectLang.g:3879:1: ( 'class' )
            {
            // InternalAspectLang.g:3879:1: ( 'class' )
            // InternalAspectLang.g:3880:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getClassKeyword_3()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3893:1: rule__Pointcut__Group__4 : rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5 ;
    public final void rule__Pointcut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3897:1: ( rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5 )
            // InternalAspectLang.g:3898:2: rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalAspectLang.g:3905:1: rule__Pointcut__Group__4__Impl : ( ( rule__Pointcut__ModelAssignment_4 ) ) ;
    public final void rule__Pointcut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3909:1: ( ( ( rule__Pointcut__ModelAssignment_4 ) ) )
            // InternalAspectLang.g:3910:1: ( ( rule__Pointcut__ModelAssignment_4 ) )
            {
            // InternalAspectLang.g:3910:1: ( ( rule__Pointcut__ModelAssignment_4 ) )
            // InternalAspectLang.g:3911:1: ( rule__Pointcut__ModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getModelAssignment_4()); 
            }
            // InternalAspectLang.g:3912:1: ( rule__Pointcut__ModelAssignment_4 )
            // InternalAspectLang.g:3912:2: rule__Pointcut__ModelAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__ModelAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getModelAssignment_4()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:3922:1: rule__Pointcut__Group__5 : rule__Pointcut__Group__5__Impl rule__Pointcut__Group__6 ;
    public final void rule__Pointcut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3926:1: ( rule__Pointcut__Group__5__Impl rule__Pointcut__Group__6 )
            // InternalAspectLang.g:3927:2: rule__Pointcut__Group__5__Impl rule__Pointcut__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__Pointcut__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAspectLang.g:3934:1: rule__Pointcut__Group__5__Impl : ( '.' ) ;
    public final void rule__Pointcut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3938:1: ( ( '.' ) )
            // InternalAspectLang.g:3939:1: ( '.' )
            {
            // InternalAspectLang.g:3939:1: ( '.' )
            // InternalAspectLang.g:3940:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getFullStopKeyword_5()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getFullStopKeyword_5()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Pointcut__Group__6"
    // InternalAspectLang.g:3953:1: rule__Pointcut__Group__6 : rule__Pointcut__Group__6__Impl rule__Pointcut__Group__7 ;
    public final void rule__Pointcut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3957:1: ( rule__Pointcut__Group__6__Impl rule__Pointcut__Group__7 )
            // InternalAspectLang.g:3958:2: rule__Pointcut__Group__6__Impl rule__Pointcut__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__Pointcut__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__6"


    // $ANTLR start "rule__Pointcut__Group__6__Impl"
    // InternalAspectLang.g:3965:1: rule__Pointcut__Group__6__Impl : ( ( rule__Pointcut__LocationAssignment_6 ) ) ;
    public final void rule__Pointcut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3969:1: ( ( ( rule__Pointcut__LocationAssignment_6 ) ) )
            // InternalAspectLang.g:3970:1: ( ( rule__Pointcut__LocationAssignment_6 ) )
            {
            // InternalAspectLang.g:3970:1: ( ( rule__Pointcut__LocationAssignment_6 ) )
            // InternalAspectLang.g:3971:1: ( rule__Pointcut__LocationAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getLocationAssignment_6()); 
            }
            // InternalAspectLang.g:3972:1: ( rule__Pointcut__LocationAssignment_6 )
            // InternalAspectLang.g:3972:2: rule__Pointcut__LocationAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__LocationAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getLocationAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__6__Impl"


    // $ANTLR start "rule__Pointcut__Group__7"
    // InternalAspectLang.g:3982:1: rule__Pointcut__Group__7 : rule__Pointcut__Group__7__Impl ;
    public final void rule__Pointcut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3986:1: ( rule__Pointcut__Group__7__Impl )
            // InternalAspectLang.g:3987:2: rule__Pointcut__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__7"


    // $ANTLR start "rule__Pointcut__Group__7__Impl"
    // InternalAspectLang.g:3993:1: rule__Pointcut__Group__7__Impl : ( ( rule__Pointcut__Group_7__0 )? ) ;
    public final void rule__Pointcut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3997:1: ( ( ( rule__Pointcut__Group_7__0 )? ) )
            // InternalAspectLang.g:3998:1: ( ( rule__Pointcut__Group_7__0 )? )
            {
            // InternalAspectLang.g:3998:1: ( ( rule__Pointcut__Group_7__0 )? )
            // InternalAspectLang.g:3999:1: ( rule__Pointcut__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup_7()); 
            }
            // InternalAspectLang.g:4000:1: ( rule__Pointcut__Group_7__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==53) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAspectLang.g:4000:2: rule__Pointcut__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pointcut__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group__7__Impl"


    // $ANTLR start "rule__Pointcut__Group_7__0"
    // InternalAspectLang.g:4026:1: rule__Pointcut__Group_7__0 : rule__Pointcut__Group_7__0__Impl rule__Pointcut__Group_7__1 ;
    public final void rule__Pointcut__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4030:1: ( rule__Pointcut__Group_7__0__Impl rule__Pointcut__Group_7__1 )
            // InternalAspectLang.g:4031:2: rule__Pointcut__Group_7__0__Impl rule__Pointcut__Group_7__1
            {
            pushFollow(FOLLOW_31);
            rule__Pointcut__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_7__0"


    // $ANTLR start "rule__Pointcut__Group_7__0__Impl"
    // InternalAspectLang.g:4038:1: rule__Pointcut__Group_7__0__Impl : ( 'operation' ) ;
    public final void rule__Pointcut__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4042:1: ( ( 'operation' ) )
            // InternalAspectLang.g:4043:1: ( 'operation' )
            {
            // InternalAspectLang.g:4043:1: ( 'operation' )
            // InternalAspectLang.g:4044:1: 'operation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationKeyword_7_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getOperationKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_7__0__Impl"


    // $ANTLR start "rule__Pointcut__Group_7__1"
    // InternalAspectLang.g:4057:1: rule__Pointcut__Group_7__1 : rule__Pointcut__Group_7__1__Impl ;
    public final void rule__Pointcut__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4061:1: ( rule__Pointcut__Group_7__1__Impl )
            // InternalAspectLang.g:4062:2: rule__Pointcut__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_7__1"


    // $ANTLR start "rule__Pointcut__Group_7__1__Impl"
    // InternalAspectLang.g:4068:1: rule__Pointcut__Group_7__1__Impl : ( ( rule__Pointcut__OperationAssignment_7_1 ) ) ;
    public final void rule__Pointcut__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4072:1: ( ( ( rule__Pointcut__OperationAssignment_7_1 ) ) )
            // InternalAspectLang.g:4073:1: ( ( rule__Pointcut__OperationAssignment_7_1 ) )
            {
            // InternalAspectLang.g:4073:1: ( ( rule__Pointcut__OperationAssignment_7_1 ) )
            // InternalAspectLang.g:4074:1: ( rule__Pointcut__OperationAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationAssignment_7_1()); 
            }
            // InternalAspectLang.g:4075:1: ( rule__Pointcut__OperationAssignment_7_1 )
            // InternalAspectLang.g:4075:2: rule__Pointcut__OperationAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Pointcut__OperationAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getOperationAssignment_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__Group_7__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalAspectLang.g:4089:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4093:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalAspectLang.g:4094:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
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
    // InternalAspectLang.g:4101:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4105:1: ( ( '@' ) )
            // InternalAspectLang.g:4106:1: ( '@' )
            {
            // InternalAspectLang.g:4106:1: ( '@' )
            // InternalAspectLang.g:4107:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4120:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4124:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalAspectLang.g:4125:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
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
    // InternalAspectLang.g:4132:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4136:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // InternalAspectLang.g:4137:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:4137:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // InternalAspectLang.g:4138:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:4139:1: ( rule__Annotation__NameAssignment_1 )
            // InternalAspectLang.g:4139:2: rule__Annotation__NameAssignment_1
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
    // InternalAspectLang.g:4149:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4153:1: ( rule__Annotation__Group__2__Impl )
            // InternalAspectLang.g:4154:2: rule__Annotation__Group__2__Impl
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
    // InternalAspectLang.g:4160:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__ValueAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4164:1: ( ( ( rule__Annotation__ValueAssignment_2 ) ) )
            // InternalAspectLang.g:4165:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            {
            // InternalAspectLang.g:4165:1: ( ( rule__Annotation__ValueAssignment_2 ) )
            // InternalAspectLang.g:4166:1: ( rule__Annotation__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getValueAssignment_2()); 
            }
            // InternalAspectLang.g:4167:1: ( rule__Annotation__ValueAssignment_2 )
            // InternalAspectLang.g:4167:2: rule__Annotation__ValueAssignment_2
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
    // InternalAspectLang.g:4183:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4187:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // InternalAspectLang.g:4188:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAspectLang.g:4195:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__NodeAssignment_0 ) ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4199:1: ( ( ( rule__LocationQuery__NodeAssignment_0 ) ) )
            // InternalAspectLang.g:4200:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            {
            // InternalAspectLang.g:4200:1: ( ( rule__LocationQuery__NodeAssignment_0 ) )
            // InternalAspectLang.g:4201:1: ( rule__LocationQuery__NodeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_0()); 
            }
            // InternalAspectLang.g:4202:1: ( rule__LocationQuery__NodeAssignment_0 )
            // InternalAspectLang.g:4202:2: rule__LocationQuery__NodeAssignment_0
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
    // InternalAspectLang.g:4212:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4216:1: ( rule__LocationQuery__Group__1__Impl )
            // InternalAspectLang.g:4217:2: rule__LocationQuery__Group__1__Impl
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
    // InternalAspectLang.g:4223:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__Alternatives_1 )? ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4227:1: ( ( ( rule__LocationQuery__Alternatives_1 )? ) )
            // InternalAspectLang.g:4228:1: ( ( rule__LocationQuery__Alternatives_1 )? )
            {
            // InternalAspectLang.g:4228:1: ( ( rule__LocationQuery__Alternatives_1 )? )
            // InternalAspectLang.g:4229:1: ( rule__LocationQuery__Alternatives_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getAlternatives_1()); 
            }
            // InternalAspectLang.g:4230:1: ( rule__LocationQuery__Alternatives_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=23 && LA35_0<=24)||LA35_0==44||LA35_0==52) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAspectLang.g:4230:2: rule__LocationQuery__Alternatives_1
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
    // InternalAspectLang.g:4244:1: rule__LocationQuery__Group_1_0__0 : rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1 ;
    public final void rule__LocationQuery__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4248:1: ( rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1 )
            // InternalAspectLang.g:4249:2: rule__LocationQuery__Group_1_0__0__Impl rule__LocationQuery__Group_1_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAspectLang.g:4256:1: rule__LocationQuery__Group_1_0__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4260:1: ( ( '.' ) )
            // InternalAspectLang.g:4261:1: ( '.' )
            {
            // InternalAspectLang.g:4261:1: ( '.' )
            // InternalAspectLang.g:4262:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_1_0_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4275:1: rule__LocationQuery__Group_1_0__1 : rule__LocationQuery__Group_1_0__1__Impl ;
    public final void rule__LocationQuery__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4279:1: ( rule__LocationQuery__Group_1_0__1__Impl )
            // InternalAspectLang.g:4280:2: rule__LocationQuery__Group_1_0__1__Impl
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
    // InternalAspectLang.g:4286:1: rule__LocationQuery__Group_1_0__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) ) ;
    public final void rule__LocationQuery__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4290:1: ( ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) ) )
            // InternalAspectLang.g:4291:1: ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) )
            {
            // InternalAspectLang.g:4291:1: ( ( rule__LocationQuery__SpecializationAssignment_1_0_1 ) )
            // InternalAspectLang.g:4292:1: ( rule__LocationQuery__SpecializationAssignment_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_1_0_1()); 
            }
            // InternalAspectLang.g:4293:1: ( rule__LocationQuery__SpecializationAssignment_1_0_1 )
            // InternalAspectLang.g:4293:2: rule__LocationQuery__SpecializationAssignment_1_0_1
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
    // InternalAspectLang.g:4307:1: rule__CompositionQuery__Group__0 : rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1 ;
    public final void rule__CompositionQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4311:1: ( rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1 )
            // InternalAspectLang.g:4312:2: rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAspectLang.g:4319:1: rule__CompositionQuery__Group__0__Impl : ( () ) ;
    public final void rule__CompositionQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4323:1: ( ( () ) )
            // InternalAspectLang.g:4324:1: ( () )
            {
            // InternalAspectLang.g:4324:1: ( () )
            // InternalAspectLang.g:4325:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getCompositionQueryAction_0()); 
            }
            // InternalAspectLang.g:4326:1: ()
            // InternalAspectLang.g:4328:1: 
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
    // InternalAspectLang.g:4338:1: rule__CompositionQuery__Group__1 : rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2 ;
    public final void rule__CompositionQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4342:1: ( rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2 )
            // InternalAspectLang.g:4343:2: rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalAspectLang.g:4350:1: rule__CompositionQuery__Group__1__Impl : ( ( rule__CompositionQuery__ModifierAssignment_1 )? ) ;
    public final void rule__CompositionQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4354:1: ( ( ( rule__CompositionQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:4355:1: ( ( rule__CompositionQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:4355:1: ( ( rule__CompositionQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:4356:1: ( rule__CompositionQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:4357:1: ( rule__CompositionQuery__ModifierAssignment_1 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=23 && LA36_0<=24)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAspectLang.g:4357:2: rule__CompositionQuery__ModifierAssignment_1
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
    // InternalAspectLang.g:4367:1: rule__CompositionQuery__Group__2 : rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3 ;
    public final void rule__CompositionQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4371:1: ( rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3 )
            // InternalAspectLang.g:4372:2: rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalAspectLang.g:4379:1: rule__CompositionQuery__Group__2__Impl : ( '{' ) ;
    public final void rule__CompositionQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4383:1: ( ( '{' ) )
            // InternalAspectLang.g:4384:1: ( '{' )
            {
            // InternalAspectLang.g:4384:1: ( '{' )
            // InternalAspectLang.g:4385:1: '{'
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
    // InternalAspectLang.g:4398:1: rule__CompositionQuery__Group__3 : rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4 ;
    public final void rule__CompositionQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4402:1: ( rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4 )
            // InternalAspectLang.g:4403:2: rule__CompositionQuery__Group__3__Impl rule__CompositionQuery__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalAspectLang.g:4410:1: rule__CompositionQuery__Group__3__Impl : ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* ) ;
    public final void rule__CompositionQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4414:1: ( ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* ) )
            // InternalAspectLang.g:4415:1: ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* )
            {
            // InternalAspectLang.g:4415:1: ( ( rule__CompositionQuery__SubQueriesAssignment_3 )* )
            // InternalAspectLang.g:4416:1: ( rule__CompositionQuery__SubQueriesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getSubQueriesAssignment_3()); 
            }
            // InternalAspectLang.g:4417:1: ( rule__CompositionQuery__SubQueriesAssignment_3 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_ID||LA37_0==13||(LA37_0>=55 && LA37_0<=56)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalAspectLang.g:4417:2: rule__CompositionQuery__SubQueriesAssignment_3
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__CompositionQuery__SubQueriesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalAspectLang.g:4427:1: rule__CompositionQuery__Group__4 : rule__CompositionQuery__Group__4__Impl ;
    public final void rule__CompositionQuery__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4431:1: ( rule__CompositionQuery__Group__4__Impl )
            // InternalAspectLang.g:4432:2: rule__CompositionQuery__Group__4__Impl
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
    // InternalAspectLang.g:4438:1: rule__CompositionQuery__Group__4__Impl : ( '}' ) ;
    public final void rule__CompositionQuery__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4442:1: ( ( '}' ) )
            // InternalAspectLang.g:4443:1: ( '}' )
            {
            // InternalAspectLang.g:4443:1: ( '}' )
            // InternalAspectLang.g:4444:1: '}'
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
    // InternalAspectLang.g:4467:1: rule__OperationQuery__Group__0 : rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 ;
    public final void rule__OperationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4471:1: ( rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 )
            // InternalAspectLang.g:4472:2: rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAspectLang.g:4479:1: rule__OperationQuery__Group__0__Impl : ( () ) ;
    public final void rule__OperationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4483:1: ( ( () ) )
            // InternalAspectLang.g:4484:1: ( () )
            {
            // InternalAspectLang.g:4484:1: ( () )
            // InternalAspectLang.g:4485:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationQueryAction_0()); 
            }
            // InternalAspectLang.g:4486:1: ()
            // InternalAspectLang.g:4488:1: 
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
    // InternalAspectLang.g:4498:1: rule__OperationQuery__Group__1 : rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 ;
    public final void rule__OperationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4502:1: ( rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 )
            // InternalAspectLang.g:4503:2: rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAspectLang.g:4510:1: rule__OperationQuery__Group__1__Impl : ( ( rule__OperationQuery__ModifierAssignment_1 )? ) ;
    public final void rule__OperationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4514:1: ( ( ( rule__OperationQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:4515:1: ( ( rule__OperationQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:4515:1: ( ( rule__OperationQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:4516:1: ( rule__OperationQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:4517:1: ( rule__OperationQuery__ModifierAssignment_1 )?
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
                    // InternalAspectLang.g:4517:2: rule__OperationQuery__ModifierAssignment_1
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
    // InternalAspectLang.g:4527:1: rule__OperationQuery__Group__2 : rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 ;
    public final void rule__OperationQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4531:1: ( rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 )
            // InternalAspectLang.g:4532:2: rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalAspectLang.g:4539:1: rule__OperationQuery__Group__2__Impl : ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? ) ;
    public final void rule__OperationQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4543:1: ( ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? ) )
            // InternalAspectLang.g:4544:1: ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? )
            {
            // InternalAspectLang.g:4544:1: ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? )
            // InternalAspectLang.g:4545:1: ( rule__OperationQuery__ReturnTypeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getReturnTypeAssignment_2()); 
            }
            // InternalAspectLang.g:4546:1: ( rule__OperationQuery__ReturnTypeAssignment_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==52) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalAspectLang.g:4546:2: rule__OperationQuery__ReturnTypeAssignment_2
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
    // InternalAspectLang.g:4556:1: rule__OperationQuery__Group__3 : rule__OperationQuery__Group__3__Impl ;
    public final void rule__OperationQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4560:1: ( rule__OperationQuery__Group__3__Impl )
            // InternalAspectLang.g:4561:2: rule__OperationQuery__Group__3__Impl
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
    // InternalAspectLang.g:4567:1: rule__OperationQuery__Group__3__Impl : ( ( rule__OperationQuery__Alternatives_3 ) ) ;
    public final void rule__OperationQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4571:1: ( ( ( rule__OperationQuery__Alternatives_3 ) ) )
            // InternalAspectLang.g:4572:1: ( ( rule__OperationQuery__Alternatives_3 ) )
            {
            // InternalAspectLang.g:4572:1: ( ( rule__OperationQuery__Alternatives_3 ) )
            // InternalAspectLang.g:4573:1: ( rule__OperationQuery__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getAlternatives_3()); 
            }
            // InternalAspectLang.g:4574:1: ( rule__OperationQuery__Alternatives_3 )
            // InternalAspectLang.g:4574:2: rule__OperationQuery__Alternatives_3
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
    // InternalAspectLang.g:4592:1: rule__OperationQuery__Group_3_0__0 : rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1 ;
    public final void rule__OperationQuery__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4596:1: ( rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1 )
            // InternalAspectLang.g:4597:2: rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1
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
    // InternalAspectLang.g:4604:1: rule__OperationQuery__Group_3_0__0__Impl : ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) ) ;
    public final void rule__OperationQuery__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4608:1: ( ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) ) )
            // InternalAspectLang.g:4609:1: ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) )
            {
            // InternalAspectLang.g:4609:1: ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) )
            // InternalAspectLang.g:4610:1: ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationReferenceAssignment_3_0_0()); 
            }
            // InternalAspectLang.g:4611:1: ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 )
            // InternalAspectLang.g:4611:2: rule__OperationQuery__OperationReferenceAssignment_3_0_0
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
    // InternalAspectLang.g:4621:1: rule__OperationQuery__Group_3_0__1 : rule__OperationQuery__Group_3_0__1__Impl ;
    public final void rule__OperationQuery__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4625:1: ( rule__OperationQuery__Group_3_0__1__Impl )
            // InternalAspectLang.g:4626:2: rule__OperationQuery__Group_3_0__1__Impl
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
    // InternalAspectLang.g:4632:1: rule__OperationQuery__Group_3_0__1__Impl : ( ( rule__OperationQuery__Group_3_0_1__0 )? ) ;
    public final void rule__OperationQuery__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4636:1: ( ( ( rule__OperationQuery__Group_3_0_1__0 )? ) )
            // InternalAspectLang.g:4637:1: ( ( rule__OperationQuery__Group_3_0_1__0 )? )
            {
            // InternalAspectLang.g:4637:1: ( ( rule__OperationQuery__Group_3_0_1__0 )? )
            // InternalAspectLang.g:4638:1: ( rule__OperationQuery__Group_3_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup_3_0_1()); 
            }
            // InternalAspectLang.g:4639:1: ( rule__OperationQuery__Group_3_0_1__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==41) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalAspectLang.g:4639:2: rule__OperationQuery__Group_3_0_1__0
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
    // InternalAspectLang.g:4653:1: rule__OperationQuery__Group_3_0_1__0 : rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1 ;
    public final void rule__OperationQuery__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4657:1: ( rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1 )
            // InternalAspectLang.g:4658:2: rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAspectLang.g:4665:1: rule__OperationQuery__Group_3_0_1__0__Impl : ( '(' ) ;
    public final void rule__OperationQuery__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4669:1: ( ( '(' ) )
            // InternalAspectLang.g:4670:1: ( '(' )
            {
            // InternalAspectLang.g:4670:1: ( '(' )
            // InternalAspectLang.g:4671:1: '('
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
    // InternalAspectLang.g:4684:1: rule__OperationQuery__Group_3_0_1__1 : rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2 ;
    public final void rule__OperationQuery__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4688:1: ( rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2 )
            // InternalAspectLang.g:4689:2: rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAspectLang.g:4696:1: rule__OperationQuery__Group_3_0_1__1__Impl : ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) ) ;
    public final void rule__OperationQuery__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4700:1: ( ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) ) )
            // InternalAspectLang.g:4701:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) )
            {
            // InternalAspectLang.g:4701:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) )
            // InternalAspectLang.g:4702:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_1()); 
            }
            // InternalAspectLang.g:4703:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 )
            // InternalAspectLang.g:4703:2: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1
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
    // InternalAspectLang.g:4713:1: rule__OperationQuery__Group_3_0_1__2 : rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3 ;
    public final void rule__OperationQuery__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4717:1: ( rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3 )
            // InternalAspectLang.g:4718:2: rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalAspectLang.g:4725:1: rule__OperationQuery__Group_3_0_1__2__Impl : ( ( rule__OperationQuery__Group_3_0_1_2__0 )* ) ;
    public final void rule__OperationQuery__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4729:1: ( ( ( rule__OperationQuery__Group_3_0_1_2__0 )* ) )
            // InternalAspectLang.g:4730:1: ( ( rule__OperationQuery__Group_3_0_1_2__0 )* )
            {
            // InternalAspectLang.g:4730:1: ( ( rule__OperationQuery__Group_3_0_1_2__0 )* )
            // InternalAspectLang.g:4731:1: ( rule__OperationQuery__Group_3_0_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup_3_0_1_2()); 
            }
            // InternalAspectLang.g:4732:1: ( rule__OperationQuery__Group_3_0_1_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==40) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalAspectLang.g:4732:2: rule__OperationQuery__Group_3_0_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OperationQuery__Group_3_0_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalAspectLang.g:4742:1: rule__OperationQuery__Group_3_0_1__3 : rule__OperationQuery__Group_3_0_1__3__Impl ;
    public final void rule__OperationQuery__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4746:1: ( rule__OperationQuery__Group_3_0_1__3__Impl )
            // InternalAspectLang.g:4747:2: rule__OperationQuery__Group_3_0_1__3__Impl
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
    // InternalAspectLang.g:4753:1: rule__OperationQuery__Group_3_0_1__3__Impl : ( ')' ) ;
    public final void rule__OperationQuery__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4757:1: ( ( ')' ) )
            // InternalAspectLang.g:4758:1: ( ')' )
            {
            // InternalAspectLang.g:4758:1: ( ')' )
            // InternalAspectLang.g:4759:1: ')'
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
    // InternalAspectLang.g:4780:1: rule__OperationQuery__Group_3_0_1_2__0 : rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1 ;
    public final void rule__OperationQuery__Group_3_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4784:1: ( rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1 )
            // InternalAspectLang.g:4785:2: rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAspectLang.g:4792:1: rule__OperationQuery__Group_3_0_1_2__0__Impl : ( ',' ) ;
    public final void rule__OperationQuery__Group_3_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4796:1: ( ( ',' ) )
            // InternalAspectLang.g:4797:1: ( ',' )
            {
            // InternalAspectLang.g:4797:1: ( ',' )
            // InternalAspectLang.g:4798:1: ','
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
    // InternalAspectLang.g:4811:1: rule__OperationQuery__Group_3_0_1_2__1 : rule__OperationQuery__Group_3_0_1_2__1__Impl ;
    public final void rule__OperationQuery__Group_3_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4815:1: ( rule__OperationQuery__Group_3_0_1_2__1__Impl )
            // InternalAspectLang.g:4816:2: rule__OperationQuery__Group_3_0_1_2__1__Impl
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
    // InternalAspectLang.g:4822:1: rule__OperationQuery__Group_3_0_1_2__1__Impl : ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) ) ;
    public final void rule__OperationQuery__Group_3_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4826:1: ( ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) ) )
            // InternalAspectLang.g:4827:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) )
            {
            // InternalAspectLang.g:4827:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) )
            // InternalAspectLang.g:4828:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_2_1()); 
            }
            // InternalAspectLang.g:4829:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 )
            // InternalAspectLang.g:4829:2: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1
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
    // InternalAspectLang.g:4843:1: rule__ParameterQuery__Group__0 : rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1 ;
    public final void rule__ParameterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4847:1: ( rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1 )
            // InternalAspectLang.g:4848:2: rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalAspectLang.g:4855:1: rule__ParameterQuery__Group__0__Impl : ( () ) ;
    public final void rule__ParameterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4859:1: ( ( () ) )
            // InternalAspectLang.g:4860:1: ( () )
            {
            // InternalAspectLang.g:4860:1: ( () )
            // InternalAspectLang.g:4861:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterQueryAction_0()); 
            }
            // InternalAspectLang.g:4862:1: ()
            // InternalAspectLang.g:4864:1: 
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
    // InternalAspectLang.g:4874:1: rule__ParameterQuery__Group__1 : rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2 ;
    public final void rule__ParameterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4878:1: ( rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2 )
            // InternalAspectLang.g:4879:2: rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalAspectLang.g:4886:1: rule__ParameterQuery__Group__1__Impl : ( ( rule__ParameterQuery__ModifierAssignment_1 )? ) ;
    public final void rule__ParameterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4890:1: ( ( ( rule__ParameterQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:4891:1: ( ( rule__ParameterQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:4891:1: ( ( rule__ParameterQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:4892:1: ( rule__ParameterQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:4893:1: ( rule__ParameterQuery__ModifierAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==RULE_ID||LA42_1==13) ) {
                    alt42=1;
                }
            }
            switch (alt42) {
                case 1 :
                    // InternalAspectLang.g:4893:2: rule__ParameterQuery__ModifierAssignment_1
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
    // InternalAspectLang.g:4903:1: rule__ParameterQuery__Group__2 : rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3 ;
    public final void rule__ParameterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4907:1: ( rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3 )
            // InternalAspectLang.g:4908:2: rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3
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
    // InternalAspectLang.g:4915:1: rule__ParameterQuery__Group__2__Impl : ( ( rule__ParameterQuery__Alternatives_2 ) ) ;
    public final void rule__ParameterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4919:1: ( ( ( rule__ParameterQuery__Alternatives_2 ) ) )
            // InternalAspectLang.g:4920:1: ( ( rule__ParameterQuery__Alternatives_2 ) )
            {
            // InternalAspectLang.g:4920:1: ( ( rule__ParameterQuery__Alternatives_2 ) )
            // InternalAspectLang.g:4921:1: ( rule__ParameterQuery__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getAlternatives_2()); 
            }
            // InternalAspectLang.g:4922:1: ( rule__ParameterQuery__Alternatives_2 )
            // InternalAspectLang.g:4922:2: rule__ParameterQuery__Alternatives_2
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
    // InternalAspectLang.g:4932:1: rule__ParameterQuery__Group__3 : rule__ParameterQuery__Group__3__Impl ;
    public final void rule__ParameterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4936:1: ( rule__ParameterQuery__Group__3__Impl )
            // InternalAspectLang.g:4937:2: rule__ParameterQuery__Group__3__Impl
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
    // InternalAspectLang.g:4943:1: rule__ParameterQuery__Group__3__Impl : ( ( rule__ParameterQuery__ParameterAssignment_3 )? ) ;
    public final void rule__ParameterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4947:1: ( ( ( rule__ParameterQuery__ParameterAssignment_3 )? ) )
            // InternalAspectLang.g:4948:1: ( ( rule__ParameterQuery__ParameterAssignment_3 )? )
            {
            // InternalAspectLang.g:4948:1: ( ( rule__ParameterQuery__ParameterAssignment_3 )? )
            // InternalAspectLang.g:4949:1: ( rule__ParameterQuery__ParameterAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterAssignment_3()); 
            }
            // InternalAspectLang.g:4950:1: ( rule__ParameterQuery__ParameterAssignment_3 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalAspectLang.g:4950:2: rule__ParameterQuery__ParameterAssignment_3
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
    // InternalAspectLang.g:4968:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4972:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalAspectLang.g:4973:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalAspectLang.g:4980:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4984:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // InternalAspectLang.g:4985:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // InternalAspectLang.g:4985:1: ( ( rule__Node__Alternatives_0 ) )
            // InternalAspectLang.g:4986:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // InternalAspectLang.g:4987:1: ( rule__Node__Alternatives_0 )
            // InternalAspectLang.g:4987:2: rule__Node__Alternatives_0
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
    // InternalAspectLang.g:4997:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5001:1: ( rule__Node__Group__1__Impl )
            // InternalAspectLang.g:5002:2: rule__Node__Group__1__Impl
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
    // InternalAspectLang.g:5008:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5012:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalAspectLang.g:5013:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalAspectLang.g:5013:1: ( ( rule__Node__Group_1__0 )? )
            // InternalAspectLang.g:5014:1: ( rule__Node__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5015:1: ( rule__Node__Group_1__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==48) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAspectLang.g:5015:2: rule__Node__Group_1__0
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
    // InternalAspectLang.g:5029:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5033:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalAspectLang.g:5034:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAspectLang.g:5041:1: rule__Node__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5045:1: ( ( '[' ) )
            // InternalAspectLang.g:5046:1: ( '[' )
            {
            // InternalAspectLang.g:5046:1: ( '[' )
            // InternalAspectLang.g:5047:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5060:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl rule__Node__Group_1__2 ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5064:1: ( rule__Node__Group_1__1__Impl rule__Node__Group_1__2 )
            // InternalAspectLang.g:5065:2: rule__Node__Group_1__1__Impl rule__Node__Group_1__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalAspectLang.g:5072:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__ConstraintAssignment_1_1 ) ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5076:1: ( ( ( rule__Node__ConstraintAssignment_1_1 ) ) )
            // InternalAspectLang.g:5077:1: ( ( rule__Node__ConstraintAssignment_1_1 ) )
            {
            // InternalAspectLang.g:5077:1: ( ( rule__Node__ConstraintAssignment_1_1 ) )
            // InternalAspectLang.g:5078:1: ( rule__Node__ConstraintAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getConstraintAssignment_1_1()); 
            }
            // InternalAspectLang.g:5079:1: ( rule__Node__ConstraintAssignment_1_1 )
            // InternalAspectLang.g:5079:2: rule__Node__ConstraintAssignment_1_1
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
    // InternalAspectLang.g:5089:1: rule__Node__Group_1__2 : rule__Node__Group_1__2__Impl ;
    public final void rule__Node__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5093:1: ( rule__Node__Group_1__2__Impl )
            // InternalAspectLang.g:5094:2: rule__Node__Group_1__2__Impl
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
    // InternalAspectLang.g:5100:1: rule__Node__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Node__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5104:1: ( ( ']' ) )
            // InternalAspectLang.g:5105:1: ( ']' )
            {
            // InternalAspectLang.g:5105:1: ( ']' )
            // InternalAspectLang.g:5106:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5125:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5129:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // InternalAspectLang.g:5130:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAspectLang.g:5137:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5141:1: ( ( () ) )
            // InternalAspectLang.g:5142:1: ( () )
            {
            // InternalAspectLang.g:5142:1: ( () )
            // InternalAspectLang.g:5143:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }
            // InternalAspectLang.g:5144:1: ()
            // InternalAspectLang.g:5146:1: 
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
    // InternalAspectLang.g:5156:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5160:1: ( rule__WildcardNode__Group__1__Impl )
            // InternalAspectLang.g:5161:2: rule__WildcardNode__Group__1__Impl
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
    // InternalAspectLang.g:5167:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5171:1: ( ( '*' ) )
            // InternalAspectLang.g:5172:1: ( '*' )
            {
            // InternalAspectLang.g:5172:1: ( '*' )
            // InternalAspectLang.g:5173:1: '*'
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
    // InternalAspectLang.g:5190:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5194:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // InternalAspectLang.g:5195:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
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
    // InternalAspectLang.g:5202:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5206:1: ( ( () ) )
            // InternalAspectLang.g:5207:1: ( () )
            {
            // InternalAspectLang.g:5207:1: ( () )
            // InternalAspectLang.g:5208:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // InternalAspectLang.g:5209:1: ()
            // InternalAspectLang.g:5211:1: 
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
    // InternalAspectLang.g:5221:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5225:1: ( rule__SubPathNode__Group__1__Impl )
            // InternalAspectLang.g:5226:2: rule__SubPathNode__Group__1__Impl
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
    // InternalAspectLang.g:5232:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5236:1: ( ( '**' ) )
            // InternalAspectLang.g:5237:1: ( '**' )
            {
            // InternalAspectLang.g:5237:1: ( '**' )
            // InternalAspectLang.g:5238:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5255:1: rule__ParentNode__Group__0 : rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 ;
    public final void rule__ParentNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5259:1: ( rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 )
            // InternalAspectLang.g:5260:2: rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1
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
    // InternalAspectLang.g:5267:1: rule__ParentNode__Group__0__Impl : ( () ) ;
    public final void rule__ParentNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5271:1: ( ( () ) )
            // InternalAspectLang.g:5272:1: ( () )
            {
            // InternalAspectLang.g:5272:1: ( () )
            // InternalAspectLang.g:5273:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getParentNodeAction_0()); 
            }
            // InternalAspectLang.g:5274:1: ()
            // InternalAspectLang.g:5276:1: 
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
    // InternalAspectLang.g:5286:1: rule__ParentNode__Group__1 : rule__ParentNode__Group__1__Impl ;
    public final void rule__ParentNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5290:1: ( rule__ParentNode__Group__1__Impl )
            // InternalAspectLang.g:5291:2: rule__ParentNode__Group__1__Impl
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
    // InternalAspectLang.g:5297:1: rule__ParentNode__Group__1__Impl : ( 'up' ) ;
    public final void rule__ParentNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5301:1: ( ( 'up' ) )
            // InternalAspectLang.g:5302:1: ( 'up' )
            {
            // InternalAspectLang.g:5302:1: ( 'up' )
            // InternalAspectLang.g:5303:1: 'up'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getUpKeyword_1()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5320:1: rule__PropertyConstraint__Group__0 : rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 ;
    public final void rule__PropertyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5324:1: ( rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 )
            // InternalAspectLang.g:5325:2: rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAspectLang.g:5332:1: rule__PropertyConstraint__Group__0__Impl : ( rulePropertyConstraintCompare ) ;
    public final void rule__PropertyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5336:1: ( ( rulePropertyConstraintCompare ) )
            // InternalAspectLang.g:5337:1: ( rulePropertyConstraintCompare )
            {
            // InternalAspectLang.g:5337:1: ( rulePropertyConstraintCompare )
            // InternalAspectLang.g:5338:1: rulePropertyConstraintCompare
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
    // InternalAspectLang.g:5349:1: rule__PropertyConstraint__Group__1 : rule__PropertyConstraint__Group__1__Impl ;
    public final void rule__PropertyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5353:1: ( rule__PropertyConstraint__Group__1__Impl )
            // InternalAspectLang.g:5354:2: rule__PropertyConstraint__Group__1__Impl
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
    // InternalAspectLang.g:5360:1: rule__PropertyConstraint__Group__1__Impl : ( ( rule__PropertyConstraint__Group_1__0 )? ) ;
    public final void rule__PropertyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5364:1: ( ( ( rule__PropertyConstraint__Group_1__0 )? ) )
            // InternalAspectLang.g:5365:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            {
            // InternalAspectLang.g:5365:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            // InternalAspectLang.g:5366:1: ( rule__PropertyConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5367:1: ( rule__PropertyConstraint__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=25 && LA45_0<=26)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAspectLang.g:5367:2: rule__PropertyConstraint__Group_1__0
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
    // InternalAspectLang.g:5381:1: rule__PropertyConstraint__Group_1__0 : rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 ;
    public final void rule__PropertyConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5385:1: ( rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 )
            // InternalAspectLang.g:5386:2: rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAspectLang.g:5393:1: rule__PropertyConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__PropertyConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5397:1: ( ( () ) )
            // InternalAspectLang.g:5398:1: ( () )
            {
            // InternalAspectLang.g:5398:1: ( () )
            // InternalAspectLang.g:5399:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0()); 
            }
            // InternalAspectLang.g:5400:1: ()
            // InternalAspectLang.g:5402:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0()); 
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
    // InternalAspectLang.g:5412:1: rule__PropertyConstraint__Group_1__1 : rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2 ;
    public final void rule__PropertyConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5416:1: ( rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2 )
            // InternalAspectLang.g:5417:2: rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAspectLang.g:5424:1: rule__PropertyConstraint__Group_1__1__Impl : ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) ) ;
    public final void rule__PropertyConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5428:1: ( ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) ) )
            // InternalAspectLang.g:5429:1: ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) )
            {
            // InternalAspectLang.g:5429:1: ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) )
            // InternalAspectLang.g:5430:1: ( rule__PropertyConstraint__LogicAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getLogicAssignment_1_1()); 
            }
            // InternalAspectLang.g:5431:1: ( rule__PropertyConstraint__LogicAssignment_1_1 )
            // InternalAspectLang.g:5431:2: rule__PropertyConstraint__LogicAssignment_1_1
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
    // InternalAspectLang.g:5441:1: rule__PropertyConstraint__Group_1__2 : rule__PropertyConstraint__Group_1__2__Impl ;
    public final void rule__PropertyConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5445:1: ( rule__PropertyConstraint__Group_1__2__Impl )
            // InternalAspectLang.g:5446:2: rule__PropertyConstraint__Group_1__2__Impl
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
    // InternalAspectLang.g:5452:1: rule__PropertyConstraint__Group_1__2__Impl : ( ( rule__PropertyConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__PropertyConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5456:1: ( ( ( rule__PropertyConstraint__RightAssignment_1_2 ) ) )
            // InternalAspectLang.g:5457:1: ( ( rule__PropertyConstraint__RightAssignment_1_2 ) )
            {
            // InternalAspectLang.g:5457:1: ( ( rule__PropertyConstraint__RightAssignment_1_2 ) )
            // InternalAspectLang.g:5458:1: ( rule__PropertyConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalAspectLang.g:5459:1: ( rule__PropertyConstraint__RightAssignment_1_2 )
            // InternalAspectLang.g:5459:2: rule__PropertyConstraint__RightAssignment_1_2
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
    // InternalAspectLang.g:5475:1: rule__PropertyConstraintCompare__Group__0 : rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1 ;
    public final void rule__PropertyConstraintCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5479:1: ( rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1 )
            // InternalAspectLang.g:5480:2: rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAspectLang.g:5487:1: rule__PropertyConstraintCompare__Group__0__Impl : ( ruleConstraintElement ) ;
    public final void rule__PropertyConstraintCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5491:1: ( ( ruleConstraintElement ) )
            // InternalAspectLang.g:5492:1: ( ruleConstraintElement )
            {
            // InternalAspectLang.g:5492:1: ( ruleConstraintElement )
            // InternalAspectLang.g:5493:1: ruleConstraintElement
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
    // InternalAspectLang.g:5504:1: rule__PropertyConstraintCompare__Group__1 : rule__PropertyConstraintCompare__Group__1__Impl ;
    public final void rule__PropertyConstraintCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5508:1: ( rule__PropertyConstraintCompare__Group__1__Impl )
            // InternalAspectLang.g:5509:2: rule__PropertyConstraintCompare__Group__1__Impl
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
    // InternalAspectLang.g:5515:1: rule__PropertyConstraintCompare__Group__1__Impl : ( ( rule__PropertyConstraintCompare__Group_1__0 )? ) ;
    public final void rule__PropertyConstraintCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5519:1: ( ( ( rule__PropertyConstraintCompare__Group_1__0 )? ) )
            // InternalAspectLang.g:5520:1: ( ( rule__PropertyConstraintCompare__Group_1__0 )? )
            {
            // InternalAspectLang.g:5520:1: ( ( rule__PropertyConstraintCompare__Group_1__0 )? )
            // InternalAspectLang.g:5521:1: ( rule__PropertyConstraintCompare__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5522:1: ( rule__PropertyConstraintCompare__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=27 && LA46_0<=33)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAspectLang.g:5522:2: rule__PropertyConstraintCompare__Group_1__0
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
    // InternalAspectLang.g:5536:1: rule__PropertyConstraintCompare__Group_1__0 : rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1 ;
    public final void rule__PropertyConstraintCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5540:1: ( rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1 )
            // InternalAspectLang.g:5541:2: rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAspectLang.g:5548:1: rule__PropertyConstraintCompare__Group_1__0__Impl : ( () ) ;
    public final void rule__PropertyConstraintCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5552:1: ( ( () ) )
            // InternalAspectLang.g:5553:1: ( () )
            {
            // InternalAspectLang.g:5553:1: ( () )
            // InternalAspectLang.g:5554:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getPropertyConstraintCompareLeftAction_1_0()); 
            }
            // InternalAspectLang.g:5555:1: ()
            // InternalAspectLang.g:5557:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyConstraintCompareAccess().getPropertyConstraintCompareLeftAction_1_0()); 
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
    // InternalAspectLang.g:5567:1: rule__PropertyConstraintCompare__Group_1__1 : rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2 ;
    public final void rule__PropertyConstraintCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5571:1: ( rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2 )
            // InternalAspectLang.g:5572:2: rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalAspectLang.g:5579:1: rule__PropertyConstraintCompare__Group_1__1__Impl : ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) ) ;
    public final void rule__PropertyConstraintCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5583:1: ( ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) ) )
            // InternalAspectLang.g:5584:1: ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) )
            {
            // InternalAspectLang.g:5584:1: ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) )
            // InternalAspectLang.g:5585:1: ( rule__PropertyConstraintCompare__CompareAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getCompareAssignment_1_1()); 
            }
            // InternalAspectLang.g:5586:1: ( rule__PropertyConstraintCompare__CompareAssignment_1_1 )
            // InternalAspectLang.g:5586:2: rule__PropertyConstraintCompare__CompareAssignment_1_1
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
    // InternalAspectLang.g:5596:1: rule__PropertyConstraintCompare__Group_1__2 : rule__PropertyConstraintCompare__Group_1__2__Impl ;
    public final void rule__PropertyConstraintCompare__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5600:1: ( rule__PropertyConstraintCompare__Group_1__2__Impl )
            // InternalAspectLang.g:5601:2: rule__PropertyConstraintCompare__Group_1__2__Impl
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
    // InternalAspectLang.g:5607:1: rule__PropertyConstraintCompare__Group_1__2__Impl : ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) ) ;
    public final void rule__PropertyConstraintCompare__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5611:1: ( ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) ) )
            // InternalAspectLang.g:5612:1: ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) )
            {
            // InternalAspectLang.g:5612:1: ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) )
            // InternalAspectLang.g:5613:1: ( rule__PropertyConstraintCompare__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getRightAssignment_1_2()); 
            }
            // InternalAspectLang.g:5614:1: ( rule__PropertyConstraintCompare__RightAssignment_1_2 )
            // InternalAspectLang.g:5614:2: rule__PropertyConstraintCompare__RightAssignment_1_2
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
    // InternalAspectLang.g:5630:1: rule__LocalQuery__Group__0 : rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1 ;
    public final void rule__LocalQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5634:1: ( rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1 )
            // InternalAspectLang.g:5635:2: rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalAspectLang.g:5642:1: rule__LocalQuery__Group__0__Impl : ( ( rule__LocalQuery__LocationQueryAssignment_0 )? ) ;
    public final void rule__LocalQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5646:1: ( ( ( rule__LocalQuery__LocationQueryAssignment_0 )? ) )
            // InternalAspectLang.g:5647:1: ( ( rule__LocalQuery__LocationQueryAssignment_0 )? )
            {
            // InternalAspectLang.g:5647:1: ( ( rule__LocalQuery__LocationQueryAssignment_0 )? )
            // InternalAspectLang.g:5648:1: ( rule__LocalQuery__LocationQueryAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getLocationQueryAssignment_0()); 
            }
            // InternalAspectLang.g:5649:1: ( rule__LocalQuery__LocationQueryAssignment_0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ID||LA47_0==13||(LA47_0>=55 && LA47_0<=56)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAspectLang.g:5649:2: rule__LocalQuery__LocationQueryAssignment_0
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
    // InternalAspectLang.g:5659:1: rule__LocalQuery__Group__1 : rule__LocalQuery__Group__1__Impl ;
    public final void rule__LocalQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5663:1: ( rule__LocalQuery__Group__1__Impl )
            // InternalAspectLang.g:5664:2: rule__LocalQuery__Group__1__Impl
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
    // InternalAspectLang.g:5670:1: rule__LocalQuery__Group__1__Impl : ( ( rule__LocalQuery__Alternatives_1 ) ) ;
    public final void rule__LocalQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5674:1: ( ( ( rule__LocalQuery__Alternatives_1 ) ) )
            // InternalAspectLang.g:5675:1: ( ( rule__LocalQuery__Alternatives_1 ) )
            {
            // InternalAspectLang.g:5675:1: ( ( rule__LocalQuery__Alternatives_1 ) )
            // InternalAspectLang.g:5676:1: ( rule__LocalQuery__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getAlternatives_1()); 
            }
            // InternalAspectLang.g:5677:1: ( rule__LocalQuery__Alternatives_1 )
            // InternalAspectLang.g:5677:2: rule__LocalQuery__Alternatives_1
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
    // InternalAspectLang.g:5691:1: rule__ModelProperty__Group__0 : rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 ;
    public final void rule__ModelProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5695:1: ( rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 )
            // InternalAspectLang.g:5696:2: rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1
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
    // InternalAspectLang.g:5703:1: rule__ModelProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__ModelProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5707:1: ( ( '#' ) )
            // InternalAspectLang.g:5708:1: ( '#' )
            {
            // InternalAspectLang.g:5708:1: ( '#' )
            // InternalAspectLang.g:5709:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5722:1: rule__ModelProperty__Group__1 : rule__ModelProperty__Group__1__Impl ;
    public final void rule__ModelProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5726:1: ( rule__ModelProperty__Group__1__Impl )
            // InternalAspectLang.g:5727:2: rule__ModelProperty__Group__1__Impl
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
    // InternalAspectLang.g:5733:1: rule__ModelProperty__Group__1__Impl : ( ( rule__ModelProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__ModelProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5737:1: ( ( ( rule__ModelProperty__ReferenceAssignment_1 ) ) )
            // InternalAspectLang.g:5738:1: ( ( rule__ModelProperty__ReferenceAssignment_1 ) )
            {
            // InternalAspectLang.g:5738:1: ( ( rule__ModelProperty__ReferenceAssignment_1 ) )
            // InternalAspectLang.g:5739:1: ( rule__ModelProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getReferenceAssignment_1()); 
            }
            // InternalAspectLang.g:5740:1: ( rule__ModelProperty__ReferenceAssignment_1 )
            // InternalAspectLang.g:5740:2: rule__ModelProperty__ReferenceAssignment_1
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
    // InternalAspectLang.g:5754:1: rule__Typeof__Group__0 : rule__Typeof__Group__0__Impl rule__Typeof__Group__1 ;
    public final void rule__Typeof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5758:1: ( rule__Typeof__Group__0__Impl rule__Typeof__Group__1 )
            // InternalAspectLang.g:5759:2: rule__Typeof__Group__0__Impl rule__Typeof__Group__1
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
    // InternalAspectLang.g:5766:1: rule__Typeof__Group__0__Impl : ( 'istypeof' ) ;
    public final void rule__Typeof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5770:1: ( ( 'istypeof' ) )
            // InternalAspectLang.g:5771:1: ( 'istypeof' )
            {
            // InternalAspectLang.g:5771:1: ( 'istypeof' )
            // InternalAspectLang.g:5772:1: 'istypeof'
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
    // InternalAspectLang.g:5785:1: rule__Typeof__Group__1 : rule__Typeof__Group__1__Impl rule__Typeof__Group__2 ;
    public final void rule__Typeof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5789:1: ( rule__Typeof__Group__1__Impl rule__Typeof__Group__2 )
            // InternalAspectLang.g:5790:2: rule__Typeof__Group__1__Impl rule__Typeof__Group__2
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
    // InternalAspectLang.g:5797:1: rule__Typeof__Group__1__Impl : ( '(' ) ;
    public final void rule__Typeof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5801:1: ( ( '(' ) )
            // InternalAspectLang.g:5802:1: ( '(' )
            {
            // InternalAspectLang.g:5802:1: ( '(' )
            // InternalAspectLang.g:5803:1: '('
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
    // InternalAspectLang.g:5816:1: rule__Typeof__Group__2 : rule__Typeof__Group__2__Impl rule__Typeof__Group__3 ;
    public final void rule__Typeof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5820:1: ( rule__Typeof__Group__2__Impl rule__Typeof__Group__3 )
            // InternalAspectLang.g:5821:2: rule__Typeof__Group__2__Impl rule__Typeof__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalAspectLang.g:5828:1: rule__Typeof__Group__2__Impl : ( ( rule__Typeof__ReferenceAssignment_2 ) ) ;
    public final void rule__Typeof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5832:1: ( ( ( rule__Typeof__ReferenceAssignment_2 ) ) )
            // InternalAspectLang.g:5833:1: ( ( rule__Typeof__ReferenceAssignment_2 ) )
            {
            // InternalAspectLang.g:5833:1: ( ( rule__Typeof__ReferenceAssignment_2 ) )
            // InternalAspectLang.g:5834:1: ( rule__Typeof__ReferenceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getReferenceAssignment_2()); 
            }
            // InternalAspectLang.g:5835:1: ( rule__Typeof__ReferenceAssignment_2 )
            // InternalAspectLang.g:5835:2: rule__Typeof__ReferenceAssignment_2
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
    // InternalAspectLang.g:5845:1: rule__Typeof__Group__3 : rule__Typeof__Group__3__Impl ;
    public final void rule__Typeof__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5849:1: ( rule__Typeof__Group__3__Impl )
            // InternalAspectLang.g:5850:2: rule__Typeof__Group__3__Impl
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
    // InternalAspectLang.g:5856:1: rule__Typeof__Group__3__Impl : ( ')' ) ;
    public final void rule__Typeof__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5860:1: ( ( ')' ) )
            // InternalAspectLang.g:5861:1: ( ')' )
            {
            // InternalAspectLang.g:5861:1: ( ')' )
            // InternalAspectLang.g:5862:1: ')'
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


    // $ANTLR start "rule__TypeReference__Group__0"
    // InternalAspectLang.g:5883:1: rule__TypeReference__Group__0 : rule__TypeReference__Group__0__Impl rule__TypeReference__Group__1 ;
    public final void rule__TypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5887:1: ( rule__TypeReference__Group__0__Impl rule__TypeReference__Group__1 )
            // InternalAspectLang.g:5888:2: rule__TypeReference__Group__0__Impl rule__TypeReference__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__TypeReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group__0"


    // $ANTLR start "rule__TypeReference__Group__0__Impl"
    // InternalAspectLang.g:5895:1: rule__TypeReference__Group__0__Impl : ( ( rule__TypeReference__ContextAssignment_0 ) ) ;
    public final void rule__TypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5899:1: ( ( ( rule__TypeReference__ContextAssignment_0 ) ) )
            // InternalAspectLang.g:5900:1: ( ( rule__TypeReference__ContextAssignment_0 ) )
            {
            // InternalAspectLang.g:5900:1: ( ( rule__TypeReference__ContextAssignment_0 ) )
            // InternalAspectLang.g:5901:1: ( rule__TypeReference__ContextAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getContextAssignment_0()); 
            }
            // InternalAspectLang.g:5902:1: ( rule__TypeReference__ContextAssignment_0 )
            // InternalAspectLang.g:5902:2: rule__TypeReference__ContextAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__ContextAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getContextAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group__0__Impl"


    // $ANTLR start "rule__TypeReference__Group__1"
    // InternalAspectLang.g:5912:1: rule__TypeReference__Group__1 : rule__TypeReference__Group__1__Impl rule__TypeReference__Group__2 ;
    public final void rule__TypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5916:1: ( rule__TypeReference__Group__1__Impl rule__TypeReference__Group__2 )
            // InternalAspectLang.g:5917:2: rule__TypeReference__Group__1__Impl rule__TypeReference__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__TypeReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeReference__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group__1"


    // $ANTLR start "rule__TypeReference__Group__1__Impl"
    // InternalAspectLang.g:5924:1: rule__TypeReference__Group__1__Impl : ( '.' ) ;
    public final void rule__TypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5928:1: ( ( '.' ) )
            // InternalAspectLang.g:5929:1: ( '.' )
            {
            // InternalAspectLang.g:5929:1: ( '.' )
            // InternalAspectLang.g:5930:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getFullStopKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group__1__Impl"


    // $ANTLR start "rule__TypeReference__Group__2"
    // InternalAspectLang.g:5943:1: rule__TypeReference__Group__2 : rule__TypeReference__Group__2__Impl rule__TypeReference__Group__3 ;
    public final void rule__TypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5947:1: ( rule__TypeReference__Group__2__Impl rule__TypeReference__Group__3 )
            // InternalAspectLang.g:5948:2: rule__TypeReference__Group__2__Impl rule__TypeReference__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__TypeReference__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TypeReference__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group__2"


    // $ANTLR start "rule__TypeReference__Group__2__Impl"
    // InternalAspectLang.g:5955:1: rule__TypeReference__Group__2__Impl : ( ( rule__TypeReference__ReferenceAssignment_2 ) ) ;
    public final void rule__TypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5959:1: ( ( ( rule__TypeReference__ReferenceAssignment_2 ) ) )
            // InternalAspectLang.g:5960:1: ( ( rule__TypeReference__ReferenceAssignment_2 ) )
            {
            // InternalAspectLang.g:5960:1: ( ( rule__TypeReference__ReferenceAssignment_2 ) )
            // InternalAspectLang.g:5961:1: ( rule__TypeReference__ReferenceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getReferenceAssignment_2()); 
            }
            // InternalAspectLang.g:5962:1: ( rule__TypeReference__ReferenceAssignment_2 )
            // InternalAspectLang.g:5962:2: rule__TypeReference__ReferenceAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__ReferenceAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getReferenceAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group__2__Impl"


    // $ANTLR start "rule__TypeReference__Group__3"
    // InternalAspectLang.g:5972:1: rule__TypeReference__Group__3 : rule__TypeReference__Group__3__Impl ;
    public final void rule__TypeReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5976:1: ( rule__TypeReference__Group__3__Impl )
            // InternalAspectLang.g:5977:2: rule__TypeReference__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeReference__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group__3"


    // $ANTLR start "rule__TypeReference__Group__3__Impl"
    // InternalAspectLang.g:5983:1: rule__TypeReference__Group__3__Impl : ( ( rule__TypeReference__CollectionAssignment_3 )? ) ;
    public final void rule__TypeReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5987:1: ( ( ( rule__TypeReference__CollectionAssignment_3 )? ) )
            // InternalAspectLang.g:5988:1: ( ( rule__TypeReference__CollectionAssignment_3 )? )
            {
            // InternalAspectLang.g:5988:1: ( ( rule__TypeReference__CollectionAssignment_3 )? )
            // InternalAspectLang.g:5989:1: ( rule__TypeReference__CollectionAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getCollectionAssignment_3()); 
            }
            // InternalAspectLang.g:5990:1: ( rule__TypeReference__CollectionAssignment_3 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==58) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAspectLang.g:5990:2: rule__TypeReference__CollectionAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeReference__CollectionAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getCollectionAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalAspectLang.g:6008:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6012:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAspectLang.g:6013:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAspectLang.g:6020:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6024:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6025:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6025:1: ( RULE_ID )
            // InternalAspectLang.g:6026:1: RULE_ID
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
    // InternalAspectLang.g:6037:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6041:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAspectLang.g:6042:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAspectLang.g:6048:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6052:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAspectLang.g:6053:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAspectLang.g:6053:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAspectLang.g:6054:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:6055:1: ( rule__QualifiedName__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==52) ) {
                    int LA49_2 = input.LA(2);

                    if ( (LA49_2==RULE_ID) ) {
                        alt49=1;
                    }


                }


                switch (alt49) {
            	case 1 :
            	    // InternalAspectLang.g:6055:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalAspectLang.g:6069:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6073:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAspectLang.g:6074:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAspectLang.g:6081:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6085:1: ( ( ( '.' ) ) )
            // InternalAspectLang.g:6086:1: ( ( '.' ) )
            {
            // InternalAspectLang.g:6086:1: ( ( '.' ) )
            // InternalAspectLang.g:6087:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalAspectLang.g:6088:1: ( '.' )
            // InternalAspectLang.g:6089:2: '.'
            {
            match(input,52,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:6100:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6104:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAspectLang.g:6105:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAspectLang.g:6111:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6115:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6116:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6116:1: ( RULE_ID )
            // InternalAspectLang.g:6117:1: RULE_ID
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
    // InternalAspectLang.g:6132:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6136:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAspectLang.g:6137:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalAspectLang.g:6144:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6148:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6149:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:6149:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6150:1: ruleQualifiedName
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
    // InternalAspectLang.g:6161:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6165:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAspectLang.g:6166:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAspectLang.g:6172:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6176:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // InternalAspectLang.g:6177:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // InternalAspectLang.g:6177:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // InternalAspectLang.g:6178:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:6179:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==52) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalAspectLang.g:6179:2: rule__QualifiedNameWithWildcard__Group_1__0
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
    // InternalAspectLang.g:6193:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6197:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // InternalAspectLang.g:6198:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalAspectLang.g:6205:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6209:1: ( ( '.' ) )
            // InternalAspectLang.g:6210:1: ( '.' )
            {
            // InternalAspectLang.g:6210:1: ( '.' )
            // InternalAspectLang.g:6211:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6224:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6228:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // InternalAspectLang.g:6229:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
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
    // InternalAspectLang.g:6235:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6239:1: ( ( '*' ) )
            // InternalAspectLang.g:6240:1: ( '*' )
            {
            // InternalAspectLang.g:6240:1: ( '*' )
            // InternalAspectLang.g:6241:1: '*'
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
    // InternalAspectLang.g:6259:1: rule__AspectModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AspectModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6263:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6264:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:6264:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6265:1: ruleQualifiedName
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
    // InternalAspectLang.g:6274:1: rule__AspectModel__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__AspectModel__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6278:1: ( ( ruleImport ) )
            // InternalAspectLang.g:6279:1: ( ruleImport )
            {
            // InternalAspectLang.g:6279:1: ( ruleImport )
            // InternalAspectLang.g:6280:1: ruleImport
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
    // InternalAspectLang.g:6289:1: rule__AspectModel__SourcesAssignment_3 : ( ruleApplicationModel ) ;
    public final void rule__AspectModel__SourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6293:1: ( ( ruleApplicationModel ) )
            // InternalAspectLang.g:6294:1: ( ruleApplicationModel )
            {
            // InternalAspectLang.g:6294:1: ( ruleApplicationModel )
            // InternalAspectLang.g:6295:1: ruleApplicationModel
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
    // InternalAspectLang.g:6304:1: rule__AspectModel__AdvicesAssignment_4_0 : ( ruleAdvice ) ;
    public final void rule__AspectModel__AdvicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6308:1: ( ( ruleAdvice ) )
            // InternalAspectLang.g:6309:1: ( ruleAdvice )
            {
            // InternalAspectLang.g:6309:1: ( ruleAdvice )
            // InternalAspectLang.g:6310:1: ruleAdvice
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
    // InternalAspectLang.g:6319:1: rule__AspectModel__PointcutsAssignment_4_1 : ( rulePointcut ) ;
    public final void rule__AspectModel__PointcutsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6323:1: ( ( rulePointcut ) )
            // InternalAspectLang.g:6324:1: ( rulePointcut )
            {
            // InternalAspectLang.g:6324:1: ( rulePointcut )
            // InternalAspectLang.g:6325:1: rulePointcut
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
    // InternalAspectLang.g:6334:1: rule__AspectModel__AspectsAssignment_4_2 : ( ruleAspect ) ;
    public final void rule__AspectModel__AspectsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6338:1: ( ( ruleAspect ) )
            // InternalAspectLang.g:6339:1: ( ruleAspect )
            {
            // InternalAspectLang.g:6339:1: ( ruleAspect )
            // InternalAspectLang.g:6340:1: ruleAspect
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
    // InternalAspectLang.g:6349:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6353:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAspectLang.g:6354:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAspectLang.g:6354:1: ( ruleQualifiedNameWithWildcard )
            // InternalAspectLang.g:6355:1: ruleQualifiedNameWithWildcard
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
    // InternalAspectLang.g:6364:1: rule__ApplicationModel__HandlerAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__HandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6368:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6369:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6369:1: ( RULE_ID )
            // InternalAspectLang.g:6370:1: RULE_ID
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
    // InternalAspectLang.g:6379:1: rule__ApplicationModel__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6383:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6384:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6384:1: ( RULE_ID )
            // InternalAspectLang.g:6385:1: RULE_ID
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
    // InternalAspectLang.g:6394:1: rule__ApplicationModel__ModelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6398:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:6399:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:6399:1: ( RULE_STRING )
            // InternalAspectLang.g:6400:1: RULE_STRING
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
    // InternalAspectLang.g:6409:1: rule__Aspect__PointcutAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Aspect__PointcutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6413:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:6414:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:6414:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6415:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutPointcutCrossReference_1_0()); 
            }
            // InternalAspectLang.g:6416:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6417:1: ruleQualifiedName
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
    // InternalAspectLang.g:6428:1: rule__Aspect__AdvicesAssignment_3 : ( ruleUtilizeAdvice ) ;
    public final void rule__Aspect__AdvicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6432:1: ( ( ruleUtilizeAdvice ) )
            // InternalAspectLang.g:6433:1: ( ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:6433:1: ( ruleUtilizeAdvice )
            // InternalAspectLang.g:6434:1: ruleUtilizeAdvice
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
    // InternalAspectLang.g:6443:1: rule__Aspect__AdvicesAssignment_4_1 : ( ruleUtilizeAdvice ) ;
    public final void rule__Aspect__AdvicesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6447:1: ( ( ruleUtilizeAdvice ) )
            // InternalAspectLang.g:6448:1: ( ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:6448:1: ( ruleUtilizeAdvice )
            // InternalAspectLang.g:6449:1: ruleUtilizeAdvice
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
    // InternalAspectLang.g:6458:1: rule__UtilizeAdvice__AdviceAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UtilizeAdvice__AdviceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6462:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:6463:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:6463:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6464:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAdviceCrossReference_0_0()); 
            }
            // InternalAspectLang.g:6465:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6466:1: ruleQualifiedName
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
    // InternalAspectLang.g:6477:1: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 : ( ruleValue ) ;
    public final void rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6481:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6482:1: ( ruleValue )
            {
            // InternalAspectLang.g:6482:1: ( ruleValue )
            // InternalAspectLang.g:6483:1: ruleValue
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
    // InternalAspectLang.g:6492:1: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 : ( ruleValue ) ;
    public final void rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6496:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6497:1: ( ruleValue )
            {
            // InternalAspectLang.g:6497:1: ( ruleValue )
            // InternalAspectLang.g:6498:1: ruleValue
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
    // InternalAspectLang.g:6507:1: rule__Advice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Advice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6511:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6512:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6512:1: ( RULE_ID )
            // InternalAspectLang.g:6513:1: RULE_ID
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
    // InternalAspectLang.g:6522:1: rule__Advice__ParameterDeclarationsAssignment_2_1_0 : ( ruleAdviceParameterDeclaration ) ;
    public final void rule__Advice__ParameterDeclarationsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6526:1: ( ( ruleAdviceParameterDeclaration ) )
            // InternalAspectLang.g:6527:1: ( ruleAdviceParameterDeclaration )
            {
            // InternalAspectLang.g:6527:1: ( ruleAdviceParameterDeclaration )
            // InternalAspectLang.g:6528:1: ruleAdviceParameterDeclaration
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
    // InternalAspectLang.g:6537:1: rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 : ( ruleAdviceParameterDeclaration ) ;
    public final void rule__Advice__ParameterDeclarationsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6541:1: ( ( ruleAdviceParameterDeclaration ) )
            // InternalAspectLang.g:6542:1: ( ruleAdviceParameterDeclaration )
            {
            // InternalAspectLang.g:6542:1: ( ruleAdviceParameterDeclaration )
            // InternalAspectLang.g:6543:1: ruleAdviceParameterDeclaration
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
    // InternalAspectLang.g:6552:1: rule__Advice__CollectorsAssignment_4 : ( ruleCollector ) ;
    public final void rule__Advice__CollectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6556:1: ( ( ruleCollector ) )
            // InternalAspectLang.g:6557:1: ( ruleCollector )
            {
            // InternalAspectLang.g:6557:1: ( ruleCollector )
            // InternalAspectLang.g:6558:1: ruleCollector
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
    // InternalAspectLang.g:6567:1: rule__AdviceParameterDeclaration__TypeAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__AdviceParameterDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6571:1: ( ( ruleTypeReference ) )
            // InternalAspectLang.g:6572:1: ( ruleTypeReference )
            {
            // InternalAspectLang.g:6572:1: ( ruleTypeReference )
            // InternalAspectLang.g:6573:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getTypeTypeReferenceParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterDeclarationAccess().getTypeTypeReferenceParserRuleCall_0_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:6582:1: rule__AdviceParameterDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AdviceParameterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6586:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6587:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6587:1: ( RULE_ID )
            // InternalAspectLang.g:6588:1: RULE_ID
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
    // InternalAspectLang.g:6597:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6601:1: ( ( ruleInsertionPoint ) )
            // InternalAspectLang.g:6602:1: ( ruleInsertionPoint )
            {
            // InternalAspectLang.g:6602:1: ( ruleInsertionPoint )
            // InternalAspectLang.g:6603:1: ruleInsertionPoint
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
    // InternalAspectLang.g:6612:1: rule__Collector__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__Collector__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6616:1: ( ( ruleEvent ) )
            // InternalAspectLang.g:6617:1: ( ruleEvent )
            {
            // InternalAspectLang.g:6617:1: ( ruleEvent )
            // InternalAspectLang.g:6618:1: ruleEvent
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
    // InternalAspectLang.g:6627:1: rule__Event__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Event__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6631:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:6632:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:6632:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6633:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeRecordTypeCrossReference_0_0()); 
            }
            // InternalAspectLang.g:6634:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6635:1: ruleQualifiedName
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
    // InternalAspectLang.g:6646:1: rule__Event__InitializationsAssignment_2_0 : ( ruleValue ) ;
    public final void rule__Event__InitializationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6650:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6651:1: ( ruleValue )
            {
            // InternalAspectLang.g:6651:1: ( ruleValue )
            // InternalAspectLang.g:6652:1: ruleValue
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
    // InternalAspectLang.g:6661:1: rule__Event__InitializationsAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__Event__InitializationsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6665:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6666:1: ( ruleValue )
            {
            // InternalAspectLang.g:6666:1: ( ruleValue )
            // InternalAspectLang.g:6667:1: ruleValue
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
    // InternalAspectLang.g:6676:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6680:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6681:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6681:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6682:1: ruleLocationQuery
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
    // InternalAspectLang.g:6691:1: rule__ReferenceValue__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__ReferenceValue__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6695:1: ( ( ruleProperty ) )
            // InternalAspectLang.g:6696:1: ( ruleProperty )
            {
            // InternalAspectLang.g:6696:1: ( ruleProperty )
            // InternalAspectLang.g:6697:1: ruleProperty
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
    // InternalAspectLang.g:6706:1: rule__InternalFunctionProperty__FunctionAssignment : ( ruleInternalFunction ) ;
    public final void rule__InternalFunctionProperty__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6710:1: ( ( ruleInternalFunction ) )
            // InternalAspectLang.g:6711:1: ( ruleInternalFunction )
            {
            // InternalAspectLang.g:6711:1: ( ruleInternalFunction )
            // InternalAspectLang.g:6712:1: ruleInternalFunction
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
    // InternalAspectLang.g:6721:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6725:1: ( ( ruleReflectionFunction ) )
            // InternalAspectLang.g:6726:1: ( ruleReflectionFunction )
            {
            // InternalAspectLang.g:6726:1: ( ruleReflectionFunction )
            // InternalAspectLang.g:6727:1: ruleReflectionFunction
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


    // $ANTLR start "rule__AdviceParameter__DeclarationAssignment_0"
    // InternalAspectLang.g:6736:1: rule__AdviceParameter__DeclarationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AdviceParameter__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6740:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6741:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6741:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6742:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getDeclarationAdviceParameterDeclarationCrossReference_0_0()); 
            }
            // InternalAspectLang.g:6743:1: ( RULE_ID )
            // InternalAspectLang.g:6744:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getDeclarationAdviceParameterDeclarationIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getDeclarationAdviceParameterDeclarationIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getDeclarationAdviceParameterDeclarationCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__DeclarationAssignment_0"


    // $ANTLR start "rule__AdviceParameter__CollectionAssignment_1_1"
    // InternalAspectLang.g:6755:1: rule__AdviceParameter__CollectionAssignment_1_1 : ( ruleValue ) ;
    public final void rule__AdviceParameter__CollectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6759:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6760:1: ( ruleValue )
            {
            // InternalAspectLang.g:6760:1: ( ruleValue )
            // InternalAspectLang.g:6761:1: ruleValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getCollectionValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdviceParameterAccess().getCollectionValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AdviceParameter__CollectionAssignment_1_1"


    // $ANTLR start "rule__Pointcut__AnnotationAssignment_0"
    // InternalAspectLang.g:6770:1: rule__Pointcut__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Pointcut__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6774:1: ( ( ruleAnnotation ) )
            // InternalAspectLang.g:6775:1: ( ruleAnnotation )
            {
            // InternalAspectLang.g:6775:1: ( ruleAnnotation )
            // InternalAspectLang.g:6776:1: ruleAnnotation
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
    // InternalAspectLang.g:6785:1: rule__Pointcut__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pointcut__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6789:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6790:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6790:1: ( RULE_ID )
            // InternalAspectLang.g:6791:1: RULE_ID
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


    // $ANTLR start "rule__Pointcut__ModelAssignment_4"
    // InternalAspectLang.g:6800:1: rule__Pointcut__ModelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Pointcut__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6804:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6805:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6805:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6806:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getModelApplicationModelCrossReference_4_0()); 
            }
            // InternalAspectLang.g:6807:1: ( RULE_ID )
            // InternalAspectLang.g:6808:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getModelApplicationModelIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getModelApplicationModelIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getModelApplicationModelCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__ModelAssignment_4"


    // $ANTLR start "rule__Pointcut__LocationAssignment_6"
    // InternalAspectLang.g:6819:1: rule__Pointcut__LocationAssignment_6 : ( ruleLocationQuery ) ;
    public final void rule__Pointcut__LocationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6823:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6824:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6824:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6825:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getLocationLocationQueryParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getLocationLocationQueryParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__LocationAssignment_6"


    // $ANTLR start "rule__Pointcut__OperationAssignment_7_1"
    // InternalAspectLang.g:6834:1: rule__Pointcut__OperationAssignment_7_1 : ( ruleOperationQuery ) ;
    public final void rule__Pointcut__OperationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6838:1: ( ( ruleOperationQuery ) )
            // InternalAspectLang.g:6839:1: ( ruleOperationQuery )
            {
            // InternalAspectLang.g:6839:1: ( ruleOperationQuery )
            // InternalAspectLang.g:6840:1: ruleOperationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationOperationQueryParserRuleCall_7_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleOperationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPointcutAccess().getOperationOperationQueryParserRuleCall_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pointcut__OperationAssignment_7_1"


    // $ANTLR start "rule__Annotation__NameAssignment_1"
    // InternalAspectLang.g:6849:1: rule__Annotation__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6853:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6854:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6854:1: ( RULE_ID )
            // InternalAspectLang.g:6855:1: RULE_ID
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
    // InternalAspectLang.g:6864:1: rule__Annotation__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6868:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:6869:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:6869:1: ( RULE_STRING )
            // InternalAspectLang.g:6870:1: RULE_STRING
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
    // InternalAspectLang.g:6879:1: rule__LocationQuery__NodeAssignment_0 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6883:1: ( ( ruleNode ) )
            // InternalAspectLang.g:6884:1: ( ruleNode )
            {
            // InternalAspectLang.g:6884:1: ( ruleNode )
            // InternalAspectLang.g:6885:1: ruleNode
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
    // InternalAspectLang.g:6894:1: rule__LocationQuery__SpecializationAssignment_1_0_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6898:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6899:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6899:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6900:1: ruleLocationQuery
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
    // InternalAspectLang.g:6909:1: rule__LocationQuery__CompositionAssignment_1_1 : ( ruleCompositionQuery ) ;
    public final void rule__LocationQuery__CompositionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6913:1: ( ( ruleCompositionQuery ) )
            // InternalAspectLang.g:6914:1: ( ruleCompositionQuery )
            {
            // InternalAspectLang.g:6914:1: ( ruleCompositionQuery )
            // InternalAspectLang.g:6915:1: ruleCompositionQuery
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
    // InternalAspectLang.g:6924:1: rule__CompositionQuery__ModifierAssignment_1 : ( ruleQueryModifier ) ;
    public final void rule__CompositionQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6928:1: ( ( ruleQueryModifier ) )
            // InternalAspectLang.g:6929:1: ( ruleQueryModifier )
            {
            // InternalAspectLang.g:6929:1: ( ruleQueryModifier )
            // InternalAspectLang.g:6930:1: ruleQueryModifier
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
    // InternalAspectLang.g:6939:1: rule__CompositionQuery__SubQueriesAssignment_3 : ( ruleLocationQuery ) ;
    public final void rule__CompositionQuery__SubQueriesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6943:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6944:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6944:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6945:1: ruleLocationQuery
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
    // InternalAspectLang.g:6954:1: rule__OperationQuery__ModifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6958:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6959:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6959:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6960:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getModifierOperationModifierCrossReference_1_0()); 
            }
            // InternalAspectLang.g:6961:1: ( RULE_ID )
            // InternalAspectLang.g:6962:1: RULE_ID
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
    // InternalAspectLang.g:6973:1: rule__OperationQuery__ReturnTypeAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__OperationQuery__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6977:1: ( ( ruleTypeReference ) )
            // InternalAspectLang.g:6978:1: ( ruleTypeReference )
            {
            // InternalAspectLang.g:6978:1: ( ruleTypeReference )
            // InternalAspectLang.g:6979:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getReturnTypeTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOperationQueryAccess().getReturnTypeTypeReferenceParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:6988:1: rule__OperationQuery__OperationReferenceAssignment_3_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__OperationQuery__OperationReferenceAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6992:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6993:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6993:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6994:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationReferenceOperationCrossReference_3_0_0_0()); 
            }
            // InternalAspectLang.g:6995:1: ( RULE_ID )
            // InternalAspectLang.g:6996:1: RULE_ID
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
    // InternalAspectLang.g:7007:1: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 : ( ruleParameterQuery ) ;
    public final void rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7011:1: ( ( ruleParameterQuery ) )
            // InternalAspectLang.g:7012:1: ( ruleParameterQuery )
            {
            // InternalAspectLang.g:7012:1: ( ruleParameterQuery )
            // InternalAspectLang.g:7013:1: ruleParameterQuery
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
    // InternalAspectLang.g:7022:1: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 : ( ruleParameterQuery ) ;
    public final void rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7026:1: ( ( ruleParameterQuery ) )
            // InternalAspectLang.g:7027:1: ( ruleParameterQuery )
            {
            // InternalAspectLang.g:7027:1: ( ruleParameterQuery )
            // InternalAspectLang.g:7028:1: ruleParameterQuery
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
    // InternalAspectLang.g:7037:1: rule__ParameterQuery__ModifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7041:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7042:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7042:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7043:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_1_0()); 
            }
            // InternalAspectLang.g:7044:1: ( RULE_ID )
            // InternalAspectLang.g:7045:1: RULE_ID
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
    // InternalAspectLang.g:7056:1: rule__ParameterQuery__TypeAssignment_2_0 : ( ruleTypeReference ) ;
    public final void rule__ParameterQuery__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7060:1: ( ( ruleTypeReference ) )
            // InternalAspectLang.g:7061:1: ( ruleTypeReference )
            {
            // InternalAspectLang.g:7061:1: ( ruleTypeReference )
            // InternalAspectLang.g:7062:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getTypeTypeReferenceParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterQueryAccess().getTypeTypeReferenceParserRuleCall_2_0_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:7071:1: rule__ParameterQuery__ParameterAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7075:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7076:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7076:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7077:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_3_0()); 
            }
            // InternalAspectLang.g:7078:1: ( RULE_ID )
            // InternalAspectLang.g:7079:1: RULE_ID
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
    // InternalAspectLang.g:7090:1: rule__Node__ConstraintAssignment_1_1 : ( rulePropertyConstraint ) ;
    public final void rule__Node__ConstraintAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7094:1: ( ( rulePropertyConstraint ) )
            // InternalAspectLang.g:7095:1: ( rulePropertyConstraint )
            {
            // InternalAspectLang.g:7095:1: ( rulePropertyConstraint )
            // InternalAspectLang.g:7096:1: rulePropertyConstraint
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
    // InternalAspectLang.g:7105:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7109:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7110:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7110:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7111:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerFeatureCrossReference_0()); 
            }
            // InternalAspectLang.g:7112:1: ( RULE_ID )
            // InternalAspectLang.g:7113:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerFeatureIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeAccess().getContainerFeatureIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getContainerNodeAccess().getContainerFeatureCrossReference_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:7124:1: rule__PropertyConstraint__LogicAssignment_1_1 : ( ruleLogicOperator ) ;
    public final void rule__PropertyConstraint__LogicAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7128:1: ( ( ruleLogicOperator ) )
            // InternalAspectLang.g:7129:1: ( ruleLogicOperator )
            {
            // InternalAspectLang.g:7129:1: ( ruleLogicOperator )
            // InternalAspectLang.g:7130:1: ruleLogicOperator
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
    // InternalAspectLang.g:7139:1: rule__PropertyConstraint__RightAssignment_1_2 : ( rulePropertyConstraintCompare ) ;
    public final void rule__PropertyConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7143:1: ( ( rulePropertyConstraintCompare ) )
            // InternalAspectLang.g:7144:1: ( rulePropertyConstraintCompare )
            {
            // InternalAspectLang.g:7144:1: ( rulePropertyConstraintCompare )
            // InternalAspectLang.g:7145:1: rulePropertyConstraintCompare
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
    // InternalAspectLang.g:7154:1: rule__PropertyConstraintCompare__CompareAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__PropertyConstraintCompare__CompareAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7158:1: ( ( ruleCompareOperator ) )
            // InternalAspectLang.g:7159:1: ( ruleCompareOperator )
            {
            // InternalAspectLang.g:7159:1: ( ruleCompareOperator )
            // InternalAspectLang.g:7160:1: ruleCompareOperator
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
    // InternalAspectLang.g:7169:1: rule__PropertyConstraintCompare__RightAssignment_1_2 : ( ruleConstraintElement ) ;
    public final void rule__PropertyConstraintCompare__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7173:1: ( ( ruleConstraintElement ) )
            // InternalAspectLang.g:7174:1: ( ruleConstraintElement )
            {
            // InternalAspectLang.g:7174:1: ( ruleConstraintElement )
            // InternalAspectLang.g:7175:1: ruleConstraintElement
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
    // InternalAspectLang.g:7184:1: rule__LocalQuery__LocationQueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__LocalQuery__LocationQueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7188:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:7189:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:7189:1: ( ruleLocationQuery )
            // InternalAspectLang.g:7190:1: ruleLocationQuery
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
    // InternalAspectLang.g:7199:1: rule__LocalQuery__PropertyAssignment_1_0 : ( ruleModelProperty ) ;
    public final void rule__LocalQuery__PropertyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7203:1: ( ( ruleModelProperty ) )
            // InternalAspectLang.g:7204:1: ( ruleModelProperty )
            {
            // InternalAspectLang.g:7204:1: ( ruleModelProperty )
            // InternalAspectLang.g:7205:1: ruleModelProperty
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
    // InternalAspectLang.g:7214:1: rule__LocalQuery__TypeofAssignment_1_1 : ( ruleTypeof ) ;
    public final void rule__LocalQuery__TypeofAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7218:1: ( ( ruleTypeof ) )
            // InternalAspectLang.g:7219:1: ( ruleTypeof )
            {
            // InternalAspectLang.g:7219:1: ( ruleTypeof )
            // InternalAspectLang.g:7220:1: ruleTypeof
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
    // InternalAspectLang.g:7229:1: rule__ModelProperty__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModelProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7233:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7234:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7234:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7235:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getReferenceFeatureCrossReference_1_0()); 
            }
            // InternalAspectLang.g:7236:1: ( RULE_ID )
            // InternalAspectLang.g:7237:1: RULE_ID
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
    // InternalAspectLang.g:7248:1: rule__Typeof__ReferenceAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__Typeof__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7252:1: ( ( ruleTypeReference ) )
            // InternalAspectLang.g:7253:1: ( ruleTypeReference )
            {
            // InternalAspectLang.g:7253:1: ( ruleTypeReference )
            // InternalAspectLang.g:7254:1: ruleTypeReference
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getReferenceTypeReferenceParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTypeReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeofAccess().getReferenceTypeReferenceParserRuleCall_2_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:7263:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7267:1: ( ( RULE_FLOAT ) )
            // InternalAspectLang.g:7268:1: ( RULE_FLOAT )
            {
            // InternalAspectLang.g:7268:1: ( RULE_FLOAT )
            // InternalAspectLang.g:7269:1: RULE_FLOAT
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
    // InternalAspectLang.g:7278:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7282:1: ( ( RULE_INT ) )
            // InternalAspectLang.g:7283:1: ( RULE_INT )
            {
            // InternalAspectLang.g:7283:1: ( RULE_INT )
            // InternalAspectLang.g:7284:1: RULE_INT
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
    // InternalAspectLang.g:7293:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7297:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:7298:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:7298:1: ( RULE_STRING )
            // InternalAspectLang.g:7299:1: RULE_STRING
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


    // $ANTLR start "rule__TypeReference__ContextAssignment_0"
    // InternalAspectLang.g:7308:1: rule__TypeReference__ContextAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7312:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7313:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7313:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7314:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getContextApplicationModelCrossReference_0_0()); 
            }
            // InternalAspectLang.g:7315:1: ( RULE_ID )
            // InternalAspectLang.g:7316:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getContextApplicationModelIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getContextApplicationModelIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getContextApplicationModelCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__ContextAssignment_0"


    // $ANTLR start "rule__TypeReference__ReferenceAssignment_2"
    // InternalAspectLang.g:7327:1: rule__TypeReference__ReferenceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7331:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7332:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7332:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7333:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_2_0()); 
            }
            // InternalAspectLang.g:7334:1: ( RULE_ID )
            // InternalAspectLang.g:7335:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeIDTerminalRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__ReferenceAssignment_2"


    // $ANTLR start "rule__TypeReference__CollectionAssignment_3"
    // InternalAspectLang.g:7346:1: rule__TypeReference__CollectionAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__TypeReference__CollectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7350:1: ( ( ( '[]' ) ) )
            // InternalAspectLang.g:7351:1: ( ( '[]' ) )
            {
            // InternalAspectLang.g:7351:1: ( ( '[]' ) )
            // InternalAspectLang.g:7352:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }
            // InternalAspectLang.g:7353:1: ( '[]' )
            // InternalAspectLang.g:7354:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTypeReferenceAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeReference__CollectionAssignment_3"

    // $ANTLR start synpred4_InternalAspectLang
    public final void synpred4_InternalAspectLang_fragment() throws RecognitionException {   
        // InternalAspectLang.g:1334:6: ( ( ruleReferenceValue ) )
        // InternalAspectLang.g:1334:6: ( ruleReferenceValue )
        {
        // InternalAspectLang.g:1334:6: ( ruleReferenceValue )
        // InternalAspectLang.g:1335:1: ruleReferenceValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getValueAccess().getReferenceValueParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_2);
        ruleReferenceValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred4_InternalAspectLang

    // Delegated rules

    public final boolean synpred4_InternalAspectLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalAspectLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\16\uffff";
    static final String dfa_2s = "\1\4\6\uffff\1\0\6\uffff";
    static final String dfa_3s = "\1\70\6\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\2\5\uffff\1\3\2\uffff\1\4";
    static final String dfa_5s = "\7\uffff\1\0\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\7\3\1\5\uffff\1\4\2\uffff\3\12\33\uffff\2\4\7\uffff\2\4",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1323:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleReferenceValue ) | ( ruleInternalFunctionProperty ) | ( ruleAdviceParameter ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_7 = input.LA(1);

                         
                        int index2_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalAspectLang()) ) {s = 4;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index2_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 2, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0044085800000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0044084000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0180C400000720F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0180C000000720F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000120000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000020000000C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000040000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0180C00000002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000780000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0044000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0180000000002010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0010100001800000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0180200000002010L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0180000000002012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x03808000000020F0L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00000003F8000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0010000000000002L});

}
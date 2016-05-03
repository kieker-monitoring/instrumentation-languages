package kieker.develop.al.ui.contentassist.antlr.internal; 

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
import kieker.develop.al.services.AspectLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAspectLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_FLOAT", "RULE_INT", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'before'", "'after'", "'exception'", "'time'", "'traceId'", "'orderIndex'", "'name'", "'signature'", "'classname'", "'return-type'", "'javaee'", "'servlet'", "'spring'", "'aspectj'", "'include'", "'exclude'", "'&&'", "'||'", "'='", "'~'", "'!='", "'>'", "'<'", "'>='", "'<='", "'package'", "'import'", "'use'", "'on'", "'aspect'", "':'", "','", "'('", "')'", "'advice'", "'{'", "'}'", "'$'", "'#'", "'['", "']'", "'pointcut'", "'class'", "'.'", "'operation'", "'@'", "'**'", "'up'", "'istypeof'", "'technology'", "'[]'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
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
    public static final int T__60=60;
    public static final int T__61=61;
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
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
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
    // InternalAspectLang.g:567:1: entryRuleLocationQuery : ruleLocationQuery EOF ;
    public final void entryRuleLocationQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:568:1: ( ruleLocationQuery EOF )
            // InternalAspectLang.g:569:1: ruleLocationQuery EOF
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
    // InternalAspectLang.g:576:1: ruleLocationQuery : ( ( rule__LocationQuery__Group__0 ) ) ;
    public final void ruleLocationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:580:2: ( ( ( rule__LocationQuery__Group__0 ) ) )
            // InternalAspectLang.g:581:1: ( ( rule__LocationQuery__Group__0 ) )
            {
            // InternalAspectLang.g:581:1: ( ( rule__LocationQuery__Group__0 ) )
            // InternalAspectLang.g:582:1: ( rule__LocationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:583:1: ( rule__LocationQuery__Group__0 )
            // InternalAspectLang.g:583:2: rule__LocationQuery__Group__0
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
    // InternalAspectLang.g:595:1: entryRuleCompositionQuery : ruleCompositionQuery EOF ;
    public final void entryRuleCompositionQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:596:1: ( ruleCompositionQuery EOF )
            // InternalAspectLang.g:597:1: ruleCompositionQuery EOF
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
    // InternalAspectLang.g:604:1: ruleCompositionQuery : ( ( rule__CompositionQuery__Group__0 ) ) ;
    public final void ruleCompositionQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:608:2: ( ( ( rule__CompositionQuery__Group__0 ) ) )
            // InternalAspectLang.g:609:1: ( ( rule__CompositionQuery__Group__0 ) )
            {
            // InternalAspectLang.g:609:1: ( ( rule__CompositionQuery__Group__0 ) )
            // InternalAspectLang.g:610:1: ( rule__CompositionQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:611:1: ( rule__CompositionQuery__Group__0 )
            // InternalAspectLang.g:611:2: rule__CompositionQuery__Group__0
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
    // InternalAspectLang.g:623:1: entryRuleOperationQuery : ruleOperationQuery EOF ;
    public final void entryRuleOperationQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:624:1: ( ruleOperationQuery EOF )
            // InternalAspectLang.g:625:1: ruleOperationQuery EOF
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
    // InternalAspectLang.g:632:1: ruleOperationQuery : ( ( rule__OperationQuery__Group__0 ) ) ;
    public final void ruleOperationQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:636:2: ( ( ( rule__OperationQuery__Group__0 ) ) )
            // InternalAspectLang.g:637:1: ( ( rule__OperationQuery__Group__0 ) )
            {
            // InternalAspectLang.g:637:1: ( ( rule__OperationQuery__Group__0 ) )
            // InternalAspectLang.g:638:1: ( rule__OperationQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:639:1: ( rule__OperationQuery__Group__0 )
            // InternalAspectLang.g:639:2: rule__OperationQuery__Group__0
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
    // InternalAspectLang.g:651:1: entryRuleParameterQuery : ruleParameterQuery EOF ;
    public final void entryRuleParameterQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:652:1: ( ruleParameterQuery EOF )
            // InternalAspectLang.g:653:1: ruleParameterQuery EOF
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
    // InternalAspectLang.g:660:1: ruleParameterQuery : ( ( rule__ParameterQuery__Group__0 ) ) ;
    public final void ruleParameterQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:664:2: ( ( ( rule__ParameterQuery__Group__0 ) ) )
            // InternalAspectLang.g:665:1: ( ( rule__ParameterQuery__Group__0 ) )
            {
            // InternalAspectLang.g:665:1: ( ( rule__ParameterQuery__Group__0 ) )
            // InternalAspectLang.g:666:1: ( rule__ParameterQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:667:1: ( rule__ParameterQuery__Group__0 )
            // InternalAspectLang.g:667:2: rule__ParameterQuery__Group__0
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
    // InternalAspectLang.g:679:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:680:1: ( ruleNode EOF )
            // InternalAspectLang.g:681:1: ruleNode EOF
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
    // InternalAspectLang.g:688:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:692:2: ( ( ( rule__Node__Group__0 ) ) )
            // InternalAspectLang.g:693:1: ( ( rule__Node__Group__0 ) )
            {
            // InternalAspectLang.g:693:1: ( ( rule__Node__Group__0 ) )
            // InternalAspectLang.g:694:1: ( rule__Node__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:695:1: ( rule__Node__Group__0 )
            // InternalAspectLang.g:695:2: rule__Node__Group__0
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
    // InternalAspectLang.g:707:1: entryRuleContainerNode : ruleContainerNode EOF ;
    public final void entryRuleContainerNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:708:1: ( ruleContainerNode EOF )
            // InternalAspectLang.g:709:1: ruleContainerNode EOF
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
    // InternalAspectLang.g:716:1: ruleContainerNode : ( ( rule__ContainerNode__ContainerAssignment ) ) ;
    public final void ruleContainerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:720:2: ( ( ( rule__ContainerNode__ContainerAssignment ) ) )
            // InternalAspectLang.g:721:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            {
            // InternalAspectLang.g:721:1: ( ( rule__ContainerNode__ContainerAssignment ) )
            // InternalAspectLang.g:722:1: ( rule__ContainerNode__ContainerAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerAssignment()); 
            }
            // InternalAspectLang.g:723:1: ( rule__ContainerNode__ContainerAssignment )
            // InternalAspectLang.g:723:2: rule__ContainerNode__ContainerAssignment
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
    // InternalAspectLang.g:735:1: entryRuleWildcardNode : ruleWildcardNode EOF ;
    public final void entryRuleWildcardNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:736:1: ( ruleWildcardNode EOF )
            // InternalAspectLang.g:737:1: ruleWildcardNode EOF
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
    // InternalAspectLang.g:744:1: ruleWildcardNode : ( ( rule__WildcardNode__Group__0 ) ) ;
    public final void ruleWildcardNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:748:2: ( ( ( rule__WildcardNode__Group__0 ) ) )
            // InternalAspectLang.g:749:1: ( ( rule__WildcardNode__Group__0 ) )
            {
            // InternalAspectLang.g:749:1: ( ( rule__WildcardNode__Group__0 ) )
            // InternalAspectLang.g:750:1: ( rule__WildcardNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:751:1: ( rule__WildcardNode__Group__0 )
            // InternalAspectLang.g:751:2: rule__WildcardNode__Group__0
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
    // InternalAspectLang.g:763:1: entryRuleSubPathNode : ruleSubPathNode EOF ;
    public final void entryRuleSubPathNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:764:1: ( ruleSubPathNode EOF )
            // InternalAspectLang.g:765:1: ruleSubPathNode EOF
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
    // InternalAspectLang.g:772:1: ruleSubPathNode : ( ( rule__SubPathNode__Group__0 ) ) ;
    public final void ruleSubPathNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:776:2: ( ( ( rule__SubPathNode__Group__0 ) ) )
            // InternalAspectLang.g:777:1: ( ( rule__SubPathNode__Group__0 ) )
            {
            // InternalAspectLang.g:777:1: ( ( rule__SubPathNode__Group__0 ) )
            // InternalAspectLang.g:778:1: ( rule__SubPathNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:779:1: ( rule__SubPathNode__Group__0 )
            // InternalAspectLang.g:779:2: rule__SubPathNode__Group__0
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
    // InternalAspectLang.g:791:1: entryRuleParentNode : ruleParentNode EOF ;
    public final void entryRuleParentNode() throws RecognitionException {
        try {
            // InternalAspectLang.g:792:1: ( ruleParentNode EOF )
            // InternalAspectLang.g:793:1: ruleParentNode EOF
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
    // InternalAspectLang.g:800:1: ruleParentNode : ( ( rule__ParentNode__Group__0 ) ) ;
    public final void ruleParentNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:804:2: ( ( ( rule__ParentNode__Group__0 ) ) )
            // InternalAspectLang.g:805:1: ( ( rule__ParentNode__Group__0 ) )
            {
            // InternalAspectLang.g:805:1: ( ( rule__ParentNode__Group__0 ) )
            // InternalAspectLang.g:806:1: ( rule__ParentNode__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getGroup()); 
            }
            // InternalAspectLang.g:807:1: ( rule__ParentNode__Group__0 )
            // InternalAspectLang.g:807:2: rule__ParentNode__Group__0
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
    // InternalAspectLang.g:819:1: entryRulePropertyConstraint : rulePropertyConstraint EOF ;
    public final void entryRulePropertyConstraint() throws RecognitionException {
        try {
            // InternalAspectLang.g:820:1: ( rulePropertyConstraint EOF )
            // InternalAspectLang.g:821:1: rulePropertyConstraint EOF
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
    // InternalAspectLang.g:828:1: rulePropertyConstraint : ( ( rule__PropertyConstraint__Group__0 ) ) ;
    public final void rulePropertyConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:832:2: ( ( ( rule__PropertyConstraint__Group__0 ) ) )
            // InternalAspectLang.g:833:1: ( ( rule__PropertyConstraint__Group__0 ) )
            {
            // InternalAspectLang.g:833:1: ( ( rule__PropertyConstraint__Group__0 ) )
            // InternalAspectLang.g:834:1: ( rule__PropertyConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup()); 
            }
            // InternalAspectLang.g:835:1: ( rule__PropertyConstraint__Group__0 )
            // InternalAspectLang.g:835:2: rule__PropertyConstraint__Group__0
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
    // InternalAspectLang.g:847:1: entryRulePropertyConstraintCompare : rulePropertyConstraintCompare EOF ;
    public final void entryRulePropertyConstraintCompare() throws RecognitionException {
        try {
            // InternalAspectLang.g:848:1: ( rulePropertyConstraintCompare EOF )
            // InternalAspectLang.g:849:1: rulePropertyConstraintCompare EOF
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
    // InternalAspectLang.g:856:1: rulePropertyConstraintCompare : ( ( rule__PropertyConstraintCompare__Group__0 ) ) ;
    public final void rulePropertyConstraintCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:860:2: ( ( ( rule__PropertyConstraintCompare__Group__0 ) ) )
            // InternalAspectLang.g:861:1: ( ( rule__PropertyConstraintCompare__Group__0 ) )
            {
            // InternalAspectLang.g:861:1: ( ( rule__PropertyConstraintCompare__Group__0 ) )
            // InternalAspectLang.g:862:1: ( rule__PropertyConstraintCompare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getGroup()); 
            }
            // InternalAspectLang.g:863:1: ( rule__PropertyConstraintCompare__Group__0 )
            // InternalAspectLang.g:863:2: rule__PropertyConstraintCompare__Group__0
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
    // InternalAspectLang.g:875:1: entryRuleConstraintElement : ruleConstraintElement EOF ;
    public final void entryRuleConstraintElement() throws RecognitionException {
        try {
            // InternalAspectLang.g:876:1: ( ruleConstraintElement EOF )
            // InternalAspectLang.g:877:1: ruleConstraintElement EOF
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
    // InternalAspectLang.g:884:1: ruleConstraintElement : ( ( rule__ConstraintElement__Alternatives ) ) ;
    public final void ruleConstraintElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:888:2: ( ( ( rule__ConstraintElement__Alternatives ) ) )
            // InternalAspectLang.g:889:1: ( ( rule__ConstraintElement__Alternatives ) )
            {
            // InternalAspectLang.g:889:1: ( ( rule__ConstraintElement__Alternatives ) )
            // InternalAspectLang.g:890:1: ( rule__ConstraintElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstraintElementAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:891:1: ( rule__ConstraintElement__Alternatives )
            // InternalAspectLang.g:891:2: rule__ConstraintElement__Alternatives
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
    // InternalAspectLang.g:903:1: entryRuleLocalQuery : ruleLocalQuery EOF ;
    public final void entryRuleLocalQuery() throws RecognitionException {
        try {
            // InternalAspectLang.g:904:1: ( ruleLocalQuery EOF )
            // InternalAspectLang.g:905:1: ruleLocalQuery EOF
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
    // InternalAspectLang.g:912:1: ruleLocalQuery : ( ( rule__LocalQuery__Group__0 ) ) ;
    public final void ruleLocalQuery() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:916:2: ( ( ( rule__LocalQuery__Group__0 ) ) )
            // InternalAspectLang.g:917:1: ( ( rule__LocalQuery__Group__0 ) )
            {
            // InternalAspectLang.g:917:1: ( ( rule__LocalQuery__Group__0 ) )
            // InternalAspectLang.g:918:1: ( rule__LocalQuery__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getGroup()); 
            }
            // InternalAspectLang.g:919:1: ( rule__LocalQuery__Group__0 )
            // InternalAspectLang.g:919:2: rule__LocalQuery__Group__0
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
    // InternalAspectLang.g:931:1: entryRuleModelProperty : ruleModelProperty EOF ;
    public final void entryRuleModelProperty() throws RecognitionException {
        try {
            // InternalAspectLang.g:932:1: ( ruleModelProperty EOF )
            // InternalAspectLang.g:933:1: ruleModelProperty EOF
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
    // InternalAspectLang.g:940:1: ruleModelProperty : ( ( rule__ModelProperty__Group__0 ) ) ;
    public final void ruleModelProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:944:2: ( ( ( rule__ModelProperty__Group__0 ) ) )
            // InternalAspectLang.g:945:1: ( ( rule__ModelProperty__Group__0 ) )
            {
            // InternalAspectLang.g:945:1: ( ( rule__ModelProperty__Group__0 ) )
            // InternalAspectLang.g:946:1: ( rule__ModelProperty__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getGroup()); 
            }
            // InternalAspectLang.g:947:1: ( rule__ModelProperty__Group__0 )
            // InternalAspectLang.g:947:2: rule__ModelProperty__Group__0
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
    // InternalAspectLang.g:959:1: entryRuleTypeof : ruleTypeof EOF ;
    public final void entryRuleTypeof() throws RecognitionException {
        try {
            // InternalAspectLang.g:960:1: ( ruleTypeof EOF )
            // InternalAspectLang.g:961:1: ruleTypeof EOF
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
    // InternalAspectLang.g:968:1: ruleTypeof : ( ( rule__Typeof__Group__0 ) ) ;
    public final void ruleTypeof() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:972:2: ( ( ( rule__Typeof__Group__0 ) ) )
            // InternalAspectLang.g:973:1: ( ( rule__Typeof__Group__0 ) )
            {
            // InternalAspectLang.g:973:1: ( ( rule__Typeof__Group__0 ) )
            // InternalAspectLang.g:974:1: ( rule__Typeof__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getGroup()); 
            }
            // InternalAspectLang.g:975:1: ( rule__Typeof__Group__0 )
            // InternalAspectLang.g:975:2: rule__Typeof__Group__0
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
    // InternalAspectLang.g:987:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:988:1: ( ruleLiteral EOF )
            // InternalAspectLang.g:989:1: ruleLiteral EOF
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
    // InternalAspectLang.g:996:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1000:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalAspectLang.g:1001:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalAspectLang.g:1001:1: ( ( rule__Literal__Alternatives ) )
            // InternalAspectLang.g:1002:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1003:1: ( rule__Literal__Alternatives )
            // InternalAspectLang.g:1003:2: rule__Literal__Alternatives
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
    // InternalAspectLang.g:1015:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:1016:1: ( ruleFloatLiteral EOF )
            // InternalAspectLang.g:1017:1: ruleFloatLiteral EOF
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
    // InternalAspectLang.g:1024:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1028:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:1029:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:1029:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // InternalAspectLang.g:1030:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:1031:1: ( rule__FloatLiteral__ValueAssignment )
            // InternalAspectLang.g:1031:2: rule__FloatLiteral__ValueAssignment
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
    // InternalAspectLang.g:1043:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:1044:1: ( ruleIntLiteral EOF )
            // InternalAspectLang.g:1045:1: ruleIntLiteral EOF
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
    // InternalAspectLang.g:1052:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1056:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:1057:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:1057:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalAspectLang.g:1058:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:1059:1: ( rule__IntLiteral__ValueAssignment )
            // InternalAspectLang.g:1059:2: rule__IntLiteral__ValueAssignment
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
    // InternalAspectLang.g:1071:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalAspectLang.g:1072:1: ( ruleStringLiteral EOF )
            // InternalAspectLang.g:1073:1: ruleStringLiteral EOF
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
    // InternalAspectLang.g:1080:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1084:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalAspectLang.g:1085:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalAspectLang.g:1085:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalAspectLang.g:1086:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // InternalAspectLang.g:1087:1: ( rule__StringLiteral__ValueAssignment )
            // InternalAspectLang.g:1087:2: rule__StringLiteral__ValueAssignment
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
    // InternalAspectLang.g:1099:1: entryRuleTypeReference : ruleTypeReference EOF ;
    public final void entryRuleTypeReference() throws RecognitionException {
        try {
            // InternalAspectLang.g:1100:1: ( ruleTypeReference EOF )
            // InternalAspectLang.g:1101:1: ruleTypeReference EOF
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
    // InternalAspectLang.g:1108:1: ruleTypeReference : ( ( rule__TypeReference__Group__0 ) ) ;
    public final void ruleTypeReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1112:2: ( ( ( rule__TypeReference__Group__0 ) ) )
            // InternalAspectLang.g:1113:1: ( ( rule__TypeReference__Group__0 ) )
            {
            // InternalAspectLang.g:1113:1: ( ( rule__TypeReference__Group__0 ) )
            // InternalAspectLang.g:1114:1: ( rule__TypeReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getGroup()); 
            }
            // InternalAspectLang.g:1115:1: ( rule__TypeReference__Group__0 )
            // InternalAspectLang.g:1115:2: rule__TypeReference__Group__0
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
    // InternalAspectLang.g:1127:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalAspectLang.g:1128:1: ( ruleQualifiedName EOF )
            // InternalAspectLang.g:1129:1: ruleQualifiedName EOF
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
    // InternalAspectLang.g:1136:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1140:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalAspectLang.g:1141:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalAspectLang.g:1141:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalAspectLang.g:1142:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalAspectLang.g:1143:1: ( rule__QualifiedName__Group__0 )
            // InternalAspectLang.g:1143:2: rule__QualifiedName__Group__0
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
    // InternalAspectLang.g:1155:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalAspectLang.g:1156:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalAspectLang.g:1157:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalAspectLang.g:1164:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1168:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalAspectLang.g:1169:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalAspectLang.g:1169:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalAspectLang.g:1170:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalAspectLang.g:1171:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalAspectLang.g:1171:2: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalAspectLang.g:1184:1: ruleInsertionPoint : ( ( rule__InsertionPoint__Alternatives ) ) ;
    public final void ruleInsertionPoint() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1188:1: ( ( ( rule__InsertionPoint__Alternatives ) ) )
            // InternalAspectLang.g:1189:1: ( ( rule__InsertionPoint__Alternatives ) )
            {
            // InternalAspectLang.g:1189:1: ( ( rule__InsertionPoint__Alternatives ) )
            // InternalAspectLang.g:1190:1: ( rule__InsertionPoint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInsertionPointAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1191:1: ( rule__InsertionPoint__Alternatives )
            // InternalAspectLang.g:1191:2: rule__InsertionPoint__Alternatives
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
    // InternalAspectLang.g:1203:1: ruleInternalFunction : ( ( rule__InternalFunction__Alternatives ) ) ;
    public final void ruleInternalFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1207:1: ( ( ( rule__InternalFunction__Alternatives ) ) )
            // InternalAspectLang.g:1208:1: ( ( rule__InternalFunction__Alternatives ) )
            {
            // InternalAspectLang.g:1208:1: ( ( rule__InternalFunction__Alternatives ) )
            // InternalAspectLang.g:1209:1: ( rule__InternalFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getInternalFunctionAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1210:1: ( rule__InternalFunction__Alternatives )
            // InternalAspectLang.g:1210:2: rule__InternalFunction__Alternatives
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
    // InternalAspectLang.g:1222:1: ruleReflectionFunction : ( ( rule__ReflectionFunction__Alternatives ) ) ;
    public final void ruleReflectionFunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1226:1: ( ( ( rule__ReflectionFunction__Alternatives ) ) )
            // InternalAspectLang.g:1227:1: ( ( rule__ReflectionFunction__Alternatives ) )
            {
            // InternalAspectLang.g:1227:1: ( ( rule__ReflectionFunction__Alternatives ) )
            // InternalAspectLang.g:1228:1: ( rule__ReflectionFunction__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionFunctionAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1229:1: ( rule__ReflectionFunction__Alternatives )
            // InternalAspectLang.g:1229:2: rule__ReflectionFunction__Alternatives
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


    // $ANTLR start "ruleTechnology"
    // InternalAspectLang.g:1241:1: ruleTechnology : ( ( rule__Technology__Alternatives ) ) ;
    public final void ruleTechnology() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1245:1: ( ( ( rule__Technology__Alternatives ) ) )
            // InternalAspectLang.g:1246:1: ( ( rule__Technology__Alternatives ) )
            {
            // InternalAspectLang.g:1246:1: ( ( rule__Technology__Alternatives ) )
            // InternalAspectLang.g:1247:1: ( rule__Technology__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTechnologyAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1248:1: ( rule__Technology__Alternatives )
            // InternalAspectLang.g:1248:2: rule__Technology__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Technology__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTechnologyAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTechnology"


    // $ANTLR start "ruleQueryModifier"
    // InternalAspectLang.g:1260:1: ruleQueryModifier : ( ( rule__QueryModifier__Alternatives ) ) ;
    public final void ruleQueryModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1264:1: ( ( ( rule__QueryModifier__Alternatives ) ) )
            // InternalAspectLang.g:1265:1: ( ( rule__QueryModifier__Alternatives ) )
            {
            // InternalAspectLang.g:1265:1: ( ( rule__QueryModifier__Alternatives ) )
            // InternalAspectLang.g:1266:1: ( rule__QueryModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQueryModifierAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1267:1: ( rule__QueryModifier__Alternatives )
            // InternalAspectLang.g:1267:2: rule__QueryModifier__Alternatives
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
    // InternalAspectLang.g:1279:1: ruleLogicOperator : ( ( rule__LogicOperator__Alternatives ) ) ;
    public final void ruleLogicOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1283:1: ( ( ( rule__LogicOperator__Alternatives ) ) )
            // InternalAspectLang.g:1284:1: ( ( rule__LogicOperator__Alternatives ) )
            {
            // InternalAspectLang.g:1284:1: ( ( rule__LogicOperator__Alternatives ) )
            // InternalAspectLang.g:1285:1: ( rule__LogicOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogicOperatorAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1286:1: ( rule__LogicOperator__Alternatives )
            // InternalAspectLang.g:1286:2: rule__LogicOperator__Alternatives
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
    // InternalAspectLang.g:1298:1: ruleCompareOperator : ( ( rule__CompareOperator__Alternatives ) ) ;
    public final void ruleCompareOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1302:1: ( ( ( rule__CompareOperator__Alternatives ) ) )
            // InternalAspectLang.g:1303:1: ( ( rule__CompareOperator__Alternatives ) )
            {
            // InternalAspectLang.g:1303:1: ( ( rule__CompareOperator__Alternatives ) )
            // InternalAspectLang.g:1304:1: ( rule__CompareOperator__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareOperatorAccess().getAlternatives()); 
            }
            // InternalAspectLang.g:1305:1: ( rule__CompareOperator__Alternatives )
            // InternalAspectLang.g:1305:2: rule__CompareOperator__Alternatives
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
    // InternalAspectLang.g:1316:1: rule__AspectModel__Alternatives_4 : ( ( ( rule__AspectModel__AdvicesAssignment_4_0 ) ) | ( ( rule__AspectModel__PointcutsAssignment_4_1 ) ) | ( ( rule__AspectModel__AspectsAssignment_4_2 ) ) );
    public final void rule__AspectModel__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1320:1: ( ( ( rule__AspectModel__AdvicesAssignment_4_0 ) ) | ( ( rule__AspectModel__PointcutsAssignment_4_1 ) ) | ( ( rule__AspectModel__AspectsAssignment_4_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt1=1;
                }
                break;
            case 55:
            case 59:
                {
                alt1=2;
                }
                break;
            case 43:
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
                    // InternalAspectLang.g:1321:1: ( ( rule__AspectModel__AdvicesAssignment_4_0 ) )
                    {
                    // InternalAspectLang.g:1321:1: ( ( rule__AspectModel__AdvicesAssignment_4_0 ) )
                    // InternalAspectLang.g:1322:1: ( rule__AspectModel__AdvicesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getAdvicesAssignment_4_0()); 
                    }
                    // InternalAspectLang.g:1323:1: ( rule__AspectModel__AdvicesAssignment_4_0 )
                    // InternalAspectLang.g:1323:2: rule__AspectModel__AdvicesAssignment_4_0
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
                    // InternalAspectLang.g:1327:6: ( ( rule__AspectModel__PointcutsAssignment_4_1 ) )
                    {
                    // InternalAspectLang.g:1327:6: ( ( rule__AspectModel__PointcutsAssignment_4_1 ) )
                    // InternalAspectLang.g:1328:1: ( rule__AspectModel__PointcutsAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getPointcutsAssignment_4_1()); 
                    }
                    // InternalAspectLang.g:1329:1: ( rule__AspectModel__PointcutsAssignment_4_1 )
                    // InternalAspectLang.g:1329:2: rule__AspectModel__PointcutsAssignment_4_1
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
                    // InternalAspectLang.g:1333:6: ( ( rule__AspectModel__AspectsAssignment_4_2 ) )
                    {
                    // InternalAspectLang.g:1333:6: ( ( rule__AspectModel__AspectsAssignment_4_2 ) )
                    // InternalAspectLang.g:1334:1: ( rule__AspectModel__AspectsAssignment_4_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAspectModelAccess().getAspectsAssignment_4_2()); 
                    }
                    // InternalAspectLang.g:1335:1: ( rule__AspectModel__AspectsAssignment_4_2 )
                    // InternalAspectLang.g:1335:2: rule__AspectModel__AspectsAssignment_4_2
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
    // InternalAspectLang.g:1344:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleReferenceValue ) | ( ruleInternalFunctionProperty ) | ( ruleAdviceParameter ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1348:1: ( ( ruleLiteral ) | ( ruleReferenceValue ) | ( ruleInternalFunctionProperty ) | ( ruleAdviceParameter ) )
            int alt2=4;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalAspectLang.g:1349:1: ( ruleLiteral )
                    {
                    // InternalAspectLang.g:1349:1: ( ruleLiteral )
                    // InternalAspectLang.g:1350:1: ruleLiteral
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
                    // InternalAspectLang.g:1355:6: ( ruleReferenceValue )
                    {
                    // InternalAspectLang.g:1355:6: ( ruleReferenceValue )
                    // InternalAspectLang.g:1356:1: ruleReferenceValue
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
                    // InternalAspectLang.g:1361:6: ( ruleInternalFunctionProperty )
                    {
                    // InternalAspectLang.g:1361:6: ( ruleInternalFunctionProperty )
                    // InternalAspectLang.g:1362:1: ruleInternalFunctionProperty
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
                    // InternalAspectLang.g:1367:6: ( ruleAdviceParameter )
                    {
                    // InternalAspectLang.g:1367:6: ( ruleAdviceParameter )
                    // InternalAspectLang.g:1368:1: ruleAdviceParameter
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
    // InternalAspectLang.g:1378:1: rule__Property__Alternatives : ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) );
    public final void rule__Property__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1382:1: ( ( ruleRuntimeProperty ) | ( ruleReflectionProperty ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==52) ) {
                alt3=1;
            }
            else if ( (LA3_0==51) ) {
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
                    // InternalAspectLang.g:1383:1: ( ruleRuntimeProperty )
                    {
                    // InternalAspectLang.g:1383:1: ( ruleRuntimeProperty )
                    // InternalAspectLang.g:1384:1: ruleRuntimeProperty
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
                    // InternalAspectLang.g:1389:6: ( ruleReflectionProperty )
                    {
                    // InternalAspectLang.g:1389:6: ( ruleReflectionProperty )
                    // InternalAspectLang.g:1390:1: ruleReflectionProperty
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


    // $ANTLR start "rule__LocationQuery__Alternatives_2"
    // InternalAspectLang.g:1401:1: rule__LocationQuery__Alternatives_2 : ( ( ( rule__LocationQuery__Group_2_0__0 ) ) | ( ( rule__LocationQuery__CompositionAssignment_2_1 ) ) );
    public final void rule__LocationQuery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1405:1: ( ( ( rule__LocationQuery__Group_2_0__0 ) ) | ( ( rule__LocationQuery__CompositionAssignment_2_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==57) ) {
                alt4=1;
            }
            else if ( (LA4_0==49) ) {
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
                    // InternalAspectLang.g:1406:1: ( ( rule__LocationQuery__Group_2_0__0 ) )
                    {
                    // InternalAspectLang.g:1406:1: ( ( rule__LocationQuery__Group_2_0__0 ) )
                    // InternalAspectLang.g:1407:1: ( rule__LocationQuery__Group_2_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationQueryAccess().getGroup_2_0()); 
                    }
                    // InternalAspectLang.g:1408:1: ( rule__LocationQuery__Group_2_0__0 )
                    // InternalAspectLang.g:1408:2: rule__LocationQuery__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocationQuery__Group_2_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLocationQueryAccess().getGroup_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1412:6: ( ( rule__LocationQuery__CompositionAssignment_2_1 ) )
                    {
                    // InternalAspectLang.g:1412:6: ( ( rule__LocationQuery__CompositionAssignment_2_1 ) )
                    // InternalAspectLang.g:1413:1: ( rule__LocationQuery__CompositionAssignment_2_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocationQueryAccess().getCompositionAssignment_2_1()); 
                    }
                    // InternalAspectLang.g:1414:1: ( rule__LocationQuery__CompositionAssignment_2_1 )
                    // InternalAspectLang.g:1414:2: rule__LocationQuery__CompositionAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocationQuery__CompositionAssignment_2_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLocationQueryAccess().getCompositionAssignment_2_1()); 
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
    // $ANTLR end "rule__LocationQuery__Alternatives_2"


    // $ANTLR start "rule__OperationQuery__Alternatives_3"
    // InternalAspectLang.g:1423:1: rule__OperationQuery__Alternatives_3 : ( ( ( rule__OperationQuery__Group_3_0__0 ) ) | ( '*' ) );
    public final void rule__OperationQuery__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1427:1: ( ( ( rule__OperationQuery__Group_3_0__0 ) ) | ( '*' ) )
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
                    // InternalAspectLang.g:1428:1: ( ( rule__OperationQuery__Group_3_0__0 ) )
                    {
                    // InternalAspectLang.g:1428:1: ( ( rule__OperationQuery__Group_3_0__0 ) )
                    // InternalAspectLang.g:1429:1: ( rule__OperationQuery__Group_3_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getOperationQueryAccess().getGroup_3_0()); 
                    }
                    // InternalAspectLang.g:1430:1: ( rule__OperationQuery__Group_3_0__0 )
                    // InternalAspectLang.g:1430:2: rule__OperationQuery__Group_3_0__0
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
                    // InternalAspectLang.g:1434:6: ( '*' )
                    {
                    // InternalAspectLang.g:1434:6: ( '*' )
                    // InternalAspectLang.g:1435:1: '*'
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
    // InternalAspectLang.g:1447:1: rule__ParameterQuery__Alternatives_2 : ( ( ( rule__ParameterQuery__TypeAssignment_2_0 ) ) | ( '*' ) );
    public final void rule__ParameterQuery__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1451:1: ( ( ( rule__ParameterQuery__TypeAssignment_2_0 ) ) | ( '*' ) )
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
                    // InternalAspectLang.g:1452:1: ( ( rule__ParameterQuery__TypeAssignment_2_0 ) )
                    {
                    // InternalAspectLang.g:1452:1: ( ( rule__ParameterQuery__TypeAssignment_2_0 ) )
                    // InternalAspectLang.g:1453:1: ( rule__ParameterQuery__TypeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getParameterQueryAccess().getTypeAssignment_2_0()); 
                    }
                    // InternalAspectLang.g:1454:1: ( rule__ParameterQuery__TypeAssignment_2_0 )
                    // InternalAspectLang.g:1454:2: rule__ParameterQuery__TypeAssignment_2_0
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
                    // InternalAspectLang.g:1458:6: ( '*' )
                    {
                    // InternalAspectLang.g:1458:6: ( '*' )
                    // InternalAspectLang.g:1459:1: '*'
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
    // InternalAspectLang.g:1471:1: rule__Node__Alternatives_0 : ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) );
    public final void rule__Node__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1475:1: ( ( ruleSubPathNode ) | ( ruleWildcardNode ) | ( ruleParentNode ) | ( ruleContainerNode ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 61:
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
                    // InternalAspectLang.g:1476:1: ( ruleSubPathNode )
                    {
                    // InternalAspectLang.g:1476:1: ( ruleSubPathNode )
                    // InternalAspectLang.g:1477:1: ruleSubPathNode
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
                    // InternalAspectLang.g:1482:6: ( ruleWildcardNode )
                    {
                    // InternalAspectLang.g:1482:6: ( ruleWildcardNode )
                    // InternalAspectLang.g:1483:1: ruleWildcardNode
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
                    // InternalAspectLang.g:1488:6: ( ruleParentNode )
                    {
                    // InternalAspectLang.g:1488:6: ( ruleParentNode )
                    // InternalAspectLang.g:1489:1: ruleParentNode
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
                    // InternalAspectLang.g:1494:6: ( ruleContainerNode )
                    {
                    // InternalAspectLang.g:1494:6: ( ruleContainerNode )
                    // InternalAspectLang.g:1495:1: ruleContainerNode
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
    // InternalAspectLang.g:1505:1: rule__ConstraintElement__Alternatives : ( ( ruleLiteral ) | ( ruleLocalQuery ) );
    public final void rule__ConstraintElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1509:1: ( ( ruleLiteral ) | ( ruleLocalQuery ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=RULE_STRING && LA8_0<=RULE_INT)) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID||LA8_0==13||(LA8_0>=28 && LA8_0<=29)||LA8_0==52||(LA8_0>=60 && LA8_0<=62)) ) {
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
                    // InternalAspectLang.g:1510:1: ( ruleLiteral )
                    {
                    // InternalAspectLang.g:1510:1: ( ruleLiteral )
                    // InternalAspectLang.g:1511:1: ruleLiteral
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
                    // InternalAspectLang.g:1516:6: ( ruleLocalQuery )
                    {
                    // InternalAspectLang.g:1516:6: ( ruleLocalQuery )
                    // InternalAspectLang.g:1517:1: ruleLocalQuery
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
    // InternalAspectLang.g:1527:1: rule__LocalQuery__Alternatives_1 : ( ( ( rule__LocalQuery__PropertyAssignment_1_0 ) ) | ( ( rule__LocalQuery__TypeofAssignment_1_1 ) ) );
    public final void rule__LocalQuery__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1531:1: ( ( ( rule__LocalQuery__PropertyAssignment_1_0 ) ) | ( ( rule__LocalQuery__TypeofAssignment_1_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==52) ) {
                alt9=1;
            }
            else if ( (LA9_0==62) ) {
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
                    // InternalAspectLang.g:1532:1: ( ( rule__LocalQuery__PropertyAssignment_1_0 ) )
                    {
                    // InternalAspectLang.g:1532:1: ( ( rule__LocalQuery__PropertyAssignment_1_0 ) )
                    // InternalAspectLang.g:1533:1: ( rule__LocalQuery__PropertyAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocalQueryAccess().getPropertyAssignment_1_0()); 
                    }
                    // InternalAspectLang.g:1534:1: ( rule__LocalQuery__PropertyAssignment_1_0 )
                    // InternalAspectLang.g:1534:2: rule__LocalQuery__PropertyAssignment_1_0
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
                    // InternalAspectLang.g:1538:6: ( ( rule__LocalQuery__TypeofAssignment_1_1 ) )
                    {
                    // InternalAspectLang.g:1538:6: ( ( rule__LocalQuery__TypeofAssignment_1_1 ) )
                    // InternalAspectLang.g:1539:1: ( rule__LocalQuery__TypeofAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLocalQueryAccess().getTypeofAssignment_1_1()); 
                    }
                    // InternalAspectLang.g:1540:1: ( rule__LocalQuery__TypeofAssignment_1_1 )
                    // InternalAspectLang.g:1540:2: rule__LocalQuery__TypeofAssignment_1_1
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
    // InternalAspectLang.g:1549:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1553:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) )
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
                    // InternalAspectLang.g:1554:1: ( ruleStringLiteral )
                    {
                    // InternalAspectLang.g:1554:1: ( ruleStringLiteral )
                    // InternalAspectLang.g:1555:1: ruleStringLiteral
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
                    // InternalAspectLang.g:1560:6: ( ruleIntLiteral )
                    {
                    // InternalAspectLang.g:1560:6: ( ruleIntLiteral )
                    // InternalAspectLang.g:1561:1: ruleIntLiteral
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
                    // InternalAspectLang.g:1566:6: ( ruleFloatLiteral )
                    {
                    // InternalAspectLang.g:1566:6: ( ruleFloatLiteral )
                    // InternalAspectLang.g:1567:1: ruleFloatLiteral
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
    // InternalAspectLang.g:1577:1: rule__InsertionPoint__Alternatives : ( ( ( 'before' ) ) | ( ( 'after' ) ) | ( ( 'exception' ) ) );
    public final void rule__InsertionPoint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1581:1: ( ( ( 'before' ) ) | ( ( 'after' ) ) | ( ( 'exception' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt11=1;
                }
                break;
            case 15:
                {
                alt11=2;
                }
                break;
            case 16:
                {
                alt11=3;
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
                    // InternalAspectLang.g:1582:1: ( ( 'before' ) )
                    {
                    // InternalAspectLang.g:1582:1: ( ( 'before' ) )
                    // InternalAspectLang.g:1583:1: ( 'before' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getBEFOREEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1584:1: ( 'before' )
                    // InternalAspectLang.g:1584:3: 'before'
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
                    // InternalAspectLang.g:1589:6: ( ( 'after' ) )
                    {
                    // InternalAspectLang.g:1589:6: ( ( 'after' ) )
                    // InternalAspectLang.g:1590:1: ( 'after' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1591:1: ( 'after' )
                    // InternalAspectLang.g:1591:3: 'after'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getAFTEREnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1596:6: ( ( 'exception' ) )
                    {
                    // InternalAspectLang.g:1596:6: ( ( 'exception' ) )
                    // InternalAspectLang.g:1597:1: ( 'exception' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInsertionPointAccess().getAFTER_EXCEPTIONEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1598:1: ( 'exception' )
                    // InternalAspectLang.g:1598:3: 'exception'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInsertionPointAccess().getAFTER_EXCEPTIONEnumLiteralDeclaration_2()); 
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
    // InternalAspectLang.g:1608:1: rule__InternalFunction__Alternatives : ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) );
    public final void rule__InternalFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1612:1: ( ( ( 'time' ) ) | ( ( 'traceId' ) ) | ( ( 'orderIndex' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                alt12=2;
                }
                break;
            case 19:
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
                    // InternalAspectLang.g:1613:1: ( ( 'time' ) )
                    {
                    // InternalAspectLang.g:1613:1: ( ( 'time' ) )
                    // InternalAspectLang.g:1614:1: ( 'time' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1615:1: ( 'time' )
                    // InternalAspectLang.g:1615:3: 'time'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getTIMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1620:6: ( ( 'traceId' ) )
                    {
                    // InternalAspectLang.g:1620:6: ( ( 'traceId' ) )
                    // InternalAspectLang.g:1621:1: ( 'traceId' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1622:1: ( 'traceId' )
                    // InternalAspectLang.g:1622:3: 'traceId'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getInternalFunctionAccess().getTRACE_IDEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1627:6: ( ( 'orderIndex' ) )
                    {
                    // InternalAspectLang.g:1627:6: ( ( 'orderIndex' ) )
                    // InternalAspectLang.g:1628:1: ( 'orderIndex' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getInternalFunctionAccess().getORDER_INDEXEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1629:1: ( 'orderIndex' )
                    // InternalAspectLang.g:1629:3: 'orderIndex'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:1639:1: rule__ReflectionFunction__Alternatives : ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'classname' ) ) | ( ( 'return-type' ) ) );
    public final void rule__ReflectionFunction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1643:1: ( ( ( 'name' ) ) | ( ( 'signature' ) ) | ( ( 'classname' ) ) | ( ( 'return-type' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt13=1;
                }
                break;
            case 21:
                {
                alt13=2;
                }
                break;
            case 22:
                {
                alt13=3;
                }
                break;
            case 23:
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
                    // InternalAspectLang.g:1644:1: ( ( 'name' ) )
                    {
                    // InternalAspectLang.g:1644:1: ( ( 'name' ) )
                    // InternalAspectLang.g:1645:1: ( 'name' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1646:1: ( 'name' )
                    // InternalAspectLang.g:1646:3: 'name'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getNAMEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1651:6: ( ( 'signature' ) )
                    {
                    // InternalAspectLang.g:1651:6: ( ( 'signature' ) )
                    // InternalAspectLang.g:1652:1: ( 'signature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1653:1: ( 'signature' )
                    // InternalAspectLang.g:1653:3: 'signature'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getSIGNATUREEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1658:6: ( ( 'classname' ) )
                    {
                    // InternalAspectLang.g:1658:6: ( ( 'classname' ) )
                    // InternalAspectLang.g:1659:1: ( 'classname' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1660:1: ( 'classname' )
                    // InternalAspectLang.g:1660:3: 'classname'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getReflectionFunctionAccess().getCLASSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:1665:6: ( ( 'return-type' ) )
                    {
                    // InternalAspectLang.g:1665:6: ( ( 'return-type' ) )
                    // InternalAspectLang.g:1666:1: ( 'return-type' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getReflectionFunctionAccess().getRETURN_TYPEEnumLiteralDeclaration_3()); 
                    }
                    // InternalAspectLang.g:1667:1: ( 'return-type' )
                    // InternalAspectLang.g:1667:3: 'return-type'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

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


    // $ANTLR start "rule__Technology__Alternatives"
    // InternalAspectLang.g:1677:1: rule__Technology__Alternatives : ( ( ( 'javaee' ) ) | ( ( 'servlet' ) ) | ( ( 'spring' ) ) | ( ( 'aspectj' ) ) );
    public final void rule__Technology__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1681:1: ( ( ( 'javaee' ) ) | ( ( 'servlet' ) ) | ( ( 'spring' ) ) | ( ( 'aspectj' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt14=1;
                }
                break;
            case 25:
                {
                alt14=2;
                }
                break;
            case 26:
                {
                alt14=3;
                }
                break;
            case 27:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalAspectLang.g:1682:1: ( ( 'javaee' ) )
                    {
                    // InternalAspectLang.g:1682:1: ( ( 'javaee' ) )
                    // InternalAspectLang.g:1683:1: ( 'javaee' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTechnologyAccess().getJAVA_EEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1684:1: ( 'javaee' )
                    // InternalAspectLang.g:1684:3: 'javaee'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTechnologyAccess().getJAVA_EEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1689:6: ( ( 'servlet' ) )
                    {
                    // InternalAspectLang.g:1689:6: ( ( 'servlet' ) )
                    // InternalAspectLang.g:1690:1: ( 'servlet' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTechnologyAccess().getSERVLETEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1691:1: ( 'servlet' )
                    // InternalAspectLang.g:1691:3: 'servlet'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTechnologyAccess().getSERVLETEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1696:6: ( ( 'spring' ) )
                    {
                    // InternalAspectLang.g:1696:6: ( ( 'spring' ) )
                    // InternalAspectLang.g:1697:1: ( 'spring' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTechnologyAccess().getSPRINGEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1698:1: ( 'spring' )
                    // InternalAspectLang.g:1698:3: 'spring'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTechnologyAccess().getSPRINGEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:1703:6: ( ( 'aspectj' ) )
                    {
                    // InternalAspectLang.g:1703:6: ( ( 'aspectj' ) )
                    // InternalAspectLang.g:1704:1: ( 'aspectj' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTechnologyAccess().getASPECT_JEnumLiteralDeclaration_3()); 
                    }
                    // InternalAspectLang.g:1705:1: ( 'aspectj' )
                    // InternalAspectLang.g:1705:3: 'aspectj'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTechnologyAccess().getASPECT_JEnumLiteralDeclaration_3()); 
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
    // $ANTLR end "rule__Technology__Alternatives"


    // $ANTLR start "rule__QueryModifier__Alternatives"
    // InternalAspectLang.g:1715:1: rule__QueryModifier__Alternatives : ( ( ( 'include' ) ) | ( ( 'exclude' ) ) );
    public final void rule__QueryModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1719:1: ( ( ( 'include' ) ) | ( ( 'exclude' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            else if ( (LA15_0==29) ) {
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
                    // InternalAspectLang.g:1720:1: ( ( 'include' ) )
                    {
                    // InternalAspectLang.g:1720:1: ( ( 'include' ) )
                    // InternalAspectLang.g:1721:1: ( 'include' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1722:1: ( 'include' )
                    // InternalAspectLang.g:1722:3: 'include'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getQueryModifierAccess().getINCLUDEEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1727:6: ( ( 'exclude' ) )
                    {
                    // InternalAspectLang.g:1727:6: ( ( 'exclude' ) )
                    // InternalAspectLang.g:1728:1: ( 'exclude' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getQueryModifierAccess().getEXCLUDEEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1729:1: ( 'exclude' )
                    // InternalAspectLang.g:1729:3: 'exclude'
                    {
                    match(input,29,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:1739:1: rule__LogicOperator__Alternatives : ( ( ( '&&' ) ) | ( ( '||' ) ) );
    public final void rule__LogicOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1743:1: ( ( ( '&&' ) ) | ( ( '||' ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            else if ( (LA16_0==31) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalAspectLang.g:1744:1: ( ( '&&' ) )
                    {
                    // InternalAspectLang.g:1744:1: ( ( '&&' ) )
                    // InternalAspectLang.g:1745:1: ( '&&' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1746:1: ( '&&' )
                    // InternalAspectLang.g:1746:3: '&&'
                    {
                    match(input,30,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogicOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1751:6: ( ( '||' ) )
                    {
                    // InternalAspectLang.g:1751:6: ( ( '||' ) )
                    // InternalAspectLang.g:1752:1: ( '||' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogicOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1753:1: ( '||' )
                    // InternalAspectLang.g:1753:3: '||'
                    {
                    match(input,31,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:1763:1: rule__CompareOperator__Alternatives : ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__CompareOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1767:1: ( ( ( '=' ) ) | ( ( '~' ) ) | ( ( '!=' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt17=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt17=1;
                }
                break;
            case 33:
                {
                alt17=2;
                }
                break;
            case 34:
                {
                alt17=3;
                }
                break;
            case 35:
                {
                alt17=4;
                }
                break;
            case 36:
                {
                alt17=5;
                }
                break;
            case 37:
                {
                alt17=6;
                }
                break;
            case 38:
                {
                alt17=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalAspectLang.g:1768:1: ( ( '=' ) )
                    {
                    // InternalAspectLang.g:1768:1: ( ( '=' ) )
                    // InternalAspectLang.g:1769:1: ( '=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }
                    // InternalAspectLang.g:1770:1: ( '=' )
                    // InternalAspectLang.g:1770:3: '='
                    {
                    match(input,32,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getEQEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalAspectLang.g:1775:6: ( ( '~' ) )
                    {
                    // InternalAspectLang.g:1775:6: ( ( '~' ) )
                    // InternalAspectLang.g:1776:1: ( '~' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }
                    // InternalAspectLang.g:1777:1: ( '~' )
                    // InternalAspectLang.g:1777:3: '~'
                    {
                    match(input,33,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLIKEEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalAspectLang.g:1782:6: ( ( '!=' ) )
                    {
                    // InternalAspectLang.g:1782:6: ( ( '!=' ) )
                    // InternalAspectLang.g:1783:1: ( '!=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }
                    // InternalAspectLang.g:1784:1: ( '!=' )
                    // InternalAspectLang.g:1784:3: '!='
                    {
                    match(input,34,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getNEEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalAspectLang.g:1789:6: ( ( '>' ) )
                    {
                    // InternalAspectLang.g:1789:6: ( ( '>' ) )
                    // InternalAspectLang.g:1790:1: ( '>' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }
                    // InternalAspectLang.g:1791:1: ( '>' )
                    // InternalAspectLang.g:1791:3: '>'
                    {
                    match(input,35,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGREnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalAspectLang.g:1796:6: ( ( '<' ) )
                    {
                    // InternalAspectLang.g:1796:6: ( ( '<' ) )
                    // InternalAspectLang.g:1797:1: ( '<' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }
                    // InternalAspectLang.g:1798:1: ( '<' )
                    // InternalAspectLang.g:1798:3: '<'
                    {
                    match(input,36,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getLWEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalAspectLang.g:1803:6: ( ( '>=' ) )
                    {
                    // InternalAspectLang.g:1803:6: ( ( '>=' ) )
                    // InternalAspectLang.g:1804:1: ( '>=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }
                    // InternalAspectLang.g:1805:1: ( '>=' )
                    // InternalAspectLang.g:1805:3: '>='
                    {
                    match(input,37,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareOperatorAccess().getGEEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalAspectLang.g:1810:6: ( ( '<=' ) )
                    {
                    // InternalAspectLang.g:1810:6: ( ( '<=' ) )
                    // InternalAspectLang.g:1811:1: ( '<=' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareOperatorAccess().getLEEnumLiteralDeclaration_6()); 
                    }
                    // InternalAspectLang.g:1812:1: ( '<=' )
                    // InternalAspectLang.g:1812:3: '<='
                    {
                    match(input,38,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:1824:1: rule__AspectModel__Group__0 : rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1 ;
    public final void rule__AspectModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1828:1: ( rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1 )
            // InternalAspectLang.g:1829:2: rule__AspectModel__Group__0__Impl rule__AspectModel__Group__1
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
    // InternalAspectLang.g:1836:1: rule__AspectModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__AspectModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1840:1: ( ( 'package' ) )
            // InternalAspectLang.g:1841:1: ( 'package' )
            {
            // InternalAspectLang.g:1841:1: ( 'package' )
            // InternalAspectLang.g:1842:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getPackageKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:1855:1: rule__AspectModel__Group__1 : rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2 ;
    public final void rule__AspectModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1859:1: ( rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2 )
            // InternalAspectLang.g:1860:2: rule__AspectModel__Group__1__Impl rule__AspectModel__Group__2
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
    // InternalAspectLang.g:1867:1: rule__AspectModel__Group__1__Impl : ( ( rule__AspectModel__NameAssignment_1 ) ) ;
    public final void rule__AspectModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1871:1: ( ( ( rule__AspectModel__NameAssignment_1 ) ) )
            // InternalAspectLang.g:1872:1: ( ( rule__AspectModel__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:1872:1: ( ( rule__AspectModel__NameAssignment_1 ) )
            // InternalAspectLang.g:1873:1: ( rule__AspectModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:1874:1: ( rule__AspectModel__NameAssignment_1 )
            // InternalAspectLang.g:1874:2: rule__AspectModel__NameAssignment_1
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
    // InternalAspectLang.g:1884:1: rule__AspectModel__Group__2 : rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3 ;
    public final void rule__AspectModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1888:1: ( rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3 )
            // InternalAspectLang.g:1889:2: rule__AspectModel__Group__2__Impl rule__AspectModel__Group__3
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
    // InternalAspectLang.g:1896:1: rule__AspectModel__Group__2__Impl : ( ( rule__AspectModel__ImportsAssignment_2 )* ) ;
    public final void rule__AspectModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1900:1: ( ( ( rule__AspectModel__ImportsAssignment_2 )* ) )
            // InternalAspectLang.g:1901:1: ( ( rule__AspectModel__ImportsAssignment_2 )* )
            {
            // InternalAspectLang.g:1901:1: ( ( rule__AspectModel__ImportsAssignment_2 )* )
            // InternalAspectLang.g:1902:1: ( rule__AspectModel__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getImportsAssignment_2()); 
            }
            // InternalAspectLang.g:1903:1: ( rule__AspectModel__ImportsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==40) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalAspectLang.g:1903:2: rule__AspectModel__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__AspectModel__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalAspectLang.g:1913:1: rule__AspectModel__Group__3 : rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4 ;
    public final void rule__AspectModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1917:1: ( rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4 )
            // InternalAspectLang.g:1918:2: rule__AspectModel__Group__3__Impl rule__AspectModel__Group__4
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
    // InternalAspectLang.g:1925:1: rule__AspectModel__Group__3__Impl : ( ( rule__AspectModel__SourcesAssignment_3 )* ) ;
    public final void rule__AspectModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1929:1: ( ( ( rule__AspectModel__SourcesAssignment_3 )* ) )
            // InternalAspectLang.g:1930:1: ( ( rule__AspectModel__SourcesAssignment_3 )* )
            {
            // InternalAspectLang.g:1930:1: ( ( rule__AspectModel__SourcesAssignment_3 )* )
            // InternalAspectLang.g:1931:1: ( rule__AspectModel__SourcesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getSourcesAssignment_3()); 
            }
            // InternalAspectLang.g:1932:1: ( rule__AspectModel__SourcesAssignment_3 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalAspectLang.g:1932:2: rule__AspectModel__SourcesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__AspectModel__SourcesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalAspectLang.g:1942:1: rule__AspectModel__Group__4 : rule__AspectModel__Group__4__Impl ;
    public final void rule__AspectModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1946:1: ( rule__AspectModel__Group__4__Impl )
            // InternalAspectLang.g:1947:2: rule__AspectModel__Group__4__Impl
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
    // InternalAspectLang.g:1953:1: rule__AspectModel__Group__4__Impl : ( ( rule__AspectModel__Alternatives_4 )* ) ;
    public final void rule__AspectModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1957:1: ( ( ( rule__AspectModel__Alternatives_4 )* ) )
            // InternalAspectLang.g:1958:1: ( ( rule__AspectModel__Alternatives_4 )* )
            {
            // InternalAspectLang.g:1958:1: ( ( rule__AspectModel__Alternatives_4 )* )
            // InternalAspectLang.g:1959:1: ( rule__AspectModel__Alternatives_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectModelAccess().getAlternatives_4()); 
            }
            // InternalAspectLang.g:1960:1: ( rule__AspectModel__Alternatives_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==43||LA20_0==48||LA20_0==55||LA20_0==59) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalAspectLang.g:1960:2: rule__AspectModel__Alternatives_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__AspectModel__Alternatives_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalAspectLang.g:1980:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1984:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalAspectLang.g:1985:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalAspectLang.g:1992:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:1996:1: ( ( 'import' ) )
            // InternalAspectLang.g:1997:1: ( 'import' )
            {
            // InternalAspectLang.g:1997:1: ( 'import' )
            // InternalAspectLang.g:1998:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2011:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2015:1: ( rule__Import__Group__1__Impl )
            // InternalAspectLang.g:2016:2: rule__Import__Group__1__Impl
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
    // InternalAspectLang.g:2022:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2026:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalAspectLang.g:2027:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalAspectLang.g:2027:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalAspectLang.g:2028:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalAspectLang.g:2029:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalAspectLang.g:2029:2: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalAspectLang.g:2043:1: rule__ApplicationModel__Group__0 : rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 ;
    public final void rule__ApplicationModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2047:1: ( rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1 )
            // InternalAspectLang.g:2048:2: rule__ApplicationModel__Group__0__Impl rule__ApplicationModel__Group__1
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
    // InternalAspectLang.g:2055:1: rule__ApplicationModel__Group__0__Impl : ( 'use' ) ;
    public final void rule__ApplicationModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2059:1: ( ( 'use' ) )
            // InternalAspectLang.g:2060:1: ( 'use' )
            {
            // InternalAspectLang.g:2060:1: ( 'use' )
            // InternalAspectLang.g:2061:1: 'use'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getUseKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2074:1: rule__ApplicationModel__Group__1 : rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 ;
    public final void rule__ApplicationModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2078:1: ( rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2 )
            // InternalAspectLang.g:2079:2: rule__ApplicationModel__Group__1__Impl rule__ApplicationModel__Group__2
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
    // InternalAspectLang.g:2086:1: rule__ApplicationModel__Group__1__Impl : ( ( rule__ApplicationModel__HandlerAssignment_1 ) ) ;
    public final void rule__ApplicationModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2090:1: ( ( ( rule__ApplicationModel__HandlerAssignment_1 ) ) )
            // InternalAspectLang.g:2091:1: ( ( rule__ApplicationModel__HandlerAssignment_1 ) )
            {
            // InternalAspectLang.g:2091:1: ( ( rule__ApplicationModel__HandlerAssignment_1 ) )
            // InternalAspectLang.g:2092:1: ( rule__ApplicationModel__HandlerAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getHandlerAssignment_1()); 
            }
            // InternalAspectLang.g:2093:1: ( rule__ApplicationModel__HandlerAssignment_1 )
            // InternalAspectLang.g:2093:2: rule__ApplicationModel__HandlerAssignment_1
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
    // InternalAspectLang.g:2103:1: rule__ApplicationModel__Group__2 : rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 ;
    public final void rule__ApplicationModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2107:1: ( rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3 )
            // InternalAspectLang.g:2108:2: rule__ApplicationModel__Group__2__Impl rule__ApplicationModel__Group__3
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
    // InternalAspectLang.g:2115:1: rule__ApplicationModel__Group__2__Impl : ( 'on' ) ;
    public final void rule__ApplicationModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2119:1: ( ( 'on' ) )
            // InternalAspectLang.g:2120:1: ( 'on' )
            {
            // InternalAspectLang.g:2120:1: ( 'on' )
            // InternalAspectLang.g:2121:1: 'on'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getOnKeyword_2()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2134:1: rule__ApplicationModel__Group__3 : rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 ;
    public final void rule__ApplicationModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2138:1: ( rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4 )
            // InternalAspectLang.g:2139:2: rule__ApplicationModel__Group__3__Impl rule__ApplicationModel__Group__4
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
    // InternalAspectLang.g:2146:1: rule__ApplicationModel__Group__3__Impl : ( ( rule__ApplicationModel__NameAssignment_3 ) ) ;
    public final void rule__ApplicationModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2150:1: ( ( ( rule__ApplicationModel__NameAssignment_3 ) ) )
            // InternalAspectLang.g:2151:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            {
            // InternalAspectLang.g:2151:1: ( ( rule__ApplicationModel__NameAssignment_3 ) )
            // InternalAspectLang.g:2152:1: ( rule__ApplicationModel__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getNameAssignment_3()); 
            }
            // InternalAspectLang.g:2153:1: ( rule__ApplicationModel__NameAssignment_3 )
            // InternalAspectLang.g:2153:2: rule__ApplicationModel__NameAssignment_3
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
    // InternalAspectLang.g:2163:1: rule__ApplicationModel__Group__4 : rule__ApplicationModel__Group__4__Impl ;
    public final void rule__ApplicationModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2167:1: ( rule__ApplicationModel__Group__4__Impl )
            // InternalAspectLang.g:2168:2: rule__ApplicationModel__Group__4__Impl
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
    // InternalAspectLang.g:2174:1: rule__ApplicationModel__Group__4__Impl : ( ( rule__ApplicationModel__ModelAssignment_4 ) ) ;
    public final void rule__ApplicationModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2178:1: ( ( ( rule__ApplicationModel__ModelAssignment_4 ) ) )
            // InternalAspectLang.g:2179:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            {
            // InternalAspectLang.g:2179:1: ( ( rule__ApplicationModel__ModelAssignment_4 ) )
            // InternalAspectLang.g:2180:1: ( rule__ApplicationModel__ModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getApplicationModelAccess().getModelAssignment_4()); 
            }
            // InternalAspectLang.g:2181:1: ( rule__ApplicationModel__ModelAssignment_4 )
            // InternalAspectLang.g:2181:2: rule__ApplicationModel__ModelAssignment_4
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
    // InternalAspectLang.g:2201:1: rule__Aspect__Group__0 : rule__Aspect__Group__0__Impl rule__Aspect__Group__1 ;
    public final void rule__Aspect__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2205:1: ( rule__Aspect__Group__0__Impl rule__Aspect__Group__1 )
            // InternalAspectLang.g:2206:2: rule__Aspect__Group__0__Impl rule__Aspect__Group__1
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
    // InternalAspectLang.g:2213:1: rule__Aspect__Group__0__Impl : ( 'aspect' ) ;
    public final void rule__Aspect__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2217:1: ( ( 'aspect' ) )
            // InternalAspectLang.g:2218:1: ( 'aspect' )
            {
            // InternalAspectLang.g:2218:1: ( 'aspect' )
            // InternalAspectLang.g:2219:1: 'aspect'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAspectKeyword_0()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2232:1: rule__Aspect__Group__1 : rule__Aspect__Group__1__Impl rule__Aspect__Group__2 ;
    public final void rule__Aspect__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2236:1: ( rule__Aspect__Group__1__Impl rule__Aspect__Group__2 )
            // InternalAspectLang.g:2237:2: rule__Aspect__Group__1__Impl rule__Aspect__Group__2
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
    // InternalAspectLang.g:2244:1: rule__Aspect__Group__1__Impl : ( ( rule__Aspect__PointcutAssignment_1 ) ) ;
    public final void rule__Aspect__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2248:1: ( ( ( rule__Aspect__PointcutAssignment_1 ) ) )
            // InternalAspectLang.g:2249:1: ( ( rule__Aspect__PointcutAssignment_1 ) )
            {
            // InternalAspectLang.g:2249:1: ( ( rule__Aspect__PointcutAssignment_1 ) )
            // InternalAspectLang.g:2250:1: ( rule__Aspect__PointcutAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutAssignment_1()); 
            }
            // InternalAspectLang.g:2251:1: ( rule__Aspect__PointcutAssignment_1 )
            // InternalAspectLang.g:2251:2: rule__Aspect__PointcutAssignment_1
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
    // InternalAspectLang.g:2261:1: rule__Aspect__Group__2 : rule__Aspect__Group__2__Impl rule__Aspect__Group__3 ;
    public final void rule__Aspect__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2265:1: ( rule__Aspect__Group__2__Impl rule__Aspect__Group__3 )
            // InternalAspectLang.g:2266:2: rule__Aspect__Group__2__Impl rule__Aspect__Group__3
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
    // InternalAspectLang.g:2273:1: rule__Aspect__Group__2__Impl : ( ':' ) ;
    public final void rule__Aspect__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2277:1: ( ( ':' ) )
            // InternalAspectLang.g:2278:1: ( ':' )
            {
            // InternalAspectLang.g:2278:1: ( ':' )
            // InternalAspectLang.g:2279:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getColonKeyword_2()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2292:1: rule__Aspect__Group__3 : rule__Aspect__Group__3__Impl rule__Aspect__Group__4 ;
    public final void rule__Aspect__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2296:1: ( rule__Aspect__Group__3__Impl rule__Aspect__Group__4 )
            // InternalAspectLang.g:2297:2: rule__Aspect__Group__3__Impl rule__Aspect__Group__4
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
    // InternalAspectLang.g:2304:1: rule__Aspect__Group__3__Impl : ( ( rule__Aspect__AdvicesAssignment_3 ) ) ;
    public final void rule__Aspect__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2308:1: ( ( ( rule__Aspect__AdvicesAssignment_3 ) ) )
            // InternalAspectLang.g:2309:1: ( ( rule__Aspect__AdvicesAssignment_3 ) )
            {
            // InternalAspectLang.g:2309:1: ( ( rule__Aspect__AdvicesAssignment_3 ) )
            // InternalAspectLang.g:2310:1: ( rule__Aspect__AdvicesAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesAssignment_3()); 
            }
            // InternalAspectLang.g:2311:1: ( rule__Aspect__AdvicesAssignment_3 )
            // InternalAspectLang.g:2311:2: rule__Aspect__AdvicesAssignment_3
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
    // InternalAspectLang.g:2321:1: rule__Aspect__Group__4 : rule__Aspect__Group__4__Impl ;
    public final void rule__Aspect__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2325:1: ( rule__Aspect__Group__4__Impl )
            // InternalAspectLang.g:2326:2: rule__Aspect__Group__4__Impl
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
    // InternalAspectLang.g:2332:1: rule__Aspect__Group__4__Impl : ( ( rule__Aspect__Group_4__0 )* ) ;
    public final void rule__Aspect__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2336:1: ( ( ( rule__Aspect__Group_4__0 )* ) )
            // InternalAspectLang.g:2337:1: ( ( rule__Aspect__Group_4__0 )* )
            {
            // InternalAspectLang.g:2337:1: ( ( rule__Aspect__Group_4__0 )* )
            // InternalAspectLang.g:2338:1: ( rule__Aspect__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getGroup_4()); 
            }
            // InternalAspectLang.g:2339:1: ( rule__Aspect__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalAspectLang.g:2339:2: rule__Aspect__Group_4__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Aspect__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalAspectLang.g:2359:1: rule__Aspect__Group_4__0 : rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1 ;
    public final void rule__Aspect__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2363:1: ( rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1 )
            // InternalAspectLang.g:2364:2: rule__Aspect__Group_4__0__Impl rule__Aspect__Group_4__1
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
    // InternalAspectLang.g:2371:1: rule__Aspect__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Aspect__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2375:1: ( ( ',' ) )
            // InternalAspectLang.g:2376:1: ( ',' )
            {
            // InternalAspectLang.g:2376:1: ( ',' )
            // InternalAspectLang.g:2377:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getCommaKeyword_4_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2390:1: rule__Aspect__Group_4__1 : rule__Aspect__Group_4__1__Impl ;
    public final void rule__Aspect__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2394:1: ( rule__Aspect__Group_4__1__Impl )
            // InternalAspectLang.g:2395:2: rule__Aspect__Group_4__1__Impl
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
    // InternalAspectLang.g:2401:1: rule__Aspect__Group_4__1__Impl : ( ( rule__Aspect__AdvicesAssignment_4_1 ) ) ;
    public final void rule__Aspect__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2405:1: ( ( ( rule__Aspect__AdvicesAssignment_4_1 ) ) )
            // InternalAspectLang.g:2406:1: ( ( rule__Aspect__AdvicesAssignment_4_1 ) )
            {
            // InternalAspectLang.g:2406:1: ( ( rule__Aspect__AdvicesAssignment_4_1 ) )
            // InternalAspectLang.g:2407:1: ( rule__Aspect__AdvicesAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getAdvicesAssignment_4_1()); 
            }
            // InternalAspectLang.g:2408:1: ( rule__Aspect__AdvicesAssignment_4_1 )
            // InternalAspectLang.g:2408:2: rule__Aspect__AdvicesAssignment_4_1
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
    // InternalAspectLang.g:2422:1: rule__UtilizeAdvice__Group__0 : rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1 ;
    public final void rule__UtilizeAdvice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2426:1: ( rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1 )
            // InternalAspectLang.g:2427:2: rule__UtilizeAdvice__Group__0__Impl rule__UtilizeAdvice__Group__1
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
    // InternalAspectLang.g:2434:1: rule__UtilizeAdvice__Group__0__Impl : ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) ) ;
    public final void rule__UtilizeAdvice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2438:1: ( ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) ) )
            // InternalAspectLang.g:2439:1: ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) )
            {
            // InternalAspectLang.g:2439:1: ( ( rule__UtilizeAdvice__AdviceAssignment_0 ) )
            // InternalAspectLang.g:2440:1: ( rule__UtilizeAdvice__AdviceAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAssignment_0()); 
            }
            // InternalAspectLang.g:2441:1: ( rule__UtilizeAdvice__AdviceAssignment_0 )
            // InternalAspectLang.g:2441:2: rule__UtilizeAdvice__AdviceAssignment_0
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
    // InternalAspectLang.g:2451:1: rule__UtilizeAdvice__Group__1 : rule__UtilizeAdvice__Group__1__Impl ;
    public final void rule__UtilizeAdvice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2455:1: ( rule__UtilizeAdvice__Group__1__Impl )
            // InternalAspectLang.g:2456:2: rule__UtilizeAdvice__Group__1__Impl
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
    // InternalAspectLang.g:2462:1: rule__UtilizeAdvice__Group__1__Impl : ( ( rule__UtilizeAdvice__Group_1__0 )? ) ;
    public final void rule__UtilizeAdvice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2466:1: ( ( ( rule__UtilizeAdvice__Group_1__0 )? ) )
            // InternalAspectLang.g:2467:1: ( ( rule__UtilizeAdvice__Group_1__0 )? )
            {
            // InternalAspectLang.g:2467:1: ( ( rule__UtilizeAdvice__Group_1__0 )? )
            // InternalAspectLang.g:2468:1: ( rule__UtilizeAdvice__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:2469:1: ( rule__UtilizeAdvice__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalAspectLang.g:2469:2: rule__UtilizeAdvice__Group_1__0
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
    // InternalAspectLang.g:2483:1: rule__UtilizeAdvice__Group_1__0 : rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1 ;
    public final void rule__UtilizeAdvice__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2487:1: ( rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1 )
            // InternalAspectLang.g:2488:2: rule__UtilizeAdvice__Group_1__0__Impl rule__UtilizeAdvice__Group_1__1
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
    // InternalAspectLang.g:2495:1: rule__UtilizeAdvice__Group_1__0__Impl : ( '(' ) ;
    public final void rule__UtilizeAdvice__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2499:1: ( ( '(' ) )
            // InternalAspectLang.g:2500:1: ( '(' )
            {
            // InternalAspectLang.g:2500:1: ( '(' )
            // InternalAspectLang.g:2501:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2514:1: rule__UtilizeAdvice__Group_1__1 : rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2 ;
    public final void rule__UtilizeAdvice__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2518:1: ( rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2 )
            // InternalAspectLang.g:2519:2: rule__UtilizeAdvice__Group_1__1__Impl rule__UtilizeAdvice__Group_1__2
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
    // InternalAspectLang.g:2526:1: rule__UtilizeAdvice__Group_1__1__Impl : ( ( rule__UtilizeAdvice__Group_1_1__0 )? ) ;
    public final void rule__UtilizeAdvice__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2530:1: ( ( ( rule__UtilizeAdvice__Group_1_1__0 )? ) )
            // InternalAspectLang.g:2531:1: ( ( rule__UtilizeAdvice__Group_1_1__0 )? )
            {
            // InternalAspectLang.g:2531:1: ( ( rule__UtilizeAdvice__Group_1_1__0 )? )
            // InternalAspectLang.g:2532:1: ( rule__UtilizeAdvice__Group_1_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1()); 
            }
            // InternalAspectLang.g:2533:1: ( rule__UtilizeAdvice__Group_1_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_ID && LA23_0<=RULE_INT)||LA23_0==13||(LA23_0>=17 && LA23_0<=19)||(LA23_0>=28 && LA23_0<=29)||(LA23_0>=51 && LA23_0<=52)||(LA23_0>=60 && LA23_0<=61)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalAspectLang.g:2533:2: rule__UtilizeAdvice__Group_1_1__0
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
    // InternalAspectLang.g:2543:1: rule__UtilizeAdvice__Group_1__2 : rule__UtilizeAdvice__Group_1__2__Impl ;
    public final void rule__UtilizeAdvice__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2547:1: ( rule__UtilizeAdvice__Group_1__2__Impl )
            // InternalAspectLang.g:2548:2: rule__UtilizeAdvice__Group_1__2__Impl
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
    // InternalAspectLang.g:2554:1: rule__UtilizeAdvice__Group_1__2__Impl : ( ')' ) ;
    public final void rule__UtilizeAdvice__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2558:1: ( ( ')' ) )
            // InternalAspectLang.g:2559:1: ( ')' )
            {
            // InternalAspectLang.g:2559:1: ( ')' )
            // InternalAspectLang.g:2560:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getRightParenthesisKeyword_1_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2579:1: rule__UtilizeAdvice__Group_1_1__0 : rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1 ;
    public final void rule__UtilizeAdvice__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2583:1: ( rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1 )
            // InternalAspectLang.g:2584:2: rule__UtilizeAdvice__Group_1_1__0__Impl rule__UtilizeAdvice__Group_1_1__1
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
    // InternalAspectLang.g:2591:1: rule__UtilizeAdvice__Group_1_1__0__Impl : ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) ) ;
    public final void rule__UtilizeAdvice__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2595:1: ( ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) ) )
            // InternalAspectLang.g:2596:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) )
            {
            // InternalAspectLang.g:2596:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 ) )
            // InternalAspectLang.g:2597:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_0()); 
            }
            // InternalAspectLang.g:2598:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 )
            // InternalAspectLang.g:2598:2: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0
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
    // InternalAspectLang.g:2608:1: rule__UtilizeAdvice__Group_1_1__1 : rule__UtilizeAdvice__Group_1_1__1__Impl ;
    public final void rule__UtilizeAdvice__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2612:1: ( rule__UtilizeAdvice__Group_1_1__1__Impl )
            // InternalAspectLang.g:2613:2: rule__UtilizeAdvice__Group_1_1__1__Impl
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
    // InternalAspectLang.g:2619:1: rule__UtilizeAdvice__Group_1_1__1__Impl : ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* ) ;
    public final void rule__UtilizeAdvice__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2623:1: ( ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* ) )
            // InternalAspectLang.g:2624:1: ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* )
            {
            // InternalAspectLang.g:2624:1: ( ( rule__UtilizeAdvice__Group_1_1_1__0 )* )
            // InternalAspectLang.g:2625:1: ( rule__UtilizeAdvice__Group_1_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getGroup_1_1_1()); 
            }
            // InternalAspectLang.g:2626:1: ( rule__UtilizeAdvice__Group_1_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==45) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalAspectLang.g:2626:2: rule__UtilizeAdvice__Group_1_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__UtilizeAdvice__Group_1_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalAspectLang.g:2640:1: rule__UtilizeAdvice__Group_1_1_1__0 : rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1 ;
    public final void rule__UtilizeAdvice__Group_1_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2644:1: ( rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1 )
            // InternalAspectLang.g:2645:2: rule__UtilizeAdvice__Group_1_1_1__0__Impl rule__UtilizeAdvice__Group_1_1_1__1
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
    // InternalAspectLang.g:2652:1: rule__UtilizeAdvice__Group_1_1_1__0__Impl : ( ',' ) ;
    public final void rule__UtilizeAdvice__Group_1_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2656:1: ( ( ',' ) )
            // InternalAspectLang.g:2657:1: ( ',' )
            {
            // InternalAspectLang.g:2657:1: ( ',' )
            // InternalAspectLang.g:2658:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getCommaKeyword_1_1_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2671:1: rule__UtilizeAdvice__Group_1_1_1__1 : rule__UtilizeAdvice__Group_1_1_1__1__Impl ;
    public final void rule__UtilizeAdvice__Group_1_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2675:1: ( rule__UtilizeAdvice__Group_1_1_1__1__Impl )
            // InternalAspectLang.g:2676:2: rule__UtilizeAdvice__Group_1_1_1__1__Impl
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
    // InternalAspectLang.g:2682:1: rule__UtilizeAdvice__Group_1_1_1__1__Impl : ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) ) ;
    public final void rule__UtilizeAdvice__Group_1_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2686:1: ( ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) ) )
            // InternalAspectLang.g:2687:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) )
            {
            // InternalAspectLang.g:2687:1: ( ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 ) )
            // InternalAspectLang.g:2688:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getParameterAssignmentsAssignment_1_1_1_1()); 
            }
            // InternalAspectLang.g:2689:1: ( rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 )
            // InternalAspectLang.g:2689:2: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1
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
    // InternalAspectLang.g:2703:1: rule__Advice__Group__0 : rule__Advice__Group__0__Impl rule__Advice__Group__1 ;
    public final void rule__Advice__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2707:1: ( rule__Advice__Group__0__Impl rule__Advice__Group__1 )
            // InternalAspectLang.g:2708:2: rule__Advice__Group__0__Impl rule__Advice__Group__1
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
    // InternalAspectLang.g:2715:1: rule__Advice__Group__0__Impl : ( 'advice' ) ;
    public final void rule__Advice__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2719:1: ( ( 'advice' ) )
            // InternalAspectLang.g:2720:1: ( 'advice' )
            {
            // InternalAspectLang.g:2720:1: ( 'advice' )
            // InternalAspectLang.g:2721:1: 'advice'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getAdviceKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2734:1: rule__Advice__Group__1 : rule__Advice__Group__1__Impl rule__Advice__Group__2 ;
    public final void rule__Advice__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2738:1: ( rule__Advice__Group__1__Impl rule__Advice__Group__2 )
            // InternalAspectLang.g:2739:2: rule__Advice__Group__1__Impl rule__Advice__Group__2
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
    // InternalAspectLang.g:2746:1: rule__Advice__Group__1__Impl : ( ( rule__Advice__NameAssignment_1 ) ) ;
    public final void rule__Advice__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2750:1: ( ( ( rule__Advice__NameAssignment_1 ) ) )
            // InternalAspectLang.g:2751:1: ( ( rule__Advice__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:2751:1: ( ( rule__Advice__NameAssignment_1 ) )
            // InternalAspectLang.g:2752:1: ( rule__Advice__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:2753:1: ( rule__Advice__NameAssignment_1 )
            // InternalAspectLang.g:2753:2: rule__Advice__NameAssignment_1
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
    // InternalAspectLang.g:2763:1: rule__Advice__Group__2 : rule__Advice__Group__2__Impl rule__Advice__Group__3 ;
    public final void rule__Advice__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2767:1: ( rule__Advice__Group__2__Impl rule__Advice__Group__3 )
            // InternalAspectLang.g:2768:2: rule__Advice__Group__2__Impl rule__Advice__Group__3
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
    // InternalAspectLang.g:2775:1: rule__Advice__Group__2__Impl : ( ( rule__Advice__Group_2__0 )? ) ;
    public final void rule__Advice__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2779:1: ( ( ( rule__Advice__Group_2__0 )? ) )
            // InternalAspectLang.g:2780:1: ( ( rule__Advice__Group_2__0 )? )
            {
            // InternalAspectLang.g:2780:1: ( ( rule__Advice__Group_2__0 )? )
            // InternalAspectLang.g:2781:1: ( rule__Advice__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2()); 
            }
            // InternalAspectLang.g:2782:1: ( rule__Advice__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==46) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalAspectLang.g:2782:2: rule__Advice__Group_2__0
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
    // InternalAspectLang.g:2792:1: rule__Advice__Group__3 : rule__Advice__Group__3__Impl rule__Advice__Group__4 ;
    public final void rule__Advice__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2796:1: ( rule__Advice__Group__3__Impl rule__Advice__Group__4 )
            // InternalAspectLang.g:2797:2: rule__Advice__Group__3__Impl rule__Advice__Group__4
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
    // InternalAspectLang.g:2804:1: rule__Advice__Group__3__Impl : ( '{' ) ;
    public final void rule__Advice__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2808:1: ( ( '{' ) )
            // InternalAspectLang.g:2809:1: ( '{' )
            {
            // InternalAspectLang.g:2809:1: ( '{' )
            // InternalAspectLang.g:2810:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2823:1: rule__Advice__Group__4 : rule__Advice__Group__4__Impl rule__Advice__Group__5 ;
    public final void rule__Advice__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2827:1: ( rule__Advice__Group__4__Impl rule__Advice__Group__5 )
            // InternalAspectLang.g:2828:2: rule__Advice__Group__4__Impl rule__Advice__Group__5
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
    // InternalAspectLang.g:2835:1: rule__Advice__Group__4__Impl : ( ( rule__Advice__CollectorsAssignment_4 )* ) ;
    public final void rule__Advice__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2839:1: ( ( ( rule__Advice__CollectorsAssignment_4 )* ) )
            // InternalAspectLang.g:2840:1: ( ( rule__Advice__CollectorsAssignment_4 )* )
            {
            // InternalAspectLang.g:2840:1: ( ( rule__Advice__CollectorsAssignment_4 )* )
            // InternalAspectLang.g:2841:1: ( rule__Advice__CollectorsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getCollectorsAssignment_4()); 
            }
            // InternalAspectLang.g:2842:1: ( rule__Advice__CollectorsAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=14 && LA26_0<=16)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalAspectLang.g:2842:2: rule__Advice__CollectorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Advice__CollectorsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalAspectLang.g:2852:1: rule__Advice__Group__5 : rule__Advice__Group__5__Impl ;
    public final void rule__Advice__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2856:1: ( rule__Advice__Group__5__Impl )
            // InternalAspectLang.g:2857:2: rule__Advice__Group__5__Impl
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
    // InternalAspectLang.g:2863:1: rule__Advice__Group__5__Impl : ( '}' ) ;
    public final void rule__Advice__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2867:1: ( ( '}' ) )
            // InternalAspectLang.g:2868:1: ( '}' )
            {
            // InternalAspectLang.g:2868:1: ( '}' )
            // InternalAspectLang.g:2869:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2894:1: rule__Advice__Group_2__0 : rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1 ;
    public final void rule__Advice__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2898:1: ( rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1 )
            // InternalAspectLang.g:2899:2: rule__Advice__Group_2__0__Impl rule__Advice__Group_2__1
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
    // InternalAspectLang.g:2906:1: rule__Advice__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Advice__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2910:1: ( ( '(' ) )
            // InternalAspectLang.g:2911:1: ( '(' )
            {
            // InternalAspectLang.g:2911:1: ( '(' )
            // InternalAspectLang.g:2912:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2925:1: rule__Advice__Group_2__1 : rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2 ;
    public final void rule__Advice__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2929:1: ( rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2 )
            // InternalAspectLang.g:2930:2: rule__Advice__Group_2__1__Impl rule__Advice__Group_2__2
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
    // InternalAspectLang.g:2937:1: rule__Advice__Group_2__1__Impl : ( ( rule__Advice__Group_2_1__0 )? ) ;
    public final void rule__Advice__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2941:1: ( ( ( rule__Advice__Group_2_1__0 )? ) )
            // InternalAspectLang.g:2942:1: ( ( rule__Advice__Group_2_1__0 )? )
            {
            // InternalAspectLang.g:2942:1: ( ( rule__Advice__Group_2_1__0 )? )
            // InternalAspectLang.g:2943:1: ( rule__Advice__Group_2_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2_1()); 
            }
            // InternalAspectLang.g:2944:1: ( rule__Advice__Group_2_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalAspectLang.g:2944:2: rule__Advice__Group_2_1__0
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
    // InternalAspectLang.g:2954:1: rule__Advice__Group_2__2 : rule__Advice__Group_2__2__Impl ;
    public final void rule__Advice__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2958:1: ( rule__Advice__Group_2__2__Impl )
            // InternalAspectLang.g:2959:2: rule__Advice__Group_2__2__Impl
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
    // InternalAspectLang.g:2965:1: rule__Advice__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Advice__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2969:1: ( ( ')' ) )
            // InternalAspectLang.g:2970:1: ( ')' )
            {
            // InternalAspectLang.g:2970:1: ( ')' )
            // InternalAspectLang.g:2971:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:2990:1: rule__Advice__Group_2_1__0 : rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1 ;
    public final void rule__Advice__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:2994:1: ( rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1 )
            // InternalAspectLang.g:2995:2: rule__Advice__Group_2_1__0__Impl rule__Advice__Group_2_1__1
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
    // InternalAspectLang.g:3002:1: rule__Advice__Group_2_1__0__Impl : ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) ) ;
    public final void rule__Advice__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3006:1: ( ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) ) )
            // InternalAspectLang.g:3007:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) )
            {
            // InternalAspectLang.g:3007:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 ) )
            // InternalAspectLang.g:3008:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_0()); 
            }
            // InternalAspectLang.g:3009:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_0 )
            // InternalAspectLang.g:3009:2: rule__Advice__ParameterDeclarationsAssignment_2_1_0
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
    // InternalAspectLang.g:3019:1: rule__Advice__Group_2_1__1 : rule__Advice__Group_2_1__1__Impl ;
    public final void rule__Advice__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3023:1: ( rule__Advice__Group_2_1__1__Impl )
            // InternalAspectLang.g:3024:2: rule__Advice__Group_2_1__1__Impl
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
    // InternalAspectLang.g:3030:1: rule__Advice__Group_2_1__1__Impl : ( ( rule__Advice__Group_2_1_1__0 )* ) ;
    public final void rule__Advice__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3034:1: ( ( ( rule__Advice__Group_2_1_1__0 )* ) )
            // InternalAspectLang.g:3035:1: ( ( rule__Advice__Group_2_1_1__0 )* )
            {
            // InternalAspectLang.g:3035:1: ( ( rule__Advice__Group_2_1_1__0 )* )
            // InternalAspectLang.g:3036:1: ( rule__Advice__Group_2_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getGroup_2_1_1()); 
            }
            // InternalAspectLang.g:3037:1: ( rule__Advice__Group_2_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==45) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalAspectLang.g:3037:2: rule__Advice__Group_2_1_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Advice__Group_2_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalAspectLang.g:3051:1: rule__Advice__Group_2_1_1__0 : rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1 ;
    public final void rule__Advice__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3055:1: ( rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1 )
            // InternalAspectLang.g:3056:2: rule__Advice__Group_2_1_1__0__Impl rule__Advice__Group_2_1_1__1
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
    // InternalAspectLang.g:3063:1: rule__Advice__Group_2_1_1__0__Impl : ( ',' ) ;
    public final void rule__Advice__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3067:1: ( ( ',' ) )
            // InternalAspectLang.g:3068:1: ( ',' )
            {
            // InternalAspectLang.g:3068:1: ( ',' )
            // InternalAspectLang.g:3069:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getCommaKeyword_2_1_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3082:1: rule__Advice__Group_2_1_1__1 : rule__Advice__Group_2_1_1__1__Impl ;
    public final void rule__Advice__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3086:1: ( rule__Advice__Group_2_1_1__1__Impl )
            // InternalAspectLang.g:3087:2: rule__Advice__Group_2_1_1__1__Impl
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
    // InternalAspectLang.g:3093:1: rule__Advice__Group_2_1_1__1__Impl : ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) ) ;
    public final void rule__Advice__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3097:1: ( ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) ) )
            // InternalAspectLang.g:3098:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) )
            {
            // InternalAspectLang.g:3098:1: ( ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 ) )
            // InternalAspectLang.g:3099:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceAccess().getParameterDeclarationsAssignment_2_1_1_1()); 
            }
            // InternalAspectLang.g:3100:1: ( rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 )
            // InternalAspectLang.g:3100:2: rule__Advice__ParameterDeclarationsAssignment_2_1_1_1
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
    // InternalAspectLang.g:3114:1: rule__AdviceParameterDeclaration__Group__0 : rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1 ;
    public final void rule__AdviceParameterDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3118:1: ( rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1 )
            // InternalAspectLang.g:3119:2: rule__AdviceParameterDeclaration__Group__0__Impl rule__AdviceParameterDeclaration__Group__1
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
    // InternalAspectLang.g:3126:1: rule__AdviceParameterDeclaration__Group__0__Impl : ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) ) ;
    public final void rule__AdviceParameterDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3130:1: ( ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) ) )
            // InternalAspectLang.g:3131:1: ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) )
            {
            // InternalAspectLang.g:3131:1: ( ( rule__AdviceParameterDeclaration__TypeAssignment_0 ) )
            // InternalAspectLang.g:3132:1: ( rule__AdviceParameterDeclaration__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getTypeAssignment_0()); 
            }
            // InternalAspectLang.g:3133:1: ( rule__AdviceParameterDeclaration__TypeAssignment_0 )
            // InternalAspectLang.g:3133:2: rule__AdviceParameterDeclaration__TypeAssignment_0
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
    // InternalAspectLang.g:3143:1: rule__AdviceParameterDeclaration__Group__1 : rule__AdviceParameterDeclaration__Group__1__Impl ;
    public final void rule__AdviceParameterDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3147:1: ( rule__AdviceParameterDeclaration__Group__1__Impl )
            // InternalAspectLang.g:3148:2: rule__AdviceParameterDeclaration__Group__1__Impl
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
    // InternalAspectLang.g:3154:1: rule__AdviceParameterDeclaration__Group__1__Impl : ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) ) ;
    public final void rule__AdviceParameterDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3158:1: ( ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) ) )
            // InternalAspectLang.g:3159:1: ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:3159:1: ( ( rule__AdviceParameterDeclaration__NameAssignment_1 ) )
            // InternalAspectLang.g:3160:1: ( rule__AdviceParameterDeclaration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterDeclarationAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:3161:1: ( rule__AdviceParameterDeclaration__NameAssignment_1 )
            // InternalAspectLang.g:3161:2: rule__AdviceParameterDeclaration__NameAssignment_1
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
    // InternalAspectLang.g:3175:1: rule__Collector__Group__0 : rule__Collector__Group__0__Impl rule__Collector__Group__1 ;
    public final void rule__Collector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3179:1: ( rule__Collector__Group__0__Impl rule__Collector__Group__1 )
            // InternalAspectLang.g:3180:2: rule__Collector__Group__0__Impl rule__Collector__Group__1
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
    // InternalAspectLang.g:3187:1: rule__Collector__Group__0__Impl : ( ( rule__Collector__InsertionPointAssignment_0 ) ) ;
    public final void rule__Collector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3191:1: ( ( ( rule__Collector__InsertionPointAssignment_0 ) ) )
            // InternalAspectLang.g:3192:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            {
            // InternalAspectLang.g:3192:1: ( ( rule__Collector__InsertionPointAssignment_0 ) )
            // InternalAspectLang.g:3193:1: ( rule__Collector__InsertionPointAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getInsertionPointAssignment_0()); 
            }
            // InternalAspectLang.g:3194:1: ( rule__Collector__InsertionPointAssignment_0 )
            // InternalAspectLang.g:3194:2: rule__Collector__InsertionPointAssignment_0
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
    // InternalAspectLang.g:3204:1: rule__Collector__Group__1 : rule__Collector__Group__1__Impl ;
    public final void rule__Collector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3208:1: ( rule__Collector__Group__1__Impl )
            // InternalAspectLang.g:3209:2: rule__Collector__Group__1__Impl
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
    // InternalAspectLang.g:3215:1: rule__Collector__Group__1__Impl : ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) ) ;
    public final void rule__Collector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3219:1: ( ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) ) )
            // InternalAspectLang.g:3220:1: ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) )
            {
            // InternalAspectLang.g:3220:1: ( ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* ) )
            // InternalAspectLang.g:3221:1: ( ( rule__Collector__EventsAssignment_1 ) ) ( ( rule__Collector__EventsAssignment_1 )* )
            {
            // InternalAspectLang.g:3221:1: ( ( rule__Collector__EventsAssignment_1 ) )
            // InternalAspectLang.g:3222:1: ( rule__Collector__EventsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }
            // InternalAspectLang.g:3223:1: ( rule__Collector__EventsAssignment_1 )
            // InternalAspectLang.g:3223:2: rule__Collector__EventsAssignment_1
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

            // InternalAspectLang.g:3226:1: ( ( rule__Collector__EventsAssignment_1 )* )
            // InternalAspectLang.g:3227:1: ( rule__Collector__EventsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCollectorAccess().getEventsAssignment_1()); 
            }
            // InternalAspectLang.g:3228:1: ( rule__Collector__EventsAssignment_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalAspectLang.g:3228:2: rule__Collector__EventsAssignment_1
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Collector__EventsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalAspectLang.g:3243:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3247:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // InternalAspectLang.g:3248:2: rule__Event__Group__0__Impl rule__Event__Group__1
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
    // InternalAspectLang.g:3255:1: rule__Event__Group__0__Impl : ( ( rule__Event__TypeAssignment_0 ) ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3259:1: ( ( ( rule__Event__TypeAssignment_0 ) ) )
            // InternalAspectLang.g:3260:1: ( ( rule__Event__TypeAssignment_0 ) )
            {
            // InternalAspectLang.g:3260:1: ( ( rule__Event__TypeAssignment_0 ) )
            // InternalAspectLang.g:3261:1: ( rule__Event__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeAssignment_0()); 
            }
            // InternalAspectLang.g:3262:1: ( rule__Event__TypeAssignment_0 )
            // InternalAspectLang.g:3262:2: rule__Event__TypeAssignment_0
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
    // InternalAspectLang.g:3272:1: rule__Event__Group__1 : rule__Event__Group__1__Impl rule__Event__Group__2 ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3276:1: ( rule__Event__Group__1__Impl rule__Event__Group__2 )
            // InternalAspectLang.g:3277:2: rule__Event__Group__1__Impl rule__Event__Group__2
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
    // InternalAspectLang.g:3284:1: rule__Event__Group__1__Impl : ( '(' ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3288:1: ( ( '(' ) )
            // InternalAspectLang.g:3289:1: ( '(' )
            {
            // InternalAspectLang.g:3289:1: ( '(' )
            // InternalAspectLang.g:3290:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3303:1: rule__Event__Group__2 : rule__Event__Group__2__Impl rule__Event__Group__3 ;
    public final void rule__Event__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3307:1: ( rule__Event__Group__2__Impl rule__Event__Group__3 )
            // InternalAspectLang.g:3308:2: rule__Event__Group__2__Impl rule__Event__Group__3
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
    // InternalAspectLang.g:3315:1: rule__Event__Group__2__Impl : ( ( rule__Event__Group_2__0 )? ) ;
    public final void rule__Event__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3319:1: ( ( ( rule__Event__Group_2__0 )? ) )
            // InternalAspectLang.g:3320:1: ( ( rule__Event__Group_2__0 )? )
            {
            // InternalAspectLang.g:3320:1: ( ( rule__Event__Group_2__0 )? )
            // InternalAspectLang.g:3321:1: ( rule__Event__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2()); 
            }
            // InternalAspectLang.g:3322:1: ( rule__Event__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||LA30_0==13||(LA30_0>=17 && LA30_0<=19)||(LA30_0>=28 && LA30_0<=29)||(LA30_0>=51 && LA30_0<=52)||(LA30_0>=60 && LA30_0<=61)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalAspectLang.g:3322:2: rule__Event__Group_2__0
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
    // InternalAspectLang.g:3332:1: rule__Event__Group__3 : rule__Event__Group__3__Impl ;
    public final void rule__Event__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3336:1: ( rule__Event__Group__3__Impl )
            // InternalAspectLang.g:3337:2: rule__Event__Group__3__Impl
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
    // InternalAspectLang.g:3343:1: rule__Event__Group__3__Impl : ( ')' ) ;
    public final void rule__Event__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3347:1: ( ( ')' ) )
            // InternalAspectLang.g:3348:1: ( ')' )
            {
            // InternalAspectLang.g:3348:1: ( ')' )
            // InternalAspectLang.g:3349:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3370:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3374:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalAspectLang.g:3375:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
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
    // InternalAspectLang.g:3382:1: rule__Event__Group_2__0__Impl : ( ( rule__Event__InitializationsAssignment_2_0 ) ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3386:1: ( ( ( rule__Event__InitializationsAssignment_2_0 ) ) )
            // InternalAspectLang.g:3387:1: ( ( rule__Event__InitializationsAssignment_2_0 ) )
            {
            // InternalAspectLang.g:3387:1: ( ( rule__Event__InitializationsAssignment_2_0 ) )
            // InternalAspectLang.g:3388:1: ( rule__Event__InitializationsAssignment_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsAssignment_2_0()); 
            }
            // InternalAspectLang.g:3389:1: ( rule__Event__InitializationsAssignment_2_0 )
            // InternalAspectLang.g:3389:2: rule__Event__InitializationsAssignment_2_0
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
    // InternalAspectLang.g:3399:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3403:1: ( rule__Event__Group_2__1__Impl )
            // InternalAspectLang.g:3404:2: rule__Event__Group_2__1__Impl
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
    // InternalAspectLang.g:3410:1: rule__Event__Group_2__1__Impl : ( ( rule__Event__Group_2_1__0 )* ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3414:1: ( ( ( rule__Event__Group_2_1__0 )* ) )
            // InternalAspectLang.g:3415:1: ( ( rule__Event__Group_2_1__0 )* )
            {
            // InternalAspectLang.g:3415:1: ( ( rule__Event__Group_2_1__0 )* )
            // InternalAspectLang.g:3416:1: ( rule__Event__Group_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2_1()); 
            }
            // InternalAspectLang.g:3417:1: ( rule__Event__Group_2_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalAspectLang.g:3417:2: rule__Event__Group_2_1__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Event__Group_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalAspectLang.g:3431:1: rule__Event__Group_2_1__0 : rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 ;
    public final void rule__Event__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3435:1: ( rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1 )
            // InternalAspectLang.g:3436:2: rule__Event__Group_2_1__0__Impl rule__Event__Group_2_1__1
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
    // InternalAspectLang.g:3443:1: rule__Event__Group_2_1__0__Impl : ( ',' ) ;
    public final void rule__Event__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3447:1: ( ( ',' ) )
            // InternalAspectLang.g:3448:1: ( ',' )
            {
            // InternalAspectLang.g:3448:1: ( ',' )
            // InternalAspectLang.g:3449:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getCommaKeyword_2_1_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3462:1: rule__Event__Group_2_1__1 : rule__Event__Group_2_1__1__Impl ;
    public final void rule__Event__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3466:1: ( rule__Event__Group_2_1__1__Impl )
            // InternalAspectLang.g:3467:2: rule__Event__Group_2_1__1__Impl
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
    // InternalAspectLang.g:3473:1: rule__Event__Group_2_1__1__Impl : ( ( rule__Event__InitializationsAssignment_2_1_1 ) ) ;
    public final void rule__Event__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3477:1: ( ( ( rule__Event__InitializationsAssignment_2_1_1 ) ) )
            // InternalAspectLang.g:3478:1: ( ( rule__Event__InitializationsAssignment_2_1_1 ) )
            {
            // InternalAspectLang.g:3478:1: ( ( rule__Event__InitializationsAssignment_2_1_1 ) )
            // InternalAspectLang.g:3479:1: ( rule__Event__InitializationsAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getInitializationsAssignment_2_1_1()); 
            }
            // InternalAspectLang.g:3480:1: ( rule__Event__InitializationsAssignment_2_1_1 )
            // InternalAspectLang.g:3480:2: rule__Event__InitializationsAssignment_2_1_1
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
    // InternalAspectLang.g:3494:1: rule__ReferenceValue__Group__0 : rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 ;
    public final void rule__ReferenceValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3498:1: ( rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1 )
            // InternalAspectLang.g:3499:2: rule__ReferenceValue__Group__0__Impl rule__ReferenceValue__Group__1
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
    // InternalAspectLang.g:3506:1: rule__ReferenceValue__Group__0__Impl : ( ( rule__ReferenceValue__QueryAssignment_0 )? ) ;
    public final void rule__ReferenceValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3510:1: ( ( ( rule__ReferenceValue__QueryAssignment_0 )? ) )
            // InternalAspectLang.g:3511:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            {
            // InternalAspectLang.g:3511:1: ( ( rule__ReferenceValue__QueryAssignment_0 )? )
            // InternalAspectLang.g:3512:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getQueryAssignment_0()); 
            }
            // InternalAspectLang.g:3513:1: ( rule__ReferenceValue__QueryAssignment_0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID||LA32_0==13||(LA32_0>=28 && LA32_0<=29)||(LA32_0>=60 && LA32_0<=61)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalAspectLang.g:3513:2: rule__ReferenceValue__QueryAssignment_0
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
    // InternalAspectLang.g:3523:1: rule__ReferenceValue__Group__1 : rule__ReferenceValue__Group__1__Impl ;
    public final void rule__ReferenceValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3527:1: ( rule__ReferenceValue__Group__1__Impl )
            // InternalAspectLang.g:3528:2: rule__ReferenceValue__Group__1__Impl
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
    // InternalAspectLang.g:3534:1: rule__ReferenceValue__Group__1__Impl : ( ( rule__ReferenceValue__PropertyAssignment_1 ) ) ;
    public final void rule__ReferenceValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3538:1: ( ( ( rule__ReferenceValue__PropertyAssignment_1 ) ) )
            // InternalAspectLang.g:3539:1: ( ( rule__ReferenceValue__PropertyAssignment_1 ) )
            {
            // InternalAspectLang.g:3539:1: ( ( rule__ReferenceValue__PropertyAssignment_1 ) )
            // InternalAspectLang.g:3540:1: ( rule__ReferenceValue__PropertyAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReferenceValueAccess().getPropertyAssignment_1()); 
            }
            // InternalAspectLang.g:3541:1: ( rule__ReferenceValue__PropertyAssignment_1 )
            // InternalAspectLang.g:3541:2: rule__ReferenceValue__PropertyAssignment_1
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
    // InternalAspectLang.g:3555:1: rule__ReflectionProperty__Group__0 : rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 ;
    public final void rule__ReflectionProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3559:1: ( rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1 )
            // InternalAspectLang.g:3560:2: rule__ReflectionProperty__Group__0__Impl rule__ReflectionProperty__Group__1
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
    // InternalAspectLang.g:3567:1: rule__ReflectionProperty__Group__0__Impl : ( '$' ) ;
    public final void rule__ReflectionProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3571:1: ( ( '$' ) )
            // InternalAspectLang.g:3572:1: ( '$' )
            {
            // InternalAspectLang.g:3572:1: ( '$' )
            // InternalAspectLang.g:3573:1: '$'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getDollarSignKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3586:1: rule__ReflectionProperty__Group__1 : rule__ReflectionProperty__Group__1__Impl ;
    public final void rule__ReflectionProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3590:1: ( rule__ReflectionProperty__Group__1__Impl )
            // InternalAspectLang.g:3591:2: rule__ReflectionProperty__Group__1__Impl
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
    // InternalAspectLang.g:3597:1: rule__ReflectionProperty__Group__1__Impl : ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) ;
    public final void rule__ReflectionProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3601:1: ( ( ( rule__ReflectionProperty__FunctionAssignment_1 ) ) )
            // InternalAspectLang.g:3602:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            {
            // InternalAspectLang.g:3602:1: ( ( rule__ReflectionProperty__FunctionAssignment_1 ) )
            // InternalAspectLang.g:3603:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getReflectionPropertyAccess().getFunctionAssignment_1()); 
            }
            // InternalAspectLang.g:3604:1: ( rule__ReflectionProperty__FunctionAssignment_1 )
            // InternalAspectLang.g:3604:2: rule__ReflectionProperty__FunctionAssignment_1
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
    // InternalAspectLang.g:3618:1: rule__RuntimeProperty__Group__0 : rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 ;
    public final void rule__RuntimeProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3622:1: ( rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1 )
            // InternalAspectLang.g:3623:2: rule__RuntimeProperty__Group__0__Impl rule__RuntimeProperty__Group__1
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
    // InternalAspectLang.g:3630:1: rule__RuntimeProperty__Group__0__Impl : ( () ) ;
    public final void rule__RuntimeProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3634:1: ( ( () ) )
            // InternalAspectLang.g:3635:1: ( () )
            {
            // InternalAspectLang.g:3635:1: ( () )
            // InternalAspectLang.g:3636:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getRuntimePropertyAction_0()); 
            }
            // InternalAspectLang.g:3637:1: ()
            // InternalAspectLang.g:3639:1: 
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
    // InternalAspectLang.g:3649:1: rule__RuntimeProperty__Group__1 : rule__RuntimeProperty__Group__1__Impl ;
    public final void rule__RuntimeProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3653:1: ( rule__RuntimeProperty__Group__1__Impl )
            // InternalAspectLang.g:3654:2: rule__RuntimeProperty__Group__1__Impl
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
    // InternalAspectLang.g:3660:1: rule__RuntimeProperty__Group__1__Impl : ( '#' ) ;
    public final void rule__RuntimeProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3664:1: ( ( '#' ) )
            // InternalAspectLang.g:3665:1: ( '#' )
            {
            // InternalAspectLang.g:3665:1: ( '#' )
            // InternalAspectLang.g:3666:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRuntimePropertyAccess().getNumberSignKeyword_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3683:1: rule__AdviceParameter__Group__0 : rule__AdviceParameter__Group__0__Impl rule__AdviceParameter__Group__1 ;
    public final void rule__AdviceParameter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3687:1: ( rule__AdviceParameter__Group__0__Impl rule__AdviceParameter__Group__1 )
            // InternalAspectLang.g:3688:2: rule__AdviceParameter__Group__0__Impl rule__AdviceParameter__Group__1
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
    // InternalAspectLang.g:3695:1: rule__AdviceParameter__Group__0__Impl : ( ( rule__AdviceParameter__DeclarationAssignment_0 ) ) ;
    public final void rule__AdviceParameter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3699:1: ( ( ( rule__AdviceParameter__DeclarationAssignment_0 ) ) )
            // InternalAspectLang.g:3700:1: ( ( rule__AdviceParameter__DeclarationAssignment_0 ) )
            {
            // InternalAspectLang.g:3700:1: ( ( rule__AdviceParameter__DeclarationAssignment_0 ) )
            // InternalAspectLang.g:3701:1: ( rule__AdviceParameter__DeclarationAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getDeclarationAssignment_0()); 
            }
            // InternalAspectLang.g:3702:1: ( rule__AdviceParameter__DeclarationAssignment_0 )
            // InternalAspectLang.g:3702:2: rule__AdviceParameter__DeclarationAssignment_0
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
    // InternalAspectLang.g:3712:1: rule__AdviceParameter__Group__1 : rule__AdviceParameter__Group__1__Impl ;
    public final void rule__AdviceParameter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3716:1: ( rule__AdviceParameter__Group__1__Impl )
            // InternalAspectLang.g:3717:2: rule__AdviceParameter__Group__1__Impl
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
    // InternalAspectLang.g:3723:1: rule__AdviceParameter__Group__1__Impl : ( ( rule__AdviceParameter__Group_1__0 )? ) ;
    public final void rule__AdviceParameter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3727:1: ( ( ( rule__AdviceParameter__Group_1__0 )? ) )
            // InternalAspectLang.g:3728:1: ( ( rule__AdviceParameter__Group_1__0 )? )
            {
            // InternalAspectLang.g:3728:1: ( ( rule__AdviceParameter__Group_1__0 )? )
            // InternalAspectLang.g:3729:1: ( rule__AdviceParameter__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:3730:1: ( rule__AdviceParameter__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalAspectLang.g:3730:2: rule__AdviceParameter__Group_1__0
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
    // InternalAspectLang.g:3744:1: rule__AdviceParameter__Group_1__0 : rule__AdviceParameter__Group_1__0__Impl rule__AdviceParameter__Group_1__1 ;
    public final void rule__AdviceParameter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3748:1: ( rule__AdviceParameter__Group_1__0__Impl rule__AdviceParameter__Group_1__1 )
            // InternalAspectLang.g:3749:2: rule__AdviceParameter__Group_1__0__Impl rule__AdviceParameter__Group_1__1
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
    // InternalAspectLang.g:3756:1: rule__AdviceParameter__Group_1__0__Impl : ( '[' ) ;
    public final void rule__AdviceParameter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3760:1: ( ( '[' ) )
            // InternalAspectLang.g:3761:1: ( '[' )
            {
            // InternalAspectLang.g:3761:1: ( '[' )
            // InternalAspectLang.g:3762:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3775:1: rule__AdviceParameter__Group_1__1 : rule__AdviceParameter__Group_1__1__Impl rule__AdviceParameter__Group_1__2 ;
    public final void rule__AdviceParameter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3779:1: ( rule__AdviceParameter__Group_1__1__Impl rule__AdviceParameter__Group_1__2 )
            // InternalAspectLang.g:3780:2: rule__AdviceParameter__Group_1__1__Impl rule__AdviceParameter__Group_1__2
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
    // InternalAspectLang.g:3787:1: rule__AdviceParameter__Group_1__1__Impl : ( ( rule__AdviceParameter__CollectionAssignment_1_1 ) ) ;
    public final void rule__AdviceParameter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3791:1: ( ( ( rule__AdviceParameter__CollectionAssignment_1_1 ) ) )
            // InternalAspectLang.g:3792:1: ( ( rule__AdviceParameter__CollectionAssignment_1_1 ) )
            {
            // InternalAspectLang.g:3792:1: ( ( rule__AdviceParameter__CollectionAssignment_1_1 ) )
            // InternalAspectLang.g:3793:1: ( rule__AdviceParameter__CollectionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getCollectionAssignment_1_1()); 
            }
            // InternalAspectLang.g:3794:1: ( rule__AdviceParameter__CollectionAssignment_1_1 )
            // InternalAspectLang.g:3794:2: rule__AdviceParameter__CollectionAssignment_1_1
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
    // InternalAspectLang.g:3804:1: rule__AdviceParameter__Group_1__2 : rule__AdviceParameter__Group_1__2__Impl ;
    public final void rule__AdviceParameter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3808:1: ( rule__AdviceParameter__Group_1__2__Impl )
            // InternalAspectLang.g:3809:2: rule__AdviceParameter__Group_1__2__Impl
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
    // InternalAspectLang.g:3815:1: rule__AdviceParameter__Group_1__2__Impl : ( ']' ) ;
    public final void rule__AdviceParameter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3819:1: ( ( ']' ) )
            // InternalAspectLang.g:3820:1: ( ']' )
            {
            // InternalAspectLang.g:3820:1: ( ']' )
            // InternalAspectLang.g:3821:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3840:1: rule__Pointcut__Group__0 : rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 ;
    public final void rule__Pointcut__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3844:1: ( rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1 )
            // InternalAspectLang.g:3845:2: rule__Pointcut__Group__0__Impl rule__Pointcut__Group__1
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
    // InternalAspectLang.g:3852:1: rule__Pointcut__Group__0__Impl : ( ( rule__Pointcut__AnnotationAssignment_0 )? ) ;
    public final void rule__Pointcut__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3856:1: ( ( ( rule__Pointcut__AnnotationAssignment_0 )? ) )
            // InternalAspectLang.g:3857:1: ( ( rule__Pointcut__AnnotationAssignment_0 )? )
            {
            // InternalAspectLang.g:3857:1: ( ( rule__Pointcut__AnnotationAssignment_0 )? )
            // InternalAspectLang.g:3858:1: ( rule__Pointcut__AnnotationAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getAnnotationAssignment_0()); 
            }
            // InternalAspectLang.g:3859:1: ( rule__Pointcut__AnnotationAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==59) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalAspectLang.g:3859:2: rule__Pointcut__AnnotationAssignment_0
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
    // InternalAspectLang.g:3869:1: rule__Pointcut__Group__1 : rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 ;
    public final void rule__Pointcut__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3873:1: ( rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2 )
            // InternalAspectLang.g:3874:2: rule__Pointcut__Group__1__Impl rule__Pointcut__Group__2
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
    // InternalAspectLang.g:3881:1: rule__Pointcut__Group__1__Impl : ( 'pointcut' ) ;
    public final void rule__Pointcut__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3885:1: ( ( 'pointcut' ) )
            // InternalAspectLang.g:3886:1: ( 'pointcut' )
            {
            // InternalAspectLang.g:3886:1: ( 'pointcut' )
            // InternalAspectLang.g:3887:1: 'pointcut'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getPointcutKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3900:1: rule__Pointcut__Group__2 : rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 ;
    public final void rule__Pointcut__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3904:1: ( rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3 )
            // InternalAspectLang.g:3905:2: rule__Pointcut__Group__2__Impl rule__Pointcut__Group__3
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
    // InternalAspectLang.g:3912:1: rule__Pointcut__Group__2__Impl : ( ( rule__Pointcut__NameAssignment_2 ) ) ;
    public final void rule__Pointcut__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3916:1: ( ( ( rule__Pointcut__NameAssignment_2 ) ) )
            // InternalAspectLang.g:3917:1: ( ( rule__Pointcut__NameAssignment_2 ) )
            {
            // InternalAspectLang.g:3917:1: ( ( rule__Pointcut__NameAssignment_2 ) )
            // InternalAspectLang.g:3918:1: ( rule__Pointcut__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getNameAssignment_2()); 
            }
            // InternalAspectLang.g:3919:1: ( rule__Pointcut__NameAssignment_2 )
            // InternalAspectLang.g:3919:2: rule__Pointcut__NameAssignment_2
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
    // InternalAspectLang.g:3929:1: rule__Pointcut__Group__3 : rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4 ;
    public final void rule__Pointcut__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3933:1: ( rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4 )
            // InternalAspectLang.g:3934:2: rule__Pointcut__Group__3__Impl rule__Pointcut__Group__4
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
    // InternalAspectLang.g:3941:1: rule__Pointcut__Group__3__Impl : ( 'class' ) ;
    public final void rule__Pointcut__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3945:1: ( ( 'class' ) )
            // InternalAspectLang.g:3946:1: ( 'class' )
            {
            // InternalAspectLang.g:3946:1: ( 'class' )
            // InternalAspectLang.g:3947:1: 'class'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getClassKeyword_3()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:3960:1: rule__Pointcut__Group__4 : rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5 ;
    public final void rule__Pointcut__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3964:1: ( rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5 )
            // InternalAspectLang.g:3965:2: rule__Pointcut__Group__4__Impl rule__Pointcut__Group__5
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
    // InternalAspectLang.g:3972:1: rule__Pointcut__Group__4__Impl : ( ( rule__Pointcut__ModelAssignment_4 ) ) ;
    public final void rule__Pointcut__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3976:1: ( ( ( rule__Pointcut__ModelAssignment_4 ) ) )
            // InternalAspectLang.g:3977:1: ( ( rule__Pointcut__ModelAssignment_4 ) )
            {
            // InternalAspectLang.g:3977:1: ( ( rule__Pointcut__ModelAssignment_4 ) )
            // InternalAspectLang.g:3978:1: ( rule__Pointcut__ModelAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getModelAssignment_4()); 
            }
            // InternalAspectLang.g:3979:1: ( rule__Pointcut__ModelAssignment_4 )
            // InternalAspectLang.g:3979:2: rule__Pointcut__ModelAssignment_4
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
    // InternalAspectLang.g:3989:1: rule__Pointcut__Group__5 : rule__Pointcut__Group__5__Impl rule__Pointcut__Group__6 ;
    public final void rule__Pointcut__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:3993:1: ( rule__Pointcut__Group__5__Impl rule__Pointcut__Group__6 )
            // InternalAspectLang.g:3994:2: rule__Pointcut__Group__5__Impl rule__Pointcut__Group__6
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
    // InternalAspectLang.g:4001:1: rule__Pointcut__Group__5__Impl : ( '.' ) ;
    public final void rule__Pointcut__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4005:1: ( ( '.' ) )
            // InternalAspectLang.g:4006:1: ( '.' )
            {
            // InternalAspectLang.g:4006:1: ( '.' )
            // InternalAspectLang.g:4007:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getFullStopKeyword_5()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4020:1: rule__Pointcut__Group__6 : rule__Pointcut__Group__6__Impl rule__Pointcut__Group__7 ;
    public final void rule__Pointcut__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4024:1: ( rule__Pointcut__Group__6__Impl rule__Pointcut__Group__7 )
            // InternalAspectLang.g:4025:2: rule__Pointcut__Group__6__Impl rule__Pointcut__Group__7
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
    // InternalAspectLang.g:4032:1: rule__Pointcut__Group__6__Impl : ( ( rule__Pointcut__LocationAssignment_6 ) ) ;
    public final void rule__Pointcut__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4036:1: ( ( ( rule__Pointcut__LocationAssignment_6 ) ) )
            // InternalAspectLang.g:4037:1: ( ( rule__Pointcut__LocationAssignment_6 ) )
            {
            // InternalAspectLang.g:4037:1: ( ( rule__Pointcut__LocationAssignment_6 ) )
            // InternalAspectLang.g:4038:1: ( rule__Pointcut__LocationAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getLocationAssignment_6()); 
            }
            // InternalAspectLang.g:4039:1: ( rule__Pointcut__LocationAssignment_6 )
            // InternalAspectLang.g:4039:2: rule__Pointcut__LocationAssignment_6
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
    // InternalAspectLang.g:4049:1: rule__Pointcut__Group__7 : rule__Pointcut__Group__7__Impl ;
    public final void rule__Pointcut__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4053:1: ( rule__Pointcut__Group__7__Impl )
            // InternalAspectLang.g:4054:2: rule__Pointcut__Group__7__Impl
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
    // InternalAspectLang.g:4060:1: rule__Pointcut__Group__7__Impl : ( ( rule__Pointcut__Group_7__0 )? ) ;
    public final void rule__Pointcut__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4064:1: ( ( ( rule__Pointcut__Group_7__0 )? ) )
            // InternalAspectLang.g:4065:1: ( ( rule__Pointcut__Group_7__0 )? )
            {
            // InternalAspectLang.g:4065:1: ( ( rule__Pointcut__Group_7__0 )? )
            // InternalAspectLang.g:4066:1: ( rule__Pointcut__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getGroup_7()); 
            }
            // InternalAspectLang.g:4067:1: ( rule__Pointcut__Group_7__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==58) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalAspectLang.g:4067:2: rule__Pointcut__Group_7__0
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
    // InternalAspectLang.g:4093:1: rule__Pointcut__Group_7__0 : rule__Pointcut__Group_7__0__Impl rule__Pointcut__Group_7__1 ;
    public final void rule__Pointcut__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4097:1: ( rule__Pointcut__Group_7__0__Impl rule__Pointcut__Group_7__1 )
            // InternalAspectLang.g:4098:2: rule__Pointcut__Group_7__0__Impl rule__Pointcut__Group_7__1
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
    // InternalAspectLang.g:4105:1: rule__Pointcut__Group_7__0__Impl : ( 'operation' ) ;
    public final void rule__Pointcut__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4109:1: ( ( 'operation' ) )
            // InternalAspectLang.g:4110:1: ( 'operation' )
            {
            // InternalAspectLang.g:4110:1: ( 'operation' )
            // InternalAspectLang.g:4111:1: 'operation'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationKeyword_7_0()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4124:1: rule__Pointcut__Group_7__1 : rule__Pointcut__Group_7__1__Impl ;
    public final void rule__Pointcut__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4128:1: ( rule__Pointcut__Group_7__1__Impl )
            // InternalAspectLang.g:4129:2: rule__Pointcut__Group_7__1__Impl
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
    // InternalAspectLang.g:4135:1: rule__Pointcut__Group_7__1__Impl : ( ( rule__Pointcut__OperationAssignment_7_1 ) ) ;
    public final void rule__Pointcut__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4139:1: ( ( ( rule__Pointcut__OperationAssignment_7_1 ) ) )
            // InternalAspectLang.g:4140:1: ( ( rule__Pointcut__OperationAssignment_7_1 ) )
            {
            // InternalAspectLang.g:4140:1: ( ( rule__Pointcut__OperationAssignment_7_1 ) )
            // InternalAspectLang.g:4141:1: ( rule__Pointcut__OperationAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getOperationAssignment_7_1()); 
            }
            // InternalAspectLang.g:4142:1: ( rule__Pointcut__OperationAssignment_7_1 )
            // InternalAspectLang.g:4142:2: rule__Pointcut__OperationAssignment_7_1
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
    // InternalAspectLang.g:4156:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4160:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalAspectLang.g:4161:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalAspectLang.g:4168:1: rule__Annotation__Group__0__Impl : ( '@' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4172:1: ( ( '@' ) )
            // InternalAspectLang.g:4173:1: ( '@' )
            {
            // InternalAspectLang.g:4173:1: ( '@' )
            // InternalAspectLang.g:4174:1: '@'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommercialAtKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4187:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4191:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalAspectLang.g:4192:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalAspectLang.g:4199:1: rule__Annotation__Group__1__Impl : ( ( rule__Annotation__NameAssignment_1 ) ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4203:1: ( ( ( rule__Annotation__NameAssignment_1 ) ) )
            // InternalAspectLang.g:4204:1: ( ( rule__Annotation__NameAssignment_1 ) )
            {
            // InternalAspectLang.g:4204:1: ( ( rule__Annotation__NameAssignment_1 ) )
            // InternalAspectLang.g:4205:1: ( rule__Annotation__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameAssignment_1()); 
            }
            // InternalAspectLang.g:4206:1: ( rule__Annotation__NameAssignment_1 )
            // InternalAspectLang.g:4206:2: rule__Annotation__NameAssignment_1
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
    // InternalAspectLang.g:4216:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4220:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalAspectLang.g:4221:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Annotation__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAspectLang.g:4228:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__TechnologiesAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4232:1: ( ( ( rule__Annotation__TechnologiesAssignment_2 ) ) )
            // InternalAspectLang.g:4233:1: ( ( rule__Annotation__TechnologiesAssignment_2 ) )
            {
            // InternalAspectLang.g:4233:1: ( ( rule__Annotation__TechnologiesAssignment_2 ) )
            // InternalAspectLang.g:4234:1: ( rule__Annotation__TechnologiesAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getTechnologiesAssignment_2()); 
            }
            // InternalAspectLang.g:4235:1: ( rule__Annotation__TechnologiesAssignment_2 )
            // InternalAspectLang.g:4235:2: rule__Annotation__TechnologiesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__TechnologiesAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getTechnologiesAssignment_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Annotation__Group__3"
    // InternalAspectLang.g:4245:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4249:1: ( rule__Annotation__Group__3__Impl )
            // InternalAspectLang.g:4250:2: rule__Annotation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // InternalAspectLang.g:4256:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__Group_3__0 ) ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4260:1: ( ( ( rule__Annotation__Group_3__0 ) ) )
            // InternalAspectLang.g:4261:1: ( ( rule__Annotation__Group_3__0 ) )
            {
            // InternalAspectLang.g:4261:1: ( ( rule__Annotation__Group_3__0 ) )
            // InternalAspectLang.g:4262:1: ( rule__Annotation__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getGroup_3()); 
            }
            // InternalAspectLang.g:4263:1: ( rule__Annotation__Group_3__0 )
            // InternalAspectLang.g:4263:2: rule__Annotation__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__Annotation__Group_3__0"
    // InternalAspectLang.g:4281:1: rule__Annotation__Group_3__0 : rule__Annotation__Group_3__0__Impl rule__Annotation__Group_3__1 ;
    public final void rule__Annotation__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4285:1: ( rule__Annotation__Group_3__0__Impl rule__Annotation__Group_3__1 )
            // InternalAspectLang.g:4286:2: rule__Annotation__Group_3__0__Impl rule__Annotation__Group_3__1
            {
            pushFollow(FOLLOW_33);
            rule__Annotation__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3__0"


    // $ANTLR start "rule__Annotation__Group_3__0__Impl"
    // InternalAspectLang.g:4293:1: rule__Annotation__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Annotation__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4297:1: ( ( ',' ) )
            // InternalAspectLang.g:4298:1: ( ',' )
            {
            // InternalAspectLang.g:4298:1: ( ',' )
            // InternalAspectLang.g:4299:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getCommaKeyword_3_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getCommaKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3__0__Impl"


    // $ANTLR start "rule__Annotation__Group_3__1"
    // InternalAspectLang.g:4312:1: rule__Annotation__Group_3__1 : rule__Annotation__Group_3__1__Impl ;
    public final void rule__Annotation__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4316:1: ( rule__Annotation__Group_3__1__Impl )
            // InternalAspectLang.g:4317:2: rule__Annotation__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3__1"


    // $ANTLR start "rule__Annotation__Group_3__1__Impl"
    // InternalAspectLang.g:4323:1: rule__Annotation__Group_3__1__Impl : ( ( rule__Annotation__TechnologiesAssignment_3_1 ) ) ;
    public final void rule__Annotation__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4327:1: ( ( ( rule__Annotation__TechnologiesAssignment_3_1 ) ) )
            // InternalAspectLang.g:4328:1: ( ( rule__Annotation__TechnologiesAssignment_3_1 ) )
            {
            // InternalAspectLang.g:4328:1: ( ( rule__Annotation__TechnologiesAssignment_3_1 ) )
            // InternalAspectLang.g:4329:1: ( rule__Annotation__TechnologiesAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getTechnologiesAssignment_3_1()); 
            }
            // InternalAspectLang.g:4330:1: ( rule__Annotation__TechnologiesAssignment_3_1 )
            // InternalAspectLang.g:4330:2: rule__Annotation__TechnologiesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__TechnologiesAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getTechnologiesAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group_3__1__Impl"


    // $ANTLR start "rule__LocationQuery__Group__0"
    // InternalAspectLang.g:4344:1: rule__LocationQuery__Group__0 : rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 ;
    public final void rule__LocationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4348:1: ( rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1 )
            // InternalAspectLang.g:4349:2: rule__LocationQuery__Group__0__Impl rule__LocationQuery__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalAspectLang.g:4356:1: rule__LocationQuery__Group__0__Impl : ( ( rule__LocationQuery__ModifierAssignment_0 )? ) ;
    public final void rule__LocationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4360:1: ( ( ( rule__LocationQuery__ModifierAssignment_0 )? ) )
            // InternalAspectLang.g:4361:1: ( ( rule__LocationQuery__ModifierAssignment_0 )? )
            {
            // InternalAspectLang.g:4361:1: ( ( rule__LocationQuery__ModifierAssignment_0 )? )
            // InternalAspectLang.g:4362:1: ( rule__LocationQuery__ModifierAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getModifierAssignment_0()); 
            }
            // InternalAspectLang.g:4363:1: ( rule__LocationQuery__ModifierAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=28 && LA36_0<=29)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalAspectLang.g:4363:2: rule__LocationQuery__ModifierAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocationQuery__ModifierAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getModifierAssignment_0()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:4373:1: rule__LocationQuery__Group__1 : rule__LocationQuery__Group__1__Impl rule__LocationQuery__Group__2 ;
    public final void rule__LocationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4377:1: ( rule__LocationQuery__Group__1__Impl rule__LocationQuery__Group__2 )
            // InternalAspectLang.g:4378:2: rule__LocationQuery__Group__1__Impl rule__LocationQuery__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__LocationQuery__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocationQuery__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAspectLang.g:4385:1: rule__LocationQuery__Group__1__Impl : ( ( rule__LocationQuery__NodeAssignment_1 ) ) ;
    public final void rule__LocationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4389:1: ( ( ( rule__LocationQuery__NodeAssignment_1 ) ) )
            // InternalAspectLang.g:4390:1: ( ( rule__LocationQuery__NodeAssignment_1 ) )
            {
            // InternalAspectLang.g:4390:1: ( ( rule__LocationQuery__NodeAssignment_1 ) )
            // InternalAspectLang.g:4391:1: ( rule__LocationQuery__NodeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeAssignment_1()); 
            }
            // InternalAspectLang.g:4392:1: ( rule__LocationQuery__NodeAssignment_1 )
            // InternalAspectLang.g:4392:2: rule__LocationQuery__NodeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LocationQuery__NodeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getNodeAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LocationQuery__Group__2"
    // InternalAspectLang.g:4402:1: rule__LocationQuery__Group__2 : rule__LocationQuery__Group__2__Impl ;
    public final void rule__LocationQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4406:1: ( rule__LocationQuery__Group__2__Impl )
            // InternalAspectLang.g:4407:2: rule__LocationQuery__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocationQuery__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group__2"


    // $ANTLR start "rule__LocationQuery__Group__2__Impl"
    // InternalAspectLang.g:4413:1: rule__LocationQuery__Group__2__Impl : ( ( rule__LocationQuery__Alternatives_2 )? ) ;
    public final void rule__LocationQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4417:1: ( ( ( rule__LocationQuery__Alternatives_2 )? ) )
            // InternalAspectLang.g:4418:1: ( ( rule__LocationQuery__Alternatives_2 )? )
            {
            // InternalAspectLang.g:4418:1: ( ( rule__LocationQuery__Alternatives_2 )? )
            // InternalAspectLang.g:4419:1: ( rule__LocationQuery__Alternatives_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getAlternatives_2()); 
            }
            // InternalAspectLang.g:4420:1: ( rule__LocationQuery__Alternatives_2 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==49||LA37_0==57) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalAspectLang.g:4420:2: rule__LocationQuery__Alternatives_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocationQuery__Alternatives_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group__2__Impl"


    // $ANTLR start "rule__LocationQuery__Group_2_0__0"
    // InternalAspectLang.g:4436:1: rule__LocationQuery__Group_2_0__0 : rule__LocationQuery__Group_2_0__0__Impl rule__LocationQuery__Group_2_0__1 ;
    public final void rule__LocationQuery__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4440:1: ( rule__LocationQuery__Group_2_0__0__Impl rule__LocationQuery__Group_2_0__1 )
            // InternalAspectLang.g:4441:2: rule__LocationQuery__Group_2_0__0__Impl rule__LocationQuery__Group_2_0__1
            {
            pushFollow(FOLLOW_29);
            rule__LocationQuery__Group_2_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocationQuery__Group_2_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_2_0__0"


    // $ANTLR start "rule__LocationQuery__Group_2_0__0__Impl"
    // InternalAspectLang.g:4448:1: rule__LocationQuery__Group_2_0__0__Impl : ( '.' ) ;
    public final void rule__LocationQuery__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4452:1: ( ( '.' ) )
            // InternalAspectLang.g:4453:1: ( '.' )
            {
            // InternalAspectLang.g:4453:1: ( '.' )
            // InternalAspectLang.g:4454:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getFullStopKeyword_2_0_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getFullStopKeyword_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_2_0__0__Impl"


    // $ANTLR start "rule__LocationQuery__Group_2_0__1"
    // InternalAspectLang.g:4467:1: rule__LocationQuery__Group_2_0__1 : rule__LocationQuery__Group_2_0__1__Impl ;
    public final void rule__LocationQuery__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4471:1: ( rule__LocationQuery__Group_2_0__1__Impl )
            // InternalAspectLang.g:4472:2: rule__LocationQuery__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocationQuery__Group_2_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_2_0__1"


    // $ANTLR start "rule__LocationQuery__Group_2_0__1__Impl"
    // InternalAspectLang.g:4478:1: rule__LocationQuery__Group_2_0__1__Impl : ( ( rule__LocationQuery__SpecializationAssignment_2_0_1 ) ) ;
    public final void rule__LocationQuery__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4482:1: ( ( ( rule__LocationQuery__SpecializationAssignment_2_0_1 ) ) )
            // InternalAspectLang.g:4483:1: ( ( rule__LocationQuery__SpecializationAssignment_2_0_1 ) )
            {
            // InternalAspectLang.g:4483:1: ( ( rule__LocationQuery__SpecializationAssignment_2_0_1 ) )
            // InternalAspectLang.g:4484:1: ( rule__LocationQuery__SpecializationAssignment_2_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_2_0_1()); 
            }
            // InternalAspectLang.g:4485:1: ( rule__LocationQuery__SpecializationAssignment_2_0_1 )
            // InternalAspectLang.g:4485:2: rule__LocationQuery__SpecializationAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LocationQuery__SpecializationAssignment_2_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getSpecializationAssignment_2_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__Group_2_0__1__Impl"


    // $ANTLR start "rule__CompositionQuery__Group__0"
    // InternalAspectLang.g:4499:1: rule__CompositionQuery__Group__0 : rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1 ;
    public final void rule__CompositionQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4503:1: ( rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1 )
            // InternalAspectLang.g:4504:2: rule__CompositionQuery__Group__0__Impl rule__CompositionQuery__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalAspectLang.g:4511:1: rule__CompositionQuery__Group__0__Impl : ( () ) ;
    public final void rule__CompositionQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4515:1: ( ( () ) )
            // InternalAspectLang.g:4516:1: ( () )
            {
            // InternalAspectLang.g:4516:1: ( () )
            // InternalAspectLang.g:4517:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getCompositionQueryAction_0()); 
            }
            // InternalAspectLang.g:4518:1: ()
            // InternalAspectLang.g:4520:1: 
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
    // InternalAspectLang.g:4530:1: rule__CompositionQuery__Group__1 : rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2 ;
    public final void rule__CompositionQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4534:1: ( rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2 )
            // InternalAspectLang.g:4535:2: rule__CompositionQuery__Group__1__Impl rule__CompositionQuery__Group__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalAspectLang.g:4542:1: rule__CompositionQuery__Group__1__Impl : ( '{' ) ;
    public final void rule__CompositionQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4546:1: ( ( '{' ) )
            // InternalAspectLang.g:4547:1: ( '{' )
            {
            // InternalAspectLang.g:4547:1: ( '{' )
            // InternalAspectLang.g:4548:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getLeftCurlyBracketKeyword_1()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:4561:1: rule__CompositionQuery__Group__2 : rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3 ;
    public final void rule__CompositionQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4565:1: ( rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3 )
            // InternalAspectLang.g:4566:2: rule__CompositionQuery__Group__2__Impl rule__CompositionQuery__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalAspectLang.g:4573:1: rule__CompositionQuery__Group__2__Impl : ( ( rule__CompositionQuery__SubQueriesAssignment_2 )* ) ;
    public final void rule__CompositionQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4577:1: ( ( ( rule__CompositionQuery__SubQueriesAssignment_2 )* ) )
            // InternalAspectLang.g:4578:1: ( ( rule__CompositionQuery__SubQueriesAssignment_2 )* )
            {
            // InternalAspectLang.g:4578:1: ( ( rule__CompositionQuery__SubQueriesAssignment_2 )* )
            // InternalAspectLang.g:4579:1: ( rule__CompositionQuery__SubQueriesAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getSubQueriesAssignment_2()); 
            }
            // InternalAspectLang.g:4580:1: ( rule__CompositionQuery__SubQueriesAssignment_2 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID||LA38_0==13||(LA38_0>=28 && LA38_0<=29)||(LA38_0>=60 && LA38_0<=61)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalAspectLang.g:4580:2: rule__CompositionQuery__SubQueriesAssignment_2
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__CompositionQuery__SubQueriesAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getSubQueriesAssignment_2()); 
            }

            }


            }

        }
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
    // InternalAspectLang.g:4590:1: rule__CompositionQuery__Group__3 : rule__CompositionQuery__Group__3__Impl ;
    public final void rule__CompositionQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4594:1: ( rule__CompositionQuery__Group__3__Impl )
            // InternalAspectLang.g:4595:2: rule__CompositionQuery__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompositionQuery__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalAspectLang.g:4601:1: rule__CompositionQuery__Group__3__Impl : ( '}' ) ;
    public final void rule__CompositionQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4605:1: ( ( '}' ) )
            // InternalAspectLang.g:4606:1: ( '}' )
            {
            // InternalAspectLang.g:4606:1: ( '}' )
            // InternalAspectLang.g:4607:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getRightCurlyBracketKeyword_3()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__OperationQuery__Group__0"
    // InternalAspectLang.g:4628:1: rule__OperationQuery__Group__0 : rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 ;
    public final void rule__OperationQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4632:1: ( rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1 )
            // InternalAspectLang.g:4633:2: rule__OperationQuery__Group__0__Impl rule__OperationQuery__Group__1
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
    // InternalAspectLang.g:4640:1: rule__OperationQuery__Group__0__Impl : ( () ) ;
    public final void rule__OperationQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4644:1: ( ( () ) )
            // InternalAspectLang.g:4645:1: ( () )
            {
            // InternalAspectLang.g:4645:1: ( () )
            // InternalAspectLang.g:4646:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationQueryAction_0()); 
            }
            // InternalAspectLang.g:4647:1: ()
            // InternalAspectLang.g:4649:1: 
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
    // InternalAspectLang.g:4659:1: rule__OperationQuery__Group__1 : rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 ;
    public final void rule__OperationQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4663:1: ( rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2 )
            // InternalAspectLang.g:4664:2: rule__OperationQuery__Group__1__Impl rule__OperationQuery__Group__2
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
    // InternalAspectLang.g:4671:1: rule__OperationQuery__Group__1__Impl : ( ( rule__OperationQuery__ModifierAssignment_1 )? ) ;
    public final void rule__OperationQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4675:1: ( ( ( rule__OperationQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:4676:1: ( ( rule__OperationQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:4676:1: ( ( rule__OperationQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:4677:1: ( rule__OperationQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:4678:1: ( rule__OperationQuery__ModifierAssignment_1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==RULE_ID||LA39_1==13) ) {
                    alt39=1;
                }
            }
            switch (alt39) {
                case 1 :
                    // InternalAspectLang.g:4678:2: rule__OperationQuery__ModifierAssignment_1
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
    // InternalAspectLang.g:4688:1: rule__OperationQuery__Group__2 : rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 ;
    public final void rule__OperationQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4692:1: ( rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3 )
            // InternalAspectLang.g:4693:2: rule__OperationQuery__Group__2__Impl rule__OperationQuery__Group__3
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
    // InternalAspectLang.g:4700:1: rule__OperationQuery__Group__2__Impl : ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? ) ;
    public final void rule__OperationQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4704:1: ( ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? ) )
            // InternalAspectLang.g:4705:1: ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? )
            {
            // InternalAspectLang.g:4705:1: ( ( rule__OperationQuery__ReturnTypeAssignment_2 )? )
            // InternalAspectLang.g:4706:1: ( rule__OperationQuery__ReturnTypeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getReturnTypeAssignment_2()); 
            }
            // InternalAspectLang.g:4707:1: ( rule__OperationQuery__ReturnTypeAssignment_2 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ID) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==57) ) {
                    alt40=1;
                }
            }
            switch (alt40) {
                case 1 :
                    // InternalAspectLang.g:4707:2: rule__OperationQuery__ReturnTypeAssignment_2
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
    // InternalAspectLang.g:4717:1: rule__OperationQuery__Group__3 : rule__OperationQuery__Group__3__Impl ;
    public final void rule__OperationQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4721:1: ( rule__OperationQuery__Group__3__Impl )
            // InternalAspectLang.g:4722:2: rule__OperationQuery__Group__3__Impl
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
    // InternalAspectLang.g:4728:1: rule__OperationQuery__Group__3__Impl : ( ( rule__OperationQuery__Alternatives_3 ) ) ;
    public final void rule__OperationQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4732:1: ( ( ( rule__OperationQuery__Alternatives_3 ) ) )
            // InternalAspectLang.g:4733:1: ( ( rule__OperationQuery__Alternatives_3 ) )
            {
            // InternalAspectLang.g:4733:1: ( ( rule__OperationQuery__Alternatives_3 ) )
            // InternalAspectLang.g:4734:1: ( rule__OperationQuery__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getAlternatives_3()); 
            }
            // InternalAspectLang.g:4735:1: ( rule__OperationQuery__Alternatives_3 )
            // InternalAspectLang.g:4735:2: rule__OperationQuery__Alternatives_3
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
    // InternalAspectLang.g:4753:1: rule__OperationQuery__Group_3_0__0 : rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1 ;
    public final void rule__OperationQuery__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4757:1: ( rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1 )
            // InternalAspectLang.g:4758:2: rule__OperationQuery__Group_3_0__0__Impl rule__OperationQuery__Group_3_0__1
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
    // InternalAspectLang.g:4765:1: rule__OperationQuery__Group_3_0__0__Impl : ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) ) ;
    public final void rule__OperationQuery__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4769:1: ( ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) ) )
            // InternalAspectLang.g:4770:1: ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) )
            {
            // InternalAspectLang.g:4770:1: ( ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 ) )
            // InternalAspectLang.g:4771:1: ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationReferenceAssignment_3_0_0()); 
            }
            // InternalAspectLang.g:4772:1: ( rule__OperationQuery__OperationReferenceAssignment_3_0_0 )
            // InternalAspectLang.g:4772:2: rule__OperationQuery__OperationReferenceAssignment_3_0_0
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
    // InternalAspectLang.g:4782:1: rule__OperationQuery__Group_3_0__1 : rule__OperationQuery__Group_3_0__1__Impl ;
    public final void rule__OperationQuery__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4786:1: ( rule__OperationQuery__Group_3_0__1__Impl )
            // InternalAspectLang.g:4787:2: rule__OperationQuery__Group_3_0__1__Impl
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
    // InternalAspectLang.g:4793:1: rule__OperationQuery__Group_3_0__1__Impl : ( ( rule__OperationQuery__Group_3_0_1__0 )? ) ;
    public final void rule__OperationQuery__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4797:1: ( ( ( rule__OperationQuery__Group_3_0_1__0 )? ) )
            // InternalAspectLang.g:4798:1: ( ( rule__OperationQuery__Group_3_0_1__0 )? )
            {
            // InternalAspectLang.g:4798:1: ( ( rule__OperationQuery__Group_3_0_1__0 )? )
            // InternalAspectLang.g:4799:1: ( rule__OperationQuery__Group_3_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup_3_0_1()); 
            }
            // InternalAspectLang.g:4800:1: ( rule__OperationQuery__Group_3_0_1__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalAspectLang.g:4800:2: rule__OperationQuery__Group_3_0_1__0
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
    // InternalAspectLang.g:4814:1: rule__OperationQuery__Group_3_0_1__0 : rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1 ;
    public final void rule__OperationQuery__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4818:1: ( rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1 )
            // InternalAspectLang.g:4819:2: rule__OperationQuery__Group_3_0_1__0__Impl rule__OperationQuery__Group_3_0_1__1
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
    // InternalAspectLang.g:4826:1: rule__OperationQuery__Group_3_0_1__0__Impl : ( '(' ) ;
    public final void rule__OperationQuery__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4830:1: ( ( '(' ) )
            // InternalAspectLang.g:4831:1: ( '(' )
            {
            // InternalAspectLang.g:4831:1: ( '(' )
            // InternalAspectLang.g:4832:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getLeftParenthesisKeyword_3_0_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4845:1: rule__OperationQuery__Group_3_0_1__1 : rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2 ;
    public final void rule__OperationQuery__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4849:1: ( rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2 )
            // InternalAspectLang.g:4850:2: rule__OperationQuery__Group_3_0_1__1__Impl rule__OperationQuery__Group_3_0_1__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalAspectLang.g:4857:1: rule__OperationQuery__Group_3_0_1__1__Impl : ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) ) ;
    public final void rule__OperationQuery__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4861:1: ( ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) ) )
            // InternalAspectLang.g:4862:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) )
            {
            // InternalAspectLang.g:4862:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 ) )
            // InternalAspectLang.g:4863:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_1()); 
            }
            // InternalAspectLang.g:4864:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 )
            // InternalAspectLang.g:4864:2: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1
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
    // InternalAspectLang.g:4874:1: rule__OperationQuery__Group_3_0_1__2 : rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3 ;
    public final void rule__OperationQuery__Group_3_0_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4878:1: ( rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3 )
            // InternalAspectLang.g:4879:2: rule__OperationQuery__Group_3_0_1__2__Impl rule__OperationQuery__Group_3_0_1__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalAspectLang.g:4886:1: rule__OperationQuery__Group_3_0_1__2__Impl : ( ( rule__OperationQuery__Group_3_0_1_2__0 )* ) ;
    public final void rule__OperationQuery__Group_3_0_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4890:1: ( ( ( rule__OperationQuery__Group_3_0_1_2__0 )* ) )
            // InternalAspectLang.g:4891:1: ( ( rule__OperationQuery__Group_3_0_1_2__0 )* )
            {
            // InternalAspectLang.g:4891:1: ( ( rule__OperationQuery__Group_3_0_1_2__0 )* )
            // InternalAspectLang.g:4892:1: ( rule__OperationQuery__Group_3_0_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getGroup_3_0_1_2()); 
            }
            // InternalAspectLang.g:4893:1: ( rule__OperationQuery__Group_3_0_1_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==45) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalAspectLang.g:4893:2: rule__OperationQuery__Group_3_0_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__OperationQuery__Group_3_0_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalAspectLang.g:4903:1: rule__OperationQuery__Group_3_0_1__3 : rule__OperationQuery__Group_3_0_1__3__Impl ;
    public final void rule__OperationQuery__Group_3_0_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4907:1: ( rule__OperationQuery__Group_3_0_1__3__Impl )
            // InternalAspectLang.g:4908:2: rule__OperationQuery__Group_3_0_1__3__Impl
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
    // InternalAspectLang.g:4914:1: rule__OperationQuery__Group_3_0_1__3__Impl : ( ')' ) ;
    public final void rule__OperationQuery__Group_3_0_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4918:1: ( ( ')' ) )
            // InternalAspectLang.g:4919:1: ( ')' )
            {
            // InternalAspectLang.g:4919:1: ( ')' )
            // InternalAspectLang.g:4920:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getRightParenthesisKeyword_3_0_1_3()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4941:1: rule__OperationQuery__Group_3_0_1_2__0 : rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1 ;
    public final void rule__OperationQuery__Group_3_0_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4945:1: ( rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1 )
            // InternalAspectLang.g:4946:2: rule__OperationQuery__Group_3_0_1_2__0__Impl rule__OperationQuery__Group_3_0_1_2__1
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
    // InternalAspectLang.g:4953:1: rule__OperationQuery__Group_3_0_1_2__0__Impl : ( ',' ) ;
    public final void rule__OperationQuery__Group_3_0_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4957:1: ( ( ',' ) )
            // InternalAspectLang.g:4958:1: ( ',' )
            {
            // InternalAspectLang.g:4958:1: ( ',' )
            // InternalAspectLang.g:4959:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getCommaKeyword_3_0_1_2_0()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:4972:1: rule__OperationQuery__Group_3_0_1_2__1 : rule__OperationQuery__Group_3_0_1_2__1__Impl ;
    public final void rule__OperationQuery__Group_3_0_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4976:1: ( rule__OperationQuery__Group_3_0_1_2__1__Impl )
            // InternalAspectLang.g:4977:2: rule__OperationQuery__Group_3_0_1_2__1__Impl
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
    // InternalAspectLang.g:4983:1: rule__OperationQuery__Group_3_0_1_2__1__Impl : ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) ) ;
    public final void rule__OperationQuery__Group_3_0_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:4987:1: ( ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) ) )
            // InternalAspectLang.g:4988:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) )
            {
            // InternalAspectLang.g:4988:1: ( ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 ) )
            // InternalAspectLang.g:4989:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getParameterQueriesAssignment_3_0_1_2_1()); 
            }
            // InternalAspectLang.g:4990:1: ( rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 )
            // InternalAspectLang.g:4990:2: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1
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
    // InternalAspectLang.g:5004:1: rule__ParameterQuery__Group__0 : rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1 ;
    public final void rule__ParameterQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5008:1: ( rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1 )
            // InternalAspectLang.g:5009:2: rule__ParameterQuery__Group__0__Impl rule__ParameterQuery__Group__1
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
    // InternalAspectLang.g:5016:1: rule__ParameterQuery__Group__0__Impl : ( () ) ;
    public final void rule__ParameterQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5020:1: ( ( () ) )
            // InternalAspectLang.g:5021:1: ( () )
            {
            // InternalAspectLang.g:5021:1: ( () )
            // InternalAspectLang.g:5022:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterQueryAction_0()); 
            }
            // InternalAspectLang.g:5023:1: ()
            // InternalAspectLang.g:5025:1: 
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
    // InternalAspectLang.g:5035:1: rule__ParameterQuery__Group__1 : rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2 ;
    public final void rule__ParameterQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5039:1: ( rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2 )
            // InternalAspectLang.g:5040:2: rule__ParameterQuery__Group__1__Impl rule__ParameterQuery__Group__2
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
    // InternalAspectLang.g:5047:1: rule__ParameterQuery__Group__1__Impl : ( ( rule__ParameterQuery__ModifierAssignment_1 )? ) ;
    public final void rule__ParameterQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5051:1: ( ( ( rule__ParameterQuery__ModifierAssignment_1 )? ) )
            // InternalAspectLang.g:5052:1: ( ( rule__ParameterQuery__ModifierAssignment_1 )? )
            {
            // InternalAspectLang.g:5052:1: ( ( rule__ParameterQuery__ModifierAssignment_1 )? )
            // InternalAspectLang.g:5053:1: ( rule__ParameterQuery__ModifierAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierAssignment_1()); 
            }
            // InternalAspectLang.g:5054:1: ( rule__ParameterQuery__ModifierAssignment_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_ID) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==RULE_ID||LA43_1==13) ) {
                    alt43=1;
                }
            }
            switch (alt43) {
                case 1 :
                    // InternalAspectLang.g:5054:2: rule__ParameterQuery__ModifierAssignment_1
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
    // InternalAspectLang.g:5064:1: rule__ParameterQuery__Group__2 : rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3 ;
    public final void rule__ParameterQuery__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5068:1: ( rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3 )
            // InternalAspectLang.g:5069:2: rule__ParameterQuery__Group__2__Impl rule__ParameterQuery__Group__3
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
    // InternalAspectLang.g:5076:1: rule__ParameterQuery__Group__2__Impl : ( ( rule__ParameterQuery__Alternatives_2 ) ) ;
    public final void rule__ParameterQuery__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5080:1: ( ( ( rule__ParameterQuery__Alternatives_2 ) ) )
            // InternalAspectLang.g:5081:1: ( ( rule__ParameterQuery__Alternatives_2 ) )
            {
            // InternalAspectLang.g:5081:1: ( ( rule__ParameterQuery__Alternatives_2 ) )
            // InternalAspectLang.g:5082:1: ( rule__ParameterQuery__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getAlternatives_2()); 
            }
            // InternalAspectLang.g:5083:1: ( rule__ParameterQuery__Alternatives_2 )
            // InternalAspectLang.g:5083:2: rule__ParameterQuery__Alternatives_2
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
    // InternalAspectLang.g:5093:1: rule__ParameterQuery__Group__3 : rule__ParameterQuery__Group__3__Impl ;
    public final void rule__ParameterQuery__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5097:1: ( rule__ParameterQuery__Group__3__Impl )
            // InternalAspectLang.g:5098:2: rule__ParameterQuery__Group__3__Impl
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
    // InternalAspectLang.g:5104:1: rule__ParameterQuery__Group__3__Impl : ( ( rule__ParameterQuery__ParameterAssignment_3 )? ) ;
    public final void rule__ParameterQuery__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5108:1: ( ( ( rule__ParameterQuery__ParameterAssignment_3 )? ) )
            // InternalAspectLang.g:5109:1: ( ( rule__ParameterQuery__ParameterAssignment_3 )? )
            {
            // InternalAspectLang.g:5109:1: ( ( rule__ParameterQuery__ParameterAssignment_3 )? )
            // InternalAspectLang.g:5110:1: ( rule__ParameterQuery__ParameterAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterAssignment_3()); 
            }
            // InternalAspectLang.g:5111:1: ( rule__ParameterQuery__ParameterAssignment_3 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalAspectLang.g:5111:2: rule__ParameterQuery__ParameterAssignment_3
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
    // InternalAspectLang.g:5129:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5133:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // InternalAspectLang.g:5134:2: rule__Node__Group__0__Impl rule__Node__Group__1
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
    // InternalAspectLang.g:5141:1: rule__Node__Group__0__Impl : ( ( rule__Node__Alternatives_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5145:1: ( ( ( rule__Node__Alternatives_0 ) ) )
            // InternalAspectLang.g:5146:1: ( ( rule__Node__Alternatives_0 ) )
            {
            // InternalAspectLang.g:5146:1: ( ( rule__Node__Alternatives_0 ) )
            // InternalAspectLang.g:5147:1: ( rule__Node__Alternatives_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getAlternatives_0()); 
            }
            // InternalAspectLang.g:5148:1: ( rule__Node__Alternatives_0 )
            // InternalAspectLang.g:5148:2: rule__Node__Alternatives_0
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
    // InternalAspectLang.g:5158:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5162:1: ( rule__Node__Group__1__Impl )
            // InternalAspectLang.g:5163:2: rule__Node__Group__1__Impl
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
    // InternalAspectLang.g:5169:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5173:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // InternalAspectLang.g:5174:1: ( ( rule__Node__Group_1__0 )? )
            {
            // InternalAspectLang.g:5174:1: ( ( rule__Node__Group_1__0 )? )
            // InternalAspectLang.g:5175:1: ( rule__Node__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5176:1: ( rule__Node__Group_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==53) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalAspectLang.g:5176:2: rule__Node__Group_1__0
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
    // InternalAspectLang.g:5190:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5194:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // InternalAspectLang.g:5195:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAspectLang.g:5202:1: rule__Node__Group_1__0__Impl : ( '[' ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5206:1: ( ( '[' ) )
            // InternalAspectLang.g:5207:1: ( '[' )
            {
            // InternalAspectLang.g:5207:1: ( '[' )
            // InternalAspectLang.g:5208:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5221:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl rule__Node__Group_1__2 ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5225:1: ( rule__Node__Group_1__1__Impl rule__Node__Group_1__2 )
            // InternalAspectLang.g:5226:2: rule__Node__Group_1__1__Impl rule__Node__Group_1__2
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
    // InternalAspectLang.g:5233:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__ConstraintAssignment_1_1 ) ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5237:1: ( ( ( rule__Node__ConstraintAssignment_1_1 ) ) )
            // InternalAspectLang.g:5238:1: ( ( rule__Node__ConstraintAssignment_1_1 ) )
            {
            // InternalAspectLang.g:5238:1: ( ( rule__Node__ConstraintAssignment_1_1 ) )
            // InternalAspectLang.g:5239:1: ( rule__Node__ConstraintAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getConstraintAssignment_1_1()); 
            }
            // InternalAspectLang.g:5240:1: ( rule__Node__ConstraintAssignment_1_1 )
            // InternalAspectLang.g:5240:2: rule__Node__ConstraintAssignment_1_1
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
    // InternalAspectLang.g:5250:1: rule__Node__Group_1__2 : rule__Node__Group_1__2__Impl ;
    public final void rule__Node__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5254:1: ( rule__Node__Group_1__2__Impl )
            // InternalAspectLang.g:5255:2: rule__Node__Group_1__2__Impl
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
    // InternalAspectLang.g:5261:1: rule__Node__Group_1__2__Impl : ( ']' ) ;
    public final void rule__Node__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5265:1: ( ( ']' ) )
            // InternalAspectLang.g:5266:1: ( ']' )
            {
            // InternalAspectLang.g:5266:1: ( ']' )
            // InternalAspectLang.g:5267:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNodeAccess().getRightSquareBracketKeyword_1_2()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5286:1: rule__WildcardNode__Group__0 : rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 ;
    public final void rule__WildcardNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5290:1: ( rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1 )
            // InternalAspectLang.g:5291:2: rule__WildcardNode__Group__0__Impl rule__WildcardNode__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAspectLang.g:5298:1: rule__WildcardNode__Group__0__Impl : ( () ) ;
    public final void rule__WildcardNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5302:1: ( ( () ) )
            // InternalAspectLang.g:5303:1: ( () )
            {
            // InternalAspectLang.g:5303:1: ( () )
            // InternalAspectLang.g:5304:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getWildcardNodeAccess().getWildcardNodeAction_0()); 
            }
            // InternalAspectLang.g:5305:1: ()
            // InternalAspectLang.g:5307:1: 
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
    // InternalAspectLang.g:5317:1: rule__WildcardNode__Group__1 : rule__WildcardNode__Group__1__Impl ;
    public final void rule__WildcardNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5321:1: ( rule__WildcardNode__Group__1__Impl )
            // InternalAspectLang.g:5322:2: rule__WildcardNode__Group__1__Impl
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
    // InternalAspectLang.g:5328:1: rule__WildcardNode__Group__1__Impl : ( '*' ) ;
    public final void rule__WildcardNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5332:1: ( ( '*' ) )
            // InternalAspectLang.g:5333:1: ( '*' )
            {
            // InternalAspectLang.g:5333:1: ( '*' )
            // InternalAspectLang.g:5334:1: '*'
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
    // InternalAspectLang.g:5351:1: rule__SubPathNode__Group__0 : rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 ;
    public final void rule__SubPathNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5355:1: ( rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1 )
            // InternalAspectLang.g:5356:2: rule__SubPathNode__Group__0__Impl rule__SubPathNode__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalAspectLang.g:5363:1: rule__SubPathNode__Group__0__Impl : ( () ) ;
    public final void rule__SubPathNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5367:1: ( ( () ) )
            // InternalAspectLang.g:5368:1: ( () )
            {
            // InternalAspectLang.g:5368:1: ( () )
            // InternalAspectLang.g:5369:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getSubPathNodeAction_0()); 
            }
            // InternalAspectLang.g:5370:1: ()
            // InternalAspectLang.g:5372:1: 
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
    // InternalAspectLang.g:5382:1: rule__SubPathNode__Group__1 : rule__SubPathNode__Group__1__Impl ;
    public final void rule__SubPathNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5386:1: ( rule__SubPathNode__Group__1__Impl )
            // InternalAspectLang.g:5387:2: rule__SubPathNode__Group__1__Impl
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
    // InternalAspectLang.g:5393:1: rule__SubPathNode__Group__1__Impl : ( '**' ) ;
    public final void rule__SubPathNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5397:1: ( ( '**' ) )
            // InternalAspectLang.g:5398:1: ( '**' )
            {
            // InternalAspectLang.g:5398:1: ( '**' )
            // InternalAspectLang.g:5399:1: '**'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubPathNodeAccess().getAsteriskAsteriskKeyword_1()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5416:1: rule__ParentNode__Group__0 : rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 ;
    public final void rule__ParentNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5420:1: ( rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1 )
            // InternalAspectLang.g:5421:2: rule__ParentNode__Group__0__Impl rule__ParentNode__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalAspectLang.g:5428:1: rule__ParentNode__Group__0__Impl : ( () ) ;
    public final void rule__ParentNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5432:1: ( ( () ) )
            // InternalAspectLang.g:5433:1: ( () )
            {
            // InternalAspectLang.g:5433:1: ( () )
            // InternalAspectLang.g:5434:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getParentNodeAction_0()); 
            }
            // InternalAspectLang.g:5435:1: ()
            // InternalAspectLang.g:5437:1: 
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
    // InternalAspectLang.g:5447:1: rule__ParentNode__Group__1 : rule__ParentNode__Group__1__Impl ;
    public final void rule__ParentNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5451:1: ( rule__ParentNode__Group__1__Impl )
            // InternalAspectLang.g:5452:2: rule__ParentNode__Group__1__Impl
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
    // InternalAspectLang.g:5458:1: rule__ParentNode__Group__1__Impl : ( 'up' ) ;
    public final void rule__ParentNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5462:1: ( ( 'up' ) )
            // InternalAspectLang.g:5463:1: ( 'up' )
            {
            // InternalAspectLang.g:5463:1: ( 'up' )
            // InternalAspectLang.g:5464:1: 'up'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentNodeAccess().getUpKeyword_1()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5481:1: rule__PropertyConstraint__Group__0 : rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 ;
    public final void rule__PropertyConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5485:1: ( rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1 )
            // InternalAspectLang.g:5486:2: rule__PropertyConstraint__Group__0__Impl rule__PropertyConstraint__Group__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAspectLang.g:5493:1: rule__PropertyConstraint__Group__0__Impl : ( rulePropertyConstraintCompare ) ;
    public final void rule__PropertyConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5497:1: ( ( rulePropertyConstraintCompare ) )
            // InternalAspectLang.g:5498:1: ( rulePropertyConstraintCompare )
            {
            // InternalAspectLang.g:5498:1: ( rulePropertyConstraintCompare )
            // InternalAspectLang.g:5499:1: rulePropertyConstraintCompare
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
    // InternalAspectLang.g:5510:1: rule__PropertyConstraint__Group__1 : rule__PropertyConstraint__Group__1__Impl ;
    public final void rule__PropertyConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5514:1: ( rule__PropertyConstraint__Group__1__Impl )
            // InternalAspectLang.g:5515:2: rule__PropertyConstraint__Group__1__Impl
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
    // InternalAspectLang.g:5521:1: rule__PropertyConstraint__Group__1__Impl : ( ( rule__PropertyConstraint__Group_1__0 )? ) ;
    public final void rule__PropertyConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5525:1: ( ( ( rule__PropertyConstraint__Group_1__0 )? ) )
            // InternalAspectLang.g:5526:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            {
            // InternalAspectLang.g:5526:1: ( ( rule__PropertyConstraint__Group_1__0 )? )
            // InternalAspectLang.g:5527:1: ( rule__PropertyConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5528:1: ( rule__PropertyConstraint__Group_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=30 && LA46_0<=31)) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalAspectLang.g:5528:2: rule__PropertyConstraint__Group_1__0
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
    // InternalAspectLang.g:5542:1: rule__PropertyConstraint__Group_1__0 : rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 ;
    public final void rule__PropertyConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5546:1: ( rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1 )
            // InternalAspectLang.g:5547:2: rule__PropertyConstraint__Group_1__0__Impl rule__PropertyConstraint__Group_1__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalAspectLang.g:5554:1: rule__PropertyConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__PropertyConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5558:1: ( ( () ) )
            // InternalAspectLang.g:5559:1: ( () )
            {
            // InternalAspectLang.g:5559:1: ( () )
            // InternalAspectLang.g:5560:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getPropertyConstraintLeftAction_1_0()); 
            }
            // InternalAspectLang.g:5561:1: ()
            // InternalAspectLang.g:5563:1: 
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
    // InternalAspectLang.g:5573:1: rule__PropertyConstraint__Group_1__1 : rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2 ;
    public final void rule__PropertyConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5577:1: ( rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2 )
            // InternalAspectLang.g:5578:2: rule__PropertyConstraint__Group_1__1__Impl rule__PropertyConstraint__Group_1__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAspectLang.g:5585:1: rule__PropertyConstraint__Group_1__1__Impl : ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) ) ;
    public final void rule__PropertyConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5589:1: ( ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) ) )
            // InternalAspectLang.g:5590:1: ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) )
            {
            // InternalAspectLang.g:5590:1: ( ( rule__PropertyConstraint__LogicAssignment_1_1 ) )
            // InternalAspectLang.g:5591:1: ( rule__PropertyConstraint__LogicAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getLogicAssignment_1_1()); 
            }
            // InternalAspectLang.g:5592:1: ( rule__PropertyConstraint__LogicAssignment_1_1 )
            // InternalAspectLang.g:5592:2: rule__PropertyConstraint__LogicAssignment_1_1
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
    // InternalAspectLang.g:5602:1: rule__PropertyConstraint__Group_1__2 : rule__PropertyConstraint__Group_1__2__Impl ;
    public final void rule__PropertyConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5606:1: ( rule__PropertyConstraint__Group_1__2__Impl )
            // InternalAspectLang.g:5607:2: rule__PropertyConstraint__Group_1__2__Impl
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
    // InternalAspectLang.g:5613:1: rule__PropertyConstraint__Group_1__2__Impl : ( ( rule__PropertyConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__PropertyConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5617:1: ( ( ( rule__PropertyConstraint__RightAssignment_1_2 ) ) )
            // InternalAspectLang.g:5618:1: ( ( rule__PropertyConstraint__RightAssignment_1_2 ) )
            {
            // InternalAspectLang.g:5618:1: ( ( rule__PropertyConstraint__RightAssignment_1_2 ) )
            // InternalAspectLang.g:5619:1: ( rule__PropertyConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalAspectLang.g:5620:1: ( rule__PropertyConstraint__RightAssignment_1_2 )
            // InternalAspectLang.g:5620:2: rule__PropertyConstraint__RightAssignment_1_2
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
    // InternalAspectLang.g:5636:1: rule__PropertyConstraintCompare__Group__0 : rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1 ;
    public final void rule__PropertyConstraintCompare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5640:1: ( rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1 )
            // InternalAspectLang.g:5641:2: rule__PropertyConstraintCompare__Group__0__Impl rule__PropertyConstraintCompare__Group__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAspectLang.g:5648:1: rule__PropertyConstraintCompare__Group__0__Impl : ( ruleConstraintElement ) ;
    public final void rule__PropertyConstraintCompare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5652:1: ( ( ruleConstraintElement ) )
            // InternalAspectLang.g:5653:1: ( ruleConstraintElement )
            {
            // InternalAspectLang.g:5653:1: ( ruleConstraintElement )
            // InternalAspectLang.g:5654:1: ruleConstraintElement
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
    // InternalAspectLang.g:5665:1: rule__PropertyConstraintCompare__Group__1 : rule__PropertyConstraintCompare__Group__1__Impl ;
    public final void rule__PropertyConstraintCompare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5669:1: ( rule__PropertyConstraintCompare__Group__1__Impl )
            // InternalAspectLang.g:5670:2: rule__PropertyConstraintCompare__Group__1__Impl
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
    // InternalAspectLang.g:5676:1: rule__PropertyConstraintCompare__Group__1__Impl : ( ( rule__PropertyConstraintCompare__Group_1__0 )? ) ;
    public final void rule__PropertyConstraintCompare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5680:1: ( ( ( rule__PropertyConstraintCompare__Group_1__0 )? ) )
            // InternalAspectLang.g:5681:1: ( ( rule__PropertyConstraintCompare__Group_1__0 )? )
            {
            // InternalAspectLang.g:5681:1: ( ( rule__PropertyConstraintCompare__Group_1__0 )? )
            // InternalAspectLang.g:5682:1: ( rule__PropertyConstraintCompare__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:5683:1: ( rule__PropertyConstraintCompare__Group_1__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=32 && LA47_0<=38)) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalAspectLang.g:5683:2: rule__PropertyConstraintCompare__Group_1__0
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
    // InternalAspectLang.g:5697:1: rule__PropertyConstraintCompare__Group_1__0 : rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1 ;
    public final void rule__PropertyConstraintCompare__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5701:1: ( rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1 )
            // InternalAspectLang.g:5702:2: rule__PropertyConstraintCompare__Group_1__0__Impl rule__PropertyConstraintCompare__Group_1__1
            {
            pushFollow(FOLLOW_43);
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
    // InternalAspectLang.g:5709:1: rule__PropertyConstraintCompare__Group_1__0__Impl : ( () ) ;
    public final void rule__PropertyConstraintCompare__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5713:1: ( ( () ) )
            // InternalAspectLang.g:5714:1: ( () )
            {
            // InternalAspectLang.g:5714:1: ( () )
            // InternalAspectLang.g:5715:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getPropertyConstraintCompareLeftAction_1_0()); 
            }
            // InternalAspectLang.g:5716:1: ()
            // InternalAspectLang.g:5718:1: 
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
    // InternalAspectLang.g:5728:1: rule__PropertyConstraintCompare__Group_1__1 : rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2 ;
    public final void rule__PropertyConstraintCompare__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5732:1: ( rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2 )
            // InternalAspectLang.g:5733:2: rule__PropertyConstraintCompare__Group_1__1__Impl rule__PropertyConstraintCompare__Group_1__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalAspectLang.g:5740:1: rule__PropertyConstraintCompare__Group_1__1__Impl : ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) ) ;
    public final void rule__PropertyConstraintCompare__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5744:1: ( ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) ) )
            // InternalAspectLang.g:5745:1: ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) )
            {
            // InternalAspectLang.g:5745:1: ( ( rule__PropertyConstraintCompare__CompareAssignment_1_1 ) )
            // InternalAspectLang.g:5746:1: ( rule__PropertyConstraintCompare__CompareAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getCompareAssignment_1_1()); 
            }
            // InternalAspectLang.g:5747:1: ( rule__PropertyConstraintCompare__CompareAssignment_1_1 )
            // InternalAspectLang.g:5747:2: rule__PropertyConstraintCompare__CompareAssignment_1_1
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
    // InternalAspectLang.g:5757:1: rule__PropertyConstraintCompare__Group_1__2 : rule__PropertyConstraintCompare__Group_1__2__Impl ;
    public final void rule__PropertyConstraintCompare__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5761:1: ( rule__PropertyConstraintCompare__Group_1__2__Impl )
            // InternalAspectLang.g:5762:2: rule__PropertyConstraintCompare__Group_1__2__Impl
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
    // InternalAspectLang.g:5768:1: rule__PropertyConstraintCompare__Group_1__2__Impl : ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) ) ;
    public final void rule__PropertyConstraintCompare__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5772:1: ( ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) ) )
            // InternalAspectLang.g:5773:1: ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) )
            {
            // InternalAspectLang.g:5773:1: ( ( rule__PropertyConstraintCompare__RightAssignment_1_2 ) )
            // InternalAspectLang.g:5774:1: ( rule__PropertyConstraintCompare__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyConstraintCompareAccess().getRightAssignment_1_2()); 
            }
            // InternalAspectLang.g:5775:1: ( rule__PropertyConstraintCompare__RightAssignment_1_2 )
            // InternalAspectLang.g:5775:2: rule__PropertyConstraintCompare__RightAssignment_1_2
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
    // InternalAspectLang.g:5791:1: rule__LocalQuery__Group__0 : rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1 ;
    public final void rule__LocalQuery__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5795:1: ( rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1 )
            // InternalAspectLang.g:5796:2: rule__LocalQuery__Group__0__Impl rule__LocalQuery__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalAspectLang.g:5803:1: rule__LocalQuery__Group__0__Impl : ( ( rule__LocalQuery__LocationQueryAssignment_0 )? ) ;
    public final void rule__LocalQuery__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5807:1: ( ( ( rule__LocalQuery__LocationQueryAssignment_0 )? ) )
            // InternalAspectLang.g:5808:1: ( ( rule__LocalQuery__LocationQueryAssignment_0 )? )
            {
            // InternalAspectLang.g:5808:1: ( ( rule__LocalQuery__LocationQueryAssignment_0 )? )
            // InternalAspectLang.g:5809:1: ( rule__LocalQuery__LocationQueryAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getLocationQueryAssignment_0()); 
            }
            // InternalAspectLang.g:5810:1: ( rule__LocalQuery__LocationQueryAssignment_0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID||LA48_0==13||(LA48_0>=28 && LA48_0<=29)||(LA48_0>=60 && LA48_0<=61)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalAspectLang.g:5810:2: rule__LocalQuery__LocationQueryAssignment_0
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
    // InternalAspectLang.g:5820:1: rule__LocalQuery__Group__1 : rule__LocalQuery__Group__1__Impl ;
    public final void rule__LocalQuery__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5824:1: ( rule__LocalQuery__Group__1__Impl )
            // InternalAspectLang.g:5825:2: rule__LocalQuery__Group__1__Impl
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
    // InternalAspectLang.g:5831:1: rule__LocalQuery__Group__1__Impl : ( ( rule__LocalQuery__Alternatives_1 ) ) ;
    public final void rule__LocalQuery__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5835:1: ( ( ( rule__LocalQuery__Alternatives_1 ) ) )
            // InternalAspectLang.g:5836:1: ( ( rule__LocalQuery__Alternatives_1 ) )
            {
            // InternalAspectLang.g:5836:1: ( ( rule__LocalQuery__Alternatives_1 ) )
            // InternalAspectLang.g:5837:1: ( rule__LocalQuery__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalQueryAccess().getAlternatives_1()); 
            }
            // InternalAspectLang.g:5838:1: ( rule__LocalQuery__Alternatives_1 )
            // InternalAspectLang.g:5838:2: rule__LocalQuery__Alternatives_1
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
    // InternalAspectLang.g:5852:1: rule__ModelProperty__Group__0 : rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 ;
    public final void rule__ModelProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5856:1: ( rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1 )
            // InternalAspectLang.g:5857:2: rule__ModelProperty__Group__0__Impl rule__ModelProperty__Group__1
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
    // InternalAspectLang.g:5864:1: rule__ModelProperty__Group__0__Impl : ( '#' ) ;
    public final void rule__ModelProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5868:1: ( ( '#' ) )
            // InternalAspectLang.g:5869:1: ( '#' )
            {
            // InternalAspectLang.g:5869:1: ( '#' )
            // InternalAspectLang.g:5870:1: '#'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getNumberSignKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5883:1: rule__ModelProperty__Group__1 : rule__ModelProperty__Group__1__Impl ;
    public final void rule__ModelProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5887:1: ( rule__ModelProperty__Group__1__Impl )
            // InternalAspectLang.g:5888:2: rule__ModelProperty__Group__1__Impl
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
    // InternalAspectLang.g:5894:1: rule__ModelProperty__Group__1__Impl : ( ( rule__ModelProperty__ReferenceAssignment_1 ) ) ;
    public final void rule__ModelProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5898:1: ( ( ( rule__ModelProperty__ReferenceAssignment_1 ) ) )
            // InternalAspectLang.g:5899:1: ( ( rule__ModelProperty__ReferenceAssignment_1 ) )
            {
            // InternalAspectLang.g:5899:1: ( ( rule__ModelProperty__ReferenceAssignment_1 ) )
            // InternalAspectLang.g:5900:1: ( rule__ModelProperty__ReferenceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getReferenceAssignment_1()); 
            }
            // InternalAspectLang.g:5901:1: ( rule__ModelProperty__ReferenceAssignment_1 )
            // InternalAspectLang.g:5901:2: rule__ModelProperty__ReferenceAssignment_1
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
    // InternalAspectLang.g:5915:1: rule__Typeof__Group__0 : rule__Typeof__Group__0__Impl rule__Typeof__Group__1 ;
    public final void rule__Typeof__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5919:1: ( rule__Typeof__Group__0__Impl rule__Typeof__Group__1 )
            // InternalAspectLang.g:5920:2: rule__Typeof__Group__0__Impl rule__Typeof__Group__1
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
    // InternalAspectLang.g:5927:1: rule__Typeof__Group__0__Impl : ( 'istypeof' ) ;
    public final void rule__Typeof__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5931:1: ( ( 'istypeof' ) )
            // InternalAspectLang.g:5932:1: ( 'istypeof' )
            {
            // InternalAspectLang.g:5932:1: ( 'istypeof' )
            // InternalAspectLang.g:5933:1: 'istypeof'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getIstypeofKeyword_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5946:1: rule__Typeof__Group__1 : rule__Typeof__Group__1__Impl rule__Typeof__Group__2 ;
    public final void rule__Typeof__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5950:1: ( rule__Typeof__Group__1__Impl rule__Typeof__Group__2 )
            // InternalAspectLang.g:5951:2: rule__Typeof__Group__1__Impl rule__Typeof__Group__2
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
    // InternalAspectLang.g:5958:1: rule__Typeof__Group__1__Impl : ( '(' ) ;
    public final void rule__Typeof__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5962:1: ( ( '(' ) )
            // InternalAspectLang.g:5963:1: ( '(' )
            {
            // InternalAspectLang.g:5963:1: ( '(' )
            // InternalAspectLang.g:5964:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:5977:1: rule__Typeof__Group__2 : rule__Typeof__Group__2__Impl rule__Typeof__Group__3 ;
    public final void rule__Typeof__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5981:1: ( rule__Typeof__Group__2__Impl rule__Typeof__Group__3 )
            // InternalAspectLang.g:5982:2: rule__Typeof__Group__2__Impl rule__Typeof__Group__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalAspectLang.g:5989:1: rule__Typeof__Group__2__Impl : ( ( rule__Typeof__ReferenceAssignment_2 ) ) ;
    public final void rule__Typeof__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:5993:1: ( ( ( rule__Typeof__ReferenceAssignment_2 ) ) )
            // InternalAspectLang.g:5994:1: ( ( rule__Typeof__ReferenceAssignment_2 ) )
            {
            // InternalAspectLang.g:5994:1: ( ( rule__Typeof__ReferenceAssignment_2 ) )
            // InternalAspectLang.g:5995:1: ( rule__Typeof__ReferenceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getReferenceAssignment_2()); 
            }
            // InternalAspectLang.g:5996:1: ( rule__Typeof__ReferenceAssignment_2 )
            // InternalAspectLang.g:5996:2: rule__Typeof__ReferenceAssignment_2
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
    // InternalAspectLang.g:6006:1: rule__Typeof__Group__3 : rule__Typeof__Group__3__Impl ;
    public final void rule__Typeof__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6010:1: ( rule__Typeof__Group__3__Impl )
            // InternalAspectLang.g:6011:2: rule__Typeof__Group__3__Impl
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
    // InternalAspectLang.g:6017:1: rule__Typeof__Group__3__Impl : ( ')' ) ;
    public final void rule__Typeof__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6021:1: ( ( ')' ) )
            // InternalAspectLang.g:6022:1: ( ')' )
            {
            // InternalAspectLang.g:6022:1: ( ')' )
            // InternalAspectLang.g:6023:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeofAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6044:1: rule__TypeReference__Group__0 : rule__TypeReference__Group__0__Impl rule__TypeReference__Group__1 ;
    public final void rule__TypeReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6048:1: ( rule__TypeReference__Group__0__Impl rule__TypeReference__Group__1 )
            // InternalAspectLang.g:6049:2: rule__TypeReference__Group__0__Impl rule__TypeReference__Group__1
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
    // InternalAspectLang.g:6056:1: rule__TypeReference__Group__0__Impl : ( ( rule__TypeReference__ContextAssignment_0 ) ) ;
    public final void rule__TypeReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6060:1: ( ( ( rule__TypeReference__ContextAssignment_0 ) ) )
            // InternalAspectLang.g:6061:1: ( ( rule__TypeReference__ContextAssignment_0 ) )
            {
            // InternalAspectLang.g:6061:1: ( ( rule__TypeReference__ContextAssignment_0 ) )
            // InternalAspectLang.g:6062:1: ( rule__TypeReference__ContextAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getContextAssignment_0()); 
            }
            // InternalAspectLang.g:6063:1: ( rule__TypeReference__ContextAssignment_0 )
            // InternalAspectLang.g:6063:2: rule__TypeReference__ContextAssignment_0
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
    // InternalAspectLang.g:6073:1: rule__TypeReference__Group__1 : rule__TypeReference__Group__1__Impl rule__TypeReference__Group__2 ;
    public final void rule__TypeReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6077:1: ( rule__TypeReference__Group__1__Impl rule__TypeReference__Group__2 )
            // InternalAspectLang.g:6078:2: rule__TypeReference__Group__1__Impl rule__TypeReference__Group__2
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
    // InternalAspectLang.g:6085:1: rule__TypeReference__Group__1__Impl : ( '.' ) ;
    public final void rule__TypeReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6089:1: ( ( '.' ) )
            // InternalAspectLang.g:6090:1: ( '.' )
            {
            // InternalAspectLang.g:6090:1: ( '.' )
            // InternalAspectLang.g:6091:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getFullStopKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6104:1: rule__TypeReference__Group__2 : rule__TypeReference__Group__2__Impl rule__TypeReference__Group__3 ;
    public final void rule__TypeReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6108:1: ( rule__TypeReference__Group__2__Impl rule__TypeReference__Group__3 )
            // InternalAspectLang.g:6109:2: rule__TypeReference__Group__2__Impl rule__TypeReference__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalAspectLang.g:6116:1: rule__TypeReference__Group__2__Impl : ( ( rule__TypeReference__ReferenceAssignment_2 ) ) ;
    public final void rule__TypeReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6120:1: ( ( ( rule__TypeReference__ReferenceAssignment_2 ) ) )
            // InternalAspectLang.g:6121:1: ( ( rule__TypeReference__ReferenceAssignment_2 ) )
            {
            // InternalAspectLang.g:6121:1: ( ( rule__TypeReference__ReferenceAssignment_2 ) )
            // InternalAspectLang.g:6122:1: ( rule__TypeReference__ReferenceAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getReferenceAssignment_2()); 
            }
            // InternalAspectLang.g:6123:1: ( rule__TypeReference__ReferenceAssignment_2 )
            // InternalAspectLang.g:6123:2: rule__TypeReference__ReferenceAssignment_2
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
    // InternalAspectLang.g:6133:1: rule__TypeReference__Group__3 : rule__TypeReference__Group__3__Impl ;
    public final void rule__TypeReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6137:1: ( rule__TypeReference__Group__3__Impl )
            // InternalAspectLang.g:6138:2: rule__TypeReference__Group__3__Impl
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
    // InternalAspectLang.g:6144:1: rule__TypeReference__Group__3__Impl : ( ( rule__TypeReference__CollectionAssignment_3 )? ) ;
    public final void rule__TypeReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6148:1: ( ( ( rule__TypeReference__CollectionAssignment_3 )? ) )
            // InternalAspectLang.g:6149:1: ( ( rule__TypeReference__CollectionAssignment_3 )? )
            {
            // InternalAspectLang.g:6149:1: ( ( rule__TypeReference__CollectionAssignment_3 )? )
            // InternalAspectLang.g:6150:1: ( rule__TypeReference__CollectionAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getCollectionAssignment_3()); 
            }
            // InternalAspectLang.g:6151:1: ( rule__TypeReference__CollectionAssignment_3 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==64) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalAspectLang.g:6151:2: rule__TypeReference__CollectionAssignment_3
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
    // InternalAspectLang.g:6169:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6173:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalAspectLang.g:6174:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalAspectLang.g:6181:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6185:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6186:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6186:1: ( RULE_ID )
            // InternalAspectLang.g:6187:1: RULE_ID
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
    // InternalAspectLang.g:6198:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6202:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalAspectLang.g:6203:2: rule__QualifiedName__Group__1__Impl
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
    // InternalAspectLang.g:6209:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6213:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalAspectLang.g:6214:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalAspectLang.g:6214:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalAspectLang.g:6215:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:6216:1: ( rule__QualifiedName__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==57) ) {
                    int LA50_2 = input.LA(2);

                    if ( (LA50_2==RULE_ID) ) {
                        alt50=1;
                    }


                }


                switch (alt50) {
            	case 1 :
            	    // InternalAspectLang.g:6216:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalAspectLang.g:6230:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6234:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalAspectLang.g:6235:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalAspectLang.g:6242:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6246:1: ( ( ( '.' ) ) )
            // InternalAspectLang.g:6247:1: ( ( '.' ) )
            {
            // InternalAspectLang.g:6247:1: ( ( '.' ) )
            // InternalAspectLang.g:6248:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalAspectLang.g:6249:1: ( '.' )
            // InternalAspectLang.g:6250:2: '.'
            {
            match(input,57,FOLLOW_2); if (state.failed) return ;

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
    // InternalAspectLang.g:6261:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6265:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalAspectLang.g:6266:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalAspectLang.g:6272:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6276:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6277:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6277:1: ( RULE_ID )
            // InternalAspectLang.g:6278:1: RULE_ID
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
    // InternalAspectLang.g:6293:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6297:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalAspectLang.g:6298:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalAspectLang.g:6305:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6309:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6310:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:6310:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6311:1: ruleQualifiedName
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
    // InternalAspectLang.g:6322:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6326:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalAspectLang.g:6327:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalAspectLang.g:6333:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6337:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // InternalAspectLang.g:6338:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // InternalAspectLang.g:6338:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // InternalAspectLang.g:6339:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // InternalAspectLang.g:6340:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==57) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalAspectLang.g:6340:2: rule__QualifiedNameWithWildcard__Group_1__0
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
    // InternalAspectLang.g:6354:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6358:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // InternalAspectLang.g:6359:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalAspectLang.g:6366:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6370:1: ( ( '.' ) )
            // InternalAspectLang.g:6371:1: ( '.' )
            {
            // InternalAspectLang.g:6371:1: ( '.' )
            // InternalAspectLang.g:6372:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalAspectLang.g:6385:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6389:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // InternalAspectLang.g:6390:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
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
    // InternalAspectLang.g:6396:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6400:1: ( ( '*' ) )
            // InternalAspectLang.g:6401:1: ( '*' )
            {
            // InternalAspectLang.g:6401:1: ( '*' )
            // InternalAspectLang.g:6402:1: '*'
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
    // InternalAspectLang.g:6420:1: rule__AspectModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AspectModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6424:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6425:1: ( ruleQualifiedName )
            {
            // InternalAspectLang.g:6425:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6426:1: ruleQualifiedName
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
    // InternalAspectLang.g:6435:1: rule__AspectModel__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__AspectModel__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6439:1: ( ( ruleImport ) )
            // InternalAspectLang.g:6440:1: ( ruleImport )
            {
            // InternalAspectLang.g:6440:1: ( ruleImport )
            // InternalAspectLang.g:6441:1: ruleImport
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
    // InternalAspectLang.g:6450:1: rule__AspectModel__SourcesAssignment_3 : ( ruleApplicationModel ) ;
    public final void rule__AspectModel__SourcesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6454:1: ( ( ruleApplicationModel ) )
            // InternalAspectLang.g:6455:1: ( ruleApplicationModel )
            {
            // InternalAspectLang.g:6455:1: ( ruleApplicationModel )
            // InternalAspectLang.g:6456:1: ruleApplicationModel
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
    // InternalAspectLang.g:6465:1: rule__AspectModel__AdvicesAssignment_4_0 : ( ruleAdvice ) ;
    public final void rule__AspectModel__AdvicesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6469:1: ( ( ruleAdvice ) )
            // InternalAspectLang.g:6470:1: ( ruleAdvice )
            {
            // InternalAspectLang.g:6470:1: ( ruleAdvice )
            // InternalAspectLang.g:6471:1: ruleAdvice
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
    // InternalAspectLang.g:6480:1: rule__AspectModel__PointcutsAssignment_4_1 : ( rulePointcut ) ;
    public final void rule__AspectModel__PointcutsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6484:1: ( ( rulePointcut ) )
            // InternalAspectLang.g:6485:1: ( rulePointcut )
            {
            // InternalAspectLang.g:6485:1: ( rulePointcut )
            // InternalAspectLang.g:6486:1: rulePointcut
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
    // InternalAspectLang.g:6495:1: rule__AspectModel__AspectsAssignment_4_2 : ( ruleAspect ) ;
    public final void rule__AspectModel__AspectsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6499:1: ( ( ruleAspect ) )
            // InternalAspectLang.g:6500:1: ( ruleAspect )
            {
            // InternalAspectLang.g:6500:1: ( ruleAspect )
            // InternalAspectLang.g:6501:1: ruleAspect
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
    // InternalAspectLang.g:6510:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6514:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalAspectLang.g:6515:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalAspectLang.g:6515:1: ( ruleQualifiedNameWithWildcard )
            // InternalAspectLang.g:6516:1: ruleQualifiedNameWithWildcard
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
    // InternalAspectLang.g:6525:1: rule__ApplicationModel__HandlerAssignment_1 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__HandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6529:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6530:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6530:1: ( RULE_ID )
            // InternalAspectLang.g:6531:1: RULE_ID
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
    // InternalAspectLang.g:6540:1: rule__ApplicationModel__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__ApplicationModel__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6544:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6545:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6545:1: ( RULE_ID )
            // InternalAspectLang.g:6546:1: RULE_ID
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
    // InternalAspectLang.g:6555:1: rule__ApplicationModel__ModelAssignment_4 : ( RULE_STRING ) ;
    public final void rule__ApplicationModel__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6559:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:6560:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:6560:1: ( RULE_STRING )
            // InternalAspectLang.g:6561:1: RULE_STRING
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
    // InternalAspectLang.g:6570:1: rule__Aspect__PointcutAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Aspect__PointcutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6574:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:6575:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:6575:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6576:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAspectAccess().getPointcutPointcutCrossReference_1_0()); 
            }
            // InternalAspectLang.g:6577:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6578:1: ruleQualifiedName
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
    // InternalAspectLang.g:6589:1: rule__Aspect__AdvicesAssignment_3 : ( ruleUtilizeAdvice ) ;
    public final void rule__Aspect__AdvicesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6593:1: ( ( ruleUtilizeAdvice ) )
            // InternalAspectLang.g:6594:1: ( ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:6594:1: ( ruleUtilizeAdvice )
            // InternalAspectLang.g:6595:1: ruleUtilizeAdvice
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
    // InternalAspectLang.g:6604:1: rule__Aspect__AdvicesAssignment_4_1 : ( ruleUtilizeAdvice ) ;
    public final void rule__Aspect__AdvicesAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6608:1: ( ( ruleUtilizeAdvice ) )
            // InternalAspectLang.g:6609:1: ( ruleUtilizeAdvice )
            {
            // InternalAspectLang.g:6609:1: ( ruleUtilizeAdvice )
            // InternalAspectLang.g:6610:1: ruleUtilizeAdvice
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
    // InternalAspectLang.g:6619:1: rule__UtilizeAdvice__AdviceAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__UtilizeAdvice__AdviceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6623:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:6624:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:6624:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6625:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUtilizeAdviceAccess().getAdviceAdviceCrossReference_0_0()); 
            }
            // InternalAspectLang.g:6626:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6627:1: ruleQualifiedName
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
    // InternalAspectLang.g:6638:1: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0 : ( ruleValue ) ;
    public final void rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6642:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6643:1: ( ruleValue )
            {
            // InternalAspectLang.g:6643:1: ( ruleValue )
            // InternalAspectLang.g:6644:1: ruleValue
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
    // InternalAspectLang.g:6653:1: rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1 : ( ruleValue ) ;
    public final void rule__UtilizeAdvice__ParameterAssignmentsAssignment_1_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6657:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6658:1: ( ruleValue )
            {
            // InternalAspectLang.g:6658:1: ( ruleValue )
            // InternalAspectLang.g:6659:1: ruleValue
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
    // InternalAspectLang.g:6668:1: rule__Advice__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Advice__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6672:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6673:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6673:1: ( RULE_ID )
            // InternalAspectLang.g:6674:1: RULE_ID
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
    // InternalAspectLang.g:6683:1: rule__Advice__ParameterDeclarationsAssignment_2_1_0 : ( ruleAdviceParameterDeclaration ) ;
    public final void rule__Advice__ParameterDeclarationsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6687:1: ( ( ruleAdviceParameterDeclaration ) )
            // InternalAspectLang.g:6688:1: ( ruleAdviceParameterDeclaration )
            {
            // InternalAspectLang.g:6688:1: ( ruleAdviceParameterDeclaration )
            // InternalAspectLang.g:6689:1: ruleAdviceParameterDeclaration
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
    // InternalAspectLang.g:6698:1: rule__Advice__ParameterDeclarationsAssignment_2_1_1_1 : ( ruleAdviceParameterDeclaration ) ;
    public final void rule__Advice__ParameterDeclarationsAssignment_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6702:1: ( ( ruleAdviceParameterDeclaration ) )
            // InternalAspectLang.g:6703:1: ( ruleAdviceParameterDeclaration )
            {
            // InternalAspectLang.g:6703:1: ( ruleAdviceParameterDeclaration )
            // InternalAspectLang.g:6704:1: ruleAdviceParameterDeclaration
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
    // InternalAspectLang.g:6713:1: rule__Advice__CollectorsAssignment_4 : ( ruleCollector ) ;
    public final void rule__Advice__CollectorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6717:1: ( ( ruleCollector ) )
            // InternalAspectLang.g:6718:1: ( ruleCollector )
            {
            // InternalAspectLang.g:6718:1: ( ruleCollector )
            // InternalAspectLang.g:6719:1: ruleCollector
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
    // InternalAspectLang.g:6728:1: rule__AdviceParameterDeclaration__TypeAssignment_0 : ( ruleTypeReference ) ;
    public final void rule__AdviceParameterDeclaration__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6732:1: ( ( ruleTypeReference ) )
            // InternalAspectLang.g:6733:1: ( ruleTypeReference )
            {
            // InternalAspectLang.g:6733:1: ( ruleTypeReference )
            // InternalAspectLang.g:6734:1: ruleTypeReference
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
    // InternalAspectLang.g:6743:1: rule__AdviceParameterDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AdviceParameterDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6747:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6748:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6748:1: ( RULE_ID )
            // InternalAspectLang.g:6749:1: RULE_ID
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
    // InternalAspectLang.g:6758:1: rule__Collector__InsertionPointAssignment_0 : ( ruleInsertionPoint ) ;
    public final void rule__Collector__InsertionPointAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6762:1: ( ( ruleInsertionPoint ) )
            // InternalAspectLang.g:6763:1: ( ruleInsertionPoint )
            {
            // InternalAspectLang.g:6763:1: ( ruleInsertionPoint )
            // InternalAspectLang.g:6764:1: ruleInsertionPoint
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
    // InternalAspectLang.g:6773:1: rule__Collector__EventsAssignment_1 : ( ruleEvent ) ;
    public final void rule__Collector__EventsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6777:1: ( ( ruleEvent ) )
            // InternalAspectLang.g:6778:1: ( ruleEvent )
            {
            // InternalAspectLang.g:6778:1: ( ruleEvent )
            // InternalAspectLang.g:6779:1: ruleEvent
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
    // InternalAspectLang.g:6788:1: rule__Event__TypeAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Event__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6792:1: ( ( ( ruleQualifiedName ) ) )
            // InternalAspectLang.g:6793:1: ( ( ruleQualifiedName ) )
            {
            // InternalAspectLang.g:6793:1: ( ( ruleQualifiedName ) )
            // InternalAspectLang.g:6794:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getTypeRecordTypeCrossReference_0_0()); 
            }
            // InternalAspectLang.g:6795:1: ( ruleQualifiedName )
            // InternalAspectLang.g:6796:1: ruleQualifiedName
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
    // InternalAspectLang.g:6807:1: rule__Event__InitializationsAssignment_2_0 : ( ruleValue ) ;
    public final void rule__Event__InitializationsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6811:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6812:1: ( ruleValue )
            {
            // InternalAspectLang.g:6812:1: ( ruleValue )
            // InternalAspectLang.g:6813:1: ruleValue
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
    // InternalAspectLang.g:6822:1: rule__Event__InitializationsAssignment_2_1_1 : ( ruleValue ) ;
    public final void rule__Event__InitializationsAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6826:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6827:1: ( ruleValue )
            {
            // InternalAspectLang.g:6827:1: ( ruleValue )
            // InternalAspectLang.g:6828:1: ruleValue
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
    // InternalAspectLang.g:6837:1: rule__ReferenceValue__QueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__ReferenceValue__QueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6841:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6842:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6842:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6843:1: ruleLocationQuery
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
    // InternalAspectLang.g:6852:1: rule__ReferenceValue__PropertyAssignment_1 : ( ruleProperty ) ;
    public final void rule__ReferenceValue__PropertyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6856:1: ( ( ruleProperty ) )
            // InternalAspectLang.g:6857:1: ( ruleProperty )
            {
            // InternalAspectLang.g:6857:1: ( ruleProperty )
            // InternalAspectLang.g:6858:1: ruleProperty
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
    // InternalAspectLang.g:6867:1: rule__InternalFunctionProperty__FunctionAssignment : ( ruleInternalFunction ) ;
    public final void rule__InternalFunctionProperty__FunctionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6871:1: ( ( ruleInternalFunction ) )
            // InternalAspectLang.g:6872:1: ( ruleInternalFunction )
            {
            // InternalAspectLang.g:6872:1: ( ruleInternalFunction )
            // InternalAspectLang.g:6873:1: ruleInternalFunction
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
    // InternalAspectLang.g:6882:1: rule__ReflectionProperty__FunctionAssignment_1 : ( ruleReflectionFunction ) ;
    public final void rule__ReflectionProperty__FunctionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6886:1: ( ( ruleReflectionFunction ) )
            // InternalAspectLang.g:6887:1: ( ruleReflectionFunction )
            {
            // InternalAspectLang.g:6887:1: ( ruleReflectionFunction )
            // InternalAspectLang.g:6888:1: ruleReflectionFunction
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
    // InternalAspectLang.g:6897:1: rule__AdviceParameter__DeclarationAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AdviceParameter__DeclarationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6901:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6902:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6902:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6903:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdviceParameterAccess().getDeclarationAdviceParameterDeclarationCrossReference_0_0()); 
            }
            // InternalAspectLang.g:6904:1: ( RULE_ID )
            // InternalAspectLang.g:6905:1: RULE_ID
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
    // InternalAspectLang.g:6916:1: rule__AdviceParameter__CollectionAssignment_1_1 : ( ruleValue ) ;
    public final void rule__AdviceParameter__CollectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6920:1: ( ( ruleValue ) )
            // InternalAspectLang.g:6921:1: ( ruleValue )
            {
            // InternalAspectLang.g:6921:1: ( ruleValue )
            // InternalAspectLang.g:6922:1: ruleValue
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
    // InternalAspectLang.g:6931:1: rule__Pointcut__AnnotationAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__Pointcut__AnnotationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6935:1: ( ( ruleAnnotation ) )
            // InternalAspectLang.g:6936:1: ( ruleAnnotation )
            {
            // InternalAspectLang.g:6936:1: ( ruleAnnotation )
            // InternalAspectLang.g:6937:1: ruleAnnotation
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
    // InternalAspectLang.g:6946:1: rule__Pointcut__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Pointcut__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6950:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6951:1: ( RULE_ID )
            {
            // InternalAspectLang.g:6951:1: ( RULE_ID )
            // InternalAspectLang.g:6952:1: RULE_ID
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
    // InternalAspectLang.g:6961:1: rule__Pointcut__ModelAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Pointcut__ModelAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6965:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:6966:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:6966:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:6967:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPointcutAccess().getModelApplicationModelCrossReference_4_0()); 
            }
            // InternalAspectLang.g:6968:1: ( RULE_ID )
            // InternalAspectLang.g:6969:1: RULE_ID
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
    // InternalAspectLang.g:6980:1: rule__Pointcut__LocationAssignment_6 : ( ruleLocationQuery ) ;
    public final void rule__Pointcut__LocationAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6984:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:6985:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:6985:1: ( ruleLocationQuery )
            // InternalAspectLang.g:6986:1: ruleLocationQuery
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
    // InternalAspectLang.g:6995:1: rule__Pointcut__OperationAssignment_7_1 : ( ruleOperationQuery ) ;
    public final void rule__Pointcut__OperationAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:6999:1: ( ( ruleOperationQuery ) )
            // InternalAspectLang.g:7000:1: ( ruleOperationQuery )
            {
            // InternalAspectLang.g:7000:1: ( ruleOperationQuery )
            // InternalAspectLang.g:7001:1: ruleOperationQuery
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
    // InternalAspectLang.g:7010:1: rule__Annotation__NameAssignment_1 : ( ( 'technology' ) ) ;
    public final void rule__Annotation__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7014:1: ( ( ( 'technology' ) ) )
            // InternalAspectLang.g:7015:1: ( ( 'technology' ) )
            {
            // InternalAspectLang.g:7015:1: ( ( 'technology' ) )
            // InternalAspectLang.g:7016:1: ( 'technology' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameTechnologyKeyword_1_0()); 
            }
            // InternalAspectLang.g:7017:1: ( 'technology' )
            // InternalAspectLang.g:7018:1: 'technology'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getNameTechnologyKeyword_1_0()); 
            }
            match(input,63,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameTechnologyKeyword_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getNameTechnologyKeyword_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Annotation__TechnologiesAssignment_2"
    // InternalAspectLang.g:7033:1: rule__Annotation__TechnologiesAssignment_2 : ( ruleTechnology ) ;
    public final void rule__Annotation__TechnologiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7037:1: ( ( ruleTechnology ) )
            // InternalAspectLang.g:7038:1: ( ruleTechnology )
            {
            // InternalAspectLang.g:7038:1: ( ruleTechnology )
            // InternalAspectLang.g:7039:1: ruleTechnology
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getTechnologiesTechnologyEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTechnology();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getTechnologiesTechnologyEnumRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__TechnologiesAssignment_2"


    // $ANTLR start "rule__Annotation__TechnologiesAssignment_3_1"
    // InternalAspectLang.g:7048:1: rule__Annotation__TechnologiesAssignment_3_1 : ( ruleTechnology ) ;
    public final void rule__Annotation__TechnologiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7052:1: ( ( ruleTechnology ) )
            // InternalAspectLang.g:7053:1: ( ruleTechnology )
            {
            // InternalAspectLang.g:7053:1: ( ruleTechnology )
            // InternalAspectLang.g:7054:1: ruleTechnology
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnnotationAccess().getTechnologiesTechnologyEnumRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTechnology();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnnotationAccess().getTechnologiesTechnologyEnumRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__TechnologiesAssignment_3_1"


    // $ANTLR start "rule__LocationQuery__ModifierAssignment_0"
    // InternalAspectLang.g:7063:1: rule__LocationQuery__ModifierAssignment_0 : ( ruleQueryModifier ) ;
    public final void rule__LocationQuery__ModifierAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7067:1: ( ( ruleQueryModifier ) )
            // InternalAspectLang.g:7068:1: ( ruleQueryModifier )
            {
            // InternalAspectLang.g:7068:1: ( ruleQueryModifier )
            // InternalAspectLang.g:7069:1: ruleQueryModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getModifierQueryModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQueryModifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getModifierQueryModifierEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__ModifierAssignment_0"


    // $ANTLR start "rule__LocationQuery__NodeAssignment_1"
    // InternalAspectLang.g:7078:1: rule__LocationQuery__NodeAssignment_1 : ( ruleNode ) ;
    public final void rule__LocationQuery__NodeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7082:1: ( ( ruleNode ) )
            // InternalAspectLang.g:7083:1: ( ruleNode )
            {
            // InternalAspectLang.g:7083:1: ( ruleNode )
            // InternalAspectLang.g:7084:1: ruleNode
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNode();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getNodeNodeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__NodeAssignment_1"


    // $ANTLR start "rule__LocationQuery__SpecializationAssignment_2_0_1"
    // InternalAspectLang.g:7093:1: rule__LocationQuery__SpecializationAssignment_2_0_1 : ( ruleLocationQuery ) ;
    public final void rule__LocationQuery__SpecializationAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7097:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:7098:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:7098:1: ( ruleLocationQuery )
            // InternalAspectLang.g:7099:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_2_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getSpecializationLocationQueryParserRuleCall_2_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__SpecializationAssignment_2_0_1"


    // $ANTLR start "rule__LocationQuery__CompositionAssignment_2_1"
    // InternalAspectLang.g:7108:1: rule__LocationQuery__CompositionAssignment_2_1 : ( ruleCompositionQuery ) ;
    public final void rule__LocationQuery__CompositionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7112:1: ( ( ruleCompositionQuery ) )
            // InternalAspectLang.g:7113:1: ( ruleCompositionQuery )
            {
            // InternalAspectLang.g:7113:1: ( ruleCompositionQuery )
            // InternalAspectLang.g:7114:1: ruleCompositionQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocationQueryAccess().getCompositionCompositionQueryParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCompositionQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocationQueryAccess().getCompositionCompositionQueryParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocationQuery__CompositionAssignment_2_1"


    // $ANTLR start "rule__CompositionQuery__SubQueriesAssignment_2"
    // InternalAspectLang.g:7123:1: rule__CompositionQuery__SubQueriesAssignment_2 : ( ruleLocationQuery ) ;
    public final void rule__CompositionQuery__SubQueriesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7127:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:7128:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:7128:1: ( ruleLocationQuery )
            // InternalAspectLang.g:7129:1: ruleLocationQuery
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositionQueryAccess().getSubQueriesLocationQueryParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLocationQuery();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositionQueryAccess().getSubQueriesLocationQueryParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositionQuery__SubQueriesAssignment_2"


    // $ANTLR start "rule__OperationQuery__ModifierAssignment_1"
    // InternalAspectLang.g:7138:1: rule__OperationQuery__ModifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__OperationQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7142:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7143:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7143:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7144:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getModifierOperationModifierCrossReference_1_0()); 
            }
            // InternalAspectLang.g:7145:1: ( RULE_ID )
            // InternalAspectLang.g:7146:1: RULE_ID
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
    // InternalAspectLang.g:7157:1: rule__OperationQuery__ReturnTypeAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__OperationQuery__ReturnTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7161:1: ( ( ruleTypeReference ) )
            // InternalAspectLang.g:7162:1: ( ruleTypeReference )
            {
            // InternalAspectLang.g:7162:1: ( ruleTypeReference )
            // InternalAspectLang.g:7163:1: ruleTypeReference
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
    // InternalAspectLang.g:7172:1: rule__OperationQuery__OperationReferenceAssignment_3_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__OperationQuery__OperationReferenceAssignment_3_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7176:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7177:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7177:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7178:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOperationQueryAccess().getOperationReferenceOperationCrossReference_3_0_0_0()); 
            }
            // InternalAspectLang.g:7179:1: ( RULE_ID )
            // InternalAspectLang.g:7180:1: RULE_ID
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
    // InternalAspectLang.g:7191:1: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1 : ( ruleParameterQuery ) ;
    public final void rule__OperationQuery__ParameterQueriesAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7195:1: ( ( ruleParameterQuery ) )
            // InternalAspectLang.g:7196:1: ( ruleParameterQuery )
            {
            // InternalAspectLang.g:7196:1: ( ruleParameterQuery )
            // InternalAspectLang.g:7197:1: ruleParameterQuery
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
    // InternalAspectLang.g:7206:1: rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1 : ( ruleParameterQuery ) ;
    public final void rule__OperationQuery__ParameterQueriesAssignment_3_0_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7210:1: ( ( ruleParameterQuery ) )
            // InternalAspectLang.g:7211:1: ( ruleParameterQuery )
            {
            // InternalAspectLang.g:7211:1: ( ruleParameterQuery )
            // InternalAspectLang.g:7212:1: ruleParameterQuery
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
    // InternalAspectLang.g:7221:1: rule__ParameterQuery__ModifierAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__ModifierAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7225:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7226:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7226:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7227:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getModifierParameterModifierCrossReference_1_0()); 
            }
            // InternalAspectLang.g:7228:1: ( RULE_ID )
            // InternalAspectLang.g:7229:1: RULE_ID
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
    // InternalAspectLang.g:7240:1: rule__ParameterQuery__TypeAssignment_2_0 : ( ruleTypeReference ) ;
    public final void rule__ParameterQuery__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7244:1: ( ( ruleTypeReference ) )
            // InternalAspectLang.g:7245:1: ( ruleTypeReference )
            {
            // InternalAspectLang.g:7245:1: ( ruleTypeReference )
            // InternalAspectLang.g:7246:1: ruleTypeReference
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
    // InternalAspectLang.g:7255:1: rule__ParameterQuery__ParameterAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__ParameterQuery__ParameterAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7259:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7260:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7260:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7261:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterQueryAccess().getParameterParameterCrossReference_3_0()); 
            }
            // InternalAspectLang.g:7262:1: ( RULE_ID )
            // InternalAspectLang.g:7263:1: RULE_ID
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
    // InternalAspectLang.g:7274:1: rule__Node__ConstraintAssignment_1_1 : ( rulePropertyConstraint ) ;
    public final void rule__Node__ConstraintAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7278:1: ( ( rulePropertyConstraint ) )
            // InternalAspectLang.g:7279:1: ( rulePropertyConstraint )
            {
            // InternalAspectLang.g:7279:1: ( rulePropertyConstraint )
            // InternalAspectLang.g:7280:1: rulePropertyConstraint
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
    // InternalAspectLang.g:7289:1: rule__ContainerNode__ContainerAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ContainerNode__ContainerAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7293:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7294:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7294:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7295:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getContainerNodeAccess().getContainerFeatureCrossReference_0()); 
            }
            // InternalAspectLang.g:7296:1: ( RULE_ID )
            // InternalAspectLang.g:7297:1: RULE_ID
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
    // InternalAspectLang.g:7308:1: rule__PropertyConstraint__LogicAssignment_1_1 : ( ruleLogicOperator ) ;
    public final void rule__PropertyConstraint__LogicAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7312:1: ( ( ruleLogicOperator ) )
            // InternalAspectLang.g:7313:1: ( ruleLogicOperator )
            {
            // InternalAspectLang.g:7313:1: ( ruleLogicOperator )
            // InternalAspectLang.g:7314:1: ruleLogicOperator
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
    // InternalAspectLang.g:7323:1: rule__PropertyConstraint__RightAssignment_1_2 : ( rulePropertyConstraintCompare ) ;
    public final void rule__PropertyConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7327:1: ( ( rulePropertyConstraintCompare ) )
            // InternalAspectLang.g:7328:1: ( rulePropertyConstraintCompare )
            {
            // InternalAspectLang.g:7328:1: ( rulePropertyConstraintCompare )
            // InternalAspectLang.g:7329:1: rulePropertyConstraintCompare
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
    // InternalAspectLang.g:7338:1: rule__PropertyConstraintCompare__CompareAssignment_1_1 : ( ruleCompareOperator ) ;
    public final void rule__PropertyConstraintCompare__CompareAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7342:1: ( ( ruleCompareOperator ) )
            // InternalAspectLang.g:7343:1: ( ruleCompareOperator )
            {
            // InternalAspectLang.g:7343:1: ( ruleCompareOperator )
            // InternalAspectLang.g:7344:1: ruleCompareOperator
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
    // InternalAspectLang.g:7353:1: rule__PropertyConstraintCompare__RightAssignment_1_2 : ( ruleConstraintElement ) ;
    public final void rule__PropertyConstraintCompare__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7357:1: ( ( ruleConstraintElement ) )
            // InternalAspectLang.g:7358:1: ( ruleConstraintElement )
            {
            // InternalAspectLang.g:7358:1: ( ruleConstraintElement )
            // InternalAspectLang.g:7359:1: ruleConstraintElement
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
    // InternalAspectLang.g:7368:1: rule__LocalQuery__LocationQueryAssignment_0 : ( ruleLocationQuery ) ;
    public final void rule__LocalQuery__LocationQueryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7372:1: ( ( ruleLocationQuery ) )
            // InternalAspectLang.g:7373:1: ( ruleLocationQuery )
            {
            // InternalAspectLang.g:7373:1: ( ruleLocationQuery )
            // InternalAspectLang.g:7374:1: ruleLocationQuery
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
    // InternalAspectLang.g:7383:1: rule__LocalQuery__PropertyAssignment_1_0 : ( ruleModelProperty ) ;
    public final void rule__LocalQuery__PropertyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7387:1: ( ( ruleModelProperty ) )
            // InternalAspectLang.g:7388:1: ( ruleModelProperty )
            {
            // InternalAspectLang.g:7388:1: ( ruleModelProperty )
            // InternalAspectLang.g:7389:1: ruleModelProperty
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
    // InternalAspectLang.g:7398:1: rule__LocalQuery__TypeofAssignment_1_1 : ( ruleTypeof ) ;
    public final void rule__LocalQuery__TypeofAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7402:1: ( ( ruleTypeof ) )
            // InternalAspectLang.g:7403:1: ( ruleTypeof )
            {
            // InternalAspectLang.g:7403:1: ( ruleTypeof )
            // InternalAspectLang.g:7404:1: ruleTypeof
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
    // InternalAspectLang.g:7413:1: rule__ModelProperty__ReferenceAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ModelProperty__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7417:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7418:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7418:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7419:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelPropertyAccess().getReferenceFeatureCrossReference_1_0()); 
            }
            // InternalAspectLang.g:7420:1: ( RULE_ID )
            // InternalAspectLang.g:7421:1: RULE_ID
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
    // InternalAspectLang.g:7432:1: rule__Typeof__ReferenceAssignment_2 : ( ruleTypeReference ) ;
    public final void rule__Typeof__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7436:1: ( ( ruleTypeReference ) )
            // InternalAspectLang.g:7437:1: ( ruleTypeReference )
            {
            // InternalAspectLang.g:7437:1: ( ruleTypeReference )
            // InternalAspectLang.g:7438:1: ruleTypeReference
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
    // InternalAspectLang.g:7447:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7451:1: ( ( RULE_FLOAT ) )
            // InternalAspectLang.g:7452:1: ( RULE_FLOAT )
            {
            // InternalAspectLang.g:7452:1: ( RULE_FLOAT )
            // InternalAspectLang.g:7453:1: RULE_FLOAT
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
    // InternalAspectLang.g:7462:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7466:1: ( ( RULE_INT ) )
            // InternalAspectLang.g:7467:1: ( RULE_INT )
            {
            // InternalAspectLang.g:7467:1: ( RULE_INT )
            // InternalAspectLang.g:7468:1: RULE_INT
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
    // InternalAspectLang.g:7477:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7481:1: ( ( RULE_STRING ) )
            // InternalAspectLang.g:7482:1: ( RULE_STRING )
            {
            // InternalAspectLang.g:7482:1: ( RULE_STRING )
            // InternalAspectLang.g:7483:1: RULE_STRING
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
    // InternalAspectLang.g:7492:1: rule__TypeReference__ContextAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__ContextAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7496:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7497:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7497:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7498:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getContextApplicationModelCrossReference_0_0()); 
            }
            // InternalAspectLang.g:7499:1: ( RULE_ID )
            // InternalAspectLang.g:7500:1: RULE_ID
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
    // InternalAspectLang.g:7511:1: rule__TypeReference__ReferenceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__TypeReference__ReferenceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7515:1: ( ( ( RULE_ID ) ) )
            // InternalAspectLang.g:7516:1: ( ( RULE_ID ) )
            {
            // InternalAspectLang.g:7516:1: ( ( RULE_ID ) )
            // InternalAspectLang.g:7517:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getReferenceNamedTypeCrossReference_2_0()); 
            }
            // InternalAspectLang.g:7518:1: ( RULE_ID )
            // InternalAspectLang.g:7519:1: RULE_ID
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
    // InternalAspectLang.g:7530:1: rule__TypeReference__CollectionAssignment_3 : ( ( '[]' ) ) ;
    public final void rule__TypeReference__CollectionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalAspectLang.g:7534:1: ( ( ( '[]' ) ) )
            // InternalAspectLang.g:7535:1: ( ( '[]' ) )
            {
            // InternalAspectLang.g:7535:1: ( ( '[]' ) )
            // InternalAspectLang.g:7536:1: ( '[]' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }
            // InternalAspectLang.g:7537:1: ( '[]' )
            // InternalAspectLang.g:7538:1: '[]'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTypeReferenceAccess().getCollectionLeftSquareBracketRightSquareBracketKeyword_3_0()); 
            }
            match(input,64,FOLLOW_2); if (state.failed) return ;
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
        // InternalAspectLang.g:1355:6: ( ( ruleReferenceValue ) )
        // InternalAspectLang.g:1355:6: ( ruleReferenceValue )
        {
        // InternalAspectLang.g:1355:6: ( ruleReferenceValue )
        // InternalAspectLang.g:1356:1: ruleReferenceValue
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
    static final String dfa_1s = "\20\uffff";
    static final String dfa_2s = "\1\4\10\uffff\1\0\6\uffff";
    static final String dfa_3s = "\1\75\10\uffff\1\0\6\uffff";
    static final String dfa_4s = "\1\uffff\1\1\2\uffff\1\2\7\uffff\1\3\2\uffff\1\4";
    static final String dfa_5s = "\11\uffff\1\0\6\uffff}>";
    static final String[] dfa_6s = {
            "\1\11\3\1\5\uffff\1\4\3\uffff\3\14\10\uffff\2\4\25\uffff\2\4\7\uffff\2\4",
            "",
            "",
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
            return "1344:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleReferenceValue ) | ( ruleInternalFunctionProperty ) | ( ruleAdviceParameter ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA2_9 = input.LA(1);

                         
                        int index2_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalAspectLang()) ) {s = 4;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index2_9);
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x08810B0000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0881080000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x30188000300E20F0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x30180000300E20F0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0002400000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000400000001C000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000001C002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x3018000030002010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0880000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x3000000030002010L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0202000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x3004000030002010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x3000000030002012L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000A00000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x70100000300020F0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000007F00000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0200000000000002L});

}
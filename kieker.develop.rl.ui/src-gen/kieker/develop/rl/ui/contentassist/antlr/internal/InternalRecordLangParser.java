package kieker.develop.rl.ui.contentassist.antlr.internal; 

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
import kieker.develop.rl.services.RecordLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalRecordLangParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transient'", "'auto-increment'", "'package'", "'import'", "'schema'", "'@author'", "'@since'", "'{'", "'}'", "':'", "','", "'templates'", "'root'", "'template'", "'entity'", "'extends'", "'const'", "'='", "'alias'", "'as'", "'grouped'", "'by'", "'.'", "'['", "']'", "'*'", "'abstract'", "'KIEKER_VERSION'"
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
    public static final int T__40=40;
    public static final int T__41=41;
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
    public String getGrammarFileName() { return "InternalRecordLang.g"; }


     
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
    // InternalRecordLang.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalRecordLang.g:62:1: ( ruleModel EOF )
            // InternalRecordLang.g:63:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRecordLang.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalRecordLang.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // InternalRecordLang.g:75:1: ( ( rule__Model__Group__0 ) )
            // InternalRecordLang.g:76:1: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalRecordLang.g:77:1: ( rule__Model__Group__0 )
            // InternalRecordLang.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalRecordLang.g:90:1: ( ruleImport EOF )
            // InternalRecordLang.g:91:1: ruleImport EOF
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
    // InternalRecordLang.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalRecordLang.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalRecordLang.g:103:1: ( ( rule__Import__Group__0 ) )
            // InternalRecordLang.g:104:1: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalRecordLang.g:105:1: ( rule__Import__Group__0 )
            // InternalRecordLang.g:105:2: rule__Import__Group__0
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


    // $ANTLR start "entryRuleBaseType"
    // InternalRecordLang.g:119:1: entryRuleBaseType : ruleBaseType EOF ;
    public final void entryRuleBaseType() throws RecognitionException {
        try {
            // InternalRecordLang.g:120:1: ( ruleBaseType EOF )
            // InternalRecordLang.g:121:1: ruleBaseType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBaseType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeRule()); 
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
    // $ANTLR end "entryRuleBaseType"


    // $ANTLR start "ruleBaseType"
    // InternalRecordLang.g:128:1: ruleBaseType : ( ( rule__BaseType__NameAssignment ) ) ;
    public final void ruleBaseType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:132:2: ( ( ( rule__BaseType__NameAssignment ) ) )
            // InternalRecordLang.g:133:1: ( ( rule__BaseType__NameAssignment ) )
            {
            // InternalRecordLang.g:133:1: ( ( rule__BaseType__NameAssignment ) )
            // InternalRecordLang.g:134:1: ( rule__BaseType__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameAssignment()); 
            }
            // InternalRecordLang.g:135:1: ( rule__BaseType__NameAssignment )
            // InternalRecordLang.g:135:2: rule__BaseType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BaseType__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBaseType"


    // $ANTLR start "entryRuleSchema"
    // InternalRecordLang.g:147:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // InternalRecordLang.g:148:1: ( ruleSchema EOF )
            // InternalRecordLang.g:149:1: ruleSchema EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaRule()); 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalRecordLang.g:156:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:160:2: ( ( ( rule__Schema__Group__0 ) ) )
            // InternalRecordLang.g:161:1: ( ( rule__Schema__Group__0 ) )
            {
            // InternalRecordLang.g:161:1: ( ( rule__Schema__Group__0 ) )
            // InternalRecordLang.g:162:1: ( rule__Schema__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getGroup()); 
            }
            // InternalRecordLang.g:163:1: ( rule__Schema__Group__0 )
            // InternalRecordLang.g:163:2: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleTemplates"
    // InternalRecordLang.g:175:1: entryRuleTemplates : ruleTemplates EOF ;
    public final void entryRuleTemplates() throws RecognitionException {
        try {
            // InternalRecordLang.g:176:1: ( ruleTemplates EOF )
            // InternalRecordLang.g:177:1: ruleTemplates EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTemplates();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesRule()); 
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
    // $ANTLR end "entryRuleTemplates"


    // $ANTLR start "ruleTemplates"
    // InternalRecordLang.g:184:1: ruleTemplates : ( ( rule__Templates__Group__0 ) ) ;
    public final void ruleTemplates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:188:2: ( ( ( rule__Templates__Group__0 ) ) )
            // InternalRecordLang.g:189:1: ( ( rule__Templates__Group__0 ) )
            {
            // InternalRecordLang.g:189:1: ( ( rule__Templates__Group__0 ) )
            // InternalRecordLang.g:190:1: ( rule__Templates__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getGroup()); 
            }
            // InternalRecordLang.g:191:1: ( rule__Templates__Group__0 )
            // InternalRecordLang.g:191:2: rule__Templates__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Templates__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemplates"


    // $ANTLR start "entryRuleRootType"
    // InternalRecordLang.g:203:1: entryRuleRootType : ruleRootType EOF ;
    public final void entryRuleRootType() throws RecognitionException {
        try {
            // InternalRecordLang.g:204:1: ( ruleRootType EOF )
            // InternalRecordLang.g:205:1: ruleRootType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRootType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootTypeRule()); 
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
    // $ANTLR end "entryRuleRootType"


    // $ANTLR start "ruleRootType"
    // InternalRecordLang.g:212:1: ruleRootType : ( ( rule__RootType__Group__0 ) ) ;
    public final void ruleRootType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:216:2: ( ( ( rule__RootType__Group__0 ) ) )
            // InternalRecordLang.g:217:1: ( ( rule__RootType__Group__0 ) )
            {
            // InternalRecordLang.g:217:1: ( ( rule__RootType__Group__0 ) )
            // InternalRecordLang.g:218:1: ( rule__RootType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootTypeAccess().getGroup()); 
            }
            // InternalRecordLang.g:219:1: ( rule__RootType__Group__0 )
            // InternalRecordLang.g:219:2: rule__RootType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RootType__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootTypeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRootType"


    // $ANTLR start "entryRuleComplexType"
    // InternalRecordLang.g:231:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalRecordLang.g:232:1: ( ruleComplexType EOF )
            // InternalRecordLang.g:233:1: ruleComplexType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComplexType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeRule()); 
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
    // $ANTLR end "entryRuleComplexType"


    // $ANTLR start "ruleComplexType"
    // InternalRecordLang.g:240:1: ruleComplexType : ( ( rule__ComplexType__Alternatives ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:244:2: ( ( ( rule__ComplexType__Alternatives ) ) )
            // InternalRecordLang.g:245:1: ( ( rule__ComplexType__Alternatives ) )
            {
            // InternalRecordLang.g:245:1: ( ( rule__ComplexType__Alternatives ) )
            // InternalRecordLang.g:246:1: ( rule__ComplexType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            }
            // InternalRecordLang.g:247:1: ( rule__ComplexType__Alternatives )
            // InternalRecordLang.g:247:2: rule__ComplexType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComplexType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexType"


    // $ANTLR start "entryRuleTemplateType"
    // InternalRecordLang.g:259:1: entryRuleTemplateType : ruleTemplateType EOF ;
    public final void entryRuleTemplateType() throws RecognitionException {
        try {
            // InternalRecordLang.g:260:1: ( ruleTemplateType EOF )
            // InternalRecordLang.g:261:1: ruleTemplateType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTemplateType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplateTypeRule()); 
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
    // $ANTLR end "entryRuleTemplateType"


    // $ANTLR start "ruleTemplateType"
    // InternalRecordLang.g:268:1: ruleTemplateType : ( ( rule__TemplateType__Group__0 ) ) ;
    public final void ruleTemplateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:272:2: ( ( ( rule__TemplateType__Group__0 ) ) )
            // InternalRecordLang.g:273:1: ( ( rule__TemplateType__Group__0 ) )
            {
            // InternalRecordLang.g:273:1: ( ( rule__TemplateType__Group__0 ) )
            // InternalRecordLang.g:274:1: ( rule__TemplateType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup()); 
            }
            // InternalRecordLang.g:275:1: ( rule__TemplateType__Group__0 )
            // InternalRecordLang.g:275:2: rule__TemplateType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:287:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // InternalRecordLang.g:288:1: ( ruleRecordType EOF )
            // InternalRecordLang.g:289:1: ruleRecordType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleRecordType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRecordTypeRule()); 
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
    // $ANTLR end "entryRuleRecordType"


    // $ANTLR start "ruleRecordType"
    // InternalRecordLang.g:296:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:300:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // InternalRecordLang.g:301:1: ( ( rule__RecordType__Group__0 ) )
            {
            // InternalRecordLang.g:301:1: ( ( rule__RecordType__Group__0 ) )
            // InternalRecordLang.g:302:1: ( rule__RecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup()); 
            }
            // InternalRecordLang.g:303:1: ( rule__RecordType__Group__0 )
            // InternalRecordLang.g:303:2: rule__RecordType__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:315:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalRecordLang.g:316:1: ( ruleConstant EOF )
            // InternalRecordLang.g:317:1: ruleConstant EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantRule()); 
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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalRecordLang.g:324:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:328:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalRecordLang.g:329:1: ( ( rule__Constant__Group__0 ) )
            {
            // InternalRecordLang.g:329:1: ( ( rule__Constant__Group__0 ) )
            // InternalRecordLang.g:330:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // InternalRecordLang.g:331:1: ( rule__Constant__Group__0 )
            // InternalRecordLang.g:331:2: rule__Constant__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:343:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalRecordLang.g:344:1: ( ruleProperty EOF )
            // InternalRecordLang.g:345:1: ruleProperty EOF
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
    // InternalRecordLang.g:352:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:356:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalRecordLang.g:357:1: ( ( rule__Property__Group__0 ) )
            {
            // InternalRecordLang.g:357:1: ( ( rule__Property__Group__0 ) )
            // InternalRecordLang.g:358:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // InternalRecordLang.g:359:1: ( rule__Property__Group__0 )
            // InternalRecordLang.g:359:2: rule__Property__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:371:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalRecordLang.g:372:1: ( ruleForeignKey EOF )
            // InternalRecordLang.g:373:1: ruleForeignKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleForeignKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getForeignKeyRule()); 
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
    // $ANTLR end "entryRuleForeignKey"


    // $ANTLR start "ruleForeignKey"
    // InternalRecordLang.g:380:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:384:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalRecordLang.g:385:1: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalRecordLang.g:385:1: ( ( rule__ForeignKey__Group__0 ) )
            // InternalRecordLang.g:386:1: ( rule__ForeignKey__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroup()); 
            }
            // InternalRecordLang.g:387:1: ( rule__ForeignKey__Group__0 )
            // InternalRecordLang.g:387:2: rule__ForeignKey__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:399:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // InternalRecordLang.g:400:1: ( ruleClassifier EOF )
            // InternalRecordLang.g:401:1: ruleClassifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleClassifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierRule()); 
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
    // $ANTLR end "entryRuleClassifier"


    // $ANTLR start "ruleClassifier"
    // InternalRecordLang.g:408:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:412:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // InternalRecordLang.g:413:1: ( ( rule__Classifier__Group__0 ) )
            {
            // InternalRecordLang.g:413:1: ( ( rule__Classifier__Group__0 ) )
            // InternalRecordLang.g:414:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // InternalRecordLang.g:415:1: ( rule__Classifier__Group__0 )
            // InternalRecordLang.g:415:2: rule__Classifier__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:427:1: entryRuleArraySize : ruleArraySize EOF ;
    public final void entryRuleArraySize() throws RecognitionException {
        try {
            // InternalRecordLang.g:428:1: ( ruleArraySize EOF )
            // InternalRecordLang.g:429:1: ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArraySizeRule()); 
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
    // $ANTLR end "entryRuleArraySize"


    // $ANTLR start "ruleArraySize"
    // InternalRecordLang.g:436:1: ruleArraySize : ( ( rule__ArraySize__Group__0 ) ) ;
    public final void ruleArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:440:2: ( ( ( rule__ArraySize__Group__0 ) ) )
            // InternalRecordLang.g:441:1: ( ( rule__ArraySize__Group__0 ) )
            {
            // InternalRecordLang.g:441:1: ( ( rule__ArraySize__Group__0 ) )
            // InternalRecordLang.g:442:1: ( rule__ArraySize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getGroup()); 
            }
            // InternalRecordLang.g:443:1: ( rule__ArraySize__Group__0 )
            // InternalRecordLang.g:443:2: rule__ArraySize__Group__0
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "entryRuleLiteral"
    // InternalRecordLang.g:455:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:456:1: ( ruleLiteral EOF )
            // InternalRecordLang.g:457:1: ruleLiteral EOF
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
    // InternalRecordLang.g:464:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:468:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalRecordLang.g:469:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalRecordLang.g:469:1: ( ( rule__Literal__Alternatives ) )
            // InternalRecordLang.g:470:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalRecordLang.g:471:1: ( rule__Literal__Alternatives )
            // InternalRecordLang.g:471:2: rule__Literal__Alternatives
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


    // $ANTLR start "entryRuleArrayLiteral"
    // InternalRecordLang.g:483:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:484:1: ( ruleArrayLiteral EOF )
            // InternalRecordLang.g:485:1: ruleArrayLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleArrayLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getArrayLiteralRule()); 
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
    // $ANTLR end "entryRuleArrayLiteral"


    // $ANTLR start "ruleArrayLiteral"
    // InternalRecordLang.g:492:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:496:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // InternalRecordLang.g:497:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // InternalRecordLang.g:497:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // InternalRecordLang.g:498:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // InternalRecordLang.g:499:1: ( rule__ArrayLiteral__Group__0 )
            // InternalRecordLang.g:499:2: rule__ArrayLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:511:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:512:1: ( ruleStringLiteral EOF )
            // InternalRecordLang.g:513:1: ruleStringLiteral EOF
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
    // InternalRecordLang.g:520:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:524:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:525:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:525:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalRecordLang.g:526:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:527:1: ( rule__StringLiteral__ValueAssignment )
            // InternalRecordLang.g:527:2: rule__StringLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleIntLiteral"
    // InternalRecordLang.g:539:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:540:1: ( ruleIntLiteral EOF )
            // InternalRecordLang.g:541:1: ruleIntLiteral EOF
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
    // InternalRecordLang.g:548:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:552:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:553:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:553:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalRecordLang.g:554:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:555:1: ( rule__IntLiteral__ValueAssignment )
            // InternalRecordLang.g:555:2: rule__IntLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleFloatLiteral"
    // InternalRecordLang.g:567:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:568:1: ( ruleFloatLiteral EOF )
            // InternalRecordLang.g:569:1: ruleFloatLiteral EOF
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
    // InternalRecordLang.g:576:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:580:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:581:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:581:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // InternalRecordLang.g:582:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:583:1: ( rule__FloatLiteral__ValueAssignment )
            // InternalRecordLang.g:583:2: rule__FloatLiteral__ValueAssignment
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


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalRecordLang.g:595:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:596:1: ( ruleBooleanLiteral EOF )
            // InternalRecordLang.g:597:1: ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanLiteralRule()); 
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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalRecordLang.g:604:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:608:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:609:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:609:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalRecordLang.g:610:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:611:1: ( rule__BooleanLiteral__ValueAssignment )
            // InternalRecordLang.g:611:2: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:623:1: entryRuleConstantLiteral : ruleConstantLiteral EOF ;
    public final void entryRuleConstantLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:624:1: ( ruleConstantLiteral EOF )
            // InternalRecordLang.g:625:1: ruleConstantLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleConstantLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConstantLiteralRule()); 
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
    // $ANTLR end "entryRuleConstantLiteral"


    // $ANTLR start "ruleConstantLiteral"
    // InternalRecordLang.g:632:1: ruleConstantLiteral : ( ( rule__ConstantLiteral__ValueAssignment ) ) ;
    public final void ruleConstantLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:636:2: ( ( ( rule__ConstantLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:637:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:637:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            // InternalRecordLang.g:638:1: ( rule__ConstantLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:639:1: ( rule__ConstantLiteral__ValueAssignment )
            // InternalRecordLang.g:639:2: rule__ConstantLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:651:1: entryRuleBuiltInValueLiteral : ruleBuiltInValueLiteral EOF ;
    public final void entryRuleBuiltInValueLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:652:1: ( ruleBuiltInValueLiteral EOF )
            // InternalRecordLang.g:653:1: ruleBuiltInValueLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBuiltInValueLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBuiltInValueLiteralRule()); 
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
    // $ANTLR end "entryRuleBuiltInValueLiteral"


    // $ANTLR start "ruleBuiltInValueLiteral"
    // InternalRecordLang.g:660:1: ruleBuiltInValueLiteral : ( ( rule__BuiltInValueLiteral__Group__0 ) ) ;
    public final void ruleBuiltInValueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:664:2: ( ( ( rule__BuiltInValueLiteral__Group__0 ) ) )
            // InternalRecordLang.g:665:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            {
            // InternalRecordLang.g:665:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            // InternalRecordLang.g:666:1: ( rule__BuiltInValueLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getGroup()); 
            }
            // InternalRecordLang.g:667:1: ( rule__BuiltInValueLiteral__Group__0 )
            // InternalRecordLang.g:667:2: rule__BuiltInValueLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:679:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRecordLang.g:680:1: ( ruleQualifiedName EOF )
            // InternalRecordLang.g:681:1: ruleQualifiedName EOF
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
    // InternalRecordLang.g:688:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:692:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRecordLang.g:693:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRecordLang.g:693:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRecordLang.g:694:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalRecordLang.g:695:1: ( rule__QualifiedName__Group__0 )
            // InternalRecordLang.g:695:2: rule__QualifiedName__Group__0
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
    // InternalRecordLang.g:707:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRecordLang.g:708:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRecordLang.g:709:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalRecordLang.g:716:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:720:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRecordLang.g:721:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRecordLang.g:721:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRecordLang.g:722:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalRecordLang.g:723:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRecordLang.g:723:2: rule__QualifiedNameWithWildcard__Group__0
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


    // $ANTLR start "rulePropertyModifier"
    // InternalRecordLang.g:736:1: rulePropertyModifier : ( ( rule__PropertyModifier__Alternatives ) ) ;
    public final void rulePropertyModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:740:1: ( ( ( rule__PropertyModifier__Alternatives ) ) )
            // InternalRecordLang.g:741:1: ( ( rule__PropertyModifier__Alternatives ) )
            {
            // InternalRecordLang.g:741:1: ( ( rule__PropertyModifier__Alternatives ) )
            // InternalRecordLang.g:742:1: ( rule__PropertyModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyModifierAccess().getAlternatives()); 
            }
            // InternalRecordLang.g:743:1: ( rule__PropertyModifier__Alternatives )
            // InternalRecordLang.g:743:2: rule__PropertyModifier__Alternatives
            {
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Schema__Alternatives_4"
    // InternalRecordLang.g:755:1: rule__Schema__Alternatives_4 : ( ( ( rule__Schema__TemplatesAssignment_4_0 ) ) | ( ( rule__Schema__RootAssignment_4_1 ) ) );
    public final void rule__Schema__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:759:1: ( ( ( rule__Schema__TemplatesAssignment_4_0 ) ) | ( ( rule__Schema__RootAssignment_4_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==25) ) {
                alt1=1;
            }
            else if ( (LA1_0==26) ) {
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
                    // InternalRecordLang.g:760:1: ( ( rule__Schema__TemplatesAssignment_4_0 ) )
                    {
                    // InternalRecordLang.g:760:1: ( ( rule__Schema__TemplatesAssignment_4_0 ) )
                    // InternalRecordLang.g:761:1: ( rule__Schema__TemplatesAssignment_4_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaAccess().getTemplatesAssignment_4_0()); 
                    }
                    // InternalRecordLang.g:762:1: ( rule__Schema__TemplatesAssignment_4_0 )
                    // InternalRecordLang.g:762:2: rule__Schema__TemplatesAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__TemplatesAssignment_4_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaAccess().getTemplatesAssignment_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:766:6: ( ( rule__Schema__RootAssignment_4_1 ) )
                    {
                    // InternalRecordLang.g:766:6: ( ( rule__Schema__RootAssignment_4_1 ) )
                    // InternalRecordLang.g:767:1: ( rule__Schema__RootAssignment_4_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaAccess().getRootAssignment_4_1()); 
                    }
                    // InternalRecordLang.g:768:1: ( rule__Schema__RootAssignment_4_1 )
                    // InternalRecordLang.g:768:2: rule__Schema__RootAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__RootAssignment_4_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaAccess().getRootAssignment_4_1()); 
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
    // $ANTLR end "rule__Schema__Alternatives_4"


    // $ANTLR start "rule__Schema__Alternatives_5"
    // InternalRecordLang.g:777:1: rule__Schema__Alternatives_5 : ( ( ( rule__Schema__Group_5_0__0 ) ) | ( ( rule__Schema__Group_5_1__0 ) ) );
    public final void rule__Schema__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:781:1: ( ( ( rule__Schema__Group_5_0__0 ) ) | ( ( rule__Schema__Group_5_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
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
                    // InternalRecordLang.g:782:1: ( ( rule__Schema__Group_5_0__0 ) )
                    {
                    // InternalRecordLang.g:782:1: ( ( rule__Schema__Group_5_0__0 ) )
                    // InternalRecordLang.g:783:1: ( rule__Schema__Group_5_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaAccess().getGroup_5_0()); 
                    }
                    // InternalRecordLang.g:784:1: ( rule__Schema__Group_5_0__0 )
                    // InternalRecordLang.g:784:2: rule__Schema__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_5_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaAccess().getGroup_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:788:6: ( ( rule__Schema__Group_5_1__0 ) )
                    {
                    // InternalRecordLang.g:788:6: ( ( rule__Schema__Group_5_1__0 ) )
                    // InternalRecordLang.g:789:1: ( rule__Schema__Group_5_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaAccess().getGroup_5_1()); 
                    }
                    // InternalRecordLang.g:790:1: ( rule__Schema__Group_5_1__0 )
                    // InternalRecordLang.g:790:2: rule__Schema__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_5_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaAccess().getGroup_5_1()); 
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
    // $ANTLR end "rule__Schema__Alternatives_5"


    // $ANTLR start "rule__Schema__Alternatives_5_0_1"
    // InternalRecordLang.g:799:1: rule__Schema__Alternatives_5_0_1 : ( ( ( rule__Schema__PropertiesAssignment_5_0_1_0 ) ) | ( ( rule__Schema__ConstantsAssignment_5_0_1_1 ) ) );
    public final void rule__Schema__Alternatives_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:803:1: ( ( ( rule__Schema__PropertiesAssignment_5_0_1_0 ) ) | ( ( rule__Schema__ConstantsAssignment_5_0_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=14 && LA3_0<=15)||LA3_0==32||LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
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
                    // InternalRecordLang.g:804:1: ( ( rule__Schema__PropertiesAssignment_5_0_1_0 ) )
                    {
                    // InternalRecordLang.g:804:1: ( ( rule__Schema__PropertiesAssignment_5_0_1_0 ) )
                    // InternalRecordLang.g:805:1: ( rule__Schema__PropertiesAssignment_5_0_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaAccess().getPropertiesAssignment_5_0_1_0()); 
                    }
                    // InternalRecordLang.g:806:1: ( rule__Schema__PropertiesAssignment_5_0_1_0 )
                    // InternalRecordLang.g:806:2: rule__Schema__PropertiesAssignment_5_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__PropertiesAssignment_5_0_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaAccess().getPropertiesAssignment_5_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:810:6: ( ( rule__Schema__ConstantsAssignment_5_0_1_1 ) )
                    {
                    // InternalRecordLang.g:810:6: ( ( rule__Schema__ConstantsAssignment_5_0_1_1 ) )
                    // InternalRecordLang.g:811:1: ( rule__Schema__ConstantsAssignment_5_0_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSchemaAccess().getConstantsAssignment_5_0_1_1()); 
                    }
                    // InternalRecordLang.g:812:1: ( rule__Schema__ConstantsAssignment_5_0_1_1 )
                    // InternalRecordLang.g:812:2: rule__Schema__ConstantsAssignment_5_0_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__ConstantsAssignment_5_0_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSchemaAccess().getConstantsAssignment_5_0_1_1()); 
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
    // $ANTLR end "rule__Schema__Alternatives_5_0_1"


    // $ANTLR start "rule__ComplexType__Alternatives"
    // InternalRecordLang.g:821:1: rule__ComplexType__Alternatives : ( ( ruleRecordType ) | ( ruleTemplateType ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:825:1: ( ( ruleRecordType ) | ( ruleTemplateType ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 20:
                        {
                        int LA4_2 = input.LA(4);

                        if ( (LA4_2==RULE_STRING) ) {
                            int LA4_6 = input.LA(5);

                            if ( (LA4_6==28||LA4_6==40) ) {
                                alt4=1;
                            }
                            else if ( (LA4_6==27) ) {
                                alt4=2;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 6, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 2, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 28:
                    case 40:
                        {
                        alt4=1;
                        }
                        break;
                    case 27:
                        {
                        alt4=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 5, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==RULE_STRING) ) {
                    int LA4_6 = input.LA(3);

                    if ( (LA4_6==28||LA4_6==40) ) {
                        alt4=1;
                    }
                    else if ( (LA4_6==27) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 6, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 40:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
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
                    // InternalRecordLang.g:826:1: ( ruleRecordType )
                    {
                    // InternalRecordLang.g:826:1: ( ruleRecordType )
                    // InternalRecordLang.g:827:1: ruleRecordType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getRecordTypeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleRecordType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexTypeAccess().getRecordTypeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:832:6: ( ruleTemplateType )
                    {
                    // InternalRecordLang.g:832:6: ( ruleTemplateType )
                    // InternalRecordLang.g:833:1: ruleTemplateType
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComplexTypeAccess().getTemplateTypeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleTemplateType();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComplexTypeAccess().getTemplateTypeParserRuleCall_1()); 
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
    // $ANTLR end "rule__ComplexType__Alternatives"


    // $ANTLR start "rule__TemplateType__Alternatives_5_1"
    // InternalRecordLang.g:843:1: rule__TemplateType__Alternatives_5_1 : ( ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) ) );
    public final void rule__TemplateType__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:847:1: ( ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID||(LA5_0>=14 && LA5_0<=15)||LA5_0==32||LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==30) ) {
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
                    // InternalRecordLang.g:848:1: ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) )
                    {
                    // InternalRecordLang.g:848:1: ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) )
                    // InternalRecordLang.g:849:1: ( rule__TemplateType__PropertiesAssignment_5_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemplateTypeAccess().getPropertiesAssignment_5_1_0()); 
                    }
                    // InternalRecordLang.g:850:1: ( rule__TemplateType__PropertiesAssignment_5_1_0 )
                    // InternalRecordLang.g:850:2: rule__TemplateType__PropertiesAssignment_5_1_0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalRecordLang.g:854:6: ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) )
                    {
                    // InternalRecordLang.g:854:6: ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) )
                    // InternalRecordLang.g:855:1: ( rule__TemplateType__ConstantsAssignment_5_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemplateTypeAccess().getConstantsAssignment_5_1_1()); 
                    }
                    // InternalRecordLang.g:856:1: ( rule__TemplateType__ConstantsAssignment_5_1_1 )
                    // InternalRecordLang.g:856:2: rule__TemplateType__ConstantsAssignment_5_1_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:865:1: rule__RecordType__Alternatives_7_1 : ( ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) ) );
    public final void rule__RecordType__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:869:1: ( ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=14 && LA6_0<=15)||LA6_0==32||LA6_0==34) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
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
                    // InternalRecordLang.g:870:1: ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) )
                    {
                    // InternalRecordLang.g:870:1: ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) )
                    // InternalRecordLang.g:871:1: ( rule__RecordType__PropertiesAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_7_1_0()); 
                    }
                    // InternalRecordLang.g:872:1: ( rule__RecordType__PropertiesAssignment_7_1_0 )
                    // InternalRecordLang.g:872:2: rule__RecordType__PropertiesAssignment_7_1_0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalRecordLang.g:876:6: ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) )
                    {
                    // InternalRecordLang.g:876:6: ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) )
                    // InternalRecordLang.g:877:1: ( rule__RecordType__ConstantsAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getConstantsAssignment_7_1_1()); 
                    }
                    // InternalRecordLang.g:878:1: ( rule__RecordType__ConstantsAssignment_7_1_1 )
                    // InternalRecordLang.g:878:2: rule__RecordType__ConstantsAssignment_7_1_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:887:1: rule__Property__Alternatives_2 : ( ( ( rule__Property__TypeAssignment_2_0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) );
    public final void rule__Property__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:891:1: ( ( ( rule__Property__TypeAssignment_2_0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
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
                    // InternalRecordLang.g:892:1: ( ( rule__Property__TypeAssignment_2_0 ) )
                    {
                    // InternalRecordLang.g:892:1: ( ( rule__Property__TypeAssignment_2_0 ) )
                    // InternalRecordLang.g:893:1: ( rule__Property__TypeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getTypeAssignment_2_0()); 
                    }
                    // InternalRecordLang.g:894:1: ( rule__Property__TypeAssignment_2_0 )
                    // InternalRecordLang.g:894:2: rule__Property__TypeAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
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
                    // InternalRecordLang.g:898:6: ( ( rule__Property__Group_2_1__0 ) )
                    {
                    // InternalRecordLang.g:898:6: ( ( rule__Property__Group_2_1__0 ) )
                    // InternalRecordLang.g:899:1: ( rule__Property__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_1()); 
                    }
                    // InternalRecordLang.g:900:1: ( rule__Property__Group_2_1__0 )
                    // InternalRecordLang.g:900:2: rule__Property__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:909:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:913:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_FLOAT:
                {
                alt8=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt8=4;
                }
                break;
            case RULE_ID:
                {
                alt8=5;
                }
                break;
            case 21:
                {
                alt8=6;
                }
                break;
            case 41:
                {
                alt8=7;
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
                    // InternalRecordLang.g:914:1: ( ruleStringLiteral )
                    {
                    // InternalRecordLang.g:914:1: ( ruleStringLiteral )
                    // InternalRecordLang.g:915:1: ruleStringLiteral
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
                    // InternalRecordLang.g:920:6: ( ruleIntLiteral )
                    {
                    // InternalRecordLang.g:920:6: ( ruleIntLiteral )
                    // InternalRecordLang.g:921:1: ruleIntLiteral
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
                    // InternalRecordLang.g:926:6: ( ruleFloatLiteral )
                    {
                    // InternalRecordLang.g:926:6: ( ruleFloatLiteral )
                    // InternalRecordLang.g:927:1: ruleFloatLiteral
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
                case 4 :
                    // InternalRecordLang.g:932:6: ( ruleBooleanLiteral )
                    {
                    // InternalRecordLang.g:932:6: ( ruleBooleanLiteral )
                    // InternalRecordLang.g:933:1: ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalRecordLang.g:938:6: ( ruleConstantLiteral )
                    {
                    // InternalRecordLang.g:938:6: ( ruleConstantLiteral )
                    // InternalRecordLang.g:939:1: ruleConstantLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getConstantLiteralParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalRecordLang.g:944:6: ( ruleArrayLiteral )
                    {
                    // InternalRecordLang.g:944:6: ( ruleArrayLiteral )
                    // InternalRecordLang.g:945:1: ruleArrayLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getArrayLiteralParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_2);
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
                    // InternalRecordLang.g:950:6: ( ruleBuiltInValueLiteral )
                    {
                    // InternalRecordLang.g:950:6: ( ruleBuiltInValueLiteral )
                    // InternalRecordLang.g:951:1: ruleBuiltInValueLiteral
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLiteralAccess().getBuiltInValueLiteralParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:961:1: rule__PropertyModifier__Alternatives : ( ( ( 'transient' ) ) | ( ( 'auto-increment' ) ) );
    public final void rule__PropertyModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:965:1: ( ( ( 'transient' ) ) | ( ( 'auto-increment' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            else if ( (LA9_0==15) ) {
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
                    // InternalRecordLang.g:966:1: ( ( 'transient' ) )
                    {
                    // InternalRecordLang.g:966:1: ( ( 'transient' ) )
                    // InternalRecordLang.g:967:1: ( 'transient' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0()); 
                    }
                    // InternalRecordLang.g:968:1: ( 'transient' )
                    // InternalRecordLang.g:968:3: 'transient'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalRecordLang.g:973:6: ( ( 'auto-increment' ) )
                    {
                    // InternalRecordLang.g:973:6: ( ( 'auto-increment' ) )
                    // InternalRecordLang.g:974:1: ( 'auto-increment' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyModifierAccess().getINCREMENTEnumLiteralDeclaration_1()); 
                    }
                    // InternalRecordLang.g:975:1: ( 'auto-increment' )
                    // InternalRecordLang.g:975:3: 'auto-increment'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

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
    // InternalRecordLang.g:987:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:991:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRecordLang.g:992:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:999:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1003:1: ( ( 'package' ) )
            // InternalRecordLang.g:1004:1: ( 'package' )
            {
            // InternalRecordLang.g:1004:1: ( 'package' )
            // InternalRecordLang.g:1005:1: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getPackageKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1018:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1022:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalRecordLang.g:1023:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:1030:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1034:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalRecordLang.g:1035:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalRecordLang.g:1035:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalRecordLang.g:1036:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // InternalRecordLang.g:1037:1: ( rule__Model__NameAssignment_1 )
            // InternalRecordLang.g:1037:2: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:1047:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1051:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalRecordLang.g:1052:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:1059:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1063:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // InternalRecordLang.g:1064:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // InternalRecordLang.g:1064:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // InternalRecordLang.g:1065:1: ( rule__Model__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            }
            // InternalRecordLang.g:1066:1: ( rule__Model__ImportsAssignment_2 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRecordLang.g:1066:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            }

            }


            }

        }
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
    // InternalRecordLang.g:1076:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1080:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalRecordLang.g:1081:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:1088:1: rule__Model__Group__3__Impl : ( ( rule__Model__TypesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1092:1: ( ( ( rule__Model__TypesAssignment_3 )* ) )
            // InternalRecordLang.g:1093:1: ( ( rule__Model__TypesAssignment_3 )* )
            {
            // InternalRecordLang.g:1093:1: ( ( rule__Model__TypesAssignment_3 )* )
            // InternalRecordLang.g:1094:1: ( rule__Model__TypesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesAssignment_3()); 
            }
            // InternalRecordLang.g:1095:1: ( rule__Model__TypesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                switch ( input.LA(1) ) {
                case 19:
                    {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_STRING) ) {
                        int LA11_5 = input.LA(3);

                        if ( (LA11_5==20) ) {
                            int LA11_2 = input.LA(4);

                            if ( (LA11_2==RULE_STRING) ) {
                                int LA11_6 = input.LA(5);

                                if ( ((LA11_6>=27 && LA11_6<=28)||LA11_6==40) ) {
                                    alt11=1;
                                }


                            }


                        }
                        else if ( ((LA11_5>=27 && LA11_5<=28)||LA11_5==40) ) {
                            alt11=1;
                        }


                    }


                    }
                    break;
                case 20:
                    {
                    int LA11_2 = input.LA(2);

                    if ( (LA11_2==RULE_STRING) ) {
                        int LA11_6 = input.LA(3);

                        if ( ((LA11_6>=27 && LA11_6<=28)||LA11_6==40) ) {
                            alt11=1;
                        }


                    }


                    }
                    break;
                case 27:
                case 28:
                case 40:
                    {
                    alt11=1;
                    }
                    break;

                }

                switch (alt11) {
            	case 1 :
            	    // InternalRecordLang.g:1095:2: rule__Model__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__TypesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getTypesAssignment_3()); 
            }

            }


            }

        }
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
    // InternalRecordLang.g:1105:1: rule__Model__Group__4 : rule__Model__Group__4__Impl ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1109:1: ( rule__Model__Group__4__Impl )
            // InternalRecordLang.g:1110:2: rule__Model__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:1116:1: rule__Model__Group__4__Impl : ( ( rule__Model__SchemesAssignment_4 )* ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1120:1: ( ( ( rule__Model__SchemesAssignment_4 )* ) )
            // InternalRecordLang.g:1121:1: ( ( rule__Model__SchemesAssignment_4 )* )
            {
            // InternalRecordLang.g:1121:1: ( ( rule__Model__SchemesAssignment_4 )* )
            // InternalRecordLang.g:1122:1: ( rule__Model__SchemesAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSchemesAssignment_4()); 
            }
            // InternalRecordLang.g:1123:1: ( rule__Model__SchemesAssignment_4 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=18 && LA12_0<=20)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRecordLang.g:1123:2: rule__Model__SchemesAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__SchemesAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSchemesAssignment_4()); 
            }

            }


            }

        }
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
    // InternalRecordLang.g:1143:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1147:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRecordLang.g:1148:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalRecordLang.g:1155:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1159:1: ( ( 'import' ) )
            // InternalRecordLang.g:1160:1: ( 'import' )
            {
            // InternalRecordLang.g:1160:1: ( 'import' )
            // InternalRecordLang.g:1161:1: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1174:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1178:1: ( rule__Import__Group__1__Impl )
            // InternalRecordLang.g:1179:2: rule__Import__Group__1__Impl
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
    // InternalRecordLang.g:1185:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1189:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRecordLang.g:1190:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRecordLang.g:1190:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRecordLang.g:1191:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalRecordLang.g:1192:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRecordLang.g:1192:2: rule__Import__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__Schema__Group__0"
    // InternalRecordLang.g:1206:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1210:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalRecordLang.g:1211:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Schema__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // InternalRecordLang.g:1218:1: rule__Schema__Group__0__Impl : ( ( rule__Schema__Group_0__0 )? ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1222:1: ( ( ( rule__Schema__Group_0__0 )? ) )
            // InternalRecordLang.g:1223:1: ( ( rule__Schema__Group_0__0 )? )
            {
            // InternalRecordLang.g:1223:1: ( ( rule__Schema__Group_0__0 )? )
            // InternalRecordLang.g:1224:1: ( rule__Schema__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getGroup_0()); 
            }
            // InternalRecordLang.g:1225:1: ( rule__Schema__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRecordLang.g:1225:2: rule__Schema__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // InternalRecordLang.g:1235:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1239:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalRecordLang.g:1240:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Schema__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // InternalRecordLang.g:1247:1: rule__Schema__Group__1__Impl : ( ( rule__Schema__Group_1__0 )? ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1251:1: ( ( ( rule__Schema__Group_1__0 )? ) )
            // InternalRecordLang.g:1252:1: ( ( rule__Schema__Group_1__0 )? )
            {
            // InternalRecordLang.g:1252:1: ( ( rule__Schema__Group_1__0 )? )
            // InternalRecordLang.g:1253:1: ( rule__Schema__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:1254:1: ( rule__Schema__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRecordLang.g:1254:2: rule__Schema__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // InternalRecordLang.g:1264:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1268:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalRecordLang.g:1269:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Schema__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // InternalRecordLang.g:1276:1: rule__Schema__Group__2__Impl : ( 'schema' ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1280:1: ( ( 'schema' ) )
            // InternalRecordLang.g:1281:1: ( 'schema' )
            {
            // InternalRecordLang.g:1281:1: ( 'schema' )
            // InternalRecordLang.g:1282:1: 'schema'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getSchemaKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getSchemaKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__3"
    // InternalRecordLang.g:1295:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1299:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalRecordLang.g:1300:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Schema__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3"


    // $ANTLR start "rule__Schema__Group__3__Impl"
    // InternalRecordLang.g:1307:1: rule__Schema__Group__3__Impl : ( ( rule__Schema__NameAssignment_3 ) ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1311:1: ( ( ( rule__Schema__NameAssignment_3 ) ) )
            // InternalRecordLang.g:1312:1: ( ( rule__Schema__NameAssignment_3 ) )
            {
            // InternalRecordLang.g:1312:1: ( ( rule__Schema__NameAssignment_3 ) )
            // InternalRecordLang.g:1313:1: ( rule__Schema__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getNameAssignment_3()); 
            }
            // InternalRecordLang.g:1314:1: ( rule__Schema__NameAssignment_3 )
            // InternalRecordLang.g:1314:2: rule__Schema__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Schema__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3__Impl"


    // $ANTLR start "rule__Schema__Group__4"
    // InternalRecordLang.g:1324:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1328:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // InternalRecordLang.g:1329:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Schema__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4"


    // $ANTLR start "rule__Schema__Group__4__Impl"
    // InternalRecordLang.g:1336:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__Alternatives_4 ) ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1340:1: ( ( ( rule__Schema__Alternatives_4 ) ) )
            // InternalRecordLang.g:1341:1: ( ( rule__Schema__Alternatives_4 ) )
            {
            // InternalRecordLang.g:1341:1: ( ( rule__Schema__Alternatives_4 ) )
            // InternalRecordLang.g:1342:1: ( rule__Schema__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getAlternatives_4()); 
            }
            // InternalRecordLang.g:1343:1: ( rule__Schema__Alternatives_4 )
            // InternalRecordLang.g:1343:2: rule__Schema__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4__Impl"


    // $ANTLR start "rule__Schema__Group__5"
    // InternalRecordLang.g:1353:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1357:1: ( rule__Schema__Group__5__Impl )
            // InternalRecordLang.g:1358:2: rule__Schema__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__5"


    // $ANTLR start "rule__Schema__Group__5__Impl"
    // InternalRecordLang.g:1364:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__Alternatives_5 ) ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1368:1: ( ( ( rule__Schema__Alternatives_5 ) ) )
            // InternalRecordLang.g:1369:1: ( ( rule__Schema__Alternatives_5 ) )
            {
            // InternalRecordLang.g:1369:1: ( ( rule__Schema__Alternatives_5 ) )
            // InternalRecordLang.g:1370:1: ( rule__Schema__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getAlternatives_5()); 
            }
            // InternalRecordLang.g:1371:1: ( rule__Schema__Alternatives_5 )
            // InternalRecordLang.g:1371:2: rule__Schema__Alternatives_5
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getAlternatives_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__5__Impl"


    // $ANTLR start "rule__Schema__Group_0__0"
    // InternalRecordLang.g:1393:1: rule__Schema__Group_0__0 : rule__Schema__Group_0__0__Impl rule__Schema__Group_0__1 ;
    public final void rule__Schema__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1397:1: ( rule__Schema__Group_0__0__Impl rule__Schema__Group_0__1 )
            // InternalRecordLang.g:1398:2: rule__Schema__Group_0__0__Impl rule__Schema__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_0__0"


    // $ANTLR start "rule__Schema__Group_0__0__Impl"
    // InternalRecordLang.g:1405:1: rule__Schema__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__Schema__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1409:1: ( ( '@author' ) )
            // InternalRecordLang.g:1410:1: ( '@author' )
            {
            // InternalRecordLang.g:1410:1: ( '@author' )
            // InternalRecordLang.g:1411:1: '@author'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getAuthorKeyword_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getAuthorKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_0__0__Impl"


    // $ANTLR start "rule__Schema__Group_0__1"
    // InternalRecordLang.g:1424:1: rule__Schema__Group_0__1 : rule__Schema__Group_0__1__Impl ;
    public final void rule__Schema__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1428:1: ( rule__Schema__Group_0__1__Impl )
            // InternalRecordLang.g:1429:2: rule__Schema__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_0__1"


    // $ANTLR start "rule__Schema__Group_0__1__Impl"
    // InternalRecordLang.g:1435:1: rule__Schema__Group_0__1__Impl : ( ( rule__Schema__AuthorAssignment_0_1 ) ) ;
    public final void rule__Schema__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1439:1: ( ( ( rule__Schema__AuthorAssignment_0_1 ) ) )
            // InternalRecordLang.g:1440:1: ( ( rule__Schema__AuthorAssignment_0_1 ) )
            {
            // InternalRecordLang.g:1440:1: ( ( rule__Schema__AuthorAssignment_0_1 ) )
            // InternalRecordLang.g:1441:1: ( rule__Schema__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getAuthorAssignment_0_1()); 
            }
            // InternalRecordLang.g:1442:1: ( rule__Schema__AuthorAssignment_0_1 )
            // InternalRecordLang.g:1442:2: rule__Schema__AuthorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__AuthorAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getAuthorAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_0__1__Impl"


    // $ANTLR start "rule__Schema__Group_1__0"
    // InternalRecordLang.g:1456:1: rule__Schema__Group_1__0 : rule__Schema__Group_1__0__Impl rule__Schema__Group_1__1 ;
    public final void rule__Schema__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1460:1: ( rule__Schema__Group_1__0__Impl rule__Schema__Group_1__1 )
            // InternalRecordLang.g:1461:2: rule__Schema__Group_1__0__Impl rule__Schema__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Schema__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__0"


    // $ANTLR start "rule__Schema__Group_1__0__Impl"
    // InternalRecordLang.g:1468:1: rule__Schema__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__Schema__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1472:1: ( ( '@since' ) )
            // InternalRecordLang.g:1473:1: ( '@since' )
            {
            // InternalRecordLang.g:1473:1: ( '@since' )
            // InternalRecordLang.g:1474:1: '@since'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getSinceKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getSinceKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__0__Impl"


    // $ANTLR start "rule__Schema__Group_1__1"
    // InternalRecordLang.g:1487:1: rule__Schema__Group_1__1 : rule__Schema__Group_1__1__Impl ;
    public final void rule__Schema__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1491:1: ( rule__Schema__Group_1__1__Impl )
            // InternalRecordLang.g:1492:2: rule__Schema__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__1"


    // $ANTLR start "rule__Schema__Group_1__1__Impl"
    // InternalRecordLang.g:1498:1: rule__Schema__Group_1__1__Impl : ( ( rule__Schema__SinceAssignment_1_1 ) ) ;
    public final void rule__Schema__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1502:1: ( ( ( rule__Schema__SinceAssignment_1_1 ) ) )
            // InternalRecordLang.g:1503:1: ( ( rule__Schema__SinceAssignment_1_1 ) )
            {
            // InternalRecordLang.g:1503:1: ( ( rule__Schema__SinceAssignment_1_1 ) )
            // InternalRecordLang.g:1504:1: ( rule__Schema__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getSinceAssignment_1_1()); 
            }
            // InternalRecordLang.g:1505:1: ( rule__Schema__SinceAssignment_1_1 )
            // InternalRecordLang.g:1505:2: rule__Schema__SinceAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__SinceAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getSinceAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_1__1__Impl"


    // $ANTLR start "rule__Schema__Group_5_0__0"
    // InternalRecordLang.g:1519:1: rule__Schema__Group_5_0__0 : rule__Schema__Group_5_0__0__Impl rule__Schema__Group_5_0__1 ;
    public final void rule__Schema__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1523:1: ( rule__Schema__Group_5_0__0__Impl rule__Schema__Group_5_0__1 )
            // InternalRecordLang.g:1524:2: rule__Schema__Group_5_0__0__Impl rule__Schema__Group_5_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Schema__Group_5_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_0__0"


    // $ANTLR start "rule__Schema__Group_5_0__0__Impl"
    // InternalRecordLang.g:1531:1: rule__Schema__Group_5_0__0__Impl : ( '{' ) ;
    public final void rule__Schema__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1535:1: ( ( '{' ) )
            // InternalRecordLang.g:1536:1: ( '{' )
            {
            // InternalRecordLang.g:1536:1: ( '{' )
            // InternalRecordLang.g:1537:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_0_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getLeftCurlyBracketKeyword_5_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_0__0__Impl"


    // $ANTLR start "rule__Schema__Group_5_0__1"
    // InternalRecordLang.g:1550:1: rule__Schema__Group_5_0__1 : rule__Schema__Group_5_0__1__Impl rule__Schema__Group_5_0__2 ;
    public final void rule__Schema__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1554:1: ( rule__Schema__Group_5_0__1__Impl rule__Schema__Group_5_0__2 )
            // InternalRecordLang.g:1555:2: rule__Schema__Group_5_0__1__Impl rule__Schema__Group_5_0__2
            {
            pushFollow(FOLLOW_12);
            rule__Schema__Group_5_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_0__1"


    // $ANTLR start "rule__Schema__Group_5_0__1__Impl"
    // InternalRecordLang.g:1562:1: rule__Schema__Group_5_0__1__Impl : ( ( rule__Schema__Alternatives_5_0_1 )* ) ;
    public final void rule__Schema__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1566:1: ( ( ( rule__Schema__Alternatives_5_0_1 )* ) )
            // InternalRecordLang.g:1567:1: ( ( rule__Schema__Alternatives_5_0_1 )* )
            {
            // InternalRecordLang.g:1567:1: ( ( rule__Schema__Alternatives_5_0_1 )* )
            // InternalRecordLang.g:1568:1: ( rule__Schema__Alternatives_5_0_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getAlternatives_5_0_1()); 
            }
            // InternalRecordLang.g:1569:1: ( rule__Schema__Alternatives_5_0_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID||(LA15_0>=14 && LA15_0<=15)||LA15_0==30||LA15_0==32||LA15_0==34) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRecordLang.g:1569:2: rule__Schema__Alternatives_5_0_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Schema__Alternatives_5_0_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getAlternatives_5_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_0__1__Impl"


    // $ANTLR start "rule__Schema__Group_5_0__2"
    // InternalRecordLang.g:1579:1: rule__Schema__Group_5_0__2 : rule__Schema__Group_5_0__2__Impl ;
    public final void rule__Schema__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1583:1: ( rule__Schema__Group_5_0__2__Impl )
            // InternalRecordLang.g:1584:2: rule__Schema__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_0__2"


    // $ANTLR start "rule__Schema__Group_5_0__2__Impl"
    // InternalRecordLang.g:1590:1: rule__Schema__Group_5_0__2__Impl : ( '}' ) ;
    public final void rule__Schema__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1594:1: ( ( '}' ) )
            // InternalRecordLang.g:1595:1: ( '}' )
            {
            // InternalRecordLang.g:1595:1: ( '}' )
            // InternalRecordLang.g:1596:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_0_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getRightCurlyBracketKeyword_5_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_0__2__Impl"


    // $ANTLR start "rule__Schema__Group_5_1__0"
    // InternalRecordLang.g:1615:1: rule__Schema__Group_5_1__0 : rule__Schema__Group_5_1__0__Impl rule__Schema__Group_5_1__1 ;
    public final void rule__Schema__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1619:1: ( rule__Schema__Group_5_1__0__Impl rule__Schema__Group_5_1__1 )
            // InternalRecordLang.g:1620:2: rule__Schema__Group_5_1__0__Impl rule__Schema__Group_5_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Schema__Group_5_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1__0"


    // $ANTLR start "rule__Schema__Group_5_1__0__Impl"
    // InternalRecordLang.g:1627:1: rule__Schema__Group_5_1__0__Impl : ( ':' ) ;
    public final void rule__Schema__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1631:1: ( ( ':' ) )
            // InternalRecordLang.g:1632:1: ( ':' )
            {
            // InternalRecordLang.g:1632:1: ( ':' )
            // InternalRecordLang.g:1633:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getColonKeyword_5_1_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getColonKeyword_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1__0__Impl"


    // $ANTLR start "rule__Schema__Group_5_1__1"
    // InternalRecordLang.g:1646:1: rule__Schema__Group_5_1__1 : rule__Schema__Group_5_1__1__Impl rule__Schema__Group_5_1__2 ;
    public final void rule__Schema__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1650:1: ( rule__Schema__Group_5_1__1__Impl rule__Schema__Group_5_1__2 )
            // InternalRecordLang.g:1651:2: rule__Schema__Group_5_1__1__Impl rule__Schema__Group_5_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Schema__Group_5_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1__1"


    // $ANTLR start "rule__Schema__Group_5_1__1__Impl"
    // InternalRecordLang.g:1658:1: rule__Schema__Group_5_1__1__Impl : ( ( rule__Schema__ParentsAssignment_5_1_1 ) ) ;
    public final void rule__Schema__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1662:1: ( ( ( rule__Schema__ParentsAssignment_5_1_1 ) ) )
            // InternalRecordLang.g:1663:1: ( ( rule__Schema__ParentsAssignment_5_1_1 ) )
            {
            // InternalRecordLang.g:1663:1: ( ( rule__Schema__ParentsAssignment_5_1_1 ) )
            // InternalRecordLang.g:1664:1: ( rule__Schema__ParentsAssignment_5_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getParentsAssignment_5_1_1()); 
            }
            // InternalRecordLang.g:1665:1: ( rule__Schema__ParentsAssignment_5_1_1 )
            // InternalRecordLang.g:1665:2: rule__Schema__ParentsAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__ParentsAssignment_5_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getParentsAssignment_5_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1__1__Impl"


    // $ANTLR start "rule__Schema__Group_5_1__2"
    // InternalRecordLang.g:1675:1: rule__Schema__Group_5_1__2 : rule__Schema__Group_5_1__2__Impl ;
    public final void rule__Schema__Group_5_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1679:1: ( rule__Schema__Group_5_1__2__Impl )
            // InternalRecordLang.g:1680:2: rule__Schema__Group_5_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1__2"


    // $ANTLR start "rule__Schema__Group_5_1__2__Impl"
    // InternalRecordLang.g:1686:1: rule__Schema__Group_5_1__2__Impl : ( ( rule__Schema__Group_5_1_2__0 )* ) ;
    public final void rule__Schema__Group_5_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1690:1: ( ( ( rule__Schema__Group_5_1_2__0 )* ) )
            // InternalRecordLang.g:1691:1: ( ( rule__Schema__Group_5_1_2__0 )* )
            {
            // InternalRecordLang.g:1691:1: ( ( rule__Schema__Group_5_1_2__0 )* )
            // InternalRecordLang.g:1692:1: ( rule__Schema__Group_5_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getGroup_5_1_2()); 
            }
            // InternalRecordLang.g:1693:1: ( rule__Schema__Group_5_1_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRecordLang.g:1693:2: rule__Schema__Group_5_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Schema__Group_5_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getGroup_5_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1__2__Impl"


    // $ANTLR start "rule__Schema__Group_5_1_2__0"
    // InternalRecordLang.g:1709:1: rule__Schema__Group_5_1_2__0 : rule__Schema__Group_5_1_2__0__Impl rule__Schema__Group_5_1_2__1 ;
    public final void rule__Schema__Group_5_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1713:1: ( rule__Schema__Group_5_1_2__0__Impl rule__Schema__Group_5_1_2__1 )
            // InternalRecordLang.g:1714:2: rule__Schema__Group_5_1_2__0__Impl rule__Schema__Group_5_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Schema__Group_5_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1_2__0"


    // $ANTLR start "rule__Schema__Group_5_1_2__0__Impl"
    // InternalRecordLang.g:1721:1: rule__Schema__Group_5_1_2__0__Impl : ( ',' ) ;
    public final void rule__Schema__Group_5_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1725:1: ( ( ',' ) )
            // InternalRecordLang.g:1726:1: ( ',' )
            {
            // InternalRecordLang.g:1726:1: ( ',' )
            // InternalRecordLang.g:1727:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getCommaKeyword_5_1_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getCommaKeyword_5_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1_2__0__Impl"


    // $ANTLR start "rule__Schema__Group_5_1_2__1"
    // InternalRecordLang.g:1740:1: rule__Schema__Group_5_1_2__1 : rule__Schema__Group_5_1_2__1__Impl ;
    public final void rule__Schema__Group_5_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1744:1: ( rule__Schema__Group_5_1_2__1__Impl )
            // InternalRecordLang.g:1745:2: rule__Schema__Group_5_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1_2__1"


    // $ANTLR start "rule__Schema__Group_5_1_2__1__Impl"
    // InternalRecordLang.g:1751:1: rule__Schema__Group_5_1_2__1__Impl : ( ( rule__Schema__ParentsAssignment_5_1_2_1 ) ) ;
    public final void rule__Schema__Group_5_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1755:1: ( ( ( rule__Schema__ParentsAssignment_5_1_2_1 ) ) )
            // InternalRecordLang.g:1756:1: ( ( rule__Schema__ParentsAssignment_5_1_2_1 ) )
            {
            // InternalRecordLang.g:1756:1: ( ( rule__Schema__ParentsAssignment_5_1_2_1 ) )
            // InternalRecordLang.g:1757:1: ( rule__Schema__ParentsAssignment_5_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getParentsAssignment_5_1_2_1()); 
            }
            // InternalRecordLang.g:1758:1: ( rule__Schema__ParentsAssignment_5_1_2_1 )
            // InternalRecordLang.g:1758:2: rule__Schema__ParentsAssignment_5_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__ParentsAssignment_5_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getParentsAssignment_5_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5_1_2__1__Impl"


    // $ANTLR start "rule__Templates__Group__0"
    // InternalRecordLang.g:1772:1: rule__Templates__Group__0 : rule__Templates__Group__0__Impl rule__Templates__Group__1 ;
    public final void rule__Templates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1776:1: ( rule__Templates__Group__0__Impl rule__Templates__Group__1 )
            // InternalRecordLang.g:1777:2: rule__Templates__Group__0__Impl rule__Templates__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Templates__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Templates__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group__0"


    // $ANTLR start "rule__Templates__Group__0__Impl"
    // InternalRecordLang.g:1784:1: rule__Templates__Group__0__Impl : ( 'templates' ) ;
    public final void rule__Templates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1788:1: ( ( 'templates' ) )
            // InternalRecordLang.g:1789:1: ( 'templates' )
            {
            // InternalRecordLang.g:1789:1: ( 'templates' )
            // InternalRecordLang.g:1790:1: 'templates'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getTemplatesKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getTemplatesKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group__0__Impl"


    // $ANTLR start "rule__Templates__Group__1"
    // InternalRecordLang.g:1803:1: rule__Templates__Group__1 : rule__Templates__Group__1__Impl rule__Templates__Group__2 ;
    public final void rule__Templates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1807:1: ( rule__Templates__Group__1__Impl rule__Templates__Group__2 )
            // InternalRecordLang.g:1808:2: rule__Templates__Group__1__Impl rule__Templates__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Templates__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Templates__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group__1"


    // $ANTLR start "rule__Templates__Group__1__Impl"
    // InternalRecordLang.g:1815:1: rule__Templates__Group__1__Impl : ( ( rule__Templates__TemplatesAssignment_1 ) ) ;
    public final void rule__Templates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1819:1: ( ( ( rule__Templates__TemplatesAssignment_1 ) ) )
            // InternalRecordLang.g:1820:1: ( ( rule__Templates__TemplatesAssignment_1 ) )
            {
            // InternalRecordLang.g:1820:1: ( ( rule__Templates__TemplatesAssignment_1 ) )
            // InternalRecordLang.g:1821:1: ( rule__Templates__TemplatesAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getTemplatesAssignment_1()); 
            }
            // InternalRecordLang.g:1822:1: ( rule__Templates__TemplatesAssignment_1 )
            // InternalRecordLang.g:1822:2: rule__Templates__TemplatesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Templates__TemplatesAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getTemplatesAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group__1__Impl"


    // $ANTLR start "rule__Templates__Group__2"
    // InternalRecordLang.g:1832:1: rule__Templates__Group__2 : rule__Templates__Group__2__Impl ;
    public final void rule__Templates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1836:1: ( rule__Templates__Group__2__Impl )
            // InternalRecordLang.g:1837:2: rule__Templates__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Templates__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group__2"


    // $ANTLR start "rule__Templates__Group__2__Impl"
    // InternalRecordLang.g:1843:1: rule__Templates__Group__2__Impl : ( ( rule__Templates__Group_2__0 )* ) ;
    public final void rule__Templates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1847:1: ( ( ( rule__Templates__Group_2__0 )* ) )
            // InternalRecordLang.g:1848:1: ( ( rule__Templates__Group_2__0 )* )
            {
            // InternalRecordLang.g:1848:1: ( ( rule__Templates__Group_2__0 )* )
            // InternalRecordLang.g:1849:1: ( rule__Templates__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getGroup_2()); 
            }
            // InternalRecordLang.g:1850:1: ( rule__Templates__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==24) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRecordLang.g:1850:2: rule__Templates__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Templates__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group__2__Impl"


    // $ANTLR start "rule__Templates__Group_2__0"
    // InternalRecordLang.g:1866:1: rule__Templates__Group_2__0 : rule__Templates__Group_2__0__Impl rule__Templates__Group_2__1 ;
    public final void rule__Templates__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1870:1: ( rule__Templates__Group_2__0__Impl rule__Templates__Group_2__1 )
            // InternalRecordLang.g:1871:2: rule__Templates__Group_2__0__Impl rule__Templates__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__Templates__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Templates__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group_2__0"


    // $ANTLR start "rule__Templates__Group_2__0__Impl"
    // InternalRecordLang.g:1878:1: rule__Templates__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Templates__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1882:1: ( ( ',' ) )
            // InternalRecordLang.g:1883:1: ( ',' )
            {
            // InternalRecordLang.g:1883:1: ( ',' )
            // InternalRecordLang.g:1884:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getCommaKeyword_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getCommaKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group_2__0__Impl"


    // $ANTLR start "rule__Templates__Group_2__1"
    // InternalRecordLang.g:1897:1: rule__Templates__Group_2__1 : rule__Templates__Group_2__1__Impl ;
    public final void rule__Templates__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1901:1: ( rule__Templates__Group_2__1__Impl )
            // InternalRecordLang.g:1902:2: rule__Templates__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Templates__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group_2__1"


    // $ANTLR start "rule__Templates__Group_2__1__Impl"
    // InternalRecordLang.g:1908:1: rule__Templates__Group_2__1__Impl : ( ( rule__Templates__TemplatesAssignment_2_1 ) ) ;
    public final void rule__Templates__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1912:1: ( ( ( rule__Templates__TemplatesAssignment_2_1 ) ) )
            // InternalRecordLang.g:1913:1: ( ( rule__Templates__TemplatesAssignment_2_1 ) )
            {
            // InternalRecordLang.g:1913:1: ( ( rule__Templates__TemplatesAssignment_2_1 ) )
            // InternalRecordLang.g:1914:1: ( rule__Templates__TemplatesAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getTemplatesAssignment_2_1()); 
            }
            // InternalRecordLang.g:1915:1: ( rule__Templates__TemplatesAssignment_2_1 )
            // InternalRecordLang.g:1915:2: rule__Templates__TemplatesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Templates__TemplatesAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getTemplatesAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__Group_2__1__Impl"


    // $ANTLR start "rule__RootType__Group__0"
    // InternalRecordLang.g:1929:1: rule__RootType__Group__0 : rule__RootType__Group__0__Impl rule__RootType__Group__1 ;
    public final void rule__RootType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1933:1: ( rule__RootType__Group__0__Impl rule__RootType__Group__1 )
            // InternalRecordLang.g:1934:2: rule__RootType__Group__0__Impl rule__RootType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RootType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__RootType__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__0"


    // $ANTLR start "rule__RootType__Group__0__Impl"
    // InternalRecordLang.g:1941:1: rule__RootType__Group__0__Impl : ( 'root' ) ;
    public final void rule__RootType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1945:1: ( ( 'root' ) )
            // InternalRecordLang.g:1946:1: ( 'root' )
            {
            // InternalRecordLang.g:1946:1: ( 'root' )
            // InternalRecordLang.g:1947:1: 'root'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootTypeAccess().getRootKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootTypeAccess().getRootKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__0__Impl"


    // $ANTLR start "rule__RootType__Group__1"
    // InternalRecordLang.g:1960:1: rule__RootType__Group__1 : rule__RootType__Group__1__Impl ;
    public final void rule__RootType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1964:1: ( rule__RootType__Group__1__Impl )
            // InternalRecordLang.g:1965:2: rule__RootType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RootType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__1"


    // $ANTLR start "rule__RootType__Group__1__Impl"
    // InternalRecordLang.g:1971:1: rule__RootType__Group__1__Impl : ( ( rule__RootType__RecordAssignment_1 ) ) ;
    public final void rule__RootType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1975:1: ( ( ( rule__RootType__RecordAssignment_1 ) ) )
            // InternalRecordLang.g:1976:1: ( ( rule__RootType__RecordAssignment_1 ) )
            {
            // InternalRecordLang.g:1976:1: ( ( rule__RootType__RecordAssignment_1 ) )
            // InternalRecordLang.g:1977:1: ( rule__RootType__RecordAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootTypeAccess().getRecordAssignment_1()); 
            }
            // InternalRecordLang.g:1978:1: ( rule__RootType__RecordAssignment_1 )
            // InternalRecordLang.g:1978:2: rule__RootType__RecordAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RootType__RecordAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootTypeAccess().getRecordAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__Group__1__Impl"


    // $ANTLR start "rule__TemplateType__Group__0"
    // InternalRecordLang.g:1992:1: rule__TemplateType__Group__0 : rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1 ;
    public final void rule__TemplateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1996:1: ( rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1 )
            // InternalRecordLang.g:1997:2: rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__TemplateType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2004:1: rule__TemplateType__Group__0__Impl : ( ( rule__TemplateType__Group_0__0 )? ) ;
    public final void rule__TemplateType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2008:1: ( ( ( rule__TemplateType__Group_0__0 )? ) )
            // InternalRecordLang.g:2009:1: ( ( rule__TemplateType__Group_0__0 )? )
            {
            // InternalRecordLang.g:2009:1: ( ( rule__TemplateType__Group_0__0 )? )
            // InternalRecordLang.g:2010:1: ( rule__TemplateType__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_0()); 
            }
            // InternalRecordLang.g:2011:1: ( rule__TemplateType__Group_0__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRecordLang.g:2011:2: rule__TemplateType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2021:1: rule__TemplateType__Group__1 : rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2 ;
    public final void rule__TemplateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2025:1: ( rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2 )
            // InternalRecordLang.g:2026:2: rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__TemplateType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2033:1: rule__TemplateType__Group__1__Impl : ( ( rule__TemplateType__Group_1__0 )? ) ;
    public final void rule__TemplateType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2037:1: ( ( ( rule__TemplateType__Group_1__0 )? ) )
            // InternalRecordLang.g:2038:1: ( ( rule__TemplateType__Group_1__0 )? )
            {
            // InternalRecordLang.g:2038:1: ( ( rule__TemplateType__Group_1__0 )? )
            // InternalRecordLang.g:2039:1: ( rule__TemplateType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:2040:1: ( rule__TemplateType__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRecordLang.g:2040:2: rule__TemplateType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2050:1: rule__TemplateType__Group__2 : rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3 ;
    public final void rule__TemplateType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2054:1: ( rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3 )
            // InternalRecordLang.g:2055:2: rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__TemplateType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2062:1: rule__TemplateType__Group__2__Impl : ( 'template' ) ;
    public final void rule__TemplateType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2066:1: ( ( 'template' ) )
            // InternalRecordLang.g:2067:1: ( 'template' )
            {
            // InternalRecordLang.g:2067:1: ( 'template' )
            // InternalRecordLang.g:2068:1: 'template'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getTemplateKeyword_2()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2081:1: rule__TemplateType__Group__3 : rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4 ;
    public final void rule__TemplateType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2085:1: ( rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4 )
            // InternalRecordLang.g:2086:2: rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__TemplateType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2093:1: rule__TemplateType__Group__3__Impl : ( ( rule__TemplateType__NameAssignment_3 ) ) ;
    public final void rule__TemplateType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2097:1: ( ( ( rule__TemplateType__NameAssignment_3 ) ) )
            // InternalRecordLang.g:2098:1: ( ( rule__TemplateType__NameAssignment_3 ) )
            {
            // InternalRecordLang.g:2098:1: ( ( rule__TemplateType__NameAssignment_3 ) )
            // InternalRecordLang.g:2099:1: ( rule__TemplateType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getNameAssignment_3()); 
            }
            // InternalRecordLang.g:2100:1: ( rule__TemplateType__NameAssignment_3 )
            // InternalRecordLang.g:2100:2: rule__TemplateType__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2110:1: rule__TemplateType__Group__4 : rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5 ;
    public final void rule__TemplateType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2114:1: ( rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5 )
            // InternalRecordLang.g:2115:2: rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__TemplateType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2122:1: rule__TemplateType__Group__4__Impl : ( ( rule__TemplateType__Group_4__0 )? ) ;
    public final void rule__TemplateType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2126:1: ( ( ( rule__TemplateType__Group_4__0 )? ) )
            // InternalRecordLang.g:2127:1: ( ( rule__TemplateType__Group_4__0 )? )
            {
            // InternalRecordLang.g:2127:1: ( ( rule__TemplateType__Group_4__0 )? )
            // InternalRecordLang.g:2128:1: ( rule__TemplateType__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_4()); 
            }
            // InternalRecordLang.g:2129:1: ( rule__TemplateType__Group_4__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRecordLang.g:2129:2: rule__TemplateType__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2139:1: rule__TemplateType__Group__5 : rule__TemplateType__Group__5__Impl ;
    public final void rule__TemplateType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2143:1: ( rule__TemplateType__Group__5__Impl )
            // InternalRecordLang.g:2144:2: rule__TemplateType__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2150:1: rule__TemplateType__Group__5__Impl : ( ( rule__TemplateType__Group_5__0 )? ) ;
    public final void rule__TemplateType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2154:1: ( ( ( rule__TemplateType__Group_5__0 )? ) )
            // InternalRecordLang.g:2155:1: ( ( rule__TemplateType__Group_5__0 )? )
            {
            // InternalRecordLang.g:2155:1: ( ( rule__TemplateType__Group_5__0 )? )
            // InternalRecordLang.g:2156:1: ( rule__TemplateType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_5()); 
            }
            // InternalRecordLang.g:2157:1: ( rule__TemplateType__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRecordLang.g:2157:2: rule__TemplateType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2179:1: rule__TemplateType__Group_0__0 : rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1 ;
    public final void rule__TemplateType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2183:1: ( rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1 )
            // InternalRecordLang.g:2184:2: rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__TemplateType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2191:1: rule__TemplateType__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__TemplateType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2195:1: ( ( '@author' ) )
            // InternalRecordLang.g:2196:1: ( '@author' )
            {
            // InternalRecordLang.g:2196:1: ( '@author' )
            // InternalRecordLang.g:2197:1: '@author'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAuthorKeyword_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2210:1: rule__TemplateType__Group_0__1 : rule__TemplateType__Group_0__1__Impl ;
    public final void rule__TemplateType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2214:1: ( rule__TemplateType__Group_0__1__Impl )
            // InternalRecordLang.g:2215:2: rule__TemplateType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2221:1: rule__TemplateType__Group_0__1__Impl : ( ( rule__TemplateType__AuthorAssignment_0_1 ) ) ;
    public final void rule__TemplateType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2225:1: ( ( ( rule__TemplateType__AuthorAssignment_0_1 ) ) )
            // InternalRecordLang.g:2226:1: ( ( rule__TemplateType__AuthorAssignment_0_1 ) )
            {
            // InternalRecordLang.g:2226:1: ( ( rule__TemplateType__AuthorAssignment_0_1 ) )
            // InternalRecordLang.g:2227:1: ( rule__TemplateType__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAuthorAssignment_0_1()); 
            }
            // InternalRecordLang.g:2228:1: ( rule__TemplateType__AuthorAssignment_0_1 )
            // InternalRecordLang.g:2228:2: rule__TemplateType__AuthorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2242:1: rule__TemplateType__Group_1__0 : rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1 ;
    public final void rule__TemplateType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2246:1: ( rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1 )
            // InternalRecordLang.g:2247:2: rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__TemplateType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2254:1: rule__TemplateType__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__TemplateType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2258:1: ( ( '@since' ) )
            // InternalRecordLang.g:2259:1: ( '@since' )
            {
            // InternalRecordLang.g:2259:1: ( '@since' )
            // InternalRecordLang.g:2260:1: '@since'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getSinceKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2273:1: rule__TemplateType__Group_1__1 : rule__TemplateType__Group_1__1__Impl ;
    public final void rule__TemplateType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2277:1: ( rule__TemplateType__Group_1__1__Impl )
            // InternalRecordLang.g:2278:2: rule__TemplateType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2284:1: rule__TemplateType__Group_1__1__Impl : ( ( rule__TemplateType__SinceAssignment_1_1 ) ) ;
    public final void rule__TemplateType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2288:1: ( ( ( rule__TemplateType__SinceAssignment_1_1 ) ) )
            // InternalRecordLang.g:2289:1: ( ( rule__TemplateType__SinceAssignment_1_1 ) )
            {
            // InternalRecordLang.g:2289:1: ( ( rule__TemplateType__SinceAssignment_1_1 ) )
            // InternalRecordLang.g:2290:1: ( rule__TemplateType__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getSinceAssignment_1_1()); 
            }
            // InternalRecordLang.g:2291:1: ( rule__TemplateType__SinceAssignment_1_1 )
            // InternalRecordLang.g:2291:2: rule__TemplateType__SinceAssignment_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2305:1: rule__TemplateType__Group_4__0 : rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1 ;
    public final void rule__TemplateType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2309:1: ( rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1 )
            // InternalRecordLang.g:2310:2: rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__TemplateType__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2317:1: rule__TemplateType__Group_4__0__Impl : ( ':' ) ;
    public final void rule__TemplateType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2321:1: ( ( ':' ) )
            // InternalRecordLang.g:2322:1: ( ':' )
            {
            // InternalRecordLang.g:2322:1: ( ':' )
            // InternalRecordLang.g:2323:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getColonKeyword_4_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2336:1: rule__TemplateType__Group_4__1 : rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2 ;
    public final void rule__TemplateType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2340:1: ( rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2 )
            // InternalRecordLang.g:2341:2: rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__TemplateType__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2348:1: rule__TemplateType__Group_4__1__Impl : ( ( rule__TemplateType__ParentsAssignment_4_1 ) ) ;
    public final void rule__TemplateType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2352:1: ( ( ( rule__TemplateType__ParentsAssignment_4_1 ) ) )
            // InternalRecordLang.g:2353:1: ( ( rule__TemplateType__ParentsAssignment_4_1 ) )
            {
            // InternalRecordLang.g:2353:1: ( ( rule__TemplateType__ParentsAssignment_4_1 ) )
            // InternalRecordLang.g:2354:1: ( rule__TemplateType__ParentsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsAssignment_4_1()); 
            }
            // InternalRecordLang.g:2355:1: ( rule__TemplateType__ParentsAssignment_4_1 )
            // InternalRecordLang.g:2355:2: rule__TemplateType__ParentsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2365:1: rule__TemplateType__Group_4__2 : rule__TemplateType__Group_4__2__Impl ;
    public final void rule__TemplateType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2369:1: ( rule__TemplateType__Group_4__2__Impl )
            // InternalRecordLang.g:2370:2: rule__TemplateType__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2376:1: rule__TemplateType__Group_4__2__Impl : ( ( rule__TemplateType__Group_4_2__0 )* ) ;
    public final void rule__TemplateType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2380:1: ( ( ( rule__TemplateType__Group_4_2__0 )* ) )
            // InternalRecordLang.g:2381:1: ( ( rule__TemplateType__Group_4_2__0 )* )
            {
            // InternalRecordLang.g:2381:1: ( ( rule__TemplateType__Group_4_2__0 )* )
            // InternalRecordLang.g:2382:1: ( rule__TemplateType__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_4_2()); 
            }
            // InternalRecordLang.g:2383:1: ( rule__TemplateType__Group_4_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==24) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRecordLang.g:2383:2: rule__TemplateType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__TemplateType__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalRecordLang.g:2399:1: rule__TemplateType__Group_4_2__0 : rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1 ;
    public final void rule__TemplateType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2403:1: ( rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1 )
            // InternalRecordLang.g:2404:2: rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__TemplateType__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2411:1: rule__TemplateType__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TemplateType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2415:1: ( ( ',' ) )
            // InternalRecordLang.g:2416:1: ( ',' )
            {
            // InternalRecordLang.g:2416:1: ( ',' )
            // InternalRecordLang.g:2417:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2430:1: rule__TemplateType__Group_4_2__1 : rule__TemplateType__Group_4_2__1__Impl ;
    public final void rule__TemplateType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2434:1: ( rule__TemplateType__Group_4_2__1__Impl )
            // InternalRecordLang.g:2435:2: rule__TemplateType__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2441:1: rule__TemplateType__Group_4_2__1__Impl : ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) ) ;
    public final void rule__TemplateType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2445:1: ( ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) ) )
            // InternalRecordLang.g:2446:1: ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) )
            {
            // InternalRecordLang.g:2446:1: ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) )
            // InternalRecordLang.g:2447:1: ( rule__TemplateType__ParentsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsAssignment_4_2_1()); 
            }
            // InternalRecordLang.g:2448:1: ( rule__TemplateType__ParentsAssignment_4_2_1 )
            // InternalRecordLang.g:2448:2: rule__TemplateType__ParentsAssignment_4_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2462:1: rule__TemplateType__Group_5__0 : rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1 ;
    public final void rule__TemplateType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2466:1: ( rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1 )
            // InternalRecordLang.g:2467:2: rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1
            {
            pushFollow(FOLLOW_12);
            rule__TemplateType__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2474:1: rule__TemplateType__Group_5__0__Impl : ( '{' ) ;
    public final void rule__TemplateType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2478:1: ( ( '{' ) )
            // InternalRecordLang.g:2479:1: ( '{' )
            {
            // InternalRecordLang.g:2479:1: ( '{' )
            // InternalRecordLang.g:2480:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2493:1: rule__TemplateType__Group_5__1 : rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2 ;
    public final void rule__TemplateType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2497:1: ( rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2 )
            // InternalRecordLang.g:2498:2: rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__TemplateType__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2505:1: rule__TemplateType__Group_5__1__Impl : ( ( rule__TemplateType__Alternatives_5_1 )* ) ;
    public final void rule__TemplateType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2509:1: ( ( ( rule__TemplateType__Alternatives_5_1 )* ) )
            // InternalRecordLang.g:2510:1: ( ( rule__TemplateType__Alternatives_5_1 )* )
            {
            // InternalRecordLang.g:2510:1: ( ( rule__TemplateType__Alternatives_5_1 )* )
            // InternalRecordLang.g:2511:1: ( rule__TemplateType__Alternatives_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAlternatives_5_1()); 
            }
            // InternalRecordLang.g:2512:1: ( rule__TemplateType__Alternatives_5_1 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID||(LA23_0>=14 && LA23_0<=15)||LA23_0==30||LA23_0==32||LA23_0==34) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRecordLang.g:2512:2: rule__TemplateType__Alternatives_5_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__TemplateType__Alternatives_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalRecordLang.g:2522:1: rule__TemplateType__Group_5__2 : rule__TemplateType__Group_5__2__Impl ;
    public final void rule__TemplateType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2526:1: ( rule__TemplateType__Group_5__2__Impl )
            // InternalRecordLang.g:2527:2: rule__TemplateType__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2533:1: rule__TemplateType__Group_5__2__Impl : ( '}' ) ;
    public final void rule__TemplateType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2537:1: ( ( '}' ) )
            // InternalRecordLang.g:2538:1: ( '}' )
            {
            // InternalRecordLang.g:2538:1: ( '}' )
            // InternalRecordLang.g:2539:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getRightCurlyBracketKeyword_5_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2558:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2562:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // InternalRecordLang.g:2563:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__RecordType__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2570:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__Group_0__0 )? ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2574:1: ( ( ( rule__RecordType__Group_0__0 )? ) )
            // InternalRecordLang.g:2575:1: ( ( rule__RecordType__Group_0__0 )? )
            {
            // InternalRecordLang.g:2575:1: ( ( rule__RecordType__Group_0__0 )? )
            // InternalRecordLang.g:2576:1: ( rule__RecordType__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_0()); 
            }
            // InternalRecordLang.g:2577:1: ( rule__RecordType__Group_0__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==19) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRecordLang.g:2577:2: rule__RecordType__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2587:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2591:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // InternalRecordLang.g:2592:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RecordType__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2599:1: rule__RecordType__Group__1__Impl : ( ( rule__RecordType__Group_1__0 )? ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2603:1: ( ( ( rule__RecordType__Group_1__0 )? ) )
            // InternalRecordLang.g:2604:1: ( ( rule__RecordType__Group_1__0 )? )
            {
            // InternalRecordLang.g:2604:1: ( ( rule__RecordType__Group_1__0 )? )
            // InternalRecordLang.g:2605:1: ( rule__RecordType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:2606:1: ( rule__RecordType__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRecordLang.g:2606:2: rule__RecordType__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2616:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2620:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // InternalRecordLang.g:2621:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__RecordType__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2628:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__AbstractAssignment_2 )? ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2632:1: ( ( ( rule__RecordType__AbstractAssignment_2 )? ) )
            // InternalRecordLang.g:2633:1: ( ( rule__RecordType__AbstractAssignment_2 )? )
            {
            // InternalRecordLang.g:2633:1: ( ( rule__RecordType__AbstractAssignment_2 )? )
            // InternalRecordLang.g:2634:1: ( rule__RecordType__AbstractAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAssignment_2()); 
            }
            // InternalRecordLang.g:2635:1: ( rule__RecordType__AbstractAssignment_2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRecordLang.g:2635:2: rule__RecordType__AbstractAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2645:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2649:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // InternalRecordLang.g:2650:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__RecordType__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2657:1: rule__RecordType__Group__3__Impl : ( 'entity' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2661:1: ( ( 'entity' ) )
            // InternalRecordLang.g:2662:1: ( 'entity' )
            {
            // InternalRecordLang.g:2662:1: ( 'entity' )
            // InternalRecordLang.g:2663:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getEntityKeyword_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2676:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2680:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // InternalRecordLang.g:2681:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__RecordType__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2688:1: rule__RecordType__Group__4__Impl : ( ( rule__RecordType__NameAssignment_4 ) ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2692:1: ( ( ( rule__RecordType__NameAssignment_4 ) ) )
            // InternalRecordLang.g:2693:1: ( ( rule__RecordType__NameAssignment_4 ) )
            {
            // InternalRecordLang.g:2693:1: ( ( rule__RecordType__NameAssignment_4 ) )
            // InternalRecordLang.g:2694:1: ( rule__RecordType__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameAssignment_4()); 
            }
            // InternalRecordLang.g:2695:1: ( rule__RecordType__NameAssignment_4 )
            // InternalRecordLang.g:2695:2: rule__RecordType__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2705:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2709:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // InternalRecordLang.g:2710:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__RecordType__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2717:1: rule__RecordType__Group__5__Impl : ( ( rule__RecordType__Group_5__0 )? ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2721:1: ( ( ( rule__RecordType__Group_5__0 )? ) )
            // InternalRecordLang.g:2722:1: ( ( rule__RecordType__Group_5__0 )? )
            {
            // InternalRecordLang.g:2722:1: ( ( rule__RecordType__Group_5__0 )? )
            // InternalRecordLang.g:2723:1: ( rule__RecordType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_5()); 
            }
            // InternalRecordLang.g:2724:1: ( rule__RecordType__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==29) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRecordLang.g:2724:2: rule__RecordType__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2734:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2738:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // InternalRecordLang.g:2739:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__RecordType__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2746:1: rule__RecordType__Group__6__Impl : ( ( rule__RecordType__Group_6__0 )? ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2750:1: ( ( ( rule__RecordType__Group_6__0 )? ) )
            // InternalRecordLang.g:2751:1: ( ( rule__RecordType__Group_6__0 )? )
            {
            // InternalRecordLang.g:2751:1: ( ( rule__RecordType__Group_6__0 )? )
            // InternalRecordLang.g:2752:1: ( rule__RecordType__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_6()); 
            }
            // InternalRecordLang.g:2753:1: ( rule__RecordType__Group_6__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==23) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRecordLang.g:2753:2: rule__RecordType__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2763:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2767:1: ( rule__RecordType__Group__7__Impl )
            // InternalRecordLang.g:2768:2: rule__RecordType__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2774:1: rule__RecordType__Group__7__Impl : ( ( rule__RecordType__Group_7__0 )? ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2778:1: ( ( ( rule__RecordType__Group_7__0 )? ) )
            // InternalRecordLang.g:2779:1: ( ( rule__RecordType__Group_7__0 )? )
            {
            // InternalRecordLang.g:2779:1: ( ( rule__RecordType__Group_7__0 )? )
            // InternalRecordLang.g:2780:1: ( rule__RecordType__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_7()); 
            }
            // InternalRecordLang.g:2781:1: ( rule__RecordType__Group_7__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRecordLang.g:2781:2: rule__RecordType__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2807:1: rule__RecordType__Group_0__0 : rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1 ;
    public final void rule__RecordType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2811:1: ( rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1 )
            // InternalRecordLang.g:2812:2: rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1
            {
            pushFollow(FOLLOW_11);
            rule__RecordType__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2819:1: rule__RecordType__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__RecordType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2823:1: ( ( '@author' ) )
            // InternalRecordLang.g:2824:1: ( '@author' )
            {
            // InternalRecordLang.g:2824:1: ( '@author' )
            // InternalRecordLang.g:2825:1: '@author'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorKeyword_0_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2838:1: rule__RecordType__Group_0__1 : rule__RecordType__Group_0__1__Impl ;
    public final void rule__RecordType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2842:1: ( rule__RecordType__Group_0__1__Impl )
            // InternalRecordLang.g:2843:2: rule__RecordType__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2849:1: rule__RecordType__Group_0__1__Impl : ( ( rule__RecordType__AuthorAssignment_0_1 ) ) ;
    public final void rule__RecordType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2853:1: ( ( ( rule__RecordType__AuthorAssignment_0_1 ) ) )
            // InternalRecordLang.g:2854:1: ( ( rule__RecordType__AuthorAssignment_0_1 ) )
            {
            // InternalRecordLang.g:2854:1: ( ( rule__RecordType__AuthorAssignment_0_1 ) )
            // InternalRecordLang.g:2855:1: ( rule__RecordType__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorAssignment_0_1()); 
            }
            // InternalRecordLang.g:2856:1: ( rule__RecordType__AuthorAssignment_0_1 )
            // InternalRecordLang.g:2856:2: rule__RecordType__AuthorAssignment_0_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2870:1: rule__RecordType__Group_1__0 : rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1 ;
    public final void rule__RecordType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2874:1: ( rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1 )
            // InternalRecordLang.g:2875:2: rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__RecordType__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2882:1: rule__RecordType__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__RecordType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2886:1: ( ( '@since' ) )
            // InternalRecordLang.g:2887:1: ( '@since' )
            {
            // InternalRecordLang.g:2887:1: ( '@since' )
            // InternalRecordLang.g:2888:1: '@since'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceKeyword_1_0()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2901:1: rule__RecordType__Group_1__1 : rule__RecordType__Group_1__1__Impl ;
    public final void rule__RecordType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2905:1: ( rule__RecordType__Group_1__1__Impl )
            // InternalRecordLang.g:2906:2: rule__RecordType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2912:1: rule__RecordType__Group_1__1__Impl : ( ( rule__RecordType__SinceAssignment_1_1 ) ) ;
    public final void rule__RecordType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2916:1: ( ( ( rule__RecordType__SinceAssignment_1_1 ) ) )
            // InternalRecordLang.g:2917:1: ( ( rule__RecordType__SinceAssignment_1_1 ) )
            {
            // InternalRecordLang.g:2917:1: ( ( rule__RecordType__SinceAssignment_1_1 ) )
            // InternalRecordLang.g:2918:1: ( rule__RecordType__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceAssignment_1_1()); 
            }
            // InternalRecordLang.g:2919:1: ( rule__RecordType__SinceAssignment_1_1 )
            // InternalRecordLang.g:2919:2: rule__RecordType__SinceAssignment_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2933:1: rule__RecordType__Group_5__0 : rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 ;
    public final void rule__RecordType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2937:1: ( rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 )
            // InternalRecordLang.g:2938:2: rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__RecordType__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2945:1: rule__RecordType__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__RecordType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2949:1: ( ( 'extends' ) )
            // InternalRecordLang.g:2950:1: ( 'extends' )
            {
            // InternalRecordLang.g:2950:1: ( 'extends' )
            // InternalRecordLang.g:2951:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getExtendsKeyword_5_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2964:1: rule__RecordType__Group_5__1 : rule__RecordType__Group_5__1__Impl ;
    public final void rule__RecordType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2968:1: ( rule__RecordType__Group_5__1__Impl )
            // InternalRecordLang.g:2969:2: rule__RecordType__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2975:1: rule__RecordType__Group_5__1__Impl : ( ( rule__RecordType__ParentAssignment_5_1 ) ) ;
    public final void rule__RecordType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2979:1: ( ( ( rule__RecordType__ParentAssignment_5_1 ) ) )
            // InternalRecordLang.g:2980:1: ( ( rule__RecordType__ParentAssignment_5_1 ) )
            {
            // InternalRecordLang.g:2980:1: ( ( rule__RecordType__ParentAssignment_5_1 ) )
            // InternalRecordLang.g:2981:1: ( rule__RecordType__ParentAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentAssignment_5_1()); 
            }
            // InternalRecordLang.g:2982:1: ( rule__RecordType__ParentAssignment_5_1 )
            // InternalRecordLang.g:2982:2: rule__RecordType__ParentAssignment_5_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:2996:1: rule__RecordType__Group_6__0 : rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1 ;
    public final void rule__RecordType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3000:1: ( rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1 )
            // InternalRecordLang.g:3001:2: rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__RecordType__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3008:1: rule__RecordType__Group_6__0__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3012:1: ( ( ':' ) )
            // InternalRecordLang.g:3013:1: ( ':' )
            {
            // InternalRecordLang.g:3013:1: ( ':' )
            // InternalRecordLang.g:3014:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getColonKeyword_6_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3027:1: rule__RecordType__Group_6__1 : rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2 ;
    public final void rule__RecordType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3031:1: ( rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2 )
            // InternalRecordLang.g:3032:2: rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2
            {
            pushFollow(FOLLOW_14);
            rule__RecordType__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3039:1: rule__RecordType__Group_6__1__Impl : ( ( rule__RecordType__ParentsAssignment_6_1 ) ) ;
    public final void rule__RecordType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3043:1: ( ( ( rule__RecordType__ParentsAssignment_6_1 ) ) )
            // InternalRecordLang.g:3044:1: ( ( rule__RecordType__ParentsAssignment_6_1 ) )
            {
            // InternalRecordLang.g:3044:1: ( ( rule__RecordType__ParentsAssignment_6_1 ) )
            // InternalRecordLang.g:3045:1: ( rule__RecordType__ParentsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_1()); 
            }
            // InternalRecordLang.g:3046:1: ( rule__RecordType__ParentsAssignment_6_1 )
            // InternalRecordLang.g:3046:2: rule__RecordType__ParentsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3056:1: rule__RecordType__Group_6__2 : rule__RecordType__Group_6__2__Impl ;
    public final void rule__RecordType__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3060:1: ( rule__RecordType__Group_6__2__Impl )
            // InternalRecordLang.g:3061:2: rule__RecordType__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3067:1: rule__RecordType__Group_6__2__Impl : ( ( rule__RecordType__Group_6_2__0 )* ) ;
    public final void rule__RecordType__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3071:1: ( ( ( rule__RecordType__Group_6_2__0 )* ) )
            // InternalRecordLang.g:3072:1: ( ( rule__RecordType__Group_6_2__0 )* )
            {
            // InternalRecordLang.g:3072:1: ( ( rule__RecordType__Group_6_2__0 )* )
            // InternalRecordLang.g:3073:1: ( rule__RecordType__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_6_2()); 
            }
            // InternalRecordLang.g:3074:1: ( rule__RecordType__Group_6_2__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==24) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalRecordLang.g:3074:2: rule__RecordType__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__RecordType__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalRecordLang.g:3090:1: rule__RecordType__Group_6_2__0 : rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1 ;
    public final void rule__RecordType__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3094:1: ( rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1 )
            // InternalRecordLang.g:3095:2: rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1
            {
            pushFollow(FOLLOW_3);
            rule__RecordType__Group_6_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3102:1: rule__RecordType__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3106:1: ( ( ',' ) )
            // InternalRecordLang.g:3107:1: ( ',' )
            {
            // InternalRecordLang.g:3107:1: ( ',' )
            // InternalRecordLang.g:3108:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3121:1: rule__RecordType__Group_6_2__1 : rule__RecordType__Group_6_2__1__Impl ;
    public final void rule__RecordType__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3125:1: ( rule__RecordType__Group_6_2__1__Impl )
            // InternalRecordLang.g:3126:2: rule__RecordType__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3132:1: rule__RecordType__Group_6_2__1__Impl : ( ( rule__RecordType__ParentsAssignment_6_2_1 ) ) ;
    public final void rule__RecordType__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3136:1: ( ( ( rule__RecordType__ParentsAssignment_6_2_1 ) ) )
            // InternalRecordLang.g:3137:1: ( ( rule__RecordType__ParentsAssignment_6_2_1 ) )
            {
            // InternalRecordLang.g:3137:1: ( ( rule__RecordType__ParentsAssignment_6_2_1 ) )
            // InternalRecordLang.g:3138:1: ( rule__RecordType__ParentsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_2_1()); 
            }
            // InternalRecordLang.g:3139:1: ( rule__RecordType__ParentsAssignment_6_2_1 )
            // InternalRecordLang.g:3139:2: rule__RecordType__ParentsAssignment_6_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3153:1: rule__RecordType__Group_7__0 : rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 ;
    public final void rule__RecordType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3157:1: ( rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 )
            // InternalRecordLang.g:3158:2: rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__RecordType__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3165:1: rule__RecordType__Group_7__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3169:1: ( ( '{' ) )
            // InternalRecordLang.g:3170:1: ( '{' )
            {
            // InternalRecordLang.g:3170:1: ( '{' )
            // InternalRecordLang.g:3171:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_7_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3184:1: rule__RecordType__Group_7__1 : rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2 ;
    public final void rule__RecordType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3188:1: ( rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2 )
            // InternalRecordLang.g:3189:2: rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__RecordType__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3196:1: rule__RecordType__Group_7__1__Impl : ( ( rule__RecordType__Alternatives_7_1 )* ) ;
    public final void rule__RecordType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3200:1: ( ( ( rule__RecordType__Alternatives_7_1 )* ) )
            // InternalRecordLang.g:3201:1: ( ( rule__RecordType__Alternatives_7_1 )* )
            {
            // InternalRecordLang.g:3201:1: ( ( rule__RecordType__Alternatives_7_1 )* )
            // InternalRecordLang.g:3202:1: ( rule__RecordType__Alternatives_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAlternatives_7_1()); 
            }
            // InternalRecordLang.g:3203:1: ( rule__RecordType__Alternatives_7_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_ID||(LA31_0>=14 && LA31_0<=15)||LA31_0==30||LA31_0==32||LA31_0==34) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRecordLang.g:3203:2: rule__RecordType__Alternatives_7_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RecordType__Alternatives_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalRecordLang.g:3213:1: rule__RecordType__Group_7__2 : rule__RecordType__Group_7__2__Impl ;
    public final void rule__RecordType__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3217:1: ( rule__RecordType__Group_7__2__Impl )
            // InternalRecordLang.g:3218:2: rule__RecordType__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3224:1: rule__RecordType__Group_7__2__Impl : ( '}' ) ;
    public final void rule__RecordType__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3228:1: ( ( '}' ) )
            // InternalRecordLang.g:3229:1: ( '}' )
            {
            // InternalRecordLang.g:3229:1: ( '}' )
            // InternalRecordLang.g:3230:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7_2()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3249:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3253:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalRecordLang.g:3254:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Constant__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3261:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3265:1: ( ( 'const' ) )
            // InternalRecordLang.g:3266:1: ( 'const' )
            {
            // InternalRecordLang.g:3266:1: ( 'const' )
            // InternalRecordLang.g:3267:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3280:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3284:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalRecordLang.g:3285:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Constant__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3292:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__TypeAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3296:1: ( ( ( rule__Constant__TypeAssignment_1 ) ) )
            // InternalRecordLang.g:3297:1: ( ( rule__Constant__TypeAssignment_1 ) )
            {
            // InternalRecordLang.g:3297:1: ( ( rule__Constant__TypeAssignment_1 ) )
            // InternalRecordLang.g:3298:1: ( rule__Constant__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_1()); 
            }
            // InternalRecordLang.g:3299:1: ( rule__Constant__TypeAssignment_1 )
            // InternalRecordLang.g:3299:2: rule__Constant__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3309:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3313:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalRecordLang.g:3314:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__Constant__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3321:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3325:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // InternalRecordLang.g:3326:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // InternalRecordLang.g:3326:1: ( ( rule__Constant__NameAssignment_2 ) )
            // InternalRecordLang.g:3327:1: ( rule__Constant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            }
            // InternalRecordLang.g:3328:1: ( rule__Constant__NameAssignment_2 )
            // InternalRecordLang.g:3328:2: rule__Constant__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3338:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3342:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // InternalRecordLang.g:3343:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__Constant__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3350:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3354:1: ( ( '=' ) )
            // InternalRecordLang.g:3355:1: ( '=' )
            {
            // InternalRecordLang.g:3355:1: ( '=' )
            // InternalRecordLang.g:3356:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3369:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3373:1: ( rule__Constant__Group__4__Impl )
            // InternalRecordLang.g:3374:2: rule__Constant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3380:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ValueAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3384:1: ( ( ( rule__Constant__ValueAssignment_4 ) ) )
            // InternalRecordLang.g:3385:1: ( ( rule__Constant__ValueAssignment_4 ) )
            {
            // InternalRecordLang.g:3385:1: ( ( rule__Constant__ValueAssignment_4 ) )
            // InternalRecordLang.g:3386:1: ( rule__Constant__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment_4()); 
            }
            // InternalRecordLang.g:3387:1: ( rule__Constant__ValueAssignment_4 )
            // InternalRecordLang.g:3387:2: rule__Constant__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3407:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3411:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalRecordLang.g:3412:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Property__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3419:1: rule__Property__Group__0__Impl : ( ( rule__Property__ModifiersAssignment_0 )* ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3423:1: ( ( ( rule__Property__ModifiersAssignment_0 )* ) )
            // InternalRecordLang.g:3424:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            {
            // InternalRecordLang.g:3424:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            // InternalRecordLang.g:3425:1: ( rule__Property__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getModifiersAssignment_0()); 
            }
            // InternalRecordLang.g:3426:1: ( rule__Property__ModifiersAssignment_0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=14 && LA32_0<=15)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRecordLang.g:3426:2: rule__Property__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Property__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalRecordLang.g:3436:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3440:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalRecordLang.g:3441:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__Property__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3448:1: rule__Property__Group__1__Impl : ( ( rule__Property__ForeignKeyAssignment_1 )? ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3452:1: ( ( ( rule__Property__ForeignKeyAssignment_1 )? ) )
            // InternalRecordLang.g:3453:1: ( ( rule__Property__ForeignKeyAssignment_1 )? )
            {
            // InternalRecordLang.g:3453:1: ( ( rule__Property__ForeignKeyAssignment_1 )? )
            // InternalRecordLang.g:3454:1: ( rule__Property__ForeignKeyAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getForeignKeyAssignment_1()); 
            }
            // InternalRecordLang.g:3455:1: ( rule__Property__ForeignKeyAssignment_1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==34) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalRecordLang.g:3455:2: rule__Property__ForeignKeyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3465:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3469:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalRecordLang.g:3470:2: rule__Property__Group__2__Impl rule__Property__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Property__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3477:1: rule__Property__Group__2__Impl : ( ( rule__Property__Alternatives_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3481:1: ( ( ( rule__Property__Alternatives_2 ) ) )
            // InternalRecordLang.g:3482:1: ( ( rule__Property__Alternatives_2 ) )
            {
            // InternalRecordLang.g:3482:1: ( ( rule__Property__Alternatives_2 ) )
            // InternalRecordLang.g:3483:1: ( rule__Property__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            }
            // InternalRecordLang.g:3484:1: ( rule__Property__Alternatives_2 )
            // InternalRecordLang.g:3484:2: rule__Property__Alternatives_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3494:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3498:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalRecordLang.g:3499:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__Property__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3506:1: rule__Property__Group__3__Impl : ( ( rule__Property__NameAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3510:1: ( ( ( rule__Property__NameAssignment_3 ) ) )
            // InternalRecordLang.g:3511:1: ( ( rule__Property__NameAssignment_3 ) )
            {
            // InternalRecordLang.g:3511:1: ( ( rule__Property__NameAssignment_3 ) )
            // InternalRecordLang.g:3512:1: ( rule__Property__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_3()); 
            }
            // InternalRecordLang.g:3513:1: ( rule__Property__NameAssignment_3 )
            // InternalRecordLang.g:3513:2: rule__Property__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3523:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3527:1: ( rule__Property__Group__4__Impl )
            // InternalRecordLang.g:3528:2: rule__Property__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3534:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3538:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // InternalRecordLang.g:3539:1: ( ( rule__Property__Group_4__0 )? )
            {
            // InternalRecordLang.g:3539:1: ( ( rule__Property__Group_4__0 )? )
            // InternalRecordLang.g:3540:1: ( rule__Property__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_4()); 
            }
            // InternalRecordLang.g:3541:1: ( rule__Property__Group_4__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalRecordLang.g:3541:2: rule__Property__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Property__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getGroup_4()); 
            }

            }


            }

        }
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
    // InternalRecordLang.g:3561:1: rule__Property__Group_2_1__0 : rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 ;
    public final void rule__Property__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3565:1: ( rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 )
            // InternalRecordLang.g:3566:2: rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Property__Group_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3573:1: rule__Property__Group_2_1__0__Impl : ( 'alias' ) ;
    public final void rule__Property__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3577:1: ( ( 'alias' ) )
            // InternalRecordLang.g:3578:1: ( 'alias' )
            {
            // InternalRecordLang.g:3578:1: ( 'alias' )
            // InternalRecordLang.g:3579:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAliasKeyword_2_1_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3592:1: rule__Property__Group_2_1__1 : rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2 ;
    public final void rule__Property__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3596:1: ( rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2 )
            // InternalRecordLang.g:3597:2: rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2
            {
            pushFollow(FOLLOW_23);
            rule__Property__Group_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3604:1: rule__Property__Group_2_1__1__Impl : ( ( rule__Property__ReferToAssignment_2_1_1 ) ) ;
    public final void rule__Property__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3608:1: ( ( ( rule__Property__ReferToAssignment_2_1_1 ) ) )
            // InternalRecordLang.g:3609:1: ( ( rule__Property__ReferToAssignment_2_1_1 ) )
            {
            // InternalRecordLang.g:3609:1: ( ( rule__Property__ReferToAssignment_2_1_1 ) )
            // InternalRecordLang.g:3610:1: ( rule__Property__ReferToAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToAssignment_2_1_1()); 
            }
            // InternalRecordLang.g:3611:1: ( rule__Property__ReferToAssignment_2_1_1 )
            // InternalRecordLang.g:3611:2: rule__Property__ReferToAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3621:1: rule__Property__Group_2_1__2 : rule__Property__Group_2_1__2__Impl ;
    public final void rule__Property__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3625:1: ( rule__Property__Group_2_1__2__Impl )
            // InternalRecordLang.g:3626:2: rule__Property__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3632:1: rule__Property__Group_2_1__2__Impl : ( 'as' ) ;
    public final void rule__Property__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3636:1: ( ( 'as' ) )
            // InternalRecordLang.g:3637:1: ( 'as' )
            {
            // InternalRecordLang.g:3637:1: ( 'as' )
            // InternalRecordLang.g:3638:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAsKeyword_2_1_2()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Property__Group_4__0"
    // InternalRecordLang.g:3657:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3661:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // InternalRecordLang.g:3662:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__Property__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Property__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0"


    // $ANTLR start "rule__Property__Group_4__0__Impl"
    // InternalRecordLang.g:3669:1: rule__Property__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3673:1: ( ( '=' ) )
            // InternalRecordLang.g:3674:1: ( '=' )
            {
            // InternalRecordLang.g:3674:1: ( '=' )
            // InternalRecordLang.g:3675:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__0__Impl"


    // $ANTLR start "rule__Property__Group_4__1"
    // InternalRecordLang.g:3688:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3692:1: ( rule__Property__Group_4__1__Impl )
            // InternalRecordLang.g:3693:2: rule__Property__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Property__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1"


    // $ANTLR start "rule__Property__Group_4__1__Impl"
    // InternalRecordLang.g:3699:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__ValueAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3703:1: ( ( ( rule__Property__ValueAssignment_4_1 ) ) )
            // InternalRecordLang.g:3704:1: ( ( rule__Property__ValueAssignment_4_1 ) )
            {
            // InternalRecordLang.g:3704:1: ( ( rule__Property__ValueAssignment_4_1 ) )
            // InternalRecordLang.g:3705:1: ( rule__Property__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); 
            }
            // InternalRecordLang.g:3706:1: ( rule__Property__ValueAssignment_4_1 )
            // InternalRecordLang.g:3706:2: rule__Property__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Property__ValueAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__Group_4__1__Impl"


    // $ANTLR start "rule__ForeignKey__Group__0"
    // InternalRecordLang.g:3720:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3724:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalRecordLang.g:3725:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_24);
            rule__ForeignKey__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3732:1: rule__ForeignKey__Group__0__Impl : ( 'grouped' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3736:1: ( ( 'grouped' ) )
            // InternalRecordLang.g:3737:1: ( 'grouped' )
            {
            // InternalRecordLang.g:3737:1: ( 'grouped' )
            // InternalRecordLang.g:3738:1: 'grouped'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroupedKeyword_0()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3751:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3755:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalRecordLang.g:3756:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ForeignKey__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3763:1: rule__ForeignKey__Group__1__Impl : ( 'by' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3767:1: ( ( 'by' ) )
            // InternalRecordLang.g:3768:1: ( 'by' )
            {
            // InternalRecordLang.g:3768:1: ( 'by' )
            // InternalRecordLang.g:3769:1: 'by'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getByKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3782:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3786:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalRecordLang.g:3787:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_25);
            rule__ForeignKey__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3794:1: rule__ForeignKey__Group__2__Impl : ( ( rule__ForeignKey__RecordTypeAssignment_2 ) ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3798:1: ( ( ( rule__ForeignKey__RecordTypeAssignment_2 ) ) )
            // InternalRecordLang.g:3799:1: ( ( rule__ForeignKey__RecordTypeAssignment_2 ) )
            {
            // InternalRecordLang.g:3799:1: ( ( rule__ForeignKey__RecordTypeAssignment_2 ) )
            // InternalRecordLang.g:3800:1: ( rule__ForeignKey__RecordTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRecordTypeAssignment_2()); 
            }
            // InternalRecordLang.g:3801:1: ( rule__ForeignKey__RecordTypeAssignment_2 )
            // InternalRecordLang.g:3801:2: rule__ForeignKey__RecordTypeAssignment_2
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3811:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3815:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalRecordLang.g:3816:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__ForeignKey__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3823:1: rule__ForeignKey__Group__3__Impl : ( '.' ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3827:1: ( ( '.' ) )
            // InternalRecordLang.g:3828:1: ( '.' )
            {
            // InternalRecordLang.g:3828:1: ( '.' )
            // InternalRecordLang.g:3829:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getFullStopKeyword_3()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3842:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3846:1: ( rule__ForeignKey__Group__4__Impl )
            // InternalRecordLang.g:3847:2: rule__ForeignKey__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3853:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__PropertyRefAssignment_4 ) ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3857:1: ( ( ( rule__ForeignKey__PropertyRefAssignment_4 ) ) )
            // InternalRecordLang.g:3858:1: ( ( rule__ForeignKey__PropertyRefAssignment_4 ) )
            {
            // InternalRecordLang.g:3858:1: ( ( rule__ForeignKey__PropertyRefAssignment_4 ) )
            // InternalRecordLang.g:3859:1: ( rule__ForeignKey__PropertyRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getPropertyRefAssignment_4()); 
            }
            // InternalRecordLang.g:3860:1: ( rule__ForeignKey__PropertyRefAssignment_4 )
            // InternalRecordLang.g:3860:2: rule__ForeignKey__PropertyRefAssignment_4
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3880:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3884:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // InternalRecordLang.g:3885:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Classifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3892:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__TypeAssignment_0 ) ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3896:1: ( ( ( rule__Classifier__TypeAssignment_0 ) ) )
            // InternalRecordLang.g:3897:1: ( ( rule__Classifier__TypeAssignment_0 ) )
            {
            // InternalRecordLang.g:3897:1: ( ( rule__Classifier__TypeAssignment_0 ) )
            // InternalRecordLang.g:3898:1: ( rule__Classifier__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getTypeAssignment_0()); 
            }
            // InternalRecordLang.g:3899:1: ( rule__Classifier__TypeAssignment_0 )
            // InternalRecordLang.g:3899:2: rule__Classifier__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Classifier__TypeAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getTypeAssignment_0()); 
            }

            }


            }

        }
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
    // InternalRecordLang.g:3909:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3913:1: ( rule__Classifier__Group__1__Impl )
            // InternalRecordLang.g:3914:2: rule__Classifier__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Classifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalRecordLang.g:3920:1: rule__Classifier__Group__1__Impl : ( ( rule__Classifier__SizesAssignment_1 )* ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3924:1: ( ( ( rule__Classifier__SizesAssignment_1 )* ) )
            // InternalRecordLang.g:3925:1: ( ( rule__Classifier__SizesAssignment_1 )* )
            {
            // InternalRecordLang.g:3925:1: ( ( rule__Classifier__SizesAssignment_1 )* )
            // InternalRecordLang.g:3926:1: ( rule__Classifier__SizesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesAssignment_1()); 
            }
            // InternalRecordLang.g:3927:1: ( rule__Classifier__SizesAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==37) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalRecordLang.g:3927:2: rule__Classifier__SizesAssignment_1
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Classifier__SizesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getSizesAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ArraySize__Group__0"
    // InternalRecordLang.g:3941:1: rule__ArraySize__Group__0 : rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 ;
    public final void rule__ArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3945:1: ( rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 )
            // InternalRecordLang.g:3946:2: rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ArraySize__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3953:1: rule__ArraySize__Group__0__Impl : ( () ) ;
    public final void rule__ArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3957:1: ( ( () ) )
            // InternalRecordLang.g:3958:1: ( () )
            {
            // InternalRecordLang.g:3958:1: ( () )
            // InternalRecordLang.g:3959:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getArraySizeAction_0()); 
            }
            // InternalRecordLang.g:3960:1: ()
            // InternalRecordLang.g:3962:1: 
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
    // InternalRecordLang.g:3972:1: rule__ArraySize__Group__1 : rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 ;
    public final void rule__ArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3976:1: ( rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 )
            // InternalRecordLang.g:3977:2: rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__ArraySize__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:3984:1: rule__ArraySize__Group__1__Impl : ( '[' ) ;
    public final void rule__ArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3988:1: ( ( '[' ) )
            // InternalRecordLang.g:3989:1: ( '[' )
            {
            // InternalRecordLang.g:3989:1: ( '[' )
            // InternalRecordLang.g:3990:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4003:1: rule__ArraySize__Group__2 : rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 ;
    public final void rule__ArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4007:1: ( rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 )
            // InternalRecordLang.g:4008:2: rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__ArraySize__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4015:1: rule__ArraySize__Group__2__Impl : ( ( rule__ArraySize__SizeAssignment_2 )? ) ;
    public final void rule__ArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4019:1: ( ( ( rule__ArraySize__SizeAssignment_2 )? ) )
            // InternalRecordLang.g:4020:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            {
            // InternalRecordLang.g:4020:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            // InternalRecordLang.g:4021:1: ( rule__ArraySize__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeAssignment_2()); 
            }
            // InternalRecordLang.g:4022:1: ( rule__ArraySize__SizeAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalRecordLang.g:4022:2: rule__ArraySize__SizeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4032:1: rule__ArraySize__Group__3 : rule__ArraySize__Group__3__Impl ;
    public final void rule__ArraySize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4036:1: ( rule__ArraySize__Group__3__Impl )
            // InternalRecordLang.g:4037:2: rule__ArraySize__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4043:1: rule__ArraySize__Group__3__Impl : ( ']' ) ;
    public final void rule__ArraySize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4047:1: ( ( ']' ) )
            // InternalRecordLang.g:4048:1: ( ']' )
            {
            // InternalRecordLang.g:4048:1: ( ']' )
            // InternalRecordLang.g:4049:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ArrayLiteral__Group__0"
    // InternalRecordLang.g:4070:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4074:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // InternalRecordLang.g:4075:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__ArrayLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4082:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4086:1: ( ( '{' ) )
            // InternalRecordLang.g:4087:1: ( '{' )
            {
            // InternalRecordLang.g:4087:1: ( '{' )
            // InternalRecordLang.g:4088:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4101:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4105:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // InternalRecordLang.g:4106:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__ArrayLiteral__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4113:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4117:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // InternalRecordLang.g:4118:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // InternalRecordLang.g:4118:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // InternalRecordLang.g:4119:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // InternalRecordLang.g:4120:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // InternalRecordLang.g:4120:2: rule__ArrayLiteral__LiteralsAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4130:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4134:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // InternalRecordLang.g:4135:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__ArrayLiteral__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4142:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4146:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // InternalRecordLang.g:4147:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // InternalRecordLang.g:4147:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // InternalRecordLang.g:4148:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // InternalRecordLang.g:4149:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==24) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRecordLang.g:4149:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop37;
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
    // InternalRecordLang.g:4159:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4163:1: ( rule__ArrayLiteral__Group__3__Impl )
            // InternalRecordLang.g:4164:2: rule__ArrayLiteral__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4170:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4174:1: ( ( '}' ) )
            // InternalRecordLang.g:4175:1: ( '}' )
            {
            // InternalRecordLang.g:4175:1: ( '}' )
            // InternalRecordLang.g:4176:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4197:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4201:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // InternalRecordLang.g:4202:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_20);
            rule__ArrayLiteral__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4209:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4213:1: ( ( ',' ) )
            // InternalRecordLang.g:4214:1: ( ',' )
            {
            // InternalRecordLang.g:4214:1: ( ',' )
            // InternalRecordLang.g:4215:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4228:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4232:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // InternalRecordLang.g:4233:2: rule__ArrayLiteral__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4239:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4243:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // InternalRecordLang.g:4244:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // InternalRecordLang.g:4244:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // InternalRecordLang.g:4245:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // InternalRecordLang.g:4246:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // InternalRecordLang.g:4246:2: rule__ArrayLiteral__LiteralsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4260:1: rule__BuiltInValueLiteral__Group__0 : rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 ;
    public final void rule__BuiltInValueLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4264:1: ( rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 )
            // InternalRecordLang.g:4265:2: rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__BuiltInValueLiteral__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4272:1: rule__BuiltInValueLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BuiltInValueLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4276:1: ( ( () ) )
            // InternalRecordLang.g:4277:1: ( () )
            {
            // InternalRecordLang.g:4277:1: ( () )
            // InternalRecordLang.g:4278:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0()); 
            }
            // InternalRecordLang.g:4279:1: ()
            // InternalRecordLang.g:4281:1: 
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
    // InternalRecordLang.g:4291:1: rule__BuiltInValueLiteral__Group__1 : rule__BuiltInValueLiteral__Group__1__Impl ;
    public final void rule__BuiltInValueLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4295:1: ( rule__BuiltInValueLiteral__Group__1__Impl )
            // InternalRecordLang.g:4296:2: rule__BuiltInValueLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4302:1: rule__BuiltInValueLiteral__Group__1__Impl : ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BuiltInValueLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4306:1: ( ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) )
            // InternalRecordLang.g:4307:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            {
            // InternalRecordLang.g:4307:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            // InternalRecordLang.g:4308:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueAssignment_1()); 
            }
            // InternalRecordLang.g:4309:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            // InternalRecordLang.g:4309:2: rule__BuiltInValueLiteral__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4323:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4327:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRecordLang.g:4328:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRecordLang.g:4335:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4339:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4340:1: ( RULE_ID )
            {
            // InternalRecordLang.g:4340:1: ( RULE_ID )
            // InternalRecordLang.g:4341:1: RULE_ID
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
    // InternalRecordLang.g:4352:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4356:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRecordLang.g:4357:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRecordLang.g:4363:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4367:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRecordLang.g:4368:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRecordLang.g:4368:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRecordLang.g:4369:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:4370:1: ( rule__QualifiedName__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==36) ) {
                    int LA38_2 = input.LA(2);

                    if ( (LA38_2==RULE_ID) ) {
                        alt38=1;
                    }


                }


                switch (alt38) {
            	case 1 :
            	    // InternalRecordLang.g:4370:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalRecordLang.g:4384:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4388:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRecordLang.g:4389:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalRecordLang.g:4396:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4400:1: ( ( ( '.' ) ) )
            // InternalRecordLang.g:4401:1: ( ( '.' ) )
            {
            // InternalRecordLang.g:4401:1: ( ( '.' ) )
            // InternalRecordLang.g:4402:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalRecordLang.g:4403:1: ( '.' )
            // InternalRecordLang.g:4404:2: '.'
            {
            match(input,36,FOLLOW_2); if (state.failed) return ;

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
    // InternalRecordLang.g:4415:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4419:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRecordLang.g:4420:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRecordLang.g:4426:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4430:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4431:1: ( RULE_ID )
            {
            // InternalRecordLang.g:4431:1: ( RULE_ID )
            // InternalRecordLang.g:4432:1: RULE_ID
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
    // InternalRecordLang.g:4447:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4451:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRecordLang.g:4452:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalRecordLang.g:4459:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4463:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4464:1: ( ruleQualifiedName )
            {
            // InternalRecordLang.g:4464:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4465:1: ruleQualifiedName
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
    // InternalRecordLang.g:4476:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4480:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRecordLang.g:4481:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalRecordLang.g:4487:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4491:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // InternalRecordLang.g:4492:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // InternalRecordLang.g:4492:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // InternalRecordLang.g:4493:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:4494:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==36) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalRecordLang.g:4494:2: rule__QualifiedNameWithWildcard__Group_1__0
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
    // InternalRecordLang.g:4508:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4512:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // InternalRecordLang.g:4513:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalRecordLang.g:4520:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4524:1: ( ( '.' ) )
            // InternalRecordLang.g:4525:1: ( '.' )
            {
            // InternalRecordLang.g:4525:1: ( '.' )
            // InternalRecordLang.g:4526:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4539:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4543:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // InternalRecordLang.g:4544:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
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
    // InternalRecordLang.g:4550:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4554:1: ( ( '*' ) )
            // InternalRecordLang.g:4555:1: ( '*' )
            {
            // InternalRecordLang.g:4555:1: ( '*' )
            // InternalRecordLang.g:4556:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4574:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4578:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4579:1: ( ruleQualifiedName )
            {
            // InternalRecordLang.g:4579:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4580:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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


    // $ANTLR start "rule__Model__ImportsAssignment_2"
    // InternalRecordLang.g:4589:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4593:1: ( ( ruleImport ) )
            // InternalRecordLang.g:4594:1: ( ruleImport )
            {
            // InternalRecordLang.g:4594:1: ( ruleImport )
            // InternalRecordLang.g:4595:1: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__ImportsAssignment_2"


    // $ANTLR start "rule__Model__TypesAssignment_3"
    // InternalRecordLang.g:4604:1: rule__Model__TypesAssignment_3 : ( ruleComplexType ) ;
    public final void rule__Model__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4608:1: ( ( ruleComplexType ) )
            // InternalRecordLang.g:4609:1: ( ruleComplexType )
            {
            // InternalRecordLang.g:4609:1: ( ruleComplexType )
            // InternalRecordLang.g:4610:1: ruleComplexType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleComplexType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getTypesComplexTypeParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__TypesAssignment_3"


    // $ANTLR start "rule__Model__SchemesAssignment_4"
    // InternalRecordLang.g:4619:1: rule__Model__SchemesAssignment_4 : ( ruleSchema ) ;
    public final void rule__Model__SchemesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4623:1: ( ( ruleSchema ) )
            // InternalRecordLang.g:4624:1: ( ruleSchema )
            {
            // InternalRecordLang.g:4624:1: ( ruleSchema )
            // InternalRecordLang.g:4625:1: ruleSchema
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getSchemesSchemaParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getSchemesSchemaParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SchemesAssignment_4"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalRecordLang.g:4634:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4638:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRecordLang.g:4639:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRecordLang.g:4639:1: ( ruleQualifiedNameWithWildcard )
            // InternalRecordLang.g:4640:1: ruleQualifiedNameWithWildcard
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


    // $ANTLR start "rule__BaseType__NameAssignment"
    // InternalRecordLang.g:4649:1: rule__BaseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BaseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4653:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4654:1: ( RULE_ID )
            {
            // InternalRecordLang.g:4654:1: ( RULE_ID )
            // InternalRecordLang.g:4655:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBaseTypeAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBaseTypeAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BaseType__NameAssignment"


    // $ANTLR start "rule__Schema__AuthorAssignment_0_1"
    // InternalRecordLang.g:4664:1: rule__Schema__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__Schema__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4668:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:4669:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:4669:1: ( RULE_STRING )
            // InternalRecordLang.g:4670:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__AuthorAssignment_0_1"


    // $ANTLR start "rule__Schema__SinceAssignment_1_1"
    // InternalRecordLang.g:4679:1: rule__Schema__SinceAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__Schema__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4683:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:4684:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:4684:1: ( RULE_STRING )
            // InternalRecordLang.g:4685:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__SinceAssignment_1_1"


    // $ANTLR start "rule__Schema__NameAssignment_3"
    // InternalRecordLang.g:4694:1: rule__Schema__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Schema__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4698:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4699:1: ( RULE_ID )
            {
            // InternalRecordLang.g:4699:1: ( RULE_ID )
            // InternalRecordLang.g:4700:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__NameAssignment_3"


    // $ANTLR start "rule__Schema__TemplatesAssignment_4_0"
    // InternalRecordLang.g:4709:1: rule__Schema__TemplatesAssignment_4_0 : ( ruleTemplates ) ;
    public final void rule__Schema__TemplatesAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4713:1: ( ( ruleTemplates ) )
            // InternalRecordLang.g:4714:1: ( ruleTemplates )
            {
            // InternalRecordLang.g:4714:1: ( ruleTemplates )
            // InternalRecordLang.g:4715:1: ruleTemplates
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getTemplatesTemplatesParserRuleCall_4_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTemplates();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getTemplatesTemplatesParserRuleCall_4_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__TemplatesAssignment_4_0"


    // $ANTLR start "rule__Schema__RootAssignment_4_1"
    // InternalRecordLang.g:4724:1: rule__Schema__RootAssignment_4_1 : ( ruleRootType ) ;
    public final void rule__Schema__RootAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4728:1: ( ( ruleRootType ) )
            // InternalRecordLang.g:4729:1: ( ruleRootType )
            {
            // InternalRecordLang.g:4729:1: ( ruleRootType )
            // InternalRecordLang.g:4730:1: ruleRootType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getRootRootTypeParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleRootType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getRootRootTypeParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__RootAssignment_4_1"


    // $ANTLR start "rule__Schema__PropertiesAssignment_5_0_1_0"
    // InternalRecordLang.g:4739:1: rule__Schema__PropertiesAssignment_5_0_1_0 : ( ruleProperty ) ;
    public final void rule__Schema__PropertiesAssignment_5_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4743:1: ( ( ruleProperty ) )
            // InternalRecordLang.g:4744:1: ( ruleProperty )
            {
            // InternalRecordLang.g:4744:1: ( ruleProperty )
            // InternalRecordLang.g:4745:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getPropertiesPropertyParserRuleCall_5_0_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleProperty();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getPropertiesPropertyParserRuleCall_5_0_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__PropertiesAssignment_5_0_1_0"


    // $ANTLR start "rule__Schema__ConstantsAssignment_5_0_1_1"
    // InternalRecordLang.g:4754:1: rule__Schema__ConstantsAssignment_5_0_1_1 : ( ruleConstant ) ;
    public final void rule__Schema__ConstantsAssignment_5_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4758:1: ( ( ruleConstant ) )
            // InternalRecordLang.g:4759:1: ( ruleConstant )
            {
            // InternalRecordLang.g:4759:1: ( ruleConstant )
            // InternalRecordLang.g:4760:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getConstantsConstantParserRuleCall_5_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getConstantsConstantParserRuleCall_5_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__ConstantsAssignment_5_0_1_1"


    // $ANTLR start "rule__Schema__ParentsAssignment_5_1_1"
    // InternalRecordLang.g:4769:1: rule__Schema__ParentsAssignment_5_1_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Schema__ParentsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4773:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:4774:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:4774:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4775:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getParentsTemplateTypeCrossReference_5_1_1_0()); 
            }
            // InternalRecordLang.g:4776:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4777:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_5_1_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_5_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getParentsTemplateTypeCrossReference_5_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__ParentsAssignment_5_1_1"


    // $ANTLR start "rule__Schema__ParentsAssignment_5_1_2_1"
    // InternalRecordLang.g:4788:1: rule__Schema__ParentsAssignment_5_1_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Schema__ParentsAssignment_5_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4792:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:4793:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:4793:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4794:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getParentsTemplateTypeCrossReference_5_1_2_1_0()); 
            }
            // InternalRecordLang.g:4795:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4796:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSchemaAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_5_1_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_5_1_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSchemaAccess().getParentsTemplateTypeCrossReference_5_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__ParentsAssignment_5_1_2_1"


    // $ANTLR start "rule__Templates__TemplatesAssignment_1"
    // InternalRecordLang.g:4807:1: rule__Templates__TemplatesAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Templates__TemplatesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4811:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:4812:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:4812:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4813:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeCrossReference_1_0()); 
            }
            // InternalRecordLang.g:4814:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4815:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__TemplatesAssignment_1"


    // $ANTLR start "rule__Templates__TemplatesAssignment_2_1"
    // InternalRecordLang.g:4826:1: rule__Templates__TemplatesAssignment_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Templates__TemplatesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4830:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:4831:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:4831:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4832:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeCrossReference_2_1_0()); 
            }
            // InternalRecordLang.g:4833:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4834:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeQualifiedNameParserRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemplatesAccess().getTemplatesTemplateTypeCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Templates__TemplatesAssignment_2_1"


    // $ANTLR start "rule__RootType__RecordAssignment_1"
    // InternalRecordLang.g:4845:1: rule__RootType__RecordAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RootType__RecordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4849:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:4850:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:4850:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4851:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootTypeAccess().getRecordRecordTypeCrossReference_1_0()); 
            }
            // InternalRecordLang.g:4852:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4853:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRootTypeAccess().getRecordRecordTypeQualifiedNameParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootTypeAccess().getRecordRecordTypeQualifiedNameParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRootTypeAccess().getRecordRecordTypeCrossReference_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RootType__RecordAssignment_1"


    // $ANTLR start "rule__TemplateType__AuthorAssignment_0_1"
    // InternalRecordLang.g:4864:1: rule__TemplateType__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TemplateType__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4868:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:4869:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:4869:1: ( RULE_STRING )
            // InternalRecordLang.g:4870:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4879:1: rule__TemplateType__SinceAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TemplateType__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4883:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:4884:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:4884:1: ( RULE_STRING )
            // InternalRecordLang.g:4885:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4894:1: rule__TemplateType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__TemplateType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4898:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4899:1: ( RULE_ID )
            {
            // InternalRecordLang.g:4899:1: ( RULE_ID )
            // InternalRecordLang.g:4900:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4909:1: rule__TemplateType__ParentsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateType__ParentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4913:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:4914:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:4914:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4915:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_1_0()); 
            }
            // InternalRecordLang.g:4916:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4917:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4928:1: rule__TemplateType__ParentsAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateType__ParentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4932:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:4933:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:4933:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:4934:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_2_1_0()); 
            }
            // InternalRecordLang.g:4935:1: ( ruleQualifiedName )
            // InternalRecordLang.g:4936:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_4_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4947:1: rule__TemplateType__PropertiesAssignment_5_1_0 : ( ruleProperty ) ;
    public final void rule__TemplateType__PropertiesAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4951:1: ( ( ruleProperty ) )
            // InternalRecordLang.g:4952:1: ( ruleProperty )
            {
            // InternalRecordLang.g:4952:1: ( ruleProperty )
            // InternalRecordLang.g:4953:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getPropertiesPropertyParserRuleCall_5_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4962:1: rule__TemplateType__ConstantsAssignment_5_1_1 : ( ruleConstant ) ;
    public final void rule__TemplateType__ConstantsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4966:1: ( ( ruleConstant ) )
            // InternalRecordLang.g:4967:1: ( ruleConstant )
            {
            // InternalRecordLang.g:4967:1: ( ruleConstant )
            // InternalRecordLang.g:4968:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getConstantsConstantParserRuleCall_5_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:4977:1: rule__RecordType__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4981:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:4982:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:4982:1: ( RULE_STRING )
            // InternalRecordLang.g:4983:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorSTRINGTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:4992:1: rule__RecordType__SinceAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4996:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:4997:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:4997:1: ( RULE_STRING )
            // InternalRecordLang.g:4998:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:5007:1: rule__RecordType__AbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__RecordType__AbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5011:1: ( ( ( 'abstract' ) ) )
            // InternalRecordLang.g:5012:1: ( ( 'abstract' ) )
            {
            // InternalRecordLang.g:5012:1: ( ( 'abstract' ) )
            // InternalRecordLang.g:5013:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }
            // InternalRecordLang.g:5014:1: ( 'abstract' )
            // InternalRecordLang.g:5015:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:5030:1: rule__RecordType__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5034:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:5035:1: ( RULE_ID )
            {
            // InternalRecordLang.g:5035:1: ( RULE_ID )
            // InternalRecordLang.g:5036:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:5045:1: rule__RecordType__ParentAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5049:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:5050:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:5050:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:5051:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_5_1_0()); 
            }
            // InternalRecordLang.g:5052:1: ( ruleQualifiedName )
            // InternalRecordLang.g:5053:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5064:1: rule__RecordType__ParentsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5068:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:5069:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:5069:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:5070:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_1_0()); 
            }
            // InternalRecordLang.g:5071:1: ( ruleQualifiedName )
            // InternalRecordLang.g:5072:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_6_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5083:1: rule__RecordType__ParentsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5087:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:5088:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:5088:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:5089:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_2_1_0()); 
            }
            // InternalRecordLang.g:5090:1: ( ruleQualifiedName )
            // InternalRecordLang.g:5091:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeQualifiedNameParserRuleCall_6_2_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5102:1: rule__RecordType__PropertiesAssignment_7_1_0 : ( ruleProperty ) ;
    public final void rule__RecordType__PropertiesAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5106:1: ( ( ruleProperty ) )
            // InternalRecordLang.g:5107:1: ( ruleProperty )
            {
            // InternalRecordLang.g:5107:1: ( ruleProperty )
            // InternalRecordLang.g:5108:1: ruleProperty
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getPropertiesPropertyParserRuleCall_7_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5117:1: rule__RecordType__ConstantsAssignment_7_1_1 : ( ruleConstant ) ;
    public final void rule__RecordType__ConstantsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5121:1: ( ( ruleConstant ) )
            // InternalRecordLang.g:5122:1: ( ruleConstant )
            {
            // InternalRecordLang.g:5122:1: ( ruleConstant )
            // InternalRecordLang.g:5123:1: ruleConstant
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getConstantsConstantParserRuleCall_7_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5132:1: rule__Constant__TypeAssignment_1 : ( ruleClassifier ) ;
    public final void rule__Constant__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5136:1: ( ( ruleClassifier ) )
            // InternalRecordLang.g:5137:1: ( ruleClassifier )
            {
            // InternalRecordLang.g:5137:1: ( ruleClassifier )
            // InternalRecordLang.g:5138:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5147:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5151:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:5152:1: ( RULE_ID )
            {
            // InternalRecordLang.g:5152:1: ( RULE_ID )
            // InternalRecordLang.g:5153:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:5162:1: rule__Constant__ValueAssignment_4 : ( ruleLiteral ) ;
    public final void rule__Constant__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5166:1: ( ( ruleLiteral ) )
            // InternalRecordLang.g:5167:1: ( ruleLiteral )
            {
            // InternalRecordLang.g:5167:1: ( ruleLiteral )
            // InternalRecordLang.g:5168:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5177:1: rule__Property__ModifiersAssignment_0 : ( rulePropertyModifier ) ;
    public final void rule__Property__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5181:1: ( ( rulePropertyModifier ) )
            // InternalRecordLang.g:5182:1: ( rulePropertyModifier )
            {
            // InternalRecordLang.g:5182:1: ( rulePropertyModifier )
            // InternalRecordLang.g:5183:1: rulePropertyModifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getModifiersPropertyModifierEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5192:1: rule__Property__ForeignKeyAssignment_1 : ( ruleForeignKey ) ;
    public final void rule__Property__ForeignKeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5196:1: ( ( ruleForeignKey ) )
            // InternalRecordLang.g:5197:1: ( ruleForeignKey )
            {
            // InternalRecordLang.g:5197:1: ( ruleForeignKey )
            // InternalRecordLang.g:5198:1: ruleForeignKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getForeignKeyForeignKeyParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5207:1: rule__Property__TypeAssignment_2_0 : ( ruleClassifier ) ;
    public final void rule__Property__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5211:1: ( ( ruleClassifier ) )
            // InternalRecordLang.g:5212:1: ( ruleClassifier )
            {
            // InternalRecordLang.g:5212:1: ( ruleClassifier )
            // InternalRecordLang.g:5213:1: ruleClassifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getTypeClassifierParserRuleCall_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5222:1: rule__Property__ReferToAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ReferToAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5226:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:5227:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:5227:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:5228:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_2_1_1_0()); 
            }
            // InternalRecordLang.g:5229:1: ( RULE_ID )
            // InternalRecordLang.g:5230:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyIDTerminalRuleCall_2_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:5241:1: rule__Property__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5245:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:5246:1: ( RULE_ID )
            {
            // InternalRecordLang.g:5246:1: ( RULE_ID )
            // InternalRecordLang.g:5247:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_3_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Property__ValueAssignment_4_1"
    // InternalRecordLang.g:5256:1: rule__Property__ValueAssignment_4_1 : ( ruleLiteral ) ;
    public final void rule__Property__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5260:1: ( ( ruleLiteral ) )
            // InternalRecordLang.g:5261:1: ( ruleLiteral )
            {
            // InternalRecordLang.g:5261:1: ( ruleLiteral )
            // InternalRecordLang.g:5262:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyAccess().getValueLiteralParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Property__ValueAssignment_4_1"


    // $ANTLR start "rule__ForeignKey__RecordTypeAssignment_2"
    // InternalRecordLang.g:5271:1: rule__ForeignKey__RecordTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__RecordTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5275:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:5276:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:5276:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:5277:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeCrossReference_2_0()); 
            }
            // InternalRecordLang.g:5278:1: ( RULE_ID )
            // InternalRecordLang.g:5279:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeIDTerminalRuleCall_2_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:5290:1: rule__ForeignKey__PropertyRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__PropertyRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5294:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:5295:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:5295:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:5296:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getPropertyRefPropertyCrossReference_4_0()); 
            }
            // InternalRecordLang.g:5297:1: ( RULE_ID )
            // InternalRecordLang.g:5298:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getPropertyRefPropertyIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__Classifier__TypeAssignment_0"
    // InternalRecordLang.g:5309:1: rule__Classifier__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5313:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:5314:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:5314:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:5315:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getTypeBaseTypeCrossReference_0_0()); 
            }
            // InternalRecordLang.g:5316:1: ( RULE_ID )
            // InternalRecordLang.g:5317:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getTypeBaseTypeIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getTypeBaseTypeIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getTypeBaseTypeCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__TypeAssignment_0"


    // $ANTLR start "rule__Classifier__SizesAssignment_1"
    // InternalRecordLang.g:5328:1: rule__Classifier__SizesAssignment_1 : ( ruleArraySize ) ;
    public final void rule__Classifier__SizesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5332:1: ( ( ruleArraySize ) )
            // InternalRecordLang.g:5333:1: ( ruleArraySize )
            {
            // InternalRecordLang.g:5333:1: ( ruleArraySize )
            // InternalRecordLang.g:5334:1: ruleArraySize
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleArraySize();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getClassifierAccess().getSizesArraySizeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Classifier__SizesAssignment_1"


    // $ANTLR start "rule__ArraySize__SizeAssignment_2"
    // InternalRecordLang.g:5343:1: rule__ArraySize__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__ArraySize__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5347:1: ( ( RULE_INT ) )
            // InternalRecordLang.g:5348:1: ( RULE_INT )
            {
            // InternalRecordLang.g:5348:1: ( RULE_INT )
            // InternalRecordLang.g:5349:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeINTTerminalRuleCall_2_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__ArrayLiteral__LiteralsAssignment_1"
    // InternalRecordLang.g:5358:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5362:1: ( ( ruleLiteral ) )
            // InternalRecordLang.g:5363:1: ( ruleLiteral )
            {
            // InternalRecordLang.g:5363:1: ( ruleLiteral )
            // InternalRecordLang.g:5364:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5373:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5377:1: ( ( ruleLiteral ) )
            // InternalRecordLang.g:5378:1: ( ruleLiteral )
            {
            // InternalRecordLang.g:5378:1: ( ruleLiteral )
            // InternalRecordLang.g:5379:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsLiteralParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
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
    // InternalRecordLang.g:5388:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5392:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:5393:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:5393:1: ( RULE_STRING )
            // InternalRecordLang.g:5394:1: RULE_STRING
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


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // InternalRecordLang.g:5403:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5407:1: ( ( RULE_INT ) )
            // InternalRecordLang.g:5408:1: ( RULE_INT )
            {
            // InternalRecordLang.g:5408:1: ( RULE_INT )
            // InternalRecordLang.g:5409:1: RULE_INT
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


    // $ANTLR start "rule__FloatLiteral__ValueAssignment"
    // InternalRecordLang.g:5418:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5422:1: ( ( RULE_FLOAT ) )
            // InternalRecordLang.g:5423:1: ( RULE_FLOAT )
            {
            // InternalRecordLang.g:5423:1: ( RULE_FLOAT )
            // InternalRecordLang.g:5424:1: RULE_FLOAT
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


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // InternalRecordLang.g:5433:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5437:1: ( ( RULE_BOOLEAN ) )
            // InternalRecordLang.g:5438:1: ( RULE_BOOLEAN )
            {
            // InternalRecordLang.g:5438:1: ( RULE_BOOLEAN )
            // InternalRecordLang.g:5439:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:5448:1: rule__ConstantLiteral__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5452:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:5453:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:5453:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:5454:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantCrossReference_0()); 
            }
            // InternalRecordLang.g:5455:1: ( RULE_ID )
            // InternalRecordLang.g:5456:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:5467:1: rule__BuiltInValueLiteral__ValueAssignment_1 : ( ( 'KIEKER_VERSION' ) ) ;
    public final void rule__BuiltInValueLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:5471:1: ( ( ( 'KIEKER_VERSION' ) ) )
            // InternalRecordLang.g:5472:1: ( ( 'KIEKER_VERSION' ) )
            {
            // InternalRecordLang.g:5472:1: ( ( 'KIEKER_VERSION' ) )
            // InternalRecordLang.g:5473:1: ( 'KIEKER_VERSION' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            // InternalRecordLang.g:5474:1: ( 'KIEKER_VERSION' )
            // InternalRecordLang.g:5475:1: 'KIEKER_VERSION'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000100181E0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010018180002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000001C0002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000001C0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000054040C010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000054000C012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000010018180000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010010180000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020A00000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000200002001F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000050000C010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000008000000000L});

}
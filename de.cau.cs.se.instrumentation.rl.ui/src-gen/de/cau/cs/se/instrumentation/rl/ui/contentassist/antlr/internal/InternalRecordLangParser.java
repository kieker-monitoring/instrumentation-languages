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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "RULE_BOOLEAN", "RULE_NUMBER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'transient'", "'auto-increment'", "'package'", "'import'", "'template'", "'@author'", "'@since'", "':'", "','", "'{'", "'}'", "'entity'", "'extends'", "'const'", "'='", "'alias'", "'as'", "'grouped'", "'by'", "'.'", "'['", "']'", "'*'", "'abstract'", "'KIEKER_VERSION'"
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


    // $ANTLR start "entryRuleComplexType"
    // InternalRecordLang.g:147:1: entryRuleComplexType : ruleComplexType EOF ;
    public final void entryRuleComplexType() throws RecognitionException {
        try {
            // InternalRecordLang.g:148:1: ( ruleComplexType EOF )
            // InternalRecordLang.g:149:1: ruleComplexType EOF
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
    // InternalRecordLang.g:156:1: ruleComplexType : ( ( rule__ComplexType__Alternatives ) ) ;
    public final void ruleComplexType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:160:2: ( ( ( rule__ComplexType__Alternatives ) ) )
            // InternalRecordLang.g:161:1: ( ( rule__ComplexType__Alternatives ) )
            {
            // InternalRecordLang.g:161:1: ( ( rule__ComplexType__Alternatives ) )
            // InternalRecordLang.g:162:1: ( rule__ComplexType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexTypeAccess().getAlternatives()); 
            }
            // InternalRecordLang.g:163:1: ( rule__ComplexType__Alternatives )
            // InternalRecordLang.g:163:2: rule__ComplexType__Alternatives
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
    // InternalRecordLang.g:175:1: entryRuleTemplateType : ruleTemplateType EOF ;
    public final void entryRuleTemplateType() throws RecognitionException {
        try {
            // InternalRecordLang.g:176:1: ( ruleTemplateType EOF )
            // InternalRecordLang.g:177:1: ruleTemplateType EOF
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
    // InternalRecordLang.g:184:1: ruleTemplateType : ( ( rule__TemplateType__Group__0 ) ) ;
    public final void ruleTemplateType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:188:2: ( ( ( rule__TemplateType__Group__0 ) ) )
            // InternalRecordLang.g:189:1: ( ( rule__TemplateType__Group__0 ) )
            {
            // InternalRecordLang.g:189:1: ( ( rule__TemplateType__Group__0 ) )
            // InternalRecordLang.g:190:1: ( rule__TemplateType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup()); 
            }
            // InternalRecordLang.g:191:1: ( rule__TemplateType__Group__0 )
            // InternalRecordLang.g:191:2: rule__TemplateType__Group__0
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
    // InternalRecordLang.g:203:1: entryRuleRecordType : ruleRecordType EOF ;
    public final void entryRuleRecordType() throws RecognitionException {
        try {
            // InternalRecordLang.g:204:1: ( ruleRecordType EOF )
            // InternalRecordLang.g:205:1: ruleRecordType EOF
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
    // InternalRecordLang.g:212:1: ruleRecordType : ( ( rule__RecordType__Group__0 ) ) ;
    public final void ruleRecordType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:216:2: ( ( ( rule__RecordType__Group__0 ) ) )
            // InternalRecordLang.g:217:1: ( ( rule__RecordType__Group__0 ) )
            {
            // InternalRecordLang.g:217:1: ( ( rule__RecordType__Group__0 ) )
            // InternalRecordLang.g:218:1: ( rule__RecordType__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup()); 
            }
            // InternalRecordLang.g:219:1: ( rule__RecordType__Group__0 )
            // InternalRecordLang.g:219:2: rule__RecordType__Group__0
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
    // InternalRecordLang.g:231:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalRecordLang.g:232:1: ( ruleConstant EOF )
            // InternalRecordLang.g:233:1: ruleConstant EOF
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
    // InternalRecordLang.g:240:1: ruleConstant : ( ( rule__Constant__Group__0 ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:244:2: ( ( ( rule__Constant__Group__0 ) ) )
            // InternalRecordLang.g:245:1: ( ( rule__Constant__Group__0 ) )
            {
            // InternalRecordLang.g:245:1: ( ( rule__Constant__Group__0 ) )
            // InternalRecordLang.g:246:1: ( rule__Constant__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getGroup()); 
            }
            // InternalRecordLang.g:247:1: ( rule__Constant__Group__0 )
            // InternalRecordLang.g:247:2: rule__Constant__Group__0
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
    // InternalRecordLang.g:259:1: entryRuleProperty : ruleProperty EOF ;
    public final void entryRuleProperty() throws RecognitionException {
        try {
            // InternalRecordLang.g:260:1: ( ruleProperty EOF )
            // InternalRecordLang.g:261:1: ruleProperty EOF
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
    // InternalRecordLang.g:268:1: ruleProperty : ( ( rule__Property__Group__0 ) ) ;
    public final void ruleProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:272:2: ( ( ( rule__Property__Group__0 ) ) )
            // InternalRecordLang.g:273:1: ( ( rule__Property__Group__0 ) )
            {
            // InternalRecordLang.g:273:1: ( ( rule__Property__Group__0 ) )
            // InternalRecordLang.g:274:1: ( rule__Property__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup()); 
            }
            // InternalRecordLang.g:275:1: ( rule__Property__Group__0 )
            // InternalRecordLang.g:275:2: rule__Property__Group__0
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
    // InternalRecordLang.g:287:1: entryRuleForeignKey : ruleForeignKey EOF ;
    public final void entryRuleForeignKey() throws RecognitionException {
        try {
            // InternalRecordLang.g:288:1: ( ruleForeignKey EOF )
            // InternalRecordLang.g:289:1: ruleForeignKey EOF
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
    // InternalRecordLang.g:296:1: ruleForeignKey : ( ( rule__ForeignKey__Group__0 ) ) ;
    public final void ruleForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:300:2: ( ( ( rule__ForeignKey__Group__0 ) ) )
            // InternalRecordLang.g:301:1: ( ( rule__ForeignKey__Group__0 ) )
            {
            // InternalRecordLang.g:301:1: ( ( rule__ForeignKey__Group__0 ) )
            // InternalRecordLang.g:302:1: ( rule__ForeignKey__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroup()); 
            }
            // InternalRecordLang.g:303:1: ( rule__ForeignKey__Group__0 )
            // InternalRecordLang.g:303:2: rule__ForeignKey__Group__0
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
    // InternalRecordLang.g:315:1: entryRuleClassifier : ruleClassifier EOF ;
    public final void entryRuleClassifier() throws RecognitionException {
        try {
            // InternalRecordLang.g:316:1: ( ruleClassifier EOF )
            // InternalRecordLang.g:317:1: ruleClassifier EOF
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
    // InternalRecordLang.g:324:1: ruleClassifier : ( ( rule__Classifier__Group__0 ) ) ;
    public final void ruleClassifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:328:2: ( ( ( rule__Classifier__Group__0 ) ) )
            // InternalRecordLang.g:329:1: ( ( rule__Classifier__Group__0 ) )
            {
            // InternalRecordLang.g:329:1: ( ( rule__Classifier__Group__0 ) )
            // InternalRecordLang.g:330:1: ( rule__Classifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getGroup()); 
            }
            // InternalRecordLang.g:331:1: ( rule__Classifier__Group__0 )
            // InternalRecordLang.g:331:2: rule__Classifier__Group__0
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
    // InternalRecordLang.g:343:1: entryRuleArraySize : ruleArraySize EOF ;
    public final void entryRuleArraySize() throws RecognitionException {
        try {
            // InternalRecordLang.g:344:1: ( ruleArraySize EOF )
            // InternalRecordLang.g:345:1: ruleArraySize EOF
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
    // InternalRecordLang.g:352:1: ruleArraySize : ( ( rule__ArraySize__Group__0 ) ) ;
    public final void ruleArraySize() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:356:2: ( ( ( rule__ArraySize__Group__0 ) ) )
            // InternalRecordLang.g:357:1: ( ( rule__ArraySize__Group__0 ) )
            {
            // InternalRecordLang.g:357:1: ( ( rule__ArraySize__Group__0 ) )
            // InternalRecordLang.g:358:1: ( rule__ArraySize__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getGroup()); 
            }
            // InternalRecordLang.g:359:1: ( rule__ArraySize__Group__0 )
            // InternalRecordLang.g:359:2: rule__ArraySize__Group__0
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
    // InternalRecordLang.g:371:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:372:1: ( ruleLiteral EOF )
            // InternalRecordLang.g:373:1: ruleLiteral EOF
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
    // InternalRecordLang.g:380:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:384:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalRecordLang.g:385:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalRecordLang.g:385:1: ( ( rule__Literal__Alternatives ) )
            // InternalRecordLang.g:386:1: ( rule__Literal__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getAlternatives()); 
            }
            // InternalRecordLang.g:387:1: ( rule__Literal__Alternatives )
            // InternalRecordLang.g:387:2: rule__Literal__Alternatives
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
    // InternalRecordLang.g:399:1: entryRuleArrayLiteral : ruleArrayLiteral EOF ;
    public final void entryRuleArrayLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:400:1: ( ruleArrayLiteral EOF )
            // InternalRecordLang.g:401:1: ruleArrayLiteral EOF
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
    // InternalRecordLang.g:408:1: ruleArrayLiteral : ( ( rule__ArrayLiteral__Group__0 ) ) ;
    public final void ruleArrayLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:412:2: ( ( ( rule__ArrayLiteral__Group__0 ) ) )
            // InternalRecordLang.g:413:1: ( ( rule__ArrayLiteral__Group__0 ) )
            {
            // InternalRecordLang.g:413:1: ( ( rule__ArrayLiteral__Group__0 ) )
            // InternalRecordLang.g:414:1: ( rule__ArrayLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup()); 
            }
            // InternalRecordLang.g:415:1: ( rule__ArrayLiteral__Group__0 )
            // InternalRecordLang.g:415:2: rule__ArrayLiteral__Group__0
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
    // InternalRecordLang.g:427:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:428:1: ( ruleStringLiteral EOF )
            // InternalRecordLang.g:429:1: ruleStringLiteral EOF
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
    // InternalRecordLang.g:436:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:440:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:441:1: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:441:1: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalRecordLang.g:442:1: ( rule__StringLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:443:1: ( rule__StringLiteral__ValueAssignment )
            // InternalRecordLang.g:443:2: rule__StringLiteral__ValueAssignment
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
    // InternalRecordLang.g:455:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:456:1: ( ruleIntLiteral EOF )
            // InternalRecordLang.g:457:1: ruleIntLiteral EOF
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
    // InternalRecordLang.g:464:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:468:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:469:1: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:469:1: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalRecordLang.g:470:1: ( rule__IntLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:471:1: ( rule__IntLiteral__ValueAssignment )
            // InternalRecordLang.g:471:2: rule__IntLiteral__ValueAssignment
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
    // InternalRecordLang.g:483:1: entryRuleFloatLiteral : ruleFloatLiteral EOF ;
    public final void entryRuleFloatLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:484:1: ( ruleFloatLiteral EOF )
            // InternalRecordLang.g:485:1: ruleFloatLiteral EOF
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
    // InternalRecordLang.g:492:1: ruleFloatLiteral : ( ( rule__FloatLiteral__ValueAssignment ) ) ;
    public final void ruleFloatLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:496:2: ( ( ( rule__FloatLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:497:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:497:1: ( ( rule__FloatLiteral__ValueAssignment ) )
            // InternalRecordLang.g:498:1: ( rule__FloatLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFloatLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:499:1: ( rule__FloatLiteral__ValueAssignment )
            // InternalRecordLang.g:499:2: rule__FloatLiteral__ValueAssignment
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
    // InternalRecordLang.g:511:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:512:1: ( ruleBooleanLiteral EOF )
            // InternalRecordLang.g:513:1: ruleBooleanLiteral EOF
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
    // InternalRecordLang.g:520:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:524:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:525:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:525:1: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalRecordLang.g:526:1: ( rule__BooleanLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:527:1: ( rule__BooleanLiteral__ValueAssignment )
            // InternalRecordLang.g:527:2: rule__BooleanLiteral__ValueAssignment
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
    // InternalRecordLang.g:539:1: entryRuleConstantLiteral : ruleConstantLiteral EOF ;
    public final void entryRuleConstantLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:540:1: ( ruleConstantLiteral EOF )
            // InternalRecordLang.g:541:1: ruleConstantLiteral EOF
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
    // InternalRecordLang.g:548:1: ruleConstantLiteral : ( ( rule__ConstantLiteral__ValueAssignment ) ) ;
    public final void ruleConstantLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:552:2: ( ( ( rule__ConstantLiteral__ValueAssignment ) ) )
            // InternalRecordLang.g:553:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            {
            // InternalRecordLang.g:553:1: ( ( rule__ConstantLiteral__ValueAssignment ) )
            // InternalRecordLang.g:554:1: ( rule__ConstantLiteral__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueAssignment()); 
            }
            // InternalRecordLang.g:555:1: ( rule__ConstantLiteral__ValueAssignment )
            // InternalRecordLang.g:555:2: rule__ConstantLiteral__ValueAssignment
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
    // InternalRecordLang.g:567:1: entryRuleBuiltInValueLiteral : ruleBuiltInValueLiteral EOF ;
    public final void entryRuleBuiltInValueLiteral() throws RecognitionException {
        try {
            // InternalRecordLang.g:568:1: ( ruleBuiltInValueLiteral EOF )
            // InternalRecordLang.g:569:1: ruleBuiltInValueLiteral EOF
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
    // InternalRecordLang.g:576:1: ruleBuiltInValueLiteral : ( ( rule__BuiltInValueLiteral__Group__0 ) ) ;
    public final void ruleBuiltInValueLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:580:2: ( ( ( rule__BuiltInValueLiteral__Group__0 ) ) )
            // InternalRecordLang.g:581:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            {
            // InternalRecordLang.g:581:1: ( ( rule__BuiltInValueLiteral__Group__0 ) )
            // InternalRecordLang.g:582:1: ( rule__BuiltInValueLiteral__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getGroup()); 
            }
            // InternalRecordLang.g:583:1: ( rule__BuiltInValueLiteral__Group__0 )
            // InternalRecordLang.g:583:2: rule__BuiltInValueLiteral__Group__0
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
    // InternalRecordLang.g:595:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalRecordLang.g:596:1: ( ruleQualifiedName EOF )
            // InternalRecordLang.g:597:1: ruleQualifiedName EOF
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
    // InternalRecordLang.g:604:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:608:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalRecordLang.g:609:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalRecordLang.g:609:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalRecordLang.g:610:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalRecordLang.g:611:1: ( rule__QualifiedName__Group__0 )
            // InternalRecordLang.g:611:2: rule__QualifiedName__Group__0
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
    // InternalRecordLang.g:623:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalRecordLang.g:624:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalRecordLang.g:625:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalRecordLang.g:632:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:636:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalRecordLang.g:637:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalRecordLang.g:637:1: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalRecordLang.g:638:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalRecordLang.g:639:1: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalRecordLang.g:639:2: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalRecordLang.g:652:1: rulePropertyModifier : ( ( rule__PropertyModifier__Alternatives ) ) ;
    public final void rulePropertyModifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:656:1: ( ( ( rule__PropertyModifier__Alternatives ) ) )
            // InternalRecordLang.g:657:1: ( ( rule__PropertyModifier__Alternatives ) )
            {
            // InternalRecordLang.g:657:1: ( ( rule__PropertyModifier__Alternatives ) )
            // InternalRecordLang.g:658:1: ( rule__PropertyModifier__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyModifierAccess().getAlternatives()); 
            }
            // InternalRecordLang.g:659:1: ( rule__PropertyModifier__Alternatives )
            // InternalRecordLang.g:659:2: rule__PropertyModifier__Alternatives
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


    // $ANTLR start "rule__ComplexType__Alternatives"
    // InternalRecordLang.g:671:1: rule__ComplexType__Alternatives : ( ( ruleRecordType ) | ( ruleTemplateType ) );
    public final void rule__ComplexType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:675:1: ( ( ruleRecordType ) | ( ruleTemplateType ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 19:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_STRING) ) {
                    switch ( input.LA(3) ) {
                    case 20:
                        {
                        int LA1_2 = input.LA(4);

                        if ( (LA1_2==RULE_STRING) ) {
                            int LA1_6 = input.LA(5);

                            if ( (LA1_6==25||LA1_6==37) ) {
                                alt1=1;
                            }
                            else if ( (LA1_6==18) ) {
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
                    case 18:
                        {
                        alt1=2;
                        }
                        break;
                    case 25:
                    case 37:
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
            case 20:
                {
                int LA1_2 = input.LA(2);

                if ( (LA1_2==RULE_STRING) ) {
                    int LA1_6 = input.LA(3);

                    if ( (LA1_6==25||LA1_6==37) ) {
                        alt1=1;
                    }
                    else if ( (LA1_6==18) ) {
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
            case 25:
            case 37:
                {
                alt1=1;
                }
                break;
            case 18:
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
                    // InternalRecordLang.g:676:1: ( ruleRecordType )
                    {
                    // InternalRecordLang.g:676:1: ( ruleRecordType )
                    // InternalRecordLang.g:677:1: ruleRecordType
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
                    // InternalRecordLang.g:682:6: ( ruleTemplateType )
                    {
                    // InternalRecordLang.g:682:6: ( ruleTemplateType )
                    // InternalRecordLang.g:683:1: ruleTemplateType
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
    // InternalRecordLang.g:693:1: rule__TemplateType__Alternatives_5_1 : ( ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) ) );
    public final void rule__TemplateType__Alternatives_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:697:1: ( ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) ) | ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID||(LA2_0>=14 && LA2_0<=15)||LA2_0==29||LA2_0==31) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
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
                    // InternalRecordLang.g:698:1: ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) )
                    {
                    // InternalRecordLang.g:698:1: ( ( rule__TemplateType__PropertiesAssignment_5_1_0 ) )
                    // InternalRecordLang.g:699:1: ( rule__TemplateType__PropertiesAssignment_5_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemplateTypeAccess().getPropertiesAssignment_5_1_0()); 
                    }
                    // InternalRecordLang.g:700:1: ( rule__TemplateType__PropertiesAssignment_5_1_0 )
                    // InternalRecordLang.g:700:2: rule__TemplateType__PropertiesAssignment_5_1_0
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
                    // InternalRecordLang.g:704:6: ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) )
                    {
                    // InternalRecordLang.g:704:6: ( ( rule__TemplateType__ConstantsAssignment_5_1_1 ) )
                    // InternalRecordLang.g:705:1: ( rule__TemplateType__ConstantsAssignment_5_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemplateTypeAccess().getConstantsAssignment_5_1_1()); 
                    }
                    // InternalRecordLang.g:706:1: ( rule__TemplateType__ConstantsAssignment_5_1_1 )
                    // InternalRecordLang.g:706:2: rule__TemplateType__ConstantsAssignment_5_1_1
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
    // InternalRecordLang.g:715:1: rule__RecordType__Alternatives_7_1 : ( ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) ) );
    public final void rule__RecordType__Alternatives_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:719:1: ( ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) ) | ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID||(LA3_0>=14 && LA3_0<=15)||LA3_0==29||LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
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
                    // InternalRecordLang.g:720:1: ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) )
                    {
                    // InternalRecordLang.g:720:1: ( ( rule__RecordType__PropertiesAssignment_7_1_0 ) )
                    // InternalRecordLang.g:721:1: ( rule__RecordType__PropertiesAssignment_7_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getPropertiesAssignment_7_1_0()); 
                    }
                    // InternalRecordLang.g:722:1: ( rule__RecordType__PropertiesAssignment_7_1_0 )
                    // InternalRecordLang.g:722:2: rule__RecordType__PropertiesAssignment_7_1_0
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
                    // InternalRecordLang.g:726:6: ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) )
                    {
                    // InternalRecordLang.g:726:6: ( ( rule__RecordType__ConstantsAssignment_7_1_1 ) )
                    // InternalRecordLang.g:727:1: ( rule__RecordType__ConstantsAssignment_7_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRecordTypeAccess().getConstantsAssignment_7_1_1()); 
                    }
                    // InternalRecordLang.g:728:1: ( rule__RecordType__ConstantsAssignment_7_1_1 )
                    // InternalRecordLang.g:728:2: rule__RecordType__ConstantsAssignment_7_1_1
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
    // InternalRecordLang.g:737:1: rule__Property__Alternatives_2 : ( ( ( rule__Property__TypeAssignment_2_0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) );
    public final void rule__Property__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:741:1: ( ( ( rule__Property__TypeAssignment_2_0 ) ) | ( ( rule__Property__Group_2_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
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
                    // InternalRecordLang.g:742:1: ( ( rule__Property__TypeAssignment_2_0 ) )
                    {
                    // InternalRecordLang.g:742:1: ( ( rule__Property__TypeAssignment_2_0 ) )
                    // InternalRecordLang.g:743:1: ( rule__Property__TypeAssignment_2_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getTypeAssignment_2_0()); 
                    }
                    // InternalRecordLang.g:744:1: ( rule__Property__TypeAssignment_2_0 )
                    // InternalRecordLang.g:744:2: rule__Property__TypeAssignment_2_0
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
                    // InternalRecordLang.g:748:6: ( ( rule__Property__Group_2_1__0 ) )
                    {
                    // InternalRecordLang.g:748:6: ( ( rule__Property__Group_2_1__0 ) )
                    // InternalRecordLang.g:749:1: ( rule__Property__Group_2_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyAccess().getGroup_2_1()); 
                    }
                    // InternalRecordLang.g:750:1: ( rule__Property__Group_2_1__0 )
                    // InternalRecordLang.g:750:2: rule__Property__Group_2_1__0
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
    // InternalRecordLang.g:759:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:763:1: ( ( ruleStringLiteral ) | ( ruleIntLiteral ) | ( ruleFloatLiteral ) | ( ruleBooleanLiteral ) | ( ruleConstantLiteral ) | ( ruleArrayLiteral ) | ( ruleBuiltInValueLiteral ) )
            int alt5=7;
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
            case RULE_BOOLEAN:
                {
                alt5=4;
                }
                break;
            case RULE_ID:
                {
                alt5=5;
                }
                break;
            case 23:
                {
                alt5=6;
                }
                break;
            case 38:
                {
                alt5=7;
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
                    // InternalRecordLang.g:764:1: ( ruleStringLiteral )
                    {
                    // InternalRecordLang.g:764:1: ( ruleStringLiteral )
                    // InternalRecordLang.g:765:1: ruleStringLiteral
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
                    // InternalRecordLang.g:770:6: ( ruleIntLiteral )
                    {
                    // InternalRecordLang.g:770:6: ( ruleIntLiteral )
                    // InternalRecordLang.g:771:1: ruleIntLiteral
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
                    // InternalRecordLang.g:776:6: ( ruleFloatLiteral )
                    {
                    // InternalRecordLang.g:776:6: ( ruleFloatLiteral )
                    // InternalRecordLang.g:777:1: ruleFloatLiteral
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
                    // InternalRecordLang.g:782:6: ( ruleBooleanLiteral )
                    {
                    // InternalRecordLang.g:782:6: ( ruleBooleanLiteral )
                    // InternalRecordLang.g:783:1: ruleBooleanLiteral
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
                    // InternalRecordLang.g:788:6: ( ruleConstantLiteral )
                    {
                    // InternalRecordLang.g:788:6: ( ruleConstantLiteral )
                    // InternalRecordLang.g:789:1: ruleConstantLiteral
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
                    // InternalRecordLang.g:794:6: ( ruleArrayLiteral )
                    {
                    // InternalRecordLang.g:794:6: ( ruleArrayLiteral )
                    // InternalRecordLang.g:795:1: ruleArrayLiteral
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
                    // InternalRecordLang.g:800:6: ( ruleBuiltInValueLiteral )
                    {
                    // InternalRecordLang.g:800:6: ( ruleBuiltInValueLiteral )
                    // InternalRecordLang.g:801:1: ruleBuiltInValueLiteral
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
    // InternalRecordLang.g:811:1: rule__PropertyModifier__Alternatives : ( ( ( 'transient' ) ) | ( ( 'auto-increment' ) ) );
    public final void rule__PropertyModifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:815:1: ( ( ( 'transient' ) ) | ( ( 'auto-increment' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            else if ( (LA6_0==15) ) {
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
                    // InternalRecordLang.g:816:1: ( ( 'transient' ) )
                    {
                    // InternalRecordLang.g:816:1: ( ( 'transient' ) )
                    // InternalRecordLang.g:817:1: ( 'transient' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyModifierAccess().getTRANSIENTEnumLiteralDeclaration_0()); 
                    }
                    // InternalRecordLang.g:818:1: ( 'transient' )
                    // InternalRecordLang.g:818:3: 'transient'
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
                    // InternalRecordLang.g:823:6: ( ( 'auto-increment' ) )
                    {
                    // InternalRecordLang.g:823:6: ( ( 'auto-increment' ) )
                    // InternalRecordLang.g:824:1: ( 'auto-increment' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyModifierAccess().getINCREMENTEnumLiteralDeclaration_1()); 
                    }
                    // InternalRecordLang.g:825:1: ( 'auto-increment' )
                    // InternalRecordLang.g:825:3: 'auto-increment'
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
    // InternalRecordLang.g:837:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:841:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalRecordLang.g:842:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalRecordLang.g:849:1: rule__Model__Group__0__Impl : ( 'package' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:853:1: ( ( 'package' ) )
            // InternalRecordLang.g:854:1: ( 'package' )
            {
            // InternalRecordLang.g:854:1: ( 'package' )
            // InternalRecordLang.g:855:1: 'package'
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
    // InternalRecordLang.g:868:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:872:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalRecordLang.g:873:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalRecordLang.g:880:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:884:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalRecordLang.g:885:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalRecordLang.g:885:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalRecordLang.g:886:1: ( rule__Model__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            }
            // InternalRecordLang.g:887:1: ( rule__Model__NameAssignment_1 )
            // InternalRecordLang.g:887:2: rule__Model__NameAssignment_1
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
    // InternalRecordLang.g:897:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:901:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalRecordLang.g:902:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalRecordLang.g:909:1: rule__Model__Group__2__Impl : ( ( rule__Model__ImportsAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:913:1: ( ( ( rule__Model__ImportsAssignment_2 )* ) )
            // InternalRecordLang.g:914:1: ( ( rule__Model__ImportsAssignment_2 )* )
            {
            // InternalRecordLang.g:914:1: ( ( rule__Model__ImportsAssignment_2 )* )
            // InternalRecordLang.g:915:1: ( rule__Model__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getImportsAssignment_2()); 
            }
            // InternalRecordLang.g:916:1: ( rule__Model__ImportsAssignment_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRecordLang.g:916:2: rule__Model__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalRecordLang.g:926:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:930:1: ( rule__Model__Group__3__Impl )
            // InternalRecordLang.g:931:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalRecordLang.g:937:1: rule__Model__Group__3__Impl : ( ( rule__Model__TypesAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:941:1: ( ( ( rule__Model__TypesAssignment_3 )* ) )
            // InternalRecordLang.g:942:1: ( ( rule__Model__TypesAssignment_3 )* )
            {
            // InternalRecordLang.g:942:1: ( ( rule__Model__TypesAssignment_3 )* )
            // InternalRecordLang.g:943:1: ( rule__Model__TypesAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getTypesAssignment_3()); 
            }
            // InternalRecordLang.g:944:1: ( rule__Model__TypesAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=18 && LA8_0<=20)||LA8_0==25||LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRecordLang.g:944:2: rule__Model__TypesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__TypesAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
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


    // $ANTLR start "rule__Import__Group__0"
    // InternalRecordLang.g:962:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:966:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalRecordLang.g:967:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalRecordLang.g:974:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:978:1: ( ( 'import' ) )
            // InternalRecordLang.g:979:1: ( 'import' )
            {
            // InternalRecordLang.g:979:1: ( 'import' )
            // InternalRecordLang.g:980:1: 'import'
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
    // InternalRecordLang.g:993:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:997:1: ( rule__Import__Group__1__Impl )
            // InternalRecordLang.g:998:2: rule__Import__Group__1__Impl
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
    // InternalRecordLang.g:1004:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1008:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalRecordLang.g:1009:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalRecordLang.g:1009:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalRecordLang.g:1010:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalRecordLang.g:1011:1: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalRecordLang.g:1011:2: rule__Import__ImportedNamespaceAssignment_1
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


    // $ANTLR start "rule__TemplateType__Group__0"
    // InternalRecordLang.g:1025:1: rule__TemplateType__Group__0 : rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1 ;
    public final void rule__TemplateType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1029:1: ( rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1 )
            // InternalRecordLang.g:1030:2: rule__TemplateType__Group__0__Impl rule__TemplateType__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalRecordLang.g:1037:1: rule__TemplateType__Group__0__Impl : ( ( rule__TemplateType__Group_0__0 )? ) ;
    public final void rule__TemplateType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1041:1: ( ( ( rule__TemplateType__Group_0__0 )? ) )
            // InternalRecordLang.g:1042:1: ( ( rule__TemplateType__Group_0__0 )? )
            {
            // InternalRecordLang.g:1042:1: ( ( rule__TemplateType__Group_0__0 )? )
            // InternalRecordLang.g:1043:1: ( rule__TemplateType__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_0()); 
            }
            // InternalRecordLang.g:1044:1: ( rule__TemplateType__Group_0__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRecordLang.g:1044:2: rule__TemplateType__Group_0__0
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
    // InternalRecordLang.g:1054:1: rule__TemplateType__Group__1 : rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2 ;
    public final void rule__TemplateType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1058:1: ( rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2 )
            // InternalRecordLang.g:1059:2: rule__TemplateType__Group__1__Impl rule__TemplateType__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalRecordLang.g:1066:1: rule__TemplateType__Group__1__Impl : ( ( rule__TemplateType__Group_1__0 )? ) ;
    public final void rule__TemplateType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1070:1: ( ( ( rule__TemplateType__Group_1__0 )? ) )
            // InternalRecordLang.g:1071:1: ( ( rule__TemplateType__Group_1__0 )? )
            {
            // InternalRecordLang.g:1071:1: ( ( rule__TemplateType__Group_1__0 )? )
            // InternalRecordLang.g:1072:1: ( rule__TemplateType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:1073:1: ( rule__TemplateType__Group_1__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRecordLang.g:1073:2: rule__TemplateType__Group_1__0
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
    // InternalRecordLang.g:1083:1: rule__TemplateType__Group__2 : rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3 ;
    public final void rule__TemplateType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1087:1: ( rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3 )
            // InternalRecordLang.g:1088:2: rule__TemplateType__Group__2__Impl rule__TemplateType__Group__3
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
    // InternalRecordLang.g:1095:1: rule__TemplateType__Group__2__Impl : ( 'template' ) ;
    public final void rule__TemplateType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1099:1: ( ( 'template' ) )
            // InternalRecordLang.g:1100:1: ( 'template' )
            {
            // InternalRecordLang.g:1100:1: ( 'template' )
            // InternalRecordLang.g:1101:1: 'template'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getTemplateKeyword_2()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1114:1: rule__TemplateType__Group__3 : rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4 ;
    public final void rule__TemplateType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1118:1: ( rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4 )
            // InternalRecordLang.g:1119:2: rule__TemplateType__Group__3__Impl rule__TemplateType__Group__4
            {
            pushFollow(FOLLOW_8);
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
    // InternalRecordLang.g:1126:1: rule__TemplateType__Group__3__Impl : ( ( rule__TemplateType__NameAssignment_3 ) ) ;
    public final void rule__TemplateType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1130:1: ( ( ( rule__TemplateType__NameAssignment_3 ) ) )
            // InternalRecordLang.g:1131:1: ( ( rule__TemplateType__NameAssignment_3 ) )
            {
            // InternalRecordLang.g:1131:1: ( ( rule__TemplateType__NameAssignment_3 ) )
            // InternalRecordLang.g:1132:1: ( rule__TemplateType__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getNameAssignment_3()); 
            }
            // InternalRecordLang.g:1133:1: ( rule__TemplateType__NameAssignment_3 )
            // InternalRecordLang.g:1133:2: rule__TemplateType__NameAssignment_3
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
    // InternalRecordLang.g:1143:1: rule__TemplateType__Group__4 : rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5 ;
    public final void rule__TemplateType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1147:1: ( rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5 )
            // InternalRecordLang.g:1148:2: rule__TemplateType__Group__4__Impl rule__TemplateType__Group__5
            {
            pushFollow(FOLLOW_8);
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
    // InternalRecordLang.g:1155:1: rule__TemplateType__Group__4__Impl : ( ( rule__TemplateType__Group_4__0 )? ) ;
    public final void rule__TemplateType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1159:1: ( ( ( rule__TemplateType__Group_4__0 )? ) )
            // InternalRecordLang.g:1160:1: ( ( rule__TemplateType__Group_4__0 )? )
            {
            // InternalRecordLang.g:1160:1: ( ( rule__TemplateType__Group_4__0 )? )
            // InternalRecordLang.g:1161:1: ( rule__TemplateType__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_4()); 
            }
            // InternalRecordLang.g:1162:1: ( rule__TemplateType__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRecordLang.g:1162:2: rule__TemplateType__Group_4__0
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
    // InternalRecordLang.g:1172:1: rule__TemplateType__Group__5 : rule__TemplateType__Group__5__Impl ;
    public final void rule__TemplateType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1176:1: ( rule__TemplateType__Group__5__Impl )
            // InternalRecordLang.g:1177:2: rule__TemplateType__Group__5__Impl
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
    // InternalRecordLang.g:1183:1: rule__TemplateType__Group__5__Impl : ( ( rule__TemplateType__Group_5__0 )? ) ;
    public final void rule__TemplateType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1187:1: ( ( ( rule__TemplateType__Group_5__0 )? ) )
            // InternalRecordLang.g:1188:1: ( ( rule__TemplateType__Group_5__0 )? )
            {
            // InternalRecordLang.g:1188:1: ( ( rule__TemplateType__Group_5__0 )? )
            // InternalRecordLang.g:1189:1: ( rule__TemplateType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_5()); 
            }
            // InternalRecordLang.g:1190:1: ( rule__TemplateType__Group_5__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRecordLang.g:1190:2: rule__TemplateType__Group_5__0
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
    // InternalRecordLang.g:1212:1: rule__TemplateType__Group_0__0 : rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1 ;
    public final void rule__TemplateType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1216:1: ( rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1 )
            // InternalRecordLang.g:1217:2: rule__TemplateType__Group_0__0__Impl rule__TemplateType__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecordLang.g:1224:1: rule__TemplateType__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__TemplateType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1228:1: ( ( '@author' ) )
            // InternalRecordLang.g:1229:1: ( '@author' )
            {
            // InternalRecordLang.g:1229:1: ( '@author' )
            // InternalRecordLang.g:1230:1: '@author'
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
    // InternalRecordLang.g:1243:1: rule__TemplateType__Group_0__1 : rule__TemplateType__Group_0__1__Impl ;
    public final void rule__TemplateType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1247:1: ( rule__TemplateType__Group_0__1__Impl )
            // InternalRecordLang.g:1248:2: rule__TemplateType__Group_0__1__Impl
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
    // InternalRecordLang.g:1254:1: rule__TemplateType__Group_0__1__Impl : ( ( rule__TemplateType__AuthorAssignment_0_1 ) ) ;
    public final void rule__TemplateType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1258:1: ( ( ( rule__TemplateType__AuthorAssignment_0_1 ) ) )
            // InternalRecordLang.g:1259:1: ( ( rule__TemplateType__AuthorAssignment_0_1 ) )
            {
            // InternalRecordLang.g:1259:1: ( ( rule__TemplateType__AuthorAssignment_0_1 ) )
            // InternalRecordLang.g:1260:1: ( rule__TemplateType__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAuthorAssignment_0_1()); 
            }
            // InternalRecordLang.g:1261:1: ( rule__TemplateType__AuthorAssignment_0_1 )
            // InternalRecordLang.g:1261:2: rule__TemplateType__AuthorAssignment_0_1
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
    // InternalRecordLang.g:1275:1: rule__TemplateType__Group_1__0 : rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1 ;
    public final void rule__TemplateType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1279:1: ( rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1 )
            // InternalRecordLang.g:1280:2: rule__TemplateType__Group_1__0__Impl rule__TemplateType__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecordLang.g:1287:1: rule__TemplateType__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__TemplateType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1291:1: ( ( '@since' ) )
            // InternalRecordLang.g:1292:1: ( '@since' )
            {
            // InternalRecordLang.g:1292:1: ( '@since' )
            // InternalRecordLang.g:1293:1: '@since'
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
    // InternalRecordLang.g:1306:1: rule__TemplateType__Group_1__1 : rule__TemplateType__Group_1__1__Impl ;
    public final void rule__TemplateType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1310:1: ( rule__TemplateType__Group_1__1__Impl )
            // InternalRecordLang.g:1311:2: rule__TemplateType__Group_1__1__Impl
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
    // InternalRecordLang.g:1317:1: rule__TemplateType__Group_1__1__Impl : ( ( rule__TemplateType__SinceAssignment_1_1 ) ) ;
    public final void rule__TemplateType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1321:1: ( ( ( rule__TemplateType__SinceAssignment_1_1 ) ) )
            // InternalRecordLang.g:1322:1: ( ( rule__TemplateType__SinceAssignment_1_1 ) )
            {
            // InternalRecordLang.g:1322:1: ( ( rule__TemplateType__SinceAssignment_1_1 ) )
            // InternalRecordLang.g:1323:1: ( rule__TemplateType__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getSinceAssignment_1_1()); 
            }
            // InternalRecordLang.g:1324:1: ( rule__TemplateType__SinceAssignment_1_1 )
            // InternalRecordLang.g:1324:2: rule__TemplateType__SinceAssignment_1_1
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
    // InternalRecordLang.g:1338:1: rule__TemplateType__Group_4__0 : rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1 ;
    public final void rule__TemplateType__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1342:1: ( rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1 )
            // InternalRecordLang.g:1343:2: rule__TemplateType__Group_4__0__Impl rule__TemplateType__Group_4__1
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
    // InternalRecordLang.g:1350:1: rule__TemplateType__Group_4__0__Impl : ( ':' ) ;
    public final void rule__TemplateType__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1354:1: ( ( ':' ) )
            // InternalRecordLang.g:1355:1: ( ':' )
            {
            // InternalRecordLang.g:1355:1: ( ':' )
            // InternalRecordLang.g:1356:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getColonKeyword_4_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1369:1: rule__TemplateType__Group_4__1 : rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2 ;
    public final void rule__TemplateType__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1373:1: ( rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2 )
            // InternalRecordLang.g:1374:2: rule__TemplateType__Group_4__1__Impl rule__TemplateType__Group_4__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalRecordLang.g:1381:1: rule__TemplateType__Group_4__1__Impl : ( ( rule__TemplateType__ParentsAssignment_4_1 ) ) ;
    public final void rule__TemplateType__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1385:1: ( ( ( rule__TemplateType__ParentsAssignment_4_1 ) ) )
            // InternalRecordLang.g:1386:1: ( ( rule__TemplateType__ParentsAssignment_4_1 ) )
            {
            // InternalRecordLang.g:1386:1: ( ( rule__TemplateType__ParentsAssignment_4_1 ) )
            // InternalRecordLang.g:1387:1: ( rule__TemplateType__ParentsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsAssignment_4_1()); 
            }
            // InternalRecordLang.g:1388:1: ( rule__TemplateType__ParentsAssignment_4_1 )
            // InternalRecordLang.g:1388:2: rule__TemplateType__ParentsAssignment_4_1
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
    // InternalRecordLang.g:1398:1: rule__TemplateType__Group_4__2 : rule__TemplateType__Group_4__2__Impl ;
    public final void rule__TemplateType__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1402:1: ( rule__TemplateType__Group_4__2__Impl )
            // InternalRecordLang.g:1403:2: rule__TemplateType__Group_4__2__Impl
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
    // InternalRecordLang.g:1409:1: rule__TemplateType__Group_4__2__Impl : ( ( rule__TemplateType__Group_4_2__0 )* ) ;
    public final void rule__TemplateType__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1413:1: ( ( ( rule__TemplateType__Group_4_2__0 )* ) )
            // InternalRecordLang.g:1414:1: ( ( rule__TemplateType__Group_4_2__0 )* )
            {
            // InternalRecordLang.g:1414:1: ( ( rule__TemplateType__Group_4_2__0 )* )
            // InternalRecordLang.g:1415:1: ( rule__TemplateType__Group_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getGroup_4_2()); 
            }
            // InternalRecordLang.g:1416:1: ( rule__TemplateType__Group_4_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRecordLang.g:1416:2: rule__TemplateType__Group_4_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TemplateType__Group_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalRecordLang.g:1432:1: rule__TemplateType__Group_4_2__0 : rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1 ;
    public final void rule__TemplateType__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1436:1: ( rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1 )
            // InternalRecordLang.g:1437:2: rule__TemplateType__Group_4_2__0__Impl rule__TemplateType__Group_4_2__1
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
    // InternalRecordLang.g:1444:1: rule__TemplateType__Group_4_2__0__Impl : ( ',' ) ;
    public final void rule__TemplateType__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1448:1: ( ( ',' ) )
            // InternalRecordLang.g:1449:1: ( ',' )
            {
            // InternalRecordLang.g:1449:1: ( ',' )
            // InternalRecordLang.g:1450:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getCommaKeyword_4_2_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1463:1: rule__TemplateType__Group_4_2__1 : rule__TemplateType__Group_4_2__1__Impl ;
    public final void rule__TemplateType__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1467:1: ( rule__TemplateType__Group_4_2__1__Impl )
            // InternalRecordLang.g:1468:2: rule__TemplateType__Group_4_2__1__Impl
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
    // InternalRecordLang.g:1474:1: rule__TemplateType__Group_4_2__1__Impl : ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) ) ;
    public final void rule__TemplateType__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1478:1: ( ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) ) )
            // InternalRecordLang.g:1479:1: ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) )
            {
            // InternalRecordLang.g:1479:1: ( ( rule__TemplateType__ParentsAssignment_4_2_1 ) )
            // InternalRecordLang.g:1480:1: ( rule__TemplateType__ParentsAssignment_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsAssignment_4_2_1()); 
            }
            // InternalRecordLang.g:1481:1: ( rule__TemplateType__ParentsAssignment_4_2_1 )
            // InternalRecordLang.g:1481:2: rule__TemplateType__ParentsAssignment_4_2_1
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
    // InternalRecordLang.g:1495:1: rule__TemplateType__Group_5__0 : rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1 ;
    public final void rule__TemplateType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1499:1: ( rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1 )
            // InternalRecordLang.g:1500:2: rule__TemplateType__Group_5__0__Impl rule__TemplateType__Group_5__1
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
    // InternalRecordLang.g:1507:1: rule__TemplateType__Group_5__0__Impl : ( '{' ) ;
    public final void rule__TemplateType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1511:1: ( ( '{' ) )
            // InternalRecordLang.g:1512:1: ( '{' )
            {
            // InternalRecordLang.g:1512:1: ( '{' )
            // InternalRecordLang.g:1513:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getLeftCurlyBracketKeyword_5_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1526:1: rule__TemplateType__Group_5__1 : rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2 ;
    public final void rule__TemplateType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1530:1: ( rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2 )
            // InternalRecordLang.g:1531:2: rule__TemplateType__Group_5__1__Impl rule__TemplateType__Group_5__2
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
    // InternalRecordLang.g:1538:1: rule__TemplateType__Group_5__1__Impl : ( ( rule__TemplateType__Alternatives_5_1 )* ) ;
    public final void rule__TemplateType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1542:1: ( ( ( rule__TemplateType__Alternatives_5_1 )* ) )
            // InternalRecordLang.g:1543:1: ( ( rule__TemplateType__Alternatives_5_1 )* )
            {
            // InternalRecordLang.g:1543:1: ( ( rule__TemplateType__Alternatives_5_1 )* )
            // InternalRecordLang.g:1544:1: ( rule__TemplateType__Alternatives_5_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getAlternatives_5_1()); 
            }
            // InternalRecordLang.g:1545:1: ( rule__TemplateType__Alternatives_5_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID||(LA14_0>=14 && LA14_0<=15)||LA14_0==27||LA14_0==29||LA14_0==31) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRecordLang.g:1545:2: rule__TemplateType__Alternatives_5_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__TemplateType__Alternatives_5_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalRecordLang.g:1555:1: rule__TemplateType__Group_5__2 : rule__TemplateType__Group_5__2__Impl ;
    public final void rule__TemplateType__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1559:1: ( rule__TemplateType__Group_5__2__Impl )
            // InternalRecordLang.g:1560:2: rule__TemplateType__Group_5__2__Impl
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
    // InternalRecordLang.g:1566:1: rule__TemplateType__Group_5__2__Impl : ( '}' ) ;
    public final void rule__TemplateType__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1570:1: ( ( '}' ) )
            // InternalRecordLang.g:1571:1: ( '}' )
            {
            // InternalRecordLang.g:1571:1: ( '}' )
            // InternalRecordLang.g:1572:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getRightCurlyBracketKeyword_5_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1591:1: rule__RecordType__Group__0 : rule__RecordType__Group__0__Impl rule__RecordType__Group__1 ;
    public final void rule__RecordType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1595:1: ( rule__RecordType__Group__0__Impl rule__RecordType__Group__1 )
            // InternalRecordLang.g:1596:2: rule__RecordType__Group__0__Impl rule__RecordType__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRecordLang.g:1603:1: rule__RecordType__Group__0__Impl : ( ( rule__RecordType__Group_0__0 )? ) ;
    public final void rule__RecordType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1607:1: ( ( ( rule__RecordType__Group_0__0 )? ) )
            // InternalRecordLang.g:1608:1: ( ( rule__RecordType__Group_0__0 )? )
            {
            // InternalRecordLang.g:1608:1: ( ( rule__RecordType__Group_0__0 )? )
            // InternalRecordLang.g:1609:1: ( rule__RecordType__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_0()); 
            }
            // InternalRecordLang.g:1610:1: ( rule__RecordType__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRecordLang.g:1610:2: rule__RecordType__Group_0__0
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
    // InternalRecordLang.g:1620:1: rule__RecordType__Group__1 : rule__RecordType__Group__1__Impl rule__RecordType__Group__2 ;
    public final void rule__RecordType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1624:1: ( rule__RecordType__Group__1__Impl rule__RecordType__Group__2 )
            // InternalRecordLang.g:1625:2: rule__RecordType__Group__1__Impl rule__RecordType__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalRecordLang.g:1632:1: rule__RecordType__Group__1__Impl : ( ( rule__RecordType__Group_1__0 )? ) ;
    public final void rule__RecordType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1636:1: ( ( ( rule__RecordType__Group_1__0 )? ) )
            // InternalRecordLang.g:1637:1: ( ( rule__RecordType__Group_1__0 )? )
            {
            // InternalRecordLang.g:1637:1: ( ( rule__RecordType__Group_1__0 )? )
            // InternalRecordLang.g:1638:1: ( rule__RecordType__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:1639:1: ( rule__RecordType__Group_1__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRecordLang.g:1639:2: rule__RecordType__Group_1__0
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
    // InternalRecordLang.g:1649:1: rule__RecordType__Group__2 : rule__RecordType__Group__2__Impl rule__RecordType__Group__3 ;
    public final void rule__RecordType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1653:1: ( rule__RecordType__Group__2__Impl rule__RecordType__Group__3 )
            // InternalRecordLang.g:1654:2: rule__RecordType__Group__2__Impl rule__RecordType__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalRecordLang.g:1661:1: rule__RecordType__Group__2__Impl : ( ( rule__RecordType__AbstractAssignment_2 )? ) ;
    public final void rule__RecordType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1665:1: ( ( ( rule__RecordType__AbstractAssignment_2 )? ) )
            // InternalRecordLang.g:1666:1: ( ( rule__RecordType__AbstractAssignment_2 )? )
            {
            // InternalRecordLang.g:1666:1: ( ( rule__RecordType__AbstractAssignment_2 )? )
            // InternalRecordLang.g:1667:1: ( rule__RecordType__AbstractAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAssignment_2()); 
            }
            // InternalRecordLang.g:1668:1: ( rule__RecordType__AbstractAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRecordLang.g:1668:2: rule__RecordType__AbstractAssignment_2
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
    // InternalRecordLang.g:1678:1: rule__RecordType__Group__3 : rule__RecordType__Group__3__Impl rule__RecordType__Group__4 ;
    public final void rule__RecordType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1682:1: ( rule__RecordType__Group__3__Impl rule__RecordType__Group__4 )
            // InternalRecordLang.g:1683:2: rule__RecordType__Group__3__Impl rule__RecordType__Group__4
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
    // InternalRecordLang.g:1690:1: rule__RecordType__Group__3__Impl : ( 'entity' ) ;
    public final void rule__RecordType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1694:1: ( ( 'entity' ) )
            // InternalRecordLang.g:1695:1: ( 'entity' )
            {
            // InternalRecordLang.g:1695:1: ( 'entity' )
            // InternalRecordLang.g:1696:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getEntityKeyword_3()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1709:1: rule__RecordType__Group__4 : rule__RecordType__Group__4__Impl rule__RecordType__Group__5 ;
    public final void rule__RecordType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1713:1: ( rule__RecordType__Group__4__Impl rule__RecordType__Group__5 )
            // InternalRecordLang.g:1714:2: rule__RecordType__Group__4__Impl rule__RecordType__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalRecordLang.g:1721:1: rule__RecordType__Group__4__Impl : ( ( rule__RecordType__NameAssignment_4 ) ) ;
    public final void rule__RecordType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1725:1: ( ( ( rule__RecordType__NameAssignment_4 ) ) )
            // InternalRecordLang.g:1726:1: ( ( rule__RecordType__NameAssignment_4 ) )
            {
            // InternalRecordLang.g:1726:1: ( ( rule__RecordType__NameAssignment_4 ) )
            // InternalRecordLang.g:1727:1: ( rule__RecordType__NameAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getNameAssignment_4()); 
            }
            // InternalRecordLang.g:1728:1: ( rule__RecordType__NameAssignment_4 )
            // InternalRecordLang.g:1728:2: rule__RecordType__NameAssignment_4
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
    // InternalRecordLang.g:1738:1: rule__RecordType__Group__5 : rule__RecordType__Group__5__Impl rule__RecordType__Group__6 ;
    public final void rule__RecordType__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1742:1: ( rule__RecordType__Group__5__Impl rule__RecordType__Group__6 )
            // InternalRecordLang.g:1743:2: rule__RecordType__Group__5__Impl rule__RecordType__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalRecordLang.g:1750:1: rule__RecordType__Group__5__Impl : ( ( rule__RecordType__Group_5__0 )? ) ;
    public final void rule__RecordType__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1754:1: ( ( ( rule__RecordType__Group_5__0 )? ) )
            // InternalRecordLang.g:1755:1: ( ( rule__RecordType__Group_5__0 )? )
            {
            // InternalRecordLang.g:1755:1: ( ( rule__RecordType__Group_5__0 )? )
            // InternalRecordLang.g:1756:1: ( rule__RecordType__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_5()); 
            }
            // InternalRecordLang.g:1757:1: ( rule__RecordType__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRecordLang.g:1757:2: rule__RecordType__Group_5__0
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
    // InternalRecordLang.g:1767:1: rule__RecordType__Group__6 : rule__RecordType__Group__6__Impl rule__RecordType__Group__7 ;
    public final void rule__RecordType__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1771:1: ( rule__RecordType__Group__6__Impl rule__RecordType__Group__7 )
            // InternalRecordLang.g:1772:2: rule__RecordType__Group__6__Impl rule__RecordType__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalRecordLang.g:1779:1: rule__RecordType__Group__6__Impl : ( ( rule__RecordType__Group_6__0 )? ) ;
    public final void rule__RecordType__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1783:1: ( ( ( rule__RecordType__Group_6__0 )? ) )
            // InternalRecordLang.g:1784:1: ( ( rule__RecordType__Group_6__0 )? )
            {
            // InternalRecordLang.g:1784:1: ( ( rule__RecordType__Group_6__0 )? )
            // InternalRecordLang.g:1785:1: ( rule__RecordType__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_6()); 
            }
            // InternalRecordLang.g:1786:1: ( rule__RecordType__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRecordLang.g:1786:2: rule__RecordType__Group_6__0
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
    // InternalRecordLang.g:1796:1: rule__RecordType__Group__7 : rule__RecordType__Group__7__Impl ;
    public final void rule__RecordType__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1800:1: ( rule__RecordType__Group__7__Impl )
            // InternalRecordLang.g:1801:2: rule__RecordType__Group__7__Impl
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
    // InternalRecordLang.g:1807:1: rule__RecordType__Group__7__Impl : ( ( rule__RecordType__Group_7__0 )? ) ;
    public final void rule__RecordType__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1811:1: ( ( ( rule__RecordType__Group_7__0 )? ) )
            // InternalRecordLang.g:1812:1: ( ( rule__RecordType__Group_7__0 )? )
            {
            // InternalRecordLang.g:1812:1: ( ( rule__RecordType__Group_7__0 )? )
            // InternalRecordLang.g:1813:1: ( rule__RecordType__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_7()); 
            }
            // InternalRecordLang.g:1814:1: ( rule__RecordType__Group_7__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRecordLang.g:1814:2: rule__RecordType__Group_7__0
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
    // InternalRecordLang.g:1840:1: rule__RecordType__Group_0__0 : rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1 ;
    public final void rule__RecordType__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1844:1: ( rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1 )
            // InternalRecordLang.g:1845:2: rule__RecordType__Group_0__0__Impl rule__RecordType__Group_0__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecordLang.g:1852:1: rule__RecordType__Group_0__0__Impl : ( '@author' ) ;
    public final void rule__RecordType__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1856:1: ( ( '@author' ) )
            // InternalRecordLang.g:1857:1: ( '@author' )
            {
            // InternalRecordLang.g:1857:1: ( '@author' )
            // InternalRecordLang.g:1858:1: '@author'
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
    // InternalRecordLang.g:1871:1: rule__RecordType__Group_0__1 : rule__RecordType__Group_0__1__Impl ;
    public final void rule__RecordType__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1875:1: ( rule__RecordType__Group_0__1__Impl )
            // InternalRecordLang.g:1876:2: rule__RecordType__Group_0__1__Impl
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
    // InternalRecordLang.g:1882:1: rule__RecordType__Group_0__1__Impl : ( ( rule__RecordType__AuthorAssignment_0_1 ) ) ;
    public final void rule__RecordType__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1886:1: ( ( ( rule__RecordType__AuthorAssignment_0_1 ) ) )
            // InternalRecordLang.g:1887:1: ( ( rule__RecordType__AuthorAssignment_0_1 ) )
            {
            // InternalRecordLang.g:1887:1: ( ( rule__RecordType__AuthorAssignment_0_1 ) )
            // InternalRecordLang.g:1888:1: ( rule__RecordType__AuthorAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAuthorAssignment_0_1()); 
            }
            // InternalRecordLang.g:1889:1: ( rule__RecordType__AuthorAssignment_0_1 )
            // InternalRecordLang.g:1889:2: rule__RecordType__AuthorAssignment_0_1
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
    // InternalRecordLang.g:1903:1: rule__RecordType__Group_1__0 : rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1 ;
    public final void rule__RecordType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1907:1: ( rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1 )
            // InternalRecordLang.g:1908:2: rule__RecordType__Group_1__0__Impl rule__RecordType__Group_1__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalRecordLang.g:1915:1: rule__RecordType__Group_1__0__Impl : ( '@since' ) ;
    public final void rule__RecordType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1919:1: ( ( '@since' ) )
            // InternalRecordLang.g:1920:1: ( '@since' )
            {
            // InternalRecordLang.g:1920:1: ( '@since' )
            // InternalRecordLang.g:1921:1: '@since'
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
    // InternalRecordLang.g:1934:1: rule__RecordType__Group_1__1 : rule__RecordType__Group_1__1__Impl ;
    public final void rule__RecordType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1938:1: ( rule__RecordType__Group_1__1__Impl )
            // InternalRecordLang.g:1939:2: rule__RecordType__Group_1__1__Impl
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
    // InternalRecordLang.g:1945:1: rule__RecordType__Group_1__1__Impl : ( ( rule__RecordType__SinceAssignment_1_1 ) ) ;
    public final void rule__RecordType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1949:1: ( ( ( rule__RecordType__SinceAssignment_1_1 ) ) )
            // InternalRecordLang.g:1950:1: ( ( rule__RecordType__SinceAssignment_1_1 ) )
            {
            // InternalRecordLang.g:1950:1: ( ( rule__RecordType__SinceAssignment_1_1 ) )
            // InternalRecordLang.g:1951:1: ( rule__RecordType__SinceAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getSinceAssignment_1_1()); 
            }
            // InternalRecordLang.g:1952:1: ( rule__RecordType__SinceAssignment_1_1 )
            // InternalRecordLang.g:1952:2: rule__RecordType__SinceAssignment_1_1
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
    // InternalRecordLang.g:1966:1: rule__RecordType__Group_5__0 : rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 ;
    public final void rule__RecordType__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1970:1: ( rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1 )
            // InternalRecordLang.g:1971:2: rule__RecordType__Group_5__0__Impl rule__RecordType__Group_5__1
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
    // InternalRecordLang.g:1978:1: rule__RecordType__Group_5__0__Impl : ( 'extends' ) ;
    public final void rule__RecordType__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:1982:1: ( ( 'extends' ) )
            // InternalRecordLang.g:1983:1: ( 'extends' )
            {
            // InternalRecordLang.g:1983:1: ( 'extends' )
            // InternalRecordLang.g:1984:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getExtendsKeyword_5_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:1997:1: rule__RecordType__Group_5__1 : rule__RecordType__Group_5__1__Impl ;
    public final void rule__RecordType__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2001:1: ( rule__RecordType__Group_5__1__Impl )
            // InternalRecordLang.g:2002:2: rule__RecordType__Group_5__1__Impl
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
    // InternalRecordLang.g:2008:1: rule__RecordType__Group_5__1__Impl : ( ( rule__RecordType__ParentAssignment_5_1 ) ) ;
    public final void rule__RecordType__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2012:1: ( ( ( rule__RecordType__ParentAssignment_5_1 ) ) )
            // InternalRecordLang.g:2013:1: ( ( rule__RecordType__ParentAssignment_5_1 ) )
            {
            // InternalRecordLang.g:2013:1: ( ( rule__RecordType__ParentAssignment_5_1 ) )
            // InternalRecordLang.g:2014:1: ( rule__RecordType__ParentAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentAssignment_5_1()); 
            }
            // InternalRecordLang.g:2015:1: ( rule__RecordType__ParentAssignment_5_1 )
            // InternalRecordLang.g:2015:2: rule__RecordType__ParentAssignment_5_1
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
    // InternalRecordLang.g:2029:1: rule__RecordType__Group_6__0 : rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1 ;
    public final void rule__RecordType__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2033:1: ( rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1 )
            // InternalRecordLang.g:2034:2: rule__RecordType__Group_6__0__Impl rule__RecordType__Group_6__1
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
    // InternalRecordLang.g:2041:1: rule__RecordType__Group_6__0__Impl : ( ':' ) ;
    public final void rule__RecordType__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2045:1: ( ( ':' ) )
            // InternalRecordLang.g:2046:1: ( ':' )
            {
            // InternalRecordLang.g:2046:1: ( ':' )
            // InternalRecordLang.g:2047:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getColonKeyword_6_0()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2060:1: rule__RecordType__Group_6__1 : rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2 ;
    public final void rule__RecordType__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2064:1: ( rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2 )
            // InternalRecordLang.g:2065:2: rule__RecordType__Group_6__1__Impl rule__RecordType__Group_6__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalRecordLang.g:2072:1: rule__RecordType__Group_6__1__Impl : ( ( rule__RecordType__ParentsAssignment_6_1 ) ) ;
    public final void rule__RecordType__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2076:1: ( ( ( rule__RecordType__ParentsAssignment_6_1 ) ) )
            // InternalRecordLang.g:2077:1: ( ( rule__RecordType__ParentsAssignment_6_1 ) )
            {
            // InternalRecordLang.g:2077:1: ( ( rule__RecordType__ParentsAssignment_6_1 ) )
            // InternalRecordLang.g:2078:1: ( rule__RecordType__ParentsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_1()); 
            }
            // InternalRecordLang.g:2079:1: ( rule__RecordType__ParentsAssignment_6_1 )
            // InternalRecordLang.g:2079:2: rule__RecordType__ParentsAssignment_6_1
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
    // InternalRecordLang.g:2089:1: rule__RecordType__Group_6__2 : rule__RecordType__Group_6__2__Impl ;
    public final void rule__RecordType__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2093:1: ( rule__RecordType__Group_6__2__Impl )
            // InternalRecordLang.g:2094:2: rule__RecordType__Group_6__2__Impl
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
    // InternalRecordLang.g:2100:1: rule__RecordType__Group_6__2__Impl : ( ( rule__RecordType__Group_6_2__0 )* ) ;
    public final void rule__RecordType__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2104:1: ( ( ( rule__RecordType__Group_6_2__0 )* ) )
            // InternalRecordLang.g:2105:1: ( ( rule__RecordType__Group_6_2__0 )* )
            {
            // InternalRecordLang.g:2105:1: ( ( rule__RecordType__Group_6_2__0 )* )
            // InternalRecordLang.g:2106:1: ( rule__RecordType__Group_6_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getGroup_6_2()); 
            }
            // InternalRecordLang.g:2107:1: ( rule__RecordType__Group_6_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRecordLang.g:2107:2: rule__RecordType__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__RecordType__Group_6_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalRecordLang.g:2123:1: rule__RecordType__Group_6_2__0 : rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1 ;
    public final void rule__RecordType__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2127:1: ( rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1 )
            // InternalRecordLang.g:2128:2: rule__RecordType__Group_6_2__0__Impl rule__RecordType__Group_6_2__1
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
    // InternalRecordLang.g:2135:1: rule__RecordType__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__RecordType__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2139:1: ( ( ',' ) )
            // InternalRecordLang.g:2140:1: ( ',' )
            {
            // InternalRecordLang.g:2140:1: ( ',' )
            // InternalRecordLang.g:2141:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getCommaKeyword_6_2_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2154:1: rule__RecordType__Group_6_2__1 : rule__RecordType__Group_6_2__1__Impl ;
    public final void rule__RecordType__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2158:1: ( rule__RecordType__Group_6_2__1__Impl )
            // InternalRecordLang.g:2159:2: rule__RecordType__Group_6_2__1__Impl
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
    // InternalRecordLang.g:2165:1: rule__RecordType__Group_6_2__1__Impl : ( ( rule__RecordType__ParentsAssignment_6_2_1 ) ) ;
    public final void rule__RecordType__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2169:1: ( ( ( rule__RecordType__ParentsAssignment_6_2_1 ) ) )
            // InternalRecordLang.g:2170:1: ( ( rule__RecordType__ParentsAssignment_6_2_1 ) )
            {
            // InternalRecordLang.g:2170:1: ( ( rule__RecordType__ParentsAssignment_6_2_1 ) )
            // InternalRecordLang.g:2171:1: ( rule__RecordType__ParentsAssignment_6_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsAssignment_6_2_1()); 
            }
            // InternalRecordLang.g:2172:1: ( rule__RecordType__ParentsAssignment_6_2_1 )
            // InternalRecordLang.g:2172:2: rule__RecordType__ParentsAssignment_6_2_1
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
    // InternalRecordLang.g:2186:1: rule__RecordType__Group_7__0 : rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 ;
    public final void rule__RecordType__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2190:1: ( rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1 )
            // InternalRecordLang.g:2191:2: rule__RecordType__Group_7__0__Impl rule__RecordType__Group_7__1
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
    // InternalRecordLang.g:2198:1: rule__RecordType__Group_7__0__Impl : ( '{' ) ;
    public final void rule__RecordType__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2202:1: ( ( '{' ) )
            // InternalRecordLang.g:2203:1: ( '{' )
            {
            // InternalRecordLang.g:2203:1: ( '{' )
            // InternalRecordLang.g:2204:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getLeftCurlyBracketKeyword_7_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2217:1: rule__RecordType__Group_7__1 : rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2 ;
    public final void rule__RecordType__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2221:1: ( rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2 )
            // InternalRecordLang.g:2222:2: rule__RecordType__Group_7__1__Impl rule__RecordType__Group_7__2
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
    // InternalRecordLang.g:2229:1: rule__RecordType__Group_7__1__Impl : ( ( rule__RecordType__Alternatives_7_1 )* ) ;
    public final void rule__RecordType__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2233:1: ( ( ( rule__RecordType__Alternatives_7_1 )* ) )
            // InternalRecordLang.g:2234:1: ( ( rule__RecordType__Alternatives_7_1 )* )
            {
            // InternalRecordLang.g:2234:1: ( ( rule__RecordType__Alternatives_7_1 )* )
            // InternalRecordLang.g:2235:1: ( rule__RecordType__Alternatives_7_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAlternatives_7_1()); 
            }
            // InternalRecordLang.g:2236:1: ( rule__RecordType__Alternatives_7_1 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID||(LA22_0>=14 && LA22_0<=15)||LA22_0==27||LA22_0==29||LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRecordLang.g:2236:2: rule__RecordType__Alternatives_7_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__RecordType__Alternatives_7_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalRecordLang.g:2246:1: rule__RecordType__Group_7__2 : rule__RecordType__Group_7__2__Impl ;
    public final void rule__RecordType__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2250:1: ( rule__RecordType__Group_7__2__Impl )
            // InternalRecordLang.g:2251:2: rule__RecordType__Group_7__2__Impl
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
    // InternalRecordLang.g:2257:1: rule__RecordType__Group_7__2__Impl : ( '}' ) ;
    public final void rule__RecordType__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2261:1: ( ( '}' ) )
            // InternalRecordLang.g:2262:1: ( '}' )
            {
            // InternalRecordLang.g:2262:1: ( '}' )
            // InternalRecordLang.g:2263:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getRightCurlyBracketKeyword_7_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2282:1: rule__Constant__Group__0 : rule__Constant__Group__0__Impl rule__Constant__Group__1 ;
    public final void rule__Constant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2286:1: ( rule__Constant__Group__0__Impl rule__Constant__Group__1 )
            // InternalRecordLang.g:2287:2: rule__Constant__Group__0__Impl rule__Constant__Group__1
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
    // InternalRecordLang.g:2294:1: rule__Constant__Group__0__Impl : ( 'const' ) ;
    public final void rule__Constant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2298:1: ( ( 'const' ) )
            // InternalRecordLang.g:2299:1: ( 'const' )
            {
            // InternalRecordLang.g:2299:1: ( 'const' )
            // InternalRecordLang.g:2300:1: 'const'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getConstKeyword_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2313:1: rule__Constant__Group__1 : rule__Constant__Group__1__Impl rule__Constant__Group__2 ;
    public final void rule__Constant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2317:1: ( rule__Constant__Group__1__Impl rule__Constant__Group__2 )
            // InternalRecordLang.g:2318:2: rule__Constant__Group__1__Impl rule__Constant__Group__2
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
    // InternalRecordLang.g:2325:1: rule__Constant__Group__1__Impl : ( ( rule__Constant__TypeAssignment_1 ) ) ;
    public final void rule__Constant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2329:1: ( ( ( rule__Constant__TypeAssignment_1 ) ) )
            // InternalRecordLang.g:2330:1: ( ( rule__Constant__TypeAssignment_1 ) )
            {
            // InternalRecordLang.g:2330:1: ( ( rule__Constant__TypeAssignment_1 ) )
            // InternalRecordLang.g:2331:1: ( rule__Constant__TypeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getTypeAssignment_1()); 
            }
            // InternalRecordLang.g:2332:1: ( rule__Constant__TypeAssignment_1 )
            // InternalRecordLang.g:2332:2: rule__Constant__TypeAssignment_1
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
    // InternalRecordLang.g:2342:1: rule__Constant__Group__2 : rule__Constant__Group__2__Impl rule__Constant__Group__3 ;
    public final void rule__Constant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2346:1: ( rule__Constant__Group__2__Impl rule__Constant__Group__3 )
            // InternalRecordLang.g:2347:2: rule__Constant__Group__2__Impl rule__Constant__Group__3
            {
            pushFollow(FOLLOW_16);
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
    // InternalRecordLang.g:2354:1: rule__Constant__Group__2__Impl : ( ( rule__Constant__NameAssignment_2 ) ) ;
    public final void rule__Constant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2358:1: ( ( ( rule__Constant__NameAssignment_2 ) ) )
            // InternalRecordLang.g:2359:1: ( ( rule__Constant__NameAssignment_2 ) )
            {
            // InternalRecordLang.g:2359:1: ( ( rule__Constant__NameAssignment_2 ) )
            // InternalRecordLang.g:2360:1: ( rule__Constant__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getNameAssignment_2()); 
            }
            // InternalRecordLang.g:2361:1: ( rule__Constant__NameAssignment_2 )
            // InternalRecordLang.g:2361:2: rule__Constant__NameAssignment_2
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
    // InternalRecordLang.g:2371:1: rule__Constant__Group__3 : rule__Constant__Group__3__Impl rule__Constant__Group__4 ;
    public final void rule__Constant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2375:1: ( rule__Constant__Group__3__Impl rule__Constant__Group__4 )
            // InternalRecordLang.g:2376:2: rule__Constant__Group__3__Impl rule__Constant__Group__4
            {
            pushFollow(FOLLOW_17);
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
    // InternalRecordLang.g:2383:1: rule__Constant__Group__3__Impl : ( '=' ) ;
    public final void rule__Constant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2387:1: ( ( '=' ) )
            // InternalRecordLang.g:2388:1: ( '=' )
            {
            // InternalRecordLang.g:2388:1: ( '=' )
            // InternalRecordLang.g:2389:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getEqualsSignKeyword_3()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2402:1: rule__Constant__Group__4 : rule__Constant__Group__4__Impl ;
    public final void rule__Constant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2406:1: ( rule__Constant__Group__4__Impl )
            // InternalRecordLang.g:2407:2: rule__Constant__Group__4__Impl
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
    // InternalRecordLang.g:2413:1: rule__Constant__Group__4__Impl : ( ( rule__Constant__ValueAssignment_4 ) ) ;
    public final void rule__Constant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2417:1: ( ( ( rule__Constant__ValueAssignment_4 ) ) )
            // InternalRecordLang.g:2418:1: ( ( rule__Constant__ValueAssignment_4 ) )
            {
            // InternalRecordLang.g:2418:1: ( ( rule__Constant__ValueAssignment_4 ) )
            // InternalRecordLang.g:2419:1: ( rule__Constant__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantAccess().getValueAssignment_4()); 
            }
            // InternalRecordLang.g:2420:1: ( rule__Constant__ValueAssignment_4 )
            // InternalRecordLang.g:2420:2: rule__Constant__ValueAssignment_4
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
    // InternalRecordLang.g:2440:1: rule__Property__Group__0 : rule__Property__Group__0__Impl rule__Property__Group__1 ;
    public final void rule__Property__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2444:1: ( rule__Property__Group__0__Impl rule__Property__Group__1 )
            // InternalRecordLang.g:2445:2: rule__Property__Group__0__Impl rule__Property__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalRecordLang.g:2452:1: rule__Property__Group__0__Impl : ( ( rule__Property__ModifiersAssignment_0 )* ) ;
    public final void rule__Property__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2456:1: ( ( ( rule__Property__ModifiersAssignment_0 )* ) )
            // InternalRecordLang.g:2457:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            {
            // InternalRecordLang.g:2457:1: ( ( rule__Property__ModifiersAssignment_0 )* )
            // InternalRecordLang.g:2458:1: ( rule__Property__ModifiersAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getModifiersAssignment_0()); 
            }
            // InternalRecordLang.g:2459:1: ( rule__Property__ModifiersAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=14 && LA23_0<=15)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRecordLang.g:2459:2: rule__Property__ModifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Property__ModifiersAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop23;
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
    // InternalRecordLang.g:2469:1: rule__Property__Group__1 : rule__Property__Group__1__Impl rule__Property__Group__2 ;
    public final void rule__Property__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2473:1: ( rule__Property__Group__1__Impl rule__Property__Group__2 )
            // InternalRecordLang.g:2474:2: rule__Property__Group__1__Impl rule__Property__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalRecordLang.g:2481:1: rule__Property__Group__1__Impl : ( ( rule__Property__ForeignKeyAssignment_1 )? ) ;
    public final void rule__Property__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2485:1: ( ( ( rule__Property__ForeignKeyAssignment_1 )? ) )
            // InternalRecordLang.g:2486:1: ( ( rule__Property__ForeignKeyAssignment_1 )? )
            {
            // InternalRecordLang.g:2486:1: ( ( rule__Property__ForeignKeyAssignment_1 )? )
            // InternalRecordLang.g:2487:1: ( rule__Property__ForeignKeyAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getForeignKeyAssignment_1()); 
            }
            // InternalRecordLang.g:2488:1: ( rule__Property__ForeignKeyAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRecordLang.g:2488:2: rule__Property__ForeignKeyAssignment_1
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
    // InternalRecordLang.g:2498:1: rule__Property__Group__2 : rule__Property__Group__2__Impl rule__Property__Group__3 ;
    public final void rule__Property__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2502:1: ( rule__Property__Group__2__Impl rule__Property__Group__3 )
            // InternalRecordLang.g:2503:2: rule__Property__Group__2__Impl rule__Property__Group__3
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
    // InternalRecordLang.g:2510:1: rule__Property__Group__2__Impl : ( ( rule__Property__Alternatives_2 ) ) ;
    public final void rule__Property__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2514:1: ( ( ( rule__Property__Alternatives_2 ) ) )
            // InternalRecordLang.g:2515:1: ( ( rule__Property__Alternatives_2 ) )
            {
            // InternalRecordLang.g:2515:1: ( ( rule__Property__Alternatives_2 ) )
            // InternalRecordLang.g:2516:1: ( rule__Property__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAlternatives_2()); 
            }
            // InternalRecordLang.g:2517:1: ( rule__Property__Alternatives_2 )
            // InternalRecordLang.g:2517:2: rule__Property__Alternatives_2
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
    // InternalRecordLang.g:2527:1: rule__Property__Group__3 : rule__Property__Group__3__Impl rule__Property__Group__4 ;
    public final void rule__Property__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2531:1: ( rule__Property__Group__3__Impl rule__Property__Group__4 )
            // InternalRecordLang.g:2532:2: rule__Property__Group__3__Impl rule__Property__Group__4
            {
            pushFollow(FOLLOW_16);
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
    // InternalRecordLang.g:2539:1: rule__Property__Group__3__Impl : ( ( rule__Property__NameAssignment_3 ) ) ;
    public final void rule__Property__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2543:1: ( ( ( rule__Property__NameAssignment_3 ) ) )
            // InternalRecordLang.g:2544:1: ( ( rule__Property__NameAssignment_3 ) )
            {
            // InternalRecordLang.g:2544:1: ( ( rule__Property__NameAssignment_3 ) )
            // InternalRecordLang.g:2545:1: ( rule__Property__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getNameAssignment_3()); 
            }
            // InternalRecordLang.g:2546:1: ( rule__Property__NameAssignment_3 )
            // InternalRecordLang.g:2546:2: rule__Property__NameAssignment_3
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
    // InternalRecordLang.g:2556:1: rule__Property__Group__4 : rule__Property__Group__4__Impl ;
    public final void rule__Property__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2560:1: ( rule__Property__Group__4__Impl )
            // InternalRecordLang.g:2561:2: rule__Property__Group__4__Impl
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
    // InternalRecordLang.g:2567:1: rule__Property__Group__4__Impl : ( ( rule__Property__Group_4__0 )? ) ;
    public final void rule__Property__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2571:1: ( ( ( rule__Property__Group_4__0 )? ) )
            // InternalRecordLang.g:2572:1: ( ( rule__Property__Group_4__0 )? )
            {
            // InternalRecordLang.g:2572:1: ( ( rule__Property__Group_4__0 )? )
            // InternalRecordLang.g:2573:1: ( rule__Property__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getGroup_4()); 
            }
            // InternalRecordLang.g:2574:1: ( rule__Property__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRecordLang.g:2574:2: rule__Property__Group_4__0
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
    // InternalRecordLang.g:2594:1: rule__Property__Group_2_1__0 : rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 ;
    public final void rule__Property__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2598:1: ( rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1 )
            // InternalRecordLang.g:2599:2: rule__Property__Group_2_1__0__Impl rule__Property__Group_2_1__1
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
    // InternalRecordLang.g:2606:1: rule__Property__Group_2_1__0__Impl : ( 'alias' ) ;
    public final void rule__Property__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2610:1: ( ( 'alias' ) )
            // InternalRecordLang.g:2611:1: ( 'alias' )
            {
            // InternalRecordLang.g:2611:1: ( 'alias' )
            // InternalRecordLang.g:2612:1: 'alias'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAliasKeyword_2_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2625:1: rule__Property__Group_2_1__1 : rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2 ;
    public final void rule__Property__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2629:1: ( rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2 )
            // InternalRecordLang.g:2630:2: rule__Property__Group_2_1__1__Impl rule__Property__Group_2_1__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalRecordLang.g:2637:1: rule__Property__Group_2_1__1__Impl : ( ( rule__Property__ReferToAssignment_2_1_1 ) ) ;
    public final void rule__Property__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2641:1: ( ( ( rule__Property__ReferToAssignment_2_1_1 ) ) )
            // InternalRecordLang.g:2642:1: ( ( rule__Property__ReferToAssignment_2_1_1 ) )
            {
            // InternalRecordLang.g:2642:1: ( ( rule__Property__ReferToAssignment_2_1_1 ) )
            // InternalRecordLang.g:2643:1: ( rule__Property__ReferToAssignment_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToAssignment_2_1_1()); 
            }
            // InternalRecordLang.g:2644:1: ( rule__Property__ReferToAssignment_2_1_1 )
            // InternalRecordLang.g:2644:2: rule__Property__ReferToAssignment_2_1_1
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
    // InternalRecordLang.g:2654:1: rule__Property__Group_2_1__2 : rule__Property__Group_2_1__2__Impl ;
    public final void rule__Property__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2658:1: ( rule__Property__Group_2_1__2__Impl )
            // InternalRecordLang.g:2659:2: rule__Property__Group_2_1__2__Impl
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
    // InternalRecordLang.g:2665:1: rule__Property__Group_2_1__2__Impl : ( 'as' ) ;
    public final void rule__Property__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2669:1: ( ( 'as' ) )
            // InternalRecordLang.g:2670:1: ( 'as' )
            {
            // InternalRecordLang.g:2670:1: ( 'as' )
            // InternalRecordLang.g:2671:1: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getAsKeyword_2_1_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2690:1: rule__Property__Group_4__0 : rule__Property__Group_4__0__Impl rule__Property__Group_4__1 ;
    public final void rule__Property__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2694:1: ( rule__Property__Group_4__0__Impl rule__Property__Group_4__1 )
            // InternalRecordLang.g:2695:2: rule__Property__Group_4__0__Impl rule__Property__Group_4__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRecordLang.g:2702:1: rule__Property__Group_4__0__Impl : ( '=' ) ;
    public final void rule__Property__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2706:1: ( ( '=' ) )
            // InternalRecordLang.g:2707:1: ( '=' )
            {
            // InternalRecordLang.g:2707:1: ( '=' )
            // InternalRecordLang.g:2708:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2721:1: rule__Property__Group_4__1 : rule__Property__Group_4__1__Impl ;
    public final void rule__Property__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2725:1: ( rule__Property__Group_4__1__Impl )
            // InternalRecordLang.g:2726:2: rule__Property__Group_4__1__Impl
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
    // InternalRecordLang.g:2732:1: rule__Property__Group_4__1__Impl : ( ( rule__Property__ValueAssignment_4_1 ) ) ;
    public final void rule__Property__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2736:1: ( ( ( rule__Property__ValueAssignment_4_1 ) ) )
            // InternalRecordLang.g:2737:1: ( ( rule__Property__ValueAssignment_4_1 ) )
            {
            // InternalRecordLang.g:2737:1: ( ( rule__Property__ValueAssignment_4_1 ) )
            // InternalRecordLang.g:2738:1: ( rule__Property__ValueAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getValueAssignment_4_1()); 
            }
            // InternalRecordLang.g:2739:1: ( rule__Property__ValueAssignment_4_1 )
            // InternalRecordLang.g:2739:2: rule__Property__ValueAssignment_4_1
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
    // InternalRecordLang.g:2753:1: rule__ForeignKey__Group__0 : rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 ;
    public final void rule__ForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2757:1: ( rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1 )
            // InternalRecordLang.g:2758:2: rule__ForeignKey__Group__0__Impl rule__ForeignKey__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalRecordLang.g:2765:1: rule__ForeignKey__Group__0__Impl : ( 'grouped' ) ;
    public final void rule__ForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2769:1: ( ( 'grouped' ) )
            // InternalRecordLang.g:2770:1: ( 'grouped' )
            {
            // InternalRecordLang.g:2770:1: ( 'grouped' )
            // InternalRecordLang.g:2771:1: 'grouped'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getGroupedKeyword_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2784:1: rule__ForeignKey__Group__1 : rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 ;
    public final void rule__ForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2788:1: ( rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2 )
            // InternalRecordLang.g:2789:2: rule__ForeignKey__Group__1__Impl rule__ForeignKey__Group__2
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
    // InternalRecordLang.g:2796:1: rule__ForeignKey__Group__1__Impl : ( 'by' ) ;
    public final void rule__ForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2800:1: ( ( 'by' ) )
            // InternalRecordLang.g:2801:1: ( 'by' )
            {
            // InternalRecordLang.g:2801:1: ( 'by' )
            // InternalRecordLang.g:2802:1: 'by'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getByKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2815:1: rule__ForeignKey__Group__2 : rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 ;
    public final void rule__ForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2819:1: ( rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3 )
            // InternalRecordLang.g:2820:2: rule__ForeignKey__Group__2__Impl rule__ForeignKey__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalRecordLang.g:2827:1: rule__ForeignKey__Group__2__Impl : ( ( rule__ForeignKey__RecordTypeAssignment_2 ) ) ;
    public final void rule__ForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2831:1: ( ( ( rule__ForeignKey__RecordTypeAssignment_2 ) ) )
            // InternalRecordLang.g:2832:1: ( ( rule__ForeignKey__RecordTypeAssignment_2 ) )
            {
            // InternalRecordLang.g:2832:1: ( ( rule__ForeignKey__RecordTypeAssignment_2 ) )
            // InternalRecordLang.g:2833:1: ( rule__ForeignKey__RecordTypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRecordTypeAssignment_2()); 
            }
            // InternalRecordLang.g:2834:1: ( rule__ForeignKey__RecordTypeAssignment_2 )
            // InternalRecordLang.g:2834:2: rule__ForeignKey__RecordTypeAssignment_2
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
    // InternalRecordLang.g:2844:1: rule__ForeignKey__Group__3 : rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 ;
    public final void rule__ForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2848:1: ( rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4 )
            // InternalRecordLang.g:2849:2: rule__ForeignKey__Group__3__Impl rule__ForeignKey__Group__4
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
    // InternalRecordLang.g:2856:1: rule__ForeignKey__Group__3__Impl : ( '.' ) ;
    public final void rule__ForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2860:1: ( ( '.' ) )
            // InternalRecordLang.g:2861:1: ( '.' )
            {
            // InternalRecordLang.g:2861:1: ( '.' )
            // InternalRecordLang.g:2862:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getFullStopKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:2875:1: rule__ForeignKey__Group__4 : rule__ForeignKey__Group__4__Impl ;
    public final void rule__ForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2879:1: ( rule__ForeignKey__Group__4__Impl )
            // InternalRecordLang.g:2880:2: rule__ForeignKey__Group__4__Impl
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
    // InternalRecordLang.g:2886:1: rule__ForeignKey__Group__4__Impl : ( ( rule__ForeignKey__PropertyRefAssignment_4 ) ) ;
    public final void rule__ForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2890:1: ( ( ( rule__ForeignKey__PropertyRefAssignment_4 ) ) )
            // InternalRecordLang.g:2891:1: ( ( rule__ForeignKey__PropertyRefAssignment_4 ) )
            {
            // InternalRecordLang.g:2891:1: ( ( rule__ForeignKey__PropertyRefAssignment_4 ) )
            // InternalRecordLang.g:2892:1: ( rule__ForeignKey__PropertyRefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getPropertyRefAssignment_4()); 
            }
            // InternalRecordLang.g:2893:1: ( rule__ForeignKey__PropertyRefAssignment_4 )
            // InternalRecordLang.g:2893:2: rule__ForeignKey__PropertyRefAssignment_4
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
    // InternalRecordLang.g:2913:1: rule__Classifier__Group__0 : rule__Classifier__Group__0__Impl rule__Classifier__Group__1 ;
    public final void rule__Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2917:1: ( rule__Classifier__Group__0__Impl rule__Classifier__Group__1 )
            // InternalRecordLang.g:2918:2: rule__Classifier__Group__0__Impl rule__Classifier__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRecordLang.g:2925:1: rule__Classifier__Group__0__Impl : ( ( rule__Classifier__TypeAssignment_0 ) ) ;
    public final void rule__Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2929:1: ( ( ( rule__Classifier__TypeAssignment_0 ) ) )
            // InternalRecordLang.g:2930:1: ( ( rule__Classifier__TypeAssignment_0 ) )
            {
            // InternalRecordLang.g:2930:1: ( ( rule__Classifier__TypeAssignment_0 ) )
            // InternalRecordLang.g:2931:1: ( rule__Classifier__TypeAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getTypeAssignment_0()); 
            }
            // InternalRecordLang.g:2932:1: ( rule__Classifier__TypeAssignment_0 )
            // InternalRecordLang.g:2932:2: rule__Classifier__TypeAssignment_0
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
    // InternalRecordLang.g:2942:1: rule__Classifier__Group__1 : rule__Classifier__Group__1__Impl ;
    public final void rule__Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2946:1: ( rule__Classifier__Group__1__Impl )
            // InternalRecordLang.g:2947:2: rule__Classifier__Group__1__Impl
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
    // InternalRecordLang.g:2953:1: rule__Classifier__Group__1__Impl : ( ( rule__Classifier__SizesAssignment_1 )* ) ;
    public final void rule__Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2957:1: ( ( ( rule__Classifier__SizesAssignment_1 )* ) )
            // InternalRecordLang.g:2958:1: ( ( rule__Classifier__SizesAssignment_1 )* )
            {
            // InternalRecordLang.g:2958:1: ( ( rule__Classifier__SizesAssignment_1 )* )
            // InternalRecordLang.g:2959:1: ( rule__Classifier__SizesAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getSizesAssignment_1()); 
            }
            // InternalRecordLang.g:2960:1: ( rule__Classifier__SizesAssignment_1 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==34) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRecordLang.g:2960:2: rule__Classifier__SizesAssignment_1
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Classifier__SizesAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalRecordLang.g:2974:1: rule__ArraySize__Group__0 : rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 ;
    public final void rule__ArraySize__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2978:1: ( rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1 )
            // InternalRecordLang.g:2979:2: rule__ArraySize__Group__0__Impl rule__ArraySize__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalRecordLang.g:2986:1: rule__ArraySize__Group__0__Impl : ( () ) ;
    public final void rule__ArraySize__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:2990:1: ( ( () ) )
            // InternalRecordLang.g:2991:1: ( () )
            {
            // InternalRecordLang.g:2991:1: ( () )
            // InternalRecordLang.g:2992:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getArraySizeAction_0()); 
            }
            // InternalRecordLang.g:2993:1: ()
            // InternalRecordLang.g:2995:1: 
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
    // InternalRecordLang.g:3005:1: rule__ArraySize__Group__1 : rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 ;
    public final void rule__ArraySize__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3009:1: ( rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2 )
            // InternalRecordLang.g:3010:2: rule__ArraySize__Group__1__Impl rule__ArraySize__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalRecordLang.g:3017:1: rule__ArraySize__Group__1__Impl : ( '[' ) ;
    public final void rule__ArraySize__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3021:1: ( ( '[' ) )
            // InternalRecordLang.g:3022:1: ( '[' )
            {
            // InternalRecordLang.g:3022:1: ( '[' )
            // InternalRecordLang.g:3023:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getLeftSquareBracketKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3036:1: rule__ArraySize__Group__2 : rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 ;
    public final void rule__ArraySize__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3040:1: ( rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3 )
            // InternalRecordLang.g:3041:2: rule__ArraySize__Group__2__Impl rule__ArraySize__Group__3
            {
            pushFollow(FOLLOW_25);
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
    // InternalRecordLang.g:3048:1: rule__ArraySize__Group__2__Impl : ( ( rule__ArraySize__SizeAssignment_2 )? ) ;
    public final void rule__ArraySize__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3052:1: ( ( ( rule__ArraySize__SizeAssignment_2 )? ) )
            // InternalRecordLang.g:3053:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            {
            // InternalRecordLang.g:3053:1: ( ( rule__ArraySize__SizeAssignment_2 )? )
            // InternalRecordLang.g:3054:1: ( rule__ArraySize__SizeAssignment_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getSizeAssignment_2()); 
            }
            // InternalRecordLang.g:3055:1: ( rule__ArraySize__SizeAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_INT) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRecordLang.g:3055:2: rule__ArraySize__SizeAssignment_2
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
    // InternalRecordLang.g:3065:1: rule__ArraySize__Group__3 : rule__ArraySize__Group__3__Impl ;
    public final void rule__ArraySize__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3069:1: ( rule__ArraySize__Group__3__Impl )
            // InternalRecordLang.g:3070:2: rule__ArraySize__Group__3__Impl
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
    // InternalRecordLang.g:3076:1: rule__ArraySize__Group__3__Impl : ( ']' ) ;
    public final void rule__ArraySize__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3080:1: ( ( ']' ) )
            // InternalRecordLang.g:3081:1: ( ']' )
            {
            // InternalRecordLang.g:3081:1: ( ']' )
            // InternalRecordLang.g:3082:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArraySizeAccess().getRightSquareBracketKeyword_3()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3103:1: rule__ArrayLiteral__Group__0 : rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 ;
    public final void rule__ArrayLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3107:1: ( rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1 )
            // InternalRecordLang.g:3108:2: rule__ArrayLiteral__Group__0__Impl rule__ArrayLiteral__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRecordLang.g:3115:1: rule__ArrayLiteral__Group__0__Impl : ( '{' ) ;
    public final void rule__ArrayLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3119:1: ( ( '{' ) )
            // InternalRecordLang.g:3120:1: ( '{' )
            {
            // InternalRecordLang.g:3120:1: ( '{' )
            // InternalRecordLang.g:3121:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLeftCurlyBracketKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3134:1: rule__ArrayLiteral__Group__1 : rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 ;
    public final void rule__ArrayLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3138:1: ( rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2 )
            // InternalRecordLang.g:3139:2: rule__ArrayLiteral__Group__1__Impl rule__ArrayLiteral__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalRecordLang.g:3146:1: rule__ArrayLiteral__Group__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) ;
    public final void rule__ArrayLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3150:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) ) )
            // InternalRecordLang.g:3151:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            {
            // InternalRecordLang.g:3151:1: ( ( rule__ArrayLiteral__LiteralsAssignment_1 ) )
            // InternalRecordLang.g:3152:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_1()); 
            }
            // InternalRecordLang.g:3153:1: ( rule__ArrayLiteral__LiteralsAssignment_1 )
            // InternalRecordLang.g:3153:2: rule__ArrayLiteral__LiteralsAssignment_1
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
    // InternalRecordLang.g:3163:1: rule__ArrayLiteral__Group__2 : rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 ;
    public final void rule__ArrayLiteral__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3167:1: ( rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3 )
            // InternalRecordLang.g:3168:2: rule__ArrayLiteral__Group__2__Impl rule__ArrayLiteral__Group__3
            {
            pushFollow(FOLLOW_26);
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
    // InternalRecordLang.g:3175:1: rule__ArrayLiteral__Group__2__Impl : ( ( rule__ArrayLiteral__Group_2__0 )* ) ;
    public final void rule__ArrayLiteral__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3179:1: ( ( ( rule__ArrayLiteral__Group_2__0 )* ) )
            // InternalRecordLang.g:3180:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            {
            // InternalRecordLang.g:3180:1: ( ( rule__ArrayLiteral__Group_2__0 )* )
            // InternalRecordLang.g:3181:1: ( rule__ArrayLiteral__Group_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getGroup_2()); 
            }
            // InternalRecordLang.g:3182:1: ( rule__ArrayLiteral__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==22) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalRecordLang.g:3182:2: rule__ArrayLiteral__Group_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ArrayLiteral__Group_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalRecordLang.g:3192:1: rule__ArrayLiteral__Group__3 : rule__ArrayLiteral__Group__3__Impl ;
    public final void rule__ArrayLiteral__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3196:1: ( rule__ArrayLiteral__Group__3__Impl )
            // InternalRecordLang.g:3197:2: rule__ArrayLiteral__Group__3__Impl
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
    // InternalRecordLang.g:3203:1: rule__ArrayLiteral__Group__3__Impl : ( '}' ) ;
    public final void rule__ArrayLiteral__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3207:1: ( ( '}' ) )
            // InternalRecordLang.g:3208:1: ( '}' )
            {
            // InternalRecordLang.g:3208:1: ( '}' )
            // InternalRecordLang.g:3209:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3230:1: rule__ArrayLiteral__Group_2__0 : rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 ;
    public final void rule__ArrayLiteral__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3234:1: ( rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1 )
            // InternalRecordLang.g:3235:2: rule__ArrayLiteral__Group_2__0__Impl rule__ArrayLiteral__Group_2__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRecordLang.g:3242:1: rule__ArrayLiteral__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayLiteral__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3246:1: ( ( ',' ) )
            // InternalRecordLang.g:3247:1: ( ',' )
            {
            // InternalRecordLang.g:3247:1: ( ',' )
            // InternalRecordLang.g:3248:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getCommaKeyword_2_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3261:1: rule__ArrayLiteral__Group_2__1 : rule__ArrayLiteral__Group_2__1__Impl ;
    public final void rule__ArrayLiteral__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3265:1: ( rule__ArrayLiteral__Group_2__1__Impl )
            // InternalRecordLang.g:3266:2: rule__ArrayLiteral__Group_2__1__Impl
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
    // InternalRecordLang.g:3272:1: rule__ArrayLiteral__Group_2__1__Impl : ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) ;
    public final void rule__ArrayLiteral__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3276:1: ( ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) ) )
            // InternalRecordLang.g:3277:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            {
            // InternalRecordLang.g:3277:1: ( ( rule__ArrayLiteral__LiteralsAssignment_2_1 ) )
            // InternalRecordLang.g:3278:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getArrayLiteralAccess().getLiteralsAssignment_2_1()); 
            }
            // InternalRecordLang.g:3279:1: ( rule__ArrayLiteral__LiteralsAssignment_2_1 )
            // InternalRecordLang.g:3279:2: rule__ArrayLiteral__LiteralsAssignment_2_1
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
    // InternalRecordLang.g:3293:1: rule__BuiltInValueLiteral__Group__0 : rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 ;
    public final void rule__BuiltInValueLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3297:1: ( rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1 )
            // InternalRecordLang.g:3298:2: rule__BuiltInValueLiteral__Group__0__Impl rule__BuiltInValueLiteral__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalRecordLang.g:3305:1: rule__BuiltInValueLiteral__Group__0__Impl : ( () ) ;
    public final void rule__BuiltInValueLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3309:1: ( ( () ) )
            // InternalRecordLang.g:3310:1: ( () )
            {
            // InternalRecordLang.g:3310:1: ( () )
            // InternalRecordLang.g:3311:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getBuiltInValueLiteralAction_0()); 
            }
            // InternalRecordLang.g:3312:1: ()
            // InternalRecordLang.g:3314:1: 
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
    // InternalRecordLang.g:3324:1: rule__BuiltInValueLiteral__Group__1 : rule__BuiltInValueLiteral__Group__1__Impl ;
    public final void rule__BuiltInValueLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3328:1: ( rule__BuiltInValueLiteral__Group__1__Impl )
            // InternalRecordLang.g:3329:2: rule__BuiltInValueLiteral__Group__1__Impl
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
    // InternalRecordLang.g:3335:1: rule__BuiltInValueLiteral__Group__1__Impl : ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) ;
    public final void rule__BuiltInValueLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3339:1: ( ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) ) )
            // InternalRecordLang.g:3340:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            {
            // InternalRecordLang.g:3340:1: ( ( rule__BuiltInValueLiteral__ValueAssignment_1 ) )
            // InternalRecordLang.g:3341:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueAssignment_1()); 
            }
            // InternalRecordLang.g:3342:1: ( rule__BuiltInValueLiteral__ValueAssignment_1 )
            // InternalRecordLang.g:3342:2: rule__BuiltInValueLiteral__ValueAssignment_1
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
    // InternalRecordLang.g:3356:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3360:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalRecordLang.g:3361:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRecordLang.g:3368:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3372:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:3373:1: ( RULE_ID )
            {
            // InternalRecordLang.g:3373:1: ( RULE_ID )
            // InternalRecordLang.g:3374:1: RULE_ID
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
    // InternalRecordLang.g:3385:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3389:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalRecordLang.g:3390:2: rule__QualifiedName__Group__1__Impl
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
    // InternalRecordLang.g:3396:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3400:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalRecordLang.g:3401:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalRecordLang.g:3401:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalRecordLang.g:3402:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:3403:1: ( rule__QualifiedName__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==33) ) {
                    int LA29_2 = input.LA(2);

                    if ( (LA29_2==RULE_ID) ) {
                        alt29=1;
                    }


                }


                switch (alt29) {
            	case 1 :
            	    // InternalRecordLang.g:3403:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalRecordLang.g:3417:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3421:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalRecordLang.g:3422:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalRecordLang.g:3429:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3433:1: ( ( ( '.' ) ) )
            // InternalRecordLang.g:3434:1: ( ( '.' ) )
            {
            // InternalRecordLang.g:3434:1: ( ( '.' ) )
            // InternalRecordLang.g:3435:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalRecordLang.g:3436:1: ( '.' )
            // InternalRecordLang.g:3437:2: '.'
            {
            match(input,33,FOLLOW_2); if (state.failed) return ;

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
    // InternalRecordLang.g:3448:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3452:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalRecordLang.g:3453:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalRecordLang.g:3459:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3463:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:3464:1: ( RULE_ID )
            {
            // InternalRecordLang.g:3464:1: ( RULE_ID )
            // InternalRecordLang.g:3465:1: RULE_ID
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
    // InternalRecordLang.g:3480:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3484:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalRecordLang.g:3485:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalRecordLang.g:3492:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3496:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:3497:1: ( ruleQualifiedName )
            {
            // InternalRecordLang.g:3497:1: ( ruleQualifiedName )
            // InternalRecordLang.g:3498:1: ruleQualifiedName
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
    // InternalRecordLang.g:3509:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3513:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalRecordLang.g:3514:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalRecordLang.g:3520:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3524:1: ( ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? ) )
            // InternalRecordLang.g:3525:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            {
            // InternalRecordLang.g:3525:1: ( ( rule__QualifiedNameWithWildcard__Group_1__0 )? )
            // InternalRecordLang.g:3526:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup_1()); 
            }
            // InternalRecordLang.g:3527:1: ( rule__QualifiedNameWithWildcard__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRecordLang.g:3527:2: rule__QualifiedNameWithWildcard__Group_1__0
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
    // InternalRecordLang.g:3541:1: rule__QualifiedNameWithWildcard__Group_1__0 : rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3545:1: ( rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1 )
            // InternalRecordLang.g:3546:2: rule__QualifiedNameWithWildcard__Group_1__0__Impl rule__QualifiedNameWithWildcard__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalRecordLang.g:3553:1: rule__QualifiedNameWithWildcard__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3557:1: ( ( '.' ) )
            // InternalRecordLang.g:3558:1: ( '.' )
            {
            // InternalRecordLang.g:3558:1: ( '.' )
            // InternalRecordLang.g:3559:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3572:1: rule__QualifiedNameWithWildcard__Group_1__1 : rule__QualifiedNameWithWildcard__Group_1__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3576:1: ( rule__QualifiedNameWithWildcard__Group_1__1__Impl )
            // InternalRecordLang.g:3577:2: rule__QualifiedNameWithWildcard__Group_1__1__Impl
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
    // InternalRecordLang.g:3583:1: rule__QualifiedNameWithWildcard__Group_1__1__Impl : ( '*' ) ;
    public final void rule__QualifiedNameWithWildcard__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3587:1: ( ( '*' ) )
            // InternalRecordLang.g:3588:1: ( '*' )
            {
            // InternalRecordLang.g:3588:1: ( '*' )
            // InternalRecordLang.g:3589:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getAsteriskKeyword_1_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3607:1: rule__Model__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3611:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:3612:1: ( ruleQualifiedName )
            {
            // InternalRecordLang.g:3612:1: ( ruleQualifiedName )
            // InternalRecordLang.g:3613:1: ruleQualifiedName
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
    // InternalRecordLang.g:3622:1: rule__Model__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3626:1: ( ( ruleImport ) )
            // InternalRecordLang.g:3627:1: ( ruleImport )
            {
            // InternalRecordLang.g:3627:1: ( ruleImport )
            // InternalRecordLang.g:3628:1: ruleImport
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
    // InternalRecordLang.g:3637:1: rule__Model__TypesAssignment_3 : ( ruleComplexType ) ;
    public final void rule__Model__TypesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3641:1: ( ( ruleComplexType ) )
            // InternalRecordLang.g:3642:1: ( ruleComplexType )
            {
            // InternalRecordLang.g:3642:1: ( ruleComplexType )
            // InternalRecordLang.g:3643:1: ruleComplexType
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


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalRecordLang.g:3652:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3656:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalRecordLang.g:3657:1: ( ruleQualifiedNameWithWildcard )
            {
            // InternalRecordLang.g:3657:1: ( ruleQualifiedNameWithWildcard )
            // InternalRecordLang.g:3658:1: ruleQualifiedNameWithWildcard
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
    // InternalRecordLang.g:3667:1: rule__BaseType__NameAssignment : ( RULE_ID ) ;
    public final void rule__BaseType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3671:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:3672:1: ( RULE_ID )
            {
            // InternalRecordLang.g:3672:1: ( RULE_ID )
            // InternalRecordLang.g:3673:1: RULE_ID
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


    // $ANTLR start "rule__TemplateType__AuthorAssignment_0_1"
    // InternalRecordLang.g:3682:1: rule__TemplateType__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__TemplateType__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3686:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:3687:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:3687:1: ( RULE_STRING )
            // InternalRecordLang.g:3688:1: RULE_STRING
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
    // InternalRecordLang.g:3697:1: rule__TemplateType__SinceAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TemplateType__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3701:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:3702:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:3702:1: ( RULE_STRING )
            // InternalRecordLang.g:3703:1: RULE_STRING
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
    // InternalRecordLang.g:3712:1: rule__TemplateType__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__TemplateType__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3716:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:3717:1: ( RULE_ID )
            {
            // InternalRecordLang.g:3717:1: ( RULE_ID )
            // InternalRecordLang.g:3718:1: RULE_ID
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
    // InternalRecordLang.g:3727:1: rule__TemplateType__ParentsAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateType__ParentsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3731:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:3732:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:3732:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:3733:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_1_0()); 
            }
            // InternalRecordLang.g:3734:1: ( ruleQualifiedName )
            // InternalRecordLang.g:3735:1: ruleQualifiedName
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
    // InternalRecordLang.g:3746:1: rule__TemplateType__ParentsAssignment_4_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TemplateType__ParentsAssignment_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3750:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:3751:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:3751:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:3752:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemplateTypeAccess().getParentsTemplateTypeCrossReference_4_2_1_0()); 
            }
            // InternalRecordLang.g:3753:1: ( ruleQualifiedName )
            // InternalRecordLang.g:3754:1: ruleQualifiedName
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
    // InternalRecordLang.g:3765:1: rule__TemplateType__PropertiesAssignment_5_1_0 : ( ruleProperty ) ;
    public final void rule__TemplateType__PropertiesAssignment_5_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3769:1: ( ( ruleProperty ) )
            // InternalRecordLang.g:3770:1: ( ruleProperty )
            {
            // InternalRecordLang.g:3770:1: ( ruleProperty )
            // InternalRecordLang.g:3771:1: ruleProperty
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
    // InternalRecordLang.g:3780:1: rule__TemplateType__ConstantsAssignment_5_1_1 : ( ruleConstant ) ;
    public final void rule__TemplateType__ConstantsAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3784:1: ( ( ruleConstant ) )
            // InternalRecordLang.g:3785:1: ( ruleConstant )
            {
            // InternalRecordLang.g:3785:1: ( ruleConstant )
            // InternalRecordLang.g:3786:1: ruleConstant
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
    // InternalRecordLang.g:3795:1: rule__RecordType__AuthorAssignment_0_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__AuthorAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3799:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:3800:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:3800:1: ( RULE_STRING )
            // InternalRecordLang.g:3801:1: RULE_STRING
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
    // InternalRecordLang.g:3810:1: rule__RecordType__SinceAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__RecordType__SinceAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3814:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:3815:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:3815:1: ( RULE_STRING )
            // InternalRecordLang.g:3816:1: RULE_STRING
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
    // InternalRecordLang.g:3825:1: rule__RecordType__AbstractAssignment_2 : ( ( 'abstract' ) ) ;
    public final void rule__RecordType__AbstractAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3829:1: ( ( ( 'abstract' ) ) )
            // InternalRecordLang.g:3830:1: ( ( 'abstract' ) )
            {
            // InternalRecordLang.g:3830:1: ( ( 'abstract' ) )
            // InternalRecordLang.g:3831:1: ( 'abstract' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }
            // InternalRecordLang.g:3832:1: ( 'abstract' )
            // InternalRecordLang.g:3833:1: 'abstract'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getAbstractAbstractKeyword_2_0()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalRecordLang.g:3848:1: rule__RecordType__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__RecordType__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3852:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:3853:1: ( RULE_ID )
            {
            // InternalRecordLang.g:3853:1: ( RULE_ID )
            // InternalRecordLang.g:3854:1: RULE_ID
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
    // InternalRecordLang.g:3863:1: rule__RecordType__ParentAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3867:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:3868:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:3868:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:3869:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentRecordTypeCrossReference_5_1_0()); 
            }
            // InternalRecordLang.g:3870:1: ( ruleQualifiedName )
            // InternalRecordLang.g:3871:1: ruleQualifiedName
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
    // InternalRecordLang.g:3882:1: rule__RecordType__ParentsAssignment_6_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3886:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:3887:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:3887:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:3888:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_1_0()); 
            }
            // InternalRecordLang.g:3889:1: ( ruleQualifiedName )
            // InternalRecordLang.g:3890:1: ruleQualifiedName
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
    // InternalRecordLang.g:3901:1: rule__RecordType__ParentsAssignment_6_2_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__RecordType__ParentsAssignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3905:1: ( ( ( ruleQualifiedName ) ) )
            // InternalRecordLang.g:3906:1: ( ( ruleQualifiedName ) )
            {
            // InternalRecordLang.g:3906:1: ( ( ruleQualifiedName ) )
            // InternalRecordLang.g:3907:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRecordTypeAccess().getParentsTemplateTypeCrossReference_6_2_1_0()); 
            }
            // InternalRecordLang.g:3908:1: ( ruleQualifiedName )
            // InternalRecordLang.g:3909:1: ruleQualifiedName
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
    // InternalRecordLang.g:3920:1: rule__RecordType__PropertiesAssignment_7_1_0 : ( ruleProperty ) ;
    public final void rule__RecordType__PropertiesAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3924:1: ( ( ruleProperty ) )
            // InternalRecordLang.g:3925:1: ( ruleProperty )
            {
            // InternalRecordLang.g:3925:1: ( ruleProperty )
            // InternalRecordLang.g:3926:1: ruleProperty
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
    // InternalRecordLang.g:3935:1: rule__RecordType__ConstantsAssignment_7_1_1 : ( ruleConstant ) ;
    public final void rule__RecordType__ConstantsAssignment_7_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3939:1: ( ( ruleConstant ) )
            // InternalRecordLang.g:3940:1: ( ruleConstant )
            {
            // InternalRecordLang.g:3940:1: ( ruleConstant )
            // InternalRecordLang.g:3941:1: ruleConstant
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
    // InternalRecordLang.g:3950:1: rule__Constant__TypeAssignment_1 : ( ruleClassifier ) ;
    public final void rule__Constant__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3954:1: ( ( ruleClassifier ) )
            // InternalRecordLang.g:3955:1: ( ruleClassifier )
            {
            // InternalRecordLang.g:3955:1: ( ruleClassifier )
            // InternalRecordLang.g:3956:1: ruleClassifier
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
    // InternalRecordLang.g:3965:1: rule__Constant__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Constant__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3969:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:3970:1: ( RULE_ID )
            {
            // InternalRecordLang.g:3970:1: ( RULE_ID )
            // InternalRecordLang.g:3971:1: RULE_ID
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
    // InternalRecordLang.g:3980:1: rule__Constant__ValueAssignment_4 : ( ruleLiteral ) ;
    public final void rule__Constant__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3984:1: ( ( ruleLiteral ) )
            // InternalRecordLang.g:3985:1: ( ruleLiteral )
            {
            // InternalRecordLang.g:3985:1: ( ruleLiteral )
            // InternalRecordLang.g:3986:1: ruleLiteral
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
    // InternalRecordLang.g:3995:1: rule__Property__ModifiersAssignment_0 : ( rulePropertyModifier ) ;
    public final void rule__Property__ModifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:3999:1: ( ( rulePropertyModifier ) )
            // InternalRecordLang.g:4000:1: ( rulePropertyModifier )
            {
            // InternalRecordLang.g:4000:1: ( rulePropertyModifier )
            // InternalRecordLang.g:4001:1: rulePropertyModifier
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
    // InternalRecordLang.g:4010:1: rule__Property__ForeignKeyAssignment_1 : ( ruleForeignKey ) ;
    public final void rule__Property__ForeignKeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4014:1: ( ( ruleForeignKey ) )
            // InternalRecordLang.g:4015:1: ( ruleForeignKey )
            {
            // InternalRecordLang.g:4015:1: ( ruleForeignKey )
            // InternalRecordLang.g:4016:1: ruleForeignKey
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
    // InternalRecordLang.g:4025:1: rule__Property__TypeAssignment_2_0 : ( ruleClassifier ) ;
    public final void rule__Property__TypeAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4029:1: ( ( ruleClassifier ) )
            // InternalRecordLang.g:4030:1: ( ruleClassifier )
            {
            // InternalRecordLang.g:4030:1: ( ruleClassifier )
            // InternalRecordLang.g:4031:1: ruleClassifier
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
    // InternalRecordLang.g:4040:1: rule__Property__ReferToAssignment_2_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Property__ReferToAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4044:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:4045:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:4045:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4046:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyAccess().getReferToPropertyCrossReference_2_1_1_0()); 
            }
            // InternalRecordLang.g:4047:1: ( RULE_ID )
            // InternalRecordLang.g:4048:1: RULE_ID
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
    // InternalRecordLang.g:4059:1: rule__Property__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__Property__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4063:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4064:1: ( RULE_ID )
            {
            // InternalRecordLang.g:4064:1: ( RULE_ID )
            // InternalRecordLang.g:4065:1: RULE_ID
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
    // InternalRecordLang.g:4074:1: rule__Property__ValueAssignment_4_1 : ( ruleLiteral ) ;
    public final void rule__Property__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4078:1: ( ( ruleLiteral ) )
            // InternalRecordLang.g:4079:1: ( ruleLiteral )
            {
            // InternalRecordLang.g:4079:1: ( ruleLiteral )
            // InternalRecordLang.g:4080:1: ruleLiteral
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
    // InternalRecordLang.g:4089:1: rule__ForeignKey__RecordTypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__RecordTypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4093:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:4094:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:4094:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4095:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getRecordTypeRecordTypeCrossReference_2_0()); 
            }
            // InternalRecordLang.g:4096:1: ( RULE_ID )
            // InternalRecordLang.g:4097:1: RULE_ID
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
    // InternalRecordLang.g:4108:1: rule__ForeignKey__PropertyRefAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__ForeignKey__PropertyRefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4112:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:4113:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:4113:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4114:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getForeignKeyAccess().getPropertyRefPropertyCrossReference_4_0()); 
            }
            // InternalRecordLang.g:4115:1: ( RULE_ID )
            // InternalRecordLang.g:4116:1: RULE_ID
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
    // InternalRecordLang.g:4127:1: rule__Classifier__TypeAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Classifier__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4131:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:4132:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:4132:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4133:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getClassifierAccess().getTypeBaseTypeCrossReference_0_0()); 
            }
            // InternalRecordLang.g:4134:1: ( RULE_ID )
            // InternalRecordLang.g:4135:1: RULE_ID
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
    // InternalRecordLang.g:4146:1: rule__Classifier__SizesAssignment_1 : ( ruleArraySize ) ;
    public final void rule__Classifier__SizesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4150:1: ( ( ruleArraySize ) )
            // InternalRecordLang.g:4151:1: ( ruleArraySize )
            {
            // InternalRecordLang.g:4151:1: ( ruleArraySize )
            // InternalRecordLang.g:4152:1: ruleArraySize
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
    // InternalRecordLang.g:4161:1: rule__ArraySize__SizeAssignment_2 : ( RULE_INT ) ;
    public final void rule__ArraySize__SizeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4165:1: ( ( RULE_INT ) )
            // InternalRecordLang.g:4166:1: ( RULE_INT )
            {
            // InternalRecordLang.g:4166:1: ( RULE_INT )
            // InternalRecordLang.g:4167:1: RULE_INT
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
    // InternalRecordLang.g:4176:1: rule__ArrayLiteral__LiteralsAssignment_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4180:1: ( ( ruleLiteral ) )
            // InternalRecordLang.g:4181:1: ( ruleLiteral )
            {
            // InternalRecordLang.g:4181:1: ( ruleLiteral )
            // InternalRecordLang.g:4182:1: ruleLiteral
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
    // InternalRecordLang.g:4191:1: rule__ArrayLiteral__LiteralsAssignment_2_1 : ( ruleLiteral ) ;
    public final void rule__ArrayLiteral__LiteralsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4195:1: ( ( ruleLiteral ) )
            // InternalRecordLang.g:4196:1: ( ruleLiteral )
            {
            // InternalRecordLang.g:4196:1: ( ruleLiteral )
            // InternalRecordLang.g:4197:1: ruleLiteral
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
    // InternalRecordLang.g:4206:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4210:1: ( ( RULE_STRING ) )
            // InternalRecordLang.g:4211:1: ( RULE_STRING )
            {
            // InternalRecordLang.g:4211:1: ( RULE_STRING )
            // InternalRecordLang.g:4212:1: RULE_STRING
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
    // InternalRecordLang.g:4221:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4225:1: ( ( RULE_INT ) )
            // InternalRecordLang.g:4226:1: ( RULE_INT )
            {
            // InternalRecordLang.g:4226:1: ( RULE_INT )
            // InternalRecordLang.g:4227:1: RULE_INT
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
    // InternalRecordLang.g:4236:1: rule__FloatLiteral__ValueAssignment : ( RULE_FLOAT ) ;
    public final void rule__FloatLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4240:1: ( ( RULE_FLOAT ) )
            // InternalRecordLang.g:4241:1: ( RULE_FLOAT )
            {
            // InternalRecordLang.g:4241:1: ( RULE_FLOAT )
            // InternalRecordLang.g:4242:1: RULE_FLOAT
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
    // InternalRecordLang.g:4251:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4255:1: ( ( RULE_BOOLEAN ) )
            // InternalRecordLang.g:4256:1: ( RULE_BOOLEAN )
            {
            // InternalRecordLang.g:4256:1: ( RULE_BOOLEAN )
            // InternalRecordLang.g:4257:1: RULE_BOOLEAN
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
    // InternalRecordLang.g:4266:1: rule__ConstantLiteral__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ConstantLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4270:1: ( ( ( RULE_ID ) ) )
            // InternalRecordLang.g:4271:1: ( ( RULE_ID ) )
            {
            // InternalRecordLang.g:4271:1: ( ( RULE_ID ) )
            // InternalRecordLang.g:4272:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConstantLiteralAccess().getValueConstantCrossReference_0()); 
            }
            // InternalRecordLang.g:4273:1: ( RULE_ID )
            // InternalRecordLang.g:4274:1: RULE_ID
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
    // InternalRecordLang.g:4285:1: rule__BuiltInValueLiteral__ValueAssignment_1 : ( ( 'KIEKER_VERSION' ) ) ;
    public final void rule__BuiltInValueLiteral__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalRecordLang.g:4289:1: ( ( ( 'KIEKER_VERSION' ) ) )
            // InternalRecordLang.g:4290:1: ( ( 'KIEKER_VERSION' ) )
            {
            // InternalRecordLang.g:4290:1: ( ( 'KIEKER_VERSION' ) )
            // InternalRecordLang.g:4291:1: ( 'KIEKER_VERSION' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            // InternalRecordLang.g:4292:1: ( 'KIEKER_VERSION' )
            // InternalRecordLang.g:4293:1: 'KIEKER_VERSION'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBuiltInValueLiteralAccess().getValueKIEKER_VERSIONKeyword_1_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000020021E0000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000020021C0002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000020021C0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000A900C010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000A800C012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002002180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004A00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000040008001F0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000A000C010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000001400000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});

}
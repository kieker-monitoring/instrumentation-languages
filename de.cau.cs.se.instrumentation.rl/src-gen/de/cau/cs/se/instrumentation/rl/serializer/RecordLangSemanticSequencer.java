package de.cau.cs.se.instrumentation.rl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.se.instrumentation.rl.recordLang.Array;
import de.cau.cs.se.instrumentation.rl.recordLang.ArraySize;
import de.cau.cs.se.instrumentation.rl.recordLang.BooleanLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Classifier;
import de.cau.cs.se.instrumentation.rl.recordLang.Constant;
import de.cau.cs.se.instrumentation.rl.recordLang.ConstantLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.FloatLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Import;
import de.cau.cs.se.instrumentation.rl.recordLang.IntLiteral;
import de.cau.cs.se.instrumentation.rl.recordLang.Model;
import de.cau.cs.se.instrumentation.rl.recordLang.PartialRecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.Property;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordLangPackage;
import de.cau.cs.se.instrumentation.rl.recordLang.RecordType;
import de.cau.cs.se.instrumentation.rl.recordLang.ReferenceProperty;
import de.cau.cs.se.instrumentation.rl.recordLang.StringLiteral;
import de.cau.cs.se.instrumentation.rl.services.RecordLangGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class RecordLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RecordLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == RecordLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case RecordLangPackage.ARRAY:
				if(context == grammarAccess.getArrayRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.ARRAY_SIZE:
				if(context == grammarAccess.getArraySizeRule()) {
					sequence_ArraySize(context, (ArraySize) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.BOOLEAN_LITERAL:
				if(context == grammarAccess.getBooleanLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.CLASSIFIER:
				if(context == grammarAccess.getClassifierRule()) {
					sequence_Classifier(context, (Classifier) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.CONSTANT_LITERAL:
				if(context == grammarAccess.getConstantLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_ConstantLiteral(context, (ConstantLiteral) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.FLOAT_LITERAL:
				if(context == grammarAccess.getFloatLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_FloatLiteral(context, (FloatLiteral) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.INT_LITERAL:
				if(context == grammarAccess.getIntLiteralRule() ||
				   context == grammarAccess.getLiteralRule()) {
					sequence_IntLiteral(context, (IntLiteral) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.PACKAGE:
				if(context == grammarAccess.getPackageRule()) {
					sequence_Package(context, (de.cau.cs.se.instrumentation.rl.recordLang.Package) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.PARTIAL_RECORD_TYPE:
				if(context == grammarAccess.getPartialRecordTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_PartialRecordType(context, (PartialRecordType) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.PROPERTY:
				if(context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.RECORD_TYPE:
				if(context == grammarAccess.getRecordTypeRule() ||
				   context == grammarAccess.getTypeRule()) {
					sequence_RecordType(context, (RecordType) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.REFERENCE_PROPERTY:
				if(context == grammarAccess.getReferencePropertyRule()) {
					sequence_ReferenceProperty(context, (ReferenceProperty) semanticObject); 
					return; 
				}
				else break;
			case RecordLangPackage.STRING_LITERAL:
				if(context == grammarAccess.getLiteralRule() ||
				   context == grammarAccess.getStringLiteralRule()) {
					sequence_StringLiteral(context, (StringLiteral) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (size=INT?)
	 */
	protected void sequence_ArraySize(EObject context, ArraySize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (literals+=Literal literals+=Literal*)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanLiteral(EObject context, BooleanLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.BOOLEAN_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.BOOLEAN_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (package=[Package|ID]? class=[EClassifier|ID] sizes+=ArraySize*)
	 */
	protected void sequence_Classifier(EObject context, Classifier semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=[Constant|ID]
	 */
	protected void sequence_ConstantLiteral(EObject context, ConstantLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.CONSTANT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.CONSTANT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantLiteralAccess().getValueConstantIDTerminalRuleCall_0_1(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Classifier name=ID value=Literal)
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.CONSTANT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.CONSTANT__TYPE));
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.CONSTANT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.CONSTANT__NAME));
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getTypeClassifierParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getConstantAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConstantAccess().getValueLiteralParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_FloatLiteral(EObject context, FloatLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.FLOAT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.FLOAT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatLiteralAccess().getValueFLOATTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntLiteral(EObject context, IntLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.INT_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.INT_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName packages+=Package* imports+=Import* types+=Type*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID package=[EPackage|STRING])
	 */
	protected void sequence_Package(EObject context, de.cau.cs.se.instrumentation.rl.recordLang.Package semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.PACKAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.PACKAGE__NAME));
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.PACKAGE__PACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.PACKAGE__PACKAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPackageAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPackageAccess().getPackageEPackageSTRINGTerminalRuleCall_2_0_1(), semanticObject.getPackage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (parents+=[PartialRecordType|QualifiedName] parents+=[PartialRecordType|QualifiedName]*)? 
	 *         (properties+=Property | constants+=Constant)*
	 *     )
	 */
	protected void sequence_PartialRecordType(EObject context, PartialRecordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=Classifier | referTo=[Property|ID]) name=ID (properties+=ReferenceProperty* | value=Literal)?)
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=ID 
	 *         parent=[RecordType|QualifiedName]? 
	 *         (parents+=[PartialRecordType|QualifiedName] parents+=[PartialRecordType|QualifiedName]*)? 
	 *         (properties+=Property | constants+=Constant)*
	 *     )
	 */
	protected void sequence_RecordType(EObject context, RecordType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[EStructuralFeature|ID] properties+=ReferenceProperty*)
	 */
	protected void sequence_ReferenceProperty(EObject context, ReferenceProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringLiteral(EObject context, StringLiteral semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, RecordLangPackage.Literals.STRING_LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RecordLangPackage.Literals.STRING_LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
}

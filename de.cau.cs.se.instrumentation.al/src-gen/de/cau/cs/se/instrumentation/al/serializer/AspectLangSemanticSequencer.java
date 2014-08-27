package de.cau.cs.se.instrumentation.al.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.kieler.core.annotations.Annotation;
import de.cau.cs.kieler.core.annotations.AnnotationsPackage;
import de.cau.cs.kieler.core.annotations.BooleanAnnotation;
import de.cau.cs.kieler.core.annotations.FloatAnnotation;
import de.cau.cs.kieler.core.annotations.ImportAnnotation;
import de.cau.cs.kieler.core.annotations.IntAnnotation;
import de.cau.cs.kieler.core.annotations.StringAnnotation;
import de.cau.cs.kieler.core.annotations.TypedStringAnnotation;
import de.cau.cs.kieler.core.annotations.text.serializer.AnnotationsSemanticSequencer;
import de.cau.cs.se.instrumentation.al.aspectLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.aspectLang.Aspect;
import de.cau.cs.se.instrumentation.al.aspectLang.AspectLangPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.Collector;
import de.cau.cs.se.instrumentation.al.aspectLang.CompositionQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.aspectLang.FloatValue;
import de.cau.cs.se.instrumentation.al.aspectLang.Import;
import de.cau.cs.se.instrumentation.al.aspectLang.IntValue;
import de.cau.cs.se.instrumentation.al.aspectLang.InternalFunctionProperty;
import de.cau.cs.se.instrumentation.al.aspectLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.MethodQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.Model;
import de.cau.cs.se.instrumentation.al.aspectLang.ParamCompare;
import de.cau.cs.se.instrumentation.al.aspectLang.ParamQuery;
import de.cau.cs.se.instrumentation.al.aspectLang.ParameterDeclaration;
import de.cau.cs.se.instrumentation.al.aspectLang.ParameterPattern;
import de.cau.cs.se.instrumentation.al.aspectLang.ParentNode;
import de.cau.cs.se.instrumentation.al.aspectLang.Probe;
import de.cau.cs.se.instrumentation.al.aspectLang.Query;
import de.cau.cs.se.instrumentation.al.aspectLang.ReferenceValue;
import de.cau.cs.se.instrumentation.al.aspectLang.ReflectionProperty;
import de.cau.cs.se.instrumentation.al.aspectLang.RegisteredPackage;
import de.cau.cs.se.instrumentation.al.aspectLang.RuntimeProperty;
import de.cau.cs.se.instrumentation.al.aspectLang.StringValue;
import de.cau.cs.se.instrumentation.al.aspectLang.SubPathNode;
import de.cau.cs.se.instrumentation.al.aspectLang.WildcardNode;
import de.cau.cs.se.instrumentation.al.services.AspectLangGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AspectLangSemanticSequencer extends AnnotationsSemanticSequencer {

	@Inject
	private AspectLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AnnotationsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AnnotationsPackage.ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getTagAnnotationRule()) {
					sequence_TagAnnotation(context, (Annotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.BOOLEAN_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyBooleanValueAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_KeyBooleanValueAnnotation(context, (BooleanAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.FLOAT_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyFloatValueAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_KeyFloatValueAnnotation(context, (FloatAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.IMPORT_ANNOTATION:
				if(context == grammarAccess.getImportAnnotationRule()) {
					sequence_ImportAnnotation(context, (ImportAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.INT_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getKeyIntValueAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_KeyIntValueAnnotation(context, (IntAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.STRING_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_Annotation_CommentAnnotation_KeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getCommentAnnotationRule()) {
					sequence_CommentAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getKeyStringValueAnnotationRule()) {
					sequence_KeyStringValueAnnotation(context, (StringAnnotation) semanticObject); 
					return; 
				}
				else break;
			case AnnotationsPackage.TYPED_STRING_ANNOTATION:
				if(context == grammarAccess.getAnnotationRule() ||
				   context == grammarAccess.getTypedKeyStringValueAnnotationRule() ||
				   context == grammarAccess.getValuedAnnotationRule()) {
					sequence_TypedKeyStringValueAnnotation(context, (TypedStringAnnotation) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == AspectLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AspectLangPackage.APPLICATION_MODEL:
				if(context == grammarAccess.getApplicationModelRule()) {
					sequence_ApplicationModel(context, (ApplicationModel) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.ASPECT:
				if(context == grammarAccess.getAspectRule()) {
					sequence_Aspect(context, (Aspect) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.COLLECTOR:
				if(context == grammarAccess.getCollectorRule()) {
					sequence_Collector(context, (Collector) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.COMPOSITION_QUERY:
				if(context == grammarAccess.getCompositionQueryRule()) {
					sequence_CompositionQuery(context, (CompositionQuery) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.CONTAINER_NODE:
				if(context == grammarAccess.getContainerNodeRule()) {
					sequence_ContainerNode(context, (ContainerNode) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNodeRule()) {
					sequence_ContainerNode_Node(context, (ContainerNode) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.FLOAT_VALUE:
				if(context == grammarAccess.getFloatValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_FloatValue(context, (FloatValue) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.INT_VALUE:
				if(context == grammarAccess.getIntValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntValue(context, (IntValue) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.INTERNAL_FUNCTION_PROPERTY:
				if(context == grammarAccess.getInternalFunctionPropertyRule() ||
				   context == grammarAccess.getParameterRule()) {
					sequence_InternalFunctionProperty(context, (InternalFunctionProperty) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.LOCATION_QUERY:
				if(context == grammarAccess.getLocationQueryRule()) {
					sequence_LocationQuery(context, (LocationQuery) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.METHOD_QUERY:
				if(context == grammarAccess.getMethodQueryRule()) {
					sequence_MethodQuery(context, (MethodQuery) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.PARAM_COMPARE:
				if(context == grammarAccess.getParamCompareRule()) {
					sequence_ParamCompare(context, (ParamCompare) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.PARAM_QUERY:
				if(context == grammarAccess.getParamQueryRule()) {
					sequence_ParamQuery(context, (ParamQuery) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.PARAMETER_DECLARATION:
				if(context == grammarAccess.getParameterDeclarationRule()) {
					sequence_ParameterDeclaration(context, (ParameterDeclaration) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.PARAMETER_PATTERN:
				if(context == grammarAccess.getParameterPatternRule()) {
					sequence_ParameterPattern(context, (ParameterPattern) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.PARENT_NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (ParentNode) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getParentNodeRule()) {
					sequence_ParentNode(context, (ParentNode) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.PROBE:
				if(context == grammarAccess.getProbeRule()) {
					sequence_Probe(context, (Probe) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.QUERY:
				if(context == grammarAccess.getQueryRule()) {
					sequence_Query(context, (Query) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.REFERENCE_VALUE:
				if(context == grammarAccess.getReferenceValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ReferenceValue(context, (ReferenceValue) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.REFLECTION_PROPERTY:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getReflectionPropertyRule()) {
					sequence_ReflectionProperty(context, (ReflectionProperty) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.REGISTERED_PACKAGE:
				if(context == grammarAccess.getRegisteredPackageRule()) {
					sequence_RegisteredPackage(context, (RegisteredPackage) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.RUNTIME_PROPERTY:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRuntimePropertyRule()) {
					sequence_RuntimeProperty(context, (RuntimeProperty) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.STRING_VALUE:
				if(context == grammarAccess.getStringValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.SUB_PATH_NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (SubPathNode) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubPathNodeRule()) {
					sequence_SubPathNode(context, (SubPathNode) semanticObject); 
					return; 
				}
				else break;
			case AspectLangPackage.WILDCARD_NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (WildcardNode) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getWildcardNodeRule()) {
					sequence_WildcardNode(context, (WildcardNode) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (usePackages+=[RegisteredPackage|ID] usePackages+=[RegisteredPackage|ID]* name=ID model=STRING)
	 */
	protected void sequence_ApplicationModel(EObject context, ApplicationModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (annotation=Annotation? probe=[Probe|QualifiedName] query=Query)
	 */
	protected void sequence_Aspect(EObject context, Aspect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (insertionPoint=InsertionPoint type=[RecordType|QualifiedName] (initializations+=Value initializations+=Value*)?)
	 */
	protected void sequence_Collector(EObject context, Collector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=QueryModifier? subQueries+=LocationQuery*)
	 */
	protected void sequence_CompositionQuery(EObject context, CompositionQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     container=[Container|ID]
	 */
	protected void sequence_ContainerNode(EObject context, ContainerNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (container=[Container|ID] parameter=ParamQuery?)
	 */
	protected void sequence_ContainerNode_Node(EObject context, ContainerNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_FloatValue(EObject context, FloatValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.FLOAT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.FLOAT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatValueAccess().getValueFLOATTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
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
	protected void sequence_IntValue(EObject context, IntValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.INT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     function=InternalFunction
	 */
	protected void sequence_InternalFunctionProperty(EObject context, InternalFunctionProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.INTERNAL_FUNCTION_PROPERTY__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.INTERNAL_FUNCTION_PROPERTY__FUNCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInternalFunctionPropertyAccess().getFunctionInternalFunctionEnumRuleCall_0(), semanticObject.getFunction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (node=Node (specialization=LocationQuery | composition=CompositionQuery)?)
	 */
	protected void sequence_LocationQuery(EObject context, LocationQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=[MethodModifier|ID]? returnType=[Type|ID]? methodReference=[Method|ID] parameter+=ParameterPattern parameter+=ParameterPattern*)
	 */
	protected void sequence_MethodQuery(EObject context, MethodQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName metamodels+=RegisteredPackage* imports+=Import* sources+=ApplicationModel* (probes+=Probe | aspects+=Aspect)*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=ParamQuery?)
	 */
	protected void sequence_Node(EObject context, ParentNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=ParamQuery?)
	 */
	protected void sequence_Node(EObject context, SubPathNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (parameter=ParamQuery?)
	 */
	protected void sequence_Node(EObject context, WildcardNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Value operator=Operator right=Value)
	 */
	protected void sequence_ParamCompare(EObject context, ParamCompare semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.PARAM_COMPARE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.PARAM_COMPARE__LEFT));
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.PARAM_COMPARE__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.PARAM_COMPARE__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.PARAM_COMPARE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.PARAM_COMPARE__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParamCompareAccess().getLeftValueParserRuleCall_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getParamCompareAccess().getOperatorOperatorEnumRuleCall_1_0_0(), semanticObject.getOperator());
		feeder.accept(grammarAccess.getParamCompareAccess().getRightValueParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     queries+=ParamCompare+
	 */
	protected void sequence_ParamQuery(EObject context, ParamQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='type' name=ID)
	 */
	protected void sequence_ParameterDeclaration(EObject context, ParameterDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.PARAMETER_DECLARATION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.PARAMETER_DECLARATION__TYPE));
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.PARAMETER_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.PARAMETER_DECLARATION__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterDeclarationAccess().getTypeTypeKeyword_0_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (modifier=[ParameterModifier|ID]? type=[Type|ID] parameter=[Parameter|ID])
	 */
	protected void sequence_ParameterPattern(EObject context, ParameterPattern semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {ParentNode}
	 */
	protected void sequence_ParentNode(EObject context, ParentNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameterDeclarations+=ParameterDeclaration parameterDeclarations+=ParameterDeclaration*)? collectors+=Collector*)
	 */
	protected void sequence_Probe(EObject context, Probe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (location=LocationQuery method=MethodQuery?)
	 */
	protected void sequence_Query(EObject context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (query=LocationQuery? parameter=Parameter)
	 */
	protected void sequence_ReferenceValue(EObject context, ReferenceValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     function=ReflectionFunction
	 */
	protected void sequence_ReflectionProperty(EObject context, ReflectionProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.REFLECTION_PROPERTY__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.REFLECTION_PROPERTY__FUNCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReflectionPropertyAccess().getFunctionReflectionFunctionEnumRuleCall_1_0(), semanticObject.getFunction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID ePackage=[EPackage|STRING])
	 */
	protected void sequence_RegisteredPackage(EObject context, RegisteredPackage semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.REGISTERED_PACKAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.REGISTERED_PACKAGE__NAME));
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.REGISTERED_PACKAGE__EPACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.REGISTERED_PACKAGE__EPACKAGE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRegisteredPackageAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRegisteredPackageAccess().getEPackageEPackageSTRINGTerminalRuleCall_2_0_1(), semanticObject.getEPackage());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     reference=ID
	 */
	protected void sequence_RuntimeProperty(EObject context, RuntimeProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.RUNTIME_PROPERTY__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.RUNTIME_PROPERTY__REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRuntimePropertyAccess().getReferenceIDTerminalRuleCall_1_0(), semanticObject.getReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AspectLangPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AspectLangPackage.Literals.STRING_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SubPathNode}
	 */
	protected void sequence_SubPathNode(EObject context, SubPathNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {WildcardNode}
	 */
	protected void sequence_WildcardNode(EObject context, WildcardNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

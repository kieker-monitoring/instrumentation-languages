package de.cau.cs.se.instrumentation.al.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationLangPackage;
import de.cau.cs.se.instrumentation.al.applicationLang.ApplicationModel;
import de.cau.cs.se.instrumentation.al.applicationLang.Aspect;
import de.cau.cs.se.instrumentation.al.applicationLang.Collector;
import de.cau.cs.se.instrumentation.al.applicationLang.ContainerNode;
import de.cau.cs.se.instrumentation.al.applicationLang.FloatValue;
import de.cau.cs.se.instrumentation.al.applicationLang.IntValue;
import de.cau.cs.se.instrumentation.al.applicationLang.LocationQuery;
import de.cau.cs.se.instrumentation.al.applicationLang.Model;
import de.cau.cs.se.instrumentation.al.applicationLang.ParamCompare;
import de.cau.cs.se.instrumentation.al.applicationLang.ParamQuery;
import de.cau.cs.se.instrumentation.al.applicationLang.ParameterPattern;
import de.cau.cs.se.instrumentation.al.applicationLang.Query;
import de.cau.cs.se.instrumentation.al.applicationLang.ReferenceValue;
import de.cau.cs.se.instrumentation.al.applicationLang.ReflectionProperty;
import de.cau.cs.se.instrumentation.al.applicationLang.RegisteredPackage;
import de.cau.cs.se.instrumentation.al.applicationLang.RuntimeProperty;
import de.cau.cs.se.instrumentation.al.applicationLang.StringValue;
import de.cau.cs.se.instrumentation.al.applicationLang.SubPathNode;
import de.cau.cs.se.instrumentation.al.applicationLang.WildcardNode;
import de.cau.cs.se.instrumentation.al.services.ApplicationLangGrammarAccess;
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
public class ApplicationLangSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ApplicationLangGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ApplicationLangPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ApplicationLangPackage.APPLICATION_MODEL:
				if(context == grammarAccess.getApplicationModelRule()) {
					sequence_ApplicationModel(context, (ApplicationModel) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.ASPECT:
				if(context == grammarAccess.getAspectRule()) {
					sequence_Aspect(context, (Aspect) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.COLLECTOR:
				if(context == grammarAccess.getCollectorRule()) {
					sequence_Collector(context, (Collector) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.CONTAINER_NODE:
				if(context == grammarAccess.getContainerNodeRule()) {
					sequence_ContainerNode(context, (ContainerNode) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNodeRule()) {
					sequence_ContainerNode_Node(context, (ContainerNode) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.FLOAT_VALUE:
				if(context == grammarAccess.getFloatValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_FloatValue(context, (FloatValue) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.INT_VALUE:
				if(context == grammarAccess.getIntValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_IntValue(context, (IntValue) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.LOCATION_QUERY:
				if(context == grammarAccess.getLocationQueryRule()) {
					sequence_LocationQuery(context, (LocationQuery) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.PARAM_COMPARE:
				if(context == grammarAccess.getParamCompareRule()) {
					sequence_ParamCompare(context, (ParamCompare) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.PARAM_QUERY:
				if(context == grammarAccess.getParamQueryRule()) {
					sequence_ParamQuery(context, (ParamQuery) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.PARAMETER_PATTERN:
				if(context == grammarAccess.getParameterPatternRule()) {
					sequence_ParameterPattern(context, (ParameterPattern) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.QUERY:
				if(context == grammarAccess.getQueryRule()) {
					sequence_Query(context, (Query) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.REFERENCE_VALUE:
				if(context == grammarAccess.getReferenceValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_ReferenceValue(context, (ReferenceValue) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.REFLECTION_PROPERTY:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getReflectionPropertyRule()) {
					sequence_ReflectionProperty(context, (ReflectionProperty) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.REGISTERED_PACKAGE:
				if(context == grammarAccess.getRegisteredPackageRule()) {
					sequence_RegisteredPackage(context, (RegisteredPackage) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.RUNTIME_PROPERTY:
				if(context == grammarAccess.getParameterRule() ||
				   context == grammarAccess.getRuntimePropertyRule()) {
					sequence_RuntimeProperty(context, (RuntimeProperty) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.STRING_VALUE:
				if(context == grammarAccess.getStringValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.SUB_PATH_NODE:
				if(context == grammarAccess.getNodeRule()) {
					sequence_Node(context, (SubPathNode) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSubPathNodeRule()) {
					sequence_SubPathNode(context, (SubPathNode) semanticObject); 
					return; 
				}
				else break;
			case ApplicationLangPackage.WILDCARD_NODE:
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
	 *     (query=Query collectors+=Collector)
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
	 *     value=INT
	 */
	protected void sequence_FloatValue(EObject context, FloatValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.FLOAT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.FLOAT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFloatValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_IntValue(EObject context, IntValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.INT_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.INT_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIntValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (node=Node specialization=LocationQuery?)
	 */
	protected void sequence_LocationQuery(EObject context, LocationQuery semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=QualifiedName metamodels+=RegisteredPackage* sources+=ApplicationModel* aspects+=Aspect*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
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
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.PARAM_COMPARE__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.PARAM_COMPARE__LEFT));
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.PARAM_COMPARE__OPERATOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.PARAM_COMPARE__OPERATOR));
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.PARAM_COMPARE__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.PARAM_COMPARE__RIGHT));
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
	 *     (modifier=[ParameterModifier|ID] type=[Type|ID] parameter=[Parameter|ID])
	 */
	protected void sequence_ParameterPattern(EObject context, ParameterPattern semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.PARAMETER_PATTERN__MODIFIER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.PARAMETER_PATTERN__MODIFIER));
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.PARAMETER_PATTERN__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.PARAMETER_PATTERN__TYPE));
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.PARAMETER_PATTERN__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.PARAMETER_PATTERN__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterPatternAccess().getModifierParameterModifierIDTerminalRuleCall_0_0_1(), semanticObject.getModifier());
		feeder.accept(grammarAccess.getParameterPatternAccess().getTypeTypeIDTerminalRuleCall_1_0_1(), semanticObject.getType());
		feeder.accept(grammarAccess.getParameterPatternAccess().getParameterParameterIDTerminalRuleCall_2_0_1(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         location=LocationQuery 
	 *         (modifier=[MethodModifier|ID]? returnType=[Type|ID]? method=[Method|ID] parameter+=ParameterPattern parameter+=ParameterPattern*)?
	 *     )
	 */
	protected void sequence_Query(EObject context, Query semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (query=LocationQuery parameter=Parameter)
	 */
	protected void sequence_ReferenceValue(EObject context, ReferenceValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.REFERENCE_VALUE__QUERY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.REFERENCE_VALUE__QUERY));
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.REFERENCE_VALUE__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.REFERENCE_VALUE__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceValueAccess().getQueryLocationQueryParserRuleCall_0_0(), semanticObject.getQuery());
		feeder.accept(grammarAccess.getReferenceValueAccess().getParameterParameterParserRuleCall_1_0(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     function=ReflectionFunction
	 */
	protected void sequence_ReflectionProperty(EObject context, ReflectionProperty semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.REFLECTION_PROPERTY__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.REFLECTION_PROPERTY__FUNCTION));
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
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.REGISTERED_PACKAGE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.REGISTERED_PACKAGE__NAME));
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.REGISTERED_PACKAGE__EPACKAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.REGISTERED_PACKAGE__EPACKAGE));
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
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.RUNTIME_PROPERTY__REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.RUNTIME_PROPERTY__REFERENCE));
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
			if(transientValues.isValueTransient(semanticObject, ApplicationLangPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ApplicationLangPackage.Literals.STRING_VALUE__VALUE));
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

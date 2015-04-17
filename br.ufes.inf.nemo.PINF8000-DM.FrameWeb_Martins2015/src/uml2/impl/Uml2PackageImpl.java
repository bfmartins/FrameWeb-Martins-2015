/**
 */
package uml2.impl;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import primitiveTypes.PrimitiveTypesPackage;

import primitiveTypes.impl.PrimitiveTypesPackageImpl;

import uml2.Abstraction;
import uml2.AcceptCallAction;
import uml2.AcceptEventAction;
import uml2.Action;
import uml2.ActionExecutionSpecification;
import uml2.ActionInputPin;
import uml2.Activity;
import uml2.ActivityEdge;
import uml2.ActivityFinalNode;
import uml2.ActivityGroup;
import uml2.ActivityNode;
import uml2.ActivityParameterNode;
import uml2.ActivityPartition;
import uml2.Actor;
import uml2.AddStructuralFeatureValueAction;
import uml2.AddVariableValueAction;
import uml2.AggregationKind;
import uml2.AnyReceiveEvent;
import uml2.Artifact;
import uml2.Association;
import uml2.AssociationClass;
import uml2.Behavior;
import uml2.BehaviorExecutionSpecification;
import uml2.BehavioralFeature;
import uml2.BehavioredClassifier;
import uml2.BroadcastSignalAction;
import uml2.CallAction;
import uml2.CallBehaviorAction;
import uml2.CallConcurrencyKind;
import uml2.CallEvent;
import uml2.CallOperationAction;
import uml2.CentralBufferNode;
import uml2.ChangeEvent;
import uml2.Classifier;
import uml2.ClassifierTemplateParameter;
import uml2.Clause;
import uml2.ClearAssociationAction;
import uml2.ClearStructuralFeatureAction;
import uml2.ClearVariableAction;
import uml2.Collaboration;
import uml2.CollaborationUse;
import uml2.CombinedFragment;
import uml2.Comment;
import uml2.CommunicationPath;
import uml2.Component;
import uml2.ComponentRealization;
import uml2.ConditionalNode;
import uml2.ConnectableElement;
import uml2.ConnectableElementTemplateParameter;
import uml2.ConnectionPointReference;
import uml2.Connector;
import uml2.ConnectorEnd;
import uml2.ConnectorKind;
import uml2.ConsiderIgnoreFragment;
import uml2.Constraint;
import uml2.Continuation;
import uml2.ControlFlow;
import uml2.ControlNode;
import uml2.CreateLinkAction;
import uml2.CreateLinkObjectAction;
import uml2.CreateObjectAction;
import uml2.DataStoreNode;
import uml2.DataType;
import uml2.DecisionNode;
import uml2.Dependency;
import uml2.DeployedArtifact;
import uml2.Deployment;
import uml2.DeploymentSpecification;
import uml2.DeploymentTarget;
import uml2.DestroyLinkAction;
import uml2.DestroyObjectAction;
import uml2.DestructionOccurenceSpecification;
import uml2.Device;
import uml2.DirectedRelationship;
import uml2.Duration;
import uml2.DurationConstraint;
import uml2.DurationInterval;
import uml2.DurationObservation;
import uml2.Element;
import uml2.ElementImport;
import uml2.EncapsulatedClassifier;
import uml2.Enumeration;
import uml2.EnumerationLiteral;
import uml2.Event;
import uml2.ExceptionHandler;
import uml2.ExecutableNode;
import uml2.ExecutionEnvironment;
import uml2.ExecutionOccurrenceSpecification;
import uml2.ExecutionSpecification;
import uml2.ExpansionKind;
import uml2.ExpansionNode;
import uml2.ExpansionRegion;
import uml2.Expression;
import uml2.Extend;
import uml2.Extension;
import uml2.ExtensionEnd;
import uml2.ExtensionPoint;
import uml2.Feature;
import uml2.FinalNode;
import uml2.FinalState;
import uml2.FlowFinalNode;
import uml2.ForkNode;
import uml2.FunctionBehavior;
import uml2.Gate;
import uml2.GeneralOrdering;
import uml2.Generalization;
import uml2.GeneralizationSet;
import uml2.Image;
import uml2.Include;
import uml2.InformationFlow;
import uml2.InformationItem;
import uml2.InitialNode;
import uml2.InputPin;
import uml2.InstanceSpecification;
import uml2.InstanceValue;
import uml2.Interaction;
import uml2.InteractionConstraint;
import uml2.InteractionFragment;
import uml2.InteractionOperand;
import uml2.InteractionOperatorKind;
import uml2.InteractionUse;
import uml2.Interface;
import uml2.InterfaceRealization;
import uml2.InterruptibleActivityRegion;
import uml2.Interval;
import uml2.IntervalConstraint;
import uml2.InvocationAction;
import uml2.JoinNode;
import uml2.Lifeline;
import uml2.LinkAction;
import uml2.LinkEndCreationData;
import uml2.LinkEndData;
import uml2.LinkEndDestructionData;
import uml2.LiteralBoolean;
import uml2.LiteralInteger;
import uml2.LiteralNull;
import uml2.LiteralReal;
import uml2.LiteralSpecification;
import uml2.LiteralString;
import uml2.LiteralUnlimitedNatural;
import uml2.LoopNode;
import uml2.Manifestation;
import uml2.MergeNode;
import uml2.Message;
import uml2.MessageEnd;
import uml2.MessageEvent;
import uml2.MessageKind;
import uml2.MessageOccurrenceSpecification;
import uml2.MessageSort;
import uml2.Model;
import uml2.MultiplicityElement;
import uml2.NamedElement;
import uml2.Namespace;
import uml2.Node;
import uml2.ObjectFlow;
import uml2.Observation;
import uml2.OccurrenceSpecification;
import uml2.OpaqueAction;
import uml2.OpaqueBehavior;
import uml2.OpaqueExpression;
import uml2.Operation;
import uml2.OperationTemplateParameter;
import uml2.OutputPin;
import uml2.PackageImport;
import uml2.PackageMerge;
import uml2.PackageableElement;
import uml2.Parameter;
import uml2.ParameterDirectionKind;
import uml2.ParameterEffectKind;
import uml2.ParameterSet;
import uml2.ParameterableElement;
import uml2.PartDecomposition;
import uml2.Pin;
import uml2.Port;
import uml2.PrimitiveType;
import uml2.Profile;
import uml2.ProfileApplication;
import uml2.Property;
import uml2.ProtocolConformance;
import uml2.ProtocolStateMachine;
import uml2.ProtocolTransition;
import uml2.Pseudostate;
import uml2.PseudostateKind;
import uml2.QualifierValue;
import uml2.RaiseExceptionAction;
import uml2.ReadExtentAction;
import uml2.ReadIsClassifiedObjectAction;
import uml2.ReadLinkAction;
import uml2.ReadLinkObjectEndAction;
import uml2.ReadLinkObjectEndQualifierAction;
import uml2.ReadSelfAction;
import uml2.ReadStructuralFeatureAction;
import uml2.ReadVariableAction;
import uml2.Realization;
import uml2.Reception;
import uml2.ReclassifyObjectAction;
import uml2.RedefinableElement;
import uml2.RedefinableTemplateSignature;
import uml2.ReduceAction;
import uml2.Region;
import uml2.Relationship;
import uml2.RemoveStructuralFeatureValueAction;
import uml2.RemoveVariableValueAction;
import uml2.ReplyAction;
import uml2.SendObjectAction;
import uml2.SendSignalAction;
import uml2.SequenceNode;
import uml2.Signal;
import uml2.SignalEvent;
import uml2.Slot;
import uml2.StartClassifierBehaviorAction;
import uml2.StartObjectBehaviorAction;
import uml2.State;
import uml2.StateInvariant;
import uml2.StateMachine;
import uml2.Stereotype;
import uml2.StringExpression;
import uml2.StructuralFeature;
import uml2.StructuralFeatureAction;
import uml2.StructuredActivityNode;
import uml2.StructuredClassifier;
import uml2.Substitution;
import uml2.TemplateBinding;
import uml2.TemplateParameter;
import uml2.TemplateParameterSubstitution;
import uml2.TemplateSignature;
import uml2.TemplateableElement;
import uml2.TestIdentityAction;
import uml2.TimeConstraint;
import uml2.TimeEvent;
import uml2.TimeExpression;
import uml2.TimeInterval;
import uml2.TimeObservation;
import uml2.Transition;
import uml2.TransitionKind;
import uml2.Trigger;
import uml2.Type;
import uml2.TypedElement;
import uml2.Uml2Factory;
import uml2.Uml2Package;
import uml2.UnmarshallAction;
import uml2.Usage;
import uml2.UseCase;
import uml2.ValuePin;
import uml2.ValueSpecification;
import uml2.ValueSpecificationAction;
import uml2.Variable;
import uml2.VariableAction;
import uml2.Vertex;
import uml2.VisibilityKind;
import uml2.WriteLinkAction;
import uml2.WriteStructuralFeatureAction;
import uml2.WriteVariableAction;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Uml2PackageImpl extends EPackageImpl implements Uml2Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass directedRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateParameterSubstitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stereotypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass featureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentTargetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deploymentSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass artifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deployedArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manifestationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behavioralFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectableElementTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolStateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateMachineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudostateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionPointReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolConformanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass redefinableTemplateSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass useCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classifierTemplateParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encapsulatedClassifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass packageMergeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptCallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptEventActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executableNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuredActivityNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interruptibleActivityRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifelineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partDecompositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionOperandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generalOrderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionInputPinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityParameterNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anyReceiveEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorExecutionSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass broadcastSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass invocationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callOperationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass centralBufferNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clauseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearAssociationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass combinedFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass considerIgnoreFragmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass continuationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass writeLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualifierValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndCreationDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createLinkObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decisionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEndDestructionDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destructionOccurenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durationObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumerationLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass executionOccurrenceSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expansionRegionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finalStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowFinalNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forkNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueBehaviorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initialNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalRealEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalUnlimitedNaturalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mergeNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass opaqueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protocolTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass raiseExceptionActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readExtentActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readIsClassifiedObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readLinkObjectEndQualifierActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readSelfActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readStructuralFeatureActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readVariableActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reclassifyObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reduceActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeStructuralFeatureValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeVariableValueActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendObjectActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendSignalActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startClassifierBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startObjectBehaviorActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateInvariantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testIdentityActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeIntervalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeObservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unmarshallActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass usageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valuePinEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueSpecificationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum callConcurrencyKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterDirectionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum parameterEffectKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transitionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pseudostateKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum connectorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageSortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionOperatorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expansionKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see uml2.Uml2Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Uml2PackageImpl() {
		super(eNS_URI, Uml2Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Uml2Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Uml2Package init() {
		if (isInited) return (Uml2Package)EPackage.Registry.INSTANCE.getEPackage(Uml2Package.eNS_URI);

		// Obtain or create and register package
		Uml2PackageImpl theUml2Package = (Uml2PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Uml2PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Uml2PackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		PrimitiveTypesPackageImpl thePrimitiveTypesPackage = (PrimitiveTypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) instanceof PrimitiveTypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI) : PrimitiveTypesPackage.eINSTANCE);

		// Create package meta-data objects
		theUml2Package.createPackageContents();
		thePrimitiveTypesPackage.createPackageContents();

		// Initialize created meta-data
		theUml2Package.initializePackageContents();
		thePrimitiveTypesPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUml2Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return Uml2Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theUml2Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Uml2Package.eNS_URI, theUml2Package);
		return theUml2Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstraction() {
		return abstractionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstraction_Mapping() {
		return (EReference)abstractionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDependency() {
		return dependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Client() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDependency_Supplier() {
		return (EReference)dependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDirectedRelationship() {
		return directedRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Source() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDirectedRelationship_Target() {
		return (EReference)directedRelationshipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationship() {
		return relationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRelationship_RelatedElement() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedComment() {
		return (EReference)elementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_OwnedElement() {
		return (EReference)elementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElement_Owner() {
		return (EReference)elementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__NotOwnSelf__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__HasOwner__DiagnosticChain_Map() {
		return elementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__AllOwnedElements() {
		return elementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElement__MustBeOwned() {
		return elementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComment() {
		return commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComment_AnnotatedElement() {
		return (EReference)commentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComment_Body() {
		return (EAttribute)commentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageableElement() {
		return packageableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterableElement() {
		return parameterableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterableElement_OwningTemplateParameter() {
		return (EReference)parameterableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterableElement_TemplateParameter() {
		return (EReference)parameterableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterableElement__IsCompatibleWith__ParameterableElement() {
		return parameterableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterableElement__IsTemplateParameter() {
		return parameterableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameter() {
		return templateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_Default() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedDefault() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_ParameteredElement() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_Signature() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameter_OwnedParameteredElement() {
		return (EReference)templateParameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateParameter__MustBeCompatible__DiagnosticChain_Map() {
		return templateParameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateSignature() {
		return templateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Parameter() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_Template() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateSignature_OwnedParameter() {
		return (EReference)templateSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateSignature__OwnElements__DiagnosticChain_Map() {
		return templateSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateableElement() {
		return templateableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_TemplateBinding() {
		return (EReference)templateableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateableElement_OwnedTemplateSignature() {
		return (EReference)templateableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateableElement__IsTemplate() {
		return templateableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateableElement__ParameterableElements() {
		return templateableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateBinding() {
		return templateBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_ParameterSubstitution() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_Signature() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateBinding_BoundElement() {
		return (EReference)templateBindingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateBinding__OneParameterSubstitution__DiagnosticChain_Map() {
		return templateBindingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateBinding__ParameterSubstitutionFormal__DiagnosticChain_Map() {
		return templateBindingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateParameterSubstitution() {
		return templateParameterSubstitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_Actual() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_Formal() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_OwnedActual() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateParameterSubstitution_TemplateBinding() {
		return (EReference)templateParameterSubstitutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTemplateParameterSubstitution__MustBeCompatible__DiagnosticChain_Map() {
		return templateParameterSubstitutionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_ClientDependency() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_NameExpression() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamedElement_Namespace() {
		return (EReference)namedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_QualifiedName() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Visibility() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__HasQualifiedName__DiagnosticChain_Map() {
		return namedElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__HasNoQualifiedName__DiagnosticChain_Map() {
		return namedElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__VisibilityNeedsOwnership__DiagnosticChain_Map() {
		return namedElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__AllNamespaces() {
		return namedElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__AllOwningPackages() {
		return namedElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__IsDistinguishableFrom__NamedElement_Namespace() {
		return namedElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__Namespace() {
		return namedElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__QualifiedName() {
		return namedElementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamedElement__Separator() {
		return namedElementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringExpression() {
		return stringExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_OwningExpression() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStringExpression_SubExpression() {
		return (EReference)stringExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringExpression__Subexpressions__DiagnosticChain_Map() {
		return stringExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStringExpression__Operands__DiagnosticChain_Map() {
		return stringExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpression_Operand() {
		return (EReference)expressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpression_Symbol() {
		return (EAttribute)expressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecification() {
		return valueSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__BooleanValue() {
		return valueSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IntegerValue() {
		return valueSpecificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsComputable() {
		return valueSpecificationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__IsNull() {
		return valueSpecificationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__RealValue() {
		return valueSpecificationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__StringValue() {
		return valueSpecificationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecification__UnlimitedValue() {
		return valueSpecificationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypedElement() {
		return typedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypedElement_Type() {
		return (EReference)typedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getType_Package() {
		return (EReference)typeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getType__ConformsTo__Type() {
		return typeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackage() {
		return packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackage_Uri() {
		return (EAttribute)packageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestedPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_NestingPackage() {
		return (EReference)packageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedStereotype() {
		return (EReference)packageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackageMerge() {
		return (EReference)packageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_PackagedElement() {
		return (EReference)packageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_ProfileApplication() {
		return (EReference)packageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackage_OwnedType() {
		return (EReference)packageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__ElementsPublicOrPrivate__DiagnosticChain_Map() {
		return packageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__AllApplicableStereotypes() {
		return packageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__ContainingProfile() {
		return packageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__MakesVisible__NamedElement() {
		return packageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__NestedPackage() {
		return packageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__OwnedStereotype() {
		return packageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__OwnedType() {
		return packageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackage__VisibleMembers() {
		return packageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ElementImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_ImportedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_Member() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_OwnedRule() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_PackageImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__MembersDistinguishable__DiagnosticChain_Map() {
		return namespaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__ExcludeCollisions__EList() {
		return namespaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__GetNamesOfMember__NamedElement() {
		return namespaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__ImportMembers__EList() {
		return namespaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__ImportedMember() {
		return namespaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__MembersAreDistinguishable() {
		return namespaceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__OwnedMember() {
		return namespaceEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementImport() {
		return elementImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Alias() {
		return (EAttribute)elementImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportedElement() {
		return (EReference)elementImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementImport_Visibility() {
		return (EAttribute)elementImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementImport_ImportingNamespace() {
		return (EReference)elementImportEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementImport__VisibilityPublicOrPrivate__DiagnosticChain_Map() {
		return elementImportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementImport__ImportedElementIsPublic__DiagnosticChain_Map() {
		return elementImportEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getElementImport__GetName() {
		return elementImportEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstraint() {
		return constraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_ConstrainedElement() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Specification() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConstraint_Context() {
		return (EReference)constraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__NotApplyToSelf__DiagnosticChain_Map() {
		return constraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__BooleanValue__DiagnosticChain_Map() {
		return constraintEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__NoSideEffects__DiagnosticChain_Map() {
		return constraintEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConstraint__ValueSpecificationBoolean__DiagnosticChain_Map() {
		return constraintEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageImport() {
		return packageImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportedPackage() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPackageImport_Visibility() {
		return (EAttribute)packageImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageImport_ImportingNamespace() {
		return (EReference)packageImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPackageImport__PublicOrPrivate__DiagnosticChain_Map() {
		return packageImportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStereotype() {
		return stereotypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStereotype_Icon() {
		return (EReference)stereotypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStereotype_Profile() {
		return (EReference)stereotypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStereotype__Generalize__DiagnosticChain_Map() {
		return stereotypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStereotype__AssociationEndOwnership__DiagnosticChain_Map() {
		return stereotypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStereotype__BinaryAssociationsOnly__DiagnosticChain_Map() {
		return stereotypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStereotype__NameNotClash__DiagnosticChain_Map() {
		return stereotypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStereotype__ContainingProfile() {
		return stereotypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStereotype__Profile() {
		return stereotypeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass_() {
		return classEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedOperation() {
		return (EReference)classEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_Extension() {
		return (EReference)classEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClass_IsActive() {
		return (EAttribute)classEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_NestedClassifier() {
		return (EReference)classEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_OwnedReception() {
		return (EReference)classEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClass_SuperClass() {
		return (EReference)classEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__PassiveClass__DiagnosticChain_Map() {
		return classEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__Extension() {
		return classEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClass__SuperClass() {
		return classEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioredClassifier() {
		return behavioredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_ClassifierBehavior() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_InterfaceRealization() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioredClassifier_OwnedBehavior() {
		return (EReference)behavioredClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavioredClassifier__ClassBehavior__DiagnosticChain_Map() {
		return behavioredClassifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifier() {
		return classifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Attribute() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Feature() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_CollaborationUse() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_General() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Generalization() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_PowertypeExtent() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_InheritedMember() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsAbstract() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifier_IsFinalSpecialization() {
		return (EAttribute)classifierEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_OwnedUseCase() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_UseCase() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_RedefinedClassifier() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Representation() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifier_Substitution() {
		return (EReference)classifierEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__NoCyclesInGeneralization__DiagnosticChain_Map() {
		return classifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__SpecializeType__DiagnosticChain_Map() {
		return classifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__NonFinalParents__DiagnosticChain_Map() {
		return classifierEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__MapsToGeneralizationSet__DiagnosticChain_Map() {
		return classifierEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllFeatures() {
		return classifierEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__AllParents() {
		return classifierEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__ConformsTo__Classifier() {
		return classifierEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__General() {
		return classifierEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__HasVisibilityOf__NamedElement() {
		return classifierEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__Inherit__EList() {
		return classifierEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__InheritableMembers__Classifier() {
		return classifierEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__InheritedMember() {
		return classifierEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__MaySpecializeType__Classifier() {
		return classifierEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifier__Parents() {
		return classifierEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableElement() {
		return redefinableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRedefinableElement_IsLeaf() {
		return (EAttribute)redefinableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableElement_RedefinedElement() {
		return (EReference)redefinableElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableElement_RedefinitionContext() {
		return (EReference)redefinableElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__NonLeafRedefinition__DiagnosticChain_Map() {
		return redefinableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__RedefinitionContextValid__DiagnosticChain_Map() {
		return redefinableElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__RedefinitionConsistent__DiagnosticChain_Map() {
		return redefinableElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__IsConsistentWith__RedefinableElement() {
		return redefinableElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableElement__IsRedefinitionContextValid__RedefinableElement() {
		return redefinableElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Datatype() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Interface() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Aggregation() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Association() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_OwningAssociation() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_AssociationEnd() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Qualifier() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Class() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Default() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_DefaultValue() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsComposite() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerived() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsDerivedUnion() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_IsId() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Opposite() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_RedefinedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_SubsettedProperty() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SubsettedPropertyNames__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__BindingToAttribute__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__MultiplicityOfComposite__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__DerivedUnionIsReadOnly__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__RedefinedPropertyInherited__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SubsettingRules__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__DeploymentTarget__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__DerivedUnionIsDerived__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SubsettingContextConforms__DiagnosticChain_Map() {
		return propertyEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__Default_() {
		return propertyEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsAttribute__Property() {
		return propertyEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsComposite() {
		return propertyEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__IsNavigable() {
		return propertyEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__Opposite() {
		return propertyEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProperty__SubsettingContext() {
		return propertyEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeature() {
		return structuralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuralFeature_IsReadOnly() {
		return (EAttribute)structuralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicityElement() {
		return multiplicityElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsOrdered() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_IsUnique() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Lower() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_LowerValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiplicityElement_Upper() {
		return (EAttribute)multiplicityElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiplicityElement_UpperValue() {
		return (EReference)multiplicityElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__ValueSpecificationConstant__DiagnosticChain_Map() {
		return multiplicityElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__LowerGe0__DiagnosticChain_Map() {
		return multiplicityElementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__UpperGeLower__DiagnosticChain_Map() {
		return multiplicityElementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__ValueSpecificationNoSideEffects__DiagnosticChain_Map() {
		return multiplicityElementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__CompatibleWith__MultiplicityElement() {
		return multiplicityElementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__IncludesCardinality__Integer() {
		return multiplicityElementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__IncludesMultiplicity__MultiplicityElement() {
		return multiplicityElementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__Is__Integer_Integer() {
		return multiplicityElementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__IsMultivalued() {
		return multiplicityElementEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__Lower() {
		return multiplicityElementEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__LowerBound() {
		return multiplicityElementEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__Upper() {
		return multiplicityElementEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiplicityElement__UpperBound() {
		return multiplicityElementEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFeature() {
		return featureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFeature_FeaturingClassifier() {
		return (EReference)featureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFeature_IsStatic() {
		return (EAttribute)featureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentTarget() {
		return deploymentTargetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTarget_DeployedElement() {
		return (EReference)deploymentTargetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentTarget_Deployment() {
		return (EReference)deploymentTargetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploymentTarget__DeployedElement() {
		return deploymentTargetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployment() {
		return deploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Configuration() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_DeployedArtifact() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeployment_Location() {
		return (EReference)deploymentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeploymentSpecification() {
		return deploymentSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_DeploymentLocation() {
		return (EAttribute)deploymentSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeploymentSpecification_ExecutionLocation() {
		return (EAttribute)deploymentSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeploymentSpecification_Deployment() {
		return (EReference)deploymentSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploymentSpecification__DeployedElements__DiagnosticChain_Map() {
		return deploymentSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDeploymentSpecification__DeploymentTarget__DiagnosticChain_Map() {
		return deploymentSpecificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArtifact() {
		return artifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArtifact_FileName() {
		return (EAttribute)artifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_Manifestation() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_NestedArtifact() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_OwnedAttribute() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArtifact_OwnedOperation() {
		return (EReference)artifactEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeployedArtifact() {
		return deployedArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManifestation() {
		return manifestationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManifestation_UtilizedElement() {
		return (EReference)manifestationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_BodyCondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Class() {
		return (EReference)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Datatype() {
		return (EReference)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Interface() {
		return (EReference)operationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsOrdered() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsQuery() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_IsUnique() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Lower() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Postcondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Precondition() {
		return (EReference)operationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_RedefinedOperation() {
		return (EReference)operationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOperation_Type() {
		return (EReference)operationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOperation_Upper() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__OnlyBodyForQuery__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__AtMostOneReturn__DiagnosticChain_Map() {
		return operationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__IsOrdered() {
		return operationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__IsUnique() {
		return operationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Lower() {
		return operationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__ReturnResult() {
		return operationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Type() {
		return operationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOperation__Upper() {
		return operationEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavioralFeature() {
		return behavioralFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_Concurrency() {
		return (EAttribute)behavioralFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavioralFeature_IsAbstract() {
		return (EAttribute)behavioralFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_Method() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_OwnedParameter() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_OwnedParameterSet() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavioralFeature_RaisedException() {
		return (EReference)behavioralFeatureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehavior() {
		return behaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Context() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBehavior_IsReentrant() {
		return (EAttribute)behaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameter() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_OwnedParameterSet() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Postcondition() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Precondition() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_RedefinedBehavior() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehavior_Specification() {
		return (EReference)behaviorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__MustRealize__DiagnosticChain_Map() {
		return behaviorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__ParametersMatch__DiagnosticChain_Map() {
		return behaviorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__FeatureOfContextClassifier__DiagnosticChain_Map() {
		return behaviorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__MostOneBehaviour__DiagnosticChain_Map() {
		return behaviorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBehavior__Context() {
		return behaviorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Default() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_DefaultValue() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Direction() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Effect() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsException() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_IsStream() {
		return (EAttribute)parameterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_Operation() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParameterSet() {
		return (EReference)parameterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__NotException__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__InAndOut__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__ConnectorEnd__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__ReentrantBehaviors__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__StreamAndException__DiagnosticChain_Map() {
		return parameterEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameter__Default_() {
		return parameterEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElement() {
		return connectableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectableElement_End() {
		return (EReference)connectableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectableElement__End() {
		return connectableElementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorEnd() {
		return connectorEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_DefiningEnd() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_PartWithPort() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorEnd_Role() {
		return (EReference)connectorEndEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectorEnd__SelfPartWithPort__DiagnosticChain_Map() {
		return connectorEndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectorEnd__Multiplicity__DiagnosticChain_Map() {
		return connectorEndEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectorEnd__RoleAndPartWithPort__DiagnosticChain_Map() {
		return connectorEndEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectorEnd__PartWithPortEmpty__DiagnosticChain_Map() {
		return connectorEndEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectorEnd__DefiningEnd() {
		return connectorEndEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectableElementTemplateParameter() {
		return connectableElementTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterSet() {
		return parameterSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Condition() {
		return (EReference)parameterSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterSet_Parameter() {
		return (EReference)parameterSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterSet__SameParameterizedEntity__DiagnosticChain_Map() {
		return parameterSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterSet__Input__DiagnosticChain_Map() {
		return parameterSetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParameterSet__TwoParameterSets__DiagnosticChain_Map() {
		return parameterSetEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataType() {
		return dataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedAttribute() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataType_OwnedOperation() {
		return (EReference)dataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_NestedClassifier() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedAttribute() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedReception() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Protocol() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_RedefinedInterface() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_OwnedOperation() {
		return (EReference)interfaceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterface__Visibility__DiagnosticChain_Map() {
		return interfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReception() {
		return receptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReception_Signal() {
		return (EReference)receptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReception__NotQuery__DiagnosticChain_Map() {
		return receptionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignal() {
		return signalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignal_OwnedAttribute() {
		return (EReference)signalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolStateMachine() {
		return protocolStateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolStateMachine_Conformance() {
		return (EReference)protocolStateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolStateMachine__DeepOrShallowHistory__DiagnosticChain_Map() {
		return protocolStateMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolStateMachine__EntryExitDo__DiagnosticChain_Map() {
		return protocolStateMachineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolStateMachine__PortsConnected__DiagnosticChain_Map() {
		return protocolStateMachineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolStateMachine__ProtocolTransitions__DiagnosticChain_Map() {
		return protocolStateMachineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateMachine() {
		return stateMachineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ConnectionPoint() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_SubmachineState() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_Region() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateMachine_ExtendedStateMachine() {
		return (EReference)stateMachineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__ContextClassifier__DiagnosticChain_Map() {
		return stateMachineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__ClassifierContext__DiagnosticChain_Map() {
		return stateMachineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Method__DiagnosticChain_Map() {
		return stateMachineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__ConnectionPoints__DiagnosticChain_Map() {
		return stateMachineEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Lca__State_State() {
		return stateMachineEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__Ancestor__State_State() {
		return stateMachineEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStateMachine__IsRedefinitionContextValid__StateMachine() {
		return stateMachineEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPseudostate() {
		return pseudostateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPseudostate_State() {
		return (EReference)pseudostateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPseudostate_Kind() {
		return (EAttribute)pseudostateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPseudostate_StateMachine() {
		return (EReference)pseudostateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__JunctionVertex__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__ChoiceVertex__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__InitialVertex__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__TransitionsIncoming__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__ForkVertex__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__JoinVertex__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__TransitionsOutgoing__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__OutgoingFromInitial__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPseudostate__HistoryVertices__DiagnosticChain_Map() {
		return pseudostateEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Container() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Outgoing() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVertex_Incoming() {
		return (EReference)vertexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__ContainingStateMachine() {
		return vertexEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__Incoming() {
		return vertexEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVertex__Outgoing() {
		return vertexEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegion() {
		return regionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_ExtendedRegion() {
		return (EReference)regionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_State() {
		return (EReference)regionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_StateMachine() {
		return (EReference)regionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Transition() {
		return (EReference)regionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegion_Subvertex() {
		return (EReference)regionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__DeepHistoryVertex__DiagnosticChain_Map() {
		return regionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__Owned__DiagnosticChain_Map() {
		return regionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__InitialVertex__DiagnosticChain_Map() {
		return regionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__ShallowHistoryVertex__DiagnosticChain_Map() {
		return regionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__BelongsToPsm() {
		return regionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__ContainingStateMachine() {
		return regionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__IsRedefinitionContextValid__Region() {
		return regionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegion__RedefinitionContext() {
		return regionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Connection() {
		return (EReference)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_ConnectionPoint() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DeferrableTrigger() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_DoActivity() {
		return (EReference)stateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Entry() {
		return (EReference)stateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Exit() {
		return (EReference)stateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsComposite() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsOrthogonal() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsSimple() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsSubmachineState() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_RedefinedState() {
		return (EReference)stateEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_StateInvariant() {
		return (EReference)stateEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Submachine() {
		return (EReference)stateEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Region() {
		return (EReference)stateEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__CompositeStates__DiagnosticChain_Map() {
		return stateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__SubmachineStates__DiagnosticChain_Map() {
		return stateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__EntryOrExit__DiagnosticChain_Map() {
		return stateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__SubmachineOrRegions__DiagnosticChain_Map() {
		return stateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__DestinationsOrSourcesOfTransitions__DiagnosticChain_Map() {
		return stateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsComposite() {
		return stateEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsOrthogonal() {
		return stateEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsRedefinitionContextValid__State() {
		return stateEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsSimple() {
		return stateEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__IsSubmachineState() {
		return stateEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getState__RedefinitionContext() {
		return stateEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionPointReference() {
		return connectionPointReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_Entry() {
		return (EReference)connectionPointReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_Exit() {
		return (EReference)connectionPointReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectionPointReference_State() {
		return (EReference)connectionPointReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectionPointReference__EntryPseudostates__DiagnosticChain_Map() {
		return connectionPointReferenceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnectionPointReference__ExitPseudostates__DiagnosticChain_Map() {
		return connectionPointReferenceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Event() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Port() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPort() {
		return portEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsBehavior() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsConjugated() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPort_IsService() {
		return (EAttribute)portEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Protocol() {
		return (EReference)portEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Provided() {
		return (EReference)portEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_RedefinedPort() {
		return (EReference)portEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPort_Required() {
		return (EReference)portEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__PortDestroyed__DiagnosticChain_Map() {
		return portEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__DefaultValue__DiagnosticChain_Map() {
		return portEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__PortAggregation__DiagnosticChain_Map() {
		return portEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__Provided() {
		return portEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPort__Required() {
		return portEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Effect() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Guard() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransition_Kind() {
		return (EAttribute)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_RedefinedTransition() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Trigger() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Container() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__StateIsLocal__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__OutgoingPseudostates__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__StateIsExternal__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__SignaturesCompatible__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__JoinSegmentGuards__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__StateIsInternal__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__JoinSegmentState__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__ForkSegmentGuards__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__ForkSegmentState__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__InitialTransition__DiagnosticChain_Map() {
		return transitionEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__ContainingStateMachine() {
		return transitionEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTransition__RedefinitionContext() {
		return transitionEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolConformance() {
		return protocolConformanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolConformance_GeneralMachine() {
		return (EReference)protocolConformanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolConformance_SpecificMachine() {
		return (EReference)protocolConformanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOperationTemplateParameter() {
		return operationTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociation() {
		return associationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_EndType() {
		return (EReference)associationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociation_IsDerived() {
		return (EAttribute)associationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_NavigableOwnedEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_OwnedEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssociation_MemberEnd() {
		return (EReference)associationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__SpecializedEndTypes__DiagnosticChain_Map() {
		return associationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__BinaryAssociations__DiagnosticChain_Map() {
		return associationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__SpecializedEndNumber__DiagnosticChain_Map() {
		return associationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__AssociationEnds__DiagnosticChain_Map() {
		return associationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociation__EndType() {
		return associationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaborationUse() {
		return collaborationUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_RoleBinding() {
		return (EReference)collaborationUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaborationUse_Type() {
		return (EReference)collaborationUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollaborationUse__EveryRole__DiagnosticChain_Map() {
		return collaborationUseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollaborationUse__ClientElements__DiagnosticChain_Map() {
		return collaborationUseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCollaborationUse__Connectors__DiagnosticChain_Map() {
		return collaborationUseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollaboration() {
		return collaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollaboration_CollaborationRole() {
		return (EReference)collaborationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredClassifier() {
		return structuredClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedAttribute() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_OwnedConnector() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_Part() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredClassifier_Role() {
		return (EReference)structuredClassifierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredClassifier__Multiplicities__DiagnosticChain_Map() {
		return structuredClassifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredClassifier__Part() {
		return structuredClassifierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnector() {
		return connectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Contract() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_End() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnector_Kind() {
		return (EAttribute)connectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_RedefinedConnector() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnector_Type() {
		return (EReference)connectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__BetweenInterfacesPorts__DiagnosticChain_Map() {
		return connectorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__Compatible__DiagnosticChain_Map() {
		return connectorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__Roles__DiagnosticChain_Map() {
		return connectorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__Types__DiagnosticChain_Map() {
		return connectorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConnector__Kind() {
		return connectorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralization() {
		return generalizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_General() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_GeneralizationSet() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralization_IsSubstitutable() {
		return (EAttribute)generalizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralization_Specific() {
		return (EReference)generalizationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralization__GeneralizationSameClassifier__DiagnosticChain_Map() {
		return generalizationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralizationSet() {
		return generalizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsCovering() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGeneralizationSet_IsDisjoint() {
		return (EAttribute)generalizationSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Powertype() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralizationSet_Generalization() {
		return (EReference)generalizationSetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralizationSet__MapsToGeneralizationSet__DiagnosticChain_Map() {
		return generalizationSetEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralizationSet__GeneralizationSameClassifier__DiagnosticChain_Map() {
		return generalizationSetEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRedefinableTemplateSignature() {
		return redefinableTemplateSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableTemplateSignature_ExtendedSignature() {
		return (EReference)redefinableTemplateSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableTemplateSignature_InheritedParameter() {
		return (EReference)redefinableTemplateSignatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRedefinableTemplateSignature_Classifier() {
		return (EReference)redefinableTemplateSignatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableTemplateSignature__InheritedParameters__DiagnosticChain_Map() {
		return redefinableTemplateSignatureEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRedefinableTemplateSignature__InheritedParameter() {
		return redefinableTemplateSignatureEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUseCase() {
		return useCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Extend() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_ExtensionPoint() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Include() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUseCase_Subject() {
		return (EReference)useCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCase__MustHaveName__DiagnosticChain_Map() {
		return useCaseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCase__CannotIncludeSelf__DiagnosticChain_Map() {
		return useCaseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCase__BinaryAssociations__DiagnosticChain_Map() {
		return useCaseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCase__NoAssociationToUseCase__DiagnosticChain_Map() {
		return useCaseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUseCase__AllIncludedUseCases() {
		return useCaseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtend() {
		return extendEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_Condition() {
		return (EReference)extendEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_ExtendedCase() {
		return (EReference)extendEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_ExtensionLocation() {
		return (EReference)extendEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtend_Extension() {
		return (EReference)extendEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtend__ExtensionPoints__DiagnosticChain_Map() {
		return extendEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionPoint() {
		return extensionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionPoint_UseCase() {
		return (EReference)extensionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtensionPoint__MustHaveName__DiagnosticChain_Map() {
		return extensionPointEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclude() {
		return includeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclude_Addition() {
		return (EReference)includeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclude_IncludingCase() {
		return (EReference)includeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitution() {
		return substitutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitution_Contract() {
		return (EReference)substitutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubstitution_SubstitutingClassifier() {
		return (EReference)substitutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealization() {
		return realizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassifierTemplateParameter() {
		return classifierTemplateParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassifierTemplateParameter_AllowSubstitutable() {
		return (EAttribute)classifierTemplateParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassifierTemplateParameter_ConstrainingClassifier() {
		return (EReference)classifierTemplateParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClassifierTemplateParameter__HasConstrainingClassifier__DiagnosticChain_Map() {
		return classifierTemplateParameterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterfaceRealization() {
		return interfaceRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRealization_Contract() {
		return (EReference)interfaceRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterfaceRealization_ImplementingClassifier() {
		return (EReference)interfaceRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncapsulatedClassifier() {
		return encapsulatedClassifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEncapsulatedClassifier_OwnedPort() {
		return (EReference)encapsulatedClassifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEncapsulatedClassifier__OwnedPort() {
		return encapsulatedClassifierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtension() {
		return extensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtension_IsRequired() {
		return (EAttribute)extensionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtension_Metaclass() {
		return (EReference)extensionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__NonOwnedEnd__DiagnosticChain_Map() {
		return extensionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__IsBinary__DiagnosticChain_Map() {
		return extensionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__IsRequired() {
		return extensionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__Metaclass() {
		return extensionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtension__MetaclassEnd() {
		return extensionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionEnd() {
		return extensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtensionEnd__Multiplicity__DiagnosticChain_Map() {
		return extensionEndEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExtensionEnd__Aggregation__DiagnosticChain_Map() {
		return extensionEndEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImage() {
		return imageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Content() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Format() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImage_Location() {
		return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfile() {
		return profileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_MetaclassReference() {
		return (EReference)profileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfile_MetamodelReference() {
		return (EReference)profileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfile__ReferencesSameMetamodel__DiagnosticChain_Map() {
		return profileEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProfile__MetaclassReferenceNotSpecialized__DiagnosticChain_Map() {
		return profileEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPackageMerge() {
		return packageMergeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_MergedPackage() {
		return (EReference)packageMergeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPackageMerge_ReceivingPackage() {
		return (EReference)packageMergeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProfileApplication() {
		return profileApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileApplication_AppliedProfile() {
		return (EReference)profileApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProfileApplication_IsStrict() {
		return (EAttribute)profileApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProfileApplication_ApplyingPackage() {
		return (EReference)profileApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueExpression() {
		return opaqueExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Behavior() {
		return (EReference)opaqueExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Body() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueExpression_Language() {
		return (EAttribute)opaqueExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueExpression_Result() {
		return (EReference)opaqueExpressionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__OneReturnResultParameter__DiagnosticChain_Map() {
		return opaqueExpressionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__OnlyReturnResultParameters__DiagnosticChain_Map() {
		return opaqueExpressionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__LanguageBodySize__DiagnosticChain_Map() {
		return opaqueExpressionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsIntegral() {
		return opaqueExpressionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsNonNegative() {
		return opaqueExpressionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__IsPositive() {
		return opaqueExpressionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__Result() {
		return opaqueExpressionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOpaqueExpression__Value() {
		return opaqueExpressionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptCallAction() {
		return acceptCallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptCallAction_ReturnInformation() {
		return (EReference)acceptCallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceptCallAction__TriggerCallEvent__DiagnosticChain_Map() {
		return acceptCallActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceptCallAction__ResultPins__DiagnosticChain_Map() {
		return acceptCallActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceptCallAction__Unmarshall__DiagnosticChain_Map() {
		return acceptCallActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptEventAction() {
		return acceptEventActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAcceptEventAction_IsUnmarshall() {
		return (EAttribute)acceptEventActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Result() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptEventAction_Trigger() {
		return (EReference)acceptEventActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceptEventAction__TriggerEvents__DiagnosticChain_Map() {
		return acceptEventActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceptEventAction__NoInputPins__DiagnosticChain_Map() {
		return acceptEventActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceptEventAction__UnmarshallSignalEvents__DiagnosticChain_Map() {
		return acceptEventActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceptEventAction__NoOutputPins__DiagnosticChain_Map() {
		return acceptEventActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Context() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Input() {
		return (EReference)actionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_IsLocallyReentrant() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPostcondition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_LocalPrecondition() {
		return (EReference)actionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_Output() {
		return (EReference)actionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAction__Context() {
		return actionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutableNode() {
		return executableNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutableNode_Handler() {
		return (EReference)executableNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityNode() {
		return activityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Activity() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InGroup() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InPartition() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InStructuredNode() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_InInterruptibleRegion() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Outgoing() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_Incoming() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityNode_RedefinedNode() {
		return (EReference)activityNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNode__OwnedStructuredNode__DiagnosticChain_Map() {
		return activityNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityNode__Owned__DiagnosticChain_Map() {
		return activityNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivity() {
		return activityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Edge() {
		return (EReference)activityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Group() {
		return (EReference)activityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_StructuredNode() {
		return (EReference)activityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Variable() {
		return (EReference)activityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsReadOnly() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivity_IsSingleExecution() {
		return (EAttribute)activityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Partition() {
		return (EReference)activityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivity_Node() {
		return (EReference)activityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__Autonomous__DiagnosticChain_Map() {
		return activityEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__NoSupergroups__DiagnosticChain_Map() {
		return activityEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__ActivityParameterNode__DiagnosticChain_Map() {
		return activityEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivity__StructuredNode() {
		return activityEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityEdge() {
		return activityEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Guard() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InGroup() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InPartition() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_InStructuredNode() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Interrupts() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_RedefinedEdge() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Source() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Target() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Weight() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityEdge_Activity() {
		return (EReference)activityEdgeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdge__SourceAndTarget__DiagnosticChain_Map() {
		return activityEdgeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdge__Owned__DiagnosticChain_Map() {
		return activityEdgeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityEdge__StructuredNode__DiagnosticChain_Map() {
		return activityEdgeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityGroup() {
		return activityGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_ContainedNode() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_InActivity() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_Subgroup() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_SuperGroup() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityGroup_ContainedEdge() {
		return (EReference)activityGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityGroup__GroupOwned__DiagnosticChain_Map() {
		return activityGroupEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityGroup__NodesAndEdges__DiagnosticChain_Map() {
		return activityGroupEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityGroup__NotContained__DiagnosticChain_Map() {
		return activityGroupEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityPartition() {
		return activityPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsDimension() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActivityPartition_IsExternal() {
		return (EAttribute)activityPartitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Node() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Represents() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Subpartition() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_SuperPartition() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityPartition_Edge() {
		return (EReference)activityPartitionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityPartition__RepresentsPartAndIsContained__DiagnosticChain_Map() {
		return activityPartitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityPartition__RepresentsPart__DiagnosticChain_Map() {
		return activityPartitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityPartition__RepresentsClassifier__DiagnosticChain_Map() {
		return activityPartitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityPartition__DimensionNotContained__DiagnosticChain_Map() {
		return activityPartitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuredActivityNode() {
		return structuredActivityNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStructuredActivityNode_MustIsolate() {
		return (EAttribute)structuredActivityNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Node() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_StructuredNodeInput() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_StructuredNodeOutput() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Variable() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuredActivityNode_Edge() {
		return (EReference)structuredActivityNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredActivityNode__OutputPinEdges__DiagnosticChain_Map() {
		return structuredActivityNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredActivityNode__Edges__DiagnosticChain_Map() {
		return structuredActivityNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuredActivityNode__InputPinEdges__DiagnosticChain_Map() {
		return structuredActivityNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputPin() {
		return inputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputPin__OutgoingEdgesStructuredOnly__DiagnosticChain_Map() {
		return inputPinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPin() {
		return pinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPin_IsControl() {
		return (EAttribute)pinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPin__ControlPins__DiagnosticChain_Map() {
		return pinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputPin() {
		return outputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputPin__IncomingEdgesStructuredOnly__DiagnosticChain_Map() {
		return outputPinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_ActivityScope() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Scope() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__Owned__DiagnosticChain_Map() {
		return variableEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariable__IsAccessibleBy__Action() {
		return variableEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterruptibleActivityRegion() {
		return interruptibleActivityRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptibleActivityRegion_Node() {
		return (EReference)interruptibleActivityRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterruptibleActivityRegion_InterruptingEdge() {
		return (EReference)interruptibleActivityRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInterruptibleActivityRegion__InterruptingEdges__DiagnosticChain_Map() {
		return interruptibleActivityRegionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionHandler() {
		return exceptionHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ExceptionType() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_HandlerBody() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionHandler_ProtectedNode() {
		return (EReference)exceptionHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExceptionHandler__ResultPins__DiagnosticChain_Map() {
		return exceptionHandlerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExceptionHandler__OneInput__DiagnosticChain_Map() {
		return exceptionHandlerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExceptionHandler__EdgeSourceTarget__DiagnosticChain_Map() {
		return exceptionHandlerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExceptionHandler__ExceptionBody__DiagnosticChain_Map() {
		return exceptionHandlerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionExecutionSpecification() {
		return actionExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionExecutionSpecification_Action() {
		return (EReference)actionExecutionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionExecutionSpecification__ActionReferenced__DiagnosticChain_Map() {
		return actionExecutionSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionSpecification() {
		return executionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionSpecification_Finish() {
		return (EReference)executionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionSpecification_Start() {
		return (EReference)executionSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExecutionSpecification__SameLifeline__DiagnosticChain_Map() {
		return executionSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionFragment() {
		return interactionFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_Covered() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingInteraction() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_EnclosingOperand() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionFragment_GeneralOrdering() {
		return (EReference)interactionFragmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeline() {
		return lifelineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_DecomposedAs() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Interaction() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Represents() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_Selector() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeline_CoveredBy() {
		return (EReference)lifelineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLifeline__SelectorSpecified__DiagnosticChain_Map() {
		return lifelineEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLifeline__InteractionUsesShareLifeline__DiagnosticChain_Map() {
		return lifelineEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLifeline__SameClassifier__DiagnosticChain_Map() {
		return lifelineEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartDecomposition() {
		return partDecompositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPartDecomposition__CommutativityOfDecomposition__DiagnosticChain_Map() {
		return partDecompositionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPartDecomposition__Assume__DiagnosticChain_Map() {
		return partDecompositionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPartDecomposition__PartsOfInternalStructures__DiagnosticChain_Map() {
		return partDecompositionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionUse() {
		return interactionUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ActualGate() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_Argument() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_RefersTo() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ReturnValue() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionUse_ReturnValueRecipient() {
		return (EReference)interactionUseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionUse__ArgumentsCorrespondToParameters__DiagnosticChain_Map() {
		return interactionUseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionUse__ReturnValueTypeRecipientCorrespondence__DiagnosticChain_Map() {
		return interactionUseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionUse__AllLifelines__DiagnosticChain_Map() {
		return interactionUseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionUse__ReturnValueRecipientCoverage__DiagnosticChain_Map() {
		return interactionUseEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionUse__ArgumentsAreConstants__DiagnosticChain_Map() {
		return interactionUseEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionUse__GatesMatch__DiagnosticChain_Map() {
		return interactionUseEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGate() {
		return gateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__MessagesActualGate__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGate__MessagesCombinedFragment__DiagnosticChain_Map() {
		return gateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEnd() {
		return messageEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEnd_Message() {
		return (EReference)messageEndEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Argument() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Connector() {
		return (EReference)messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Interaction() {
		return (EReference)messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageKind() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_MessageSort() {
		return (EAttribute)messageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_ReceiveEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_SendEvent() {
		return (EReference)messageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Signature() {
		return (EReference)messageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__SignatureReferTo__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__Arguments__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__SendingReceivingMessageEvent__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__SignatureIsOperation__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__SignatureIsSignal__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__OccurrenceSpecifications__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__CannotCrossBoundaries__DiagnosticChain_Map() {
		return messageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__MessageKind() {
		return messageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteraction() {
		return interactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Action() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_FormalGate() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Fragment() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Lifeline() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteraction_Message() {
		return (EReference)interactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionOperand() {
		return interactionOperandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Guard() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionOperand_Fragment() {
		return (EReference)interactionOperandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionOperand__GuardContainReferences__DiagnosticChain_Map() {
		return interactionOperandEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionOperand__GuardDirectlyPrior__DiagnosticChain_Map() {
		return interactionOperandEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionConstraint() {
		return interactionConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Maxint() {
		return (EReference)interactionConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionConstraint_Minint() {
		return (EReference)interactionConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionConstraint__DynamicVariables__DiagnosticChain_Map() {
		return interactionConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionConstraint__MaxintPositive__DiagnosticChain_Map() {
		return interactionConstraintEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionConstraint__MinintNonNegative__DiagnosticChain_Map() {
		return interactionConstraintEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionConstraint__GlobalData__DiagnosticChain_Map() {
		return interactionConstraintEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionConstraint__MinintMaxint__DiagnosticChain_Map() {
		return interactionConstraintEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInteractionConstraint__MaxintGreaterEqualMinint__DiagnosticChain_Map() {
		return interactionConstraintEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneralOrdering() {
		return generalOrderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralOrdering_After() {
		return (EReference)generalOrderingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneralOrdering_Before() {
		return (EReference)generalOrderingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGeneralOrdering__IrreflexsiveTransitiveClosure__DiagnosticChain_Map() {
		return generalOrderingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrenceSpecification() {
		return occurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrenceSpecification_ToAfter() {
		return (EReference)occurrenceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOccurrenceSpecification_ToBefore() {
		return (EReference)occurrenceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionInputPin() {
		return actionInputPinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionInputPin_FromAction() {
		return (EReference)actionInputPinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionInputPin__NoControlOrDataFlow__DiagnosticChain_Map() {
		return actionInputPinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionInputPin__OneOutputPin__DiagnosticChain_Map() {
		return actionInputPinEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionInputPin__InputPin__DiagnosticChain_Map() {
		return actionInputPinEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityFinalNode() {
		return activityFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalNode() {
		return finalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalNode__NoOutgoingEdges__DiagnosticChain_Map() {
		return finalNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlNode() {
		return controlNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityParameterNode() {
		return activityParameterNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityParameterNode_Parameter() {
		return (EReference)activityParameterNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityParameterNode__HasParameters__DiagnosticChain_Map() {
		return activityParameterNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityParameterNode__NoIncomingEdges__DiagnosticChain_Map() {
		return activityParameterNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityParameterNode__MaximumOneParameterNode__DiagnosticChain_Map() {
		return activityParameterNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityParameterNode__SameType__DiagnosticChain_Map() {
		return activityParameterNodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityParameterNode__NoEdges__DiagnosticChain_Map() {
		return activityParameterNodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityParameterNode__NoOutgoingEdges__DiagnosticChain_Map() {
		return activityParameterNodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActivityParameterNode__MaximumTwoParameterNodes__DiagnosticChain_Map() {
		return activityParameterNodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActor() {
		return actorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActor__Associations__DiagnosticChain_Map() {
		return actorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActor__MustHaveName__DiagnosticChain_Map() {
		return actorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStructuralFeatureValueAction() {
		return addStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddStructuralFeatureValueAction_InsertAt() {
		return (EReference)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStructuralFeatureValueAction_IsReplaceAll() {
		return (EAttribute)addStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddStructuralFeatureValueAction__RequiredValue__DiagnosticChain_Map() {
		return addStructuralFeatureValueActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddStructuralFeatureValueAction__UnlimitedNaturalAndMultiplicity__DiagnosticChain_Map() {
		return addStructuralFeatureValueActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteStructuralFeatureAction() {
		return writeStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Result() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteStructuralFeatureAction_Value() {
		return (EReference)writeStructuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWriteStructuralFeatureAction__InputPin__DiagnosticChain_Map() {
		return writeStructuralFeatureActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWriteStructuralFeatureAction__MultiplicityOfResult__DiagnosticChain_Map() {
		return writeStructuralFeatureActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWriteStructuralFeatureAction__TypeOfResult__DiagnosticChain_Map() {
		return writeStructuralFeatureActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructuralFeatureAction() {
		return structuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_Object() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructuralFeatureAction_StructuralFeature() {
		return (EReference)structuralFeatureActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuralFeatureAction__Visibility__DiagnosticChain_Map() {
		return structuralFeatureActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuralFeatureAction__Multiplicity__DiagnosticChain_Map() {
		return structuralFeatureActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuralFeatureAction__NotStatic__DiagnosticChain_Map() {
		return structuralFeatureActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuralFeatureAction__OneFeaturingClassifier__DiagnosticChain_Map() {
		return structuralFeatureActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStructuralFeatureAction__SameType__DiagnosticChain_Map() {
		return structuralFeatureActionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddVariableValueAction() {
		return addVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddVariableValueAction_InsertAt() {
		return (EReference)addVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddVariableValueAction_IsReplaceAll() {
		return (EAttribute)addVariableValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddVariableValueAction__SingleInputPin__DiagnosticChain_Map() {
		return addVariableValueActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAddVariableValueAction__RequiredValue__DiagnosticChain_Map() {
		return addVariableValueActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteVariableAction() {
		return writeVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWriteVariableAction_Value() {
		return (EReference)writeVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWriteVariableAction__Multiplicity__DiagnosticChain_Map() {
		return writeVariableActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWriteVariableAction__SameType__DiagnosticChain_Map() {
		return writeVariableActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAction() {
		return variableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAction_Variable() {
		return (EReference)variableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getVariableAction__ScopeOfVariable__DiagnosticChain_Map() {
		return variableActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnyReceiveEvent() {
		return anyReceiveEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEvent() {
		return messageEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociationClass() {
		return associationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociationClass__CannotBeDefined__DiagnosticChain_Map() {
		return associationClassEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAssociationClass__DisjointAttributesEnds__DiagnosticChain_Map() {
		return associationClassEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBehaviorExecutionSpecification() {
		return behaviorExecutionSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBehaviorExecutionSpecification_Behavior() {
		return (EReference)behaviorExecutionSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBroadcastSignalAction() {
		return broadcastSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBroadcastSignalAction_Signal() {
		return (EReference)broadcastSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBroadcastSignalAction__TypeOrderingMultiplicity__DiagnosticChain_Map() {
		return broadcastSignalActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBroadcastSignalAction__NumberAndOrder__DiagnosticChain_Map() {
		return broadcastSignalActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvocationAction() {
		return invocationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_Argument() {
		return (EReference)invocationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvocationAction_OnPort() {
		return (EReference)invocationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInvocationAction__OnPortReceiver__DiagnosticChain_Map() {
		return invocationActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallAction() {
		return callActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallAction_IsSynchronous() {
		return (EAttribute)callActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallAction_Result() {
		return (EReference)callActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallAction__SynchronousCall__DiagnosticChain_Map() {
		return callActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallAction__NumberAndOrder__DiagnosticChain_Map() {
		return callActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallAction__TypeOrderingMultiplicity__DiagnosticChain_Map() {
		return callActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallBehaviorAction() {
		return callBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallBehaviorAction_Behavior() {
		return (EReference)callBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallBehaviorAction__ArgumentPinEqualParameter__DiagnosticChain_Map() {
		return callBehaviorActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallBehaviorAction__ResultPinEqualParameter__DiagnosticChain_Map() {
		return callBehaviorActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallEvent() {
		return callEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallEvent_Operation() {
		return (EReference)callEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallOperationAction() {
		return callOperationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Operation() {
		return (EReference)callOperationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallOperationAction_Target() {
		return (EReference)callOperationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallOperationAction__ArgumentPinEqualParameter__DiagnosticChain_Map() {
		return callOperationActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallOperationAction__TypeTargetPin__DiagnosticChain_Map() {
		return callOperationActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallOperationAction__ResultPinEqualParameter__DiagnosticChain_Map() {
		return callOperationActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCentralBufferNode() {
		return centralBufferNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeEvent() {
		return changeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChangeEvent_ChangeExpression() {
		return (EReference)changeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClause() {
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Body() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_BodyOutput() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Decider() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_PredecessorClause() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_SuccessorClause() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Test() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClause__BodyOutputPins__DiagnosticChain_Map() {
		return clauseEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClause__TestAndBody__DiagnosticChain_Map() {
		return clauseEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClause__DeciderOutput__DiagnosticChain_Map() {
		return clauseEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearAssociationAction() {
		return clearAssociationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Association() {
		return (EReference)clearAssociationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearAssociationAction_Object() {
		return (EReference)clearAssociationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClearAssociationAction__SameType__DiagnosticChain_Map() {
		return clearAssociationActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClearAssociationAction__Multiplicity__DiagnosticChain_Map() {
		return clearAssociationActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearStructuralFeatureAction() {
		return clearStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClearStructuralFeatureAction_Result() {
		return (EReference)clearStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClearStructuralFeatureAction__TypeOfResult__DiagnosticChain_Map() {
		return clearStructuralFeatureActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getClearStructuralFeatureAction__MultiplicityOfResult__DiagnosticChain_Map() {
		return clearStructuralFeatureActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClearVariableAction() {
		return clearVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCombinedFragment() {
		return combinedFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_CfragmentGate() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCombinedFragment_InteractionOperator() {
		return (EAttribute)combinedFragmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCombinedFragment_Operand() {
		return (EReference)combinedFragmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCombinedFragment__MinintAndMaxint__DiagnosticChain_Map() {
		return combinedFragmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCombinedFragment__OptLoopBreakNeg__DiagnosticChain_Map() {
		return combinedFragmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCombinedFragment__Break___DiagnosticChain_Map() {
		return combinedFragmentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCombinedFragment__ConsiderAndIgnore__DiagnosticChain_Map() {
		return combinedFragmentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationPath() {
		return communicationPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponent() {
		return componentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComponent_IsIndirectlyInstantiated() {
		return (EAttribute)componentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_PackagedElement() {
		return (EReference)componentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Provided() {
		return (EReference)componentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Realization() {
		return (EReference)componentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponent_Required() {
		return (EReference)componentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__NoPackagedElements__DiagnosticChain_Map() {
		return componentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__NoNestedClassifiers__DiagnosticChain_Map() {
		return componentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__Provided() {
		return componentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__RealizedInterfaces__Classifier() {
		return componentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__Required() {
		return componentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComponent__UsedInterfaces__Classifier() {
		return componentEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComponentRealization() {
		return componentRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRealization_RealizingClassifier() {
		return (EReference)componentRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComponentRealization_Abstraction() {
		return (EReference)componentRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalNode() {
		return conditionalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Clause() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsAssured() {
		return (EAttribute)conditionalNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConditionalNode_IsDeterminate() {
		return (EAttribute)conditionalNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalNode_Result() {
		return (EReference)conditionalNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConditionalNode__NoInputPins__DiagnosticChain_Map() {
		return conditionalNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConditionalNode__ResultNoIncoming__DiagnosticChain_Map() {
		return conditionalNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConditionalNode__ClauseNoPredecessor__DiagnosticChain_Map() {
		return conditionalNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConditionalNode__ExecutableNodes__DiagnosticChain_Map() {
		return conditionalNodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConditionalNode__MatchingOutputPins__DiagnosticChain_Map() {
		return conditionalNodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConditionalNode__OneClauseWithExecutableNode__DiagnosticChain_Map() {
		return conditionalNodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConsiderIgnoreFragment() {
		return considerIgnoreFragmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConsiderIgnoreFragment_Message() {
		return (EReference)considerIgnoreFragmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConsiderIgnoreFragment__ConsiderOrIgnore__DiagnosticChain_Map() {
		return considerIgnoreFragmentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConsiderIgnoreFragment__Type__DiagnosticChain_Map() {
		return considerIgnoreFragmentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContinuation() {
		return continuationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContinuation_Setting() {
		return (EAttribute)continuationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuation__Global__DiagnosticChain_Map() {
		return continuationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuation__FirstOrLastInteractionFragment__DiagnosticChain_Map() {
		return continuationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getContinuation__SameName__DiagnosticChain_Map() {
		return continuationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlFlow() {
		return controlFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getControlFlow__ObjectNodes__DiagnosticChain_Map() {
		return controlFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkAction() {
		return createLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateLinkAction__AssociationNotAbstract__DiagnosticChain_Map() {
		return createLinkActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWriteLinkAction() {
		return writeLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getWriteLinkAction__AllowAccess__DiagnosticChain_Map() {
		return writeLinkActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkAction() {
		return linkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_EndData() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkAction_InputValue() {
		return (EReference)linkActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkAction__SamePins__DiagnosticChain_Map() {
		return linkActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkAction__SameAssociation__DiagnosticChain_Map() {
		return linkActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkAction__NotStatic__DiagnosticChain_Map() {
		return linkActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkAction__Association() {
		return linkActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndData() {
		return linkEndDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_End() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Qualifier() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndData_Value() {
		return (EReference)linkEndDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndData__Multiplicity__DiagnosticChain_Map() {
		return linkEndDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndData__EndObjectInputPin__DiagnosticChain_Map() {
		return linkEndDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndData__PropertyIsAssociationEnd__DiagnosticChain_Map() {
		return linkEndDataEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndData__SameType__DiagnosticChain_Map() {
		return linkEndDataEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndData__Qualifiers__DiagnosticChain_Map() {
		return linkEndDataEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualifierValue() {
		return qualifierValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Qualifier() {
		return (EReference)qualifierValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualifierValue_Value() {
		return (EReference)qualifierValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQualifierValue__TypeOfQualifier__DiagnosticChain_Map() {
		return qualifierValueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQualifierValue__MultiplicityOfQualifier__DiagnosticChain_Map() {
		return qualifierValueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getQualifierValue__QualifierAttribute__DiagnosticChain_Map() {
		return qualifierValueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndCreationData() {
		return linkEndCreationDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndCreationData_InsertAt() {
		return (EReference)linkEndCreationDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndCreationData_IsReplaceAll() {
		return (EAttribute)linkEndCreationDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndCreationData__CreateLinkAction__DiagnosticChain_Map() {
		return linkEndCreationDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndCreationData__SingleInputPin__DiagnosticChain_Map() {
		return linkEndCreationDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateLinkObjectAction() {
		return createLinkObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateLinkObjectAction_Result() {
		return (EReference)createLinkObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateLinkObjectAction__TypeOfResult__DiagnosticChain_Map() {
		return createLinkObjectActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateLinkObjectAction__AssociationClass__DiagnosticChain_Map() {
		return createLinkObjectActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateLinkObjectAction__Multiplicity__DiagnosticChain_Map() {
		return createLinkObjectActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateObjectAction() {
		return createObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Classifier() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCreateObjectAction_Result() {
		return (EReference)createObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateObjectAction__Multiplicity__DiagnosticChain_Map() {
		return createObjectActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateObjectAction__SameType__DiagnosticChain_Map() {
		return createObjectActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateObjectAction__ClassifierNotAbstract__DiagnosticChain_Map() {
		return createObjectActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCreateObjectAction__ClassifierNotAssociationClass__DiagnosticChain_Map() {
		return createObjectActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStoreNode() {
		return dataStoreNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecisionNode() {
		return decisionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionNode_DecisionInput() {
		return (EReference)decisionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDecisionNode_DecisionInputFlow() {
		return (EReference)decisionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionNode__Edges__DiagnosticChain_Map() {
		return decisionNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionNode__Parameters__DiagnosticChain_Map() {
		return decisionNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionNode__IncomingObjectOneInputParameter__DiagnosticChain_Map() {
		return decisionNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionNode__TwoInputParameters__DiagnosticChain_Map() {
		return decisionNodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionNode__DecisionInputFlowIncoming__DiagnosticChain_Map() {
		return decisionNodeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionNode__IncomingControlOneInputParameter__DiagnosticChain_Map() {
		return decisionNodeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionNode__IncomingOutgoingEdges__DiagnosticChain_Map() {
		return decisionNodeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDecisionNode__ZeroInputParameters__DiagnosticChain_Map() {
		return decisionNodeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectFlow() {
		return objectFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMulticast() {
		return (EAttribute)objectFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectFlow_IsMultireceive() {
		return (EAttribute)objectFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Selection() {
		return (EReference)objectFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectFlow_Transformation() {
		return (EReference)objectFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectFlow__InputAndOutputParameter__DiagnosticChain_Map() {
		return objectFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectFlow__Target__DiagnosticChain_Map() {
		return objectFlowEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectFlow__CompatibleTypes__DiagnosticChain_Map() {
		return objectFlowEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectFlow__TransformationBehaviour__DiagnosticChain_Map() {
		return objectFlowEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectFlow__IsMulticastOrIsMultireceive__DiagnosticChain_Map() {
		return objectFlowEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectFlow__NoActions__DiagnosticChain_Map() {
		return objectFlowEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectFlow__SelectionBehaviour__DiagnosticChain_Map() {
		return objectFlowEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObjectFlow__SameUpperBounds__DiagnosticChain_Map() {
		return objectFlowEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyLinkAction() {
		return destroyLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEndDestructionData() {
		return linkEndDestructionDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEndDestructionData_DestroyAt() {
		return (EReference)linkEndDestructionDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkEndDestructionData_IsDestroyDuplicates() {
		return (EAttribute)linkEndDestructionDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndDestructionData__UnlimitedNaturalAndMultiplicity__DiagnosticChain_Map() {
		return linkEndDestructionDataEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLinkEndDestructionData__DestroyLinkAction__DiagnosticChain_Map() {
		return linkEndDestructionDataEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyObjectAction() {
		return destroyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyLinks() {
		return (EAttribute)destroyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyObjectAction_IsDestroyOwnedObjects() {
		return (EAttribute)destroyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDestroyObjectAction_Target() {
		return (EReference)destroyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDestroyObjectAction__Multiplicity__DiagnosticChain_Map() {
		return destroyObjectActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDestroyObjectAction__NoType__DiagnosticChain_Map() {
		return destroyObjectActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestructionOccurenceSpecification() {
		return destructionOccurenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDestructionOccurenceSpecification__NoOccurrenceSpecificationsBelow__DiagnosticChain_Map() {
		return destructionOccurenceSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageOccurrenceSpecification() {
		return messageOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNode_NestedNode() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNode__InternalStructure__DiagnosticChain_Map() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDuration() {
		return durationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Expr() {
		return (EReference)durationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDuration_Observation() {
		return (EReference)durationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObservation() {
		return observationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationConstraint() {
		return durationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationConstraint_FirstEvent() {
		return (EAttribute)durationConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDurationConstraint__FirstEventMultiplicity__DiagnosticChain_Map() {
		return durationConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntervalConstraint() {
		return intervalConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterval() {
		return intervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Max() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterval_Min() {
		return (EReference)intervalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationInterval() {
		return durationIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDurationObservation() {
		return durationObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDurationObservation_Event() {
		return (EReference)durationObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDurationObservation_FirstEvent() {
		return (EAttribute)durationObservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDurationObservation__FirstEventMultiplicity__DiagnosticChain_Map() {
		return durationObservationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeration() {
		return enumerationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeration_OwnedLiteral() {
		return (EReference)enumerationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumerationLiteral() {
		return enumerationLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumerationLiteral_Enumeration() {
		return (EReference)enumerationLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumerationLiteral__ClassifierEqualsOwningEnumeration__DiagnosticChain_Map() {
		return enumerationLiteralEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEnumerationLiteral__Classifier() {
		return enumerationLiteralEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceSpecification() {
		return instanceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Classifier() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Slot() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceSpecification_Specification() {
		return (EReference)instanceSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceSpecification__DeploymentTarget__DiagnosticChain_Map() {
		return instanceSpecificationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceSpecification__StructuralFeature__DiagnosticChain_Map() {
		return instanceSpecificationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceSpecification__DefiningFeature__DiagnosticChain_Map() {
		return instanceSpecificationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInstanceSpecification__DeploymentArtifact__DiagnosticChain_Map() {
		return instanceSpecificationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_DefiningFeature() {
		return (EReference)slotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_Value() {
		return (EReference)slotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSlot_OwningInstance() {
		return (EReference)slotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionEnvironment() {
		return executionEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExecutionOccurrenceSpecification() {
		return executionOccurrenceSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExecutionOccurrenceSpecification_Execution() {
		return (EReference)executionOccurrenceSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionNode() {
		return expansionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsInput() {
		return (EReference)expansionNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionNode_RegionAsOutput() {
		return (EReference)expansionNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpansionNode__RegionAsInputOrOutput__DiagnosticChain_Map() {
		return expansionNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpansionRegion() {
		return expansionRegionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExpansionRegion_Mode() {
		return (EAttribute)expansionRegionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_OutputElement() {
		return (EReference)expansionRegionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExpansionRegion_InputElement() {
		return (EReference)expansionRegionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExpansionRegion__ExpansionNodes__DiagnosticChain_Map() {
		return expansionRegionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinalState() {
		return finalStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__NoRegions__DiagnosticChain_Map() {
		return finalStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__NoOutgoingTransitions__DiagnosticChain_Map() {
		return finalStateEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__NoExitBehavior__DiagnosticChain_Map() {
		return finalStateEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__CannotReferenceSubmachine__DiagnosticChain_Map() {
		return finalStateEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__NoEntryBehavior__DiagnosticChain_Map() {
		return finalStateEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFinalState__NoStateBehavior__DiagnosticChain_Map() {
		return finalStateEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowFinalNode() {
		return flowFinalNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForkNode() {
		return forkNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForkNode__OneIncomingEdge__DiagnosticChain_Map() {
		return forkNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getForkNode__Edges__DiagnosticChain_Map() {
		return forkNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBehavior() {
		return functionBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionBehavior__OneOutputParameter__DiagnosticChain_Map() {
		return functionBehaviorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFunctionBehavior__TypesOfParameters__DiagnosticChain_Map() {
		return functionBehaviorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueBehavior() {
		return opaqueBehaviorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Body() {
		return (EAttribute)opaqueBehaviorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueBehavior_Language() {
		return (EAttribute)opaqueBehaviorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationFlow() {
		return informationFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_Conveyed() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_InformationSource() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_InformationTarget() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_Realization() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingActivityEdge() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingConnector() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationFlow_RealizingMessage() {
		return (EReference)informationFlowEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationFlow__ConveyClassifiers__DiagnosticChain_Map() {
		return informationFlowEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationFlow__MustConform__DiagnosticChain_Map() {
		return informationFlowEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationFlow__SourcesAndTargetsKind__DiagnosticChain_Map() {
		return informationFlowEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationItem() {
		return informationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformationItem_Represented() {
		return (EReference)informationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationItem__HasNo__DiagnosticChain_Map() {
		return informationItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationItem__SourcesAndTargets__DiagnosticChain_Map() {
		return informationItemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInformationItem__NotInstantiable__DiagnosticChain_Map() {
		return informationItemEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitialNode() {
		return initialNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialNode__ControlEdges__DiagnosticChain_Map() {
		return initialNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInitialNode__NoIncomingEdges__DiagnosticChain_Map() {
		return initialNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstanceValue() {
		return instanceValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstanceValue_Instance() {
		return (EReference)instanceValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinNode() {
		return joinNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinNode_IsCombineDuplicate() {
		return (EAttribute)joinNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJoinNode_JoinSpec() {
		return (EReference)joinNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJoinNode__OneOutgoingEdge__DiagnosticChain_Map() {
		return joinNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getJoinNode__IncomingObjectFlow__DiagnosticChain_Map() {
		return joinNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralBoolean() {
		return literalBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralBoolean_Value() {
		return (EAttribute)literalBooleanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralSpecification() {
		return literalSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralInteger() {
		return literalIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralInteger_Value() {
		return (EAttribute)literalIntegerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralNull() {
		return literalNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralReal() {
		return literalRealEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralReal_Value() {
		return (EAttribute)literalRealEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralString() {
		return literalStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralString_Value() {
		return (EAttribute)literalStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralUnlimitedNatural() {
		return literalUnlimitedNaturalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralUnlimitedNatural_Value() {
		return (EAttribute)literalUnlimitedNaturalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopNode() {
		return loopNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_BodyOutput() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_BodyPart() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Decider() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoopNode_IsTestedFirst() {
		return (EAttribute)loopNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariable() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_LoopVariableInput() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Result() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_SetupPart() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopNode_Test() {
		return (EReference)loopNodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoopNode__InputEdges__DiagnosticChain_Map() {
		return loopNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoopNode__ResultNoIncoming__DiagnosticChain_Map() {
		return loopNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoopNode__ExecutableNodes__DiagnosticChain_Map() {
		return loopNodeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLoopNode__BodyOutputPins__DiagnosticChain_Map() {
		return loopNodeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMergeNode() {
		return mergeNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMergeNode__Edges__DiagnosticChain_Map() {
		return mergeNodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMergeNode__OneOutgoingEdge__DiagnosticChain_Map() {
		return mergeNodeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModel_Viewpoint() {
		return (EAttribute)modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOpaqueAction() {
		return opaqueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueAction_Body() {
		return (EAttribute)opaqueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_InputValue() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOpaqueAction_Language() {
		return (EAttribute)opaqueActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOpaqueAction_OutputValue() {
		return (EReference)opaqueActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProtocolTransition() {
		return protocolTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_PostCondition() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_PreCondition() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProtocolTransition_Referred() {
		return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolTransition__RefersToOperation__DiagnosticChain_Map() {
		return protocolTransitionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolTransition__AssociatedActions__DiagnosticChain_Map() {
		return protocolTransitionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolTransition__BelongsToPsm__DiagnosticChain_Map() {
		return protocolTransitionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getProtocolTransition__Referred() {
		return protocolTransitionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRaiseExceptionAction() {
		return raiseExceptionActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRaiseExceptionAction_Exception() {
		return (EReference)raiseExceptionActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadExtentAction() {
		return readExtentActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Classifier() {
		return (EReference)readExtentActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadExtentAction_Result() {
		return (EReference)readExtentActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadExtentAction__MultiplicityOfResult__DiagnosticChain_Map() {
		return readExtentActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadExtentAction__TypeIsClassifier__DiagnosticChain_Map() {
		return readExtentActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadIsClassifiedObjectAction() {
		return readIsClassifiedObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Classifier() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReadIsClassifiedObjectAction_IsDirect() {
		return (EAttribute)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Object() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadIsClassifiedObjectAction_Result() {
		return (EReference)readIsClassifiedObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadIsClassifiedObjectAction__BooleanResult__DiagnosticChain_Map() {
		return readIsClassifiedObjectActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadIsClassifiedObjectAction__MultiplicityOfInput__DiagnosticChain_Map() {
		return readIsClassifiedObjectActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadIsClassifiedObjectAction__NoType__DiagnosticChain_Map() {
		return readIsClassifiedObjectActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadIsClassifiedObjectAction__MultiplicityOfOutput__DiagnosticChain_Map() {
		return readIsClassifiedObjectActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkAction() {
		return readLinkActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkAction_Result() {
		return (EReference)readLinkActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkAction__CompatibleMultiplicity__DiagnosticChain_Map() {
		return readLinkActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkAction__NavigableOpenEnd__DiagnosticChain_Map() {
		return readLinkActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkAction__TypeAndOrdering__DiagnosticChain_Map() {
		return readLinkActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkAction__OneOpenEnd__DiagnosticChain_Map() {
		return readLinkActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkAction__Visibility__DiagnosticChain_Map() {
		return readLinkActionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndAction() {
		return readLinkObjectEndActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_End() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Object() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndAction_Result() {
		return (EReference)readLinkObjectEndActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndAction__AssociationOfAssociation__DiagnosticChain_Map() {
		return readLinkObjectEndActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndAction__TypeOfResult__DiagnosticChain_Map() {
		return readLinkObjectEndActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndAction__Property__DiagnosticChain_Map() {
		return readLinkObjectEndActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndAction__EndsOfAssociation__DiagnosticChain_Map() {
		return readLinkObjectEndActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndAction__MultiplicityOfResult__DiagnosticChain_Map() {
		return readLinkObjectEndActionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndAction__MultiplicityOfObject__DiagnosticChain_Map() {
		return readLinkObjectEndActionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndAction__TypeOfObject__DiagnosticChain_Map() {
		return readLinkObjectEndActionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadLinkObjectEndQualifierAction() {
		return readLinkObjectEndQualifierActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Object() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Qualifier() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadLinkObjectEndQualifierAction_Result() {
		return (EReference)readLinkObjectEndQualifierActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndQualifierAction__MultiplicityOfResult__DiagnosticChain_Map() {
		return readLinkObjectEndQualifierActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndQualifierAction__TypeOfObject__DiagnosticChain_Map() {
		return readLinkObjectEndQualifierActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndQualifierAction__SameType__DiagnosticChain_Map() {
		return readLinkObjectEndQualifierActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndQualifierAction__QualifierAttribute__DiagnosticChain_Map() {
		return readLinkObjectEndQualifierActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndQualifierAction__MultiplicityOfQualifier__DiagnosticChain_Map() {
		return readLinkObjectEndQualifierActionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndQualifierAction__EndsOfAssociation__DiagnosticChain_Map() {
		return readLinkObjectEndQualifierActionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndQualifierAction__MultiplicityOfObject__DiagnosticChain_Map() {
		return readLinkObjectEndQualifierActionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadLinkObjectEndQualifierAction__AssociationOfAssociation__DiagnosticChain_Map() {
		return readLinkObjectEndQualifierActionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadSelfAction() {
		return readSelfActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadSelfAction_Result() {
		return (EReference)readSelfActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadSelfAction__Multiplicity__DiagnosticChain_Map() {
		return readSelfActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadSelfAction__NotStatic__DiagnosticChain_Map() {
		return readSelfActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadSelfAction__Type__DiagnosticChain_Map() {
		return readSelfActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadSelfAction__Contained__DiagnosticChain_Map() {
		return readSelfActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadStructuralFeatureAction() {
		return readStructuralFeatureActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadStructuralFeatureAction_Result() {
		return (EReference)readStructuralFeatureActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadStructuralFeatureAction__TypeAndOrdering__DiagnosticChain_Map() {
		return readStructuralFeatureActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadVariableAction() {
		return readVariableActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadVariableAction_Result() {
		return (EReference)readVariableActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadVariableAction__CompatibleMultiplicity__DiagnosticChain_Map() {
		return readVariableActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReadVariableAction__TypeAndOrdering__DiagnosticChain_Map() {
		return readVariableActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReclassifyObjectAction() {
		return reclassifyObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReclassifyObjectAction_IsReplaceAll() {
		return (EAttribute)reclassifyObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_NewClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_Object() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReclassifyObjectAction_OldClassifier() {
		return (EReference)reclassifyObjectActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReclassifyObjectAction__InputPin__DiagnosticChain_Map() {
		return reclassifyObjectActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReclassifyObjectAction__Multiplicity__DiagnosticChain_Map() {
		return reclassifyObjectActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReclassifyObjectAction__ClassifierNotAbstract__DiagnosticChain_Map() {
		return reclassifyObjectActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReduceAction() {
		return reduceActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Collection() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReduceAction_IsOrdered() {
		return (EAttribute)reduceActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Reducer() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReduceAction_Result() {
		return (EReference)reduceActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReduceAction__OutputTypesAreCompatible__DiagnosticChain_Map() {
		return reduceActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReduceAction__ReducerInputsOutput__DiagnosticChain_Map() {
		return reduceActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReduceAction__InputTypeIsCollection__DiagnosticChain_Map() {
		return reduceActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveStructuralFeatureValueAction() {
		return removeStructuralFeatureValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveStructuralFeatureValueAction_IsRemoveDuplicates() {
		return (EAttribute)removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveStructuralFeatureValueAction_RemoveAt() {
		return (EReference)removeStructuralFeatureValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRemoveStructuralFeatureValueAction__NonUniqueRemoval__DiagnosticChain_Map() {
		return removeStructuralFeatureValueActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveVariableValueAction() {
		return removeVariableValueActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveVariableValueAction_IsRemoveDuplicates() {
		return (EAttribute)removeVariableValueActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRemoveVariableValueAction_RemoveAt() {
		return (EReference)removeVariableValueActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRemoveVariableValueAction__UnlimitedNatural__DiagnosticChain_Map() {
		return removeVariableValueActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyAction() {
		return replyActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyToCall() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReplyValue() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReplyAction_ReturnInformation() {
		return (EReference)replyActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplyAction__PinsMatchParameter__DiagnosticChain_Map() {
		return replyActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReplyAction__EventOnReplyToCallTrigger__DiagnosticChain_Map() {
		return replyActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendObjectAction() {
		return sendObjectActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Request() {
		return (EReference)sendObjectActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendObjectAction_Target() {
		return (EReference)sendObjectActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendSignalAction() {
		return sendSignalActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Signal() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendSignalAction_Target() {
		return (EReference)sendSignalActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendSignalAction__NumberOrder__DiagnosticChain_Map() {
		return sendSignalActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendSignalAction__TypeOrderingMultiplicity__DiagnosticChain_Map() {
		return sendSignalActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceNode() {
		return sequenceNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceNode_ExecutableNode() {
		return (EReference)sequenceNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEvent() {
		return signalEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalEvent_Signal() {
		return (EReference)signalEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartClassifierBehaviorAction() {
		return startClassifierBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartClassifierBehaviorAction_Object() {
		return (EReference)startClassifierBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartClassifierBehaviorAction__TypeHasClassifier__DiagnosticChain_Map() {
		return startClassifierBehaviorActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartClassifierBehaviorAction__Multiplicity__DiagnosticChain_Map() {
		return startClassifierBehaviorActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartObjectBehaviorAction() {
		return startObjectBehaviorActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartObjectBehaviorAction_Object() {
		return (EReference)startObjectBehaviorActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartObjectBehaviorAction__NumberOrderResults__DiagnosticChain_Map() {
		return startObjectBehaviorActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartObjectBehaviorAction__TypeOrderingMultiplicityMatch__DiagnosticChain_Map() {
		return startObjectBehaviorActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartObjectBehaviorAction__TypeOfObject__DiagnosticChain_Map() {
		return startObjectBehaviorActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartObjectBehaviorAction__MultiplicityOfObject__DiagnosticChain_Map() {
		return startObjectBehaviorActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStartObjectBehaviorAction__NumberOrderArguments__DiagnosticChain_Map() {
		return startObjectBehaviorActionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStateInvariant() {
		return stateInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStateInvariant_Invariant() {
		return (EReference)stateInvariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestIdentityAction() {
		return testIdentityActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_First() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Result() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestIdentityAction_Second() {
		return (EReference)testIdentityActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTestIdentityAction__NoType__DiagnosticChain_Map() {
		return testIdentityActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTestIdentityAction__Multiplicity__DiagnosticChain_Map() {
		return testIdentityActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTestIdentityAction__ResultIsBoolean__DiagnosticChain_Map() {
		return testIdentityActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstraint() {
		return timeConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstraint_FirstEvent() {
		return (EAttribute)timeConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeInterval() {
		return timeIntervalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeExpression() {
		return timeExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Expr() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeExpression_Observation() {
		return (EReference)timeExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeEvent() {
		return timeEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeEvent_IsRelative() {
		return (EAttribute)timeEventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeEvent_When() {
		return (EReference)timeEventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeEvent__WhenNonNegative__DiagnosticChain_Map() {
		return timeEventEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTimeEvent__StartingTime__DiagnosticChain_Map() {
		return timeEventEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeObservation() {
		return timeObservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeObservation_Event() {
		return (EReference)timeObservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeObservation_FirstEvent() {
		return (EAttribute)timeObservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnmarshallAction() {
		return unmarshallActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Object() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_Result() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnmarshallAction_UnmarshallType() {
		return (EReference)unmarshallActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnmarshallAction__MultiplicityOfResult__DiagnosticChain_Map() {
		return unmarshallActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnmarshallAction__MultiplicityOfObject__DiagnosticChain_Map() {
		return unmarshallActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnmarshallAction__StructuralFeature__DiagnosticChain_Map() {
		return unmarshallActionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnmarshallAction__NumberOfResult__DiagnosticChain_Map() {
		return unmarshallActionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnmarshallAction__UnmarshallTypeIsClassifier__DiagnosticChain_Map() {
		return unmarshallActionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnmarshallAction__SameType__DiagnosticChain_Map() {
		return unmarshallActionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUnmarshallAction__TypeAndOrdering__DiagnosticChain_Map() {
		return unmarshallActionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUsage() {
		return usageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValuePin() {
		return valuePinEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValuePin_Value() {
		return (EReference)valuePinEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValuePin__NoIncomingEdges__DiagnosticChain_Map() {
		return valuePinEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValuePin__CompatibleType__DiagnosticChain_Map() {
		return valuePinEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueSpecificationAction() {
		return valueSpecificationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Result() {
		return (EReference)valueSpecificationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueSpecificationAction_Value() {
		return (EReference)valueSpecificationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationAction__Multiplicity__DiagnosticChain_Map() {
		return valueSpecificationActionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValueSpecificationAction__CompatibleType__DiagnosticChain_Map() {
		return valueSpecificationActionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCallConcurrencyKind() {
		return callConcurrencyKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterDirectionKind() {
		return parameterDirectionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getParameterEffectKind() {
		return parameterEffectKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransitionKind() {
		return transitionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPseudostateKind() {
		return pseudostateKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationKind() {
		return aggregationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConnectorKind() {
		return connectorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageKind() {
		return messageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageSort() {
		return messageSortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionOperatorKind() {
		return interactionOperatorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExpansionKind() {
		return expansionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uml2Factory getUml2Factory() {
		return (Uml2Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractionEClass = createEClass(ABSTRACTION);
		createEReference(abstractionEClass, ABSTRACTION__MAPPING);

		dependencyEClass = createEClass(DEPENDENCY);
		createEReference(dependencyEClass, DEPENDENCY__CLIENT);
		createEReference(dependencyEClass, DEPENDENCY__SUPPLIER);

		directedRelationshipEClass = createEClass(DIRECTED_RELATIONSHIP);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__SOURCE);
		createEReference(directedRelationshipEClass, DIRECTED_RELATIONSHIP__TARGET);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__RELATED_ELEMENT);

		elementEClass = createEClass(ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNED_COMMENT);
		createEReference(elementEClass, ELEMENT__OWNED_ELEMENT);
		createEReference(elementEClass, ELEMENT__OWNER);
		createEOperation(elementEClass, ELEMENT___NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___HAS_OWNER__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementEClass, ELEMENT___ALL_OWNED_ELEMENTS);
		createEOperation(elementEClass, ELEMENT___MUST_BE_OWNED);

		commentEClass = createEClass(COMMENT);
		createEReference(commentEClass, COMMENT__ANNOTATED_ELEMENT);
		createEAttribute(commentEClass, COMMENT__BODY);

		packageableElementEClass = createEClass(PACKAGEABLE_ELEMENT);

		parameterableElementEClass = createEClass(PARAMETERABLE_ELEMENT);
		createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER);
		createEReference(parameterableElementEClass, PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER);
		createEOperation(parameterableElementEClass, PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT);
		createEOperation(parameterableElementEClass, PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER);

		templateParameterEClass = createEClass(TEMPLATE_PARAMETER);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__DEFAULT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__OWNED_DEFAULT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__PARAMETERED_ELEMENT);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__SIGNATURE);
		createEReference(templateParameterEClass, TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT);
		createEOperation(templateParameterEClass, TEMPLATE_PARAMETER___MUST_BE_COMPATIBLE__DIAGNOSTICCHAIN_MAP);

		templateSignatureEClass = createEClass(TEMPLATE_SIGNATURE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__PARAMETER);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__TEMPLATE);
		createEReference(templateSignatureEClass, TEMPLATE_SIGNATURE__OWNED_PARAMETER);
		createEOperation(templateSignatureEClass, TEMPLATE_SIGNATURE___OWN_ELEMENTS__DIAGNOSTICCHAIN_MAP);

		templateableElementEClass = createEClass(TEMPLATEABLE_ELEMENT);
		createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING);
		createEReference(templateableElementEClass, TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE);
		createEOperation(templateableElementEClass, TEMPLATEABLE_ELEMENT___IS_TEMPLATE);
		createEOperation(templateableElementEClass, TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS);

		templateBindingEClass = createEClass(TEMPLATE_BINDING);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__PARAMETER_SUBSTITUTION);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__SIGNATURE);
		createEReference(templateBindingEClass, TEMPLATE_BINDING__BOUND_ELEMENT);
		createEOperation(templateBindingEClass, TEMPLATE_BINDING___ONE_PARAMETER_SUBSTITUTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(templateBindingEClass, TEMPLATE_BINDING___PARAMETER_SUBSTITUTION_FORMAL__DIAGNOSTICCHAIN_MAP);

		templateParameterSubstitutionEClass = createEClass(TEMPLATE_PARAMETER_SUBSTITUTION);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__ACTUAL);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__FORMAL);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__OWNED_ACTUAL);
		createEReference(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION__TEMPLATE_BINDING);
		createEOperation(templateParameterSubstitutionEClass, TEMPLATE_PARAMETER_SUBSTITUTION___MUST_BE_COMPATIBLE__DIAGNOSTICCHAIN_MAP);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEReference(namedElementEClass, NAMED_ELEMENT__CLIENT_DEPENDENCY);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAME_EXPRESSION);
		createEReference(namedElementEClass, NAMED_ELEMENT__NAMESPACE);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__QUALIFIED_NAME);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__VISIBILITY);
		createEOperation(namedElementEClass, NAMED_ELEMENT___HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(namedElementEClass, NAMED_ELEMENT___HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(namedElementEClass, NAMED_ELEMENT___VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP);
		createEOperation(namedElementEClass, NAMED_ELEMENT___ALL_NAMESPACES);
		createEOperation(namedElementEClass, NAMED_ELEMENT___ALL_OWNING_PACKAGES);
		createEOperation(namedElementEClass, NAMED_ELEMENT___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE);
		createEOperation(namedElementEClass, NAMED_ELEMENT___NAMESPACE);
		createEOperation(namedElementEClass, NAMED_ELEMENT___QUALIFIED_NAME);
		createEOperation(namedElementEClass, NAMED_ELEMENT___SEPARATOR);

		stringExpressionEClass = createEClass(STRING_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__OWNING_EXPRESSION);
		createEReference(stringExpressionEClass, STRING_EXPRESSION__SUB_EXPRESSION);
		createEOperation(stringExpressionEClass, STRING_EXPRESSION___SUBEXPRESSIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(stringExpressionEClass, STRING_EXPRESSION___OPERANDS__DIAGNOSTICCHAIN_MAP);

		expressionEClass = createEClass(EXPRESSION);
		createEReference(expressionEClass, EXPRESSION__OPERAND);
		createEAttribute(expressionEClass, EXPRESSION__SYMBOL);

		valueSpecificationEClass = createEClass(VALUE_SPECIFICATION);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___BOOLEAN_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___INTEGER_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___IS_COMPUTABLE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___IS_NULL);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___REAL_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___STRING_VALUE);
		createEOperation(valueSpecificationEClass, VALUE_SPECIFICATION___UNLIMITED_VALUE);

		typedElementEClass = createEClass(TYPED_ELEMENT);
		createEReference(typedElementEClass, TYPED_ELEMENT__TYPE);

		typeEClass = createEClass(TYPE);
		createEReference(typeEClass, TYPE__PACKAGE);
		createEOperation(typeEClass, TYPE___CONFORMS_TO__TYPE);

		packageEClass = createEClass(PACKAGE);
		createEAttribute(packageEClass, PACKAGE__URI);
		createEReference(packageEClass, PACKAGE__NESTED_PACKAGE);
		createEReference(packageEClass, PACKAGE__NESTING_PACKAGE);
		createEReference(packageEClass, PACKAGE__OWNED_STEREOTYPE);
		createEReference(packageEClass, PACKAGE__PACKAGE_MERGE);
		createEReference(packageEClass, PACKAGE__PACKAGED_ELEMENT);
		createEReference(packageEClass, PACKAGE__PROFILE_APPLICATION);
		createEReference(packageEClass, PACKAGE__OWNED_TYPE);
		createEOperation(packageEClass, PACKAGE___ELEMENTS_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(packageEClass, PACKAGE___ALL_APPLICABLE_STEREOTYPES);
		createEOperation(packageEClass, PACKAGE___CONTAINING_PROFILE);
		createEOperation(packageEClass, PACKAGE___MAKES_VISIBLE__NAMEDELEMENT);
		createEOperation(packageEClass, PACKAGE___NESTED_PACKAGE);
		createEOperation(packageEClass, PACKAGE___OWNED_STEREOTYPE);
		createEOperation(packageEClass, PACKAGE___OWNED_TYPE);
		createEOperation(packageEClass, PACKAGE___VISIBLE_MEMBERS);

		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__ELEMENT_IMPORT);
		createEReference(namespaceEClass, NAMESPACE__IMPORTED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__OWNED_RULE);
		createEReference(namespaceEClass, NAMESPACE__PACKAGE_IMPORT);
		createEOperation(namespaceEClass, NAMESPACE___MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(namespaceEClass, NAMESPACE___EXCLUDE_COLLISIONS__ELIST);
		createEOperation(namespaceEClass, NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT);
		createEOperation(namespaceEClass, NAMESPACE___IMPORT_MEMBERS__ELIST);
		createEOperation(namespaceEClass, NAMESPACE___IMPORTED_MEMBER);
		createEOperation(namespaceEClass, NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE);
		createEOperation(namespaceEClass, NAMESPACE___OWNED_MEMBER);

		elementImportEClass = createEClass(ELEMENT_IMPORT);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__ALIAS);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTED_ELEMENT);
		createEAttribute(elementImportEClass, ELEMENT_IMPORT__VISIBILITY);
		createEReference(elementImportEClass, ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		createEOperation(elementImportEClass, ELEMENT_IMPORT___VISIBILITY_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementImportEClass, ELEMENT_IMPORT___IMPORTED_ELEMENT_IS_PUBLIC__DIAGNOSTICCHAIN_MAP);
		createEOperation(elementImportEClass, ELEMENT_IMPORT___GET_NAME);

		constraintEClass = createEClass(CONSTRAINT);
		createEReference(constraintEClass, CONSTRAINT__CONSTRAINED_ELEMENT);
		createEReference(constraintEClass, CONSTRAINT__SPECIFICATION);
		createEReference(constraintEClass, CONSTRAINT__CONTEXT);
		createEOperation(constraintEClass, CONSTRAINT___NOT_APPLY_TO_SELF__DIAGNOSTICCHAIN_MAP);
		createEOperation(constraintEClass, CONSTRAINT___BOOLEAN_VALUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(constraintEClass, CONSTRAINT___NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(constraintEClass, CONSTRAINT___VALUE_SPECIFICATION_BOOLEAN__DIAGNOSTICCHAIN_MAP);

		packageImportEClass = createEClass(PACKAGE_IMPORT);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTED_PACKAGE);
		createEAttribute(packageImportEClass, PACKAGE_IMPORT__VISIBILITY);
		createEReference(packageImportEClass, PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		createEOperation(packageImportEClass, PACKAGE_IMPORT___PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP);

		stereotypeEClass = createEClass(STEREOTYPE);
		createEReference(stereotypeEClass, STEREOTYPE__ICON);
		createEReference(stereotypeEClass, STEREOTYPE__PROFILE);
		createEOperation(stereotypeEClass, STEREOTYPE___GENERALIZE__DIAGNOSTICCHAIN_MAP);
		createEOperation(stereotypeEClass, STEREOTYPE___ASSOCIATION_END_OWNERSHIP__DIAGNOSTICCHAIN_MAP);
		createEOperation(stereotypeEClass, STEREOTYPE___BINARY_ASSOCIATIONS_ONLY__DIAGNOSTICCHAIN_MAP);
		createEOperation(stereotypeEClass, STEREOTYPE___NAME_NOT_CLASH__DIAGNOSTICCHAIN_MAP);
		createEOperation(stereotypeEClass, STEREOTYPE___CONTAINING_PROFILE);
		createEOperation(stereotypeEClass, STEREOTYPE___PROFILE);

		classEClass = createEClass(CLASS);
		createEReference(classEClass, CLASS__OWNED_OPERATION);
		createEReference(classEClass, CLASS__EXTENSION);
		createEAttribute(classEClass, CLASS__IS_ACTIVE);
		createEReference(classEClass, CLASS__NESTED_CLASSIFIER);
		createEReference(classEClass, CLASS__OWNED_RECEPTION);
		createEReference(classEClass, CLASS__SUPER_CLASS);
		createEOperation(classEClass, CLASS___PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP);
		createEOperation(classEClass, CLASS___EXTENSION);
		createEOperation(classEClass, CLASS___SUPER_CLASS);

		behavioredClassifierEClass = createEClass(BEHAVIORED_CLASSIFIER);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION);
		createEReference(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR);
		createEOperation(behavioredClassifierEClass, BEHAVIORED_CLASSIFIER___CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP);

		classifierEClass = createEClass(CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__ATTRIBUTE);
		createEReference(classifierEClass, CLASSIFIER__FEATURE);
		createEReference(classifierEClass, CLASSIFIER__COLLABORATION_USE);
		createEReference(classifierEClass, CLASSIFIER__GENERAL);
		createEReference(classifierEClass, CLASSIFIER__GENERALIZATION);
		createEReference(classifierEClass, CLASSIFIER__POWERTYPE_EXTENT);
		createEReference(classifierEClass, CLASSIFIER__INHERITED_MEMBER);
		createEAttribute(classifierEClass, CLASSIFIER__IS_ABSTRACT);
		createEAttribute(classifierEClass, CLASSIFIER__IS_FINAL_SPECIALIZATION);
		createEReference(classifierEClass, CLASSIFIER__OWNED_USE_CASE);
		createEReference(classifierEClass, CLASSIFIER__USE_CASE);
		createEReference(classifierEClass, CLASSIFIER__REDEFINED_CLASSIFIER);
		createEReference(classifierEClass, CLASSIFIER__REPRESENTATION);
		createEReference(classifierEClass, CLASSIFIER__SUBSTITUTION);
		createEOperation(classifierEClass, CLASSIFIER___NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(classifierEClass, CLASSIFIER___SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(classifierEClass, CLASSIFIER___NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(classifierEClass, CLASSIFIER___MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP);
		createEOperation(classifierEClass, CLASSIFIER___ALL_FEATURES);
		createEOperation(classifierEClass, CLASSIFIER___ALL_PARENTS);
		createEOperation(classifierEClass, CLASSIFIER___CONFORMS_TO__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___GENERAL);
		createEOperation(classifierEClass, CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT);
		createEOperation(classifierEClass, CLASSIFIER___INHERIT__ELIST);
		createEOperation(classifierEClass, CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___INHERITED_MEMBER);
		createEOperation(classifierEClass, CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER);
		createEOperation(classifierEClass, CLASSIFIER___PARENTS);

		redefinableElementEClass = createEClass(REDEFINABLE_ELEMENT);
		createEAttribute(redefinableElementEClass, REDEFINABLE_ELEMENT__IS_LEAF);
		createEReference(redefinableElementEClass, REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
		createEReference(redefinableElementEClass, REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT);
		createEOperation(redefinableElementEClass, REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT);

		propertyEClass = createEClass(PROPERTY);
		createEReference(propertyEClass, PROPERTY__DATATYPE);
		createEReference(propertyEClass, PROPERTY__INTERFACE);
		createEAttribute(propertyEClass, PROPERTY__AGGREGATION);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION);
		createEReference(propertyEClass, PROPERTY__OWNING_ASSOCIATION);
		createEReference(propertyEClass, PROPERTY__ASSOCIATION_END);
		createEReference(propertyEClass, PROPERTY__QUALIFIER);
		createEReference(propertyEClass, PROPERTY__CLASS);
		createEAttribute(propertyEClass, PROPERTY__DEFAULT);
		createEReference(propertyEClass, PROPERTY__DEFAULT_VALUE);
		createEAttribute(propertyEClass, PROPERTY__IS_COMPOSITE);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED);
		createEAttribute(propertyEClass, PROPERTY__IS_DERIVED_UNION);
		createEAttribute(propertyEClass, PROPERTY__IS_ID);
		createEReference(propertyEClass, PROPERTY__OPPOSITE);
		createEReference(propertyEClass, PROPERTY__REDEFINED_PROPERTY);
		createEReference(propertyEClass, PROPERTY__SUBSETTED_PROPERTY);
		createEOperation(propertyEClass, PROPERTY___SUBSETTED_PROPERTY_NAMES__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___BINDING_TO_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___MULTIPLICITY_OF_COMPOSITE__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___DERIVED_UNION_IS_READ_ONLY__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___REDEFINED_PROPERTY_INHERITED__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___SUBSETTING_RULES__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___DERIVED_UNION_IS_DERIVED__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___SUBSETTING_CONTEXT_CONFORMS__DIAGNOSTICCHAIN_MAP);
		createEOperation(propertyEClass, PROPERTY___DEFAULT_);
		createEOperation(propertyEClass, PROPERTY___IS_ATTRIBUTE__PROPERTY);
		createEOperation(propertyEClass, PROPERTY___IS_COMPOSITE);
		createEOperation(propertyEClass, PROPERTY___IS_NAVIGABLE);
		createEOperation(propertyEClass, PROPERTY___OPPOSITE);
		createEOperation(propertyEClass, PROPERTY___SUBSETTING_CONTEXT);

		structuralFeatureEClass = createEClass(STRUCTURAL_FEATURE);
		createEAttribute(structuralFeatureEClass, STRUCTURAL_FEATURE__IS_READ_ONLY);

		multiplicityElementEClass = createEClass(MULTIPLICITY_ELEMENT);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_ORDERED);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__IS_UNIQUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__LOWER_VALUE);
		createEAttribute(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER);
		createEReference(multiplicityElementEClass, MULTIPLICITY_ELEMENT__UPPER_VALUE);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___LOWER_GE0__DIAGNOSTICCHAIN_MAP);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___INCLUDES_CARDINALITY__INTEGER);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___IS__INTEGER_INTEGER);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___IS_MULTIVALUED);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___LOWER);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___LOWER_BOUND);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___UPPER);
		createEOperation(multiplicityElementEClass, MULTIPLICITY_ELEMENT___UPPER_BOUND);

		featureEClass = createEClass(FEATURE);
		createEReference(featureEClass, FEATURE__FEATURING_CLASSIFIER);
		createEAttribute(featureEClass, FEATURE__IS_STATIC);

		deploymentTargetEClass = createEClass(DEPLOYMENT_TARGET);
		createEReference(deploymentTargetEClass, DEPLOYMENT_TARGET__DEPLOYED_ELEMENT);
		createEReference(deploymentTargetEClass, DEPLOYMENT_TARGET__DEPLOYMENT);
		createEOperation(deploymentTargetEClass, DEPLOYMENT_TARGET___DEPLOYED_ELEMENT);

		deploymentEClass = createEClass(DEPLOYMENT);
		createEReference(deploymentEClass, DEPLOYMENT__CONFIGURATION);
		createEReference(deploymentEClass, DEPLOYMENT__DEPLOYED_ARTIFACT);
		createEReference(deploymentEClass, DEPLOYMENT__LOCATION);

		deploymentSpecificationEClass = createEClass(DEPLOYMENT_SPECIFICATION);
		createEAttribute(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION);
		createEAttribute(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION);
		createEReference(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION__DEPLOYMENT);
		createEOperation(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION___DEPLOYED_ELEMENTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(deploymentSpecificationEClass, DEPLOYMENT_SPECIFICATION___DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP);

		artifactEClass = createEClass(ARTIFACT);
		createEAttribute(artifactEClass, ARTIFACT__FILE_NAME);
		createEReference(artifactEClass, ARTIFACT__MANIFESTATION);
		createEReference(artifactEClass, ARTIFACT__NESTED_ARTIFACT);
		createEReference(artifactEClass, ARTIFACT__OWNED_ATTRIBUTE);
		createEReference(artifactEClass, ARTIFACT__OWNED_OPERATION);

		deployedArtifactEClass = createEClass(DEPLOYED_ARTIFACT);

		manifestationEClass = createEClass(MANIFESTATION);
		createEReference(manifestationEClass, MANIFESTATION__UTILIZED_ELEMENT);

		operationEClass = createEClass(OPERATION);
		createEReference(operationEClass, OPERATION__BODY_CONDITION);
		createEReference(operationEClass, OPERATION__CLASS);
		createEReference(operationEClass, OPERATION__DATATYPE);
		createEReference(operationEClass, OPERATION__INTERFACE);
		createEAttribute(operationEClass, OPERATION__IS_ORDERED);
		createEAttribute(operationEClass, OPERATION__IS_QUERY);
		createEAttribute(operationEClass, OPERATION__IS_UNIQUE);
		createEAttribute(operationEClass, OPERATION__LOWER);
		createEReference(operationEClass, OPERATION__POSTCONDITION);
		createEReference(operationEClass, OPERATION__PRECONDITION);
		createEReference(operationEClass, OPERATION__REDEFINED_OPERATION);
		createEReference(operationEClass, OPERATION__TYPE);
		createEAttribute(operationEClass, OPERATION__UPPER);
		createEOperation(operationEClass, OPERATION___ONLY_BODY_FOR_QUERY__DIAGNOSTICCHAIN_MAP);
		createEOperation(operationEClass, OPERATION___AT_MOST_ONE_RETURN__DIAGNOSTICCHAIN_MAP);
		createEOperation(operationEClass, OPERATION___IS_ORDERED);
		createEOperation(operationEClass, OPERATION___IS_UNIQUE);
		createEOperation(operationEClass, OPERATION___LOWER);
		createEOperation(operationEClass, OPERATION___RETURN_RESULT);
		createEOperation(operationEClass, OPERATION___TYPE);
		createEOperation(operationEClass, OPERATION___UPPER);

		behavioralFeatureEClass = createEClass(BEHAVIORAL_FEATURE);
		createEAttribute(behavioralFeatureEClass, BEHAVIORAL_FEATURE__CONCURRENCY);
		createEAttribute(behavioralFeatureEClass, BEHAVIORAL_FEATURE__IS_ABSTRACT);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__METHOD);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__OWNED_PARAMETER);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__OWNED_PARAMETER_SET);
		createEReference(behavioralFeatureEClass, BEHAVIORAL_FEATURE__RAISED_EXCEPTION);

		behaviorEClass = createEClass(BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__CONTEXT);
		createEAttribute(behaviorEClass, BEHAVIOR__IS_REENTRANT);
		createEReference(behaviorEClass, BEHAVIOR__OWNED_PARAMETER);
		createEReference(behaviorEClass, BEHAVIOR__OWNED_PARAMETER_SET);
		createEReference(behaviorEClass, BEHAVIOR__POSTCONDITION);
		createEReference(behaviorEClass, BEHAVIOR__PRECONDITION);
		createEReference(behaviorEClass, BEHAVIOR__REDEFINED_BEHAVIOR);
		createEReference(behaviorEClass, BEHAVIOR__SPECIFICATION);
		createEOperation(behaviorEClass, BEHAVIOR___MUST_REALIZE__DIAGNOSTICCHAIN_MAP);
		createEOperation(behaviorEClass, BEHAVIOR___PARAMETERS_MATCH__DIAGNOSTICCHAIN_MAP);
		createEOperation(behaviorEClass, BEHAVIOR___FEATURE_OF_CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(behaviorEClass, BEHAVIOR___MOST_ONE_BEHAVIOUR__DIAGNOSTICCHAIN_MAP);
		createEOperation(behaviorEClass, BEHAVIOR___CONTEXT);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__DEFAULT);
		createEReference(parameterEClass, PARAMETER__DEFAULT_VALUE);
		createEAttribute(parameterEClass, PARAMETER__DIRECTION);
		createEAttribute(parameterEClass, PARAMETER__EFFECT);
		createEAttribute(parameterEClass, PARAMETER__IS_EXCEPTION);
		createEAttribute(parameterEClass, PARAMETER__IS_STREAM);
		createEReference(parameterEClass, PARAMETER__OPERATION);
		createEReference(parameterEClass, PARAMETER__PARAMETER_SET);
		createEOperation(parameterEClass, PARAMETER___NOT_EXCEPTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterEClass, PARAMETER___IN_AND_OUT__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterEClass, PARAMETER___CONNECTOR_END__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterEClass, PARAMETER___REENTRANT_BEHAVIORS__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterEClass, PARAMETER___STREAM_AND_EXCEPTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterEClass, PARAMETER___DEFAULT_);

		connectableElementEClass = createEClass(CONNECTABLE_ELEMENT);
		createEReference(connectableElementEClass, CONNECTABLE_ELEMENT__END);
		createEOperation(connectableElementEClass, CONNECTABLE_ELEMENT___END);

		connectorEndEClass = createEClass(CONNECTOR_END);
		createEReference(connectorEndEClass, CONNECTOR_END__DEFINING_END);
		createEReference(connectorEndEClass, CONNECTOR_END__PART_WITH_PORT);
		createEReference(connectorEndEClass, CONNECTOR_END__ROLE);
		createEOperation(connectorEndEClass, CONNECTOR_END___SELF_PART_WITH_PORT__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectorEndEClass, CONNECTOR_END___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectorEndEClass, CONNECTOR_END___ROLE_AND_PART_WITH_PORT__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectorEndEClass, CONNECTOR_END___PART_WITH_PORT_EMPTY__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectorEndEClass, CONNECTOR_END___DEFINING_END);

		connectableElementTemplateParameterEClass = createEClass(CONNECTABLE_ELEMENT_TEMPLATE_PARAMETER);

		parameterSetEClass = createEClass(PARAMETER_SET);
		createEReference(parameterSetEClass, PARAMETER_SET__CONDITION);
		createEReference(parameterSetEClass, PARAMETER_SET__PARAMETER);
		createEOperation(parameterSetEClass, PARAMETER_SET___SAME_PARAMETERIZED_ENTITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterSetEClass, PARAMETER_SET___INPUT__DIAGNOSTICCHAIN_MAP);
		createEOperation(parameterSetEClass, PARAMETER_SET___TWO_PARAMETER_SETS__DIAGNOSTICCHAIN_MAP);

		dataTypeEClass = createEClass(DATA_TYPE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_ATTRIBUTE);
		createEReference(dataTypeEClass, DATA_TYPE__OWNED_OPERATION);

		interfaceEClass = createEClass(INTERFACE);
		createEReference(interfaceEClass, INTERFACE__NESTED_CLASSIFIER);
		createEReference(interfaceEClass, INTERFACE__OWNED_ATTRIBUTE);
		createEReference(interfaceEClass, INTERFACE__OWNED_RECEPTION);
		createEReference(interfaceEClass, INTERFACE__PROTOCOL);
		createEReference(interfaceEClass, INTERFACE__REDEFINED_INTERFACE);
		createEReference(interfaceEClass, INTERFACE__OWNED_OPERATION);
		createEOperation(interfaceEClass, INTERFACE___VISIBILITY__DIAGNOSTICCHAIN_MAP);

		receptionEClass = createEClass(RECEPTION);
		createEReference(receptionEClass, RECEPTION__SIGNAL);
		createEOperation(receptionEClass, RECEPTION___NOT_QUERY__DIAGNOSTICCHAIN_MAP);

		signalEClass = createEClass(SIGNAL);
		createEReference(signalEClass, SIGNAL__OWNED_ATTRIBUTE);

		protocolStateMachineEClass = createEClass(PROTOCOL_STATE_MACHINE);
		createEReference(protocolStateMachineEClass, PROTOCOL_STATE_MACHINE__CONFORMANCE);
		createEOperation(protocolStateMachineEClass, PROTOCOL_STATE_MACHINE___DEEP_OR_SHALLOW_HISTORY__DIAGNOSTICCHAIN_MAP);
		createEOperation(protocolStateMachineEClass, PROTOCOL_STATE_MACHINE___ENTRY_EXIT_DO__DIAGNOSTICCHAIN_MAP);
		createEOperation(protocolStateMachineEClass, PROTOCOL_STATE_MACHINE___PORTS_CONNECTED__DIAGNOSTICCHAIN_MAP);
		createEOperation(protocolStateMachineEClass, PROTOCOL_STATE_MACHINE___PROTOCOL_TRANSITIONS__DIAGNOSTICCHAIN_MAP);

		stateMachineEClass = createEClass(STATE_MACHINE);
		createEReference(stateMachineEClass, STATE_MACHINE__CONNECTION_POINT);
		createEReference(stateMachineEClass, STATE_MACHINE__SUBMACHINE_STATE);
		createEReference(stateMachineEClass, STATE_MACHINE__REGION);
		createEReference(stateMachineEClass, STATE_MACHINE__EXTENDED_STATE_MACHINE);
		createEOperation(stateMachineEClass, STATE_MACHINE___CONTEXT_CLASSIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateMachineEClass, STATE_MACHINE___CLASSIFIER_CONTEXT__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateMachineEClass, STATE_MACHINE___METHOD__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateMachineEClass, STATE_MACHINE___CONNECTION_POINTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateMachineEClass, STATE_MACHINE___LCA__STATE_STATE);
		createEOperation(stateMachineEClass, STATE_MACHINE___ANCESTOR__STATE_STATE);
		createEOperation(stateMachineEClass, STATE_MACHINE___IS_REDEFINITION_CONTEXT_VALID__STATEMACHINE);

		pseudostateEClass = createEClass(PSEUDOSTATE);
		createEReference(pseudostateEClass, PSEUDOSTATE__STATE);
		createEAttribute(pseudostateEClass, PSEUDOSTATE__KIND);
		createEReference(pseudostateEClass, PSEUDOSTATE__STATE_MACHINE);
		createEOperation(pseudostateEClass, PSEUDOSTATE___JUNCTION_VERTEX__DIAGNOSTICCHAIN_MAP);
		createEOperation(pseudostateEClass, PSEUDOSTATE___CHOICE_VERTEX__DIAGNOSTICCHAIN_MAP);
		createEOperation(pseudostateEClass, PSEUDOSTATE___INITIAL_VERTEX__DIAGNOSTICCHAIN_MAP);
		createEOperation(pseudostateEClass, PSEUDOSTATE___TRANSITIONS_INCOMING__DIAGNOSTICCHAIN_MAP);
		createEOperation(pseudostateEClass, PSEUDOSTATE___FORK_VERTEX__DIAGNOSTICCHAIN_MAP);
		createEOperation(pseudostateEClass, PSEUDOSTATE___JOIN_VERTEX__DIAGNOSTICCHAIN_MAP);
		createEOperation(pseudostateEClass, PSEUDOSTATE___TRANSITIONS_OUTGOING__DIAGNOSTICCHAIN_MAP);
		createEOperation(pseudostateEClass, PSEUDOSTATE___OUTGOING_FROM_INITIAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(pseudostateEClass, PSEUDOSTATE___HISTORY_VERTICES__DIAGNOSTICCHAIN_MAP);

		vertexEClass = createEClass(VERTEX);
		createEReference(vertexEClass, VERTEX__CONTAINER);
		createEReference(vertexEClass, VERTEX__OUTGOING);
		createEReference(vertexEClass, VERTEX__INCOMING);
		createEOperation(vertexEClass, VERTEX___CONTAINING_STATE_MACHINE);
		createEOperation(vertexEClass, VERTEX___INCOMING);
		createEOperation(vertexEClass, VERTEX___OUTGOING);

		regionEClass = createEClass(REGION);
		createEReference(regionEClass, REGION__EXTENDED_REGION);
		createEReference(regionEClass, REGION__STATE);
		createEReference(regionEClass, REGION__STATE_MACHINE);
		createEReference(regionEClass, REGION__TRANSITION);
		createEReference(regionEClass, REGION__SUBVERTEX);
		createEOperation(regionEClass, REGION___DEEP_HISTORY_VERTEX__DIAGNOSTICCHAIN_MAP);
		createEOperation(regionEClass, REGION___OWNED__DIAGNOSTICCHAIN_MAP);
		createEOperation(regionEClass, REGION___INITIAL_VERTEX__DIAGNOSTICCHAIN_MAP);
		createEOperation(regionEClass, REGION___SHALLOW_HISTORY_VERTEX__DIAGNOSTICCHAIN_MAP);
		createEOperation(regionEClass, REGION___BELONGS_TO_PSM);
		createEOperation(regionEClass, REGION___CONTAINING_STATE_MACHINE);
		createEOperation(regionEClass, REGION___IS_REDEFINITION_CONTEXT_VALID__REGION);
		createEOperation(regionEClass, REGION___REDEFINITION_CONTEXT);

		stateEClass = createEClass(STATE);
		createEReference(stateEClass, STATE__CONNECTION);
		createEReference(stateEClass, STATE__CONNECTION_POINT);
		createEReference(stateEClass, STATE__DEFERRABLE_TRIGGER);
		createEReference(stateEClass, STATE__DO_ACTIVITY);
		createEReference(stateEClass, STATE__ENTRY);
		createEReference(stateEClass, STATE__EXIT);
		createEAttribute(stateEClass, STATE__IS_COMPOSITE);
		createEAttribute(stateEClass, STATE__IS_ORTHOGONAL);
		createEAttribute(stateEClass, STATE__IS_SIMPLE);
		createEAttribute(stateEClass, STATE__IS_SUBMACHINE_STATE);
		createEReference(stateEClass, STATE__REDEFINED_STATE);
		createEReference(stateEClass, STATE__STATE_INVARIANT);
		createEReference(stateEClass, STATE__SUBMACHINE);
		createEReference(stateEClass, STATE__REGION);
		createEOperation(stateEClass, STATE___COMPOSITE_STATES__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateEClass, STATE___SUBMACHINE_STATES__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateEClass, STATE___ENTRY_OR_EXIT__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateEClass, STATE___SUBMACHINE_OR_REGIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateEClass, STATE___DESTINATIONS_OR_SOURCES_OF_TRANSITIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(stateEClass, STATE___IS_COMPOSITE);
		createEOperation(stateEClass, STATE___IS_ORTHOGONAL);
		createEOperation(stateEClass, STATE___IS_REDEFINITION_CONTEXT_VALID__STATE);
		createEOperation(stateEClass, STATE___IS_SIMPLE);
		createEOperation(stateEClass, STATE___IS_SUBMACHINE_STATE);
		createEOperation(stateEClass, STATE___REDEFINITION_CONTEXT);

		connectionPointReferenceEClass = createEClass(CONNECTION_POINT_REFERENCE);
		createEReference(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE__ENTRY);
		createEReference(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE__EXIT);
		createEReference(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE__STATE);
		createEOperation(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE___ENTRY_PSEUDOSTATES__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectionPointReferenceEClass, CONNECTION_POINT_REFERENCE___EXIT_PSEUDOSTATES__DIAGNOSTICCHAIN_MAP);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__EVENT);
		createEReference(triggerEClass, TRIGGER__PORT);

		eventEClass = createEClass(EVENT);

		portEClass = createEClass(PORT);
		createEAttribute(portEClass, PORT__IS_BEHAVIOR);
		createEAttribute(portEClass, PORT__IS_CONJUGATED);
		createEAttribute(portEClass, PORT__IS_SERVICE);
		createEReference(portEClass, PORT__PROTOCOL);
		createEReference(portEClass, PORT__PROVIDED);
		createEReference(portEClass, PORT__REDEFINED_PORT);
		createEReference(portEClass, PORT__REQUIRED);
		createEOperation(portEClass, PORT___PORT_DESTROYED__DIAGNOSTICCHAIN_MAP);
		createEOperation(portEClass, PORT___DEFAULT_VALUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(portEClass, PORT___PORT_AGGREGATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(portEClass, PORT___PROVIDED);
		createEOperation(portEClass, PORT___REQUIRED);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__EFFECT);
		createEReference(transitionEClass, TRANSITION__GUARD);
		createEAttribute(transitionEClass, TRANSITION__KIND);
		createEReference(transitionEClass, TRANSITION__REDEFINED_TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__TRIGGER);
		createEReference(transitionEClass, TRANSITION__CONTAINER);
		createEOperation(transitionEClass, TRANSITION___STATE_IS_LOCAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___OUTGOING_PSEUDOSTATES__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___STATE_IS_EXTERNAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___SIGNATURES_COMPATIBLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___JOIN_SEGMENT_GUARDS__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___STATE_IS_INTERNAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___JOIN_SEGMENT_STATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___FORK_SEGMENT_GUARDS__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___FORK_SEGMENT_STATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___INITIAL_TRANSITION__DIAGNOSTICCHAIN_MAP);
		createEOperation(transitionEClass, TRANSITION___CONTAINING_STATE_MACHINE);
		createEOperation(transitionEClass, TRANSITION___REDEFINITION_CONTEXT);

		protocolConformanceEClass = createEClass(PROTOCOL_CONFORMANCE);
		createEReference(protocolConformanceEClass, PROTOCOL_CONFORMANCE__GENERAL_MACHINE);
		createEReference(protocolConformanceEClass, PROTOCOL_CONFORMANCE__SPECIFIC_MACHINE);

		operationTemplateParameterEClass = createEClass(OPERATION_TEMPLATE_PARAMETER);

		associationEClass = createEClass(ASSOCIATION);
		createEReference(associationEClass, ASSOCIATION__END_TYPE);
		createEAttribute(associationEClass, ASSOCIATION__IS_DERIVED);
		createEReference(associationEClass, ASSOCIATION__NAVIGABLE_OWNED_END);
		createEReference(associationEClass, ASSOCIATION__OWNED_END);
		createEReference(associationEClass, ASSOCIATION__MEMBER_END);
		createEOperation(associationEClass, ASSOCIATION___SPECIALIZED_END_TYPES__DIAGNOSTICCHAIN_MAP);
		createEOperation(associationEClass, ASSOCIATION___BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(associationEClass, ASSOCIATION___SPECIALIZED_END_NUMBER__DIAGNOSTICCHAIN_MAP);
		createEOperation(associationEClass, ASSOCIATION___ASSOCIATION_ENDS__DIAGNOSTICCHAIN_MAP);
		createEOperation(associationEClass, ASSOCIATION___END_TYPE);

		collaborationUseEClass = createEClass(COLLABORATION_USE);
		createEReference(collaborationUseEClass, COLLABORATION_USE__ROLE_BINDING);
		createEReference(collaborationUseEClass, COLLABORATION_USE__TYPE);
		createEOperation(collaborationUseEClass, COLLABORATION_USE___EVERY_ROLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(collaborationUseEClass, COLLABORATION_USE___CLIENT_ELEMENTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(collaborationUseEClass, COLLABORATION_USE___CONNECTORS__DIAGNOSTICCHAIN_MAP);

		collaborationEClass = createEClass(COLLABORATION);
		createEReference(collaborationEClass, COLLABORATION__COLLABORATION_ROLE);

		structuredClassifierEClass = createEClass(STRUCTURED_CLASSIFIER);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__OWNED_CONNECTOR);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__PART);
		createEReference(structuredClassifierEClass, STRUCTURED_CLASSIFIER__ROLE);
		createEOperation(structuredClassifierEClass, STRUCTURED_CLASSIFIER___MULTIPLICITIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(structuredClassifierEClass, STRUCTURED_CLASSIFIER___PART);

		connectorEClass = createEClass(CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__CONTRACT);
		createEReference(connectorEClass, CONNECTOR__END);
		createEAttribute(connectorEClass, CONNECTOR__KIND);
		createEReference(connectorEClass, CONNECTOR__REDEFINED_CONNECTOR);
		createEReference(connectorEClass, CONNECTOR__TYPE);
		createEOperation(connectorEClass, CONNECTOR___BETWEEN_INTERFACES_PORTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectorEClass, CONNECTOR___COMPATIBLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectorEClass, CONNECTOR___ROLES__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectorEClass, CONNECTOR___TYPES__DIAGNOSTICCHAIN_MAP);
		createEOperation(connectorEClass, CONNECTOR___KIND);

		generalizationEClass = createEClass(GENERALIZATION);
		createEReference(generalizationEClass, GENERALIZATION__GENERAL);
		createEReference(generalizationEClass, GENERALIZATION__GENERALIZATION_SET);
		createEAttribute(generalizationEClass, GENERALIZATION__IS_SUBSTITUTABLE);
		createEReference(generalizationEClass, GENERALIZATION__SPECIFIC);
		createEOperation(generalizationEClass, GENERALIZATION___GENERALIZATION_SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP);

		generalizationSetEClass = createEClass(GENERALIZATION_SET);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_COVERING);
		createEAttribute(generalizationSetEClass, GENERALIZATION_SET__IS_DISJOINT);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__POWERTYPE);
		createEReference(generalizationSetEClass, GENERALIZATION_SET__GENERALIZATION);
		createEOperation(generalizationSetEClass, GENERALIZATION_SET___MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP);
		createEOperation(generalizationSetEClass, GENERALIZATION_SET___GENERALIZATION_SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP);

		redefinableTemplateSignatureEClass = createEClass(REDEFINABLE_TEMPLATE_SIGNATURE);
		createEReference(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE__EXTENDED_SIGNATURE);
		createEReference(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE__INHERITED_PARAMETER);
		createEReference(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE__CLASSIFIER);
		createEOperation(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE___INHERITED_PARAMETERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(redefinableTemplateSignatureEClass, REDEFINABLE_TEMPLATE_SIGNATURE___INHERITED_PARAMETER);

		useCaseEClass = createEClass(USE_CASE);
		createEReference(useCaseEClass, USE_CASE__EXTEND);
		createEReference(useCaseEClass, USE_CASE__EXTENSION_POINT);
		createEReference(useCaseEClass, USE_CASE__INCLUDE);
		createEReference(useCaseEClass, USE_CASE__SUBJECT);
		createEOperation(useCaseEClass, USE_CASE___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP);
		createEOperation(useCaseEClass, USE_CASE___CANNOT_INCLUDE_SELF__DIAGNOSTICCHAIN_MAP);
		createEOperation(useCaseEClass, USE_CASE___BINARY_ASSOCIATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(useCaseEClass, USE_CASE___NO_ASSOCIATION_TO_USE_CASE__DIAGNOSTICCHAIN_MAP);
		createEOperation(useCaseEClass, USE_CASE___ALL_INCLUDED_USE_CASES);

		extendEClass = createEClass(EXTEND);
		createEReference(extendEClass, EXTEND__CONDITION);
		createEReference(extendEClass, EXTEND__EXTENDED_CASE);
		createEReference(extendEClass, EXTEND__EXTENSION_LOCATION);
		createEReference(extendEClass, EXTEND__EXTENSION);
		createEOperation(extendEClass, EXTEND___EXTENSION_POINTS__DIAGNOSTICCHAIN_MAP);

		extensionPointEClass = createEClass(EXTENSION_POINT);
		createEReference(extensionPointEClass, EXTENSION_POINT__USE_CASE);
		createEOperation(extensionPointEClass, EXTENSION_POINT___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP);

		includeEClass = createEClass(INCLUDE);
		createEReference(includeEClass, INCLUDE__ADDITION);
		createEReference(includeEClass, INCLUDE__INCLUDING_CASE);

		substitutionEClass = createEClass(SUBSTITUTION);
		createEReference(substitutionEClass, SUBSTITUTION__CONTRACT);
		createEReference(substitutionEClass, SUBSTITUTION__SUBSTITUTING_CLASSIFIER);

		realizationEClass = createEClass(REALIZATION);

		classifierTemplateParameterEClass = createEClass(CLASSIFIER_TEMPLATE_PARAMETER);
		createEAttribute(classifierTemplateParameterEClass, CLASSIFIER_TEMPLATE_PARAMETER__ALLOW_SUBSTITUTABLE);
		createEReference(classifierTemplateParameterEClass, CLASSIFIER_TEMPLATE_PARAMETER__CONSTRAINING_CLASSIFIER);
		createEOperation(classifierTemplateParameterEClass, CLASSIFIER_TEMPLATE_PARAMETER___HAS_CONSTRAINING_CLASSIFIER__DIAGNOSTICCHAIN_MAP);

		interfaceRealizationEClass = createEClass(INTERFACE_REALIZATION);
		createEReference(interfaceRealizationEClass, INTERFACE_REALIZATION__CONTRACT);
		createEReference(interfaceRealizationEClass, INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);

		encapsulatedClassifierEClass = createEClass(ENCAPSULATED_CLASSIFIER);
		createEReference(encapsulatedClassifierEClass, ENCAPSULATED_CLASSIFIER__OWNED_PORT);
		createEOperation(encapsulatedClassifierEClass, ENCAPSULATED_CLASSIFIER___OWNED_PORT);

		extensionEClass = createEClass(EXTENSION);
		createEAttribute(extensionEClass, EXTENSION__IS_REQUIRED);
		createEReference(extensionEClass, EXTENSION__METACLASS);
		createEOperation(extensionEClass, EXTENSION___NON_OWNED_END__DIAGNOSTICCHAIN_MAP);
		createEOperation(extensionEClass, EXTENSION___IS_BINARY__DIAGNOSTICCHAIN_MAP);
		createEOperation(extensionEClass, EXTENSION___IS_REQUIRED);
		createEOperation(extensionEClass, EXTENSION___METACLASS);
		createEOperation(extensionEClass, EXTENSION___METACLASS_END);

		extensionEndEClass = createEClass(EXTENSION_END);
		createEOperation(extensionEndEClass, EXTENSION_END___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(extensionEndEClass, EXTENSION_END___AGGREGATION__DIAGNOSTICCHAIN_MAP);

		imageEClass = createEClass(IMAGE);
		createEAttribute(imageEClass, IMAGE__CONTENT);
		createEAttribute(imageEClass, IMAGE__FORMAT);
		createEAttribute(imageEClass, IMAGE__LOCATION);

		profileEClass = createEClass(PROFILE);
		createEReference(profileEClass, PROFILE__METACLASS_REFERENCE);
		createEReference(profileEClass, PROFILE__METAMODEL_REFERENCE);
		createEOperation(profileEClass, PROFILE___REFERENCES_SAME_METAMODEL__DIAGNOSTICCHAIN_MAP);
		createEOperation(profileEClass, PROFILE___METACLASS_REFERENCE_NOT_SPECIALIZED__DIAGNOSTICCHAIN_MAP);

		packageMergeEClass = createEClass(PACKAGE_MERGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__MERGED_PACKAGE);
		createEReference(packageMergeEClass, PACKAGE_MERGE__RECEIVING_PACKAGE);

		profileApplicationEClass = createEClass(PROFILE_APPLICATION);
		createEReference(profileApplicationEClass, PROFILE_APPLICATION__APPLIED_PROFILE);
		createEAttribute(profileApplicationEClass, PROFILE_APPLICATION__IS_STRICT);
		createEReference(profileApplicationEClass, PROFILE_APPLICATION__APPLYING_PACKAGE);

		opaqueExpressionEClass = createEClass(OPAQUE_EXPRESSION);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__BEHAVIOR);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__BODY);
		createEAttribute(opaqueExpressionEClass, OPAQUE_EXPRESSION__LANGUAGE);
		createEReference(opaqueExpressionEClass, OPAQUE_EXPRESSION__RESULT);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___ONE_RETURN_RESULT_PARAMETER__DIAGNOSTICCHAIN_MAP);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___ONLY_RETURN_RESULT_PARAMETERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___LANGUAGE_BODY_SIZE__DIAGNOSTICCHAIN_MAP);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_INTEGRAL);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_NON_NEGATIVE);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___IS_POSITIVE);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___RESULT);
		createEOperation(opaqueExpressionEClass, OPAQUE_EXPRESSION___VALUE);

		acceptCallActionEClass = createEClass(ACCEPT_CALL_ACTION);
		createEReference(acceptCallActionEClass, ACCEPT_CALL_ACTION__RETURN_INFORMATION);
		createEOperation(acceptCallActionEClass, ACCEPT_CALL_ACTION___TRIGGER_CALL_EVENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(acceptCallActionEClass, ACCEPT_CALL_ACTION___RESULT_PINS__DIAGNOSTICCHAIN_MAP);
		createEOperation(acceptCallActionEClass, ACCEPT_CALL_ACTION___UNMARSHALL__DIAGNOSTICCHAIN_MAP);

		acceptEventActionEClass = createEClass(ACCEPT_EVENT_ACTION);
		createEAttribute(acceptEventActionEClass, ACCEPT_EVENT_ACTION__IS_UNMARSHALL);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__RESULT);
		createEReference(acceptEventActionEClass, ACCEPT_EVENT_ACTION__TRIGGER);
		createEOperation(acceptEventActionEClass, ACCEPT_EVENT_ACTION___TRIGGER_EVENTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(acceptEventActionEClass, ACCEPT_EVENT_ACTION___NO_INPUT_PINS__DIAGNOSTICCHAIN_MAP);
		createEOperation(acceptEventActionEClass, ACCEPT_EVENT_ACTION___UNMARSHALL_SIGNAL_EVENTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(acceptEventActionEClass, ACCEPT_EVENT_ACTION___NO_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__CONTEXT);
		createEReference(actionEClass, ACTION__INPUT);
		createEAttribute(actionEClass, ACTION__IS_LOCALLY_REENTRANT);
		createEReference(actionEClass, ACTION__LOCAL_POSTCONDITION);
		createEReference(actionEClass, ACTION__LOCAL_PRECONDITION);
		createEReference(actionEClass, ACTION__OUTPUT);
		createEOperation(actionEClass, ACTION___CONTEXT);

		executableNodeEClass = createEClass(EXECUTABLE_NODE);
		createEReference(executableNodeEClass, EXECUTABLE_NODE__HANDLER);

		activityNodeEClass = createEClass(ACTIVITY_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__ACTIVITY);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_GROUP);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_PARTITION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_STRUCTURED_NODE);
		createEReference(activityNodeEClass, ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		createEReference(activityNodeEClass, ACTIVITY_NODE__OUTGOING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__INCOMING);
		createEReference(activityNodeEClass, ACTIVITY_NODE__REDEFINED_NODE);
		createEOperation(activityNodeEClass, ACTIVITY_NODE___OWNED_STRUCTURED_NODE__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityNodeEClass, ACTIVITY_NODE___OWNED__DIAGNOSTICCHAIN_MAP);

		activityEClass = createEClass(ACTIVITY);
		createEReference(activityEClass, ACTIVITY__EDGE);
		createEReference(activityEClass, ACTIVITY__GROUP);
		createEReference(activityEClass, ACTIVITY__STRUCTURED_NODE);
		createEReference(activityEClass, ACTIVITY__VARIABLE);
		createEAttribute(activityEClass, ACTIVITY__IS_READ_ONLY);
		createEAttribute(activityEClass, ACTIVITY__IS_SINGLE_EXECUTION);
		createEReference(activityEClass, ACTIVITY__PARTITION);
		createEReference(activityEClass, ACTIVITY__NODE);
		createEOperation(activityEClass, ACTIVITY___AUTONOMOUS__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityEClass, ACTIVITY___NO_SUPERGROUPS__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityEClass, ACTIVITY___ACTIVITY_PARAMETER_NODE__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityEClass, ACTIVITY___STRUCTURED_NODE);

		activityEdgeEClass = createEClass(ACTIVITY_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__GUARD);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_GROUP);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_PARTITION);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__INTERRUPTS);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__REDEFINED_EDGE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__SOURCE);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__TARGET);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__WEIGHT);
		createEReference(activityEdgeEClass, ACTIVITY_EDGE__ACTIVITY);
		createEOperation(activityEdgeEClass, ACTIVITY_EDGE___SOURCE_AND_TARGET__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityEdgeEClass, ACTIVITY_EDGE___OWNED__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityEdgeEClass, ACTIVITY_EDGE___STRUCTURED_NODE__DIAGNOSTICCHAIN_MAP);

		activityGroupEClass = createEClass(ACTIVITY_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__CONTAINED_NODE);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__IN_ACTIVITY);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__SUBGROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__SUPER_GROUP);
		createEReference(activityGroupEClass, ACTIVITY_GROUP__CONTAINED_EDGE);
		createEOperation(activityGroupEClass, ACTIVITY_GROUP___GROUP_OWNED__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityGroupEClass, ACTIVITY_GROUP___NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityGroupEClass, ACTIVITY_GROUP___NOT_CONTAINED__DIAGNOSTICCHAIN_MAP);

		activityPartitionEClass = createEClass(ACTIVITY_PARTITION);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__IS_DIMENSION);
		createEAttribute(activityPartitionEClass, ACTIVITY_PARTITION__IS_EXTERNAL);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__NODE);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__REPRESENTS);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUBPARTITION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__SUPER_PARTITION);
		createEReference(activityPartitionEClass, ACTIVITY_PARTITION__EDGE);
		createEOperation(activityPartitionEClass, ACTIVITY_PARTITION___REPRESENTS_PART_AND_IS_CONTAINED__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityPartitionEClass, ACTIVITY_PARTITION___REPRESENTS_PART__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityPartitionEClass, ACTIVITY_PARTITION___REPRESENTS_CLASSIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityPartitionEClass, ACTIVITY_PARTITION___DIMENSION_NOT_CONTAINED__DIAGNOSTICCHAIN_MAP);

		structuredActivityNodeEClass = createEClass(STRUCTURED_ACTIVITY_NODE);
		createEAttribute(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__NODE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__VARIABLE);
		createEReference(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE__EDGE);
		createEOperation(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE___OUTPUT_PIN_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE___EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(structuredActivityNodeEClass, STRUCTURED_ACTIVITY_NODE___INPUT_PIN_EDGES__DIAGNOSTICCHAIN_MAP);

		inputPinEClass = createEClass(INPUT_PIN);
		createEOperation(inputPinEClass, INPUT_PIN___OUTGOING_EDGES_STRUCTURED_ONLY__DIAGNOSTICCHAIN_MAP);

		pinEClass = createEClass(PIN);
		createEAttribute(pinEClass, PIN__IS_CONTROL);
		createEOperation(pinEClass, PIN___CONTROL_PINS__DIAGNOSTICCHAIN_MAP);

		outputPinEClass = createEClass(OUTPUT_PIN);
		createEOperation(outputPinEClass, OUTPUT_PIN___INCOMING_EDGES_STRUCTURED_ONLY__DIAGNOSTICCHAIN_MAP);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__ACTIVITY_SCOPE);
		createEReference(variableEClass, VARIABLE__SCOPE);
		createEOperation(variableEClass, VARIABLE___OWNED__DIAGNOSTICCHAIN_MAP);
		createEOperation(variableEClass, VARIABLE___IS_ACCESSIBLE_BY__ACTION);

		interruptibleActivityRegionEClass = createEClass(INTERRUPTIBLE_ACTIVITY_REGION);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__NODE);
		createEReference(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE);
		createEOperation(interruptibleActivityRegionEClass, INTERRUPTIBLE_ACTIVITY_REGION___INTERRUPTING_EDGES__DIAGNOSTICCHAIN_MAP);

		exceptionHandlerEClass = createEClass(EXCEPTION_HANDLER);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__EXCEPTION_TYPE);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__HANDLER_BODY);
		createEReference(exceptionHandlerEClass, EXCEPTION_HANDLER__PROTECTED_NODE);
		createEOperation(exceptionHandlerEClass, EXCEPTION_HANDLER___RESULT_PINS__DIAGNOSTICCHAIN_MAP);
		createEOperation(exceptionHandlerEClass, EXCEPTION_HANDLER___ONE_INPUT__DIAGNOSTICCHAIN_MAP);
		createEOperation(exceptionHandlerEClass, EXCEPTION_HANDLER___EDGE_SOURCE_TARGET__DIAGNOSTICCHAIN_MAP);
		createEOperation(exceptionHandlerEClass, EXCEPTION_HANDLER___EXCEPTION_BODY__DIAGNOSTICCHAIN_MAP);

		actionExecutionSpecificationEClass = createEClass(ACTION_EXECUTION_SPECIFICATION);
		createEReference(actionExecutionSpecificationEClass, ACTION_EXECUTION_SPECIFICATION__ACTION);
		createEOperation(actionExecutionSpecificationEClass, ACTION_EXECUTION_SPECIFICATION___ACTION_REFERENCED__DIAGNOSTICCHAIN_MAP);

		executionSpecificationEClass = createEClass(EXECUTION_SPECIFICATION);
		createEReference(executionSpecificationEClass, EXECUTION_SPECIFICATION__FINISH);
		createEReference(executionSpecificationEClass, EXECUTION_SPECIFICATION__START);
		createEOperation(executionSpecificationEClass, EXECUTION_SPECIFICATION___SAME_LIFELINE__DIAGNOSTICCHAIN_MAP);

		interactionFragmentEClass = createEClass(INTERACTION_FRAGMENT);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__COVERED);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__ENCLOSING_INTERACTION);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__ENCLOSING_OPERAND);
		createEReference(interactionFragmentEClass, INTERACTION_FRAGMENT__GENERAL_ORDERING);

		lifelineEClass = createEClass(LIFELINE);
		createEReference(lifelineEClass, LIFELINE__DECOMPOSED_AS);
		createEReference(lifelineEClass, LIFELINE__INTERACTION);
		createEReference(lifelineEClass, LIFELINE__REPRESENTS);
		createEReference(lifelineEClass, LIFELINE__SELECTOR);
		createEReference(lifelineEClass, LIFELINE__COVERED_BY);
		createEOperation(lifelineEClass, LIFELINE___SELECTOR_SPECIFIED__DIAGNOSTICCHAIN_MAP);
		createEOperation(lifelineEClass, LIFELINE___INTERACTION_USES_SHARE_LIFELINE__DIAGNOSTICCHAIN_MAP);
		createEOperation(lifelineEClass, LIFELINE___SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP);

		partDecompositionEClass = createEClass(PART_DECOMPOSITION);
		createEOperation(partDecompositionEClass, PART_DECOMPOSITION___COMMUTATIVITY_OF_DECOMPOSITION__DIAGNOSTICCHAIN_MAP);
		createEOperation(partDecompositionEClass, PART_DECOMPOSITION___ASSUME__DIAGNOSTICCHAIN_MAP);
		createEOperation(partDecompositionEClass, PART_DECOMPOSITION___PARTS_OF_INTERNAL_STRUCTURES__DIAGNOSTICCHAIN_MAP);

		interactionUseEClass = createEClass(INTERACTION_USE);
		createEReference(interactionUseEClass, INTERACTION_USE__ACTUAL_GATE);
		createEReference(interactionUseEClass, INTERACTION_USE__ARGUMENT);
		createEReference(interactionUseEClass, INTERACTION_USE__REFERS_TO);
		createEReference(interactionUseEClass, INTERACTION_USE__RETURN_VALUE);
		createEReference(interactionUseEClass, INTERACTION_USE__RETURN_VALUE_RECIPIENT);
		createEOperation(interactionUseEClass, INTERACTION_USE___ARGUMENTS_CORRESPOND_TO_PARAMETERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionUseEClass, INTERACTION_USE___RETURN_VALUE_TYPE_RECIPIENT_CORRESPONDENCE__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionUseEClass, INTERACTION_USE___ALL_LIFELINES__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionUseEClass, INTERACTION_USE___RETURN_VALUE_RECIPIENT_COVERAGE__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionUseEClass, INTERACTION_USE___ARGUMENTS_ARE_CONSTANTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionUseEClass, INTERACTION_USE___GATES_MATCH__DIAGNOSTICCHAIN_MAP);

		gateEClass = createEClass(GATE);
		createEOperation(gateEClass, GATE___MESSAGES_ACTUAL_GATE__DIAGNOSTICCHAIN_MAP);
		createEOperation(gateEClass, GATE___MESSAGES_COMBINED_FRAGMENT__DIAGNOSTICCHAIN_MAP);

		messageEndEClass = createEClass(MESSAGE_END);
		createEReference(messageEndEClass, MESSAGE_END__MESSAGE);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__ARGUMENT);
		createEReference(messageEClass, MESSAGE__CONNECTOR);
		createEReference(messageEClass, MESSAGE__INTERACTION);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_KIND);
		createEAttribute(messageEClass, MESSAGE__MESSAGE_SORT);
		createEReference(messageEClass, MESSAGE__RECEIVE_EVENT);
		createEReference(messageEClass, MESSAGE__SEND_EVENT);
		createEReference(messageEClass, MESSAGE__SIGNATURE);
		createEOperation(messageEClass, MESSAGE___SIGNATURE_REFER_TO__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___ARGUMENTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___SENDING_RECEIVING_MESSAGE_EVENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___SIGNATURE_IS_OPERATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___SIGNATURE_IS_SIGNAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___OCCURRENCE_SPECIFICATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___CANNOT_CROSS_BOUNDARIES__DIAGNOSTICCHAIN_MAP);
		createEOperation(messageEClass, MESSAGE___MESSAGE_KIND);

		interactionEClass = createEClass(INTERACTION);
		createEReference(interactionEClass, INTERACTION__ACTION);
		createEReference(interactionEClass, INTERACTION__FORMAL_GATE);
		createEReference(interactionEClass, INTERACTION__FRAGMENT);
		createEReference(interactionEClass, INTERACTION__LIFELINE);
		createEReference(interactionEClass, INTERACTION__MESSAGE);

		interactionOperandEClass = createEClass(INTERACTION_OPERAND);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__GUARD);
		createEReference(interactionOperandEClass, INTERACTION_OPERAND__FRAGMENT);
		createEOperation(interactionOperandEClass, INTERACTION_OPERAND___GUARD_CONTAIN_REFERENCES__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionOperandEClass, INTERACTION_OPERAND___GUARD_DIRECTLY_PRIOR__DIAGNOSTICCHAIN_MAP);

		interactionConstraintEClass = createEClass(INTERACTION_CONSTRAINT);
		createEReference(interactionConstraintEClass, INTERACTION_CONSTRAINT__MAXINT);
		createEReference(interactionConstraintEClass, INTERACTION_CONSTRAINT__MININT);
		createEOperation(interactionConstraintEClass, INTERACTION_CONSTRAINT___DYNAMIC_VARIABLES__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionConstraintEClass, INTERACTION_CONSTRAINT___MAXINT_POSITIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionConstraintEClass, INTERACTION_CONSTRAINT___MININT_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionConstraintEClass, INTERACTION_CONSTRAINT___GLOBAL_DATA__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionConstraintEClass, INTERACTION_CONSTRAINT___MININT_MAXINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(interactionConstraintEClass, INTERACTION_CONSTRAINT___MAXINT_GREATER_EQUAL_MININT__DIAGNOSTICCHAIN_MAP);

		generalOrderingEClass = createEClass(GENERAL_ORDERING);
		createEReference(generalOrderingEClass, GENERAL_ORDERING__AFTER);
		createEReference(generalOrderingEClass, GENERAL_ORDERING__BEFORE);
		createEOperation(generalOrderingEClass, GENERAL_ORDERING___IRREFLEXSIVE_TRANSITIVE_CLOSURE__DIAGNOSTICCHAIN_MAP);

		occurrenceSpecificationEClass = createEClass(OCCURRENCE_SPECIFICATION);
		createEReference(occurrenceSpecificationEClass, OCCURRENCE_SPECIFICATION__TO_AFTER);
		createEReference(occurrenceSpecificationEClass, OCCURRENCE_SPECIFICATION__TO_BEFORE);

		actionInputPinEClass = createEClass(ACTION_INPUT_PIN);
		createEReference(actionInputPinEClass, ACTION_INPUT_PIN__FROM_ACTION);
		createEOperation(actionInputPinEClass, ACTION_INPUT_PIN___NO_CONTROL_OR_DATA_FLOW__DIAGNOSTICCHAIN_MAP);
		createEOperation(actionInputPinEClass, ACTION_INPUT_PIN___ONE_OUTPUT_PIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(actionInputPinEClass, ACTION_INPUT_PIN___INPUT_PIN__DIAGNOSTICCHAIN_MAP);

		activityFinalNodeEClass = createEClass(ACTIVITY_FINAL_NODE);

		finalNodeEClass = createEClass(FINAL_NODE);
		createEOperation(finalNodeEClass, FINAL_NODE___NO_OUTGOING_EDGES__DIAGNOSTICCHAIN_MAP);

		controlNodeEClass = createEClass(CONTROL_NODE);

		activityParameterNodeEClass = createEClass(ACTIVITY_PARAMETER_NODE);
		createEReference(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE__PARAMETER);
		createEOperation(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE___HAS_PARAMETERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE___NO_INCOMING_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE___MAXIMUM_ONE_PARAMETER_NODE__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE___SAME_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE___NO_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE___NO_OUTGOING_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(activityParameterNodeEClass, ACTIVITY_PARAMETER_NODE___MAXIMUM_TWO_PARAMETER_NODES__DIAGNOSTICCHAIN_MAP);

		actorEClass = createEClass(ACTOR);
		createEOperation(actorEClass, ACTOR___ASSOCIATIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(actorEClass, ACTOR___MUST_HAVE_NAME__DIAGNOSTICCHAIN_MAP);

		addStructuralFeatureValueActionEClass = createEClass(ADD_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEReference(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT);
		createEAttribute(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REPLACE_ALL);
		createEOperation(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION___REQUIRED_VALUE__DIAGNOSTICCHAIN_MAP);
		createEOperation(addStructuralFeatureValueActionEClass, ADD_STRUCTURAL_FEATURE_VALUE_ACTION___UNLIMITED_NATURAL_AND_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);

		writeStructuralFeatureActionEClass = createEClass(WRITE_STRUCTURAL_FEATURE_ACTION);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__RESULT);
		createEReference(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION__VALUE);
		createEOperation(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION___INPUT_PIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION___MULTIPLICITY_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(writeStructuralFeatureActionEClass, WRITE_STRUCTURAL_FEATURE_ACTION___TYPE_OF_RESULT__DIAGNOSTICCHAIN_MAP);

		structuralFeatureActionEClass = createEClass(STRUCTURAL_FEATURE_ACTION);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__OBJECT);
		createEReference(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION__STRUCTURAL_FEATURE);
		createEOperation(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION___VISIBILITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION___NOT_STATIC__DIAGNOSTICCHAIN_MAP);
		createEOperation(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION___ONE_FEATURING_CLASSIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(structuralFeatureActionEClass, STRUCTURAL_FEATURE_ACTION___SAME_TYPE__DIAGNOSTICCHAIN_MAP);

		addVariableValueActionEClass = createEClass(ADD_VARIABLE_VALUE_ACTION);
		createEReference(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION__INSERT_AT);
		createEAttribute(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION__IS_REPLACE_ALL);
		createEOperation(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION___SINGLE_INPUT_PIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(addVariableValueActionEClass, ADD_VARIABLE_VALUE_ACTION___REQUIRED_VALUE__DIAGNOSTICCHAIN_MAP);

		writeVariableActionEClass = createEClass(WRITE_VARIABLE_ACTION);
		createEReference(writeVariableActionEClass, WRITE_VARIABLE_ACTION__VALUE);
		createEOperation(writeVariableActionEClass, WRITE_VARIABLE_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(writeVariableActionEClass, WRITE_VARIABLE_ACTION___SAME_TYPE__DIAGNOSTICCHAIN_MAP);

		variableActionEClass = createEClass(VARIABLE_ACTION);
		createEReference(variableActionEClass, VARIABLE_ACTION__VARIABLE);
		createEOperation(variableActionEClass, VARIABLE_ACTION___SCOPE_OF_VARIABLE__DIAGNOSTICCHAIN_MAP);

		anyReceiveEventEClass = createEClass(ANY_RECEIVE_EVENT);

		messageEventEClass = createEClass(MESSAGE_EVENT);

		associationClassEClass = createEClass(ASSOCIATION_CLASS);
		createEOperation(associationClassEClass, ASSOCIATION_CLASS___CANNOT_BE_DEFINED__DIAGNOSTICCHAIN_MAP);
		createEOperation(associationClassEClass, ASSOCIATION_CLASS___DISJOINT_ATTRIBUTES_ENDS__DIAGNOSTICCHAIN_MAP);

		behaviorExecutionSpecificationEClass = createEClass(BEHAVIOR_EXECUTION_SPECIFICATION);
		createEReference(behaviorExecutionSpecificationEClass, BEHAVIOR_EXECUTION_SPECIFICATION__BEHAVIOR);

		broadcastSignalActionEClass = createEClass(BROADCAST_SIGNAL_ACTION);
		createEReference(broadcastSignalActionEClass, BROADCAST_SIGNAL_ACTION__SIGNAL);
		createEOperation(broadcastSignalActionEClass, BROADCAST_SIGNAL_ACTION___TYPE_ORDERING_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(broadcastSignalActionEClass, BROADCAST_SIGNAL_ACTION___NUMBER_AND_ORDER__DIAGNOSTICCHAIN_MAP);

		invocationActionEClass = createEClass(INVOCATION_ACTION);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ARGUMENT);
		createEReference(invocationActionEClass, INVOCATION_ACTION__ON_PORT);
		createEOperation(invocationActionEClass, INVOCATION_ACTION___ON_PORT_RECEIVER__DIAGNOSTICCHAIN_MAP);

		callActionEClass = createEClass(CALL_ACTION);
		createEAttribute(callActionEClass, CALL_ACTION__IS_SYNCHRONOUS);
		createEReference(callActionEClass, CALL_ACTION__RESULT);
		createEOperation(callActionEClass, CALL_ACTION___SYNCHRONOUS_CALL__DIAGNOSTICCHAIN_MAP);
		createEOperation(callActionEClass, CALL_ACTION___NUMBER_AND_ORDER__DIAGNOSTICCHAIN_MAP);
		createEOperation(callActionEClass, CALL_ACTION___TYPE_ORDERING_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);

		callBehaviorActionEClass = createEClass(CALL_BEHAVIOR_ACTION);
		createEReference(callBehaviorActionEClass, CALL_BEHAVIOR_ACTION__BEHAVIOR);
		createEOperation(callBehaviorActionEClass, CALL_BEHAVIOR_ACTION___ARGUMENT_PIN_EQUAL_PARAMETER__DIAGNOSTICCHAIN_MAP);
		createEOperation(callBehaviorActionEClass, CALL_BEHAVIOR_ACTION___RESULT_PIN_EQUAL_PARAMETER__DIAGNOSTICCHAIN_MAP);

		callEventEClass = createEClass(CALL_EVENT);
		createEReference(callEventEClass, CALL_EVENT__OPERATION);

		callOperationActionEClass = createEClass(CALL_OPERATION_ACTION);
		createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__OPERATION);
		createEReference(callOperationActionEClass, CALL_OPERATION_ACTION__TARGET);
		createEOperation(callOperationActionEClass, CALL_OPERATION_ACTION___ARGUMENT_PIN_EQUAL_PARAMETER__DIAGNOSTICCHAIN_MAP);
		createEOperation(callOperationActionEClass, CALL_OPERATION_ACTION___TYPE_TARGET_PIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(callOperationActionEClass, CALL_OPERATION_ACTION___RESULT_PIN_EQUAL_PARAMETER__DIAGNOSTICCHAIN_MAP);

		centralBufferNodeEClass = createEClass(CENTRAL_BUFFER_NODE);

		changeEventEClass = createEClass(CHANGE_EVENT);
		createEReference(changeEventEClass, CHANGE_EVENT__CHANGE_EXPRESSION);

		clauseEClass = createEClass(CLAUSE);
		createEReference(clauseEClass, CLAUSE__BODY);
		createEReference(clauseEClass, CLAUSE__BODY_OUTPUT);
		createEReference(clauseEClass, CLAUSE__DECIDER);
		createEReference(clauseEClass, CLAUSE__PREDECESSOR_CLAUSE);
		createEReference(clauseEClass, CLAUSE__SUCCESSOR_CLAUSE);
		createEReference(clauseEClass, CLAUSE__TEST);
		createEOperation(clauseEClass, CLAUSE___BODY_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP);
		createEOperation(clauseEClass, CLAUSE___TEST_AND_BODY__DIAGNOSTICCHAIN_MAP);
		createEOperation(clauseEClass, CLAUSE___DECIDER_OUTPUT__DIAGNOSTICCHAIN_MAP);

		clearAssociationActionEClass = createEClass(CLEAR_ASSOCIATION_ACTION);
		createEReference(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION__ASSOCIATION);
		createEReference(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION__OBJECT);
		createEOperation(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION___SAME_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(clearAssociationActionEClass, CLEAR_ASSOCIATION_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);

		clearStructuralFeatureActionEClass = createEClass(CLEAR_STRUCTURAL_FEATURE_ACTION);
		createEReference(clearStructuralFeatureActionEClass, CLEAR_STRUCTURAL_FEATURE_ACTION__RESULT);
		createEOperation(clearStructuralFeatureActionEClass, CLEAR_STRUCTURAL_FEATURE_ACTION___TYPE_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(clearStructuralFeatureActionEClass, CLEAR_STRUCTURAL_FEATURE_ACTION___MULTIPLICITY_OF_RESULT__DIAGNOSTICCHAIN_MAP);

		clearVariableActionEClass = createEClass(CLEAR_VARIABLE_ACTION);

		combinedFragmentEClass = createEClass(COMBINED_FRAGMENT);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__CFRAGMENT_GATE);
		createEAttribute(combinedFragmentEClass, COMBINED_FRAGMENT__INTERACTION_OPERATOR);
		createEReference(combinedFragmentEClass, COMBINED_FRAGMENT__OPERAND);
		createEOperation(combinedFragmentEClass, COMBINED_FRAGMENT___MININT_AND_MAXINT__DIAGNOSTICCHAIN_MAP);
		createEOperation(combinedFragmentEClass, COMBINED_FRAGMENT___OPT_LOOP_BREAK_NEG__DIAGNOSTICCHAIN_MAP);
		createEOperation(combinedFragmentEClass, COMBINED_FRAGMENT___BREAK____DIAGNOSTICCHAIN_MAP);
		createEOperation(combinedFragmentEClass, COMBINED_FRAGMENT___CONSIDER_AND_IGNORE__DIAGNOSTICCHAIN_MAP);

		communicationPathEClass = createEClass(COMMUNICATION_PATH);

		componentEClass = createEClass(COMPONENT);
		createEAttribute(componentEClass, COMPONENT__IS_INDIRECTLY_INSTANTIATED);
		createEReference(componentEClass, COMPONENT__PACKAGED_ELEMENT);
		createEReference(componentEClass, COMPONENT__PROVIDED);
		createEReference(componentEClass, COMPONENT__REALIZATION);
		createEReference(componentEClass, COMPONENT__REQUIRED);
		createEOperation(componentEClass, COMPONENT___NO_PACKAGED_ELEMENTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(componentEClass, COMPONENT___NO_NESTED_CLASSIFIERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(componentEClass, COMPONENT___PROVIDED);
		createEOperation(componentEClass, COMPONENT___REALIZED_INTERFACES__CLASSIFIER);
		createEOperation(componentEClass, COMPONENT___REQUIRED);
		createEOperation(componentEClass, COMPONENT___USED_INTERFACES__CLASSIFIER);

		componentRealizationEClass = createEClass(COMPONENT_REALIZATION);
		createEReference(componentRealizationEClass, COMPONENT_REALIZATION__REALIZING_CLASSIFIER);
		createEReference(componentRealizationEClass, COMPONENT_REALIZATION__ABSTRACTION);

		conditionalNodeEClass = createEClass(CONDITIONAL_NODE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__CLAUSE);
		createEAttribute(conditionalNodeEClass, CONDITIONAL_NODE__IS_ASSURED);
		createEAttribute(conditionalNodeEClass, CONDITIONAL_NODE__IS_DETERMINATE);
		createEReference(conditionalNodeEClass, CONDITIONAL_NODE__RESULT);
		createEOperation(conditionalNodeEClass, CONDITIONAL_NODE___NO_INPUT_PINS__DIAGNOSTICCHAIN_MAP);
		createEOperation(conditionalNodeEClass, CONDITIONAL_NODE___RESULT_NO_INCOMING__DIAGNOSTICCHAIN_MAP);
		createEOperation(conditionalNodeEClass, CONDITIONAL_NODE___CLAUSE_NO_PREDECESSOR__DIAGNOSTICCHAIN_MAP);
		createEOperation(conditionalNodeEClass, CONDITIONAL_NODE___EXECUTABLE_NODES__DIAGNOSTICCHAIN_MAP);
		createEOperation(conditionalNodeEClass, CONDITIONAL_NODE___MATCHING_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP);
		createEOperation(conditionalNodeEClass, CONDITIONAL_NODE___ONE_CLAUSE_WITH_EXECUTABLE_NODE__DIAGNOSTICCHAIN_MAP);

		considerIgnoreFragmentEClass = createEClass(CONSIDER_IGNORE_FRAGMENT);
		createEReference(considerIgnoreFragmentEClass, CONSIDER_IGNORE_FRAGMENT__MESSAGE);
		createEOperation(considerIgnoreFragmentEClass, CONSIDER_IGNORE_FRAGMENT___CONSIDER_OR_IGNORE__DIAGNOSTICCHAIN_MAP);
		createEOperation(considerIgnoreFragmentEClass, CONSIDER_IGNORE_FRAGMENT___TYPE__DIAGNOSTICCHAIN_MAP);

		continuationEClass = createEClass(CONTINUATION);
		createEAttribute(continuationEClass, CONTINUATION__SETTING);
		createEOperation(continuationEClass, CONTINUATION___GLOBAL__DIAGNOSTICCHAIN_MAP);
		createEOperation(continuationEClass, CONTINUATION___FIRST_OR_LAST_INTERACTION_FRAGMENT__DIAGNOSTICCHAIN_MAP);
		createEOperation(continuationEClass, CONTINUATION___SAME_NAME__DIAGNOSTICCHAIN_MAP);

		controlFlowEClass = createEClass(CONTROL_FLOW);
		createEOperation(controlFlowEClass, CONTROL_FLOW___OBJECT_NODES__DIAGNOSTICCHAIN_MAP);

		createLinkActionEClass = createEClass(CREATE_LINK_ACTION);
		createEOperation(createLinkActionEClass, CREATE_LINK_ACTION___ASSOCIATION_NOT_ABSTRACT__DIAGNOSTICCHAIN_MAP);

		writeLinkActionEClass = createEClass(WRITE_LINK_ACTION);
		createEOperation(writeLinkActionEClass, WRITE_LINK_ACTION___ALLOW_ACCESS__DIAGNOSTICCHAIN_MAP);

		linkActionEClass = createEClass(LINK_ACTION);
		createEReference(linkActionEClass, LINK_ACTION__END_DATA);
		createEReference(linkActionEClass, LINK_ACTION__INPUT_VALUE);
		createEOperation(linkActionEClass, LINK_ACTION___SAME_PINS__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkActionEClass, LINK_ACTION___SAME_ASSOCIATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkActionEClass, LINK_ACTION___NOT_STATIC__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkActionEClass, LINK_ACTION___ASSOCIATION);

		linkEndDataEClass = createEClass(LINK_END_DATA);
		createEReference(linkEndDataEClass, LINK_END_DATA__END);
		createEReference(linkEndDataEClass, LINK_END_DATA__QUALIFIER);
		createEReference(linkEndDataEClass, LINK_END_DATA__VALUE);
		createEOperation(linkEndDataEClass, LINK_END_DATA___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkEndDataEClass, LINK_END_DATA___END_OBJECT_INPUT_PIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkEndDataEClass, LINK_END_DATA___PROPERTY_IS_ASSOCIATION_END__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkEndDataEClass, LINK_END_DATA___SAME_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkEndDataEClass, LINK_END_DATA___QUALIFIERS__DIAGNOSTICCHAIN_MAP);

		qualifierValueEClass = createEClass(QUALIFIER_VALUE);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__QUALIFIER);
		createEReference(qualifierValueEClass, QUALIFIER_VALUE__VALUE);
		createEOperation(qualifierValueEClass, QUALIFIER_VALUE___TYPE_OF_QUALIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(qualifierValueEClass, QUALIFIER_VALUE___MULTIPLICITY_OF_QUALIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(qualifierValueEClass, QUALIFIER_VALUE___QUALIFIER_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);

		linkEndCreationDataEClass = createEClass(LINK_END_CREATION_DATA);
		createEReference(linkEndCreationDataEClass, LINK_END_CREATION_DATA__INSERT_AT);
		createEAttribute(linkEndCreationDataEClass, LINK_END_CREATION_DATA__IS_REPLACE_ALL);
		createEOperation(linkEndCreationDataEClass, LINK_END_CREATION_DATA___CREATE_LINK_ACTION__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkEndCreationDataEClass, LINK_END_CREATION_DATA___SINGLE_INPUT_PIN__DIAGNOSTICCHAIN_MAP);

		createLinkObjectActionEClass = createEClass(CREATE_LINK_OBJECT_ACTION);
		createEReference(createLinkObjectActionEClass, CREATE_LINK_OBJECT_ACTION__RESULT);
		createEOperation(createLinkObjectActionEClass, CREATE_LINK_OBJECT_ACTION___TYPE_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(createLinkObjectActionEClass, CREATE_LINK_OBJECT_ACTION___ASSOCIATION_CLASS__DIAGNOSTICCHAIN_MAP);
		createEOperation(createLinkObjectActionEClass, CREATE_LINK_OBJECT_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);

		createObjectActionEClass = createEClass(CREATE_OBJECT_ACTION);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__CLASSIFIER);
		createEReference(createObjectActionEClass, CREATE_OBJECT_ACTION__RESULT);
		createEOperation(createObjectActionEClass, CREATE_OBJECT_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(createObjectActionEClass, CREATE_OBJECT_ACTION___SAME_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(createObjectActionEClass, CREATE_OBJECT_ACTION___CLASSIFIER_NOT_ABSTRACT__DIAGNOSTICCHAIN_MAP);
		createEOperation(createObjectActionEClass, CREATE_OBJECT_ACTION___CLASSIFIER_NOT_ASSOCIATION_CLASS__DIAGNOSTICCHAIN_MAP);

		dataStoreNodeEClass = createEClass(DATA_STORE_NODE);

		decisionNodeEClass = createEClass(DECISION_NODE);
		createEReference(decisionNodeEClass, DECISION_NODE__DECISION_INPUT);
		createEReference(decisionNodeEClass, DECISION_NODE__DECISION_INPUT_FLOW);
		createEOperation(decisionNodeEClass, DECISION_NODE___EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(decisionNodeEClass, DECISION_NODE___PARAMETERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(decisionNodeEClass, DECISION_NODE___INCOMING_OBJECT_ONE_INPUT_PARAMETER__DIAGNOSTICCHAIN_MAP);
		createEOperation(decisionNodeEClass, DECISION_NODE___TWO_INPUT_PARAMETERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(decisionNodeEClass, DECISION_NODE___DECISION_INPUT_FLOW_INCOMING__DIAGNOSTICCHAIN_MAP);
		createEOperation(decisionNodeEClass, DECISION_NODE___INCOMING_CONTROL_ONE_INPUT_PARAMETER__DIAGNOSTICCHAIN_MAP);
		createEOperation(decisionNodeEClass, DECISION_NODE___INCOMING_OUTGOING_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(decisionNodeEClass, DECISION_NODE___ZERO_INPUT_PARAMETERS__DIAGNOSTICCHAIN_MAP);

		objectFlowEClass = createEClass(OBJECT_FLOW);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTICAST);
		createEAttribute(objectFlowEClass, OBJECT_FLOW__IS_MULTIRECEIVE);
		createEReference(objectFlowEClass, OBJECT_FLOW__SELECTION);
		createEReference(objectFlowEClass, OBJECT_FLOW__TRANSFORMATION);
		createEOperation(objectFlowEClass, OBJECT_FLOW___INPUT_AND_OUTPUT_PARAMETER__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectFlowEClass, OBJECT_FLOW___TARGET__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectFlowEClass, OBJECT_FLOW___COMPATIBLE_TYPES__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectFlowEClass, OBJECT_FLOW___TRANSFORMATION_BEHAVIOUR__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectFlowEClass, OBJECT_FLOW___IS_MULTICAST_OR_IS_MULTIRECEIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectFlowEClass, OBJECT_FLOW___NO_ACTIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectFlowEClass, OBJECT_FLOW___SELECTION_BEHAVIOUR__DIAGNOSTICCHAIN_MAP);
		createEOperation(objectFlowEClass, OBJECT_FLOW___SAME_UPPER_BOUNDS__DIAGNOSTICCHAIN_MAP);

		destroyLinkActionEClass = createEClass(DESTROY_LINK_ACTION);

		linkEndDestructionDataEClass = createEClass(LINK_END_DESTRUCTION_DATA);
		createEReference(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA__DESTROY_AT);
		createEAttribute(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA__IS_DESTROY_DUPLICATES);
		createEOperation(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA___UNLIMITED_NATURAL_AND_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(linkEndDestructionDataEClass, LINK_END_DESTRUCTION_DATA___DESTROY_LINK_ACTION__DIAGNOSTICCHAIN_MAP);

		destroyObjectActionEClass = createEClass(DESTROY_OBJECT_ACTION);
		createEAttribute(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__IS_DESTROY_LINKS);
		createEAttribute(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__IS_DESTROY_OWNED_OBJECTS);
		createEReference(destroyObjectActionEClass, DESTROY_OBJECT_ACTION__TARGET);
		createEOperation(destroyObjectActionEClass, DESTROY_OBJECT_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(destroyObjectActionEClass, DESTROY_OBJECT_ACTION___NO_TYPE__DIAGNOSTICCHAIN_MAP);

		destructionOccurenceSpecificationEClass = createEClass(DESTRUCTION_OCCURENCE_SPECIFICATION);
		createEOperation(destructionOccurenceSpecificationEClass, DESTRUCTION_OCCURENCE_SPECIFICATION___NO_OCCURRENCE_SPECIFICATIONS_BELOW__DIAGNOSTICCHAIN_MAP);

		messageOccurrenceSpecificationEClass = createEClass(MESSAGE_OCCURRENCE_SPECIFICATION);

		deviceEClass = createEClass(DEVICE);

		nodeEClass = createEClass(NODE);
		createEReference(nodeEClass, NODE__NESTED_NODE);
		createEOperation(nodeEClass, NODE___INTERNAL_STRUCTURE__DIAGNOSTICCHAIN_MAP);

		durationEClass = createEClass(DURATION);
		createEReference(durationEClass, DURATION__EXPR);
		createEReference(durationEClass, DURATION__OBSERVATION);

		observationEClass = createEClass(OBSERVATION);

		durationConstraintEClass = createEClass(DURATION_CONSTRAINT);
		createEAttribute(durationConstraintEClass, DURATION_CONSTRAINT__FIRST_EVENT);
		createEOperation(durationConstraintEClass, DURATION_CONSTRAINT___FIRST_EVENT_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);

		intervalConstraintEClass = createEClass(INTERVAL_CONSTRAINT);

		intervalEClass = createEClass(INTERVAL);
		createEReference(intervalEClass, INTERVAL__MAX);
		createEReference(intervalEClass, INTERVAL__MIN);

		durationIntervalEClass = createEClass(DURATION_INTERVAL);

		durationObservationEClass = createEClass(DURATION_OBSERVATION);
		createEReference(durationObservationEClass, DURATION_OBSERVATION__EVENT);
		createEAttribute(durationObservationEClass, DURATION_OBSERVATION__FIRST_EVENT);
		createEOperation(durationObservationEClass, DURATION_OBSERVATION___FIRST_EVENT_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);

		enumerationEClass = createEClass(ENUMERATION);
		createEReference(enumerationEClass, ENUMERATION__OWNED_LITERAL);

		enumerationLiteralEClass = createEClass(ENUMERATION_LITERAL);
		createEReference(enumerationLiteralEClass, ENUMERATION_LITERAL__ENUMERATION);
		createEOperation(enumerationLiteralEClass, ENUMERATION_LITERAL___CLASSIFIER_EQUALS_OWNING_ENUMERATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(enumerationLiteralEClass, ENUMERATION_LITERAL___CLASSIFIER);

		instanceSpecificationEClass = createEClass(INSTANCE_SPECIFICATION);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__CLASSIFIER);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__SLOT);
		createEReference(instanceSpecificationEClass, INSTANCE_SPECIFICATION__SPECIFICATION);
		createEOperation(instanceSpecificationEClass, INSTANCE_SPECIFICATION___DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP);
		createEOperation(instanceSpecificationEClass, INSTANCE_SPECIFICATION___STRUCTURAL_FEATURE__DIAGNOSTICCHAIN_MAP);
		createEOperation(instanceSpecificationEClass, INSTANCE_SPECIFICATION___DEFINING_FEATURE__DIAGNOSTICCHAIN_MAP);
		createEOperation(instanceSpecificationEClass, INSTANCE_SPECIFICATION___DEPLOYMENT_ARTIFACT__DIAGNOSTICCHAIN_MAP);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__DEFINING_FEATURE);
		createEReference(slotEClass, SLOT__VALUE);
		createEReference(slotEClass, SLOT__OWNING_INSTANCE);

		executionEnvironmentEClass = createEClass(EXECUTION_ENVIRONMENT);

		executionOccurrenceSpecificationEClass = createEClass(EXECUTION_OCCURRENCE_SPECIFICATION);
		createEReference(executionOccurrenceSpecificationEClass, EXECUTION_OCCURRENCE_SPECIFICATION__EXECUTION);

		expansionNodeEClass = createEClass(EXPANSION_NODE);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_INPUT);
		createEReference(expansionNodeEClass, EXPANSION_NODE__REGION_AS_OUTPUT);
		createEOperation(expansionNodeEClass, EXPANSION_NODE___REGION_AS_INPUT_OR_OUTPUT__DIAGNOSTICCHAIN_MAP);

		expansionRegionEClass = createEClass(EXPANSION_REGION);
		createEAttribute(expansionRegionEClass, EXPANSION_REGION__MODE);
		createEReference(expansionRegionEClass, EXPANSION_REGION__OUTPUT_ELEMENT);
		createEReference(expansionRegionEClass, EXPANSION_REGION__INPUT_ELEMENT);
		createEOperation(expansionRegionEClass, EXPANSION_REGION___EXPANSION_NODES__DIAGNOSTICCHAIN_MAP);

		finalStateEClass = createEClass(FINAL_STATE);
		createEOperation(finalStateEClass, FINAL_STATE___NO_REGIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(finalStateEClass, FINAL_STATE___NO_OUTGOING_TRANSITIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(finalStateEClass, FINAL_STATE___NO_EXIT_BEHAVIOR__DIAGNOSTICCHAIN_MAP);
		createEOperation(finalStateEClass, FINAL_STATE___CANNOT_REFERENCE_SUBMACHINE__DIAGNOSTICCHAIN_MAP);
		createEOperation(finalStateEClass, FINAL_STATE___NO_ENTRY_BEHAVIOR__DIAGNOSTICCHAIN_MAP);
		createEOperation(finalStateEClass, FINAL_STATE___NO_STATE_BEHAVIOR__DIAGNOSTICCHAIN_MAP);

		flowFinalNodeEClass = createEClass(FLOW_FINAL_NODE);

		forkNodeEClass = createEClass(FORK_NODE);
		createEOperation(forkNodeEClass, FORK_NODE___ONE_INCOMING_EDGE__DIAGNOSTICCHAIN_MAP);
		createEOperation(forkNodeEClass, FORK_NODE___EDGES__DIAGNOSTICCHAIN_MAP);

		functionBehaviorEClass = createEClass(FUNCTION_BEHAVIOR);
		createEOperation(functionBehaviorEClass, FUNCTION_BEHAVIOR___ONE_OUTPUT_PARAMETER__DIAGNOSTICCHAIN_MAP);
		createEOperation(functionBehaviorEClass, FUNCTION_BEHAVIOR___TYPES_OF_PARAMETERS__DIAGNOSTICCHAIN_MAP);

		opaqueBehaviorEClass = createEClass(OPAQUE_BEHAVIOR);
		createEAttribute(opaqueBehaviorEClass, OPAQUE_BEHAVIOR__BODY);
		createEAttribute(opaqueBehaviorEClass, OPAQUE_BEHAVIOR__LANGUAGE);

		informationFlowEClass = createEClass(INFORMATION_FLOW);
		createEReference(informationFlowEClass, INFORMATION_FLOW__CONVEYED);
		createEReference(informationFlowEClass, INFORMATION_FLOW__INFORMATION_SOURCE);
		createEReference(informationFlowEClass, INFORMATION_FLOW__INFORMATION_TARGET);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZATION);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZING_ACTIVITY_EDGE);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZING_CONNECTOR);
		createEReference(informationFlowEClass, INFORMATION_FLOW__REALIZING_MESSAGE);
		createEOperation(informationFlowEClass, INFORMATION_FLOW___CONVEY_CLASSIFIERS__DIAGNOSTICCHAIN_MAP);
		createEOperation(informationFlowEClass, INFORMATION_FLOW___MUST_CONFORM__DIAGNOSTICCHAIN_MAP);
		createEOperation(informationFlowEClass, INFORMATION_FLOW___SOURCES_AND_TARGETS_KIND__DIAGNOSTICCHAIN_MAP);

		informationItemEClass = createEClass(INFORMATION_ITEM);
		createEReference(informationItemEClass, INFORMATION_ITEM__REPRESENTED);
		createEOperation(informationItemEClass, INFORMATION_ITEM___HAS_NO__DIAGNOSTICCHAIN_MAP);
		createEOperation(informationItemEClass, INFORMATION_ITEM___SOURCES_AND_TARGETS__DIAGNOSTICCHAIN_MAP);
		createEOperation(informationItemEClass, INFORMATION_ITEM___NOT_INSTANTIABLE__DIAGNOSTICCHAIN_MAP);

		initialNodeEClass = createEClass(INITIAL_NODE);
		createEOperation(initialNodeEClass, INITIAL_NODE___CONTROL_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(initialNodeEClass, INITIAL_NODE___NO_INCOMING_EDGES__DIAGNOSTICCHAIN_MAP);

		instanceValueEClass = createEClass(INSTANCE_VALUE);
		createEReference(instanceValueEClass, INSTANCE_VALUE__INSTANCE);

		joinNodeEClass = createEClass(JOIN_NODE);
		createEAttribute(joinNodeEClass, JOIN_NODE__IS_COMBINE_DUPLICATE);
		createEReference(joinNodeEClass, JOIN_NODE__JOIN_SPEC);
		createEOperation(joinNodeEClass, JOIN_NODE___ONE_OUTGOING_EDGE__DIAGNOSTICCHAIN_MAP);
		createEOperation(joinNodeEClass, JOIN_NODE___INCOMING_OBJECT_FLOW__DIAGNOSTICCHAIN_MAP);

		literalBooleanEClass = createEClass(LITERAL_BOOLEAN);
		createEAttribute(literalBooleanEClass, LITERAL_BOOLEAN__VALUE);

		literalSpecificationEClass = createEClass(LITERAL_SPECIFICATION);

		literalIntegerEClass = createEClass(LITERAL_INTEGER);
		createEAttribute(literalIntegerEClass, LITERAL_INTEGER__VALUE);

		literalNullEClass = createEClass(LITERAL_NULL);

		literalRealEClass = createEClass(LITERAL_REAL);
		createEAttribute(literalRealEClass, LITERAL_REAL__VALUE);

		literalStringEClass = createEClass(LITERAL_STRING);
		createEAttribute(literalStringEClass, LITERAL_STRING__VALUE);

		literalUnlimitedNaturalEClass = createEClass(LITERAL_UNLIMITED_NATURAL);
		createEAttribute(literalUnlimitedNaturalEClass, LITERAL_UNLIMITED_NATURAL__VALUE);

		loopNodeEClass = createEClass(LOOP_NODE);
		createEReference(loopNodeEClass, LOOP_NODE__BODY_OUTPUT);
		createEReference(loopNodeEClass, LOOP_NODE__BODY_PART);
		createEReference(loopNodeEClass, LOOP_NODE__DECIDER);
		createEAttribute(loopNodeEClass, LOOP_NODE__IS_TESTED_FIRST);
		createEReference(loopNodeEClass, LOOP_NODE__LOOP_VARIABLE);
		createEReference(loopNodeEClass, LOOP_NODE__LOOP_VARIABLE_INPUT);
		createEReference(loopNodeEClass, LOOP_NODE__RESULT);
		createEReference(loopNodeEClass, LOOP_NODE__SETUP_PART);
		createEReference(loopNodeEClass, LOOP_NODE__TEST);
		createEOperation(loopNodeEClass, LOOP_NODE___INPUT_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(loopNodeEClass, LOOP_NODE___RESULT_NO_INCOMING__DIAGNOSTICCHAIN_MAP);
		createEOperation(loopNodeEClass, LOOP_NODE___EXECUTABLE_NODES__DIAGNOSTICCHAIN_MAP);
		createEOperation(loopNodeEClass, LOOP_NODE___BODY_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP);

		mergeNodeEClass = createEClass(MERGE_NODE);
		createEOperation(mergeNodeEClass, MERGE_NODE___EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(mergeNodeEClass, MERGE_NODE___ONE_OUTGOING_EDGE__DIAGNOSTICCHAIN_MAP);

		modelEClass = createEClass(MODEL);
		createEAttribute(modelEClass, MODEL__VIEWPOINT);

		opaqueActionEClass = createEClass(OPAQUE_ACTION);
		createEAttribute(opaqueActionEClass, OPAQUE_ACTION__BODY);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__INPUT_VALUE);
		createEAttribute(opaqueActionEClass, OPAQUE_ACTION__LANGUAGE);
		createEReference(opaqueActionEClass, OPAQUE_ACTION__OUTPUT_VALUE);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		protocolTransitionEClass = createEClass(PROTOCOL_TRANSITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__POST_CONDITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__PRE_CONDITION);
		createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__REFERRED);
		createEOperation(protocolTransitionEClass, PROTOCOL_TRANSITION___REFERS_TO_OPERATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(protocolTransitionEClass, PROTOCOL_TRANSITION___ASSOCIATED_ACTIONS__DIAGNOSTICCHAIN_MAP);
		createEOperation(protocolTransitionEClass, PROTOCOL_TRANSITION___BELONGS_TO_PSM__DIAGNOSTICCHAIN_MAP);
		createEOperation(protocolTransitionEClass, PROTOCOL_TRANSITION___REFERRED);

		raiseExceptionActionEClass = createEClass(RAISE_EXCEPTION_ACTION);
		createEReference(raiseExceptionActionEClass, RAISE_EXCEPTION_ACTION__EXCEPTION);

		readExtentActionEClass = createEClass(READ_EXTENT_ACTION);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__CLASSIFIER);
		createEReference(readExtentActionEClass, READ_EXTENT_ACTION__RESULT);
		createEOperation(readExtentActionEClass, READ_EXTENT_ACTION___MULTIPLICITY_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readExtentActionEClass, READ_EXTENT_ACTION___TYPE_IS_CLASSIFIER__DIAGNOSTICCHAIN_MAP);

		readIsClassifiedObjectActionEClass = createEClass(READ_IS_CLASSIFIED_OBJECT_ACTION);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__CLASSIFIER);
		createEAttribute(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__IS_DIRECT);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__OBJECT);
		createEReference(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION__RESULT);
		createEOperation(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION___BOOLEAN_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION___MULTIPLICITY_OF_INPUT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION___NO_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(readIsClassifiedObjectActionEClass, READ_IS_CLASSIFIED_OBJECT_ACTION___MULTIPLICITY_OF_OUTPUT__DIAGNOSTICCHAIN_MAP);

		readLinkActionEClass = createEClass(READ_LINK_ACTION);
		createEReference(readLinkActionEClass, READ_LINK_ACTION__RESULT);
		createEOperation(readLinkActionEClass, READ_LINK_ACTION___COMPATIBLE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkActionEClass, READ_LINK_ACTION___NAVIGABLE_OPEN_END__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkActionEClass, READ_LINK_ACTION___TYPE_AND_ORDERING__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkActionEClass, READ_LINK_ACTION___ONE_OPEN_END__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkActionEClass, READ_LINK_ACTION___VISIBILITY__DIAGNOSTICCHAIN_MAP);

		readLinkObjectEndActionEClass = createEClass(READ_LINK_OBJECT_END_ACTION);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__END);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__OBJECT);
		createEReference(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION__RESULT);
		createEOperation(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION___ASSOCIATION_OF_ASSOCIATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION___TYPE_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION___PROPERTY__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION___ENDS_OF_ASSOCIATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION___MULTIPLICITY_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION___MULTIPLICITY_OF_OBJECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndActionEClass, READ_LINK_OBJECT_END_ACTION___TYPE_OF_OBJECT__DIAGNOSTICCHAIN_MAP);

		readLinkObjectEndQualifierActionEClass = createEClass(READ_LINK_OBJECT_END_QUALIFIER_ACTION);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__OBJECT);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__QUALIFIER);
		createEReference(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION__RESULT);
		createEOperation(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION___MULTIPLICITY_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION___TYPE_OF_OBJECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION___SAME_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION___QUALIFIER_ATTRIBUTE__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION___MULTIPLICITY_OF_QUALIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION___ENDS_OF_ASSOCIATION__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION___MULTIPLICITY_OF_OBJECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(readLinkObjectEndQualifierActionEClass, READ_LINK_OBJECT_END_QUALIFIER_ACTION___ASSOCIATION_OF_ASSOCIATION__DIAGNOSTICCHAIN_MAP);

		readSelfActionEClass = createEClass(READ_SELF_ACTION);
		createEReference(readSelfActionEClass, READ_SELF_ACTION__RESULT);
		createEOperation(readSelfActionEClass, READ_SELF_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(readSelfActionEClass, READ_SELF_ACTION___NOT_STATIC__DIAGNOSTICCHAIN_MAP);
		createEOperation(readSelfActionEClass, READ_SELF_ACTION___TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(readSelfActionEClass, READ_SELF_ACTION___CONTAINED__DIAGNOSTICCHAIN_MAP);

		readStructuralFeatureActionEClass = createEClass(READ_STRUCTURAL_FEATURE_ACTION);
		createEReference(readStructuralFeatureActionEClass, READ_STRUCTURAL_FEATURE_ACTION__RESULT);
		createEOperation(readStructuralFeatureActionEClass, READ_STRUCTURAL_FEATURE_ACTION___TYPE_AND_ORDERING__DIAGNOSTICCHAIN_MAP);

		readVariableActionEClass = createEClass(READ_VARIABLE_ACTION);
		createEReference(readVariableActionEClass, READ_VARIABLE_ACTION__RESULT);
		createEOperation(readVariableActionEClass, READ_VARIABLE_ACTION___COMPATIBLE_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(readVariableActionEClass, READ_VARIABLE_ACTION___TYPE_AND_ORDERING__DIAGNOSTICCHAIN_MAP);

		reclassifyObjectActionEClass = createEClass(RECLASSIFY_OBJECT_ACTION);
		createEAttribute(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__IS_REPLACE_ALL);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__NEW_CLASSIFIER);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OBJECT);
		createEReference(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION__OLD_CLASSIFIER);
		createEOperation(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION___INPUT_PIN__DIAGNOSTICCHAIN_MAP);
		createEOperation(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(reclassifyObjectActionEClass, RECLASSIFY_OBJECT_ACTION___CLASSIFIER_NOT_ABSTRACT__DIAGNOSTICCHAIN_MAP);

		reduceActionEClass = createEClass(REDUCE_ACTION);
		createEReference(reduceActionEClass, REDUCE_ACTION__COLLECTION);
		createEAttribute(reduceActionEClass, REDUCE_ACTION__IS_ORDERED);
		createEReference(reduceActionEClass, REDUCE_ACTION__REDUCER);
		createEReference(reduceActionEClass, REDUCE_ACTION__RESULT);
		createEOperation(reduceActionEClass, REDUCE_ACTION___OUTPUT_TYPES_ARE_COMPATIBLE__DIAGNOSTICCHAIN_MAP);
		createEOperation(reduceActionEClass, REDUCE_ACTION___REDUCER_INPUTS_OUTPUT__DIAGNOSTICCHAIN_MAP);
		createEOperation(reduceActionEClass, REDUCE_ACTION___INPUT_TYPE_IS_COLLECTION__DIAGNOSTICCHAIN_MAP);

		removeStructuralFeatureValueActionEClass = createEClass(REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION);
		createEAttribute(removeStructuralFeatureValueActionEClass, REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__IS_REMOVE_DUPLICATES);
		createEReference(removeStructuralFeatureValueActionEClass, REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION__REMOVE_AT);
		createEOperation(removeStructuralFeatureValueActionEClass, REMOVE_STRUCTURAL_FEATURE_VALUE_ACTION___NON_UNIQUE_REMOVAL__DIAGNOSTICCHAIN_MAP);

		removeVariableValueActionEClass = createEClass(REMOVE_VARIABLE_VALUE_ACTION);
		createEAttribute(removeVariableValueActionEClass, REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES);
		createEReference(removeVariableValueActionEClass, REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT);
		createEOperation(removeVariableValueActionEClass, REMOVE_VARIABLE_VALUE_ACTION___UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP);

		replyActionEClass = createEClass(REPLY_ACTION);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_TO_CALL);
		createEReference(replyActionEClass, REPLY_ACTION__REPLY_VALUE);
		createEReference(replyActionEClass, REPLY_ACTION__RETURN_INFORMATION);
		createEOperation(replyActionEClass, REPLY_ACTION___PINS_MATCH_PARAMETER__DIAGNOSTICCHAIN_MAP);
		createEOperation(replyActionEClass, REPLY_ACTION___EVENT_ON_REPLY_TO_CALL_TRIGGER__DIAGNOSTICCHAIN_MAP);

		sendObjectActionEClass = createEClass(SEND_OBJECT_ACTION);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__REQUEST);
		createEReference(sendObjectActionEClass, SEND_OBJECT_ACTION__TARGET);

		sendSignalActionEClass = createEClass(SEND_SIGNAL_ACTION);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__SIGNAL);
		createEReference(sendSignalActionEClass, SEND_SIGNAL_ACTION__TARGET);
		createEOperation(sendSignalActionEClass, SEND_SIGNAL_ACTION___NUMBER_ORDER__DIAGNOSTICCHAIN_MAP);
		createEOperation(sendSignalActionEClass, SEND_SIGNAL_ACTION___TYPE_ORDERING_MULTIPLICITY__DIAGNOSTICCHAIN_MAP);

		sequenceNodeEClass = createEClass(SEQUENCE_NODE);
		createEReference(sequenceNodeEClass, SEQUENCE_NODE__EXECUTABLE_NODE);

		signalEventEClass = createEClass(SIGNAL_EVENT);
		createEReference(signalEventEClass, SIGNAL_EVENT__SIGNAL);

		startClassifierBehaviorActionEClass = createEClass(START_CLASSIFIER_BEHAVIOR_ACTION);
		createEReference(startClassifierBehaviorActionEClass, START_CLASSIFIER_BEHAVIOR_ACTION__OBJECT);
		createEOperation(startClassifierBehaviorActionEClass, START_CLASSIFIER_BEHAVIOR_ACTION___TYPE_HAS_CLASSIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(startClassifierBehaviorActionEClass, START_CLASSIFIER_BEHAVIOR_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);

		startObjectBehaviorActionEClass = createEClass(START_OBJECT_BEHAVIOR_ACTION);
		createEReference(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION__OBJECT);
		createEOperation(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION___NUMBER_ORDER_RESULTS__DIAGNOSTICCHAIN_MAP);
		createEOperation(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION___TYPE_ORDERING_MULTIPLICITY_MATCH__DIAGNOSTICCHAIN_MAP);
		createEOperation(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION___TYPE_OF_OBJECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION___MULTIPLICITY_OF_OBJECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(startObjectBehaviorActionEClass, START_OBJECT_BEHAVIOR_ACTION___NUMBER_ORDER_ARGUMENTS__DIAGNOSTICCHAIN_MAP);

		stateInvariantEClass = createEClass(STATE_INVARIANT);
		createEReference(stateInvariantEClass, STATE_INVARIANT__INVARIANT);

		testIdentityActionEClass = createEClass(TEST_IDENTITY_ACTION);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__FIRST);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__RESULT);
		createEReference(testIdentityActionEClass, TEST_IDENTITY_ACTION__SECOND);
		createEOperation(testIdentityActionEClass, TEST_IDENTITY_ACTION___NO_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(testIdentityActionEClass, TEST_IDENTITY_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(testIdentityActionEClass, TEST_IDENTITY_ACTION___RESULT_IS_BOOLEAN__DIAGNOSTICCHAIN_MAP);

		timeConstraintEClass = createEClass(TIME_CONSTRAINT);
		createEAttribute(timeConstraintEClass, TIME_CONSTRAINT__FIRST_EVENT);

		timeIntervalEClass = createEClass(TIME_INTERVAL);

		timeExpressionEClass = createEClass(TIME_EXPRESSION);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__EXPR);
		createEReference(timeExpressionEClass, TIME_EXPRESSION__OBSERVATION);

		timeEventEClass = createEClass(TIME_EVENT);
		createEAttribute(timeEventEClass, TIME_EVENT__IS_RELATIVE);
		createEReference(timeEventEClass, TIME_EVENT__WHEN);
		createEOperation(timeEventEClass, TIME_EVENT___WHEN_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP);
		createEOperation(timeEventEClass, TIME_EVENT___STARTING_TIME__DIAGNOSTICCHAIN_MAP);

		timeObservationEClass = createEClass(TIME_OBSERVATION);
		createEReference(timeObservationEClass, TIME_OBSERVATION__EVENT);
		createEAttribute(timeObservationEClass, TIME_OBSERVATION__FIRST_EVENT);

		unmarshallActionEClass = createEClass(UNMARSHALL_ACTION);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__OBJECT);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__RESULT);
		createEReference(unmarshallActionEClass, UNMARSHALL_ACTION__UNMARSHALL_TYPE);
		createEOperation(unmarshallActionEClass, UNMARSHALL_ACTION___MULTIPLICITY_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(unmarshallActionEClass, UNMARSHALL_ACTION___MULTIPLICITY_OF_OBJECT__DIAGNOSTICCHAIN_MAP);
		createEOperation(unmarshallActionEClass, UNMARSHALL_ACTION___STRUCTURAL_FEATURE__DIAGNOSTICCHAIN_MAP);
		createEOperation(unmarshallActionEClass, UNMARSHALL_ACTION___NUMBER_OF_RESULT__DIAGNOSTICCHAIN_MAP);
		createEOperation(unmarshallActionEClass, UNMARSHALL_ACTION___UNMARSHALL_TYPE_IS_CLASSIFIER__DIAGNOSTICCHAIN_MAP);
		createEOperation(unmarshallActionEClass, UNMARSHALL_ACTION___SAME_TYPE__DIAGNOSTICCHAIN_MAP);
		createEOperation(unmarshallActionEClass, UNMARSHALL_ACTION___TYPE_AND_ORDERING__DIAGNOSTICCHAIN_MAP);

		usageEClass = createEClass(USAGE);

		valuePinEClass = createEClass(VALUE_PIN);
		createEReference(valuePinEClass, VALUE_PIN__VALUE);
		createEOperation(valuePinEClass, VALUE_PIN___NO_INCOMING_EDGES__DIAGNOSTICCHAIN_MAP);
		createEOperation(valuePinEClass, VALUE_PIN___COMPATIBLE_TYPE__DIAGNOSTICCHAIN_MAP);

		valueSpecificationActionEClass = createEClass(VALUE_SPECIFICATION_ACTION);
		createEReference(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION__RESULT);
		createEReference(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION__VALUE);
		createEOperation(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP);
		createEOperation(valueSpecificationActionEClass, VALUE_SPECIFICATION_ACTION___COMPATIBLE_TYPE__DIAGNOSTICCHAIN_MAP);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
		callConcurrencyKindEEnum = createEEnum(CALL_CONCURRENCY_KIND);
		parameterDirectionKindEEnum = createEEnum(PARAMETER_DIRECTION_KIND);
		parameterEffectKindEEnum = createEEnum(PARAMETER_EFFECT_KIND);
		transitionKindEEnum = createEEnum(TRANSITION_KIND);
		pseudostateKindEEnum = createEEnum(PSEUDOSTATE_KIND);
		aggregationKindEEnum = createEEnum(AGGREGATION_KIND);
		connectorKindEEnum = createEEnum(CONNECTOR_KIND);
		messageKindEEnum = createEEnum(MESSAGE_KIND);
		messageSortEEnum = createEEnum(MESSAGE_SORT);
		interactionOperatorKindEEnum = createEEnum(INTERACTION_OPERATOR_KIND);
		expansionKindEEnum = createEEnum(EXPANSION_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	private void addSupertypesPackageContents() {
		// Add supertypes to classes
		abstractionEClass.getESuperTypes().add(this.getDependency());
		dependencyEClass.getESuperTypes().add(this.getPackageableElement());
		dependencyEClass.getESuperTypes().add(this.getDirectedRelationship());
		directedRelationshipEClass.getESuperTypes().add(this.getRelationship());
		relationshipEClass.getESuperTypes().add(this.getElement());
		commentEClass.getESuperTypes().add(this.getElement());
		packageableElementEClass.getESuperTypes().add(this.getNamedElement());
		packageableElementEClass.getESuperTypes().add(this.getParameterableElement());
		parameterableElementEClass.getESuperTypes().add(this.getElement());
		templateParameterEClass.getESuperTypes().add(this.getElement());
		templateSignatureEClass.getESuperTypes().add(this.getElement());
		templateableElementEClass.getESuperTypes().add(this.getElement());
		templateBindingEClass.getESuperTypes().add(this.getDirectedRelationship());
		templateParameterSubstitutionEClass.getESuperTypes().add(this.getElement());
		namedElementEClass.getESuperTypes().add(this.getElement());
		stringExpressionEClass.getESuperTypes().add(this.getExpression());
		stringExpressionEClass.getESuperTypes().add(this.getTemplateableElement());
		expressionEClass.getESuperTypes().add(this.getValueSpecification());
		valueSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
		valueSpecificationEClass.getESuperTypes().add(this.getTypedElement());
		typedElementEClass.getESuperTypes().add(this.getNamedElement());
		typeEClass.getESuperTypes().add(this.getPackageableElement());
		packageEClass.getESuperTypes().add(this.getNamespace());
		packageEClass.getESuperTypes().add(this.getPackageableElement());
		packageEClass.getESuperTypes().add(this.getTemplateableElement());
		namespaceEClass.getESuperTypes().add(this.getNamedElement());
		elementImportEClass.getESuperTypes().add(this.getDirectedRelationship());
		constraintEClass.getESuperTypes().add(this.getPackageableElement());
		packageImportEClass.getESuperTypes().add(this.getDirectedRelationship());
		stereotypeEClass.getESuperTypes().add(this.getClass_());
		classEClass.getESuperTypes().add(this.getEncapsulatedClassifier());
		classEClass.getESuperTypes().add(this.getBehavioredClassifier());
		behavioredClassifierEClass.getESuperTypes().add(this.getClassifier());
		classifierEClass.getESuperTypes().add(this.getNamespace());
		classifierEClass.getESuperTypes().add(this.getRedefinableElement());
		classifierEClass.getESuperTypes().add(this.getType());
		classifierEClass.getESuperTypes().add(this.getTemplateableElement());
		redefinableElementEClass.getESuperTypes().add(this.getNamedElement());
		propertyEClass.getESuperTypes().add(this.getStructuralFeature());
		propertyEClass.getESuperTypes().add(this.getConnectableElement());
		propertyEClass.getESuperTypes().add(this.getDeploymentTarget());
		structuralFeatureEClass.getESuperTypes().add(this.getFeature());
		structuralFeatureEClass.getESuperTypes().add(this.getTypedElement());
		structuralFeatureEClass.getESuperTypes().add(this.getMultiplicityElement());
		multiplicityElementEClass.getESuperTypes().add(this.getElement());
		featureEClass.getESuperTypes().add(this.getRedefinableElement());
		deploymentTargetEClass.getESuperTypes().add(this.getNamedElement());
		deploymentEClass.getESuperTypes().add(this.getDependency());
		deploymentSpecificationEClass.getESuperTypes().add(this.getArtifact());
		artifactEClass.getESuperTypes().add(this.getClassifier());
		artifactEClass.getESuperTypes().add(this.getDeployedArtifact());
		deployedArtifactEClass.getESuperTypes().add(this.getNamedElement());
		manifestationEClass.getESuperTypes().add(this.getAbstraction());
		operationEClass.getESuperTypes().add(this.getBehavioralFeature());
		operationEClass.getESuperTypes().add(this.getParameterableElement());
		operationEClass.getESuperTypes().add(this.getTemplateableElement());
		behavioralFeatureEClass.getESuperTypes().add(this.getNamespace());
		behavioralFeatureEClass.getESuperTypes().add(this.getFeature());
		behaviorEClass.getESuperTypes().add(this.getClass_());
		parameterEClass.getESuperTypes().add(this.getConnectableElement());
		parameterEClass.getESuperTypes().add(this.getMultiplicityElement());
		connectableElementEClass.getESuperTypes().add(this.getTypedElement());
		connectableElementEClass.getESuperTypes().add(this.getParameterableElement());
		connectorEndEClass.getESuperTypes().add(this.getMultiplicityElement());
		connectableElementTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
		parameterSetEClass.getESuperTypes().add(this.getNamedElement());
		dataTypeEClass.getESuperTypes().add(this.getClassifier());
		interfaceEClass.getESuperTypes().add(this.getClassifier());
		receptionEClass.getESuperTypes().add(this.getBehavioralFeature());
		signalEClass.getESuperTypes().add(this.getClassifier());
		protocolStateMachineEClass.getESuperTypes().add(this.getStateMachine());
		stateMachineEClass.getESuperTypes().add(this.getBehavior());
		pseudostateEClass.getESuperTypes().add(this.getVertex());
		vertexEClass.getESuperTypes().add(this.getNamedElement());
		regionEClass.getESuperTypes().add(this.getNamespace());
		regionEClass.getESuperTypes().add(this.getRedefinableElement());
		stateEClass.getESuperTypes().add(this.getNamespace());
		stateEClass.getESuperTypes().add(this.getRedefinableElement());
		stateEClass.getESuperTypes().add(this.getVertex());
		connectionPointReferenceEClass.getESuperTypes().add(this.getVertex());
		triggerEClass.getESuperTypes().add(this.getNamedElement());
		eventEClass.getESuperTypes().add(this.getPackageableElement());
		portEClass.getESuperTypes().add(this.getProperty());
		transitionEClass.getESuperTypes().add(this.getNamespace());
		transitionEClass.getESuperTypes().add(this.getRedefinableElement());
		protocolConformanceEClass.getESuperTypes().add(this.getDirectedRelationship());
		operationTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
		associationEClass.getESuperTypes().add(this.getClassifier());
		associationEClass.getESuperTypes().add(this.getRelationship());
		collaborationUseEClass.getESuperTypes().add(this.getNamedElement());
		collaborationEClass.getESuperTypes().add(this.getStructuredClassifier());
		collaborationEClass.getESuperTypes().add(this.getBehavioredClassifier());
		structuredClassifierEClass.getESuperTypes().add(this.getClassifier());
		connectorEClass.getESuperTypes().add(this.getFeature());
		generalizationEClass.getESuperTypes().add(this.getDirectedRelationship());
		generalizationSetEClass.getESuperTypes().add(this.getPackageableElement());
		redefinableTemplateSignatureEClass.getESuperTypes().add(this.getRedefinableElement());
		redefinableTemplateSignatureEClass.getESuperTypes().add(this.getTemplateSignature());
		useCaseEClass.getESuperTypes().add(this.getBehavioredClassifier());
		extendEClass.getESuperTypes().add(this.getNamedElement());
		extendEClass.getESuperTypes().add(this.getDirectedRelationship());
		extensionPointEClass.getESuperTypes().add(this.getRedefinableElement());
		includeEClass.getESuperTypes().add(this.getNamedElement());
		includeEClass.getESuperTypes().add(this.getDirectedRelationship());
		substitutionEClass.getESuperTypes().add(this.getRealization());
		realizationEClass.getESuperTypes().add(this.getAbstraction());
		classifierTemplateParameterEClass.getESuperTypes().add(this.getTemplateParameter());
		interfaceRealizationEClass.getESuperTypes().add(this.getRealization());
		encapsulatedClassifierEClass.getESuperTypes().add(this.getStructuredClassifier());
		extensionEClass.getESuperTypes().add(this.getAssociation());
		extensionEndEClass.getESuperTypes().add(this.getProperty());
		imageEClass.getESuperTypes().add(this.getElement());
		profileEClass.getESuperTypes().add(this.getPackage());
		packageMergeEClass.getESuperTypes().add(this.getDirectedRelationship());
		profileApplicationEClass.getESuperTypes().add(this.getDirectedRelationship());
		opaqueExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		acceptCallActionEClass.getESuperTypes().add(this.getAcceptEventAction());
		acceptEventActionEClass.getESuperTypes().add(this.getAction());
		actionEClass.getESuperTypes().add(this.getExecutableNode());
		executableNodeEClass.getESuperTypes().add(this.getActivityNode());
		activityNodeEClass.getESuperTypes().add(this.getRedefinableElement());
		activityEClass.getESuperTypes().add(this.getBehavior());
		activityEdgeEClass.getESuperTypes().add(this.getRedefinableElement());
		activityGroupEClass.getESuperTypes().add(this.getNamedElement());
		activityPartitionEClass.getESuperTypes().add(this.getActivityGroup());
		structuredActivityNodeEClass.getESuperTypes().add(this.getAction());
		structuredActivityNodeEClass.getESuperTypes().add(this.getNamespace());
		structuredActivityNodeEClass.getESuperTypes().add(this.getActivityGroup());
		inputPinEClass.getESuperTypes().add(this.getPin());
		pinEClass.getESuperTypes().add(this.getMultiplicityElement());
		outputPinEClass.getESuperTypes().add(this.getPin());
		variableEClass.getESuperTypes().add(this.getConnectableElement());
		variableEClass.getESuperTypes().add(this.getMultiplicityElement());
		interruptibleActivityRegionEClass.getESuperTypes().add(this.getActivityGroup());
		exceptionHandlerEClass.getESuperTypes().add(this.getElement());
		actionExecutionSpecificationEClass.getESuperTypes().add(this.getExecutionSpecification());
		executionSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionFragmentEClass.getESuperTypes().add(this.getNamedElement());
		lifelineEClass.getESuperTypes().add(this.getNamedElement());
		partDecompositionEClass.getESuperTypes().add(this.getInteractionUse());
		interactionUseEClass.getESuperTypes().add(this.getInteractionFragment());
		gateEClass.getESuperTypes().add(this.getMessageEnd());
		messageEndEClass.getESuperTypes().add(this.getNamedElement());
		messageEClass.getESuperTypes().add(this.getNamedElement());
		interactionEClass.getESuperTypes().add(this.getBehavior());
		interactionEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionOperandEClass.getESuperTypes().add(this.getNamespace());
		interactionOperandEClass.getESuperTypes().add(this.getInteractionFragment());
		interactionConstraintEClass.getESuperTypes().add(this.getConstraint());
		generalOrderingEClass.getESuperTypes().add(this.getNamedElement());
		occurrenceSpecificationEClass.getESuperTypes().add(this.getInteractionFragment());
		actionInputPinEClass.getESuperTypes().add(this.getInputPin());
		activityFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		finalNodeEClass.getESuperTypes().add(this.getControlNode());
		controlNodeEClass.getESuperTypes().add(this.getActivityNode());
		actorEClass.getESuperTypes().add(this.getBehavioredClassifier());
		addStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		writeStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		structuralFeatureActionEClass.getESuperTypes().add(this.getAction());
		addVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
		writeVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		variableActionEClass.getESuperTypes().add(this.getAction());
		anyReceiveEventEClass.getESuperTypes().add(this.getMessageEvent());
		messageEventEClass.getESuperTypes().add(this.getEvent());
		associationClassEClass.getESuperTypes().add(this.getClass_());
		associationClassEClass.getESuperTypes().add(this.getAssociation());
		behaviorExecutionSpecificationEClass.getESuperTypes().add(this.getExecutionSpecification());
		broadcastSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
		invocationActionEClass.getESuperTypes().add(this.getAction());
		callActionEClass.getESuperTypes().add(this.getInvocationAction());
		callBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		callEventEClass.getESuperTypes().add(this.getMessageEvent());
		callOperationActionEClass.getESuperTypes().add(this.getCallAction());
		changeEventEClass.getESuperTypes().add(this.getEvent());
		clauseEClass.getESuperTypes().add(this.getElement());
		clearAssociationActionEClass.getESuperTypes().add(this.getAction());
		clearStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		clearVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		combinedFragmentEClass.getESuperTypes().add(this.getInteractionFragment());
		communicationPathEClass.getESuperTypes().add(this.getAssociation());
		componentEClass.getESuperTypes().add(this.getClass_());
		componentRealizationEClass.getESuperTypes().add(this.getRealization());
		conditionalNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		considerIgnoreFragmentEClass.getESuperTypes().add(this.getCombinedFragment());
		continuationEClass.getESuperTypes().add(this.getInteractionFragment());
		controlFlowEClass.getESuperTypes().add(this.getActivityEdge());
		createLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		writeLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		linkActionEClass.getESuperTypes().add(this.getAction());
		linkEndDataEClass.getESuperTypes().add(this.getElement());
		qualifierValueEClass.getESuperTypes().add(this.getElement());
		linkEndCreationDataEClass.getESuperTypes().add(this.getLinkEndData());
		createLinkObjectActionEClass.getESuperTypes().add(this.getCreateLinkAction());
		createObjectActionEClass.getESuperTypes().add(this.getAction());
		dataStoreNodeEClass.getESuperTypes().add(this.getCentralBufferNode());
		decisionNodeEClass.getESuperTypes().add(this.getControlNode());
		objectFlowEClass.getESuperTypes().add(this.getActivityEdge());
		destroyLinkActionEClass.getESuperTypes().add(this.getWriteLinkAction());
		linkEndDestructionDataEClass.getESuperTypes().add(this.getLinkEndData());
		destroyObjectActionEClass.getESuperTypes().add(this.getAction());
		destructionOccurenceSpecificationEClass.getESuperTypes().add(this.getMessageOccurrenceSpecification());
		messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getOccurrenceSpecification());
		messageOccurrenceSpecificationEClass.getESuperTypes().add(this.getMessageEnd());
		deviceEClass.getESuperTypes().add(this.getNode());
		nodeEClass.getESuperTypes().add(this.getClass_());
		nodeEClass.getESuperTypes().add(this.getDeploymentTarget());
		durationEClass.getESuperTypes().add(this.getValueSpecification());
		observationEClass.getESuperTypes().add(this.getPackageableElement());
		durationConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
		intervalConstraintEClass.getESuperTypes().add(this.getConstraint());
		intervalEClass.getESuperTypes().add(this.getValueSpecification());
		durationIntervalEClass.getESuperTypes().add(this.getInterval());
		durationObservationEClass.getESuperTypes().add(this.getObservation());
		enumerationEClass.getESuperTypes().add(this.getDataType());
		enumerationLiteralEClass.getESuperTypes().add(this.getInstanceSpecification());
		instanceSpecificationEClass.getESuperTypes().add(this.getDeploymentTarget());
		instanceSpecificationEClass.getESuperTypes().add(this.getPackageableElement());
		instanceSpecificationEClass.getESuperTypes().add(this.getDeployedArtifact());
		slotEClass.getESuperTypes().add(this.getElement());
		executionEnvironmentEClass.getESuperTypes().add(this.getNode());
		executionOccurrenceSpecificationEClass.getESuperTypes().add(this.getOccurrenceSpecification());
		expansionRegionEClass.getESuperTypes().add(this.getStructuredActivityNode());
		finalStateEClass.getESuperTypes().add(this.getState());
		flowFinalNodeEClass.getESuperTypes().add(this.getFinalNode());
		forkNodeEClass.getESuperTypes().add(this.getControlNode());
		functionBehaviorEClass.getESuperTypes().add(this.getOpaqueBehavior());
		opaqueBehaviorEClass.getESuperTypes().add(this.getBehavior());
		informationFlowEClass.getESuperTypes().add(this.getPackageableElement());
		informationFlowEClass.getESuperTypes().add(this.getDirectedRelationship());
		informationItemEClass.getESuperTypes().add(this.getClassifier());
		initialNodeEClass.getESuperTypes().add(this.getControlNode());
		instanceValueEClass.getESuperTypes().add(this.getValueSpecification());
		joinNodeEClass.getESuperTypes().add(this.getControlNode());
		literalBooleanEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalSpecificationEClass.getESuperTypes().add(this.getValueSpecification());
		literalIntegerEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalNullEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalRealEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalStringEClass.getESuperTypes().add(this.getLiteralSpecification());
		literalUnlimitedNaturalEClass.getESuperTypes().add(this.getLiteralSpecification());
		loopNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		mergeNodeEClass.getESuperTypes().add(this.getControlNode());
		modelEClass.getESuperTypes().add(this.getPackage());
		opaqueActionEClass.getESuperTypes().add(this.getAction());
		primitiveTypeEClass.getESuperTypes().add(this.getDataType());
		protocolTransitionEClass.getESuperTypes().add(this.getTransition());
		raiseExceptionActionEClass.getESuperTypes().add(this.getAction());
		readExtentActionEClass.getESuperTypes().add(this.getAction());
		readIsClassifiedObjectActionEClass.getESuperTypes().add(this.getAction());
		readLinkActionEClass.getESuperTypes().add(this.getLinkAction());
		readLinkObjectEndActionEClass.getESuperTypes().add(this.getAction());
		readLinkObjectEndQualifierActionEClass.getESuperTypes().add(this.getAction());
		readSelfActionEClass.getESuperTypes().add(this.getAction());
		readStructuralFeatureActionEClass.getESuperTypes().add(this.getStructuralFeatureAction());
		readVariableActionEClass.getESuperTypes().add(this.getVariableAction());
		reclassifyObjectActionEClass.getESuperTypes().add(this.getAction());
		reduceActionEClass.getESuperTypes().add(this.getAction());
		removeStructuralFeatureValueActionEClass.getESuperTypes().add(this.getWriteStructuralFeatureAction());
		removeVariableValueActionEClass.getESuperTypes().add(this.getWriteVariableAction());
		replyActionEClass.getESuperTypes().add(this.getAction());
		sendObjectActionEClass.getESuperTypes().add(this.getInvocationAction());
		sendSignalActionEClass.getESuperTypes().add(this.getInvocationAction());
		sequenceNodeEClass.getESuperTypes().add(this.getStructuredActivityNode());
		signalEventEClass.getESuperTypes().add(this.getMessageEvent());
		startClassifierBehaviorActionEClass.getESuperTypes().add(this.getAction());
		startObjectBehaviorActionEClass.getESuperTypes().add(this.getCallAction());
		stateInvariantEClass.getESuperTypes().add(this.getInteractionFragment());
		testIdentityActionEClass.getESuperTypes().add(this.getAction());
		timeConstraintEClass.getESuperTypes().add(this.getIntervalConstraint());
		timeIntervalEClass.getESuperTypes().add(this.getInterval());
		timeExpressionEClass.getESuperTypes().add(this.getValueSpecification());
		timeEventEClass.getESuperTypes().add(this.getEvent());
		timeObservationEClass.getESuperTypes().add(this.getObservation());
		unmarshallActionEClass.getESuperTypes().add(this.getAction());
		usageEClass.getESuperTypes().add(this.getDependency());
		valuePinEClass.getESuperTypes().add(this.getInputPin());
		valueSpecificationActionEClass.getESuperTypes().add(this.getAction());
	}

	private void initEnumsPackageContents() {
		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);

		initEEnum(callConcurrencyKindEEnum, CallConcurrencyKind.class, "CallConcurrencyKind");
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.SEQUENTIAL);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.GUARDED);
		addEEnumLiteral(callConcurrencyKindEEnum, CallConcurrencyKind.CONCURRENT);

		initEEnum(parameterDirectionKindEEnum, ParameterDirectionKind.class, "ParameterDirectionKind");
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.IN);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.INOUT);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.OUT);
		addEEnumLiteral(parameterDirectionKindEEnum, ParameterDirectionKind.RETURN);

		initEEnum(parameterEffectKindEEnum, ParameterEffectKind.class, "ParameterEffectKind");
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.CREATE);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.READ);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.UPDATE);
		addEEnumLiteral(parameterEffectKindEEnum, ParameterEffectKind.DELETE);

		initEEnum(transitionKindEEnum, TransitionKind.class, "TransitionKind");
		addEEnumLiteral(transitionKindEEnum, TransitionKind.INTERNAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.LOCAL);
		addEEnumLiteral(transitionKindEEnum, TransitionKind.EXTERNAL);

		initEEnum(pseudostateKindEEnum, PseudostateKind.class, "PseudostateKind");
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.INITIAL);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.DEEP_HISTORY);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.SHALLOW_HISTORY);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.JOIN);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.FORK);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.JUNCTION);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.CHOICE);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.ENTRY_POINT);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.EXIT_POINT);
		addEEnumLiteral(pseudostateKindEEnum, PseudostateKind.TERMINATE);

		initEEnum(aggregationKindEEnum, AggregationKind.class, "AggregationKind");
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.NONE);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.SHARED);
		addEEnumLiteral(aggregationKindEEnum, AggregationKind.COMPOSITE);

		initEEnum(connectorKindEEnum, ConnectorKind.class, "ConnectorKind");
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.ASSEMBLY);
		addEEnumLiteral(connectorKindEEnum, ConnectorKind.DELEGATION);

		initEEnum(messageKindEEnum, MessageKind.class, "MessageKind");
		addEEnumLiteral(messageKindEEnum, MessageKind.COMPLETE);
		addEEnumLiteral(messageKindEEnum, MessageKind.LOST);
		addEEnumLiteral(messageKindEEnum, MessageKind.FOUND);
		addEEnumLiteral(messageKindEEnum, MessageKind.UNKNOWN);

		initEEnum(messageSortEEnum, MessageSort.class, "MessageSort");
		addEEnumLiteral(messageSortEEnum, MessageSort.SYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_CALL);
		addEEnumLiteral(messageSortEEnum, MessageSort.ASYNCH_SIGNAL);
		addEEnumLiteral(messageSortEEnum, MessageSort.CREATE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.DELETE_MESSAGE);
		addEEnumLiteral(messageSortEEnum, MessageSort.REPLY);

		initEEnum(interactionOperatorKindEEnum, InteractionOperatorKind.class, "InteractionOperatorKind");
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.SEQ);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.ALT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.OPT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.BREAK);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.PAR);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.STRICT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.LOOP);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.CRITICAL);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.NEG);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.ASSERT);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.IGNORE);
		addEEnumLiteral(interactionOperatorKindEEnum, InteractionOperatorKind.CONSIDER);

		initEEnum(expansionKindEEnum, ExpansionKind.class, "ExpansionKind");
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.PARALLEL);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.ITERATIVE);
		addEEnumLiteral(expansionKindEEnum, ExpansionKind.STREAM);
	}

	private void addEParamPackageContents(EOperation op, int i, int j, boolean is_unique, boolean is_ordered) {
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", i, j, is_unique, is_ordered);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", i, j, is_unique, is_ordered);	
	}

	/**
	 * The function below was commented because of the error:
	 * The code of method initializePackageContents() is exceeding the 65535 bytes limit
	 * 
	 * The solution was divide the function on small parts, which are above.
	 **/
	
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		PrimitiveTypesPackage thePrimitiveTypesPackage = (PrimitiveTypesPackage)EPackage.Registry.INSTANCE.getEPackage(PrimitiveTypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters
		
		// Add supertypes to classes
		addSupertypesPackageContents();

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractionEClass, Abstraction.class, "Abstraction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstraction_Mapping(), this.getOpaqueExpression(), null, "mapping", null, 0, 1, Abstraction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dependencyEClass, Dependency.class, "Dependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDependency_Client(), this.getNamedElement(), this.getNamedElement_ClientDependency(), "client", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDependency_Supplier(), this.getNamedElement(), null, "supplier", null, 1, -1, Dependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(directedRelationshipEClass, DirectedRelationship.class, "DirectedRelationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDirectedRelationship_Source(), this.getElement(), null, "source", null, 1, -1, DirectedRelationship.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDirectedRelationship_Target(), this.getElement(), null, "target", null, 1, -1, DirectedRelationship.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(relationshipEClass, Relationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRelationship_RelatedElement(), this.getElement(), null, "relatedElement", null, 1, -1, Relationship.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEClass(elementEClass, Element.class, "Element", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_OwnedComment(), this.getComment(), null, "ownedComment", null, 0, -1, Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_OwnedElement(), this.getElement(), this.getElement_Owner(), "ownedElement", null, 0, -1, Element.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElement_Owner(), this.getElement(), this.getElement_OwnedElement(), "owner", null, 0, 1, Element.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getElement__NotOwnSelf__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notOwnSelf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);
		
		op = initEOperation(getElement__HasOwner__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasOwner", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElement__AllOwnedElements(), this.getElement(), "allOwnedElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getElement__MustBeOwned(), thePrimitiveTypesPackage.getBoolean(), "mustBeOwned", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(commentEClass, Comment.class, "Comment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComment_AnnotatedElement(), this.getElement(), null, "annotatedElement", null, 0, -1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getComment_Body(), thePrimitiveTypesPackage.getString(), "body", null, 0, 1, Comment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(packageableElementEClass, PackageableElement.class, "PackageableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterableElementEClass, ParameterableElement.class, "ParameterableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterableElement_OwningTemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_OwnedParameteredElement(), "owningTemplateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterableElement_TemplateParameter(), this.getTemplateParameter(), this.getTemplateParameter_ParameteredElement(), "templateParameter", null, 0, 1, ParameterableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParameterableElement__IsCompatibleWith__ParameterableElement(), thePrimitiveTypesPackage.getBoolean(), "isCompatibleWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getParameterableElement(), "p", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getParameterableElement__IsTemplateParameter(), thePrimitiveTypesPackage.getBoolean(), "isTemplateParameter", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateParameterEClass, TemplateParameter.class, "TemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameter_Default(), this.getParameterableElement(), null, "default", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_OwnedDefault(), this.getParameterableElement(), null, "ownedDefault", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_ParameteredElement(), this.getParameterableElement(), this.getParameterableElement_TemplateParameter(), "parameteredElement", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_Signature(), this.getTemplateSignature(), this.getTemplateSignature_OwnedParameter(), "signature", null, 1, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameter_OwnedParameteredElement(), this.getParameterableElement(), this.getParameterableElement_OwningTemplateParameter(), "ownedParameteredElement", null, 0, 1, TemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTemplateParameter__MustBeCompatible__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustBeCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);
		
		initEClass(templateSignatureEClass, TemplateSignature.class, "TemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateSignature_Parameter(), this.getTemplateParameter(), null, "parameter", null, 1, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateSignature_Template(), this.getTemplateableElement(), this.getTemplateableElement_OwnedTemplateSignature(), "template", null, 1, 1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateSignature_OwnedParameter(), this.getTemplateParameter(), this.getTemplateParameter_Signature(), "ownedParameter", null, 0, -1, TemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getTemplateSignature__OwnElements__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ownElements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(templateableElementEClass, TemplateableElement.class, "TemplateableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateableElement_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_BoundElement(), "templateBinding", null, 0, -1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateableElement_OwnedTemplateSignature(), this.getTemplateSignature(), this.getTemplateSignature_Template(), "ownedTemplateSignature", null, 0, 1, TemplateableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getTemplateableElement__IsTemplate(), thePrimitiveTypesPackage.getBoolean(), "isTemplate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTemplateableElement__ParameterableElements(), this.getParameterableElement(), "parameterableElements", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(templateBindingEClass, TemplateBinding.class, "TemplateBinding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateBinding_ParameterSubstitution(), this.getTemplateParameterSubstitution(), this.getTemplateParameterSubstitution_TemplateBinding(), "parameterSubstitution", null, 0, -1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateBinding_Signature(), this.getTemplateSignature(), null, "signature", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateBinding_BoundElement(), this.getTemplateableElement(), this.getTemplateableElement_TemplateBinding(), "boundElement", null, 1, 1, TemplateBinding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTemplateBinding__OneParameterSubstitution__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneParameterSubstitution", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTemplateBinding__ParameterSubstitutionFormal__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "parameterSubstitutionFormal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(templateParameterSubstitutionEClass, TemplateParameterSubstitution.class, "TemplateParameterSubstitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateParameterSubstitution_Actual(), this.getParameterableElement(), null, "actual", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_Formal(), this.getTemplateParameter(), null, "formal", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_OwnedActual(), this.getParameterableElement(), null, "ownedActual", null, 0, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTemplateParameterSubstitution_TemplateBinding(), this.getTemplateBinding(), this.getTemplateBinding_ParameterSubstitution(), "templateBinding", null, 1, 1, TemplateParameterSubstitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTemplateParameterSubstitution__MustBeCompatible__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustBeCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamedElement_ClientDependency(), this.getDependency(), this.getDependency_Client(), "clientDependency", null, 0, -1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_Name(), thePrimitiveTypesPackage.getString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_NameExpression(), this.getStringExpression(), null, "nameExpression", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamedElement_Namespace(), this.getNamespace(), this.getNamespace_OwnedMember(), "namespace", null, 0, 1, NamedElement.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_QualifiedName(), thePrimitiveTypesPackage.getString(), "qualifiedName", null, 0, 1, NamedElement.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamedElement_Visibility(), this.getVisibilityKind(), "visibility", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getNamedElement__HasQualifiedName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNamedElement__HasNoQualifiedName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasNoQualifiedName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNamedElement__VisibilityNeedsOwnership__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "visibilityNeedsOwnership", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNamedElement__AllNamespaces(), this.getNamespace(), "allNamespaces", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getNamedElement__AllOwningPackages(), this.getPackage(), "allOwningPackages", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamedElement__IsDistinguishableFrom__NamedElement_Namespace(), thePrimitiveTypesPackage.getBoolean(), "isDistinguishableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "n", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamespace(), "ns", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__Namespace(), this.getNamespace(), "namespace", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__QualifiedName(), thePrimitiveTypesPackage.getString(), "qualifiedName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamedElement__Separator(), thePrimitiveTypesPackage.getString(), "separator", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(stringExpressionEClass, StringExpression.class, "StringExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStringExpression_OwningExpression(), this.getStringExpression(), this.getStringExpression_SubExpression(), "owningExpression", null, 0, 1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStringExpression_SubExpression(), this.getStringExpression(), this.getStringExpression_OwningExpression(), "subExpression", null, 0, -1, StringExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStringExpression__Subexpressions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "subexpressions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStringExpression__Operands__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "operands", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpression_Operand(), this.getValueSpecification(), null, "operand", null, 0, -1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpression_Symbol(), thePrimitiveTypesPackage.getString(), "symbol", null, 0, 1, Expression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(valueSpecificationEClass, ValueSpecification.class, "ValueSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getValueSpecification__BooleanValue(), thePrimitiveTypesPackage.getBoolean(), "booleanValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IntegerValue(), thePrimitiveTypesPackage.getInteger(), "integerValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IsComputable(), thePrimitiveTypesPackage.getBoolean(), "isComputable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__IsNull(), thePrimitiveTypesPackage.getBoolean(), "isNull", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__RealValue(), thePrimitiveTypesPackage.getReal(), "realValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__StringValue(), thePrimitiveTypesPackage.getString(), "stringValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getValueSpecification__UnlimitedValue(), thePrimitiveTypesPackage.getUnlimitedNatural(), "unlimitedValue", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(typedElementEClass, TypedElement.class, "TypedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypedElement_Type(), this.getType(), null, "type", null, 0, 1, TypedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getType_Package(), this.getPackage(), this.getPackage_OwnedType(), "package", null, 0, 1, Type.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getType__ConformsTo__Type(), thePrimitiveTypesPackage.getBoolean(), "conformsTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getType(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(packageEClass, uml2.Package.class, "Package", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPackage_Uri(), thePrimitiveTypesPackage.getString(), "uri", null, 0, 1, uml2.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_NestedPackage(), this.getPackage(), this.getPackage_NestingPackage(), "nestedPackage", null, 0, -1, uml2.Package.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_NestingPackage(), this.getPackage(), this.getPackage_NestedPackage(), "nestingPackage", null, 0, 1, uml2.Package.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_OwnedStereotype(), this.getStereotype(), null, "ownedStereotype", null, 0, -1, uml2.Package.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_PackageMerge(), this.getPackageMerge(), this.getPackageMerge_ReceivingPackage(), "packageMerge", null, 0, -1, uml2.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_PackagedElement(), this.getPackageableElement(), null, "packagedElement", null, 0, -1, uml2.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_ProfileApplication(), this.getProfileApplication(), this.getProfileApplication_ApplyingPackage(), "profileApplication", null, 0, -1, uml2.Package.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackage_OwnedType(), this.getType(), this.getType_Package(), "ownedType", null, 0, -1, uml2.Package.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPackage__ElementsPublicOrPrivate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "elementsPublicOrPrivate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPackage__AllApplicableStereotypes(), this.getStereotype(), "allApplicableStereotypes", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__ContainingProfile(), this.getProfile(), "containingProfile", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getPackage__MakesVisible__NamedElement(), thePrimitiveTypesPackage.getBoolean(), "makesVisible", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "el", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__NestedPackage(), this.getPackage(), "nestedPackage", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__OwnedStereotype(), this.getStereotype(), "ownedStereotype", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__OwnedType(), this.getType(), "ownedType", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPackage__VisibleMembers(), this.getPackageableElement(), "visibleMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(namespaceEClass, Namespace.class, "Namespace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_ElementImport(), this.getElementImport(), this.getElementImport_ImportingNamespace(), "elementImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_ImportedMember(), this.getPackageableElement(), null, "importedMember", null, 0, -1, Namespace.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_Member(), this.getNamedElement(), null, "member", null, 0, -1, Namespace.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_OwnedMember(), this.getNamedElement(), this.getNamedElement_Namespace(), "ownedMember", null, 0, -1, Namespace.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_OwnedRule(), this.getConstraint(), this.getConstraint_Context(), "ownedRule", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespace_PackageImport(), this.getPackageImport(), this.getPackageImport_ImportingNamespace(), "packageImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getNamespace__MembersDistinguishable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "membersDistinguishable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getNamespace__ExcludeCollisions__EList(), this.getPackageableElement(), "excludeCollisions", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "imps", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__GetNamesOfMember__NamedElement(), thePrimitiveTypesPackage.getString(), "getNamesOfMember", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getNamespace__ImportMembers__EList(), this.getPackageableElement(), "importMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getPackageableElement(), "imps", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__ImportedMember(), this.getPackageableElement(), "importedMember", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__MembersAreDistinguishable(), thePrimitiveTypesPackage.getBoolean(), "membersAreDistinguishable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getNamespace__OwnedMember(), this.getNamedElement(), "ownedMember", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(elementImportEClass, ElementImport.class, "ElementImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementImport_Alias(), thePrimitiveTypesPackage.getString(), "alias", null, 0, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementImport_ImportedElement(), this.getPackageableElement(), null, "importedElement", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getElementImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getElementImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_ElementImport(), "importingNamespace", null, 1, 1, ElementImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getElementImport__VisibilityPublicOrPrivate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "visibilityPublicOrPrivate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getElementImport__ImportedElementIsPublic__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "importedElementIsPublic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getElementImport__GetName(), thePrimitiveTypesPackage.getString(), "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(constraintEClass, Constraint.class, "Constraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConstraint_ConstrainedElement(), this.getElement(), null, "constrainedElement", null, 0, -1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConstraint_Specification(), this.getValueSpecification(), null, "specification", null, 1, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConstraint_Context(), this.getNamespace(), this.getNamespace_OwnedRule(), "context", null, 0, 1, Constraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConstraint__NotApplyToSelf__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notApplyToSelf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraint__BooleanValue__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "booleanValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraint__NoSideEffects__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noSideEffects", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConstraint__ValueSpecificationBoolean__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valueSpecificationBoolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packageImportEClass, PackageImport.class, "PackageImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageImport_ImportedPackage(), this.getPackage(), null, "importedPackage", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPackageImport_Visibility(), this.getVisibilityKind(), "visibility", "public", 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_PackageImport(), "importingNamespace", null, 1, 1, PackageImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPackageImport__PublicOrPrivate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "publicOrPrivate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stereotypeEClass, Stereotype.class, "Stereotype", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStereotype_Icon(), this.getImage(), null, "icon", null, 0, -1, Stereotype.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStereotype_Profile(), this.getProfile(), null, "profile", null, 1, 1, Stereotype.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStereotype__Generalize__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "generalize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStereotype__AssociationEndOwnership__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associationEndOwnership", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStereotype__BinaryAssociationsOnly__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "binaryAssociationsOnly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStereotype__NameNotClash__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nameNotClash", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStereotype__ContainingProfile(), this.getProfile(), "containingProfile", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStereotype__Profile(), this.getProfile(), "profile", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(classEClass, uml2.Class.class, "Class", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClass_OwnedOperation(), this.getOperation(), this.getOperation_Class(), "ownedOperation", null, 0, -1, uml2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_Extension(), this.getExtension(), this.getExtension_Metaclass(), "extension", null, 0, -1, uml2.Class.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClass_IsActive(), thePrimitiveTypesPackage.getBoolean(), "isActive", "false", 1, 1, uml2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_NestedClassifier(), this.getClassifier(), null, "nestedClassifier", null, 0, -1, uml2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClass_OwnedReception(), this.getReception(), null, "ownedReception", null, 0, -1, uml2.Class.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClass_SuperClass(), this.getClass_(), null, "superClass", null, 0, -1, uml2.Class.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getClass__PassiveClass__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "passiveClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClass__Extension(), this.getExtension(), "extension", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClass__SuperClass(), this.getClass_(), "superClass", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(behavioredClassifierEClass, BehavioredClassifier.class, "BehavioredClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavioredClassifier_ClassifierBehavior(), this.getBehavior(), null, "classifierBehavior", null, 0, 1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioredClassifier_InterfaceRealization(), this.getInterfaceRealization(), this.getInterfaceRealization_ImplementingClassifier(), "interfaceRealization", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioredClassifier_OwnedBehavior(), this.getBehavior(), null, "ownedBehavior", null, 0, -1, BehavioredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBehavioredClassifier__ClassBehavior__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "classBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(classifierEClass, Classifier.class, "Classifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClassifier_Attribute(), this.getProperty(), null, "attribute", null, 0, -1, Classifier.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Feature(), this.getFeature(), this.getFeature_FeaturingClassifier(), "feature", null, 0, -1, Classifier.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_CollaborationUse(), this.getCollaborationUse(), null, "collaborationUse", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_General(), this.getClassifier(), null, "general", null, 0, -1, Classifier.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Generalization(), this.getGeneralization(), this.getGeneralization_Specific(), "generalization", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_PowertypeExtent(), this.getGeneralizationSet(), this.getGeneralizationSet_Powertype(), "powertypeExtent", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_InheritedMember(), this.getNamedElement(), null, "inheritedMember", null, 0, -1, Classifier.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassifier_IsAbstract(), thePrimitiveTypesPackage.getBoolean(), "isAbstract", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getClassifier_IsFinalSpecialization(), thePrimitiveTypesPackage.getBoolean(), "isFinalSpecialization", "false", 1, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_OwnedUseCase(), this.getUseCase(), null, "ownedUseCase", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_UseCase(), this.getUseCase(), this.getUseCase_Subject(), "useCase", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_RedefinedClassifier(), this.getClassifier(), null, "redefinedClassifier", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Representation(), this.getCollaborationUse(), null, "representation", null, 0, 1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifier_Substitution(), this.getSubstitution(), this.getSubstitution_SubstitutingClassifier(), "substitution", null, 0, -1, Classifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getClassifier__NoCyclesInGeneralization__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noCyclesInGeneralization", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClassifier__SpecializeType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "specializeType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClassifier__NonFinalParents__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonFinalParents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClassifier__MapsToGeneralizationSet__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mapsToGeneralizationSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getClassifier__AllFeatures(), this.getFeature(), "allFeatures", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__AllParents(), this.getClassifier(), "allParents", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__ConformsTo__Classifier(), thePrimitiveTypesPackage.getBoolean(), "conformsTo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__General(), this.getClassifier(), "general", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__HasVisibilityOf__NamedElement(), thePrimitiveTypesPackage.getBoolean(), "hasVisibilityOf", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "n", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__Inherit__EList(), this.getNamedElement(), "inherit", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamedElement(), "inhs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__InheritableMembers__Classifier(), this.getNamedElement(), "inheritableMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "c", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__InheritedMember(), this.getNamedElement(), "inheritedMember", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getClassifier__MaySpecializeType__Classifier(), thePrimitiveTypesPackage.getBoolean(), "maySpecializeType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "c", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getClassifier__Parents(), this.getClassifier(), "parents", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(redefinableElementEClass, RedefinableElement.class, "RedefinableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRedefinableElement_IsLeaf(), thePrimitiveTypesPackage.getBoolean(), "isLeaf", "false", 1, 1, RedefinableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableElement_RedefinedElement(), this.getRedefinableElement(), null, "redefinedElement", null, 0, -1, RedefinableElement.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableElement_RedefinitionContext(), this.getClassifier(), null, "redefinitionContext", null, 0, -1, RedefinableElement.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRedefinableElement__NonLeafRedefinition__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonLeafRedefinition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRedefinableElement__RedefinitionContextValid__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "redefinitionContextValid", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRedefinableElement__RedefinitionConsistent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "redefinitionConsistent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRedefinableElement__IsConsistentWith__RedefinableElement(), thePrimitiveTypesPackage.getBoolean(), "isConsistentWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRedefinableElement(), "redefinee", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRedefinableElement__IsRedefinitionContextValid__RedefinableElement(), thePrimitiveTypesPackage.getBoolean(), "isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRedefinableElement(), "redefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProperty_Datatype(), this.getDataType(), this.getDataType_OwnedAttribute(), "datatype", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Interface(), this.getInterface(), this.getInterface_OwnedAttribute(), "interface", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_Aggregation(), this.getAggregationKind(), "aggregation", "none", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Association(), this.getAssociation(), this.getAssociation_MemberEnd(), "association", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_OwningAssociation(), this.getAssociation(), this.getAssociation_OwnedEnd(), "owningAssociation", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_AssociationEnd(), this.getProperty(), this.getProperty_Qualifier(), "associationEnd", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Qualifier(), this.getProperty(), this.getProperty_AssociationEnd(), "qualifier", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Class(), this.getClass_(), null, "class", null, 0, 1, Property.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_Default(), thePrimitiveTypesPackage.getString(), "default", null, 0, 1, Property.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsComposite(), thePrimitiveTypesPackage.getBoolean(), "isComposite", "false", 1, 1, Property.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsDerived(), thePrimitiveTypesPackage.getBoolean(), "isDerived", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsDerivedUnion(), thePrimitiveTypesPackage.getBoolean(), "isDerivedUnion", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProperty_IsId(), thePrimitiveTypesPackage.getBoolean(), "isId", "false", 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_Opposite(), this.getProperty(), null, "opposite", null, 0, 1, Property.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_RedefinedProperty(), this.getProperty(), null, "redefinedProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProperty_SubsettedProperty(), this.getProperty(), null, "subsettedProperty", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getProperty__SubsettedPropertyNames__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "subsettedPropertyNames", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProperty__BindingToAttribute__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "bindingToAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProperty__MultiplicityOfComposite__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfComposite", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProperty__DerivedUnionIsReadOnly__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "derivedUnionIsReadOnly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProperty__RedefinedPropertyInherited__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "redefinedPropertyInherited", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProperty__SubsettingRules__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "subsettingRules", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProperty__DeploymentTarget__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "deploymentTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProperty__DerivedUnionIsDerived__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "derivedUnionIsDerived", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProperty__SubsettingContextConforms__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "subsettingContextConforms", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProperty__Default_(), thePrimitiveTypesPackage.getString(), "default_", 0, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getProperty__IsAttribute__Property(), thePrimitiveTypesPackage.getBoolean(), "isAttribute", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getProperty(), "p", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__IsComposite(), thePrimitiveTypesPackage.getBoolean(), "isComposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__IsNavigable(), thePrimitiveTypesPackage.getBoolean(), "isNavigable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__Opposite(), this.getProperty(), "opposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getProperty__SubsettingContext(), this.getType(), "subsettingContext", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(structuralFeatureEClass, StructuralFeature.class, "StructuralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuralFeature_IsReadOnly(), thePrimitiveTypesPackage.getBoolean(), "isReadOnly", "false", 1, 1, StructuralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(multiplicityElementEClass, MultiplicityElement.class, "MultiplicityElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMultiplicityElement_IsOrdered(), thePrimitiveTypesPackage.getBoolean(), "isOrdered", "false", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_IsUnique(), thePrimitiveTypesPackage.getBoolean(), "isUnique", "true", 1, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_Lower(), thePrimitiveTypesPackage.getInteger(), "lower", "1", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityElement_LowerValue(), this.getValueSpecification(), null, "lowerValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMultiplicityElement_Upper(), thePrimitiveTypesPackage.getUnlimitedNatural(), "upper", "1", 0, 1, MultiplicityElement.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getMultiplicityElement_UpperValue(), this.getValueSpecification(), null, "upperValue", null, 0, 1, MultiplicityElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__ValueSpecificationConstant__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valueSpecificationConstant", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMultiplicityElement__LowerGe0__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "lowerGe0", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMultiplicityElement__UpperGeLower__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "upperGeLower", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMultiplicityElement__ValueSpecificationNoSideEffects__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "valueSpecificationNoSideEffects", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMultiplicityElement__CompatibleWith__MultiplicityElement(), thePrimitiveTypesPackage.getBoolean(), "compatibleWith", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicityElement(), "other", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__IncludesCardinality__Integer(), thePrimitiveTypesPackage.getBoolean(), "includesCardinality", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, thePrimitiveTypesPackage.getInteger(), "c", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__IncludesMultiplicity__MultiplicityElement(), thePrimitiveTypesPackage.getBoolean(), "includesMultiplicity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getMultiplicityElement(), "m", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getMultiplicityElement__Is__Integer_Integer(), thePrimitiveTypesPackage.getBoolean(), "is", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, thePrimitiveTypesPackage.getInteger(), "lowerbound", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, thePrimitiveTypesPackage.getInteger(), "upperbound", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__IsMultivalued(), thePrimitiveTypesPackage.getBoolean(), "isMultivalued", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__Lower(), thePrimitiveTypesPackage.getInteger(), "lower", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__LowerBound(), thePrimitiveTypesPackage.getInteger(), "lowerBound", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__Upper(), thePrimitiveTypesPackage.getUnlimitedNatural(), "upper", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getMultiplicityElement__UpperBound(), thePrimitiveTypesPackage.getUnlimitedNatural(), "upperBound", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(featureEClass, Feature.class, "Feature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFeature_FeaturingClassifier(), this.getClassifier(), this.getClassifier_Feature(), "featuringClassifier", null, 0, -1, Feature.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFeature_IsStatic(), thePrimitiveTypesPackage.getBoolean(), "isStatic", "false", 1, 1, Feature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deploymentTargetEClass, DeploymentTarget.class, "DeploymentTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeploymentTarget_DeployedElement(), this.getPackageableElement(), null, "deployedElement", null, 0, -1, DeploymentTarget.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getDeploymentTarget_Deployment(), this.getDeployment(), this.getDeployment_Location(), "deployment", null, 0, -1, DeploymentTarget.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getDeploymentTarget__DeployedElement(), this.getPackageableElement(), "deployedElement", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(deploymentEClass, Deployment.class, "Deployment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeployment_Configuration(), this.getDeploymentSpecification(), this.getDeploymentSpecification_Deployment(), "configuration", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployment_DeployedArtifact(), this.getDeployedArtifact(), null, "deployedArtifact", null, 0, -1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeployment_Location(), this.getDeploymentTarget(), this.getDeploymentTarget_Deployment(), "location", null, 1, 1, Deployment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(deploymentSpecificationEClass, DeploymentSpecification.class, "DeploymentSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeploymentSpecification_DeploymentLocation(), thePrimitiveTypesPackage.getString(), "deploymentLocation", null, 0, 1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDeploymentSpecification_ExecutionLocation(), thePrimitiveTypesPackage.getString(), "executionLocation", null, 0, 1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDeploymentSpecification_Deployment(), this.getDeployment(), this.getDeployment_Configuration(), "deployment", null, 0, 1, DeploymentSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDeploymentSpecification__DeployedElements__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "deployedElements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDeploymentSpecification__DeploymentTarget__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "deploymentTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(artifactEClass, Artifact.class, "Artifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArtifact_FileName(), thePrimitiveTypesPackage.getString(), "fileName", null, 0, 1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArtifact_Manifestation(), this.getManifestation(), null, "manifestation", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArtifact_NestedArtifact(), this.getArtifact(), null, "nestedArtifact", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getArtifact_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArtifact_OwnedOperation(), this.getOperation(), null, "ownedOperation", null, 0, -1, Artifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deployedArtifactEClass, DeployedArtifact.class, "DeployedArtifact", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manifestationEClass, Manifestation.class, "Manifestation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getManifestation_UtilizedElement(), this.getPackageableElement(), null, "utilizedElement", null, 1, 1, Manifestation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperation_BodyCondition(), this.getConstraint(), null, "bodyCondition", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Class(), this.getClass_(), this.getClass_OwnedOperation(), "class", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Datatype(), this.getDataType(), this.getDataType_OwnedOperation(), "datatype", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Interface(), this.getInterface(), this.getInterface_OwnedOperation(), "interface", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_IsOrdered(), thePrimitiveTypesPackage.getBoolean(), "isOrdered", "false", 1, 1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_IsQuery(), thePrimitiveTypesPackage.getBoolean(), "isQuery", "false", 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_IsUnique(), thePrimitiveTypesPackage.getBoolean(), "isUnique", "true", 1, 1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_Lower(), thePrimitiveTypesPackage.getInteger(), "lower", "1", 0, 1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Postcondition(), this.getConstraint(), null, "postcondition", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Precondition(), this.getConstraint(), null, "precondition", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_RedefinedOperation(), this.getOperation(), null, "redefinedOperation", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOperation_Type(), this.getType(), null, "type", null, 0, 1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOperation_Upper(), thePrimitiveTypesPackage.getUnlimitedNatural(), "upper", "1", 0, 1, Operation.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOperation__OnlyBodyForQuery__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "onlyBodyForQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOperation__AtMostOneReturn__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "atMostOneReturn", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOperation__IsOrdered(), thePrimitiveTypesPackage.getBoolean(), "isOrdered", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__IsUnique(), thePrimitiveTypesPackage.getBoolean(), "isUnique", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__Lower(), thePrimitiveTypesPackage.getInteger(), "lower", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__ReturnResult(), this.getParameter(), "returnResult", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__Type(), this.getType(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOperation__Upper(), thePrimitiveTypesPackage.getUnlimitedNatural(), "upper", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(behavioralFeatureEClass, BehavioralFeature.class, "BehavioralFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehavioralFeature_Concurrency(), this.getCallConcurrencyKind(), "concurrency", "sequential", 1, 1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehavioralFeature_IsAbstract(), thePrimitiveTypesPackage.getBoolean(), "isAbstract", "false", 1, 1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioralFeature_Method(), this.getBehavior(), this.getBehavior_Specification(), "method", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioralFeature_OwnedParameter(), this.getParameter(), null, "ownedParameter", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavioralFeature_OwnedParameterSet(), this.getParameterSet(), null, "ownedParameterSet", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavioralFeature_RaisedException(), this.getType(), null, "raisedException", null, 0, -1, BehavioralFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(behaviorEClass, Behavior.class, "Behavior", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehavior_Context(), this.getBehavioredClassifier(), null, "context", null, 0, 1, Behavior.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBehavior_IsReentrant(), thePrimitiveTypesPackage.getBoolean(), "isReentrant", "true", 1, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_OwnedParameter(), this.getParameter(), null, "ownedParameter", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehavior_OwnedParameterSet(), this.getParameterSet(), null, "ownedParameterSet", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Postcondition(), this.getConstraint(), null, "postcondition", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Precondition(), this.getConstraint(), null, "precondition", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_RedefinedBehavior(), this.getBehavior(), null, "redefinedBehavior", null, 0, -1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBehavior_Specification(), this.getBehavioralFeature(), this.getBehavioralFeature_Method(), "specification", null, 0, 1, Behavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBehavior__MustRealize__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustRealize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBehavior__ParametersMatch__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "parametersMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBehavior__FeatureOfContextClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "featureOfContextClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBehavior__MostOneBehaviour__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mostOneBehaviour", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBehavior__Context(), this.getBehavioredClassifier(), "context", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Default(), thePrimitiveTypesPackage.getString(), "default", null, 0, 1, Parameter.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_DefaultValue(), this.getValueSpecification(), null, "defaultValue", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Direction(), this.getParameterDirectionKind(), "direction", "in", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_Effect(), this.getParameterEffectKind(), "effect", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_IsException(), thePrimitiveTypesPackage.getBoolean(), "isException", "false", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getParameter_IsStream(), thePrimitiveTypesPackage.getBoolean(), "isStream", "false", 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_Operation(), this.getOperation(), null, "operation", null, 0, 1, Parameter.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameter_ParameterSet(), this.getParameterSet(), this.getParameterSet_Parameter(), "parameterSet", null, 0, -1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParameter__NotException__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__InAndOut__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inAndOut", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__ConnectorEnd__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "connectorEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__ReentrantBehaviors__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "reentrantBehaviors", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameter__StreamAndException__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "streamAndException", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getParameter__Default_(), thePrimitiveTypesPackage.getString(), "default_", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectableElementEClass, ConnectableElement.class, "ConnectableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectableElement_End(), this.getConnectorEnd(), this.getConnectorEnd_Role(), "end", null, 0, -1, ConnectableElement.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getConnectableElement__End(), this.getConnectorEnd(), "end", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectorEndEClass, ConnectorEnd.class, "ConnectorEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectorEnd_DefiningEnd(), this.getProperty(), null, "definingEnd", null, 0, 1, ConnectorEnd.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectorEnd_PartWithPort(), this.getProperty(), null, "partWithPort", null, 0, 1, ConnectorEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectorEnd_Role(), this.getConnectableElement(), this.getConnectableElement_End(), "role", null, 1, 1, ConnectorEnd.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConnectorEnd__SelfPartWithPort__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "selfPartWithPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnectorEnd__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnectorEnd__RoleAndPartWithPort__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "roleAndPartWithPort", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnectorEnd__PartWithPortEmpty__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "partWithPortEmpty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnectorEnd__DefiningEnd(), this.getProperty(), "definingEnd", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectableElementTemplateParameterEClass, ConnectableElementTemplateParameter.class, "ConnectableElementTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parameterSetEClass, ParameterSet.class, "ParameterSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterSet_Condition(), this.getConstraint(), null, "condition", null, 0, -1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getParameterSet_Parameter(), this.getParameter(), this.getParameter_ParameterSet(), "parameter", null, 1, -1, ParameterSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getParameterSet__SameParameterizedEntity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameParameterizedEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterSet__Input__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "input", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getParameterSet__TwoParameterSets__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "twoParameterSets", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataTypeEClass, DataType.class, "DataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataType_OwnedAttribute(), this.getProperty(), this.getProperty_Datatype(), "ownedAttribute", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataType_OwnedOperation(), this.getOperation(), this.getOperation_Datatype(), "ownedOperation", null, 0, -1, DataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterface_NestedClassifier(), this.getClassifier(), null, "nestedClassifier", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_OwnedAttribute(), this.getProperty(), this.getProperty_Interface(), "ownedAttribute", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_OwnedReception(), this.getReception(), null, "ownedReception", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_Protocol(), this.getProtocolStateMachine(), null, "protocol", null, 0, 1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_RedefinedInterface(), this.getInterface(), null, "redefinedInterface", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterface_OwnedOperation(), this.getOperation(), this.getOperation_Interface(), "ownedOperation", null, 0, -1, Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInterface__Visibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "visibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(receptionEClass, Reception.class, "Reception", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReception_Signal(), this.getSignal(), null, "signal", null, 1, 1, Reception.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReception__NotQuery__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notQuery", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(signalEClass, Signal.class, "Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignal_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protocolStateMachineEClass, ProtocolStateMachine.class, "ProtocolStateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolStateMachine_Conformance(), this.getProtocolConformance(), this.getProtocolConformance_SpecificMachine(), "conformance", null, 0, -1, ProtocolStateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getProtocolStateMachine__DeepOrShallowHistory__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "deepOrShallowHistory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProtocolStateMachine__EntryExitDo__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "entryExitDo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProtocolStateMachine__PortsConnected__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "portsConnected", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProtocolStateMachine__ProtocolTransitions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "protocolTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateMachineEClass, StateMachine.class, "StateMachine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateMachine_ConnectionPoint(), this.getPseudostate(), this.getPseudostate_StateMachine(), "connectionPoint", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_SubmachineState(), this.getState(), this.getState_Submachine(), "submachineState", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_Region(), this.getRegion(), this.getRegion_StateMachine(), "region", null, 1, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStateMachine_ExtendedStateMachine(), this.getStateMachine(), null, "extendedStateMachine", null, 0, -1, StateMachine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStateMachine__ContextClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "contextClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStateMachine__ClassifierContext__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "classifierContext", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStateMachine__Method__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "method", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStateMachine__ConnectionPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "connectionPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStateMachine__Lca__State_State(), this.getNamespace(), "lca", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s2", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStateMachine__Ancestor__State_State(), thePrimitiveTypesPackage.getBoolean(), "ancestor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s1", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "s2", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getStateMachine__IsRedefinitionContextValid__StateMachine(), thePrimitiveTypesPackage.getBoolean(), "isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getStateMachine(), "redefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(pseudostateEClass, Pseudostate.class, "Pseudostate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPseudostate_State(), this.getState(), this.getState_ConnectionPoint(), "state", null, 0, 1, Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPseudostate_Kind(), this.getPseudostateKind(), "kind", "initial", 1, 1, Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPseudostate_StateMachine(), this.getStateMachine(), this.getStateMachine_ConnectionPoint(), "stateMachine", null, 0, 1, Pseudostate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPseudostate__JunctionVertex__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "junctionVertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPseudostate__ChoiceVertex__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "choiceVertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPseudostate__InitialVertex__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "initialVertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPseudostate__TransitionsIncoming__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "transitionsIncoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPseudostate__ForkVertex__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "forkVertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPseudostate__JoinVertex__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "joinVertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPseudostate__TransitionsOutgoing__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "transitionsOutgoing", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPseudostate__OutgoingFromInitial__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outgoingFromInitial", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPseudostate__HistoryVertices__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "historyVertices", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(vertexEClass, Vertex.class, "Vertex", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVertex_Container(), this.getRegion(), this.getRegion_Subvertex(), "container", null, 0, 1, Vertex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVertex_Outgoing(), this.getTransition(), this.getTransition_Source(), "outgoing", null, 0, -1, Vertex.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getVertex_Incoming(), this.getTransition(), this.getTransition_Target(), "incoming", null, 0, -1, Vertex.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getVertex__ContainingStateMachine(), this.getStateMachine(), "containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVertex__Incoming(), this.getTransition(), "incoming", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getVertex__Outgoing(), this.getTransition(), "outgoing", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(regionEClass, Region.class, "Region", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegion_ExtendedRegion(), this.getRegion(), null, "extendedRegion", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_State(), this.getState(), this.getState_Region(), "state", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_StateMachine(), this.getStateMachine(), this.getStateMachine_Region(), "stateMachine", null, 0, 1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_Transition(), this.getTransition(), this.getTransition_Container(), "transition", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegion_Subvertex(), this.getVertex(), this.getVertex_Container(), "subvertex", null, 0, -1, Region.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRegion__DeepHistoryVertex__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "deepHistoryVertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__Owned__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "owned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__InitialVertex__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "initialVertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRegion__ShallowHistoryVertex__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "shallowHistoryVertex", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRegion__BelongsToPsm(), thePrimitiveTypesPackage.getBoolean(), "belongsToPsm", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRegion__ContainingStateMachine(), this.getStateMachine(), "containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRegion__IsRedefinitionContextValid__Region(), thePrimitiveTypesPackage.getBoolean(), "isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getRegion(), "redefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRegion__RedefinitionContext(), this.getClassifier(), "redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getState_Connection(), this.getConnectionPointReference(), this.getConnectionPointReference_State(), "connection", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_ConnectionPoint(), this.getPseudostate(), this.getPseudostate_State(), "connectionPoint", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_DeferrableTrigger(), this.getTrigger(), null, "deferrableTrigger", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_DoActivity(), this.getBehavior(), null, "doActivity", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Entry(), this.getBehavior(), null, "entry", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Exit(), this.getBehavior(), null, "exit", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getState_IsComposite(), thePrimitiveTypesPackage.getBoolean(), "isComposite", "false", 1, 1, State.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getState_IsOrthogonal(), thePrimitiveTypesPackage.getBoolean(), "isOrthogonal", "false", 1, 1, State.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getState_IsSimple(), thePrimitiveTypesPackage.getBoolean(), "isSimple", "true", 1, 1, State.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getState_IsSubmachineState(), thePrimitiveTypesPackage.getBoolean(), "isSubmachineState", "false", 1, 1, State.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getState_RedefinedState(), this.getState(), null, "redefinedState", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_StateInvariant(), this.getConstraint(), null, "stateInvariant", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Submachine(), this.getStateMachine(), this.getStateMachine_SubmachineState(), "submachine", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getState_Region(), this.getRegion(), this.getRegion_State(), "region", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getState__CompositeStates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "compositeStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__SubmachineStates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "submachineStates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__EntryOrExit__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "entryOrExit", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__SubmachineOrRegions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "submachineOrRegions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getState__DestinationsOrSourcesOfTransitions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "destinationsOrSourcesOfTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getState__IsComposite(), thePrimitiveTypesPackage.getBoolean(), "isComposite", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getState__IsOrthogonal(), thePrimitiveTypesPackage.getBoolean(), "isOrthogonal", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getState__IsRedefinitionContextValid__State(), thePrimitiveTypesPackage.getBoolean(), "isRedefinitionContextValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getState(), "redefined", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getState__IsSimple(), thePrimitiveTypesPackage.getBoolean(), "isSimple", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getState__IsSubmachineState(), thePrimitiveTypesPackage.getBoolean(), "isSubmachineState", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getState__RedefinitionContext(), this.getClassifier(), "redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectionPointReferenceEClass, ConnectionPointReference.class, "ConnectionPointReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectionPointReference_Entry(), this.getPseudostate(), null, "entry", null, 0, -1, ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectionPointReference_Exit(), this.getPseudostate(), null, "exit", null, 0, -1, ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnectionPointReference_State(), this.getState(), this.getState_Connection(), "state", null, 0, 1, ConnectionPointReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConnectionPointReference__EntryPseudostates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "entryPseudostates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnectionPointReference__ExitPseudostates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "exitPseudostates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_Event(), this.getEvent(), null, "event", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrigger_Port(), this.getPort(), null, "port", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(portEClass, Port.class, "Port", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPort_IsBehavior(), thePrimitiveTypesPackage.getBoolean(), "isBehavior", "false", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_IsConjugated(), thePrimitiveTypesPackage.getBoolean(), "isConjugated", "false", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPort_IsService(), thePrimitiveTypesPackage.getBoolean(), "isService", "true", 1, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Protocol(), this.getProtocolStateMachine(), null, "protocol", null, 0, 1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Provided(), this.getInterface(), null, "provided", null, 0, -1, Port.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_RedefinedPort(), this.getPort(), null, "redefinedPort", null, 0, -1, Port.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPort_Required(), this.getInterface(), null, "required", null, 0, -1, Port.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPort__PortDestroyed__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "portDestroyed", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPort__DefaultValue__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "defaultValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPort__PortAggregation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "portAggregation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPort__Provided(), this.getInterface(), "provided", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getPort__Required(), this.getInterface(), "required", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Effect(), this.getBehavior(), null, "effect", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Guard(), this.getConstraint(), null, "guard", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTransition_Kind(), this.getTransitionKind(), "kind", "external", 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_RedefinedTransition(), this.getTransition(), null, "redefinedTransition", null, 0, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Source(), this.getVertex(), this.getVertex_Outgoing(), "source", null, 1, 1, Transition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Target(), this.getVertex(), this.getVertex_Incoming(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransition_Container(), this.getRegion(), this.getRegion_Transition(), "container", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTransition__StateIsLocal__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "stateIsLocal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__OutgoingPseudostates__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outgoingPseudostates", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__StateIsExternal__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "stateIsExternal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__SignaturesCompatible__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "signaturesCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__JoinSegmentGuards__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "joinSegmentGuards", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__StateIsInternal__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "stateIsInternal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__JoinSegmentState__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "joinSegmentState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__ForkSegmentGuards__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "forkSegmentGuards", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__ForkSegmentState__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "forkSegmentState", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransition__InitialTransition__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "initialTransition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTransition__ContainingStateMachine(), this.getStateMachine(), "containingStateMachine", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getTransition__RedefinitionContext(), this.getClassifier(), "redefinitionContext", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(protocolConformanceEClass, ProtocolConformance.class, "ProtocolConformance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolConformance_GeneralMachine(), this.getProtocolStateMachine(), null, "generalMachine", null, 1, 1, ProtocolConformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProtocolConformance_SpecificMachine(), this.getProtocolStateMachine(), this.getProtocolStateMachine_Conformance(), "specificMachine", null, 1, 1, ProtocolConformance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(operationTemplateParameterEClass, OperationTemplateParameter.class, "OperationTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationEClass, Association.class, "Association", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociation_EndType(), this.getType(), null, "endType", null, 1, -1, Association.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssociation_IsDerived(), thePrimitiveTypesPackage.getBoolean(), "isDerived", "false", 1, 1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_NavigableOwnedEnd(), this.getProperty(), null, "navigableOwnedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAssociation_OwnedEnd(), this.getProperty(), this.getProperty_OwningAssociation(), "ownedEnd", null, 0, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssociation_MemberEnd(), this.getProperty(), this.getProperty_Association(), "memberEnd", null, 2, -1, Association.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getAssociation__SpecializedEndTypes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "specializedEndTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssociation__BinaryAssociations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "binaryAssociations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssociation__SpecializedEndNumber__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "specializedEndNumber", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssociation__AssociationEnds__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associationEnds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAssociation__EndType(), this.getType(), "endType", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(collaborationUseEClass, CollaborationUse.class, "CollaborationUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaborationUse_RoleBinding(), this.getDependency(), null, "roleBinding", null, 0, -1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCollaborationUse_Type(), this.getCollaboration(), null, "type", null, 1, 1, CollaborationUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCollaborationUse__EveryRole__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "everyRole", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollaborationUse__ClientElements__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "clientElements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCollaborationUse__Connectors__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "connectors", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(collaborationEClass, Collaboration.class, "Collaboration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCollaboration_CollaborationRole(), this.getConnectableElement(), null, "collaborationRole", null, 0, -1, Collaboration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(structuredClassifierEClass, StructuredClassifier.class, "StructuredClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuredClassifier_OwnedAttribute(), this.getProperty(), null, "ownedAttribute", null, 0, -1, StructuredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStructuredClassifier_OwnedConnector(), this.getConnector(), null, "ownedConnector", null, 0, -1, StructuredClassifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClassifier_Part(), this.getProperty(), null, "part", null, 0, -1, StructuredClassifier.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredClassifier_Role(), this.getConnectableElement(), null, "role", null, 0, -1, StructuredClassifier.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStructuredClassifier__Multiplicities__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicities", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getStructuredClassifier__Part(), this.getProperty(), "part", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(connectorEClass, Connector.class, "Connector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnector_Contract(), this.getBehavior(), null, "contract", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_End(), this.getConnectorEnd(), null, "end", null, 2, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConnector_Kind(), this.getConnectorKind(), "kind", null, 1, 1, Connector.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_RedefinedConnector(), this.getConnector(), null, "redefinedConnector", null, 0, -1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConnector_Type(), this.getAssociation(), null, "type", null, 0, 1, Connector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConnector__BetweenInterfacesPorts__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "betweenInterfacesPorts", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnector__Compatible__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "compatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnector__Roles__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "roles", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConnector__Types__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "types", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getConnector__Kind(), this.getConnectorKind(), "kind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(generalizationEClass, Generalization.class, "Generalization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralization_General(), this.getClassifier(), null, "general", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_GeneralizationSet(), this.getGeneralizationSet(), this.getGeneralizationSet_Generalization(), "generalizationSet", null, 0, -1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralization_IsSubstitutable(), thePrimitiveTypesPackage.getBoolean(), "isSubstitutable", "true", 0, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralization_Specific(), this.getClassifier(), this.getClassifier_Generalization(), "specific", null, 1, 1, Generalization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGeneralization__GeneralizationSameClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "generalizationSameClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generalizationSetEClass, GeneralizationSet.class, "GeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeneralizationSet_IsCovering(), thePrimitiveTypesPackage.getBoolean(), "isCovering", "false", 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGeneralizationSet_IsDisjoint(), thePrimitiveTypesPackage.getBoolean(), "isDisjoint", "false", 1, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSet_Powertype(), this.getClassifier(), this.getClassifier_PowertypeExtent(), "powertype", null, 0, 1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralizationSet_Generalization(), this.getGeneralization(), this.getGeneralization_GeneralizationSet(), "generalization", null, 0, -1, GeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGeneralizationSet__MapsToGeneralizationSet__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mapsToGeneralizationSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGeneralizationSet__GeneralizationSameClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "generalizationSameClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(redefinableTemplateSignatureEClass, RedefinableTemplateSignature.class, "RedefinableTemplateSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRedefinableTemplateSignature_ExtendedSignature(), this.getRedefinableTemplateSignature(), null, "extendedSignature", null, 0, -1, RedefinableTemplateSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableTemplateSignature_InheritedParameter(), this.getTemplateParameter(), null, "inheritedParameter", null, 0, -1, RedefinableTemplateSignature.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getRedefinableTemplateSignature_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, RedefinableTemplateSignature.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRedefinableTemplateSignature__InheritedParameters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inheritedParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getRedefinableTemplateSignature__InheritedParameter(), this.getTemplateParameter(), "inheritedParameter", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(useCaseEClass, UseCase.class, "UseCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUseCase_Extend(), this.getExtend(), this.getExtend_Extension(), "extend", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_ExtensionPoint(), this.getExtensionPoint(), this.getExtensionPoint_UseCase(), "extensionPoint", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_Include(), this.getInclude(), this.getInclude_IncludingCase(), "include", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUseCase_Subject(), this.getClassifier(), this.getClassifier_UseCase(), "subject", null, 0, -1, UseCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getUseCase__MustHaveName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustHaveName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUseCase__CannotIncludeSelf__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cannotIncludeSelf", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUseCase__BinaryAssociations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "binaryAssociations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUseCase__NoAssociationToUseCase__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noAssociationToUseCase", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUseCase__AllIncludedUseCases(), this.getUseCase(), "allIncludedUseCases", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(extendEClass, Extend.class, "Extend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtend_Condition(), this.getConstraint(), null, "condition", null, 0, 1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExtend_ExtendedCase(), this.getUseCase(), null, "extendedCase", null, 1, 1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExtend_ExtensionLocation(), this.getExtensionPoint(), null, "extensionLocation", null, 1, -1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtend_Extension(), this.getUseCase(), this.getUseCase_Extend(), "extension", null, 1, 1, Extend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExtend__ExtensionPoints__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "extensionPoints", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(extensionPointEClass, ExtensionPoint.class, "ExtensionPoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtensionPoint_UseCase(), this.getUseCase(), this.getUseCase_ExtensionPoint(), "useCase", null, 1, 1, ExtensionPoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExtensionPoint__MustHaveName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustHaveName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(includeEClass, Include.class, "Include", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInclude_Addition(), this.getUseCase(), null, "addition", null, 1, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInclude_IncludingCase(), this.getUseCase(), this.getUseCase_Include(), "includingCase", null, 1, 1, Include.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(substitutionEClass, Substitution.class, "Substitution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubstitution_Contract(), this.getClassifier(), null, "contract", null, 1, 1, Substitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSubstitution_SubstitutingClassifier(), this.getClassifier(), this.getClassifier_Substitution(), "substitutingClassifier", null, 1, 1, Substitution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(realizationEClass, Realization.class, "Realization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classifierTemplateParameterEClass, ClassifierTemplateParameter.class, "ClassifierTemplateParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassifierTemplateParameter_AllowSubstitutable(), thePrimitiveTypesPackage.getBoolean(), "allowSubstitutable", "true", 1, 1, ClassifierTemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClassifierTemplateParameter_ConstrainingClassifier(), this.getClassifier(), null, "constrainingClassifier", null, 0, -1, ClassifierTemplateParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getClassifierTemplateParameter__HasConstrainingClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasConstrainingClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interfaceRealizationEClass, InterfaceRealization.class, "InterfaceRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceRealization_Contract(), this.getInterface(), null, "contract", null, 1, 1, InterfaceRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterfaceRealization_ImplementingClassifier(), this.getBehavioredClassifier(), this.getBehavioredClassifier_InterfaceRealization(), "implementingClassifier", null, 1, 1, InterfaceRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(encapsulatedClassifierEClass, EncapsulatedClassifier.class, "EncapsulatedClassifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEncapsulatedClassifier_OwnedPort(), this.getPort(), null, "ownedPort", null, 0, -1, EncapsulatedClassifier.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		initEOperation(getEncapsulatedClassifier__OwnedPort(), this.getPort(), "ownedPort", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(extensionEClass, Extension.class, "Extension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtension_IsRequired(), thePrimitiveTypesPackage.getBoolean(), "isRequired", "false", 1, 1, Extension.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getExtension_Metaclass(), this.getClass_(), this.getClass_Extension(), "metaclass", null, 1, 1, Extension.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExtension__NonOwnedEnd__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonOwnedEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtension__IsBinary__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "isBinary", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getExtension__IsRequired(), thePrimitiveTypesPackage.getBoolean(), "isRequired", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExtension__Metaclass(), this.getClass_(), "metaclass", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getExtension__MetaclassEnd(), this.getProperty(), "metaclassEnd", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(extensionEndEClass, ExtensionEnd.class, "ExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getExtensionEnd__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExtensionEnd__Aggregation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "aggregation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImage_Content(), thePrimitiveTypesPackage.getString(), "content", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImage_Format(), thePrimitiveTypesPackage.getString(), "format", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImage_Location(), thePrimitiveTypesPackage.getString(), "location", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(profileEClass, Profile.class, "Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfile_MetaclassReference(), this.getElementImport(), null, "metaclassReference", null, 0, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProfile_MetamodelReference(), this.getPackageImport(), null, "metamodelReference", null, 0, -1, Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getProfile__ReferencesSameMetamodel__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "referencesSameMetamodel", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProfile__MetaclassReferenceNotSpecialized__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "metaclassReferenceNotSpecialized", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(packageMergeEClass, PackageMerge.class, "PackageMerge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPackageMerge_MergedPackage(), this.getPackage(), null, "mergedPackage", null, 1, 1, PackageMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPackageMerge_ReceivingPackage(), this.getPackage(), this.getPackage_PackageMerge(), "receivingPackage", null, 1, 1, PackageMerge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(profileApplicationEClass, ProfileApplication.class, "ProfileApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProfileApplication_AppliedProfile(), this.getProfile(), null, "appliedProfile", null, 1, 1, ProfileApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getProfileApplication_IsStrict(), thePrimitiveTypesPackage.getBoolean(), "isStrict", "false", 1, 1, ProfileApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProfileApplication_ApplyingPackage(), this.getPackage(), this.getPackage_ProfileApplication(), "applyingPackage", null, 1, 1, ProfileApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueExpressionEClass, OpaqueExpression.class, "OpaqueExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOpaqueExpression_Behavior(), this.getBehavior(), null, "behavior", null, 0, 1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpaqueExpression_Body(), thePrimitiveTypesPackage.getString(), "body", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueExpression_Language(), thePrimitiveTypesPackage.getString(), "language", null, 0, -1, OpaqueExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueExpression_Result(), this.getParameter(), null, "result", null, 0, 1, OpaqueExpression.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getOpaqueExpression__OneReturnResultParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneReturnResultParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOpaqueExpression__OnlyReturnResultParameters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "onlyReturnResultParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getOpaqueExpression__LanguageBodySize__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "languageBodySize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getOpaqueExpression__IsIntegral(), thePrimitiveTypesPackage.getBoolean(), "isIntegral", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__IsNonNegative(), thePrimitiveTypesPackage.getBoolean(), "isNonNegative", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__IsPositive(), thePrimitiveTypesPackage.getBoolean(), "isPositive", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__Result(), this.getParameter(), "result", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getOpaqueExpression__Value(), thePrimitiveTypesPackage.getInteger(), "value", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(acceptCallActionEClass, AcceptCallAction.class, "AcceptCallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptCallAction_ReturnInformation(), this.getOutputPin(), null, "returnInformation", null, 1, 1, AcceptCallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAcceptCallAction__TriggerCallEvent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "triggerCallEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAcceptCallAction__ResultPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "resultPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAcceptCallAction__Unmarshall__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "unmarshall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(acceptEventActionEClass, AcceptEventAction.class, "AcceptEventAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAcceptEventAction_IsUnmarshall(), thePrimitiveTypesPackage.getBoolean(), "isUnmarshall", "false", 1, 1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptEventAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptEventAction_Trigger(), this.getTrigger(), null, "trigger", null, 1, -1, AcceptEventAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAcceptEventAction__TriggerEvents__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "triggerEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAcceptEventAction__NoInputPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noInputPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAcceptEventAction__UnmarshallSignalEvents__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "unmarshallSignalEvents", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAcceptEventAction__NoOutputPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noOutputPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_Context(), this.getClassifier(), null, "context", null, 0, 1, Action.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_Input(), this.getInputPin(), null, "input", null, 0, -1, Action.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getAction_IsLocallyReentrant(), thePrimitiveTypesPackage.getBoolean(), "isLocallyReentrant", "false", 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_LocalPostcondition(), this.getConstraint(), null, "localPostcondition", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_LocalPrecondition(), this.getConstraint(), null, "localPrecondition", null, 0, -1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAction_Output(), this.getOutputPin(), null, "output", null, 0, -1, Action.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEOperation(getAction__Context(), this.getClassifier(), "context", 0, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(executableNodeEClass, ExecutableNode.class, "ExecutableNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutableNode_Handler(), this.getExceptionHandler(), this.getExceptionHandler_ProtectedNode(), "handler", null, 0, -1, ExecutableNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(activityNodeEClass, ActivityNode.class, "ActivityNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityNode_Activity(), this.getActivity(), this.getActivity_Node(), "activity", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InGroup(), this.getActivityGroup(), this.getActivityGroup_ContainedNode(), "inGroup", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InPartition(), this.getActivityPartition(), this.getActivityPartition_Node(), "inPartition", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InStructuredNode(), this.getStructuredActivityNode(), this.getStructuredActivityNode_Node(), "inStructuredNode", null, 0, 1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_InInterruptibleRegion(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_Node(), "inInterruptibleRegion", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_Outgoing(), this.getActivityEdge(), this.getActivityEdge_Source(), "outgoing", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_Incoming(), this.getActivityEdge(), this.getActivityEdge_Target(), "incoming", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityNode_RedefinedNode(), this.getActivityNode(), null, "redefinedNode", null, 0, -1, ActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getActivityNode__OwnedStructuredNode__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "ownedStructuredNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityNode__Owned__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "owned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityEClass, Activity.class, "Activity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivity_Edge(), this.getActivityEdge(), this.getActivityEdge_Activity(), "edge", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Group(), this.getActivityGroup(), this.getActivityGroup_InActivity(), "group", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_StructuredNode(), this.getStructuredActivityNode(), null, "structuredNode", null, 0, -1, Activity.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Variable(), this.getVariable(), this.getVariable_ActivityScope(), "variable", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivity_IsReadOnly(), thePrimitiveTypesPackage.getBoolean(), "isReadOnly", "false", 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivity_IsSingleExecution(), thePrimitiveTypesPackage.getBoolean(), "isSingleExecution", "false", 1, 1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Partition(), this.getActivityPartition(), null, "partition", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivity_Node(), this.getActivityNode(), this.getActivityNode_Activity(), "node", null, 0, -1, Activity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getActivity__Autonomous__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "autonomous", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivity__NoSupergroups__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noSupergroups", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivity__ActivityParameterNode__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "activityParameterNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getActivity__StructuredNode(), this.getStructuredActivityNode(), "structuredNode", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(activityEdgeEClass, ActivityEdge.class, "ActivityEdge", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityEdge_Guard(), this.getValueSpecification(), null, "guard", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_InGroup(), this.getActivityGroup(), this.getActivityGroup_ContainedEdge(), "inGroup", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_InPartition(), this.getActivityPartition(), this.getActivityPartition_Edge(), "inPartition", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_InStructuredNode(), this.getStructuredActivityNode(), this.getStructuredActivityNode_Edge(), "inStructuredNode", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Interrupts(), this.getInterruptibleActivityRegion(), this.getInterruptibleActivityRegion_InterruptingEdge(), "interrupts", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_RedefinedEdge(), this.getActivityEdge(), null, "redefinedEdge", null, 0, -1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Source(), this.getActivityNode(), this.getActivityNode_Outgoing(), "source", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Target(), this.getActivityNode(), this.getActivityNode_Incoming(), "target", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Weight(), this.getValueSpecification(), null, "weight", null, 1, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityEdge_Activity(), this.getActivity(), this.getActivity_Edge(), "activity", null, 0, 1, ActivityEdge.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getActivityEdge__SourceAndTarget__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourceAndTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityEdge__Owned__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "owned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityEdge__StructuredNode__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "structuredNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityGroupEClass, ActivityGroup.class, "ActivityGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityGroup_ContainedNode(), this.getActivityNode(), this.getActivityNode_InGroup(), "containedNode", null, 0, -1, ActivityGroup.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityGroup_InActivity(), this.getActivity(), this.getActivity_Group(), "inActivity", null, 0, 1, ActivityGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityGroup_Subgroup(), this.getActivityGroup(), this.getActivityGroup_SuperGroup(), "subgroup", null, 0, -1, ActivityGroup.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityGroup_SuperGroup(), this.getActivityGroup(), this.getActivityGroup_Subgroup(), "superGroup", null, 0, 1, ActivityGroup.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityGroup_ContainedEdge(), this.getActivityEdge(), this.getActivityEdge_InGroup(), "containedEdge", null, 0, -1, ActivityGroup.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getActivityGroup__GroupOwned__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "groupOwned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityGroup__NodesAndEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nodesAndEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityGroup__NotContained__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notContained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityPartitionEClass, ActivityPartition.class, "ActivityPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivityPartition_IsDimension(), thePrimitiveTypesPackage.getBoolean(), "isDimension", "false", 1, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getActivityPartition_IsExternal(), thePrimitiveTypesPackage.getBoolean(), "isExternal", "false", 1, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Node(), this.getActivityNode(), this.getActivityNode_InPartition(), "node", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Represents(), this.getElement(), null, "represents", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Subpartition(), this.getActivityPartition(), this.getActivityPartition_SuperPartition(), "subpartition", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_SuperPartition(), this.getActivityPartition(), this.getActivityPartition_Subpartition(), "superPartition", null, 0, 1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getActivityPartition_Edge(), this.getActivityEdge(), this.getActivityEdge_InPartition(), "edge", null, 0, -1, ActivityPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getActivityPartition__RepresentsPartAndIsContained__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "representsPartAndIsContained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityPartition__RepresentsPart__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "representsPart", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityPartition__RepresentsClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "representsClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityPartition__DimensionNotContained__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "dimensionNotContained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(structuredActivityNodeEClass, StructuredActivityNode.class, "StructuredActivityNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStructuredActivityNode_MustIsolate(), thePrimitiveTypesPackage.getBoolean(), "mustIsolate", "false", 1, 1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_Node(), this.getActivityNode(), this.getActivityNode_InStructuredNode(), "node", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_StructuredNodeInput(), this.getInputPin(), null, "structuredNodeInput", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_StructuredNodeOutput(), this.getOutputPin(), null, "structuredNodeOutput", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_Variable(), this.getVariable(), this.getVariable_Scope(), "variable", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuredActivityNode_Edge(), this.getActivityEdge(), this.getActivityEdge_InStructuredNode(), "edge", null, 0, -1, StructuredActivityNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStructuredActivityNode__OutputPinEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outputPinEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStructuredActivityNode__Edges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStructuredActivityNode__InputPinEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputPinEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputPinEClass, InputPin.class, "InputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getInputPin__OutgoingEdgesStructuredOnly__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outgoingEdgesStructuredOnly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pinEClass, Pin.class, "Pin", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPin_IsControl(), thePrimitiveTypesPackage.getBoolean(), "isControl", "false", 1, 1, Pin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getPin__ControlPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "controlPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(outputPinEClass, OutputPin.class, "OutputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getOutputPin__IncomingEdgesStructuredOnly__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "incomingEdgesStructuredOnly", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_ActivityScope(), this.getActivity(), this.getActivity_Variable(), "activityScope", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getVariable_Scope(), this.getStructuredActivityNode(), this.getStructuredActivityNode_Variable(), "scope", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getVariable__Owned__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "owned", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getVariable__IsAccessibleBy__Action(), thePrimitiveTypesPackage.getBoolean(), "isAccessibleBy", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getAction(), "a", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(interruptibleActivityRegionEClass, InterruptibleActivityRegion.class, "InterruptibleActivityRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterruptibleActivityRegion_Node(), this.getActivityNode(), this.getActivityNode_InInterruptibleRegion(), "node", null, 0, -1, InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterruptibleActivityRegion_InterruptingEdge(), this.getActivityEdge(), this.getActivityEdge_Interrupts(), "interruptingEdge", null, 0, -1, InterruptibleActivityRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getInterruptibleActivityRegion__InterruptingEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "interruptingEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(exceptionHandlerEClass, ExceptionHandler.class, "ExceptionHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExceptionHandler_ExceptionType(), this.getClassifier(), null, "exceptionType", null, 1, -1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExceptionHandler_HandlerBody(), this.getExecutableNode(), null, "handlerBody", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExceptionHandler_ProtectedNode(), this.getExecutableNode(), this.getExecutableNode_Handler(), "protectedNode", null, 1, 1, ExceptionHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExceptionHandler__ResultPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "resultPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExceptionHandler__OneInput__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneInput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExceptionHandler__EdgeSourceTarget__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "edgeSourceTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getExceptionHandler__ExceptionBody__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "exceptionBody", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionExecutionSpecificationEClass, ActionExecutionSpecification.class, "ActionExecutionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionExecutionSpecification_Action(), this.getAction(), null, "action", null, 1, 1, ActionExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getActionExecutionSpecification__ActionReferenced__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "actionReferenced", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(executionSpecificationEClass, ExecutionSpecification.class, "ExecutionSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionSpecification_Finish(), this.getOccurrenceSpecification(), null, "finish", null, 1, 1, ExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExecutionSpecification_Start(), this.getOccurrenceSpecification(), null, "start", null, 1, 1, ExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExecutionSpecification__SameLifeline__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameLifeline", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interactionFragmentEClass, InteractionFragment.class, "InteractionFragment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionFragment_Covered(), this.getLifeline(), this.getLifeline_CoveredBy(), "covered", null, 0, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_EnclosingInteraction(), this.getInteraction(), this.getInteraction_Fragment(), "enclosingInteraction", null, 0, 1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_EnclosingOperand(), this.getInteractionOperand(), this.getInteractionOperand_Fragment(), "enclosingOperand", null, 0, 1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionFragment_GeneralOrdering(), this.getGeneralOrdering(), null, "generalOrdering", null, 0, -1, InteractionFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(lifelineEClass, Lifeline.class, "Lifeline", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLifeline_DecomposedAs(), this.getPartDecomposition(), null, "decomposedAs", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Interaction(), this.getInteraction(), this.getInteraction_Lifeline(), "interaction", null, 1, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Represents(), this.getConnectableElement(), null, "represents", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_Selector(), this.getValueSpecification(), null, "selector", null, 0, 1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLifeline_CoveredBy(), this.getInteractionFragment(), this.getInteractionFragment_Covered(), "coveredBy", null, 0, -1, Lifeline.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLifeline__SelectorSpecified__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "selectorSpecified", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLifeline__InteractionUsesShareLifeline__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "interactionUsesShareLifeline", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLifeline__SameClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(partDecompositionEClass, PartDecomposition.class, "PartDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getPartDecomposition__CommutativityOfDecomposition__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "commutativityOfDecomposition", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPartDecomposition__Assume__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "assume", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPartDecomposition__PartsOfInternalStructures__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "partsOfInternalStructures", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interactionUseEClass, InteractionUse.class, "InteractionUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionUse_ActualGate(), this.getGate(), null, "actualGate", null, 0, -1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionUse_Argument(), this.getValueSpecification(), null, "argument", null, 0, -1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteractionUse_RefersTo(), this.getInteraction(), null, "refersTo", null, 1, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionUse_ReturnValue(), this.getValueSpecification(), null, "returnValue", null, 0, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionUse_ReturnValueRecipient(), this.getProperty(), null, "returnValueRecipient", null, 0, 1, InteractionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getInteractionUse__ArgumentsCorrespondToParameters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "argumentsCorrespondToParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionUse__ReturnValueTypeRecipientCorrespondence__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "returnValueTypeRecipientCorrespondence", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionUse__AllLifelines__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "allLifelines", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionUse__ReturnValueRecipientCoverage__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "returnValueRecipientCoverage", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionUse__ArgumentsAreConstants__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "argumentsAreConstants", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionUse__GatesMatch__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "gatesMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gateEClass, Gate.class, "Gate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGate__MessagesActualGate__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "messagesActualGate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGate__MessagesCombinedFragment__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "messagesCombinedFragment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEndEClass, MessageEnd.class, "MessageEnd", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessageEnd_Message(), this.getMessage(), null, "message", null, 0, 1, MessageEnd.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Argument(), this.getValueSpecification(), null, "argument", null, 0, -1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_Connector(), this.getConnector(), null, "connector", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Interaction(), this.getInteraction(), this.getInteraction_Message(), "interaction", null, 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_MessageKind(), this.getMessageKind(), "messageKind", "unknown", 1, 1, Message.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getMessage_MessageSort(), this.getMessageSort(), "messageSort", "synchCall", 1, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_ReceiveEvent(), this.getMessageEnd(), null, "receiveEvent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_SendEvent(), this.getMessageEnd(), null, "sendEvent", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getMessage_Signature(), this.getNamedElement(), null, "signature", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getMessage__SignatureReferTo__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "signatureReferTo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__Arguments__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "arguments", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__SendingReceivingMessageEvent__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sendingReceivingMessageEvent", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__SignatureIsOperation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "signatureIsOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__SignatureIsSignal__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "signatureIsSignal", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__OccurrenceSpecifications__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "occurrenceSpecifications", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMessage__CannotCrossBoundaries__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cannotCrossBoundaries", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMessage__MessageKind(), this.getMessageKind(), "messageKind", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(interactionEClass, Interaction.class, "Interaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteraction_Action(), this.getAction(), null, "action", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_FormalGate(), this.getGate(), null, "formalGate", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Fragment(), this.getInteractionFragment(), this.getInteractionFragment_EnclosingInteraction(), "fragment", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInteraction_Lifeline(), this.getLifeline(), this.getLifeline_Interaction(), "lifeline", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteraction_Message(), this.getMessage(), this.getMessage_Interaction(), "message", null, 0, -1, Interaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(interactionOperandEClass, InteractionOperand.class, "InteractionOperand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionOperand_Guard(), this.getInteractionConstraint(), null, "guard", null, 0, 1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionOperand_Fragment(), this.getInteractionFragment(), this.getInteractionFragment_EnclosingOperand(), "fragment", null, 0, -1, InteractionOperand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInteractionOperand__GuardContainReferences__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "guardContainReferences", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionOperand__GuardDirectlyPrior__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "guardDirectlyPrior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(interactionConstraintEClass, InteractionConstraint.class, "InteractionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInteractionConstraint_Maxint(), this.getValueSpecification(), null, "maxint", null, 0, 1, InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInteractionConstraint_Minint(), this.getValueSpecification(), null, "minint", null, 0, 1, InteractionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getInteractionConstraint__DynamicVariables__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "dynamicVariables", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionConstraint__MaxintPositive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maxintPositive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionConstraint__MinintNonNegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "minintNonNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionConstraint__GlobalData__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "globalData", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionConstraint__MinintMaxint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "minintMaxint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInteractionConstraint__MaxintGreaterEqualMinint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maxintGreaterEqualMinint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(generalOrderingEClass, GeneralOrdering.class, "GeneralOrdering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneralOrdering_After(), this.getOccurrenceSpecification(), this.getOccurrenceSpecification_ToBefore(), "after", null, 1, 1, GeneralOrdering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGeneralOrdering_Before(), this.getOccurrenceSpecification(), this.getOccurrenceSpecification_ToAfter(), "before", null, 1, 1, GeneralOrdering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getGeneralOrdering__IrreflexsiveTransitiveClosure__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "irreflexsiveTransitiveClosure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(occurrenceSpecificationEClass, OccurrenceSpecification.class, "OccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOccurrenceSpecification_ToAfter(), this.getGeneralOrdering(), this.getGeneralOrdering_Before(), "toAfter", null, 0, -1, OccurrenceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getOccurrenceSpecification_ToBefore(), this.getGeneralOrdering(), this.getGeneralOrdering_After(), "toBefore", null, 0, -1, OccurrenceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(actionInputPinEClass, ActionInputPin.class, "ActionInputPin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionInputPin_FromAction(), this.getAction(), null, "fromAction", null, 1, 1, ActionInputPin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getActionInputPin__NoControlOrDataFlow__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noControlOrDataFlow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActionInputPin__OneOutputPin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneOutputPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActionInputPin__InputPin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(activityFinalNodeEClass, ActivityFinalNode.class, "ActivityFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finalNodeEClass, FinalNode.class, "FinalNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFinalNode__NoOutgoingEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noOutgoingEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlNodeEClass, ControlNode.class, "ControlNode", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(activityParameterNodeEClass, ActivityParameterNode.class, "ActivityParameterNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityParameterNode_Parameter(), this.getParameter(), null, "parameter", null, 1, 1, ActivityParameterNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getActivityParameterNode__HasParameters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityParameterNode__NoIncomingEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noIncomingEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityParameterNode__MaximumOneParameterNode__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maximumOneParameterNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityParameterNode__SameType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityParameterNode__NoEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityParameterNode__NoOutgoingEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noOutgoingEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActivityParameterNode__MaximumTwoParameterNodes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "maximumTwoParameterNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actorEClass, Actor.class, "Actor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getActor__Associations__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associations", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getActor__MustHaveName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustHaveName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(addStructuralFeatureValueActionEClass, AddStructuralFeatureValueAction.class, "AddStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddStructuralFeatureValueAction_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddStructuralFeatureValueAction_IsReplaceAll(), thePrimitiveTypesPackage.getBoolean(), "isReplaceAll", "false", 1, 1, AddStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAddStructuralFeatureValueAction__RequiredValue__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "requiredValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAddStructuralFeatureValueAction__UnlimitedNaturalAndMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "unlimitedNaturalAndMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(writeStructuralFeatureActionEClass, WriteStructuralFeatureAction.class, "WriteStructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteStructuralFeatureAction_Result(), this.getOutputPin(), null, "result", null, 0, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWriteStructuralFeatureAction_Value(), this.getInputPin(), null, "value", null, 0, 1, WriteStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getWriteStructuralFeatureAction__InputPin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWriteStructuralFeatureAction__MultiplicityOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWriteStructuralFeatureAction__TypeOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(structuralFeatureActionEClass, StructuralFeatureAction.class, "StructuralFeatureAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructuralFeatureAction_Object(), this.getInputPin(), null, "object", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStructuralFeatureAction_StructuralFeature(), this.getStructuralFeature(), null, "structuralFeature", null, 1, 1, StructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStructuralFeatureAction__Visibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "visibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStructuralFeatureAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStructuralFeatureAction__NotStatic__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notStatic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStructuralFeatureAction__OneFeaturingClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneFeaturingClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStructuralFeatureAction__SameType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(addVariableValueActionEClass, AddVariableValueAction.class, "AddVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddVariableValueAction_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, AddVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAddVariableValueAction_IsReplaceAll(), thePrimitiveTypesPackage.getBoolean(), "isReplaceAll", "false", 1, 1, AddVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getAddVariableValueAction__SingleInputPin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "singleInputPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAddVariableValueAction__RequiredValue__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "requiredValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(writeVariableActionEClass, WriteVariableAction.class, "WriteVariableAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWriteVariableAction_Value(), this.getInputPin(), null, "value", null, 0, 1, WriteVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getWriteVariableAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getWriteVariableAction__SameType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(variableActionEClass, VariableAction.class, "VariableAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAction_Variable(), this.getVariable(), null, "variable", null, 1, 1, VariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getVariableAction__ScopeOfVariable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "scopeOfVariable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(anyReceiveEventEClass, AnyReceiveEvent.class, "AnyReceiveEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(messageEventEClass, MessageEvent.class, "MessageEvent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(associationClassEClass, AssociationClass.class, "AssociationClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAssociationClass__CannotBeDefined__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cannotBeDefined", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAssociationClass__DisjointAttributesEnds__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "disjointAttributesEnds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(behaviorExecutionSpecificationEClass, BehaviorExecutionSpecification.class, "BehaviorExecutionSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBehaviorExecutionSpecification_Behavior(), this.getBehavior(), null, "behavior", null, 0, 1, BehaviorExecutionSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(broadcastSignalActionEClass, BroadcastSignalAction.class, "BroadcastSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBroadcastSignalAction_Signal(), this.getSignal(), null, "signal", null, 1, 1, BroadcastSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getBroadcastSignalAction__TypeOrderingMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOrderingMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBroadcastSignalAction__NumberAndOrder__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberAndOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(invocationActionEClass, InvocationAction.class, "InvocationAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvocationAction_Argument(), this.getInputPin(), null, "argument", null, 0, -1, InvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvocationAction_OnPort(), this.getPort(), null, "onPort", null, 0, 1, InvocationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getInvocationAction__OnPortReceiver__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "onPortReceiver", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callActionEClass, CallAction.class, "CallAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCallAction_IsSynchronous(), thePrimitiveTypesPackage.getBoolean(), "isSynchronous", "true", 1, 1, CallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCallAction_Result(), this.getOutputPin(), null, "result", null, 0, -1, CallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCallAction__SynchronousCall__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "synchronousCall", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCallAction__NumberAndOrder__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberAndOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCallAction__TypeOrderingMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOrderingMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callBehaviorActionEClass, CallBehaviorAction.class, "CallBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallBehaviorAction_Behavior(), this.getBehavior(), null, "behavior", null, 1, 1, CallBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCallBehaviorAction__ArgumentPinEqualParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "argumentPinEqualParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCallBehaviorAction__ResultPinEqualParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "resultPinEqualParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(callEventEClass, CallEvent.class, "CallEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallEvent_Operation(), this.getOperation(), null, "operation", null, 1, 1, CallEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(callOperationActionEClass, CallOperationAction.class, "CallOperationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallOperationAction_Operation(), this.getOperation(), null, "operation", null, 1, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCallOperationAction_Target(), this.getInputPin(), null, "target", null, 1, 1, CallOperationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCallOperationAction__ArgumentPinEqualParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "argumentPinEqualParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCallOperationAction__TypeTargetPin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeTargetPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCallOperationAction__ResultPinEqualParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "resultPinEqualParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(centralBufferNodeEClass, CentralBufferNode.class, "CentralBufferNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeEventEClass, ChangeEvent.class, "ChangeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChangeEvent_ChangeExpression(), this.getValueSpecification(), null, "changeExpression", null, 1, 1, ChangeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClause_Body(), this.getExecutableNode(), null, "body", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_BodyOutput(), this.getOutputPin(), null, "bodyOutput", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_Decider(), this.getOutputPin(), null, "decider", null, 1, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_PredecessorClause(), this.getClause(), this.getClause_SuccessorClause(), "predecessorClause", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_SuccessorClause(), this.getClause(), this.getClause_PredecessorClause(), "successorClause", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClause_Test(), this.getExecutableNode(), null, "test", null, 1, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getClause__BodyOutputPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "bodyOutputPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClause__TestAndBody__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "testAndBody", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClause__DeciderOutput__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "deciderOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clearAssociationActionEClass, ClearAssociationAction.class, "ClearAssociationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearAssociationAction_Association(), this.getAssociation(), null, "association", null, 1, 1, ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClearAssociationAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ClearAssociationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getClearAssociationAction__SameType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClearAssociationAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clearStructuralFeatureActionEClass, ClearStructuralFeatureAction.class, "ClearStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClearStructuralFeatureAction_Result(), this.getOutputPin(), null, "result", null, 0, 1, ClearStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getClearStructuralFeatureAction__TypeOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getClearStructuralFeatureAction__MultiplicityOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(clearVariableActionEClass, ClearVariableAction.class, "ClearVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(combinedFragmentEClass, CombinedFragment.class, "CombinedFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCombinedFragment_CfragmentGate(), this.getGate(), null, "cfragmentGate", null, 0, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCombinedFragment_InteractionOperator(), this.getInteractionOperatorKind(), "interactionOperator", "seq", 1, 1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCombinedFragment_Operand(), this.getInteractionOperand(), null, "operand", null, 1, -1, CombinedFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getCombinedFragment__MinintAndMaxint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "minintAndMaxint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCombinedFragment__OptLoopBreakNeg__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "optLoopBreakNeg", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCombinedFragment__Break___DiagnosticChain_Map(), ecorePackage.getEBoolean(), "break_", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCombinedFragment__ConsiderAndIgnore__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "considerAndIgnore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(communicationPathEClass, CommunicationPath.class, "CommunicationPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentEClass, Component.class, "Component", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponent_IsIndirectlyInstantiated(), thePrimitiveTypesPackage.getBoolean(), "isIndirectlyInstantiated", "true", 1, 1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_PackagedElement(), this.getPackageableElement(), null, "packagedElement", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_Provided(), this.getInterface(), null, "provided", null, 0, -1, Component.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_Realization(), this.getComponentRealization(), this.getComponentRealization_Abstraction(), "realization", null, 0, -1, Component.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponent_Required(), this.getInterface(), null, "required", null, 0, -1, Component.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getComponent__NoPackagedElements__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noPackagedElements", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getComponent__NoNestedClassifiers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noNestedClassifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getComponent__Provided(), this.getInterface(), "provided", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getComponent__RealizedInterfaces__Classifier(), this.getInterface(), "realizedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "classifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getComponent__Required(), this.getInterface(), "required", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getComponent__UsedInterfaces__Classifier(), this.getInterface(), "usedInterfaces", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getClassifier(), "classifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(componentRealizationEClass, ComponentRealization.class, "ComponentRealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComponentRealization_RealizingClassifier(), this.getClassifier(), null, "realizingClassifier", null, 1, -1, ComponentRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getComponentRealization_Abstraction(), this.getComponent(), this.getComponent_Realization(), "abstraction", null, 0, 1, ComponentRealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conditionalNodeEClass, ConditionalNode.class, "ConditionalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConditionalNode_Clause(), this.getClause(), null, "clause", null, 1, -1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConditionalNode_IsAssured(), thePrimitiveTypesPackage.getBoolean(), "isAssured", "false", 1, 1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConditionalNode_IsDeterminate(), thePrimitiveTypesPackage.getBoolean(), "isDeterminate", "false", 1, 1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getConditionalNode_Result(), this.getOutputPin(), null, "result", null, 0, -1, ConditionalNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getConditionalNode__NoInputPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noInputPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConditionalNode__ResultNoIncoming__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "resultNoIncoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConditionalNode__ClauseNoPredecessor__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "clauseNoPredecessor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConditionalNode__ExecutableNodes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "executableNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConditionalNode__MatchingOutputPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "matchingOutputPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConditionalNode__OneClauseWithExecutableNode__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneClauseWithExecutableNode", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(considerIgnoreFragmentEClass, ConsiderIgnoreFragment.class, "ConsiderIgnoreFragment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsiderIgnoreFragment_Message(), this.getNamedElement(), null, "message", null, 0, -1, ConsiderIgnoreFragment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getConsiderIgnoreFragment__ConsiderOrIgnore__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "considerOrIgnore", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getConsiderIgnoreFragment__Type__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(continuationEClass, Continuation.class, "Continuation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContinuation_Setting(), thePrimitiveTypesPackage.getBoolean(), "setting", "true", 1, 1, Continuation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getContinuation__Global__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "global", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContinuation__FirstOrLastInteractionFragment__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "firstOrLastInteractionFragment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getContinuation__SameName__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameName", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(controlFlowEClass, ControlFlow.class, "ControlFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getControlFlow__ObjectNodes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "objectNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createLinkActionEClass, CreateLinkAction.class, "CreateLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCreateLinkAction__AssociationNotAbstract__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associationNotAbstract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(writeLinkActionEClass, WriteLinkAction.class, "WriteLinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getWriteLinkAction__AllowAccess__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "allowAccess", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkActionEClass, LinkAction.class, "LinkAction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkAction_EndData(), this.getLinkEndData(), null, "endData", null, 2, -1, LinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkAction_InputValue(), this.getInputPin(), null, "inputValue", null, 1, -1, LinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLinkAction__SamePins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "samePins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinkAction__SameAssociation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinkAction__NotStatic__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notStatic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLinkAction__Association(), this.getAssociation(), "association", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(linkEndDataEClass, LinkEndData.class, "LinkEndData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndData_End(), this.getProperty(), null, "end", null, 1, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkEndData_Qualifier(), this.getQualifierValue(), null, "qualifier", null, 0, -1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLinkEndData_Value(), this.getInputPin(), null, "value", null, 0, 1, LinkEndData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLinkEndData__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinkEndData__EndObjectInputPin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "endObjectInputPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinkEndData__PropertyIsAssociationEnd__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "propertyIsAssociationEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinkEndData__SameType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinkEndData__Qualifiers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "qualifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(qualifierValueEClass, QualifierValue.class, "QualifierValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualifierValue_Qualifier(), this.getProperty(), null, "qualifier", null, 1, 1, QualifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getQualifierValue_Value(), this.getInputPin(), null, "value", null, 1, 1, QualifierValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getQualifierValue__TypeOfQualifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOfQualifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQualifierValue__MultiplicityOfQualifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfQualifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getQualifierValue__QualifierAttribute__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "qualifierAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEndCreationDataEClass, LinkEndCreationData.class, "LinkEndCreationData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndCreationData_InsertAt(), this.getInputPin(), null, "insertAt", null, 0, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkEndCreationData_IsReplaceAll(), thePrimitiveTypesPackage.getBoolean(), "isReplaceAll", "false", 1, 1, LinkEndCreationData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLinkEndCreationData__CreateLinkAction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "createLinkAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinkEndCreationData__SingleInputPin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "singleInputPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createLinkObjectActionEClass, CreateLinkObjectAction.class, "CreateLinkObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateLinkObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, CreateLinkObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCreateLinkObjectAction__TypeOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateLinkObjectAction__AssociationClass__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associationClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateLinkObjectAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(createObjectActionEClass, CreateObjectAction.class, "CreateObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCreateObjectAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCreateObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, CreateObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getCreateObjectAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateObjectAction__SameType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateObjectAction__ClassifierNotAbstract__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "classifierNotAbstract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCreateObjectAction__ClassifierNotAssociationClass__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "classifierNotAssociationClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dataStoreNodeEClass, DataStoreNode.class, "DataStoreNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decisionNodeEClass, DecisionNode.class, "DecisionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDecisionNode_DecisionInput(), this.getBehavior(), null, "decisionInput", null, 0, 1, DecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDecisionNode_DecisionInputFlow(), this.getObjectFlow(), null, "decisionInputFlow", null, 0, 1, DecisionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDecisionNode__Edges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDecisionNode__Parameters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "parameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDecisionNode__IncomingObjectOneInputParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "incomingObjectOneInputParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDecisionNode__TwoInputParameters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "twoInputParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDecisionNode__DecisionInputFlowIncoming__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "decisionInputFlowIncoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDecisionNode__IncomingControlOneInputParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "incomingControlOneInputParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDecisionNode__IncomingOutgoingEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "incomingOutgoingEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDecisionNode__ZeroInputParameters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "zeroInputParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(objectFlowEClass, ObjectFlow.class, "ObjectFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectFlow_IsMulticast(), thePrimitiveTypesPackage.getBoolean(), "isMulticast", "false", 1, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getObjectFlow_IsMultireceive(), thePrimitiveTypesPackage.getBoolean(), "isMultireceive", "false", 1, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectFlow_Selection(), this.getBehavior(), null, "selection", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getObjectFlow_Transformation(), this.getBehavior(), null, "transformation", null, 0, 1, ObjectFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getObjectFlow__InputAndOutputParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputAndOutputParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectFlow__Target__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "target", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectFlow__CompatibleTypes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "compatibleTypes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectFlow__TransformationBehaviour__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "transformationBehaviour", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectFlow__IsMulticastOrIsMultireceive__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "isMulticastOrIsMultireceive", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectFlow__NoActions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noActions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectFlow__SelectionBehaviour__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "selectionBehaviour", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getObjectFlow__SameUpperBounds__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameUpperBounds", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(destroyLinkActionEClass, DestroyLinkAction.class, "DestroyLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkEndDestructionDataEClass, LinkEndDestructionData.class, "LinkEndDestructionData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLinkEndDestructionData_DestroyAt(), this.getInputPin(), null, "destroyAt", null, 0, 1, LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLinkEndDestructionData_IsDestroyDuplicates(), thePrimitiveTypesPackage.getBoolean(), "isDestroyDuplicates", "false", 1, 1, LinkEndDestructionData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLinkEndDestructionData__UnlimitedNaturalAndMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "unlimitedNaturalAndMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLinkEndDestructionData__DestroyLinkAction__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "destroyLinkAction", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(destroyObjectActionEClass, DestroyObjectAction.class, "DestroyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDestroyObjectAction_IsDestroyLinks(), thePrimitiveTypesPackage.getBoolean(), "isDestroyLinks", "false", 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDestroyObjectAction_IsDestroyOwnedObjects(), thePrimitiveTypesPackage.getBoolean(), "isDestroyOwnedObjects", "false", 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDestroyObjectAction_Target(), this.getInputPin(), null, "target", null, 1, 1, DestroyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDestroyObjectAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDestroyObjectAction__NoType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(destructionOccurenceSpecificationEClass, DestructionOccurenceSpecification.class, "DestructionOccurenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDestructionOccurenceSpecification__NoOccurrenceSpecificationsBelow__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noOccurrenceSpecificationsBelow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageOccurrenceSpecificationEClass, MessageOccurrenceSpecification.class, "MessageOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNode_NestedNode(), this.getNode(), null, "nestedNode", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getNode__InternalStructure__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "internalStructure", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(durationEClass, Duration.class, "Duration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDuration_Expr(), this.getValueSpecification(), null, "expr", null, 0, 1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDuration_Observation(), this.getObservation(), null, "observation", null, 0, -1, Duration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(observationEClass, Observation.class, "Observation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(durationConstraintEClass, DurationConstraint.class, "DurationConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDurationConstraint_FirstEvent(), thePrimitiveTypesPackage.getBoolean(), "firstEvent", null, 0, 2, DurationConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDurationConstraint__FirstEventMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "firstEventMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(intervalConstraintEClass, IntervalConstraint.class, "IntervalConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(intervalEClass, Interval.class, "Interval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterval_Max(), this.getValueSpecification(), null, "max", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInterval_Min(), this.getValueSpecification(), null, "min", null, 1, 1, Interval.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(durationIntervalEClass, DurationInterval.class, "DurationInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(durationObservationEClass, DurationObservation.class, "DurationObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDurationObservation_Event(), this.getNamedElement(), null, "event", null, 1, 2, DurationObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getDurationObservation_FirstEvent(), thePrimitiveTypesPackage.getBoolean(), "firstEvent", null, 0, 2, DurationObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getDurationObservation__FirstEventMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "firstEventMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(enumerationEClass, Enumeration.class, "Enumeration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumeration_OwnedLiteral(), this.getEnumerationLiteral(), this.getEnumerationLiteral_Enumeration(), "ownedLiteral", null, 0, -1, Enumeration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(enumerationLiteralEClass, EnumerationLiteral.class, "EnumerationLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnumerationLiteral_Enumeration(), this.getEnumeration(), this.getEnumeration_OwnedLiteral(), "enumeration", null, 0, 1, EnumerationLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getEnumerationLiteral__ClassifierEqualsOwningEnumeration__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "classifierEqualsOwningEnumeration", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEnumerationLiteral__Classifier(), this.getEnumeration(), "classifier", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(instanceSpecificationEClass, InstanceSpecification.class, "InstanceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceSpecification_Classifier(), this.getClassifier(), null, "classifier", null, 0, -1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceSpecification_Slot(), this.getSlot(), this.getSlot_OwningInstance(), "slot", null, 0, -1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInstanceSpecification_Specification(), this.getValueSpecification(), null, "specification", null, 0, 1, InstanceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getInstanceSpecification__DeploymentTarget__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "deploymentTarget", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInstanceSpecification__StructuralFeature__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "structuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInstanceSpecification__DefiningFeature__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "definingFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInstanceSpecification__DeploymentArtifact__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "deploymentArtifact", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlot_DefiningFeature(), this.getStructuralFeature(), null, "definingFeature", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSlot_Value(), this.getValueSpecification(), null, "value", null, 0, -1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlot_OwningInstance(), this.getInstanceSpecification(), this.getInstanceSpecification_Slot(), "owningInstance", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(executionEnvironmentEClass, ExecutionEnvironment.class, "ExecutionEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(executionOccurrenceSpecificationEClass, ExecutionOccurrenceSpecification.class, "ExecutionOccurrenceSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExecutionOccurrenceSpecification_Execution(), this.getExecutionSpecification(), null, "execution", null, 1, 1, ExecutionOccurrenceSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expansionNodeEClass, ExpansionNode.class, "ExpansionNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExpansionNode_RegionAsInput(), this.getExpansionRegion(), this.getExpansionRegion_InputElement(), "regionAsInput", null, 0, 1, ExpansionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpansionNode_RegionAsOutput(), this.getExpansionRegion(), this.getExpansionRegion_OutputElement(), "regionAsOutput", null, 0, 1, ExpansionNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExpansionNode__RegionAsInputOrOutput__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "regionAsInputOrOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(expansionRegionEClass, ExpansionRegion.class, "ExpansionRegion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpansionRegion_Mode(), this.getExpansionKind(), "mode", "iterative", 1, 1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpansionRegion_OutputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsOutput(), "outputElement", null, 0, -1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpansionRegion_InputElement(), this.getExpansionNode(), this.getExpansionNode_RegionAsInput(), "inputElement", null, 1, -1, ExpansionRegion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getExpansionRegion__ExpansionNodes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "expansionNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(finalStateEClass, FinalState.class, "FinalState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFinalState__NoRegions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noRegions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFinalState__NoOutgoingTransitions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noOutgoingTransitions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFinalState__NoExitBehavior__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noExitBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFinalState__CannotReferenceSubmachine__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "cannotReferenceSubmachine", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFinalState__NoEntryBehavior__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noEntryBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFinalState__NoStateBehavior__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noStateBehavior", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(flowFinalNodeEClass, FlowFinalNode.class, "FlowFinalNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(forkNodeEClass, ForkNode.class, "ForkNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getForkNode__OneIncomingEdge__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneIncomingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getForkNode__Edges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(functionBehaviorEClass, FunctionBehavior.class, "FunctionBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getFunctionBehavior__OneOutputParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneOutputParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getFunctionBehavior__TypesOfParameters__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typesOfParameters", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(opaqueBehaviorEClass, OpaqueBehavior.class, "OpaqueBehavior", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueBehavior_Body(), thePrimitiveTypesPackage.getString(), "body", null, 0, -1, OpaqueBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOpaqueBehavior_Language(), thePrimitiveTypesPackage.getString(), "language", null, 0, -1, OpaqueBehavior.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(informationFlowEClass, InformationFlow.class, "InformationFlow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationFlow_Conveyed(), this.getClassifier(), null, "conveyed", null, 1, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_InformationSource(), this.getNamedElement(), null, "informationSource", null, 1, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_InformationTarget(), this.getNamedElement(), null, "informationTarget", null, 1, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_Realization(), this.getRelationship(), null, "realization", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_RealizingActivityEdge(), this.getActivityEdge(), null, "realizingActivityEdge", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_RealizingConnector(), this.getConnector(), null, "realizingConnector", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInformationFlow_RealizingMessage(), this.getMessage(), null, "realizingMessage", null, 0, -1, InformationFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getInformationFlow__ConveyClassifiers__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "conveyClassifiers", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationFlow__MustConform__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "mustConform", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationFlow__SourcesAndTargetsKind__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourcesAndTargetsKind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(informationItemEClass, InformationItem.class, "InformationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformationItem_Represented(), this.getClassifier(), null, "represented", null, 0, -1, InformationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getInformationItem__HasNo__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "hasNo", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationItem__SourcesAndTargets__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sourcesAndTargets", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInformationItem__NotInstantiable__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notInstantiable", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(initialNodeEClass, InitialNode.class, "InitialNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getInitialNode__ControlEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "controlEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getInitialNode__NoIncomingEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noIncomingEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(instanceValueEClass, InstanceValue.class, "InstanceValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstanceValue_Instance(), this.getInstanceSpecification(), null, "instance", null, 1, 1, InstanceValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(joinNodeEClass, JoinNode.class, "JoinNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJoinNode_IsCombineDuplicate(), thePrimitiveTypesPackage.getBoolean(), "isCombineDuplicate", "true", 1, 1, JoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getJoinNode_JoinSpec(), this.getValueSpecification(), null, "joinSpec", null, 1, 1, JoinNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getJoinNode__OneOutgoingEdge__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneOutgoingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getJoinNode__IncomingObjectFlow__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "incomingObjectFlow", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(literalBooleanEClass, LiteralBoolean.class, "LiteralBoolean", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralBoolean_Value(), thePrimitiveTypesPackage.getBoolean(), "value", "false", 1, 1, LiteralBoolean.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalSpecificationEClass, LiteralSpecification.class, "LiteralSpecification", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalIntegerEClass, LiteralInteger.class, "LiteralInteger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralInteger_Value(), thePrimitiveTypesPackage.getInteger(), "value", "0", 1, 1, LiteralInteger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalNullEClass, LiteralNull.class, "LiteralNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(literalRealEClass, LiteralReal.class, "LiteralReal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralReal_Value(), thePrimitiveTypesPackage.getReal(), "value", null, 1, 1, LiteralReal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalStringEClass, LiteralString.class, "LiteralString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralString_Value(), thePrimitiveTypesPackage.getString(), "value", null, 0, 1, LiteralString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalUnlimitedNaturalEClass, LiteralUnlimitedNatural.class, "LiteralUnlimitedNatural", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralUnlimitedNatural_Value(), thePrimitiveTypesPackage.getUnlimitedNatural(), "value", "0", 1, 1, LiteralUnlimitedNatural.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(loopNodeEClass, LoopNode.class, "LoopNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoopNode_BodyOutput(), this.getOutputPin(), null, "bodyOutput", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_BodyPart(), this.getExecutableNode(), null, "bodyPart", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_Decider(), this.getOutputPin(), null, "decider", null, 1, 1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLoopNode_IsTestedFirst(), thePrimitiveTypesPackage.getBoolean(), "isTestedFirst", "false", 1, 1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_LoopVariable(), this.getOutputPin(), null, "loopVariable", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_LoopVariableInput(), this.getInputPin(), null, "loopVariableInput", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_Result(), this.getOutputPin(), null, "result", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoopNode_SetupPart(), this.getExecutableNode(), null, "setupPart", null, 0, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLoopNode_Test(), this.getExecutableNode(), null, "test", null, 1, -1, LoopNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getLoopNode__InputEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLoopNode__ResultNoIncoming__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "resultNoIncoming", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLoopNode__ExecutableNodes__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "executableNodes", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLoopNode__BodyOutputPins__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "bodyOutputPins", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mergeNodeEClass, MergeNode.class, "MergeNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getMergeNode__Edges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "edges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getMergeNode__OneOutgoingEdge__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneOutgoingEdge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModel_Viewpoint(), thePrimitiveTypesPackage.getString(), "viewpoint", null, 0, 1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(opaqueActionEClass, OpaqueAction.class, "OpaqueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOpaqueAction_Body(), thePrimitiveTypesPackage.getString(), "body", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueAction_InputValue(), this.getInputPin(), null, "inputValue", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getOpaqueAction_Language(), thePrimitiveTypesPackage.getString(), "language", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOpaqueAction_OutputValue(), this.getOutputPin(), null, "outputValue", null, 0, -1, OpaqueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(protocolTransitionEClass, ProtocolTransition.class, "ProtocolTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProtocolTransition_PostCondition(), this.getConstraint(), null, "postCondition", null, 0, 1, ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProtocolTransition_PreCondition(), this.getConstraint(), null, "preCondition", null, 0, 1, ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getProtocolTransition_Referred(), this.getOperation(), null, "referred", null, 0, -1, ProtocolTransition.class, !IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getProtocolTransition__RefersToOperation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "refersToOperation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProtocolTransition__AssociatedActions__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associatedActions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getProtocolTransition__BelongsToPsm__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "belongsToPsm", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getProtocolTransition__Referred(), this.getOperation(), "referred", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(raiseExceptionActionEClass, RaiseExceptionAction.class, "RaiseExceptionAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRaiseExceptionAction_Exception(), this.getInputPin(), null, "exception", null, 1, 1, RaiseExceptionAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readExtentActionEClass, ReadExtentAction.class, "ReadExtentAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadExtentAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, ReadExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadExtentAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadExtentAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReadExtentAction__MultiplicityOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadExtentAction__TypeIsClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeIsClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readIsClassifiedObjectActionEClass, ReadIsClassifiedObjectAction.class, "ReadIsClassifiedObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadIsClassifiedObjectAction_Classifier(), this.getClassifier(), null, "classifier", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReadIsClassifiedObjectAction_IsDirect(), thePrimitiveTypesPackage.getBoolean(), "isDirect", "false", 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadIsClassifiedObjectAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadIsClassifiedObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReadIsClassifiedObjectAction__BooleanResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "booleanResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadIsClassifiedObjectAction__MultiplicityOfInput__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfInput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadIsClassifiedObjectAction__NoType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadIsClassifiedObjectAction__MultiplicityOfOutput__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readLinkActionEClass, ReadLinkAction.class, "ReadLinkAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReadLinkAction__CompatibleMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "compatibleMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkAction__NavigableOpenEnd__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "navigableOpenEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkAction__TypeAndOrdering__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeAndOrdering", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkAction__OneOpenEnd__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "oneOpenEnd", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkAction__Visibility__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "visibility", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readLinkObjectEndActionEClass, ReadLinkObjectEndAction.class, "ReadLinkObjectEndAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkObjectEndAction_End(), this.getProperty(), null, "end", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkObjectEndAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndAction__AssociationOfAssociation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associationOfAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndAction__TypeOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndAction__Property__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "property", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndAction__EndsOfAssociation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "endsOfAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndAction__MultiplicityOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndAction__MultiplicityOfObject__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndAction__TypeOfObject__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOfObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readLinkObjectEndQualifierActionEClass, ReadLinkObjectEndQualifierAction.class, "ReadLinkObjectEndQualifierAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadLinkObjectEndQualifierAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndQualifierAction_Qualifier(), this.getProperty(), null, "qualifier", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReadLinkObjectEndQualifierAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadLinkObjectEndQualifierAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndQualifierAction__MultiplicityOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndQualifierAction__TypeOfObject__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOfObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndQualifierAction__SameType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndQualifierAction__QualifierAttribute__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "qualifierAttribute", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndQualifierAction__MultiplicityOfQualifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfQualifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndQualifierAction__EndsOfAssociation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "endsOfAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndQualifierAction__MultiplicityOfObject__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadLinkObjectEndQualifierAction__AssociationOfAssociation__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "associationOfAssociation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readSelfActionEClass, ReadSelfAction.class, "ReadSelfAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadSelfAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadSelfAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReadSelfAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadSelfAction__NotStatic__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "notStatic", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadSelfAction__Type__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "type", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadSelfAction__Contained__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "contained", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readStructuralFeatureActionEClass, ReadStructuralFeatureAction.class, "ReadStructuralFeatureAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadStructuralFeatureAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadStructuralFeatureAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReadStructuralFeatureAction__TypeAndOrdering__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeAndOrdering", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(readVariableActionEClass, ReadVariableAction.class, "ReadVariableAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadVariableAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReadVariableAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReadVariableAction__CompatibleMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "compatibleMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReadVariableAction__TypeAndOrdering__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeAndOrdering", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reclassifyObjectActionEClass, ReclassifyObjectAction.class, "ReclassifyObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReclassifyObjectAction_IsReplaceAll(), thePrimitiveTypesPackage.getBoolean(), "isReplaceAll", "false", 1, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_NewClassifier(), this.getClassifier(), null, "newClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_Object(), this.getInputPin(), null, "object", null, 1, 1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReclassifyObjectAction_OldClassifier(), this.getClassifier(), null, "oldClassifier", null, 0, -1, ReclassifyObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReclassifyObjectAction__InputPin__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputPin", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReclassifyObjectAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReclassifyObjectAction__ClassifierNotAbstract__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "classifierNotAbstract", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(reduceActionEClass, ReduceAction.class, "ReduceAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReduceAction_Collection(), this.getInputPin(), null, "collection", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReduceAction_IsOrdered(), thePrimitiveTypesPackage.getBoolean(), "isOrdered", "false", 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReduceAction_Reducer(), this.getBehavior(), null, "reducer", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReduceAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ReduceAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReduceAction__OutputTypesAreCompatible__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "outputTypesAreCompatible", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReduceAction__ReducerInputsOutput__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "reducerInputsOutput", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReduceAction__InputTypeIsCollection__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "inputTypeIsCollection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(removeStructuralFeatureValueActionEClass, RemoveStructuralFeatureValueAction.class, "RemoveStructuralFeatureValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveStructuralFeatureValueAction_IsRemoveDuplicates(), thePrimitiveTypesPackage.getBoolean(), "isRemoveDuplicates", "false", 1, 1, RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRemoveStructuralFeatureValueAction_RemoveAt(), this.getInputPin(), null, "removeAt", null, 0, 1, RemoveStructuralFeatureValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRemoveStructuralFeatureValueAction__NonUniqueRemoval__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "nonUniqueRemoval", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(removeVariableValueActionEClass, RemoveVariableValueAction.class, "RemoveVariableValueAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveVariableValueAction_IsRemoveDuplicates(), thePrimitiveTypesPackage.getBoolean(), "isRemoveDuplicates", "false", 1, 1, RemoveVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRemoveVariableValueAction_RemoveAt(), this.getInputPin(), null, "removeAt", null, 0, 1, RemoveVariableValueAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getRemoveVariableValueAction__UnlimitedNatural__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "unlimitedNatural", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(replyActionEClass, ReplyAction.class, "ReplyAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReplyAction_ReplyToCall(), this.getTrigger(), null, "replyToCall", null, 1, 1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReplyAction_ReplyValue(), this.getInputPin(), null, "replyValue", null, 0, -1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReplyAction_ReturnInformation(), this.getInputPin(), null, "returnInformation", null, 1, 1, ReplyAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getReplyAction__PinsMatchParameter__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "pinsMatchParameter", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getReplyAction__EventOnReplyToCallTrigger__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "eventOnReplyToCallTrigger", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sendObjectActionEClass, SendObjectAction.class, "SendObjectAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendObjectAction_Request(), this.getInputPin(), null, "request", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendObjectAction_Target(), this.getInputPin(), null, "target", null, 1, 1, SendObjectAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sendSignalActionEClass, SendSignalAction.class, "SendSignalAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendSignalAction_Signal(), this.getSignal(), null, "signal", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendSignalAction_Target(), this.getInputPin(), null, "target", null, 1, 1, SendSignalAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getSendSignalAction__NumberOrder__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOrder", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSendSignalAction__TypeOrderingMultiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOrderingMultiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sequenceNodeEClass, SequenceNode.class, "SequenceNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSequenceNode_ExecutableNode(), this.getExecutableNode(), null, "executableNode", null, 0, -1, SequenceNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalEventEClass, SignalEvent.class, "SignalEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSignalEvent_Signal(), this.getSignal(), null, "signal", null, 1, 1, SignalEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startClassifierBehaviorActionEClass, StartClassifierBehaviorAction.class, "StartClassifierBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartClassifierBehaviorAction_Object(), this.getInputPin(), null, "object", null, 1, 1, StartClassifierBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStartClassifierBehaviorAction__TypeHasClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeHasClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStartClassifierBehaviorAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(startObjectBehaviorActionEClass, StartObjectBehaviorAction.class, "StartObjectBehaviorAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartObjectBehaviorAction_Object(), this.getInputPin(), null, "object", null, 1, 1, StartObjectBehaviorAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getStartObjectBehaviorAction__NumberOrderResults__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOrderResults", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStartObjectBehaviorAction__TypeOrderingMultiplicityMatch__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOrderingMultiplicityMatch", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStartObjectBehaviorAction__TypeOfObject__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeOfObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStartObjectBehaviorAction__MultiplicityOfObject__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getStartObjectBehaviorAction__NumberOrderArguments__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOrderArguments", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(stateInvariantEClass, StateInvariant.class, "StateInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStateInvariant_Invariant(), this.getConstraint(), null, "invariant", null, 1, 1, StateInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testIdentityActionEClass, TestIdentityAction.class, "TestIdentityAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestIdentityAction_First(), this.getInputPin(), null, "first", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestIdentityAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestIdentityAction_Second(), this.getInputPin(), null, "second", null, 1, 1, TestIdentityAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTestIdentityAction__NoType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTestIdentityAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTestIdentityAction__ResultIsBoolean__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "resultIsBoolean", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeConstraintEClass, TimeConstraint.class, "TimeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeConstraint_FirstEvent(), thePrimitiveTypesPackage.getBoolean(), "firstEvent", "true", 0, 1, TimeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeIntervalEClass, TimeInterval.class, "TimeInterval", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(timeExpressionEClass, TimeExpression.class, "TimeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeExpression_Expr(), this.getValueSpecification(), null, "expr", null, 0, 1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeExpression_Observation(), this.getObservation(), null, "observation", null, 0, -1, TimeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeEventEClass, TimeEvent.class, "TimeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimeEvent_IsRelative(), thePrimitiveTypesPackage.getBoolean(), "isRelative", "false", 1, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTimeEvent_When(), this.getTimeExpression(), null, "when", null, 1, 1, TimeEvent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getTimeEvent__WhenNonNegative__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "whenNonNegative", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTimeEvent__StartingTime__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "startingTime", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(timeObservationEClass, TimeObservation.class, "TimeObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeObservation_Event(), this.getNamedElement(), null, "event", null, 1, 1, TimeObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTimeObservation_FirstEvent(), thePrimitiveTypesPackage.getBoolean(), "firstEvent", "true", 1, 1, TimeObservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(unmarshallActionEClass, UnmarshallAction.class, "UnmarshallAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnmarshallAction_Object(), this.getInputPin(), null, "object", null, 1, 1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnmarshallAction_Result(), this.getOutputPin(), null, "result", null, 1, -1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUnmarshallAction_UnmarshallType(), this.getClassifier(), null, "unmarshallType", null, 1, 1, UnmarshallAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getUnmarshallAction__MultiplicityOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUnmarshallAction__MultiplicityOfObject__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicityOfObject", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUnmarshallAction__StructuralFeature__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "structuralFeature", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUnmarshallAction__NumberOfResult__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "numberOfResult", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUnmarshallAction__UnmarshallTypeIsClassifier__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "unmarshallTypeIsClassifier", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUnmarshallAction__SameType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "sameType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUnmarshallAction__TypeAndOrdering__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "typeAndOrdering", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(usageEClass, Usage.class, "Usage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(valuePinEClass, ValuePin.class, "ValuePin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValuePin_Value(), this.getValueSpecification(), null, "value", null, 1, 1, ValuePin.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getValuePin__NoIncomingEdges__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "noIncomingEdges", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValuePin__CompatibleType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "compatibleType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(valueSpecificationActionEClass, ValueSpecificationAction.class, "ValueSpecificationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueSpecificationAction_Result(), this.getOutputPin(), null, "result", null, 1, 1, ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValueSpecificationAction_Value(), this.getValueSpecification(), null, "value", null, 1, 1, ValueSpecificationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getValueSpecificationAction__Multiplicity__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "multiplicity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getValueSpecificationAction__CompatibleType__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "compatibleType", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParamPackageContents(op, 0, 1, IS_UNIQUE, IS_ORDERED);
		
		// Initialize enums and add enum literals
		initEnumsPackageContents();

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// subsets
		createSubsetsAnnotations();
		// union
		createUnionAnnotations();
		// http://www.eclipse.org/uml2/1.1.0/GenModel
		createGenModel_1Annotations();
		// duplicates
		createDuplicatesAnnotations();
		// redefines
		createRedefinesAnnotations();
	}

	/**
	 * Initializes the annotations for <b>subsets</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSubsetsAnnotations() {
		String source = "subsets";	
		addAnnotation
		  (getAbstraction_Mapping(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getDependency_Client(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source")
		   });	
		addAnnotation
		  (getDependency_Supplier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });	
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });	
		addAnnotation
		  (getElement_OwnedComment(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getParameterableElement_OwningTemplateParameter(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ParameterableElement/templateParameter"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getTemplateParameter_OwnedDefault(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//TemplateParameter/default"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTemplateParameter_Signature(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getTemplateParameter_OwnedParameteredElement(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//TemplateParameter/parameteredElement"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTemplateSignature_Template(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getTemplateSignature_OwnedParameter(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//TemplateSignature/parameter"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTemplateableElement_TemplateBinding(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTemplateableElement_OwnedTemplateSignature(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTemplateBinding_ParameterSubstitution(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTemplateBinding_Signature(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getTemplateBinding_BoundElement(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getTemplateParameterSubstitution_OwnedActual(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//TemplateParameterSubstitution/actual"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTemplateParameterSubstitution_TemplateBinding(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getNamedElement_NameExpression(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getNamedElement_Namespace(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getStringExpression_OwningExpression(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getStringExpression_SubExpression(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getExpression_Operand(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getPackage_NestedPackage(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/packagedElement")
		   });	
		addAnnotation
		  (getPackage_OwnedStereotype(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/packagedElement")
		   });	
		addAnnotation
		  (getPackage_PackageMerge(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getPackage_PackagedElement(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getPackage_ProfileApplication(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getPackage_OwnedType(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Package/packagedElement")
		   });	
		addAnnotation
		  (getNamespace_ElementImport(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getNamespace_ImportedMember(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });	
		addAnnotation
		  (getNamespace_OwnedMember(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getNamespace_OwnedRule(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getNamespace_PackageImport(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getElementImport_ImportedElement(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getElementImport_ImportingNamespace(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getConstraint_Specification(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getConstraint_Context(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getPackageImport_ImportedPackage(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getPackageImport_ImportingNamespace(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getStereotype_Icon(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getClass_OwnedOperation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getClass_NestedClassifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getClass_OwnedReception(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getBehavioredClassifier_ClassifierBehavior(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//BehavioredClassifier/ownedBehavior")
		   });	
		addAnnotation
		  (getBehavioredClassifier_InterfaceRealization(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/clientDependency"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getBehavioredClassifier_OwnedBehavior(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature")
		   });	
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });	
		addAnnotation
		  (getClassifier_CollaborationUse(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getClassifier_Generalization(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getClassifier_InheritedMember(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });	
		addAnnotation
		  (getClassifier_OwnedUseCase(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getClassifier_RedefinedClassifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getClassifier_Representation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/collaborationUse")
		   });	
		addAnnotation
		  (getClassifier_Substitution(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/clientDependency"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getProperty_Datatype(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getProperty_Interface(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getProperty_OwningAssociation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1"),
			 URI.createURI(eNS_URI).appendFragment("//Feature/featuringClassifier"),
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinitionContext"),
			 URI.createURI(eNS_URI).appendFragment("//Property/association")
		   });	
		addAnnotation
		  (getProperty_AssociationEnd(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getProperty_Qualifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getProperty_Class(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getProperty_DefaultValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getProperty_RedefinedProperty(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getMultiplicityElement_LowerValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getMultiplicityElement_UpperValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getDeploymentTarget_Deployment(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/clientDependency"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getDeployment_Configuration(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getDeployment_DeployedArtifact(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/supplier")
		   });	
		addAnnotation
		  (getDeployment_Location(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/client"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getDeploymentSpecification_Deployment(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getArtifact_Manifestation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/clientDependency"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getArtifact_NestedArtifact(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getArtifact_OwnedAttribute(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/attribute"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getArtifact_OwnedOperation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getManifestation_UtilizedElement(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/supplier")
		   });	
		addAnnotation
		  (getOperation_BodyCondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedRule")
		   });	
		addAnnotation
		  (getOperation_Class(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1"),
			 URI.createURI(eNS_URI).appendFragment("//Feature/featuringClassifier"),
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinitionContext")
		   });	
		addAnnotation
		  (getOperation_Datatype(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1"),
			 URI.createURI(eNS_URI).appendFragment("//Feature/featuringClassifier"),
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinitionContext")
		   });	
		addAnnotation
		  (getOperation_Interface(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1"),
			 URI.createURI(eNS_URI).appendFragment("//Feature/featuringClassifier"),
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinitionContext")
		   });	
		addAnnotation
		  (getOperation_Postcondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedRule")
		   });	
		addAnnotation
		  (getOperation_Precondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedRule")
		   });	
		addAnnotation
		  (getOperation_RedefinedOperation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getBehavioralFeature_OwnedParameter(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getBehavioralFeature_OwnedParameterSet(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getBehavior_Context(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinitionContext")
		   });	
		addAnnotation
		  (getBehavior_OwnedParameter(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getBehavior_OwnedParameterSet(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getBehavior_Postcondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedRule")
		   });	
		addAnnotation
		  (getBehavior_Precondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedRule")
		   });	
		addAnnotation
		  (getBehavior_RedefinedBehavior(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/redefinedClassifier")
		   });	
		addAnnotation
		  (getParameter_DefaultValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getParameterSet_Condition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getDataType_OwnedAttribute(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/attribute"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getDataType_OwnedOperation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInterface_NestedClassifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInterface_OwnedAttribute(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/attribute"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInterface_OwnedReception(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInterface_Protocol(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInterface_RedefinedInterface(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/redefinedClassifier")
		   });	
		addAnnotation
		  (getInterface_OwnedOperation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getSignal_OwnedAttribute(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/attribute"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getProtocolStateMachine_Conformance(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getStateMachine_ConnectionPoint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getStateMachine_Region(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getPseudostate_State(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getPseudostate_StateMachine(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getVertex_Container(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getRegion_ExtendedRegion(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getRegion_State(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getRegion_StateMachine(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getRegion_Transition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getRegion_Subvertex(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getState_Connection(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getState_ConnectionPoint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getState_DeferrableTrigger(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getState_DoActivity(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getState_Entry(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getState_Exit(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getState_RedefinedState(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getState_StateInvariant(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedRule")
		   });	
		addAnnotation
		  (getState_Region(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getConnectionPointReference_State(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getPort_RedefinedPort(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Property/redefinedProperty")
		   });	
		addAnnotation
		  (getTransition_Effect(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTransition_Guard(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedRule")
		   });	
		addAnnotation
		  (getTransition_RedefinedTransition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getTransition_Trigger(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTransition_Container(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getProtocolConformance_GeneralMachine(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getProtocolConformance_SpecificMachine(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getAssociation_EndType(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Relationship/relatedElement")
		   });	
		addAnnotation
		  (getAssociation_NavigableOwnedEnd(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Association/ownedEnd")
		   });	
		addAnnotation
		  (getAssociation_OwnedEnd(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Association/memberEnd"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getAssociation_MemberEnd(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });	
		addAnnotation
		  (getCollaborationUse_RoleBinding(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getCollaboration_CollaborationRole(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StructuredClassifier/role")
		   });	
		addAnnotation
		  (getStructuredClassifier_OwnedAttribute(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/attribute"),
			 URI.createURI(eNS_URI).appendFragment("//StructuredClassifier/role"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getStructuredClassifier_OwnedConnector(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/feature"),
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getStructuredClassifier_Role(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/member")
		   });	
		addAnnotation
		  (getConnector_End(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getConnector_RedefinedConnector(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getGeneralization_General(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getGeneralization_Specific(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_ExtendedSignature(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_InheritedParameter(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//TemplateSignature/parameter")
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_Classifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinitionContext")
		   });	
		addAnnotation
		  (getUseCase_Extend(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getUseCase_ExtensionPoint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getUseCase_Include(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getExtend_Condition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getExtend_ExtendedCase(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getExtend_Extension(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1"),
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source")
		   });	
		addAnnotation
		  (getExtensionPoint_UseCase(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getInclude_Addition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getInclude_IncludingCase(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1"),
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source")
		   });	
		addAnnotation
		  (getSubstitution_Contract(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/supplier")
		   });	
		addAnnotation
		  (getSubstitution_SubstitutingClassifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/client"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getInterfaceRealization_Contract(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/supplier")
		   });	
		addAnnotation
		  (getInterfaceRealization_ImplementingClassifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/client"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getEncapsulatedClassifier_OwnedPort(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StructuredClassifier/ownedAttribute")
		   });	
		addAnnotation
		  (getProfile_MetaclassReference(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/elementImport")
		   });	
		addAnnotation
		  (getProfile_MetamodelReference(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/packageImport")
		   });	
		addAnnotation
		  (getPackageMerge_MergedPackage(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getPackageMerge_ReceivingPackage(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getProfileApplication_AppliedProfile(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getProfileApplication_ApplyingPackage(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getAcceptCallAction_ReturnInformation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getAcceptEventAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getAcceptEventAction_Trigger(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getAction_Input(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getAction_LocalPostcondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getAction_LocalPrecondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getAction_Output(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getExecutableNode_Handler(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getActivityNode_Activity(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getActivityNode_InPartition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityNode/inGroup")
		   });	
		addAnnotation
		  (getActivityNode_InStructuredNode(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityNode/inGroup"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getActivityNode_InInterruptibleRegion(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityNode/inGroup")
		   });	
		addAnnotation
		  (getActivityNode_RedefinedNode(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getActivity_Edge(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getActivity_Group(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getActivity_StructuredNode(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Activity/node"),
			 URI.createURI(eNS_URI).appendFragment("//Activity/group")
		   });	
		addAnnotation
		  (getActivity_Variable(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getActivity_Partition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Activity/group")
		   });	
		addAnnotation
		  (getActivity_Node(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getActivityEdge_Guard(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getActivityEdge_InPartition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityEdge/inGroup")
		   });	
		addAnnotation
		  (getActivityEdge_InStructuredNode(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner"),
			 URI.createURI(eNS_URI).appendFragment("//ActivityEdge/inGroup")
		   });	
		addAnnotation
		  (getActivityEdge_RedefinedEdge(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/redefinedElement")
		   });	
		addAnnotation
		  (getActivityEdge_Weight(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getActivityEdge_Activity(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getActivityGroup_InActivity(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getActivityGroup_Subgroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getActivityPartition_Node(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityGroup/containedNode")
		   });	
		addAnnotation
		  (getActivityPartition_Subpartition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityGroup/subgroup")
		   });	
		addAnnotation
		  (getActivityPartition_SuperPartition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityGroup/superGroup")
		   });	
		addAnnotation
		  (getActivityPartition_Edge(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityGroup/containedEdge")
		   });	
		addAnnotation
		  (getStructuredActivityNode_Node(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityGroup/containedNode"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getStructuredActivityNode_StructuredNodeInput(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getStructuredActivityNode_StructuredNodeOutput(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getStructuredActivityNode_Variable(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getStructuredActivityNode_Edge(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityGroup/containedEdge"),
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getVariable_ActivityScope(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getVariable_Scope(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getInterruptibleActivityRegion_Node(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ActivityGroup/containedNode")
		   });	
		addAnnotation
		  (getExceptionHandler_ProtectedNode(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getInteractionFragment_EnclosingInteraction(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getInteractionFragment_EnclosingOperand(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getInteractionFragment_GeneralOrdering(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getLifeline_Interaction(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getLifeline_Selector(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getInteractionUse_ActualGate(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getInteractionUse_Argument(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getInteractionUse_ReturnValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getMessage_Argument(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getMessage_Interaction(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getInteraction_Action(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getInteraction_FormalGate(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInteraction_Fragment(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInteraction_Lifeline(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInteraction_Message(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInteractionOperand_Guard(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getInteractionOperand_Fragment(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getInteractionConstraint_Maxint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getInteractionConstraint_Minint(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getActionInputPin_FromAction(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getAddStructuralFeatureValueAction_InsertAt(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction_Value(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getStructuralFeatureAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getAddVariableValueAction_InsertAt(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getWriteVariableAction_Value(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getInvocationAction_Argument(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getCallAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getCallOperationAction_Target(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getChangeEvent_ChangeExpression(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getClearAssociationAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getClearStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getCombinedFragment_CfragmentGate(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getCombinedFragment_Operand(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getComponent_PackagedElement(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getComponent_Realization(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getComponentRealization_RealizingClassifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/client")
		   });	
		addAnnotation
		  (getComponentRealization_Abstraction(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Dependency/supplier"),
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getConditionalNode_Clause(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getLinkAction_EndData(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getLinkAction_InputValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getLinkEndData_Qualifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getCreateLinkObjectAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getCreateObjectAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getDestroyObjectAction_Target(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getNode_NestedNode(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getDuration_Expr(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getEnumeration_OwnedLiteral(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedMember.1")
		   });	
		addAnnotation
		  (getEnumerationLiteral_Enumeration(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NamedElement/namespace.1")
		   });	
		addAnnotation
		  (getInstanceSpecification_Slot(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getInstanceSpecification_Specification(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getSlot_Value(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getSlot_OwningInstance(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/owner")
		   });	
		addAnnotation
		  (getInformationFlow_InformationSource(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/source")
		   });	
		addAnnotation
		  (getInformationFlow_InformationTarget(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DirectedRelationship/target")
		   });	
		addAnnotation
		  (getJoinNode_JoinSpec(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getOpaqueAction_InputValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getOpaqueAction_OutputValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getProtocolTransition_PostCondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Namespace/ownedRule")
		   });	
		addAnnotation
		  (getProtocolTransition_PreCondition(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Transition/guard")
		   });	
		addAnnotation
		  (getRaiseExceptionAction_Exception(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getReadExtentAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getReadLinkAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getReadSelfAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getReadStructuralFeatureAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getReadVariableAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getReclassifyObjectAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getReduceAction_Collection(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getReduceAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getRemoveStructuralFeatureValueAction_RemoveAt(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getRemoveVariableValueAction_RemoveAt(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getReplyAction_ReplyValue(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getReplyAction_ReturnInformation(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getSendObjectAction_Target(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getSendSignalAction_Target(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getStartClassifierBehaviorAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getStateInvariant_Invariant(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTestIdentityAction_First(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getTestIdentityAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getTestIdentityAction_Second(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getTimeExpression_Expr(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getTimeEvent_When(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getUnmarshallAction_Object(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/input")
		   });	
		addAnnotation
		  (getUnmarshallAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getValuePin_Value(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });	
		addAnnotation
		  (getValueSpecificationAction_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Action/output")
		   });	
		addAnnotation
		  (getValueSpecificationAction_Value(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Element/ownedElement")
		   });
	}

	/**
	 * Initializes the annotations for <b>union</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUnionAnnotations() {
		String source = "union";	
		addAnnotation
		  (getDirectedRelationship_Source(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getDirectedRelationship_Target(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRelationship_RelatedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElement_OwnedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getElement_Owner(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamedElement_Namespace(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_Member(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getNamespace_OwnedMember(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Attribute(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getClassifier_Feature(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRedefinableElement_RedefinedElement(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getRedefinableElement_RedefinitionContext(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getFeature_FeaturingClassifier(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getStructuredClassifier_Role(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAction_Input(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getAction_Output(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityNode_InGroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityEdge_InGroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_ContainedNode(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_Subgroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_SuperGroup(), 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getActivityGroup_ContainedEdge(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/1.1.0/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModel_1Annotations() {
		String source = "http://www.eclipse.org/uml2/1.1.0/GenModel";	
		addAnnotation
		  (getElement__NotOwnSelf__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not self.allOwnedElements()->includes(self)"
		   });	
		addAnnotation
		  (getElement__HasOwner__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.mustBeOwned() implies owner->notEmpty()"
		   });	
		addAnnotation
		  (getElement__AllOwnedElements(), 
		   source, 
		   new String[] {
			 "body", "result = ownedElement->union(ownedElement->collect(e | e.allOwnedElements()))"
		   });	
		addAnnotation
		  (getElement__MustBeOwned(), 
		   source, 
		   new String[] {
			 "body", "result = true"
		   });	
		addAnnotation
		  (getParameterableElement__IsCompatibleWith__ParameterableElement(), 
		   source, 
		   new String[] {
			 "body", "result = p->oclIsKindOf(self.oclType)"
		   });	
		addAnnotation
		  (getParameterableElement__IsTemplateParameter(), 
		   source, 
		   new String[] {
			 "body", "result = templateParameter->notEmpty()"
		   });	
		addAnnotation
		  (getTemplateParameter__MustBeCompatible__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "default->notEmpty() implies default->isCompatibleWith(parameteredElement)"
		   });	
		addAnnotation
		  (getTemplateSignature__OwnElements__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "templatedElement.ownedElement->includesAll(parameter.parameteredElement - parameter.ownedParameteredElement)"
		   });	
		addAnnotation
		  (getTemplateableElement__IsTemplate(), 
		   source, 
		   new String[] {
			 "body", "result = ownedTemplateSignature->notEmpty()"
		   });	
		addAnnotation
		  (getTemplateableElement__ParameterableElements(), 
		   source, 
		   new String[] {
			 "body", "result = allOwnedElements->select(oclIsKindOf(ParameterableElement))"
		   });	
		addAnnotation
		  (getTemplateBinding__OneParameterSubstitution__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "template.parameter->forAll(p | parameterSubstitution->select(b | b.formal = p)->size() <= 1)"
		   });	
		addAnnotation
		  (getTemplateBinding__ParameterSubstitutionFormal__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "parameterSubstitution->forAll(b | template.parameter->includes(b.formal))"
		   });	
		addAnnotation
		  (getTemplateParameterSubstitution__MustBeCompatible__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "actual->forAll(a | a.isCompatibleWith(formal.parameteredElement))"
		   });	
		addAnnotation
		  (getNamedElement__HasQualifiedName__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()) implies\n  self.qualifiedName = self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))"
		   });	
		addAnnotation
		  (getNamedElement__HasNoQualifiedName__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.name->isEmpty() or self.allNamespaces()->select(ns | ns.name->isEmpty())->notEmpty())\r\n  implies self.qualifiedName->isEmpty()"
		   });	
		addAnnotation
		  (getNamedElement__VisibilityNeedsOwnership__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "namespace->isEmpty() implies visibility->isEmpty()"
		   });	
		addAnnotation
		  (getNamedElement__AllNamespaces(), 
		   source, 
		   new String[] {
			 "body", "result = if self.namespace->isEmpty()\nthen Sequence{}\nelse self.namespace.allNamespaces()->prepend(self.namespace)\nendif"
		   });	
		addAnnotation
		  (getNamedElement__AllOwningPackages(), 
		   source, 
		   new String[] {
			 "body", "result = self.namespace->select(p | p.oclIsKindOf(Package))->union(p.allOwningPackages())"
		   });	
		addAnnotation
		  (getNamedElement__IsDistinguishableFrom__NamedElement_Namespace(), 
		   source, 
		   new String[] {
			 "body", "result = if self.oclIsKindOf(n.oclType) or n.oclIsKindOf(self.oclType)\nthen ns.getNamesOfMember(self)->intersection(ns.getNamesOfMember(n))->isEmpty()\nelse true\nendif"
		   });	
		addAnnotation
		  (getNamedElement__Namespace(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getNamedElement__QualifiedName(), 
		   source, 
		   new String[] {
			 "body", "result = if self.name->notEmpty() and self.allNamespaces()->select(ns | ns.name->isEmpty())->isEmpty()\nthen \n    self.allNamespaces()->iterate( ns : Namespace; result: String = self.name | ns.name->union(self.separator())->union(result))\nelse\n    Set{}\nendif"
		   });	
		addAnnotation
		  (getNamedElement__Separator(), 
		   source, 
		   new String[] {
			 "body", "result = \'::\'"
		   });	
		addAnnotation
		  (getStringExpression__Subexpressions__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if subExpression->notEmpty() then operand->isEmpty() else operand->notEmpty()"
		   });	
		addAnnotation
		  (getStringExpression__Operands__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "operand->forAll (op | op.oclIsKindOf (LiteralString))"
		   });	
		addAnnotation
		  (getValueSpecification__BooleanValue(), 
		   source, 
		   new String[] {
			 "body", "result = Set{}"
		   });	
		addAnnotation
		  (getValueSpecification__IntegerValue(), 
		   source, 
		   new String[] {
			 "body", "result = Set{}"
		   });	
		addAnnotation
		  (getValueSpecification__IsComputable(), 
		   source, 
		   new String[] {
			 "body", "result = false"
		   });	
		addAnnotation
		  (getValueSpecification__IsNull(), 
		   source, 
		   new String[] {
			 "body", "result = false"
		   });	
		addAnnotation
		  (getValueSpecification__RealValue(), 
		   source, 
		   new String[] {
			 "body", "result = Set{}"
		   });	
		addAnnotation
		  (getValueSpecification__StringValue(), 
		   source, 
		   new String[] {
			 "body", "result = Set{}"
		   });	
		addAnnotation
		  (getValueSpecification__UnlimitedValue(), 
		   source, 
		   new String[] {
			 "body", "result = Set{}"
		   });	
		addAnnotation
		  (getType__ConformsTo__Type(), 
		   source, 
		   new String[] {
			 "body", "result = false"
		   });	
		addAnnotation
		  (getPackage__ElementsPublicOrPrivate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.ownedElements->forAll(e | e.visibility->notEmpty() implies e.visbility = #public or e.visibility = #private)"
		   });	
		addAnnotation
		  (getPackage__AllApplicableStereotypes(), 
		   source, 
		   new String[] {
			 "body", "result = \r\nself.ownedStereotype->union(self.ownedMember->\r\n\tselect(oclIsKindOf(Package)).oclAsType(Package).allApplicableStereotypes()->flatten())->asSet()"
		   });	
		addAnnotation
		  (getPackage__ContainingProfile(), 
		   source, 
		   new String[] {
			 "body", "result =\r\nif self.oclIsKindOf(Profile) then \r\n\tself.oclAsType(Profile)\r\nelse\r\n\tself.namespace.oclAsType(Package).containingProfile()\r\nendif"
		   });	
		addAnnotation
		  (getPackage__MakesVisible__NamedElement(), 
		   source, 
		   new String[] {
			 "body", "result = (ownedMember->includes(el)) or\n(elementImport->select(ei|ei.importedElement = #public)->collect(ei|ei.importedElement)->includes(el)) or\n(packageImport->select(pi|pi.visibility = #public)->collect(pi|pi.importedPackage.member->includes(el))->notEmpty())"
		   });	
		addAnnotation
		  (getPackage__NestedPackage(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPackage__OwnedStereotype(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPackage__OwnedType(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPackage__VisibleMembers(), 
		   source, 
		   new String[] {
			 "body", "result = member->select( m | self.makesVisible(m))"
		   });	
		addAnnotation
		  (getNamespace__MembersDistinguishable__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "membersAreDistinguishable()"
		   });	
		addAnnotation
		  (getNamespace__ExcludeCollisions__EList(), 
		   source, 
		   new String[] {
			 "body", "result = imps->reject(imp1 | imps.exists(imp2 | not imp1.isDistinguishableFrom(imp2, self)))"
		   });	
		addAnnotation
		  (getNamespace__GetNamesOfMember__NamedElement(), 
		   source, 
		   new String[] {
			 "body", "result = if self.ownedMember ->includes(element)\nthen Set{}->include(element.name)\nelse let elementImports: ElementImport = self.elementImport->select(ei | ei.importedElement = element) in\n  if elementImports->notEmpty()\n  then elementImports->collect(el | el.getName())\n  else self.packageImport->select(pi | pi.importedPackage.visibleMembers()->includes(element))-> collect(pi | pi.importedPackage.getNamesOfMember(element))\n  endif\nendif"
		   });	
		addAnnotation
		  (getNamespace__ImportMembers__EList(), 
		   source, 
		   new String[] {
			 "body", "result = self.excludeCollisions(imps)->select(imp | self.ownedMember->forAll(mem |\nmem.imp.isDistinguishableFrom(mem, self)))"
		   });	
		addAnnotation
		  (getNamespace__ImportedMember(), 
		   source, 
		   new String[] {
			 "body", "result = self.importMembers(self.elementImport.importedElement.asSet()-\n>union(self.packageImport.importedPackage->collect(p | p.visibleMembers())))"
		   });	
		addAnnotation
		  (getNamespace__MembersAreDistinguishable(), 
		   source, 
		   new String[] {
			 "body", "result = self.member->forAll( memb |\nself.member->excluding(memb)->forAll(other |\nmemb.isDistinguishableFrom(other, self)))"
		   });	
		addAnnotation
		  (getNamespace__OwnedMember(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getElementImport__VisibilityPublicOrPrivate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.visibility = #public or self.visibility = #private"
		   });	
		addAnnotation
		  (getElementImport__ImportedElementIsPublic__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.importedElement.visibility.notEmpty() implies self.importedElement.visibility = #public"
		   });	
		addAnnotation
		  (getElementImport__GetName(), 
		   source, 
		   new String[] {
			 "body", "result = if self.alias->notEmpty() then\n  self.alias\nelse\n  self.importedElement.name\nendif"
		   });	
		addAnnotation
		  (getConstraint__NotApplyToSelf__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not constrainedElement->includes(self)"
		   });	
		addAnnotation
		  (getConstraint__BooleanValue__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConstraint__NoSideEffects__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConstraint__ValueSpecificationBoolean__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.specification().booleanValue().isOclKindOf(Boolean)"
		   });	
		addAnnotation
		  (getPackageImport__PublicOrPrivate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.visibility = #public or self.visibility = #private"
		   });	
		addAnnotation
		  (getStereotype__Generalize__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "generalization.general->forAll(e |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype)) "
		   });	
		addAnnotation
		  (getStereotype__AssociationEndOwnership__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "ownedAttribute\r\n->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))\r\n->forAll(opposite.owner = association)"
		   });	
		addAnnotation
		  (getStereotype__BinaryAssociationsOnly__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "ownedAttribute.association->forAll(memberEnd->size()=2)"
		   });	
		addAnnotation
		  (getStereotype__NameNotClash__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStereotype__ContainingProfile(), 
		   source, 
		   new String[] {
			 "body", "result = self.namespace.oclAsType(Package).containingProfile()"
		   });	
		addAnnotation
		  (getStereotype__Profile(), 
		   source, 
		   new String[] {
			 "body", "result = self.containingProfile()"
		   });	
		addAnnotation
		  (getClass__PassiveClass__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not self.isActive implies self.ownedReception.isEmpty()"
		   });	
		addAnnotation
		  (getClass__Extension(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getClass__SuperClass(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getBehavioredClassifier__ClassBehavior__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.classifierBehavior->notEmpty() implies self.classifierBehavior.specification->isEmpty()"
		   });	
		addAnnotation
		  (getClassifier__NoCyclesInGeneralization__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not self.allParents()->includes(self)"
		   });	
		addAnnotation
		  (getClassifier__SpecializeType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.parents()->forAll(c | self.maySpecializeType(c))"
		   });	
		addAnnotation
		  (getClassifier__NonFinalParents__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.parents()->forAll(not isFinalSpecialization)"
		   });	
		addAnnotation
		  (getClassifier__MapsToGeneralizationSet__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getClassifier__AllFeatures(), 
		   source, 
		   new String[] {
			 "body", "result = member->select(oclIsKindOf(Feature))"
		   });	
		addAnnotation
		  (getClassifier__AllParents(), 
		   source, 
		   new String[] {
			 "body", "result = self.parents()->union(self.parents()->collect(p | p.allParents())"
		   });	
		addAnnotation
		  (getClassifier__ConformsTo__Classifier(), 
		   source, 
		   new String[] {
			 "body", "result = (self=other) or (self.allParents()->includes(other))"
		   });	
		addAnnotation
		  (getClassifier__General(), 
		   source, 
		   new String[] {
			 "body", "result = self.parents()"
		   });	
		addAnnotation
		  (getClassifier__HasVisibilityOf__NamedElement(), 
		   source, 
		   new String[] {
			 "body", "result = (n.visibility <> VisibilityKind::private)"
		   });	
		addAnnotation
		  (getClassifier__Inherit__EList(), 
		   source, 
		   new String[] {
			 "body", "result = inhs"
		   });	
		addAnnotation
		  (getClassifier__InheritableMembers__Classifier(), 
		   source, 
		   new String[] {
			 "body", "result = member->select(m | c.hasVisibilityOf(m))"
		   });	
		addAnnotation
		  (getClassifier__InheritedMember(), 
		   source, 
		   new String[] {
			 "body", "result = self.inherit(self.parents()->collect(p|p.inheritableMembers(self))->asSet())"
		   });	
		addAnnotation
		  (getClassifier__MaySpecializeType__Classifier(), 
		   source, 
		   new String[] {
			 "body", "result = self.oclIsKindOf(c.oclType)"
		   });	
		addAnnotation
		  (getClassifier__Parents(), 
		   source, 
		   new String[] {
			 "body", "result = generalization.general"
		   });	
		addAnnotation
		  (getRedefinableElement__NonLeafRedefinition__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.redefinedElement->forAll(not isLeaf)"
		   });	
		addAnnotation
		  (getRedefinableElement__RedefinitionContextValid__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.redefinedElement->forAll(e | self.isRedefinitionContextValid(e))"
		   });	
		addAnnotation
		  (getRedefinableElement__RedefinitionConsistent__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.redefinedElement->forAll(re | re.isConsistentWith(self))"
		   });	
		addAnnotation
		  (getRedefinableElement__IsConsistentWith__RedefinableElement(), 
		   source, 
		   new String[] {
			 "body", "result = false"
		   });	
		addAnnotation
		  (getRedefinableElement__IsRedefinitionContextValid__RedefinableElement(), 
		   source, 
		   new String[] {
			 "body", "result = redefinitionContext->exists(c | c.allParents()->includes(redefined.redefinitionContext)))"
		   });	
		addAnnotation
		  (getProperty__SubsettedPropertyNames__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getProperty__BindingToAttribute__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(isAttribute(self) and (templateParameterSubstitution->notEmpty())\r\n  implies (templateParameterSubstitution->forAll(ts | isAttribute(ts.formal)))"
		   });	
		addAnnotation
		  (getProperty__MultiplicityOfComposite__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "isComposite implies (upperBound()->isEmpty() or upperBound() <= 1)"
		   });	
		addAnnotation
		  (getProperty__DerivedUnionIsReadOnly__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "isDerivedUnion implies isReadOnly"
		   });	
		addAnnotation
		  (getProperty__RedefinedPropertyInherited__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if (redefinedProperty->notEmpty()) then\r\n  (redefinitionContext->notEmpty() and\r\n      redefinedProperty->forAll(rp|\r\n        ((redefinitionContext->collect(fc|\r\n          fc.allParents()))->asSet())->collect(c| c.allFeatures())->asSet()->includes(rp))"
		   });	
		addAnnotation
		  (getProperty__SubsettingRules__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.subsettedProperty->forAll(sp |\n  self.type.conformsTo(sp.type) and\n    ((self.upperBound()->notEmpty() and sp.upperBound()->notEmpty()) implies\n      self.upperBound()<=sp.upperBound() ))"
		   });	
		addAnnotation
		  (getProperty__DeploymentTarget__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getProperty__DerivedUnionIsDerived__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "isDerivedUnion implies isDerived"
		   });	
		addAnnotation
		  (getProperty__SubsettingContextConforms__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.subsettedProperty->notEmpty() implies\n  (self.subsettingContext()->notEmpty() and self.subsettingContext()->forAll (sc |\n    self.subsettedProperty->forAll(sp |\n      sp.subsettingContext()->exists(c | sc.conformsTo(c)))))"
		   });	
		addAnnotation
		  (getProperty__Default_(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getProperty__IsAttribute__Property(), 
		   source, 
		   new String[] {
			 "body", "result = Classifier.allInstances->exists(c | c.attribute->includes(p))"
		   });	
		addAnnotation
		  (getProperty__IsComposite(), 
		   source, 
		   new String[] {
			 "body", "result = (self.aggregation = #composite)"
		   });	
		addAnnotation
		  (getProperty__IsNavigable(), 
		   source, 
		   new String[] {
			 "body", "result = not classifier->isEmpty() or association.owningAssociation.navigableOwnedEnd->includes(self)"
		   });	
		addAnnotation
		  (getProperty__Opposite(), 
		   source, 
		   new String[] {
			 "body", "result = if owningAssociation->isEmpty() and association.memberEnd->size() = 2\n  then\n    let otherEnd = (association.memberEnd - self)->any() in\n      if otherEnd.owningAssociation->isEmpty() then otherEnd else Set{} endif\n    else Set {}\n    endif"
		   });	
		addAnnotation
		  (getProperty__SubsettingContext(), 
		   source, 
		   new String[] {
			 "body", "result = if association->notEmpty()\nthen association.endType-type\nelse if classifier->notEmpty() then Set{classifier} else Set{} endif\nendif"
		   });	
		addAnnotation
		  (getMultiplicityElement__ValueSpecificationConstant__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMultiplicityElement__LowerGe0__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "lowerBound()->notEmpty() implies lowerBound() >= 0"
		   });	
		addAnnotation
		  (getMultiplicityElement__UpperGeLower__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(upperBound()->notEmpty() and lowerBound()->notEmpty()) implies upperBound() >= lowerBound()"
		   });	
		addAnnotation
		  (getMultiplicityElement__ValueSpecificationNoSideEffects__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMultiplicityElement__CompatibleWith__MultiplicityElement(), 
		   source, 
		   new String[] {
			 "body", "result = Integer.allInstances()->forAll(i : Integer | self.includesCardinality(i) implies other.includesCardinality(i))"
		   });	
		addAnnotation
		  (getMultiplicityElement__IncludesCardinality__Integer(), 
		   source, 
		   new String[] {
			 "body", "result = (lowerBound() <= C) and (upperBound() >= C)"
		   });	
		addAnnotation
		  (getMultiplicityElement__IncludesMultiplicity__MultiplicityElement(), 
		   source, 
		   new String[] {
			 "body", "result = (self.lowerBound() <= M.lowerBound()) and (self.upperBound() >= M.upperBound())"
		   });	
		addAnnotation
		  (getMultiplicityElement__Is__Integer_Integer(), 
		   source, 
		   new String[] {
			 "body", "result = (lowerbound = self.lowerbound and upperbound = self.upperbound)"
		   });	
		addAnnotation
		  (getMultiplicityElement__IsMultivalued(), 
		   source, 
		   new String[] {
			 "body", "result = upperBound() > 1"
		   });	
		addAnnotation
		  (getMultiplicityElement__Lower(), 
		   source, 
		   new String[] {
			 "body", "result = lowerBound()"
		   });	
		addAnnotation
		  (getMultiplicityElement__LowerBound(), 
		   source, 
		   new String[] {
			 "body", "result = if lowerValue->isEmpty() then 1 else lowerValue.integerValue() endif"
		   });	
		addAnnotation
		  (getMultiplicityElement__Upper(), 
		   source, 
		   new String[] {
			 "body", "result = upperBound()"
		   });	
		addAnnotation
		  (getMultiplicityElement__UpperBound(), 
		   source, 
		   new String[] {
			 "body", "result = if upperValue->isEmpty() then 1 else upperValue.unlimitedValue() endif"
		   });	
		addAnnotation
		  (getDeploymentTarget__DeployedElement(), 
		   source, 
		   new String[] {
			 "body", "result = ((self.deployment->collect(deployedArtifact))->collect(manifestation))->collect(utilizedElement)"
		   });	
		addAnnotation
		  (getDeploymentSpecification__DeployedElements__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.deployment->forAll (d | d.location.deployedElements->forAll (de |\r\n  de.oclIsKindOf(Component)))"
		   });	
		addAnnotation
		  (getDeploymentSpecification__DeploymentTarget__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.deployment->forAll (d | d.location.oclIsKindOf(ExecutionEnvironment))"
		   });	
		addAnnotation
		  (getOperation__OnlyBodyForQuery__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "bodyCondition->notEmpty() implies isQuery"
		   });	
		addAnnotation
		  (getOperation__AtMostOneReturn__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.ownedParameter->select(par | par.direction = #return)->size() <= 1"
		   });	
		addAnnotation
		  (getOperation__IsOrdered(), 
		   source, 
		   new String[] {
			 "body", "result = if returnResult()->notEmpty() then returnResult()->any().isOrdered else false endif"
		   });	
		addAnnotation
		  (getOperation__IsUnique(), 
		   source, 
		   new String[] {
			 "body", "result = if returnResult()->notEmpty() then returnResult()->any().isUnique else true endif"
		   });	
		addAnnotation
		  (getOperation__Lower(), 
		   source, 
		   new String[] {
			 "body", "result = if returnResult()->notEmpty() then returnResult()->any().lower else Set{} endif"
		   });	
		addAnnotation
		  (getOperation__ReturnResult(), 
		   source, 
		   new String[] {
			 "body", "result = ownedParameter->select (par | par.direction = #return)"
		   });	
		addAnnotation
		  (getOperation__Type(), 
		   source, 
		   new String[] {
			 "body", "result = if returnResult()->notEmpty() then returnResult()->any().type else Set{} endif"
		   });	
		addAnnotation
		  (getOperation__Upper(), 
		   source, 
		   new String[] {
			 "body", "result = if returnResult()->notEmpty() then returnResult()->any().upper else Set{} endif"
		   });	
		addAnnotation
		  (getBehavior__MustRealize__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getBehavior__ParametersMatch__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getBehavior__FeatureOfContextClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getBehavior__MostOneBehaviour__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getBehavior__Context(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getParameter__NotException__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getParameter__InAndOut__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getParameter__ConnectorEnd__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.end.notEmpty() implies self.collaboration.notEmpty()"
		   });	
		addAnnotation
		  (getParameter__ReentrantBehaviors__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getParameter__StreamAndException__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getParameter__Default_(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnectableElement__End(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnectorEnd__SelfPartWithPort__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnectorEnd__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnectorEnd__RoleAndPartWithPort__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnectorEnd__PartWithPortEmpty__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnectorEnd__DefiningEnd(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getParameterSet__SameParameterizedEntity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getParameterSet__Input__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getParameterSet__TwoParameterSets__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInterface__Visibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.feature->forAll(f | f.visibility = #public)"
		   });	
		addAnnotation
		  (getReception__NotQuery__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not self.isQuery"
		   });	
		addAnnotation
		  (getProtocolStateMachine__DeepOrShallowHistory__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "region->forAll (r | r.subvertex->forAll (v | v.oclIsKindOf(Psuedostate) implies\n((v.kind <> #deepHistory) and (v.kind <> #shallowHistory)))))\n"
		   });	
		addAnnotation
		  (getProtocolStateMachine__EntryExitDo__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "region->forAll(r | r.subvertex->forAll(v | v.oclIsKindOf(State) implies\n(v.entry->isEmpty() and v.exit->isEmpty() and v.doActivity->isEmpty())))\n"
		   });	
		addAnnotation
		  (getProtocolStateMachine__PortsConnected__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getProtocolStateMachine__ProtocolTransitions__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "region->forAll(r | r.transition->forAll(t | t.oclIsTypeOf(ProtocolTransition)))"
		   });	
		addAnnotation
		  (getStateMachine__ContextClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "specification->notEmpty() implies (context->notEmpty() and specification->featuringClassifier->exists (c | c = context))"
		   });	
		addAnnotation
		  (getStateMachine__ClassifierContext__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "context->notEmpty() implies not context.oclIsKindOf(Interface)"
		   });	
		addAnnotation
		  (getStateMachine__Method__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "specification->notEmpty() implies connectionPoint->isEmpty()"
		   });	
		addAnnotation
		  (getStateMachine__ConnectionPoints__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "conectionPoint->forAll (c | c.kind = #entryPoint or c.kind = #exitPoint)"
		   });	
		addAnnotation
		  (getStateMachine__Lca__State_State(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStateMachine__Ancestor__State_State(), 
		   source, 
		   new String[] {
			 "body", "result = \r\nif (s2 = s1) then \r\n\ttrue \r\nelse \r\n\tif (s2.container->isEmpty() or not s2.container.owner.oclIsKindOf(State)) then \r\n\t\tfalse \r\n\telse \r\n\t\tancestor(s1, s2.container.owner.oclAsType(State))\r\n\tendif\r\nendif \r\n"
		   });	
		addAnnotation
		  (getStateMachine__IsRedefinitionContextValid__StateMachine(), 
		   source, 
		   new String[] {
			 "body", "result = true"
		   });	
		addAnnotation
		  (getPseudostate__JunctionVertex__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.kind = #junction) implies\n((self.incoming->size >= 1) and (self.outgoing->size >= 1))\n"
		   });	
		addAnnotation
		  (getPseudostate__ChoiceVertex__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.kind = #choice) implies\n((self.incoming->size >= 1) and (self.outgoing->size >= 1))\n"
		   });	
		addAnnotation
		  (getPseudostate__InitialVertex__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.kind = #initial) implies (self.outgoing->size <= 1)"
		   });	
		addAnnotation
		  (getPseudostate__TransitionsIncoming__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.kind = #join) implies\n  self.incoming->forAll (t1, t2 | t1<>t2 implies\n    (self.stateMachine.LCA(t1.source, t2.source).container.isOrthogonal))"
		   });	
		addAnnotation
		  (getPseudostate__ForkVertex__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.kind = #fork) implies\n((self.incoming->size = 1) and (self.outgoing->size >= 2))\n"
		   });	
		addAnnotation
		  (getPseudostate__JoinVertex__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.kind = #join) implies\n((self.outgoing->size = 1) and (self.incoming->size >= 2))\n"
		   });	
		addAnnotation
		  (getPseudostate__TransitionsOutgoing__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.kind = #fork) implies\n  self.outgoing->forAll (t1, t2 | t1<>t2 implies\n    (self.stateMachine.LCA(t1.target, t2.target).container.isOrthogonal))"
		   });	
		addAnnotation
		  (getPseudostate__OutgoingFromInitial__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.kind = #initial) implies (self.outgoing.guard->isEmpty()\r\n  and self.outgoing.trigger->isEmpty())"
		   });	
		addAnnotation
		  (getPseudostate__HistoryVertices__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "((self.kind = #deepHistory) or (self.kind = #shallowHistory)) implies\n(self.outgoing->size <= 1)\n"
		   });	
		addAnnotation
		  (getVertex__ContainingStateMachine(), 
		   source, 
		   new String[] {
			 "body", "result = if not container->isEmpty()\nthen\n-- the container is a region\ncontainer.containingStateMachine()\nelse if (oclIsKindOf(Pseudostate)) then\n-- entry or exit point?\nif (kind = #entryPoint) or (kind = #exitPoint) then\nstateMachine\nelse if (oclIsKindOf(ConnectionPointReference)) then\nstate.containingStateMachine() -- no other valid cases possible\nendif\n"
		   });	
		addAnnotation
		  (getVertex__Incoming(), 
		   source, 
		   new String[] {
			 "body", "result = Transition.allInstances()->select(t | t.target=self)"
		   });	
		addAnnotation
		  (getVertex__Outgoing(), 
		   source, 
		   new String[] {
			 "body", "result = Transition.allInstances()->select(t | t.source=self)"
		   });	
		addAnnotation
		  (getRegion__DeepHistoryVertex__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->\nselect(p : Pseudostate | p.kind = #deepHistory)->size() <= 1\n"
		   });	
		addAnnotation
		  (getRegion__Owned__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(stateMachine->notEmpty() implies state->isEmpty()) and (state->notEmpty() implies stateMachine->isEmpty())"
		   });	
		addAnnotation
		  (getRegion__InitialVertex__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->\nselect(p : Pseudostate | p.kind = #initial)->size() <= 1\n"
		   });	
		addAnnotation
		  (getRegion__ShallowHistoryVertex__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.subvertex->select(v | v.oclIsKindOf(Pseudostate))->\nselect(p : Pseudostate | p.kind = #shallowHistory)->size() <= 1\n"
		   });	
		addAnnotation
		  (getRegion__BelongsToPsm(), 
		   source, 
		   new String[] {
			 "body", "result = if not stateMachine->isEmpty() then\noclIsTypeOf(ProtocolStateMachine)\nelse if not state->isEmpty() then\nstate.container.belongsToPSM ()\nelse false"
		   });	
		addAnnotation
		  (getRegion__ContainingStateMachine(), 
		   source, 
		   new String[] {
			 "body", "result = if stateMachine->isEmpty() \nthen\nstate.containingStateMachine()\nelse\nstateMachine\nendif"
		   });	
		addAnnotation
		  (getRegion__IsRedefinitionContextValid__Region(), 
		   source, 
		   new String[] {
			 "body", "result = true"
		   });	
		addAnnotation
		  (getRegion__RedefinitionContext(), 
		   source, 
		   new String[] {
			 "body", "result = let sm = containingStateMachine() in\nif sm.context->isEmpty() or sm.general->notEmpty() then\nsm\nelse\nsm.context\nendif"
		   });	
		addAnnotation
		  (getState__CompositeStates__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "connectionPoint->notEmpty() implies isComoposite"
		   });	
		addAnnotation
		  (getState__SubmachineStates__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "isSubmachineState implies connection->notEmpty ( )"
		   });	
		addAnnotation
		  (getState__EntryOrExit__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "connectionPoint->forAll(cp|cp.kind = #entry or cp.kind = #exit)"
		   });	
		addAnnotation
		  (getState__SubmachineOrRegions__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "isComposite implies not isSubmachineState"
		   });	
		addAnnotation
		  (getState__DestinationsOrSourcesOfTransitions__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.isSubmachineState implies (self.connection->forAll (cp |\r\ncp.entry->forAll (p | p.statemachine = self.submachine) and\r\ncp.exit->forAll (p | p.statemachine = self.submachine)))"
		   });	
		addAnnotation
		  (getState__IsComposite(), 
		   source, 
		   new String[] {
			 "body", "result = region.notEmpty()"
		   });	
		addAnnotation
		  (getState__IsOrthogonal(), 
		   source, 
		   new String[] {
			 "body", "result = (region->size () > 1)"
		   });	
		addAnnotation
		  (getState__IsRedefinitionContextValid__State(), 
		   source, 
		   new String[] {
			 "body", "result = true"
		   });	
		addAnnotation
		  (getState__IsSimple(), 
		   source, 
		   new String[] {
			 "body", "result = region.isEmpty()"
		   });	
		addAnnotation
		  (getState__IsSubmachineState(), 
		   source, 
		   new String[] {
			 "body", "result = submachine.notEmpty()"
		   });	
		addAnnotation
		  (getState__RedefinitionContext(), 
		   source, 
		   new String[] {
			 "body", "result = let sm = containingStateMachine() in\nif sm.context->isEmpty() or sm.general->notEmpty() then\nsm\nelse\nsm.context\nendif"
		   });	
		addAnnotation
		  (getConnectionPointReference__EntryPseudostates__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "entry->notEmpty() implies entry->forAll(e | e.kind = #entryPoint)"
		   });	
		addAnnotation
		  (getConnectionPointReference__ExitPseudostates__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "exit->notEmpty() implies exit->forAll(e | e.kind = #exitPoint)"
		   });	
		addAnnotation
		  (getPort__PortDestroyed__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPort__DefaultValue__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPort__PortAggregation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPort__Provided(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPort__Required(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getTransition__StateIsLocal__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(kind = TransitionKind::local) implies\r\n\t\t((source.oclIsKindOf (State) and source.oclAsType(State).isComposite) or\r\n\t\t(source.oclIsKindOf (Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint))"
		   });	
		addAnnotation
		  (getTransition__OutgoingPseudostates__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "source.oclIsKindOf(Pseudostate) and (source.kind <> #initial)) implies trigger->isEmpty()"
		   });	
		addAnnotation
		  (getTransition__StateIsExternal__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(kind = TransitionKind::external) implies\r\n\tnot (source.oclIsKindOf(Pseudostate) and source.oclAsType(Pseudostate).kind = PseudostateKind::entryPoint)"
		   });	
		addAnnotation
		  (getTransition__SignaturesCompatible__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getTransition__JoinSegmentGuards__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(target.oclIsKindOf(Pseudostate) and target.kind = #join) implies (guard->isEmpty() and trigger->isEmpty())"
		   });	
		addAnnotation
		  (getTransition__StateIsInternal__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(kind = TransitionKind::internal) implies\r\n\t\t(source.oclIsKindOf (State) and source = target)"
		   });	
		addAnnotation
		  (getTransition__JoinSegmentState__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(target.oclIsKindOf(Pseudostate) and target.kind = #join) implies (source.oclIsKindOf(State))"
		   });	
		addAnnotation
		  (getTransition__ForkSegmentGuards__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(source.oclIsKindOf(Pseudostate) and source.kind = #fork) implies (guard->isEmpty() and trigger->isEmpty())"
		   });	
		addAnnotation
		  (getTransition__ForkSegmentState__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(source.oclIsKindOf(Pseudostate) and source.kind = #fork) implies (target.oclIsKindOf(State))"
		   });	
		addAnnotation
		  (getTransition__InitialTransition__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.source.oclIsKindOf(Pseudostate) implies\n(self.source.oclAsType(Pseudostate).kind = #initial) implies\n(self.source.container = self.stateMachine.top) implies\n((self.trigger->isEmpty) or\n(self.trigger.stereotype.name = \'create\'))\n"
		   });	
		addAnnotation
		  (getTransition__ContainingStateMachine(), 
		   source, 
		   new String[] {
			 "body", "result = container.containingStateMachine()"
		   });	
		addAnnotation
		  (getTransition__RedefinitionContext(), 
		   source, 
		   new String[] {
			 "body", "result = let sm = containingStateMachine() in\nif sm.context->isEmpty() or sm.general->notEmpty() then\nsm\nelse\nsm.context\nendif"
		   });	
		addAnnotation
		  (getAssociation__SpecializedEndTypes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "Sequence{1..self.memberEnd->size()}->\r\n\tforAll(i | self.general->select(oclIsKindOf(Association)).oclAsType(Association)->\r\n\t\tforAll(ga |self.memberEnd->at(i).type.conformsTo(ga.memberEnd->at(i).type)))"
		   });	
		addAnnotation
		  (getAssociation__BinaryAssociations__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.memberEnd->exists(aggregation <> Aggregation::none) implies self.memberEnd->size() = 2"
		   });	
		addAnnotation
		  (getAssociation__SpecializedEndNumber__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "parents()->select(oclIsKindOf(Association)).oclAsType(Association)->forAll(p | p.memberEnd->size() = self.memberEnd->size())"
		   });	
		addAnnotation
		  (getAssociation__AssociationEnds__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if memberEnd->size() > 2 then ownedEnd->includesAll(memberEnd)"
		   });	
		addAnnotation
		  (getAssociation__EndType(), 
		   source, 
		   new String[] {
			 "body", "result = self.memberEnd->collect(e | e.type)"
		   });	
		addAnnotation
		  (getCollaborationUse__EveryRole__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCollaborationUse__ClientElements__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCollaborationUse__Connectors__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStructuredClassifier__Multiplicities__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStructuredClassifier__Part(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnector__BetweenInterfacesPorts__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnector__Compatible__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnector__Roles__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnector__Types__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConnector__Kind(), 
		   source, 
		   new String[] {
			 "body", "result =\r\nif end->exists(\r\n\t\trole.oclIsKindOf(Port) \r\n\t\tand partWithPort->isEmpty()\r\n\t\tand not role.oclAsType(Port).isBehavior)\r\nthen ConnectorKind::delegation \r\nelse ConnectorKind::assembly \r\nendif"
		   });	
		addAnnotation
		  (getGeneralization__GeneralizationSameClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getGeneralizationSet__MapsToGeneralizationSet__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getGeneralizationSet__GeneralizationSameClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "generalization->collect(g | g.general)->asSet()->size() <= 1"
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature__InheritedParameters__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if extendedSignature->isEmpty() then Set{} else extendedSignature.parameter endif"
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature__InheritedParameter(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUseCase__MustHaveName__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.name -> notEmpty ()"
		   });	
		addAnnotation
		  (getUseCase__CannotIncludeSelf__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not self.allIncludedUseCases()->includes(self)"
		   });	
		addAnnotation
		  (getUseCase__BinaryAssociations__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUseCase__NoAssociationToUseCase__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUseCase__AllIncludedUseCases(), 
		   source, 
		   new String[] {
			 "body", "result = self.include->union(self.include->collect(in | in.allIncludedUseCases()))"
		   });	
		addAnnotation
		  (getExtend__ExtensionPoints__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "extensionLocation->forAll (xp | extendedCase.extensionPoint->includes(xp))"
		   });	
		addAnnotation
		  (getExtensionPoint__MustHaveName__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.name->notEmpty ()"
		   });	
		addAnnotation
		  (getClassifierTemplateParameter__HasConstrainingClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "allowSubstitutable implies constrainingClassifier->notEmpty()"
		   });	
		addAnnotation
		  (getEncapsulatedClassifier__OwnedPort(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getExtension__NonOwnedEnd__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "metaclassEnd()->notEmpty() and metaclass()->oclIsKindOf(Class)"
		   });	
		addAnnotation
		  (getExtension__IsBinary__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "memberEnd->size() = 2"
		   });	
		addAnnotation
		  (getExtension__IsRequired(), 
		   source, 
		   new String[] {
			 "body", "result = (ownedEnd->lowerBound() = 1)"
		   });	
		addAnnotation
		  (getExtension__Metaclass(), 
		   source, 
		   new String[] {
			 "body", "result = metaclassEnd().type"
		   });	
		addAnnotation
		  (getExtension__MetaclassEnd(), 
		   source, 
		   new String[] {
			 "body", "result = memberEnd->reject(ownedEnd)"
		   });	
		addAnnotation
		  (getExtensionEnd__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self->lowerBound() = 0 or self->lowerBound() = 1) and self->upperBound() = 1"
		   });	
		addAnnotation
		  (getExtensionEnd__Aggregation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.aggregation = #composite"
		   });	
		addAnnotation
		  (getProfile__ReferencesSameMetamodel__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.metamodelReference.importedPackage.elementImport.importedElement.allOwningPackages()->\r\n  union(self.metaclassReference.importedElement.allOwningPackages() )->notEmpty()"
		   });	
		addAnnotation
		  (getProfile__MetaclassReferenceNotSpecialized__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.metaclassReference.importedElement->\r\n\tselect(c | c.oclIsKindOf(Classifier) and\r\n\t\t(c.generalization.namespace = self or\tc.specialization.namespace = self))->isEmpty()"
		   });	
		addAnnotation
		  (getOpaqueExpression__OneReturnResultParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.behavior.notEmpty() implies\r\n  self.behavior.ownedParameter->select(p | p.direction=#return)->size() = 1"
		   });	
		addAnnotation
		  (getOpaqueExpression__OnlyReturnResultParameters__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.behavior.notEmpty() implies\r\n  self.behavior.ownedParameters->select(p | p.direction<>#return)->isEmpty()"
		   });	
		addAnnotation
		  (getOpaqueExpression__LanguageBodySize__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "language->notEmpty() implies (body->size() = language->size())"
		   });	
		addAnnotation
		  (getOpaqueExpression__IsIntegral(), 
		   source, 
		   new String[] {
			 "body", "result = false"
		   });	
		addAnnotation
		  (getOpaqueExpression__IsNonNegative(), 
		   source, 
		   new String[] {
			 "body", "result = false"
		   });	
		addAnnotation
		  (getOpaqueExpression__IsPositive(), 
		   source, 
		   new String[] {
			 "body", "result = false"
		   });	
		addAnnotation
		  (getOpaqueExpression__Result(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getOpaqueExpression__Value(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getAcceptCallAction__TriggerCallEvent__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "trigger.event.oclIsKindOf(CallEvent)"
		   });	
		addAnnotation
		  (getAcceptCallAction__ResultPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getAcceptCallAction__Unmarshall__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "isUnmarshall = true"
		   });	
		addAnnotation
		  (getAcceptEventAction__TriggerEvents__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getAcceptEventAction__NoInputPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getAcceptEventAction__UnmarshallSignalEvents__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getAcceptEventAction__NoOutputPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getAction__Context(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityNode__OwnedStructuredNode__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityNode__Owned__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivity__Autonomous__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivity__NoSupergroups__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivity__ActivityParameterNode__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivity__StructuredNode(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityEdge__SourceAndTarget__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityEdge__Owned__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityEdge__StructuredNode__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityGroup__GroupOwned__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityGroup__NodesAndEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityGroup__NotContained__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityPartition__RepresentsPartAndIsContained__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityPartition__RepresentsPart__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityPartition__RepresentsClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityPartition__DimensionNotContained__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStructuredActivityNode__OutputPinEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStructuredActivityNode__Edges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStructuredActivityNode__InputPinEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInputPin__OutgoingEdgesStructuredOnly__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPin__ControlPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "isControl implies isControlType"
		   });	
		addAnnotation
		  (getOutputPin__IncomingEdgesStructuredOnly__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getVariable__Owned__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getVariable__IsAccessibleBy__Action(), 
		   source, 
		   new String[] {
			 "body", "result = true"
		   });	
		addAnnotation
		  (getInterruptibleActivityRegion__InterruptingEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getExceptionHandler__ResultPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getExceptionHandler__OneInput__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getExceptionHandler__EdgeSourceTarget__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getExceptionHandler__ExceptionBody__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActionExecutionSpecification__ActionReferenced__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getExecutionSpecification__SameLifeline__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "start.lifeline = finish.lifeline"
		   });	
		addAnnotation
		  (getLifeline__SelectorSpecified__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.selector->isEmpty() implies not self.represents.isMultivalued()) or\n(not self.selector->isEmpty() implies self.represents.isMultivalued())\n"
		   });	
		addAnnotation
		  (getLifeline__InteractionUsesShareLifeline__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getLifeline__SameClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if (represents->notEmpty()) then\n(if selector->notEmpty() then represents.isMultivalued() else not represents.isMultivalued())\n"
		   });	
		addAnnotation
		  (getPartDecomposition__CommutativityOfDecomposition__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPartDecomposition__Assume__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getPartDecomposition__PartsOfInternalStructures__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionUse__ArgumentsCorrespondToParameters__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionUse__ReturnValueTypeRecipientCorrespondence__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionUse__AllLifelines__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionUse__ReturnValueRecipientCoverage__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionUse__ArgumentsAreConstants__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionUse__GatesMatch__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getGate__MessagesActualGate__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getGate__MessagesCombinedFragment__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMessage__SignatureReferTo__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMessage__Arguments__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMessage__SendingReceivingMessageEvent__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMessage__SignatureIsOperation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMessage__SignatureIsSignal__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMessage__OccurrenceSpecifications__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMessage__CannotCrossBoundaries__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMessage__MessageKind(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionOperand__GuardContainReferences__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionOperand__GuardDirectlyPrior__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionConstraint__DynamicVariables__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionConstraint__MaxintPositive__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionConstraint__MinintNonNegative__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionConstraint__GlobalData__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionConstraint__MinintMaxint__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInteractionConstraint__MaxintGreaterEqualMinint__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getGeneralOrdering__IrreflexsiveTransitiveClosure__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "start.lifeline = finish.lifeline"
		   });	
		addAnnotation
		  (getActionInputPin__NoControlOrDataFlow__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActionInputPin__OneOutputPin__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActionInputPin__InputPin__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getFinalNode__NoOutgoingEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityParameterNode__HasParameters__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityParameterNode__NoIncomingEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityParameterNode__MaximumOneParameterNode__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityParameterNode__SameType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityParameterNode__NoEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityParameterNode__NoOutgoingEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActivityParameterNode__MaximumTwoParameterNodes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getActor__Associations__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.ownedAttribute->forAll ( a |\n(a.association->notEmpty()) implies\n((a.association.memberEnd.size() = 2) and\n(a.opposite.class.oclIsKindOf(UseCase) or\n(a.opposite.class.oclIsKindOf(Class) and not a.opposite.class.oclIsKindOf(Behavior))))\n"
		   });	
		addAnnotation
		  (getActor__MustHaveName__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "name->notEmpty()"
		   });	
		addAnnotation
		  (getAddStructuralFeatureValueAction__RequiredValue__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value -> notEmpty()"
		   });	
		addAnnotation
		  (getAddStructuralFeatureValueAction__UnlimitedNaturalAndMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let insertAtPins : Collection = self.insertAt in\nif self.structuralFeature.isOrdered = #false\nthen insertAtPins->size() = 0\nelse let insertAtPin : InputPin= insertAt->asSequence()->first() in\ninsertAtPins->size() = 1\nand insertAtPin.type = UnlimitedNatural\nand insertAtPin.multiplicity.is(1,1))\nendif\n"
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction__InputPin__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value->notEmpty() implies self.value.type =  self.structuralFeature.type"
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction__MultiplicityOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "result->notEmpty() implies self.result.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getWriteStructuralFeatureAction__TypeOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "result->notEmpty() implies self.result.type = self.object.type"
		   });	
		addAnnotation
		  (getStructuralFeatureAction__Visibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let host : Classifier = self.context in\nself.structuralFeature.visibility = #public\nor host = self.structuralFeature.featuringClassifier.type\nor (self.structuralFeature.visibility = #protected and host.allSupertypes\n->includes(self.structuralFeature.featuringClassifier.type)))\n"
		   });	
		addAnnotation
		  (getStructuralFeatureAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.object.lowerBound()=1 and self.object.upperBound()=1"
		   });	
		addAnnotation
		  (getStructuralFeatureAction__NotStatic__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.structuralFeature.isStatic = #false"
		   });	
		addAnnotation
		  (getStructuralFeatureAction__OneFeaturingClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.structuralFeature.featuringClassifier->size() = 1"
		   });	
		addAnnotation
		  (getStructuralFeatureAction__SameType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.structuralFeature.featuringClassifier.oclAsType(Type)->includes(self.object.type) or\r\n\tself.structuralFeature.oclAsType(Property).opposite.type = self.object.type"
		   });	
		addAnnotation
		  (getAddVariableValueAction__SingleInputPin__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let insertAtPins : Collection = self.insertAt in\nif self.variable.ordering = #unordered\nthen insertAtPins->size() = 0\nelse let insertAtPin : InputPin = insertAt->asSequence()->first() in\ninsertAtPins->size() = 1\nand insertAtPin.type = UnlimitedNatural\nand insertAtPin.multiplicity.is(1,1))\nendif\n"
		   });	
		addAnnotation
		  (getAddVariableValueAction__RequiredValue__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value -> notEmpty()"
		   });	
		addAnnotation
		  (getWriteVariableAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getWriteVariableAction__SameType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value -> notEmpty() implies self.value.type = self.variable.type"
		   });	
		addAnnotation
		  (getVariableAction__ScopeOfVariable__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.variable.isAccessibleBy(self)"
		   });	
		addAnnotation
		  (getAssociationClass__CannotBeDefined__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.endType->excludes(self) and self.endType>collect(et|et.allparents()->excludes(self))"
		   });	
		addAnnotation
		  (getAssociationClass__DisjointAttributesEnds__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "ownedAttribute->intersection(ownedEnd)->isEmpty()"
		   });	
		addAnnotation
		  (getBroadcastSignalAction__TypeOrderingMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getBroadcastSignalAction__NumberAndOrder__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInvocationAction__OnPortReceiver__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCallAction__SynchronousCall__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCallAction__NumberAndOrder__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCallAction__TypeOrderingMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCallBehaviorAction__ArgumentPinEqualParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCallBehaviorAction__ResultPinEqualParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCallOperationAction__ArgumentPinEqualParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCallOperationAction__TypeTargetPin__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCallOperationAction__ResultPinEqualParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getClause__BodyOutputPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getClause__TestAndBody__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getClause__DeciderOutput__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getClearAssociationAction__SameType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.association->exists(end.type = self.object.type)"
		   });	
		addAnnotation
		  (getClearAssociationAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.object.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getClearStructuralFeatureAction__TypeOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "result->notEmpty() implies self.result.type = self.object.type"
		   });	
		addAnnotation
		  (getClearStructuralFeatureAction__MultiplicityOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "result->notEmpty() implies self.result.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getCombinedFragment__MinintAndMaxint__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCombinedFragment__OptLoopBreakNeg__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCombinedFragment__Break___DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCombinedFragment__ConsiderAndIgnore__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "((interactionOperator = #consider) or (interactionOperator = #ignore)) implies oclsisTypeOf(CombineIgnoreFragment)"
		   });	
		addAnnotation
		  (getComponent__NoPackagedElements__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(not self.class->isEmpty()) implies self.packagedElement->isEmpty()"
		   });	
		addAnnotation
		  (getComponent__NoNestedClassifiers__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.nestedClassifier->isEmpty()"
		   });	
		addAnnotation
		  (getComponent__Provided(), 
		   source, 
		   new String[] {
			 "body", "result =\r\nlet \trealizedInterfaces : Set(Interface) = RealizedInterfaces(self) ,\r\n\t\trealizingClassifiers : Set(Classifier) = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),\r\n\t\tallRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()) ,\r\n\t\trealizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(RealizedInterfaces(c))) ,\r\n\t\tports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort) ,\r\n\t\tprovidedByPorts : Set(Interface) = ports.provided \r\nin \trealizedInterfaces->union(realizingClassifierInterfaces) ->union(providedByPorts)->asSet()\r\n"
		   });	
		addAnnotation
		  (getComponent__RealizedInterfaces__Classifier(), 
		   source, 
		   new String[] {
			 "body", "result = (classifier.clientDependency->\nselect(dependency|dependency.oclIsKindOf(Realization) and dependency.supplier.oclIsKindOf(Interface)))->\ncollect(dependency|dependency.client)"
		   });	
		addAnnotation
		  (getComponent__Required(), 
		   source, 
		   new String[] {
			 "body", "result = \r\nlet \tusedInterfaces : Set(Interface) = UsedInterfaces(self),\r\n\t\trealizingClassifiers : Set(Classifier) = Set{self.realizingClassifier}->union(self.allParents().realizingClassifier),\r\n\t\tallRealizingClassifiers : Set(Classifier) = realizingClassifiers->union(realizingClassifiers.allParents()),\r\n\t\trealizingClassifierInterfaces : Set(Interface) = allRealizingClassifiers->iterate(c; rci : Set(Interface) = Set{} | rci->union(UsedInterfaces(c))),\r\n\t\tports : Set(Port) = self.ownedPort->union(allParents.oclAsType(Set(EncapsulatedClassifier)).ownedPort),\r\n\t\tusedByPorts : Set(Interface) = ports.required\r\nin\t\tusedInterfaces->union(realizingClassifierInterfaces) ->union(usedByPorts)->asSet()\r\n"
		   });	
		addAnnotation
		  (getComponent__UsedInterfaces__Classifier(), 
		   source, 
		   new String[] {
			 "body", "result = (classifier.supplierDependency->\nselect(dependency|dependency.oclIsKindOf(Usage) and dependency.supplier.oclIsKindOf(interface)))->\ncollect(dependency|dependency.supplier)"
		   });	
		addAnnotation
		  (getConditionalNode__NoInputPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConditionalNode__ResultNoIncoming__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConditionalNode__ClauseNoPredecessor__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConditionalNode__ExecutableNodes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConditionalNode__MatchingOutputPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConditionalNode__OneClauseWithExecutableNode__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getConsiderIgnoreFragment__ConsiderOrIgnore__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(interactionOperator = #consider) or (interactionOperator = #ignore)"
		   });	
		addAnnotation
		  (getConsiderIgnoreFragment__Type__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "message->forAll(m | m.oclIsKindOf(Operation) or m.oclIsKindOf(Reception) or m.oclIsKindOf(Signal))"
		   });	
		addAnnotation
		  (getContinuation__Global__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getContinuation__FirstOrLastInteractionFragment__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getContinuation__SameName__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getControlFlow__ObjectNodes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getCreateLinkAction__AssociationNotAbstract__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.association().isAbstract = #false"
		   });	
		addAnnotation
		  (getWriteLinkAction__AllowAccess__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getLinkAction__SamePins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.input->asSet() =\nlet ledpins : Set = self.endData->collect(value) in\nif self.oclIsKindOf(LinkEndCreationData)\nthen ledpins->union(self.endData.oclAsType(LinkEndCreationData).insertAt)\nelse ledpins\n"
		   });	
		addAnnotation
		  (getLinkAction__SameAssociation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.endData->collect(end) = self.association()->collect(connection))"
		   });	
		addAnnotation
		  (getLinkAction__NotStatic__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.endData->forall(end.oclisKindOf(NavigableEnd) implies end.isStatic = #false"
		   });	
		addAnnotation
		  (getLinkAction__Association(), 
		   source, 
		   new String[] {
			 "body", "result = self.endData->asSequence().first().end.association"
		   });	
		addAnnotation
		  (getLinkEndData__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getLinkEndData__EndObjectInputPin__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value->excludesAll(self.qualifier.value)"
		   });	
		addAnnotation
		  (getLinkEndData__PropertyIsAssociationEnd__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.end.association->size() = 1"
		   });	
		addAnnotation
		  (getLinkEndData__SameType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value.type = self.end.type"
		   });	
		addAnnotation
		  (getLinkEndData__Qualifiers__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.qualifier->collect(qualifier) = self.end.qualifier"
		   });	
		addAnnotation
		  (getQualifierValue__TypeOfQualifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value.type = self.qualifier.type"
		   });	
		addAnnotation
		  (getQualifierValue__MultiplicityOfQualifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.value.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getQualifierValue__QualifierAttribute__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.LinkEndData.end->collect(qualifier)->includes(self.qualifier)"
		   });	
		addAnnotation
		  (getLinkEndCreationData__CreateLinkAction__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.LinkAction.oclIsKindOf(CreateLinkAction)"
		   });	
		addAnnotation
		  (getLinkEndCreationData__SingleInputPin__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let insertAtPins : Collection = self.insertAt in\nif self.end.ordering = #unordered\nthen insertAtPins->size() = 0\nelse let insertAtPin : InputPin = insertAts->asSequence()->first() in\ninsertAtPins->size() = 1\nand insertAtPin.type = UnlimitedNatural\nand insertAtPin.multiplicity.is(1,1))\nendif\n"
		   });	
		addAnnotation
		  (getCreateLinkObjectAction__TypeOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.type = self.association()"
		   });	
		addAnnotation
		  (getCreateLinkObjectAction__AssociationClass__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.association().oclIsKindOf(Class)"
		   });	
		addAnnotation
		  (getCreateLinkObjectAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getCreateObjectAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getCreateObjectAction__SameType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.type = self.classifier"
		   });	
		addAnnotation
		  (getCreateObjectAction__ClassifierNotAbstract__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not (self.classifier.isAbstract = #true)"
		   });	
		addAnnotation
		  (getCreateObjectAction__ClassifierNotAssociationClass__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not self.classifier.oclIsKindOf(AssociationClass)"
		   });	
		addAnnotation
		  (getDecisionNode__Edges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDecisionNode__Parameters__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDecisionNode__IncomingObjectOneInputParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDecisionNode__TwoInputParameters__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDecisionNode__DecisionInputFlowIncoming__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDecisionNode__IncomingControlOneInputParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDecisionNode__IncomingOutgoingEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDecisionNode__ZeroInputParameters__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getObjectFlow__InputAndOutputParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getObjectFlow__Target__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getObjectFlow__CompatibleTypes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getObjectFlow__TransformationBehaviour__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getObjectFlow__IsMulticastOrIsMultireceive__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getObjectFlow__NoActions__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getObjectFlow__SelectionBehaviour__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getObjectFlow__SameUpperBounds__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getLinkEndDestructionData__UnlimitedNaturalAndMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getLinkEndDestructionData__DestroyLinkAction__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDestroyObjectAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.target.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getDestroyObjectAction__NoType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.target.type->size() = 0"
		   });	
		addAnnotation
		  (getDestructionOccurenceSpecification__NoOccurrenceSpecificationsBelow__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getNode__InternalStructure__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getDurationConstraint__FirstEventMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if (constrainedElement->size() =2)\r\n  then (firstEvent->size() = 2) else (firstEvent->size() = 0)"
		   });	
		addAnnotation
		  (getDurationObservation__FirstEventMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if (event->size() = 2)\r\n  then (firstEvent->size() = 2) else (firstEvent->size() = 0)"
		   });	
		addAnnotation
		  (getEnumerationLiteral__ClassifierEqualsOwningEnumeration__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "classifier = enumeration"
		   });	
		addAnnotation
		  (getEnumerationLiteral__Classifier(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInstanceSpecification__DeploymentTarget__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInstanceSpecification__StructuralFeature__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "classifier->forAll(c | (c.allFeatures()->forAll(f | slot->select(s | s.definingFeature = f)->size() <= 1)))"
		   });	
		addAnnotation
		  (getInstanceSpecification__DefiningFeature__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "slot->forAll(s | classifier->exists (c | c.allFeatures()->includes (s.definingFeature)))"
		   });	
		addAnnotation
		  (getInstanceSpecification__DeploymentArtifact__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getExpansionNode__RegionAsInputOrOutput__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getExpansionRegion__ExpansionNodes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getFinalState__NoRegions__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.region->size() = 0"
		   });	
		addAnnotation
		  (getFinalState__NoOutgoingTransitions__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.outgoing->size() = 0"
		   });	
		addAnnotation
		  (getFinalState__NoExitBehavior__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.exit->isEmpty()"
		   });	
		addAnnotation
		  (getFinalState__CannotReferenceSubmachine__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.submachine->isEmpty()"
		   });	
		addAnnotation
		  (getFinalState__NoEntryBehavior__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.entry->isEmpty()"
		   });	
		addAnnotation
		  (getFinalState__NoStateBehavior__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.doActivity->isEmpty()"
		   });	
		addAnnotation
		  (getForkNode__OneIncomingEdge__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getForkNode__Edges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getFunctionBehavior__OneOutputParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.ownedParameters->\r\n  select(p | p.direction=#out or p.direction=#inout or p.direction=#return)->size() >= 1"
		   });	
		addAnnotation
		  (getFunctionBehavior__TypesOfParameters__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "def: hasAllDataTypeAttributes(d : DataType) : Boolean =\r\n  d.ownedAttribute->forAll(a |\r\n    a.type.oclIsTypeOf(DataType) and\r\n      hasAllDataTypeAttributes(a.type))\r\nself.ownedParameters->forAll(p | p.type.notEmpty() and\r\n  p.oclIsTypeOf(DataType) and hasAllDataTypeAttributes(p))"
		   });	
		addAnnotation
		  (getInformationFlow__ConveyClassifiers__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.conveyed.represented->forAll(p | p->oclIsKindOf(Class) or oclIsKindOf(Interface)\r\n  or oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component))"
		   });	
		addAnnotation
		  (getInformationFlow__MustConform__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInformationFlow__SourcesAndTargetsKind__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.informationSource->forAll(p | p->oclIsKindOf(Actor) or oclIsKindOf(Node) or\r\n  oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or oclIsKindOf(Class) or\r\n  oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or\r\n  oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or\r\n  oclIsKindOf(ActivityPartition) or oclIsKindOf(InstanceSpecification))) and\r\n    (self.informationTarget->forAll(p | p->oclIsKindOf(Actor) or oclIsKindOf(Node) or\r\n      oclIsKindOf(UseCase) or oclIsKindOf(Artifact) or oclIsKindOf(Class) or\r\n      oclIsKindOf(Component) or oclIsKindOf(Port) or oclIsKindOf(Property) or\r\n      oclIsKindOf(Interface) or oclIsKindOf(Package) or oclIsKindOf(ActivityNode) or\r\n      oclIsKindOf(ActivityPartition) or oclIsKindOf(InstanceSpecification)))"
		   });	
		addAnnotation
		  (getInformationItem__HasNo__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.generalization->isEmpty() and self.feature->isEmpty()"
		   });	
		addAnnotation
		  (getInformationItem__SourcesAndTargets__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.represented->select(p | p->oclIsKindOf(InformationItem))->forAll(p |\r\n  p.informationFlow.source->forAll(q | self.informationFlow.source->include(q)) and\r\n    p.informationFlow.target->forAll(q | self.informationFlow.target->include(q)))) and\r\n      (self.represented->forAll(p | p->oclIsKindOf(Class) or oclIsKindOf(Interface) or\r\n        oclIsKindOf(InformationItem) or oclIsKindOf(Signal) or oclIsKindOf(Component)))"
		   });	
		addAnnotation
		  (getInformationItem__NotInstantiable__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "isAbstract"
		   });	
		addAnnotation
		  (getInitialNode__ControlEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getInitialNode__NoIncomingEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getJoinNode__OneOutgoingEdge__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.outgoing->size() = 1"
		   });	
		addAnnotation
		  (getJoinNode__IncomingObjectFlow__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "(self.incoming.select(e | e.isTypeOf(ObjectFlow)->notEmpty() implies\r\n  self.outgoing.isTypeOf(ObjectFlow)) and\r\n    (self.incoming.select(e | e.isTypeOf(ObjectFlow)->empty() implies\r\n      self.outgoing.isTypeOf(ControlFlow))"
		   });	
		addAnnotation
		  (getLoopNode__InputEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getLoopNode__ResultNoIncoming__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getLoopNode__ExecutableNodes__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getLoopNode__BodyOutputPins__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMergeNode__Edges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getMergeNode__OneOutgoingEdge__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getProtocolTransition__RefersToOperation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getProtocolTransition__AssociatedActions__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "effect->isEmpty()"
		   });	
		addAnnotation
		  (getProtocolTransition__BelongsToPsm__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "container.belongsToPSM()"
		   });	
		addAnnotation
		  (getProtocolTransition__Referred(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getReadExtentAction__MultiplicityOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.multiplicity.is(0,#null)"
		   });	
		addAnnotation
		  (getReadExtentAction__TypeIsClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction__BooleanResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.type = Boolean"
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction__MultiplicityOfInput__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.object.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction__NoType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.object.type->isEmpty()"
		   });	
		addAnnotation
		  (getReadIsClassifiedObjectAction__MultiplicityOfOutput__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReadLinkAction__CompatibleMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let openend : Property = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in\nopenend.multiplicity.compatibleWith(self.result.multiplicity)\n"
		   });	
		addAnnotation
		  (getReadLinkAction__NavigableOpenEnd__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let openend : Property = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in\nopenend.isNavigable()\n"
		   });	
		addAnnotation
		  (getReadLinkAction__TypeAndOrdering__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let openend : Property = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in\nself.result.type = openend.type\nand self.result.ordering = openend.ordering\n"
		   });	
		addAnnotation
		  (getReadLinkAction__OneOpenEnd__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.endData->select(ed | ed.value->size() = 0)->size() = 1"
		   });	
		addAnnotation
		  (getReadLinkAction__Visibility__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "let host : Classifier = self.context in\nlet openend : Property = self.endData->select(ed | ed.value->size() = 0)->asSequence()->first().end in\nopenend.visibility = #public\nor self.endData->exists(oed | not oed.end = openend\nand (host = oed.end.participant\nor (openend.visibility = #protected\nand host.allSupertypes->includes(oed.end.participant))))\n"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction__AssociationOfAssociation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.end.Association.oclIsKindOf(AssociationClass)"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction__TypeOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.type = self.end.type"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction__Property__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.end.association.notEmpty()"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction__EndsOfAssociation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.end.association.memberEnd->forall(e | not e.isStatic)"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction__MultiplicityOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction__MultiplicityOfObject__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.object.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReadLinkObjectEndAction__TypeOfObject__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.object.type = self.end.association"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction__MultiplicityOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction__TypeOfObject__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.object.type = self.qualifier.associationEnd.association"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction__SameType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.type = self.qualifier.type"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction__QualifierAttribute__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.qualifier.associationEnd->size() = 1"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction__MultiplicityOfQualifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.qualifier.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction__EndsOfAssociation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.qualifier.associationEnd.association.memberEnd->forall(e | not e.isStatic)"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction__MultiplicityOfObject__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.object.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReadLinkObjectEndQualifierAction__AssociationOfAssociation__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.qualifier.associationEnd.association.oclIsKindOf(AssociationClass)"
		   });	
		addAnnotation
		  (getReadSelfAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReadSelfAction__NotStatic__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getReadSelfAction__Type__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.type = self.context"
		   });	
		addAnnotation
		  (getReadSelfAction__Contained__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.context->size() = 1"
		   });	
		addAnnotation
		  (getReadStructuralFeatureAction__TypeAndOrdering__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.type = self.structuralFeature.type\nand self.result.ordering = self.structuralFeature.ordering\n"
		   });	
		addAnnotation
		  (getReadVariableAction__CompatibleMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.variable.multiplicity.compatibleWith(self.result.multiplicity)"
		   });	
		addAnnotation
		  (getReadVariableAction__TypeAndOrdering__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.result.type =self.variable.type\nand self.result.ordering = self.variable.ordering\n"
		   });	
		addAnnotation
		  (getReclassifyObjectAction__InputPin__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.argument.type->size() = 0"
		   });	
		addAnnotation
		  (getReclassifyObjectAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.argument.multiplicity.is(1,1)"
		   });	
		addAnnotation
		  (getReclassifyObjectAction__ClassifierNotAbstract__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "not self.newClassifier->exists(isAbstract = true)"
		   });	
		addAnnotation
		  (getReduceAction__OutputTypesAreCompatible__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getReduceAction__ReducerInputsOutput__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getReduceAction__InputTypeIsCollection__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getRemoveStructuralFeatureValueAction__NonUniqueRemoval__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if not self.structuralFeature.isOrdered or self.structuralFeature.isUnique or  isRemoveDuplicates then\r\n  self.removeAt -> isEmpty() and self.value -> notEmpty()\r\nelse\r\n  self.value -> isEmpty() and\r\n  self.removeAt -> notEmpty() and\r\n  self.removeAt.type = UnlimitedNatural and\r\n  self.removeAt.lower = 1 and\r\n  self.removeAt.upper = 1\r\nendif"
		   });	
		addAnnotation
		  (getRemoveVariableValueAction__UnlimitedNatural__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "if not self.variable.isOrdered or self.variable.isUnique or isRemoveDuplicates then \r\n  self.removeAt -> isEmpty() and self.value -> notEmpty()\r\nelse\r\n  self.value -> isEmpty() and\r\n  self.removeAt -> notEmpty() and\r\n  self.removeAt.type = UnlimitedNatural and\r\n  self.removeAt.lower() = 1 and\r\n  self.removeAt.upper() = 1\r\nendif"
		   });	
		addAnnotation
		  (getReplyAction__PinsMatchParameter__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getReplyAction__EventOnReplyToCallTrigger__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "replyToCallEvent.oclIsKindOf(CallEvent)"
		   });	
		addAnnotation
		  (getSendSignalAction__NumberOrder__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getSendSignalAction__TypeOrderingMultiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStartClassifierBehaviorAction__TypeHasClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStartClassifierBehaviorAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction__NumberOrderResults__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction__TypeOrderingMultiplicityMatch__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction__TypeOfObject__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction__MultiplicityOfObject__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getStartObjectBehaviorAction__NumberOrderArguments__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getTestIdentityAction__NoType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.first.type->size() = 0\nand self.second.type->size() = 0\n"
		   });	
		addAnnotation
		  (getTestIdentityAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "self.first.multiplicity.is(1,1)\nand self.second.multiplicity.is(1,1)\n"
		   });	
		addAnnotation
		  (getTestIdentityAction__ResultIsBoolean__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true\n"
		   });	
		addAnnotation
		  (getTimeEvent__WhenNonNegative__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getTimeEvent__StartingTime__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUnmarshallAction__MultiplicityOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUnmarshallAction__MultiplicityOfObject__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUnmarshallAction__StructuralFeature__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUnmarshallAction__NumberOfResult__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUnmarshallAction__UnmarshallTypeIsClassifier__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUnmarshallAction__SameType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getUnmarshallAction__TypeAndOrdering__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getValuePin__NoIncomingEdges__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getValuePin__CompatibleType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getValueSpecificationAction__Multiplicity__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });	
		addAnnotation
		  (getValueSpecificationAction__CompatibleType__DiagnosticChain_Map(), 
		   source, 
		   new String[] {
			 "body", "true"
		   });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";	
		addAnnotation
		  (packageableElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stringExpressionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (valueSpecificationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (packageEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (classEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (classifierEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (propertyEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (behavioralFeatureEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectableElementEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (connectableElementTemplateParameterEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (dataTypeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (protocolStateMachineEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateMachineEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (regionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (transitionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (operationTemplateParameterEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (redefinableTemplateSignatureEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (classifierTemplateParameterEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (extensionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (extensionEndEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (structuredActivityNodeEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (occurrenceSpecificationEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (writeStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (callBehaviorActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (callOperationActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (communicationPathEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (createLinkActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (destroyLinkActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (durationConstraintEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (intervalConstraintEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (durationIntervalEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (enumerationLiteralEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalBooleanEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalIntegerEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalNullEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalRealEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalStringEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (literalUnlimitedNaturalEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (readStructuralFeatureActionEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (stateInvariantEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (timeConstraintEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (timeIntervalEClass, 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>redefines</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createRedefinesAnnotations() {
		String source = "redefines";	
		addAnnotation
		  (getClass_SuperClass(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Classifier/general.1")
		   });	
		addAnnotation
		  (getClassifier__ConformsTo__Classifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Type/conformsTo")
		   });	
		addAnnotation
		  (getStateMachine__IsRedefinitionContextValid__StateMachine(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/isRedefinitionContextValid")
		   });	
		addAnnotation
		  (getStateMachine_ExtendedStateMachine(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//Behavior/redefinedBehavior")
		   });	
		addAnnotation
		  (getRegion__IsRedefinitionContextValid__Region(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/isRedefinitionContextValid")
		   });	
		addAnnotation
		  (getState__IsRedefinitionContextValid__State(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//RedefinableElement/isRedefinitionContextValid")
		   });	
		addAnnotation
		  (getRedefinableTemplateSignature_Classifier(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//TemplateSignature/template")
		   });	
		addAnnotation
		  (getConditionalNode_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StructuredActivityNode/structuredNodeOutput")
		   });	
		addAnnotation
		  (getLoopNode_LoopVariableInput(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StructuredActivityNode/structuredNodeInput")
		   });	
		addAnnotation
		  (getLoopNode_Result(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StructuredActivityNode/structuredNodeOutput")
		   });	
		addAnnotation
		  (getSendObjectAction_Request(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//InvocationAction/argument")
		   });	
		addAnnotation
		  (getSequenceNode_ExecutableNode(), 
		   source, 
		   new String[] {
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//StructuredActivityNode/node")
		   });
	}

} //Uml2PackageImpl

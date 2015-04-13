/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An activity is the specification of parameterized behavior as the coordinated sequencing of subordinate units whose individual elements are actions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Activity#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml2.Activity#getGroup <em>Group</em>}</li>
 *   <li>{@link uml2.Activity#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link uml2.Activity#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml2.Activity#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link uml2.Activity#getIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link uml2.Activity#getPartition <em>Partition</em>}</li>
 *   <li>{@link uml2.Activity#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getActivity()
 * @model
 * @generated
 */
public interface Activity extends Behavior {
	/**
	 * Returns the value of the '<em><b>Edge</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityEdge#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Edges expressing flow between nodes of the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Edge</em>' containment reference list.
	 * @see uml2.Uml2Package#getActivity_Edge()
	 * @see uml2.ActivityEdge#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getEdge();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.ActivityGroup}.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityGroup#getInActivity <em>In Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level groups in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group</em>' containment reference list.
	 * @see uml2.Uml2Package#getActivity_Group()
	 * @see uml2.ActivityGroup#getInActivity
	 * @model opposite="inActivity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityGroup> getGroup();

	/**
	 * Returns the value of the '<em><b>Structured Node</b></em>' reference list.
	 * The list contents are of type {@link uml2.StructuredActivityNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level structured nodes in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Structured Node</em>' reference list.
	 * @see uml2.Uml2Package#getActivity_StructuredNode()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredActivityNode> getStructuredNode();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Variable}.
	 * It is bidirectional and its opposite is '{@link uml2.Variable#getActivityScope <em>Activity Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level variables in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see uml2.Uml2Package#getActivity_Variable()
	 * @see uml2.Variable#getActivityScope
	 * @model opposite="activityScope" containment="true" ordered="false"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Is Read Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, this activity must not make any changes to variables outside the activity or to objects. (This is an assertion, not an executable property. It may be used by an execution engine to optimize model execution. If the assertion is violated by the action, then the model is ill-formed.) The default is false (an activity may make nonlocal changes).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Read Only</em>' attribute.
	 * @see #setIsReadOnly(Boolean)
	 * @see uml2.Uml2Package#getActivity_IsReadOnly()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsReadOnly();

	/**
	 * Sets the value of the '{@link uml2.Activity#getIsReadOnly <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Read Only</em>' attribute.
	 * @see #getIsReadOnly()
	 * @generated
	 */
	void setIsReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Single Execution</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, all invocations of the activity are handled by the same execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Single Execution</em>' attribute.
	 * @see #setIsSingleExecution(Boolean)
	 * @see uml2.Uml2Package#getActivity_IsSingleExecution()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsSingleExecution();

	/**
	 * Sets the value of the '{@link uml2.Activity#getIsSingleExecution <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Single Execution</em>' attribute.
	 * @see #getIsSingleExecution()
	 * @generated
	 */
	void setIsSingleExecution(Boolean value);

	/**
	 * Returns the value of the '<em><b>Partition</b></em>' reference list.
	 * The list contents are of type {@link uml2.ActivityPartition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Top-level partitions in the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Partition</em>' reference list.
	 * @see uml2.Uml2Package#getActivity_Partition()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ActivityPartition> getPartition();

	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityNode#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nodes coordinated by the activity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' containment reference list.
	 * @see uml2.Uml2Package#getActivity_Node()
	 * @see uml2.ActivityNode#getActivity
	 * @model opposite="activity" containment="true" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An activity cannot be autonomous and have a classifier or behavioral feature context at the same time.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean autonomous(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The groups of an activity have no supergroups.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean noSupergroups(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The nodes of the activity must include one ActivityParameterNode for each parameter.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean activityParameterNode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Activity::/structuredNode : StructuredActivityNode
	 * true
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	EList<StructuredActivityNode> structuredNode();

} // Activity

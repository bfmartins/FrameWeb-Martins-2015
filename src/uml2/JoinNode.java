/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Join nodes have a Boolean value specification using the names of the incoming edges to specify the conditions under which the join will emit a token.
 * A join node is a control node that synchronizes multiple flows.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.JoinNode#getIsCombineDuplicate <em>Is Combine Duplicate</em>}</li>
 *   <li>{@link uml2.JoinNode#getJoinSpec <em>Join Spec</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends ControlNode {
	/**
	 * Returns the value of the '<em><b>Is Combine Duplicate</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether tokens having objects with the same identity are combined into one by the join.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #setIsCombineDuplicate(Boolean)
	 * @see uml2.Uml2Package#getJoinNode_IsCombineDuplicate()
	 * @model default="true" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsCombineDuplicate();

	/**
	 * Sets the value of the '{@link uml2.JoinNode#getIsCombineDuplicate <em>Is Combine Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Combine Duplicate</em>' attribute.
	 * @see #getIsCombineDuplicate()
	 * @generated
	 */
	void setIsCombineDuplicate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Join Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A specification giving the conditions under which the join with emit a token. Default is "and".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Join Spec</em>' containment reference.
	 * @see #setJoinSpec(ValueSpecification)
	 * @see uml2.Uml2Package#getJoinNode_JoinSpec()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getJoinSpec();

	/**
	 * Sets the value of the '{@link uml2.JoinNode#getJoinSpec <em>Join Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Spec</em>' containment reference.
	 * @see #getJoinSpec()
	 * @generated
	 */
	void setJoinSpec(ValueSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A join node has one outgoing edge.
	 * self.outgoing->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.outgoing->size() = 1'"
	 * @generated
	 */
	boolean oneOutgoingEdge(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a join node has an incoming object flow, it must have an outgoing object flow, otherwise, it must have an outgoing control flow.
	 * (self.incoming.select(e | e.isTypeOf(ObjectFlow)->notEmpty() implies
	 *   self.outgoing.isTypeOf(ObjectFlow)) and
	 *     (self.incoming.select(e | e.isTypeOf(ObjectFlow)->empty() implies
	 *       self.outgoing.isTypeOf(ControlFlow))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.incoming.select(e | e.isTypeOf(ObjectFlow)->notEmpty() implies\r\n  self.outgoing.isTypeOf(ObjectFlow)) and\r\n    (self.incoming.select(e | e.isTypeOf(ObjectFlow)->empty() implies\r\n      self.outgoing.isTypeOf(ControlFlow))'"
	 * @generated
	 */
	boolean incomingObjectFlow(DiagnosticChain diagnostics, Map<Object, Object> context);

} // JoinNode

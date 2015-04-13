/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A region is an orthogonal part of either a composite state or a state machine. It contains states and transitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Region#getExtendedRegion <em>Extended Region</em>}</li>
 *   <li>{@link uml2.Region#getState <em>State</em>}</li>
 *   <li>{@link uml2.Region#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link uml2.Region#getTransition <em>Transition</em>}</li>
 *   <li>{@link uml2.Region#getSubvertex <em>Subvertex</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getRegion()
 * @model
 * @generated
 */
public interface Region extends Namespace, RedefinableElement {
	/**
	 * Returns the value of the '<em><b>Extended Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The region of which this region is an extension.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extended Region</em>' reference.
	 * @see #setExtendedRegion(Region)
	 * @see uml2.Uml2Package#getRegion_ExtendedRegion()
	 * @model ordered="false"
	 * @generated
	 */
	Region getExtendedRegion();

	/**
	 * Sets the value of the '{@link uml2.Region#getExtendedRegion <em>Extended Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extended Region</em>' reference.
	 * @see #getExtendedRegion()
	 * @generated
	 */
	void setExtendedRegion(Region value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.State#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The State that owns the Region. If a Region is owned by a State, then it cannot also be owned by a StateMachine.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(State)
	 * @see uml2.Uml2Package#getRegion_State()
	 * @see uml2.State#getRegion
	 * @model opposite="region" transient="false" ordered="false"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '{@link uml2.Region#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.StateMachine#getRegion <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The StateMachine that owns the Region. If a Region is owned by a StateMachine, then it cannot also be owned by a State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(StateMachine)
	 * @see uml2.Uml2Package#getRegion_StateMachine()
	 * @see uml2.StateMachine#getRegion
	 * @model opposite="region" transient="false" ordered="false"
	 * @generated
	 */
	StateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link uml2.Region#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(StateMachine value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Transition}.
	 * It is bidirectional and its opposite is '{@link uml2.Transition#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of transitions owned by the region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transition</em>' containment reference list.
	 * @see uml2.Uml2Package#getRegion_Transition()
	 * @see uml2.Transition#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Transition> getTransition();

	/**
	 * Returns the value of the '<em><b>Subvertex</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Vertex}.
	 * It is bidirectional and its opposite is '{@link uml2.Vertex#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of vertices that are owned by this region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subvertex</em>' containment reference list.
	 * @see uml2.Uml2Package#getRegion_Subvertex()
	 * @see uml2.Vertex#getContainer
	 * @model opposite="container" containment="true" ordered="false"
	 * @generated
	 */
	EList<Vertex> getSubvertex();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region can have at most one deep history vertex
	 * self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #deepHistory)->size() <= 1
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->\nselect(p : Pseudostate | p.kind = #deepHistory)->size() <= 1\n'"
	 * @generated
	 */
	boolean deepHistoryVertex(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a Region is owned by a StateMachine, then it cannot also be owned by a State and vice versa.
	 * (stateMachine->notEmpty() implies state->isEmpty()) and (state->notEmpty() implies stateMachine->isEmpty())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(stateMachine->notEmpty() implies state->isEmpty()) and (state->notEmpty() implies stateMachine->isEmpty())'"
	 * @generated
	 */
	boolean owned(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region can have at most one initial vertex
	 * self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #initial)->size() <= 1
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subvertex->select (v | v.oclIsKindOf(Pseudostate))->\nselect(p : Pseudostate | p.kind = #initial)->size() <= 1\n'"
	 * @generated
	 */
	boolean initialVertex(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A region can have at most one shallow history vertex
	 * self.subvertex->select(v | v.oclIsKindOf(Pseudostate))->
	 * select(p : Pseudostate | p.kind = #shallowHistory)->size() <= 1
	 * 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.subvertex->select(v | v.oclIsKindOf(Pseudostate))->\nselect(p : Pseudostate | p.kind = #shallowHistory)->size() <= 1\n'"
	 * @generated
	 */
	boolean shallowHistoryVertex(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation belongsToPSM () checks if the region belongs to a protocol state machine
	 * result = if not stateMachine->isEmpty() then
	 * oclIsTypeOf(ProtocolStateMachine)
	 * else if not state->isEmpty() then
	 * state.container.belongsToPSM ()
	 * else false
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if not stateMachine->isEmpty() then\noclIsTypeOf(ProtocolStateMachine)\nelse if not state->isEmpty() then\nstate.container.belongsToPSM ()\nelse false'"
	 * @generated
	 */
	Boolean belongsToPsm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The operation containingStateMachine() returns the sate machine in which this Region is defined
	 * result = if stateMachine->isEmpty() 
	 * then
	 * state.containingStateMachine()
	 * else
	 * stateMachine
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = if stateMachine->isEmpty() \nthen\nstate.containingStateMachine()\nelse\nstateMachine\nendif'"
	 * @generated
	 */
	StateMachine containingStateMachine();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRedefinitionContextValid() specifies whether the redefinition contexts of a region are properly related to the redefinition contexts of the specified region to allow this element to redefine the other. The containing statemachine/state of a redefining region must redefine the containing statemachine/state of the redefined region.
	 * result = true
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.Boolean" required="true" ordered="false" redefinedRequired="true" redefinedOrdered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = true'"
	 * @generated
	 */
	Boolean isRedefinitionContextValid(Region redefined);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The redefinition context of a region is the nearest containing statemachine
	 * result = let sm = containingStateMachine() in
	 * if sm.context->isEmpty() or sm.general->notEmpty() then
	 * sm
	 * else
	 * sm.context
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = let sm = containingStateMachine() in\nif sm.context->isEmpty() or sm.general->notEmpty() then\nsm\nelse\nsm.context\nendif'"
	 * @generated
	 */
	Classifier redefinitionContext();

} // Region

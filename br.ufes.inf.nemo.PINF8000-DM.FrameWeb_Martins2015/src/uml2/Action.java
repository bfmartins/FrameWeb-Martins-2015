/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action is a named element that is the fundamental unit of executable functionality. The execution of an action represents some transformation or processing in the modeled system, be it a computer system or otherwise.
 * An action represents a single step within an activity, that is, one that is not further decomposed within the activity.
 * An action has pre- and post-conditions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Action#getContext <em>Context</em>}</li>
 *   <li>{@link uml2.Action#getInput <em>Input</em>}</li>
 *   <li>{@link uml2.Action#getIsLocallyReentrant <em>Is Locally Reentrant</em>}</li>
 *   <li>{@link uml2.Action#getLocalPostcondition <em>Local Postcondition</em>}</li>
 *   <li>{@link uml2.Action#getLocalPrecondition <em>Local Precondition</em>}</li>
 *   <li>{@link uml2.Action#getOutput <em>Output</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getAction()
 * @model abstract="true"
 * @generated
 */
public interface Action extends ExecutableNode {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifier that owns the behavior of which this action is a part.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see uml2.Uml2Package#getAction_Context()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Classifier getContext();

	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link uml2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of input pins connected to the Action. These are among the total set of inputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see uml2.Uml2Package#getAction_Input()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<InputPin> getInput();

	/**
	 * Returns the value of the '<em><b>Is Locally Reentrant</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the action can begin a new, concurrent execution, even if there is already another execution of the action ongoing. If false, the action cannot begin a new execution until any previous execution has completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Locally Reentrant</em>' attribute.
	 * @see #setIsLocallyReentrant(Boolean)
	 * @see uml2.Uml2Package#getAction_IsLocallyReentrant()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsLocallyReentrant();

	/**
	 * Sets the value of the '{@link uml2.Action#getIsLocallyReentrant <em>Is Locally Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Locally Reentrant</em>' attribute.
	 * @see #getIsLocallyReentrant()
	 * @generated
	 */
	void setIsLocallyReentrant(Boolean value);

	/**
	 * Returns the value of the '<em><b>Local Postcondition</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint that must be satisfied when executed is completed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Postcondition</em>' containment reference list.
	 * @see uml2.Uml2Package#getAction_LocalPostcondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getLocalPostcondition();

	/**
	 * Returns the value of the '<em><b>Local Precondition</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Constraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constraint that must be satisfied when execution is started.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Precondition</em>' containment reference list.
	 * @see uml2.Uml2Package#getAction_LocalPrecondition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Constraint> getLocalPrecondition();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference list.
	 * The list contents are of type {@link uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of output pins connected to the Action. The action places its results onto pins in this set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output</em>' reference list.
	 * @see uml2.Uml2Package#getAction_Output()
	 * @model changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<OutputPin> getOutput();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Action::/context : Classifier
	 * true
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	Classifier context();

} // Action

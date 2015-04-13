/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A continuation is a syntactic way to define continuations of different branches of an alternative combined fragment. Continuations is intuitively similar to labels representing intermediate points in a flow of control.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Continuation#getSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getContinuation()
 * @model
 * @generated
 */
public interface Continuation extends InteractionFragment {
	/**
	 * Returns the value of the '<em><b>Setting</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True: when the Continuation is at the end of the enclosing InteractionFragment and False when it is in the beginning.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Setting</em>' attribute.
	 * @see #setSetting(Boolean)
	 * @see uml2.Uml2Package#getContinuation_Setting()
	 * @model default="true" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getSetting();

	/**
	 * Sets the value of the '{@link uml2.Continuation#getSetting <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Setting</em>' attribute.
	 * @see #getSetting()
	 * @generated
	 */
	void setSetting(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuations are always global in the enclosing InteractionFragment e.g. it always covers all Lifelines covered by the enclosing InteractionFragment.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean global(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuations always occur as the very first InteractionFragment or the very last InteractionFragment of the enclosing InteractionFragment.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean firstOrLastInteractionFragment(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Continuations with the same name may only cover the same set of Lifelines (within one Classifier).
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean sameName(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Continuation

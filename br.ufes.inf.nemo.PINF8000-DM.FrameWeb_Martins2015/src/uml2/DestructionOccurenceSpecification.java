/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destruction Occurence Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A destruction event models the destruction of an object.
 * <!-- end-model-doc -->
 *
 *
 * @see uml2.Uml2Package#getDestructionOccurenceSpecification()
 * @model
 * @generated
 */
public interface DestructionOccurenceSpecification extends MessageOccurrenceSpecification {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * No other OccurrenceSpecifications on a given Lifeline in an InteractionOperand may appear below a DestructionOccurrenceSpecification.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean noOccurrenceSpecificationsBelow(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DestructionOccurenceSpecification

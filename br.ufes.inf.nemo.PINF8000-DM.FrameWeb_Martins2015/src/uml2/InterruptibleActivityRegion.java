/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interruptible activity region is an activity group that supports termination of tokens flowing in the portions of an activity.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.InterruptibleActivityRegion#getNode <em>Node</em>}</li>
 *   <li>{@link uml2.InterruptibleActivityRegion#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getInterruptibleActivityRegion()
 * @model
 * @generated
 */
public interface InterruptibleActivityRegion extends ActivityGroup {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference list.
	 * The list contents are of type {@link uml2.ActivityNode}.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityNode#getInInterruptibleRegion <em>In Interruptible Region</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nodes immediately contained in the group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node</em>' reference list.
	 * @see uml2.Uml2Package#getInterruptibleActivityRegion_Node()
	 * @see uml2.ActivityNode#getInInterruptibleRegion
	 * @model opposite="inInterruptibleRegion" ordered="false"
	 * @generated
	 */
	EList<ActivityNode> getNode();

	/**
	 * Returns the value of the '<em><b>Interrupting Edge</b></em>' reference list.
	 * The list contents are of type {@link uml2.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link uml2.ActivityEdge#getInterrupts <em>Interrupts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The edges leaving the region that will abort other tokens flowing in the region.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interrupting Edge</em>' reference list.
	 * @see uml2.Uml2Package#getInterruptibleActivityRegion_InterruptingEdge()
	 * @see uml2.ActivityEdge#getInterrupts
	 * @model opposite="interrupts" ordered="false"
	 * @generated
	 */
	EList<ActivityEdge> getInterruptingEdge();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Interrupting edges of a region must have their source node in the region and their target node outside the region in the same activity containing the region.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean interruptingEdges(DiagnosticChain diagnostics, Map<Object, Object> context);

} // InterruptibleActivityRegion

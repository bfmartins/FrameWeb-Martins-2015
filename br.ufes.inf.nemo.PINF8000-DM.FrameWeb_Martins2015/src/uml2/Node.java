/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A node is computational resource upon which artifacts may be deployed for execution. Nodes can be interconnected through communication paths to define network structures.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Node#getNestedNode <em>Nested Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getNode()
 * @model
 * @generated
 */
public interface Node extends uml2.Class, DeploymentTarget {
	/**
	 * Returns the value of the '<em><b>Nested Node</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Nodes that are defined (nested) within the Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nested Node</em>' containment reference list.
	 * @see uml2.Uml2Package#getNode_NestedNode()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Node> getNestedNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The internal structure of a Node (if defined) consists solely of parts of type Node.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean internalStructure(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Node

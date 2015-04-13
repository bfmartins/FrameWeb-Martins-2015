/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Executable Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An executable node is an abstract class for activity nodes that may be executed. It is used as an attachment point for exception handlers.
 * An executable node is an abstract class for activity nodes that may be executed. It is used as an attachment point for exception handlers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.ExecutableNode#getHandler <em>Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getExecutableNode()
 * @model abstract="true"
 * @generated
 */
public interface ExecutableNode extends ActivityNode {
	/**
	 * Returns the value of the '<em><b>Handler</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.ExceptionHandler}.
	 * It is bidirectional and its opposite is '{@link uml2.ExceptionHandler#getProtectedNode <em>Protected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of exception handlers that are examined if an uncaught exception propagates to the outer level of the executable node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler</em>' containment reference list.
	 * @see uml2.Uml2Package#getExecutableNode_Handler()
	 * @see uml2.ExceptionHandler#getProtectedNode
	 * @model opposite="protectedNode" containment="true" ordered="false"
	 * @generated
	 */
	EList<ExceptionHandler> getHandler();

} // ExecutableNode

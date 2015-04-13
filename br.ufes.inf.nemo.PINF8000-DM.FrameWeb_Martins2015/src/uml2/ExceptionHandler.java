/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exception Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An exception handler is an element that specifies a body to execute in case the specified exception occurs during the execution of the protected node.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.ExceptionHandler#getExceptionType <em>Exception Type</em>}</li>
 *   <li>{@link uml2.ExceptionHandler#getHandlerBody <em>Handler Body</em>}</li>
 *   <li>{@link uml2.ExceptionHandler#getProtectedNode <em>Protected Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getExceptionHandler()
 * @model
 * @generated
 */
public interface ExceptionHandler extends Element {
	/**
	 * Returns the value of the '<em><b>Exception Type</b></em>' reference list.
	 * The list contents are of type {@link uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of instances that the handler catches. If an exception occurs whose type is any of the classifiers in the set, the handler catches the exception and executes its body.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Type</em>' reference list.
	 * @see uml2.Uml2Package#getExceptionHandler_ExceptionType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getExceptionType();

	/**
	 * Returns the value of the '<em><b>Handler Body</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A node that is executed if the handler satisfies an uncaught exception.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Handler Body</em>' reference.
	 * @see #setHandlerBody(ExecutableNode)
	 * @see uml2.Uml2Package#getExceptionHandler_HandlerBody()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ExecutableNode getHandlerBody();

	/**
	 * Sets the value of the '{@link uml2.ExceptionHandler#getHandlerBody <em>Handler Body</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Handler Body</em>' reference.
	 * @see #getHandlerBody()
	 * @generated
	 */
	void setHandlerBody(ExecutableNode value);

	/**
	 * Returns the value of the '<em><b>Protected Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.ExecutableNode#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node protected by the handler. The handler is examined if an exception propagates to the outside of the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protected Node</em>' container reference.
	 * @see #setProtectedNode(ExecutableNode)
	 * @see uml2.Uml2Package#getExceptionHandler_ProtectedNode()
	 * @see uml2.ExecutableNode#getHandler
	 * @model opposite="handler" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ExecutableNode getProtectedNode();

	/**
	 * Sets the value of the '{@link uml2.ExceptionHandler#getProtectedNode <em>Protected Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protected Node</em>' container reference.
	 * @see #getProtectedNode()
	 * @generated
	 */
	void setProtectedNode(ExecutableNode value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the protected node is a StructuredActivityNode with output pins, then the exception handler body must also be a StructuredActivityNode with output pins that correspond in number and types to those of the protected node.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean resultPins(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The handler body has one input, and that input is the same as the exception input.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean oneInput(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An edge that has a source in an exception handler structured node must have its target in the handler also, and vice versa.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean edgeSourceTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The exception handler and its input object node are not the source or target of any edge.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean exceptionBody(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ExceptionHandler

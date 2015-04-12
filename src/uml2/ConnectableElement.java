/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connectable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * ConnectableElement is an abstract metaclass representing a set of instances that play roles of a classifier. Connectable elements may be joined by attached connectors and specify configurations of linked instances to be created within an instance of the containing classifier.
 * A connectable element may be exposed as a connectable element template parameter.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.ConnectableElement#getEnd <em>End</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getConnectableElement()
 * @model abstract="true"
 * @generated
 */
public interface ConnectableElement extends TypedElement, ParameterableElement {
	/**
	 * Returns the value of the '<em><b>End</b></em>' reference list.
	 * The list contents are of type {@link uml2.ConnectorEnd}.
	 * It is bidirectional and its opposite is '{@link uml2.ConnectorEnd#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Denotes a set of connector ends that attaches to this connectable element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' reference list.
	 * @see uml2.Uml2Package#getConnectableElement_End()
	 * @see uml2.ConnectorEnd#getRole
	 * @model opposite="role" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for ConnectableElement::/end : ConnectorEnd
	 * true
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	EList<ConnectorEnd> end();

} // ConnectableElement

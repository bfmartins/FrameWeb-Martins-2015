/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A delegation connector is a connector that links the external contract of a component (as specified by its ports) to the realization of that behavior. It represents the forwarding of events (operation requests and events): a signal that arrives at a port that has a delegation connector to one or more parts or ports on parts will be passed on to those targets for handling. An assembly connector is a connector between two or more parts or ports on parts that defines that one or more parts provide the services that other parts use.
 * Specifies a link that enables communication between two or more instances. This link may be an instance of an association, or it may represent the possibility of the instances being able to communicate because their identities are known by virtue of being passed in as parameters, held in variables or slots, or because the communicating instances are the same instance. The link may be realized by something as simple as a pointer or by something as complex as a network connection. In contrast to associations, which specify links between any instance of the associated classifiers, connectors specify links between instances playing the connected parts only.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Connector#getContract <em>Contract</em>}</li>
 *   <li>{@link uml2.Connector#getEnd <em>End</em>}</li>
 *   <li>{@link uml2.Connector#getKind <em>Kind</em>}</li>
 *   <li>{@link uml2.Connector#getRedefinedConnector <em>Redefined Connector</em>}</li>
 *   <li>{@link uml2.Connector#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getConnector()
 * @model
 * @generated
 */
public interface Connector extends Feature {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference list.
	 * The list contents are of type {@link uml2.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Behaviors that specify the valid interaction patterns across the connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' reference list.
	 * @see uml2.Uml2Package#getConnector_Contract()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Behavior> getContract();

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.ConnectorEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A connector consists of at least two connector ends, each representing the participation of instances of the classifiers typing the connectable elements attached to this end. The set of connector ends is ordered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End</em>' containment reference list.
	 * @see uml2.Uml2Package#getConnector_End()
	 * @model containment="true" lower="2"
	 * @generated
	 */
	EList<ConnectorEnd> getEnd();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link uml2.ConnectorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates the kind of connector. This is derived: a connector with one or more ends connected to a Port which is not on a Part and which is not a behavior port is a delegation; otherwise it is an assembly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see uml2.ConnectorKind
	 * @see uml2.Uml2Package#getConnector_Kind()
	 * @model required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	ConnectorKind getKind();

	/**
	 * Returns the value of the '<em><b>Redefined Connector</b></em>' reference list.
	 * The list contents are of type {@link uml2.Connector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A connector may be redefined when its containing classifier is specialized. The redefining connector may have a type that specializes the type of the redefined connector. The types of the connector ends of the redefining connector may specialize the types of the connector ends of the redefined connector. The properties of the connector ends of the redefining connector may be replaced.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redefined Connector</em>' reference list.
	 * @see uml2.Uml2Package#getConnector_RedefinedConnector()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Connector> getRedefinedConnector();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional association that specifies the link corresponding to this connector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Association)
	 * @see uml2.Uml2Package#getConnector_Type()
	 * @model ordered="false"
	 * @generated
	 */
	Association getType();

	/**
	 * Sets the value of the '{@link uml2.Connector#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Association value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Each feature of each of the required interfaces of each Port or Part at the end of a connector must have at least one compatible feature among the features of the provided interfaces of Ports or Parts at the other ends, where the required set of (interface) features of a delegating port from the context of the delegating connector is the set of features that exist in the port's provided interfaces, and the provided set of (interface) features of a delegating port from the context of the delegating connector is the set of features that exist in the port's required interfaces.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean betweenInterfacesPorts(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The connectable elements attached to the ends of a connector must be compatible.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean compatible(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ConnectableElements attached as roles to each ConnectorEnd owned by a Connector must be roles of the Classifier that owned the Connector, or they must be ports of such roles.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean roles(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The types of the connectable elements that the ends of a connector are attached to must conform to the types of the association ends of the association that types the connector, if any.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean types(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Connector::/kind : ConnectorKind
	 * result =
	 * if end->exists(
	 * 		role.oclIsKindOf(Port) 
	 * 		and partWithPort->isEmpty()
	 * 		and not role.oclAsType(Port).isBehavior)
	 * then ConnectorKind::delegation 
	 * else ConnectorKind::assembly 
	 * endif
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result =\r\nif end->exists(\r\n\t\trole.oclIsKindOf(Port) \r\n\t\tand partWithPort->isEmpty()\r\n\t\tand not role.oclAsType(Port).isBehavior)\r\nthen ConnectorKind::delegation \r\nelse ConnectorKind::assembly \r\nendif'"
	 * @generated
	 */
	ConnectorKind kind();

} // Connector

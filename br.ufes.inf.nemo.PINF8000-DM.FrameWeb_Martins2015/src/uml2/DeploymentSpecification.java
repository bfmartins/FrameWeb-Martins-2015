/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment specification specifies a set of properties that determine execution parameters of a component artifact that is deployed on a node. A deployment specification can be aimed at a specific type of container. An artifact that reifies or implements deployment specification properties is a deployment descriptor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link uml2.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link uml2.DeploymentSpecification#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getDeploymentSpecification()
 * @model
 * @generated
 */
public interface DeploymentSpecification extends Artifact {
	/**
	 * Returns the value of the '<em><b>Deployment Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where an Artifact is deployed onto a Node. This is typically a 'directory' or 'memory address'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment Location</em>' attribute.
	 * @see #setDeploymentLocation(String)
	 * @see uml2.Uml2Package#getDeploymentSpecification_DeploymentLocation()
	 * @model dataType="primitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getDeploymentLocation();

	/**
	 * Sets the value of the '{@link uml2.DeploymentSpecification#getDeploymentLocation <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment Location</em>' attribute.
	 * @see #getDeploymentLocation()
	 * @generated
	 */
	void setDeploymentLocation(String value);

	/**
	 * Returns the value of the '<em><b>Execution Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The location where a component Artifact executes. This may be a local or remote location.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Execution Location</em>' attribute.
	 * @see #setExecutionLocation(String)
	 * @see uml2.Uml2Package#getDeploymentSpecification_ExecutionLocation()
	 * @model dataType="primitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getExecutionLocation();

	/**
	 * Sets the value of the '{@link uml2.DeploymentSpecification#getExecutionLocation <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Location</em>' attribute.
	 * @see #getExecutionLocation()
	 * @generated
	 */
	void setExecutionLocation(String value);

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Deployment#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployment with which the DeploymentSpecification is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' container reference.
	 * @see #setDeployment(Deployment)
	 * @see uml2.Uml2Package#getDeploymentSpecification_Deployment()
	 * @see uml2.Deployment#getConfiguration
	 * @model opposite="configuration" transient="false" ordered="false"
	 * @generated
	 */
	Deployment getDeployment();

	/**
	 * Sets the value of the '{@link uml2.DeploymentSpecification#getDeployment <em>Deployment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' container reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(Deployment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The deployedElements of a DeploymentTarget that are involved in a Deployment that has an associated Deployment-Specification is a kind of Component (i.e. the configured components).
	 * self.deployment->forAll (d | d.location.deployedElements->forAll (de |
	 *   de.oclIsKindOf(Component)))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.deployment->forAll (d | d.location.deployedElements->forAll (de |\r\n  de.oclIsKindOf(Component)))'"
	 * @generated
	 */
	boolean deployedElements(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The DeploymentTarget of a DeploymentSpecification is a kind of ExecutionEnvironment.
	 * self.deployment->forAll (d | d.location.oclIsKindOf(ExecutionEnvironment))
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.deployment->forAll (d | d.location.oclIsKindOf(ExecutionEnvironment))'"
	 * @generated
	 */
	boolean deploymentTarget(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DeploymentSpecification

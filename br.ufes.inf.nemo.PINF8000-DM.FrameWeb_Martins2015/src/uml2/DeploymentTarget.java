/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deployment Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A deployment target is the location for a deployed artifact.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.DeploymentTarget#getDeployedElement <em>Deployed Element</em>}</li>
 *   <li>{@link uml2.DeploymentTarget#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getDeploymentTarget()
 * @model abstract="true"
 * @generated
 */
public interface DeploymentTarget extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Deployed Element</b></em>' reference list.
	 * The list contents are of type {@link uml2.PackageableElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of elements that are manifested in an Artifact that is involved in Deployment to a DeploymentTarget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployed Element</em>' reference list.
	 * @see uml2.Uml2Package#getDeploymentTarget_DeployedElement()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<PackageableElement> getDeployedElement();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Deployment}.
	 * It is bidirectional and its opposite is '{@link uml2.Deployment#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of Deployments for a DeploymentTarget.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference list.
	 * @see uml2.Uml2Package#getDeploymentTarget_Deployment()
	 * @see uml2.Deployment#getLocation
	 * @model opposite="location" containment="true" ordered="false"
	 * @generated
	 */
	EList<Deployment> getDeployment();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for DeploymentTarget::/deployedElement : PackageableElement
	 * result = ((self.deployment->collect(deployedArtifact))->collect(manifestation))->collect(utilizedElement)
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = ((self.deployment->collect(deployedArtifact))->collect(manifestation))->collect(utilizedElement)'"
	 * @generated
	 */
	EList<PackageableElement> deployedElement();

} // DeploymentTarget

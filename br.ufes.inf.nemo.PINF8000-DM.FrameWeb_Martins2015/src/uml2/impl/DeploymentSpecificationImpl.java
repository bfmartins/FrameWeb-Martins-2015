/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml2.Deployment;
import uml2.DeploymentSpecification;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deployment Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.DeploymentSpecificationImpl#getDeploymentLocation <em>Deployment Location</em>}</li>
 *   <li>{@link uml2.impl.DeploymentSpecificationImpl#getExecutionLocation <em>Execution Location</em>}</li>
 *   <li>{@link uml2.impl.DeploymentSpecificationImpl#getDeployment <em>Deployment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeploymentSpecificationImpl extends ArtifactImpl implements DeploymentSpecification {
	/**
	 * The default value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPLOYMENT_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeploymentLocation() <em>Deployment Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeploymentLocation()
	 * @generated
	 * @ordered
	 */
	protected String deploymentLocation = DEPLOYMENT_LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTION_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecutionLocation() <em>Execution Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionLocation()
	 * @generated
	 * @ordered
	 */
	protected String executionLocation = EXECUTION_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeploymentSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.DEPLOYMENT_SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeploymentLocation() {
		return deploymentLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeploymentLocation(String newDeploymentLocation) {
		String oldDeploymentLocation = deploymentLocation;
		deploymentLocation = newDeploymentLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION, oldDeploymentLocation, deploymentLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecutionLocation() {
		return executionLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionLocation(String newExecutionLocation) {
		String oldExecutionLocation = executionLocation;
		executionLocation = newExecutionLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION, oldExecutionLocation, executionLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment getDeployment() {
		if (eContainerFeatureID() != Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT) return null;
		return (Deployment)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeployment(Deployment newDeployment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDeployment, Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeployment(Deployment newDeployment) {
		if (newDeployment != eInternalContainer() || (eContainerFeatureID() != Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT && newDeployment != null)) {
			if (EcoreUtil.isAncestor(this, newDeployment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDeployment != null)
				msgs = ((InternalEObject)newDeployment).eInverseAdd(this, Uml2Package.DEPLOYMENT__CONFIGURATION, Deployment.class, msgs);
			msgs = basicSetDeployment(newDeployment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT, newDeployment, newDeployment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deployedElements(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.DEPLOYMENT_SPECIFICATION__DEPLOYED_ELEMENTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deployedElements", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean deploymentTarget(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_TARGET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "deploymentTarget", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDeployment((Deployment)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
				return basicSetDeployment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
				return eInternalContainer().eInverseRemove(this, Uml2Package.DEPLOYMENT__CONFIGURATION, Deployment.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				return getDeploymentLocation();
			case Uml2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				return getExecutionLocation();
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
				return getDeployment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				setDeploymentLocation((String)newValue);
				return;
			case Uml2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				setExecutionLocation((String)newValue);
				return;
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
				setDeployment((Deployment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				setDeploymentLocation(DEPLOYMENT_LOCATION_EDEFAULT);
				return;
			case Uml2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				setExecutionLocation(EXECUTION_LOCATION_EDEFAULT);
				return;
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
				setDeployment((Deployment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT_LOCATION:
				return DEPLOYMENT_LOCATION_EDEFAULT == null ? deploymentLocation != null : !DEPLOYMENT_LOCATION_EDEFAULT.equals(deploymentLocation);
			case Uml2Package.DEPLOYMENT_SPECIFICATION__EXECUTION_LOCATION:
				return EXECUTION_LOCATION_EDEFAULT == null ? executionLocation != null : !EXECUTION_LOCATION_EDEFAULT.equals(executionLocation);
			case Uml2Package.DEPLOYMENT_SPECIFICATION__DEPLOYMENT:
				return getDeployment() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.DEPLOYMENT_SPECIFICATION___DEPLOYED_ELEMENTS__DIAGNOSTICCHAIN_MAP:
				return deployedElements((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.DEPLOYMENT_SPECIFICATION___DEPLOYMENT_TARGET__DIAGNOSTICCHAIN_MAP:
				return deploymentTarget((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (deploymentLocation: ");
		result.append(deploymentLocation);
		result.append(", executionLocation: ");
		result.append(executionLocation);
		result.append(')');
		return result.toString();
	}

} //DeploymentSpecificationImpl

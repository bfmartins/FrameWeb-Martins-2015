/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.ServiceClass;
import frameweb.ServiceGeneralization;
import frameweb.ServiceInterface;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.uml2.uml.internal.impl.GeneralizationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ServiceGeneralizationImpl#getSourceServiceInterface <em>Source Service Interface</em>}</li>
 *   <li>{@link frameweb.impl.ServiceGeneralizationImpl#getTargetServiceClass <em>Target Service Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceGeneralizationImpl extends GeneralizationImpl implements ServiceGeneralization {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.SERVICE_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int ESTATIC_FEATURE_COUNT = 11;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return ESTATIC_FEATURE_COUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface getSourceServiceInterface() {
		return (ServiceInterface)eGet(FramewebPackage.Literals.SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceServiceInterface(ServiceInterface newSourceServiceInterface) {
		eSet(FramewebPackage.Literals.SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE, newSourceServiceInterface);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass getTargetServiceClass() {
		return (ServiceClass)eGet(FramewebPackage.Literals.SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetServiceClass(ServiceClass newTargetServiceClass) {
		eSet(FramewebPackage.Literals.SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS, newTargetServiceClass);
	}

} //ServiceGeneralizationImpl

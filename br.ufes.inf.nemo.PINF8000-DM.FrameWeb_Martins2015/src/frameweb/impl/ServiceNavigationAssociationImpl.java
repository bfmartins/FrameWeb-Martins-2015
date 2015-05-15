/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.ServiceInterface;
import frameweb.ServiceNavigationAssociation;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Navigation Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ServiceNavigationAssociationImpl#getSourceServiceClass <em>Source Service Class</em>}</li>
 *   <li>{@link frameweb.impl.ServiceNavigationAssociationImpl#getTargetFrontController <em>Target Front Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceNavigationAssociationImpl extends ServiceAssociationImpl implements ServiceNavigationAssociation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceNavigationAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.SERVICE_NAVIGATION_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface getSourceServiceClass() {
		return (ServiceInterface)eGet(FramewebPackage.Literals.SERVICE_NAVIGATION_ASSOCIATION__SOURCE_SERVICE_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceServiceClass(ServiceInterface newSourceServiceClass) {
		eSet(FramewebPackage.Literals.SERVICE_NAVIGATION_ASSOCIATION__SOURCE_SERVICE_CLASS, newSourceServiceClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getTargetFrontController() {
		return (FrontControllerClass)eGet(FramewebPackage.Literals.SERVICE_NAVIGATION_ASSOCIATION__TARGET_FRONT_CONTROLLER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrontController(FrontControllerClass newTargetFrontController) {
		eSet(FramewebPackage.Literals.SERVICE_NAVIGATION_ASSOCIATION__TARGET_FRONT_CONTROLLER, newTargetFrontController);
	}

} //ServiceNavigationAssociationImpl

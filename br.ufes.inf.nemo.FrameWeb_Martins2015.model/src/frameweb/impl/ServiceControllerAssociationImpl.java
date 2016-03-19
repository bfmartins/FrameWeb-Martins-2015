/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.ServiceControllerAssociation;
import frameweb.ServiceInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Controller Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ServiceControllerAssociationImpl#getSourceServiceClass <em>Source Service Class</em>}</li>
 *   <li>{@link frameweb.impl.ServiceControllerAssociationImpl#getTargetFrontController <em>Target Front Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceControllerAssociationImpl extends ServiceAssociationImpl implements ServiceControllerAssociation {
	/**
	 * The cached value of the '{@link #getSourceServiceClass() <em>Source Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceServiceClass()
	 * @generated
	 * @ordered
	 */
	protected ServiceInterface sourceServiceClass;

	/**
	 * The cached value of the '{@link #getTargetFrontController() <em>Target Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFrontController()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerClass targetFrontController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceControllerAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.SERVICE_CONTROLLER_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface getSourceServiceClass() {
		if (sourceServiceClass != null && sourceServiceClass.eIsProxy()) {
			InternalEObject oldSourceServiceClass = (InternalEObject)sourceServiceClass;
			sourceServiceClass = (ServiceInterface)eResolveProxy(oldSourceServiceClass);
			if (sourceServiceClass != oldSourceServiceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__SOURCE_SERVICE_CLASS, oldSourceServiceClass, sourceServiceClass));
			}
		}
		return sourceServiceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface basicGetSourceServiceClass() {
		return sourceServiceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceServiceClass(ServiceInterface newSourceServiceClass) {
		ServiceInterface oldSourceServiceClass = sourceServiceClass;
		sourceServiceClass = newSourceServiceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__SOURCE_SERVICE_CLASS, oldSourceServiceClass, sourceServiceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getTargetFrontController() {
		if (targetFrontController != null && targetFrontController.eIsProxy()) {
			InternalEObject oldTargetFrontController = (InternalEObject)targetFrontController;
			targetFrontController = (FrontControllerClass)eResolveProxy(oldTargetFrontController);
			if (targetFrontController != oldTargetFrontController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__TARGET_FRONT_CONTROLLER, oldTargetFrontController, targetFrontController));
			}
		}
		return targetFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass basicGetTargetFrontController() {
		return targetFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetFrontController(FrontControllerClass newTargetFrontController) {
		FrontControllerClass oldTargetFrontController = targetFrontController;
		targetFrontController = newTargetFrontController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__TARGET_FRONT_CONTROLLER, oldTargetFrontController, targetFrontController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__SOURCE_SERVICE_CLASS:
				if (resolve) return getSourceServiceClass();
				return basicGetSourceServiceClass();
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__TARGET_FRONT_CONTROLLER:
				if (resolve) return getTargetFrontController();
				return basicGetTargetFrontController();
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
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__SOURCE_SERVICE_CLASS:
				setSourceServiceClass((ServiceInterface)newValue);
				return;
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__TARGET_FRONT_CONTROLLER:
				setTargetFrontController((FrontControllerClass)newValue);
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
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__SOURCE_SERVICE_CLASS:
				setSourceServiceClass((ServiceInterface)null);
				return;
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__TARGET_FRONT_CONTROLLER:
				setTargetFrontController((FrontControllerClass)null);
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
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__SOURCE_SERVICE_CLASS:
				return sourceServiceClass != null;
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION__TARGET_FRONT_CONTROLLER:
				return targetFrontController != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceControllerAssociationImpl

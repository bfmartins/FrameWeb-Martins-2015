/**
 */
package frameweb.impl;

import frameweb.ChainingDependence;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chaining Dependence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ChainingDependenceImpl#getOutMethod <em>Out Method</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependenceImpl#getInMethod <em>In Method</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependenceImpl#getTargetFrontController <em>Target Front Controller</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependenceImpl#getSourceFrontController <em>Source Front Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainingDependenceImpl extends NavigationDependencyImpl implements ChainingDependence {
	/**
	 * The cached value of the '{@link #getOutMethod() <em>Out Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod outMethod;

	/**
	 * The cached value of the '{@link #getInMethod() <em>In Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod inMethod;

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
	 * The cached value of the '{@link #getSourceFrontController() <em>Source Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFrontController()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerClass sourceFrontController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainingDependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.CHAINING_DEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getOutMethod() {
		if (outMethod != null && outMethod.eIsProxy()) {
			InternalEObject oldOutMethod = (InternalEObject)outMethod;
			outMethod = (FrontControllerMethod)eResolveProxy(oldOutMethod);
			if (outMethod != oldOutMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCE__OUT_METHOD, oldOutMethod, outMethod));
			}
		}
		return outMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetOutMethod() {
		return outMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutMethod(FrontControllerMethod newOutMethod) {
		FrontControllerMethod oldOutMethod = outMethod;
		outMethod = newOutMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCE__OUT_METHOD, oldOutMethod, outMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getInMethod() {
		if (inMethod != null && inMethod.eIsProxy()) {
			InternalEObject oldInMethod = (InternalEObject)inMethod;
			inMethod = (FrontControllerMethod)eResolveProxy(oldInMethod);
			if (inMethod != oldInMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCE__IN_METHOD, oldInMethod, inMethod));
			}
		}
		return inMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetInMethod() {
		return inMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInMethod(FrontControllerMethod newInMethod) {
		FrontControllerMethod oldInMethod = inMethod;
		inMethod = newInMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCE__IN_METHOD, oldInMethod, inMethod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCE__TARGET_FRONT_CONTROLLER, oldTargetFrontController, targetFrontController));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCE__TARGET_FRONT_CONTROLLER, oldTargetFrontController, targetFrontController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getSourceFrontController() {
		if (sourceFrontController != null && sourceFrontController.eIsProxy()) {
			InternalEObject oldSourceFrontController = (InternalEObject)sourceFrontController;
			sourceFrontController = (FrontControllerClass)eResolveProxy(oldSourceFrontController);
			if (sourceFrontController != oldSourceFrontController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCE__SOURCE_FRONT_CONTROLLER, oldSourceFrontController, sourceFrontController));
			}
		}
		return sourceFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass basicGetSourceFrontController() {
		return sourceFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceFrontController(FrontControllerClass newSourceFrontController) {
		FrontControllerClass oldSourceFrontController = sourceFrontController;
		sourceFrontController = newSourceFrontController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCE__SOURCE_FRONT_CONTROLLER, oldSourceFrontController, sourceFrontController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.CHAINING_DEPENDENCE__OUT_METHOD:
				if (resolve) return getOutMethod();
				return basicGetOutMethod();
			case FramewebPackage.CHAINING_DEPENDENCE__IN_METHOD:
				if (resolve) return getInMethod();
				return basicGetInMethod();
			case FramewebPackage.CHAINING_DEPENDENCE__TARGET_FRONT_CONTROLLER:
				if (resolve) return getTargetFrontController();
				return basicGetTargetFrontController();
			case FramewebPackage.CHAINING_DEPENDENCE__SOURCE_FRONT_CONTROLLER:
				if (resolve) return getSourceFrontController();
				return basicGetSourceFrontController();
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
			case FramewebPackage.CHAINING_DEPENDENCE__OUT_METHOD:
				setOutMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.CHAINING_DEPENDENCE__IN_METHOD:
				setInMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.CHAINING_DEPENDENCE__TARGET_FRONT_CONTROLLER:
				setTargetFrontController((FrontControllerClass)newValue);
				return;
			case FramewebPackage.CHAINING_DEPENDENCE__SOURCE_FRONT_CONTROLLER:
				setSourceFrontController((FrontControllerClass)newValue);
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
			case FramewebPackage.CHAINING_DEPENDENCE__OUT_METHOD:
				setOutMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.CHAINING_DEPENDENCE__IN_METHOD:
				setInMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.CHAINING_DEPENDENCE__TARGET_FRONT_CONTROLLER:
				setTargetFrontController((FrontControllerClass)null);
				return;
			case FramewebPackage.CHAINING_DEPENDENCE__SOURCE_FRONT_CONTROLLER:
				setSourceFrontController((FrontControllerClass)null);
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
			case FramewebPackage.CHAINING_DEPENDENCE__OUT_METHOD:
				return outMethod != null;
			case FramewebPackage.CHAINING_DEPENDENCE__IN_METHOD:
				return inMethod != null;
			case FramewebPackage.CHAINING_DEPENDENCE__TARGET_FRONT_CONTROLLER:
				return targetFrontController != null;
			case FramewebPackage.CHAINING_DEPENDENCE__SOURCE_FRONT_CONTROLLER:
				return sourceFrontController != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainingDependenceImpl

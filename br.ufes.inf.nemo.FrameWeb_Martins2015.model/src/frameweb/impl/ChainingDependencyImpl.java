/**
 */
package frameweb.impl;

import frameweb.ChainingDependency;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerMethod;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chaining Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ChainingDependencyImpl#getOutMethod <em>Out Method</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependencyImpl#getInMethod <em>In Method</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependencyImpl#getSupplierFrontController <em>Supplier Front Controller</em>}</li>
 *   <li>{@link frameweb.impl.ChainingDependencyImpl#getClientFrontController <em>Client Front Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChainingDependencyImpl extends NavigationDependencyImpl implements ChainingDependency {
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
	 * The cached value of the '{@link #getSupplierFrontController() <em>Supplier Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierFrontController()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerClass supplierFrontController;

	/**
	 * The cached value of the '{@link #getClientFrontController() <em>Client Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientFrontController()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerClass clientFrontController;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChainingDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.CHAINING_DEPENDENCY;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD, oldOutMethod, outMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD, oldOutMethod, outMethod));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD, oldInMethod, inMethod));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD, oldInMethod, inMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getSupplierFrontController() {
		if (supplierFrontController != null && supplierFrontController.eIsProxy()) {
			InternalEObject oldSupplierFrontController = (InternalEObject)supplierFrontController;
			supplierFrontController = (FrontControllerClass)eResolveProxy(oldSupplierFrontController);
			if (supplierFrontController != oldSupplierFrontController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER, oldSupplierFrontController, supplierFrontController));
			}
		}
		return supplierFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass basicGetSupplierFrontController() {
		return supplierFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierFrontController(FrontControllerClass newSupplierFrontController) {
		FrontControllerClass oldSupplierFrontController = supplierFrontController;
		supplierFrontController = newSupplierFrontController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER, oldSupplierFrontController, supplierFrontController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getClientFrontController() {
		if (clientFrontController != null && clientFrontController.eIsProxy()) {
			InternalEObject oldClientFrontController = (InternalEObject)clientFrontController;
			clientFrontController = (FrontControllerClass)eResolveProxy(oldClientFrontController);
			if (clientFrontController != oldClientFrontController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.CHAINING_DEPENDENCY__CLIENT_FRONT_CONTROLLER, oldClientFrontController, clientFrontController));
			}
		}
		return clientFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass basicGetClientFrontController() {
		return clientFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientFrontController(FrontControllerClass newClientFrontController) {
		FrontControllerClass oldClientFrontController = clientFrontController;
		clientFrontController = newClientFrontController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CHAINING_DEPENDENCY__CLIENT_FRONT_CONTROLLER, oldClientFrontController, clientFrontController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD:
				if (resolve) return getOutMethod();
				return basicGetOutMethod();
			case FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD:
				if (resolve) return getInMethod();
				return basicGetInMethod();
			case FramewebPackage.CHAINING_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER:
				if (resolve) return getSupplierFrontController();
				return basicGetSupplierFrontController();
			case FramewebPackage.CHAINING_DEPENDENCY__CLIENT_FRONT_CONTROLLER:
				if (resolve) return getClientFrontController();
				return basicGetClientFrontController();
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
			case FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD:
				setOutMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD:
				setInMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER:
				setSupplierFrontController((FrontControllerClass)newValue);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__CLIENT_FRONT_CONTROLLER:
				setClientFrontController((FrontControllerClass)newValue);
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
			case FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD:
				setOutMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD:
				setInMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER:
				setSupplierFrontController((FrontControllerClass)null);
				return;
			case FramewebPackage.CHAINING_DEPENDENCY__CLIENT_FRONT_CONTROLLER:
				setClientFrontController((FrontControllerClass)null);
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
			case FramewebPackage.CHAINING_DEPENDENCY__OUT_METHOD:
				return outMethod != null;
			case FramewebPackage.CHAINING_DEPENDENCY__IN_METHOD:
				return inMethod != null;
			case FramewebPackage.CHAINING_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER:
				return supplierFrontController != null;
			case FramewebPackage.CHAINING_DEPENDENCY__CLIENT_FRONT_CONTROLLER:
				return clientFrontController != null;
		}
		return super.eIsSet(featureID);
	}

} //ChainingDependencyImpl

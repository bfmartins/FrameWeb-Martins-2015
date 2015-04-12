/**
 */
package frameweb.impl;

import frameweb.FrameWebPackage;
import frameweb.ServiceClass;
import frameweb.ServiceGeneralization;
import frameweb.ServiceInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2.impl.GeneralizationImpl;

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
	 * The cached value of the '{@link #getSourceServiceInterface() <em>Source Service Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceServiceInterface()
	 * @generated
	 * @ordered
	 */
	protected ServiceInterface sourceServiceInterface;

	/**
	 * The cached value of the '{@link #getTargetServiceClass() <em>Target Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetServiceClass()
	 * @generated
	 * @ordered
	 */
	protected ServiceClass targetServiceClass;

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
		return FrameWebPackage.Literals.SERVICE_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface getSourceServiceInterface() {
		if (sourceServiceInterface != null && sourceServiceInterface.eIsProxy()) {
			InternalEObject oldSourceServiceInterface = (InternalEObject)sourceServiceInterface;
			sourceServiceInterface = (ServiceInterface)eResolveProxy(oldSourceServiceInterface);
			if (sourceServiceInterface != oldSourceServiceInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FrameWebPackage.SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE, oldSourceServiceInterface, sourceServiceInterface));
			}
		}
		return sourceServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface basicGetSourceServiceInterface() {
		return sourceServiceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceServiceInterface(ServiceInterface newSourceServiceInterface) {
		ServiceInterface oldSourceServiceInterface = sourceServiceInterface;
		sourceServiceInterface = newSourceServiceInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE, oldSourceServiceInterface, sourceServiceInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass getTargetServiceClass() {
		if (targetServiceClass != null && targetServiceClass.eIsProxy()) {
			InternalEObject oldTargetServiceClass = (InternalEObject)targetServiceClass;
			targetServiceClass = (ServiceClass)eResolveProxy(oldTargetServiceClass);
			if (targetServiceClass != oldTargetServiceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FrameWebPackage.SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS, oldTargetServiceClass, targetServiceClass));
			}
		}
		return targetServiceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass basicGetTargetServiceClass() {
		return targetServiceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetServiceClass(ServiceClass newTargetServiceClass) {
		ServiceClass oldTargetServiceClass = targetServiceClass;
		targetServiceClass = newTargetServiceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrameWebPackage.SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS, oldTargetServiceClass, targetServiceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FrameWebPackage.SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE:
				if (resolve) return getSourceServiceInterface();
				return basicGetSourceServiceInterface();
			case FrameWebPackage.SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS:
				if (resolve) return getTargetServiceClass();
				return basicGetTargetServiceClass();
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
			case FrameWebPackage.SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE:
				setSourceServiceInterface((ServiceInterface)newValue);
				return;
			case FrameWebPackage.SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS:
				setTargetServiceClass((ServiceClass)newValue);
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
			case FrameWebPackage.SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE:
				setSourceServiceInterface((ServiceInterface)null);
				return;
			case FrameWebPackage.SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS:
				setTargetServiceClass((ServiceClass)null);
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
			case FrameWebPackage.SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE:
				return sourceServiceInterface != null;
			case FrameWebPackage.SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS:
				return targetServiceClass != null;
		}
		return super.eIsSet(featureID);
	}

} //ServiceGeneralizationImpl

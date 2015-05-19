/**
 */
package frameweb.impl;

import frameweb.DAOInterface;
import frameweb.DAOServiceAssociation;
import frameweb.FramewebPackage;
import frameweb.ServiceClass;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Service Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOServiceAssociationImpl#getSourceDAOClass <em>Source DAO Class</em>}</li>
 *   <li>{@link frameweb.impl.DAOServiceAssociationImpl#getTargetDAOService <em>Target DAO Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOServiceAssociationImpl extends ServiceAssociationImpl implements DAOServiceAssociation {
	/**
	 * The cached value of the '{@link #getSourceDAOClass() <em>Source DAO Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDAOClass()
	 * @generated
	 * @ordered
	 */
	protected DAOInterface sourceDAOClass;

	/**
	 * The cached value of the '{@link #getTargetDAOService() <em>Target DAO Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDAOService()
	 * @generated
	 * @ordered
	 */
	protected ServiceClass targetDAOService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOServiceAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_SERVICE_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterface getSourceDAOClass() {
		if (sourceDAOClass != null && sourceDAOClass.eIsProxy()) {
			InternalEObject oldSourceDAOClass = (InternalEObject)sourceDAOClass;
			sourceDAOClass = (DAOInterface)eResolveProxy(oldSourceDAOClass);
			if (sourceDAOClass != oldSourceDAOClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS, oldSourceDAOClass, sourceDAOClass));
			}
		}
		return sourceDAOClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterface basicGetSourceDAOClass() {
		return sourceDAOClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDAOClass(DAOInterface newSourceDAOClass) {
		DAOInterface oldSourceDAOClass = sourceDAOClass;
		sourceDAOClass = newSourceDAOClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS, oldSourceDAOClass, sourceDAOClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass getTargetDAOService() {
		if (targetDAOService != null && targetDAOService.eIsProxy()) {
			InternalEObject oldTargetDAOService = (InternalEObject)targetDAOService;
			targetDAOService = (ServiceClass)eResolveProxy(oldTargetDAOService);
			if (targetDAOService != oldTargetDAOService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE, oldTargetDAOService, targetDAOService));
			}
		}
		return targetDAOService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass basicGetTargetDAOService() {
		return targetDAOService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDAOService(ServiceClass newTargetDAOService) {
		ServiceClass oldTargetDAOService = targetDAOService;
		targetDAOService = newTargetDAOService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE, oldTargetDAOService, targetDAOService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS:
				if (resolve) return getSourceDAOClass();
				return basicGetSourceDAOClass();
			case FramewebPackage.DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE:
				if (resolve) return getTargetDAOService();
				return basicGetTargetDAOService();
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
			case FramewebPackage.DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS:
				setSourceDAOClass((DAOInterface)newValue);
				return;
			case FramewebPackage.DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE:
				setTargetDAOService((ServiceClass)newValue);
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
			case FramewebPackage.DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS:
				setSourceDAOClass((DAOInterface)null);
				return;
			case FramewebPackage.DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE:
				setTargetDAOService((ServiceClass)null);
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
			case FramewebPackage.DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS:
				return sourceDAOClass != null;
			case FramewebPackage.DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE:
				return targetDAOService != null;
		}
		return super.eIsSet(featureID);
	}

} //DAOServiceAssociationImpl

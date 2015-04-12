/**
 */
package frameweb.impl;

import frameweb.DAOClass;
import frameweb.DAOGeneralization;
import frameweb.DAOInterface;
import frameweb.framewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uml2.impl.GeneralizationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOGeneralizationImpl#getTargetDAOClass <em>Target DAO Class</em>}</li>
 *   <li>{@link frameweb.impl.DAOGeneralizationImpl#getSourceDAOInterface <em>Source DAO Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOGeneralizationImpl extends GeneralizationImpl implements DAOGeneralization {
	/**
	 * The cached value of the '{@link #getTargetDAOClass() <em>Target DAO Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetDAOClass()
	 * @generated
	 * @ordered
	 */
	protected DAOClass targetDAOClass;

	/**
	 * The cached value of the '{@link #getSourceDAOInterface() <em>Source DAO Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceDAOInterface()
	 * @generated
	 * @ordered
	 */
	protected DAOInterface sourceDAOInterface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOGeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.DAO_GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOClass getTargetDAOClass() {
		if (targetDAOClass != null && targetDAOClass.eIsProxy()) {
			InternalEObject oldTargetDAOClass = (InternalEObject)targetDAOClass;
			targetDAOClass = (DAOClass)eResolveProxy(oldTargetDAOClass);
			if (targetDAOClass != oldTargetDAOClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.DAO_GENERALIZATION__TARGET_DAO_CLASS, oldTargetDAOClass, targetDAOClass));
			}
		}
		return targetDAOClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOClass basicGetTargetDAOClass() {
		return targetDAOClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetDAOClass(DAOClass newTargetDAOClass) {
		DAOClass oldTargetDAOClass = targetDAOClass;
		targetDAOClass = newTargetDAOClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DAO_GENERALIZATION__TARGET_DAO_CLASS, oldTargetDAOClass, targetDAOClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterface getSourceDAOInterface() {
		if (sourceDAOInterface != null && sourceDAOInterface.eIsProxy()) {
			InternalEObject oldSourceDAOInterface = (InternalEObject)sourceDAOInterface;
			sourceDAOInterface = (DAOInterface)eResolveProxy(oldSourceDAOInterface);
			if (sourceDAOInterface != oldSourceDAOInterface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.DAO_GENERALIZATION__SOURCE_DAO_INTERFACE, oldSourceDAOInterface, sourceDAOInterface));
			}
		}
		return sourceDAOInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterface basicGetSourceDAOInterface() {
		return sourceDAOInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDAOInterface(DAOInterface newSourceDAOInterface) {
		DAOInterface oldSourceDAOInterface = sourceDAOInterface;
		sourceDAOInterface = newSourceDAOInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DAO_GENERALIZATION__SOURCE_DAO_INTERFACE, oldSourceDAOInterface, sourceDAOInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case framewebPackage.DAO_GENERALIZATION__TARGET_DAO_CLASS:
				if (resolve) return getTargetDAOClass();
				return basicGetTargetDAOClass();
			case framewebPackage.DAO_GENERALIZATION__SOURCE_DAO_INTERFACE:
				if (resolve) return getSourceDAOInterface();
				return basicGetSourceDAOInterface();
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
			case framewebPackage.DAO_GENERALIZATION__TARGET_DAO_CLASS:
				setTargetDAOClass((DAOClass)newValue);
				return;
			case framewebPackage.DAO_GENERALIZATION__SOURCE_DAO_INTERFACE:
				setSourceDAOInterface((DAOInterface)newValue);
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
			case framewebPackage.DAO_GENERALIZATION__TARGET_DAO_CLASS:
				setTargetDAOClass((DAOClass)null);
				return;
			case framewebPackage.DAO_GENERALIZATION__SOURCE_DAO_INTERFACE:
				setSourceDAOInterface((DAOInterface)null);
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
			case framewebPackage.DAO_GENERALIZATION__TARGET_DAO_CLASS:
				return targetDAOClass != null;
			case framewebPackage.DAO_GENERALIZATION__SOURCE_DAO_INTERFACE:
				return sourceDAOInterface != null;
		}
		return super.eIsSet(featureID);
	}

} //DAOGeneralizationImpl

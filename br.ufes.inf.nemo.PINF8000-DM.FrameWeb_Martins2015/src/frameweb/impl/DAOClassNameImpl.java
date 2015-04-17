/**
 */
package frameweb.impl;

import frameweb.DAOClassName;
import frameweb.FrameWorkName;
import frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Class Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOClassNameImpl#getFrameWorkNameSufix <em>Frame Work Name Sufix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOClassNameImpl extends DAOInterfaceNameImpl implements DAOClassName {
	/**
	 * The cached value of the '{@link #getFrameWorkNameSufix() <em>Frame Work Name Sufix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrameWorkNameSufix()
	 * @generated
	 * @ordered
	 */
	protected FrameWorkName frameWorkNameSufix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOClassNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_CLASS_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameWorkName getFrameWorkNameSufix() {
		if (frameWorkNameSufix != null && frameWorkNameSufix.eIsProxy()) {
			InternalEObject oldFrameWorkNameSufix = (InternalEObject)frameWorkNameSufix;
			frameWorkNameSufix = (FrameWorkName)eResolveProxy(oldFrameWorkNameSufix);
			if (frameWorkNameSufix != oldFrameWorkNameSufix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.DAO_CLASS_NAME__FRAME_WORK_NAME_SUFIX, oldFrameWorkNameSufix, frameWorkNameSufix));
			}
		}
		return frameWorkNameSufix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameWorkName basicGetFrameWorkNameSufix() {
		return frameWorkNameSufix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrameWorkNameSufix(FrameWorkName newFrameWorkNameSufix) {
		FrameWorkName oldFrameWorkNameSufix = frameWorkNameSufix;
		frameWorkNameSufix = newFrameWorkNameSufix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_CLASS_NAME__FRAME_WORK_NAME_SUFIX, oldFrameWorkNameSufix, frameWorkNameSufix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.DAO_CLASS_NAME__FRAME_WORK_NAME_SUFIX:
				if (resolve) return getFrameWorkNameSufix();
				return basicGetFrameWorkNameSufix();
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
			case FramewebPackage.DAO_CLASS_NAME__FRAME_WORK_NAME_SUFIX:
				setFrameWorkNameSufix((FrameWorkName)newValue);
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
			case FramewebPackage.DAO_CLASS_NAME__FRAME_WORK_NAME_SUFIX:
				setFrameWorkNameSufix((FrameWorkName)null);
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
			case FramewebPackage.DAO_CLASS_NAME__FRAME_WORK_NAME_SUFIX:
				return frameWorkNameSufix != null;
		}
		return super.eIsSet(featureID);
	}

} //DAOClassNameImpl

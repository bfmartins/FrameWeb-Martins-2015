/**
 */
package frameweb.impl;

import frameweb.ConstantName;
import frameweb.ConstantNameList;
import frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.ConstantNameImpl#getFwName <em>Fw Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantNameImpl extends MinimalEObjectImpl.Container implements ConstantName {
	/**
	 * The default value of the '{@link #getFwName() <em>Fw Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwName()
	 * @generated
	 * @ordered
	 */
	protected static final ConstantNameList FW_NAME_EDEFAULT = ConstantNameList.DAO;

	/**
	 * The cached value of the '{@link #getFwName() <em>Fw Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFwName()
	 * @generated
	 * @ordered
	 */
	protected ConstantNameList fwName = FW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantNameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.CONSTANT_NAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantNameList getFwName() {
		return fwName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFwName(ConstantNameList newFwName) {
		ConstantNameList oldFwName = fwName;
		fwName = newFwName == null ? FW_NAME_EDEFAULT : newFwName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.CONSTANT_NAME__FW_NAME, oldFwName, fwName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.CONSTANT_NAME__FW_NAME:
				return getFwName();
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
			case FramewebPackage.CONSTANT_NAME__FW_NAME:
				setFwName((ConstantNameList)newValue);
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
			case FramewebPackage.CONSTANT_NAME__FW_NAME:
				setFwName(FW_NAME_EDEFAULT);
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
			case FramewebPackage.CONSTANT_NAME__FW_NAME:
				return fwName != FW_NAME_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (fwName: ");
		result.append(fwName);
		result.append(')');
		return result.toString();
	}

} //ConstantNameImpl

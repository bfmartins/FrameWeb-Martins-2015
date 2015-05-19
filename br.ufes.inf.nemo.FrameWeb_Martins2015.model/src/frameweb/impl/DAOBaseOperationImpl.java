/**
 */
package frameweb.impl;

import frameweb.DAOBaseOperation;
import frameweb.DAOBaseOperationList;
import frameweb.FramewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAO Base Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DAOBaseOperationImpl#getDAObaseOperationName <em>DA Obase Operation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DAOBaseOperationImpl extends MinimalEObjectImpl.Container implements DAOBaseOperation {
	/**
	 * The default value of the '{@link #getDAObaseOperationName() <em>DA Obase Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAObaseOperationName()
	 * @generated
	 * @ordered
	 */
	protected static final DAOBaseOperationList DA_OBASE_OPERATION_NAME_EDEFAULT = DAOBaseOperationList.RETRIEVE;

	/**
	 * The cached value of the '{@link #getDAObaseOperationName() <em>DA Obase Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDAObaseOperationName()
	 * @generated
	 * @ordered
	 */
	protected DAOBaseOperationList daObaseOperationName = DA_OBASE_OPERATION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DAOBaseOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DAO_BASE_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOBaseOperationList getDAObaseOperationName() {
		return daObaseOperationName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDAObaseOperationName(DAOBaseOperationList newDAObaseOperationName) {
		DAOBaseOperationList oldDAObaseOperationName = daObaseOperationName;
		daObaseOperationName = newDAObaseOperationName == null ? DA_OBASE_OPERATION_NAME_EDEFAULT : newDAObaseOperationName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.DAO_BASE_OPERATION__DA_OBASE_OPERATION_NAME, oldDAObaseOperationName, daObaseOperationName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.DAO_BASE_OPERATION__DA_OBASE_OPERATION_NAME:
				return getDAObaseOperationName();
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
			case FramewebPackage.DAO_BASE_OPERATION__DA_OBASE_OPERATION_NAME:
				setDAObaseOperationName((DAOBaseOperationList)newValue);
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
			case FramewebPackage.DAO_BASE_OPERATION__DA_OBASE_OPERATION_NAME:
				setDAObaseOperationName(DA_OBASE_OPERATION_NAME_EDEFAULT);
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
			case FramewebPackage.DAO_BASE_OPERATION__DA_OBASE_OPERATION_NAME:
				return daObaseOperationName != DA_OBASE_OPERATION_NAME_EDEFAULT;
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
		result.append(" (DAObaseOperationName: ");
		result.append(daObaseOperationName);
		result.append(')');
		return result.toString();
	}

} //DAOBaseOperationImpl

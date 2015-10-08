/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.FrontControllerMethod;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.uml2.uml.internal.impl.OperationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrontControllerMethodImpl#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerMethodImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrontControllerMethodImpl extends OperationImpl implements FrontControllerMethod {
	/**
	 * The default value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefault() <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefault()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefault = IS_DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<Object> result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDefault() {
		return isDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefault(boolean newIsDefault) {
		boolean oldIsDefault = isDefault;
		isDefault = newIsDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT, oldIsDefault, isDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Object> getResult() {
		if (result == null) {
			result = new EDataTypeUniqueEList<Object>(Object.class, this, FramewebPackage.FRONT_CONTROLLER_METHOD__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
				return isIsDefault();
			case FramewebPackage.FRONT_CONTROLLER_METHOD__RESULT:
				return getResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
				setIsDefault((Boolean)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_METHOD__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends Object>)newValue);
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
			case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
				setIsDefault(IS_DEFAULT_EDEFAULT);
				return;
			case FramewebPackage.FRONT_CONTROLLER_METHOD__RESULT:
				getResult().clear();
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
			case FramewebPackage.FRONT_CONTROLLER_METHOD__IS_DEFAULT:
				return isDefault != IS_DEFAULT_EDEFAULT;
			case FramewebPackage.FRONT_CONTROLLER_METHOD__RESULT:
				return result != null && !result.isEmpty();
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
		result.append(" (isDefault: ");
		result.append(isDefault);
		result.append(", result: ");
		result.append(result);
		result.append(')');
		return result.toString();
	}

} //FrontControllerMethodImpl

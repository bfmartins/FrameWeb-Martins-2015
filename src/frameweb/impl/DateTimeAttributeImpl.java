/**
 */
package frameweb.impl;

import frameweb.DateTimeAttribute;
import frameweb.DateTimePrecision;
import frameweb.framewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Date Time Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DateTimeAttributeImpl#getDateTimePrecision <em>Date Time Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateTimeAttributeImpl extends DomainAttributeImpl implements DateTimeAttribute {
	/**
	 * The default value of the '{@link #getDateTimePrecision() <em>Date Time Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimePrecision()
	 * @generated
	 * @ordered
	 */
	protected static final DateTimePrecision DATE_TIME_PRECISION_EDEFAULT = DateTimePrecision.TIMESTAMP;

	/**
	 * The cached value of the '{@link #getDateTimePrecision() <em>Date Time Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateTimePrecision()
	 * @generated
	 * @ordered
	 */
	protected DateTimePrecision dateTimePrecision = DATE_TIME_PRECISION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateTimeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.DATE_TIME_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePrecision getDateTimePrecision() {
		return dateTimePrecision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimePrecision(DateTimePrecision newDateTimePrecision) {
		DateTimePrecision oldDateTimePrecision = dateTimePrecision;
		dateTimePrecision = newDateTimePrecision == null ? DATE_TIME_PRECISION_EDEFAULT : newDateTimePrecision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION, oldDateTimePrecision, dateTimePrecision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case framewebPackage.DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION:
				return getDateTimePrecision();
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
			case framewebPackage.DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION:
				setDateTimePrecision((DateTimePrecision)newValue);
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
			case framewebPackage.DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION:
				setDateTimePrecision(DATE_TIME_PRECISION_EDEFAULT);
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
			case framewebPackage.DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION:
				return dateTimePrecision != DATE_TIME_PRECISION_EDEFAULT;
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
		result.append(" (dateTimePrecision: ");
		result.append(dateTimePrecision);
		result.append(')');
		return result.toString();
	}

} //DateTimeAttributeImpl

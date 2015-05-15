/**
 */
package frameweb.impl;

import frameweb.DateTimeAttribute;
import frameweb.DateTimePrecision;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

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
		return FramewebPackage.Literals.DATE_TIME_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePrecision getDateTimePrecision() {
		return (DateTimePrecision)eGet(FramewebPackage.Literals.DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateTimePrecision(DateTimePrecision newDateTimePrecision) {
		eSet(FramewebPackage.Literals.DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION, newDateTimePrecision);
	}

} //DateTimeAttributeImpl

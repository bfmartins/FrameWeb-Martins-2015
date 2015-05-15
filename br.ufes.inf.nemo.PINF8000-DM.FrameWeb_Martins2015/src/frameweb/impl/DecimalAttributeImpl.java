/**
 */
package frameweb.impl;

import frameweb.DecimalAttribute;
import frameweb.FramewebPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decimal Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.DecimalAttributeImpl#getDecimalPrecision <em>Decimal Precision</em>}</li>
 *   <li>{@link frameweb.impl.DecimalAttributeImpl#getDecimalScale <em>Decimal Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DecimalAttributeImpl extends DomainAttributeImpl implements DecimalAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecimalAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.DECIMAL_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDecimalPrecision() {
		return (Long)eGet(FramewebPackage.Literals.DECIMAL_ATTRIBUTE__DECIMAL_PRECISION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalPrecision(long newDecimalPrecision) {
		eSet(FramewebPackage.Literals.DECIMAL_ATTRIBUTE__DECIMAL_PRECISION, newDecimalPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getDecimalScale() {
		return (Long)eGet(FramewebPackage.Literals.DECIMAL_ATTRIBUTE__DECIMAL_SCALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecimalScale(long newDecimalScale) {
		eSet(FramewebPackage.Literals.DECIMAL_ATTRIBUTE__DECIMAL_SCALE, newDecimalScale);
	}

} //DecimalAttributeImpl

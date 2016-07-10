/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Decimal Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DecimalAttribute#getDecimalPrecision <em>Decimal Precision</em>}</li>
 *   <li>{@link frameweb.DecimalAttribute#getDecimalScale <em>Decimal Scale</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDecimalAttribute()
 * @model
 * @generated
 */
public interface DecimalAttribute extends EntityAttribute {
	/**
	 * Returns the value of the '<em><b>Decimal Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Precision</em>' attribute.
	 * @see #setDecimalPrecision(long)
	 * @see frameweb.FramewebPackage#getDecimalAttribute_DecimalPrecision()
	 * @model
	 * @generated
	 */
	long getDecimalPrecision();

	/**
	 * Sets the value of the '{@link frameweb.DecimalAttribute#getDecimalPrecision <em>Decimal Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Precision</em>' attribute.
	 * @see #getDecimalPrecision()
	 * @generated
	 */
	void setDecimalPrecision(long value);

	/**
	 * Returns the value of the '<em><b>Decimal Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal Scale</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal Scale</em>' attribute.
	 * @see #setDecimalScale(long)
	 * @see frameweb.FramewebPackage#getDecimalAttribute_DecimalScale()
	 * @model
	 * @generated
	 */
	long getDecimalScale();

	/**
	 * Sets the value of the '{@link frameweb.DecimalAttribute#getDecimalScale <em>Decimal Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal Scale</em>' attribute.
	 * @see #getDecimalScale()
	 * @generated
	 */
	void setDecimalScale(long value);

} // DecimalAttribute

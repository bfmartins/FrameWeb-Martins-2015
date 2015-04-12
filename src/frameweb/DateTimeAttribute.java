/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Date Time Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DateTimeAttribute#getDateTimePrecision <em>Date Time Precision</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getDateTimeAttribute()
 * @model
 * @generated
 */
public interface DateTimeAttribute extends DomainAttribute {
	/**
	 * Returns the value of the '<em><b>Date Time Precision</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.DateTimePrecision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Precision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Precision</em>' attribute.
	 * @see frameweb.DateTimePrecision
	 * @see #setDateTimePrecision(DateTimePrecision)
	 * @see frameweb.framewebPackage#getDateTimeAttribute_DateTimePrecision()
	 * @model
	 * @generated
	 */
	DateTimePrecision getDateTimePrecision();

	/**
	 * Sets the value of the '{@link frameweb.DateTimeAttribute#getDateTimePrecision <em>Date Time Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Time Precision</em>' attribute.
	 * @see frameweb.DateTimePrecision
	 * @see #getDateTimePrecision()
	 * @generated
	 */
	void setDateTimePrecision(DateTimePrecision value);

} // DateTimeAttribute

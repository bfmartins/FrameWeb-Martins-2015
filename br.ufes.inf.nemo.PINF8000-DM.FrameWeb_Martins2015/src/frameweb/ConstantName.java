/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ConstantName#getFwName <em>Fw Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getConstantName()
 * @model
 * @generated
 */
public interface ConstantName extends FrameWebName {
	/**
	 * Returns the value of the '<em><b>Fw Name</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.ConstantNameList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fw Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fw Name</em>' attribute.
	 * @see frameweb.ConstantNameList
	 * @see #setFwName(ConstantNameList)
	 * @see frameweb.FramewebPackage#getConstantName_FwName()
	 * @model
	 * @generated
	 */
	ConstantNameList getFwName();

	/**
	 * Sets the value of the '{@link frameweb.ConstantName#getFwName <em>Fw Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fw Name</em>' attribute.
	 * @see frameweb.ConstantNameList
	 * @see #getFwName()
	 * @generated
	 */
	void setFwName(ConstantNameList value);

} // ConstantName

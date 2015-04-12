/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Column Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainColumnName#getFwName <em>Fw Name</em>}</li>
 *   <li>{@link frameweb.DomainColumnName#getDomainAttributeName <em>Domain Attribute Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getDomainColumnName()
 * @model
 * @generated
 */
public interface DomainColumnName extends FrameWebName {
	/**
	 * Returns the value of the '<em><b>Fw Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fw Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fw Name</em>' attribute.
	 * @see #setFwName(String)
	 * @see frameweb.FrameWebPackage#getDomainColumnName_FwName()
	 * @model
	 * @generated
	 */
	String getFwName();

	/**
	 * Sets the value of the '{@link frameweb.DomainColumnName#getFwName <em>Fw Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fw Name</em>' attribute.
	 * @see #getFwName()
	 * @generated
	 */
	void setFwName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Attribute Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link frameweb.DomainAttribute#getColumn <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Attribute Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Attribute Name</em>' reference.
	 * @see #setDomainAttributeName(DomainAttribute)
	 * @see frameweb.FrameWebPackage#getDomainColumnName_DomainAttributeName()
	 * @see frameweb.DomainAttribute#getColumn
	 * @model opposite="Column" required="true"
	 * @generated
	 */
	DomainAttribute getDomainAttributeName();

	/**
	 * Sets the value of the '{@link frameweb.DomainColumnName#getDomainAttributeName <em>Domain Attribute Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Attribute Name</em>' reference.
	 * @see #getDomainAttributeName()
	 * @generated
	 */
	void setDomainAttributeName(DomainAttribute value);

} // DomainColumnName

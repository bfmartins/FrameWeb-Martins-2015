/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Interface Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAOInterfaceName#getConstantPrefix <em>Constant Prefix</em>}</li>
 *   <li>{@link frameweb.DAOInterfaceName#getDomainTablePrefix <em>Domain Table Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getDAOInterfaceName()
 * @model
 * @generated
 */
public interface DAOInterfaceName extends ConstantName {
	/**
	 * Returns the value of the '<em><b>Constant Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant Prefix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant Prefix</em>' reference.
	 * @see #setConstantPrefix(ConstantName)
	 * @see frameweb.framewebPackage#getDAOInterfaceName_ConstantPrefix()
	 * @model
	 * @generated
	 */
	ConstantName getConstantPrefix();

	/**
	 * Sets the value of the '{@link frameweb.DAOInterfaceName#getConstantPrefix <em>Constant Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant Prefix</em>' reference.
	 * @see #getConstantPrefix()
	 * @generated
	 */
	void setConstantPrefix(ConstantName value);

	/**
	 * Returns the value of the '<em><b>Domain Table Prefix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Table Prefix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Table Prefix</em>' reference.
	 * @see #setDomainTablePrefix(DomainTableName)
	 * @see frameweb.framewebPackage#getDAOInterfaceName_DomainTablePrefix()
	 * @model
	 * @generated
	 */
	DomainTableName getDomainTablePrefix();

	/**
	 * Sets the value of the '{@link frameweb.DAOInterfaceName#getDomainTablePrefix <em>Domain Table Prefix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Table Prefix</em>' reference.
	 * @see #getDomainTablePrefix()
	 * @generated
	 */
	void setDomainTablePrefix(DomainTableName value);

} // DAOInterfaceName

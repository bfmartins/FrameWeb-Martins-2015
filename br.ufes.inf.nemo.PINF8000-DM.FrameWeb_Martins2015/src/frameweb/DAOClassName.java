/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Class Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAOClassName#getFrameWorkNameSufix <em>Frame Work Name Sufix</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getDAOClassName()
 * @model
 * @generated
 */
public interface DAOClassName extends DAOInterfaceName {
	/**
	 * Returns the value of the '<em><b>Frame Work Name Sufix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame Work Name Sufix</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame Work Name Sufix</em>' reference.
	 * @see #setFrameWorkNameSufix(FrameWorkName)
	 * @see frameweb.FrameWebPackage#getDAOClassName_FrameWorkNameSufix()
	 * @model required="true"
	 * @generated
	 */
	FrameWorkName getFrameWorkNameSufix();

	/**
	 * Sets the value of the '{@link frameweb.DAOClassName#getFrameWorkNameSufix <em>Frame Work Name Sufix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame Work Name Sufix</em>' reference.
	 * @see #getFrameWorkNameSufix()
	 * @generated
	 */
	void setFrameWorkNameSufix(FrameWorkName value);

} // DAOClassName

/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persistent Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.PersistentClass#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getPersistentClass()
 * @model
 * @generated
 */
public interface PersistentClass extends DomainClass {
	/**
	 * Returns the value of the '<em><b>Table</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link frameweb.DomainTableName#getPersistentClassName <em>Persistent Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' reference.
	 * @see #setTable(DomainTableName)
	 * @see frameweb.FramewebPackage#getPersistentClass_Table()
	 * @see frameweb.DomainTableName#getPersistentClassName
	 * @model opposite="PersistentClassName"
	 * @generated
	 */
	DomainTableName getTable();

	/**
	 * Sets the value of the '{@link frameweb.PersistentClass#getTable <em>Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(DomainTableName value);

} // PersistentClass

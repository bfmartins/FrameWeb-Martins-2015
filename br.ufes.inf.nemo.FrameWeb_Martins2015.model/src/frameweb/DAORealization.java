/**
 */
package frameweb;

import org.eclipse.uml2.uml.Realization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAORealization#getTargetDAOClass <em>Target DAO Class</em>}</li>
 *   <li>{@link frameweb.DAORealization#getSourceDAOInterface <em>Source DAO Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDAORealization()
 * @model
 * @generated
 */
public interface DAORealization extends Realization {
	/**
	 * Returns the value of the '<em><b>Target DAO Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target DAO Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target DAO Class</em>' reference.
	 * @see #setTargetDAOClass(DAOClass)
	 * @see frameweb.FramewebPackage#getDAORealization_TargetDAOClass()
	 * @model required="true"
	 * @generated
	 */
	DAOClass getTargetDAOClass();

	/**
	 * Sets the value of the '{@link frameweb.DAORealization#getTargetDAOClass <em>Target DAO Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target DAO Class</em>' reference.
	 * @see #getTargetDAOClass()
	 * @generated
	 */
	void setTargetDAOClass(DAOClass value);

	/**
	 * Returns the value of the '<em><b>Source DAO Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source DAO Interface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source DAO Interface</em>' reference.
	 * @see #setSourceDAOInterface(DAOInterface)
	 * @see frameweb.FramewebPackage#getDAORealization_SourceDAOInterface()
	 * @model required="true"
	 * @generated
	 */
	DAOInterface getSourceDAOInterface();

	/**
	 * Sets the value of the '{@link frameweb.DAORealization#getSourceDAOInterface <em>Source DAO Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source DAO Interface</em>' reference.
	 * @see #getSourceDAOInterface()
	 * @generated
	 */
	void setSourceDAOInterface(DAOInterface value);

} // DAORealization

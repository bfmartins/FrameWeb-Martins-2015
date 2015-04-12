/**
 */
package frameweb;

import uml2.Generalization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAOGeneralization#getTargetDAOClass <em>Target DAO Class</em>}</li>
 *   <li>{@link frameweb.DAOGeneralization#getSourceDAOInterface <em>Source DAO Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getDAOGeneralization()
 * @model
 * @generated
 */
public interface DAOGeneralization extends Generalization {
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
	 * @see frameweb.framewebPackage#getDAOGeneralization_TargetDAOClass()
	 * @model required="true"
	 * @generated
	 */
	DAOClass getTargetDAOClass();

	/**
	 * Sets the value of the '{@link frameweb.DAOGeneralization#getTargetDAOClass <em>Target DAO Class</em>}' reference.
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
	 * @see frameweb.framewebPackage#getDAOGeneralization_SourceDAOInterface()
	 * @model required="true"
	 * @generated
	 */
	DAOInterface getSourceDAOInterface();

	/**
	 * Sets the value of the '{@link frameweb.DAOGeneralization#getSourceDAOInterface <em>Source DAO Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source DAO Interface</em>' reference.
	 * @see #getSourceDAOInterface()
	 * @generated
	 */
	void setSourceDAOInterface(DAOInterface value);

} // DAOGeneralization

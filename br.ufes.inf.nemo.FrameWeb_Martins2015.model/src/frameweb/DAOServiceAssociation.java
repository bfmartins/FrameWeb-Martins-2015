/**
 */
package frameweb;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Service Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAOServiceAssociation#getSourceDAOClass <em>Source DAO Class</em>}</li>
 *   <li>{@link frameweb.DAOServiceAssociation#getTargetDAOService <em>Target DAO Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDAOServiceAssociation()
 * @model
 * @generated
 */
public interface DAOServiceAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>Source DAO Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source DAO Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source DAO Class</em>' reference.
	 * @see #setSourceDAOClass(DAOInterface)
	 * @see frameweb.FramewebPackage#getDAOServiceAssociation_SourceDAOClass()
	 * @model required="true"
	 * @generated
	 */
	DAOInterface getSourceDAOClass();

	/**
	 * Sets the value of the '{@link frameweb.DAOServiceAssociation#getSourceDAOClass <em>Source DAO Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source DAO Class</em>' reference.
	 * @see #getSourceDAOClass()
	 * @generated
	 */
	void setSourceDAOClass(DAOInterface value);

	/**
	 * Returns the value of the '<em><b>Target DAO Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target DAO Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target DAO Service</em>' reference.
	 * @see #setTargetDAOService(ServiceClass)
	 * @see frameweb.FramewebPackage#getDAOServiceAssociation_TargetDAOService()
	 * @model required="true"
	 * @generated
	 */
	ServiceClass getTargetDAOService();

	/**
	 * Sets the value of the '{@link frameweb.DAOServiceAssociation#getTargetDAOService <em>Target DAO Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target DAO Service</em>' reference.
	 * @see #getTargetDAOService()
	 * @generated
	 */
	void setTargetDAOService(ServiceClass value);

} // DAOServiceAssociation

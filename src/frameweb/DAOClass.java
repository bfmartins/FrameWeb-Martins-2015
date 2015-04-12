/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAOClass#getBaseImplements <em>Base Implements</em>}</li>
 *   <li>{@link frameweb.DAOClass#getDAOImplements <em>DAO Implements</em>}</li>
 *   <li>{@link frameweb.DAOClass#getDAOClassName <em>DAO Class Name</em>}</li>
 *   <li>{@link frameweb.DAOClass#getDAOClassAttribute <em>DAO Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getDAOClass()
 * @model
 * @generated
 */
public interface DAOClass extends uml2.Class {
	/**
	 * Returns the value of the '<em><b>Base Implements</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOBaseOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Implements</em>' containment reference list.
	 * @see frameweb.framewebPackage#getDAOClass_BaseImplements()
	 * @model containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList<DAOBaseOperation> getBaseImplements();

	/**
	 * Returns the value of the '<em><b>DAO Implements</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DAO Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DAO Implements</em>' containment reference list.
	 * @see frameweb.framewebPackage#getDAOClass_DAOImplements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAOOperation> getDAOImplements();

	/**
	 * Returns the value of the '<em><b>DAO Class Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DAO Class Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DAO Class Name</em>' reference.
	 * @see #setDAOClassName(DAOClassName)
	 * @see frameweb.framewebPackage#getDAOClass_DAOClassName()
	 * @model required="true"
	 * @generated
	 */
	DAOClassName getDAOClassName();

	/**
	 * Sets the value of the '{@link frameweb.DAOClass#getDAOClassName <em>DAO Class Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DAO Class Name</em>' reference.
	 * @see #getDAOClassName()
	 * @generated
	 */
	void setDAOClassName(DAOClassName value);

	/**
	 * Returns the value of the '<em><b>DAO Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DAO Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DAO Class Attribute</em>' containment reference list.
	 * @see frameweb.framewebPackage#getDAOClass_DAOClassAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAOAttribute> getDAOClassAttribute();

} // DAOClass

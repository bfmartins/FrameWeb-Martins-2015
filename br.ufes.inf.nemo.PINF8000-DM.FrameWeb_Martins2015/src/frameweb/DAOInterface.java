/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

import uml2.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAOInterface#getOwnBaseOperation <em>Own Base Operation</em>}</li>
 *   <li>{@link frameweb.DAOInterface#getOwnOperation <em>Own Operation</em>}</li>
 *   <li>{@link frameweb.DAOInterface#getDAOInterfaceName <em>DAO Interface Name</em>}</li>
 *   <li>{@link frameweb.DAOInterface#getDAOInterfaceAttribute <em>DAO Interface Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDAOInterface()
 * @model
 * @generated
 */
public interface DAOInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Own Base Operation</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOBaseOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own Base Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own Base Operation</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDAOInterface_OwnBaseOperation()
	 * @model containment="true" lower="4" upper="4"
	 * @generated
	 */
	EList<DAOBaseOperation> getOwnBaseOperation();

	/**
	 * Returns the value of the '<em><b>Own Operation</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Own Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Own Operation</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDAOInterface_OwnOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAOOperation> getOwnOperation();

	/**
	 * Returns the value of the '<em><b>DAO Interface Name</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DAO Interface Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DAO Interface Name</em>' reference.
	 * @see #setDAOInterfaceName(DAOInterfaceName)
	 * @see frameweb.FramewebPackage#getDAOInterface_DAOInterfaceName()
	 * @model required="true"
	 * @generated
	 */
	DAOInterfaceName getDAOInterfaceName();

	/**
	 * Sets the value of the '{@link frameweb.DAOInterface#getDAOInterfaceName <em>DAO Interface Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DAO Interface Name</em>' reference.
	 * @see #getDAOInterfaceName()
	 * @generated
	 */
	void setDAOInterfaceName(DAOInterfaceName value);

	/**
	 * Returns the value of the '<em><b>DAO Interface Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DAO Interface Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DAO Interface Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDAOInterface_DAOInterfaceAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAOAttribute> getDAOInterfaceAttribute();

} // DAOInterface

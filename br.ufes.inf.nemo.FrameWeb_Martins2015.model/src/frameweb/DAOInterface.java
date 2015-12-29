/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAOInterface#getOwnOperation <em>Own Operation</em>}</li>
 *   <li>{@link frameweb.DAOInterface#getDAOInterfaceName <em>DAO Interface Name</em>}</li>
 *   <li>{@link frameweb.DAOInterface#getDAOInterfaceAttribute <em>DAO Interface Attribute</em>}</li>
 *   <li>{@link frameweb.DAOInterface#getInfix <em>Infix</em>}</li>
 *   <li>{@link frameweb.DAOInterface#getSufix <em>Sufix</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDAOInterface()
 * @model
 * @generated
 */
public interface DAOInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Own Operation</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOMethod}.
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
	EList<DAOMethod> getOwnOperation();

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

	/**
	 * Returns the value of the '<em><b>Infix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infix</em>' attribute.
	 * @see #setInfix(String)
	 * @see frameweb.FramewebPackage#getDAOInterface_Infix()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 * @generated
	 */
	String getInfix();

	/**
	 * Sets the value of the '{@link frameweb.DAOInterface#getInfix <em>Infix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Infix</em>' attribute.
	 * @see #getInfix()
	 * @generated
	 */
	void setInfix(String value);

	/**
	 * Returns the value of the '<em><b>Sufix</b></em>' attribute.
	 * The default value is <code>"DAO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sufix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sufix</em>' attribute.
	 * @see frameweb.FramewebPackage#getDAOInterface_Sufix()
	 * @model default="DAO" dataType="org.eclipse.uml2.types.String" required="true" changeable="false"
	 * @generated
	 */
	String getSufix();

} // DAOInterface

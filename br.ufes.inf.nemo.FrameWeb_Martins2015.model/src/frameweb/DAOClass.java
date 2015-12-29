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
 *   <li>{@link frameweb.DAOClass#getDAOImplements <em>DAO Implements</em>}</li>
 *   <li>{@link frameweb.DAOClass#getDAOClassName <em>DAO Class Name</em>}</li>
 *   <li>{@link frameweb.DAOClass#getDAOClassAttribute <em>DAO Class Attribute</em>}</li>
 *   <li>{@link frameweb.DAOClass#getSufix <em>Sufix</em>}</li>
 *   <li>{@link frameweb.DAOClass#getInfix <em>Infix</em>}</li>
 *   <li>{@link frameweb.DAOClass#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDAOClass()
 * @model
 * @generated
 */
public interface DAOClass extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>DAO Implements</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DAOMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DAO Implements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DAO Implements</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDAOClass_DAOImplements()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAOMethod> getDAOImplements();

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
	 * @see frameweb.FramewebPackage#getDAOClass_DAOClassName()
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
	 * @see frameweb.FramewebPackage#getDAOClass_DAOClassAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<DAOAttribute> getDAOClassAttribute();

	/**
	 * Returns the value of the '<em><b>Sufix</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sufix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sufix</em>' attribute.
	 * @see frameweb.FramewebPackage#getDAOClass_Sufix()
	 * @model default="" dataType="org.eclipse.uml2.types.String" required="true" changeable="false" derived="true"
	 * @generated
	 */
	String getSufix();

	/**
	 * Returns the value of the '<em><b>Infix</b></em>' attribute.
	 * The default value is <code>"DAO"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Infix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Infix</em>' attribute.
	 * @see frameweb.FramewebPackage#getDAOClass_Infix()
	 * @model default="DAO" dataType="org.eclipse.uml2.types.String" required="true" changeable="false"
	 * @generated
	 */
	String getInfix();

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see frameweb.FramewebPackage#getDAOClass_Prefix()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" changeable="false" derived="true"
	 * @generated
	 */
	String getPrefix();

} // DAOClass

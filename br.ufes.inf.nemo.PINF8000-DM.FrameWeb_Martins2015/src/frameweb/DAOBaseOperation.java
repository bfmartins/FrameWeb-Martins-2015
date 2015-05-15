/**
 */
package frameweb;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAO Base Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DAOBaseOperation#getDAObaseOperationName <em>DA Obase Operation Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDAOBaseOperation()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface DAOBaseOperation extends CDOObject {
	/**
	 * Returns the value of the '<em><b>DA Obase Operation Name</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.DAOBaseOperationList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DA Obase Operation Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DA Obase Operation Name</em>' attribute.
	 * @see frameweb.DAOBaseOperationList
	 * @see #setDAObaseOperationName(DAOBaseOperationList)
	 * @see frameweb.FramewebPackage#getDAOBaseOperation_DAObaseOperationName()
	 * @model
	 * @generated
	 */
	DAOBaseOperationList getDAObaseOperationName();

	/**
	 * Sets the value of the '{@link frameweb.DAOBaseOperation#getDAObaseOperationName <em>DA Obase Operation Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DA Obase Operation Name</em>' attribute.
	 * @see frameweb.DAOBaseOperationList
	 * @see #getDAObaseOperationName()
	 * @generated
	 */
	void setDAObaseOperationName(DAOBaseOperationList value);

} // DAOBaseOperation

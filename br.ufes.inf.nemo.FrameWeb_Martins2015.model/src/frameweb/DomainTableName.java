/**
 */
package frameweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Table Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainTableName#getFwName <em>Fw Name</em>}</li>
 *   <li>{@link frameweb.DomainTableName#getPersistentClassName <em>Persistent Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDomainTableName()
 * @model
 * @generated
 */
public interface DomainTableName extends EObject {
	/**
	 * Returns the value of the '<em><b>Fw Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fw Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fw Name</em>' attribute.
	 * @see #setFwName(String)
	 * @see frameweb.FramewebPackage#getDomainTableName_FwName()
	 * @model
	 * @generated
	 */
	String getFwName();

	/**
	 * Sets the value of the '{@link frameweb.DomainTableName#getFwName <em>Fw Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fw Name</em>' attribute.
	 * @see #getFwName()
	 * @generated
	 */
	void setFwName(String value);

	/**
	 * Returns the value of the '<em><b>Persistent Class Name</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link frameweb.PersistentClass#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent Class Name</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent Class Name</em>' reference.
	 * @see #setPersistentClassName(PersistentClass)
	 * @see frameweb.FramewebPackage#getDomainTableName_PersistentClassName()
	 * @see frameweb.PersistentClass#getTable
	 * @model opposite="Table" required="true"
	 * @generated
	 */
	PersistentClass getPersistentClassName();

	/**
	 * Sets the value of the '{@link frameweb.DomainTableName#getPersistentClassName <em>Persistent Class Name</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent Class Name</em>' reference.
	 * @see #getPersistentClassName()
	 * @generated
	 */
	void setPersistentClassName(PersistentClass value);

} // DomainTableName

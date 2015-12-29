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

} // DomainTableName

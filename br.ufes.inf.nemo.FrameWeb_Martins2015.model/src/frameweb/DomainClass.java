/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainClass#getDomainClassAttribute <em>Domain Class Attribute</em>}</li>
 *   <li>{@link frameweb.DomainClass#getDomainClassOperation <em>Domain Class Operation</em>}</li>
 *   <li>{@link frameweb.DomainClass#getTable <em>Table</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDomainClass()
 * @model
 * @generated
 */
public interface DomainClass extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Domain Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DomainAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Class Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDomainClass_DomainClassAttribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DomainAttribute> getDomainClassAttribute();

	/**
	 * Returns the value of the '<em><b>Domain Class Operation</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.DomainMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Class Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Class Operation</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getDomainClass_DomainClassOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainMethod> getDomainClassOperation();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' attribute.
	 * @see #setTable(String)
	 * @see frameweb.FramewebPackage#getDomainClass_Table()
	 * @model
	 * @generated
	 */
	String getTable();

	/**
	 * Sets the value of the '{@link frameweb.DomainClass#getTable <em>Table</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table</em>' attribute.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(String value);

} // DomainClass

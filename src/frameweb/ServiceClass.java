/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ServiceClass#getServiceClassAttribute <em>Service Class Attribute</em>}</li>
 *   <li>{@link frameweb.ServiceClass#getServiceClassOperation <em>Service Class Operation</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getServiceClass()
 * @model
 * @generated
 */
public interface ServiceClass extends uml2.Class {
	/**
	 * Returns the value of the '<em><b>Service Class Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Class Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Attribute</em>' containment reference.
	 * @see #setServiceClassAttribute(ServiceAttribute)
	 * @see frameweb.framewebPackage#getServiceClass_ServiceClassAttribute()
	 * @model containment="true"
	 * @generated
	 */
	ServiceAttribute getServiceClassAttribute();

	/**
	 * Sets the value of the '{@link frameweb.ServiceClass#getServiceClassAttribute <em>Service Class Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Class Attribute</em>' containment reference.
	 * @see #getServiceClassAttribute()
	 * @generated
	 */
	void setServiceClassAttribute(ServiceAttribute value);

	/**
	 * Returns the value of the '<em><b>Service Class Operation</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ServiceOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Class Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Class Operation</em>' containment reference list.
	 * @see frameweb.framewebPackage#getServiceClass_ServiceClassOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceOperation> getServiceClassOperation();

} // ServiceClass

/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

import uml2.Interface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ServiceInterface#getServiceInterfaceOperation <em>Service Interface Operation</em>}</li>
 *   <li>{@link frameweb.ServiceInterface#getServiceInterfaceAttribute <em>Service Interface Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getServiceInterface()
 * @model
 * @generated
 */
public interface ServiceInterface extends Interface {
	/**
	 * Returns the value of the '<em><b>Service Interface Operation</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ServiceOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Interface Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Interface Operation</em>' containment reference list.
	 * @see frameweb.FrameWebPackage#getServiceInterface_ServiceInterfaceOperation()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceOperation> getServiceInterfaceOperation();

	/**
	 * Returns the value of the '<em><b>Service Interface Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ServiceAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Interface Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Interface Attribute</em>' containment reference list.
	 * @see frameweb.FrameWebPackage#getServiceInterface_ServiceInterfaceAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<ServiceAttribute> getServiceInterfaceAttribute();

} // ServiceInterface

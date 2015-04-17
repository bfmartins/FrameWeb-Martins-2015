/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ApplicationModel#getServiceUMLAssociation <em>Service UML Association</em>}</li>
 *   <li>{@link frameweb.ApplicationModel#getApplicationUMLPackage <em>Application UML Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getApplicationModel()
 * @model
 * @generated
 */
public interface ApplicationModel extends FrameWebModel {
	/**
	 * Returns the value of the '<em><b>Service UML Association</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ServiceAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service UML Association</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service UML Association</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getApplicationModel_ServiceUMLAssociation()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceAssociation> getServiceUMLAssociation();

	/**
	 * Returns the value of the '<em><b>Application UML Package</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ApplicationPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application UML Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application UML Package</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getApplicationModel_ApplicationUMLPackage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ApplicationPackage> getApplicationUMLPackage();

} // ApplicationModel

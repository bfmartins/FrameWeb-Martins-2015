/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ApplicationPackage#getServicePackageClass <em>Service Package Class</em>}</li>
 *   <li>{@link frameweb.ApplicationPackage#getServicePackageInterface <em>Service Package Interface</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getApplicationPackage()
 * @model
 * @generated
 */
public interface ApplicationPackage extends uml2.Package {
	/**
	 * Returns the value of the '<em><b>Service Package Class</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ServiceClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Package Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Package Class</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getApplicationPackage_ServicePackageClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceClass> getServicePackageClass();

	/**
	 * Returns the value of the '<em><b>Service Package Interface</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ServiceInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Package Interface</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Package Interface</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getApplicationPackage_ServicePackageInterface()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ServiceInterface> getServicePackageInterface();

} // ApplicationPackage

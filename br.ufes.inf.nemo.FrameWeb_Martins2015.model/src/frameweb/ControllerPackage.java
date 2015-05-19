/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controller Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ControllerPackage#getControllerPackageClass <em>Controller Package Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getControllerPackage()
 * @model
 * @generated
 */
public interface ControllerPackage extends NavigationPackage {
	/**
	 * Returns the value of the '<em><b>Controller Package Class</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FrontControllerClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller Package Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller Package Class</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getControllerPackage_ControllerPackageClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FrontControllerClass> getControllerPackageClass();

} // ControllerPackage

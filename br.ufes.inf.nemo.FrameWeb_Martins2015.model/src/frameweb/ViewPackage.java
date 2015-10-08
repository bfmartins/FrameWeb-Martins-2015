/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ViewPackage#getViewPackageClass <em>View Package Class</em>}</li>
 *   <li>{@link frameweb.ViewPackage#getViewPackageResult <em>View Package Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getViewPackage()
 * @model
 * @generated
 */
public interface ViewPackage extends NavigationPackage {
	/**
	 * Returns the value of the '<em><b>View Package Class</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.NavigationClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Package Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Package Class</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getViewPackage_ViewPackageClass()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<NavigationClass> getViewPackageClass();

	/**
	 * Returns the value of the '<em><b>View Package Result</b></em>' containment reference list.
	 * The list contents are of type {@link ResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Package Result</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Package Result</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getViewPackage_ViewPackageResult()
	 * @model type="frameweb.Result" containment="true"
	 * @generated
	 */
	EList<ResultType> getViewPackageResult();

} // ViewPackage

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
 *   <li>{@link frameweb.ViewPackage#getViewPackagePage <em>View Package Page</em>}</li>
 *   <li>{@link frameweb.ViewPackage#getViewPakageTemplate <em>View Pakage Template</em>}</li>
 *   <li>{@link frameweb.ViewPackage#getViewPackageForm <em>View Package Form</em>}</li>
 *   <li>{@link frameweb.ViewPackage#getViewPackageBinaryData <em>View Package Binary Data</em>}</li>
 *   <li>{@link frameweb.ViewPackage#getViewPackageComponent <em>View Package Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getViewPackage()
 * @model
 * @generated
 */
public interface ViewPackage extends NavigationPackage {
	/**
	 * Returns the value of the '<em><b>View Package Page</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Package Page</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Package Page</em>' containment reference list.
	 * @see frameweb.framewebPackage#getViewPackage_ViewPackagePage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Page> getViewPackagePage();

	/**
	 * Returns the value of the '<em><b>View Pakage Template</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Template}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Pakage Template</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Pakage Template</em>' containment reference list.
	 * @see frameweb.framewebPackage#getViewPackage_ViewPakageTemplate()
	 * @model containment="true"
	 * @generated
	 */
	EList<Template> getViewPakageTemplate();

	/**
	 * Returns the value of the '<em><b>View Package Form</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Form}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Package Form</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Package Form</em>' containment reference list.
	 * @see frameweb.framewebPackage#getViewPackage_ViewPackageForm()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getViewPackageForm();

	/**
	 * Returns the value of the '<em><b>View Package Binary Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Package Binary Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Package Binary Data</em>' containment reference.
	 * @see #setViewPackageBinaryData(Binary)
	 * @see frameweb.framewebPackage#getViewPackage_ViewPackageBinaryData()
	 * @model containment="true"
	 * @generated
	 */
	Binary getViewPackageBinaryData();

	/**
	 * Sets the value of the '{@link frameweb.ViewPackage#getViewPackageBinaryData <em>View Package Binary Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>View Package Binary Data</em>' containment reference.
	 * @see #getViewPackageBinaryData()
	 * @generated
	 */
	void setViewPackageBinaryData(Binary value);

	/**
	 * Returns the value of the '<em><b>View Package Component</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View Package Component</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View Package Component</em>' containment reference list.
	 * @see frameweb.framewebPackage#getViewPackage_ViewPackageComponent()
	 * @model containment="true"
	 * @generated
	 */
	EList<Component> getViewPackageComponent();

} // ViewPackage

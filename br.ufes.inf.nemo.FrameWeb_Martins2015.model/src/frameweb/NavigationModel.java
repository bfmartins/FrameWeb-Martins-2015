/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.NavigationModel#getNavigationUMLDependency <em>Navigation UML Dependency</em>}</li>
 *   <li>{@link frameweb.NavigationModel#getViewUMLPackage <em>View UML Package</em>}</li>
 *   <li>{@link frameweb.NavigationModel#getControllerUMLPackage <em>Controller UML Package</em>}</li>
 *   <li>{@link frameweb.NavigationModel#getNavigationUMLComposition <em>Navigation UML Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getNavigationModel()
 * @model
 * @generated
 */
public interface NavigationModel extends FrameWebModel {
	/**
	 * Returns the value of the '<em><b>Navigation UML Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.NavigationDependency}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation UML Dependency</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation UML Dependency</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getNavigationModel_NavigationUMLDependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationDependency> getNavigationUMLDependency();

	/**
	 * Returns the value of the '<em><b>View UML Package</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ViewPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>View UML Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>View UML Package</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getNavigationModel_ViewUMLPackage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ViewPackage> getViewUMLPackage();

	/**
	 * Returns the value of the '<em><b>Controller UML Package</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.ControllerPackage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Controller UML Package</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Controller UML Package</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getNavigationModel_ControllerUMLPackage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ControllerPackage> getControllerUMLPackage();

	/**
	 * Returns the value of the '<em><b>Navigation UML Composition</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.NavigationAssociation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation UML Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation UML Composition</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getNavigationModel_NavigationUMLComposition()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationAssociation> getNavigationUMLComposition();

} // NavigationModel

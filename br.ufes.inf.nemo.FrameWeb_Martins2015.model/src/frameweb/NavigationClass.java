/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.NavigationClass#getNavigationClassComposition <em>Navigation Class Composition</em>}</li>
 *   <li>{@link frameweb.NavigationClass#getNavigationClassAttribute <em>Navigation Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getNavigationClass()
 * @model abstract="true"
 * @generated
 */
public interface NavigationClass extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Navigation Class Composition</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.NavigationCompositionWhole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Class Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Class Composition</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getNavigationClass_NavigationClassComposition()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<NavigationCompositionWhole> getNavigationClassComposition();

	/**
	 * Returns the value of the '<em><b>Navigation Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.UIComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Class Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getNavigationClass_NavigationClassAttribute()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<UIComponent> getNavigationClassAttribute();

} // NavigationClass

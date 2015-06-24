/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.Page#getPageClassAttribute <em>Page Class Attribute</em>}</li>
 *   <li>{@link frameweb.Page#getPageTagLib <em>Page Tag Lib</em>}</li>
 *   <li>{@link frameweb.Page#getPageComposition <em>Page Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NavigationClass {
	/**
	 * Returns the value of the '<em><b>Page Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Class Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getPage_PageClassAttribute()
	 * @model type="frameweb.UserViewAttribute" containment="true"
	 * @generated
	 */
	EList<Tag> getPageClassAttribute();

	/**
	 * Returns the value of the '<em><b>Page Tag Lib</b></em>' reference list.
	 * The list contents are of type {@link frameweb.TagLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Tag Lib</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Tag Lib</em>' reference list.
	 * @see frameweb.FramewebPackage#getPage_PageTagLib()
	 * @model required="true"
	 * @generated
	 */
	EList<TagLib> getPageTagLib();

	/**
	 * Returns the value of the '<em><b>Page Composition</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.NavigationComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Composition</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getPage_PageComposition()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationComposition> getPageComposition();

} // Page

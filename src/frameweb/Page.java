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
 *   <li>{@link frameweb.Page#getMention <em>Mention</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends NavigationClass {
	/**
	 * Returns the value of the '<em><b>Page Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.UserViewAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Class Attribute</em>' containment reference list.
	 * @see frameweb.FrameWebPackage#getPage_PageClassAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserViewAttribute> getPageClassAttribute();

	/**
	 * Returns the value of the '<em><b>Page Tag Lib</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Tag Lib</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Tag Lib</em>' containment reference list.
	 * @see frameweb.FrameWebPackage#getPage_PageTagLib()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Tag> getPageTagLib();

	/**
	 * Returns the value of the '<em><b>Mention</b></em>' reference list.
	 * The list contents are of type {@link frameweb.TagLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mention</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mention</em>' reference list.
	 * @see frameweb.FrameWebPackage#getPage_Mention()
	 * @model required="true"
	 * @generated
	 */
	EList<TagLib> getMention();

} // Page

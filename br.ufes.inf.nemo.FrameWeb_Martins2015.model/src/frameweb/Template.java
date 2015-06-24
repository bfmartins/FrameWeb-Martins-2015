/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.Template#getTemplateClassAttribute <em>Template Class Attribute</em>}</li>
 *   <li>{@link frameweb.Template#getTemplateTagLib <em>Template Tag Lib</em>}</li>
 *   <li>{@link frameweb.Template#getTemplateComposition <em>Template Composition</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends NavigationClass {
	/**
	 * Returns the value of the '<em><b>Template Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Class Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getTemplate_TemplateClassAttribute()
	 * @model type="frameweb.UserViewAttribute" containment="true"
	 * @generated
	 */
	EList<Tag> getTemplateClassAttribute();

	/**
	 * Returns the value of the '<em><b>Template Tag Lib</b></em>' reference list.
	 * The list contents are of type {@link frameweb.TagLib}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Tag Lib</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Tag Lib</em>' reference list.
	 * @see frameweb.FramewebPackage#getTemplate_TemplateTagLib()
	 * @model required="true"
	 * @generated
	 */
	EList<TagLib> getTemplateTagLib();

	/**
	 * Returns the value of the '<em><b>Template Composition</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.NavigationComposition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Composition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Composition</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getTemplate_TemplateComposition()
	 * @model containment="true"
	 * @generated
	 */
	EList<NavigationComposition> getTemplateComposition();

} // Template

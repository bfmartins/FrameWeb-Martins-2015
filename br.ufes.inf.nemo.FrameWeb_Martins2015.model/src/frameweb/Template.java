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
	 * The list contents are of type {@link frameweb.UserViewAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Class Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getTemplate_TemplateClassAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<UserViewAttribute> getTemplateClassAttribute();

} // Template

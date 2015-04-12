/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.Form#getFormClassAttribute <em>Form Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getForm()
 * @model
 * @generated
 */
public interface Form extends NavigationClass, Tag {
	/**
	 * Returns the value of the '<em><b>Form Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FormComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Form Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Form Class Attribute</em>' containment reference list.
	 * @see frameweb.framewebPackage#getForm_FormClassAttribute()
	 * @model containment="true"
	 * @generated
	 */
	EList<FormComponent> getFormClassAttribute();

} // Form

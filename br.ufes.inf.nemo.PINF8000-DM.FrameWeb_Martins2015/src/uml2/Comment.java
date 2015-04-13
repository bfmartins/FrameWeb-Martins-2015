/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A comment is a textual annotation that can be attached to a set of elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Comment#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link uml2.Comment#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getComment()
 * @model
 * @generated
 */
public interface Comment extends Element {
	/**
	 * Returns the value of the '<em><b>Annotated Element</b></em>' reference list.
	 * The list contents are of type {@link uml2.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Element(s) being commented.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annotated Element</em>' reference list.
	 * @see uml2.Uml2Package#getComment_AnnotatedElement()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Element> getAnnotatedElement();

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a string that is the comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute.
	 * @see #setBody(String)
	 * @see uml2.Uml2Package#getComment_Body()
	 * @model dataType="primitiveTypes.String" ordered="false"
	 * @generated
	 */
	String getBody();

	/**
	 * Sets the value of the '{@link uml2.Comment#getBody <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' attribute.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(String value);

} // Comment

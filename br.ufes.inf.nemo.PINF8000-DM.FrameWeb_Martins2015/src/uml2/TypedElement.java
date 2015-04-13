/**
 */
package uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A typed element has a type.
 * A typed element is a kind of named element that represents an element with a type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.TypedElement#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getTypedElement()
 * @model abstract="true"
 * @generated
 */
public interface TypedElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the TypedElement.
	 * This information is derived from the return result for this Operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(Type)
	 * @see uml2.Uml2Package#getTypedElement_Type()
	 * @model ordered="false"
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link uml2.TypedElement#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // TypedElement

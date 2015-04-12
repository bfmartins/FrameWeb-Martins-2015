/**
 */
package uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A literal real is a specification of a real value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.LiteralReal#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getLiteralReal()
 * @model
 * @generated
 */
public interface LiteralReal extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Float)
	 * @see uml2.Uml2Package#getLiteralReal_Value()
	 * @model dataType="primitiveTypes.Real" required="true" ordered="false"
	 * @generated
	 */
	Float getValue();

	/**
	 * Sets the value of the '{@link uml2.LiteralReal#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Float value);

} // LiteralReal

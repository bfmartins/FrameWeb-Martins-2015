/**
 */
package uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Boolean</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A literal Boolean is a specification of a Boolean value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.LiteralBoolean#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getLiteralBoolean()
 * @model
 * @generated
 */
public interface LiteralBoolean extends LiteralSpecification {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The specified Boolean value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Boolean)
	 * @see uml2.Uml2Package#getLiteralBoolean_Value()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getValue();

	/**
	 * Sets the value of the '{@link uml2.LiteralBoolean#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Boolean value);

} // LiteralBoolean

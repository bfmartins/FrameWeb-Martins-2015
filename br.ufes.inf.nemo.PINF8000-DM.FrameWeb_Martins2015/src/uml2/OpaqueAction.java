/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An action with implementation-specific semantics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.OpaqueAction#getBody <em>Body</em>}</li>
 *   <li>{@link uml2.OpaqueAction#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link uml2.OpaqueAction#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml2.OpaqueAction#getOutputValue <em>Output Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getOpaqueAction()
 * @model
 * @generated
 */
public interface OpaqueAction extends Action {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the action in one or more languages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see uml2.Uml2Package#getOpaqueAction_Body()
	 * @model unique="false" dataType="primitiveTypes.String"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Input Value</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.InputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides input to the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Input Value</em>' containment reference list.
	 * @see uml2.Uml2Package#getOpaqueAction_InputValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<InputPin> getInputValue();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Languages the body strings use, in the same order as the body strings
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see uml2.Uml2Package#getOpaqueAction_Language()
	 * @model dataType="primitiveTypes.String"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Returns the value of the '<em><b>Output Value</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.OutputPin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Takes output from the action.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Value</em>' containment reference list.
	 * @see uml2.Uml2Package#getOpaqueAction_OutputValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<OutputPin> getOutputValue();

} // OpaqueAction

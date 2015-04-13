/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Behavior</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An behavior with implementation-specific semantics.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.OpaqueBehavior#getBody <em>Body</em>}</li>
 *   <li>{@link uml2.OpaqueBehavior#getLanguage <em>Language</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getOpaqueBehavior()
 * @model
 * @generated
 */
public interface OpaqueBehavior extends Behavior {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the behavior in one or more languages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see uml2.Uml2Package#getOpaqueBehavior_Body()
	 * @model unique="false" dataType="primitiveTypes.String"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Languages the body strings use in the same order as the body strings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see uml2.Uml2Package#getOpaqueBehavior_Language()
	 * @model dataType="primitiveTypes.String"
	 * @generated
	 */
	EList<String> getLanguage();

} // OpaqueBehavior

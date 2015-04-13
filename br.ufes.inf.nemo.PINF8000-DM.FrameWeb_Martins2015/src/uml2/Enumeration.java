/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An enumeration is a data type whose values are enumerated in the model as enumeration literals.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Enumeration#getOwnedLiteral <em>Owned Literal</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends DataType {
	/**
	 * Returns the value of the '<em><b>Owned Literal</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.EnumerationLiteral}.
	 * It is bidirectional and its opposite is '{@link uml2.EnumerationLiteral#getEnumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ordered set of literals for this Enumeration.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Literal</em>' containment reference list.
	 * @see uml2.Uml2Package#getEnumeration_OwnedLiteral()
	 * @see uml2.EnumerationLiteral#getEnumeration
	 * @model opposite="enumeration" containment="true"
	 * @generated
	 */
	EList<EnumerationLiteral> getOwnedLiteral();

} // Enumeration

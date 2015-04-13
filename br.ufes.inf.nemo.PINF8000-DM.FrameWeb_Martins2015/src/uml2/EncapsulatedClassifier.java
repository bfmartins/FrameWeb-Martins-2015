/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encapsulated Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier has the ability to own ports as specific and type checked interaction points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.EncapsulatedClassifier#getOwnedPort <em>Owned Port</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getEncapsulatedClassifier()
 * @model abstract="true"
 * @generated
 */
public interface EncapsulatedClassifier extends StructuredClassifier {
	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' reference list.
	 * The list contents are of type {@link uml2.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References a set of ports that an encapsulated classifier owns.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' reference list.
	 * @see uml2.Uml2Package#getEncapsulatedClassifier_OwnedPort()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Port> getOwnedPort();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for EncapsulatedClassifier::/ownedPort : Port
	 * true
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	EList<Port> ownedPort();

} // EncapsulatedClassifier

/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Relationship is an abstract concept that specifies some kind of relationship between elements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Relationship#getRelatedElement <em>Related Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getRelationship()
 * @model abstract="true"
 * @generated
 */
public interface Relationship extends Element {
	/**
	 * Returns the value of the '<em><b>Related Element</b></em>' reference list.
	 * The list contents are of type {@link uml2.Element}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the elements related by the Relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Related Element</em>' reference list.
	 * @see uml2.Uml2Package#getRelationship_RelatedElement()
	 * @model required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<Element> getRelatedElement();

} // Relationship

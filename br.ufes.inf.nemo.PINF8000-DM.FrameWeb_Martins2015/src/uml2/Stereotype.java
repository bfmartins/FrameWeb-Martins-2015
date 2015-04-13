/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A stereotype defines how an existing metaclass may be extended, and enables the use of platform or domain specific terminology or notation in place of, or in addition to, the ones used for the extended metaclass.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Stereotype#getIcon <em>Icon</em>}</li>
 *   <li>{@link uml2.Stereotype#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getStereotype()
 * @model
 * @generated
 */
public interface Stereotype extends uml2.Class {
	/**
	 * Returns the value of the '<em><b>Icon</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Image}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype can change the graphical appearance of the extended model element by using attached icons. When this association is not null, it references the location of the icon content to be displayed within diagrams presenting the extended model elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Icon</em>' containment reference list.
	 * @see uml2.Uml2Package#getStereotype_Icon()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Image> getIcon();

	/**
	 * Returns the value of the '<em><b>Profile</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The profile that directly or indirectly contains this stereotype.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Profile</em>' reference.
	 * @see uml2.Uml2Package#getStereotype_Profile()
	 * @model required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Profile getProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A Stereotype may only generalize or specialize another Stereotype.
	 * generalization.general->forAll(e |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype)) 
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='generalization.general->forAll(e |e.oclIsKindOf(Stereotype)) and generalization.specific->forAll(e | e.oclIsKindOf(Stereotype)) '"
	 * @generated
	 */
	boolean generalize(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where a stereotype’s property is an association end for an association other than a kind of extension, and the other end is not a stereotype, the other end must be owned by the association itself.
	 * ownedAttribute
	 * ->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))
	 * ->forAll(opposite.owner = association)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='ownedAttribute\r\n->select(association->notEmpty() and not association.oclIsKindOf(Extension) and not type.oclIsKindOf(Stereotype))\r\n->forAll(opposite.owner = association)'"
	 * @generated
	 */
	boolean associationEndOwnership(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotypes may only participate in binary associations.
	 * ownedAttribute.association->forAll(memberEnd->size()=2)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='ownedAttribute.association->forAll(memberEnd->size()=2)'"
	 * @generated
	 */
	boolean binaryAssociationsOnly(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stereotype names should not clash with keyword names for the extended model element.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean nameNotClash(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query containingProfile returns the closest profile directly or indirectly containing this stereotype.
	 * result = self.namespace.oclAsType(Package).containingProfile()
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = self.namespace.oclAsType(Package).containingProfile()'"
	 * @generated
	 */
	Profile containingProfile();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A stereotype must be contained, directly or indirectly, in a profile.
	 * result = self.containingProfile()
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = self.containingProfile()'"
	 * @generated
	 */
	Profile profile();

} // Stereotype

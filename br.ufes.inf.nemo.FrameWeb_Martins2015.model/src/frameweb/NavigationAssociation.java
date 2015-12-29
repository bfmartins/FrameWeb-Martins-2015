/**
 */
package frameweb;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.NavigationAssociation#getNavigationAssociationProperty <em>Navigation Association Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getNavigationAssociation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NavigationAssociationConstraint\r\n'"
 *        annotation="Comments NavigationAssociationConstraint='The NavigationAssociation must have, as property ownedEnd, obligatorily a navigation composition (NavigationComposition) and only navigation classes (NavigationClass) are alowed as memberEnd.\r\n'"
 *        annotation="OCL NavigationAssociationConstraint='context NavigationAssociation\r\n  inv: \r\n    (self.oclAsType(Association).ownedEnd.oclIsTypeOf(NavigationComposition)) and \r\n    ((self.oclAsType(Association).memberEnd.oclIsTypeOf(NavigationComposition)) or \r\n    (self.oclAsType(Association).memberEnd.oclIsTypeOf(NavigationCompositionEnd)))'"
 * @generated
 */
public interface NavigationAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>Navigation Association Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Association Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Association Property</em>' containment reference.
	 * @see #setNavigationAssociationProperty(NavigationCompositionPart)
	 * @see frameweb.FramewebPackage#getNavigationAssociation_NavigationAssociationProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NavigationCompositionPart getNavigationAssociationProperty();

	/**
	 * Sets the value of the '{@link frameweb.NavigationAssociation#getNavigationAssociationProperty <em>Navigation Association Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Association Property</em>' containment reference.
	 * @see #getNavigationAssociationProperty()
	 * @generated
	 */
	void setNavigationAssociationProperty(NavigationCompositionPart value);

} // NavigationAssociation

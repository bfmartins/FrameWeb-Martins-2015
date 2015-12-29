/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Composition Part</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see frameweb.FramewebPackage#getNavigationCompositionPart()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NavigationCompositionPartConstraint\r\n'"
 *        annotation="Comments NavigationCompositionEndConstraint='A NavigationAssociation must have only a UIComponent as a part.'"
 *        annotation="OCL NavigationCompositionPartConstraint='context NavigationCompositionPart \r\n  inv:     \r\n    (self.oclAsType(Property).owningAssociation.oclIsTypeOf(NavigationAssociation)) and\r\n    (self.oclAsType(Property).type.oclIsTypeOf(NavigationClass))'"
 * @generated
 */
public interface NavigationCompositionPart extends NavigationProperty {
} // NavigationCompositionPart

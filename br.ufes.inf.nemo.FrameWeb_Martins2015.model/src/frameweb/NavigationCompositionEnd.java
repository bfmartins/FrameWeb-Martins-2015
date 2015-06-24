/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Composition End</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see frameweb.FramewebPackage#getNavigationCompositionEnd()
 * @model annotation="Ecore constraints='NavigationCompositionEndConstraint\r\n'"
 *        annotation="Comments NavigationCompositionEndConstraint='The NavigationCompositionEnd must have, as association owningAssociation, obligatorily a navigation association (Navigation Association) and only navigation classes (NavigationClass) are alowed as association, and type must be only pages (Page) or templates (Template).'"
 *        annotation="OCL NavigationCompositionEndConstraint='context NavigationCompositionEnd \r\n  inv:     \r\n    (self.oclAsType(Property).owningAssociation.oclIsTypeOf(NavigationAssociation)) and\r\n    ((self.oclAsType(Property).type.oclIsTypeOf(Page)) or \r\n    (self.oclAsType(Property).type.oclIsTypeOf(Template)))'"
 * @generated
 */
public interface NavigationCompositionEnd extends NavigationProperty {
} // NavigationCompositionEnd

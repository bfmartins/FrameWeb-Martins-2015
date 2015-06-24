/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see frameweb.FramewebPackage#getNavigationComposition()
 * @model annotation="Ecore constraints='NavigationCompositionConstraint\r\n'"
 *        annotation="Comments NavigationCompositionConstraint=''"
 *        annotation="OCL NavigationCompositionConstraint='context NavigationComposition \r\n  inv:\r\n    ((self.oclAsType(Property).owningAssociation.oclIsTypeOf(Page)) or\r\n    (self.oclAsType(Property).owningAssociation.oclIsTypeOf(Template))) and\r\n    (self.oclAsType(Property).association.oclIsTypeOf(NavigationAssociation)) and \r\n    (self.oclAsType(Property).aggregation = \'composite\')'"
 * @generated
 */
public interface NavigationComposition extends NavigationProperty {
} // NavigationComposition

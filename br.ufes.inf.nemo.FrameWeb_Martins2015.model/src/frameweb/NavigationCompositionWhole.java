/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Composition Whole</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see frameweb.FramewebPackage#getNavigationCompositionWhole()
 * @model annotation="Ecore constraints='NavigationCompositionWholeConstraint\r\n'"
 *        annotation="Comments NavigationCompositionConstraint='A NavigationAssociation must be a composition association and NavigationClass are alowed to be whole.'"
 *        annotation="OCL NavigationCompositionConstraint='context NavigationCompositionWhole \r\n  inv:\r\n    (self.oclAsType(Property).owningAssociation.oclIsTypeOf(NavigationClass)) and\r\n    (self.oclAsType(Property).association.oclIsTypeOf(NavigationAssociation)) and \r\n    (self.oclAsType(Property).aggregation = \'composite\')'"
 * @generated
 */
public interface NavigationCompositionWhole extends NavigationProperty {
} // NavigationCompositionWhole

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
 *   <li>{@link frameweb.NavigationAssociation#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link frameweb.NavigationAssociation#getTargetJQuery <em>Target JQuery</em>}</li>
 *   <li>{@link frameweb.NavigationAssociation#getNavigationProperty <em>Navigation Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getNavigationAssociation()
 * @model annotation="Ecore constraints='NavigationAssociationConstraint\r\n'"
 *        annotation="Comments NavigationAssociationConstraint='The NavigationAssociation must have, as property ownedEnd, obligatorily a navigation composition (NavigationComposition) and only navigation classes (NavigationClass) are alowed as memberEnd.\r\n'"
 *        annotation="OCL NavigationAssociationConstraint='context NavigationAssociation\r\n  inv: \r\n    (self.oclAsType(Association).ownedEnd.oclIsTypeOf(NavigationComposition)) and \r\n    ((self.oclAsType(Association).memberEnd.oclIsTypeOf(NavigationComposition)) or \r\n    (self.oclAsType(Association).memberEnd.oclIsTypeOf(NavigationCompositionEnd)))'"
 * @generated
 */
public interface NavigationAssociation extends Association {
	/**
	 * Returns the value of the '<em><b>Target Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Component</em>' reference.
	 * @see #setTargetComponent(Component)
	 * @see frameweb.FramewebPackage#getNavigationAssociation_TargetComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getTargetComponent();

	/**
	 * Sets the value of the '{@link frameweb.NavigationAssociation#getTargetComponent <em>Target Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Component</em>' reference.
	 * @see #getTargetComponent()
	 * @generated
	 */
	void setTargetComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Target JQuery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target JQuery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target JQuery</em>' reference.
	 * @see #setTargetJQuery(JQuery)
	 * @see frameweb.FramewebPackage#getNavigationAssociation_TargetJQuery()
	 * @model required="true"
	 * @generated
	 */
	JQuery getTargetJQuery();

	/**
	 * Sets the value of the '{@link frameweb.NavigationAssociation#getTargetJQuery <em>Target JQuery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target JQuery</em>' reference.
	 * @see #getTargetJQuery()
	 * @generated
	 */
	void setTargetJQuery(JQuery value);

	/**
	 * Returns the value of the '<em><b>Navigation Property</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Navigation Property</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Navigation Property</em>' containment reference.
	 * @see #setNavigationProperty(NavigationCompositionEnd)
	 * @see frameweb.FramewebPackage#getNavigationAssociation_NavigationProperty()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NavigationCompositionEnd getNavigationProperty();

	/**
	 * Sets the value of the '{@link frameweb.NavigationAssociation#getNavigationProperty <em>Navigation Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Navigation Property</em>' containment reference.
	 * @see #getNavigationProperty()
	 * @generated
	 */
	void setNavigationProperty(NavigationCompositionEnd value);

} // NavigationAssociation

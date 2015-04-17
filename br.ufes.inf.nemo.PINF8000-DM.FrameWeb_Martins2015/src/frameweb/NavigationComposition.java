/**
 */
package frameweb;

import uml2.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Navigation Composition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.NavigationComposition#getSourceTemplate <em>Source Template</em>}</li>
 *   <li>{@link frameweb.NavigationComposition#getSourcePage <em>Source Page</em>}</li>
 *   <li>{@link frameweb.NavigationComposition#getTargetForm <em>Target Form</em>}</li>
 *   <li>{@link frameweb.NavigationComposition#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link frameweb.NavigationComposition#getTargetJQuery <em>Target JQuery</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getNavigationComposition()
 * @model
 * @generated
 */
public interface NavigationComposition extends Association {
	/**
	 * Returns the value of the '<em><b>Source Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Template</em>' reference.
	 * @see #setSourceTemplate(Template)
	 * @see frameweb.FramewebPackage#getNavigationComposition_SourceTemplate()
	 * @model
	 * @generated
	 */
	Template getSourceTemplate();

	/**
	 * Sets the value of the '{@link frameweb.NavigationComposition#getSourceTemplate <em>Source Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Template</em>' reference.
	 * @see #getSourceTemplate()
	 * @generated
	 */
	void setSourceTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Source Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Page</em>' reference.
	 * @see #setSourcePage(Page)
	 * @see frameweb.FramewebPackage#getNavigationComposition_SourcePage()
	 * @model
	 * @generated
	 */
	Page getSourcePage();

	/**
	 * Sets the value of the '{@link frameweb.NavigationComposition#getSourcePage <em>Source Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Page</em>' reference.
	 * @see #getSourcePage()
	 * @generated
	 */
	void setSourcePage(Page value);

	/**
	 * Returns the value of the '<em><b>Target Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Form</em>' reference.
	 * @see #setTargetForm(Form)
	 * @see frameweb.FramewebPackage#getNavigationComposition_TargetForm()
	 * @model required="true"
	 * @generated
	 */
	Form getTargetForm();

	/**
	 * Sets the value of the '{@link frameweb.NavigationComposition#getTargetForm <em>Target Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Form</em>' reference.
	 * @see #getTargetForm()
	 * @generated
	 */
	void setTargetForm(Form value);

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
	 * @see frameweb.FramewebPackage#getNavigationComposition_TargetComponent()
	 * @model required="true"
	 * @generated
	 */
	Component getTargetComponent();

	/**
	 * Sets the value of the '{@link frameweb.NavigationComposition#getTargetComponent <em>Target Component</em>}' reference.
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
	 * @see frameweb.FramewebPackage#getNavigationComposition_TargetJQuery()
	 * @model required="true"
	 * @generated
	 */
	JQuery getTargetJQuery();

	/**
	 * Sets the value of the '{@link frameweb.NavigationComposition#getTargetJQuery <em>Target JQuery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target JQuery</em>' reference.
	 * @see #getTargetJQuery()
	 * @generated
	 */
	void setTargetJQuery(JQuery value);

} // NavigationComposition

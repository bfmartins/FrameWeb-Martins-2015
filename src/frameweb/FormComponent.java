/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.FormComponent#getInject <em>Inject</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getFormComponent()
 * @model
 * @generated
 */
public interface FormComponent extends NavigationAttribute, FrameworkTag {
	/**
	 * Returns the value of the '<em><b>Inject</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link frameweb.IOParameter#getDisplay <em>Display</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inject</em>' reference.
	 * @see #setInject(IOParameter)
	 * @see frameweb.framewebPackage#getFormComponent_Inject()
	 * @see frameweb.IOParameter#getDisplay
	 * @model opposite="display"
	 * @generated
	 */
	IOParameter getInject();

	/**
	 * Sets the value of the '{@link frameweb.FormComponent#getInject <em>Inject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inject</em>' reference.
	 * @see #getInject()
	 * @generated
	 */
	void setInject(IOParameter value);

} // FormComponent

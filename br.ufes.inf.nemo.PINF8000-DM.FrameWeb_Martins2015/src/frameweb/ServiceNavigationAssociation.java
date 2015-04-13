/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Navigation Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ServiceNavigationAssociation#getSourceServiceClass <em>Source Service Class</em>}</li>
 *   <li>{@link frameweb.ServiceNavigationAssociation#getTargetFrontController <em>Target Front Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getServiceNavigationAssociation()
 * @model
 * @generated
 */
public interface ServiceNavigationAssociation extends ServiceAssociation {
	/**
	 * Returns the value of the '<em><b>Source Service Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Service Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Service Class</em>' reference.
	 * @see #setSourceServiceClass(ServiceInterface)
	 * @see frameweb.FrameWebPackage#getServiceNavigationAssociation_SourceServiceClass()
	 * @model required="true"
	 * @generated
	 */
	ServiceInterface getSourceServiceClass();

	/**
	 * Sets the value of the '{@link frameweb.ServiceNavigationAssociation#getSourceServiceClass <em>Source Service Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Service Class</em>' reference.
	 * @see #getSourceServiceClass()
	 * @generated
	 */
	void setSourceServiceClass(ServiceInterface value);

	/**
	 * Returns the value of the '<em><b>Target Front Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Front Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Front Controller</em>' reference.
	 * @see #setTargetFrontController(FrontControllerClass)
	 * @see frameweb.FrameWebPackage#getServiceNavigationAssociation_TargetFrontController()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerClass getTargetFrontController();

	/**
	 * Sets the value of the '{@link frameweb.ServiceNavigationAssociation#getTargetFrontController <em>Target Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Front Controller</em>' reference.
	 * @see #getTargetFrontController()
	 * @generated
	 */
	void setTargetFrontController(FrontControllerClass value);

} // ServiceNavigationAssociation

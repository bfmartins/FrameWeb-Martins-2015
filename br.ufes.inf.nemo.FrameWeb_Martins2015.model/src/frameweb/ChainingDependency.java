/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chaining Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ChainingDependency#getOutMethod <em>Out Method</em>}</li>
 *   <li>{@link frameweb.ChainingDependency#getInMethod <em>In Method</em>}</li>
 *   <li>{@link frameweb.ChainingDependency#getSupplierFrontController <em>Supplier Front Controller</em>}</li>
 *   <li>{@link frameweb.ChainingDependency#getClientFrontController <em>Client Front Controller</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getChainingDependency()
 * @model
 * @generated
 */
public interface ChainingDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Out Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Out Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Out Method</em>' reference.
	 * @see #setOutMethod(FrontControllerMethod)
	 * @see frameweb.FramewebPackage#getChainingDependency_OutMethod()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerMethod getOutMethod();

	/**
	 * Sets the value of the '{@link frameweb.ChainingDependency#getOutMethod <em>Out Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Out Method</em>' reference.
	 * @see #getOutMethod()
	 * @generated
	 */
	void setOutMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>In Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>In Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Method</em>' reference.
	 * @see #setInMethod(FrontControllerMethod)
	 * @see frameweb.FramewebPackage#getChainingDependency_InMethod()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerMethod getInMethod();

	/**
	 * Sets the value of the '{@link frameweb.ChainingDependency#getInMethod <em>In Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Method</em>' reference.
	 * @see #getInMethod()
	 * @generated
	 */
	void setInMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>Supplier Front Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Front Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Front Controller</em>' reference.
	 * @see #setSupplierFrontController(FrontControllerClass)
	 * @see frameweb.FramewebPackage#getChainingDependency_SupplierFrontController()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerClass getSupplierFrontController();

	/**
	 * Sets the value of the '{@link frameweb.ChainingDependency#getSupplierFrontController <em>Supplier Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Front Controller</em>' reference.
	 * @see #getSupplierFrontController()
	 * @generated
	 */
	void setSupplierFrontController(FrontControllerClass value);

	/**
	 * Returns the value of the '<em><b>Client Front Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Front Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Front Controller</em>' reference.
	 * @see #setClientFrontController(FrontControllerClass)
	 * @see frameweb.FramewebPackage#getChainingDependency_ClientFrontController()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerClass getClientFrontController();

	/**
	 * Sets the value of the '{@link frameweb.ChainingDependency#getClientFrontController <em>Client Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Front Controller</em>' reference.
	 * @see #getClientFrontController()
	 * @generated
	 */
	void setClientFrontController(FrontControllerClass value);

} // ChainingDependency

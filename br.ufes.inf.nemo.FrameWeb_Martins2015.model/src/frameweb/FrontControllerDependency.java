/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Front Controller Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.FrontControllerDependency#getMethod <em>Method</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getClientForm <em>Client Form</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getSupplierFrontController <em>Supplier Front Controller</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getClientPage <em>Client Page</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getClientTemplate <em>Client Template</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getClientComponent <em>Client Component</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getClientJQuery <em>Client JQuery</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFrontControllerDependency()
 * @model
 * @generated
 */
public interface FrontControllerDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' reference.
	 * @see #setMethod(FrontControllerMethod)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_Method()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerMethod getMethod();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getMethod <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>Client Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Form</em>' reference.
	 * @see #setClientForm(Tag)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_ClientForm()
	 * @model type="frameweb.Form"
	 * @generated
	 */
	Tag getClientForm();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getClientForm <em>Client Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Form</em>' reference.
	 * @see #getClientForm()
	 * @generated
	 */
	void setClientForm(Tag value);

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
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_SupplierFrontController()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerClass getSupplierFrontController();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getSupplierFrontController <em>Supplier Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Front Controller</em>' reference.
	 * @see #getSupplierFrontController()
	 * @generated
	 */
	void setSupplierFrontController(FrontControllerClass value);

	/**
	 * Returns the value of the '<em><b>Client Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Page</em>' reference.
	 * @see #setClientPage(Page)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_ClientPage()
	 * @model
	 * @generated
	 */
	Page getClientPage();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getClientPage <em>Client Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Page</em>' reference.
	 * @see #getClientPage()
	 * @generated
	 */
	void setClientPage(Page value);

	/**
	 * Returns the value of the '<em><b>Client Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Template</em>' reference.
	 * @see #setClientTemplate(Template)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_ClientTemplate()
	 * @model
	 * @generated
	 */
	Template getClientTemplate();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getClientTemplate <em>Client Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Template</em>' reference.
	 * @see #getClientTemplate()
	 * @generated
	 */
	void setClientTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Client Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client Component</em>' reference.
	 * @see #setClientComponent(Component)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_ClientComponent()
	 * @model
	 * @generated
	 */
	Component getClientComponent();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getClientComponent <em>Client Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Component</em>' reference.
	 * @see #getClientComponent()
	 * @generated
	 */
	void setClientComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Client JQuery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client JQuery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client JQuery</em>' reference.
	 * @see #setClientJQuery(JQuery)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_ClientJQuery()
	 * @model
	 * @generated
	 */
	JQuery getClientJQuery();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getClientJQuery <em>Client JQuery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client JQuery</em>' reference.
	 * @see #getClientJQuery()
	 * @generated
	 */
	void setClientJQuery(JQuery value);

} // FrontControllerDependency

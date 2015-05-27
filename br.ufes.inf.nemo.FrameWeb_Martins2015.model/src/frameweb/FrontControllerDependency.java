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
 *   <li>{@link frameweb.FrontControllerDependency#getSourceForm <em>Source Form</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getTargetFrontController <em>Target Front Controller</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getSourcePage <em>Source Page</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getSourceTemplate <em>Source Template</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getSourceComponent <em>Source Component</em>}</li>
 *   <li>{@link frameweb.FrontControllerDependency#getSourceJQuery <em>Source JQuery</em>}</li>
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
	 * Returns the value of the '<em><b>Source Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Form</em>' reference.
	 * @see #setSourceForm(Tag)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_SourceForm()
	 * @model type="frameweb.Form"
	 * @generated
	 */
	Tag getSourceForm();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getSourceForm <em>Source Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Form</em>' reference.
	 * @see #getSourceForm()
	 * @generated
	 */
	void setSourceForm(Tag value);

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
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_TargetFrontController()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerClass getTargetFrontController();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getTargetFrontController <em>Target Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Front Controller</em>' reference.
	 * @see #getTargetFrontController()
	 * @generated
	 */
	void setTargetFrontController(FrontControllerClass value);

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
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_SourcePage()
	 * @model
	 * @generated
	 */
	Page getSourcePage();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getSourcePage <em>Source Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Page</em>' reference.
	 * @see #getSourcePage()
	 * @generated
	 */
	void setSourcePage(Page value);

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
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_SourceTemplate()
	 * @model
	 * @generated
	 */
	Template getSourceTemplate();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getSourceTemplate <em>Source Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Template</em>' reference.
	 * @see #getSourceTemplate()
	 * @generated
	 */
	void setSourceTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Source Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Component</em>' reference.
	 * @see #setSourceComponent(Component)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_SourceComponent()
	 * @model
	 * @generated
	 */
	Component getSourceComponent();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getSourceComponent <em>Source Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Component</em>' reference.
	 * @see #getSourceComponent()
	 * @generated
	 */
	void setSourceComponent(Component value);

	/**
	 * Returns the value of the '<em><b>Source JQuery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source JQuery</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source JQuery</em>' reference.
	 * @see #setSourceJQuery(JQuery)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_SourceJQuery()
	 * @model
	 * @generated
	 */
	JQuery getSourceJQuery();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getSourceJQuery <em>Source JQuery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source JQuery</em>' reference.
	 * @see #getSourceJQuery()
	 * @generated
	 */
	void setSourceJQuery(JQuery value);

} // FrontControllerDependency

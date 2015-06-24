/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.PageDependency#getSupplierPage <em>Supplier Page</em>}</li>
 *   <li>{@link frameweb.PageDependency#getClientTemplate <em>Client Template</em>}</li>
 *   <li>{@link frameweb.PageDependency#getLinkHTML <em>Link HTML</em>}</li>
 *   <li>{@link frameweb.PageDependency#getClientPage <em>Client Page</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getPageDependency()
 * @model
 * @generated
 */
public interface PageDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Supplier Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supplier Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplier Page</em>' reference.
	 * @see #setSupplierPage(Page)
	 * @see frameweb.FramewebPackage#getPageDependency_SupplierPage()
	 * @model required="true"
	 * @generated
	 */
	Page getSupplierPage();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getSupplierPage <em>Supplier Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supplier Page</em>' reference.
	 * @see #getSupplierPage()
	 * @generated
	 */
	void setSupplierPage(Page value);

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
	 * @see frameweb.FramewebPackage#getPageDependency_ClientTemplate()
	 * @model
	 * @generated
	 */
	Template getClientTemplate();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getClientTemplate <em>Client Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Template</em>' reference.
	 * @see #getClientTemplate()
	 * @generated
	 */
	void setClientTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Link HTML</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link HTML</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link HTML</em>' attribute.
	 * @see #setLinkHTML(String)
	 * @see frameweb.FramewebPackage#getPageDependency_LinkHTML()
	 * @model
	 * @generated
	 */
	String getLinkHTML();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getLinkHTML <em>Link HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link HTML</em>' attribute.
	 * @see #getLinkHTML()
	 * @generated
	 */
	void setLinkHTML(String value);

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
	 * @see frameweb.FramewebPackage#getPageDependency_ClientPage()
	 * @model
	 * @generated
	 */
	Page getClientPage();

	/**
	 * Sets the value of the '{@link frameweb.PageDependency#getClientPage <em>Client Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Page</em>' reference.
	 * @see #getClientPage()
	 * @generated
	 */
	void setClientPage(Page value);

} // PageDependency

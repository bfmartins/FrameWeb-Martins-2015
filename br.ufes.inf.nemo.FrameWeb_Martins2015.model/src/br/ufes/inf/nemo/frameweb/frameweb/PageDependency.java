/**
 */
package br.ufes.inf.nemo.frameweb.frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.PageDependency#getPageDependencyCosntraint <em>Page Dependency Cosntraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getPageDependency()
 * @model annotation="Ecore constraints='PageDepencencyConstraint'"
 *        annotation="Comments PageDepencencyConstraint='A PageDependencyConstraint must have a Page as client and a Page or a Template as supplier.'"
 *        annotation="OCL PageDepencencyConstraint='context PageDependency \r\n inv: \r\n  (self.oclAsType(Dependency).client.oclIsTypeOf(Page)) and\r\n  ((self.oclAsType(Dependency).supplier.oclIsTypeOf(Page)) or\r\n  (self.oclAsType(Dependency).supplier.oclIsTypeOf(Template)))'"
 * @generated
 */
public interface PageDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Page Dependency Cosntraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Dependency Cosntraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Dependency Cosntraint</em>' containment reference.
	 * @see #setPageDependencyCosntraint(PageConstraint)
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getPageDependency_PageDependencyCosntraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PageConstraint getPageDependencyCosntraint();

	/**
	 * Sets the value of the '{@link br.ufes.inf.nemo.frameweb.frameweb.PageDependency#getPageDependencyCosntraint <em>Page Dependency Cosntraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Dependency Cosntraint</em>' containment reference.
	 * @see #getPageDependencyCosntraint()
	 * @generated
	 */
	void setPageDependencyCosntraint(PageConstraint value);

} // PageDependency

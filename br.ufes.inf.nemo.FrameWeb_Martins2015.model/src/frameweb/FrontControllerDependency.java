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
 *   <li>{@link frameweb.FrontControllerDependency#getMethodDependendencyConstraint <em>Method Dependendency Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFrontControllerDependency()
 * @model annotation="Ecore constraints='FrontControllerDependencyConstraint'"
 *        annotation="Comments FrontControllerDependencyConstraint='A FrontControllerDependencyConstraint must have a NavigationClass as client and a FrontControllerClass as supplier.'"
 *        annotation="OCL FrontControllerDependencyConstraint='context FrontControllerDependency \r\n inv: \r\n  (self.oclAsType(Dependency).supplier.oclIsTypeOf(FrontControllerClass)) and\r\n  (self.oclAsType(Dependency).client.oclIsTypeOf(NavigationClass)) '"
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
	 * Returns the value of the '<em><b>Method Dependendency Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Dependendency Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Dependendency Constraint</em>' containment reference.
	 * @see #setMethodDependendencyConstraint(MethodCosntraint)
	 * @see frameweb.FramewebPackage#getFrontControllerDependency_MethodDependendencyConstraint()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	MethodCosntraint getMethodDependendencyConstraint();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerDependency#getMethodDependendencyConstraint <em>Method Dependendency Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Dependendency Constraint</em>' containment reference.
	 * @see #getMethodDependendencyConstraint()
	 * @generated
	 */
	void setMethodDependendencyConstraint(MethodCosntraint value);

} // FrontControllerDependency

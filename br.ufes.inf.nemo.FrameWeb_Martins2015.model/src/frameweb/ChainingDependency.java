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
 *   <li>{@link frameweb.ChainingDependency#getTargetFrontController <em>Target Front Controller</em>}</li>
 *   <li>{@link frameweb.ChainingDependency#getSourceFrontController <em>Source Front Controller</em>}</li>
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
	 * Returns the value of the '<em><b>Target Front Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Front Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Front Controller</em>' reference.
	 * @see #setTargetFrontController(FrontControllerClass)
	 * @see frameweb.FramewebPackage#getChainingDependency_TargetFrontController()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerClass getTargetFrontController();

	/**
	 * Sets the value of the '{@link frameweb.ChainingDependency#getTargetFrontController <em>Target Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Front Controller</em>' reference.
	 * @see #getTargetFrontController()
	 * @generated
	 */
	void setTargetFrontController(FrontControllerClass value);

	/**
	 * Returns the value of the '<em><b>Source Front Controller</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Front Controller</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Front Controller</em>' reference.
	 * @see #setSourceFrontController(FrontControllerClass)
	 * @see frameweb.FramewebPackage#getChainingDependency_SourceFrontController()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerClass getSourceFrontController();

	/**
	 * Sets the value of the '{@link frameweb.ChainingDependency#getSourceFrontController <em>Source Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Front Controller</em>' reference.
	 * @see #getSourceFrontController()
	 * @generated
	 */
	void setSourceFrontController(FrontControllerClass value);

} // ChainingDependency

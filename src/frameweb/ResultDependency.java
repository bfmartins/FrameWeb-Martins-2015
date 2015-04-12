/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Dependency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.ResultDependency#getReturnResult <em>Return Result</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getReturnMethod <em>Return Method</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getSourceFrontController <em>Source Front Controller</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getTargetTemplate <em>Target Template</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getTargetBinary <em>Target Binary</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getReturnResultType <em>Return Result Type</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getTargetForm <em>Target Form</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getTargetComponent <em>Target Component</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getTargetJQuery <em>Target JQuery</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getTargetFormComponent <em>Target Form Component</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getResultDependency()
 * @model
 * @generated
 */
public interface ResultDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Return Result</b></em>' reference list.
	 * The list contents are of type {@link frameweb.Result}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Result</em>' reference list.
	 * @see frameweb.framewebPackage#getResultDependency_ReturnResult()
	 * @model
	 * @generated
	 */
	EList<Result> getReturnResult();

	/**
	 * Returns the value of the '<em><b>Return Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Method</em>' reference.
	 * @see #setReturnMethod(FrontControllerMethod)
	 * @see frameweb.framewebPackage#getResultDependency_ReturnMethod()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerMethod getReturnMethod();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getReturnMethod <em>Return Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Method</em>' reference.
	 * @see #getReturnMethod()
	 * @generated
	 */
	void setReturnMethod(FrontControllerMethod value);

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
	 * @see frameweb.framewebPackage#getResultDependency_SourceFrontController()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerClass getSourceFrontController();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getSourceFrontController <em>Source Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Front Controller</em>' reference.
	 * @see #getSourceFrontController()
	 * @generated
	 */
	void setSourceFrontController(FrontControllerClass value);

	/**
	 * Returns the value of the '<em><b>Target Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Template</em>' reference.
	 * @see #setTargetTemplate(Template)
	 * @see frameweb.framewebPackage#getResultDependency_TargetTemplate()
	 * @model
	 * @generated
	 */
	Template getTargetTemplate();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getTargetTemplate <em>Target Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Template</em>' reference.
	 * @see #getTargetTemplate()
	 * @generated
	 */
	void setTargetTemplate(Template value);

	/**
	 * Returns the value of the '<em><b>Target Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Page</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Page</em>' reference.
	 * @see #setTargetPage(Page)
	 * @see frameweb.framewebPackage#getResultDependency_TargetPage()
	 * @model
	 * @generated
	 */
	Page getTargetPage();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getTargetPage <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Page</em>' reference.
	 * @see #getTargetPage()
	 * @generated
	 */
	void setTargetPage(Page value);

	/**
	 * Returns the value of the '<em><b>Target Binary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Binary</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Binary</em>' reference.
	 * @see #setTargetBinary(Binary)
	 * @see frameweb.framewebPackage#getResultDependency_TargetBinary()
	 * @model
	 * @generated
	 */
	Binary getTargetBinary();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getTargetBinary <em>Target Binary</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Binary</em>' reference.
	 * @see #getTargetBinary()
	 * @generated
	 */
	void setTargetBinary(Binary value);

	/**
	 * Returns the value of the '<em><b>Return Result Type</b></em>' reference list.
	 * The list contents are of type {@link frameweb.ResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Result Type</em>' reference list.
	 * @see frameweb.framewebPackage#getResultDependency_ReturnResultType()
	 * @model
	 * @generated
	 */
	EList<ResultType> getReturnResultType();

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
	 * @see frameweb.framewebPackage#getResultDependency_TargetForm()
	 * @model
	 * @generated
	 */
	Form getTargetForm();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getTargetForm <em>Target Form</em>}' reference.
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
	 * @see frameweb.framewebPackage#getResultDependency_TargetComponent()
	 * @model
	 * @generated
	 */
	Component getTargetComponent();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getTargetComponent <em>Target Component</em>}' reference.
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
	 * @see frameweb.framewebPackage#getResultDependency_TargetJQuery()
	 * @model
	 * @generated
	 */
	JQuery getTargetJQuery();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getTargetJQuery <em>Target JQuery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target JQuery</em>' reference.
	 * @see #getTargetJQuery()
	 * @generated
	 */
	void setTargetJQuery(JQuery value);

	/**
	 * Returns the value of the '<em><b>Target Form Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Form Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Form Component</em>' reference.
	 * @see #setTargetFormComponent(FormComponent)
	 * @see frameweb.framewebPackage#getResultDependency_TargetFormComponent()
	 * @model
	 * @generated
	 */
	FormComponent getTargetFormComponent();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getTargetFormComponent <em>Target Form Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Form Component</em>' reference.
	 * @see #getTargetFormComponent()
	 * @generated
	 */
	void setTargetFormComponent(FormComponent value);

} // ResultDependency

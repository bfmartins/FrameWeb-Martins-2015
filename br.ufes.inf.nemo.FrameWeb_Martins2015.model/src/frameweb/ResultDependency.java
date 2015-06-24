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
 *   <li>{@link frameweb.ResultDependency#getReturnResultType <em>Return Result Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getResultDependency()
 * @model annotation="Ecore constraints='ResultDependencyConstraint\r\n'"
 *        annotation="Comments ResultDependencyConstraint='The supplier of a ResultDependency must be only navigation classes (NavigationClass) and the client has to be always and obligatorily a FrontControllerClass.'"
 *        annotation="OCL ResultDependencyConstraint='context ResultDependency \r\n inv: \r\n  (self.oclAsType(Dependency).client.oclIsTypeOf(FrontControllerClass)) and\r\n  ((self.oclAsType(Dependency).supplier.oclIsTypeOf(NavigationClass)) or \r\n  (self.oclAsType(Dependency).supplier.oclIsTypeOf(FormComponent)))'"
 * @generated
 */
public interface ResultDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Return Result</b></em>' reference list.
	 * The list contents are of type {@link ResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Result</em>' reference list.
	 * @see frameweb.FramewebPackage#getResultDependency_ReturnResult()
	 * @model type="frameweb.Result"
	 * @generated
	 */
	EList<ResultType> getReturnResult();

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
	 * @see frameweb.FramewebPackage#getResultDependency_ReturnMethod()
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
	 * Returns the value of the '<em><b>Return Result Type</b></em>' reference list.
	 * The list contents are of type {@link frameweb.ResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Result Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Result Type</em>' reference list.
	 * @see frameweb.FramewebPackage#getResultDependency_ReturnResultType()
	 * @model
	 * @generated
	 */
	EList<ResultType> getReturnResultType();

} // ResultDependency

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
 *   <li>{@link frameweb.ResultDependency#getResultResult <em>Result Result</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getResultMethod <em>Result Method</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getResultDependendencyCosntraint <em>Result Dependendency Cosntraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getResultDependency()
 * @model annotation="Ecore constraints='ResultDependencyConstraint\r\n'"
 *        annotation="Comments ResultDependencyConstraint='A ResultDependency must have a FrontControllerClass as client and a NavigationClass as supplier.'"
 *        annotation="OCL ResultDependencyConstraint='context ResultDependency \r\n inv: \r\n  (self.oclAsType(Dependency).client.oclIsTypeOf(FrontControllerClass)) and\r\n  (self.oclAsType(Dependency).supplier.oclIsTypeOf(NavigationClass))'"
 * @generated
 */
public interface ResultDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Result Result</b></em>' reference list.
	 * The list contents are of type {@link ResultType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Result</em>' reference list.
	 * @see frameweb.FramewebPackage#getResultDependency_ResultResult()
	 * @model type="frameweb.Result"
	 * @generated
	 */
	EList<ResultType> getResultResult();

	/**
	 * Returns the value of the '<em><b>Result Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Method</em>' reference.
	 * @see #setResultMethod(FrontControllerMethod)
	 * @see frameweb.FramewebPackage#getResultDependency_ResultMethod()
	 * @model required="true"
	 * @generated
	 */
	FrontControllerMethod getResultMethod();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getResultMethod <em>Result Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Method</em>' reference.
	 * @see #getResultMethod()
	 * @generated
	 */
	void setResultMethod(FrontControllerMethod value);

	/**
	 * Returns the value of the '<em><b>Result Dependendency Cosntraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Dependendency Cosntraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Dependendency Cosntraint</em>' containment reference.
	 * @see #setResultDependendencyCosntraint(ResultConstraint)
	 * @see frameweb.FramewebPackage#getResultDependency_ResultDependendencyCosntraint()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ResultConstraint getResultDependendencyCosntraint();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getResultDependendencyCosntraint <em>Result Dependendency Cosntraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Dependendency Cosntraint</em>' containment reference.
	 * @see #getResultDependendencyCosntraint()
	 * @generated
	 */
	void setResultDependendencyCosntraint(ResultConstraint value);

} // ResultDependency

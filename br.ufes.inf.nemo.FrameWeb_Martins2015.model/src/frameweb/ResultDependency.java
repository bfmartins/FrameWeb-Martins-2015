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
 *   <li>{@link frameweb.ResultDependency#getRender <em>Render</em>}</li>
 *   <li>{@link frameweb.ResultDependency#getExecute <em>Execute</em>}</li>
 *   <li>{@link frameweb.ResultDependency#isAjax <em>Ajax</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getResultDependency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ResultDependencyConstraint\r\n'"
 *        annotation="Comments ResultDependencyConstraint='A ResultDependency must have a FrontControllerClass as client and a NavigationClass as supplier.'"
 *        annotation="OCL ResultDependencyConstraint='(self.oclAsType(Dependency).client.oclIsTypeOf(FrontControllerClass)) and\r\n(self.oclAsType(Dependency).supplier.oclIsTypeOf(NavigationClass))'"
 * @generated
 */
public interface ResultDependency extends NavigationDependency {
	/**
	 * Returns the value of the '<em><b>Result Result</b></em>' reference list.
	 * The list contents are of type {@link frameweb.Result}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Result</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Result</em>' reference list.
	 * @see frameweb.FramewebPackage#getResultDependency_ResultResult()
	 * @model
	 * @generated
	 */
	EList<Result> getResultResult();

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
	 * @model containment="true" required="true" ordered="false"
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

	/**
	 * Returns the value of the '<em><b>Render</b></em>' attribute.
	 * The default value is <code>"@none"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Render</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Render</em>' attribute.
	 * @see #setRender(String)
	 * @see frameweb.FramewebPackage#getResultDependency_Render()
	 * @model default="@none"
	 * @generated
	 */
	String getRender();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getRender <em>Render</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Render</em>' attribute.
	 * @see #getRender()
	 * @generated
	 */
	void setRender(String value);

	/**
	 * Returns the value of the '<em><b>Execute</b></em>' attribute.
	 * The default value is <code>"@this"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' attribute.
	 * @see #setExecute(String)
	 * @see frameweb.FramewebPackage#getResultDependency_Execute()
	 * @model default="@this"
	 * @generated
	 */
	String getExecute();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#getExecute <em>Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute</em>' attribute.
	 * @see #getExecute()
	 * @generated
	 */
	void setExecute(String value);

	/**
	 * Returns the value of the '<em><b>Ajax</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ajax</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ajax</em>' attribute.
	 * @see #setAjax(boolean)
	 * @see frameweb.FramewebPackage#getResultDependency_Ajax()
	 * @model default="False"
	 * @generated
	 */
	boolean isAjax();

	/**
	 * Sets the value of the '{@link frameweb.ResultDependency#isAjax <em>Ajax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ajax</em>' attribute.
	 * @see #isAjax()
	 * @generated
	 */
	void setAjax(boolean value);

} // ResultDependency

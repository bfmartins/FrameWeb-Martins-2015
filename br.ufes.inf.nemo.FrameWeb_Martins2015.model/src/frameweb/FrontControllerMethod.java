/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Front Controller Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.FrontControllerMethod#isIsDefault <em>Is Default</em>}</li>
 *   <li>{@link frameweb.FrontControllerMethod#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFrontControllerMethod()
 * @model
 * @generated
 */
public interface FrontControllerMethod extends Constraint {
	/**
	 * Returns the value of the '<em><b>Is Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default</em>' attribute.
	 * @see #setIsDefault(boolean)
	 * @see frameweb.FramewebPackage#getFrontControllerMethod_IsDefault()
	 * @model
	 * @generated
	 */
	boolean isIsDefault();

	/**
	 * Sets the value of the '{@link frameweb.FrontControllerMethod#isIsDefault <em>Is Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default</em>' attribute.
	 * @see #isIsDefault()
	 * @generated
	 */
	void setIsDefault(boolean value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Object}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' attribute list.
	 * @see frameweb.FramewebPackage#getFrontControllerMethod_Result()
	 * @model dataType="frameweb.ResultDataType"
	 * @generated
	 */
	EList<Object> getResult();

} // FrontControllerMethod

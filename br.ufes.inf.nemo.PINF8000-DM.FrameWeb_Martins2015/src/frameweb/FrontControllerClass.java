/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;
import uml2.Stereotype;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Front Controller Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.FrontControllerClass#getFrontControllerAttribute <em>Front Controller Attribute</em>}</li>
 *   <li>{@link frameweb.FrontControllerClass#getFrontControllerClassMethod <em>Front Controller Class Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFrontControllerClass()
 * @model
 * @generated
 */
public interface FrontControllerClass extends Stereotype {
	/**
	 * Returns the value of the '<em><b>Front Controller Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.IOParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Controller Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Controller Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFrontControllerClass_FrontControllerAttribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IOParameter> getFrontControllerAttribute();

	/**
	 * Returns the value of the '<em><b>Front Controller Class Method</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FrontControllerMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Front Controller Class Method</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front Controller Class Method</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFrontControllerClass_FrontControllerClassMethod()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FrontControllerMethod> getFrontControllerClassMethod();

} // FrontControllerClass

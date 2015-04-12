/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.IOParameter#getDisplay <em>Display</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getIOParameter()
 * @model
 * @generated
 */
public interface IOParameter extends NavigationAttribute {
	/**
	 * Returns the value of the '<em><b>Display</b></em>' reference list.
	 * The list contents are of type {@link frameweb.FormComponent}.
	 * It is bidirectional and its opposite is '{@link frameweb.FormComponent#getInject <em>Inject</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display</em>' reference list.
	 * @see frameweb.FrameWebPackage#getIOParameter_Display()
	 * @see frameweb.FormComponent#getInject
	 * @model opposite="inject" derived="true"
	 * @generated
	 */
	EList<FormComponent> getDisplay();

} // IOParameter

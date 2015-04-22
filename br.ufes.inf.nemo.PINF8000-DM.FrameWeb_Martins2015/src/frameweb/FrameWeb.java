/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frameweb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.Frameweb#getCompose <em>Compose</em>}</li>
 *   <li>{@link frameweb.Frameweb#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFrameweb()
 * @model
 * @generated
 */
public interface Frameweb extends EObject {
	/**
	 * Returns the value of the '<em><b>Compose</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FrameWebModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFrameweb_Compose()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FrameWebModel> getCompose();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Framework}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFrameweb_Uses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Framework> getUses();

} // Frameweb

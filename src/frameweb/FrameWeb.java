/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Web</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.FrameWeb#getCompose <em>Compose</em>}</li>
 *   <li>{@link frameweb.FrameWeb#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.framewebPackage#getFrameWeb()
 * @model
 * @generated
 */
public interface FrameWeb extends EObject {
	/**
	 * Returns the value of the '<em><b>Compose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose</em>' containment reference.
	 * @see #setCompose(FrameWebModel)
	 * @see frameweb.framewebPackage#getFrameWeb_Compose()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FrameWebModel getCompose();

	/**
	 * Sets the value of the '{@link frameweb.FrameWeb#getCompose <em>Compose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compose</em>' containment reference.
	 * @see #getCompose()
	 * @generated
	 */
	void setCompose(FrameWebModel value);

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
	 * @see frameweb.framewebPackage#getFrameWeb_Uses()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Framework> getUses();

} // FrameWeb

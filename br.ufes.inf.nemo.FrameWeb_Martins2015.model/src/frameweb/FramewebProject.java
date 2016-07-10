/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.FramewebProject#getCompose <em>Compose</em>}</li>
 *   <li>{@link frameweb.FramewebProject#getConfigures <em>Configures</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFramewebProject()
 * @model annotation="Ecore constraints='FramewebProjectContent'"
 *        annotation="OCL FramewebProjectContent='((self.compose->size()>=1) and (self.configures->size()=0)) or ((self.configures->size()>=1) and (self.compose->size()=0))'"
 *        annotation="Comments FramewebProjectContent='The FramewebProject need obligatorily have a FrameworkProfile or a FramewebModel and may not both simultaneously.'"
 * @generated
 */
public interface FramewebProject extends EObject {
	/**
	 * Returns the value of the '<em><b>Compose</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FramewebModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFramewebProject_Compose()
	 * @model containment="true"
	 * @generated
	 */
	EList<FramewebModel> getCompose();

	/**
	 * Returns the value of the '<em><b>Configures</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FrameworkProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configures</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getFramewebProject_Configures()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrameworkProfile> getConfigures();

} // FramewebProject

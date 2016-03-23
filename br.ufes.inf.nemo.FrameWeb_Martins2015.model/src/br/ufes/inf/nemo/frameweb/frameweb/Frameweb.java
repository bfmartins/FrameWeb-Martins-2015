/**
 */
package br.ufes.inf.nemo.frameweb.frameweb;

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
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.Frameweb#getCompose <em>Compose</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.frameweb.Frameweb#getConfigures <em>Configures</em>}</li>
 * </ul>
 * </p>
 *
 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getFrameweb()
 * @model annotation="Ecore constraints='FramewebMinimum'"
 *        annotation="OCL FramewebMinimum='(self.Compose->size()>=1 and self.Configures->size()=0) or \r\n(self.Configures->size()>=1 and self.Compose->size()=0)'"
 *        annotation="Comments FramewebMininimum='The Frameweb need obligatorily have a Framework Profile or FramewebModel and can not have both simultaneously'"
 * @generated
 */
public interface Frameweb extends EObject {
	/**
	 * Returns the value of the '<em><b>Compose</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.frameweb.FrameWebModel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compose</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compose</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getFrameweb_Compose()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrameWebModel> getCompose();

	/**
	 * Returns the value of the '<em><b>Configures</b></em>' containment reference list.
	 * The list contents are of type {@link br.ufes.inf.nemo.frameweb.frameweb.FrameworkProfile}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configures</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configures</em>' containment reference list.
	 * @see br.ufes.inf.nemo.frameweb.frameweb.FramewebPackage#getFrameweb_Configures()
	 * @model containment="true"
	 * @generated
	 */
	EList<FrameworkProfile> getConfigures();

} // Frameweb

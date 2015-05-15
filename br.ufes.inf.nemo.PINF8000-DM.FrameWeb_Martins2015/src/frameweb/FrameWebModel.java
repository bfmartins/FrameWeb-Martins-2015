/**
 */
package frameweb;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Web Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.FrameWebModel#getIndite <em>Indite</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getFrameWebModel()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface FrameWebModel extends CDOObject, org.eclipse.uml2.uml.Package {
	/**
	 * Returns the value of the '<em><b>Indite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indite</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indite</em>' containment reference.
	 * @see #setIndite(NamingMethod)
	 * @see frameweb.FramewebPackage#getFrameWebModel_Indite()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NamingMethod getIndite();

	/**
	 * Sets the value of the '{@link frameweb.FrameWebModel#getIndite <em>Indite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indite</em>' containment reference.
	 * @see #getIndite()
	 * @generated
	 */
	void setIndite(NamingMethod value);

} // FrameWebModel

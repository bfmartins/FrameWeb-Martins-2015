/**
 */
package frameweb;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.TagLib#getTagLibTag <em>Tag Lib Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getTagLib()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface TagLib extends CDOObject, org.eclipse.uml2.uml.Package {
	/**
	 * Returns the value of the '<em><b>Tag Lib Tag</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.FrameworkTag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag Lib Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag Lib Tag</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getTagLib_TagLibTag()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<FrameworkTag> getTagLibTag();

} // TagLib

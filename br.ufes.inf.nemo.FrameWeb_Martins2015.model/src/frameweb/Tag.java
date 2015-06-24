/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.Tag#getSubTag <em>Sub Tag</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends org.eclipse.uml2.uml.Class {
	/**
	 * Returns the value of the '<em><b>Sub Tag</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Tag</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getTag_SubTag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getSubTag();

} // Tag

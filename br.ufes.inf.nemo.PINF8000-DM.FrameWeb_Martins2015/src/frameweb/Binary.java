/**
 */
package frameweb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.Binary#getBinaryClassAttribute <em>Binary Class Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getBinary()
 * @model
 * @generated
 */
public interface Binary extends NavigationClass {
	/**
	 * Returns the value of the '<em><b>Binary Class Attribute</b></em>' containment reference list.
	 * The list contents are of type {@link frameweb.BinaryAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Class Attribute</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Class Attribute</em>' containment reference list.
	 * @see frameweb.FramewebPackage#getBinary_BinaryClassAttribute()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BinaryAttribute> getBinaryClassAttribute();

} // Binary

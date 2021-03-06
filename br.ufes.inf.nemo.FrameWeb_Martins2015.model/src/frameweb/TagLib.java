/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag Lib</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.TagLib#getPrefix <em>Prefix</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getTagLib()
 * @model
 * @generated
 */
public interface TagLib extends org.eclipse.uml2.uml.Package {
	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see frameweb.FramewebPackage#getTagLib_Prefix()
	 * @model dataType="org.eclipse.uml2.types.String" required="true"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link frameweb.TagLib#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

} // TagLib

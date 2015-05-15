/**
 */
package frameweb;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.IdAttribute#getGeneration <em>Generation</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getIdAttribute()
 * @model
 * @generated
 */
public interface IdAttribute extends DomainAttribute {
	/**
	 * Returns the value of the '<em><b>Generation</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.Generation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generation</em>' attribute.
	 * @see frameweb.Generation
	 * @see #setGeneration(Generation)
	 * @see frameweb.FramewebPackage#getIdAttribute_Generation()
	 * @model
	 * @generated
	 */
	Generation getGeneration();

	/**
	 * Sets the value of the '{@link frameweb.IdAttribute#getGeneration <em>Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generation</em>' attribute.
	 * @see frameweb.Generation
	 * @see #getGeneration()
	 * @generated
	 */
	void setGeneration(Generation value);

} // IdAttribute

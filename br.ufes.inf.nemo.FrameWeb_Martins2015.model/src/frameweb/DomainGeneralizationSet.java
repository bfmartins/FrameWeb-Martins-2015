/**
 */
package frameweb;

import org.eclipse.uml2.uml.GeneralizationSet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainGeneralizationSet#getMapping <em>Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FramewebPackage#getDomainGeneralizationSet()
 * @model
 * @generated
 */
public interface DomainGeneralizationSet extends GeneralizationSet {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' attribute.
	 * The literals are from the enumeration {@link frameweb.InheritanceMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' attribute.
	 * @see frameweb.InheritanceMapping
	 * @see #setMapping(InheritanceMapping)
	 * @see frameweb.FramewebPackage#getDomainGeneralizationSet_Mapping()
	 * @model
	 * @generated
	 */
	InheritanceMapping getMapping();

	/**
	 * Sets the value of the '{@link frameweb.DomainGeneralizationSet#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see frameweb.InheritanceMapping
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(InheritanceMapping value);

} // DomainGeneralizationSet

/**
 */
package frameweb;

import uml2.Generalization;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain Generalization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link frameweb.DomainGeneralization#getMapping <em>Mapping</em>}</li>
 *   <li>{@link frameweb.DomainGeneralization#getTargetDomain <em>Target Domain</em>}</li>
 *   <li>{@link frameweb.DomainGeneralization#getSourceDomain <em>Source Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see frameweb.FrameWebPackage#getDomainGeneralization()
 * @model
 * @generated
 */
public interface DomainGeneralization extends Generalization {
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
	 * @see frameweb.FrameWebPackage#getDomainGeneralization_Mapping()
	 * @model
	 * @generated
	 */
	InheritanceMapping getMapping();

	/**
	 * Sets the value of the '{@link frameweb.DomainGeneralization#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see frameweb.InheritanceMapping
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(InheritanceMapping value);

	/**
	 * Returns the value of the '<em><b>Target Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Domain</em>' reference.
	 * @see #setTargetDomain(DomainClass)
	 * @see frameweb.FrameWebPackage#getDomainGeneralization_TargetDomain()
	 * @model required="true"
	 * @generated
	 */
	DomainClass getTargetDomain();

	/**
	 * Sets the value of the '{@link frameweb.DomainGeneralization#getTargetDomain <em>Target Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Domain</em>' reference.
	 * @see #getTargetDomain()
	 * @generated
	 */
	void setTargetDomain(DomainClass value);

	/**
	 * Returns the value of the '<em><b>Source Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Domain</em>' reference.
	 * @see #setSourceDomain(DomainClass)
	 * @see frameweb.FrameWebPackage#getDomainGeneralization_SourceDomain()
	 * @model required="true"
	 * @generated
	 */
	DomainClass getSourceDomain();

	/**
	 * Sets the value of the '{@link frameweb.DomainGeneralization#getSourceDomain <em>Source Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Domain</em>' reference.
	 * @see #getSourceDomain()
	 * @generated
	 */
	void setSourceDomain(DomainClass value);

} // DomainGeneralization

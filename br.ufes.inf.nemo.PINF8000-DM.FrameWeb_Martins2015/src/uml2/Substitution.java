/**
 */
package uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A substitution is a relationship between two classifiers signifies that the substituting classifier complies with the contract specified by the contract classifier. This implies that instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Substitution#getContract <em>Contract</em>}</li>
 *   <li>{@link uml2.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getSubstitution()
 * @model
 * @generated
 */
public interface Substitution extends Realization {
	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The contract with which the substituting classifier complies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Classifier)
	 * @see uml2.Uml2Package#getSubstitution_Contract()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Classifier getContract();

	/**
	 * Sets the value of the '{@link uml2.Substitution#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Classifier value);

	/**
	 * Returns the value of the '<em><b>Substituting Classifier</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Classifier#getSubstitution <em>Substitution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Instances of the substituting classifier are runtime substitutable where instances of the contract classifier are expected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substituting Classifier</em>' container reference.
	 * @see #setSubstitutingClassifier(Classifier)
	 * @see uml2.Uml2Package#getSubstitution_SubstitutingClassifier()
	 * @see uml2.Classifier#getSubstitution
	 * @model opposite="substitution" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Classifier getSubstitutingClassifier();

	/**
	 * Sets the value of the '{@link uml2.Substitution#getSubstitutingClassifier <em>Substituting Classifier</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substituting Classifier</em>' container reference.
	 * @see #getSubstitutingClassifier()
	 * @generated
	 */
	void setSubstitutingClassifier(Classifier value);

} // Substitution

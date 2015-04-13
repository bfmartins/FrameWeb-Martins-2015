/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Realization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The realization concept is specialized to (optionally) define the classifiers that realize the contract offered by a component in terms of its provided and required interfaces. The component forms an abstraction from these various classifiers.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.ComponentRealization#getRealizingClassifier <em>Realizing Classifier</em>}</li>
 *   <li>{@link uml2.ComponentRealization#getAbstraction <em>Abstraction</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getComponentRealization()
 * @model
 * @generated
 */
public interface ComponentRealization extends Realization {
	/**
	 * Returns the value of the '<em><b>Realizing Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The classifiers that are involved in the implementation of the Component that owns this Realization.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Realizing Classifier</em>' reference list.
	 * @see uml2.Uml2Package#getComponentRealization_RealizingClassifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<Classifier> getRealizingClassifier();

	/**
	 * Returns the value of the '<em><b>Abstraction</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link uml2.Component#getRealization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Component that owns this ComponentRealization and which is implemented by its realizing classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstraction</em>' container reference.
	 * @see #setAbstraction(Component)
	 * @see uml2.Uml2Package#getComponentRealization_Abstraction()
	 * @see uml2.Component#getRealization
	 * @model opposite="realization" transient="false" ordered="false"
	 * @generated
	 */
	Component getAbstraction();

	/**
	 * Sets the value of the '{@link uml2.ComponentRealization#getAbstraction <em>Abstraction</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstraction</em>' container reference.
	 * @see #getAbstraction()
	 * @generated
	 */
	void setAbstraction(Component value);

} // ComponentRealization

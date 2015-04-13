/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviored Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A classifier can have behavior specifications defined in its namespace. One of these may specify the behavior of the classifier itself.
 * A behaviored classifier may have an interface realization.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link uml2.BehavioredClassifier#getInterfaceRealization <em>Interface Realization</em>}</li>
 *   <li>{@link uml2.BehavioredClassifier#getOwnedBehavior <em>Owned Behavior</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getBehavioredClassifier()
 * @model abstract="true"
 * @generated
 */
public interface BehavioredClassifier extends Classifier {
	/**
	 * Returns the value of the '<em><b>Classifier Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A behavior specification that specifies the behavior of the classifier itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Classifier Behavior</em>' reference.
	 * @see #setClassifierBehavior(Behavior)
	 * @see uml2.Uml2Package#getBehavioredClassifier_ClassifierBehavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getClassifierBehavior();

	/**
	 * Sets the value of the '{@link uml2.BehavioredClassifier#getClassifierBehavior <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classifier Behavior</em>' reference.
	 * @see #getClassifierBehavior()
	 * @generated
	 */
	void setClassifierBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Interface Realization</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.InterfaceRealization}.
	 * It is bidirectional and its opposite is '{@link uml2.InterfaceRealization#getImplementingClassifier <em>Implementing Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The set of InterfaceRealizations owned by the BehavioredClassifier. Interface realizations reference the Interfaces of which the BehavioredClassifier is an implementation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface Realization</em>' containment reference list.
	 * @see uml2.Uml2Package#getBehavioredClassifier_InterfaceRealization()
	 * @see uml2.InterfaceRealization#getImplementingClassifier
	 * @model opposite="implementingClassifier" containment="true" ordered="false"
	 * @generated
	 */
	EList<InterfaceRealization> getInterfaceRealization();

	/**
	 * Returns the value of the '<em><b>Owned Behavior</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.Behavior}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References behavior specifications owned by a classifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Behavior</em>' containment reference list.
	 * @see uml2.Uml2Package#getBehavioredClassifier_OwnedBehavior()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Behavior> getOwnedBehavior();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If a behavior is classifier behavior, it does not have a specification.
	 * self.classifierBehavior->notEmpty() implies self.classifierBehavior.specification->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.classifierBehavior->notEmpty() implies self.classifierBehavior.specification->isEmpty()'"
	 * @generated
	 */
	boolean classBehavior(DiagnosticChain diagnostics, Map<Object, Object> context);

} // BehavioredClassifier

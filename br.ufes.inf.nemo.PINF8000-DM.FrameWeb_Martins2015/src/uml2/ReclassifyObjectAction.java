/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reclassify Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reclassify object action is an action that changes which classifiers classify an object.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.ReclassifyObjectAction#getIsReplaceAll <em>Is Replace All</em>}</li>
 *   <li>{@link uml2.ReclassifyObjectAction#getNewClassifier <em>New Classifier</em>}</li>
 *   <li>{@link uml2.ReclassifyObjectAction#getObject <em>Object</em>}</li>
 *   <li>{@link uml2.ReclassifyObjectAction#getOldClassifier <em>Old Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getReclassifyObjectAction()
 * @model
 * @generated
 */
public interface ReclassifyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Replace All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether existing classifiers should be removed before adding the new classifiers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Replace All</em>' attribute.
	 * @see #setIsReplaceAll(Boolean)
	 * @see uml2.Uml2Package#getReclassifyObjectAction_IsReplaceAll()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsReplaceAll();

	/**
	 * Sets the value of the '{@link uml2.ReclassifyObjectAction#getIsReplaceAll <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Replace All</em>' attribute.
	 * @see #getIsReplaceAll()
	 * @generated
	 */
	void setIsReplaceAll(Boolean value);

	/**
	 * Returns the value of the '<em><b>New Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of classifiers to be added to the classifiers of the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>New Classifier</em>' reference list.
	 * @see uml2.Uml2Package#getReclassifyObjectAction_NewClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getNewClassifier();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Holds the object to be reclassified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Object</em>' containment reference.
	 * @see #setObject(InputPin)
	 * @see uml2.Uml2Package#getReclassifyObjectAction_Object()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getObject();

	/**
	 * Sets the value of the '{@link uml2.ReclassifyObjectAction#getObject <em>Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' containment reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(InputPin value);

	/**
	 * Returns the value of the '<em><b>Old Classifier</b></em>' reference list.
	 * The list contents are of type {@link uml2.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A set of classifiers to be removed from the classifiers of the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Old Classifier</em>' reference list.
	 * @see uml2.Uml2Package#getReclassifyObjectAction_OldClassifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Classifier> getOldClassifier();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pin has no type.
	 * self.argument.type->size() = 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.argument.type->size() = 0'"
	 * @generated
	 */
	boolean inputPin(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the input pin is 1..1.
	 * self.argument.multiplicity.is(1,1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.argument.multiplicity.is(1,1)'"
	 * @generated
	 */
	boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * None of the new classifiers may be abstract.
	 * not self.newClassifier->exists(isAbstract = true)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.newClassifier->exists(isAbstract = true)'"
	 * @generated
	 */
	boolean classifierNotAbstract(DiagnosticChain diagnostics, Map<Object, Object> context);

} // ReclassifyObjectAction

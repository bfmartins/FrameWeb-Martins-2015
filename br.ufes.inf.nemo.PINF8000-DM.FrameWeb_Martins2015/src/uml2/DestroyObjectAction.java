/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Destroy Object Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A destroy object action is an action that destroys objects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.DestroyObjectAction#getIsDestroyLinks <em>Is Destroy Links</em>}</li>
 *   <li>{@link uml2.DestroyObjectAction#getIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}</li>
 *   <li>{@link uml2.DestroyObjectAction#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getDestroyObjectAction()
 * @model
 * @generated
 */
public interface DestroyObjectAction extends Action {
	/**
	 * Returns the value of the '<em><b>Is Destroy Links</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether links in which the object participates are destroyed along with the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #setIsDestroyLinks(Boolean)
	 * @see uml2.Uml2Package#getDestroyObjectAction_IsDestroyLinks()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDestroyLinks();

	/**
	 * Sets the value of the '{@link uml2.DestroyObjectAction#getIsDestroyLinks <em>Is Destroy Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Links</em>' attribute.
	 * @see #getIsDestroyLinks()
	 * @generated
	 */
	void setIsDestroyLinks(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Destroy Owned Objects</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies whether objects owned by the object are destroyed along with the object.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #setIsDestroyOwnedObjects(Boolean)
	 * @see uml2.Uml2Package#getDestroyObjectAction_IsDestroyOwnedObjects()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsDestroyOwnedObjects();

	/**
	 * Sets the value of the '{@link uml2.DestroyObjectAction#getIsDestroyOwnedObjects <em>Is Destroy Owned Objects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Destroy Owned Objects</em>' attribute.
	 * @see #getIsDestroyOwnedObjects()
	 * @generated
	 */
	void setIsDestroyOwnedObjects(Boolean value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pin providing the object to be destroyed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(InputPin)
	 * @see uml2.Uml2Package#getDestroyObjectAction_Target()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InputPin getTarget();

	/**
	 * Sets the value of the '{@link uml2.DestroyObjectAction#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(InputPin value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The multiplicity of the input pin is 1..1.
	 * self.target.multiplicity.is(1,1)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.target.multiplicity.is(1,1)'"
	 * @generated
	 */
	boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The input pin has no type.
	 * self.target.type->size() = 0
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.target.type->size() = 0'"
	 * @generated
	 */
	boolean noType(DiagnosticChain diagnostics, Map<Object, Object> context);

} // DestroyObjectAction

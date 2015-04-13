/**
 */
package uml2;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Templateable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A templateable element is an element that can optionally be defined as a template and bound to other templates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.TemplateableElement#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml2.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getTemplateableElement()
 * @model abstract="true"
 * @generated
 */
public interface TemplateableElement extends Element {
	/**
	 * Returns the value of the '<em><b>Template Binding</b></em>' containment reference list.
	 * The list contents are of type {@link uml2.TemplateBinding}.
	 * It is bidirectional and its opposite is '{@link uml2.TemplateBinding#getBoundElement <em>Bound Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional bindings from this element to templates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Binding</em>' containment reference list.
	 * @see uml2.Uml2Package#getTemplateableElement_TemplateBinding()
	 * @see uml2.TemplateBinding#getBoundElement
	 * @model opposite="boundElement" containment="true" ordered="false"
	 * @generated
	 */
	EList<TemplateBinding> getTemplateBinding();

	/**
	 * Returns the value of the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link uml2.TemplateSignature#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The optional template signature specifying the formal template parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #setOwnedTemplateSignature(TemplateSignature)
	 * @see uml2.Uml2Package#getTemplateableElement_OwnedTemplateSignature()
	 * @see uml2.TemplateSignature#getTemplate
	 * @model opposite="template" containment="true" ordered="false"
	 * @generated
	 */
	TemplateSignature getOwnedTemplateSignature();

	/**
	 * Sets the value of the '{@link uml2.TemplateableElement#getOwnedTemplateSignature <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Template Signature</em>' containment reference.
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 */
	void setOwnedTemplateSignature(TemplateSignature value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isTemplate() returns whether this templateable element is actually a template.
	 * result = ownedTemplateSignature->notEmpty()
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = ownedTemplateSignature->notEmpty()'"
	 * @generated
	 */
	Boolean isTemplate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query parameterableElements() returns the set of elements that may be used as the parametered elements for a template parameter of this templateable element. By default, this set includes all the owned elements. Subclasses may override this operation if they choose to restrict the set of parameterable elements.
	 * result = allOwnedElements->select(oclIsKindOf(ParameterableElement))
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = allOwnedElements->select(oclIsKindOf(ParameterableElement))'"
	 * @generated
	 */
	EList<ParameterableElement> parameterableElements();

} // TemplateableElement

/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An extension is used to indicate that the properties of a metaclass are extended through a stereotype, and gives the ability to flexibly add (and later remove) stereotypes to classes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Extension#getIsRequired <em>Is Required</em>}</li>
 *   <li>{@link uml2.Extension#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getExtension()
 * @model
 * @generated
 */
public interface Extension extends Association {
	/**
	 * Returns the value of the '<em><b>Is Required</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether an instance of the extending stereotype must be created when an instance of the extended class is created. The attribute value is derived from the value of the lower property of the ExtensionEnd referenced by Extension::ownedEnd; a lower value of 1 means that isRequired is true, but otherwise it is false. Since the default value of ExtensionEnd::lower is 0, the default value of isRequired is false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Required</em>' attribute.
	 * @see uml2.Uml2Package#getExtension_IsRequired()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Boolean getIsRequired();

	/**
	 * Returns the value of the '<em><b>Metaclass</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link uml2.Class#getExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Class that is extended through an Extension. The property is derived from the type of the memberEnd that is not the ownedEnd.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metaclass</em>' reference.
	 * @see uml2.Uml2Package#getExtension_Metaclass()
	 * @see uml2.Class#getExtension
	 * @model opposite="extension" required="true" changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	uml2.Class getMetaclass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The non-owned end of an Extension is typed by a Class.
	 * metaclassEnd()->notEmpty() and metaclass()->oclIsKindOf(Class)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='metaclassEnd()->notEmpty() and metaclass()->oclIsKindOf(Class)'"
	 * @generated
	 */
	boolean nonOwnedEnd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An Extension is binary, i.e., it has only two memberEnds.
	 * memberEnd->size() = 2
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='memberEnd->size() = 2'"
	 * @generated
	 */
	boolean isBinary(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isRequired() is true if the owned end has a multiplicity with the lower bound of 1.
	 * result = (ownedEnd->lowerBound() = 1)
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = (ownedEnd->lowerBound() = 1)'"
	 * @generated
	 */
	Boolean isRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclass() returns the metaclass that is being extended (as opposed to the extending stereotype).
	 * result = metaclassEnd().type
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = metaclassEnd().type'"
	 * @generated
	 */
	uml2.Class metaclass();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query metaclassEnd() returns the Property that is typed by a metaclass (as opposed to a stereotype).
	 * result = memberEnd->reject(ownedEnd)
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = memberEnd->reject(ownedEnd)'"
	 * @generated
	 */
	Property metaclassEnd();

} // Extension

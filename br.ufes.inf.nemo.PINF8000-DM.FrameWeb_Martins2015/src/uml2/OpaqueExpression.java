/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Opaque Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Provides a mechanism for precisely defining the behavior of an opaque expression. An opaque expression is defined by a behavior restricted to return one result.
 * An opaque expression is an uninterpreted textual statement that denotes a (possibly empty) set of values when evaluated in a context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.OpaqueExpression#getBehavior <em>Behavior</em>}</li>
 *   <li>{@link uml2.OpaqueExpression#getBody <em>Body</em>}</li>
 *   <li>{@link uml2.OpaqueExpression#getLanguage <em>Language</em>}</li>
 *   <li>{@link uml2.OpaqueExpression#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getOpaqueExpression()
 * @model
 * @generated
 */
public interface OpaqueExpression extends ValueSpecification {
	/**
	 * Returns the value of the '<em><b>Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the behavior of the opaque expression.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Behavior</em>' reference.
	 * @see #setBehavior(Behavior)
	 * @see uml2.Uml2Package#getOpaqueExpression_Behavior()
	 * @model ordered="false"
	 * @generated
	 */
	Behavior getBehavior();

	/**
	 * Sets the value of the '{@link uml2.OpaqueExpression#getBehavior <em>Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior</em>' reference.
	 * @see #getBehavior()
	 * @generated
	 */
	void setBehavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Body</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text of the expression, possibly in multiple languages.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body</em>' attribute list.
	 * @see uml2.Uml2Package#getOpaqueExpression_Body()
	 * @model unique="false" dataType="primitiveTypes.String"
	 * @generated
	 */
	EList<String> getBody();

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the languages in which the expression is stated. The interpretation of the expression body depends on the languages. If the languages are unspecified, they might be implicit from the expression body or the context. Languages are matched to body strings by order.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute list.
	 * @see uml2.Uml2Package#getOpaqueExpression_Language()
	 * @model dataType="primitiveTypes.String"
	 * @generated
	 */
	EList<String> getLanguage();

	/**
	 * Returns the value of the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Restricts an opaque expression to return exactly one return result. When the invocation of the opaque expression completes, a single set of values is returned to its owner. This association is derived from the single return result parameter of the associated behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' reference.
	 * @see uml2.Uml2Package#getOpaqueExpression_Result()
	 * @model changeable="false" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Parameter getResult();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior must have exactly one return result parameter.
	 * self.behavior.notEmpty() implies
	 *   self.behavior.ownedParameter->select(p | p.direction=#return)->size() = 1
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.behavior.notEmpty() implies\r\n  self.behavior.ownedParameter->select(p | p.direction=#return)->size() = 1'"
	 * @generated
	 */
	boolean oneReturnResultParameter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The behavior may only have return result parameters.
	 * self.behavior.notEmpty() implies
	 *   self.behavior.ownedParameters->select(p | p.direction<>#return)->isEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.behavior.notEmpty() implies\r\n  self.behavior.ownedParameters->select(p | p.direction<>#return)->isEmpty()'"
	 * @generated
	 */
	boolean onlyReturnResultParameters(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the language attribute is not empty, then the size of the body and language arrays must be the same.
	 * language->notEmpty() implies (body->size() = language->size())
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='language->notEmpty() implies (body->size() = language->size())'"
	 * @generated
	 */
	boolean languageBodySize(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isIntegral() tells whether an expression is intended to produce an integer.
	 * result = false
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = false'"
	 * @generated
	 */
	Boolean isIntegral();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isNonNegative() tells whether an integer expression has a non-negative value.
	 * self.isIntegral()
	 * result = false
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = false'"
	 * @generated
	 */
	Boolean isNonNegative();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query isPositive() tells whether an integer expression has a positive value.
	 * result = false
	 * self.isIntegral()
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='result = false'"
	 * @generated
	 */
	Boolean isPositive();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for OpaqueExpression::/result : Parameter
	 * true
	 * <!-- end-model-doc -->
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	Parameter result();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The query value() gives an integer value for an expression intended to produce one.
	 * self.isIntegral()
	 * true
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.Integer" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	Integer value();

} // OpaqueExpression

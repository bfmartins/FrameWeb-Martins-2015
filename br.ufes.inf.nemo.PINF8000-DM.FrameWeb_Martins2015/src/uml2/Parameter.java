/**
 */
package uml2;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameters are allowed to be treated as connectable elements.
 * Parameters have support for streaming, exceptions, and parameter sets.
 * A parameter is a specification of an argument used to pass information into or out of an invocation of a behavioral feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.Parameter#getDefault <em>Default</em>}</li>
 *   <li>{@link uml2.Parameter#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link uml2.Parameter#getDirection <em>Direction</em>}</li>
 *   <li>{@link uml2.Parameter#getEffect <em>Effect</em>}</li>
 *   <li>{@link uml2.Parameter#getIsException <em>Is Exception</em>}</li>
 *   <li>{@link uml2.Parameter#getIsStream <em>Is Stream</em>}</li>
 *   <li>{@link uml2.Parameter#getOperation <em>Operation</em>}</li>
 *   <li>{@link uml2.Parameter#getParameterSet <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends ConnectableElement, MultiplicityElement {
	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a String that represents a value to be used when no argument is supplied for the Parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see uml2.Uml2Package#getParameter_Default()
	 * @model dataType="primitiveTypes.String" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link uml2.Parameter#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies a ValueSpecification that represents a value to be used when no argument is supplied for the Parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(ValueSpecification)
	 * @see uml2.Uml2Package#getParameter_DefaultValue()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getDefaultValue();

	/**
	 * Sets the value of the '{@link uml2.Parameter#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"in"</code>.
	 * The literals are from the enumeration {@link uml2.ParameterDirectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether a parameter is being sent into or out of a behavioral element.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see uml2.ParameterDirectionKind
	 * @see #setDirection(ParameterDirectionKind)
	 * @see uml2.Uml2Package#getParameter_Direction()
	 * @model default="in" required="true" ordered="false"
	 * @generated
	 */
	ParameterDirectionKind getDirection();

	/**
	 * Sets the value of the '{@link uml2.Parameter#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see uml2.ParameterDirectionKind
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(ParameterDirectionKind value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' attribute.
	 * The literals are from the enumeration {@link uml2.ParameterEffectKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the effect that the owner of the parameter has on values passed in or out of the parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Effect</em>' attribute.
	 * @see uml2.ParameterEffectKind
	 * @see #setEffect(ParameterEffectKind)
	 * @see uml2.Uml2Package#getParameter_Effect()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterEffectKind getEffect();

	/**
	 * Sets the value of the '{@link uml2.Parameter#getEffect <em>Effect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' attribute.
	 * @see uml2.ParameterEffectKind
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(ParameterEffectKind value);

	/**
	 * Returns the value of the '<em><b>Is Exception</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether an output parameter may emit a value to the exclusion of the other outputs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Exception</em>' attribute.
	 * @see #setIsException(Boolean)
	 * @see uml2.Uml2Package#getParameter_IsException()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsException();

	/**
	 * Sets the value of the '{@link uml2.Parameter#getIsException <em>Is Exception</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Exception</em>' attribute.
	 * @see #getIsException()
	 * @generated
	 */
	void setIsException(Boolean value);

	/**
	 * Returns the value of the '<em><b>Is Stream</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tells whether an input parameter may accept values while its behavior is executing, or whether an output parameter post values while the behavior is executing.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Stream</em>' attribute.
	 * @see #setIsStream(Boolean)
	 * @see uml2.Uml2Package#getParameter_IsStream()
	 * @model default="false" dataType="primitiveTypes.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIsStream();

	/**
	 * Sets the value of the '{@link uml2.Parameter#getIsStream <em>Is Stream</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Stream</em>' attribute.
	 * @see #getIsStream()
	 * @generated
	 */
	void setIsStream(Boolean value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Operation owning this parameter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Operation</em>' reference.
	 * @see uml2.Uml2Package#getParameter_Operation()
	 * @model transient="true" changeable="false" volatile="true" ordered="false"
	 * @generated
	 */
	Operation getOperation();

	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' reference list.
	 * The list contents are of type {@link uml2.ParameterSet}.
	 * It is bidirectional and its opposite is '{@link uml2.ParameterSet#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parameter sets containing the parameter. See ParameterSet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parameter Set</em>' reference list.
	 * @see uml2.Uml2Package#getParameter_ParameterSet()
	 * @see uml2.ParameterSet#getParameter
	 * @model opposite="parameter" ordered="false"
	 * @generated
	 */
	EList<ParameterSet> getParameterSet();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An input parameter cannot be an exception.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean notException(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Only in and inout parameters may have a delete effect. Only out, inout, and return parameters may have a create effect.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean inAndOut(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter may only be associated with a connector end within the context of a collaboration.
	 * self.end.notEmpty() implies self.collaboration.notEmpty()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.end.notEmpty() implies self.collaboration.notEmpty()'"
	 * @generated
	 */
	boolean connectorEnd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reentrant behaviors cannot have stream parameters.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean reentrantBehaviors(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A parameter cannot be a stream and exception at the same time.
	 * true
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	boolean streamAndException(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Missing derivation for Parameter::/default : String
	 * true
	 * <!-- end-model-doc -->
	 * @model dataType="primitiveTypes.String" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='true'"
	 * @generated
	 */
	String default_();

} // Parameter

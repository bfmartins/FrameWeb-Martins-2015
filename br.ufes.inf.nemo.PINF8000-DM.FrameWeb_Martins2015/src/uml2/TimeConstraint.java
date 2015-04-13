/**
 */
package uml2;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A time constraint is a constraint that refers to a time interval.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link uml2.TimeConstraint#getFirstEvent <em>First Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see uml2.Uml2Package#getTimeConstraint()
 * @model
 * @generated
 */
public interface TimeConstraint extends IntervalConstraint {
	/**
	 * Returns the value of the '<em><b>First Event</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value of firstEvent is related to constrainedElement. If firstEvent is true, then the corresponding observation event is the first time instant the execution enters constrainedElement. If firstEvent is false, then the corresponding observation event is the last time instant the execution is within constrainedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Event</em>' attribute.
	 * @see #setFirstEvent(Boolean)
	 * @see uml2.Uml2Package#getTimeConstraint_FirstEvent()
	 * @model default="true" dataType="primitiveTypes.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getFirstEvent();

	/**
	 * Sets the value of the '{@link uml2.TimeConstraint#getFirstEvent <em>First Event</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Event</em>' attribute.
	 * @see #getFirstEvent()
	 * @generated
	 */
	void setFirstEvent(Boolean value);

} // TimeConstraint

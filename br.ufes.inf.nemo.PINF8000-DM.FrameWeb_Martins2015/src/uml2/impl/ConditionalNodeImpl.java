/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Clause;
import uml2.ConditionalNode;
import uml2.OutputPin;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ConditionalNodeImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link uml2.impl.ConditionalNodeImpl#getIsAssured <em>Is Assured</em>}</li>
 *   <li>{@link uml2.impl.ConditionalNodeImpl#getIsDeterminate <em>Is Determinate</em>}</li>
 *   <li>{@link uml2.impl.ConditionalNodeImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
	/**
	 * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> clause;

	/**
	 * The default value of the '{@link #getIsAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssured()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ASSURED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAssured() <em>Is Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAssured()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAssured = IS_ASSURED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DETERMINATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDeterminate() <em>Is Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDeterminate()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDeterminate = IS_DETERMINATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.CONDITIONAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getClause() {
		if (clause == null) {
			clause = new EObjectContainmentEList<Clause>(Clause.class, this, Uml2Package.CONDITIONAL_NODE__CLAUSE);
		}
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAssured() {
		return isAssured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssured(Boolean newIsAssured) {
		Boolean oldIsAssured = isAssured;
		isAssured = newIsAssured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CONDITIONAL_NODE__IS_ASSURED, oldIsAssured, isAssured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDeterminate() {
		return isDeterminate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDeterminate(Boolean newIsDeterminate) {
		Boolean oldIsDeterminate = isDeterminate;
		isDeterminate = newIsDeterminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CONDITIONAL_NODE__IS_DETERMINATE, oldIsDeterminate, isDeterminate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, Uml2Package.CONDITIONAL_NODE__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noInputPins(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CONDITIONAL_NODE__NO_INPUT_PINS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "noInputPins", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean resultNoIncoming(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CONDITIONAL_NODE__RESULT_NO_INCOMING,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "resultNoIncoming", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean clauseNoPredecessor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CONDITIONAL_NODE__CLAUSE_NO_PREDECESSOR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "clauseNoPredecessor", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean executableNodes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CONDITIONAL_NODE__EXECUTABLE_NODES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "executableNodes", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean matchingOutputPins(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CONDITIONAL_NODE__MATCHING_OUTPUT_PINS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "matchingOutputPins", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean oneClauseWithExecutableNode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CONDITIONAL_NODE__ONE_CLAUSE_WITH_EXECUTABLE_NODE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "oneClauseWithExecutableNode", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.CONDITIONAL_NODE__CLAUSE:
				return ((InternalEList<?>)getClause()).basicRemove(otherEnd, msgs);
			case Uml2Package.CONDITIONAL_NODE__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.CONDITIONAL_NODE__CLAUSE:
				return getClause();
			case Uml2Package.CONDITIONAL_NODE__IS_ASSURED:
				return getIsAssured();
			case Uml2Package.CONDITIONAL_NODE__IS_DETERMINATE:
				return getIsDeterminate();
			case Uml2Package.CONDITIONAL_NODE__RESULT:
				return getResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2Package.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				getClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case Uml2Package.CONDITIONAL_NODE__IS_ASSURED:
				setIsAssured((Boolean)newValue);
				return;
			case Uml2Package.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate((Boolean)newValue);
				return;
			case Uml2Package.CONDITIONAL_NODE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Uml2Package.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				return;
			case Uml2Package.CONDITIONAL_NODE__IS_ASSURED:
				setIsAssured(IS_ASSURED_EDEFAULT);
				return;
			case Uml2Package.CONDITIONAL_NODE__IS_DETERMINATE:
				setIsDeterminate(IS_DETERMINATE_EDEFAULT);
				return;
			case Uml2Package.CONDITIONAL_NODE__RESULT:
				getResult().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Uml2Package.CONDITIONAL_NODE__CLAUSE:
				return clause != null && !clause.isEmpty();
			case Uml2Package.CONDITIONAL_NODE__IS_ASSURED:
				return IS_ASSURED_EDEFAULT == null ? isAssured != null : !IS_ASSURED_EDEFAULT.equals(isAssured);
			case Uml2Package.CONDITIONAL_NODE__IS_DETERMINATE:
				return IS_DETERMINATE_EDEFAULT == null ? isDeterminate != null : !IS_DETERMINATE_EDEFAULT.equals(isDeterminate);
			case Uml2Package.CONDITIONAL_NODE__RESULT:
				return result != null && !result.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.CONDITIONAL_NODE___NO_INPUT_PINS__DIAGNOSTICCHAIN_MAP:
				return noInputPins((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CONDITIONAL_NODE___RESULT_NO_INCOMING__DIAGNOSTICCHAIN_MAP:
				return resultNoIncoming((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CONDITIONAL_NODE___CLAUSE_NO_PREDECESSOR__DIAGNOSTICCHAIN_MAP:
				return clauseNoPredecessor((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CONDITIONAL_NODE___EXECUTABLE_NODES__DIAGNOSTICCHAIN_MAP:
				return executableNodes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CONDITIONAL_NODE___MATCHING_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP:
				return matchingOutputPins((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CONDITIONAL_NODE___ONE_CLAUSE_WITH_EXECUTABLE_NODE__DIAGNOSTICCHAIN_MAP:
				return oneClauseWithExecutableNode((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isAssured: ");
		result.append(isAssured);
		result.append(", isDeterminate: ");
		result.append(isDeterminate);
		result.append(')');
		return result.toString();
	}

} //ConditionalNodeImpl

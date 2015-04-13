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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.ExecutableNode;
import uml2.InputPin;
import uml2.LoopNode;
import uml2.OutputPin;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.LoopNodeImpl#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link uml2.impl.LoopNodeImpl#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link uml2.impl.LoopNodeImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link uml2.impl.LoopNodeImpl#getIsTestedFirst <em>Is Tested First</em>}</li>
 *   <li>{@link uml2.impl.LoopNodeImpl#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link uml2.impl.LoopNodeImpl#getLoopVariableInput <em>Loop Variable Input</em>}</li>
 *   <li>{@link uml2.impl.LoopNodeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link uml2.impl.LoopNodeImpl#getSetupPart <em>Setup Part</em>}</li>
 *   <li>{@link uml2.impl.LoopNodeImpl#getTest <em>Test</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode {
	/**
	 * The cached value of the '{@link #getBodyOutput() <em>Body Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> bodyOutput;

	/**
	 * The cached value of the '{@link #getBodyPart() <em>Body Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> bodyPart;

	/**
	 * The cached value of the '{@link #getDecider() <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider()
	 * @generated
	 * @ordered
	 */
	protected OutputPin decider;

	/**
	 * The default value of the '{@link #getIsTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_TESTED_FIRST_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsTestedFirst() <em>Is Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected Boolean isTestedFirst = IS_TESTED_FIRST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> loopVariable;

	/**
	 * The cached value of the '{@link #getLoopVariableInput() <em>Loop Variable Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariableInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> loopVariableInput;

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
	 * The cached value of the '{@link #getSetupPart() <em>Setup Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> setupPart;

	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> test;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.LOOP_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getBodyOutput() {
		if (bodyOutput == null) {
			bodyOutput = new EObjectResolvingEList<OutputPin>(OutputPin.class, this, Uml2Package.LOOP_NODE__BODY_OUTPUT);
		}
		return bodyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getBodyPart() {
		if (bodyPart == null) {
			bodyPart = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, Uml2Package.LOOP_NODE__BODY_PART);
		}
		return bodyPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		if (decider != null && decider.eIsProxy()) {
			InternalEObject oldDecider = (InternalEObject)decider;
			decider = (OutputPin)eResolveProxy(oldDecider);
			if (decider != oldDecider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.LOOP_NODE__DECIDER, oldDecider, decider));
			}
		}
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetDecider() {
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider(OutputPin newDecider) {
		OutputPin oldDecider = decider;
		decider = newDecider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.LOOP_NODE__DECIDER, oldDecider, decider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsTestedFirst() {
		return isTestedFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTestedFirst(Boolean newIsTestedFirst) {
		Boolean oldIsTestedFirst = isTestedFirst;
		isTestedFirst = newIsTestedFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.LOOP_NODE__IS_TESTED_FIRST, oldIsTestedFirst, isTestedFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getLoopVariable() {
		if (loopVariable == null) {
			loopVariable = new EObjectResolvingEList<OutputPin>(OutputPin.class, this, Uml2Package.LOOP_NODE__LOOP_VARIABLE);
		}
		return loopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getLoopVariableInput() {
		if (loopVariableInput == null) {
			loopVariableInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, Uml2Package.LOOP_NODE__LOOP_VARIABLE_INPUT);
		}
		return loopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, Uml2Package.LOOP_NODE__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getSetupPart() {
		if (setupPart == null) {
			setupPart = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, Uml2Package.LOOP_NODE__SETUP_PART);
		}
		return setupPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getTest() {
		if (test == null) {
			test = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, Uml2Package.LOOP_NODE__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean inputEdges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.LOOP_NODE__INPUT_EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "inputEdges", EObjectValidator.getObjectLabel(this, context) }),
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
						 Uml2Validator.LOOP_NODE__RESULT_NO_INCOMING,
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
						 Uml2Validator.LOOP_NODE__EXECUTABLE_NODES,
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
	public boolean bodyOutputPins(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.LOOP_NODE__BODY_OUTPUT_PINS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "bodyOutputPins", EObjectValidator.getObjectLabel(this, context) }),
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
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return ((InternalEList<?>)getLoopVariableInput()).basicRemove(otherEnd, msgs);
			case Uml2Package.LOOP_NODE__RESULT:
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
			case Uml2Package.LOOP_NODE__BODY_OUTPUT:
				return getBodyOutput();
			case Uml2Package.LOOP_NODE__BODY_PART:
				return getBodyPart();
			case Uml2Package.LOOP_NODE__DECIDER:
				if (resolve) return getDecider();
				return basicGetDecider();
			case Uml2Package.LOOP_NODE__IS_TESTED_FIRST:
				return getIsTestedFirst();
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE:
				return getLoopVariable();
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return getLoopVariableInput();
			case Uml2Package.LOOP_NODE__RESULT:
				return getResult();
			case Uml2Package.LOOP_NODE__SETUP_PART:
				return getSetupPart();
			case Uml2Package.LOOP_NODE__TEST:
				return getTest();
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
			case Uml2Package.LOOP_NODE__BODY_OUTPUT:
				getBodyOutput().clear();
				getBodyOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case Uml2Package.LOOP_NODE__BODY_PART:
				getBodyPart().clear();
				getBodyPart().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case Uml2Package.LOOP_NODE__DECIDER:
				setDecider((OutputPin)newValue);
				return;
			case Uml2Package.LOOP_NODE__IS_TESTED_FIRST:
				setIsTestedFirst((Boolean)newValue);
				return;
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariable().clear();
				getLoopVariable().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInput().clear();
				getLoopVariableInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case Uml2Package.LOOP_NODE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case Uml2Package.LOOP_NODE__SETUP_PART:
				getSetupPart().clear();
				getSetupPart().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case Uml2Package.LOOP_NODE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends ExecutableNode>)newValue);
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
			case Uml2Package.LOOP_NODE__BODY_OUTPUT:
				getBodyOutput().clear();
				return;
			case Uml2Package.LOOP_NODE__BODY_PART:
				getBodyPart().clear();
				return;
			case Uml2Package.LOOP_NODE__DECIDER:
				setDecider((OutputPin)null);
				return;
			case Uml2Package.LOOP_NODE__IS_TESTED_FIRST:
				setIsTestedFirst(IS_TESTED_FIRST_EDEFAULT);
				return;
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariable().clear();
				return;
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInput().clear();
				return;
			case Uml2Package.LOOP_NODE__RESULT:
				getResult().clear();
				return;
			case Uml2Package.LOOP_NODE__SETUP_PART:
				getSetupPart().clear();
				return;
			case Uml2Package.LOOP_NODE__TEST:
				getTest().clear();
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
			case Uml2Package.LOOP_NODE__BODY_OUTPUT:
				return bodyOutput != null && !bodyOutput.isEmpty();
			case Uml2Package.LOOP_NODE__BODY_PART:
				return bodyPart != null && !bodyPart.isEmpty();
			case Uml2Package.LOOP_NODE__DECIDER:
				return decider != null;
			case Uml2Package.LOOP_NODE__IS_TESTED_FIRST:
				return IS_TESTED_FIRST_EDEFAULT == null ? isTestedFirst != null : !IS_TESTED_FIRST_EDEFAULT.equals(isTestedFirst);
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE:
				return loopVariable != null && !loopVariable.isEmpty();
			case Uml2Package.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return loopVariableInput != null && !loopVariableInput.isEmpty();
			case Uml2Package.LOOP_NODE__RESULT:
				return result != null && !result.isEmpty();
			case Uml2Package.LOOP_NODE__SETUP_PART:
				return setupPart != null && !setupPart.isEmpty();
			case Uml2Package.LOOP_NODE__TEST:
				return test != null && !test.isEmpty();
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
			case Uml2Package.LOOP_NODE___INPUT_EDGES__DIAGNOSTICCHAIN_MAP:
				return inputEdges((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.LOOP_NODE___RESULT_NO_INCOMING__DIAGNOSTICCHAIN_MAP:
				return resultNoIncoming((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.LOOP_NODE___EXECUTABLE_NODES__DIAGNOSTICCHAIN_MAP:
				return executableNodes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.LOOP_NODE___BODY_OUTPUT_PINS__DIAGNOSTICCHAIN_MAP:
				return bodyOutputPins((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (isTestedFirst: ");
		result.append(isTestedFirst);
		result.append(')');
		return result.toString();
	}

} //LoopNodeImpl

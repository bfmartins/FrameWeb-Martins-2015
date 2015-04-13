/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

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

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml2.InputPin;
import uml2.OutputPin;
import uml2.TestIdentityAction;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Identity Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.TestIdentityActionImpl#getFirst <em>First</em>}</li>
 *   <li>{@link uml2.impl.TestIdentityActionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link uml2.impl.TestIdentityActionImpl#getSecond <em>Second</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestIdentityActionImpl extends ActionImpl implements TestIdentityAction {
	/**
	 * The cached value of the '{@link #getFirst() <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirst()
	 * @generated
	 * @ordered
	 */
	protected InputPin first;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected OutputPin result;

	/**
	 * The cached value of the '{@link #getSecond() <em>Second</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecond()
	 * @generated
	 * @ordered
	 */
	protected InputPin second;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestIdentityActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.TEST_IDENTITY_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getFirst() {
		return first;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirst(InputPin newFirst, NotificationChain msgs) {
		InputPin oldFirst = first;
		first = newFirst;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.TEST_IDENTITY_ACTION__FIRST, oldFirst, newFirst);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirst(InputPin newFirst) {
		if (newFirst != first) {
			NotificationChain msgs = null;
			if (first != null)
				msgs = ((InternalEObject)first).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.TEST_IDENTITY_ACTION__FIRST, null, msgs);
			if (newFirst != null)
				msgs = ((InternalEObject)newFirst).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2Package.TEST_IDENTITY_ACTION__FIRST, null, msgs);
			msgs = basicSetFirst(newFirst, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.TEST_IDENTITY_ACTION__FIRST, newFirst, newFirst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResult(OutputPin newResult, NotificationChain msgs) {
		OutputPin oldResult = result;
		result = newResult;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.TEST_IDENTITY_ACTION__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(OutputPin newResult) {
		if (newResult != result) {
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.TEST_IDENTITY_ACTION__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2Package.TEST_IDENTITY_ACTION__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.TEST_IDENTITY_ACTION__RESULT, newResult, newResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getSecond() {
		return second;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecond(InputPin newSecond, NotificationChain msgs) {
		InputPin oldSecond = second;
		second = newSecond;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.TEST_IDENTITY_ACTION__SECOND, oldSecond, newSecond);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecond(InputPin newSecond) {
		if (newSecond != second) {
			NotificationChain msgs = null;
			if (second != null)
				msgs = ((InternalEObject)second).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.TEST_IDENTITY_ACTION__SECOND, null, msgs);
			if (newSecond != null)
				msgs = ((InternalEObject)newSecond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2Package.TEST_IDENTITY_ACTION__SECOND, null, msgs);
			msgs = basicSetSecond(newSecond, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.TEST_IDENTITY_ACTION__SECOND, newSecond, newSecond));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noType(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.TEST_IDENTITY_ACTION__NO_TYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "noType", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean multiplicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.TEST_IDENTITY_ACTION__MULTIPLICITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "multiplicity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean resultIsBoolean(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.TEST_IDENTITY_ACTION__RESULT_IS_BOOLEAN,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "resultIsBoolean", EObjectValidator.getObjectLabel(this, context) }),
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
			case Uml2Package.TEST_IDENTITY_ACTION__FIRST:
				return basicSetFirst(null, msgs);
			case Uml2Package.TEST_IDENTITY_ACTION__RESULT:
				return basicSetResult(null, msgs);
			case Uml2Package.TEST_IDENTITY_ACTION__SECOND:
				return basicSetSecond(null, msgs);
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
			case Uml2Package.TEST_IDENTITY_ACTION__FIRST:
				return getFirst();
			case Uml2Package.TEST_IDENTITY_ACTION__RESULT:
				return getResult();
			case Uml2Package.TEST_IDENTITY_ACTION__SECOND:
				return getSecond();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2Package.TEST_IDENTITY_ACTION__FIRST:
				setFirst((InputPin)newValue);
				return;
			case Uml2Package.TEST_IDENTITY_ACTION__RESULT:
				setResult((OutputPin)newValue);
				return;
			case Uml2Package.TEST_IDENTITY_ACTION__SECOND:
				setSecond((InputPin)newValue);
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
			case Uml2Package.TEST_IDENTITY_ACTION__FIRST:
				setFirst((InputPin)null);
				return;
			case Uml2Package.TEST_IDENTITY_ACTION__RESULT:
				setResult((OutputPin)null);
				return;
			case Uml2Package.TEST_IDENTITY_ACTION__SECOND:
				setSecond((InputPin)null);
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
			case Uml2Package.TEST_IDENTITY_ACTION__FIRST:
				return first != null;
			case Uml2Package.TEST_IDENTITY_ACTION__RESULT:
				return result != null;
			case Uml2Package.TEST_IDENTITY_ACTION__SECOND:
				return second != null;
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
			case Uml2Package.TEST_IDENTITY_ACTION___NO_TYPE__DIAGNOSTICCHAIN_MAP:
				return noType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.TEST_IDENTITY_ACTION___MULTIPLICITY__DIAGNOSTICCHAIN_MAP:
				return multiplicity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.TEST_IDENTITY_ACTION___RESULT_IS_BOOLEAN__DIAGNOSTICCHAIN_MAP:
				return resultIsBoolean((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TestIdentityActionImpl

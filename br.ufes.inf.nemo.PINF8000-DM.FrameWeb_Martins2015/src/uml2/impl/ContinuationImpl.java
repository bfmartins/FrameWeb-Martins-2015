/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml2.Continuation;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Continuation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ContinuationImpl#getSetting <em>Setting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContinuationImpl extends InteractionFragmentImpl implements Continuation {
	/**
	 * The default value of the '{@link #getSetting() <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetting()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SETTING_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getSetting() <em>Setting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetting()
	 * @generated
	 * @ordered
	 */
	protected Boolean setting = SETTING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContinuationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.CONTINUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getSetting() {
		return setting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetting(Boolean newSetting) {
		Boolean oldSetting = setting;
		setting = newSetting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CONTINUATION__SETTING, oldSetting, setting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean global(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.CONTINUATION__GLOBAL,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "global", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean firstOrLastInteractionFragment(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.CONTINUATION__FIRST_OR_LAST_INTERACTION_FRAGMENT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "firstOrLastInteractionFragment", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean sameName(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.CONTINUATION__SAME_NAME,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "sameName", EObjectValidator.getObjectLabel(this, context) }),
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.CONTINUATION__SETTING:
				return getSetting();
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
			case Uml2Package.CONTINUATION__SETTING:
				setSetting((Boolean)newValue);
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
			case Uml2Package.CONTINUATION__SETTING:
				setSetting(SETTING_EDEFAULT);
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
			case Uml2Package.CONTINUATION__SETTING:
				return SETTING_EDEFAULT == null ? setting != null : !SETTING_EDEFAULT.equals(setting);
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
			case Uml2Package.CONTINUATION___GLOBAL__DIAGNOSTICCHAIN_MAP:
				return global((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CONTINUATION___FIRST_OR_LAST_INTERACTION_FRAGMENT__DIAGNOSTICCHAIN_MAP:
				return firstOrLastInteractionFragment((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CONTINUATION___SAME_NAME__DIAGNOSTICCHAIN_MAP:
				return sameName((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (setting: ");
		result.append(setting);
		result.append(')');
		return result.toString();
	}

} //ContinuationImpl

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
import uml2.RemoveVariableValueAction;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Variable Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.RemoveVariableValueActionImpl#getIsRemoveDuplicates <em>Is Remove Duplicates</em>}</li>
 *   <li>{@link uml2.impl.RemoveVariableValueActionImpl#getRemoveAt <em>Remove At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RemoveVariableValueActionImpl extends WriteVariableActionImpl implements RemoveVariableValueAction {
	/**
	 * The default value of the '{@link #getIsRemoveDuplicates() <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRemoveDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_REMOVE_DUPLICATES_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsRemoveDuplicates() <em>Is Remove Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRemoveDuplicates()
	 * @generated
	 * @ordered
	 */
	protected Boolean isRemoveDuplicates = IS_REMOVE_DUPLICATES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRemoveAt() <em>Remove At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin removeAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveVariableValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.REMOVE_VARIABLE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRemoveDuplicates() {
		return isRemoveDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsRemoveDuplicates(Boolean newIsRemoveDuplicates) {
		Boolean oldIsRemoveDuplicates = isRemoveDuplicates;
		isRemoveDuplicates = newIsRemoveDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES, oldIsRemoveDuplicates, isRemoveDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getRemoveAt() {
		return removeAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveAt(InputPin newRemoveAt, NotificationChain msgs) {
		InputPin oldRemoveAt = removeAt;
		removeAt = newRemoveAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, oldRemoveAt, newRemoveAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveAt(InputPin newRemoveAt) {
		if (newRemoveAt != removeAt) {
			NotificationChain msgs = null;
			if (removeAt != null)
				msgs = ((InternalEObject)removeAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, null, msgs);
			if (newRemoveAt != null)
				msgs = ((InternalEObject)newRemoveAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, null, msgs);
			msgs = basicSetRemoveAt(newRemoveAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT, newRemoveAt, newRemoveAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean unlimitedNatural(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.REMOVE_VARIABLE_VALUE_ACTION__UNLIMITED_NATURAL,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "unlimitedNatural", EObjectValidator.getObjectLabel(this, context) }),
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
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				return basicSetRemoveAt(null, msgs);
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
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
				return getIsRemoveDuplicates();
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				return getRemoveAt();
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
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
				setIsRemoveDuplicates((Boolean)newValue);
				return;
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				setRemoveAt((InputPin)newValue);
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
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
				setIsRemoveDuplicates(IS_REMOVE_DUPLICATES_EDEFAULT);
				return;
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				setRemoveAt((InputPin)null);
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
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__IS_REMOVE_DUPLICATES:
				return IS_REMOVE_DUPLICATES_EDEFAULT == null ? isRemoveDuplicates != null : !IS_REMOVE_DUPLICATES_EDEFAULT.equals(isRemoveDuplicates);
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION__REMOVE_AT:
				return removeAt != null;
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
			case Uml2Package.REMOVE_VARIABLE_VALUE_ACTION___UNLIMITED_NATURAL__DIAGNOSTICCHAIN_MAP:
				return unlimitedNatural((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (isRemoveDuplicates: ");
		result.append(isRemoveDuplicates);
		result.append(')');
		return result.toString();
	}

} //RemoveVariableValueActionImpl

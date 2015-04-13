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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml2.InputPin;
import uml2.LinkEndCreationData;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Creation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.LinkEndCreationDataImpl#getInsertAt <em>Insert At</em>}</li>
 *   <li>{@link uml2.impl.LinkEndCreationDataImpl#getIsReplaceAll <em>Is Replace All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndCreationDataImpl extends LinkEndDataImpl implements LinkEndCreationData {
	/**
	 * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin insertAt;

	/**
	 * The default value of the '{@link #getIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_REPLACE_ALL_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsReplaceAll() <em>Is Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReplaceAll = IS_REPLACE_ALL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndCreationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.LINK_END_CREATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInsertAt() {
		if (insertAt != null && insertAt.eIsProxy()) {
			InternalEObject oldInsertAt = (InternalEObject)insertAt;
			insertAt = (InputPin)eResolveProxy(oldInsertAt);
			if (insertAt != oldInsertAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.LINK_END_CREATION_DATA__INSERT_AT, oldInsertAt, insertAt));
			}
		}
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetInsertAt() {
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt(InputPin newInsertAt) {
		InputPin oldInsertAt = insertAt;
		insertAt = newInsertAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.LINK_END_CREATION_DATA__INSERT_AT, oldInsertAt, insertAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReplaceAll() {
		return isReplaceAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReplaceAll(Boolean newIsReplaceAll) {
		Boolean oldIsReplaceAll = isReplaceAll;
		isReplaceAll = newIsReplaceAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.LINK_END_CREATION_DATA__IS_REPLACE_ALL, oldIsReplaceAll, isReplaceAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean createLinkAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.LINK_END_CREATION_DATA__CREATE_LINK_ACTION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "createLinkAction", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean singleInputPin(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.LINK_END_CREATION_DATA__SINGLE_INPUT_PIN,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "singleInputPin", EObjectValidator.getObjectLabel(this, context) }),
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
			case Uml2Package.LINK_END_CREATION_DATA__INSERT_AT:
				if (resolve) return getInsertAt();
				return basicGetInsertAt();
			case Uml2Package.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
				return getIsReplaceAll();
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
			case Uml2Package.LINK_END_CREATION_DATA__INSERT_AT:
				setInsertAt((InputPin)newValue);
				return;
			case Uml2Package.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
				setIsReplaceAll((Boolean)newValue);
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
			case Uml2Package.LINK_END_CREATION_DATA__INSERT_AT:
				setInsertAt((InputPin)null);
				return;
			case Uml2Package.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
				setIsReplaceAll(IS_REPLACE_ALL_EDEFAULT);
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
			case Uml2Package.LINK_END_CREATION_DATA__INSERT_AT:
				return insertAt != null;
			case Uml2Package.LINK_END_CREATION_DATA__IS_REPLACE_ALL:
				return IS_REPLACE_ALL_EDEFAULT == null ? isReplaceAll != null : !IS_REPLACE_ALL_EDEFAULT.equals(isReplaceAll);
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
			case Uml2Package.LINK_END_CREATION_DATA___CREATE_LINK_ACTION__DIAGNOSTICCHAIN_MAP:
				return createLinkAction((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.LINK_END_CREATION_DATA___SINGLE_INPUT_PIN__DIAGNOSTICCHAIN_MAP:
				return singleInputPin((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (isReplaceAll: ");
		result.append(isReplaceAll);
		result.append(')');
		return result.toString();
	}

} //LinkEndCreationDataImpl

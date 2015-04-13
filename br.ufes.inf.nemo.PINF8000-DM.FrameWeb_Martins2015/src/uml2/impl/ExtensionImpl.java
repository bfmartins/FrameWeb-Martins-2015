/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import uml2.Extension;
import uml2.Property;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ExtensionImpl#getIsRequired <em>Is Required</em>}</li>
 *   <li>{@link uml2.impl.ExtensionImpl#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends AssociationImpl implements Extension {
	/**
	 * The default value of the '{@link #getIsRequired() <em>Is Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_REQUIRED_EDEFAULT = Boolean.FALSE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsRequired() {
		// TODO: implement this method to return the 'Is Required' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2.Class getMetaclass() {
		uml2.Class metaclass = basicGetMetaclass();
		return metaclass != null && metaclass.eIsProxy() ? (uml2.Class)eResolveProxy((InternalEObject)metaclass) : metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2.Class basicGetMetaclass() {
		// TODO: implement this method to return the 'Metaclass' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonOwnedEnd(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.EXTENSION__NON_OWNED_END,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nonOwnedEnd", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean isBinary(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.EXTENSION__IS_BINARY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "isBinary", EObjectValidator.getObjectLabel(this, context) }),
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
	public Boolean isRequired() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2.Class metaclass() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property metaclassEnd() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.EXTENSION__IS_REQUIRED:
				return getIsRequired();
			case Uml2Package.EXTENSION__METACLASS:
				if (resolve) return getMetaclass();
				return basicGetMetaclass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Uml2Package.EXTENSION__IS_REQUIRED:
				return IS_REQUIRED_EDEFAULT == null ? getIsRequired() != null : !IS_REQUIRED_EDEFAULT.equals(getIsRequired());
			case Uml2Package.EXTENSION__METACLASS:
				return basicGetMetaclass() != null;
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
			case Uml2Package.EXTENSION___NON_OWNED_END__DIAGNOSTICCHAIN_MAP:
				return nonOwnedEnd((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.EXTENSION___IS_BINARY__DIAGNOSTICCHAIN_MAP:
				return isBinary((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.EXTENSION___IS_REQUIRED:
				return isRequired();
			case Uml2Package.EXTENSION___METACLASS:
				return metaclass();
			case Uml2Package.EXTENSION___METACLASS_END:
				return metaclassEnd();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ExtensionImpl

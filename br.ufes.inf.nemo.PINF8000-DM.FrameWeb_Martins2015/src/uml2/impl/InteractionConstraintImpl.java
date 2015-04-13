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

import uml2.InteractionConstraint;
import uml2.Uml2Package;
import uml2.ValueSpecification;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.InteractionConstraintImpl#getMaxint <em>Maxint</em>}</li>
 *   <li>{@link uml2.impl.InteractionConstraintImpl#getMinint <em>Minint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionConstraintImpl extends ConstraintImpl implements InteractionConstraint {
	/**
	 * The cached value of the '{@link #getMaxint() <em>Maxint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxint()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification maxint;

	/**
	 * The cached value of the '{@link #getMinint() <em>Minint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinint()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification minint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.INTERACTION_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMaxint() {
		return maxint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMaxint(ValueSpecification newMaxint, NotificationChain msgs) {
		ValueSpecification oldMaxint = maxint;
		maxint = newMaxint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.INTERACTION_CONSTRAINT__MAXINT, oldMaxint, newMaxint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxint(ValueSpecification newMaxint) {
		if (newMaxint != maxint) {
			NotificationChain msgs = null;
			if (maxint != null)
				msgs = ((InternalEObject)maxint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.INTERACTION_CONSTRAINT__MAXINT, null, msgs);
			if (newMaxint != null)
				msgs = ((InternalEObject)newMaxint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2Package.INTERACTION_CONSTRAINT__MAXINT, null, msgs);
			msgs = basicSetMaxint(newMaxint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.INTERACTION_CONSTRAINT__MAXINT, newMaxint, newMaxint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getMinint() {
		return minint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMinint(ValueSpecification newMinint, NotificationChain msgs) {
		ValueSpecification oldMinint = minint;
		minint = newMinint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.INTERACTION_CONSTRAINT__MININT, oldMinint, newMinint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinint(ValueSpecification newMinint) {
		if (newMinint != minint) {
			NotificationChain msgs = null;
			if (minint != null)
				msgs = ((InternalEObject)minint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.INTERACTION_CONSTRAINT__MININT, null, msgs);
			if (newMinint != null)
				msgs = ((InternalEObject)newMinint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2Package.INTERACTION_CONSTRAINT__MININT, null, msgs);
			msgs = basicSetMinint(newMinint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.INTERACTION_CONSTRAINT__MININT, newMinint, newMinint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean dynamicVariables(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.INTERACTION_CONSTRAINT__DYNAMIC_VARIABLES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "dynamicVariables", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean maxintPositive(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.INTERACTION_CONSTRAINT__MAXINT_POSITIVE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "maxintPositive", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean minintNonNegative(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.INTERACTION_CONSTRAINT__MININT_NON_NEGATIVE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "minintNonNegative", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean globalData(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.INTERACTION_CONSTRAINT__GLOBAL_DATA,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "globalData", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean minintMaxint(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.INTERACTION_CONSTRAINT__MININT_MAXINT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "minintMaxint", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean maxintGreaterEqualMinint(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.INTERACTION_CONSTRAINT__MAXINT_GREATER_EQUAL_MININT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "maxintGreaterEqualMinint", EObjectValidator.getObjectLabel(this, context) }),
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
			case Uml2Package.INTERACTION_CONSTRAINT__MAXINT:
				return basicSetMaxint(null, msgs);
			case Uml2Package.INTERACTION_CONSTRAINT__MININT:
				return basicSetMinint(null, msgs);
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
			case Uml2Package.INTERACTION_CONSTRAINT__MAXINT:
				return getMaxint();
			case Uml2Package.INTERACTION_CONSTRAINT__MININT:
				return getMinint();
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
			case Uml2Package.INTERACTION_CONSTRAINT__MAXINT:
				setMaxint((ValueSpecification)newValue);
				return;
			case Uml2Package.INTERACTION_CONSTRAINT__MININT:
				setMinint((ValueSpecification)newValue);
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
			case Uml2Package.INTERACTION_CONSTRAINT__MAXINT:
				setMaxint((ValueSpecification)null);
				return;
			case Uml2Package.INTERACTION_CONSTRAINT__MININT:
				setMinint((ValueSpecification)null);
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
			case Uml2Package.INTERACTION_CONSTRAINT__MAXINT:
				return maxint != null;
			case Uml2Package.INTERACTION_CONSTRAINT__MININT:
				return minint != null;
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
			case Uml2Package.INTERACTION_CONSTRAINT___DYNAMIC_VARIABLES__DIAGNOSTICCHAIN_MAP:
				return dynamicVariables((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.INTERACTION_CONSTRAINT___MAXINT_POSITIVE__DIAGNOSTICCHAIN_MAP:
				return maxintPositive((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.INTERACTION_CONSTRAINT___MININT_NON_NEGATIVE__DIAGNOSTICCHAIN_MAP:
				return minintNonNegative((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.INTERACTION_CONSTRAINT___GLOBAL_DATA__DIAGNOSTICCHAIN_MAP:
				return globalData((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.INTERACTION_CONSTRAINT___MININT_MAXINT__DIAGNOSTICCHAIN_MAP:
				return minintMaxint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.INTERACTION_CONSTRAINT___MAXINT_GREATER_EQUAL_MININT__DIAGNOSTICCHAIN_MAP:
				return maxintGreaterEqualMinint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InteractionConstraintImpl

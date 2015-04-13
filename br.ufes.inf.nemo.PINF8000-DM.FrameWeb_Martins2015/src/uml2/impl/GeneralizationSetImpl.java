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

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Classifier;
import uml2.Generalization;
import uml2.GeneralizationSet;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.GeneralizationSetImpl#getIsCovering <em>Is Covering</em>}</li>
 *   <li>{@link uml2.impl.GeneralizationSetImpl#getIsDisjoint <em>Is Disjoint</em>}</li>
 *   <li>{@link uml2.impl.GeneralizationSetImpl#getPowertype <em>Powertype</em>}</li>
 *   <li>{@link uml2.impl.GeneralizationSetImpl#getGeneralization <em>Generalization</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizationSetImpl extends PackageableElementImpl implements GeneralizationSet {
	/**
	 * The default value of the '{@link #getIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCovering()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_COVERING_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsCovering() <em>Is Covering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCovering()
	 * @generated
	 * @ordered
	 */
	protected Boolean isCovering = IS_COVERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_DISJOINT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsDisjoint() <em>Is Disjoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsDisjoint()
	 * @generated
	 * @ordered
	 */
	protected Boolean isDisjoint = IS_DISJOINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowertype() <em>Powertype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertype()
	 * @generated
	 * @ordered
	 */
	protected Classifier powertype;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.GENERALIZATION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsCovering() {
		return isCovering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCovering(Boolean newIsCovering) {
		Boolean oldIsCovering = isCovering;
		isCovering = newIsCovering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.GENERALIZATION_SET__IS_COVERING, oldIsCovering, isCovering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsDisjoint() {
		return isDisjoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDisjoint(Boolean newIsDisjoint) {
		Boolean oldIsDisjoint = isDisjoint;
		isDisjoint = newIsDisjoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.GENERALIZATION_SET__IS_DISJOINT, oldIsDisjoint, isDisjoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getPowertype() {
		if (powertype != null && powertype.eIsProxy()) {
			InternalEObject oldPowertype = (InternalEObject)powertype;
			powertype = (Classifier)eResolveProxy(oldPowertype);
			if (powertype != oldPowertype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.GENERALIZATION_SET__POWERTYPE, oldPowertype, powertype));
			}
		}
		return powertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetPowertype() {
		return powertype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowertype(Classifier newPowertype, NotificationChain msgs) {
		Classifier oldPowertype = powertype;
		powertype = newPowertype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.GENERALIZATION_SET__POWERTYPE, oldPowertype, newPowertype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowertype(Classifier newPowertype) {
		if (newPowertype != powertype) {
			NotificationChain msgs = null;
			if (powertype != null)
				msgs = ((InternalEObject)powertype).eInverseRemove(this, Uml2Package.CLASSIFIER__POWERTYPE_EXTENT, Classifier.class, msgs);
			if (newPowertype != null)
				msgs = ((InternalEObject)newPowertype).eInverseAdd(this, Uml2Package.CLASSIFIER__POWERTYPE_EXTENT, Classifier.class, msgs);
			msgs = basicSetPowertype(newPowertype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.GENERALIZATION_SET__POWERTYPE, newPowertype, newPowertype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectWithInverseResolvingEList.ManyInverse<Generalization>(Generalization.class, this, Uml2Package.GENERALIZATION_SET__GENERALIZATION, Uml2Package.GENERALIZATION__GENERALIZATION_SET);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean mapsToGeneralizationSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.GENERALIZATION_SET__MAPS_TO_GENERALIZATION_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "mapsToGeneralizationSet", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean generalizationSameClassifier(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.GENERALIZATION_SET__GENERALIZATION_SAME_CLASSIFIER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "generalizationSameClassifier", EObjectValidator.getObjectLabel(this, context) }),
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.GENERALIZATION_SET__POWERTYPE:
				if (powertype != null)
					msgs = ((InternalEObject)powertype).eInverseRemove(this, Uml2Package.CLASSIFIER__POWERTYPE_EXTENT, Classifier.class, msgs);
				return basicSetPowertype((Classifier)otherEnd, msgs);
			case Uml2Package.GENERALIZATION_SET__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.GENERALIZATION_SET__POWERTYPE:
				return basicSetPowertype(null, msgs);
			case Uml2Package.GENERALIZATION_SET__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
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
			case Uml2Package.GENERALIZATION_SET__IS_COVERING:
				return getIsCovering();
			case Uml2Package.GENERALIZATION_SET__IS_DISJOINT:
				return getIsDisjoint();
			case Uml2Package.GENERALIZATION_SET__POWERTYPE:
				if (resolve) return getPowertype();
				return basicGetPowertype();
			case Uml2Package.GENERALIZATION_SET__GENERALIZATION:
				return getGeneralization();
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
			case Uml2Package.GENERALIZATION_SET__IS_COVERING:
				setIsCovering((Boolean)newValue);
				return;
			case Uml2Package.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint((Boolean)newValue);
				return;
			case Uml2Package.GENERALIZATION_SET__POWERTYPE:
				setPowertype((Classifier)newValue);
				return;
			case Uml2Package.GENERALIZATION_SET__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
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
			case Uml2Package.GENERALIZATION_SET__IS_COVERING:
				setIsCovering(IS_COVERING_EDEFAULT);
				return;
			case Uml2Package.GENERALIZATION_SET__IS_DISJOINT:
				setIsDisjoint(IS_DISJOINT_EDEFAULT);
				return;
			case Uml2Package.GENERALIZATION_SET__POWERTYPE:
				setPowertype((Classifier)null);
				return;
			case Uml2Package.GENERALIZATION_SET__GENERALIZATION:
				getGeneralization().clear();
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
			case Uml2Package.GENERALIZATION_SET__IS_COVERING:
				return IS_COVERING_EDEFAULT == null ? isCovering != null : !IS_COVERING_EDEFAULT.equals(isCovering);
			case Uml2Package.GENERALIZATION_SET__IS_DISJOINT:
				return IS_DISJOINT_EDEFAULT == null ? isDisjoint != null : !IS_DISJOINT_EDEFAULT.equals(isDisjoint);
			case Uml2Package.GENERALIZATION_SET__POWERTYPE:
				return powertype != null;
			case Uml2Package.GENERALIZATION_SET__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
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
			case Uml2Package.GENERALIZATION_SET___MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP:
				return mapsToGeneralizationSet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.GENERALIZATION_SET___GENERALIZATION_SAME_CLASSIFIER__DIAGNOSTICCHAIN_MAP:
				return generalizationSameClassifier((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (isCovering: ");
		result.append(isCovering);
		result.append(", isDisjoint: ");
		result.append(isDisjoint);
		result.append(')');
		return result.toString();
	}

} //GeneralizationSetImpl

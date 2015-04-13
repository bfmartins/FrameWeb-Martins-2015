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
import org.eclipse.emf.ecore.util.EcoreUtil;

import uml2.Action;
import uml2.Activity;
import uml2.MultiplicityElement;
import uml2.StructuredActivityNode;
import uml2.Uml2Package;
import uml2.ValueSpecification;
import uml2.Variable;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.VariableImpl#getIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link uml2.impl.VariableImpl#getIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link uml2.impl.VariableImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link uml2.impl.VariableImpl#getLowerValue <em>Lower Value</em>}</li>
 *   <li>{@link uml2.impl.VariableImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link uml2.impl.VariableImpl#getUpperValue <em>Upper Value</em>}</li>
 *   <li>{@link uml2.impl.VariableImpl#getActivityScope <em>Activity Scope</em>}</li>
 *   <li>{@link uml2.impl.VariableImpl#getScope <em>Scope</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends ConnectableElementImpl implements Variable {
	/**
	 * The default value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ORDERED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsOrdered()
	 * @generated
	 * @ordered
	 */
	protected Boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_UNIQUE_EDEFAULT = Boolean.TRUE;

	/**
	 * The cached value of the '{@link #getIsUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsUnique()
	 * @generated
	 * @ordered
	 */
	protected Boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLower() <em>Lower</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOWER_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getLowerValue() <em>Lower Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLowerValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification lowerValue;

	/**
	 * The default value of the '{@link #getUpper() <em>Upper</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UPPER_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getUpperValue() <em>Upper Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperValue()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification upperValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOrdered(Boolean newIsOrdered) {
		Boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.VARIABLE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUnique(Boolean newIsUnique) {
		Boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.VARIABLE__IS_UNIQUE, oldIsUnique, isUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLower() {
		// TODO: implement this method to return the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Integer newLower) {
		// TODO: implement this method to set the 'Lower' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getLowerValue() {
		return lowerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLowerValue(ValueSpecification newLowerValue, NotificationChain msgs) {
		ValueSpecification oldLowerValue = lowerValue;
		lowerValue = newLowerValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.VARIABLE__LOWER_VALUE, oldLowerValue, newLowerValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLowerValue(ValueSpecification newLowerValue) {
		if (newLowerValue != lowerValue) {
			NotificationChain msgs = null;
			if (lowerValue != null)
				msgs = ((InternalEObject)lowerValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.VARIABLE__LOWER_VALUE, null, msgs);
			if (newLowerValue != null)
				msgs = ((InternalEObject)newLowerValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2Package.VARIABLE__LOWER_VALUE, null, msgs);
			msgs = basicSetLowerValue(newLowerValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.VARIABLE__LOWER_VALUE, newLowerValue, newLowerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUpper() {
		// TODO: implement this method to return the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Integer newUpper) {
		// TODO: implement this method to set the 'Upper' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getUpperValue() {
		return upperValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpperValue(ValueSpecification newUpperValue, NotificationChain msgs) {
		ValueSpecification oldUpperValue = upperValue;
		upperValue = newUpperValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.VARIABLE__UPPER_VALUE, oldUpperValue, newUpperValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpperValue(ValueSpecification newUpperValue) {
		if (newUpperValue != upperValue) {
			NotificationChain msgs = null;
			if (upperValue != null)
				msgs = ((InternalEObject)upperValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.VARIABLE__UPPER_VALUE, null, msgs);
			if (newUpperValue != null)
				msgs = ((InternalEObject)newUpperValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Uml2Package.VARIABLE__UPPER_VALUE, null, msgs);
			msgs = basicSetUpperValue(newUpperValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.VARIABLE__UPPER_VALUE, newUpperValue, newUpperValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getActivityScope() {
		if (eContainerFeatureID() != Uml2Package.VARIABLE__ACTIVITY_SCOPE) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivityScope(Activity newActivityScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newActivityScope, Uml2Package.VARIABLE__ACTIVITY_SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivityScope(Activity newActivityScope) {
		if (newActivityScope != eInternalContainer() || (eContainerFeatureID() != Uml2Package.VARIABLE__ACTIVITY_SCOPE && newActivityScope != null)) {
			if (EcoreUtil.isAncestor(this, newActivityScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newActivityScope != null)
				msgs = ((InternalEObject)newActivityScope).eInverseAdd(this, Uml2Package.ACTIVITY__VARIABLE, Activity.class, msgs);
			msgs = basicSetActivityScope(newActivityScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.VARIABLE__ACTIVITY_SCOPE, newActivityScope, newActivityScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getScope() {
		if (eContainerFeatureID() != Uml2Package.VARIABLE__SCOPE) return null;
		return (StructuredActivityNode)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScope(StructuredActivityNode newScope, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newScope, Uml2Package.VARIABLE__SCOPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(StructuredActivityNode newScope) {
		if (newScope != eInternalContainer() || (eContainerFeatureID() != Uml2Package.VARIABLE__SCOPE && newScope != null)) {
			if (EcoreUtil.isAncestor(this, newScope))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newScope != null)
				msgs = ((InternalEObject)newScope).eInverseAdd(this, Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE, StructuredActivityNode.class, msgs);
			msgs = basicSetScope(newScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.VARIABLE__SCOPE, newScope, newScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean owned(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.VARIABLE__OWNED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "owned", EObjectValidator.getObjectLabel(this, context) }),
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
	public Boolean isAccessibleBy(Action a) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean valueSpecificationConstant(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_CONSTANT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valueSpecificationConstant", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean lowerGe0(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.MULTIPLICITY_ELEMENT__LOWER_GE0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "lowerGe0", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean upperGeLower(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.MULTIPLICITY_ELEMENT__UPPER_GE_LOWER,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "upperGeLower", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean valueSpecificationNoSideEffects(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.MULTIPLICITY_ELEMENT__VALUE_SPECIFICATION_NO_SIDE_EFFECTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "valueSpecificationNoSideEffects", EObjectValidator.getObjectLabel(this, context) }),
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
	public Boolean compatibleWith(MultiplicityElement other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean includesCardinality(Integer c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean includesMultiplicity(MultiplicityElement m) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean is(Integer lowerbound, Integer upperbound) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isMultivalued() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer lower() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer lowerBound() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer upper() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer upperBound() {
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.VARIABLE__ACTIVITY_SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetActivityScope((Activity)otherEnd, msgs);
			case Uml2Package.VARIABLE__SCOPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetScope((StructuredActivityNode)otherEnd, msgs);
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
			case Uml2Package.VARIABLE__LOWER_VALUE:
				return basicSetLowerValue(null, msgs);
			case Uml2Package.VARIABLE__UPPER_VALUE:
				return basicSetUpperValue(null, msgs);
			case Uml2Package.VARIABLE__ACTIVITY_SCOPE:
				return basicSetActivityScope(null, msgs);
			case Uml2Package.VARIABLE__SCOPE:
				return basicSetScope(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Uml2Package.VARIABLE__ACTIVITY_SCOPE:
				return eInternalContainer().eInverseRemove(this, Uml2Package.ACTIVITY__VARIABLE, Activity.class, msgs);
			case Uml2Package.VARIABLE__SCOPE:
				return eInternalContainer().eInverseRemove(this, Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE, StructuredActivityNode.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.VARIABLE__IS_ORDERED:
				return getIsOrdered();
			case Uml2Package.VARIABLE__IS_UNIQUE:
				return getIsUnique();
			case Uml2Package.VARIABLE__LOWER:
				return getLower();
			case Uml2Package.VARIABLE__LOWER_VALUE:
				return getLowerValue();
			case Uml2Package.VARIABLE__UPPER:
				return getUpper();
			case Uml2Package.VARIABLE__UPPER_VALUE:
				return getUpperValue();
			case Uml2Package.VARIABLE__ACTIVITY_SCOPE:
				return getActivityScope();
			case Uml2Package.VARIABLE__SCOPE:
				return getScope();
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
			case Uml2Package.VARIABLE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case Uml2Package.VARIABLE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case Uml2Package.VARIABLE__LOWER:
				setLower((Integer)newValue);
				return;
			case Uml2Package.VARIABLE__LOWER_VALUE:
				setLowerValue((ValueSpecification)newValue);
				return;
			case Uml2Package.VARIABLE__UPPER:
				setUpper((Integer)newValue);
				return;
			case Uml2Package.VARIABLE__UPPER_VALUE:
				setUpperValue((ValueSpecification)newValue);
				return;
			case Uml2Package.VARIABLE__ACTIVITY_SCOPE:
				setActivityScope((Activity)newValue);
				return;
			case Uml2Package.VARIABLE__SCOPE:
				setScope((StructuredActivityNode)newValue);
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
			case Uml2Package.VARIABLE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case Uml2Package.VARIABLE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case Uml2Package.VARIABLE__LOWER:
				setLower(LOWER_EDEFAULT);
				return;
			case Uml2Package.VARIABLE__LOWER_VALUE:
				setLowerValue((ValueSpecification)null);
				return;
			case Uml2Package.VARIABLE__UPPER:
				setUpper(UPPER_EDEFAULT);
				return;
			case Uml2Package.VARIABLE__UPPER_VALUE:
				setUpperValue((ValueSpecification)null);
				return;
			case Uml2Package.VARIABLE__ACTIVITY_SCOPE:
				setActivityScope((Activity)null);
				return;
			case Uml2Package.VARIABLE__SCOPE:
				setScope((StructuredActivityNode)null);
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
			case Uml2Package.VARIABLE__IS_ORDERED:
				return IS_ORDERED_EDEFAULT == null ? isOrdered != null : !IS_ORDERED_EDEFAULT.equals(isOrdered);
			case Uml2Package.VARIABLE__IS_UNIQUE:
				return IS_UNIQUE_EDEFAULT == null ? isUnique != null : !IS_UNIQUE_EDEFAULT.equals(isUnique);
			case Uml2Package.VARIABLE__LOWER:
				return LOWER_EDEFAULT == null ? getLower() != null : !LOWER_EDEFAULT.equals(getLower());
			case Uml2Package.VARIABLE__LOWER_VALUE:
				return lowerValue != null;
			case Uml2Package.VARIABLE__UPPER:
				return UPPER_EDEFAULT == null ? getUpper() != null : !UPPER_EDEFAULT.equals(getUpper());
			case Uml2Package.VARIABLE__UPPER_VALUE:
				return upperValue != null;
			case Uml2Package.VARIABLE__ACTIVITY_SCOPE:
				return getActivityScope() != null;
			case Uml2Package.VARIABLE__SCOPE:
				return getScope() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.VARIABLE__IS_ORDERED: return Uml2Package.MULTIPLICITY_ELEMENT__IS_ORDERED;
				case Uml2Package.VARIABLE__IS_UNIQUE: return Uml2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE;
				case Uml2Package.VARIABLE__LOWER: return Uml2Package.MULTIPLICITY_ELEMENT__LOWER;
				case Uml2Package.VARIABLE__LOWER_VALUE: return Uml2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE;
				case Uml2Package.VARIABLE__UPPER: return Uml2Package.MULTIPLICITY_ELEMENT__UPPER;
				case Uml2Package.VARIABLE__UPPER_VALUE: return Uml2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.MULTIPLICITY_ELEMENT__IS_ORDERED: return Uml2Package.VARIABLE__IS_ORDERED;
				case Uml2Package.MULTIPLICITY_ELEMENT__IS_UNIQUE: return Uml2Package.VARIABLE__IS_UNIQUE;
				case Uml2Package.MULTIPLICITY_ELEMENT__LOWER: return Uml2Package.VARIABLE__LOWER;
				case Uml2Package.MULTIPLICITY_ELEMENT__LOWER_VALUE: return Uml2Package.VARIABLE__LOWER_VALUE;
				case Uml2Package.MULTIPLICITY_ELEMENT__UPPER: return Uml2Package.VARIABLE__UPPER;
				case Uml2Package.MULTIPLICITY_ELEMENT__UPPER_VALUE: return Uml2Package.VARIABLE__UPPER_VALUE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == MultiplicityElement.class) {
			switch (baseOperationID) {
				case Uml2Package.MULTIPLICITY_ELEMENT___VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP: return Uml2Package.VARIABLE___VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.MULTIPLICITY_ELEMENT___LOWER_GE0__DIAGNOSTICCHAIN_MAP: return Uml2Package.VARIABLE___LOWER_GE0__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.MULTIPLICITY_ELEMENT___UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP: return Uml2Package.VARIABLE___UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.MULTIPLICITY_ELEMENT___VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP: return Uml2Package.VARIABLE___VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.MULTIPLICITY_ELEMENT___COMPATIBLE_WITH__MULTIPLICITYELEMENT: return Uml2Package.VARIABLE___COMPATIBLE_WITH__MULTIPLICITYELEMENT;
				case Uml2Package.MULTIPLICITY_ELEMENT___INCLUDES_CARDINALITY__INTEGER: return Uml2Package.VARIABLE___INCLUDES_CARDINALITY__INTEGER;
				case Uml2Package.MULTIPLICITY_ELEMENT___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT: return Uml2Package.VARIABLE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT;
				case Uml2Package.MULTIPLICITY_ELEMENT___IS__INTEGER_INTEGER: return Uml2Package.VARIABLE___IS__INTEGER_INTEGER;
				case Uml2Package.MULTIPLICITY_ELEMENT___IS_MULTIVALUED: return Uml2Package.VARIABLE___IS_MULTIVALUED;
				case Uml2Package.MULTIPLICITY_ELEMENT___LOWER: return Uml2Package.VARIABLE___LOWER;
				case Uml2Package.MULTIPLICITY_ELEMENT___LOWER_BOUND: return Uml2Package.VARIABLE___LOWER_BOUND;
				case Uml2Package.MULTIPLICITY_ELEMENT___UPPER: return Uml2Package.VARIABLE___UPPER;
				case Uml2Package.MULTIPLICITY_ELEMENT___UPPER_BOUND: return Uml2Package.VARIABLE___UPPER_BOUND;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case Uml2Package.VARIABLE___OWNED__DIAGNOSTICCHAIN_MAP:
				return owned((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.VARIABLE___IS_ACCESSIBLE_BY__ACTION:
				return isAccessibleBy((Action)arguments.get(0));
			case Uml2Package.VARIABLE___VALUE_SPECIFICATION_CONSTANT__DIAGNOSTICCHAIN_MAP:
				return valueSpecificationConstant((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.VARIABLE___LOWER_GE0__DIAGNOSTICCHAIN_MAP:
				return lowerGe0((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.VARIABLE___UPPER_GE_LOWER__DIAGNOSTICCHAIN_MAP:
				return upperGeLower((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.VARIABLE___VALUE_SPECIFICATION_NO_SIDE_EFFECTS__DIAGNOSTICCHAIN_MAP:
				return valueSpecificationNoSideEffects((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.VARIABLE___COMPATIBLE_WITH__MULTIPLICITYELEMENT:
				return compatibleWith((MultiplicityElement)arguments.get(0));
			case Uml2Package.VARIABLE___INCLUDES_CARDINALITY__INTEGER:
				return includesCardinality((Integer)arguments.get(0));
			case Uml2Package.VARIABLE___INCLUDES_MULTIPLICITY__MULTIPLICITYELEMENT:
				return includesMultiplicity((MultiplicityElement)arguments.get(0));
			case Uml2Package.VARIABLE___IS__INTEGER_INTEGER:
				return is((Integer)arguments.get(0), (Integer)arguments.get(1));
			case Uml2Package.VARIABLE___IS_MULTIVALUED:
				return isMultivalued();
			case Uml2Package.VARIABLE___LOWER:
				return lower();
			case Uml2Package.VARIABLE___LOWER_BOUND:
				return lowerBound();
			case Uml2Package.VARIABLE___UPPER:
				return upper();
			case Uml2Package.VARIABLE___UPPER_BOUND:
				return upperBound();
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
		result.append(" (isOrdered: ");
		result.append(isOrdered);
		result.append(", isUnique: ");
		result.append(isUnique);
		result.append(')');
		return result.toString();
	}

} //VariableImpl

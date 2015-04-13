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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.ParameterableElement;
import uml2.StringExpression;
import uml2.TemplateBinding;
import uml2.TemplateSignature;
import uml2.TemplateableElement;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.StringExpressionImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml2.impl.StringExpressionImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml2.impl.StringExpressionImpl#getOwningExpression <em>Owning Expression</em>}</li>
 *   <li>{@link uml2.impl.StringExpressionImpl#getSubExpression <em>Sub Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StringExpressionImpl extends ExpressionImpl implements StringExpression {
	/**
	 * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBinding;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getSubExpression() <em>Sub Expression</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubExpression()
	 * @generated
	 * @ordered
	 */
	protected EList<StringExpression> subExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.STRING_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING, Uml2Package.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, Uml2Package.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, Uml2Package.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringExpression getOwningExpression() {
		if (eContainerFeatureID() != Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION) return null;
		return (StringExpression)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningExpression(StringExpression newOwningExpression, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningExpression, Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningExpression(StringExpression newOwningExpression) {
		if (newOwningExpression != eInternalContainer() || (eContainerFeatureID() != Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION && newOwningExpression != null)) {
			if (EcoreUtil.isAncestor(this, newOwningExpression))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningExpression != null)
				msgs = ((InternalEObject)newOwningExpression).eInverseAdd(this, Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION, StringExpression.class, msgs);
			msgs = basicSetOwningExpression(newOwningExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION, newOwningExpression, newOwningExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StringExpression> getSubExpression() {
		if (subExpression == null) {
			subExpression = new EObjectContainmentWithInverseEList<StringExpression>(StringExpression.class, this, Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION, Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION);
		}
		return subExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean subexpressions(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.STRING_EXPRESSION__SUBEXPRESSIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "subexpressions", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean operands(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.STRING_EXPRESSION__OPERANDS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "operands", EObjectValidator.getObjectLabel(this, context) }),
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
	public Boolean isTemplate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> parameterableElements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningExpression((StringExpression)otherEnd, msgs);
			case Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubExpression()).basicAdd(otherEnd, msgs);
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
			case Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				return basicSetOwningExpression(null, msgs);
			case Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				return ((InternalEList<?>)getSubExpression()).basicRemove(otherEnd, msgs);
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
			case Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				return eInternalContainer().eInverseRemove(this, Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION, StringExpression.class, msgs);
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
			case Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				return getTemplateBinding();
			case Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression();
			case Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				return getSubExpression();
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
			case Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((StringExpression)newValue);
				return;
			case Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpression().clear();
				getSubExpression().addAll((Collection<? extends StringExpression>)newValue);
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
			case Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				setOwningExpression((StringExpression)null);
				return;
			case Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				getSubExpression().clear();
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
			case Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case Uml2Package.STRING_EXPRESSION__OWNING_EXPRESSION:
				return getOwningExpression() != null;
			case Uml2Package.STRING_EXPRESSION__SUB_EXPRESSION:
				return subExpression != null && !subExpression.isEmpty();
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
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING: return Uml2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE: return Uml2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return Uml2Package.STRING_EXPRESSION__TEMPLATE_BINDING;
				case Uml2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return Uml2Package.STRING_EXPRESSION__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case Uml2Package.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return Uml2Package.STRING_EXPRESSION___IS_TEMPLATE;
				case Uml2Package.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return Uml2Package.STRING_EXPRESSION___PARAMETERABLE_ELEMENTS;
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
			case Uml2Package.STRING_EXPRESSION___SUBEXPRESSIONS__DIAGNOSTICCHAIN_MAP:
				return subexpressions((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRING_EXPRESSION___OPERANDS__DIAGNOSTICCHAIN_MAP:
				return operands((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRING_EXPRESSION___IS_TEMPLATE:
				return isTemplate();
			case Uml2Package.STRING_EXPRESSION___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
		}
		return super.eInvoke(operationID, arguments);
	}

} //StringExpressionImpl

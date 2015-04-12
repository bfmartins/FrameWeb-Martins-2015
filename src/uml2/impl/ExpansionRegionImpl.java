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

import uml2.ExpansionKind;
import uml2.ExpansionNode;
import uml2.ExpansionRegion;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expansion Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ExpansionRegionImpl#getMode <em>Mode</em>}</li>
 *   <li>{@link uml2.impl.ExpansionRegionImpl#getOutputElement <em>Output Element</em>}</li>
 *   <li>{@link uml2.impl.ExpansionRegionImpl#getInputElement <em>Input Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpansionRegionImpl extends StructuredActivityNodeImpl implements ExpansionRegion {
	/**
	 * The default value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected static final ExpansionKind MODE_EDEFAULT = ExpansionKind.ITERATIVE;

	/**
	 * The cached value of the '{@link #getMode() <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMode()
	 * @generated
	 * @ordered
	 */
	protected ExpansionKind mode = MODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutputElement() <em>Output Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionNode> outputElement;

	/**
	 * The cached value of the '{@link #getInputElement() <em>Input Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ExpansionNode> inputElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpansionRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.EXPANSION_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpansionKind getMode() {
		return mode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMode(ExpansionKind newMode) {
		ExpansionKind oldMode = mode;
		mode = newMode == null ? MODE_EDEFAULT : newMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.EXPANSION_REGION__MODE, oldMode, mode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionNode> getOutputElement() {
		if (outputElement == null) {
			outputElement = new EObjectWithInverseResolvingEList<ExpansionNode>(ExpansionNode.class, this, Uml2Package.EXPANSION_REGION__OUTPUT_ELEMENT, Uml2Package.EXPANSION_NODE__REGION_AS_OUTPUT);
		}
		return outputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExpansionNode> getInputElement() {
		if (inputElement == null) {
			inputElement = new EObjectWithInverseResolvingEList<ExpansionNode>(ExpansionNode.class, this, Uml2Package.EXPANSION_REGION__INPUT_ELEMENT, Uml2Package.EXPANSION_NODE__REGION_AS_INPUT);
		}
		return inputElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean expansionNodes(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.EXPANSION_REGION__EXPANSION_NODES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "expansionNodes", EObjectValidator.getObjectLabel(this, context) }),
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
			case Uml2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutputElement()).basicAdd(otherEnd, msgs);
			case Uml2Package.EXPANSION_REGION__INPUT_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInputElement()).basicAdd(otherEnd, msgs);
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
			case Uml2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				return ((InternalEList<?>)getOutputElement()).basicRemove(otherEnd, msgs);
			case Uml2Package.EXPANSION_REGION__INPUT_ELEMENT:
				return ((InternalEList<?>)getInputElement()).basicRemove(otherEnd, msgs);
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
			case Uml2Package.EXPANSION_REGION__MODE:
				return getMode();
			case Uml2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				return getOutputElement();
			case Uml2Package.EXPANSION_REGION__INPUT_ELEMENT:
				return getInputElement();
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
			case Uml2Package.EXPANSION_REGION__MODE:
				setMode((ExpansionKind)newValue);
				return;
			case Uml2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				getOutputElement().clear();
				getOutputElement().addAll((Collection<? extends ExpansionNode>)newValue);
				return;
			case Uml2Package.EXPANSION_REGION__INPUT_ELEMENT:
				getInputElement().clear();
				getInputElement().addAll((Collection<? extends ExpansionNode>)newValue);
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
			case Uml2Package.EXPANSION_REGION__MODE:
				setMode(MODE_EDEFAULT);
				return;
			case Uml2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				getOutputElement().clear();
				return;
			case Uml2Package.EXPANSION_REGION__INPUT_ELEMENT:
				getInputElement().clear();
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
			case Uml2Package.EXPANSION_REGION__MODE:
				return mode != MODE_EDEFAULT;
			case Uml2Package.EXPANSION_REGION__OUTPUT_ELEMENT:
				return outputElement != null && !outputElement.isEmpty();
			case Uml2Package.EXPANSION_REGION__INPUT_ELEMENT:
				return inputElement != null && !inputElement.isEmpty();
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
			case Uml2Package.EXPANSION_REGION___EXPANSION_NODES__DIAGNOSTICCHAIN_MAP:
				return expansionNodes((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (mode: ");
		result.append(mode);
		result.append(')');
		return result.toString();
	}

} //ExpansionRegionImpl

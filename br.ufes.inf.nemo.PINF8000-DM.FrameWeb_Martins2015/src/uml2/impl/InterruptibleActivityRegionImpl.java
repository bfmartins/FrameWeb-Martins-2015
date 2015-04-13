/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.ActivityEdge;
import uml2.ActivityNode;
import uml2.InterruptibleActivityRegion;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interruptible Activity Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.InterruptibleActivityRegionImpl#getNode <em>Node</em>}</li>
 *   <li>{@link uml2.impl.InterruptibleActivityRegionImpl#getInterruptingEdge <em>Interrupting Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InterruptibleActivityRegionImpl extends ActivityGroupImpl implements InterruptibleActivityRegion {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * The cached value of the '{@link #getInterruptingEdge() <em>Interrupting Edge</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterruptingEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> interruptingEdge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterruptibleActivityRegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.INTERRUPTIBLE_ACTIVITY_REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectWithInverseResolvingEList.ManyInverse<ActivityNode>(ActivityNode.class, this, Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__NODE, Uml2Package.ACTIVITY_NODE__IN_INTERRUPTIBLE_REGION);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getInterruptingEdge() {
		if (interruptingEdge == null) {
			interruptingEdge = new EObjectWithInverseResolvingEList<ActivityEdge>(ActivityEdge.class, this, Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE, Uml2Package.ACTIVITY_EDGE__INTERRUPTS);
		}
		return interruptingEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean interruptingEdges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "interruptingEdges", EObjectValidator.getObjectLabel(this, context) }),
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
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterruptingEdge()).basicAdd(otherEnd, msgs);
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
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return ((InternalEList<?>)getInterruptingEdge()).basicRemove(otherEnd, msgs);
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
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return getNode();
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return getInterruptingEdge();
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
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
				getInterruptingEdge().addAll((Collection<? extends ActivityEdge>)newValue);
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
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				getNode().clear();
				return;
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				getInterruptingEdge().clear();
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
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__NODE:
				return node != null && !node.isEmpty();
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION__INTERRUPTING_EDGE:
				return interruptingEdge != null && !interruptingEdge.isEmpty();
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
			case Uml2Package.INTERRUPTIBLE_ACTIVITY_REGION___INTERRUPTING_EDGES__DIAGNOSTICCHAIN_MAP:
				return interruptingEdges((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InterruptibleActivityRegionImpl

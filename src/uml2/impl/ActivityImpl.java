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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Activity;
import uml2.ActivityEdge;
import uml2.ActivityGroup;
import uml2.ActivityNode;
import uml2.ActivityPartition;
import uml2.StructuredActivityNode;
import uml2.Uml2Package;
import uml2.Variable;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ActivityImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link uml2.impl.ActivityImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link uml2.impl.ActivityImpl#getStructuredNode <em>Structured Node</em>}</li>
 *   <li>{@link uml2.impl.ActivityImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml2.impl.ActivityImpl#getIsReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link uml2.impl.ActivityImpl#getIsSingleExecution <em>Is Single Execution</em>}</li>
 *   <li>{@link uml2.impl.ActivityImpl#getPartition <em>Partition</em>}</li>
 *   <li>{@link uml2.impl.ActivityImpl#getNode <em>Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActivityImpl extends BehaviorImpl implements Activity {
	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> group;

	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variable;

	/**
	 * The default value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_READ_ONLY_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean isReadOnly = IS_READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SINGLE_EXECUTION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsSingleExecution() <em>Is Single Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSingleExecution()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSingleExecution = IS_SINGLE_EXECUTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartition() <em>Partition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartition()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityPartition> partition;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, Uml2Package.ACTIVITY__EDGE, Uml2Package.ACTIVITY_EDGE__ACTIVITY);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentWithInverseEList<ActivityGroup>(ActivityGroup.class, this, Uml2Package.ACTIVITY__GROUP, Uml2Package.ACTIVITY_GROUP__IN_ACTIVITY);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredActivityNode> getStructuredNode() {
		// TODO: implement this method to return the 'Structured Node' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, Uml2Package.ACTIVITY__VARIABLE, Uml2Package.VARIABLE__ACTIVITY_SCOPE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsReadOnly(Boolean newIsReadOnly) {
		Boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.ACTIVITY__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSingleExecution() {
		return isSingleExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSingleExecution(Boolean newIsSingleExecution) {
		Boolean oldIsSingleExecution = isSingleExecution;
		isSingleExecution = newIsSingleExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.ACTIVITY__IS_SINGLE_EXECUTION, oldIsSingleExecution, isSingleExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityPartition> getPartition() {
		if (partition == null) {
			partition = new EObjectResolvingEList<ActivityPartition>(ActivityPartition.class, this, Uml2Package.ACTIVITY__PARTITION);
		}
		return partition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, Uml2Package.ACTIVITY__NODE, Uml2Package.ACTIVITY_NODE__ACTIVITY);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean autonomous(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.ACTIVITY__AUTONOMOUS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "autonomous", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean noSupergroups(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.ACTIVITY__NO_SUPERGROUPS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "noSupergroups", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean activityParameterNode(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.ACTIVITY__ACTIVITY_PARAMETER_NODE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "activityParameterNode", EObjectValidator.getObjectLabel(this, context) }),
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
	public EList<StructuredActivityNode> structuredNode() {
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
			case Uml2Package.ACTIVITY__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
			case Uml2Package.ACTIVITY__GROUP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGroup()).basicAdd(otherEnd, msgs);
			case Uml2Package.ACTIVITY__VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
			case Uml2Package.ACTIVITY__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
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
			case Uml2Package.ACTIVITY__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case Uml2Package.ACTIVITY__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Uml2Package.ACTIVITY__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case Uml2Package.ACTIVITY__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
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
			case Uml2Package.ACTIVITY__EDGE:
				return getEdge();
			case Uml2Package.ACTIVITY__GROUP:
				return getGroup();
			case Uml2Package.ACTIVITY__STRUCTURED_NODE:
				return getStructuredNode();
			case Uml2Package.ACTIVITY__VARIABLE:
				return getVariable();
			case Uml2Package.ACTIVITY__IS_READ_ONLY:
				return getIsReadOnly();
			case Uml2Package.ACTIVITY__IS_SINGLE_EXECUTION:
				return getIsSingleExecution();
			case Uml2Package.ACTIVITY__PARTITION:
				return getPartition();
			case Uml2Package.ACTIVITY__NODE:
				return getNode();
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
			case Uml2Package.ACTIVITY__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case Uml2Package.ACTIVITY__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends ActivityGroup>)newValue);
				return;
			case Uml2Package.ACTIVITY__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case Uml2Package.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case Uml2Package.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution((Boolean)newValue);
				return;
			case Uml2Package.ACTIVITY__PARTITION:
				getPartition().clear();
				getPartition().addAll((Collection<? extends ActivityPartition>)newValue);
				return;
			case Uml2Package.ACTIVITY__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
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
			case Uml2Package.ACTIVITY__EDGE:
				getEdge().clear();
				return;
			case Uml2Package.ACTIVITY__GROUP:
				getGroup().clear();
				return;
			case Uml2Package.ACTIVITY__VARIABLE:
				getVariable().clear();
				return;
			case Uml2Package.ACTIVITY__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case Uml2Package.ACTIVITY__IS_SINGLE_EXECUTION:
				setIsSingleExecution(IS_SINGLE_EXECUTION_EDEFAULT);
				return;
			case Uml2Package.ACTIVITY__PARTITION:
				getPartition().clear();
				return;
			case Uml2Package.ACTIVITY__NODE:
				getNode().clear();
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
			case Uml2Package.ACTIVITY__EDGE:
				return edge != null && !edge.isEmpty();
			case Uml2Package.ACTIVITY__GROUP:
				return group != null && !group.isEmpty();
			case Uml2Package.ACTIVITY__STRUCTURED_NODE:
				return !getStructuredNode().isEmpty();
			case Uml2Package.ACTIVITY__VARIABLE:
				return variable != null && !variable.isEmpty();
			case Uml2Package.ACTIVITY__IS_READ_ONLY:
				return IS_READ_ONLY_EDEFAULT == null ? isReadOnly != null : !IS_READ_ONLY_EDEFAULT.equals(isReadOnly);
			case Uml2Package.ACTIVITY__IS_SINGLE_EXECUTION:
				return IS_SINGLE_EXECUTION_EDEFAULT == null ? isSingleExecution != null : !IS_SINGLE_EXECUTION_EDEFAULT.equals(isSingleExecution);
			case Uml2Package.ACTIVITY__PARTITION:
				return partition != null && !partition.isEmpty();
			case Uml2Package.ACTIVITY__NODE:
				return node != null && !node.isEmpty();
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
			case Uml2Package.ACTIVITY___AUTONOMOUS__DIAGNOSTICCHAIN_MAP:
				return autonomous((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.ACTIVITY___NO_SUPERGROUPS__DIAGNOSTICCHAIN_MAP:
				return noSupergroups((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.ACTIVITY___ACTIVITY_PARAMETER_NODE__DIAGNOSTICCHAIN_MAP:
				return activityParameterNode((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.ACTIVITY___STRUCTURED_NODE:
				return structuredNode();
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
		result.append(" (isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isSingleExecution: ");
		result.append(isSingleExecution);
		result.append(')');
		return result.toString();
	}

} //ActivityImpl

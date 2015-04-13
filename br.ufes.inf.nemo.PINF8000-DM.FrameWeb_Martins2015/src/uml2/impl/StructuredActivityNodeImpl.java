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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Activity;
import uml2.ActivityEdge;
import uml2.ActivityGroup;
import uml2.ActivityNode;
import uml2.Constraint;
import uml2.ElementImport;
import uml2.InputPin;
import uml2.NamedElement;
import uml2.Namespace;
import uml2.OutputPin;
import uml2.PackageImport;
import uml2.PackageableElement;
import uml2.StructuredActivityNode;
import uml2.Uml2Package;
import uml2.Variable;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getElementImport <em>Element Import</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getImportedMember <em>Imported Member</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getMember <em>Member</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getOwnedRule <em>Owned Rule</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getPackageImport <em>Package Import</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getInActivity <em>In Activity</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getSuperGroup <em>Super Group</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getContainedEdge <em>Contained Edge</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link uml2.impl.StructuredActivityNodeImpl#getEdge <em>Edge</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ActionImpl implements StructuredActivityNode {
	/**
	 * The cached value of the '{@link #getElementImport() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImport()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImport;

	/**
	 * The cached value of the '{@link #getOwnedRule() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRule()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRule;

	/**
	 * The cached value of the '{@link #getPackageImport() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImport()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImport;

	/**
	 * The default value of the '{@link #getMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MUST_ISOLATE_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected Boolean mustIsolate = MUST_ISOLATE_EDEFAULT;

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
	 * The cached value of the '{@link #getStructuredNodeInput() <em>Structured Node Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> structuredNodeInput;

	/**
	 * The cached value of the '{@link #getStructuredNodeOutput() <em>Structured Node Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> structuredNodeOutput;

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
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.STRUCTURED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImport() {
		if (elementImport == null) {
			elementImport = new EObjectContainmentWithInverseEList<ElementImport>(ElementImport.class, this, Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT, Uml2Package.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedMember() {
		// TODO: implement this method to return the 'Imported Member' reference list
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
	public EList<NamedElement> getMember() {
		// TODO: implement this method to return the 'Member' reference list
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
	public EList<NamedElement> getOwnedMember() {
		// TODO: implement this method to return the 'Owned Member' reference list
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
	public EList<Constraint> getOwnedRule() {
		if (ownedRule == null) {
			ownedRule = new EObjectContainmentWithInverseEList<Constraint>(Constraint.class, this, Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE, Uml2Package.CONSTRAINT__CONTEXT);
		}
		return ownedRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImport() {
		if (packageImport == null) {
			packageImport = new EObjectContainmentWithInverseEList<PackageImport>(PackageImport.class, this, Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT, Uml2Package.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getContainedNode() {
		// TODO: implement this method to return the 'Contained Node' reference list
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
	public Activity getInActivity() {
		if (eContainerFeatureID() != Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY) return null;
		return (Activity)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInActivity(Activity newInActivity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInActivity, Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInActivity(Activity newInActivity) {
		if (newInActivity != eInternalContainer() || (eContainerFeatureID() != Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY && newInActivity != null)) {
			if (EcoreUtil.isAncestor(this, newInActivity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInActivity != null)
				msgs = ((InternalEObject)newInActivity).eInverseAdd(this, Uml2Package.ACTIVITY__GROUP, Activity.class, msgs);
			msgs = basicSetInActivity(newInActivity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY, newInActivity, newInActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityGroup> getSubgroup() {
		// TODO: implement this method to return the 'Subgroup' reference list
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
	public ActivityGroup getSuperGroup() {
		ActivityGroup superGroup = basicGetSuperGroup();
		return superGroup != null && superGroup.eIsProxy() ? (ActivityGroup)eResolveProxy((InternalEObject)superGroup) : superGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetSuperGroup() {
		// TODO: implement this method to return the 'Super Group' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getContainedEdge() {
		// TODO: implement this method to return the 'Contained Edge' reference list
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
	public Boolean getMustIsolate() {
		return mustIsolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(Boolean newMustIsolate) {
		Boolean oldMustIsolate = mustIsolate;
		mustIsolate = newMustIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, Uml2Package.STRUCTURED_ACTIVITY_NODE__NODE, Uml2Package.ACTIVITY_NODE__IN_STRUCTURED_NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getStructuredNodeInput() {
		if (structuredNodeInput == null) {
			structuredNodeInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
		}
		return structuredNodeInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getStructuredNodeOutput() {
		if (structuredNodeOutput == null) {
			structuredNodeOutput = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
		}
		return structuredNodeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		if (variable == null) {
			variable = new EObjectContainmentWithInverseEList<Variable>(Variable.class, this, Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE, Uml2Package.VARIABLE__SCOPE);
		}
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, Uml2Package.STRUCTURED_ACTIVITY_NODE__EDGE, Uml2Package.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean outputPinEdges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.STRUCTURED_ACTIVITY_NODE__OUTPUT_PIN_EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "outputPinEdges", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean edges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.STRUCTURED_ACTIVITY_NODE__EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "edges", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean inputPinEdges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.STRUCTURED_ACTIVITY_NODE__INPUT_PIN_EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "inputPinEdges", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean groupOwned(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.ACTIVITY_GROUP__GROUP_OWNED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "groupOwned", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean nodesAndEdges(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.ACTIVITY_GROUP__NODES_AND_EDGES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nodesAndEdges", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean notContained(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.ACTIVITY_GROUP__NOT_CONTAINED,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "notContained", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean membersDistinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "membersDistinguishable", EObjectValidator.getObjectLabel(this, context) }),
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
	public EList<PackageableElement> excludeCollisions(EList<PackageableElement> imps) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNamesOfMember(NamedElement element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> importMembers(EList<PackageableElement> imps) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> importedMember() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean membersAreDistinguishable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> ownedMember() {
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImport()).basicAdd(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRule()).basicAdd(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImport()).basicAdd(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInActivity((Activity)otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getVariable()).basicAdd(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImport()).basicRemove(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRule()).basicRemove(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImport()).basicRemove(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return basicSetInActivity(null, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return ((InternalEList<?>)getStructuredNodeInput()).basicRemove(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return ((InternalEList<?>)getStructuredNodeOutput()).basicRemove(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return eInternalContainer().eInverseRemove(this, Uml2Package.ACTIVITY__GROUP, Activity.class, msgs);
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return getElementImport();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return getImportedMember();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return getMember();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER:
				return getOwnedMember();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return getOwnedRule();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return getPackageImport();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return getContainedNode();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return getInActivity();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return getSubgroup();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				if (resolve) return getSuperGroup();
				return basicGetSuperGroup();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return getContainedEdge();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return getMustIsolate();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__NODE:
				return getNode();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return getStructuredNodeInput();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return getStructuredNodeOutput();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return getVariable();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__EDGE:
				return getEdge();
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				getElementImport().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				getOwnedRule().addAll((Collection<? extends Constraint>)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				getPackageImport().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate((Boolean)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				getStructuredNodeInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				getStructuredNodeOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				getElementImport().clear();
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				getOwnedRule().clear();
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				getPackageImport().clear();
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				setInActivity((Activity)null);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				getVariable().clear();
				return;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT:
				return elementImport != null && !elementImport.isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER:
				return !getImportedMember().isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__MEMBER:
				return !getMember().isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE:
				return ownedRule != null && !ownedRule.isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT:
				return packageImport != null && !packageImport.isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE:
				return !getContainedNode().isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY:
				return getInActivity() != null;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__SUBGROUP:
				return !getSubgroup().isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP:
				return basicGetSuperGroup() != null;
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE:
				return !getContainedEdge().isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return MUST_ISOLATE_EDEFAULT == null ? mustIsolate != null : !MUST_ISOLATE_EDEFAULT.equals(mustIsolate);
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__NODE:
				return node != null && !node.isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return structuredNodeInput != null && !structuredNodeInput.isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return structuredNodeOutput != null && !structuredNodeOutput.isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__VARIABLE:
				return variable != null && !variable.isEmpty();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE__EDGE:
				return edge != null && !edge.isEmpty();
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
		if (baseClass == Namespace.class) {
			switch (derivedFeatureID) {
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT: return Uml2Package.NAMESPACE__ELEMENT_IMPORT;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER: return Uml2Package.NAMESPACE__IMPORTED_MEMBER;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__MEMBER: return Uml2Package.NAMESPACE__MEMBER;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER: return Uml2Package.NAMESPACE__OWNED_MEMBER;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE: return Uml2Package.NAMESPACE__OWNED_RULE;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT: return Uml2Package.NAMESPACE__PACKAGE_IMPORT;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (derivedFeatureID) {
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE: return Uml2Package.ACTIVITY_GROUP__CONTAINED_NODE;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY: return Uml2Package.ACTIVITY_GROUP__IN_ACTIVITY;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__SUBGROUP: return Uml2Package.ACTIVITY_GROUP__SUBGROUP;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP: return Uml2Package.ACTIVITY_GROUP__SUPER_GROUP;
				case Uml2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE: return Uml2Package.ACTIVITY_GROUP__CONTAINED_EDGE;
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
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case Uml2Package.NAMESPACE__ELEMENT_IMPORT: return Uml2Package.STRUCTURED_ACTIVITY_NODE__ELEMENT_IMPORT;
				case Uml2Package.NAMESPACE__IMPORTED_MEMBER: return Uml2Package.STRUCTURED_ACTIVITY_NODE__IMPORTED_MEMBER;
				case Uml2Package.NAMESPACE__MEMBER: return Uml2Package.STRUCTURED_ACTIVITY_NODE__MEMBER;
				case Uml2Package.NAMESPACE__OWNED_MEMBER: return Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_MEMBER;
				case Uml2Package.NAMESPACE__OWNED_RULE: return Uml2Package.STRUCTURED_ACTIVITY_NODE__OWNED_RULE;
				case Uml2Package.NAMESPACE__PACKAGE_IMPORT: return Uml2Package.STRUCTURED_ACTIVITY_NODE__PACKAGE_IMPORT;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseFeatureID) {
				case Uml2Package.ACTIVITY_GROUP__CONTAINED_NODE: return Uml2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_NODE;
				case Uml2Package.ACTIVITY_GROUP__IN_ACTIVITY: return Uml2Package.STRUCTURED_ACTIVITY_NODE__IN_ACTIVITY;
				case Uml2Package.ACTIVITY_GROUP__SUBGROUP: return Uml2Package.STRUCTURED_ACTIVITY_NODE__SUBGROUP;
				case Uml2Package.ACTIVITY_GROUP__SUPER_GROUP: return Uml2Package.STRUCTURED_ACTIVITY_NODE__SUPER_GROUP;
				case Uml2Package.ACTIVITY_GROUP__CONTAINED_EDGE: return Uml2Package.STRUCTURED_ACTIVITY_NODE__CONTAINED_EDGE;
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
		if (baseClass == Namespace.class) {
			switch (baseOperationID) {
				case Uml2Package.NAMESPACE___MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP: return Uml2Package.STRUCTURED_ACTIVITY_NODE___MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.NAMESPACE___EXCLUDE_COLLISIONS__ELIST: return Uml2Package.STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST;
				case Uml2Package.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT: return Uml2Package.STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;
				case Uml2Package.NAMESPACE___IMPORT_MEMBERS__ELIST: return Uml2Package.STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST;
				case Uml2Package.NAMESPACE___IMPORTED_MEMBER: return Uml2Package.STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER;
				case Uml2Package.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE: return Uml2Package.STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE;
				case Uml2Package.NAMESPACE___OWNED_MEMBER: return Uml2Package.STRUCTURED_ACTIVITY_NODE___OWNED_MEMBER;
				default: return -1;
			}
		}
		if (baseClass == ActivityGroup.class) {
			switch (baseOperationID) {
				case Uml2Package.ACTIVITY_GROUP___GROUP_OWNED__DIAGNOSTICCHAIN_MAP: return Uml2Package.STRUCTURED_ACTIVITY_NODE___GROUP_OWNED__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.ACTIVITY_GROUP___NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP: return Uml2Package.STRUCTURED_ACTIVITY_NODE___NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.ACTIVITY_GROUP___NOT_CONTAINED__DIAGNOSTICCHAIN_MAP: return Uml2Package.STRUCTURED_ACTIVITY_NODE___NOT_CONTAINED__DIAGNOSTICCHAIN_MAP;
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
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___OUTPUT_PIN_EDGES__DIAGNOSTICCHAIN_MAP:
				return outputPinEdges((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___EDGES__DIAGNOSTICCHAIN_MAP:
				return edges((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___INPUT_PIN_EDGES__DIAGNOSTICCHAIN_MAP:
				return inputPinEdges((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___GROUP_OWNED__DIAGNOSTICCHAIN_MAP:
				return groupOwned((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___NODES_AND_EDGES__DIAGNOSTICCHAIN_MAP:
				return nodesAndEdges((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___NOT_CONTAINED__DIAGNOSTICCHAIN_MAP:
				return notContained((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
				return membersDistinguishable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<PackageableElement>)arguments.get(0));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
				return getNamesOfMember((NamedElement)arguments.get(0));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___IMPORT_MEMBERS__ELIST:
				return importMembers((EList<PackageableElement>)arguments.get(0));
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___IMPORTED_MEMBER:
				return importedMember();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___MEMBERS_ARE_DISTINGUISHABLE:
				return membersAreDistinguishable();
			case Uml2Package.STRUCTURED_ACTIVITY_NODE___OWNED_MEMBER:
				return ownedMember();
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
		result.append(" (mustIsolate: ");
		result.append(mustIsolate);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl

/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.VocabularyClass;
import frameweb.VocabularyClassExpression;

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
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vocabulary Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getParts <em>Part</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getOwnedPorts <em>Owned Port</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link frameweb.impl.VocabularyClassImpl#getSuperClasses <em>Super Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VocabularyClassImpl extends VocabularyEntityImpl implements VocabularyClass {
	/**
	 * The cached value of the '{@link #getOwnedAttributes() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttributes;

	/**
	 * The cached value of the '{@link #getOwnedConnectors() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnectors()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnectors;

	/**
	 * The cached value of the '{@link #getClassifierBehavior() <em>Classifier Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierBehavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior classifierBehavior;

	/**
	 * The cached value of the '{@link #getInterfaceRealizations() <em>Interface Realization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceRealizations()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceRealization> interfaceRealizations;

	/**
	 * The cached value of the '{@link #getOwnedBehaviors() <em>Owned Behavior</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> ownedBehaviors;

	/**
	 * The cached value of the '{@link #getOwnedOperations() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperations()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperations;

	/**
	 * The default value of the '{@link #isActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNestedClassifiers() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> nestedClassifiers;

	/**
	 * The cached value of the '{@link #getOwnedReceptions() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReceptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Reception> ownedReceptions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VocabularyClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.VOCABULARY_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList.Resolving<Property>(Property.class, this, FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE);
		}
		return ownedAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnectors() {
		if (ownedConnectors == null) {
			ownedConnectors = new EObjectContainmentEList.Resolving<Connector>(Connector.class, this, FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR);
		}
		return ownedConnectors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getParts() {
		// TODO: implement this method to return the 'Part' reference list
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
	public EList<ConnectableElement> getRoles() {
		// TODO: implement this method to return the 'Role' reference list
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
	public EList<Port> getOwnedPorts() {
		// TODO: implement this method to return the 'Owned Port' reference list
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
	public Behavior getClassifierBehavior() {
		if (classifierBehavior != null && classifierBehavior.eIsProxy()) {
			InternalEObject oldClassifierBehavior = (InternalEObject)classifierBehavior;
			classifierBehavior = (Behavior)eResolveProxy(oldClassifierBehavior);
			if (classifierBehavior != oldClassifierBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
			}
		}
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetClassifierBehavior() {
		return classifierBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		Behavior oldClassifierBehavior = classifierBehavior;
		classifierBehavior = newClassifierBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getInterfaceRealizations() {
		if (interfaceRealizations == null) {
			interfaceRealizations = new EObjectContainmentWithInverseEList.Resolving<InterfaceRealization>(InterfaceRealization.class, this, FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION, UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
		}
		return interfaceRealizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getOwnedBehaviors() {
		if (ownedBehaviors == null) {
			ownedBehaviors = new EObjectContainmentEList.Resolving<Behavior>(Behavior.class, this, FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR);
		}
		return ownedBehaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperations() {
		if (ownedOperations == null) {
			ownedOperations = new EObjectContainmentWithInverseEList.Resolving<Operation>(Operation.class, this, FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION, UMLPackage.OPERATION__CLASS);
		}
		return ownedOperations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Extension> getExtensions() {
		// TODO: implement this method to return the 'Extension' reference list
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
	public boolean isActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.VOCABULARY_CLASS__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifiers() {
		if (nestedClassifiers == null) {
			nestedClassifiers = new EObjectContainmentEList.Resolving<Classifier>(Classifier.class, this, FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReceptions() {
		if (ownedReceptions == null) {
			ownedReceptions = new EObjectContainmentEList.Resolving<Reception>(Reception.class, this, FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION);
		}
		return ownedReceptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Class> getSuperClasses() {
		// TODO: implement this method to return the 'Super Class' reference list
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
	public boolean validatePassiveClass(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.CLASS__PASSIVE_CLASS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePassiveClass", EObjectValidator.getObjectLabel(this, context) }),
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
	public Operation createOwnedOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, Type returnType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMetaclass() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassBehavior(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 UMLValidator.DIAGNOSTIC_SOURCE,
						 UMLValidator.BEHAVIORED_CLASSIFIER__CLASS_BEHAVIOR,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateClassBehavior", EObjectValidator.getObjectLabel(this, context) }),
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
	public EList<Interface> getAllImplementedInterfaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getImplementedInterfaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createOwnedAttribute(String name, Type type, int lower, int upper) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConnectableElement> allRoles() {
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
			case FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceRealizations()).basicAdd(otherEnd, msgs);
			case FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperations()).basicAdd(otherEnd, msgs);
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
			case FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnectors()).basicRemove(otherEnd, msgs);
			case FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION:
				return ((InternalEList<?>)getInterfaceRealizations()).basicRemove(otherEnd, msgs);
			case FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
			case FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifiers()).basicRemove(otherEnd, msgs);
			case FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReceptions()).basicRemove(otherEnd, msgs);
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
			case FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case FramewebPackage.VOCABULARY_CLASS__PART:
				return getParts();
			case FramewebPackage.VOCABULARY_CLASS__ROLE:
				return getRoles();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_PORT:
				return getOwnedPorts();
			case FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR:
				if (resolve) return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION:
				return getInterfaceRealizations();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION:
				return getOwnedOperations();
			case FramewebPackage.VOCABULARY_CLASS__EXTENSION:
				return getExtensions();
			case FramewebPackage.VOCABULARY_CLASS__IS_ACTIVE:
				return isActive();
			case FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION:
				return getOwnedReceptions();
			case FramewebPackage.VOCABULARY_CLASS__SUPER_CLASS:
				return getSuperClasses();
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
			case FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection<? extends Property>)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION:
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection<? extends InterfaceRealization>)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection<? extends Reception>)newValue);
				return;
			case FramewebPackage.VOCABULARY_CLASS__SUPER_CLASS:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
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
			case FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION:
				getInterfaceRealizations().clear();
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case FramewebPackage.VOCABULARY_CLASS__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case FramewebPackage.VOCABULARY_CLASS__SUPER_CLASS:
				getSuperClasses().clear();
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
			case FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE:
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__PART:
				return !getParts().isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__ROLE:
				return !getRoles().isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_PORT:
				return !getOwnedPorts().isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION:
				return interfaceRealizations != null && !interfaceRealizations.isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR:
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__EXTENSION:
				return !getExtensions().isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER:
				return nestedClassifiers != null && !nestedClassifiers.isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION:
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case FramewebPackage.VOCABULARY_CLASS__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
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
		if (baseClass == StructuredClassifier.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE: return UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
				case FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR: return UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
				case FramewebPackage.VOCABULARY_CLASS__PART: return UMLPackage.STRUCTURED_CLASSIFIER__PART;
				case FramewebPackage.VOCABULARY_CLASS__ROLE: return UMLPackage.STRUCTURED_CLASSIFIER__ROLE;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.VOCABULARY_CLASS__OWNED_PORT: return UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT;
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR: return UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				case FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION: return UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
				case FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR: return UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == org.eclipse.uml2.uml.Class.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION: return UMLPackage.CLASS__OWNED_OPERATION;
				case FramewebPackage.VOCABULARY_CLASS__EXTENSION: return UMLPackage.CLASS__EXTENSION;
				case FramewebPackage.VOCABULARY_CLASS__IS_ACTIVE: return UMLPackage.CLASS__IS_ACTIVE;
				case FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER: return UMLPackage.CLASS__NESTED_CLASSIFIER;
				case FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION: return UMLPackage.CLASS__OWNED_RECEPTION;
				case FramewebPackage.VOCABULARY_CLASS__SUPER_CLASS: return UMLPackage.CLASS__SUPER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == VocabularyClassExpression.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == StructuredClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE: return FramewebPackage.VOCABULARY_CLASS__OWNED_ATTRIBUTE;
				case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return FramewebPackage.VOCABULARY_CLASS__OWNED_CONNECTOR;
				case UMLPackage.STRUCTURED_CLASSIFIER__PART: return FramewebPackage.VOCABULARY_CLASS__PART;
				case UMLPackage.STRUCTURED_CLASSIFIER__ROLE: return FramewebPackage.VOCABULARY_CLASS__ROLE;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT: return FramewebPackage.VOCABULARY_CLASS__OWNED_PORT;
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR: return FramewebPackage.VOCABULARY_CLASS__CLASSIFIER_BEHAVIOR;
				case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION: return FramewebPackage.VOCABULARY_CLASS__INTERFACE_REALIZATION;
				case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR: return FramewebPackage.VOCABULARY_CLASS__OWNED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == org.eclipse.uml2.uml.Class.class) {
			switch (baseFeatureID) {
				case UMLPackage.CLASS__OWNED_OPERATION: return FramewebPackage.VOCABULARY_CLASS__OWNED_OPERATION;
				case UMLPackage.CLASS__EXTENSION: return FramewebPackage.VOCABULARY_CLASS__EXTENSION;
				case UMLPackage.CLASS__IS_ACTIVE: return FramewebPackage.VOCABULARY_CLASS__IS_ACTIVE;
				case UMLPackage.CLASS__NESTED_CLASSIFIER: return FramewebPackage.VOCABULARY_CLASS__NESTED_CLASSIFIER;
				case UMLPackage.CLASS__OWNED_RECEPTION: return FramewebPackage.VOCABULARY_CLASS__OWNED_RECEPTION;
				case UMLPackage.CLASS__SUPER_CLASS: return FramewebPackage.VOCABULARY_CLASS__SUPER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == VocabularyClassExpression.class) {
			switch (baseFeatureID) {
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
		if (baseClass == StructuredClassifier.class) {
			switch (baseOperationID) {
				case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT: return FramewebPackage.VOCABULARY_CLASS___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;
				case UMLPackage.STRUCTURED_CLASSIFIER___GET_PARTS: return FramewebPackage.VOCABULARY_CLASS___GET_PARTS;
				case UMLPackage.STRUCTURED_CLASSIFIER___ALL_ROLES: return FramewebPackage.VOCABULARY_CLASS___ALL_ROLES;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseOperationID) {
				case UMLPackage.ENCAPSULATED_CLASSIFIER___GET_OWNED_PORTS: return FramewebPackage.VOCABULARY_CLASS___GET_OWNED_PORTS;
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifier.class) {
			switch (baseOperationID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP: return FramewebPackage.VOCABULARY_CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES: return FramewebPackage.VOCABULARY_CLASS___GET_ALL_IMPLEMENTED_INTERFACES;
				case UMLPackage.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES: return FramewebPackage.VOCABULARY_CLASS___GET_IMPLEMENTED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == org.eclipse.uml2.uml.Class.class) {
			switch (baseOperationID) {
				case UMLPackage.CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP: return FramewebPackage.VOCABULARY_CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE: return FramewebPackage.VOCABULARY_CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;
				case UMLPackage.CLASS___IS_METACLASS: return FramewebPackage.VOCABULARY_CLASS___IS_METACLASS;
				case UMLPackage.CLASS___GET_EXTENSIONS: return FramewebPackage.VOCABULARY_CLASS___GET_EXTENSIONS;
				case UMLPackage.CLASS___GET_SUPER_CLASSES: return FramewebPackage.VOCABULARY_CLASS___GET_SUPER_CLASSES;
				default: return -1;
			}
		}
		if (baseClass == VocabularyClassExpression.class) {
			switch (baseOperationID) {
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
			case FramewebPackage.VOCABULARY_CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP:
				return validatePassiveClass((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.VOCABULARY_CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE:
				return createOwnedOperation((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Type>)arguments.get(2), (Type)arguments.get(3));
			case FramewebPackage.VOCABULARY_CLASS___IS_METACLASS:
				return isMetaclass();
			case FramewebPackage.VOCABULARY_CLASS___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP:
				return validateClassBehavior((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.VOCABULARY_CLASS___GET_ALL_IMPLEMENTED_INTERFACES:
				return getAllImplementedInterfaces();
			case FramewebPackage.VOCABULARY_CLASS___GET_IMPLEMENTED_INTERFACES:
				return getImplementedInterfaces();
			case FramewebPackage.VOCABULARY_CLASS___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT:
				return createOwnedAttribute((String)arguments.get(0), (Type)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FramewebPackage.VOCABULARY_CLASS___ALL_ROLES:
				return allRoles();
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
		result.append(" (isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

	@Override
	public Operation createOwnedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOwnedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOwnedOperation(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier createNestedClassifier(String name, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getNestedClassifier(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getNestedClassifier(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.eclipse.uml2.uml.Class getSuperClass(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.eclipse.uml2.uml.Class getSuperClass(String name,
			boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reception createOwnedReception(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reception getOwnedReception(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reception getOwnedReception(String name,
			EList<String> ownedParameterNames, EList<Type> ownedParameterTypes,
			boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Extension getExtension(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Extension getExtension(String name, boolean ignoreCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port createOwnedPort(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getOwnedPort(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getOwnedPort(String name, Type type, boolean ignoreCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Port getOwnedPort(String name, Type type, boolean ignoreCase,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createOwnedAttribute(String name, Type type, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property createOwnedAttribute(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getOwnedAttribute(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getOwnedAttribute(String name, Type type,
			boolean ignoreCase, EClass eClass, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getPart(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getPart(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConnectableElement getRole(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConnectableElement getRole(String name, Type type,
			boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connector createOwnedConnector(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connector getOwnedConnector(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connector getOwnedConnector(String name, boolean ignoreCase,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Behavior createOwnedBehavior(String name, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Behavior getOwnedBehavior(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Behavior getOwnedBehavior(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Behavior createClassifierBehavior(String name, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterfaceRealization createInterfaceRealization(String name,
			Interface contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterfaceRealization getInterfaceRealization(String name,
			Interface contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InterfaceRealization getInterfaceRealization(String name,
			Interface contract, boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

} //VocabularyClassImpl

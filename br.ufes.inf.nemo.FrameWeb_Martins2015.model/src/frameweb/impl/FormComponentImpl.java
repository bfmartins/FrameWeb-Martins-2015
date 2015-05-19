/**
 */
package frameweb.impl;

import frameweb.FormComponent;
import frameweb.FramewebPackage;
import frameweb.FrameworkTag;
import frameweb.IOParameter;
import frameweb.Tag;

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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedRules <em>Owned Rule</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getElementImports <em>Element Import</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getPackageImports <em>Package Import</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedMembers <em>Owned Member</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getImportedMembers <em>Imported Member</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getMembers <em>Member</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getTemplateBindings <em>Template Binding</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getFeatures <em>Feature</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getAttributes <em>Attribute</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getCollaborationUses <em>Collaboration Use</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getGenerals <em>General</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getGeneralizations <em>Generalization</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getPowertypeExtents <em>Powertype Extent</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getInheritedMembers <em>Inherited Member</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#isAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#isFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedUseCases <em>Owned Use Case</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getUseCases <em>Use Case</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getRedefinedClassifiers <em>Redefined Classifier</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getSubstitutions <em>Substitution</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedAttributes <em>Owned Attribute</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedConnectors <em>Owned Connector</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getParts <em>Part</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getRoles <em>Role</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedPorts <em>Owned Port</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getClassifierBehavior <em>Classifier Behavior</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getInterfaceRealizations <em>Interface Realization</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedBehaviors <em>Owned Behavior</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedOperations <em>Owned Operation</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getExtensions <em>Extension</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#isActive <em>Is Active</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getNestedClassifiers <em>Nested Classifier</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getOwnedReceptions <em>Owned Reception</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getSuperClasses <em>Super Class</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getSubTag <em>Sub Tag</em>}</li>
 *   <li>{@link frameweb.impl.FormComponentImpl#getInject <em>Inject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormComponentImpl extends NavigationAttributeImpl implements FormComponent {
	/**
	 * The cached value of the '{@link #getOwnedRules() <em>Owned Rule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Constraint> ownedRules;

	/**
	 * The cached value of the '{@link #getElementImports() <em>Element Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementImports()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementImport> elementImports;

	/**
	 * The cached value of the '{@link #getPackageImports() <em>Package Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageImports()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageImport> packageImports;

	/**
	 * The cached value of the '{@link #getTemplateBindings() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBindings()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBindings;

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
	 * The cached value of the '{@link #getCollaborationUses() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUses()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationUse> collaborationUses;

	/**
	 * The cached value of the '{@link #getGeneralizations() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalizations;

	/**
	 * The cached value of the '{@link #getPowertypeExtents() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtents()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> powertypeExtents;

	/**
	 * The default value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #isFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FINAL_SPECIALIZATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected boolean isFinalSpecialization = IS_FINAL_SPECIALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedUseCases() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> ownedUseCases;

	/**
	 * The cached value of the '{@link #getUseCases() <em>Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCases()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCases;

	/**
	 * The cached value of the '{@link #getRedefinedClassifiers() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinedClassifiers;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationUse representation;

	/**
	 * The cached value of the '{@link #getSubstitutions() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Substitution> substitutions;

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
	 * The cached value of the '{@link #getSubTag() <em>Sub Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> subTag;

	/**
	 * The cached value of the '{@link #getInject() <em>Inject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInject()
	 * @generated
	 * @ordered
	 */
	protected IOParameter inject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FormComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FORM_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Constraint> getOwnedRules() {
		if (ownedRules == null) {
			ownedRules = new EObjectContainmentWithInverseEList.Resolving<Constraint>(Constraint.class, this, FramewebPackage.FORM_COMPONENT__OWNED_RULE, UMLPackage.CONSTRAINT__CONTEXT);
		}
		return ownedRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementImport> getElementImports() {
		if (elementImports == null) {
			elementImports = new EObjectContainmentWithInverseEList.Resolving<ElementImport>(ElementImport.class, this, FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT, UMLPackage.ELEMENT_IMPORT__IMPORTING_NAMESPACE);
		}
		return elementImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageImport> getPackageImports() {
		if (packageImports == null) {
			packageImports = new EObjectContainmentWithInverseEList.Resolving<PackageImport>(PackageImport.class, this, FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT, UMLPackage.PACKAGE_IMPORT__IMPORTING_NAMESPACE);
		}
		return packageImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getOwnedMembers() {
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
	public EList<PackageableElement> getImportedMembers() {
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
	public EList<NamedElement> getMembers() {
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
	public org.eclipse.uml2.uml.Package getPackage() {
		org.eclipse.uml2.uml.Package package_ = basicGetPackage();
		return package_ != null && package_.eIsProxy() ? (org.eclipse.uml2.uml.Package)eResolveProxy((InternalEObject)package_) : package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetPackage() {
		// TODO: implement this method to return the 'Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.eclipse.uml2.uml.Package newPackage) {
		// TODO: implement this method to set the 'Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBindings() {
		if (templateBindings == null) {
			templateBindings = new EObjectContainmentWithInverseEList.Resolving<TemplateBinding>(TemplateBinding.class, this, FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING, UMLPackage.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBindings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		if (ownedTemplateSignature != null && ownedTemplateSignature.eIsProxy()) {
			InternalEObject oldOwnedTemplateSignature = (InternalEObject)ownedTemplateSignature;
			ownedTemplateSignature = (TemplateSignature)eResolveProxy(oldOwnedTemplateSignature);
			if (ownedTemplateSignature != oldOwnedTemplateSignature) {
				InternalEObject newOwnedTemplateSignature = (InternalEObject)ownedTemplateSignature;
				NotificationChain msgs =  oldOwnedTemplateSignature.eInverseRemove(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, null);
				if (newOwnedTemplateSignature.eInternalContainer() == null) {
					msgs =  newOwnedTemplateSignature.eInverseAdd(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
				}
				if (msgs != null) msgs.dispatch();
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, ownedTemplateSignature));
			}
		}
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature basicGetOwnedTemplateSignature() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, UMLPackage.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeatures() {
		// TODO: implement this method to return the 'Feature' reference list
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
	public EList<Property> getAttributes() {
		// TODO: implement this method to return the 'Attribute' reference list
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
	public EList<CollaborationUse> getCollaborationUses() {
		if (collaborationUses == null) {
			collaborationUses = new EObjectContainmentEList.Resolving<CollaborationUse>(CollaborationUse.class, this, FramewebPackage.FORM_COMPONENT__COLLABORATION_USE);
		}
		return collaborationUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGenerals() {
		// TODO: implement this method to return the 'General' reference list
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
	public EList<Generalization> getGeneralizations() {
		if (generalizations == null) {
			generalizations = new EObjectContainmentWithInverseEList.Resolving<Generalization>(Generalization.class, this, FramewebPackage.FORM_COMPONENT__GENERALIZATION, UMLPackage.GENERALIZATION__SPECIFIC);
		}
		return generalizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getPowertypeExtents() {
		if (powertypeExtents == null) {
			powertypeExtents = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT, UMLPackage.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMembers() {
		// TODO: implement this method to return the 'Inherited Member' reference list
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
	public boolean isAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalSpecialization() {
		return isFinalSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalSpecialization(boolean newIsFinalSpecialization) {
		boolean oldIsFinalSpecialization = isFinalSpecialization;
		isFinalSpecialization = newIsFinalSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__IS_FINAL_SPECIALIZATION, oldIsFinalSpecialization, isFinalSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCases() {
		if (ownedUseCases == null) {
			ownedUseCases = new EObjectContainmentEList.Resolving<UseCase>(UseCase.class, this, FramewebPackage.FORM_COMPONENT__OWNED_USE_CASE);
		}
		return ownedUseCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCases() {
		if (useCases == null) {
			useCases = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this, FramewebPackage.FORM_COMPONENT__USE_CASE, UMLPackage.USE_CASE__SUBJECT);
		}
		return useCases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinedClassifiers() {
		if (redefinedClassifiers == null) {
			redefinedClassifiers = new EObjectResolvingEList<Classifier>(Classifier.class, this, FramewebPackage.FORM_COMPONENT__REDEFINED_CLASSIFIER);
		}
		return redefinedClassifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (CollaborationUse)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FORM_COMPONENT__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		CollaborationUse oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substitution> getSubstitutions() {
		if (substitutions == null) {
			substitutions = new EObjectContainmentWithInverseEList.Resolving<Substitution>(Substitution.class, this, FramewebPackage.FORM_COMPONENT__SUBSTITUTION, UMLPackage.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		}
		return substitutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttributes() {
		if (ownedAttributes == null) {
			ownedAttributes = new EObjectContainmentEList.Resolving<Property>(Property.class, this, FramewebPackage.FORM_COMPONENT__OWNED_ATTRIBUTE);
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
			ownedConnectors = new EObjectContainmentEList.Resolving<Connector>(Connector.class, this, FramewebPackage.FORM_COMPONENT__OWNED_CONNECTOR);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FORM_COMPONENT__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__CLASSIFIER_BEHAVIOR, oldClassifierBehavior, classifierBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceRealization> getInterfaceRealizations() {
		if (interfaceRealizations == null) {
			interfaceRealizations = new EObjectContainmentWithInverseEList.Resolving<InterfaceRealization>(InterfaceRealization.class, this, FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION, UMLPackage.INTERFACE_REALIZATION__IMPLEMENTING_CLASSIFIER);
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
			ownedBehaviors = new EObjectContainmentEList.Resolving<Behavior>(Behavior.class, this, FramewebPackage.FORM_COMPONENT__OWNED_BEHAVIOR);
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
			ownedOperations = new EObjectContainmentWithInverseEList.Resolving<Operation>(Operation.class, this, FramewebPackage.FORM_COMPONENT__OWNED_OPERATION, UMLPackage.OPERATION__CLASS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifiers() {
		if (nestedClassifiers == null) {
			nestedClassifiers = new EObjectContainmentEList.Resolving<Classifier>(Classifier.class, this, FramewebPackage.FORM_COMPONENT__NESTED_CLASSIFIER);
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
			ownedReceptions = new EObjectContainmentEList.Resolving<Reception>(Reception.class, this, FramewebPackage.FORM_COMPONENT__OWNED_RECEPTION);
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
	public EList<Tag> getSubTag() {
		if (subTag == null) {
			subTag = new EObjectContainmentEList<Tag>(Tag.class, this, FramewebPackage.FORM_COMPONENT__SUB_TAG);
		}
		return subTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter getInject() {
		if (inject != null && inject.eIsProxy()) {
			InternalEObject oldInject = (InternalEObject)inject;
			inject = (IOParameter)eResolveProxy(oldInject);
			if (inject != oldInject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FORM_COMPONENT__INJECT, oldInject, inject));
			}
		}
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter basicGetInject() {
		return inject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInject(IOParameter newInject, NotificationChain msgs) {
		IOParameter oldInject = inject;
		inject = newInject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__INJECT, oldInject, newInject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInject(IOParameter newInject) {
		if (newInject != inject) {
			NotificationChain msgs = null;
			if (inject != null)
				msgs = ((InternalEObject)inject).eInverseRemove(this, FramewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
			if (newInject != null)
				msgs = ((InternalEObject)newInject).eInverseAdd(this, FramewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
			msgs = basicSetInject(newInject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FORM_COMPONENT__INJECT, newInject, newInject));
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
	public boolean validateSpecializeType(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLValidator.CLASSIFIER__SPECIALIZE_TYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSpecializeType", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLValidator.CLASSIFIER__MAPS_TO_GENERALIZATION_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateMapsToGeneralizationSet", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateNonFinalParents(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLValidator.CLASSIFIER__NON_FINAL_PARENTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateNonFinalParents", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateNoCyclesInGeneralization(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLValidator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateNoCyclesInGeneralization", EObjectValidator.getObjectLabel(this, context) }),
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
	public EList<Property> getAllAttributes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getAllOperations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getAllUsedInterfaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation(String name, EList<String> parameterNames, EList<Type> parameterTypes, boolean ignoreCase) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getUsedInterfaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> allFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> allParents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean hasVisibilityOf(NamedElement n) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inherit(EList<NamedElement> inhs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inheritableMembers(Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean maySpecializeType(Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> parents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> directlyRealizedInterfaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> directlyUsedInterfaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> allRealizedInterfaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> allUsedInterfaces() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstitutableFor(Classifier contract) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> allAttributes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuralFeature> allSlottableFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTemplate() {
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
	public Association createAssociation(boolean end1IsNavigable, AggregationKind end1Aggregation, String end1Name, int end1Lower, int end1Upper, Type end1Type, boolean end2IsNavigable, AggregationKind end2Aggregation, String end2Name, int end2Lower, int end2Upper) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociations() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean conformsTo(Type other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNamespaceNeedsVisibility(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLValidator.PACKAGEABLE_ELEMENT__NAMESPACE_NEEDS_VISIBILITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateNamespaceNeedsVisibility", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateMembersDistinguishable(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLValidator.NAMESPACE__MEMBERS_DISTINGUISHABLE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateMembersDistinguishable", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateCannotImportSelf(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLValidator.NAMESPACE__CANNOT_IMPORT_SELF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCannotImportSelf", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean validateCannotImportOwnedMembers(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 UMLValidator.NAMESPACE__CANNOT_IMPORT_OWNED_MEMBERS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCannotImportOwnedMembers", EObjectValidator.getObjectLabel(this, context) }),
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
	public ElementImport createElementImport(PackageableElement element, VisibilityKind visibility) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageImport createPackageImport(org.eclipse.uml2.uml.Package package_, VisibilityKind visibility) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getImportedElements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.eclipse.uml2.uml.Package> getImportedPackages() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public boolean membersAreDistinguishable() {
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
			case FramewebPackage.FORM_COMPONENT__OWNED_RULE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRules()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElementImports()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageImports()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBindings()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralizations()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtents()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__USE_CASE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUseCases()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__SUBSTITUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitutions()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getInterfaceRealizations()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperations()).basicAdd(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__INJECT:
				if (inject != null)
					msgs = ((InternalEObject)inject).eInverseRemove(this, FramewebPackage.IO_PARAMETER__DISPLAY, IOParameter.class, msgs);
				return basicSetInject((IOParameter)otherEnd, msgs);
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
			case FramewebPackage.FORM_COMPONENT__OWNED_RULE:
				return ((InternalEList<?>)getOwnedRules()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT:
				return ((InternalEList<?>)getElementImports()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT:
				return ((InternalEList<?>)getPackageImports()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBindings()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case FramewebPackage.FORM_COMPONENT__COLLABORATION_USE:
				return ((InternalEList<?>)getCollaborationUses()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__GENERALIZATION:
				return ((InternalEList<?>)getGeneralizations()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtents()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_USE_CASE:
				return ((InternalEList<?>)getOwnedUseCases()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__USE_CASE:
				return ((InternalEList<?>)getUseCases()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitutions()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttributes()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnectors()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION:
				return ((InternalEList<?>)getInterfaceRealizations()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_BEHAVIOR:
				return ((InternalEList<?>)getOwnedBehaviors()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperations()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifiers()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReceptions()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__SUB_TAG:
				return ((InternalEList<?>)getSubTag()).basicRemove(otherEnd, msgs);
			case FramewebPackage.FORM_COMPONENT__INJECT:
				return basicSetInject(null, msgs);
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
			case FramewebPackage.FORM_COMPONENT__OWNED_RULE:
				return getOwnedRules();
			case FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT:
				return getElementImports();
			case FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT:
				return getPackageImports();
			case FramewebPackage.FORM_COMPONENT__OWNED_MEMBER:
				return getOwnedMembers();
			case FramewebPackage.FORM_COMPONENT__IMPORTED_MEMBER:
				return getImportedMembers();
			case FramewebPackage.FORM_COMPONENT__MEMBER:
				return getMembers();
			case FramewebPackage.FORM_COMPONENT__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING:
				return getTemplateBindings();
			case FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				if (resolve) return getOwnedTemplateSignature();
				return basicGetOwnedTemplateSignature();
			case FramewebPackage.FORM_COMPONENT__FEATURE:
				return getFeatures();
			case FramewebPackage.FORM_COMPONENT__ATTRIBUTE:
				return getAttributes();
			case FramewebPackage.FORM_COMPONENT__COLLABORATION_USE:
				return getCollaborationUses();
			case FramewebPackage.FORM_COMPONENT__GENERAL:
				return getGenerals();
			case FramewebPackage.FORM_COMPONENT__GENERALIZATION:
				return getGeneralizations();
			case FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT:
				return getPowertypeExtents();
			case FramewebPackage.FORM_COMPONENT__INHERITED_MEMBER:
				return getInheritedMembers();
			case FramewebPackage.FORM_COMPONENT__IS_ABSTRACT:
				return isAbstract();
			case FramewebPackage.FORM_COMPONENT__IS_FINAL_SPECIALIZATION:
				return isFinalSpecialization();
			case FramewebPackage.FORM_COMPONENT__OWNED_USE_CASE:
				return getOwnedUseCases();
			case FramewebPackage.FORM_COMPONENT__USE_CASE:
				return getUseCases();
			case FramewebPackage.FORM_COMPONENT__REDEFINED_CLASSIFIER:
				return getRedefinedClassifiers();
			case FramewebPackage.FORM_COMPONENT__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case FramewebPackage.FORM_COMPONENT__SUBSTITUTION:
				return getSubstitutions();
			case FramewebPackage.FORM_COMPONENT__OWNED_ATTRIBUTE:
				return getOwnedAttributes();
			case FramewebPackage.FORM_COMPONENT__OWNED_CONNECTOR:
				return getOwnedConnectors();
			case FramewebPackage.FORM_COMPONENT__PART:
				return getParts();
			case FramewebPackage.FORM_COMPONENT__ROLE:
				return getRoles();
			case FramewebPackage.FORM_COMPONENT__OWNED_PORT:
				return getOwnedPorts();
			case FramewebPackage.FORM_COMPONENT__CLASSIFIER_BEHAVIOR:
				if (resolve) return getClassifierBehavior();
				return basicGetClassifierBehavior();
			case FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION:
				return getInterfaceRealizations();
			case FramewebPackage.FORM_COMPONENT__OWNED_BEHAVIOR:
				return getOwnedBehaviors();
			case FramewebPackage.FORM_COMPONENT__OWNED_OPERATION:
				return getOwnedOperations();
			case FramewebPackage.FORM_COMPONENT__EXTENSION:
				return getExtensions();
			case FramewebPackage.FORM_COMPONENT__IS_ACTIVE:
				return isActive();
			case FramewebPackage.FORM_COMPONENT__NESTED_CLASSIFIER:
				return getNestedClassifiers();
			case FramewebPackage.FORM_COMPONENT__OWNED_RECEPTION:
				return getOwnedReceptions();
			case FramewebPackage.FORM_COMPONENT__SUPER_CLASS:
				return getSuperClasses();
			case FramewebPackage.FORM_COMPONENT__SUB_TAG:
				return getSubTag();
			case FramewebPackage.FORM_COMPONENT__INJECT:
				if (resolve) return getInject();
				return basicGetInject();
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
			case FramewebPackage.FORM_COMPONENT__OWNED_RULE:
				getOwnedRules().clear();
				getOwnedRules().addAll((Collection<? extends Constraint>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT:
				getElementImports().clear();
				getElementImports().addAll((Collection<? extends ElementImport>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT:
				getPackageImports().clear();
				getPackageImports().addAll((Collection<? extends PackageImport>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__PACKAGE:
				setPackage((org.eclipse.uml2.uml.Package)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				getTemplateBindings().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__COLLABORATION_USE:
				getCollaborationUses().clear();
				getCollaborationUses().addAll((Collection<? extends CollaborationUse>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__GENERAL:
				getGenerals().clear();
				getGenerals().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__GENERALIZATION:
				getGeneralizations().clear();
				getGeneralizations().addAll((Collection<? extends Generalization>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				getPowertypeExtents().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization((Boolean)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				getOwnedUseCases().addAll((Collection<? extends UseCase>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__USE_CASE:
				getUseCases().clear();
				getUseCases().addAll((Collection<? extends UseCase>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				getRedefinedClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__REPRESENTATION:
				setRepresentation((CollaborationUse)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__SUBSTITUTION:
				getSubstitutions().clear();
				getSubstitutions().addAll((Collection<? extends Substitution>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				getOwnedAttributes().addAll((Collection<? extends Property>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				getOwnedConnectors().addAll((Collection<? extends Connector>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION:
				getInterfaceRealizations().clear();
				getInterfaceRealizations().addAll((Collection<? extends InterfaceRealization>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				getOwnedBehaviors().addAll((Collection<? extends Behavior>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_OPERATION:
				getOwnedOperations().clear();
				getOwnedOperations().addAll((Collection<? extends Operation>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				getNestedClassifiers().addAll((Collection<? extends Classifier>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				getOwnedReceptions().addAll((Collection<? extends Reception>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__SUPER_CLASS:
				getSuperClasses().clear();
				getSuperClasses().addAll((Collection<? extends org.eclipse.uml2.uml.Class>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__SUB_TAG:
				getSubTag().clear();
				getSubTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case FramewebPackage.FORM_COMPONENT__INJECT:
				setInject((IOParameter)newValue);
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
			case FramewebPackage.FORM_COMPONENT__OWNED_RULE:
				getOwnedRules().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT:
				getElementImports().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT:
				getPackageImports().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__PACKAGE:
				setPackage((org.eclipse.uml2.uml.Package)null);
				return;
			case FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING:
				getTemplateBindings().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case FramewebPackage.FORM_COMPONENT__COLLABORATION_USE:
				getCollaborationUses().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__GENERAL:
				getGenerals().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__GENERALIZATION:
				getGeneralizations().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT:
				getPowertypeExtents().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case FramewebPackage.FORM_COMPONENT__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_USE_CASE:
				getOwnedUseCases().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__USE_CASE:
				getUseCases().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__REDEFINED_CLASSIFIER:
				getRedefinedClassifiers().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__REPRESENTATION:
				setRepresentation((CollaborationUse)null);
				return;
			case FramewebPackage.FORM_COMPONENT__SUBSTITUTION:
				getSubstitutions().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_ATTRIBUTE:
				getOwnedAttributes().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_CONNECTOR:
				getOwnedConnectors().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__CLASSIFIER_BEHAVIOR:
				setClassifierBehavior((Behavior)null);
				return;
			case FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION:
				getInterfaceRealizations().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_BEHAVIOR:
				getOwnedBehaviors().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_OPERATION:
				getOwnedOperations().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case FramewebPackage.FORM_COMPONENT__NESTED_CLASSIFIER:
				getNestedClassifiers().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__OWNED_RECEPTION:
				getOwnedReceptions().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__SUPER_CLASS:
				getSuperClasses().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__SUB_TAG:
				getSubTag().clear();
				return;
			case FramewebPackage.FORM_COMPONENT__INJECT:
				setInject((IOParameter)null);
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
			case FramewebPackage.FORM_COMPONENT__OWNED_RULE:
				return ownedRules != null && !ownedRules.isEmpty();
			case FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT:
				return elementImports != null && !elementImports.isEmpty();
			case FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT:
				return packageImports != null && !packageImports.isEmpty();
			case FramewebPackage.FORM_COMPONENT__OWNED_MEMBER:
				return !getOwnedMembers().isEmpty();
			case FramewebPackage.FORM_COMPONENT__IMPORTED_MEMBER:
				return !getImportedMembers().isEmpty();
			case FramewebPackage.FORM_COMPONENT__MEMBER:
				return !getMembers().isEmpty();
			case FramewebPackage.FORM_COMPONENT__PACKAGE:
				return basicGetPackage() != null;
			case FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING:
				return templateBindings != null && !templateBindings.isEmpty();
			case FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case FramewebPackage.FORM_COMPONENT__FEATURE:
				return !getFeatures().isEmpty();
			case FramewebPackage.FORM_COMPONENT__ATTRIBUTE:
				return !getAttributes().isEmpty();
			case FramewebPackage.FORM_COMPONENT__COLLABORATION_USE:
				return collaborationUses != null && !collaborationUses.isEmpty();
			case FramewebPackage.FORM_COMPONENT__GENERAL:
				return !getGenerals().isEmpty();
			case FramewebPackage.FORM_COMPONENT__GENERALIZATION:
				return generalizations != null && !generalizations.isEmpty();
			case FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT:
				return powertypeExtents != null && !powertypeExtents.isEmpty();
			case FramewebPackage.FORM_COMPONENT__INHERITED_MEMBER:
				return !getInheritedMembers().isEmpty();
			case FramewebPackage.FORM_COMPONENT__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case FramewebPackage.FORM_COMPONENT__IS_FINAL_SPECIALIZATION:
				return isFinalSpecialization != IS_FINAL_SPECIALIZATION_EDEFAULT;
			case FramewebPackage.FORM_COMPONENT__OWNED_USE_CASE:
				return ownedUseCases != null && !ownedUseCases.isEmpty();
			case FramewebPackage.FORM_COMPONENT__USE_CASE:
				return useCases != null && !useCases.isEmpty();
			case FramewebPackage.FORM_COMPONENT__REDEFINED_CLASSIFIER:
				return redefinedClassifiers != null && !redefinedClassifiers.isEmpty();
			case FramewebPackage.FORM_COMPONENT__REPRESENTATION:
				return representation != null;
			case FramewebPackage.FORM_COMPONENT__SUBSTITUTION:
				return substitutions != null && !substitutions.isEmpty();
			case FramewebPackage.FORM_COMPONENT__OWNED_ATTRIBUTE:
				return ownedAttributes != null && !ownedAttributes.isEmpty();
			case FramewebPackage.FORM_COMPONENT__OWNED_CONNECTOR:
				return ownedConnectors != null && !ownedConnectors.isEmpty();
			case FramewebPackage.FORM_COMPONENT__PART:
				return !getParts().isEmpty();
			case FramewebPackage.FORM_COMPONENT__ROLE:
				return !getRoles().isEmpty();
			case FramewebPackage.FORM_COMPONENT__OWNED_PORT:
				return !getOwnedPorts().isEmpty();
			case FramewebPackage.FORM_COMPONENT__CLASSIFIER_BEHAVIOR:
				return classifierBehavior != null;
			case FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION:
				return interfaceRealizations != null && !interfaceRealizations.isEmpty();
			case FramewebPackage.FORM_COMPONENT__OWNED_BEHAVIOR:
				return ownedBehaviors != null && !ownedBehaviors.isEmpty();
			case FramewebPackage.FORM_COMPONENT__OWNED_OPERATION:
				return ownedOperations != null && !ownedOperations.isEmpty();
			case FramewebPackage.FORM_COMPONENT__EXTENSION:
				return !getExtensions().isEmpty();
			case FramewebPackage.FORM_COMPONENT__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case FramewebPackage.FORM_COMPONENT__NESTED_CLASSIFIER:
				return nestedClassifiers != null && !nestedClassifiers.isEmpty();
			case FramewebPackage.FORM_COMPONENT__OWNED_RECEPTION:
				return ownedReceptions != null && !ownedReceptions.isEmpty();
			case FramewebPackage.FORM_COMPONENT__SUPER_CLASS:
				return !getSuperClasses().isEmpty();
			case FramewebPackage.FORM_COMPONENT__SUB_TAG:
				return subTag != null && !subTag.isEmpty();
			case FramewebPackage.FORM_COMPONENT__INJECT:
				return inject != null;
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
				case FramewebPackage.FORM_COMPONENT__OWNED_RULE: return UMLPackage.NAMESPACE__OWNED_RULE;
				case FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT: return UMLPackage.NAMESPACE__ELEMENT_IMPORT;
				case FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT: return UMLPackage.NAMESPACE__PACKAGE_IMPORT;
				case FramewebPackage.FORM_COMPONENT__OWNED_MEMBER: return UMLPackage.NAMESPACE__OWNED_MEMBER;
				case FramewebPackage.FORM_COMPONENT__IMPORTED_MEMBER: return UMLPackage.NAMESPACE__IMPORTED_MEMBER;
				case FramewebPackage.FORM_COMPONENT__MEMBER: return UMLPackage.NAMESPACE__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM_COMPONENT__PACKAGE: return UMLPackage.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING: return UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE: return UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM_COMPONENT__FEATURE: return UMLPackage.CLASSIFIER__FEATURE;
				case FramewebPackage.FORM_COMPONENT__ATTRIBUTE: return UMLPackage.CLASSIFIER__ATTRIBUTE;
				case FramewebPackage.FORM_COMPONENT__COLLABORATION_USE: return UMLPackage.CLASSIFIER__COLLABORATION_USE;
				case FramewebPackage.FORM_COMPONENT__GENERAL: return UMLPackage.CLASSIFIER__GENERAL;
				case FramewebPackage.FORM_COMPONENT__GENERALIZATION: return UMLPackage.CLASSIFIER__GENERALIZATION;
				case FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT: return UMLPackage.CLASSIFIER__POWERTYPE_EXTENT;
				case FramewebPackage.FORM_COMPONENT__INHERITED_MEMBER: return UMLPackage.CLASSIFIER__INHERITED_MEMBER;
				case FramewebPackage.FORM_COMPONENT__IS_ABSTRACT: return UMLPackage.CLASSIFIER__IS_ABSTRACT;
				case FramewebPackage.FORM_COMPONENT__IS_FINAL_SPECIALIZATION: return UMLPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION;
				case FramewebPackage.FORM_COMPONENT__OWNED_USE_CASE: return UMLPackage.CLASSIFIER__OWNED_USE_CASE;
				case FramewebPackage.FORM_COMPONENT__USE_CASE: return UMLPackage.CLASSIFIER__USE_CASE;
				case FramewebPackage.FORM_COMPONENT__REDEFINED_CLASSIFIER: return UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER;
				case FramewebPackage.FORM_COMPONENT__REPRESENTATION: return UMLPackage.CLASSIFIER__REPRESENTATION;
				case FramewebPackage.FORM_COMPONENT__SUBSTITUTION: return UMLPackage.CLASSIFIER__SUBSTITUTION;
				default: return -1;
			}
		}
		if (baseClass == StructuredClassifier.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM_COMPONENT__OWNED_ATTRIBUTE: return UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE;
				case FramewebPackage.FORM_COMPONENT__OWNED_CONNECTOR: return UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR;
				case FramewebPackage.FORM_COMPONENT__PART: return UMLPackage.STRUCTURED_CLASSIFIER__PART;
				case FramewebPackage.FORM_COMPONENT__ROLE: return UMLPackage.STRUCTURED_CLASSIFIER__ROLE;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM_COMPONENT__OWNED_PORT: return UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT;
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifier.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM_COMPONENT__CLASSIFIER_BEHAVIOR: return UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR;
				case FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION: return UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION;
				case FramewebPackage.FORM_COMPONENT__OWNED_BEHAVIOR: return UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == org.eclipse.uml2.uml.Class.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM_COMPONENT__OWNED_OPERATION: return UMLPackage.CLASS__OWNED_OPERATION;
				case FramewebPackage.FORM_COMPONENT__EXTENSION: return UMLPackage.CLASS__EXTENSION;
				case FramewebPackage.FORM_COMPONENT__IS_ACTIVE: return UMLPackage.CLASS__IS_ACTIVE;
				case FramewebPackage.FORM_COMPONENT__NESTED_CLASSIFIER: return UMLPackage.CLASS__NESTED_CLASSIFIER;
				case FramewebPackage.FORM_COMPONENT__OWNED_RECEPTION: return UMLPackage.CLASS__OWNED_RECEPTION;
				case FramewebPackage.FORM_COMPONENT__SUPER_CLASS: return UMLPackage.CLASS__SUPER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == Tag.class) {
			switch (derivedFeatureID) {
				case FramewebPackage.FORM_COMPONENT__SUB_TAG: return FramewebPackage.TAG__SUB_TAG;
				default: return -1;
			}
		}
		if (baseClass == FrameworkTag.class) {
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
		if (baseClass == Namespace.class) {
			switch (baseFeatureID) {
				case UMLPackage.NAMESPACE__OWNED_RULE: return FramewebPackage.FORM_COMPONENT__OWNED_RULE;
				case UMLPackage.NAMESPACE__ELEMENT_IMPORT: return FramewebPackage.FORM_COMPONENT__ELEMENT_IMPORT;
				case UMLPackage.NAMESPACE__PACKAGE_IMPORT: return FramewebPackage.FORM_COMPONENT__PACKAGE_IMPORT;
				case UMLPackage.NAMESPACE__OWNED_MEMBER: return FramewebPackage.FORM_COMPONENT__OWNED_MEMBER;
				case UMLPackage.NAMESPACE__IMPORTED_MEMBER: return FramewebPackage.FORM_COMPONENT__IMPORTED_MEMBER;
				case UMLPackage.NAMESPACE__MEMBER: return FramewebPackage.FORM_COMPONENT__MEMBER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case UMLPackage.TYPE__PACKAGE: return FramewebPackage.FORM_COMPONENT__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return FramewebPackage.FORM_COMPONENT__TEMPLATE_BINDING;
				case UMLPackage.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return FramewebPackage.FORM_COMPONENT__OWNED_TEMPLATE_SIGNATURE;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.CLASSIFIER__FEATURE: return FramewebPackage.FORM_COMPONENT__FEATURE;
				case UMLPackage.CLASSIFIER__ATTRIBUTE: return FramewebPackage.FORM_COMPONENT__ATTRIBUTE;
				case UMLPackage.CLASSIFIER__COLLABORATION_USE: return FramewebPackage.FORM_COMPONENT__COLLABORATION_USE;
				case UMLPackage.CLASSIFIER__GENERAL: return FramewebPackage.FORM_COMPONENT__GENERAL;
				case UMLPackage.CLASSIFIER__GENERALIZATION: return FramewebPackage.FORM_COMPONENT__GENERALIZATION;
				case UMLPackage.CLASSIFIER__POWERTYPE_EXTENT: return FramewebPackage.FORM_COMPONENT__POWERTYPE_EXTENT;
				case UMLPackage.CLASSIFIER__INHERITED_MEMBER: return FramewebPackage.FORM_COMPONENT__INHERITED_MEMBER;
				case UMLPackage.CLASSIFIER__IS_ABSTRACT: return FramewebPackage.FORM_COMPONENT__IS_ABSTRACT;
				case UMLPackage.CLASSIFIER__IS_FINAL_SPECIALIZATION: return FramewebPackage.FORM_COMPONENT__IS_FINAL_SPECIALIZATION;
				case UMLPackage.CLASSIFIER__OWNED_USE_CASE: return FramewebPackage.FORM_COMPONENT__OWNED_USE_CASE;
				case UMLPackage.CLASSIFIER__USE_CASE: return FramewebPackage.FORM_COMPONENT__USE_CASE;
				case UMLPackage.CLASSIFIER__REDEFINED_CLASSIFIER: return FramewebPackage.FORM_COMPONENT__REDEFINED_CLASSIFIER;
				case UMLPackage.CLASSIFIER__REPRESENTATION: return FramewebPackage.FORM_COMPONENT__REPRESENTATION;
				case UMLPackage.CLASSIFIER__SUBSTITUTION: return FramewebPackage.FORM_COMPONENT__SUBSTITUTION;
				default: return -1;
			}
		}
		if (baseClass == StructuredClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE: return FramewebPackage.FORM_COMPONENT__OWNED_ATTRIBUTE;
				case UMLPackage.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR: return FramewebPackage.FORM_COMPONENT__OWNED_CONNECTOR;
				case UMLPackage.STRUCTURED_CLASSIFIER__PART: return FramewebPackage.FORM_COMPONENT__PART;
				case UMLPackage.STRUCTURED_CLASSIFIER__ROLE: return FramewebPackage.FORM_COMPONENT__ROLE;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.ENCAPSULATED_CLASSIFIER__OWNED_PORT: return FramewebPackage.FORM_COMPONENT__OWNED_PORT;
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifier.class) {
			switch (baseFeatureID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR: return FramewebPackage.FORM_COMPONENT__CLASSIFIER_BEHAVIOR;
				case UMLPackage.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION: return FramewebPackage.FORM_COMPONENT__INTERFACE_REALIZATION;
				case UMLPackage.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR: return FramewebPackage.FORM_COMPONENT__OWNED_BEHAVIOR;
				default: return -1;
			}
		}
		if (baseClass == org.eclipse.uml2.uml.Class.class) {
			switch (baseFeatureID) {
				case UMLPackage.CLASS__OWNED_OPERATION: return FramewebPackage.FORM_COMPONENT__OWNED_OPERATION;
				case UMLPackage.CLASS__EXTENSION: return FramewebPackage.FORM_COMPONENT__EXTENSION;
				case UMLPackage.CLASS__IS_ACTIVE: return FramewebPackage.FORM_COMPONENT__IS_ACTIVE;
				case UMLPackage.CLASS__NESTED_CLASSIFIER: return FramewebPackage.FORM_COMPONENT__NESTED_CLASSIFIER;
				case UMLPackage.CLASS__OWNED_RECEPTION: return FramewebPackage.FORM_COMPONENT__OWNED_RECEPTION;
				case UMLPackage.CLASS__SUPER_CLASS: return FramewebPackage.FORM_COMPONENT__SUPER_CLASS;
				default: return -1;
			}
		}
		if (baseClass == Tag.class) {
			switch (baseFeatureID) {
				case FramewebPackage.TAG__SUB_TAG: return FramewebPackage.FORM_COMPONENT__SUB_TAG;
				default: return -1;
			}
		}
		if (baseClass == FrameworkTag.class) {
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
		if (baseClass == Namespace.class) {
			switch (baseOperationID) {
				case UMLPackage.NAMESPACE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.NAMESPACE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.NAMESPACE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.NAMESPACE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND: return FramewebPackage.FORM_COMPONENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;
				case UMLPackage.NAMESPACE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND: return FramewebPackage.FORM_COMPONENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;
				case UMLPackage.NAMESPACE___GET_IMPORTED_ELEMENTS: return FramewebPackage.FORM_COMPONENT___GET_IMPORTED_ELEMENTS;
				case UMLPackage.NAMESPACE___GET_IMPORTED_PACKAGES: return FramewebPackage.FORM_COMPONENT___GET_IMPORTED_PACKAGES;
				case UMLPackage.NAMESPACE___GET_OWNED_MEMBERS: return FramewebPackage.FORM_COMPONENT___GET_OWNED_MEMBERS;
				case UMLPackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST: return FramewebPackage.FORM_COMPONENT___EXCLUDE_COLLISIONS__ELIST;
				case UMLPackage.NAMESPACE___GET_NAMES_OF_MEMBER__NAMEDELEMENT: return FramewebPackage.FORM_COMPONENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT;
				case UMLPackage.NAMESPACE___IMPORT_MEMBERS__ELIST: return FramewebPackage.FORM_COMPONENT___IMPORT_MEMBERS__ELIST;
				case UMLPackage.NAMESPACE___GET_IMPORTED_MEMBERS: return FramewebPackage.FORM_COMPONENT___GET_IMPORTED_MEMBERS;
				case UMLPackage.NAMESPACE___MEMBERS_ARE_DISTINGUISHABLE: return FramewebPackage.FORM_COMPONENT___MEMBERS_ARE_DISTINGUISHABLE;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.PACKAGEABLE_ELEMENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				case UMLPackage.TYPE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT: return FramewebPackage.FORM_COMPONENT___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;
				case UMLPackage.TYPE___GET_ASSOCIATIONS: return FramewebPackage.FORM_COMPONENT___GET_ASSOCIATIONS;
				case UMLPackage.TYPE___CONFORMS_TO__TYPE: return FramewebPackage.FORM_COMPONENT___CONFORMS_TO__TYPE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case UMLPackage.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return FramewebPackage.FORM_COMPONENT___IS_TEMPLATE;
				case UMLPackage.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return FramewebPackage.FORM_COMPONENT___PARAMETERABLE_ELEMENTS;
				default: return -1;
			}
		}
		if (baseClass == Classifier.class) {
			switch (baseOperationID) {
				case UMLPackage.CLASSIFIER___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.CLASSIFIER___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.CLASSIFIER___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.CLASSIFIER___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.CLASSIFIER___GET_ALL_ATTRIBUTES: return FramewebPackage.FORM_COMPONENT___GET_ALL_ATTRIBUTES;
				case UMLPackage.CLASSIFIER___GET_ALL_OPERATIONS: return FramewebPackage.FORM_COMPONENT___GET_ALL_OPERATIONS;
				case UMLPackage.CLASSIFIER___GET_ALL_USED_INTERFACES: return FramewebPackage.FORM_COMPONENT___GET_ALL_USED_INTERFACES;
				case UMLPackage.CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST: return FramewebPackage.FORM_COMPONENT___GET_OPERATION__STRING_ELIST_ELIST;
				case UMLPackage.CLASSIFIER___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN: return FramewebPackage.FORM_COMPONENT___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;
				case UMLPackage.CLASSIFIER___GET_OPERATIONS: return FramewebPackage.FORM_COMPONENT___GET_OPERATIONS;
				case UMLPackage.CLASSIFIER___GET_USED_INTERFACES: return FramewebPackage.FORM_COMPONENT___GET_USED_INTERFACES;
				case UMLPackage.CLASSIFIER___ALL_FEATURES: return FramewebPackage.FORM_COMPONENT___ALL_FEATURES;
				case UMLPackage.CLASSIFIER___ALL_PARENTS: return FramewebPackage.FORM_COMPONENT___ALL_PARENTS;
				case UMLPackage.CLASSIFIER___GET_GENERALS: return FramewebPackage.FORM_COMPONENT___GET_GENERALS;
				case UMLPackage.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT: return FramewebPackage.FORM_COMPONENT___HAS_VISIBILITY_OF__NAMEDELEMENT;
				case UMLPackage.CLASSIFIER___INHERIT__ELIST: return FramewebPackage.FORM_COMPONENT___INHERIT__ELIST;
				case UMLPackage.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER: return FramewebPackage.FORM_COMPONENT___INHERITABLE_MEMBERS__CLASSIFIER;
				case UMLPackage.CLASSIFIER___GET_INHERITED_MEMBERS: return FramewebPackage.FORM_COMPONENT___GET_INHERITED_MEMBERS;
				case UMLPackage.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER: return FramewebPackage.FORM_COMPONENT___MAY_SPECIALIZE_TYPE__CLASSIFIER;
				case UMLPackage.CLASSIFIER___PARENTS: return FramewebPackage.FORM_COMPONENT___PARENTS;
				case UMLPackage.CLASSIFIER___DIRECTLY_REALIZED_INTERFACES: return FramewebPackage.FORM_COMPONENT___DIRECTLY_REALIZED_INTERFACES;
				case UMLPackage.CLASSIFIER___DIRECTLY_USED_INTERFACES: return FramewebPackage.FORM_COMPONENT___DIRECTLY_USED_INTERFACES;
				case UMLPackage.CLASSIFIER___ALL_REALIZED_INTERFACES: return FramewebPackage.FORM_COMPONENT___ALL_REALIZED_INTERFACES;
				case UMLPackage.CLASSIFIER___ALL_USED_INTERFACES: return FramewebPackage.FORM_COMPONENT___ALL_USED_INTERFACES;
				case UMLPackage.CLASSIFIER___IS_SUBSTITUTABLE_FOR__CLASSIFIER: return FramewebPackage.FORM_COMPONENT___IS_SUBSTITUTABLE_FOR__CLASSIFIER;
				case UMLPackage.CLASSIFIER___ALL_ATTRIBUTES: return FramewebPackage.FORM_COMPONENT___ALL_ATTRIBUTES;
				case UMLPackage.CLASSIFIER___ALL_SLOTTABLE_FEATURES: return FramewebPackage.FORM_COMPONENT___ALL_SLOTTABLE_FEATURES;
				default: return -1;
			}
		}
		if (baseClass == StructuredClassifier.class) {
			switch (baseOperationID) {
				case UMLPackage.STRUCTURED_CLASSIFIER___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT: return FramewebPackage.FORM_COMPONENT___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;
				case UMLPackage.STRUCTURED_CLASSIFIER___GET_PARTS: return FramewebPackage.FORM_COMPONENT___GET_PARTS;
				case UMLPackage.STRUCTURED_CLASSIFIER___ALL_ROLES: return FramewebPackage.FORM_COMPONENT___ALL_ROLES;
				default: return -1;
			}
		}
		if (baseClass == EncapsulatedClassifier.class) {
			switch (baseOperationID) {
				case UMLPackage.ENCAPSULATED_CLASSIFIER___GET_OWNED_PORTS: return FramewebPackage.FORM_COMPONENT___GET_OWNED_PORTS;
				default: return -1;
			}
		}
		if (baseClass == BehavioredClassifier.class) {
			switch (baseOperationID) {
				case UMLPackage.BEHAVIORED_CLASSIFIER___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.BEHAVIORED_CLASSIFIER___GET_ALL_IMPLEMENTED_INTERFACES: return FramewebPackage.FORM_COMPONENT___GET_ALL_IMPLEMENTED_INTERFACES;
				case UMLPackage.BEHAVIORED_CLASSIFIER___GET_IMPLEMENTED_INTERFACES: return FramewebPackage.FORM_COMPONENT___GET_IMPLEMENTED_INTERFACES;
				default: return -1;
			}
		}
		if (baseClass == org.eclipse.uml2.uml.Class.class) {
			switch (baseOperationID) {
				case UMLPackage.CLASS___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP: return FramewebPackage.FORM_COMPONENT___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP;
				case UMLPackage.CLASS___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE: return FramewebPackage.FORM_COMPONENT___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;
				case UMLPackage.CLASS___IS_METACLASS: return FramewebPackage.FORM_COMPONENT___IS_METACLASS;
				case UMLPackage.CLASS___GET_EXTENSIONS: return FramewebPackage.FORM_COMPONENT___GET_EXTENSIONS;
				case UMLPackage.CLASS___GET_SUPER_CLASSES: return FramewebPackage.FORM_COMPONENT___GET_SUPER_CLASSES;
				default: return -1;
			}
		}
		if (baseClass == Tag.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == FrameworkTag.class) {
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
			case FramewebPackage.FORM_COMPONENT___VALIDATE_PASSIVE_CLASS__DIAGNOSTICCHAIN_MAP:
				return validatePassiveClass((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE:
				return createOwnedOperation((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Type>)arguments.get(2), (Type)arguments.get(3));
			case FramewebPackage.FORM_COMPONENT___IS_METACLASS:
				return isMetaclass();
			case FramewebPackage.FORM_COMPONENT___VALIDATE_CLASS_BEHAVIOR__DIAGNOSTICCHAIN_MAP:
				return validateClassBehavior((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___GET_ALL_IMPLEMENTED_INTERFACES:
				return getAllImplementedInterfaces();
			case FramewebPackage.FORM_COMPONENT___GET_IMPLEMENTED_INTERFACES:
				return getImplementedInterfaces();
			case FramewebPackage.FORM_COMPONENT___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT:
				return createOwnedAttribute((String)arguments.get(0), (Type)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case FramewebPackage.FORM_COMPONENT___ALL_ROLES:
				return allRoles();
			case FramewebPackage.FORM_COMPONENT___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP:
				return validateSpecializeType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP:
				return validateMapsToGeneralizationSet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP:
				return validateNonFinalParents((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
				return validateNoCyclesInGeneralization((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___GET_ALL_ATTRIBUTES:
				return getAllAttributes();
			case FramewebPackage.FORM_COMPONENT___GET_ALL_OPERATIONS:
				return getAllOperations();
			case FramewebPackage.FORM_COMPONENT___GET_ALL_USED_INTERFACES:
				return getAllUsedInterfaces();
			case FramewebPackage.FORM_COMPONENT___GET_OPERATION__STRING_ELIST_ELIST:
				return getOperation((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Type>)arguments.get(2));
			case FramewebPackage.FORM_COMPONENT___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN:
				return getOperation((String)arguments.get(0), (EList<String>)arguments.get(1), (EList<Type>)arguments.get(2), (Boolean)arguments.get(3));
			case FramewebPackage.FORM_COMPONENT___GET_OPERATIONS:
				return getOperations();
			case FramewebPackage.FORM_COMPONENT___GET_USED_INTERFACES:
				return getUsedInterfaces();
			case FramewebPackage.FORM_COMPONENT___ALL_FEATURES:
				return allFeatures();
			case FramewebPackage.FORM_COMPONENT___ALL_PARENTS:
				return allParents();
			case FramewebPackage.FORM_COMPONENT___HAS_VISIBILITY_OF__NAMEDELEMENT:
				return hasVisibilityOf((NamedElement)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___INHERIT__ELIST:
				return inherit((EList<NamedElement>)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___INHERITABLE_MEMBERS__CLASSIFIER:
				return inheritableMembers((Classifier)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___MAY_SPECIALIZE_TYPE__CLASSIFIER:
				return maySpecializeType((Classifier)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___PARENTS:
				return parents();
			case FramewebPackage.FORM_COMPONENT___DIRECTLY_REALIZED_INTERFACES:
				return directlyRealizedInterfaces();
			case FramewebPackage.FORM_COMPONENT___DIRECTLY_USED_INTERFACES:
				return directlyUsedInterfaces();
			case FramewebPackage.FORM_COMPONENT___ALL_REALIZED_INTERFACES:
				return allRealizedInterfaces();
			case FramewebPackage.FORM_COMPONENT___ALL_USED_INTERFACES:
				return allUsedInterfaces();
			case FramewebPackage.FORM_COMPONENT___IS_SUBSTITUTABLE_FOR__CLASSIFIER:
				return isSubstitutableFor((Classifier)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___ALL_ATTRIBUTES:
				return allAttributes();
			case FramewebPackage.FORM_COMPONENT___ALL_SLOTTABLE_FEATURES:
				return allSlottableFeatures();
			case FramewebPackage.FORM_COMPONENT___IS_TEMPLATE:
				return isTemplate();
			case FramewebPackage.FORM_COMPONENT___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case FramewebPackage.FORM_COMPONENT___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT:
				return createAssociation((Boolean)arguments.get(0), (AggregationKind)arguments.get(1), (String)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4), (Type)arguments.get(5), (Boolean)arguments.get(6), (AggregationKind)arguments.get(7), (String)arguments.get(8), (Integer)arguments.get(9), (Integer)arguments.get(10));
			case FramewebPackage.FORM_COMPONENT___GET_ASSOCIATIONS:
				return getAssociations();
			case FramewebPackage.FORM_COMPONENT___CONFORMS_TO__TYPE:
				return conformsTo((Type)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP:
				return validateNamespaceNeedsVisibility((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP:
				return validateMembersDistinguishable((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP:
				return validateCannotImportSelf((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP:
				return validateCannotImportOwnedMembers((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND:
				return createElementImport((PackageableElement)arguments.get(0), (VisibilityKind)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND:
				return createPackageImport((org.eclipse.uml2.uml.Package)arguments.get(0), (VisibilityKind)arguments.get(1));
			case FramewebPackage.FORM_COMPONENT___GET_IMPORTED_ELEMENTS:
				return getImportedElements();
			case FramewebPackage.FORM_COMPONENT___GET_IMPORTED_PACKAGES:
				return getImportedPackages();
			case FramewebPackage.FORM_COMPONENT___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<PackageableElement>)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___GET_NAMES_OF_MEMBER__NAMEDELEMENT:
				return getNamesOfMember((NamedElement)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___IMPORT_MEMBERS__ELIST:
				return importMembers((EList<PackageableElement>)arguments.get(0));
			case FramewebPackage.FORM_COMPONENT___MEMBERS_ARE_DISTINGUISHABLE:
				return membersAreDistinguishable();
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(", isFinalSpecialization: ");
		result.append(isFinalSpecialization);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(')');
		return result.toString();
	}

} //FormComponentImpl

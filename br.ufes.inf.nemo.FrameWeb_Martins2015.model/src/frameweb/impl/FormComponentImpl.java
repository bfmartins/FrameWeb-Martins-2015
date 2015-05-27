/**
 */
package frameweb.impl;

import java.util.Map;

import frameweb.FrameworkTag; //*********************************************** linha adicionada
import frameweb.FramewebPackage;
import frameweb.IOParameter;
import frameweb.Tag;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

//************************** imports adicionados para o tipo Tag
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageImport;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Reception;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.Substitution;
import org.eclipse.uml2.uml.TemplateBinding;
import org.eclipse.uml2.uml.TemplateSignature;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UseCase;
import org.eclipse.uml2.uml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Form Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FormComponentImpl#getInject <em>Inject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FormComponentImpl extends NavigationAttributeImpl implements FrameworkTag {
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
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
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
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
			case FramewebPackage.FORM_COMPONENT__INJECT:
				return inject != null;
		}
		return super.eIsSet(featureID);
	}

	//*************************** inicio dos métodos adicionados para o tipo Tag	

	@Override
	public EList<Tag> getSubTag() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Operation> getOwnedOperations() {
		// TODO Auto-generated method stub
		return null;
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
	public EList<Classifier> getNestedClassifiers() {
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
	public EList<Class> getSuperClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getSuperClass(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class getSuperClass(String name, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsActive(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<Reception> getOwnedReceptions() {
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
	public EList<Extension> getExtensions() {
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
	public boolean validatePassiveClass(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Operation createOwnedOperation(String name,
			EList<String> parameterNames, EList<Type> parameterTypes,
			Type returnType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMetaclass() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Port> getOwnedPorts() {
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
	public EList<Property> getOwnedAttributes() {
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
	public EList<Property> getParts() {
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
	public EList<ConnectableElement> getRoles() {
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
	public EList<Connector> getOwnedConnectors() {
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
	public Property createOwnedAttribute(String name, Type type, int lower,
			int upper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<ConnectableElement> allRoles() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAbstract() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsAbstract(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isFinalSpecialization() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setIsFinalSpecialization(boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EList<Generalization> getGeneralizations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<GeneralizationSet> getPowertypeExtents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneralizationSet getPowertypeExtent(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GeneralizationSet getPowertypeExtent(String name, boolean ignoreCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Feature> getFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feature getFeature(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Feature getFeature(String name, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<NamedElement> getInheritedMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamedElement getInheritedMember(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamedElement getInheritedMember(String name, boolean ignoreCase,
			EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Classifier> getRedefinedClassifiers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getRedefinedClassifier(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getRedefinedClassifier(String name, boolean ignoreCase,
			EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Classifier> getGenerals() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getGeneral(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Classifier getGeneral(String name, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<UseCase> getOwnedUseCases() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UseCase createOwnedUseCase(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UseCase getOwnedUseCase(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UseCase getOwnedUseCase(String name, boolean ignoreCase,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<UseCase> getUseCases() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UseCase getUseCase(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UseCase getUseCase(String name, boolean ignoreCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Substitution> getSubstitutions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Substitution createSubstitution(String name, Classifier contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Substitution getSubstitution(String name, Classifier contract) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Substitution getSubstitution(String name, Classifier contract,
			boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Property> getAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getAttribute(String name, Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Property getAttribute(String name, Type type, boolean ignoreCase,
			EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollaborationUse getRepresentation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setRepresentation(CollaborationUse value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CollaborationUse createRepresentation(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<CollaborationUse> getCollaborationUses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollaborationUse createCollaborationUse(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollaborationUse getCollaborationUse(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CollaborationUse getCollaborationUse(String name,
			boolean ignoreCase, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateNoCyclesInGeneralization(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateSpecializeType(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateMapsToGeneralizationSet(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateNonFinalParents(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Generalization createGeneralization(Classifier general) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Generalization getGeneralization(Classifier general) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Generalization getGeneralization(Classifier general,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Property> getAllAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Operation> getOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Operation> getAllOperations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Operation getOperation(String name, EList<String> parameterNames,
			EList<Type> parameterTypes, boolean ignoreCase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Interface> getUsedInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Interface> getAllUsedInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean maySpecializeType(Classifier c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Feature> allFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Classifier> parents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Interface> directlyRealizedInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Interface> directlyUsedInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Interface> allRealizedInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Interface> allUsedInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isSubstitutableFor(Classifier contract) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Property> allAttributes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<StructuralFeature> allSlottableFeatures() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<NamedElement> inheritableMembers(Classifier c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasVisibilityOf(NamedElement n) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<NamedElement> inherit(EList<NamedElement> inhs) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Classifier> allParents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<ElementImport> getElementImports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElementImport createElementImport(PackageableElement importedElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElementImport getElementImport(PackageableElement importedElement) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ElementImport getElementImport(PackageableElement importedElement,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<PackageImport> getPackageImports() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageImport createPackageImport(Package importedPackage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageImport getPackageImport(Package importedPackage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageImport getPackageImport(Package importedPackage,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Constraint> getOwnedRules() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Constraint createOwnedRule(String name, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Constraint createOwnedRule(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Constraint getOwnedRule(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Constraint getOwnedRule(String name, boolean ignoreCase,
			EClass eClass, boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<NamedElement> getMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamedElement getMember(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamedElement getMember(String name, boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<PackageableElement> getImportedMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageableElement getImportedMember(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageableElement getImportedMember(String name,
			boolean ignoreCase, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<NamedElement> getOwnedMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamedElement getOwnedMember(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NamedElement getOwnedMember(String name, boolean ignoreCase,
			EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean validateMembersDistinguishable(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateCannotImportSelf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateCannotImportOwnedMembers(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ElementImport createElementImport(PackageableElement element,
			VisibilityKind visibility) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PackageImport createPackageImport(Package package_,
			VisibilityKind visibility) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<PackageableElement> getImportedElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Package> getImportedPackages() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<String> getNamesOfMember(NamedElement element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean membersAreDistinguishable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<PackageableElement> importMembers(
			EList<PackageableElement> imps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<PackageableElement> excludeCollisions(
			EList<PackageableElement> imps) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Package getPackage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPackage(Package value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Association createAssociation(boolean end1IsNavigable,
			AggregationKind end1Aggregation, String end1Name, int end1Lower,
			int end1Upper, Type end1Type, boolean end2IsNavigable,
			AggregationKind end2Aggregation, String end2Name, int end2Lower,
			int end2Upper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Association> getAssociations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean conformsTo(Type other) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateNamespaceNeedsVisibility(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<TemplateBinding> getTemplateBindings() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TemplateBinding createTemplateBinding(TemplateSignature signature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TemplateBinding getTemplateBinding(TemplateSignature signature) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TemplateBinding getTemplateBinding(TemplateSignature signature,
			boolean createOnDemand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TemplateSignature getOwnedTemplateSignature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOwnedTemplateSignature(TemplateSignature value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TemplateSignature createOwnedTemplateSignature(EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TemplateSignature createOwnedTemplateSignature() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<ParameterableElement> parameterableElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTemplate() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Behavior> getOwnedBehaviors() {
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
	public Behavior getClassifierBehavior() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClassifierBehavior(Behavior value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Behavior createClassifierBehavior(String name, EClass eClass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<InterfaceRealization> getInterfaceRealizations() {
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

	@Override
	public boolean validateClassBehavior(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EList<Interface> getImplementedInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EList<Interface> getAllImplementedInterfaces() {
		// TODO Auto-generated method stub
		return null;
	}

} //FormComponentImpl

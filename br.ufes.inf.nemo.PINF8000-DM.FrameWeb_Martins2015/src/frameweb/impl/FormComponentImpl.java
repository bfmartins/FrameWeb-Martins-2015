/**
 */
package frameweb.impl;

import frameweb.FormComponent;
import frameweb.FramewebPackage;
import frameweb.FrameworkTag;
import frameweb.IOParameter;
import frameweb.Tag;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

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
	@SuppressWarnings("unchecked")
	public EList<Constraint> getOwnedRules() {
		return (EList<Constraint>)eGet(UMLPackage.Literals.NAMESPACE__OWNED_RULE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ElementImport> getElementImports() {
		return (EList<ElementImport>)eGet(UMLPackage.Literals.NAMESPACE__ELEMENT_IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageImport> getPackageImports() {
		return (EList<PackageImport>)eGet(UMLPackage.Literals.NAMESPACE__PACKAGE_IMPORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedElement> getOwnedMembers() {
		return (EList<NamedElement>)eGet(UMLPackage.Literals.NAMESPACE__OWNED_MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<PackageableElement> getImportedMembers() {
		return (EList<PackageableElement>)eGet(UMLPackage.Literals.NAMESPACE__IMPORTED_MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedElement> getMembers() {
		return (EList<NamedElement>)eGet(UMLPackage.Literals.NAMESPACE__MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getPackage() {
		return (org.eclipse.uml2.uml.Package)eGet(UMLPackage.Literals.TYPE__PACKAGE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(org.eclipse.uml2.uml.Package newPackage) {
		eSet(UMLPackage.Literals.TYPE__PACKAGE, newPackage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TemplateBinding> getTemplateBindings() {
		return (EList<TemplateBinding>)eGet(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return (TemplateSignature)eGet(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		eSet(UMLPackage.Literals.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Feature> getFeatures() {
		return (EList<Feature>)eGet(UMLPackage.Literals.CLASSIFIER__FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getAttributes() {
		return (EList<Property>)eGet(UMLPackage.Literals.CLASSIFIER__ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CollaborationUse> getCollaborationUses() {
		return (EList<CollaborationUse>)eGet(UMLPackage.Literals.CLASSIFIER__COLLABORATION_USE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getGenerals() {
		return (EList<Classifier>)eGet(UMLPackage.Literals.CLASSIFIER__GENERAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Generalization> getGeneralizations() {
		return (EList<Generalization>)eGet(UMLPackage.Literals.CLASSIFIER__GENERALIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<GeneralizationSet> getPowertypeExtents() {
		return (EList<GeneralizationSet>)eGet(UMLPackage.Literals.CLASSIFIER__POWERTYPE_EXTENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<NamedElement> getInheritedMembers() {
		return (EList<NamedElement>)eGet(UMLPackage.Literals.CLASSIFIER__INHERITED_MEMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return (Boolean)eGet(UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		eSet(UMLPackage.Literals.CLASSIFIER__IS_ABSTRACT, newIsAbstract);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFinalSpecialization() {
		return (Boolean)eGet(UMLPackage.Literals.CLASSIFIER__IS_FINAL_SPECIALIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalSpecialization(boolean newIsFinalSpecialization) {
		eSet(UMLPackage.Literals.CLASSIFIER__IS_FINAL_SPECIALIZATION, newIsFinalSpecialization);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UseCase> getOwnedUseCases() {
		return (EList<UseCase>)eGet(UMLPackage.Literals.CLASSIFIER__OWNED_USE_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<UseCase> getUseCases() {
		return (EList<UseCase>)eGet(UMLPackage.Literals.CLASSIFIER__USE_CASE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getRedefinedClassifiers() {
		return (EList<Classifier>)eGet(UMLPackage.Literals.CLASSIFIER__REDEFINED_CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		return (CollaborationUse)eGet(UMLPackage.Literals.CLASSIFIER__REPRESENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		eSet(UMLPackage.Literals.CLASSIFIER__REPRESENTATION, newRepresentation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Substitution> getSubstitutions() {
		return (EList<Substitution>)eGet(UMLPackage.Literals.CLASSIFIER__SUBSTITUTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getOwnedAttributes() {
		return (EList<Property>)eGet(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_ATTRIBUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Connector> getOwnedConnectors() {
		return (EList<Connector>)eGet(UMLPackage.Literals.STRUCTURED_CLASSIFIER__OWNED_CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Property> getParts() {
		return (EList<Property>)eGet(UMLPackage.Literals.STRUCTURED_CLASSIFIER__PART, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<ConnectableElement> getRoles() {
		return (EList<ConnectableElement>)eGet(UMLPackage.Literals.STRUCTURED_CLASSIFIER__ROLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Port> getOwnedPorts() {
		return (EList<Port>)eGet(UMLPackage.Literals.ENCAPSULATED_CLASSIFIER__OWNED_PORT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getClassifierBehavior() {
		return (Behavior)eGet(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassifierBehavior(Behavior newClassifierBehavior) {
		eSet(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__CLASSIFIER_BEHAVIOR, newClassifierBehavior);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<InterfaceRealization> getInterfaceRealizations() {
		return (EList<InterfaceRealization>)eGet(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__INTERFACE_REALIZATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Behavior> getOwnedBehaviors() {
		return (EList<Behavior>)eGet(UMLPackage.Literals.BEHAVIORED_CLASSIFIER__OWNED_BEHAVIOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Operation> getOwnedOperations() {
		return (EList<Operation>)eGet(UMLPackage.Literals.CLASS__OWNED_OPERATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Extension> getExtensions() {
		return (EList<Extension>)eGet(UMLPackage.Literals.CLASS__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return (Boolean)eGet(UMLPackage.Literals.CLASS__IS_ACTIVE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		eSet(UMLPackage.Literals.CLASS__IS_ACTIVE, newIsActive);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Classifier> getNestedClassifiers() {
		return (EList<Classifier>)eGet(UMLPackage.Literals.CLASS__NESTED_CLASSIFIER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Reception> getOwnedReceptions() {
		return (EList<Reception>)eGet(UMLPackage.Literals.CLASS__OWNED_RECEPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<org.eclipse.uml2.uml.Class> getSuperClasses() {
		return (EList<org.eclipse.uml2.uml.Class>)eGet(UMLPackage.Literals.CLASS__SUPER_CLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Tag> getSubTag() {
		return (EList<Tag>)eGet(FramewebPackage.Literals.TAG__SUB_TAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter getInject() {
		return (IOParameter)eGet(FramewebPackage.Literals.FORM_COMPONENT__INJECT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInject(IOParameter newInject) {
		eSet(FramewebPackage.Literals.FORM_COMPONENT__INJECT, newInject);
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

} //FormComponentImpl

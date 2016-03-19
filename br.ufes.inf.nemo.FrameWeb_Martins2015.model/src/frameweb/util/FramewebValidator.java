/**
 */
package frameweb.util;

import frameweb.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.util.UMLValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see frameweb.FramewebPackage
 * @generated
 */
public class FramewebValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final FramewebValidator INSTANCE = new FramewebValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "frameweb";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UMLValidator umlValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebValidator() {
		super();
		umlValidator = UMLValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return FramewebPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case FramewebPackage.FRAMEWEB:
				return validateFrameweb((Frameweb)value, diagnostics, context);
			case FramewebPackage.FRAME_WEB_MODEL:
				return validateFrameWebModel((FrameWebModel)value, diagnostics, context);
			case FramewebPackage.FRAMEWORK_PROFILE:
				return validateFrameworkProfile((FrameworkProfile)value, diagnostics, context);
			case FramewebPackage.DOMAIN_MODEL:
				return validateDomainModel((DomainModel)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_MODEL:
				return validateNavigationModel((NavigationModel)value, diagnostics, context);
			case FramewebPackage.APPLICATION_MODEL:
				return validateApplicationModel((ApplicationModel)value, diagnostics, context);
			case FramewebPackage.PERSISTENCE_MODEL:
				return validatePersistenceModel((PersistenceModel)value, diagnostics, context);
			case FramewebPackage.DOMAIN_ASSOCIATION:
				return validateDomainAssociation((DomainAssociation)value, diagnostics, context);
			case FramewebPackage.DOMAIN_ATTRIBUTE:
				return validateDomainAttribute((DomainAttribute)value, diagnostics, context);
			case FramewebPackage.VERSION_ATTRIBUTE:
				return validateVersionAttribute((VersionAttribute)value, diagnostics, context);
			case FramewebPackage.ID_ATTRIBUTE:
				return validateIdAttribute((IdAttribute)value, diagnostics, context);
			case FramewebPackage.LOB_ATTRIBUTE:
				return validateLOBAttribute((LOBAttribute)value, diagnostics, context);
			case FramewebPackage.EMBEDDED_ATTRIBUTE:
				return validateEmbeddedAttribute((EmbeddedAttribute)value, diagnostics, context);
			case FramewebPackage.DECIMAL_ATTRIBUTE:
				return validateDecimalAttribute((DecimalAttribute)value, diagnostics, context);
			case FramewebPackage.DATE_TIME_ATTRIBUTE:
				return validateDateTimeAttribute((DateTimeAttribute)value, diagnostics, context);
			case FramewebPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case FramewebPackage.TEMPLATE:
				return validateTemplate((Template)value, diagnostics, context);
			case FramewebPackage.DAO_INTERFACE:
				return validateDAOInterface((DAOInterface)value, diagnostics, context);
			case FramewebPackage.DAO_CLASS:
				return validateDAOClass((DAOClass)value, diagnostics, context);
			case FramewebPackage.DAO_REALIZATION:
				return validateDAORealization((DAORealization)value, diagnostics, context);
			case FramewebPackage.FRONT_CONTROLLER_CLASS:
				return validateFrontControllerClass((FrontControllerClass)value, diagnostics, context);
			case FramewebPackage.IO_PARAMETER:
				return validateIOParameter((IOParameter)value, diagnostics, context);
			case FramewebPackage.RESULT_DEPENDENCY:
				return validateResultDependency((ResultDependency)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_ASSOCIATION:
				return validateNavigationAssociation((NavigationAssociation)value, diagnostics, context);
			case FramewebPackage.FRONT_CONTROLLER_METHOD:
				return validateFrontControllerMethod((FrontControllerMethod)value, diagnostics, context);
			case FramewebPackage.SERVICE_CLASS:
				return validateServiceClass((ServiceClass)value, diagnostics, context);
			case FramewebPackage.SERVICE_INTERFACE:
				return validateServiceInterface((ServiceInterface)value, diagnostics, context);
			case FramewebPackage.SERVICE_GENERALIZATION:
				return validateServiceGeneralization((ServiceGeneralization)value, diagnostics, context);
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION:
				return validateServiceControllerAssociation((ServiceControllerAssociation)value, diagnostics, context);
			case FramewebPackage.DOMAIN_CLASS:
				return validateDomainClass((DomainClass)value, diagnostics, context);
			case FramewebPackage.CONSTANT_NAME:
				return validateConstantName((ConstantName)value, diagnostics, context);
			case FramewebPackage.DOMAIN_TABLE_NAME:
				return validateDomainTableName((DomainTableName)value, diagnostics, context);
			case FramewebPackage.DOMAIN_COLUMN_NAME:
				return validateDomainColumnName((DomainColumnName)value, diagnostics, context);
			case FramewebPackage.DAO_INTERFACE_NAME:
				return validateDAOInterfaceName((DAOInterfaceName)value, diagnostics, context);
			case FramewebPackage.DAO_CLASS_NAME:
				return validateDAOClassName((DAOClassName)value, diagnostics, context);
			case FramewebPackage.RESULT:
				return validateResult((Result)value, diagnostics, context);
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY:
				return validateFrontControllerDependency((FrontControllerDependency)value, diagnostics, context);
			case FramewebPackage.PAGE_DEPENDENCY:
				return validatePageDependency((PageDependency)value, diagnostics, context);
			case FramewebPackage.CHAINING_DEPENDENCY:
				return validateChainingDependency((ChainingDependency)value, diagnostics, context);
			case FramewebPackage.DAO_SERVICE_ASSOCIATION:
				return validateDAOServiceAssociation((DAOServiceAssociation)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_ATTRIBUTE:
				return validateNavigationAttribute((NavigationAttribute)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_CLASS:
				return validateNavigationClass((NavigationClass)value, diagnostics, context);
			case FramewebPackage.DOMAIN_METHOD:
				return validateDomainMethod((DomainMethod)value, diagnostics, context);
			case FramewebPackage.DAO_ATTRIBUTE:
				return validateDAOAttribute((DAOAttribute)value, diagnostics, context);
			case FramewebPackage.SERVICE_OPERATION:
				return validateServiceOperation((ServiceOperation)value, diagnostics, context);
			case FramewebPackage.SERVICE_ATTRIBUTE:
				return validateServiceAttribute((ServiceAttribute)value, diagnostics, context);
			case FramewebPackage.SERVICE_ASSOCIATION:
				return validateServiceAssociation((ServiceAssociation)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_DEPENDENCY:
				return validateNavigationDependency((NavigationDependency)value, diagnostics, context);
			case FramewebPackage.DAO_METHOD:
				return validateDAOMethod((DAOMethod)value, diagnostics, context);
			case FramewebPackage.DOMAIN_PACKAGE:
				return validateDomainPackage((DomainPackage)value, diagnostics, context);
			case FramewebPackage.VIEW_PACKAGE:
				return validateViewPackage((ViewPackage)value, diagnostics, context);
			case FramewebPackage.CONTROLLER_PACKAGE:
				return validateControllerPackage((ControllerPackage)value, diagnostics, context);
			case FramewebPackage.PERSISTENCE_PACKAGE:
				return validatePersistencePackage((PersistencePackage)value, diagnostics, context);
			case FramewebPackage.APPLICATION_PACKAGE:
				return validateApplicationPackage((ApplicationPackage)value, diagnostics, context);
			case FramewebPackage.UI_COMPONENT:
				return validateUIComponent((UIComponent)value, diagnostics, context);
			case FramewebPackage.RESULT_TYPE:
				return validateResultType((ResultType)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_PACKAGE:
				return validateNavigationPackage((NavigationPackage)value, diagnostics, context);
			case FramewebPackage.DOMAIN_GENERALIZATION:
				return validateDomainGeneralization((DomainGeneralization)value, diagnostics, context);
			case FramewebPackage.JQUERY:
				return validateJQuery((JQuery)value, diagnostics, context);
			case FramewebPackage.UI_COMPONENT_FIELD:
				return validateUIComponentField((UIComponent)value, diagnostics, context);
			case FramewebPackage.TAG_LIB:
				return validateTagLib((TagLib)value, diagnostics, context);
			case FramewebPackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_COMPOSITION_PART:
				return validateNavigationCompositionPart((NavigationCompositionPart)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_COMPOSITION_WHOLE:
				return validateNavigationCompositionWhole((NavigationCompositionWhole)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_PROPERTY:
				return validateNavigationProperty((NavigationProperty)value, diagnostics, context);
			case FramewebPackage.RESULT_SET:
				return validateResultSet((ResultSet)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_CONSTRAINT:
				return validateNavigationConstraint((NavigationConstraint)value, diagnostics, context);
			case FramewebPackage.PAGE_CONSTRAINT:
				return validatePageConstraint((PageConstraint)value, diagnostics, context);
			case FramewebPackage.RESULT_CONSTRAINT:
				return validateResultConstraint((ResultConstraint)value, diagnostics, context);
			case FramewebPackage.METHOD_COSNTRAINT:
				return validateMethodCosntraint((MethodCosntraint)value, diagnostics, context);
			case FramewebPackage.CHAINING_CONSTRAINT:
				return validateChainingConstraint((ChainingConstraint)value, diagnostics, context);
			case FramewebPackage.NAVIGATION_GENERALIZATION:
				return validateNavigationGeneralization((NavigationGeneralization)value, diagnostics, context);
			case FramewebPackage.DOMAIN_CONSTRAINTS:
				return validateDomainConstraints((DomainConstraints)value, diagnostics, context);
			case FramewebPackage.DOMAIN_PROPERTY:
				return validateDomainProperty((DomainProperty)value, diagnostics, context);
			case FramewebPackage.DAO_GENERALIZATION:
				return validateDAOGeneralization((DAOGeneralization)value, diagnostics, context);
			case FramewebPackage.MAPPING_LIB:
				return validateMappingLib((MappingLib)value, diagnostics, context);
			case FramewebPackage.CLASS_MAPPING:
				return validateClassMapping((ClassMapping)value, diagnostics, context);
			case FramewebPackage.ATTRIBUTE_MAPPING:
				return validateAttributeMapping((AttributeMapping)value, diagnostics, context);
			case FramewebPackage.DOMAIN_GENERALIZATION_SET:
				return validateDomainGeneralizationSet((DomainGeneralizationSet)value, diagnostics, context);
			case FramewebPackage.FRAMEWORK_EXTENSION:
				return validateFrameworkExtension((FrameworkExtension)value, diagnostics, context);
			case FramewebPackage.TAG_EXTENSION:
				return validateTagExtension((TagExtension)value, diagnostics, context);
			case FramewebPackage.FRAMEWORK:
				return validateFramework((Framework)value, diagnostics, context);
			case FramewebPackage.CONTROLLER_EXTENSION:
				return validateControllerExtension((ControllerExtension)value, diagnostics, context);
			case FramewebPackage.CONTROLLER:
				return validateController((Controller)value, diagnostics, context);
			case FramewebPackage.CONTROLLER_SET:
				return validateControllerSet((ControllerSet)value, diagnostics, context);
			case FramewebPackage.RESULT_EXTENSION:
				return validateResultExtension((ResultExtension)value, diagnostics, context);
			case FramewebPackage.CLASS_MAPPING_EXTENSION:
				return validateClassMappingExtension((ClassMappingExtension)value, diagnostics, context);
			case FramewebPackage.ATTRIBUTE_MAPPING_EXTENSION:
				return validateAttributeMappingExtension((AttributeMappingExtension)value, diagnostics, context);
			case FramewebPackage.CONTROLLER_EXTENSION_END:
				return validateControllerExtensionEnd((ControllerExtensionEnd)value, diagnostics, context);
			case FramewebPackage.TAG_EXTENSION_END:
				return validateTagExtensionEnd((TagExtensionEnd)value, diagnostics, context);
			case FramewebPackage.REULT_EXTENSION_END:
				return validateReultExtensionEnd((ReultExtensionEnd)value, diagnostics, context);
			case FramewebPackage.CLASS_MAPPING_EXTENSION_END:
				return validateClassMappingExtensionEnd((ClassMappingExtensionEnd)value, diagnostics, context);
			case FramewebPackage.ATTRIBUTE_MAPPING_EXTENSION_END:
				return validateAttributeMappingExtensionEnd((AttributeMappingExtensionEnd)value, diagnostics, context);
			case FramewebPackage.CONTROLLER_PROPERTY:
				return validateControllerProperty((ControllerProperty)value, diagnostics, context);
			case FramewebPackage.TAG_PROPERTY:
				return validateTagProperty((TagProperty)value, diagnostics, context);
			case FramewebPackage.RESULT_PROPERTY:
				return validateResultProperty((ResultProperty)value, diagnostics, context);
			case FramewebPackage.CLASS_MAPPING_PROPERY:
				return validateClassMappingPropery((ClassMappingPropery)value, diagnostics, context);
			case FramewebPackage.ATTRIBUTE_MAPPING_PROPERTY:
				return validateAttributeMappingProperty((AttributeMappingProperty)value, diagnostics, context);
			case FramewebPackage.SEVICE_REALIZATION:
				return validateSeviceRealization((SeviceRealization)value, diagnostics, context);
			case FramewebPackage.DATE_TIME_PRECISION:
				return validateDateTimePrecision((DateTimePrecision)value, diagnostics, context);
			case FramewebPackage.GENERATION:
				return validateGeneration((Generation)value, diagnostics, context);
			case FramewebPackage.COLLECTION:
				return validateCollection((Collection)value, diagnostics, context);
			case FramewebPackage.ORDER:
				return validateOrder((Order)value, diagnostics, context);
			case FramewebPackage.CASCADE:
				return validateCascade((Cascade)value, diagnostics, context);
			case FramewebPackage.FETCH:
				return validateFetch((Fetch)value, diagnostics, context);
			case FramewebPackage.FRAMEWORK_CATEGORY_LIST:
				return validateFrameworkCategoryList((FrameworkCategoryList)value, diagnostics, context);
			case FramewebPackage.CONSTANT_NAME_LIST:
				return validateConstantNameList((ConstantNameList)value, diagnostics, context);
			case FramewebPackage.INHERITANCE_MAPPING:
				return validateInheritanceMapping((InheritanceMapping)value, diagnostics, context);
			case FramewebPackage.FRAMEWORK_KIND_LIST:
				return validateFrameworkKindList((FrameworkKindList)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameweb(Frameweb frameweb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(frameweb, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameWebModel(FrameWebModel frameWebModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(frameWebModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(frameWebModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(frameWebModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameworkProfile(FrameworkProfile frameworkProfile, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(frameworkProfile, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProfile_validateMetaclassReferenceNotSpecialized(frameworkProfile, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProfile_validateReferencesSameMetamodel(frameworkProfile, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainModel_DomainModelContent(domainModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateDomainModel_DomainModelMinimum(domainModel, diagnostics, context);
		return result;
	}

	/**
	 * Validates the DomainModelContent constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_DomainModelContent(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DomainModelContent", getObjectLabel(domainModel, context) },
						 new Object[] { domainModel },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the DomainModelMinimum constraint of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainModel_DomainModelMinimum(DomainModel domainModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "DomainModelMinimum", getObjectLabel(domainModel, context) },
						 new Object[] { domainModel },
						 context));
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
	public boolean validateNavigationModel(NavigationModel navigationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(navigationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(navigationModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationModel(ApplicationModel applicationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(applicationModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(applicationModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(applicationModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistenceModel(PersistenceModel persistenceModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(persistenceModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(persistenceModel, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(persistenceModel, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainAssociation(DomainAssociation domainAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(domainAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(domainAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainAttribute(DomainAttribute domainAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(domainAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(domainAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVersionAttribute(VersionAttribute versionAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(versionAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(versionAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(versionAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIdAttribute(IdAttribute idAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(idAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(idAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(idAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLOBAttribute(LOBAttribute lobAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(lobAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(lobAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(lobAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmbeddedAttribute(EmbeddedAttribute embeddedAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(embeddedAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(embeddedAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(embeddedAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDecimalAttribute(DecimalAttribute decimalAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(decimalAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(decimalAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(decimalAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimeAttribute(DateTimeAttribute dateTimeAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dateTimeAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(dateTimeAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(dateTimeAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(page, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(page, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(page, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTemplate(Template template, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(template, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(template, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(template, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(template, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(template, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(template, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(template, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(template, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(template, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(template, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOInterface(DAOInterface daoInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daoInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(daoInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateInterface_validateVisibility(daoInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOClass(DAOClass daoClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daoClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(daoClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(daoClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAORealization(DAORealization daoRealization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daoRealization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(daoRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(daoRealization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrontControllerClass(FrontControllerClass frontControllerClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(frontControllerClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(frontControllerClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(frontControllerClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIOParameter(IOParameter ioParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ioParameter, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(ioParameter, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(ioParameter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultDependency(ResultDependency resultDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(resultDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validateResultDependency_ResultDependencyConstraint(resultDependency, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ResultDependencyConstraint constraint of '<em>Result Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultDependency_ResultDependencyConstraint(ResultDependency resultDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "ResultDependencyConstraint", getObjectLabel(resultDependency, context) },
						 new Object[] { resultDependency },
						 context));
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
	public boolean validateNavigationAssociation(NavigationAssociation navigationAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(navigationAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validateNavigationAssociation_NavigationAssociationConstraint(navigationAssociation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NavigationAssociationConstraint constraint of '<em>Navigation Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationAssociation_NavigationAssociationConstraint(NavigationAssociation navigationAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NavigationAssociationConstraint", getObjectLabel(navigationAssociation, context) },
						 new Object[] { navigationAssociation },
						 context));
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
	public boolean validateFrontControllerMethod(FrontControllerMethod frontControllerMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(frontControllerMethod, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateBooleanValue(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNoSideEffects(frontControllerMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNotApplyToSelf(frontControllerMethod, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceClass(ServiceClass serviceClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(serviceClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(serviceClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceInterface(ServiceInterface serviceInterface, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceInterface, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(serviceInterface, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateInterface_validateVisibility(serviceInterface, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceGeneralization(ServiceGeneralization serviceGeneralization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceGeneralization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(serviceGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(serviceGeneralization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceControllerAssociation(ServiceControllerAssociation serviceControllerAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceControllerAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(serviceControllerAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(serviceControllerAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainClass(DomainClass domainClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(domainClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(domainClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantName(ConstantName constantName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constantName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainTableName(DomainTableName domainTableName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainTableName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainColumnName(DomainColumnName domainColumnName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(domainColumnName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOInterfaceName(DAOInterfaceName daoInterfaceName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daoInterfaceName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOClassName(DAOClassName daoClassName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(daoClassName, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResult(Result result, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(result, diagnostics, context)) return false;
		boolean theResult = validate_EveryMultiplicityConforms(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryDataValueConforms(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryReferenceIsContained(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryBidirectionalReferenceIsPaired(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryProxyResolves(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_UniqueID(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryKeyUnique(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= validate_EveryMapEntryUnique(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateElement_validateHasOwner(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateElement_validateNotOwnSelf(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateNamedElement_validateHasQualifiedName(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateNamedElement_validateHasNoQualifiedName(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateNamespace_validateMembersDistinguishable(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateNamespace_validateCannotImportSelf(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateClassifier_validateSpecializeType(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateClassifier_validateNonFinalParents(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateBehavioredClassifier_validateClassBehavior(result, diagnostics, context);
		if (theResult || diagnostics != null) theResult &= umlValidator.validateClass_validatePassiveClass(result, diagnostics, context);
		return theResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrontControllerDependency(FrontControllerDependency frontControllerDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(frontControllerDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(frontControllerDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(frontControllerDependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageDependency(PageDependency pageDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(pageDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(pageDependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChainingDependency(ChainingDependency chainingDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chainingDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(chainingDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(chainingDependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOServiceAssociation(DAOServiceAssociation daoServiceAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daoServiceAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(daoServiceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(daoServiceAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationAttribute(NavigationAttribute navigationAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(navigationAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(navigationAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationClass(NavigationClass navigationClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationClass, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(navigationClass, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(navigationClass, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainMethod(DomainMethod domainMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainMethod, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioralFeature_validateAbstractNoMethod(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateOperation_validateAtMostOneReturn(domainMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateOperation_validateOnlyBodyForQuery(domainMethod, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOAttribute(DAOAttribute daoAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daoAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(daoAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(daoAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceOperation(ServiceOperation serviceOperation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceOperation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioralFeature_validateAbstractNoMethod(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateOperation_validateAtMostOneReturn(serviceOperation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateOperation_validateOnlyBodyForQuery(serviceOperation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceAttribute(ServiceAttribute serviceAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceAttribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(serviceAttribute, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(serviceAttribute, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceAssociation(ServiceAssociation serviceAssociation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serviceAssociation, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(serviceAssociation, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(serviceAssociation, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationDependency(NavigationDependency navigationDependency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationDependency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationDependency, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(navigationDependency, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOMethod(DAOMethod daoMethod, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daoMethod, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioralFeature_validateAbstractNoMethod(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateOperation_validateAtMostOneReturn(daoMethod, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateOperation_validateOnlyBodyForQuery(daoMethod, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainPackage(DomainPackage domainPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(domainPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(domainPackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateViewPackage(ViewPackage viewPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(viewPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(viewPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(viewPackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerPackage(ControllerPackage controllerPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controllerPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(controllerPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(controllerPackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePersistencePackage(PersistencePackage persistencePackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(persistencePackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(persistencePackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(persistencePackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateApplicationPackage(ApplicationPackage applicationPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(applicationPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(applicationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(applicationPackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIComponent(UIComponent uiComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(uiComponent, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(uiComponent, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(uiComponent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultType(ResultType resultType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultType, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBinaryAssociationsOnly(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateGeneralize(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateNameNotClash(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateAssociationEndOwnership(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyUpperBound(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicitySingleExtension(resultType, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicityMultipleExtension(resultType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationPackage(NavigationPackage navigationPackage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationPackage, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(navigationPackage, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(navigationPackage, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainGeneralization(DomainGeneralization domainGeneralization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainGeneralization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainGeneralization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJQuery(JQuery jQuery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jQuery, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUIComponentField(UIComponent uiComponentField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment((EObject)uiComponentField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms((EObject)uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms((EObject)uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained((EObject)uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired((EObject)uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves((EObject)uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID((EObject)uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique((EObject)uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique((EObject)uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower((MultiplicityElement) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0((MultiplicityElement) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects((MultiplicityElement) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant((MultiplicityElement) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger((MultiplicityElement) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural((MultiplicityElement) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd((Property) uiComponentField, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd((Property) uiComponentField, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagLib(TagLib tagLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tagLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(tagLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(tagLib, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tag, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tag, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBinaryAssociationsOnly(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateGeneralize(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateNameNotClash(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateAssociationEndOwnership(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyUpperBound(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicitySingleExtension(tag, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicityMultipleExtension(tag, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationCompositionPart(NavigationCompositionPart navigationCompositionPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationCompositionPart, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(navigationCompositionPart, diagnostics, context);
		if (result || diagnostics != null) result &= validateNavigationCompositionPart_NavigationCompositionPartConstraint(navigationCompositionPart, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NavigationCompositionPartConstraint constraint of '<em>Navigation Composition Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationCompositionPart_NavigationCompositionPartConstraint(NavigationCompositionPart navigationCompositionPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NavigationCompositionPartConstraint", getObjectLabel(navigationCompositionPart, context) },
						 new Object[] { navigationCompositionPart },
						 context));
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
	public boolean validateNavigationCompositionWhole(NavigationCompositionWhole navigationCompositionWhole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationCompositionWhole, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(navigationCompositionWhole, diagnostics, context);
		if (result || diagnostics != null) result &= validateNavigationCompositionWhole_NavigationCompositionWholeConstraint(navigationCompositionWhole, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NavigationCompositionWholeConstraint constraint of '<em>Navigation Composition Whole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationCompositionWhole_NavigationCompositionWholeConstraint(NavigationCompositionWhole navigationCompositionWhole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "NavigationCompositionWholeConstraint", getObjectLabel(navigationCompositionWhole, context) },
						 new Object[] { navigationCompositionWhole },
						 context));
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
	public boolean validateNavigationProperty(NavigationProperty navigationProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(navigationProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(navigationProperty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultSet(ResultSet resultSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(resultSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(resultSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationConstraint(NavigationConstraint navigationConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateBooleanValue(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNoSideEffects(navigationConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNotApplyToSelf(navigationConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageConstraint(PageConstraint pageConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateBooleanValue(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNoSideEffects(pageConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNotApplyToSelf(pageConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultConstraint(ResultConstraint resultConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateBooleanValue(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNoSideEffects(resultConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNotApplyToSelf(resultConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodCosntraint(MethodCosntraint methodCosntraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(methodCosntraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateBooleanValue(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNoSideEffects(methodCosntraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNotApplyToSelf(methodCosntraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChainingConstraint(ChainingConstraint chainingConstraint, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(chainingConstraint, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateBooleanValue(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNoSideEffects(chainingConstraint, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNotApplyToSelf(chainingConstraint, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigationGeneralization(NavigationGeneralization navigationGeneralization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(navigationGeneralization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(navigationGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(navigationGeneralization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainConstraints(DomainConstraints domainConstraints, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainConstraints, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateBooleanValue(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNoSideEffects(domainConstraints, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateConstraint_validateNotApplyToSelf(domainConstraints, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainProperty(DomainProperty domainProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(domainProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(domainProperty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDAOGeneralization(DAOGeneralization daoGeneralization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(daoGeneralization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(daoGeneralization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(daoGeneralization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMappingLib(MappingLib mappingLib, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mappingLib, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(mappingLib, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(mappingLib, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassMapping(ClassMapping classMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBinaryAssociationsOnly(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateGeneralize(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateNameNotClash(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateAssociationEndOwnership(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyUpperBound(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicitySingleExtension(classMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicityMultipleExtension(classMapping, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeMapping(AttributeMapping attributeMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeMapping, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBinaryAssociationsOnly(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateGeneralize(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateNameNotClash(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateAssociationEndOwnership(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyUpperBound(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicitySingleExtension(attributeMapping, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicityMultipleExtension(attributeMapping, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDomainGeneralizationSet(DomainGeneralizationSet domainGeneralizationSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(domainGeneralizationSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateGeneralizationSet_validateGeneralizationSameClassifier(domainGeneralizationSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateGeneralizationSet_validateMapsToGeneralizationSet(domainGeneralizationSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameworkExtension(FrameworkExtension frameworkExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(frameworkExtension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateNonOwnedEnd(frameworkExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateIsBinary(frameworkExtension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagExtension(TagExtension tagExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tagExtension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateNonOwnedEnd(tagExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateIsBinary(tagExtension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFramework(Framework framework, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(framework, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(framework, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(framework, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(framework, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(framework, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(framework, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(framework, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(framework, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(framework, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(framework, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(framework, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerExtension(ControllerExtension controllerExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controllerExtension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateNonOwnedEnd(controllerExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateIsBinary(controllerExtension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateController(Controller controller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controller, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateBehavioredClassifier_validateClassBehavior(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClass_validatePassiveClass(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBinaryAssociationsOnly(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateGeneralize(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateNameNotClash(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateAssociationEndOwnership(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyUpperBound(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicitySingleExtension(controller, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateStereotype_validateBasePropertyMultiplicityMultipleExtension(controller, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerSet(ControllerSet controllerSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controllerSet, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(controllerSet, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackage_validateElementsPublicOrPrivate(controllerSet, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultExtension(ResultExtension resultExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultExtension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateNonOwnedEnd(resultExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateIsBinary(resultExtension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassMappingExtension(ClassMappingExtension classMappingExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classMappingExtension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateNonOwnedEnd(classMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateIsBinary(classMappingExtension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeMappingExtension(AttributeMappingExtension attributeMappingExtension, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeMappingExtension, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateMembersDistinguishable(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportSelf(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamespace_validateCannotImportOwnedMembers(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateSpecializeType(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateMapsToGeneralizationSet(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNonFinalParents(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateClassifier_validateNoCyclesInGeneralization(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndNumber(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateSpecializedEndTypes(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateBinaryAssociations(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateAssociationEnds(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateAssociation_validateEndsMustBeTyped(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateNonOwnedEnd(attributeMappingExtension, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtension_validateIsBinary(attributeMappingExtension, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerExtensionEnd(ControllerExtensionEnd controllerExtensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controllerExtensionEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateMultiplicity(controllerExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateAggregation(controllerExtensionEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagExtensionEnd(TagExtensionEnd tagExtensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tagExtensionEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateMultiplicity(tagExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateAggregation(tagExtensionEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReultExtensionEnd(ReultExtensionEnd reultExtensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(reultExtensionEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateMultiplicity(reultExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateAggregation(reultExtensionEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassMappingExtensionEnd(ClassMappingExtensionEnd classMappingExtensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classMappingExtensionEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateMultiplicity(classMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateAggregation(classMappingExtensionEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeMappingExtensionEnd(AttributeMappingExtensionEnd attributeMappingExtensionEnd, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeMappingExtensionEnd, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateMultiplicity(attributeMappingExtensionEnd, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateExtensionEnd_validateAggregation(attributeMappingExtensionEnd, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControllerProperty(ControllerProperty controllerProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(controllerProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(controllerProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(controllerProperty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTagProperty(TagProperty tagProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tagProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(tagProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(tagProperty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResultProperty(ResultProperty resultProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(resultProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(resultProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(resultProperty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassMappingPropery(ClassMappingPropery classMappingPropery, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classMappingPropery, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(classMappingPropery, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(classMappingPropery, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeMappingProperty(AttributeMappingProperty attributeMappingProperty, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attributeMappingProperty, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionConsistent(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateNonLeafRedefinition(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateRedefinableElement_validateRedefinitionContextValid(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperGeLower(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerGe0(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationNoSideEffects(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateValueSpecificationConstant(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateLowerIsInteger(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateMultiplicityElement_validateUpperIsUnlimitedNatural(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingContextConforms(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsReadOnly(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateMultiplicityOfComposite(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateRedefinedPropertyInherited(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettingRules(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateBindingToAttribute(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDerivedUnionIsDerived(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateDeploymentTarget(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateSubsettedPropertyNames(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateTypeOfOppositeEnd(attributeMappingProperty, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateProperty_validateQualifiedIsAssociationEnd(attributeMappingProperty, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeviceRealization(SeviceRealization seviceRealization, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(seviceRealization, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateHasOwner(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateElement_validateNotOwnSelf(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateVisibilityNeedsOwnership(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasQualifiedName(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validateNamedElement_validateHasNoQualifiedName(seviceRealization, diagnostics, context);
		if (result || diagnostics != null) result &= umlValidator.validatePackageableElement_validateNamespaceNeedsVisibility(seviceRealization, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateTimePrecision(DateTimePrecision dateTimePrecision, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneration(Generation generation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollection(Collection collection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOrder(Order order, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCascade(Cascade cascade, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFetch(Fetch fetch, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameworkCategoryList(FrameworkCategoryList frameworkCategoryList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstantNameList(ConstantNameList constantNameList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInheritanceMapping(InheritanceMapping inheritanceMapping, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFrameworkKindList(FrameworkKindList frameworkKindList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //FramewebValidator

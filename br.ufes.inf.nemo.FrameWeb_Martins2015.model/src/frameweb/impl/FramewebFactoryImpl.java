/**
 */
package frameweb.impl;

import frameweb.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FramewebFactoryImpl extends EFactoryImpl implements FramewebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FramewebFactory init() {
		try {
			FramewebFactory theFramewebFactory = (FramewebFactory)EPackage.Registry.INSTANCE.getEFactory(FramewebPackage.eNS_URI);
			if (theFramewebFactory != null) {
				return theFramewebFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FramewebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FramewebPackage.FRAMEWEB_PROJECT: return createFramewebProject();
			case FramewebPackage.FRAMEWORK_PROFILE: return createFrameworkProfile();
			case FramewebPackage.ENTITY_MODEL: return createEntityModel();
			case FramewebPackage.NAVIGATION_MODEL: return createNavigationModel();
			case FramewebPackage.APPLICATION_MODEL: return createApplicationModel();
			case FramewebPackage.PERSISTENCE_MODEL: return createPersistenceModel();
			case FramewebPackage.ENTITY_ASSOCIATION: return createEntityAssociation();
			case FramewebPackage.VERSION_ATTRIBUTE: return createVersionAttribute();
			case FramewebPackage.ID_ATTRIBUTE: return createIdAttribute();
			case FramewebPackage.LOB_ATTRIBUTE: return createLOBAttribute();
			case FramewebPackage.EMBEDDED_ATTRIBUTE: return createEmbeddedAttribute();
			case FramewebPackage.DECIMAL_ATTRIBUTE: return createDecimalAttribute();
			case FramewebPackage.DATE_TIME_ATTRIBUTE: return createDateTimeAttribute();
			case FramewebPackage.PAGE: return createPage();
			case FramewebPackage.TEMPLATE: return createTemplate();
			case FramewebPackage.DAO_INTERFACE: return createDAOInterface();
			case FramewebPackage.DAO_CLASS: return createDAOClass();
			case FramewebPackage.DAO_REALIZATION: return createDAORealization();
			case FramewebPackage.FRONT_CONTROLLER_CLASS: return createFrontControllerClass();
			case FramewebPackage.IO_PARAMETER: return createIOParameter();
			case FramewebPackage.RESULT_DEPENDENCY: return createResultDependency();
			case FramewebPackage.NAVIGATION_ASSOCIATION: return createNavigationAssociation();
			case FramewebPackage.FRONT_CONTROLLER_METHOD: return createFrontControllerMethod();
			case FramewebPackage.SERVICE_CLASS: return createServiceClass();
			case FramewebPackage.SERVICE_INTERFACE: return createServiceInterface();
			case FramewebPackage.SERVICE_GENERALIZATION: return createServiceGeneralization();
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION: return createServiceControllerAssociation();
			case FramewebPackage.ENTITY_CLASS: return createEntityClass();
			case FramewebPackage.RESULT: return createResult();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY: return createFrontControllerDependency();
			case FramewebPackage.PAGE_DEPENDENCY: return createPageDependency();
			case FramewebPackage.CHAINING_DEPENDENCY: return createChainingDependency();
			case FramewebPackage.DAO_SERVICE_ASSOCIATION: return createDAOServiceAssociation();
			case FramewebPackage.ENTITY_METHOD: return createEntityMethod();
			case FramewebPackage.DAO_ATTRIBUTE: return createDAOAttribute();
			case FramewebPackage.SERVICE_METHOD: return createServiceMethod();
			case FramewebPackage.SERVICE_ATTRIBUTE: return createServiceAttribute();
			case FramewebPackage.DAO_METHOD: return createDAOMethod();
			case FramewebPackage.ENTITY_PACKAGE: return createEntityPackage();
			case FramewebPackage.VIEW_PACKAGE: return createViewPackage();
			case FramewebPackage.CONTROLLER_PACKAGE: return createControllerPackage();
			case FramewebPackage.PERSISTENCE_PACKAGE: return createPersistencePackage();
			case FramewebPackage.APPLICATION_PACKAGE: return createApplicationPackage();
			case FramewebPackage.UI_COMPONENT: return createUIComponent();
			case FramewebPackage.RESULT_TYPE: return createResultType();
			case FramewebPackage.ENTITY_GENERALIZATION: return createEntityGeneralization();
			case FramewebPackage.UI_COMPONENT_FIELD: return (EObject)createUIComponentField();
			case FramewebPackage.TAG_LIB: return createTagLib();
			case FramewebPackage.TAG: return createTag();
			case FramewebPackage.NAVIGATION_COMPOSITION_PART: return createNavigationCompositionPart();
			case FramewebPackage.NAVIGATION_COMPOSITION_WHOLE: return createNavigationCompositionWhole();
			case FramewebPackage.RESULT_SET: return createResultSet();
			case FramewebPackage.PAGE_CONSTRAINT: return createPageConstraint();
			case FramewebPackage.RESULT_CONSTRAINT: return createResultConstraint();
			case FramewebPackage.METHOD_COSNTRAINT: return createMethodCosntraint();
			case FramewebPackage.CHAINING_CONSTRAINT: return createChainingConstraint();
			case FramewebPackage.NAVIGATION_GENERALIZATION: return createNavigationGeneralization();
			case FramewebPackage.ENTITY_CONSTRAINTS: return createEntityConstraints();
			case FramewebPackage.ENTITY_PROPERTY: return createEntityProperty();
			case FramewebPackage.DAO_GENERALIZATION: return createDAOGeneralization();
			case FramewebPackage.MAPPING_LIB: return createMappingLib();
			case FramewebPackage.CLASS_MAPPING: return createClassMapping();
			case FramewebPackage.ATTRIBUTE_MAPPING: return createAttributeMapping();
			case FramewebPackage.ENTITY_GENERALIZATION_SET: return createEntityGeneralizationSet();
			case FramewebPackage.TAG_EXTENSION: return createTagExtension();
			case FramewebPackage.FRAMEWORK_APPLICATION: return createFrameworkApplication();
			case FramewebPackage.CONTROLLER_EXTENSION: return createControllerExtension();
			case FramewebPackage.CONTROLLER: return createController();
			case FramewebPackage.CONTROLLER_SET: return createControllerSet();
			case FramewebPackage.RESULT_EXTENSION: return createResultExtension();
			case FramewebPackage.CLASS_MAPPING_EXTENSION: return createClassMappingExtension();
			case FramewebPackage.ATTRIBUTE_MAPPING_EXTENSION: return createAttributeMappingExtension();
			case FramewebPackage.CONTROLLER_EXTENSION_END: return createControllerExtensionEnd();
			case FramewebPackage.TAG_EXTENSION_END: return createTagExtensionEnd();
			case FramewebPackage.RESULT_EXTENSION_END: return createResultExtensionEnd();
			case FramewebPackage.CLASS_MAPPING_EXTENSION_END: return createClassMappingExtensionEnd();
			case FramewebPackage.ATTRIBUTE_MAPPING_EXTENSION_END: return createAttributeMappingExtensionEnd();
			case FramewebPackage.CONTROLLER_PROPERTY: return createControllerProperty();
			case FramewebPackage.TAG_PROPERTY: return createTagProperty();
			case FramewebPackage.RESULT_PROPERTY: return createResultProperty();
			case FramewebPackage.CLASS_MAPPING_PROPERY: return createClassMappingPropery();
			case FramewebPackage.ATTRIBUTE_MAPPING_PROPERTY: return createAttributeMappingProperty();
			case FramewebPackage.SEVICE_REALIZATION: return createSeviceRealization();
			case FramewebPackage.NAVIGATION_GENERALIZATION_SET: return createNavigationGeneralizationSet();
			case FramewebPackage.DAO_GENERALIZATION_SET: return createDAOGeneralizationSet();
			case FramewebPackage.SERVICE_GENERALIZATION_SET: return createServiceGeneralizationSet();
			case FramewebPackage.SEMANTIC_PACKAGE: return createSemanticPackage();
			case FramewebPackage.IRI: return createIRI();
			case FramewebPackage.VOCABULARY_MODEL: return createVocabularyModel();
			case FramewebPackage.VOCABULARY: return createVocabulary();
			case FramewebPackage.AXIOM: return createAxiom();
			case FramewebPackage.ANNOTATION: return createAnnotation();
			case FramewebPackage.VOCABULARY_CONSTRAINTS: return createVocabularyConstraints();
			case FramewebPackage.PROPERTY: return createProperty();
			case FramewebPackage.ASSOCIATION: return createAssociation();
			case FramewebPackage.VOCABULARY_ASSOCIATION: return createVocabularyAssociation();
			case FramewebPackage.VOCABULARY_PROPERTY: return createVocabularyProperty();
			case FramewebPackage.OBJECT_PROPERTY: return createObjectProperty();
			case FramewebPackage.DATA_PROPERTY: return createDataProperty();
			case FramewebPackage.ANNOTATION_PROPERTY: return createAnnotationProperty();
			case FramewebPackage.VOCABULARY_DATA_TYPE: return createVocabularyDataType();
			case FramewebPackage.NAMED_INDIVIDUAL: return createNamedIndividual();
			case FramewebPackage.VOCABULARY_CLASS: return createVocabularyClass();
			case FramewebPackage.ANONYMOUS_INDIVIDUAL: return createAnonymousIndividual();
			case FramewebPackage.VOCABULARY_LITERAL: return createVocabularyLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FramewebPackage.DATE_TIME_PRECISION:
				return createDateTimePrecisionFromString(eDataType, initialValue);
			case FramewebPackage.GENERATION:
				return createGenerationFromString(eDataType, initialValue);
			case FramewebPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case FramewebPackage.ORDER:
				return createOrderFromString(eDataType, initialValue);
			case FramewebPackage.CASCADE:
				return createCascadeFromString(eDataType, initialValue);
			case FramewebPackage.FETCH:
				return createFetchFromString(eDataType, initialValue);
			case FramewebPackage.FRAMEWORK_CATEGORY_LIST:
				return createFrameworkCategoryListFromString(eDataType, initialValue);
			case FramewebPackage.CONSTANT_NAME_LIST:
				return createConstantNameListFromString(eDataType, initialValue);
			case FramewebPackage.INHERITANCE_MAPPING:
				return createInheritanceMappingFromString(eDataType, initialValue);
			case FramewebPackage.FRAMEWORK_KIND_LIST:
				return createFrameworkKindListFromString(eDataType, initialValue);
			case FramewebPackage.RATIONAL:
				return createRationalFromString(eDataType, initialValue);
			case FramewebPackage.DECIMAL:
				return createDecimalFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FramewebPackage.DATE_TIME_PRECISION:
				return convertDateTimePrecisionToString(eDataType, instanceValue);
			case FramewebPackage.GENERATION:
				return convertGenerationToString(eDataType, instanceValue);
			case FramewebPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case FramewebPackage.ORDER:
				return convertOrderToString(eDataType, instanceValue);
			case FramewebPackage.CASCADE:
				return convertCascadeToString(eDataType, instanceValue);
			case FramewebPackage.FETCH:
				return convertFetchToString(eDataType, instanceValue);
			case FramewebPackage.FRAMEWORK_CATEGORY_LIST:
				return convertFrameworkCategoryListToString(eDataType, instanceValue);
			case FramewebPackage.CONSTANT_NAME_LIST:
				return convertConstantNameListToString(eDataType, instanceValue);
			case FramewebPackage.INHERITANCE_MAPPING:
				return convertInheritanceMappingToString(eDataType, instanceValue);
			case FramewebPackage.FRAMEWORK_KIND_LIST:
				return convertFrameworkKindListToString(eDataType, instanceValue);
			case FramewebPackage.RATIONAL:
				return convertRationalToString(eDataType, instanceValue);
			case FramewebPackage.DECIMAL:
				return convertDecimalToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebProject createFramewebProject() {
		FramewebProjectImpl framewebProject = new FramewebProjectImpl();
		return framewebProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkProfile createFrameworkProfile() {
		FrameworkProfileImpl frameworkProfile = new FrameworkProfileImpl();
		return frameworkProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModel createEntityModel() {
		EntityModelImpl entityModel = new EntityModelImpl();
		return entityModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationModel createNavigationModel() {
		NavigationModelImpl navigationModel = new NavigationModelImpl();
		return navigationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationModel createApplicationModel() {
		ApplicationModelImpl applicationModel = new ApplicationModelImpl();
		return applicationModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceModel createPersistenceModel() {
		PersistenceModelImpl persistenceModel = new PersistenceModelImpl();
		return persistenceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityAssociation createEntityAssociation() {
		EntityAssociationImpl entityAssociation = new EntityAssociationImpl();
		return entityAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionAttribute createVersionAttribute() {
		VersionAttributeImpl versionAttribute = new VersionAttributeImpl();
		return versionAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdAttribute createIdAttribute() {
		IdAttributeImpl idAttribute = new IdAttributeImpl();
		return idAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOBAttribute createLOBAttribute() {
		LOBAttributeImpl lobAttribute = new LOBAttributeImpl();
		return lobAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedAttribute createEmbeddedAttribute() {
		EmbeddedAttributeImpl embeddedAttribute = new EmbeddedAttributeImpl();
		return embeddedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecimalAttribute createDecimalAttribute() {
		DecimalAttributeImpl decimalAttribute = new DecimalAttributeImpl();
		return decimalAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimeAttribute createDateTimeAttribute() {
		DateTimeAttributeImpl dateTimeAttribute = new DateTimeAttributeImpl();
		return dateTimeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page createPage() {
		PageImpl page = new PageImpl();
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template createTemplate() {
		TemplateImpl template = new TemplateImpl();
		return template;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterface createDAOInterface() {
		DAOInterfaceImpl daoInterface = new DAOInterfaceImpl();
		return daoInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOClass createDAOClass() {
		DAOClassImpl daoClass = new DAOClassImpl();
		return daoClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAORealization createDAORealization() {
		DAORealizationImpl daoRealization = new DAORealizationImpl();
		return daoRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass createFrontControllerClass() {
		FrontControllerClassImpl frontControllerClass = new FrontControllerClassImpl();
		return frontControllerClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOParameter createIOParameter() {
		IOParameterImpl ioParameter = new IOParameterImpl();
		return ioParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultDependency createResultDependency() {
		ResultDependencyImpl resultDependency = new ResultDependencyImpl();
		return resultDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationAssociation createNavigationAssociation() {
		NavigationAssociationImpl navigationAssociation = new NavigationAssociationImpl();
		return navigationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod createFrontControllerMethod() {
		FrontControllerMethodImpl frontControllerMethod = new FrontControllerMethodImpl();
		return frontControllerMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClass createServiceClass() {
		ServiceClassImpl serviceClass = new ServiceClassImpl();
		return serviceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceInterface createServiceInterface() {
		ServiceInterfaceImpl serviceInterface = new ServiceInterfaceImpl();
		return serviceInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceGeneralization createServiceGeneralization() {
		ServiceGeneralizationImpl serviceGeneralization = new ServiceGeneralizationImpl();
		return serviceGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceControllerAssociation createServiceControllerAssociation() {
		ServiceControllerAssociationImpl serviceControllerAssociation = new ServiceControllerAssociationImpl();
		return serviceControllerAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityClass createEntityClass() {
		EntityClassImpl entityClass = new EntityClassImpl();
		return entityClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Result createResult() {
		ResultImpl result = new ResultImpl();
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerDependency createFrontControllerDependency() {
		FrontControllerDependencyImpl frontControllerDependency = new FrontControllerDependencyImpl();
		return frontControllerDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageDependency createPageDependency() {
		PageDependencyImpl pageDependency = new PageDependencyImpl();
		return pageDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainingDependency createChainingDependency() {
		ChainingDependencyImpl chainingDependency = new ChainingDependencyImpl();
		return chainingDependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOServiceAssociation createDAOServiceAssociation() {
		DAOServiceAssociationImpl daoServiceAssociation = new DAOServiceAssociationImpl();
		return daoServiceAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityMethod createEntityMethod() {
		EntityMethodImpl entityMethod = new EntityMethodImpl();
		return entityMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOAttribute createDAOAttribute() {
		DAOAttributeImpl daoAttribute = new DAOAttributeImpl();
		return daoAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceMethod createServiceMethod() {
		ServiceMethodImpl serviceMethod = new ServiceMethodImpl();
		return serviceMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceAttribute createServiceAttribute() {
		ServiceAttributeImpl serviceAttribute = new ServiceAttributeImpl();
		return serviceAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOMethod createDAOMethod() {
		DAOMethodImpl daoMethod = new DAOMethodImpl();
		return daoMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityPackage createEntityPackage() {
		EntityPackageImpl entityPackage = new EntityPackageImpl();
		return entityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ViewPackage createViewPackage() {
		ViewPackageImpl viewPackage = new ViewPackageImpl();
		return viewPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerPackage createControllerPackage() {
		ControllerPackageImpl controllerPackage = new ControllerPackageImpl();
		return controllerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistencePackage createPersistencePackage() {
		PersistencePackageImpl persistencePackage = new PersistencePackageImpl();
		return persistencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationPackage createApplicationPackage() {
		ApplicationPackageImpl applicationPackage = new ApplicationPackageImpl();
		return applicationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponent createUIComponent() {
		UIComponentImpl uiComponent = new UIComponentImpl();
		return uiComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultType createResultType() {
		ResultTypeImpl resultType = new ResultTypeImpl();
		return resultType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityGeneralization createEntityGeneralization() {
		EntityGeneralizationImpl entityGeneralization = new EntityGeneralizationImpl();
		return entityGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UIComponent createUIComponentField() {
		UIComponentFieldImpl uiComponentField = new UIComponentFieldImpl();
		return (UIComponent) uiComponentField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagLib createTagLib() {
		TagLibImpl tagLib = new TagLibImpl();
		return tagLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationCompositionPart createNavigationCompositionPart() {
		NavigationCompositionPartImpl navigationCompositionPart = new NavigationCompositionPartImpl();
		return navigationCompositionPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationCompositionWhole createNavigationCompositionWhole() {
		NavigationCompositionWholeImpl navigationCompositionWhole = new NavigationCompositionWholeImpl();
		return navigationCompositionWhole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultSet createResultSet() {
		ResultSetImpl resultSet = new ResultSetImpl();
		return resultSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageConstraint createPageConstraint() {
		PageConstraintImpl pageConstraint = new PageConstraintImpl();
		return pageConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultConstraint createResultConstraint() {
		ResultConstraintImpl resultConstraint = new ResultConstraintImpl();
		return resultConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodCosntraint createMethodCosntraint() {
		MethodCosntraintImpl methodCosntraint = new MethodCosntraintImpl();
		return methodCosntraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainingConstraint createChainingConstraint() {
		ChainingConstraintImpl chainingConstraint = new ChainingConstraintImpl();
		return chainingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationGeneralization createNavigationGeneralization() {
		NavigationGeneralizationImpl navigationGeneralization = new NavigationGeneralizationImpl();
		return navigationGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityConstraints createEntityConstraints() {
		EntityConstraintsImpl entityConstraints = new EntityConstraintsImpl();
		return entityConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityProperty createEntityProperty() {
		EntityPropertyImpl entityProperty = new EntityPropertyImpl();
		return entityProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOGeneralization createDAOGeneralization() {
		DAOGeneralizationImpl daoGeneralization = new DAOGeneralizationImpl();
		return daoGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappingLib createMappingLib() {
		MappingLibImpl mappingLib = new MappingLibImpl();
		return mappingLib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMapping createClassMapping() {
		ClassMappingImpl classMapping = new ClassMappingImpl();
		return classMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMapping createAttributeMapping() {
		AttributeMappingImpl attributeMapping = new AttributeMappingImpl();
		return attributeMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityGeneralizationSet createEntityGeneralizationSet() {
		EntityGeneralizationSetImpl entityGeneralizationSet = new EntityGeneralizationSetImpl();
		return entityGeneralizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagExtension createTagExtension() {
		TagExtensionImpl tagExtension = new TagExtensionImpl();
		return tagExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkApplication createFrameworkApplication() {
		FrameworkApplicationImpl frameworkApplication = new FrameworkApplicationImpl();
		return frameworkApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerExtension createControllerExtension() {
		ControllerExtensionImpl controllerExtension = new ControllerExtensionImpl();
		return controllerExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Controller createController() {
		ControllerImpl controller = new ControllerImpl();
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerSet createControllerSet() {
		ControllerSetImpl controllerSet = new ControllerSetImpl();
		return controllerSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultExtension createResultExtension() {
		ResultExtensionImpl resultExtension = new ResultExtensionImpl();
		return resultExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMappingExtension createClassMappingExtension() {
		ClassMappingExtensionImpl classMappingExtension = new ClassMappingExtensionImpl();
		return classMappingExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMappingExtension createAttributeMappingExtension() {
		AttributeMappingExtensionImpl attributeMappingExtension = new AttributeMappingExtensionImpl();
		return attributeMappingExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerExtensionEnd createControllerExtensionEnd() {
		ControllerExtensionEndImpl controllerExtensionEnd = new ControllerExtensionEndImpl();
		return controllerExtensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagExtensionEnd createTagExtensionEnd() {
		TagExtensionEndImpl tagExtensionEnd = new TagExtensionEndImpl();
		return tagExtensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultExtensionEnd createResultExtensionEnd() {
		ResultExtensionEndImpl resultExtensionEnd = new ResultExtensionEndImpl();
		return resultExtensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMappingExtensionEnd createClassMappingExtensionEnd() {
		ClassMappingExtensionEndImpl classMappingExtensionEnd = new ClassMappingExtensionEndImpl();
		return classMappingExtensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMappingExtensionEnd createAttributeMappingExtensionEnd() {
		AttributeMappingExtensionEndImpl attributeMappingExtensionEnd = new AttributeMappingExtensionEndImpl();
		return attributeMappingExtensionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerProperty createControllerProperty() {
		ControllerPropertyImpl controllerProperty = new ControllerPropertyImpl();
		return controllerProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagProperty createTagProperty() {
		TagPropertyImpl tagProperty = new TagPropertyImpl();
		return tagProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultProperty createResultProperty() {
		ResultPropertyImpl resultProperty = new ResultPropertyImpl();
		return resultProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassMappingPropery createClassMappingPropery() {
		ClassMappingProperyImpl classMappingPropery = new ClassMappingProperyImpl();
		return classMappingPropery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeMappingProperty createAttributeMappingProperty() {
		AttributeMappingPropertyImpl attributeMappingProperty = new AttributeMappingPropertyImpl();
		return attributeMappingProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SeviceRealization createSeviceRealization() {
		SeviceRealizationImpl seviceRealization = new SeviceRealizationImpl();
		return seviceRealization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NavigationGeneralizationSet createNavigationGeneralizationSet() {
		NavigationGeneralizationSetImpl navigationGeneralizationSet = new NavigationGeneralizationSetImpl();
		return navigationGeneralizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOGeneralizationSet createDAOGeneralizationSet() {
		DAOGeneralizationSetImpl daoGeneralizationSet = new DAOGeneralizationSetImpl();
		return daoGeneralizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceGeneralizationSet createServiceGeneralizationSet() {
		ServiceGeneralizationSetImpl serviceGeneralizationSet = new ServiceGeneralizationSetImpl();
		return serviceGeneralizationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SemanticPackage createSemanticPackage() {
		SemanticPackageImpl semanticPackage = new SemanticPackageImpl();
		return semanticPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRI createIRI() {
		IRIImpl iri = new IRIImpl();
		return iri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyModel createVocabularyModel() {
		VocabularyModelImpl vocabularyModel = new VocabularyModelImpl();
		return vocabularyModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vocabulary createVocabulary() {
		VocabularyImpl vocabulary = new VocabularyImpl();
		return vocabulary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Axiom createAxiom() {
		AxiomImpl axiom = new AxiomImpl();
		return axiom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation createAnnotation() {
		AnnotationImpl annotation = new AnnotationImpl();
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyConstraints createVocabularyConstraints() {
		VocabularyConstraintsImpl vocabularyConstraints = new VocabularyConstraintsImpl();
		return vocabularyConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association createAssociation() {
		AssociationImpl association = new AssociationImpl();
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyAssociation createVocabularyAssociation() {
		VocabularyAssociationImpl vocabularyAssociation = new VocabularyAssociationImpl();
		return vocabularyAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyProperty createVocabularyProperty() {
		VocabularyPropertyImpl vocabularyProperty = new VocabularyPropertyImpl();
		return vocabularyProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectProperty createObjectProperty() {
		ObjectPropertyImpl objectProperty = new ObjectPropertyImpl();
		return objectProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty createDataProperty() {
		DataPropertyImpl dataProperty = new DataPropertyImpl();
		return dataProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnotationProperty createAnnotationProperty() {
		AnnotationPropertyImpl annotationProperty = new AnnotationPropertyImpl();
		return annotationProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyDataType createVocabularyDataType() {
		VocabularyDataTypeImpl vocabularyDataType = new VocabularyDataTypeImpl();
		return vocabularyDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedIndividual createNamedIndividual() {
		NamedIndividualImpl namedIndividual = new NamedIndividualImpl();
		return namedIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyClass createVocabularyClass() {
		VocabularyClassImpl vocabularyClass = new VocabularyClassImpl();
		return vocabularyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnonymousIndividual createAnonymousIndividual() {
		AnonymousIndividualImpl anonymousIndividual = new AnonymousIndividualImpl();
		return anonymousIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VocabularyLiteral createVocabularyLiteral() {
		VocabularyLiteralImpl vocabularyLiteral = new VocabularyLiteralImpl();
		return vocabularyLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePrecision createDateTimePrecisionFromString(EDataType eDataType, String initialValue) {
		DateTimePrecision result = DateTimePrecision.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrecisionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation createGenerationFromString(EDataType eDataType, String initialValue) {
		Generation result = Generation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollectionFromString(EDataType eDataType, String initialValue) {
		Collection result = Collection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		Order result = Order.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade createCascadeFromString(EDataType eDataType, String initialValue) {
		Cascade result = Cascade.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCascadeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch createFetchFromString(EDataType eDataType, String initialValue) {
		Fetch result = Fetch.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkCategoryList createFrameworkCategoryListFromString(EDataType eDataType, String initialValue) {
		FrameworkCategoryList result = FrameworkCategoryList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkCategoryListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantNameList createConstantNameListFromString(EDataType eDataType, String initialValue) {
		ConstantNameList result = ConstantNameList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstantNameListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceMapping createInheritanceMappingFromString(EDataType eDataType, String initialValue) {
		InheritanceMapping result = InheritanceMapping.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceMappingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkKindList createFrameworkKindListFromString(EDataType eDataType, String initialValue) {
		FrameworkKindList result = FrameworkKindList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkKindListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createRationalFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRationalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDecimalFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecimalToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebPackage getFramewebPackage() {
		return (FramewebPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FramewebPackage getPackage() {
		return FramewebPackage.eINSTANCE;
	}

} //FramewebFactoryImpl

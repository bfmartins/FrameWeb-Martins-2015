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
			case FramewebPackage.MAPPED_CLASS: return createMappedClass();
			case FramewebPackage.PERSISTENT_CLASS: return createPersistentClass();
			case FramewebPackage.TRANSIENT_CLASS: return createTransientClass();
			case FramewebPackage.FRAMEWEB: return createFrameweb();
			case FramewebPackage.FRAMEWORK: return createFramework();
			case FramewebPackage.DOMAIN_MODEL: return createDomainModel();
			case FramewebPackage.NAVIGATION_MODEL: return createNavigationModel();
			case FramewebPackage.APPLICATION_MODEL: return createApplicationModel();
			case FramewebPackage.PERSISTENCE_MODEL: return createPersistenceModel();
			case FramewebPackage.DOMAIN_ASSOCIATION: return createDomainAssociation();
			case FramewebPackage.VERSION_ATTRIBUTE: return createVersionAttribute();
			case FramewebPackage.ID_ATTRIBUTE: return createIdAttribute();
			case FramewebPackage.LOB_ATTRIBUTE: return createLOBAttribute();
			case FramewebPackage.EMBEDDED_ATTRIBUTE: return createEmbeddedAttribute();
			case FramewebPackage.DECIMAL_ATTRIBUTE: return createDecimalAttribute();
			case FramewebPackage.DATE_TIME_ATTRIBUTE: return createDateTimeAttribute();
			case FramewebPackage.PAGE: return createPage();
			case FramewebPackage.TEMPLATE: return createTemplate();
			case FramewebPackage.FORM: return createForm();
			case FramewebPackage.BINARY: return createBinary();
			case FramewebPackage.DAO_INTERFACE: return createDAOInterface();
			case FramewebPackage.DAO_CLASS: return createDAOClass();
			case FramewebPackage.DAO_GENERALIZATION: return createDAOGeneralization();
			case FramewebPackage.FRONT_CONTROLLER_CLASS: return createFrontControllerClass();
			case FramewebPackage.USER_VIEW_ATTRIBUTE: return createUserViewAttribute();
			case FramewebPackage.IO_PARAMETER: return createIOParameter();
			case FramewebPackage.DAO_BASE_OPERATION: return createDAOBaseOperation();
			case FramewebPackage.RESULT_DEPENDENCY: return createResultDependency();
			case FramewebPackage.NAVIGATION_COMPOSITION: return createNavigationComposition();
			case FramewebPackage.FRONT_CONTROLLER_METHOD: return createFrontControllerMethod();
			case FramewebPackage.SERVICE_CLASS: return createServiceClass();
			case FramewebPackage.SERVICE_INTERFACE: return createServiceInterface();
			case FramewebPackage.SERVICE_GENERALIZATION: return createServiceGeneralization();
			case FramewebPackage.SERVICE_NAVIGATION_ASSOCIATION: return createServiceNavigationAssociation();
			case FramewebPackage.BINARY_ATTRIBUTE: return createBinaryAttribute();
			case FramewebPackage.CONSTANT_NAME: return createConstantName();
			case FramewebPackage.DOMAIN_TABLE_NAME: return createDomainTableName();
			case FramewebPackage.FRAME_WORK_NAME: return createFrameWorkName();
			case FramewebPackage.DOMAIN_COLUMN_NAME: return createDomainColumnName();
			case FramewebPackage.DAO_INTERFACE_NAME: return createDAOInterfaceName();
			case FramewebPackage.DAO_CLASS_NAME: return createDAOClassName();
			case FramewebPackage.RESULT: return createResult();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY: return createFrontControllerDependency();
			case FramewebPackage.PAGE_DEPENDENCY: return createPageDependency();
			case FramewebPackage.CHAINING_DEPENDENCY: return createChainingDependency();
			case FramewebPackage.DAO_SERVICE_ASSOCIATION: return createDAOServiceAssociation();
			case FramewebPackage.DOMAIN_OPERATION: return createDomainOperation();
			case FramewebPackage.DAO_ATTRIBUTE: return createDAOAttribute();
			case FramewebPackage.SERVICE_OPERATION: return createServiceOperation();
			case FramewebPackage.SERVICE_ATTRIBUTE: return createServiceAttribute();
			case FramewebPackage.DAO_OPERATION: return createDAOOperation();
			case FramewebPackage.DOMAIN_PACKAGE: return createDomainPackage();
			case FramewebPackage.VIEW_PACKAGE: return createViewPackage();
			case FramewebPackage.CONTROLLER_PACKAGE: return createControllerPackage();
			case FramewebPackage.PERSISTENCE_PACKAGE: return createPersistencePackage();
			case FramewebPackage.APPLICATION_PACKAGE: return createApplicationPackage();
			case FramewebPackage.COMPONENT: return createComponent();
			case FramewebPackage.RESULT_TYPE: return createResultType();
			case FramewebPackage.DOMAIN_GENERALIZATION: return createDomainGeneralization();
			case FramewebPackage.JQUERY: return createJQuery();
			case FramewebPackage.FORM_COMPONENT: return createFormComponent();
			case FramewebPackage.TAG_LIB: return createTagLib();
			case FramewebPackage.FRAMEWORK_TAG: return createFrameworkTag();
			case FramewebPackage.RULE: return createRule();
			case FramewebPackage.ANOTATION: return createAnotation();
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
			case FramewebPackage.DAO_BASE_OPERATION_LIST:
				return createDAOBaseOperationListFromString(eDataType, initialValue);
			case FramewebPackage.FRAMEWORK_CATEGORY_LIST:
				return createFrameworkCategoryListFromString(eDataType, initialValue);
			case FramewebPackage.CONSTANT_NAME_LIST:
				return createConstantNameListFromString(eDataType, initialValue);
			case FramewebPackage.INHERITANCE_MAPPING:
				return createInheritanceMappingFromString(eDataType, initialValue);
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
			case FramewebPackage.DAO_BASE_OPERATION_LIST:
				return convertDAOBaseOperationListToString(eDataType, instanceValue);
			case FramewebPackage.FRAMEWORK_CATEGORY_LIST:
				return convertFrameworkCategoryListToString(eDataType, instanceValue);
			case FramewebPackage.CONSTANT_NAME_LIST:
				return convertConstantNameListToString(eDataType, instanceValue);
			case FramewebPackage.INHERITANCE_MAPPING:
				return convertInheritanceMappingToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MappedClass createMappedClass() {
		MappedClassImpl mappedClass = new MappedClassImpl();
		return mappedClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistentClass createPersistentClass() {
		PersistentClassImpl persistentClass = new PersistentClassImpl();
		return persistentClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransientClass createTransientClass() {
		TransientClassImpl transientClass = new TransientClassImpl();
		return transientClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Frameweb createFrameweb() {
		FramewebImpl frameweb = new FramewebImpl();
		return frameweb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Framework createFramework() {
		FrameworkImpl framework = new FrameworkImpl();
		return framework;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainModel createDomainModel() {
		DomainModelImpl domainModel = new DomainModelImpl();
		return domainModel;
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
	public DomainAssociation createDomainAssociation() {
		DomainAssociationImpl domainAssociation = new DomainAssociationImpl();
		return domainAssociation;
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
	public Form createForm() {
		FormImpl form = new FormImpl();
		return form;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Binary createBinary() {
		BinaryImpl binary = new BinaryImpl();
		return binary;
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
	public DAOGeneralization createDAOGeneralization() {
		DAOGeneralizationImpl daoGeneralization = new DAOGeneralizationImpl();
		return daoGeneralization;
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
	public UserViewAttribute createUserViewAttribute() {
		UserViewAttributeImpl userViewAttribute = new UserViewAttributeImpl();
		return userViewAttribute;
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
	public DAOBaseOperation createDAOBaseOperation() {
		DAOBaseOperationImpl daoBaseOperation = new DAOBaseOperationImpl();
		return daoBaseOperation;
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
	public NavigationComposition createNavigationComposition() {
		NavigationCompositionImpl navigationComposition = new NavigationCompositionImpl();
		return navigationComposition;
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
	public ServiceNavigationAssociation createServiceNavigationAssociation() {
		ServiceNavigationAssociationImpl serviceNavigationAssociation = new ServiceNavigationAssociationImpl();
		return serviceNavigationAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryAttribute createBinaryAttribute() {
		BinaryAttributeImpl binaryAttribute = new BinaryAttributeImpl();
		return binaryAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantName createConstantName() {
		ConstantNameImpl constantName = new ConstantNameImpl();
		return constantName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainTableName createDomainTableName() {
		DomainTableNameImpl domainTableName = new DomainTableNameImpl();
		return domainTableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameWorkName createFrameWorkName() {
		FrameWorkNameImpl frameWorkName = new FrameWorkNameImpl();
		return frameWorkName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainColumnName createDomainColumnName() {
		DomainColumnNameImpl domainColumnName = new DomainColumnNameImpl();
		return domainColumnName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOInterfaceName createDAOInterfaceName() {
		DAOInterfaceNameImpl daoInterfaceName = new DAOInterfaceNameImpl();
		return daoInterfaceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOClassName createDAOClassName() {
		DAOClassNameImpl daoClassName = new DAOClassNameImpl();
		return daoClassName;
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
	public DomainOperation createDomainOperation() {
		DomainOperationImpl domainOperation = new DomainOperationImpl();
		return domainOperation;
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
	public ServiceOperation createServiceOperation() {
		ServiceOperationImpl serviceOperation = new ServiceOperationImpl();
		return serviceOperation;
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
	public DAOOperation createDAOOperation() {
		DAOOperationImpl daoOperation = new DAOOperationImpl();
		return daoOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DomainPackage createDomainPackage() {
		DomainPackageImpl domainPackage = new DomainPackageImpl();
		return domainPackage;
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
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
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
	public DomainGeneralization createDomainGeneralization() {
		DomainGeneralizationImpl domainGeneralization = new DomainGeneralizationImpl();
		return domainGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery createJQuery() {
		JQueryImpl jQuery = new JQueryImpl();
		return jQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormComponent createFormComponent() {
		FormComponentImpl formComponent = new FormComponentImpl();
		return formComponent;
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
	public FrameworkTag createFrameworkTag() {
		FrameworkTagImpl frameworkTag = new FrameworkTagImpl();
		return frameworkTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Anotation createAnotation() {
		AnotationImpl anotation = new AnotationImpl();
		return anotation;
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
	public DAOBaseOperationList createDAOBaseOperationListFromString(EDataType eDataType, String initialValue) {
		DAOBaseOperationList result = DAOBaseOperationList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAOBaseOperationListToString(EDataType eDataType, Object instanceValue) {
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

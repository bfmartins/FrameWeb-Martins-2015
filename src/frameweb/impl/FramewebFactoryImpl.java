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
			FramewebFactory theframewebFactory = (FramewebFactory)EPackage.Registry.INSTANCE.getEFactory(framewebPackage.eNS_URI);
			if (theframewebFactory != null) {
				return theframewebFactory;
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
			case framewebPackage.MAPPED_CLASS: return createMappedClass();
			case framewebPackage.PERSISTENT_CLASS: return createPersistentClass();
			case framewebPackage.TRANSIENT_CLASS: return createTransientClass();
			case framewebPackage.FRAME_WEB: return createFrameWeb();
			case framewebPackage.FRAMEWORK: return createFramework();
			case framewebPackage.DOMAIN_MODEL: return createDomainModel();
			case framewebPackage.NAVIGATION_MODEL: return createNavigationModel();
			case framewebPackage.APPLICATION_MODEL: return createApplicationModel();
			case framewebPackage.PERSISTENCE_MODEL: return createPersistenceModel();
			case framewebPackage.DOMAIN_ASSOCIATION: return createDomainAssociation();
			case framewebPackage.DOMAIN_ATTRIBUTE: return createDomainAttribute();
			case framewebPackage.VERSION_ATTRIBUTE: return createVersionAttribute();
			case framewebPackage.ID_ATTRIBUTE: return createIdAttribute();
			case framewebPackage.LOB_ATTRIBUTE: return createLOBAttribute();
			case framewebPackage.EMBEDDED_ATTRIBUTE: return createEmbeddedAttribute();
			case framewebPackage.DECIMAL_ATTRIBUTE: return createDecimalAttribute();
			case framewebPackage.DATE_TIME_ATTRIBUTE: return createDateTimeAttribute();
			case framewebPackage.PAGE: return createPage();
			case framewebPackage.TEMPLATE: return createTemplate();
			case framewebPackage.FORM: return createForm();
			case framewebPackage.BINARY: return createBinary();
			case framewebPackage.DAO_INTERFACE: return createDAOInterface();
			case framewebPackage.DAO_CLASS: return createDAOClass();
			case framewebPackage.DAO_GENERALIZATION: return createDAOGeneralization();
			case framewebPackage.FRONT_CONTROLLER_CLASS: return createFrontControllerClass();
			case framewebPackage.USER_VIEW_ATTRIBUTE: return createUserViewAttribute();
			case framewebPackage.IO_PARAMETER: return createIOParameter();
			case framewebPackage.DAO_BASE_OPERATION: return createDAOBaseOperation();
			case framewebPackage.RESULT_DEPENDENCY: return createResultDependency();
			case framewebPackage.NAVIGATION_COMPOSITION: return createNavigationComposition();
			case framewebPackage.FRONT_CONTROLLER_METHOD: return createFrontControllerMethod();
			case framewebPackage.SERVICE_CLASS: return createServiceClass();
			case framewebPackage.SERVICE_INTERFACE: return createServiceInterface();
			case framewebPackage.SERVICE_GENERALIZATION: return createServiceGeneralization();
			case framewebPackage.SERVICE_NAVIGATION_ASSOCIATION: return createServiceNavigationAssociation();
			case framewebPackage.BINARY_ATTRIBUTE: return createBinaryAttribute();
			case framewebPackage.CONSTANT_NAME: return createConstantName();
			case framewebPackage.DOMAIN_TABLE_NAME: return createDomainTableName();
			case framewebPackage.FRAME_WORK_NAME: return createFrameWorkName();
			case framewebPackage.DOMAIN_COLUMN_NAME: return createDomainColumnName();
			case framewebPackage.DAO_INTERFACE_NAME: return createDAOInterfaceName();
			case framewebPackage.DAO_CLASS_NAME: return createDAOClassName();
			case framewebPackage.RESULT: return createResult();
			case framewebPackage.FRONT_CONTROLLER_DEPENDENCE: return createFrontControllerDependence();
			case framewebPackage.PAGE_DEPENDENCE: return createPageDependence();
			case framewebPackage.CHAINING_DEPENDENCE: return createChainingDependence();
			case framewebPackage.DAO_SERVICE_ASSOCIATION: return createDAOServiceAssociation();
			case framewebPackage.DOMAIN_OPERATION: return createDomainOperation();
			case framewebPackage.DAO_ATTRIBUTE: return createDAOAttribute();
			case framewebPackage.SERVICE_OPERATION: return createServiceOperation();
			case framewebPackage.SERVICE_ATTRIBUTE: return createServiceAttribute();
			case framewebPackage.SERVICE_ASSOCIATION: return createServiceAssociation();
			case framewebPackage.DAO_OPERATION: return createDAOOperation();
			case framewebPackage.DOMAIN_PACKAGE: return createDomainPackage();
			case framewebPackage.VIEW_PACKAGE: return createViewPackage();
			case framewebPackage.CONTROLLER_PACKAGE: return createControllerPackage();
			case framewebPackage.PERSISTENCE_PACKAGE: return createPersistencePackage();
			case framewebPackage.APPLICATION_PACKAGE: return createApplicationPackage();
			case framewebPackage.COMPONENT: return createComponent();
			case framewebPackage.RESULT_TYPE: return createResultType();
			case framewebPackage.DOMAIN_GENERALIZATION: return createDomainGeneralization();
			case framewebPackage.JQUERY: return createJQuery();
			case framewebPackage.FORM_COMPONENT: return createFormComponent();
			case framewebPackage.TAG_LIB: return createTagLib();
			case framewebPackage.FRAMEWORK_TAG: return createFrameworkTag();
			case framewebPackage.RULE: return createRule();
			case framewebPackage.TALVEZ_METHOD: return createTalvez_Method();
			case framewebPackage.ANOTATION: return createAnotation();
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
			case framewebPackage.DATE_TIME_PRECISION:
				return createDateTimePrecisionFromString(eDataType, initialValue);
			case framewebPackage.GENERATION:
				return createGenerationFromString(eDataType, initialValue);
			case framewebPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case framewebPackage.ORDER:
				return createOrderFromString(eDataType, initialValue);
			case framewebPackage.CASCADE:
				return createCascadeFromString(eDataType, initialValue);
			case framewebPackage.FETCH:
				return createFetchFromString(eDataType, initialValue);
			case framewebPackage.DAO_BASE_OPERATION_LIST:
				return createDAOBaseOperationListFromString(eDataType, initialValue);
			case framewebPackage.FRAMEWORK_CATEGORY_LIST:
				return createFrameworkCategoryListFromString(eDataType, initialValue);
			case framewebPackage.CONSTANT_NAME_LIST:
				return createConstantNameListFromString(eDataType, initialValue);
			case framewebPackage.INHERITANCE_MAPPING:
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
			case framewebPackage.DATE_TIME_PRECISION:
				return convertDateTimePrecisionToString(eDataType, instanceValue);
			case framewebPackage.GENERATION:
				return convertGenerationToString(eDataType, instanceValue);
			case framewebPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case framewebPackage.ORDER:
				return convertOrderToString(eDataType, instanceValue);
			case framewebPackage.CASCADE:
				return convertCascadeToString(eDataType, instanceValue);
			case framewebPackage.FETCH:
				return convertFetchToString(eDataType, instanceValue);
			case framewebPackage.DAO_BASE_OPERATION_LIST:
				return convertDAOBaseOperationListToString(eDataType, instanceValue);
			case framewebPackage.FRAMEWORK_CATEGORY_LIST:
				return convertFrameworkCategoryListToString(eDataType, instanceValue);
			case framewebPackage.CONSTANT_NAME_LIST:
				return convertConstantNameListToString(eDataType, instanceValue);
			case framewebPackage.INHERITANCE_MAPPING:
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
	public FrameWeb createFrameWeb() {
		FrameWebImpl frameWeb = new FrameWebImpl();
		return frameWeb;
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
	public DomainAttribute createDomainAttribute() {
		DomainAttributeImpl domainAttribute = new DomainAttributeImpl();
		return domainAttribute;
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
	public FrontControllerDependence createFrontControllerDependence() {
		FrontControllerDependenceImpl frontControllerDependence = new FrontControllerDependenceImpl();
		return frontControllerDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PageDependence createPageDependence() {
		PageDependenceImpl pageDependence = new PageDependenceImpl();
		return pageDependence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChainingDependence createChainingDependence() {
		ChainingDependenceImpl chainingDependence = new ChainingDependenceImpl();
		return chainingDependence;
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
	public ServiceAssociation createServiceAssociation() {
		ServiceAssociationImpl serviceAssociation = new ServiceAssociationImpl();
		return serviceAssociation;
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
	public Talvez_Method createTalvez_Method() {
		Talvez_MethodImpl talvez_Method = new Talvez_MethodImpl();
		return talvez_Method;
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
	public DateTimePrecision createDateTimePrecision(String literal) {
		DateTimePrecision result = DateTimePrecision.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.DATE_TIME_PRECISION.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateTimePrecision createDateTimePrecisionFromString(EDataType eDataType, String initialValue) {
		return createDateTimePrecision(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrecision(DateTimePrecision instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateTimePrecisionToString(EDataType eDataType, Object instanceValue) {
		return convertDateTimePrecision((DateTimePrecision)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation createGeneration(String literal) {
		Generation result = Generation.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.GENERATION.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generation createGenerationFromString(EDataType eDataType, String initialValue) {
		return createGeneration(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGeneration(Generation instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenerationToString(EDataType eDataType, Object instanceValue) {
		return convertGeneration((Generation)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollection(String literal) {
		Collection result = Collection.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.COLLECTION.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection createCollectionFromString(EDataType eDataType, String initialValue) {
		return createCollection(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollection(Collection instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionToString(EDataType eDataType, Object instanceValue) {
		return convertCollection((Collection)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrder(String literal) {
		Order result = Order.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.ORDER.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		return createOrder(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrder(Order instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return convertOrder((Order)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade createCascade(String literal) {
		Cascade result = Cascade.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.CASCADE.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cascade createCascadeFromString(EDataType eDataType, String initialValue) {
		return createCascade(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCascade(Cascade instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCascadeToString(EDataType eDataType, Object instanceValue) {
		return convertCascade((Cascade)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch createFetch(String literal) {
		Fetch result = Fetch.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.FETCH.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fetch createFetchFromString(EDataType eDataType, String initialValue) {
		return createFetch(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetch(Fetch instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFetchToString(EDataType eDataType, Object instanceValue) {
		return convertFetch((Fetch)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOBaseOperationList createDAOBaseOperationList(String literal) {
		DAOBaseOperationList result = DAOBaseOperationList.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.DAO_BASE_OPERATION_LIST.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DAOBaseOperationList createDAOBaseOperationListFromString(EDataType eDataType, String initialValue) {
		return createDAOBaseOperationList(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAOBaseOperationList(DAOBaseOperationList instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDAOBaseOperationListToString(EDataType eDataType, Object instanceValue) {
		return convertDAOBaseOperationList((DAOBaseOperationList)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkCategoryList createFrameworkCategoryList(String literal) {
		FrameworkCategoryList result = FrameworkCategoryList.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.FRAMEWORK_CATEGORY_LIST.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrameworkCategoryList createFrameworkCategoryListFromString(EDataType eDataType, String initialValue) {
		return createFrameworkCategoryList(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkCategoryList(FrameworkCategoryList instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrameworkCategoryListToString(EDataType eDataType, Object instanceValue) {
		return convertFrameworkCategoryList((FrameworkCategoryList)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantNameList createConstantNameList(String literal) {
		ConstantNameList result = ConstantNameList.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.CONSTANT_NAME_LIST.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantNameList createConstantNameListFromString(EDataType eDataType, String initialValue) {
		return createConstantNameList(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstantNameList(ConstantNameList instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstantNameListToString(EDataType eDataType, Object instanceValue) {
		return convertConstantNameList((ConstantNameList)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceMapping createInheritanceMapping(String literal) {
		InheritanceMapping result = InheritanceMapping.get(literal);
		if (result == null) throw new IllegalArgumentException("The value '" + literal + "' is not a valid enumerator of '" + framewebPackage.Literals.INHERITANCE_MAPPING.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InheritanceMapping createInheritanceMappingFromString(EDataType eDataType, String initialValue) {
		return createInheritanceMapping(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceMapping(InheritanceMapping instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInheritanceMappingToString(EDataType eDataType, Object instanceValue) {
		return convertInheritanceMapping((InheritanceMapping)instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public framewebPackage getframewebPackage() {
		return (framewebPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static framewebPackage getPackage() {
		return framewebPackage.eINSTANCE;
	}

} //framewebFactoryImpl

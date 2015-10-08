/**
 */
package frameweb;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see frameweb.FramewebPackage
 * @generated
 */
public interface FramewebFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FramewebFactory eINSTANCE = frameweb.impl.FramewebFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mapped Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Class</em>'.
	 * @generated
	 */
	MappedClass createMappedClass();

	/**
	 * Returns a new object of class '<em>Persistent Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistent Class</em>'.
	 * @generated
	 */
	PersistentClass createPersistentClass();

	/**
	 * Returns a new object of class '<em>Transient Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transient Class</em>'.
	 * @generated
	 */
	TransientClass createTransientClass();

	/**
	 * Returns a new object of class '<em>Frameweb</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frameweb</em>'.
	 * @generated
	 */
	Frameweb createFrameweb();

	/**
	 * Returns a new object of class '<em>Framework</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Framework</em>'.
	 * @generated
	 */
	Framework createFramework();

	/**
	 * Returns a new object of class '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Model</em>'.
	 * @generated
	 */
	DomainModel createDomainModel();

	/**
	 * Returns a new object of class '<em>Navigation Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Model</em>'.
	 * @generated
	 */
	NavigationModel createNavigationModel();

	/**
	 * Returns a new object of class '<em>Application Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Model</em>'.
	 * @generated
	 */
	ApplicationModel createApplicationModel();

	/**
	 * Returns a new object of class '<em>Persistence Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Model</em>'.
	 * @generated
	 */
	PersistenceModel createPersistenceModel();

	/**
	 * Returns a new object of class '<em>Domain Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Association</em>'.
	 * @generated
	 */
	DomainAssociation createDomainAssociation();

	/**
	 * Returns a new object of class '<em>Version Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Version Attribute</em>'.
	 * @generated
	 */
	VersionAttribute createVersionAttribute();

	/**
	 * Returns a new object of class '<em>Id Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Id Attribute</em>'.
	 * @generated
	 */
	IdAttribute createIdAttribute();

	/**
	 * Returns a new object of class '<em>LOB Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>LOB Attribute</em>'.
	 * @generated
	 */
	LOBAttribute createLOBAttribute();

	/**
	 * Returns a new object of class '<em>Embedded Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Embedded Attribute</em>'.
	 * @generated
	 */
	EmbeddedAttribute createEmbeddedAttribute();

	/**
	 * Returns a new object of class '<em>Decimal Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decimal Attribute</em>'.
	 * @generated
	 */
	DecimalAttribute createDecimalAttribute();

	/**
	 * Returns a new object of class '<em>Date Time Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date Time Attribute</em>'.
	 * @generated
	 */
	DateTimeAttribute createDateTimeAttribute();

	/**
	 * Returns a new object of class '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page</em>'.
	 * @generated
	 */
	Page createPage();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	Template createTemplate();

	/**
	 * Returns a new object of class '<em>DAO Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Interface</em>'.
	 * @generated
	 */
	DAOInterface createDAOInterface();

	/**
	 * Returns a new object of class '<em>DAO Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Class</em>'.
	 * @generated
	 */
	DAOClass createDAOClass();

	/**
	 * Returns a new object of class '<em>DAO Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Generalization</em>'.
	 * @generated
	 */
	DAOGeneralization createDAOGeneralization();

	/**
	 * Returns a new object of class '<em>Front Controller Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Front Controller Class</em>'.
	 * @generated
	 */
	FrontControllerClass createFrontControllerClass();

	/**
	 * Returns a new object of class '<em>IO Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>IO Parameter</em>'.
	 * @generated
	 */
	IOParameter createIOParameter();

	/**
	 * Returns a new object of class '<em>DAO Base Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Base Operation</em>'.
	 * @generated
	 */
	DAOBaseOperation createDAOBaseOperation();

	/**
	 * Returns a new object of class '<em>Result Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Dependency</em>'.
	 * @generated
	 */
	ResultDependency createResultDependency();

	/**
	 * Returns a new object of class '<em>Navigation Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Association</em>'.
	 * @generated
	 */
	NavigationAssociation createNavigationAssociation();

	/**
	 * Returns a new object of class '<em>Front Controller Method</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Front Controller Method</em>'.
	 * @generated
	 */
	FrontControllerMethod createFrontControllerMethod();

	/**
	 * Returns a new object of class '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Class</em>'.
	 * @generated
	 */
	ServiceClass createServiceClass();

	/**
	 * Returns a new object of class '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Interface</em>'.
	 * @generated
	 */
	ServiceInterface createServiceInterface();

	/**
	 * Returns a new object of class '<em>Service Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Generalization</em>'.
	 * @generated
	 */
	ServiceGeneralization createServiceGeneralization();

	/**
	 * Returns a new object of class '<em>Service Navigation Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Navigation Association</em>'.
	 * @generated
	 */
	ServiceNavigationAssociation createServiceNavigationAssociation();

	/**
	 * Returns a new object of class '<em>Constant Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Name</em>'.
	 * @generated
	 */
	ConstantName createConstantName();

	/**
	 * Returns a new object of class '<em>Domain Table Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Table Name</em>'.
	 * @generated
	 */
	DomainTableName createDomainTableName();

	/**
	 * Returns a new object of class '<em>Frame Work Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Frame Work Name</em>'.
	 * @generated
	 */
	FrameWorkName createFrameWorkName();

	/**
	 * Returns a new object of class '<em>Domain Column Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Column Name</em>'.
	 * @generated
	 */
	DomainColumnName createDomainColumnName();

	/**
	 * Returns a new object of class '<em>DAO Interface Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Interface Name</em>'.
	 * @generated
	 */
	DAOInterfaceName createDAOInterfaceName();

	/**
	 * Returns a new object of class '<em>DAO Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Class Name</em>'.
	 * @generated
	 */
	DAOClassName createDAOClassName();

	/**
	 * Returns a new object of class '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result</em>'.
	 * @generated
	 */
	ResultType createResult();

	/**
	 * Returns a new object of class '<em>Front Controller Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Front Controller Dependency</em>'.
	 * @generated
	 */
	FrontControllerDependency createFrontControllerDependency();

	/**
	 * Returns a new object of class '<em>Page Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Dependency</em>'.
	 * @generated
	 */
	PageDependency createPageDependency();

	/**
	 * Returns a new object of class '<em>Chaining Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chaining Dependency</em>'.
	 * @generated
	 */
	ChainingDependency createChainingDependency();

	/**
	 * Returns a new object of class '<em>DAO Service Association</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Service Association</em>'.
	 * @generated
	 */
	DAOServiceAssociation createDAOServiceAssociation();

	/**
	 * Returns a new object of class '<em>Domain Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Operation</em>'.
	 * @generated
	 */
	DomainOperation createDomainOperation();

	/**
	 * Returns a new object of class '<em>DAO Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Attribute</em>'.
	 * @generated
	 */
	DAOAttribute createDAOAttribute();

	/**
	 * Returns a new object of class '<em>Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Operation</em>'.
	 * @generated
	 */
	ServiceOperation createServiceOperation();

	/**
	 * Returns a new object of class '<em>Service Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Attribute</em>'.
	 * @generated
	 */
	ServiceAttribute createServiceAttribute();

	/**
	 * Returns a new object of class '<em>DAO Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DAO Operation</em>'.
	 * @generated
	 */
	DAOOperation createDAOOperation();

	/**
	 * Returns a new object of class '<em>Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Package</em>'.
	 * @generated
	 */
	DomainPackage createDomainPackage();

	/**
	 * Returns a new object of class '<em>View Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>View Package</em>'.
	 * @generated
	 */
	ViewPackage createViewPackage();

	/**
	 * Returns a new object of class '<em>Controller Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Controller Package</em>'.
	 * @generated
	 */
	ControllerPackage createControllerPackage();

	/**
	 * Returns a new object of class '<em>Persistence Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Package</em>'.
	 * @generated
	 */
	PersistencePackage createPersistencePackage();

	/**
	 * Returns a new object of class '<em>Application Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Package</em>'.
	 * @generated
	 */
	ApplicationPackage createApplicationPackage();

	/**
	 * Returns a new object of class '<em>UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Component</em>'.
	 * @generated
	 */
	Tag createUIComponent();

	/**
	 * Returns a new object of class '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Type</em>'.
	 * @generated
	 */
	ResultType createResultType();

	/**
	 * Returns a new object of class '<em>Domain Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Domain Generalization</em>'.
	 * @generated
	 */
	DomainGeneralization createDomainGeneralization();

	/**
	 * Returns a new object of class '<em>JQuery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>JQuery</em>'.
	 * @generated
	 */
	JQuery createJQuery();

	/**
	 * Returns a new object of class '<em>UI Component Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UI Component Field</em>'.
	 * @generated
	 */
	Tag createUIComponentField();

	/**
	 * Returns a new object of class '<em>Tag Lib</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag Lib</em>'.
	 * @generated
	 */
	TagLib createTagLib();

	/**
	 * Returns a new object of class '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rule</em>'.
	 * @generated
	 */
	Rule createRule();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Anotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Anotation</em>'.
	 * @generated
	 */
	Anotation createAnotation();

	/**
	 * Returns a new object of class '<em>Navigation Composition Part</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Composition Part</em>'.
	 * @generated
	 */
	NavigationCompositionPart createNavigationCompositionPart();

	/**
	 * Returns a new object of class '<em>Navigation Composition Whole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Navigation Composition Whole</em>'.
	 * @generated
	 */
	NavigationCompositionWhole createNavigationCompositionWhole();

	/**
	 * Returns a new object of class '<em>Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Set</em>'.
	 * @generated
	 */
	ResultSet createResultSet();

	/**
	 * Returns a new object of class '<em>Page Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Page Constraint</em>'.
	 * @generated
	 */
	PageConstraint createPageConstraint();

	/**
	 * Returns a new object of class '<em>Result Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Result Constraint</em>'.
	 * @generated
	 */
	ResultConstraint createResultConstraint();

	/**
	 * Returns a new object of class '<em>Method Cosntraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Method Cosntraint</em>'.
	 * @generated
	 */
	MethodCosntraint createMethodCosntraint();

	/**
	 * Returns a new object of class '<em>Chaining Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chaining Constraint</em>'.
	 * @generated
	 */
	ChainingConstraint createChainingConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FramewebPackage getFramewebPackage();

} //FramewebFactory

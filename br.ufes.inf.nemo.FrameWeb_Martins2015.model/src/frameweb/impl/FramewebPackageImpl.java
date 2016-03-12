/**
 */
package frameweb.impl;

import frameweb.ApplicationModel;
import frameweb.ApplicationPackage;
import frameweb.AttributeMapping;
import frameweb.AttributeMappingExtension;
import frameweb.AttributeMappingExtensionEnd;
import frameweb.AttributeMappingProperty;
import frameweb.Cascade;
import frameweb.ChainingConstraint;
import frameweb.ChainingDependency;
import frameweb.ClassMapping;
import frameweb.ClassMappingExtension;
import frameweb.ClassMappingExtensionEnd;
import frameweb.ClassMappingPropery;
import frameweb.Collection;
import frameweb.ConstantName;
import frameweb.ConstantNameList;
import frameweb.Controller;
import frameweb.ControllerExtension;
import frameweb.ControllerExtensionEnd;
import frameweb.ControllerPackage;
import frameweb.ControllerProperty;
import frameweb.ControllerSet;
import frameweb.DAOAttribute;
import frameweb.DAOClass;
import frameweb.DAOClassName;
import frameweb.DAOGeneralization;
import frameweb.DAOInterface;
import frameweb.DAOInterfaceName;
import frameweb.DAOMethod;
import frameweb.DAORealization;
import frameweb.DAOServiceAssociation;
import frameweb.DateTimeAttribute;
import frameweb.DateTimePrecision;
import frameweb.DecimalAttribute;
import frameweb.DomainAssociation;
import frameweb.DomainAttribute;
import frameweb.DomainClass;
import frameweb.DomainColumnName;
import frameweb.DomainConstraints;
import frameweb.DomainGeneralization;
import frameweb.DomainGeneralizationSet;
import frameweb.DomainMethod;
import frameweb.DomainModel;
import frameweb.DomainPackage;
import frameweb.DomainProperty;
import frameweb.DomainTableName;
import frameweb.EmbeddedAttribute;
import frameweb.Fetch;
import frameweb.FrameWebModel;
import frameweb.Frameweb;
import frameweb.FramewebFactory;
import frameweb.FramewebPackage;
import frameweb.Framework;
import frameweb.FrameworkCategoryList;
import frameweb.FrameworkExtension;
import frameweb.FrameworkKindList;
import frameweb.FrameworkProfile;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerDependency;
import frameweb.FrontControllerMethod;
import frameweb.Generation;
import frameweb.IOParameter;
import frameweb.IdAttribute;
import frameweb.InheritanceMapping;
import frameweb.JQuery;
import frameweb.LOBAttribute;
import frameweb.MappingLib;
import frameweb.MethodCosntraint;
import frameweb.NavigationAssociation;
import frameweb.NavigationAttribute;
import frameweb.NavigationClass;
import frameweb.NavigationCompositionPart;
import frameweb.NavigationCompositionWhole;
import frameweb.NavigationConstraint;
import frameweb.NavigationDependency;
import frameweb.NavigationGeneralization;
import frameweb.NavigationModel;
import frameweb.NavigationPackage;
import frameweb.NavigationProperty;
import frameweb.Order;
import frameweb.Page;
import frameweb.PageConstraint;
import frameweb.PageDependency;
import frameweb.PersistenceModel;
import frameweb.PersistencePackage;
import frameweb.Result;
import frameweb.ResultConstraint;
import frameweb.ResultDependency;
import frameweb.ResultExtension;
import frameweb.ResultProperty;
import frameweb.ResultSet;
import frameweb.ResultType;
import frameweb.ReultExtensionEnd;
import frameweb.ServiceAssociation;
import frameweb.ServiceAttribute;
import frameweb.ServiceClass;
import frameweb.ServiceGeneralization;
import frameweb.ServiceInterface;
import frameweb.ServiceNavigationAssociation;
import frameweb.ServiceOperation;
import frameweb.Tag;
import frameweb.TagExtension;
import frameweb.TagExtensionEnd;
import frameweb.TagLib;
import frameweb.TagProperty;
import frameweb.Template;
import frameweb.UIComponent;
import frameweb.VersionAttribute;
import frameweb.ViewPackage;

import frameweb.util.FramewebValidator;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FramewebPackageImpl extends EPackageImpl implements FramewebPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass framewebEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameWebModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistenceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lobAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass embeddedAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass decimalAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTimeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoRealizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontControllerClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ioParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontControllerMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceNavigationAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainTableNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainColumnNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoInterfaceNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoClassNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frontControllerDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainingDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoServiceAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationDependencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass viewPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass persistencePackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uiComponentFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationCompositionPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationCompositionWholeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodCosntraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass navigationGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass daoGeneralizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingLibEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass domainGeneralizationSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass frameworkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerExtensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagExtensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reultExtensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingExtensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingExtensionEndEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controllerPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resultPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classMappingProperyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeMappingPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dateTimePrecisionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum generationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum collectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cascadeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fetchEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frameworkCategoryListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constantNameListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inheritanceMappingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frameworkKindListEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see frameweb.FramewebPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FramewebPackageImpl() {
		super(eNS_URI, FramewebFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FramewebPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FramewebPackage init() {
		if (isInited) return (FramewebPackage)EPackage.Registry.INSTANCE.getEPackage(FramewebPackage.eNS_URI);

		// Obtain or create and register package
		FramewebPackageImpl theFramewebPackage = (FramewebPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FramewebPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FramewebPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theFramewebPackage.createPackageContents();

		// Initialize created meta-data
		theFramewebPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theFramewebPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return FramewebValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theFramewebPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FramewebPackage.eNS_URI, theFramewebPackage);
		return theFramewebPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameweb() {
		return framewebEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameweb_Compose() {
		return (EReference)framewebEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrameweb_Configures() {
		return (EReference)framewebEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameWebModel() {
		return frameWebModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameworkProfile() {
		return frameworkProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameworkProfile_Category() {
		return (EAttribute)frameworkProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrameworkProfile_Kind() {
		return (EAttribute)frameworkProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainModel() {
		return domainModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_DomainUMLPackage() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainModel_DomainUMLAssociation() {
		return (EReference)domainModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationModel() {
		return navigationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationModel_NavigationUMLDependency() {
		return (EReference)navigationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationModel_ViewUMLPackage() {
		return (EReference)navigationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationModel_ControllerUMLPackage() {
		return (EReference)navigationModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationModel_NavigationUMLComposition() {
		return (EReference)navigationModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationModel() {
		return applicationModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationModel_ServiceUMLAssociation() {
		return (EReference)applicationModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationModel_ApplicationUMLPackage() {
		return (EReference)applicationModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistenceModel() {
		return persistenceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistenceModel_PersistenceUMLPackage() {
		return (EReference)persistenceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAssociation() {
		return domainAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAssociation_SourceClass() {
		return (EReference)domainAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAssociation_TargetClass() {
		return (EReference)domainAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAssociation_Collection() {
		return (EAttribute)domainAssociationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAssociation_Cascade() {
		return (EAttribute)domainAssociationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAssociation_Fetch() {
		return (EAttribute)domainAssociationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAssociation_Order() {
		return (EAttribute)domainAssociationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainAttribute() {
		return domainAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAttribute_Size() {
		return (EAttribute)domainAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAttribute_IsNull() {
		return (EAttribute)domainAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainAttribute_IsPersistent() {
		return (EAttribute)domainAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainAttribute_Column() {
		return (EReference)domainAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVersionAttribute() {
		return versionAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdAttribute() {
		return idAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdAttribute_Generation() {
		return (EAttribute)idAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLOBAttribute() {
		return lobAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmbeddedAttribute() {
		return embeddedAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDecimalAttribute() {
		return decimalAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalAttribute_DecimalPrecision() {
		return (EAttribute)decimalAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDecimalAttribute_DecimalScale() {
		return (EAttribute)decimalAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateTimeAttribute() {
		return dateTimeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateTimeAttribute_DateTimePrecision() {
		return (EAttribute)dateTimeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPage_PageTagLib() {
		return (EReference)pageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplate() {
		return templateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplate_TemplateTagLib() {
		return (EReference)templateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAOInterface() {
		return daoInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOInterface_OwnOperation() {
		return (EReference)daoInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOInterface_DAOInterfaceName() {
		return (EReference)daoInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOInterface_DAOInterfaceAttribute() {
		return (EReference)daoInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAOInterface_Infix() {
		return (EAttribute)daoInterfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAOInterface_Sufix() {
		return (EAttribute)daoInterfaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAOClass() {
		return daoClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOClass_DAOImplements() {
		return (EReference)daoClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOClass_DAOClassName() {
		return (EReference)daoClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOClass_DAOClassAttribute() {
		return (EReference)daoClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAOClass_Sufix() {
		return (EAttribute)daoClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAOClass_Infix() {
		return (EAttribute)daoClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDAOClass_Prefix() {
		return (EAttribute)daoClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAORealization() {
		return daoRealizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAORealization_TargetDAOClass() {
		return (EReference)daoRealizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAORealization_SourceDAOInterface() {
		return (EReference)daoRealizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrontControllerClass() {
		return frontControllerClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrontControllerClass_FrontControllerAttribute() {
		return (EReference)frontControllerClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrontControllerClass_FrontControllerClassMethod() {
		return (EReference)frontControllerClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIOParameter() {
		return ioParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIOParameter_Display() {
		return (EReference)ioParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultDependency() {
		return resultDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultDependency_ResultResult() {
		return (EReference)resultDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultDependency_ResultMethod() {
		return (EReference)resultDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResultDependency_ResultDependendencyCosntraint() {
		return (EReference)resultDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDependency_Render() {
		return (EAttribute)resultDependencyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDependency_Execute() {
		return (EAttribute)resultDependencyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResultDependency_Ajax() {
		return (EAttribute)resultDependencyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationAssociation() {
		return navigationAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationAssociation_NavigationAssociationProperty() {
		return (EReference)navigationAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrontControllerMethod() {
		return frontControllerMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFrontControllerMethod_IsDefault() {
		return (EAttribute)frontControllerMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceClass() {
		return serviceClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceClass_ServiceClassAttribute() {
		return (EReference)serviceClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceClass_ServiceClassOperation() {
		return (EReference)serviceClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceInterface() {
		return serviceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterface_ServiceInterfaceOperation() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceInterface_ServiceInterfaceAttribute() {
		return (EReference)serviceInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceGeneralization() {
		return serviceGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGeneralization_SourceServiceInterface() {
		return (EReference)serviceGeneralizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceGeneralization_TargetServiceClass() {
		return (EReference)serviceGeneralizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceNavigationAssociation() {
		return serviceNavigationAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNavigationAssociation_SourceServiceClass() {
		return (EReference)serviceNavigationAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceNavigationAssociation_TargetFrontController() {
		return (EReference)serviceNavigationAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainClass() {
		return domainClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainClass_DomainClassAttribute() {
		return (EReference)domainClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainClass_DomainClassOperation() {
		return (EReference)domainClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainClass_Table() {
		return (EAttribute)domainClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstantName() {
		return constantNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstantName_FwName() {
		return (EAttribute)constantNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainTableName() {
		return domainTableNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainTableName_FwName() {
		return (EAttribute)domainTableNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainColumnName() {
		return domainColumnNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainColumnName_FwName() {
		return (EAttribute)domainColumnNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainColumnName_DomainAttributeName() {
		return (EReference)domainColumnNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAOInterfaceName() {
		return daoInterfaceNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOInterfaceName_ConstantPrefix() {
		return (EReference)daoInterfaceNameEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOInterfaceName_DomainTablePrefix() {
		return (EReference)daoInterfaceNameEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAOClassName() {
		return daoClassNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResult() {
		return resultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrontControllerDependency() {
		return frontControllerDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrontControllerDependency_Method() {
		return (EReference)frontControllerDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFrontControllerDependency_MethodDependendencyConstraint() {
		return (EReference)frontControllerDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageDependency() {
		return pageDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPageDependency_PageDependencyCosntraint() {
		return (EReference)pageDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainingDependency() {
		return chainingDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainingDependency_OutMethod() {
		return (EReference)chainingDependencyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainingDependency_InMethod() {
		return (EReference)chainingDependencyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChainingDependency_ChainingDependendencyConstraint() {
		return (EReference)chainingDependencyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAOServiceAssociation() {
		return daoServiceAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOServiceAssociation_SourceDAOClass() {
		return (EReference)daoServiceAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDAOServiceAssociation_TargetDAOService() {
		return (EReference)daoServiceAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationAttribute() {
		return navigationAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationClass() {
		return navigationClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationClass_NavigationClassComposition() {
		return (EReference)navigationClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNavigationClass_NavigationClassAttribute() {
		return (EReference)navigationClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainMethod() {
		return domainMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAOAttribute() {
		return daoAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOperation() {
		return serviceOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceAttribute() {
		return serviceAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceAssociation() {
		return serviceAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationDependency() {
		return navigationDependencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAOMethod() {
		return daoMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainPackage() {
		return domainPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainPackage_DomainPackageClass() {
		return (EReference)domainPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getViewPackage() {
		return viewPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPackage_ViewPackageClass() {
		return (EReference)viewPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getViewPackage_ViewPackageResult() {
		return (EReference)viewPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerPackage() {
		return controllerPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getControllerPackage_ControllerPackageClass() {
		return (EReference)controllerPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersistencePackage() {
		return persistencePackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistencePackage_PersistencePackageInterface() {
		return (EReference)persistencePackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersistencePackage_PersistencePackageClass() {
		return (EReference)persistencePackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationPackage() {
		return applicationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationPackage_ServicePackageClass() {
		return (EReference)applicationPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationPackage_ServicePackageInterface() {
		return (EReference)applicationPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIComponent() {
		return uiComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultType() {
		return resultTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationPackage() {
		return navigationPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainGeneralization() {
		return domainGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainGeneralization_TargetDomain() {
		return (EReference)domainGeneralizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDomainGeneralization_SourceDomain() {
		return (EReference)domainGeneralizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJQuery() {
		return jQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUIComponentField() {
		return uiComponentFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUIComponentField_Inject() {
		return (EReference)uiComponentFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagLib() {
		return tagLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagLib_Prefix() {
		return (EAttribute)tagLibEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTag() {
		return tagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationCompositionPart() {
		return navigationCompositionPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationCompositionWhole() {
		return navigationCompositionWholeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationProperty() {
		return navigationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultSet() {
		return resultSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationConstraint() {
		return navigationConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPageConstraint() {
		return pageConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultConstraint() {
		return resultConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodCosntraint() {
		return methodCosntraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChainingConstraint() {
		return chainingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNavigationGeneralization() {
		return navigationGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainConstraints() {
		return domainConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainProperty() {
		return domainPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDAOGeneralization() {
		return daoGeneralizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingLib() {
		return mappingLibEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMapping() {
		return classMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMapping() {
		return attributeMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainGeneralizationSet() {
		return domainGeneralizationSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDomainGeneralizationSet_Mapping() {
		return (EAttribute)domainGeneralizationSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFrameworkExtension() {
		return frameworkExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagExtension() {
		return tagExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFramework() {
		return frameworkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerExtension() {
		return controllerExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getController() {
		return controllerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerSet() {
		return controllerSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultExtension() {
		return resultExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMappingExtension() {
		return classMappingExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMappingExtension() {
		return attributeMappingExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerExtensionEnd() {
		return controllerExtensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagExtensionEnd() {
		return tagExtensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReultExtensionEnd() {
		return reultExtensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMappingExtensionEnd() {
		return classMappingExtensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMappingExtensionEnd() {
		return attributeMappingExtensionEndEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControllerProperty() {
		return controllerPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagProperty() {
		return tagPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResultProperty() {
		return resultPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassMappingPropery() {
		return classMappingProperyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeMappingProperty() {
		return attributeMappingPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDateTimePrecision() {
		return dateTimePrecisionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGeneration() {
		return generationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCollection() {
		return collectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrder() {
		return orderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCascade() {
		return cascadeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFetch() {
		return fetchEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrameworkCategoryList() {
		return frameworkCategoryListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConstantNameList() {
		return constantNameListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInheritanceMapping() {
		return inheritanceMappingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrameworkKindList() {
		return frameworkKindListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebFactory getFramewebFactory() {
		return (FramewebFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		framewebEClass = createEClass(FRAMEWEB);
		createEReference(framewebEClass, FRAMEWEB__COMPOSE);
		createEReference(framewebEClass, FRAMEWEB__CONFIGURES);

		frameWebModelEClass = createEClass(FRAME_WEB_MODEL);

		frameworkProfileEClass = createEClass(FRAMEWORK_PROFILE);
		createEAttribute(frameworkProfileEClass, FRAMEWORK_PROFILE__CATEGORY);
		createEAttribute(frameworkProfileEClass, FRAMEWORK_PROFILE__KIND);

		domainModelEClass = createEClass(DOMAIN_MODEL);
		createEReference(domainModelEClass, DOMAIN_MODEL__DOMAIN_UML_PACKAGE);
		createEReference(domainModelEClass, DOMAIN_MODEL__DOMAIN_UML_ASSOCIATION);

		navigationModelEClass = createEClass(NAVIGATION_MODEL);
		createEReference(navigationModelEClass, NAVIGATION_MODEL__NAVIGATION_UML_DEPENDENCY);
		createEReference(navigationModelEClass, NAVIGATION_MODEL__VIEW_UML_PACKAGE);
		createEReference(navigationModelEClass, NAVIGATION_MODEL__CONTROLLER_UML_PACKAGE);
		createEReference(navigationModelEClass, NAVIGATION_MODEL__NAVIGATION_UML_COMPOSITION);

		applicationModelEClass = createEClass(APPLICATION_MODEL);
		createEReference(applicationModelEClass, APPLICATION_MODEL__SERVICE_UML_ASSOCIATION);
		createEReference(applicationModelEClass, APPLICATION_MODEL__APPLICATION_UML_PACKAGE);

		persistenceModelEClass = createEClass(PERSISTENCE_MODEL);
		createEReference(persistenceModelEClass, PERSISTENCE_MODEL__PERSISTENCE_UML_PACKAGE);

		domainAssociationEClass = createEClass(DOMAIN_ASSOCIATION);
		createEReference(domainAssociationEClass, DOMAIN_ASSOCIATION__SOURCE_CLASS);
		createEReference(domainAssociationEClass, DOMAIN_ASSOCIATION__TARGET_CLASS);
		createEAttribute(domainAssociationEClass, DOMAIN_ASSOCIATION__COLLECTION);
		createEAttribute(domainAssociationEClass, DOMAIN_ASSOCIATION__CASCADE);
		createEAttribute(domainAssociationEClass, DOMAIN_ASSOCIATION__FETCH);
		createEAttribute(domainAssociationEClass, DOMAIN_ASSOCIATION__ORDER);

		domainAttributeEClass = createEClass(DOMAIN_ATTRIBUTE);
		createEAttribute(domainAttributeEClass, DOMAIN_ATTRIBUTE__SIZE);
		createEAttribute(domainAttributeEClass, DOMAIN_ATTRIBUTE__IS_NULL);
		createEAttribute(domainAttributeEClass, DOMAIN_ATTRIBUTE__IS_PERSISTENT);
		createEReference(domainAttributeEClass, DOMAIN_ATTRIBUTE__COLUMN);

		versionAttributeEClass = createEClass(VERSION_ATTRIBUTE);

		idAttributeEClass = createEClass(ID_ATTRIBUTE);
		createEAttribute(idAttributeEClass, ID_ATTRIBUTE__GENERATION);

		lobAttributeEClass = createEClass(LOB_ATTRIBUTE);

		embeddedAttributeEClass = createEClass(EMBEDDED_ATTRIBUTE);

		decimalAttributeEClass = createEClass(DECIMAL_ATTRIBUTE);
		createEAttribute(decimalAttributeEClass, DECIMAL_ATTRIBUTE__DECIMAL_PRECISION);
		createEAttribute(decimalAttributeEClass, DECIMAL_ATTRIBUTE__DECIMAL_SCALE);

		dateTimeAttributeEClass = createEClass(DATE_TIME_ATTRIBUTE);
		createEAttribute(dateTimeAttributeEClass, DATE_TIME_ATTRIBUTE__DATE_TIME_PRECISION);

		pageEClass = createEClass(PAGE);
		createEReference(pageEClass, PAGE__PAGE_TAG_LIB);

		templateEClass = createEClass(TEMPLATE);
		createEReference(templateEClass, TEMPLATE__TEMPLATE_TAG_LIB);

		daoInterfaceEClass = createEClass(DAO_INTERFACE);
		createEReference(daoInterfaceEClass, DAO_INTERFACE__OWN_OPERATION);
		createEReference(daoInterfaceEClass, DAO_INTERFACE__DAO_INTERFACE_NAME);
		createEReference(daoInterfaceEClass, DAO_INTERFACE__DAO_INTERFACE_ATTRIBUTE);
		createEAttribute(daoInterfaceEClass, DAO_INTERFACE__INFIX);
		createEAttribute(daoInterfaceEClass, DAO_INTERFACE__SUFIX);

		daoClassEClass = createEClass(DAO_CLASS);
		createEReference(daoClassEClass, DAO_CLASS__DAO_IMPLEMENTS);
		createEReference(daoClassEClass, DAO_CLASS__DAO_CLASS_NAME);
		createEReference(daoClassEClass, DAO_CLASS__DAO_CLASS_ATTRIBUTE);
		createEAttribute(daoClassEClass, DAO_CLASS__SUFIX);
		createEAttribute(daoClassEClass, DAO_CLASS__INFIX);
		createEAttribute(daoClassEClass, DAO_CLASS__PREFIX);

		daoRealizationEClass = createEClass(DAO_REALIZATION);
		createEReference(daoRealizationEClass, DAO_REALIZATION__TARGET_DAO_CLASS);
		createEReference(daoRealizationEClass, DAO_REALIZATION__SOURCE_DAO_INTERFACE);

		frontControllerClassEClass = createEClass(FRONT_CONTROLLER_CLASS);
		createEReference(frontControllerClassEClass, FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_ATTRIBUTE);
		createEReference(frontControllerClassEClass, FRONT_CONTROLLER_CLASS__FRONT_CONTROLLER_CLASS_METHOD);

		ioParameterEClass = createEClass(IO_PARAMETER);
		createEReference(ioParameterEClass, IO_PARAMETER__DISPLAY);

		resultDependencyEClass = createEClass(RESULT_DEPENDENCY);
		createEReference(resultDependencyEClass, RESULT_DEPENDENCY__RESULT_RESULT);
		createEReference(resultDependencyEClass, RESULT_DEPENDENCY__RESULT_METHOD);
		createEReference(resultDependencyEClass, RESULT_DEPENDENCY__RESULT_DEPENDENDENCY_COSNTRAINT);
		createEAttribute(resultDependencyEClass, RESULT_DEPENDENCY__RENDER);
		createEAttribute(resultDependencyEClass, RESULT_DEPENDENCY__EXECUTE);
		createEAttribute(resultDependencyEClass, RESULT_DEPENDENCY__AJAX);

		navigationAssociationEClass = createEClass(NAVIGATION_ASSOCIATION);
		createEReference(navigationAssociationEClass, NAVIGATION_ASSOCIATION__NAVIGATION_ASSOCIATION_PROPERTY);

		frontControllerMethodEClass = createEClass(FRONT_CONTROLLER_METHOD);
		createEAttribute(frontControllerMethodEClass, FRONT_CONTROLLER_METHOD__IS_DEFAULT);

		serviceClassEClass = createEClass(SERVICE_CLASS);
		createEReference(serviceClassEClass, SERVICE_CLASS__SERVICE_CLASS_ATTRIBUTE);
		createEReference(serviceClassEClass, SERVICE_CLASS__SERVICE_CLASS_OPERATION);

		serviceInterfaceEClass = createEClass(SERVICE_INTERFACE);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__SERVICE_INTERFACE_OPERATION);
		createEReference(serviceInterfaceEClass, SERVICE_INTERFACE__SERVICE_INTERFACE_ATTRIBUTE);

		serviceGeneralizationEClass = createEClass(SERVICE_GENERALIZATION);
		createEReference(serviceGeneralizationEClass, SERVICE_GENERALIZATION__SOURCE_SERVICE_INTERFACE);
		createEReference(serviceGeneralizationEClass, SERVICE_GENERALIZATION__TARGET_SERVICE_CLASS);

		serviceNavigationAssociationEClass = createEClass(SERVICE_NAVIGATION_ASSOCIATION);
		createEReference(serviceNavigationAssociationEClass, SERVICE_NAVIGATION_ASSOCIATION__SOURCE_SERVICE_CLASS);
		createEReference(serviceNavigationAssociationEClass, SERVICE_NAVIGATION_ASSOCIATION__TARGET_FRONT_CONTROLLER);

		domainClassEClass = createEClass(DOMAIN_CLASS);
		createEReference(domainClassEClass, DOMAIN_CLASS__DOMAIN_CLASS_ATTRIBUTE);
		createEReference(domainClassEClass, DOMAIN_CLASS__DOMAIN_CLASS_OPERATION);
		createEAttribute(domainClassEClass, DOMAIN_CLASS__TABLE);

		constantNameEClass = createEClass(CONSTANT_NAME);
		createEAttribute(constantNameEClass, CONSTANT_NAME__FW_NAME);

		domainTableNameEClass = createEClass(DOMAIN_TABLE_NAME);
		createEAttribute(domainTableNameEClass, DOMAIN_TABLE_NAME__FW_NAME);

		domainColumnNameEClass = createEClass(DOMAIN_COLUMN_NAME);
		createEAttribute(domainColumnNameEClass, DOMAIN_COLUMN_NAME__FW_NAME);
		createEReference(domainColumnNameEClass, DOMAIN_COLUMN_NAME__DOMAIN_ATTRIBUTE_NAME);

		daoInterfaceNameEClass = createEClass(DAO_INTERFACE_NAME);
		createEReference(daoInterfaceNameEClass, DAO_INTERFACE_NAME__CONSTANT_PREFIX);
		createEReference(daoInterfaceNameEClass, DAO_INTERFACE_NAME__DOMAIN_TABLE_PREFIX);

		daoClassNameEClass = createEClass(DAO_CLASS_NAME);

		resultEClass = createEClass(RESULT);

		frontControllerDependencyEClass = createEClass(FRONT_CONTROLLER_DEPENDENCY);
		createEReference(frontControllerDependencyEClass, FRONT_CONTROLLER_DEPENDENCY__METHOD);
		createEReference(frontControllerDependencyEClass, FRONT_CONTROLLER_DEPENDENCY__METHOD_DEPENDENDENCY_CONSTRAINT);

		pageDependencyEClass = createEClass(PAGE_DEPENDENCY);
		createEReference(pageDependencyEClass, PAGE_DEPENDENCY__PAGE_DEPENDENCY_COSNTRAINT);

		chainingDependencyEClass = createEClass(CHAINING_DEPENDENCY);
		createEReference(chainingDependencyEClass, CHAINING_DEPENDENCY__OUT_METHOD);
		createEReference(chainingDependencyEClass, CHAINING_DEPENDENCY__IN_METHOD);
		createEReference(chainingDependencyEClass, CHAINING_DEPENDENCY__CHAINING_DEPENDENDENCY_CONSTRAINT);

		daoServiceAssociationEClass = createEClass(DAO_SERVICE_ASSOCIATION);
		createEReference(daoServiceAssociationEClass, DAO_SERVICE_ASSOCIATION__SOURCE_DAO_CLASS);
		createEReference(daoServiceAssociationEClass, DAO_SERVICE_ASSOCIATION__TARGET_DAO_SERVICE);

		navigationAttributeEClass = createEClass(NAVIGATION_ATTRIBUTE);

		navigationClassEClass = createEClass(NAVIGATION_CLASS);
		createEReference(navigationClassEClass, NAVIGATION_CLASS__NAVIGATION_CLASS_COMPOSITION);
		createEReference(navigationClassEClass, NAVIGATION_CLASS__NAVIGATION_CLASS_ATTRIBUTE);

		domainMethodEClass = createEClass(DOMAIN_METHOD);

		daoAttributeEClass = createEClass(DAO_ATTRIBUTE);

		serviceOperationEClass = createEClass(SERVICE_OPERATION);

		serviceAttributeEClass = createEClass(SERVICE_ATTRIBUTE);

		serviceAssociationEClass = createEClass(SERVICE_ASSOCIATION);

		navigationDependencyEClass = createEClass(NAVIGATION_DEPENDENCY);

		daoMethodEClass = createEClass(DAO_METHOD);

		domainPackageEClass = createEClass(DOMAIN_PACKAGE);
		createEReference(domainPackageEClass, DOMAIN_PACKAGE__DOMAIN_PACKAGE_CLASS);

		viewPackageEClass = createEClass(VIEW_PACKAGE);
		createEReference(viewPackageEClass, VIEW_PACKAGE__VIEW_PACKAGE_CLASS);
		createEReference(viewPackageEClass, VIEW_PACKAGE__VIEW_PACKAGE_RESULT);

		controllerPackageEClass = createEClass(CONTROLLER_PACKAGE);
		createEReference(controllerPackageEClass, CONTROLLER_PACKAGE__CONTROLLER_PACKAGE_CLASS);

		persistencePackageEClass = createEClass(PERSISTENCE_PACKAGE);
		createEReference(persistencePackageEClass, PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_INTERFACE);
		createEReference(persistencePackageEClass, PERSISTENCE_PACKAGE__PERSISTENCE_PACKAGE_CLASS);

		applicationPackageEClass = createEClass(APPLICATION_PACKAGE);
		createEReference(applicationPackageEClass, APPLICATION_PACKAGE__SERVICE_PACKAGE_CLASS);
		createEReference(applicationPackageEClass, APPLICATION_PACKAGE__SERVICE_PACKAGE_INTERFACE);

		uiComponentEClass = createEClass(UI_COMPONENT);

		resultTypeEClass = createEClass(RESULT_TYPE);

		navigationPackageEClass = createEClass(NAVIGATION_PACKAGE);

		domainGeneralizationEClass = createEClass(DOMAIN_GENERALIZATION);
		createEReference(domainGeneralizationEClass, DOMAIN_GENERALIZATION__TARGET_DOMAIN);
		createEReference(domainGeneralizationEClass, DOMAIN_GENERALIZATION__SOURCE_DOMAIN);

		jQueryEClass = createEClass(JQUERY);

		uiComponentFieldEClass = createEClass(UI_COMPONENT_FIELD);
		createEReference(uiComponentFieldEClass, UI_COMPONENT_FIELD__INJECT);

		tagLibEClass = createEClass(TAG_LIB);
		createEAttribute(tagLibEClass, TAG_LIB__PREFIX);

		tagEClass = createEClass(TAG);

		navigationCompositionPartEClass = createEClass(NAVIGATION_COMPOSITION_PART);

		navigationCompositionWholeEClass = createEClass(NAVIGATION_COMPOSITION_WHOLE);

		navigationPropertyEClass = createEClass(NAVIGATION_PROPERTY);

		resultSetEClass = createEClass(RESULT_SET);

		navigationConstraintEClass = createEClass(NAVIGATION_CONSTRAINT);

		pageConstraintEClass = createEClass(PAGE_CONSTRAINT);

		resultConstraintEClass = createEClass(RESULT_CONSTRAINT);

		methodCosntraintEClass = createEClass(METHOD_COSNTRAINT);

		chainingConstraintEClass = createEClass(CHAINING_CONSTRAINT);

		navigationGeneralizationEClass = createEClass(NAVIGATION_GENERALIZATION);

		domainConstraintsEClass = createEClass(DOMAIN_CONSTRAINTS);

		domainPropertyEClass = createEClass(DOMAIN_PROPERTY);

		daoGeneralizationEClass = createEClass(DAO_GENERALIZATION);

		mappingLibEClass = createEClass(MAPPING_LIB);

		classMappingEClass = createEClass(CLASS_MAPPING);

		attributeMappingEClass = createEClass(ATTRIBUTE_MAPPING);

		domainGeneralizationSetEClass = createEClass(DOMAIN_GENERALIZATION_SET);
		createEAttribute(domainGeneralizationSetEClass, DOMAIN_GENERALIZATION_SET__MAPPING);

		frameworkExtensionEClass = createEClass(FRAMEWORK_EXTENSION);

		tagExtensionEClass = createEClass(TAG_EXTENSION);

		frameworkEClass = createEClass(FRAMEWORK);

		controllerExtensionEClass = createEClass(CONTROLLER_EXTENSION);

		controllerEClass = createEClass(CONTROLLER);

		controllerSetEClass = createEClass(CONTROLLER_SET);

		resultExtensionEClass = createEClass(RESULT_EXTENSION);

		classMappingExtensionEClass = createEClass(CLASS_MAPPING_EXTENSION);

		attributeMappingExtensionEClass = createEClass(ATTRIBUTE_MAPPING_EXTENSION);

		controllerExtensionEndEClass = createEClass(CONTROLLER_EXTENSION_END);

		tagExtensionEndEClass = createEClass(TAG_EXTENSION_END);

		reultExtensionEndEClass = createEClass(REULT_EXTENSION_END);

		classMappingExtensionEndEClass = createEClass(CLASS_MAPPING_EXTENSION_END);

		attributeMappingExtensionEndEClass = createEClass(ATTRIBUTE_MAPPING_EXTENSION_END);

		controllerPropertyEClass = createEClass(CONTROLLER_PROPERTY);

		tagPropertyEClass = createEClass(TAG_PROPERTY);

		resultPropertyEClass = createEClass(RESULT_PROPERTY);

		classMappingProperyEClass = createEClass(CLASS_MAPPING_PROPERY);

		attributeMappingPropertyEClass = createEClass(ATTRIBUTE_MAPPING_PROPERTY);

		// Create enums
		dateTimePrecisionEEnum = createEEnum(DATE_TIME_PRECISION);
		generationEEnum = createEEnum(GENERATION);
		collectionEEnum = createEEnum(COLLECTION);
		orderEEnum = createEEnum(ORDER);
		cascadeEEnum = createEEnum(CASCADE);
		fetchEEnum = createEEnum(FETCH);
		frameworkCategoryListEEnum = createEEnum(FRAMEWORK_CATEGORY_LIST);
		constantNameListEEnum = createEEnum(CONSTANT_NAME_LIST);
		inheritanceMappingEEnum = createEEnum(INHERITANCE_MAPPING);
		frameworkKindListEEnum = createEEnum(FRAMEWORK_KIND_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		frameWebModelEClass.getESuperTypes().add(theUMLPackage.getPackage());
		frameworkProfileEClass.getESuperTypes().add(theUMLPackage.getProfile());
		domainModelEClass.getESuperTypes().add(this.getFrameWebModel());
		navigationModelEClass.getESuperTypes().add(this.getFrameWebModel());
		applicationModelEClass.getESuperTypes().add(this.getFrameWebModel());
		persistenceModelEClass.getESuperTypes().add(this.getFrameWebModel());
		domainAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		domainAttributeEClass.getESuperTypes().add(theUMLPackage.getProperty());
		versionAttributeEClass.getESuperTypes().add(this.getDomainAttribute());
		idAttributeEClass.getESuperTypes().add(this.getDomainAttribute());
		lobAttributeEClass.getESuperTypes().add(this.getDomainAttribute());
		embeddedAttributeEClass.getESuperTypes().add(this.getDomainAttribute());
		decimalAttributeEClass.getESuperTypes().add(this.getDomainAttribute());
		dateTimeAttributeEClass.getESuperTypes().add(this.getDomainAttribute());
		pageEClass.getESuperTypes().add(this.getNavigationClass());
		templateEClass.getESuperTypes().add(this.getNavigationClass());
		daoInterfaceEClass.getESuperTypes().add(theUMLPackage.getInterface());
		daoClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		daoRealizationEClass.getESuperTypes().add(theUMLPackage.getRealization());
		frontControllerClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		ioParameterEClass.getESuperTypes().add(this.getNavigationAttribute());
		resultDependencyEClass.getESuperTypes().add(this.getNavigationDependency());
		navigationAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		frontControllerMethodEClass.getESuperTypes().add(theUMLPackage.getConstraint());
		serviceClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		serviceInterfaceEClass.getESuperTypes().add(theUMLPackage.getInterface());
		serviceGeneralizationEClass.getESuperTypes().add(theUMLPackage.getGeneralization());
		serviceNavigationAssociationEClass.getESuperTypes().add(this.getServiceAssociation());
		domainClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		daoInterfaceNameEClass.getESuperTypes().add(this.getConstantName());
		daoClassNameEClass.getESuperTypes().add(this.getDAOInterfaceName());
		resultEClass.getESuperTypes().add(theUMLPackage.getClass_());
		frontControllerDependencyEClass.getESuperTypes().add(this.getNavigationDependency());
		pageDependencyEClass.getESuperTypes().add(this.getNavigationDependency());
		chainingDependencyEClass.getESuperTypes().add(this.getNavigationDependency());
		daoServiceAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		navigationAttributeEClass.getESuperTypes().add(theUMLPackage.getProperty());
		navigationClassEClass.getESuperTypes().add(theUMLPackage.getClass_());
		domainMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
		daoAttributeEClass.getESuperTypes().add(theUMLPackage.getProperty());
		serviceOperationEClass.getESuperTypes().add(theUMLPackage.getOperation());
		serviceAttributeEClass.getESuperTypes().add(theUMLPackage.getProperty());
		serviceAssociationEClass.getESuperTypes().add(theUMLPackage.getAssociation());
		navigationDependencyEClass.getESuperTypes().add(theUMLPackage.getDependency());
		daoMethodEClass.getESuperTypes().add(theUMLPackage.getOperation());
		domainPackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		viewPackageEClass.getESuperTypes().add(this.getNavigationPackage());
		controllerPackageEClass.getESuperTypes().add(this.getNavigationPackage());
		persistencePackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		applicationPackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		uiComponentEClass.getESuperTypes().add(this.getNavigationClass());
		resultTypeEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		navigationPackageEClass.getESuperTypes().add(theUMLPackage.getPackage());
		domainGeneralizationEClass.getESuperTypes().add(theUMLPackage.getGeneralization());
		uiComponentFieldEClass.getESuperTypes().add(this.getNavigationAttribute());
		tagLibEClass.getESuperTypes().add(theUMLPackage.getPackage());
		tagEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		navigationCompositionPartEClass.getESuperTypes().add(this.getNavigationProperty());
		navigationCompositionWholeEClass.getESuperTypes().add(this.getNavigationProperty());
		navigationPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		resultSetEClass.getESuperTypes().add(theUMLPackage.getPackage());
		navigationConstraintEClass.getESuperTypes().add(theUMLPackage.getConstraint());
		pageConstraintEClass.getESuperTypes().add(this.getNavigationConstraint());
		resultConstraintEClass.getESuperTypes().add(this.getNavigationConstraint());
		methodCosntraintEClass.getESuperTypes().add(this.getNavigationConstraint());
		chainingConstraintEClass.getESuperTypes().add(this.getNavigationConstraint());
		navigationGeneralizationEClass.getESuperTypes().add(theUMLPackage.getGeneralization());
		domainConstraintsEClass.getESuperTypes().add(theUMLPackage.getConstraint());
		domainPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		daoGeneralizationEClass.getESuperTypes().add(theUMLPackage.getGeneralization());
		mappingLibEClass.getESuperTypes().add(theUMLPackage.getPackage());
		classMappingEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		attributeMappingEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		domainGeneralizationSetEClass.getESuperTypes().add(theUMLPackage.getGeneralizationSet());
		frameworkExtensionEClass.getESuperTypes().add(theUMLPackage.getExtension());
		tagExtensionEClass.getESuperTypes().add(this.getFrameworkExtension());
		frameworkEClass.getESuperTypes().add(theUMLPackage.getProfileApplication());
		controllerExtensionEClass.getESuperTypes().add(this.getFrameworkExtension());
		controllerEClass.getESuperTypes().add(theUMLPackage.getStereotype());
		controllerSetEClass.getESuperTypes().add(theUMLPackage.getPackage());
		resultExtensionEClass.getESuperTypes().add(this.getFrameworkExtension());
		classMappingExtensionEClass.getESuperTypes().add(this.getFrameworkExtension());
		attributeMappingExtensionEClass.getESuperTypes().add(this.getFrameworkExtension());
		controllerExtensionEndEClass.getESuperTypes().add(theUMLPackage.getExtensionEnd());
		tagExtensionEndEClass.getESuperTypes().add(theUMLPackage.getExtensionEnd());
		reultExtensionEndEClass.getESuperTypes().add(theUMLPackage.getExtensionEnd());
		classMappingExtensionEndEClass.getESuperTypes().add(theUMLPackage.getExtensionEnd());
		attributeMappingExtensionEndEClass.getESuperTypes().add(theUMLPackage.getExtensionEnd());
		controllerPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		tagPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		resultPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		classMappingProperyEClass.getESuperTypes().add(theUMLPackage.getProperty());
		attributeMappingPropertyEClass.getESuperTypes().add(theUMLPackage.getProperty());

		// Initialize classes, features, and operations; add parameters
		initEClass(framewebEClass, Frameweb.class, "Frameweb", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrameweb_Compose(), this.getFrameWebModel(), null, "Compose", null, 0, -1, Frameweb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrameweb_Configures(), this.getFrameworkProfile(), null, "Configures", null, 0, -1, Frameweb.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameWebModelEClass, FrameWebModel.class, "FrameWebModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frameworkProfileEClass, FrameworkProfile.class, "FrameworkProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrameworkProfile_Category(), this.getFrameworkCategoryList(), "category", null, 0, 1, FrameworkProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFrameworkProfile_Kind(), this.getFrameworkKindList(), "kind", null, 0, 1, FrameworkProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainModelEClass, DomainModel.class, "DomainModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainModel_DomainUMLPackage(), this.getDomainPackage(), null, "DomainUMLPackage", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainModel_DomainUMLAssociation(), this.getDomainAssociation(), null, "DomainUMLAssociation", null, 0, -1, DomainModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationModelEClass, NavigationModel.class, "NavigationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationModel_NavigationUMLDependency(), this.getNavigationDependency(), null, "NavigationUMLDependency", null, 0, -1, NavigationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNavigationModel_ViewUMLPackage(), this.getViewPackage(), null, "ViewUMLPackage", null, 1, -1, NavigationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNavigationModel_ControllerUMLPackage(), this.getControllerPackage(), null, "ControllerUMLPackage", null, 1, -1, NavigationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNavigationModel_NavigationUMLComposition(), this.getNavigationAssociation(), null, "NavigationUMLComposition", null, 0, -1, NavigationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applicationModelEClass, ApplicationModel.class, "ApplicationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationModel_ServiceUMLAssociation(), this.getServiceAssociation(), null, "ServiceUMLAssociation", null, 1, -1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationModel_ApplicationUMLPackage(), this.getApplicationPackage(), null, "ApplicationUMLPackage", null, 1, -1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(persistenceModelEClass, PersistenceModel.class, "PersistenceModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistenceModel_PersistenceUMLPackage(), this.getPersistencePackage(), null, "PersistenceUMLPackage", null, 1, -1, PersistenceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainAssociationEClass, DomainAssociation.class, "DomainAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainAssociation_SourceClass(), this.getDomainClass(), null, "SourceClass", null, 1, 1, DomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainAssociation_TargetClass(), this.getDomainClass(), null, "TargetClass", null, 1, 1, DomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAssociation_Collection(), this.getCollection(), "collection", null, 0, 1, DomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAssociation_Cascade(), this.getCascade(), "cascade", null, 0, 1, DomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAssociation_Fetch(), this.getFetch(), "fetch", null, 0, 1, DomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAssociation_Order(), this.getOrder(), "order", null, 0, 1, DomainAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainAttributeEClass, DomainAttribute.class, "DomainAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainAttribute_Size(), ecorePackage.getELong(), "size", null, 0, 1, DomainAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAttribute_IsNull(), ecorePackage.getEBoolean(), "isNull", null, 0, 1, DomainAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainAttribute_IsPersistent(), ecorePackage.getEBoolean(), "isPersistent", null, 0, 1, DomainAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainAttribute_Column(), this.getDomainColumnName(), this.getDomainColumnName_DomainAttributeName(), "Column", null, 0, 1, DomainAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionAttributeEClass, VersionAttribute.class, "VersionAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(idAttributeEClass, IdAttribute.class, "IdAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdAttribute_Generation(), this.getGeneration(), "generation", null, 0, 1, IdAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lobAttributeEClass, LOBAttribute.class, "LOBAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(embeddedAttributeEClass, EmbeddedAttribute.class, "EmbeddedAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(decimalAttributeEClass, DecimalAttribute.class, "DecimalAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDecimalAttribute_DecimalPrecision(), ecorePackage.getELong(), "decimalPrecision", null, 0, 1, DecimalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDecimalAttribute_DecimalScale(), ecorePackage.getELong(), "decimalScale", null, 0, 1, DecimalAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dateTimeAttributeEClass, DateTimeAttribute.class, "DateTimeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateTimeAttribute_DateTimePrecision(), this.getDateTimePrecision(), "dateTimePrecision", null, 0, 1, DateTimeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPage_PageTagLib(), this.getTagLib(), null, "PageTagLib", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplate_TemplateTagLib(), this.getTagLib(), null, "TemplateTagLib", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daoInterfaceEClass, DAOInterface.class, "DAOInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAOInterface_OwnOperation(), this.getDAOMethod(), null, "OwnOperation", null, 0, -1, DAOInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAOInterface_DAOInterfaceName(), this.getDAOInterfaceName(), null, "DAOInterfaceName", null, 1, 1, DAOInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAOInterface_DAOInterfaceAttribute(), this.getDAOAttribute(), null, "DAOInterfaceAttribute", null, 0, -1, DAOInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOInterface_Infix(), theTypesPackage.getString(), "infix", null, 1, 1, DAOInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOInterface_Sufix(), theTypesPackage.getString(), "sufix", "DAO", 1, 1, DAOInterface.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daoClassEClass, DAOClass.class, "DAOClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAOClass_DAOImplements(), this.getDAOMethod(), null, "DAOImplements", null, 0, -1, DAOClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAOClass_DAOClassName(), this.getDAOClassName(), null, "DAOClassName", null, 1, 1, DAOClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAOClass_DAOClassAttribute(), this.getDAOAttribute(), null, "DAOClassAttribute", null, 0, -1, DAOClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOClass_Sufix(), theTypesPackage.getString(), "sufix", "", 1, 1, DAOClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOClass_Infix(), theTypesPackage.getString(), "infix", "DAO", 1, 1, DAOClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDAOClass_Prefix(), theTypesPackage.getString(), "prefix", null, 1, 1, DAOClass.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(daoRealizationEClass, DAORealization.class, "DAORealization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAORealization_TargetDAOClass(), this.getDAOClass(), null, "TargetDAOClass", null, 1, 1, DAORealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAORealization_SourceDAOInterface(), this.getDAOInterface(), null, "SourceDAOInterface", null, 1, 1, DAORealization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frontControllerClassEClass, FrontControllerClass.class, "FrontControllerClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrontControllerClass_FrontControllerAttribute(), this.getIOParameter(), null, "FrontControllerAttribute", null, 1, -1, FrontControllerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFrontControllerClass_FrontControllerClassMethod(), this.getFrontControllerMethod(), null, "FrontControllerClassMethod", null, 1, -1, FrontControllerClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(ioParameterEClass, IOParameter.class, "IOParameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIOParameter_Display(), this.getUIComponentField(), this.getUIComponentField_Inject(), "display", null, 0, -1, IOParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(resultDependencyEClass, ResultDependency.class, "ResultDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResultDependency_ResultResult(), this.getResult(), null, "ResultResult", null, 0, -1, ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultDependency_ResultMethod(), this.getFrontControllerMethod(), null, "ResultMethod", null, 1, 1, ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResultDependency_ResultDependendencyCosntraint(), this.getResultConstraint(), null, "ResultDependendencyCosntraint", null, 1, 1, ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getResultDependency_Render(), theEcorePackage.getEString(), "render", "@none", 0, 1, ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDependency_Execute(), theEcorePackage.getEString(), "execute", "@this", 0, 1, ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getResultDependency_Ajax(), ecorePackage.getEBoolean(), "ajax", "False", 0, 1, ResultDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationAssociationEClass, NavigationAssociation.class, "NavigationAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationAssociation_NavigationAssociationProperty(), this.getNavigationCompositionPart(), null, "NavigationAssociationProperty", null, 1, 1, NavigationAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frontControllerMethodEClass, FrontControllerMethod.class, "FrontControllerMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFrontControllerMethod_IsDefault(), ecorePackage.getEBoolean(), "isDefault", null, 0, 1, FrontControllerMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceClassEClass, ServiceClass.class, "ServiceClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceClass_ServiceClassAttribute(), this.getServiceAttribute(), null, "ServiceClassAttribute", null, 0, 1, ServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceClass_ServiceClassOperation(), this.getServiceOperation(), null, "ServiceClassOperation", null, 0, -1, ServiceClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceEClass, ServiceInterface.class, "ServiceInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceInterface_ServiceInterfaceOperation(), this.getServiceOperation(), null, "ServiceInterfaceOperation", null, 0, -1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceInterface_ServiceInterfaceAttribute(), this.getServiceAttribute(), null, "ServiceInterfaceAttribute", null, 0, -1, ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceGeneralizationEClass, ServiceGeneralization.class, "ServiceGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceGeneralization_SourceServiceInterface(), this.getServiceInterface(), null, "SourceServiceInterface", null, 1, 1, ServiceGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceGeneralization_TargetServiceClass(), this.getServiceClass(), null, "TargetServiceClass", null, 1, 1, ServiceGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceNavigationAssociationEClass, ServiceNavigationAssociation.class, "ServiceNavigationAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceNavigationAssociation_SourceServiceClass(), this.getServiceInterface(), null, "SourceServiceClass", null, 1, 1, ServiceNavigationAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceNavigationAssociation_TargetFrontController(), this.getFrontControllerClass(), null, "TargetFrontController", null, 1, 1, ServiceNavigationAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainClassEClass, DomainClass.class, "DomainClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainClass_DomainClassAttribute(), this.getDomainAttribute(), null, "DomainClassAttribute", null, 1, -1, DomainClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainClass_DomainClassOperation(), this.getDomainMethod(), null, "DomainClassOperation", null, 0, -1, DomainClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDomainClass_Table(), ecorePackage.getEString(), "table", null, 0, 1, DomainClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(constantNameEClass, ConstantName.class, "ConstantName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstantName_FwName(), this.getConstantNameList(), "fwName", null, 0, 1, ConstantName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainTableNameEClass, DomainTableName.class, "DomainTableName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainTableName_FwName(), ecorePackage.getEString(), "fwName", null, 0, 1, DomainTableName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(domainColumnNameEClass, DomainColumnName.class, "DomainColumnName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainColumnName_FwName(), ecorePackage.getEString(), "fwName", null, 0, 1, DomainColumnName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainColumnName_DomainAttributeName(), this.getDomainAttribute(), this.getDomainAttribute_Column(), "DomainAttributeName", null, 1, 1, DomainColumnName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daoInterfaceNameEClass, DAOInterfaceName.class, "DAOInterfaceName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAOInterfaceName_ConstantPrefix(), this.getConstantName(), null, "ConstantPrefix", null, 0, 1, DAOInterfaceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAOInterfaceName_DomainTablePrefix(), this.getDomainTableName(), null, "DomainTablePrefix", null, 0, 1, DAOInterfaceName.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(daoClassNameEClass, DAOClassName.class, "DAOClassName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultEClass, Result.class, "Result", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frontControllerDependencyEClass, FrontControllerDependency.class, "FrontControllerDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFrontControllerDependency_Method(), this.getFrontControllerMethod(), null, "Method", null, 1, 1, FrontControllerDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFrontControllerDependency_MethodDependendencyConstraint(), this.getMethodCosntraint(), null, "MethodDependendencyConstraint", null, 1, 1, FrontControllerDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pageDependencyEClass, PageDependency.class, "PageDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPageDependency_PageDependencyCosntraint(), this.getPageConstraint(), null, "PageDependencyCosntraint", null, 1, 1, PageDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(chainingDependencyEClass, ChainingDependency.class, "ChainingDependency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainingDependency_OutMethod(), this.getFrontControllerMethod(), null, "OutMethod", null, 1, 1, ChainingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainingDependency_InMethod(), this.getFrontControllerMethod(), null, "InMethod", null, 1, 1, ChainingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainingDependency_ChainingDependendencyConstraint(), this.getChainingConstraint(), null, "ChainingDependendencyConstraint", null, 1, 1, ChainingDependency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(daoServiceAssociationEClass, DAOServiceAssociation.class, "DAOServiceAssociation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDAOServiceAssociation_SourceDAOClass(), this.getDAOInterface(), null, "SourceDAOClass", null, 1, 1, DAOServiceAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDAOServiceAssociation_TargetDAOService(), this.getServiceClass(), null, "TargetDAOService", null, 1, 1, DAOServiceAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(navigationAttributeEClass, NavigationAttribute.class, "NavigationAttribute", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationClassEClass, NavigationClass.class, "NavigationClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNavigationClass_NavigationClassComposition(), this.getNavigationCompositionWhole(), null, "NavigationClassComposition", null, 0, -1, NavigationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNavigationClass_NavigationClassAttribute(), this.getUIComponent(), null, "NavigationClassAttribute", null, 0, -1, NavigationClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(domainMethodEClass, DomainMethod.class, "DomainMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daoAttributeEClass, DAOAttribute.class, "DAOAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceOperationEClass, ServiceOperation.class, "ServiceOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceAttributeEClass, ServiceAttribute.class, "ServiceAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceAssociationEClass, ServiceAssociation.class, "ServiceAssociation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationDependencyEClass, NavigationDependency.class, "NavigationDependency", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daoMethodEClass, DAOMethod.class, "DAOMethod", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainPackageEClass, DomainPackage.class, "DomainPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainPackage_DomainPackageClass(), this.getDomainClass(), null, "DomainPackageClass", null, 1, -1, DomainPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(viewPackageEClass, ViewPackage.class, "ViewPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getViewPackage_ViewPackageClass(), this.getNavigationClass(), null, "ViewPackageClass", null, 1, -1, ViewPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getViewPackage_ViewPackageResult(), this.getResult(), null, "ViewPackageResult", null, 0, -1, ViewPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(controllerPackageEClass, ControllerPackage.class, "ControllerPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getControllerPackage_ControllerPackageClass(), this.getFrontControllerClass(), null, "ControllerPackageClass", null, 1, -1, ControllerPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(persistencePackageEClass, PersistencePackage.class, "PersistencePackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersistencePackage_PersistencePackageInterface(), this.getDAOInterface(), null, "PersistencePackageInterface", null, 1, -1, PersistencePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersistencePackage_PersistencePackageClass(), this.getDAOClass(), null, "PersistencePackageClass", null, 1, -1, PersistencePackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationPackageEClass, ApplicationPackage.class, "ApplicationPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationPackage_ServicePackageClass(), this.getServiceClass(), null, "ServicePackageClass", null, 1, -1, ApplicationPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationPackage_ServicePackageInterface(), this.getServiceInterface(), null, "ServicePackageInterface", null, 1, -1, ApplicationPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uiComponentEClass, UIComponent.class, "UIComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultTypeEClass, ResultType.class, "ResultType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationPackageEClass, NavigationPackage.class, "NavigationPackage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainGeneralizationEClass, DomainGeneralization.class, "DomainGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDomainGeneralization_TargetDomain(), this.getDomainClass(), null, "TargetDomain", null, 1, 1, DomainGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDomainGeneralization_SourceDomain(), this.getDomainClass(), null, "SourceDomain", null, 1, 1, DomainGeneralization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(jQueryEClass, JQuery.class, "JQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(uiComponentFieldEClass, UIComponent.class, "UIComponentField", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUIComponentField_Inject(), this.getIOParameter(), this.getIOParameter_Display(), "inject", null, 0, 1, UIComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagLibEClass, TagLib.class, "TagLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTagLib_Prefix(), theEcorePackage.getEString(), "prefix", null, 1, 1, TagLib.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tagEClass, Tag.class, "Tag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationCompositionPartEClass, NavigationCompositionPart.class, "NavigationCompositionPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationCompositionWholeEClass, NavigationCompositionWhole.class, "NavigationCompositionWhole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationPropertyEClass, NavigationProperty.class, "NavigationProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultSetEClass, ResultSet.class, "ResultSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationConstraintEClass, NavigationConstraint.class, "NavigationConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pageConstraintEClass, PageConstraint.class, "PageConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultConstraintEClass, ResultConstraint.class, "ResultConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(methodCosntraintEClass, MethodCosntraint.class, "MethodCosntraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(chainingConstraintEClass, ChainingConstraint.class, "ChainingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(navigationGeneralizationEClass, NavigationGeneralization.class, "NavigationGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainConstraintsEClass, DomainConstraints.class, "DomainConstraints", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainPropertyEClass, DomainProperty.class, "DomainProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(daoGeneralizationEClass, DAOGeneralization.class, "DAOGeneralization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mappingLibEClass, MappingLib.class, "MappingLib", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classMappingEClass, ClassMapping.class, "ClassMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeMappingEClass, AttributeMapping.class, "AttributeMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(domainGeneralizationSetEClass, DomainGeneralizationSet.class, "DomainGeneralizationSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDomainGeneralizationSet_Mapping(), this.getInheritanceMapping(), "mapping", null, 0, 1, DomainGeneralizationSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(frameworkExtensionEClass, FrameworkExtension.class, "FrameworkExtension", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagExtensionEClass, TagExtension.class, "TagExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(frameworkEClass, Framework.class, "Framework", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerExtensionEClass, ControllerExtension.class, "ControllerExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerEClass, Controller.class, "Controller", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerSetEClass, ControllerSet.class, "ControllerSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultExtensionEClass, ResultExtension.class, "ResultExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classMappingExtensionEClass, ClassMappingExtension.class, "ClassMappingExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeMappingExtensionEClass, AttributeMappingExtension.class, "AttributeMappingExtension", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerExtensionEndEClass, ControllerExtensionEnd.class, "ControllerExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagExtensionEndEClass, TagExtensionEnd.class, "TagExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(reultExtensionEndEClass, ReultExtensionEnd.class, "ReultExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classMappingExtensionEndEClass, ClassMappingExtensionEnd.class, "ClassMappingExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeMappingExtensionEndEClass, AttributeMappingExtensionEnd.class, "AttributeMappingExtensionEnd", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controllerPropertyEClass, ControllerProperty.class, "ControllerProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tagPropertyEClass, TagProperty.class, "TagProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resultPropertyEClass, ResultProperty.class, "ResultProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classMappingProperyEClass, ClassMappingPropery.class, "ClassMappingPropery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeMappingPropertyEClass, AttributeMappingProperty.class, "AttributeMappingProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dateTimePrecisionEEnum, DateTimePrecision.class, "DateTimePrecision");
		addEEnumLiteral(dateTimePrecisionEEnum, DateTimePrecision.TIMESTAMP);
		addEEnumLiteral(dateTimePrecisionEEnum, DateTimePrecision.TIME);
		addEEnumLiteral(dateTimePrecisionEEnum, DateTimePrecision.DATE);

		initEEnum(generationEEnum, Generation.class, "Generation");
		addEEnumLiteral(generationEEnum, Generation.AUTO);
		addEEnumLiteral(generationEEnum, Generation.IDENTITY);
		addEEnumLiteral(generationEEnum, Generation.SEQUENCE);
		addEEnumLiteral(generationEEnum, Generation.NONE);
		addEEnumLiteral(generationEEnum, Generation.TABLE);

		initEEnum(collectionEEnum, Collection.class, "Collection");
		addEEnumLiteral(collectionEEnum, Collection.SET);
		addEEnumLiteral(collectionEEnum, Collection.BAG);
		addEEnumLiteral(collectionEEnum, Collection.LIST);
		addEEnumLiteral(collectionEEnum, Collection.MAP);

		initEEnum(orderEEnum, Order.class, "Order");
		addEEnumLiteral(orderEEnum, Order.NATURAL);
		addEEnumLiteral(orderEEnum, Order.COLUMN_NAME_ASC);
		addEEnumLiteral(orderEEnum, Order.COLUMN_NAME_DESC);

		initEEnum(cascadeEEnum, Cascade.class, "Cascade");
		addEEnumLiteral(cascadeEEnum, Cascade.REMOVE);
		addEEnumLiteral(cascadeEEnum, Cascade.MERGE);
		addEEnumLiteral(cascadeEEnum, Cascade.REFRESH);
		addEEnumLiteral(cascadeEEnum, Cascade.PERSIST);
		addEEnumLiteral(cascadeEEnum, Cascade.NONE);
		addEEnumLiteral(cascadeEEnum, Cascade.ALL);

		initEEnum(fetchEEnum, Fetch.class, "Fetch");
		addEEnumLiteral(fetchEEnum, Fetch.EAGER);
		addEEnumLiteral(fetchEEnum, Fetch.LAZY);

		initEEnum(frameworkCategoryListEEnum, FrameworkCategoryList.class, "FrameworkCategoryList");
		addEEnumLiteral(frameworkCategoryListEEnum, FrameworkCategoryList.FRONT_CONTROLLER);
		addEEnumLiteral(frameworkCategoryListEEnum, FrameworkCategoryList.DEPENDENCY_INJECTION);
		addEEnumLiteral(frameworkCategoryListEEnum, FrameworkCategoryList.OBJETO_RELACIONAL);

		initEEnum(constantNameListEEnum, ConstantNameList.class, "ConstantNameList");
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.DAO);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.INTERFACE);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.BASE);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.CLASS);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.IMPL);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.CONTROLLER);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.DOMAIN);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.PERSISTENCE);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.APPLICATION);
		addEEnumLiteral(constantNameListEEnum, ConstantNameList.VIEW);

		initEEnum(inheritanceMappingEEnum, InheritanceMapping.class, "InheritanceMapping");
		addEEnumLiteral(inheritanceMappingEEnum, InheritanceMapping.SINGLETABLE);
		addEEnumLiteral(inheritanceMappingEEnum, InheritanceMapping.UNION);
		addEEnumLiteral(inheritanceMappingEEnum, InheritanceMapping.JOIN);

		initEEnum(frameworkKindListEEnum, FrameworkKindList.class, "FrameworkKindList");
		addEEnumLiteral(frameworkKindListEEnum, FrameworkKindList.STANDARD_SPECIFICATION);
		addEEnumLiteral(frameworkKindListEEnum, FrameworkKindList.FRAMEWORK_SPECIFICATION);
		addEEnumLiteral(frameworkKindListEEnum, FrameworkKindList.FRAMEWORK_IMPLEMENTATION);
		addEEnumLiteral(frameworkKindListEEnum, FrameworkKindList.CUSTOM);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// Ecore
		createEcoreAnnotations();
		// Comments
		createCommentsAnnotations();
		// OCL
		createOCLAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcore_1Annotations();
		// comments
		createComments_1Annotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "Ecore";	
		addAnnotation
		  (frameworkProfileEClass, 
		   source, 
		   new String[] {
			 "constraints", "FrameworkResultSetConstraint FrameworkTagLibConstraint"
		   });	
		addAnnotation
		  (frontControllerDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "FrontControllerDependencyConstraint"
		   });	
		addAnnotation
		  (pageDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "PageDepencencyConstraint"
		   });	
		addAnnotation
		  (chainingDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "ChainingDependencyConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>Comments</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createCommentsAnnotations() {
		String source = "Comments";	
		addAnnotation
		  (frameworkProfileEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (resultDependencyEClass, 
		   source, 
		   new String[] {
			 "ResultDependencyConstraint", "A ResultDependency must have a FrontControllerClass as client and a NavigationClass as supplier."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResultDependency/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });	
		addAnnotation
		  (navigationAssociationEClass, 
		   source, 
		   new String[] {
			 "NavigationAssociationConstraint", "The NavigationAssociation must have, as property ownedEnd, obligatorily a navigation composition (NavigationComposition) and only navigation classes (NavigationClass) are alowed as memberEnd.\r\n"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NavigationAssociation/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });	
		addAnnotation
		  (frontControllerDependencyEClass, 
		   source, 
		   new String[] {
			 "FrontControllerDependencyConstraint", "A FrontControllerDependencyConstraint must have a NavigationClass as client and a FrontControllerClass as supplier."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FrontControllerDependency/%Ecore%/@details.0")
		   });	
		addAnnotation
		  (pageDependencyEClass, 
		   source, 
		   new String[] {
			 "PageDepencencyConstraint", "A PageDependencyConstraint must have a Page as client and a Page or a Template as supplier."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PageDependency/%Ecore%/@details.0")
		   });	
		addAnnotation
		  (chainingDependencyEClass, 
		   source, 
		   new String[] {
			 "ChainingDependencyConstraint", "A ChainingDependencyConstraint must have a FrontControllerClass as client and a FrontControllerClass as supplier and these client and supplier can not be the same."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ChainingDependency/%Ecore%/@details.0")
		   });	
		addAnnotation
		  (navigationCompositionPartEClass, 
		   source, 
		   new String[] {
			 "NavigationCompositionEndConstraint", "A NavigationAssociation must have only a UIComponent as a part."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NavigationCompositionPart/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });	
		addAnnotation
		  (navigationCompositionWholeEClass, 
		   source, 
		   new String[] {
			 "NavigationCompositionConstraint", "A NavigationAssociation must be a composition association and NavigationClass are alowed to be whole."
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NavigationCompositionWhole/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });
	}

	/**
	 * Initializes the annotations for <b>OCL</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOCLAnnotations() {
		String source = "OCL";	
		addAnnotation
		  (frameworkProfileEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (domainModelEClass, 
		   source, 
		   new String[] {
			 "DomainModelContent", "self.packagedElement.oclIsType(DomainPackage",
			 "DomaniModelMinimum", "self.packagedElement->size()>=1"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DomainModel/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });	
		addAnnotation
		  (resultDependencyEClass, 
		   source, 
		   new String[] {
			 "ResultDependencyConstraint", "(self.oclAsType(Dependency).client.oclIsTypeOf(FrontControllerClass)) and\r\n(self.oclAsType(Dependency).supplier.oclIsTypeOf(NavigationClass))"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ResultDependency/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });	
		addAnnotation
		  (navigationAssociationEClass, 
		   source, 
		   new String[] {
			 "NavigationAssociationConstraint", "context NavigationAssociation\r\n  inv: \r\n    (self.oclAsType(Association).ownedEnd.oclIsTypeOf(NavigationComposition)) and \r\n    ((self.oclAsType(Association).memberEnd.oclIsTypeOf(NavigationComposition)) or \r\n    (self.oclAsType(Association).memberEnd.oclIsTypeOf(NavigationCompositionEnd)))"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NavigationAssociation/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });	
		addAnnotation
		  (frontControllerDependencyEClass, 
		   source, 
		   new String[] {
			 "FrontControllerDependencyConstraint", "context FrontControllerDependency \r\n inv: \r\n  (self.oclAsType(Dependency).supplier.oclIsTypeOf(FrontControllerClass)) and\r\n  (self.oclAsType(Dependency).client.oclIsTypeOf(NavigationClass)) "
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//FrontControllerDependency/%Ecore%/@details.0")
		   });	
		addAnnotation
		  (pageDependencyEClass, 
		   source, 
		   new String[] {
			 "PageDepencencyConstraint", "context PageDependency \r\n inv: \r\n  (self.oclAsType(Dependency).client.oclIsTypeOf(Page)) and\r\n  ((self.oclAsType(Dependency).supplier.oclIsTypeOf(Page)) or\r\n  (self.oclAsType(Dependency).supplier.oclIsTypeOf(Template)))"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//PageDependency/%Ecore%/@details.0")
		   });	
		addAnnotation
		  (chainingDependencyEClass, 
		   source, 
		   new String[] {
			 "ChainingDependencyConstraint", "context ChainingDependency \r\n inv: \r\n  (self.oclAsType(Dependency).supplier.oclIsTypeOf(FrontControllerClass)) and\r\n  (self.oclAsType(Dependency).client.oclIsTypeOf(FrontControllerClass)) and \r\n  (self.oclAsType(Dependency).supplier <> self.oclAsType(Dependency).client) "
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//ChainingDependency/%Ecore%/@details.0")
		   });	
		addAnnotation
		  (navigationCompositionPartEClass, 
		   source, 
		   new String[] {
			 "NavigationCompositionPartConstraint", "context NavigationCompositionPart \r\n  inv:     \r\n    (self.oclAsType(Property).owningAssociation.oclIsTypeOf(NavigationAssociation)) and\r\n    (self.oclAsType(Property).type.oclIsTypeOf(NavigationClass))"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NavigationCompositionPart/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });	
		addAnnotation
		  (navigationCompositionWholeEClass, 
		   source, 
		   new String[] {
			 "NavigationCompositionConstraint", "context NavigationCompositionWhole \r\n  inv:\r\n    (self.oclAsType(Property).owningAssociation.oclIsTypeOf(NavigationClass)) and\r\n    (self.oclAsType(Property).association.oclIsTypeOf(NavigationAssociation)) and \r\n    (self.oclAsType(Property).aggregation = \'composite\')"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//NavigationCompositionWhole/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcore_1Annotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (domainModelEClass, 
		   source, 
		   new String[] {
			 "constraints", "DomainModelContent DomainModelMinimum"
		   });	
		addAnnotation
		  (resultDependencyEClass, 
		   source, 
		   new String[] {
			 "constraints", "ResultDependencyConstraint\r\n"
		   });	
		addAnnotation
		  (navigationAssociationEClass, 
		   source, 
		   new String[] {
			 "constraints", "NavigationAssociationConstraint\r\n"
		   });	
		addAnnotation
		  (navigationCompositionPartEClass, 
		   source, 
		   new String[] {
			 "constraints", "NavigationCompositionPartConstraint\r\n"
		   });	
		addAnnotation
		  (navigationCompositionWholeEClass, 
		   source, 
		   new String[] {
			 "constraints", "NavigationCompositionWholeConstraint\r\n"
		   });
	}

	/**
	 * Initializes the annotations for <b>comments</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createComments_1Annotations() {
		String source = "comments";	
		addAnnotation
		  (domainModelEClass, 
		   source, 
		   new String[] {
			 "DomainModelContent", "A DomainModel must have only DomainPackage.",
			 "DomainModelMinimum", "A DomainModel must have at least one DomainPackage"
		   },
		   new URI[] {
			 URI.createURI(eNS_URI).appendFragment("//DomainModel/%http:%2F%2Fwww.eclipse.org%2Femf%2F2002%2FEcore%/@details.0")
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (domainPackageEClass, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (getViewPackage_ViewPackageClass(), 
		   source, 
		   new String[] {
			 "namespace", ""
		   });
	}

} //FramewebPackageImpl

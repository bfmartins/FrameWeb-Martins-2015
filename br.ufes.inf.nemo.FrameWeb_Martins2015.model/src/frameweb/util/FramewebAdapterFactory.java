/**
 */
package frameweb.util;

import frameweb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see frameweb.FramewebPackage
 * @generated
 */
public class FramewebAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FramewebPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FramewebPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FramewebSwitch<Adapter> modelSwitch =
		new FramewebSwitch<Adapter>() {
			@Override
			public Adapter caseMappedClass(MappedClass object) {
				return createMappedClassAdapter();
			}
			@Override
			public Adapter casePersistentClass(PersistentClass object) {
				return createPersistentClassAdapter();
			}
			@Override
			public Adapter caseTransientClass(TransientClass object) {
				return createTransientClassAdapter();
			}
			@Override
			public Adapter caseFrameweb(Frameweb object) {
				return createFramewebAdapter();
			}
			@Override
			public Adapter caseFrameWebModel(FrameWebModel object) {
				return createFrameWebModelAdapter();
			}
			@Override
			public Adapter caseFramework(Framework object) {
				return createFrameworkAdapter();
			}
			@Override
			public Adapter caseDomainModel(DomainModel object) {
				return createDomainModelAdapter();
			}
			@Override
			public Adapter caseNavigationModel(NavigationModel object) {
				return createNavigationModelAdapter();
			}
			@Override
			public Adapter caseApplicationModel(ApplicationModel object) {
				return createApplicationModelAdapter();
			}
			@Override
			public Adapter casePersistenceModel(PersistenceModel object) {
				return createPersistenceModelAdapter();
			}
			@Override
			public Adapter caseDomainAssociation(DomainAssociation object) {
				return createDomainAssociationAdapter();
			}
			@Override
			public Adapter caseDomainAttribute(DomainAttribute object) {
				return createDomainAttributeAdapter();
			}
			@Override
			public Adapter caseVersionAttribute(VersionAttribute object) {
				return createVersionAttributeAdapter();
			}
			@Override
			public Adapter caseIdAttribute(IdAttribute object) {
				return createIdAttributeAdapter();
			}
			@Override
			public Adapter caseLOBAttribute(LOBAttribute object) {
				return createLOBAttributeAdapter();
			}
			@Override
			public Adapter caseEmbeddedAttribute(EmbeddedAttribute object) {
				return createEmbeddedAttributeAdapter();
			}
			@Override
			public Adapter caseDecimalAttribute(DecimalAttribute object) {
				return createDecimalAttributeAdapter();
			}
			@Override
			public Adapter caseDateTimeAttribute(DateTimeAttribute object) {
				return createDateTimeAttributeAdapter();
			}
			@Override
			public Adapter casePage(Page object) {
				return createPageAdapter();
			}
			@Override
			public Adapter caseTemplate(Template object) {
				return createTemplateAdapter();
			}
			@Override
			public Adapter caseForm(Tag object) {
				return createFormAdapter();
			}
			@Override
			public Adapter caseBinary(Binary object) {
				return createBinaryAdapter();
			}
			@Override
			public Adapter caseDAOInterface(DAOInterface object) {
				return createDAOInterfaceAdapter();
			}
			@Override
			public Adapter caseDAOClass(DAOClass object) {
				return createDAOClassAdapter();
			}
			@Override
			public Adapter caseDAOGeneralization(DAOGeneralization object) {
				return createDAOGeneralizationAdapter();
			}
			@Override
			public Adapter caseFrontControllerClass(FrontControllerClass object) {
				return createFrontControllerClassAdapter();
			}
			@Override
			public Adapter caseUserViewAttribute(Tag object) {
				return createUserViewAttributeAdapter();
			}
			@Override
			public Adapter caseIOParameter(IOParameter object) {
				return createIOParameterAdapter();
			}
			@Override
			public Adapter caseDAOBaseOperation(DAOBaseOperation object) {
				return createDAOBaseOperationAdapter();
			}
			@Override
			public Adapter caseResultDependency(ResultDependency object) {
				return createResultDependencyAdapter();
			}
			@Override
			public Adapter caseNavigationAssociation(NavigationAssociation object) {
				return createNavigationAssociationAdapter();
			}
			@Override
			public Adapter caseFrontControllerMethod(FrontControllerMethod object) {
				return createFrontControllerMethodAdapter();
			}
			@Override
			public Adapter caseNamingMethod(NamingMethod object) {
				return createNamingMethodAdapter();
			}
			@Override
			public Adapter caseServiceClass(ServiceClass object) {
				return createServiceClassAdapter();
			}
			@Override
			public Adapter caseServiceInterface(ServiceInterface object) {
				return createServiceInterfaceAdapter();
			}
			@Override
			public Adapter caseServiceGeneralization(ServiceGeneralization object) {
				return createServiceGeneralizationAdapter();
			}
			@Override
			public Adapter caseServiceNavigationAssociation(ServiceNavigationAssociation object) {
				return createServiceNavigationAssociationAdapter();
			}
			@Override
			public Adapter caseDomainClass(DomainClass object) {
				return createDomainClassAdapter();
			}
			@Override
			public Adapter caseFrameWebName(FrameWebName object) {
				return createFrameWebNameAdapter();
			}
			@Override
			public Adapter caseBinaryAttribute(BinaryAttribute object) {
				return createBinaryAttributeAdapter();
			}
			@Override
			public Adapter caseConstantName(ConstantName object) {
				return createConstantNameAdapter();
			}
			@Override
			public Adapter caseDomainTableName(DomainTableName object) {
				return createDomainTableNameAdapter();
			}
			@Override
			public Adapter caseFrameWorkName(FrameWorkName object) {
				return createFrameWorkNameAdapter();
			}
			@Override
			public Adapter caseDomainColumnName(DomainColumnName object) {
				return createDomainColumnNameAdapter();
			}
			@Override
			public Adapter caseDAOInterfaceName(DAOInterfaceName object) {
				return createDAOInterfaceNameAdapter();
			}
			@Override
			public Adapter caseDAOClassName(DAOClassName object) {
				return createDAOClassNameAdapter();
			}
			@Override
			public Adapter caseResult(ResultType object) {
				return createResultAdapter();
			}
			@Override
			public Adapter caseFrontControllerDependency(FrontControllerDependency object) {
				return createFrontControllerDependencyAdapter();
			}
			@Override
			public Adapter casePageDependency(PageDependency object) {
				return createPageDependencyAdapter();
			}
			@Override
			public Adapter caseChainingDependency(ChainingDependency object) {
				return createChainingDependencyAdapter();
			}
			@Override
			public Adapter caseDAOServiceAssociation(DAOServiceAssociation object) {
				return createDAOServiceAssociationAdapter();
			}
			@Override
			public Adapter caseNavigationAttribute(NavigationAttribute object) {
				return createNavigationAttributeAdapter();
			}
			@Override
			public Adapter caseNavigationClass(NavigationClass object) {
				return createNavigationClassAdapter();
			}
			@Override
			public Adapter caseDomainOperation(DomainOperation object) {
				return createDomainOperationAdapter();
			}
			@Override
			public Adapter caseDAOAttribute(DAOAttribute object) {
				return createDAOAttributeAdapter();
			}
			@Override
			public Adapter caseServiceOperation(ServiceOperation object) {
				return createServiceOperationAdapter();
			}
			@Override
			public Adapter caseServiceAttribute(ServiceAttribute object) {
				return createServiceAttributeAdapter();
			}
			@Override
			public Adapter caseServiceAssociation(ServiceAssociation object) {
				return createServiceAssociationAdapter();
			}
			@Override
			public Adapter caseNavigationDependency(NavigationDependency object) {
				return createNavigationDependencyAdapter();
			}
			@Override
			public Adapter caseDAOOperation(DAOOperation object) {
				return createDAOOperationAdapter();
			}
			@Override
			public Adapter caseDomainPackage(DomainPackage object) {
				return createDomainPackageAdapter();
			}
			@Override
			public Adapter caseViewPackage(ViewPackage object) {
				return createViewPackageAdapter();
			}
			@Override
			public Adapter caseControllerPackage(ControllerPackage object) {
				return createControllerPackageAdapter();
			}
			@Override
			public Adapter casePersistencePackage(PersistencePackage object) {
				return createPersistencePackageAdapter();
			}
			@Override
			public Adapter caseApplicationPackage(ApplicationPackage object) {
				return createApplicationPackageAdapter();
			}
			@Override
			public Adapter caseComponent(Component object) {
				return createComponentAdapter();
			}
			@Override
			public Adapter caseResultType(ResultType object) {
				return createResultTypeAdapter();
			}
			@Override
			public Adapter caseNavigationPackage(NavigationPackage object) {
				return createNavigationPackageAdapter();
			}
			@Override
			public Adapter caseDomainGeneralization(DomainGeneralization object) {
				return createDomainGeneralizationAdapter();
			}
			@Override
			public Adapter caseJQuery(JQuery object) {
				return createJQueryAdapter();
			}
			@Override
			public Adapter caseFormComponent(Tag object) {
				return createFormComponentAdapter();
			}
			@Override
			public Adapter caseTagLib(TagLib object) {
				return createTagLibAdapter();
			}
			@Override
			public Adapter caseRule(Rule object) {
				return createRuleAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter caseAnotation(Anotation object) {
				return createAnotationAdapter();
			}
			@Override
			public Adapter caseNavigationCompositionEnd(NavigationCompositionEnd object) {
				return createNavigationCompositionEndAdapter();
			}
			@Override
			public Adapter caseNavigationComposition(NavigationComposition object) {
				return createNavigationCompositionAdapter();
			}
			@Override
			public Adapter caseNavigationProperty(NavigationProperty object) {
				return createNavigationPropertyAdapter();
			}
			@Override
			public Adapter caseEModelElement(EModelElement object) {
				return createEModelElementAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseNamespace(Namespace object) {
				return createNamespaceAdapter();
			}
			@Override
			public Adapter caseRedefinableElement(RedefinableElement object) {
				return createRedefinableElementAdapter();
			}
			@Override
			public Adapter caseParameterableElement(ParameterableElement object) {
				return createParameterableElementAdapter();
			}
			@Override
			public Adapter casePackageableElement(PackageableElement object) {
				return createPackageableElementAdapter();
			}
			@Override
			public Adapter caseType(Type object) {
				return createTypeAdapter();
			}
			@Override
			public Adapter caseTemplateableElement(TemplateableElement object) {
				return createTemplateableElementAdapter();
			}
			@Override
			public Adapter caseClassifier(Classifier object) {
				return createClassifierAdapter();
			}
			@Override
			public Adapter caseStructuredClassifier(StructuredClassifier object) {
				return createStructuredClassifierAdapter();
			}
			@Override
			public Adapter caseEncapsulatedClassifier(EncapsulatedClassifier object) {
				return createEncapsulatedClassifierAdapter();
			}
			@Override
			public Adapter caseBehavioredClassifier(BehavioredClassifier object) {
				return createBehavioredClassifierAdapter();
			}
			@Override
			public Adapter caseClass(org.eclipse.uml2.uml.Class object) {
				return createClassAdapter();
			}
			@Override
			public Adapter casePackage(org.eclipse.uml2.uml.Package object) {
				return createPackageAdapter();
			}
			@Override
			public Adapter caseRelationship(Relationship object) {
				return createRelationshipAdapter();
			}
			@Override
			public Adapter caseAssociation(Association object) {
				return createAssociationAdapter();
			}
			@Override
			public Adapter caseFeature(Feature object) {
				return createFeatureAdapter();
			}
			@Override
			public Adapter caseTypedElement(TypedElement object) {
				return createTypedElementAdapter();
			}
			@Override
			public Adapter caseMultiplicityElement(MultiplicityElement object) {
				return createMultiplicityElementAdapter();
			}
			@Override
			public Adapter caseStructuralFeature(StructuralFeature object) {
				return createStructuralFeatureAdapter();
			}
			@Override
			public Adapter caseConnectableElement(ConnectableElement object) {
				return createConnectableElementAdapter();
			}
			@Override
			public Adapter caseDeploymentTarget(DeploymentTarget object) {
				return createDeploymentTargetAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseDirectedRelationship(DirectedRelationship object) {
				return createDirectedRelationshipAdapter();
			}
			@Override
			public Adapter caseGeneralization(Generalization object) {
				return createGeneralizationAdapter();
			}
			@Override
			public Adapter caseDependency(Dependency object) {
				return createDependencyAdapter();
			}
			@Override
			public Adapter caseBehavioralFeature(BehavioralFeature object) {
				return createBehavioralFeatureAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link frameweb.MappedClass <em>Mapped Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.MappedClass
	 * @generated
	 */
	public Adapter createMappedClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.PersistentClass <em>Persistent Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.PersistentClass
	 * @generated
	 */
	public Adapter createPersistentClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.TransientClass <em>Transient Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.TransientClass
	 * @generated
	 */
	public Adapter createTransientClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Frameweb <em>Frameweb</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Frameweb
	 * @generated
	 */
	public Adapter createFramewebAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.FrameWebModel <em>Frame Web Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.FrameWebModel
	 * @generated
	 */
	public Adapter createFrameWebModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Framework <em>Framework</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Framework
	 * @generated
	 */
	public Adapter createFrameworkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationModel <em>Navigation Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationModel
	 * @generated
	 */
	public Adapter createNavigationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ApplicationModel <em>Application Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ApplicationModel
	 * @generated
	 */
	public Adapter createApplicationModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.PersistenceModel <em>Persistence Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.PersistenceModel
	 * @generated
	 */
	public Adapter createPersistenceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainAssociation <em>Domain Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainAssociation
	 * @generated
	 */
	public Adapter createDomainAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainAttribute <em>Domain Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainAttribute
	 * @generated
	 */
	public Adapter createDomainAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.VersionAttribute <em>Version Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.VersionAttribute
	 * @generated
	 */
	public Adapter createVersionAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.IdAttribute <em>Id Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.IdAttribute
	 * @generated
	 */
	public Adapter createIdAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.LOBAttribute <em>LOB Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.LOBAttribute
	 * @generated
	 */
	public Adapter createLOBAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.EmbeddedAttribute <em>Embedded Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.EmbeddedAttribute
	 * @generated
	 */
	public Adapter createEmbeddedAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DecimalAttribute <em>Decimal Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DecimalAttribute
	 * @generated
	 */
	public Adapter createDecimalAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DateTimeAttribute <em>Date Time Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DateTimeAttribute
	 * @generated
	 */
	public Adapter createDateTimeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Template <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Template
	 * @generated
	 */
	public Adapter createTemplateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Tag <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Tag
	 * @generated
	 */
	public Adapter createFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Binary <em>Binary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Binary
	 * @generated
	 */
	public Adapter createBinaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOInterface <em>DAO Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOInterface
	 * @generated
	 */
	public Adapter createDAOInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOClass <em>DAO Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOClass
	 * @generated
	 */
	public Adapter createDAOClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOGeneralization <em>DAO Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOGeneralization
	 * @generated
	 */
	public Adapter createDAOGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.FrontControllerClass <em>Front Controller Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.FrontControllerClass
	 * @generated
	 */
	public Adapter createFrontControllerClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Tag <em>User View Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Tag
	 * @generated
	 */
	public Adapter createUserViewAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.IOParameter <em>IO Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.IOParameter
	 * @generated
	 */
	public Adapter createIOParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOBaseOperation <em>DAO Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOBaseOperation
	 * @generated
	 */
	public Adapter createDAOBaseOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ResultDependency <em>Result Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ResultDependency
	 * @generated
	 */
	public Adapter createResultDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationAssociation <em>Navigation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationAssociation
	 * @generated
	 */
	public Adapter createNavigationAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.FrontControllerMethod <em>Front Controller Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.FrontControllerMethod
	 * @generated
	 */
	public Adapter createFrontControllerMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NamingMethod <em>Naming Method</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NamingMethod
	 * @generated
	 */
	public Adapter createNamingMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ServiceClass <em>Service Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ServiceClass
	 * @generated
	 */
	public Adapter createServiceClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ServiceInterface <em>Service Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ServiceInterface
	 * @generated
	 */
	public Adapter createServiceInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ServiceGeneralization <em>Service Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ServiceGeneralization
	 * @generated
	 */
	public Adapter createServiceGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ServiceNavigationAssociation <em>Service Navigation Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ServiceNavigationAssociation
	 * @generated
	 */
	public Adapter createServiceNavigationAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainClass <em>Domain Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainClass
	 * @generated
	 */
	public Adapter createDomainClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.FrameWebName <em>Frame Web Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.FrameWebName
	 * @generated
	 */
	public Adapter createFrameWebNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.BinaryAttribute <em>Binary Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.BinaryAttribute
	 * @generated
	 */
	public Adapter createBinaryAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ConstantName <em>Constant Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ConstantName
	 * @generated
	 */
	public Adapter createConstantNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainTableName <em>Domain Table Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainTableName
	 * @generated
	 */
	public Adapter createDomainTableNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.FrameWorkName <em>Frame Work Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.FrameWorkName
	 * @generated
	 */
	public Adapter createFrameWorkNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainColumnName <em>Domain Column Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainColumnName
	 * @generated
	 */
	public Adapter createDomainColumnNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOInterfaceName <em>DAO Interface Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOInterfaceName
	 * @generated
	 */
	public Adapter createDAOInterfaceNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOClassName <em>DAO Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOClassName
	 * @generated
	 */
	public Adapter createDAOClassNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ResultType <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ResultType
	 * @generated
	 */
	public Adapter createResultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.FrontControllerDependency <em>Front Controller Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.FrontControllerDependency
	 * @generated
	 */
	public Adapter createFrontControllerDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.PageDependency <em>Page Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.PageDependency
	 * @generated
	 */
	public Adapter createPageDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ChainingDependency <em>Chaining Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ChainingDependency
	 * @generated
	 */
	public Adapter createChainingDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOServiceAssociation <em>DAO Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOServiceAssociation
	 * @generated
	 */
	public Adapter createDAOServiceAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationAttribute <em>Navigation Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationAttribute
	 * @generated
	 */
	public Adapter createNavigationAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationClass <em>Navigation Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationClass
	 * @generated
	 */
	public Adapter createNavigationClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainOperation <em>Domain Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainOperation
	 * @generated
	 */
	public Adapter createDomainOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOAttribute <em>DAO Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOAttribute
	 * @generated
	 */
	public Adapter createDAOAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ServiceOperation <em>Service Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ServiceOperation
	 * @generated
	 */
	public Adapter createServiceOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ServiceAttribute <em>Service Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ServiceAttribute
	 * @generated
	 */
	public Adapter createServiceAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ServiceAssociation <em>Service Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ServiceAssociation
	 * @generated
	 */
	public Adapter createServiceAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationDependency <em>Navigation Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationDependency
	 * @generated
	 */
	public Adapter createNavigationDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DAOOperation <em>DAO Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DAOOperation
	 * @generated
	 */
	public Adapter createDAOOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainPackage <em>Domain Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainPackage
	 * @generated
	 */
	public Adapter createDomainPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ViewPackage <em>View Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ViewPackage
	 * @generated
	 */
	public Adapter createViewPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ControllerPackage <em>Controller Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ControllerPackage
	 * @generated
	 */
	public Adapter createControllerPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.PersistencePackage <em>Persistence Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.PersistencePackage
	 * @generated
	 */
	public Adapter createPersistencePackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ApplicationPackage <em>Application Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ApplicationPackage
	 * @generated
	 */
	public Adapter createApplicationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.ResultType <em>Result Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.ResultType
	 * @generated
	 */
	public Adapter createResultTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationPackage <em>Navigation Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationPackage
	 * @generated
	 */
	public Adapter createNavigationPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.DomainGeneralization <em>Domain Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.DomainGeneralization
	 * @generated
	 */
	public Adapter createDomainGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.JQuery <em>JQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.JQuery
	 * @generated
	 */
	public Adapter createJQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Tag <em>Form Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Tag
	 * @generated
	 */
	public Adapter createFormComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.TagLib <em>Tag Lib</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.TagLib
	 * @generated
	 */
	public Adapter createTagLibAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Rule
	 * @generated
	 */
	public Adapter createRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.Anotation <em>Anotation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.Anotation
	 * @generated
	 */
	public Adapter createAnotationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationCompositionEnd <em>Navigation Composition End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationCompositionEnd
	 * @generated
	 */
	public Adapter createNavigationCompositionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationComposition <em>Navigation Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationComposition
	 * @generated
	 */
	public Adapter createNavigationCompositionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link frameweb.NavigationProperty <em>Navigation Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see frameweb.NavigationProperty
	 * @generated
	 */
	public Adapter createNavigationPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.EModelElement <em>EModel Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.EModelElement
	 * @generated
	 */
	public Adapter createEModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Namespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Namespace
	 * @generated
	 */
	public Adapter createNamespaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.RedefinableElement <em>Redefinable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.RedefinableElement
	 * @generated
	 */
	public Adapter createRedefinableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.ParameterableElement <em>Parameterable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.ParameterableElement
	 * @generated
	 */
	public Adapter createParameterableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.PackageableElement <em>Packageable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.PackageableElement
	 * @generated
	 */
	public Adapter createPackageableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.TemplateableElement <em>Templateable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.TemplateableElement
	 * @generated
	 */
	public Adapter createTemplateableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.StructuredClassifier <em>Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.StructuredClassifier
	 * @generated
	 */
	public Adapter createStructuredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.EncapsulatedClassifier <em>Encapsulated Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.EncapsulatedClassifier
	 * @generated
	 */
	public Adapter createEncapsulatedClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.BehavioredClassifier <em>Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.BehavioredClassifier
	 * @generated
	 */
	public Adapter createBehavioredClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Relationship
	 * @generated
	 */
	public Adapter createRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Association
	 * @generated
	 */
	public Adapter createAssociationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Feature
	 * @generated
	 */
	public Adapter createFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.TypedElement
	 * @generated
	 */
	public Adapter createTypedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.MultiplicityElement <em>Multiplicity Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.MultiplicityElement
	 * @generated
	 */
	public Adapter createMultiplicityElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.StructuralFeature <em>Structural Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.StructuralFeature
	 * @generated
	 */
	public Adapter createStructuralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.ConnectableElement <em>Connectable Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.ConnectableElement
	 * @generated
	 */
	public Adapter createConnectableElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.DeploymentTarget <em>Deployment Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.DeploymentTarget
	 * @generated
	 */
	public Adapter createDeploymentTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.DirectedRelationship <em>Directed Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.DirectedRelationship
	 * @generated
	 */
	public Adapter createDirectedRelationshipAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Generalization
	 * @generated
	 */
	public Adapter createGeneralizationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.BehavioralFeature <em>Behavioral Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.BehavioralFeature
	 * @generated
	 */
	public Adapter createBehavioralFeatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.uml.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.uml.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FramewebAdapterFactory

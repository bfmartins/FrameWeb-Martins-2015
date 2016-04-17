/**
 */
package frameweb.util;

import frameweb.*;

import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.uml2.uml.Abstraction;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.BehavioralFeature;
import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.DeploymentTarget;
import org.eclipse.uml2.uml.DirectedRelationship;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EncapsulatedClassifier;
import org.eclipse.uml2.uml.Extension;
import org.eclipse.uml2.uml.ExtensionEnd;
import org.eclipse.uml2.uml.Feature;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.MultiplicityElement;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.PackageableElement;
import org.eclipse.uml2.uml.ParameterableElement;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.ProfileApplication;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.TemplateableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.TypedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see frameweb.FramewebPackage
 * @generated
 */
public class FramewebSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FramewebPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FramewebSwitch() {
		if (modelPackage == null) {
			modelPackage = FramewebPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FramewebPackage.FRAMEWEB: {
				Frameweb frameweb = (Frameweb)theEObject;
				T result = caseFrameweb(frameweb);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FRAME_WEB_MODEL: {
				FrameWebModel frameWebModel = (FrameWebModel)theEObject;
				T result = caseFrameWebModel(frameWebModel);
				if (result == null) result = caseModel(frameWebModel);
				if (result == null) result = casePackage(frameWebModel);
				if (result == null) result = caseNamespace(frameWebModel);
				if (result == null) result = casePackageableElement(frameWebModel);
				if (result == null) result = caseTemplateableElement(frameWebModel);
				if (result == null) result = caseNamedElement(frameWebModel);
				if (result == null) result = caseParameterableElement(frameWebModel);
				if (result == null) result = caseElement(frameWebModel);
				if (result == null) result = caseEModelElement(frameWebModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FRAMEWORK_PROFILE: {
				FrameworkProfile frameworkProfile = (FrameworkProfile)theEObject;
				T result = caseFrameworkProfile(frameworkProfile);
				if (result == null) result = caseProfile(frameworkProfile);
				if (result == null) result = casePackage(frameworkProfile);
				if (result == null) result = caseNamespace(frameworkProfile);
				if (result == null) result = casePackageableElement(frameworkProfile);
				if (result == null) result = caseTemplateableElement(frameworkProfile);
				if (result == null) result = caseNamedElement(frameworkProfile);
				if (result == null) result = caseParameterableElement(frameworkProfile);
				if (result == null) result = caseElement(frameworkProfile);
				if (result == null) result = caseEModelElement(frameworkProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = caseFrameWebModel(domainModel);
				if (result == null) result = caseModel(domainModel);
				if (result == null) result = casePackage(domainModel);
				if (result == null) result = caseNamespace(domainModel);
				if (result == null) result = casePackageableElement(domainModel);
				if (result == null) result = caseTemplateableElement(domainModel);
				if (result == null) result = caseNamedElement(domainModel);
				if (result == null) result = caseParameterableElement(domainModel);
				if (result == null) result = caseElement(domainModel);
				if (result == null) result = caseEModelElement(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_MODEL: {
				NavigationModel navigationModel = (NavigationModel)theEObject;
				T result = caseNavigationModel(navigationModel);
				if (result == null) result = caseFrameWebModel(navigationModel);
				if (result == null) result = caseModel(navigationModel);
				if (result == null) result = casePackage(navigationModel);
				if (result == null) result = caseNamespace(navigationModel);
				if (result == null) result = casePackageableElement(navigationModel);
				if (result == null) result = caseTemplateableElement(navigationModel);
				if (result == null) result = caseNamedElement(navigationModel);
				if (result == null) result = caseParameterableElement(navigationModel);
				if (result == null) result = caseElement(navigationModel);
				if (result == null) result = caseEModelElement(navigationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.APPLICATION_MODEL: {
				ApplicationModel applicationModel = (ApplicationModel)theEObject;
				T result = caseApplicationModel(applicationModel);
				if (result == null) result = caseFrameWebModel(applicationModel);
				if (result == null) result = caseModel(applicationModel);
				if (result == null) result = casePackage(applicationModel);
				if (result == null) result = caseNamespace(applicationModel);
				if (result == null) result = casePackageableElement(applicationModel);
				if (result == null) result = caseTemplateableElement(applicationModel);
				if (result == null) result = caseNamedElement(applicationModel);
				if (result == null) result = caseParameterableElement(applicationModel);
				if (result == null) result = caseElement(applicationModel);
				if (result == null) result = caseEModelElement(applicationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.PERSISTENCE_MODEL: {
				PersistenceModel persistenceModel = (PersistenceModel)theEObject;
				T result = casePersistenceModel(persistenceModel);
				if (result == null) result = caseFrameWebModel(persistenceModel);
				if (result == null) result = caseModel(persistenceModel);
				if (result == null) result = casePackage(persistenceModel);
				if (result == null) result = caseNamespace(persistenceModel);
				if (result == null) result = casePackageableElement(persistenceModel);
				if (result == null) result = caseTemplateableElement(persistenceModel);
				if (result == null) result = caseNamedElement(persistenceModel);
				if (result == null) result = caseParameterableElement(persistenceModel);
				if (result == null) result = caseElement(persistenceModel);
				if (result == null) result = caseEModelElement(persistenceModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_ASSOCIATION: {
				DomainAssociation domainAssociation = (DomainAssociation)theEObject;
				T result = caseDomainAssociation(domainAssociation);
				if (result == null) result = caseAssociation(domainAssociation);
				if (result == null) result = caseClassifier(domainAssociation);
				if (result == null) result = caseRelationship(domainAssociation);
				if (result == null) result = caseNamespace(domainAssociation);
				if (result == null) result = caseRedefinableElement(domainAssociation);
				if (result == null) result = caseType(domainAssociation);
				if (result == null) result = caseTemplateableElement(domainAssociation);
				if (result == null) result = casePackageableElement(domainAssociation);
				if (result == null) result = caseNamedElement(domainAssociation);
				if (result == null) result = caseParameterableElement(domainAssociation);
				if (result == null) result = caseElement(domainAssociation);
				if (result == null) result = caseEModelElement(domainAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_ATTRIBUTE: {
				DomainAttribute domainAttribute = (DomainAttribute)theEObject;
				T result = caseDomainAttribute(domainAttribute);
				if (result == null) result = caseProperty(domainAttribute);
				if (result == null) result = caseStructuralFeature(domainAttribute);
				if (result == null) result = caseConnectableElement(domainAttribute);
				if (result == null) result = caseDeploymentTarget(domainAttribute);
				if (result == null) result = caseFeature(domainAttribute);
				if (result == null) result = caseTypedElement(domainAttribute);
				if (result == null) result = caseMultiplicityElement(domainAttribute);
				if (result == null) result = caseParameterableElement(domainAttribute);
				if (result == null) result = caseRedefinableElement(domainAttribute);
				if (result == null) result = caseNamedElement(domainAttribute);
				if (result == null) result = caseElement(domainAttribute);
				if (result == null) result = caseEModelElement(domainAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.VERSION_ATTRIBUTE: {
				VersionAttribute versionAttribute = (VersionAttribute)theEObject;
				T result = caseVersionAttribute(versionAttribute);
				if (result == null) result = caseDomainAttribute(versionAttribute);
				if (result == null) result = caseProperty(versionAttribute);
				if (result == null) result = caseStructuralFeature(versionAttribute);
				if (result == null) result = caseConnectableElement(versionAttribute);
				if (result == null) result = caseDeploymentTarget(versionAttribute);
				if (result == null) result = caseFeature(versionAttribute);
				if (result == null) result = caseTypedElement(versionAttribute);
				if (result == null) result = caseMultiplicityElement(versionAttribute);
				if (result == null) result = caseParameterableElement(versionAttribute);
				if (result == null) result = caseRedefinableElement(versionAttribute);
				if (result == null) result = caseNamedElement(versionAttribute);
				if (result == null) result = caseElement(versionAttribute);
				if (result == null) result = caseEModelElement(versionAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.ID_ATTRIBUTE: {
				IdAttribute idAttribute = (IdAttribute)theEObject;
				T result = caseIdAttribute(idAttribute);
				if (result == null) result = caseDomainAttribute(idAttribute);
				if (result == null) result = caseProperty(idAttribute);
				if (result == null) result = caseStructuralFeature(idAttribute);
				if (result == null) result = caseConnectableElement(idAttribute);
				if (result == null) result = caseDeploymentTarget(idAttribute);
				if (result == null) result = caseFeature(idAttribute);
				if (result == null) result = caseTypedElement(idAttribute);
				if (result == null) result = caseMultiplicityElement(idAttribute);
				if (result == null) result = caseParameterableElement(idAttribute);
				if (result == null) result = caseRedefinableElement(idAttribute);
				if (result == null) result = caseNamedElement(idAttribute);
				if (result == null) result = caseElement(idAttribute);
				if (result == null) result = caseEModelElement(idAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.LOB_ATTRIBUTE: {
				LOBAttribute lobAttribute = (LOBAttribute)theEObject;
				T result = caseLOBAttribute(lobAttribute);
				if (result == null) result = caseDomainAttribute(lobAttribute);
				if (result == null) result = caseProperty(lobAttribute);
				if (result == null) result = caseStructuralFeature(lobAttribute);
				if (result == null) result = caseConnectableElement(lobAttribute);
				if (result == null) result = caseDeploymentTarget(lobAttribute);
				if (result == null) result = caseFeature(lobAttribute);
				if (result == null) result = caseTypedElement(lobAttribute);
				if (result == null) result = caseMultiplicityElement(lobAttribute);
				if (result == null) result = caseParameterableElement(lobAttribute);
				if (result == null) result = caseRedefinableElement(lobAttribute);
				if (result == null) result = caseNamedElement(lobAttribute);
				if (result == null) result = caseElement(lobAttribute);
				if (result == null) result = caseEModelElement(lobAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.EMBEDDED_ATTRIBUTE: {
				EmbeddedAttribute embeddedAttribute = (EmbeddedAttribute)theEObject;
				T result = caseEmbeddedAttribute(embeddedAttribute);
				if (result == null) result = caseDomainAttribute(embeddedAttribute);
				if (result == null) result = caseProperty(embeddedAttribute);
				if (result == null) result = caseStructuralFeature(embeddedAttribute);
				if (result == null) result = caseConnectableElement(embeddedAttribute);
				if (result == null) result = caseDeploymentTarget(embeddedAttribute);
				if (result == null) result = caseFeature(embeddedAttribute);
				if (result == null) result = caseTypedElement(embeddedAttribute);
				if (result == null) result = caseMultiplicityElement(embeddedAttribute);
				if (result == null) result = caseParameterableElement(embeddedAttribute);
				if (result == null) result = caseRedefinableElement(embeddedAttribute);
				if (result == null) result = caseNamedElement(embeddedAttribute);
				if (result == null) result = caseElement(embeddedAttribute);
				if (result == null) result = caseEModelElement(embeddedAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DECIMAL_ATTRIBUTE: {
				DecimalAttribute decimalAttribute = (DecimalAttribute)theEObject;
				T result = caseDecimalAttribute(decimalAttribute);
				if (result == null) result = caseDomainAttribute(decimalAttribute);
				if (result == null) result = caseProperty(decimalAttribute);
				if (result == null) result = caseStructuralFeature(decimalAttribute);
				if (result == null) result = caseConnectableElement(decimalAttribute);
				if (result == null) result = caseDeploymentTarget(decimalAttribute);
				if (result == null) result = caseFeature(decimalAttribute);
				if (result == null) result = caseTypedElement(decimalAttribute);
				if (result == null) result = caseMultiplicityElement(decimalAttribute);
				if (result == null) result = caseParameterableElement(decimalAttribute);
				if (result == null) result = caseRedefinableElement(decimalAttribute);
				if (result == null) result = caseNamedElement(decimalAttribute);
				if (result == null) result = caseElement(decimalAttribute);
				if (result == null) result = caseEModelElement(decimalAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DATE_TIME_ATTRIBUTE: {
				DateTimeAttribute dateTimeAttribute = (DateTimeAttribute)theEObject;
				T result = caseDateTimeAttribute(dateTimeAttribute);
				if (result == null) result = caseDomainAttribute(dateTimeAttribute);
				if (result == null) result = caseProperty(dateTimeAttribute);
				if (result == null) result = caseStructuralFeature(dateTimeAttribute);
				if (result == null) result = caseConnectableElement(dateTimeAttribute);
				if (result == null) result = caseDeploymentTarget(dateTimeAttribute);
				if (result == null) result = caseFeature(dateTimeAttribute);
				if (result == null) result = caseTypedElement(dateTimeAttribute);
				if (result == null) result = caseMultiplicityElement(dateTimeAttribute);
				if (result == null) result = caseParameterableElement(dateTimeAttribute);
				if (result == null) result = caseRedefinableElement(dateTimeAttribute);
				if (result == null) result = caseNamedElement(dateTimeAttribute);
				if (result == null) result = caseElement(dateTimeAttribute);
				if (result == null) result = caseEModelElement(dateTimeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.PAGE: {
				Page page = (Page)theEObject;
				T result = casePage(page);
				if (result == null) result = caseNavigationClass(page);
				if (result == null) result = caseClass(page);
				if (result == null) result = caseEncapsulatedClassifier(page);
				if (result == null) result = caseBehavioredClassifier(page);
				if (result == null) result = caseStructuredClassifier(page);
				if (result == null) result = caseClassifier(page);
				if (result == null) result = caseNamespace(page);
				if (result == null) result = caseRedefinableElement(page);
				if (result == null) result = caseType(page);
				if (result == null) result = caseTemplateableElement(page);
				if (result == null) result = casePackageableElement(page);
				if (result == null) result = caseNamedElement(page);
				if (result == null) result = caseParameterableElement(page);
				if (result == null) result = caseElement(page);
				if (result == null) result = caseEModelElement(page);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.TEMPLATE: {
				Template template = (Template)theEObject;
				T result = caseTemplate(template);
				if (result == null) result = caseNavigationClass(template);
				if (result == null) result = caseClass(template);
				if (result == null) result = caseEncapsulatedClassifier(template);
				if (result == null) result = caseBehavioredClassifier(template);
				if (result == null) result = caseStructuredClassifier(template);
				if (result == null) result = caseClassifier(template);
				if (result == null) result = caseNamespace(template);
				if (result == null) result = caseRedefinableElement(template);
				if (result == null) result = caseType(template);
				if (result == null) result = caseTemplateableElement(template);
				if (result == null) result = casePackageableElement(template);
				if (result == null) result = caseNamedElement(template);
				if (result == null) result = caseParameterableElement(template);
				if (result == null) result = caseElement(template);
				if (result == null) result = caseEModelElement(template);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_INTERFACE: {
				DAOInterface daoInterface = (DAOInterface)theEObject;
				T result = caseDAOInterface(daoInterface);
				if (result == null) result = caseInterface(daoInterface);
				if (result == null) result = caseClassifier(daoInterface);
				if (result == null) result = caseNamespace(daoInterface);
				if (result == null) result = caseRedefinableElement(daoInterface);
				if (result == null) result = caseType(daoInterface);
				if (result == null) result = caseTemplateableElement(daoInterface);
				if (result == null) result = casePackageableElement(daoInterface);
				if (result == null) result = caseNamedElement(daoInterface);
				if (result == null) result = caseParameterableElement(daoInterface);
				if (result == null) result = caseElement(daoInterface);
				if (result == null) result = caseEModelElement(daoInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_CLASS: {
				DAOClass daoClass = (DAOClass)theEObject;
				T result = caseDAOClass(daoClass);
				if (result == null) result = caseClass(daoClass);
				if (result == null) result = caseEncapsulatedClassifier(daoClass);
				if (result == null) result = caseBehavioredClassifier(daoClass);
				if (result == null) result = caseStructuredClassifier(daoClass);
				if (result == null) result = caseClassifier(daoClass);
				if (result == null) result = caseNamespace(daoClass);
				if (result == null) result = caseRedefinableElement(daoClass);
				if (result == null) result = caseType(daoClass);
				if (result == null) result = caseTemplateableElement(daoClass);
				if (result == null) result = casePackageableElement(daoClass);
				if (result == null) result = caseNamedElement(daoClass);
				if (result == null) result = caseParameterableElement(daoClass);
				if (result == null) result = caseElement(daoClass);
				if (result == null) result = caseEModelElement(daoClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_REALIZATION: {
				DAORealization daoRealization = (DAORealization)theEObject;
				T result = caseDAORealization(daoRealization);
				if (result == null) result = caseInterfaceRealization(daoRealization);
				if (result == null) result = caseRealization(daoRealization);
				if (result == null) result = caseAbstraction(daoRealization);
				if (result == null) result = caseDependency(daoRealization);
				if (result == null) result = casePackageableElement(daoRealization);
				if (result == null) result = caseDirectedRelationship(daoRealization);
				if (result == null) result = caseNamedElement(daoRealization);
				if (result == null) result = caseParameterableElement(daoRealization);
				if (result == null) result = caseRelationship(daoRealization);
				if (result == null) result = caseElement(daoRealization);
				if (result == null) result = caseEModelElement(daoRealization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FRONT_CONTROLLER_CLASS: {
				FrontControllerClass frontControllerClass = (FrontControllerClass)theEObject;
				T result = caseFrontControllerClass(frontControllerClass);
				if (result == null) result = caseClass(frontControllerClass);
				if (result == null) result = caseEncapsulatedClassifier(frontControllerClass);
				if (result == null) result = caseBehavioredClassifier(frontControllerClass);
				if (result == null) result = caseStructuredClassifier(frontControllerClass);
				if (result == null) result = caseClassifier(frontControllerClass);
				if (result == null) result = caseNamespace(frontControllerClass);
				if (result == null) result = caseRedefinableElement(frontControllerClass);
				if (result == null) result = caseType(frontControllerClass);
				if (result == null) result = caseTemplateableElement(frontControllerClass);
				if (result == null) result = casePackageableElement(frontControllerClass);
				if (result == null) result = caseNamedElement(frontControllerClass);
				if (result == null) result = caseParameterableElement(frontControllerClass);
				if (result == null) result = caseElement(frontControllerClass);
				if (result == null) result = caseEModelElement(frontControllerClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.IO_PARAMETER: {
				IOParameter ioParameter = (IOParameter)theEObject;
				T result = caseIOParameter(ioParameter);
				if (result == null) result = caseNavigationAttribute(ioParameter);
				if (result == null) result = caseProperty(ioParameter);
				if (result == null) result = caseStructuralFeature(ioParameter);
				if (result == null) result = caseConnectableElement(ioParameter);
				if (result == null) result = caseDeploymentTarget(ioParameter);
				if (result == null) result = caseFeature(ioParameter);
				if (result == null) result = caseTypedElement(ioParameter);
				if (result == null) result = caseMultiplicityElement(ioParameter);
				if (result == null) result = caseParameterableElement(ioParameter);
				if (result == null) result = caseRedefinableElement(ioParameter);
				if (result == null) result = caseNamedElement(ioParameter);
				if (result == null) result = caseElement(ioParameter);
				if (result == null) result = caseEModelElement(ioParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT_DEPENDENCY: {
				ResultDependency resultDependency = (ResultDependency)theEObject;
				T result = caseResultDependency(resultDependency);
				if (result == null) result = caseNavigationDependency(resultDependency);
				if (result == null) result = caseDependency(resultDependency);
				if (result == null) result = casePackageableElement(resultDependency);
				if (result == null) result = caseDirectedRelationship(resultDependency);
				if (result == null) result = caseNamedElement(resultDependency);
				if (result == null) result = caseParameterableElement(resultDependency);
				if (result == null) result = caseRelationship(resultDependency);
				if (result == null) result = caseElement(resultDependency);
				if (result == null) result = caseEModelElement(resultDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_ASSOCIATION: {
				NavigationAssociation navigationAssociation = (NavigationAssociation)theEObject;
				T result = caseNavigationAssociation(navigationAssociation);
				if (result == null) result = caseAssociation(navigationAssociation);
				if (result == null) result = caseClassifier(navigationAssociation);
				if (result == null) result = caseRelationship(navigationAssociation);
				if (result == null) result = caseNamespace(navigationAssociation);
				if (result == null) result = caseRedefinableElement(navigationAssociation);
				if (result == null) result = caseType(navigationAssociation);
				if (result == null) result = caseTemplateableElement(navigationAssociation);
				if (result == null) result = casePackageableElement(navigationAssociation);
				if (result == null) result = caseNamedElement(navigationAssociation);
				if (result == null) result = caseParameterableElement(navigationAssociation);
				if (result == null) result = caseElement(navigationAssociation);
				if (result == null) result = caseEModelElement(navigationAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FRONT_CONTROLLER_METHOD: {
				FrontControllerMethod frontControllerMethod = (FrontControllerMethod)theEObject;
				T result = caseFrontControllerMethod(frontControllerMethod);
				if (result == null) result = caseOperation(frontControllerMethod);
				if (result == null) result = caseBehavioralFeature(frontControllerMethod);
				if (result == null) result = caseParameterableElement(frontControllerMethod);
				if (result == null) result = caseTemplateableElement(frontControllerMethod);
				if (result == null) result = caseNamespace(frontControllerMethod);
				if (result == null) result = caseFeature(frontControllerMethod);
				if (result == null) result = caseRedefinableElement(frontControllerMethod);
				if (result == null) result = caseNamedElement(frontControllerMethod);
				if (result == null) result = caseElement(frontControllerMethod);
				if (result == null) result = caseEModelElement(frontControllerMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SERVICE_CLASS: {
				ServiceClass serviceClass = (ServiceClass)theEObject;
				T result = caseServiceClass(serviceClass);
				if (result == null) result = caseClass(serviceClass);
				if (result == null) result = caseEncapsulatedClassifier(serviceClass);
				if (result == null) result = caseBehavioredClassifier(serviceClass);
				if (result == null) result = caseStructuredClassifier(serviceClass);
				if (result == null) result = caseClassifier(serviceClass);
				if (result == null) result = caseNamespace(serviceClass);
				if (result == null) result = caseRedefinableElement(serviceClass);
				if (result == null) result = caseType(serviceClass);
				if (result == null) result = caseTemplateableElement(serviceClass);
				if (result == null) result = casePackageableElement(serviceClass);
				if (result == null) result = caseNamedElement(serviceClass);
				if (result == null) result = caseParameterableElement(serviceClass);
				if (result == null) result = caseElement(serviceClass);
				if (result == null) result = caseEModelElement(serviceClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SERVICE_INTERFACE: {
				ServiceInterface serviceInterface = (ServiceInterface)theEObject;
				T result = caseServiceInterface(serviceInterface);
				if (result == null) result = caseInterface(serviceInterface);
				if (result == null) result = caseClassifier(serviceInterface);
				if (result == null) result = caseNamespace(serviceInterface);
				if (result == null) result = caseRedefinableElement(serviceInterface);
				if (result == null) result = caseType(serviceInterface);
				if (result == null) result = caseTemplateableElement(serviceInterface);
				if (result == null) result = casePackageableElement(serviceInterface);
				if (result == null) result = caseNamedElement(serviceInterface);
				if (result == null) result = caseParameterableElement(serviceInterface);
				if (result == null) result = caseElement(serviceInterface);
				if (result == null) result = caseEModelElement(serviceInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SERVICE_GENERALIZATION: {
				ServiceGeneralization serviceGeneralization = (ServiceGeneralization)theEObject;
				T result = caseServiceGeneralization(serviceGeneralization);
				if (result == null) result = caseGeneralization(serviceGeneralization);
				if (result == null) result = caseDirectedRelationship(serviceGeneralization);
				if (result == null) result = caseRelationship(serviceGeneralization);
				if (result == null) result = caseElement(serviceGeneralization);
				if (result == null) result = caseEModelElement(serviceGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SERVICE_CONTROLLER_ASSOCIATION: {
				ServiceControllerAssociation serviceControllerAssociation = (ServiceControllerAssociation)theEObject;
				T result = caseServiceControllerAssociation(serviceControllerAssociation);
				if (result == null) result = caseServiceAssociation(serviceControllerAssociation);
				if (result == null) result = caseAssociation(serviceControllerAssociation);
				if (result == null) result = caseClassifier(serviceControllerAssociation);
				if (result == null) result = caseRelationship(serviceControllerAssociation);
				if (result == null) result = caseNamespace(serviceControllerAssociation);
				if (result == null) result = caseRedefinableElement(serviceControllerAssociation);
				if (result == null) result = caseType(serviceControllerAssociation);
				if (result == null) result = caseTemplateableElement(serviceControllerAssociation);
				if (result == null) result = casePackageableElement(serviceControllerAssociation);
				if (result == null) result = caseNamedElement(serviceControllerAssociation);
				if (result == null) result = caseParameterableElement(serviceControllerAssociation);
				if (result == null) result = caseElement(serviceControllerAssociation);
				if (result == null) result = caseEModelElement(serviceControllerAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_CLASS: {
				DomainClass domainClass = (DomainClass)theEObject;
				T result = caseDomainClass(domainClass);
				if (result == null) result = caseClass(domainClass);
				if (result == null) result = caseEncapsulatedClassifier(domainClass);
				if (result == null) result = caseBehavioredClassifier(domainClass);
				if (result == null) result = caseStructuredClassifier(domainClass);
				if (result == null) result = caseClassifier(domainClass);
				if (result == null) result = caseNamespace(domainClass);
				if (result == null) result = caseRedefinableElement(domainClass);
				if (result == null) result = caseType(domainClass);
				if (result == null) result = caseTemplateableElement(domainClass);
				if (result == null) result = casePackageableElement(domainClass);
				if (result == null) result = caseNamedElement(domainClass);
				if (result == null) result = caseParameterableElement(domainClass);
				if (result == null) result = caseElement(domainClass);
				if (result == null) result = caseEModelElement(domainClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
				if (theResult == null) theResult = caseClass(result);
				if (theResult == null) theResult = caseEncapsulatedClassifier(result);
				if (theResult == null) theResult = caseBehavioredClassifier(result);
				if (theResult == null) theResult = caseStructuredClassifier(result);
				if (theResult == null) theResult = caseClassifier(result);
				if (theResult == null) theResult = caseNamespace(result);
				if (theResult == null) theResult = caseRedefinableElement(result);
				if (theResult == null) theResult = caseType(result);
				if (theResult == null) theResult = caseTemplateableElement(result);
				if (theResult == null) theResult = casePackageableElement(result);
				if (theResult == null) theResult = caseNamedElement(result);
				if (theResult == null) theResult = caseParameterableElement(result);
				if (theResult == null) theResult = caseElement(result);
				if (theResult == null) theResult = caseEModelElement(result);
				if (theResult == null) theResult = defaultCase(theEObject);
				return theResult;
			}
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY: {
				FrontControllerDependency frontControllerDependency = (FrontControllerDependency)theEObject;
				T result = caseFrontControllerDependency(frontControllerDependency);
				if (result == null) result = caseNavigationDependency(frontControllerDependency);
				if (result == null) result = caseDependency(frontControllerDependency);
				if (result == null) result = casePackageableElement(frontControllerDependency);
				if (result == null) result = caseDirectedRelationship(frontControllerDependency);
				if (result == null) result = caseNamedElement(frontControllerDependency);
				if (result == null) result = caseParameterableElement(frontControllerDependency);
				if (result == null) result = caseRelationship(frontControllerDependency);
				if (result == null) result = caseElement(frontControllerDependency);
				if (result == null) result = caseEModelElement(frontControllerDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.PAGE_DEPENDENCY: {
				PageDependency pageDependency = (PageDependency)theEObject;
				T result = casePageDependency(pageDependency);
				if (result == null) result = caseNavigationDependency(pageDependency);
				if (result == null) result = caseDependency(pageDependency);
				if (result == null) result = casePackageableElement(pageDependency);
				if (result == null) result = caseDirectedRelationship(pageDependency);
				if (result == null) result = caseNamedElement(pageDependency);
				if (result == null) result = caseParameterableElement(pageDependency);
				if (result == null) result = caseRelationship(pageDependency);
				if (result == null) result = caseElement(pageDependency);
				if (result == null) result = caseEModelElement(pageDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CHAINING_DEPENDENCY: {
				ChainingDependency chainingDependency = (ChainingDependency)theEObject;
				T result = caseChainingDependency(chainingDependency);
				if (result == null) result = caseNavigationDependency(chainingDependency);
				if (result == null) result = caseDependency(chainingDependency);
				if (result == null) result = casePackageableElement(chainingDependency);
				if (result == null) result = caseDirectedRelationship(chainingDependency);
				if (result == null) result = caseNamedElement(chainingDependency);
				if (result == null) result = caseParameterableElement(chainingDependency);
				if (result == null) result = caseRelationship(chainingDependency);
				if (result == null) result = caseElement(chainingDependency);
				if (result == null) result = caseEModelElement(chainingDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_SERVICE_ASSOCIATION: {
				DAOServiceAssociation daoServiceAssociation = (DAOServiceAssociation)theEObject;
				T result = caseDAOServiceAssociation(daoServiceAssociation);
				if (result == null) result = caseServiceAssociation(daoServiceAssociation);
				if (result == null) result = caseAssociation(daoServiceAssociation);
				if (result == null) result = caseClassifier(daoServiceAssociation);
				if (result == null) result = caseRelationship(daoServiceAssociation);
				if (result == null) result = caseNamespace(daoServiceAssociation);
				if (result == null) result = caseRedefinableElement(daoServiceAssociation);
				if (result == null) result = caseType(daoServiceAssociation);
				if (result == null) result = caseTemplateableElement(daoServiceAssociation);
				if (result == null) result = casePackageableElement(daoServiceAssociation);
				if (result == null) result = caseNamedElement(daoServiceAssociation);
				if (result == null) result = caseParameterableElement(daoServiceAssociation);
				if (result == null) result = caseElement(daoServiceAssociation);
				if (result == null) result = caseEModelElement(daoServiceAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_ATTRIBUTE: {
				NavigationAttribute navigationAttribute = (NavigationAttribute)theEObject;
				T result = caseNavigationAttribute(navigationAttribute);
				if (result == null) result = caseProperty(navigationAttribute);
				if (result == null) result = caseStructuralFeature(navigationAttribute);
				if (result == null) result = caseConnectableElement(navigationAttribute);
				if (result == null) result = caseDeploymentTarget(navigationAttribute);
				if (result == null) result = caseFeature(navigationAttribute);
				if (result == null) result = caseTypedElement(navigationAttribute);
				if (result == null) result = caseMultiplicityElement(navigationAttribute);
				if (result == null) result = caseParameterableElement(navigationAttribute);
				if (result == null) result = caseRedefinableElement(navigationAttribute);
				if (result == null) result = caseNamedElement(navigationAttribute);
				if (result == null) result = caseElement(navigationAttribute);
				if (result == null) result = caseEModelElement(navigationAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_CLASS: {
				NavigationClass navigationClass = (NavigationClass)theEObject;
				T result = caseNavigationClass(navigationClass);
				if (result == null) result = caseClass(navigationClass);
				if (result == null) result = caseEncapsulatedClassifier(navigationClass);
				if (result == null) result = caseBehavioredClassifier(navigationClass);
				if (result == null) result = caseStructuredClassifier(navigationClass);
				if (result == null) result = caseClassifier(navigationClass);
				if (result == null) result = caseNamespace(navigationClass);
				if (result == null) result = caseRedefinableElement(navigationClass);
				if (result == null) result = caseType(navigationClass);
				if (result == null) result = caseTemplateableElement(navigationClass);
				if (result == null) result = casePackageableElement(navigationClass);
				if (result == null) result = caseNamedElement(navigationClass);
				if (result == null) result = caseParameterableElement(navigationClass);
				if (result == null) result = caseElement(navigationClass);
				if (result == null) result = caseEModelElement(navigationClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_METHOD: {
				DomainMethod domainMethod = (DomainMethod)theEObject;
				T result = caseDomainMethod(domainMethod);
				if (result == null) result = caseOperation(domainMethod);
				if (result == null) result = caseBehavioralFeature(domainMethod);
				if (result == null) result = caseParameterableElement(domainMethod);
				if (result == null) result = caseTemplateableElement(domainMethod);
				if (result == null) result = caseNamespace(domainMethod);
				if (result == null) result = caseFeature(domainMethod);
				if (result == null) result = caseRedefinableElement(domainMethod);
				if (result == null) result = caseNamedElement(domainMethod);
				if (result == null) result = caseElement(domainMethod);
				if (result == null) result = caseEModelElement(domainMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_ATTRIBUTE: {
				DAOAttribute daoAttribute = (DAOAttribute)theEObject;
				T result = caseDAOAttribute(daoAttribute);
				if (result == null) result = caseProperty(daoAttribute);
				if (result == null) result = caseStructuralFeature(daoAttribute);
				if (result == null) result = caseConnectableElement(daoAttribute);
				if (result == null) result = caseDeploymentTarget(daoAttribute);
				if (result == null) result = caseFeature(daoAttribute);
				if (result == null) result = caseTypedElement(daoAttribute);
				if (result == null) result = caseMultiplicityElement(daoAttribute);
				if (result == null) result = caseParameterableElement(daoAttribute);
				if (result == null) result = caseRedefinableElement(daoAttribute);
				if (result == null) result = caseNamedElement(daoAttribute);
				if (result == null) result = caseElement(daoAttribute);
				if (result == null) result = caseEModelElement(daoAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SERVICE_METHOD: {
				ServiceMethod serviceMethod = (ServiceMethod)theEObject;
				T result = caseServiceMethod(serviceMethod);
				if (result == null) result = caseOperation(serviceMethod);
				if (result == null) result = caseBehavioralFeature(serviceMethod);
				if (result == null) result = caseParameterableElement(serviceMethod);
				if (result == null) result = caseTemplateableElement(serviceMethod);
				if (result == null) result = caseNamespace(serviceMethod);
				if (result == null) result = caseFeature(serviceMethod);
				if (result == null) result = caseRedefinableElement(serviceMethod);
				if (result == null) result = caseNamedElement(serviceMethod);
				if (result == null) result = caseElement(serviceMethod);
				if (result == null) result = caseEModelElement(serviceMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SERVICE_ATTRIBUTE: {
				ServiceAttribute serviceAttribute = (ServiceAttribute)theEObject;
				T result = caseServiceAttribute(serviceAttribute);
				if (result == null) result = caseProperty(serviceAttribute);
				if (result == null) result = caseStructuralFeature(serviceAttribute);
				if (result == null) result = caseConnectableElement(serviceAttribute);
				if (result == null) result = caseDeploymentTarget(serviceAttribute);
				if (result == null) result = caseFeature(serviceAttribute);
				if (result == null) result = caseTypedElement(serviceAttribute);
				if (result == null) result = caseMultiplicityElement(serviceAttribute);
				if (result == null) result = caseParameterableElement(serviceAttribute);
				if (result == null) result = caseRedefinableElement(serviceAttribute);
				if (result == null) result = caseNamedElement(serviceAttribute);
				if (result == null) result = caseElement(serviceAttribute);
				if (result == null) result = caseEModelElement(serviceAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SERVICE_ASSOCIATION: {
				ServiceAssociation serviceAssociation = (ServiceAssociation)theEObject;
				T result = caseServiceAssociation(serviceAssociation);
				if (result == null) result = caseAssociation(serviceAssociation);
				if (result == null) result = caseClassifier(serviceAssociation);
				if (result == null) result = caseRelationship(serviceAssociation);
				if (result == null) result = caseNamespace(serviceAssociation);
				if (result == null) result = caseRedefinableElement(serviceAssociation);
				if (result == null) result = caseType(serviceAssociation);
				if (result == null) result = caseTemplateableElement(serviceAssociation);
				if (result == null) result = casePackageableElement(serviceAssociation);
				if (result == null) result = caseNamedElement(serviceAssociation);
				if (result == null) result = caseParameterableElement(serviceAssociation);
				if (result == null) result = caseElement(serviceAssociation);
				if (result == null) result = caseEModelElement(serviceAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_DEPENDENCY: {
				NavigationDependency navigationDependency = (NavigationDependency)theEObject;
				T result = caseNavigationDependency(navigationDependency);
				if (result == null) result = caseDependency(navigationDependency);
				if (result == null) result = casePackageableElement(navigationDependency);
				if (result == null) result = caseDirectedRelationship(navigationDependency);
				if (result == null) result = caseNamedElement(navigationDependency);
				if (result == null) result = caseParameterableElement(navigationDependency);
				if (result == null) result = caseRelationship(navigationDependency);
				if (result == null) result = caseElement(navigationDependency);
				if (result == null) result = caseEModelElement(navigationDependency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_METHOD: {
				DAOMethod daoMethod = (DAOMethod)theEObject;
				T result = caseDAOMethod(daoMethod);
				if (result == null) result = caseOperation(daoMethod);
				if (result == null) result = caseBehavioralFeature(daoMethod);
				if (result == null) result = caseParameterableElement(daoMethod);
				if (result == null) result = caseTemplateableElement(daoMethod);
				if (result == null) result = caseNamespace(daoMethod);
				if (result == null) result = caseFeature(daoMethod);
				if (result == null) result = caseRedefinableElement(daoMethod);
				if (result == null) result = caseNamedElement(daoMethod);
				if (result == null) result = caseElement(daoMethod);
				if (result == null) result = caseEModelElement(daoMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_PACKAGE: {
				DomainPackage domainPackage = (DomainPackage)theEObject;
				T result = caseDomainPackage(domainPackage);
				if (result == null) result = casePackage(domainPackage);
				if (result == null) result = caseNamespace(domainPackage);
				if (result == null) result = casePackageableElement(domainPackage);
				if (result == null) result = caseTemplateableElement(domainPackage);
				if (result == null) result = caseNamedElement(domainPackage);
				if (result == null) result = caseParameterableElement(domainPackage);
				if (result == null) result = caseElement(domainPackage);
				if (result == null) result = caseEModelElement(domainPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.VIEW_PACKAGE: {
				ViewPackage viewPackage = (ViewPackage)theEObject;
				T result = caseViewPackage(viewPackage);
				if (result == null) result = caseNavigationPackage(viewPackage);
				if (result == null) result = casePackage(viewPackage);
				if (result == null) result = caseNamespace(viewPackage);
				if (result == null) result = casePackageableElement(viewPackage);
				if (result == null) result = caseTemplateableElement(viewPackage);
				if (result == null) result = caseNamedElement(viewPackage);
				if (result == null) result = caseParameterableElement(viewPackage);
				if (result == null) result = caseElement(viewPackage);
				if (result == null) result = caseEModelElement(viewPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CONTROLLER_PACKAGE: {
				ControllerPackage controllerPackage = (ControllerPackage)theEObject;
				T result = caseControllerPackage(controllerPackage);
				if (result == null) result = caseNavigationPackage(controllerPackage);
				if (result == null) result = casePackage(controllerPackage);
				if (result == null) result = caseNamespace(controllerPackage);
				if (result == null) result = casePackageableElement(controllerPackage);
				if (result == null) result = caseTemplateableElement(controllerPackage);
				if (result == null) result = caseNamedElement(controllerPackage);
				if (result == null) result = caseParameterableElement(controllerPackage);
				if (result == null) result = caseElement(controllerPackage);
				if (result == null) result = caseEModelElement(controllerPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.PERSISTENCE_PACKAGE: {
				PersistencePackage persistencePackage = (PersistencePackage)theEObject;
				T result = casePersistencePackage(persistencePackage);
				if (result == null) result = casePackage(persistencePackage);
				if (result == null) result = caseNamespace(persistencePackage);
				if (result == null) result = casePackageableElement(persistencePackage);
				if (result == null) result = caseTemplateableElement(persistencePackage);
				if (result == null) result = caseNamedElement(persistencePackage);
				if (result == null) result = caseParameterableElement(persistencePackage);
				if (result == null) result = caseElement(persistencePackage);
				if (result == null) result = caseEModelElement(persistencePackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.APPLICATION_PACKAGE: {
				ApplicationPackage applicationPackage = (ApplicationPackage)theEObject;
				T result = caseApplicationPackage(applicationPackage);
				if (result == null) result = casePackage(applicationPackage);
				if (result == null) result = caseNamespace(applicationPackage);
				if (result == null) result = casePackageableElement(applicationPackage);
				if (result == null) result = caseTemplateableElement(applicationPackage);
				if (result == null) result = caseNamedElement(applicationPackage);
				if (result == null) result = caseParameterableElement(applicationPackage);
				if (result == null) result = caseElement(applicationPackage);
				if (result == null) result = caseEModelElement(applicationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.UI_COMPONENT: {
				UIComponent uiComponent = (UIComponent)theEObject;
				T result = caseUIComponent(uiComponent);
				if (result == null) result = caseNavigationClass(uiComponent);
				if (result == null) result = caseClass(uiComponent);
				if (result == null) result = caseEncapsulatedClassifier(uiComponent);
				if (result == null) result = caseBehavioredClassifier(uiComponent);
				if (result == null) result = caseStructuredClassifier(uiComponent);
				if (result == null) result = caseClassifier(uiComponent);
				if (result == null) result = caseNamespace(uiComponent);
				if (result == null) result = caseRedefinableElement(uiComponent);
				if (result == null) result = caseType(uiComponent);
				if (result == null) result = caseTemplateableElement(uiComponent);
				if (result == null) result = casePackageableElement(uiComponent);
				if (result == null) result = caseNamedElement(uiComponent);
				if (result == null) result = caseParameterableElement(uiComponent);
				if (result == null) result = caseElement(uiComponent);
				if (result == null) result = caseEModelElement(uiComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT_TYPE: {
				ResultType resultType = (ResultType)theEObject;
				T result = caseResultType(resultType);
				if (result == null) result = caseStereotype(resultType);
				if (result == null) result = caseClass(resultType);
				if (result == null) result = caseEncapsulatedClassifier(resultType);
				if (result == null) result = caseBehavioredClassifier(resultType);
				if (result == null) result = caseStructuredClassifier(resultType);
				if (result == null) result = caseClassifier(resultType);
				if (result == null) result = caseNamespace(resultType);
				if (result == null) result = caseRedefinableElement(resultType);
				if (result == null) result = caseType(resultType);
				if (result == null) result = caseTemplateableElement(resultType);
				if (result == null) result = casePackageableElement(resultType);
				if (result == null) result = caseNamedElement(resultType);
				if (result == null) result = caseParameterableElement(resultType);
				if (result == null) result = caseElement(resultType);
				if (result == null) result = caseEModelElement(resultType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_PACKAGE: {
				NavigationPackage navigationPackage = (NavigationPackage)theEObject;
				T result = caseNavigationPackage(navigationPackage);
				if (result == null) result = casePackage(navigationPackage);
				if (result == null) result = caseNamespace(navigationPackage);
				if (result == null) result = casePackageableElement(navigationPackage);
				if (result == null) result = caseTemplateableElement(navigationPackage);
				if (result == null) result = caseNamedElement(navigationPackage);
				if (result == null) result = caseParameterableElement(navigationPackage);
				if (result == null) result = caseElement(navigationPackage);
				if (result == null) result = caseEModelElement(navigationPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_GENERALIZATION: {
				DomainGeneralization domainGeneralization = (DomainGeneralization)theEObject;
				T result = caseDomainGeneralization(domainGeneralization);
				if (result == null) result = caseGeneralization(domainGeneralization);
				if (result == null) result = caseDirectedRelationship(domainGeneralization);
				if (result == null) result = caseRelationship(domainGeneralization);
				if (result == null) result = caseElement(domainGeneralization);
				if (result == null) result = caseEModelElement(domainGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.UI_COMPONENT_FIELD: {
				UIComponent uiComponentField = (UIComponent)theEObject;
				T result = caseUIComponentField(uiComponentField);
				if (result == null) result = caseNavigationAttribute((NavigationAttribute) uiComponentField);
				if (result == null) result = caseProperty((Property) uiComponentField);
				if (result == null) result = caseStructuralFeature((StructuralFeature) uiComponentField);
				if (result == null) result = caseConnectableElement((ConnectableElement) uiComponentField);
				if (result == null) result = caseDeploymentTarget((DeploymentTarget) uiComponentField);
				if (result == null) result = caseFeature((Feature) uiComponentField);
				if (result == null) result = caseTypedElement((TypedElement) uiComponentField);
				if (result == null) result = caseMultiplicityElement((MultiplicityElement) uiComponentField);
				if (result == null) result = caseParameterableElement(uiComponentField);
				if (result == null) result = caseRedefinableElement(uiComponentField);
				if (result == null) result = caseNamedElement(uiComponentField);
				if (result == null) result = caseElement(uiComponentField);
				if (result == null) result = caseEModelElement(uiComponentField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.TAG_LIB: {
				TagLib tagLib = (TagLib)theEObject;
				T result = caseTagLib(tagLib);
				if (result == null) result = casePackage(tagLib);
				if (result == null) result = caseNamespace(tagLib);
				if (result == null) result = casePackageableElement(tagLib);
				if (result == null) result = caseTemplateableElement(tagLib);
				if (result == null) result = caseNamedElement(tagLib);
				if (result == null) result = caseParameterableElement(tagLib);
				if (result == null) result = caseElement(tagLib);
				if (result == null) result = caseEModelElement(tagLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseStereotype(tag);
				if (result == null) result = caseClass(tag);
				if (result == null) result = caseEncapsulatedClassifier(tag);
				if (result == null) result = caseBehavioredClassifier(tag);
				if (result == null) result = caseStructuredClassifier(tag);
				if (result == null) result = caseClassifier(tag);
				if (result == null) result = caseNamespace(tag);
				if (result == null) result = caseRedefinableElement(tag);
				if (result == null) result = caseType(tag);
				if (result == null) result = caseTemplateableElement(tag);
				if (result == null) result = casePackageableElement(tag);
				if (result == null) result = caseNamedElement(tag);
				if (result == null) result = caseParameterableElement(tag);
				if (result == null) result = caseElement(tag);
				if (result == null) result = caseEModelElement(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_COMPOSITION_PART: {
				NavigationCompositionPart navigationCompositionPart = (NavigationCompositionPart)theEObject;
				T result = caseNavigationCompositionPart(navigationCompositionPart);
				if (result == null) result = caseNavigationProperty(navigationCompositionPart);
				if (result == null) result = caseProperty(navigationCompositionPart);
				if (result == null) result = caseStructuralFeature(navigationCompositionPart);
				if (result == null) result = caseConnectableElement(navigationCompositionPart);
				if (result == null) result = caseDeploymentTarget(navigationCompositionPart);
				if (result == null) result = caseFeature(navigationCompositionPart);
				if (result == null) result = caseTypedElement(navigationCompositionPart);
				if (result == null) result = caseMultiplicityElement(navigationCompositionPart);
				if (result == null) result = caseParameterableElement(navigationCompositionPart);
				if (result == null) result = caseRedefinableElement(navigationCompositionPart);
				if (result == null) result = caseNamedElement(navigationCompositionPart);
				if (result == null) result = caseElement(navigationCompositionPart);
				if (result == null) result = caseEModelElement(navigationCompositionPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_COMPOSITION_WHOLE: {
				NavigationCompositionWhole navigationCompositionWhole = (NavigationCompositionWhole)theEObject;
				T result = caseNavigationCompositionWhole(navigationCompositionWhole);
				if (result == null) result = caseNavigationProperty(navigationCompositionWhole);
				if (result == null) result = caseProperty(navigationCompositionWhole);
				if (result == null) result = caseStructuralFeature(navigationCompositionWhole);
				if (result == null) result = caseConnectableElement(navigationCompositionWhole);
				if (result == null) result = caseDeploymentTarget(navigationCompositionWhole);
				if (result == null) result = caseFeature(navigationCompositionWhole);
				if (result == null) result = caseTypedElement(navigationCompositionWhole);
				if (result == null) result = caseMultiplicityElement(navigationCompositionWhole);
				if (result == null) result = caseParameterableElement(navigationCompositionWhole);
				if (result == null) result = caseRedefinableElement(navigationCompositionWhole);
				if (result == null) result = caseNamedElement(navigationCompositionWhole);
				if (result == null) result = caseElement(navigationCompositionWhole);
				if (result == null) result = caseEModelElement(navigationCompositionWhole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_PROPERTY: {
				NavigationProperty navigationProperty = (NavigationProperty)theEObject;
				T result = caseNavigationProperty(navigationProperty);
				if (result == null) result = caseProperty(navigationProperty);
				if (result == null) result = caseStructuralFeature(navigationProperty);
				if (result == null) result = caseConnectableElement(navigationProperty);
				if (result == null) result = caseDeploymentTarget(navigationProperty);
				if (result == null) result = caseFeature(navigationProperty);
				if (result == null) result = caseTypedElement(navigationProperty);
				if (result == null) result = caseMultiplicityElement(navigationProperty);
				if (result == null) result = caseParameterableElement(navigationProperty);
				if (result == null) result = caseRedefinableElement(navigationProperty);
				if (result == null) result = caseNamedElement(navigationProperty);
				if (result == null) result = caseElement(navigationProperty);
				if (result == null) result = caseEModelElement(navigationProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT_SET: {
				ResultSet resultSet = (ResultSet)theEObject;
				T result = caseResultSet(resultSet);
				if (result == null) result = casePackage(resultSet);
				if (result == null) result = caseNamespace(resultSet);
				if (result == null) result = casePackageableElement(resultSet);
				if (result == null) result = caseTemplateableElement(resultSet);
				if (result == null) result = caseNamedElement(resultSet);
				if (result == null) result = caseParameterableElement(resultSet);
				if (result == null) result = caseElement(resultSet);
				if (result == null) result = caseEModelElement(resultSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_CONSTRAINT: {
				NavigationConstraint navigationConstraint = (NavigationConstraint)theEObject;
				T result = caseNavigationConstraint(navigationConstraint);
				if (result == null) result = caseConstraint(navigationConstraint);
				if (result == null) result = casePackageableElement(navigationConstraint);
				if (result == null) result = caseNamedElement(navigationConstraint);
				if (result == null) result = caseParameterableElement(navigationConstraint);
				if (result == null) result = caseElement(navigationConstraint);
				if (result == null) result = caseEModelElement(navigationConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.PAGE_CONSTRAINT: {
				PageConstraint pageConstraint = (PageConstraint)theEObject;
				T result = casePageConstraint(pageConstraint);
				if (result == null) result = caseNavigationConstraint(pageConstraint);
				if (result == null) result = caseConstraint(pageConstraint);
				if (result == null) result = casePackageableElement(pageConstraint);
				if (result == null) result = caseNamedElement(pageConstraint);
				if (result == null) result = caseParameterableElement(pageConstraint);
				if (result == null) result = caseElement(pageConstraint);
				if (result == null) result = caseEModelElement(pageConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT_CONSTRAINT: {
				ResultConstraint resultConstraint = (ResultConstraint)theEObject;
				T result = caseResultConstraint(resultConstraint);
				if (result == null) result = caseNavigationConstraint(resultConstraint);
				if (result == null) result = caseConstraint(resultConstraint);
				if (result == null) result = casePackageableElement(resultConstraint);
				if (result == null) result = caseNamedElement(resultConstraint);
				if (result == null) result = caseParameterableElement(resultConstraint);
				if (result == null) result = caseElement(resultConstraint);
				if (result == null) result = caseEModelElement(resultConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.METHOD_COSNTRAINT: {
				MethodCosntraint methodCosntraint = (MethodCosntraint)theEObject;
				T result = caseMethodCosntraint(methodCosntraint);
				if (result == null) result = caseNavigationConstraint(methodCosntraint);
				if (result == null) result = caseConstraint(methodCosntraint);
				if (result == null) result = casePackageableElement(methodCosntraint);
				if (result == null) result = caseNamedElement(methodCosntraint);
				if (result == null) result = caseParameterableElement(methodCosntraint);
				if (result == null) result = caseElement(methodCosntraint);
				if (result == null) result = caseEModelElement(methodCosntraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CHAINING_CONSTRAINT: {
				ChainingConstraint chainingConstraint = (ChainingConstraint)theEObject;
				T result = caseChainingConstraint(chainingConstraint);
				if (result == null) result = caseNavigationConstraint(chainingConstraint);
				if (result == null) result = caseConstraint(chainingConstraint);
				if (result == null) result = casePackageableElement(chainingConstraint);
				if (result == null) result = caseNamedElement(chainingConstraint);
				if (result == null) result = caseParameterableElement(chainingConstraint);
				if (result == null) result = caseElement(chainingConstraint);
				if (result == null) result = caseEModelElement(chainingConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_GENERALIZATION: {
				NavigationGeneralization navigationGeneralization = (NavigationGeneralization)theEObject;
				T result = caseNavigationGeneralization(navigationGeneralization);
				if (result == null) result = caseGeneralization(navigationGeneralization);
				if (result == null) result = caseDirectedRelationship(navigationGeneralization);
				if (result == null) result = caseRelationship(navigationGeneralization);
				if (result == null) result = caseElement(navigationGeneralization);
				if (result == null) result = caseEModelElement(navigationGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_CONSTRAINTS: {
				DomainConstraints domainConstraints = (DomainConstraints)theEObject;
				T result = caseDomainConstraints(domainConstraints);
				if (result == null) result = caseConstraint(domainConstraints);
				if (result == null) result = casePackageableElement(domainConstraints);
				if (result == null) result = caseNamedElement(domainConstraints);
				if (result == null) result = caseParameterableElement(domainConstraints);
				if (result == null) result = caseElement(domainConstraints);
				if (result == null) result = caseEModelElement(domainConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_PROPERTY: {
				DomainProperty domainProperty = (DomainProperty)theEObject;
				T result = caseDomainProperty(domainProperty);
				if (result == null) result = caseProperty(domainProperty);
				if (result == null) result = caseStructuralFeature(domainProperty);
				if (result == null) result = caseConnectableElement(domainProperty);
				if (result == null) result = caseDeploymentTarget(domainProperty);
				if (result == null) result = caseFeature(domainProperty);
				if (result == null) result = caseTypedElement(domainProperty);
				if (result == null) result = caseMultiplicityElement(domainProperty);
				if (result == null) result = caseParameterableElement(domainProperty);
				if (result == null) result = caseRedefinableElement(domainProperty);
				if (result == null) result = caseNamedElement(domainProperty);
				if (result == null) result = caseElement(domainProperty);
				if (result == null) result = caseEModelElement(domainProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_GENERALIZATION: {
				DAOGeneralization daoGeneralization = (DAOGeneralization)theEObject;
				T result = caseDAOGeneralization(daoGeneralization);
				if (result == null) result = caseGeneralization(daoGeneralization);
				if (result == null) result = caseDirectedRelationship(daoGeneralization);
				if (result == null) result = caseRelationship(daoGeneralization);
				if (result == null) result = caseElement(daoGeneralization);
				if (result == null) result = caseEModelElement(daoGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.MAPPING_LIB: {
				MappingLib mappingLib = (MappingLib)theEObject;
				T result = caseMappingLib(mappingLib);
				if (result == null) result = casePackage(mappingLib);
				if (result == null) result = caseNamespace(mappingLib);
				if (result == null) result = casePackageableElement(mappingLib);
				if (result == null) result = caseTemplateableElement(mappingLib);
				if (result == null) result = caseNamedElement(mappingLib);
				if (result == null) result = caseParameterableElement(mappingLib);
				if (result == null) result = caseElement(mappingLib);
				if (result == null) result = caseEModelElement(mappingLib);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CLASS_MAPPING: {
				ClassMapping classMapping = (ClassMapping)theEObject;
				T result = caseClassMapping(classMapping);
				if (result == null) result = caseStereotype(classMapping);
				if (result == null) result = caseClass(classMapping);
				if (result == null) result = caseEncapsulatedClassifier(classMapping);
				if (result == null) result = caseBehavioredClassifier(classMapping);
				if (result == null) result = caseStructuredClassifier(classMapping);
				if (result == null) result = caseClassifier(classMapping);
				if (result == null) result = caseNamespace(classMapping);
				if (result == null) result = caseRedefinableElement(classMapping);
				if (result == null) result = caseType(classMapping);
				if (result == null) result = caseTemplateableElement(classMapping);
				if (result == null) result = casePackageableElement(classMapping);
				if (result == null) result = caseNamedElement(classMapping);
				if (result == null) result = caseParameterableElement(classMapping);
				if (result == null) result = caseElement(classMapping);
				if (result == null) result = caseEModelElement(classMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.ATTRIBUTE_MAPPING: {
				AttributeMapping attributeMapping = (AttributeMapping)theEObject;
				T result = caseAttributeMapping(attributeMapping);
				if (result == null) result = caseStereotype(attributeMapping);
				if (result == null) result = caseClass(attributeMapping);
				if (result == null) result = caseEncapsulatedClassifier(attributeMapping);
				if (result == null) result = caseBehavioredClassifier(attributeMapping);
				if (result == null) result = caseStructuredClassifier(attributeMapping);
				if (result == null) result = caseClassifier(attributeMapping);
				if (result == null) result = caseNamespace(attributeMapping);
				if (result == null) result = caseRedefinableElement(attributeMapping);
				if (result == null) result = caseType(attributeMapping);
				if (result == null) result = caseTemplateableElement(attributeMapping);
				if (result == null) result = casePackageableElement(attributeMapping);
				if (result == null) result = caseNamedElement(attributeMapping);
				if (result == null) result = caseParameterableElement(attributeMapping);
				if (result == null) result = caseElement(attributeMapping);
				if (result == null) result = caseEModelElement(attributeMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_GENERALIZATION_SET: {
				DomainGeneralizationSet domainGeneralizationSet = (DomainGeneralizationSet)theEObject;
				T result = caseDomainGeneralizationSet(domainGeneralizationSet);
				if (result == null) result = caseGeneralizationSet(domainGeneralizationSet);
				if (result == null) result = casePackageableElement(domainGeneralizationSet);
				if (result == null) result = caseNamedElement(domainGeneralizationSet);
				if (result == null) result = caseParameterableElement(domainGeneralizationSet);
				if (result == null) result = caseElement(domainGeneralizationSet);
				if (result == null) result = caseEModelElement(domainGeneralizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FRAMEWORK_EXTENSION: {
				FrameworkExtension frameworkExtension = (FrameworkExtension)theEObject;
				T result = caseFrameworkExtension(frameworkExtension);
				if (result == null) result = caseExtension(frameworkExtension);
				if (result == null) result = caseAssociation(frameworkExtension);
				if (result == null) result = caseClassifier(frameworkExtension);
				if (result == null) result = caseRelationship(frameworkExtension);
				if (result == null) result = caseNamespace(frameworkExtension);
				if (result == null) result = caseRedefinableElement(frameworkExtension);
				if (result == null) result = caseType(frameworkExtension);
				if (result == null) result = caseTemplateableElement(frameworkExtension);
				if (result == null) result = casePackageableElement(frameworkExtension);
				if (result == null) result = caseNamedElement(frameworkExtension);
				if (result == null) result = caseParameterableElement(frameworkExtension);
				if (result == null) result = caseElement(frameworkExtension);
				if (result == null) result = caseEModelElement(frameworkExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.TAG_EXTENSION: {
				TagExtension tagExtension = (TagExtension)theEObject;
				T result = caseTagExtension(tagExtension);
				if (result == null) result = caseNavigationExtension(tagExtension);
				if (result == null) result = caseFrameworkExtension(tagExtension);
				if (result == null) result = caseExtension(tagExtension);
				if (result == null) result = caseAssociation(tagExtension);
				if (result == null) result = caseClassifier(tagExtension);
				if (result == null) result = caseRelationship(tagExtension);
				if (result == null) result = caseNamespace(tagExtension);
				if (result == null) result = caseRedefinableElement(tagExtension);
				if (result == null) result = caseType(tagExtension);
				if (result == null) result = caseTemplateableElement(tagExtension);
				if (result == null) result = casePackageableElement(tagExtension);
				if (result == null) result = caseNamedElement(tagExtension);
				if (result == null) result = caseParameterableElement(tagExtension);
				if (result == null) result = caseElement(tagExtension);
				if (result == null) result = caseEModelElement(tagExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FRAMEWORK: {
				Framework framework = (Framework)theEObject;
				T result = caseFramework(framework);
				if (result == null) result = caseProfileApplication(framework);
				if (result == null) result = caseDirectedRelationship(framework);
				if (result == null) result = caseRelationship(framework);
				if (result == null) result = caseElement(framework);
				if (result == null) result = caseEModelElement(framework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CONTROLLER_EXTENSION: {
				ControllerExtension controllerExtension = (ControllerExtension)theEObject;
				T result = caseControllerExtension(controllerExtension);
				if (result == null) result = caseNavigationExtension(controllerExtension);
				if (result == null) result = caseFrameworkExtension(controllerExtension);
				if (result == null) result = caseExtension(controllerExtension);
				if (result == null) result = caseAssociation(controllerExtension);
				if (result == null) result = caseClassifier(controllerExtension);
				if (result == null) result = caseRelationship(controllerExtension);
				if (result == null) result = caseNamespace(controllerExtension);
				if (result == null) result = caseRedefinableElement(controllerExtension);
				if (result == null) result = caseType(controllerExtension);
				if (result == null) result = caseTemplateableElement(controllerExtension);
				if (result == null) result = casePackageableElement(controllerExtension);
				if (result == null) result = caseNamedElement(controllerExtension);
				if (result == null) result = caseParameterableElement(controllerExtension);
				if (result == null) result = caseElement(controllerExtension);
				if (result == null) result = caseEModelElement(controllerExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CONTROLLER: {
				Controller controller = (Controller)theEObject;
				T result = caseController(controller);
				if (result == null) result = caseStereotype(controller);
				if (result == null) result = caseClass(controller);
				if (result == null) result = caseEncapsulatedClassifier(controller);
				if (result == null) result = caseBehavioredClassifier(controller);
				if (result == null) result = caseStructuredClassifier(controller);
				if (result == null) result = caseClassifier(controller);
				if (result == null) result = caseNamespace(controller);
				if (result == null) result = caseRedefinableElement(controller);
				if (result == null) result = caseType(controller);
				if (result == null) result = caseTemplateableElement(controller);
				if (result == null) result = casePackageableElement(controller);
				if (result == null) result = caseNamedElement(controller);
				if (result == null) result = caseParameterableElement(controller);
				if (result == null) result = caseElement(controller);
				if (result == null) result = caseEModelElement(controller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CONTROLLER_SET: {
				ControllerSet controllerSet = (ControllerSet)theEObject;
				T result = caseControllerSet(controllerSet);
				if (result == null) result = casePackage(controllerSet);
				if (result == null) result = caseNamespace(controllerSet);
				if (result == null) result = casePackageableElement(controllerSet);
				if (result == null) result = caseTemplateableElement(controllerSet);
				if (result == null) result = caseNamedElement(controllerSet);
				if (result == null) result = caseParameterableElement(controllerSet);
				if (result == null) result = caseElement(controllerSet);
				if (result == null) result = caseEModelElement(controllerSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT_EXTENSION: {
				ResultExtension resultExtension = (ResultExtension)theEObject;
				T result = caseResultExtension(resultExtension);
				if (result == null) result = caseNavigationExtension(resultExtension);
				if (result == null) result = caseFrameworkExtension(resultExtension);
				if (result == null) result = caseExtension(resultExtension);
				if (result == null) result = caseAssociation(resultExtension);
				if (result == null) result = caseClassifier(resultExtension);
				if (result == null) result = caseRelationship(resultExtension);
				if (result == null) result = caseNamespace(resultExtension);
				if (result == null) result = caseRedefinableElement(resultExtension);
				if (result == null) result = caseType(resultExtension);
				if (result == null) result = caseTemplateableElement(resultExtension);
				if (result == null) result = casePackageableElement(resultExtension);
				if (result == null) result = caseNamedElement(resultExtension);
				if (result == null) result = caseParameterableElement(resultExtension);
				if (result == null) result = caseElement(resultExtension);
				if (result == null) result = caseEModelElement(resultExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CLASS_MAPPING_EXTENSION: {
				ClassMappingExtension classMappingExtension = (ClassMappingExtension)theEObject;
				T result = caseClassMappingExtension(classMappingExtension);
				if (result == null) result = caseDomainExtension(classMappingExtension);
				if (result == null) result = caseFrameworkExtension(classMappingExtension);
				if (result == null) result = caseExtension(classMappingExtension);
				if (result == null) result = caseAssociation(classMappingExtension);
				if (result == null) result = caseClassifier(classMappingExtension);
				if (result == null) result = caseRelationship(classMappingExtension);
				if (result == null) result = caseNamespace(classMappingExtension);
				if (result == null) result = caseRedefinableElement(classMappingExtension);
				if (result == null) result = caseType(classMappingExtension);
				if (result == null) result = caseTemplateableElement(classMappingExtension);
				if (result == null) result = casePackageableElement(classMappingExtension);
				if (result == null) result = caseNamedElement(classMappingExtension);
				if (result == null) result = caseParameterableElement(classMappingExtension);
				if (result == null) result = caseElement(classMappingExtension);
				if (result == null) result = caseEModelElement(classMappingExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.ATTRIBUTE_MAPPING_EXTENSION: {
				AttributeMappingExtension attributeMappingExtension = (AttributeMappingExtension)theEObject;
				T result = caseAttributeMappingExtension(attributeMappingExtension);
				if (result == null) result = caseDomainExtension(attributeMappingExtension);
				if (result == null) result = caseFrameworkExtension(attributeMappingExtension);
				if (result == null) result = caseExtension(attributeMappingExtension);
				if (result == null) result = caseAssociation(attributeMappingExtension);
				if (result == null) result = caseClassifier(attributeMappingExtension);
				if (result == null) result = caseRelationship(attributeMappingExtension);
				if (result == null) result = caseNamespace(attributeMappingExtension);
				if (result == null) result = caseRedefinableElement(attributeMappingExtension);
				if (result == null) result = caseType(attributeMappingExtension);
				if (result == null) result = caseTemplateableElement(attributeMappingExtension);
				if (result == null) result = casePackageableElement(attributeMappingExtension);
				if (result == null) result = caseNamedElement(attributeMappingExtension);
				if (result == null) result = caseParameterableElement(attributeMappingExtension);
				if (result == null) result = caseElement(attributeMappingExtension);
				if (result == null) result = caseEModelElement(attributeMappingExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CONTROLLER_EXTENSION_END: {
				ControllerExtensionEnd controllerExtensionEnd = (ControllerExtensionEnd)theEObject;
				T result = caseControllerExtensionEnd(controllerExtensionEnd);
				if (result == null) result = caseExtensionEnd(controllerExtensionEnd);
				if (result == null) result = caseProperty(controllerExtensionEnd);
				if (result == null) result = caseStructuralFeature(controllerExtensionEnd);
				if (result == null) result = caseConnectableElement(controllerExtensionEnd);
				if (result == null) result = caseDeploymentTarget(controllerExtensionEnd);
				if (result == null) result = caseFeature(controllerExtensionEnd);
				if (result == null) result = caseTypedElement(controllerExtensionEnd);
				if (result == null) result = caseMultiplicityElement(controllerExtensionEnd);
				if (result == null) result = caseParameterableElement(controllerExtensionEnd);
				if (result == null) result = caseRedefinableElement(controllerExtensionEnd);
				if (result == null) result = caseNamedElement(controllerExtensionEnd);
				if (result == null) result = caseElement(controllerExtensionEnd);
				if (result == null) result = caseEModelElement(controllerExtensionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.TAG_EXTENSION_END: {
				TagExtensionEnd tagExtensionEnd = (TagExtensionEnd)theEObject;
				T result = caseTagExtensionEnd(tagExtensionEnd);
				if (result == null) result = caseExtensionEnd(tagExtensionEnd);
				if (result == null) result = caseProperty(tagExtensionEnd);
				if (result == null) result = caseStructuralFeature(tagExtensionEnd);
				if (result == null) result = caseConnectableElement(tagExtensionEnd);
				if (result == null) result = caseDeploymentTarget(tagExtensionEnd);
				if (result == null) result = caseFeature(tagExtensionEnd);
				if (result == null) result = caseTypedElement(tagExtensionEnd);
				if (result == null) result = caseMultiplicityElement(tagExtensionEnd);
				if (result == null) result = caseParameterableElement(tagExtensionEnd);
				if (result == null) result = caseRedefinableElement(tagExtensionEnd);
				if (result == null) result = caseNamedElement(tagExtensionEnd);
				if (result == null) result = caseElement(tagExtensionEnd);
				if (result == null) result = caseEModelElement(tagExtensionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT_EXTENSION_END: {
				ResultExtensionEnd resultExtensionEnd = (ResultExtensionEnd)theEObject;
				T result = caseResultExtensionEnd(resultExtensionEnd);
				if (result == null) result = caseExtensionEnd(resultExtensionEnd);
				if (result == null) result = caseProperty(resultExtensionEnd);
				if (result == null) result = caseStructuralFeature(resultExtensionEnd);
				if (result == null) result = caseConnectableElement(resultExtensionEnd);
				if (result == null) result = caseDeploymentTarget(resultExtensionEnd);
				if (result == null) result = caseFeature(resultExtensionEnd);
				if (result == null) result = caseTypedElement(resultExtensionEnd);
				if (result == null) result = caseMultiplicityElement(resultExtensionEnd);
				if (result == null) result = caseParameterableElement(resultExtensionEnd);
				if (result == null) result = caseRedefinableElement(resultExtensionEnd);
				if (result == null) result = caseNamedElement(resultExtensionEnd);
				if (result == null) result = caseElement(resultExtensionEnd);
				if (result == null) result = caseEModelElement(resultExtensionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CLASS_MAPPING_EXTENSION_END: {
				ClassMappingExtensionEnd classMappingExtensionEnd = (ClassMappingExtensionEnd)theEObject;
				T result = caseClassMappingExtensionEnd(classMappingExtensionEnd);
				if (result == null) result = caseExtensionEnd(classMappingExtensionEnd);
				if (result == null) result = caseProperty(classMappingExtensionEnd);
				if (result == null) result = caseStructuralFeature(classMappingExtensionEnd);
				if (result == null) result = caseConnectableElement(classMappingExtensionEnd);
				if (result == null) result = caseDeploymentTarget(classMappingExtensionEnd);
				if (result == null) result = caseFeature(classMappingExtensionEnd);
				if (result == null) result = caseTypedElement(classMappingExtensionEnd);
				if (result == null) result = caseMultiplicityElement(classMappingExtensionEnd);
				if (result == null) result = caseParameterableElement(classMappingExtensionEnd);
				if (result == null) result = caseRedefinableElement(classMappingExtensionEnd);
				if (result == null) result = caseNamedElement(classMappingExtensionEnd);
				if (result == null) result = caseElement(classMappingExtensionEnd);
				if (result == null) result = caseEModelElement(classMappingExtensionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.ATTRIBUTE_MAPPING_EXTENSION_END: {
				AttributeMappingExtensionEnd attributeMappingExtensionEnd = (AttributeMappingExtensionEnd)theEObject;
				T result = caseAttributeMappingExtensionEnd(attributeMappingExtensionEnd);
				if (result == null) result = caseExtensionEnd(attributeMappingExtensionEnd);
				if (result == null) result = caseProperty(attributeMappingExtensionEnd);
				if (result == null) result = caseStructuralFeature(attributeMappingExtensionEnd);
				if (result == null) result = caseConnectableElement(attributeMappingExtensionEnd);
				if (result == null) result = caseDeploymentTarget(attributeMappingExtensionEnd);
				if (result == null) result = caseFeature(attributeMappingExtensionEnd);
				if (result == null) result = caseTypedElement(attributeMappingExtensionEnd);
				if (result == null) result = caseMultiplicityElement(attributeMappingExtensionEnd);
				if (result == null) result = caseParameterableElement(attributeMappingExtensionEnd);
				if (result == null) result = caseRedefinableElement(attributeMappingExtensionEnd);
				if (result == null) result = caseNamedElement(attributeMappingExtensionEnd);
				if (result == null) result = caseElement(attributeMappingExtensionEnd);
				if (result == null) result = caseEModelElement(attributeMappingExtensionEnd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CONTROLLER_PROPERTY: {
				ControllerProperty controllerProperty = (ControllerProperty)theEObject;
				T result = caseControllerProperty(controllerProperty);
				if (result == null) result = caseProperty(controllerProperty);
				if (result == null) result = caseStructuralFeature(controllerProperty);
				if (result == null) result = caseConnectableElement(controllerProperty);
				if (result == null) result = caseDeploymentTarget(controllerProperty);
				if (result == null) result = caseFeature(controllerProperty);
				if (result == null) result = caseTypedElement(controllerProperty);
				if (result == null) result = caseMultiplicityElement(controllerProperty);
				if (result == null) result = caseParameterableElement(controllerProperty);
				if (result == null) result = caseRedefinableElement(controllerProperty);
				if (result == null) result = caseNamedElement(controllerProperty);
				if (result == null) result = caseElement(controllerProperty);
				if (result == null) result = caseEModelElement(controllerProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.TAG_PROPERTY: {
				TagProperty tagProperty = (TagProperty)theEObject;
				T result = caseTagProperty(tagProperty);
				if (result == null) result = caseProperty(tagProperty);
				if (result == null) result = caseStructuralFeature(tagProperty);
				if (result == null) result = caseConnectableElement(tagProperty);
				if (result == null) result = caseDeploymentTarget(tagProperty);
				if (result == null) result = caseFeature(tagProperty);
				if (result == null) result = caseTypedElement(tagProperty);
				if (result == null) result = caseMultiplicityElement(tagProperty);
				if (result == null) result = caseParameterableElement(tagProperty);
				if (result == null) result = caseRedefinableElement(tagProperty);
				if (result == null) result = caseNamedElement(tagProperty);
				if (result == null) result = caseElement(tagProperty);
				if (result == null) result = caseEModelElement(tagProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT_PROPERTY: {
				ResultProperty resultProperty = (ResultProperty)theEObject;
				T result = caseResultProperty(resultProperty);
				if (result == null) result = caseProperty(resultProperty);
				if (result == null) result = caseStructuralFeature(resultProperty);
				if (result == null) result = caseConnectableElement(resultProperty);
				if (result == null) result = caseDeploymentTarget(resultProperty);
				if (result == null) result = caseFeature(resultProperty);
				if (result == null) result = caseTypedElement(resultProperty);
				if (result == null) result = caseMultiplicityElement(resultProperty);
				if (result == null) result = caseParameterableElement(resultProperty);
				if (result == null) result = caseRedefinableElement(resultProperty);
				if (result == null) result = caseNamedElement(resultProperty);
				if (result == null) result = caseElement(resultProperty);
				if (result == null) result = caseEModelElement(resultProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CLASS_MAPPING_PROPERY: {
				ClassMappingPropery classMappingPropery = (ClassMappingPropery)theEObject;
				T result = caseClassMappingPropery(classMappingPropery);
				if (result == null) result = caseProperty(classMappingPropery);
				if (result == null) result = caseStructuralFeature(classMappingPropery);
				if (result == null) result = caseConnectableElement(classMappingPropery);
				if (result == null) result = caseDeploymentTarget(classMappingPropery);
				if (result == null) result = caseFeature(classMappingPropery);
				if (result == null) result = caseTypedElement(classMappingPropery);
				if (result == null) result = caseMultiplicityElement(classMappingPropery);
				if (result == null) result = caseParameterableElement(classMappingPropery);
				if (result == null) result = caseRedefinableElement(classMappingPropery);
				if (result == null) result = caseNamedElement(classMappingPropery);
				if (result == null) result = caseElement(classMappingPropery);
				if (result == null) result = caseEModelElement(classMappingPropery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.ATTRIBUTE_MAPPING_PROPERTY: {
				AttributeMappingProperty attributeMappingProperty = (AttributeMappingProperty)theEObject;
				T result = caseAttributeMappingProperty(attributeMappingProperty);
				if (result == null) result = caseProperty(attributeMappingProperty);
				if (result == null) result = caseStructuralFeature(attributeMappingProperty);
				if (result == null) result = caseConnectableElement(attributeMappingProperty);
				if (result == null) result = caseDeploymentTarget(attributeMappingProperty);
				if (result == null) result = caseFeature(attributeMappingProperty);
				if (result == null) result = caseTypedElement(attributeMappingProperty);
				if (result == null) result = caseMultiplicityElement(attributeMappingProperty);
				if (result == null) result = caseParameterableElement(attributeMappingProperty);
				if (result == null) result = caseRedefinableElement(attributeMappingProperty);
				if (result == null) result = caseNamedElement(attributeMappingProperty);
				if (result == null) result = caseElement(attributeMappingProperty);
				if (result == null) result = caseEModelElement(attributeMappingProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SEVICE_REALIZATION: {
				SeviceRealization seviceRealization = (SeviceRealization)theEObject;
				T result = caseSeviceRealization(seviceRealization);
				if (result == null) result = caseInterfaceRealization(seviceRealization);
				if (result == null) result = caseRealization(seviceRealization);
				if (result == null) result = caseAbstraction(seviceRealization);
				if (result == null) result = caseDependency(seviceRealization);
				if (result == null) result = casePackageableElement(seviceRealization);
				if (result == null) result = caseDirectedRelationship(seviceRealization);
				if (result == null) result = caseNamedElement(seviceRealization);
				if (result == null) result = caseParameterableElement(seviceRealization);
				if (result == null) result = caseRelationship(seviceRealization);
				if (result == null) result = caseElement(seviceRealization);
				if (result == null) result = caseEModelElement(seviceRealization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_EXTENSION: {
				NavigationExtension navigationExtension = (NavigationExtension)theEObject;
				T result = caseNavigationExtension(navigationExtension);
				if (result == null) result = caseFrameworkExtension(navigationExtension);
				if (result == null) result = caseExtension(navigationExtension);
				if (result == null) result = caseAssociation(navigationExtension);
				if (result == null) result = caseClassifier(navigationExtension);
				if (result == null) result = caseRelationship(navigationExtension);
				if (result == null) result = caseNamespace(navigationExtension);
				if (result == null) result = caseRedefinableElement(navigationExtension);
				if (result == null) result = caseType(navigationExtension);
				if (result == null) result = caseTemplateableElement(navigationExtension);
				if (result == null) result = casePackageableElement(navigationExtension);
				if (result == null) result = caseNamedElement(navigationExtension);
				if (result == null) result = caseParameterableElement(navigationExtension);
				if (result == null) result = caseElement(navigationExtension);
				if (result == null) result = caseEModelElement(navigationExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_EXTENSION: {
				DomainExtension domainExtension = (DomainExtension)theEObject;
				T result = caseDomainExtension(domainExtension);
				if (result == null) result = caseFrameworkExtension(domainExtension);
				if (result == null) result = caseExtension(domainExtension);
				if (result == null) result = caseAssociation(domainExtension);
				if (result == null) result = caseClassifier(domainExtension);
				if (result == null) result = caseRelationship(domainExtension);
				if (result == null) result = caseNamespace(domainExtension);
				if (result == null) result = caseRedefinableElement(domainExtension);
				if (result == null) result = caseType(domainExtension);
				if (result == null) result = caseTemplateableElement(domainExtension);
				if (result == null) result = casePackageableElement(domainExtension);
				if (result == null) result = caseNamedElement(domainExtension);
				if (result == null) result = caseParameterableElement(domainExtension);
				if (result == null) result = caseElement(domainExtension);
				if (result == null) result = caseEModelElement(domainExtension);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.NAVIGATION_GENERALIZATION_SET: {
				NavigationGeneralizationSet navigationGeneralizationSet = (NavigationGeneralizationSet)theEObject;
				T result = caseNavigationGeneralizationSet(navigationGeneralizationSet);
				if (result == null) result = caseGeneralizationSet(navigationGeneralizationSet);
				if (result == null) result = casePackageableElement(navigationGeneralizationSet);
				if (result == null) result = caseNamedElement(navigationGeneralizationSet);
				if (result == null) result = caseParameterableElement(navigationGeneralizationSet);
				if (result == null) result = caseElement(navigationGeneralizationSet);
				if (result == null) result = caseEModelElement(navigationGeneralizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_GENERALIZATION_SET: {
				DAOGeneralizationSet daoGeneralizationSet = (DAOGeneralizationSet)theEObject;
				T result = caseDAOGeneralizationSet(daoGeneralizationSet);
				if (result == null) result = caseGeneralizationSet(daoGeneralizationSet);
				if (result == null) result = casePackageableElement(daoGeneralizationSet);
				if (result == null) result = caseNamedElement(daoGeneralizationSet);
				if (result == null) result = caseParameterableElement(daoGeneralizationSet);
				if (result == null) result = caseElement(daoGeneralizationSet);
				if (result == null) result = caseEModelElement(daoGeneralizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.SERVICE_GENERALIZATION_SET: {
				ServiceGeneralizationSet serviceGeneralizationSet = (ServiceGeneralizationSet)theEObject;
				T result = caseServiceGeneralizationSet(serviceGeneralizationSet);
				if (result == null) result = caseGeneralizationSet(serviceGeneralizationSet);
				if (result == null) result = casePackageableElement(serviceGeneralizationSet);
				if (result == null) result = caseNamedElement(serviceGeneralizationSet);
				if (result == null) result = caseParameterableElement(serviceGeneralizationSet);
				if (result == null) result = caseElement(serviceGeneralizationSet);
				if (result == null) result = caseEModelElement(serviceGeneralizationSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frameweb</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frameweb</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameweb(Frameweb object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Web Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Web Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameWebModel(FrameWebModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Framework Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameworkProfile(FrameworkProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationModel(NavigationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationModel(ApplicationModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistenceModel(PersistenceModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAssociation(DomainAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainAttribute(DomainAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Version Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Version Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVersionAttribute(VersionAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Id Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Id Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdAttribute(IdAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LOB Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LOB Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLOBAttribute(LOBAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Embedded Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Embedded Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmbeddedAttribute(EmbeddedAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decimal Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decimal Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecimalAttribute(DecimalAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Time Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Time Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateTimeAttribute(DateTimeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplate(Template object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOInterface(DAOInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOClass(DAOClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAORealization(DAORealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Front Controller Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Front Controller Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrontControllerClass(FrontControllerClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IO Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IO Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIOParameter(IOParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultDependency(ResultDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationAssociation(NavigationAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Front Controller Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Front Controller Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrontControllerMethod(FrontControllerMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceClass(ServiceClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceInterface(ServiceInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceGeneralization(ServiceGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Controller Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Controller Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceControllerAssociation(ServiceControllerAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainClass(DomainClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResult(Result object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Front Controller Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Front Controller Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrontControllerDependency(FrontControllerDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageDependency(PageDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chaining Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chaining Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainingDependency(ChainingDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Service Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Service Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOServiceAssociation(DAOServiceAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationAttribute(NavigationAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationClass(NavigationClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainMethod(DomainMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOAttribute(DAOAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceMethod(ServiceMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceAttribute(ServiceAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceAssociation(ServiceAssociation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationDependency(NavigationDependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOMethod(DAOMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainPackage(DomainPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>View Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>View Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseViewPackage(ViewPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerPackage(ControllerPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistencePackage(PersistencePackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationPackage(ApplicationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIComponent(UIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultType(ResultType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationPackage(NavigationPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainGeneralization(DomainGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>UI Component Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>UI Component Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUIComponentField(UIComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagLib(TagLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Composition Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Composition Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationCompositionPart(NavigationCompositionPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Composition Whole</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Composition Whole</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationCompositionWhole(NavigationCompositionWhole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationProperty(NavigationProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultSet(ResultSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationConstraint(NavigationConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageConstraint(PageConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultConstraint(ResultConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Cosntraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Cosntraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodCosntraint(MethodCosntraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chaining Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chaining Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChainingConstraint(ChainingConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationGeneralization(NavigationGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainConstraints(DomainConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainProperty(DomainProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOGeneralization(DAOGeneralization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Lib</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Lib</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingLib(MappingLib object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMapping(ClassMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMapping(AttributeMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainGeneralizationSet(DomainGeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Framework Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameworkExtension(FrameworkExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagExtension(TagExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFramework(Framework object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerExtension(ControllerExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseController(Controller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerSet(ControllerSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultExtension(ResultExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Mapping Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Mapping Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMappingExtension(ClassMappingExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Mapping Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Mapping Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMappingExtension(AttributeMappingExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerExtensionEnd(ControllerExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagExtensionEnd(TagExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultExtensionEnd(ResultExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Mapping Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Mapping Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMappingExtensionEnd(ClassMappingExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Mapping Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Mapping Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMappingExtensionEnd(AttributeMappingExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Controller Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Controller Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControllerProperty(ControllerProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTagProperty(TagProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Result Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Result Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResultProperty(ResultProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Mapping Propery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Mapping Propery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMappingPropery(ClassMappingPropery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Mapping Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Mapping Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMappingProperty(AttributeMappingProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sevice Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sevice Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSeviceRealization(SeviceRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationExtension(NavigationExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainExtension(DomainExtension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationGeneralizationSet(NavigationGeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOGeneralizationSet(DAOGeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceGeneralizationSet(ServiceGeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EModel Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEModelElement(EModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamespace(Namespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameterable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterableElement(ParameterableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Packageable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackageableElement(PackageableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Templateable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTemplateableElement(TemplateableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePackage(org.eclipse.uml2.uml.Package object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModel(Model object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfile(Profile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Redefinable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRedefinableElement(RedefinableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassifier(Classifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRelationship(Relationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAssociation(Association object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFeature(Feature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedElement(TypedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicityElement(MultiplicityElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuralFeature(StructuralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connectable Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectableElement(ConnectableElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deployment Target</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeploymentTarget(DeploymentTarget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structured Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStructuredClassifier(StructuredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encapsulated Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncapsulatedClassifier(EncapsulatedClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behaviored Classifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioredClassifier(BehavioredClassifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClass(org.eclipse.uml2.uml.Class object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Directed Relationship</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDirectedRelationship(DirectedRelationship object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependency(Dependency object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstraction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstraction(Abstraction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRealization(Realization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface Realization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface Realization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterfaceRealization(InterfaceRealization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavioral Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBehavioralFeature(BehavioralFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralization(Generalization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stereotype</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStereotype(Stereotype object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstraint(Constraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalization Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralizationSet(GeneralizationSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtension(Extension object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Profile Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Profile Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfileApplication(ProfileApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extension End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extension End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensionEnd(ExtensionEnd object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FramewebSwitch

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
import org.eclipse.uml2.uml.Realization;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Relationship;
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
			case FramewebPackage.FRAMEWORK: {
				Framework framework = (Framework)theEObject;
				T result = caseFramework(framework);
				if (result == null) result = casePackage(framework);
				if (result == null) result = caseNamespace(framework);
				if (result == null) result = casePackageableElement(framework);
				if (result == null) result = caseTemplateableElement(framework);
				if (result == null) result = caseNamedElement(framework);
				if (result == null) result = caseParameterableElement(framework);
				if (result == null) result = caseElement(framework);
				if (result == null) result = caseEModelElement(framework);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_MODEL: {
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = caseFrameWebModel(domainModel);
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
				if (result == null) result = caseConstraint(frontControllerMethod);
				if (result == null) result = casePackageableElement(frontControllerMethod);
				if (result == null) result = caseNamedElement(frontControllerMethod);
				if (result == null) result = caseParameterableElement(frontControllerMethod);
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
			case FramewebPackage.SERVICE_NAVIGATION_ASSOCIATION: {
				ServiceNavigationAssociation serviceNavigationAssociation = (ServiceNavigationAssociation)theEObject;
				T result = caseServiceNavigationAssociation(serviceNavigationAssociation);
				if (result == null) result = caseServiceAssociation(serviceNavigationAssociation);
				if (result == null) result = caseAssociation(serviceNavigationAssociation);
				if (result == null) result = caseClassifier(serviceNavigationAssociation);
				if (result == null) result = caseRelationship(serviceNavigationAssociation);
				if (result == null) result = caseNamespace(serviceNavigationAssociation);
				if (result == null) result = caseRedefinableElement(serviceNavigationAssociation);
				if (result == null) result = caseType(serviceNavigationAssociation);
				if (result == null) result = caseTemplateableElement(serviceNavigationAssociation);
				if (result == null) result = casePackageableElement(serviceNavigationAssociation);
				if (result == null) result = caseNamedElement(serviceNavigationAssociation);
				if (result == null) result = caseParameterableElement(serviceNavigationAssociation);
				if (result == null) result = caseElement(serviceNavigationAssociation);
				if (result == null) result = caseEModelElement(serviceNavigationAssociation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_CLASS: {
				ClassMappingKind domainClass = (ClassMappingKind)theEObject;
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
			case FramewebPackage.CONSTANT_NAME: {
				ConstantName constantName = (ConstantName)theEObject;
				T result = caseConstantName(constantName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_TABLE_NAME: {
				DomainTableName domainTableName = (DomainTableName)theEObject;
				T result = caseDomainTableName(domainTableName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FRAME_WORK_NAME: {
				FrameWorkName frameWorkName = (FrameWorkName)theEObject;
				T result = caseFrameWorkName(frameWorkName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_COLUMN_NAME: {
				DomainColumnName domainColumnName = (DomainColumnName)theEObject;
				T result = caseDomainColumnName(domainColumnName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_INTERFACE_NAME: {
				DAOInterfaceName daoInterfaceName = (DAOInterfaceName)theEObject;
				T result = caseDAOInterfaceName(daoInterfaceName);
				if (result == null) result = caseConstantName(daoInterfaceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_CLASS_NAME: {
				DAOClassName daoClassName = (DAOClassName)theEObject;
				T result = caseDAOClassName(daoClassName);
				if (result == null) result = caseDAOInterfaceName(daoClassName);
				if (result == null) result = caseConstantName(daoClassName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT: {
				ResultType result = (ResultType)theEObject;
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
			case FramewebPackage.SERVICE_OPERATION: {
				ServiceOperation serviceOperation = (ServiceOperation)theEObject;
				T result = caseServiceOperation(serviceOperation);
				if (result == null) result = caseOperation(serviceOperation);
				if (result == null) result = caseBehavioralFeature(serviceOperation);
				if (result == null) result = caseParameterableElement(serviceOperation);
				if (result == null) result = caseTemplateableElement(serviceOperation);
				if (result == null) result = caseNamespace(serviceOperation);
				if (result == null) result = caseFeature(serviceOperation);
				if (result == null) result = caseRedefinableElement(serviceOperation);
				if (result == null) result = caseNamedElement(serviceOperation);
				if (result == null) result = caseElement(serviceOperation);
				if (result == null) result = caseEModelElement(serviceOperation);
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
				Tag uiComponent = (Tag)theEObject;
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
				if (result == null) result = caseAssociation(domainGeneralization);
				if (result == null) result = caseClassifier(domainGeneralization);
				if (result == null) result = caseRelationship(domainGeneralization);
				if (result == null) result = caseNamespace(domainGeneralization);
				if (result == null) result = caseRedefinableElement(domainGeneralization);
				if (result == null) result = caseType(domainGeneralization);
				if (result == null) result = caseTemplateableElement(domainGeneralization);
				if (result == null) result = casePackageableElement(domainGeneralization);
				if (result == null) result = caseNamedElement(domainGeneralization);
				if (result == null) result = caseParameterableElement(domainGeneralization);
				if (result == null) result = caseElement(domainGeneralization);
				if (result == null) result = caseEModelElement(domainGeneralization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.JQUERY: {
				JQuery jQuery = (JQuery)theEObject;
				T result = caseJQuery(jQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.UI_COMPONENT_FIELD: {
				Tag uiComponentField = (Tag)theEObject;
				T result = caseUIComponentField(uiComponentField);
				if (result == null) result = caseNavigationAttribute(uiComponentField);
				if (result == null) result = caseProperty(uiComponentField);
				if (result == null) result = caseStructuralFeature(uiComponentField);
				if (result == null) result = caseConnectableElement(uiComponentField);
				if (result == null) result = caseDeploymentTarget(uiComponentField);
				if (result == null) result = caseFeature(uiComponentField);
				if (result == null) result = caseTypedElement(uiComponentField);
				if (result == null) result = caseMultiplicityElement(uiComponentField);
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
			case FramewebPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
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
			case FramewebPackage.ANOTATION: {
				Anotation anotation = (Anotation)theEObject;
				T result = caseAnotation(anotation);
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
			case FramewebPackage.MAPPING_SET: {
				MappingSet mappingSet = (MappingSet)theEObject;
				T result = caseMappingSet(mappingSet);
				if (result == null) result = casePackage(mappingSet);
				if (result == null) result = caseNamespace(mappingSet);
				if (result == null) result = casePackageableElement(mappingSet);
				if (result == null) result = caseTemplateableElement(mappingSet);
				if (result == null) result = caseNamedElement(mappingSet);
				if (result == null) result = caseParameterableElement(mappingSet);
				if (result == null) result = caseElement(mappingSet);
				if (result == null) result = caseEModelElement(mappingSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CLASS_MAPPING_KIND: {
				ClassMappingKind classMappingKind = (ClassMappingKind)theEObject;
				T result = caseClassMappingKind(classMappingKind);
				if (result == null) result = caseClass(classMappingKind);
				if (result == null) result = caseEncapsulatedClassifier(classMappingKind);
				if (result == null) result = caseBehavioredClassifier(classMappingKind);
				if (result == null) result = caseStructuredClassifier(classMappingKind);
				if (result == null) result = caseClassifier(classMappingKind);
				if (result == null) result = caseNamespace(classMappingKind);
				if (result == null) result = caseRedefinableElement(classMappingKind);
				if (result == null) result = caseType(classMappingKind);
				if (result == null) result = caseTemplateableElement(classMappingKind);
				if (result == null) result = casePackageableElement(classMappingKind);
				if (result == null) result = caseNamedElement(classMappingKind);
				if (result == null) result = caseParameterableElement(classMappingKind);
				if (result == null) result = caseElement(classMappingKind);
				if (result == null) result = caseEModelElement(classMappingKind);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.ATTRIBUTE_MAPPING_KIND: {
				AttributeMappingKind attributeMappingKind = (AttributeMappingKind)theEObject;
				T result = caseAttributeMappingKind(attributeMappingKind);
				if (result == null) result = caseClass(attributeMappingKind);
				if (result == null) result = caseEncapsulatedClassifier(attributeMappingKind);
				if (result == null) result = caseBehavioredClassifier(attributeMappingKind);
				if (result == null) result = caseStructuredClassifier(attributeMappingKind);
				if (result == null) result = caseClassifier(attributeMappingKind);
				if (result == null) result = caseNamespace(attributeMappingKind);
				if (result == null) result = caseRedefinableElement(attributeMappingKind);
				if (result == null) result = caseType(attributeMappingKind);
				if (result == null) result = caseTemplateableElement(attributeMappingKind);
				if (result == null) result = casePackageableElement(attributeMappingKind);
				if (result == null) result = caseNamedElement(attributeMappingKind);
				if (result == null) result = caseParameterableElement(attributeMappingKind);
				if (result == null) result = caseElement(attributeMappingKind);
				if (result == null) result = caseEModelElement(attributeMappingKind);
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Navigation Association</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Navigation Association</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceNavigationAssociation(ServiceNavigationAssociation object) {
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
	public T caseDomainClass(ClassMappingKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstantName(ConstantName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Table Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Table Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainTableName(DomainTableName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Work Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Work Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameWorkName(FrameWorkName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Column Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Column Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainColumnName(DomainColumnName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Interface Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Interface Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOInterfaceName(DAOInterfaceName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAO Class Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Class Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOClassName(DAOClassName object) {
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
	public T caseResult(ResultType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Service Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOperation(ServiceOperation object) {
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
	public T caseUIComponent(Tag object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>JQuery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JQuery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJQuery(JQuery object) {
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
	public T caseUIComponentField(Tag object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Anotation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anotation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnotation(Anotation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mapping Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapping Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappingSet(MappingSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Mapping Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Mapping Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassMappingKind(ClassMappingKind object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attribute Mapping Kind</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attribute Mapping Kind</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributeMappingKind(AttributeMappingKind object) {
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

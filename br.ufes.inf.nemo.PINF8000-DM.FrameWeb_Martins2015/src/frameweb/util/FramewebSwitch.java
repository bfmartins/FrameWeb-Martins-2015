/**
 */
package frameweb.util;

import frameweb.*;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
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
			case FramewebPackage.MAPPED_CLASS: {
				MappedClass mappedClass = (MappedClass)theEObject;
				T result = caseMappedClass(mappedClass);
				if (result == null) result = caseDomainClass(mappedClass);
				if (result == null) result = caseClass(mappedClass);
				if (result == null) result = caseEncapsulatedClassifier(mappedClass);
				if (result == null) result = caseBehavioredClassifier(mappedClass);
				if (result == null) result = caseStructuredClassifier(mappedClass);
				if (result == null) result = caseClassifier(mappedClass);
				if (result == null) result = caseNamespace(mappedClass);
				if (result == null) result = caseRedefinableElement(mappedClass);
				if (result == null) result = caseType(mappedClass);
				if (result == null) result = caseTemplateableElement(mappedClass);
				if (result == null) result = casePackageableElement(mappedClass);
				if (result == null) result = caseNamedElement(mappedClass);
				if (result == null) result = caseParameterableElement(mappedClass);
				if (result == null) result = caseElement(mappedClass);
				if (result == null) result = caseEModelElement(mappedClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.PERSISTENT_CLASS: {
				PersistentClass persistentClass = (PersistentClass)theEObject;
				T result = casePersistentClass(persistentClass);
				if (result == null) result = caseDomainClass(persistentClass);
				if (result == null) result = caseClass(persistentClass);
				if (result == null) result = caseEncapsulatedClassifier(persistentClass);
				if (result == null) result = caseBehavioredClassifier(persistentClass);
				if (result == null) result = caseStructuredClassifier(persistentClass);
				if (result == null) result = caseClassifier(persistentClass);
				if (result == null) result = caseNamespace(persistentClass);
				if (result == null) result = caseRedefinableElement(persistentClass);
				if (result == null) result = caseType(persistentClass);
				if (result == null) result = caseTemplateableElement(persistentClass);
				if (result == null) result = casePackageableElement(persistentClass);
				if (result == null) result = caseNamedElement(persistentClass);
				if (result == null) result = caseParameterableElement(persistentClass);
				if (result == null) result = caseElement(persistentClass);
				if (result == null) result = caseEModelElement(persistentClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.TRANSIENT_CLASS: {
				TransientClass transientClass = (TransientClass)theEObject;
				T result = caseTransientClass(transientClass);
				if (result == null) result = caseDomainClass(transientClass);
				if (result == null) result = caseClass(transientClass);
				if (result == null) result = caseEncapsulatedClassifier(transientClass);
				if (result == null) result = caseBehavioredClassifier(transientClass);
				if (result == null) result = caseStructuredClassifier(transientClass);
				if (result == null) result = caseClassifier(transientClass);
				if (result == null) result = caseNamespace(transientClass);
				if (result == null) result = caseRedefinableElement(transientClass);
				if (result == null) result = caseType(transientClass);
				if (result == null) result = caseTemplateableElement(transientClass);
				if (result == null) result = casePackageableElement(transientClass);
				if (result == null) result = caseNamedElement(transientClass);
				if (result == null) result = caseParameterableElement(transientClass);
				if (result == null) result = caseElement(transientClass);
				if (result == null) result = caseEModelElement(transientClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
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
			case FramewebPackage.FORM: {
				Form form = (Form)theEObject;
				T result = caseForm(form);
				if (result == null) result = caseNavigationClass(form);
				if (result == null) result = caseTag(form);
				if (result == null) result = caseClass(form);
				if (result == null) result = caseEncapsulatedClassifier(form);
				if (result == null) result = caseBehavioredClassifier(form);
				if (result == null) result = caseStructuredClassifier(form);
				if (result == null) result = caseClassifier(form);
				if (result == null) result = caseNamespace(form);
				if (result == null) result = caseRedefinableElement(form);
				if (result == null) result = caseType(form);
				if (result == null) result = caseTemplateableElement(form);
				if (result == null) result = casePackageableElement(form);
				if (result == null) result = caseNamedElement(form);
				if (result == null) result = caseParameterableElement(form);
				if (result == null) result = caseElement(form);
				if (result == null) result = caseEModelElement(form);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.BINARY: {
				Binary binary = (Binary)theEObject;
				T result = caseBinary(binary);
				if (result == null) result = caseNavigationClass(binary);
				if (result == null) result = caseClass(binary);
				if (result == null) result = caseEncapsulatedClassifier(binary);
				if (result == null) result = caseBehavioredClassifier(binary);
				if (result == null) result = caseStructuredClassifier(binary);
				if (result == null) result = caseClassifier(binary);
				if (result == null) result = caseNamespace(binary);
				if (result == null) result = caseRedefinableElement(binary);
				if (result == null) result = caseType(binary);
				if (result == null) result = caseTemplateableElement(binary);
				if (result == null) result = casePackageableElement(binary);
				if (result == null) result = caseNamedElement(binary);
				if (result == null) result = caseParameterableElement(binary);
				if (result == null) result = caseElement(binary);
				if (result == null) result = caseEModelElement(binary);
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
			case FramewebPackage.USER_VIEW_ATTRIBUTE: {
				UserViewAttribute userViewAttribute = (UserViewAttribute)theEObject;
				T result = caseUserViewAttribute(userViewAttribute);
				if (result == null) result = caseNavigationAttribute(userViewAttribute);
				if (result == null) result = caseProperty(userViewAttribute);
				if (result == null) result = caseStructuralFeature(userViewAttribute);
				if (result == null) result = caseConnectableElement(userViewAttribute);
				if (result == null) result = caseDeploymentTarget(userViewAttribute);
				if (result == null) result = caseFeature(userViewAttribute);
				if (result == null) result = caseTypedElement(userViewAttribute);
				if (result == null) result = caseMultiplicityElement(userViewAttribute);
				if (result == null) result = caseParameterableElement(userViewAttribute);
				if (result == null) result = caseRedefinableElement(userViewAttribute);
				if (result == null) result = caseNamedElement(userViewAttribute);
				if (result == null) result = caseElement(userViewAttribute);
				if (result == null) result = caseEModelElement(userViewAttribute);
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
			case FramewebPackage.DAO_BASE_OPERATION: {
				DAOBaseOperation daoBaseOperation = (DAOBaseOperation)theEObject;
				T result = caseDAOBaseOperation(daoBaseOperation);
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
			case FramewebPackage.NAVIGATION_COMPOSITION: {
				NavigationComposition navigationComposition = (NavigationComposition)theEObject;
				T result = caseNavigationComposition(navigationComposition);
				if (result == null) result = caseAssociation(navigationComposition);
				if (result == null) result = caseClassifier(navigationComposition);
				if (result == null) result = caseRelationship(navigationComposition);
				if (result == null) result = caseNamespace(navigationComposition);
				if (result == null) result = caseRedefinableElement(navigationComposition);
				if (result == null) result = caseType(navigationComposition);
				if (result == null) result = caseTemplateableElement(navigationComposition);
				if (result == null) result = casePackageableElement(navigationComposition);
				if (result == null) result = caseNamedElement(navigationComposition);
				if (result == null) result = caseParameterableElement(navigationComposition);
				if (result == null) result = caseElement(navigationComposition);
				if (result == null) result = caseEModelElement(navigationComposition);
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
			case FramewebPackage.NAMING_METHOD: {
				NamingMethod namingMethod = (NamingMethod)theEObject;
				T result = caseNamingMethod(namingMethod);
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
			case FramewebPackage.FRAME_WEB_NAME: {
				FrameWebName frameWebName = (FrameWebName)theEObject;
				T result = caseFrameWebName(frameWebName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.BINARY_ATTRIBUTE: {
				BinaryAttribute binaryAttribute = (BinaryAttribute)theEObject;
				T result = caseBinaryAttribute(binaryAttribute);
				if (result == null) result = caseNavigationAttribute(binaryAttribute);
				if (result == null) result = caseProperty(binaryAttribute);
				if (result == null) result = caseStructuralFeature(binaryAttribute);
				if (result == null) result = caseConnectableElement(binaryAttribute);
				if (result == null) result = caseDeploymentTarget(binaryAttribute);
				if (result == null) result = caseFeature(binaryAttribute);
				if (result == null) result = caseTypedElement(binaryAttribute);
				if (result == null) result = caseMultiplicityElement(binaryAttribute);
				if (result == null) result = caseParameterableElement(binaryAttribute);
				if (result == null) result = caseRedefinableElement(binaryAttribute);
				if (result == null) result = caseNamedElement(binaryAttribute);
				if (result == null) result = caseElement(binaryAttribute);
				if (result == null) result = caseEModelElement(binaryAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.CONSTANT_NAME: {
				ConstantName constantName = (ConstantName)theEObject;
				T result = caseConstantName(constantName);
				if (result == null) result = caseFrameWebName(constantName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_TABLE_NAME: {
				DomainTableName domainTableName = (DomainTableName)theEObject;
				T result = caseDomainTableName(domainTableName);
				if (result == null) result = caseFrameWebName(domainTableName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FRAME_WORK_NAME: {
				FrameWorkName frameWorkName = (FrameWorkName)theEObject;
				T result = caseFrameWorkName(frameWorkName);
				if (result == null) result = caseFrameWebName(frameWorkName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DOMAIN_COLUMN_NAME: {
				DomainColumnName domainColumnName = (DomainColumnName)theEObject;
				T result = caseDomainColumnName(domainColumnName);
				if (result == null) result = caseFrameWebName(domainColumnName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_INTERFACE_NAME: {
				DAOInterfaceName daoInterfaceName = (DAOInterfaceName)theEObject;
				T result = caseDAOInterfaceName(daoInterfaceName);
				if (result == null) result = caseConstantName(daoInterfaceName);
				if (result == null) result = caseFrameWebName(daoInterfaceName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.DAO_CLASS_NAME: {
				DAOClassName daoClassName = (DAOClassName)theEObject;
				T result = caseDAOClassName(daoClassName);
				if (result == null) result = caseDAOInterfaceName(daoClassName);
				if (result == null) result = caseConstantName(daoClassName);
				if (result == null) result = caseFrameWebName(daoClassName);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT: {
				Result result = (Result)theEObject;
				T theResult = caseResult(result);
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
			case FramewebPackage.DOMAIN_OPERATION: {
				DomainOperation domainOperation = (DomainOperation)theEObject;
				T result = caseDomainOperation(domainOperation);
				if (result == null) result = caseOperation(domainOperation);
				if (result == null) result = caseBehavioralFeature(domainOperation);
				if (result == null) result = caseParameterableElement(domainOperation);
				if (result == null) result = caseTemplateableElement(domainOperation);
				if (result == null) result = caseNamespace(domainOperation);
				if (result == null) result = caseFeature(domainOperation);
				if (result == null) result = caseRedefinableElement(domainOperation);
				if (result == null) result = caseNamedElement(domainOperation);
				if (result == null) result = caseElement(domainOperation);
				if (result == null) result = caseEModelElement(domainOperation);
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
			case FramewebPackage.DAO_OPERATION: {
				DAOOperation daoOperation = (DAOOperation)theEObject;
				T result = caseDAOOperation(daoOperation);
				if (result == null) result = caseOperation(daoOperation);
				if (result == null) result = caseBehavioralFeature(daoOperation);
				if (result == null) result = caseParameterableElement(daoOperation);
				if (result == null) result = caseTemplateableElement(daoOperation);
				if (result == null) result = caseNamespace(daoOperation);
				if (result == null) result = caseFeature(daoOperation);
				if (result == null) result = caseRedefinableElement(daoOperation);
				if (result == null) result = caseNamedElement(daoOperation);
				if (result == null) result = caseElement(daoOperation);
				if (result == null) result = caseEModelElement(daoOperation);
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
			case FramewebPackage.COMPONENT: {
				Component component = (Component)theEObject;
				T result = caseComponent(component);
				if (result == null) result = caseNavigationClass(component);
				if (result == null) result = caseClass(component);
				if (result == null) result = caseEncapsulatedClassifier(component);
				if (result == null) result = caseBehavioredClassifier(component);
				if (result == null) result = caseStructuredClassifier(component);
				if (result == null) result = caseClassifier(component);
				if (result == null) result = caseNamespace(component);
				if (result == null) result = caseRedefinableElement(component);
				if (result == null) result = caseType(component);
				if (result == null) result = caseTemplateableElement(component);
				if (result == null) result = casePackageableElement(component);
				if (result == null) result = caseNamedElement(component);
				if (result == null) result = caseParameterableElement(component);
				if (result == null) result = caseElement(component);
				if (result == null) result = caseEModelElement(component);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.RESULT_TYPE: {
				ResultType resultType = (ResultType)theEObject;
				T result = caseResultType(resultType);
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
			case FramewebPackage.JQUERY: {
				JQuery jQuery = (JQuery)theEObject;
				T result = caseJQuery(jQuery);
				if (result == null) result = caseNavigationClass(jQuery);
				if (result == null) result = caseClass(jQuery);
				if (result == null) result = caseEncapsulatedClassifier(jQuery);
				if (result == null) result = caseBehavioredClassifier(jQuery);
				if (result == null) result = caseStructuredClassifier(jQuery);
				if (result == null) result = caseClassifier(jQuery);
				if (result == null) result = caseNamespace(jQuery);
				if (result == null) result = caseRedefinableElement(jQuery);
				if (result == null) result = caseType(jQuery);
				if (result == null) result = caseTemplateableElement(jQuery);
				if (result == null) result = casePackageableElement(jQuery);
				if (result == null) result = caseNamedElement(jQuery);
				if (result == null) result = caseParameterableElement(jQuery);
				if (result == null) result = caseElement(jQuery);
				if (result == null) result = caseEModelElement(jQuery);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FramewebPackage.FORM_COMPONENT: {
				FormComponent formComponent = (FormComponent)theEObject;
				T result = caseFormComponent(formComponent);
				if (result == null) result = caseNavigationAttribute(formComponent);
				if (result == null) result = caseFrameworkTag(formComponent);
				if (result == null) result = caseProperty(formComponent);
				if (result == null) result = caseTag(formComponent);
				if (result == null) result = caseStructuralFeature(formComponent);
				if (result == null) result = caseConnectableElement(formComponent);
				if (result == null) result = caseDeploymentTarget(formComponent);
				if (result == null) result = caseClass(formComponent);
				if (result == null) result = caseFeature(formComponent);
				if (result == null) result = caseTypedElement(formComponent);
				if (result == null) result = caseMultiplicityElement(formComponent);
				if (result == null) result = caseEncapsulatedClassifier(formComponent);
				if (result == null) result = caseBehavioredClassifier(formComponent);
				if (result == null) result = caseStructuredClassifier(formComponent);
				if (result == null) result = caseClassifier(formComponent);
				if (result == null) result = caseRedefinableElement(formComponent);
				if (result == null) result = caseNamespace(formComponent);
				if (result == null) result = caseType(formComponent);
				if (result == null) result = caseTemplateableElement(formComponent);
				if (result == null) result = caseElement(formComponent);
				if (result == null) result = caseEModelElement(formComponent);
				if (result == null) result = casePackageableElement(formComponent);
				if (result == null) result = caseNamedElement(formComponent);
				if (result == null) result = caseParameterableElement(formComponent);
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
			case FramewebPackage.FRAMEWORK_TAG: {
				FrameworkTag frameworkTag = (FrameworkTag)theEObject;
				T result = caseFrameworkTag(frameworkTag);
				if (result == null) result = caseTag(frameworkTag);
				if (result == null) result = caseClass(frameworkTag);
				if (result == null) result = caseEncapsulatedClassifier(frameworkTag);
				if (result == null) result = caseBehavioredClassifier(frameworkTag);
				if (result == null) result = caseStructuredClassifier(frameworkTag);
				if (result == null) result = caseClassifier(frameworkTag);
				if (result == null) result = caseNamespace(frameworkTag);
				if (result == null) result = caseRedefinableElement(frameworkTag);
				if (result == null) result = caseType(frameworkTag);
				if (result == null) result = caseTemplateableElement(frameworkTag);
				if (result == null) result = casePackageableElement(frameworkTag);
				if (result == null) result = caseNamedElement(frameworkTag);
				if (result == null) result = caseParameterableElement(frameworkTag);
				if (result == null) result = caseElement(frameworkTag);
				if (result == null) result = caseEModelElement(frameworkTag);
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
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mapped Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mapped Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMappedClass(MappedClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistent Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistent Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersistentClass(PersistentClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transient Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transient Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransientClass(TransientClass object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForm(Form object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinary(Binary object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>User View Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User View Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserViewAttribute(UserViewAttribute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DAO Base Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Base Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOBaseOperation(DAOBaseOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Navigation Composition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigation Composition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigationComposition(NavigationComposition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Naming Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Naming Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamingMethod(NamingMethod object) {
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
	public T caseDomainClass(DomainClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Frame Web Name</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Frame Web Name</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameWebName(FrameWebName object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBinaryAttribute(BinaryAttribute object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Domain Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainOperation(DomainOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>DAO Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAO Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDAOOperation(DAOOperation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponent(Component object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Form Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormComponent(FormComponent object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Framework Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Framework Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFrameworkTag(FrameworkTag object) {
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

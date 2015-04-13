/**
 */
package uml2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.Classifier;
import uml2.CollaborationUse;
import uml2.Feature;
import uml2.Generalization;
import uml2.GeneralizationSet;
import uml2.NamedElement;
import uml2.PackageableElement;
import uml2.ParameterableElement;
import uml2.Property;
import uml2.RedefinableElement;
import uml2.Substitution;
import uml2.TemplateBinding;
import uml2.TemplateParameter;
import uml2.TemplateSignature;
import uml2.TemplateableElement;
import uml2.Type;
import uml2.Uml2Package;
import uml2.UseCase;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.ClassifierImpl#getIsLeaf <em>Is Leaf</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getRedefinedElement <em>Redefined Element</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getRedefinitionContext <em>Redefinition Context</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getPackage <em>Package</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getCollaborationUse <em>Collaboration Use</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getGeneralization <em>Generalization</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getPowertypeExtent <em>Powertype Extent</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getInheritedMember <em>Inherited Member</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getIsFinalSpecialization <em>Is Final Specialization</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getOwnedUseCase <em>Owned Use Case</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getUseCase <em>Use Case</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getRedefinedClassifier <em>Redefined Classifier</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link uml2.impl.ClassifierImpl#getSubstitution <em>Substitution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ClassifierImpl extends NamespaceImpl implements Classifier {
	/**
	 * The default value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_LEAF_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsLeaf() <em>Is Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsLeaf()
	 * @generated
	 * @ordered
	 */
	protected Boolean isLeaf = IS_LEAF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTemplateParameter() <em>Template Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateParameter()
	 * @generated
	 * @ordered
	 */
	protected TemplateParameter templateParameter;

	/**
	 * The cached value of the '{@link #getTemplateBinding() <em>Template Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<TemplateBinding> templateBinding;

	/**
	 * The cached value of the '{@link #getOwnedTemplateSignature() <em>Owned Template Signature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTemplateSignature()
	 * @generated
	 * @ordered
	 */
	protected TemplateSignature ownedTemplateSignature;

	/**
	 * The cached value of the '{@link #getCollaborationUse() <em>Collaboration Use</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollaborationUse()
	 * @generated
	 * @ordered
	 */
	protected EList<CollaborationUse> collaborationUse;

	/**
	 * The cached value of the '{@link #getGeneralization() <em>Generalization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> generalization;

	/**
	 * The cached value of the '{@link #getPowertypeExtent() <em>Powertype Extent</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowertypeExtent()
	 * @generated
	 * @ordered
	 */
	protected EList<GeneralizationSet> powertypeExtent;

	/**
	 * The default value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_ABSTRACT_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected Boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_FINAL_SPECIALIZATION_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsFinalSpecialization() <em>Is Final Specialization</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsFinalSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Boolean isFinalSpecialization = IS_FINAL_SPECIALIZATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedUseCase() <em>Owned Use Case</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> ownedUseCase;

	/**
	 * The cached value of the '{@link #getUseCase() <em>Use Case</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCase()
	 * @generated
	 * @ordered
	 */
	protected EList<UseCase> useCase;

	/**
	 * The cached value of the '{@link #getRedefinedClassifier() <em>Redefined Classifier</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedefinedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> redefinedClassifier;

	/**
	 * The cached value of the '{@link #getRepresentation() <em>Representation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepresentation()
	 * @generated
	 * @ordered
	 */
	protected CollaborationUse representation;

	/**
	 * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitution()
	 * @generated
	 * @ordered
	 */
	protected EList<Substitution> substitution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.CLASSIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsLeaf() {
		return isLeaf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsLeaf(Boolean newIsLeaf) {
		Boolean oldIsLeaf = isLeaf;
		isLeaf = newIsLeaf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__IS_LEAF, oldIsLeaf, isLeaf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RedefinableElement> getRedefinedElement() {
		// TODO: implement this method to return the 'Redefined Element' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinitionContext() {
		// TODO: implement this method to return the 'Redefinition Context' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
			if (EcoreUtil.isAncestor(this, newOwningTemplateParameter))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningTemplateParameter != null)
				msgs = ((InternalEObject)newOwningTemplateParameter).eInverseAdd(this, Uml2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetOwningTemplateParameter(newOwningTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getTemplateParameter() {
		if (templateParameter != null && templateParameter.eIsProxy()) {
			InternalEObject oldTemplateParameter = (InternalEObject)templateParameter;
			templateParameter = (TemplateParameter)eResolveProxy(oldTemplateParameter);
			if (templateParameter != oldTemplateParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
			}
		}
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter basicGetTemplateParameter() {
		return templateParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateParameter(TemplateParameter newTemplateParameter, NotificationChain msgs) {
		TemplateParameter oldTemplateParameter = templateParameter;
		templateParameter = newTemplateParameter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateParameter(TemplateParameter newTemplateParameter) {
		if (newTemplateParameter != templateParameter) {
			NotificationChain msgs = null;
			if (templateParameter != null)
				msgs = ((InternalEObject)templateParameter).eInverseRemove(this, Uml2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			if (newTemplateParameter != null)
				msgs = ((InternalEObject)newTemplateParameter).eInverseAdd(this, Uml2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
			msgs = basicSetTemplateParameter(newTemplateParameter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2.Package getPackage() {
		uml2.Package package_ = basicGetPackage();
		return package_ != null && package_.eIsProxy() ? (uml2.Package)eResolveProxy((InternalEObject)package_) : package_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2.Package basicGetPackage() {
		// TODO: implement this method to return the 'Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackage(uml2.Package newPackage) {
		// TODO: implement this method to set the 'Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, Uml2Package.CLASSIFIER__TEMPLATE_BINDING, Uml2Package.TEMPLATE_BINDING__BOUND_ELEMENT);
		}
		return templateBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateSignature getOwnedTemplateSignature() {
		return ownedTemplateSignature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature, NotificationChain msgs) {
		TemplateSignature oldOwnedTemplateSignature = ownedTemplateSignature;
		ownedTemplateSignature = newOwnedTemplateSignature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedTemplateSignature(TemplateSignature newOwnedTemplateSignature) {
		if (newOwnedTemplateSignature != ownedTemplateSignature) {
			NotificationChain msgs = null;
			if (ownedTemplateSignature != null)
				msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, Uml2Package.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			if (newOwnedTemplateSignature != null)
				msgs = ((InternalEObject)newOwnedTemplateSignature).eInverseAdd(this, Uml2Package.TEMPLATE_SIGNATURE__TEMPLATE, TemplateSignature.class, msgs);
			msgs = basicSetOwnedTemplateSignature(newOwnedTemplateSignature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getAttribute() {
		// TODO: implement this method to return the 'Attribute' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		// TODO: implement this method to return the 'Feature' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CollaborationUse> getCollaborationUse() {
		if (collaborationUse == null) {
			collaborationUse = new EObjectContainmentEList<CollaborationUse>(CollaborationUse.class, this, Uml2Package.CLASSIFIER__COLLABORATION_USE);
		}
		return collaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getGeneral() {
		// TODO: implement this method to return the 'General' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getGeneralization() {
		if (generalization == null) {
			generalization = new EObjectContainmentWithInverseEList<Generalization>(Generalization.class, this, Uml2Package.CLASSIFIER__GENERALIZATION, Uml2Package.GENERALIZATION__SPECIFIC);
		}
		return generalization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GeneralizationSet> getPowertypeExtent() {
		if (powertypeExtent == null) {
			powertypeExtent = new EObjectWithInverseResolvingEList<GeneralizationSet>(GeneralizationSet.class, this, Uml2Package.CLASSIFIER__POWERTYPE_EXTENT, Uml2Package.GENERALIZATION_SET__POWERTYPE);
		}
		return powertypeExtent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> getInheritedMember() {
		// TODO: implement this method to return the 'Inherited Member' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(Boolean newIsAbstract) {
		Boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsFinalSpecialization() {
		return isFinalSpecialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFinalSpecialization(Boolean newIsFinalSpecialization) {
		Boolean oldIsFinalSpecialization = isFinalSpecialization;
		isFinalSpecialization = newIsFinalSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__IS_FINAL_SPECIALIZATION, oldIsFinalSpecialization, isFinalSpecialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getOwnedUseCase() {
		if (ownedUseCase == null) {
			ownedUseCase = new EObjectContainmentEList<UseCase>(UseCase.class, this, Uml2Package.CLASSIFIER__OWNED_USE_CASE);
		}
		return ownedUseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UseCase> getUseCase() {
		if (useCase == null) {
			useCase = new EObjectWithInverseResolvingEList.ManyInverse<UseCase>(UseCase.class, this, Uml2Package.CLASSIFIER__USE_CASE, Uml2Package.USE_CASE__SUBJECT);
		}
		return useCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getRedefinedClassifier() {
		if (redefinedClassifier == null) {
			redefinedClassifier = new EObjectResolvingEList<Classifier>(Classifier.class, this, Uml2Package.CLASSIFIER__REDEFINED_CLASSIFIER);
		}
		return redefinedClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse getRepresentation() {
		if (representation != null && representation.eIsProxy()) {
			InternalEObject oldRepresentation = (InternalEObject)representation;
			representation = (CollaborationUse)eResolveProxy(oldRepresentation);
			if (representation != oldRepresentation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
			}
		}
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollaborationUse basicGetRepresentation() {
		return representation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepresentation(CollaborationUse newRepresentation) {
		CollaborationUse oldRepresentation = representation;
		representation = newRepresentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.CLASSIFIER__REPRESENTATION, oldRepresentation, representation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Substitution> getSubstitution() {
		if (substitution == null) {
			substitution = new EObjectContainmentWithInverseEList<Substitution>(Substitution.class, this, Uml2Package.CLASSIFIER__SUBSTITUTION, Uml2Package.SUBSTITUTION__SUBSTITUTING_CLASSIFIER);
		}
		return substitution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean noCyclesInGeneralization(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CLASSIFIER__NO_CYCLES_IN_GENERALIZATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "noCyclesInGeneralization", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean specializeType(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CLASSIFIER__SPECIALIZE_TYPE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "specializeType", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean nonFinalParents(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CLASSIFIER__NON_FINAL_PARENTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nonFinalParents", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean mapsToGeneralizationSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.CLASSIFIER__MAPS_TO_GENERALIZATION_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "mapsToGeneralizationSet", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public EList<Feature> allFeatures() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> allParents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean conformsTo(Classifier other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> general() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean hasVisibilityOf(NamedElement n) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inherit(EList<NamedElement> inhs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inheritableMembers(Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NamedElement> inheritedMember() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean maySpecializeType(Classifier c) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> parents() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isTemplate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParameterableElement> parameterableElements() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean conformsTo(Type other) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isCompatibleWith(ParameterableElement p) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isTemplateParameter() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean nonLeafRedefinition(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.REDEFINABLE_ELEMENT__NON_LEAF_REDEFINITION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "nonLeafRedefinition", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean redefinitionContextValid(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT_VALID,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "redefinitionContextValid", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public boolean redefinitionConsistent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Uml2Validator.DIAGNOSTIC_SOURCE,
						 Uml2Validator.REDEFINABLE_ELEMENT__REDEFINITION_CONSISTENT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "redefinitionConsistent", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
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
	public Boolean isConsistentWith(RedefinableElement redefinee) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean isRedefinitionContextValid(RedefinableElement redefined) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
			case Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, Uml2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case Uml2Package.CLASSIFIER__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case Uml2Package.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGeneralization()).basicAdd(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPowertypeExtent()).basicAdd(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__USE_CASE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUseCase()).basicAdd(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubstitution()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case Uml2Package.CLASSIFIER__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case Uml2Package.CLASSIFIER__COLLABORATION_USE:
				return ((InternalEList<?>)getCollaborationUse()).basicRemove(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__GENERALIZATION:
				return ((InternalEList<?>)getGeneralization()).basicRemove(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__POWERTYPE_EXTENT:
				return ((InternalEList<?>)getPowertypeExtent()).basicRemove(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__OWNED_USE_CASE:
				return ((InternalEList<?>)getOwnedUseCase()).basicRemove(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__USE_CASE:
				return ((InternalEList<?>)getUseCase()).basicRemove(otherEnd, msgs);
			case Uml2Package.CLASSIFIER__SUBSTITUTION:
				return ((InternalEList<?>)getSubstitution()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return eInternalContainer().eInverseRemove(this, Uml2Package.TEMPLATE_PARAMETER__OWNED_PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Uml2Package.CLASSIFIER__IS_LEAF:
				return getIsLeaf();
			case Uml2Package.CLASSIFIER__REDEFINED_ELEMENT:
				return getRedefinedElement();
			case Uml2Package.CLASSIFIER__REDEFINITION_CONTEXT:
				return getRedefinitionContext();
			case Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case Uml2Package.CLASSIFIER__PACKAGE:
				if (resolve) return getPackage();
				return basicGetPackage();
			case Uml2Package.CLASSIFIER__TEMPLATE_BINDING:
				return getTemplateBinding();
			case Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case Uml2Package.CLASSIFIER__ATTRIBUTE:
				return getAttribute();
			case Uml2Package.CLASSIFIER__FEATURE:
				return getFeature();
			case Uml2Package.CLASSIFIER__COLLABORATION_USE:
				return getCollaborationUse();
			case Uml2Package.CLASSIFIER__GENERAL:
				return getGeneral();
			case Uml2Package.CLASSIFIER__GENERALIZATION:
				return getGeneralization();
			case Uml2Package.CLASSIFIER__POWERTYPE_EXTENT:
				return getPowertypeExtent();
			case Uml2Package.CLASSIFIER__INHERITED_MEMBER:
				return getInheritedMember();
			case Uml2Package.CLASSIFIER__IS_ABSTRACT:
				return getIsAbstract();
			case Uml2Package.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				return getIsFinalSpecialization();
			case Uml2Package.CLASSIFIER__OWNED_USE_CASE:
				return getOwnedUseCase();
			case Uml2Package.CLASSIFIER__USE_CASE:
				return getUseCase();
			case Uml2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				return getRedefinedClassifier();
			case Uml2Package.CLASSIFIER__REPRESENTATION:
				if (resolve) return getRepresentation();
				return basicGetRepresentation();
			case Uml2Package.CLASSIFIER__SUBSTITUTION:
				return getSubstitution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Uml2Package.CLASSIFIER__IS_LEAF:
				setIsLeaf((Boolean)newValue);
				return;
			case Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case Uml2Package.CLASSIFIER__PACKAGE:
				setPackage((uml2.Package)newValue);
				return;
			case Uml2Package.CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case Uml2Package.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				getCollaborationUse().addAll((Collection<? extends CollaborationUse>)newValue);
				return;
			case Uml2Package.CLASSIFIER__GENERAL:
				getGeneral().clear();
				getGeneral().addAll((Collection<? extends Classifier>)newValue);
				return;
			case Uml2Package.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				getGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case Uml2Package.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				getPowertypeExtent().addAll((Collection<? extends GeneralizationSet>)newValue);
				return;
			case Uml2Package.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case Uml2Package.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization((Boolean)newValue);
				return;
			case Uml2Package.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				getOwnedUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case Uml2Package.CLASSIFIER__USE_CASE:
				getUseCase().clear();
				getUseCase().addAll((Collection<? extends UseCase>)newValue);
				return;
			case Uml2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				getRedefinedClassifier().addAll((Collection<? extends Classifier>)newValue);
				return;
			case Uml2Package.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationUse)newValue);
				return;
			case Uml2Package.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				getSubstitution().addAll((Collection<? extends Substitution>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Uml2Package.CLASSIFIER__IS_LEAF:
				setIsLeaf(IS_LEAF_EDEFAULT);
				return;
			case Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case Uml2Package.CLASSIFIER__PACKAGE:
				setPackage((uml2.Package)null);
				return;
			case Uml2Package.CLASSIFIER__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case Uml2Package.CLASSIFIER__COLLABORATION_USE:
				getCollaborationUse().clear();
				return;
			case Uml2Package.CLASSIFIER__GENERAL:
				getGeneral().clear();
				return;
			case Uml2Package.CLASSIFIER__GENERALIZATION:
				getGeneralization().clear();
				return;
			case Uml2Package.CLASSIFIER__POWERTYPE_EXTENT:
				getPowertypeExtent().clear();
				return;
			case Uml2Package.CLASSIFIER__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case Uml2Package.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				setIsFinalSpecialization(IS_FINAL_SPECIALIZATION_EDEFAULT);
				return;
			case Uml2Package.CLASSIFIER__OWNED_USE_CASE:
				getOwnedUseCase().clear();
				return;
			case Uml2Package.CLASSIFIER__USE_CASE:
				getUseCase().clear();
				return;
			case Uml2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				getRedefinedClassifier().clear();
				return;
			case Uml2Package.CLASSIFIER__REPRESENTATION:
				setRepresentation((CollaborationUse)null);
				return;
			case Uml2Package.CLASSIFIER__SUBSTITUTION:
				getSubstitution().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Uml2Package.CLASSIFIER__IS_LEAF:
				return IS_LEAF_EDEFAULT == null ? isLeaf != null : !IS_LEAF_EDEFAULT.equals(isLeaf);
			case Uml2Package.CLASSIFIER__REDEFINED_ELEMENT:
				return !getRedefinedElement().isEmpty();
			case Uml2Package.CLASSIFIER__REDEFINITION_CONTEXT:
				return !getRedefinitionContext().isEmpty();
			case Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter() != null;
			case Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case Uml2Package.CLASSIFIER__PACKAGE:
				return basicGetPackage() != null;
			case Uml2Package.CLASSIFIER__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case Uml2Package.CLASSIFIER__ATTRIBUTE:
				return !getAttribute().isEmpty();
			case Uml2Package.CLASSIFIER__FEATURE:
				return !getFeature().isEmpty();
			case Uml2Package.CLASSIFIER__COLLABORATION_USE:
				return collaborationUse != null && !collaborationUse.isEmpty();
			case Uml2Package.CLASSIFIER__GENERAL:
				return !getGeneral().isEmpty();
			case Uml2Package.CLASSIFIER__GENERALIZATION:
				return generalization != null && !generalization.isEmpty();
			case Uml2Package.CLASSIFIER__POWERTYPE_EXTENT:
				return powertypeExtent != null && !powertypeExtent.isEmpty();
			case Uml2Package.CLASSIFIER__INHERITED_MEMBER:
				return !getInheritedMember().isEmpty();
			case Uml2Package.CLASSIFIER__IS_ABSTRACT:
				return IS_ABSTRACT_EDEFAULT == null ? isAbstract != null : !IS_ABSTRACT_EDEFAULT.equals(isAbstract);
			case Uml2Package.CLASSIFIER__IS_FINAL_SPECIALIZATION:
				return IS_FINAL_SPECIALIZATION_EDEFAULT == null ? isFinalSpecialization != null : !IS_FINAL_SPECIALIZATION_EDEFAULT.equals(isFinalSpecialization);
			case Uml2Package.CLASSIFIER__OWNED_USE_CASE:
				return ownedUseCase != null && !ownedUseCase.isEmpty();
			case Uml2Package.CLASSIFIER__USE_CASE:
				return useCase != null && !useCase.isEmpty();
			case Uml2Package.CLASSIFIER__REDEFINED_CLASSIFIER:
				return redefinedClassifier != null && !redefinedClassifier.isEmpty();
			case Uml2Package.CLASSIFIER__REPRESENTATION:
				return representation != null;
			case Uml2Package.CLASSIFIER__SUBSTITUTION:
				return substitution != null && !substitution.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.CLASSIFIER__IS_LEAF: return Uml2Package.REDEFINABLE_ELEMENT__IS_LEAF;
				case Uml2Package.CLASSIFIER__REDEFINED_ELEMENT: return Uml2Package.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT;
				case Uml2Package.CLASSIFIER__REDEFINITION_CONTEXT: return Uml2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER: return Uml2Package.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER: return Uml2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (derivedFeatureID) {
				case Uml2Package.CLASSIFIER__PACKAGE: return Uml2Package.TYPE__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.CLASSIFIER__TEMPLATE_BINDING: return Uml2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE: return Uml2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.REDEFINABLE_ELEMENT__IS_LEAF: return Uml2Package.CLASSIFIER__IS_LEAF;
				case Uml2Package.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT: return Uml2Package.CLASSIFIER__REDEFINED_ELEMENT;
				case Uml2Package.REDEFINABLE_ELEMENT__REDEFINITION_CONTEXT: return Uml2Package.CLASSIFIER__REDEFINITION_CONTEXT;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return Uml2Package.CLASSIFIER__OWNING_TEMPLATE_PARAMETER;
				case Uml2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return Uml2Package.CLASSIFIER__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseFeatureID) {
				case Uml2Package.TYPE__PACKAGE: return Uml2Package.CLASSIFIER__PACKAGE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return Uml2Package.CLASSIFIER__TEMPLATE_BINDING;
				case Uml2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return Uml2Package.CLASSIFIER__OWNED_TEMPLATE_SIGNATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RedefinableElement.class) {
			switch (baseOperationID) {
				case Uml2Package.REDEFINABLE_ELEMENT___NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP: return Uml2Package.CLASSIFIER___NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.REDEFINABLE_ELEMENT___REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP: return Uml2Package.CLASSIFIER___REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.REDEFINABLE_ELEMENT___REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP: return Uml2Package.CLASSIFIER___REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;
				case Uml2Package.REDEFINABLE_ELEMENT___IS_CONSISTENT_WITH__REDEFINABLEELEMENT: return Uml2Package.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;
				case Uml2Package.REDEFINABLE_ELEMENT___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT: return Uml2Package.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;
				default: return -1;
			}
		}
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case Uml2Package.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return Uml2Package.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case Uml2Package.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return Uml2Package.CLASSIFIER___IS_TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Type.class) {
			switch (baseOperationID) {
				case Uml2Package.TYPE___CONFORMS_TO__TYPE: return Uml2Package.CLASSIFIER___CONFORMS_TO__TYPE;
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case Uml2Package.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return Uml2Package.CLASSIFIER___IS_TEMPLATE;
				case Uml2Package.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return Uml2Package.CLASSIFIER___PARAMETERABLE_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Uml2Package.CLASSIFIER___NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP:
				return noCyclesInGeneralization((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CLASSIFIER___SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP:
				return specializeType((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CLASSIFIER___NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP:
				return nonFinalParents((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CLASSIFIER___MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP:
				return mapsToGeneralizationSet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CLASSIFIER___ALL_FEATURES:
				return allFeatures();
			case Uml2Package.CLASSIFIER___ALL_PARENTS:
				return allParents();
			case Uml2Package.CLASSIFIER___CONFORMS_TO__CLASSIFIER:
				return conformsTo((Classifier)arguments.get(0));
			case Uml2Package.CLASSIFIER___GENERAL:
				return general();
			case Uml2Package.CLASSIFIER___HAS_VISIBILITY_OF__NAMEDELEMENT:
				return hasVisibilityOf((NamedElement)arguments.get(0));
			case Uml2Package.CLASSIFIER___INHERIT__ELIST:
				return inherit((EList<NamedElement>)arguments.get(0));
			case Uml2Package.CLASSIFIER___INHERITABLE_MEMBERS__CLASSIFIER:
				return inheritableMembers((Classifier)arguments.get(0));
			case Uml2Package.CLASSIFIER___INHERITED_MEMBER:
				return inheritedMember();
			case Uml2Package.CLASSIFIER___MAY_SPECIALIZE_TYPE__CLASSIFIER:
				return maySpecializeType((Classifier)arguments.get(0));
			case Uml2Package.CLASSIFIER___PARENTS:
				return parents();
			case Uml2Package.CLASSIFIER___IS_TEMPLATE:
				return isTemplate();
			case Uml2Package.CLASSIFIER___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case Uml2Package.CLASSIFIER___CONFORMS_TO__TYPE:
				return conformsTo((Type)arguments.get(0));
			case Uml2Package.CLASSIFIER___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return isCompatibleWith((ParameterableElement)arguments.get(0));
			case Uml2Package.CLASSIFIER___IS_TEMPLATE_PARAMETER:
				return isTemplateParameter();
			case Uml2Package.CLASSIFIER___NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP:
				return nonLeafRedefinition((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CLASSIFIER___REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP:
				return redefinitionContextValid((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CLASSIFIER___REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP:
				return redefinitionConsistent((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.CLASSIFIER___IS_CONSISTENT_WITH__REDEFINABLEELEMENT:
				return isConsistentWith((RedefinableElement)arguments.get(0));
			case Uml2Package.CLASSIFIER___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT:
				return isRedefinitionContextValid((RedefinableElement)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isLeaf: ");
		result.append(isLeaf);
		result.append(", isAbstract: ");
		result.append(isAbstract);
		result.append(", isFinalSpecialization: ");
		result.append(isFinalSpecialization);
		result.append(')');
		return result.toString();
	}

} //ClassifierImpl

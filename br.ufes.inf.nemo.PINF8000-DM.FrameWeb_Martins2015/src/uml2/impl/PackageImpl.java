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
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import uml2.NamedElement;
import uml2.PackageMerge;
import uml2.PackageableElement;
import uml2.ParameterableElement;
import uml2.Profile;
import uml2.ProfileApplication;
import uml2.Stereotype;
import uml2.TemplateBinding;
import uml2.TemplateParameter;
import uml2.TemplateSignature;
import uml2.TemplateableElement;
import uml2.Type;
import uml2.Uml2Package;

import uml2.util.Uml2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link uml2.impl.PackageImpl#getOwningTemplateParameter <em>Owning Template Parameter</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getTemplateParameter <em>Template Parameter</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getTemplateBinding <em>Template Binding</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getOwnedTemplateSignature <em>Owned Template Signature</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getUri <em>Uri</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getOwnedStereotype <em>Owned Stereotype</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getPackageMerge <em>Package Merge</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getProfileApplication <em>Profile Application</em>}</li>
 *   <li>{@link uml2.impl.PackageImpl#getOwnedType <em>Owned Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements uml2.Package {
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
	 * The default value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUri() <em>Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUri()
	 * @generated
	 * @ordered
	 */
	protected String uri = URI_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPackageMerge() <em>Package Merge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackageMerge()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageMerge> packageMerge;

	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> packagedElement;

	/**
	 * The cached value of the '{@link #getProfileApplication() <em>Profile Application</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfileApplication()
	 * @generated
	 * @ordered
	 */
	protected EList<ProfileApplication> profileApplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Uml2Package.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateParameter getOwningTemplateParameter() {
		if (eContainerFeatureID() != Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER) return null;
		return (TemplateParameter)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningTemplateParameter(TemplateParameter newOwningTemplateParameter, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningTemplateParameter, Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningTemplateParameter(TemplateParameter newOwningTemplateParameter) {
		if (newOwningTemplateParameter != eInternalContainer() || (eContainerFeatureID() != Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER && newOwningTemplateParameter != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER, newOwningTemplateParameter, newOwningTemplateParameter));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Uml2Package.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, templateParameter));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.PACKAGE__TEMPLATE_PARAMETER, oldTemplateParameter, newTemplateParameter);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PACKAGE__TEMPLATE_PARAMETER, newTemplateParameter, newTemplateParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateBinding> getTemplateBinding() {
		if (templateBinding == null) {
			templateBinding = new EObjectContainmentWithInverseEList<TemplateBinding>(TemplateBinding.class, this, Uml2Package.PACKAGE__TEMPLATE_BINDING, Uml2Package.TEMPLATE_BINDING__BOUND_ELEMENT);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE, oldOwnedTemplateSignature, newOwnedTemplateSignature);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE, newOwnedTemplateSignature, newOwnedTemplateSignature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUri() {
		return uri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUri(String newUri) {
		String oldUri = uri;
		uri = newUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Uml2Package.PACKAGE__URI, oldUri, uri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uml2.Package> getNestedPackage() {
		// TODO: implement this method to return the 'Nested Package' reference list
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
	public uml2.Package getNestingPackage() {
		uml2.Package nestingPackage = basicGetNestingPackage();
		return nestingPackage != null && nestingPackage.eIsProxy() ? (uml2.Package)eResolveProxy((InternalEObject)nestingPackage) : nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public uml2.Package basicGetNestingPackage() {
		// TODO: implement this method to return the 'Nesting Package' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(uml2.Package newNestingPackage) {
		// TODO: implement this method to set the 'Nesting Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> getOwnedStereotype() {
		// TODO: implement this method to return the 'Owned Stereotype' reference list
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
	public EList<PackageMerge> getPackageMerge() {
		if (packageMerge == null) {
			packageMerge = new EObjectContainmentWithInverseEList<PackageMerge>(PackageMerge.class, this, Uml2Package.PACKAGE__PACKAGE_MERGE, Uml2Package.PACKAGE_MERGE__RECEIVING_PACKAGE);
		}
		return packageMerge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentEList<PackageableElement>(PackageableElement.class, this, Uml2Package.PACKAGE__PACKAGED_ELEMENT);
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProfileApplication> getProfileApplication() {
		if (profileApplication == null) {
			profileApplication = new EObjectContainmentWithInverseEList<ProfileApplication>(ProfileApplication.class, this, Uml2Package.PACKAGE__PROFILE_APPLICATION, Uml2Package.PROFILE_APPLICATION__APPLYING_PACKAGE);
		}
		return profileApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		// TODO: implement this method to return the 'Owned Type' reference list
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
	public boolean elementsPublicOrPrivate(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 Uml2Validator.PACKAGE__ELEMENTS_PUBLIC_OR_PRIVATE,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "elementsPublicOrPrivate", EObjectValidator.getObjectLabel(this, context) }),
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
	public EList<Stereotype> allApplicableStereotypes() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Profile containingProfile() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean makesVisible(NamedElement el) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<uml2.Package> nestedPackage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stereotype> ownedStereotype() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> ownedType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> visibleMembers() {
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningTemplateParameter((TemplateParameter)otherEnd, msgs);
			case Uml2Package.PACKAGE__TEMPLATE_PARAMETER:
				if (templateParameter != null)
					msgs = ((InternalEObject)templateParameter).eInverseRemove(this, Uml2Package.TEMPLATE_PARAMETER__PARAMETERED_ELEMENT, TemplateParameter.class, msgs);
				return basicSetTemplateParameter((TemplateParameter)otherEnd, msgs);
			case Uml2Package.PACKAGE__TEMPLATE_BINDING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTemplateBinding()).basicAdd(otherEnd, msgs);
			case Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				if (ownedTemplateSignature != null)
					msgs = ((InternalEObject)ownedTemplateSignature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE, null, msgs);
				return basicSetOwnedTemplateSignature((TemplateSignature)otherEnd, msgs);
			case Uml2Package.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPackageMerge()).basicAdd(otherEnd, msgs);
			case Uml2Package.PACKAGE__PROFILE_APPLICATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProfileApplication()).basicAdd(otherEnd, msgs);
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
			case Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				return basicSetOwningTemplateParameter(null, msgs);
			case Uml2Package.PACKAGE__TEMPLATE_PARAMETER:
				return basicSetTemplateParameter(null, msgs);
			case Uml2Package.PACKAGE__TEMPLATE_BINDING:
				return ((InternalEList<?>)getTemplateBinding()).basicRemove(otherEnd, msgs);
			case Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return basicSetOwnedTemplateSignature(null, msgs);
			case Uml2Package.PACKAGE__PACKAGE_MERGE:
				return ((InternalEList<?>)getPackageMerge()).basicRemove(otherEnd, msgs);
			case Uml2Package.PACKAGE__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
			case Uml2Package.PACKAGE__PROFILE_APPLICATION:
				return ((InternalEList<?>)getProfileApplication()).basicRemove(otherEnd, msgs);
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
			case Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER:
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
			case Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter();
			case Uml2Package.PACKAGE__TEMPLATE_PARAMETER:
				if (resolve) return getTemplateParameter();
				return basicGetTemplateParameter();
			case Uml2Package.PACKAGE__TEMPLATE_BINDING:
				return getTemplateBinding();
			case Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return getOwnedTemplateSignature();
			case Uml2Package.PACKAGE__URI:
				return getUri();
			case Uml2Package.PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case Uml2Package.PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
			case Uml2Package.PACKAGE__OWNED_STEREOTYPE:
				return getOwnedStereotype();
			case Uml2Package.PACKAGE__PACKAGE_MERGE:
				return getPackageMerge();
			case Uml2Package.PACKAGE__PACKAGED_ELEMENT:
				return getPackagedElement();
			case Uml2Package.PACKAGE__PROFILE_APPLICATION:
				return getProfileApplication();
			case Uml2Package.PACKAGE__OWNED_TYPE:
				return getOwnedType();
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
			case Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)newValue);
				return;
			case Uml2Package.PACKAGE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)newValue);
				return;
			case Uml2Package.PACKAGE__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				getTemplateBinding().addAll((Collection<? extends TemplateBinding>)newValue);
				return;
			case Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)newValue);
				return;
			case Uml2Package.PACKAGE__URI:
				setUri((String)newValue);
				return;
			case Uml2Package.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends uml2.Package>)newValue);
				return;
			case Uml2Package.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((uml2.Package)newValue);
				return;
			case Uml2Package.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				getPackageMerge().addAll((Collection<? extends PackageMerge>)newValue);
				return;
			case Uml2Package.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case Uml2Package.PACKAGE__PROFILE_APPLICATION:
				getProfileApplication().clear();
				getProfileApplication().addAll((Collection<? extends ProfileApplication>)newValue);
				return;
			case Uml2Package.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
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
			case Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				setOwningTemplateParameter((TemplateParameter)null);
				return;
			case Uml2Package.PACKAGE__TEMPLATE_PARAMETER:
				setTemplateParameter((TemplateParameter)null);
				return;
			case Uml2Package.PACKAGE__TEMPLATE_BINDING:
				getTemplateBinding().clear();
				return;
			case Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				setOwnedTemplateSignature((TemplateSignature)null);
				return;
			case Uml2Package.PACKAGE__URI:
				setUri(URI_EDEFAULT);
				return;
			case Uml2Package.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case Uml2Package.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((uml2.Package)null);
				return;
			case Uml2Package.PACKAGE__PACKAGE_MERGE:
				getPackageMerge().clear();
				return;
			case Uml2Package.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case Uml2Package.PACKAGE__PROFILE_APPLICATION:
				getProfileApplication().clear();
				return;
			case Uml2Package.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
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
			case Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER:
				return getOwningTemplateParameter() != null;
			case Uml2Package.PACKAGE__TEMPLATE_PARAMETER:
				return templateParameter != null;
			case Uml2Package.PACKAGE__TEMPLATE_BINDING:
				return templateBinding != null && !templateBinding.isEmpty();
			case Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE:
				return ownedTemplateSignature != null;
			case Uml2Package.PACKAGE__URI:
				return URI_EDEFAULT == null ? uri != null : !URI_EDEFAULT.equals(uri);
			case Uml2Package.PACKAGE__NESTED_PACKAGE:
				return !getNestedPackage().isEmpty();
			case Uml2Package.PACKAGE__NESTING_PACKAGE:
				return basicGetNestingPackage() != null;
			case Uml2Package.PACKAGE__OWNED_STEREOTYPE:
				return !getOwnedStereotype().isEmpty();
			case Uml2Package.PACKAGE__PACKAGE_MERGE:
				return packageMerge != null && !packageMerge.isEmpty();
			case Uml2Package.PACKAGE__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case Uml2Package.PACKAGE__PROFILE_APPLICATION:
				return profileApplication != null && !profileApplication.isEmpty();
			case Uml2Package.PACKAGE__OWNED_TYPE:
				return !getOwnedType().isEmpty();
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
		if (baseClass == ParameterableElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER: return Uml2Package.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER;
				case Uml2Package.PACKAGE__TEMPLATE_PARAMETER: return Uml2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (derivedFeatureID) {
				case Uml2Package.PACKAGE__TEMPLATE_BINDING: return Uml2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING;
				case Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE: return Uml2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.PARAMETERABLE_ELEMENT__OWNING_TEMPLATE_PARAMETER: return Uml2Package.PACKAGE__OWNING_TEMPLATE_PARAMETER;
				case Uml2Package.PARAMETERABLE_ELEMENT__TEMPLATE_PARAMETER: return Uml2Package.PACKAGE__TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseFeatureID) {
				case Uml2Package.TEMPLATEABLE_ELEMENT__TEMPLATE_BINDING: return Uml2Package.PACKAGE__TEMPLATE_BINDING;
				case Uml2Package.TEMPLATEABLE_ELEMENT__OWNED_TEMPLATE_SIGNATURE: return Uml2Package.PACKAGE__OWNED_TEMPLATE_SIGNATURE;
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
		if (baseClass == ParameterableElement.class) {
			switch (baseOperationID) {
				case Uml2Package.PARAMETERABLE_ELEMENT___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT: return Uml2Package.PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;
				case Uml2Package.PARAMETERABLE_ELEMENT___IS_TEMPLATE_PARAMETER: return Uml2Package.PACKAGE___IS_TEMPLATE_PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == PackageableElement.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == TemplateableElement.class) {
			switch (baseOperationID) {
				case Uml2Package.TEMPLATEABLE_ELEMENT___IS_TEMPLATE: return Uml2Package.PACKAGE___IS_TEMPLATE;
				case Uml2Package.TEMPLATEABLE_ELEMENT___PARAMETERABLE_ELEMENTS: return Uml2Package.PACKAGE___PARAMETERABLE_ELEMENTS;
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
			case Uml2Package.PACKAGE___ELEMENTS_PUBLIC_OR_PRIVATE__DIAGNOSTICCHAIN_MAP:
				return elementsPublicOrPrivate((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case Uml2Package.PACKAGE___ALL_APPLICABLE_STEREOTYPES:
				return allApplicableStereotypes();
			case Uml2Package.PACKAGE___CONTAINING_PROFILE:
				return containingProfile();
			case Uml2Package.PACKAGE___MAKES_VISIBLE__NAMEDELEMENT:
				return makesVisible((NamedElement)arguments.get(0));
			case Uml2Package.PACKAGE___NESTED_PACKAGE:
				return nestedPackage();
			case Uml2Package.PACKAGE___OWNED_STEREOTYPE:
				return ownedStereotype();
			case Uml2Package.PACKAGE___OWNED_TYPE:
				return ownedType();
			case Uml2Package.PACKAGE___VISIBLE_MEMBERS:
				return visibleMembers();
			case Uml2Package.PACKAGE___IS_TEMPLATE:
				return isTemplate();
			case Uml2Package.PACKAGE___PARAMETERABLE_ELEMENTS:
				return parameterableElements();
			case Uml2Package.PACKAGE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT:
				return isCompatibleWith((ParameterableElement)arguments.get(0));
			case Uml2Package.PACKAGE___IS_TEMPLATE_PARAMETER:
				return isTemplateParameter();
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
		result.append(" (uri: ");
		result.append(uri);
		result.append(')');
		return result.toString();
	}

} //PackageImpl

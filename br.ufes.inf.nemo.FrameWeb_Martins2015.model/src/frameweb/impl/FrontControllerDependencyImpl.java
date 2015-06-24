/**
 */
package frameweb.impl;

import frameweb.Component;
import frameweb.FramewebPackage;
import frameweb.FrontControllerClass;
import frameweb.FrontControllerDependency;
import frameweb.FrontControllerMethod;
import frameweb.JQuery;
import frameweb.Page;
import frameweb.Tag;
import frameweb.Template;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getClientForm <em>Client Form</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getSupplierFrontController <em>Supplier Front Controller</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getClientPage <em>Client Page</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getClientTemplate <em>Client Template</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getClientComponent <em>Client Component</em>}</li>
 *   <li>{@link frameweb.impl.FrontControllerDependencyImpl#getClientJQuery <em>Client JQuery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrontControllerDependencyImpl extends NavigationDependencyImpl implements FrontControllerDependency {
	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerMethod method;

	/**
	 * The cached value of the '{@link #getClientForm() <em>Client Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientForm()
	 * @generated
	 * @ordered
	 */
	protected Tag clientForm;

	/**
	 * The cached value of the '{@link #getSupplierFrontController() <em>Supplier Front Controller</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierFrontController()
	 * @generated
	 * @ordered
	 */
	protected FrontControllerClass supplierFrontController;

	/**
	 * The cached value of the '{@link #getClientPage() <em>Client Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientPage()
	 * @generated
	 * @ordered
	 */
	protected Page clientPage;

	/**
	 * The cached value of the '{@link #getClientTemplate() <em>Client Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template clientTemplate;

	/**
	 * The cached value of the '{@link #getClientComponent() <em>Client Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientComponent()
	 * @generated
	 * @ordered
	 */
	protected Component clientComponent;

	/**
	 * The cached value of the '{@link #getClientJQuery() <em>Client JQuery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClientJQuery()
	 * @generated
	 * @ordered
	 */
	protected JQuery clientJQuery;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod getMethod() {
		if (method != null && method.eIsProxy()) {
			InternalEObject oldMethod = (InternalEObject)method;
			method = (FrontControllerMethod)eResolveProxy(oldMethod);
			if (method != oldMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD, oldMethod, method));
			}
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerMethod basicGetMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(FrontControllerMethod newMethod) {
		FrontControllerMethod oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public Tag getClientForm() {
		if (clientForm != null && ((EObject)clientForm).eIsProxy()) {
			InternalEObject oldClientForm = (InternalEObject)clientForm;
			clientForm = (Tag)eResolveProxy(oldClientForm);
			if (clientForm != oldClientForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_FORM, oldClientForm, clientForm));
			}
		}
		return clientForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag basicGetClientForm() {
		return clientForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientForm(Tag newClientForm) {
		Tag oldClientForm = clientForm;
		clientForm = newClientForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_FORM, oldClientForm, clientForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass getSupplierFrontController() {
		if (supplierFrontController != null && supplierFrontController.eIsProxy()) {
			InternalEObject oldSupplierFrontController = (InternalEObject)supplierFrontController;
			supplierFrontController = (FrontControllerClass)eResolveProxy(oldSupplierFrontController);
			if (supplierFrontController != oldSupplierFrontController) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER, oldSupplierFrontController, supplierFrontController));
			}
		}
		return supplierFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontControllerClass basicGetSupplierFrontController() {
		return supplierFrontController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierFrontController(FrontControllerClass newSupplierFrontController) {
		FrontControllerClass oldSupplierFrontController = supplierFrontController;
		supplierFrontController = newSupplierFrontController;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER, oldSupplierFrontController, supplierFrontController));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getClientPage() {
		if (clientPage != null && clientPage.eIsProxy()) {
			InternalEObject oldClientPage = (InternalEObject)clientPage;
			clientPage = (Page)eResolveProxy(oldClientPage);
			if (clientPage != oldClientPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_PAGE, oldClientPage, clientPage));
			}
		}
		return clientPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetClientPage() {
		return clientPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientPage(Page newClientPage) {
		Page oldClientPage = clientPage;
		clientPage = newClientPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_PAGE, oldClientPage, clientPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getClientTemplate() {
		if (clientTemplate != null && clientTemplate.eIsProxy()) {
			InternalEObject oldClientTemplate = (InternalEObject)clientTemplate;
			clientTemplate = (Template)eResolveProxy(oldClientTemplate);
			if (clientTemplate != oldClientTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_TEMPLATE, oldClientTemplate, clientTemplate));
			}
		}
		return clientTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template basicGetClientTemplate() {
		return clientTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientTemplate(Template newClientTemplate) {
		Template oldClientTemplate = clientTemplate;
		clientTemplate = newClientTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_TEMPLATE, oldClientTemplate, clientTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getClientComponent() {
		if (clientComponent != null && clientComponent.eIsProxy()) {
			InternalEObject oldClientComponent = (InternalEObject)clientComponent;
			clientComponent = (Component)eResolveProxy(oldClientComponent);
			if (clientComponent != oldClientComponent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_COMPONENT, oldClientComponent, clientComponent));
			}
		}
		return clientComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetClientComponent() {
		return clientComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientComponent(Component newClientComponent) {
		Component oldClientComponent = clientComponent;
		clientComponent = newClientComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_COMPONENT, oldClientComponent, clientComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery getClientJQuery() {
		if (clientJQuery != null && clientJQuery.eIsProxy()) {
			InternalEObject oldClientJQuery = (InternalEObject)clientJQuery;
			clientJQuery = (JQuery)eResolveProxy(oldClientJQuery);
			if (clientJQuery != oldClientJQuery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_JQUERY, oldClientJQuery, clientJQuery));
			}
		}
		return clientJQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JQuery basicGetClientJQuery() {
		return clientJQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClientJQuery(JQuery newClientJQuery) {
		JQuery oldClientJQuery = clientJQuery;
		clientJQuery = newClientJQuery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_JQUERY, oldClientJQuery, clientJQuery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD:
				if (resolve) return getMethod();
				return basicGetMethod();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_FORM:
				if (resolve) return getClientForm();
				return basicGetClientForm();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER:
				if (resolve) return getSupplierFrontController();
				return basicGetSupplierFrontController();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_PAGE:
				if (resolve) return getClientPage();
				return basicGetClientPage();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_TEMPLATE:
				if (resolve) return getClientTemplate();
				return basicGetClientTemplate();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_COMPONENT:
				if (resolve) return getClientComponent();
				return basicGetClientComponent();
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_JQUERY:
				if (resolve) return getClientJQuery();
				return basicGetClientJQuery();
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
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD:
				setMethod((FrontControllerMethod)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_FORM:
				setClientForm((Tag)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER:
				setSupplierFrontController((FrontControllerClass)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_PAGE:
				setClientPage((Page)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_TEMPLATE:
				setClientTemplate((Template)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_COMPONENT:
				setClientComponent((Component)newValue);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_JQUERY:
				setClientJQuery((JQuery)newValue);
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
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD:
				setMethod((FrontControllerMethod)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_FORM:
				setClientForm((Tag)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER:
				setSupplierFrontController((FrontControllerClass)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_PAGE:
				setClientPage((Page)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_TEMPLATE:
				setClientTemplate((Template)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_COMPONENT:
				setClientComponent((Component)null);
				return;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_JQUERY:
				setClientJQuery((JQuery)null);
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
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__METHOD:
				return method != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_FORM:
				return clientForm != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__SUPPLIER_FRONT_CONTROLLER:
				return supplierFrontController != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_PAGE:
				return clientPage != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_TEMPLATE:
				return clientTemplate != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_COMPONENT:
				return clientComponent != null;
			case FramewebPackage.FRONT_CONTROLLER_DEPENDENCY__CLIENT_JQUERY:
				return clientJQuery != null;
		}
		return super.eIsSet(featureID);
	}

} //FrontControllerDependencyImpl

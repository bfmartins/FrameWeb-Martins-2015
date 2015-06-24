/**
 */
package frameweb.impl;

import frameweb.FramewebPackage;
import frameweb.Page;
import frameweb.PageDependency;
import frameweb.Template;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Dependency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PageDependencyImpl#getSupplierPage <em>Supplier Page</em>}</li>
 *   <li>{@link frameweb.impl.PageDependencyImpl#getClientTemplate <em>Client Template</em>}</li>
 *   <li>{@link frameweb.impl.PageDependencyImpl#getLinkHTML <em>Link HTML</em>}</li>
 *   <li>{@link frameweb.impl.PageDependencyImpl#getClientPage <em>Client Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageDependencyImpl extends NavigationDependencyImpl implements PageDependency {
	/**
	 * The cached value of the '{@link #getSupplierPage() <em>Supplier Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplierPage()
	 * @generated
	 * @ordered
	 */
	protected Page supplierPage;

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
	 * The default value of the '{@link #getLinkHTML() <em>Link HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHTML()
	 * @generated
	 * @ordered
	 */
	protected static final String LINK_HTML_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLinkHTML() <em>Link HTML</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkHTML()
	 * @generated
	 * @ordered
	 */
	protected String linkHTML = LINK_HTML_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageDependencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.PAGE_DEPENDENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getSupplierPage() {
		if (supplierPage != null && supplierPage.eIsProxy()) {
			InternalEObject oldSupplierPage = (InternalEObject)supplierPage;
			supplierPage = (Page)eResolveProxy(oldSupplierPage);
			if (supplierPage != oldSupplierPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.PAGE_DEPENDENCY__SUPPLIER_PAGE, oldSupplierPage, supplierPage));
			}
		}
		return supplierPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetSupplierPage() {
		return supplierPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupplierPage(Page newSupplierPage) {
		Page oldSupplierPage = supplierPage;
		supplierPage = newSupplierPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__SUPPLIER_PAGE, oldSupplierPage, supplierPage));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.PAGE_DEPENDENCY__CLIENT_TEMPLATE, oldClientTemplate, clientTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__CLIENT_TEMPLATE, oldClientTemplate, clientTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLinkHTML() {
		return linkHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkHTML(String newLinkHTML) {
		String oldLinkHTML = linkHTML;
		linkHTML = newLinkHTML;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__LINK_HTML, oldLinkHTML, linkHTML));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FramewebPackage.PAGE_DEPENDENCY__CLIENT_PAGE, oldClientPage, clientPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FramewebPackage.PAGE_DEPENDENCY__CLIENT_PAGE, oldClientPage, clientPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FramewebPackage.PAGE_DEPENDENCY__SUPPLIER_PAGE:
				if (resolve) return getSupplierPage();
				return basicGetSupplierPage();
			case FramewebPackage.PAGE_DEPENDENCY__CLIENT_TEMPLATE:
				if (resolve) return getClientTemplate();
				return basicGetClientTemplate();
			case FramewebPackage.PAGE_DEPENDENCY__LINK_HTML:
				return getLinkHTML();
			case FramewebPackage.PAGE_DEPENDENCY__CLIENT_PAGE:
				if (resolve) return getClientPage();
				return basicGetClientPage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FramewebPackage.PAGE_DEPENDENCY__SUPPLIER_PAGE:
				setSupplierPage((Page)newValue);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__CLIENT_TEMPLATE:
				setClientTemplate((Template)newValue);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__LINK_HTML:
				setLinkHTML((String)newValue);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__CLIENT_PAGE:
				setClientPage((Page)newValue);
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
			case FramewebPackage.PAGE_DEPENDENCY__SUPPLIER_PAGE:
				setSupplierPage((Page)null);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__CLIENT_TEMPLATE:
				setClientTemplate((Template)null);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__LINK_HTML:
				setLinkHTML(LINK_HTML_EDEFAULT);
				return;
			case FramewebPackage.PAGE_DEPENDENCY__CLIENT_PAGE:
				setClientPage((Page)null);
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
			case FramewebPackage.PAGE_DEPENDENCY__SUPPLIER_PAGE:
				return supplierPage != null;
			case FramewebPackage.PAGE_DEPENDENCY__CLIENT_TEMPLATE:
				return clientTemplate != null;
			case FramewebPackage.PAGE_DEPENDENCY__LINK_HTML:
				return LINK_HTML_EDEFAULT == null ? linkHTML != null : !LINK_HTML_EDEFAULT.equals(linkHTML);
			case FramewebPackage.PAGE_DEPENDENCY__CLIENT_PAGE:
				return clientPage != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (linkHTML: ");
		result.append(linkHTML);
		result.append(')');
		return result.toString();
	}

} //PageDependencyImpl

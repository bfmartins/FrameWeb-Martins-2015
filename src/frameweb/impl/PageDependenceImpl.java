/**
 */
package frameweb.impl;

import frameweb.Page;
import frameweb.PageDependence;
import frameweb.Template;
import frameweb.framewebPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Dependence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link frameweb.impl.PageDependenceImpl#getTargetPage <em>Target Page</em>}</li>
 *   <li>{@link frameweb.impl.PageDependenceImpl#getSourceTemplate <em>Source Template</em>}</li>
 *   <li>{@link frameweb.impl.PageDependenceImpl#getLinkHTML <em>Link HTML</em>}</li>
 *   <li>{@link frameweb.impl.PageDependenceImpl#getSourcePage <em>Source Page</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageDependenceImpl extends NavigationDependencyImpl implements PageDependence {
	/**
	 * The cached value of the '{@link #getTargetPage() <em>Target Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPage()
	 * @generated
	 * @ordered
	 */
	protected Page targetPage;

	/**
	 * The cached value of the '{@link #getSourceTemplate() <em>Source Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceTemplate()
	 * @generated
	 * @ordered
	 */
	protected Template sourceTemplate;

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
	 * The cached value of the '{@link #getSourcePage() <em>Source Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePage()
	 * @generated
	 * @ordered
	 */
	protected Page sourcePage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageDependenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return framewebPackage.Literals.PAGE_DEPENDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getTargetPage() {
		if (targetPage != null && targetPage.eIsProxy()) {
			InternalEObject oldTargetPage = (InternalEObject)targetPage;
			targetPage = (Page)eResolveProxy(oldTargetPage);
			if (targetPage != oldTargetPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.PAGE_DEPENDENCE__TARGET_PAGE, oldTargetPage, targetPage));
			}
		}
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetTargetPage() {
		return targetPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPage(Page newTargetPage) {
		Page oldTargetPage = targetPage;
		targetPage = newTargetPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.PAGE_DEPENDENCE__TARGET_PAGE, oldTargetPage, targetPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template getSourceTemplate() {
		if (sourceTemplate != null && sourceTemplate.eIsProxy()) {
			InternalEObject oldSourceTemplate = (InternalEObject)sourceTemplate;
			sourceTemplate = (Template)eResolveProxy(oldSourceTemplate);
			if (sourceTemplate != oldSourceTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.PAGE_DEPENDENCE__SOURCE_TEMPLATE, oldSourceTemplate, sourceTemplate));
			}
		}
		return sourceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Template basicGetSourceTemplate() {
		return sourceTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceTemplate(Template newSourceTemplate) {
		Template oldSourceTemplate = sourceTemplate;
		sourceTemplate = newSourceTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.PAGE_DEPENDENCE__SOURCE_TEMPLATE, oldSourceTemplate, sourceTemplate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.PAGE_DEPENDENCE__LINK_HTML, oldLinkHTML, linkHTML));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page getSourcePage() {
		if (sourcePage != null && sourcePage.eIsProxy()) {
			InternalEObject oldSourcePage = (InternalEObject)sourcePage;
			sourcePage = (Page)eResolveProxy(oldSourcePage);
			if (sourcePage != oldSourcePage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, framewebPackage.PAGE_DEPENDENCE__SOURCE_PAGE, oldSourcePage, sourcePage));
			}
		}
		return sourcePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetSourcePage() {
		return sourcePage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePage(Page newSourcePage) {
		Page oldSourcePage = sourcePage;
		sourcePage = newSourcePage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, framewebPackage.PAGE_DEPENDENCE__SOURCE_PAGE, oldSourcePage, sourcePage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case framewebPackage.PAGE_DEPENDENCE__TARGET_PAGE:
				if (resolve) return getTargetPage();
				return basicGetTargetPage();
			case framewebPackage.PAGE_DEPENDENCE__SOURCE_TEMPLATE:
				if (resolve) return getSourceTemplate();
				return basicGetSourceTemplate();
			case framewebPackage.PAGE_DEPENDENCE__LINK_HTML:
				return getLinkHTML();
			case framewebPackage.PAGE_DEPENDENCE__SOURCE_PAGE:
				if (resolve) return getSourcePage();
				return basicGetSourcePage();
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
			case framewebPackage.PAGE_DEPENDENCE__TARGET_PAGE:
				setTargetPage((Page)newValue);
				return;
			case framewebPackage.PAGE_DEPENDENCE__SOURCE_TEMPLATE:
				setSourceTemplate((Template)newValue);
				return;
			case framewebPackage.PAGE_DEPENDENCE__LINK_HTML:
				setLinkHTML((String)newValue);
				return;
			case framewebPackage.PAGE_DEPENDENCE__SOURCE_PAGE:
				setSourcePage((Page)newValue);
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
			case framewebPackage.PAGE_DEPENDENCE__TARGET_PAGE:
				setTargetPage((Page)null);
				return;
			case framewebPackage.PAGE_DEPENDENCE__SOURCE_TEMPLATE:
				setSourceTemplate((Template)null);
				return;
			case framewebPackage.PAGE_DEPENDENCE__LINK_HTML:
				setLinkHTML(LINK_HTML_EDEFAULT);
				return;
			case framewebPackage.PAGE_DEPENDENCE__SOURCE_PAGE:
				setSourcePage((Page)null);
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
			case framewebPackage.PAGE_DEPENDENCE__TARGET_PAGE:
				return targetPage != null;
			case framewebPackage.PAGE_DEPENDENCE__SOURCE_TEMPLATE:
				return sourceTemplate != null;
			case framewebPackage.PAGE_DEPENDENCE__LINK_HTML:
				return LINK_HTML_EDEFAULT == null ? linkHTML != null : !LINK_HTML_EDEFAULT.equals(linkHTML);
			case framewebPackage.PAGE_DEPENDENCE__SOURCE_PAGE:
				return sourcePage != null;
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

} //PageDependenceImpl
